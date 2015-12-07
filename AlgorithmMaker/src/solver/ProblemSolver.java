package solver;

import inputHandling.*;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.util.EcoreUtil;

import pseudocoders.LineCoder;
import pseudocoders.Pseudocoder;
import theorems.MultistageTheorem;
import theorems.multiTheorems.DirectReturn;
import algorithmMaker.QuickParser;
import algorithmMaker.input.*;
import algorithmMaker.util.InputUtil;
import bindings.Binding;
import bindings.MutableBinding;
import display.Viewer;

/**
 * Translates an input between various states until a solution is reached.
 * 
 * @author Dwight Naylor
 */
public class ProblemSolver {

	/**
	 * All of the problem states that have either been explored or been enqueued
	 * to be explored.
	 */
	public Hashtable<Input, ProblemState> reachedProblems = new Hashtable<Input, ProblemState>();

	// Everything in this queue is assumed to be simplified already
	public PriorityQueue<ProblemState> problemStates = new PriorityQueue<ProblemState>();

	Hashtable<Input, ProblemSolver> subSolvers = new Hashtable<Input, ProblemSolver>();

	ProblemState solved = null;

	private final Theorem[] theorems;

	private final Theorem[] invertedTheorems;

	public ProblemSolver(Input problem, Theorem... theorems) {
		this.theorems = theorems;
		this.invertedTheorems = new Theorem[theorems.length];
		for (int i = 0; i < theorems.length; i++)
			invertedTheorems[i] = theorems[i] instanceof MultistageTheorem ? theorems[i]
					: InputUtil.getConverse(theorems[i]);

		addProblemState(problem, null, null, null);
	}

	public ProblemState getSolution() {
		while (solved == null && problemStates.size() > 0)
			branch();

		return problemStates.size() == 0 ? null : solved;
	}

	public void branch() {
		ProblemState problemState = problemStates.poll();
		Input problem = problemState.problem;

		Chainer givenChainer = new Chainer(theorems);
		givenChainer.addBoundVars(InputUtil.getVarNames(problem.getGiven().getVars()));
		// NOTE: This line has to go after the bound vars, or all variables in
		// the goal will be unbound.
		givenChainer.addUnboundVars(InputUtil.getAllVars(problem.getGoal()).toArray(new String[0]));
		if (problem.getGiven().getProperty() != null)
			givenChainer.chain(problem.getGiven().getProperty(), TransformUtil.GIVEN);

		Chainer findChainer = new Chainer(false, invertedTheorems);
		findChainer.addBoundVars(InputUtil.getVarNames(problem.getGiven().getVars()));
		findChainer.addBoundVars(InputUtil.getVarNames(problem.getGoal().getVars()));
		findChainer.previousLevelTheorems = givenChainer.nextLevelTheorems;
		findChainer.chain(problem.getGoal().getProperty(), TransformUtil.GOAL);

		addVariableRemovalTheorems(problem, findChainer);

		if (findChainer.nextLevelTheorems.size() > 0) {
			for (Entry<MultistageTheorem, ArrayList<Binding>> entry : findChainer.nextLevelTheorems.entrySet())
				for (Binding binding : entry.getValue()) {
					MultistageTheorem mst = entry.getKey();
					Input newProblem = InputUtil.stupidCopy(problem);

					// Make the new given (just add in all the multi-theorem
					// results)
					ArrayList<Property> newGivenParts = new ArrayList<Property>();
					newGivenParts.add(newProblem.getGiven().getProperty());
					ArrayList<Property> newGoalParts = new ArrayList<Property>();
					newGoalParts.add(newProblem.getGoal().getProperty());

					if (mst instanceof DirectReturn) {
						String varToRemove = binding.getArguments().values().iterator().next();
						newProblem.getGoal().getVars().removeIf(x -> x.getVarName().equals(varToRemove));
					} else {
						HashSet<String> usedVars = new HashSet<String>();
						usedVars.addAll(InputUtil.getAllVars(newProblem.getGiven()));
						usedVars.addAll(InputUtil.getAllVars(newProblem.getGoal()));

						MutableBinding newBinding = new MutableBinding();
						newBinding.addBindingsFrom(binding);

						Property givenResult = mst.getGivenResult();
						if (givenResult != null) {
							for (String var : InputUtil.getDeclaredVars(givenResult))
								if (usedVars.contains(var)) {
									String newVar = InputUtil.getUnusedVar(usedVars);
									usedVars.add(newVar);
									newBinding.bind(var, newVar);
								}

							newBinding.addBindingsFrom(
									doBindings(newProblem.getGiven(), usedVars, InputUtil.getBindings(givenResult)));
							newGivenParts.add(InputUtil.revar(givenResult, newBinding.getArguments()));
						}
						Property findResult = mst.getFindResult();
						if (findResult != null) {
							for (String var : InputUtil.getDeclaredVars(findResult))
								if (usedVars.contains(var)) {
									String newVar = InputUtil.getUnusedVar(usedVars);
									usedVars.add(newVar);
									newBinding.bind(var, newVar);
								}

							newBinding.addBindingsFrom(
									doBindings(newProblem.getGoal(), usedVars, InputUtil.getBindings(findResult)));
							newGoalParts.add(InputUtil.revar(findResult, newBinding.getArguments()));
						}

						binding = newBinding.getImmutable();
					}

					newProblem.getGiven().setProperty(InputUtil.andTogether(newGivenParts));
					newProblem.getGoal().setProperty(InputUtil.andTogether(newGoalParts));

					addProblemState(newProblem, problemState, mst, binding);
				}
		}
		// Our stupid way of looking for quantifiers for theorems...
		for (Property property : findChainer.properties.keySet())
			doSubProblemMultitheorems(problemState, property, givenChainer.properties.keySet(),
					findChainer.properties.keySet());
	}

	private void doSubProblemMultitheorems(ProblemState problemState, Property property, Set<Property> givenChainer,
			Set<Property> findChainer) {
		if (property instanceof Quantifier)
			doQuantifierSubProblemFor(problemState, (Quantifier) property, givenChainer, findChainer);
	}

	private void doQuantifierSubProblemFor(ProblemState problemState, Quantifier quantifier, Set<Property> givenChainer,
			Set<Property> findChainer) {
		// First we check and see if all the variables used in the quantifier
		// are bound. If any aren't, we can't solve the quantifier.
		HashSet<String> boundVars = new HashSet<String>();
		boundVars.addAll(InputUtil.getDeclaredVars(quantifier));
		// Add all the declarations from the given
		boundVars.addAll(givenChainer.stream()
				.filter(x -> x instanceof Atomic && ((Atomic) x).getFunction().equals(InputUtil.BOUND))
				.map(x -> ((Atomic) x).getArgs().get(0)).collect(Collectors.toList()));
		for (String variable : InputUtil.getAllVars(quantifier)) {
			if (!boundVars.contains(variable))
				return;
		}
		// Build the subproblem
		Input subProblem = InputUtil.stupidCopy(problemState.problem);
		Problem subject = quantifier.getSubject();
		MutableBinding rebindingForQuantifier = new MutableBinding();
		HashSet<String> usedVars = InputUtil.getAllVars(problemState.problem);
		for (String var : InputUtil.getDeclaredVars(subject)) {
			String newVar = InputUtil.getUnusedVar(usedVars);
			usedVars.add(newVar);
			rebindingForQuantifier.bind(var, newVar);
		}
		Problem newGoal = InputUtil.stupidCopy(InputUtil.revar(subject, rebindingForQuantifier.getArguments()));
		newGoal.setProperty(InputUtil.canonicalize(InputUtil.andTogether(
				Arrays.asList(new Property[] { newGoal.getProperty(), InputUtil.getNegated(InputUtil.stupidCopy(
						InputUtil.revar(quantifier.getPredicate(), rebindingForQuantifier.getArguments()))) }))));
		subProblem.setGoal(newGoal);
		if (!subSolvers.containsKey(subProblem)) {
			ProblemSolver subSolver = new ProblemSolver(subProblem, theorems);
			subSolver.getSolution();
			subSolvers.put(subProblem, subSolver);
		}
		if (subSolvers.get(subProblem).solved != null) {
			// The new problem with the quantifier constraint removed and added
			// to the given
			Input newProblem = InputUtil.stupidCopy(problemState.problem);
			// FIXME: DN: This is stupid way of removing properties here
			newProblem.setGoal((Problem) TransformUtil.removeProperties(newProblem.getGoal(),
					new HashSet<Property>(Collections.singleton(quantifier))));
			newProblem.getGiven().setProperty(InputUtil
					.andTogether(Arrays.asList(new Property[] { quantifier, newProblem.getGiven().getProperty() })));

			String newVariable = "NEW_VARIABLE";
			Pseudocoder coder = new Pseudocoder() {
				@Override
				public void appendPseudocode(StringBuffer builder, int numTabs, ProblemState problemState,
						String returnString) {
					Pseudocoder.appendTabs(builder, numTabs);
					builder.append(problemState.rootTheoremBinding.revar("boolean <" + newVariable + "> = true;\n"));
					// FIXME: DN: This whole methodology is awful and needs to
					// be redone later.
					ProblemState head = subSolvers.get(subProblem).solved;
					while (head.parentState != null) {
						head.parentState.childStates = Collections.singletonList(head);
						head = head.parentState;
					}
					head.childStates.get(0).rootTheorem.getPseudocoder().appendPseudocode(builder, numTabs,
							head.childStates.get(0),
							problemState.rootTheoremBinding.revar("<" + newVariable + "> = false"));
					Pseudocoder.appendTabs(builder, numTabs);
					builder.append(problemState.rootTheoremBinding.revar("if <" + newVariable + "> == "
							+ quantifier.getQuantifier().equals(InputUtil.FORALL) + "\n"));
					if (problemState != null)
						if (problemState.childStates != null && problemState.childStates.size() > 0) {
							ProblemState childState = problemState.childStates.get(0);
							childState.rootTheorem.getPseudocoder().appendPseudocode(builder, numTabs, childState,
									returnString);
						} else {
							new LineCoder(returnString).appendPseudocode(builder, numTabs + 1, null, null);
						}
				}
			};

			// Find all the declared variables throughout all the problem
			// states. We need this so that the new variable we make doesn't
			// conflict with any of them.
			HashSet<String> declaredVars = InputUtil.getDeclaredVars(newProblem);
			ProblemState solved = subSolvers.get(subProblem).solved;
			while (solved != null) {
				declaredVars.addAll(InputUtil.getDeclaredVars(solved.problem));
				solved = solved.parentState;
			}
			addProblemState(newProblem, problemState,
					new MultistageTheorem(null, null, null, 0, "Brute-force checking of a quantifier.", coder),
					Binding.singleton(newVariable, InputUtil.getUnusedVar(declaredVars)));
		}
	}

	// TODO:DN: Refactor and remove this method
	private static Binding doBindings(Problem problem, HashSet<String> usedVars, ArrayList<String> vars) {
		MutableBinding binding = new MutableBinding();
		for (String var : vars) {
			String unusedVar = InputUtil.getUnusedVar(usedVars);
			binding.bind(var, unusedVar);
			problem.getVars().add(InputUtil.createDeclaration(unusedVar));
			break;
		}

		return binding.getImmutable();
	}

	private void addProblemState(Input newProblem, ProblemState parentState, MultistageTheorem multistageTheorem,
			Binding binding) {
		if (newProblem.getGoal().getProperty().equals(InputUtil.getBooleanLiteral(true)))
			newProblem.setGoal(null);

		// Simplify the problem
		TransformUtil.removeGivenFromGoal(newProblem, new Chainer(theorems));

		if (newProblem.getGiven().getProperty() != null)
			newProblem.getGiven().setProperty(InputUtil.canonicalize(newProblem.getGiven().getProperty()));

		if (newProblem.getGoal() != null)
			newProblem.getGoal().setProperty(InputUtil.canonicalize(newProblem.getGoal().getProperty()));

		if (!reachedProblems.containsKey(newProblem)) {
			// System.out.println(this + ":::::" +
			// TransformUtil.makePretty(newProblem));
			ProblemState newProblemState = new ProblemState(newProblem, parentState, multistageTheorem, binding);
			reachedProblems.put(newProblem, newProblemState);

			if (newProblem.getGoal() == null)
				solved = newProblemState;

			problemStates.add(newProblemState);
		}
	}

	private void addVariableRemovalTheorems(Input problem, Chainer findChainer) {
		HashSet<String> unbound = InputUtil.getUnboundVariables(EcoreUtil.copy(problem.getGoal().getProperty()));
		for (Declaration var : problem.getGoal().getVars()) {
			// If the variable is unused...
			if (!unbound.contains(var.getVarName())) {
				MutableBinding binding = new MutableBinding();
				binding.bind(DirectReturn.VAR_NAME, var.getVarName());
				findChainer.nextLevelTheorems.put(new DirectReturn(),
						new ArrayList<Binding>(Collections.singleton(binding.getImmutable())));
			}
		}
	}

	public static String runWebSolver(String[] problemString) {
		return ProblemState.getOutputString(runSolver(problemString[0]).getSolution());
	}

	public static ProblemSolver runSolver(String problemString) {
		ArrayList<Theorem> theorems = TheoremParser.parseFiles();
		theorems.addAll(MultiTheoremParser.parseFiles());
		ProblemSolver ret = new ProblemSolver(QuickParser.parseInputDirty(problemString),
				theorems.toArray(new Theorem[0]));
		ret.getSolution();
		return ret;
	}

	public static void main(String[] args) {
		ArrayList<Theorem> theorems = TheoremParser.parseFiles();
		theorems.addAll(MultiTheoremParser.parseFiles());
		//System.out.println("GIMME A PROBLEM!");
		Scanner s = new Scanner(System.in);
		//while (true) {
			String problemString = s.nextLine();
			if (problemString.equalsIgnoreCase("exit")) {
				s.close();
				System.exit(0);
			}
			Input input = QuickParser.parseInputDirty(problemString);
			ProblemSolver problemSolver = new ProblemSolver(input, theorems.toArray(new Theorem[0]));
			ProblemState solution = problemSolver.getSolution();
			if (solution == null)
				System.out.println("I couldn't solve your problem. You'll have to find a better robot :-(");
			else {
				// System.out.println(TransformUtil.makePretty(input));
				ProblemState solutionSave = solution;
				StringBuffer problems = new StringBuffer();
				do {
					problems.insert(0, TransformUtil.makePretty(solution.problem) + "\n");
					solution = solution.parentState;
				} while (solution != null);
				System.out.println(problems);

				System.out.println(ProblemState.getOutputString(solutionSave));
			}
			//Viewer.displaySolverResults(problemSolver);
			//System.out.println("HIT ME WITH ANOTHER ONE!");
		//}
	}
}
