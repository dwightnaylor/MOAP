package solver;

import static algorithmMaker.util.KernelUtil.*;
import static algorithmMaker.util.SugarUtil.*;
import static kernelLanguage.KernelFactory.*;
import inputHandling.*;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import kernelLanguage.*;
import pseudocoders.*;
import theorems.MultistageTheorem;
import algorithmMaker.QuickParser;
import algorithmMaker.util.*;
import bindings.*;
import display.Viewer;

/**
 * Translates an input between various states until a solution is reached.
 * 
 * @author Dwight Naylor
 */
public class ProblemSolver {

	/**
	 * All of the problem states that have either been explored or been enqueued to be explored.
	 */
	public Hashtable<KInput, ProblemState> reachedProblems = new Hashtable<KInput, ProblemState>();

	// Everything in this queue is assumed to be simplified already
	public PriorityQueue<ProblemState> problemStates = new PriorityQueue<ProblemState>();

	private static Hashtable<KInput, ProblemSolver> subSolvers = new Hashtable<KInput, ProblemSolver>();

	ProblemState solved = null;

	private final KTheorem[] theorems;

	private final KTheorem[] invertedTheorems;

	public ProblemSolver(KInput problem, KTheorem... theorems) {
		this.theorems = theorems;
		this.invertedTheorems = new KTheorem[theorems.length];
		for (int i = 0; i < theorems.length; i++)
			invertedTheorems[i] = theorems[i] instanceof MultistageTheorem ? theorems[i] : theorems[i].getConverse();

		addProblemState(problem, null, null, null);
	}

	public ProblemState getSolution() {
		while (problemStates.size() > 0 && (solved == null || solved.cost > problemStates.peek().cost))
			branch();

		return problemStates.size() == 0 ? null : solved;
	}

	public void branch() {
		ProblemState problemState = problemStates.poll();
		KInput problem = problemState.problem;

		Chainer givenChainer = new Chainer(theorems);
		givenChainer.addBoundVars(problem.given.vars.toArray(new String[0]));
		// NOTE: This line has to go after the bound vars, or all variables in the goal will be unbound.
		givenChainer.addUnboundVars(variables(problem.goal).toArray(new String[0]));
		if (problem.given.property != null)
			givenChainer.chain(problem.given.property, GIVEN);

		Chainer goalChainer = new Chainer(false, invertedTheorems);
		goalChainer.addBoundVars(problem.given.vars.toArray(new String[0]));
		goalChainer.addBoundVars(problem.goal.vars.toArray(new String[0]));
		goalChainer.previousLevelTheorems = givenChainer.nextLevelTheorems;
		goalChainer.chain(problem.goal.property, GOAL);

		if (goalChainer.nextLevelTheorems.size() > 0) {
			for (Entry<MultistageTheorem, ArrayList<Binding>> entry : goalChainer.nextLevelTheorems.entrySet())
				for (Binding binding : entry.getValue()) {
					MultistageTheorem mst = entry.getKey();
					KInput newProblem = problem;

					// Make the new given (just add in all the multi-theorem
					// results)
					ArrayList<KProperty> newGivenParts = new ArrayList<KProperty>();
					newGivenParts.add(newProblem.given.property);
					ArrayList<KProperty> newGoalParts = new ArrayList<KProperty>();
					newGoalParts.add(newProblem.goal.property);

					HashSet<String> usedVars = new HashSet<String>();
					usedVars.addAll(newProblem.given.vars);
					usedVars.addAll(newProblem.goal.vars);

					MutableBinding newBinding = new MutableBinding();
					newBinding.addBindingsFrom(binding);

					KProperty givenResult = mst.getGivenResult();
					KProperty goalResult = mst.getGoalResult();

					if (givenResult != null) {
						for (String var : KernelUtil.getDeclaredVars(givenResult))
							if (usedVars.contains(var)) {
								String newVar = InputUtil.getUnusedVar(usedVars);
								usedVars.add(newVar);
								newBinding.bind(var, newVar);
							}

						Binding rebinding = rebind(
								KernelUtil.getAtomics(givenResult, BOUND).stream().map(x -> x.args.get(0))
										.collect(Collectors.toList()), usedVars);
						List<String> newVars = new ArrayList<String>();
						newVars.addAll(newProblem.goal.vars);
						newVars.addAll(rebinding.getArguments().keySet());
						newBinding.addBindingsFrom(rebinding);
						newGivenParts.add(revar(givenResult, newBinding.getArguments()));
					}
					if (goalResult != null) {
						for (String var : getDeclaredVars(goalResult))
							if (usedVars.contains(var)) {
								String newVar = InputUtil.getUnusedVar(usedVars);
								usedVars.add(newVar);
								newBinding.bind(var, newVar);
							}

						Binding rebinding = rebind(
								KernelUtil.getAtomics(goalResult, BOUND).stream().map(x -> x.args.get(0))
										.collect(Collectors.toList()), usedVars);
						List<String> newVars = new ArrayList<String>();
						newVars.addAll(newProblem.goal.vars);
						newVars.addAll(rebinding.getArguments().keySet());
						newProblem = newProblem.withGoal(newProblem.goal.withVars(newVars));
						newBinding.addBindingsFrom(rebinding);
						newGoalParts.add(revar(goalResult, newBinding.getArguments()));
					}

					binding = newBinding.getImmutable();

					newProblem = newProblem.withGiven(newProblem.given.withProperty(and(newGivenParts)));
					newProblem = newProblem.withGoal(newProblem.goal.withProperty(and(newGoalParts)));

					addProblemState(newProblem, problemState, mst, binding);
				}
		}
		// Our stupid way of looking for quantifiers for theorems...
		for (KProperty property : goalChainer.properties.keySet())
			doSubProblemMultitheorems(problemState, property, givenChainer.properties.keySet(),
					goalChainer.properties.keySet());
	}

	private void doSubProblemMultitheorems(ProblemState problemState, KProperty property, Set<KProperty> givenChainer,
			Set<KProperty> findChainer) {
		if (property instanceof KQuantifier) {
			KQuantifier quantifier = (KQuantifier) property;
			doQuantifierSubProblemFor(problemState, quantifier, givenChainer, findChainer);
			if (KernelUtil.satisfies(quantifier, KernelUtil.TRANSITIVITY)) {
				// FIXME: This is such a hack...
				if (!(quantifier.predicate instanceof KAtomic && ((KAtomic) quantifier.predicate).function
						.equals(EQUAL)))
					if (quantifier.subject.property instanceof KAtomic) {
						KAtomic atomic = (KAtomic) quantifier.subject.property;
						if (atomic.function.equals("child") && givenChainer.contains(atomic(BOUND, atomic.args.get(0)))) {
							doTransitivityCarrySubProblemFor(problemState, quantifier);
						}
					}
			}
		}
	}

	private void doTransitivityCarrySubProblemFor(ProblemState problemState, KQuantifier quantifier) {
		// First we check and see if all the variables used in the quantifier
		// are bound. If any aren't, we can't solve the quantifier.
		HashSet<String> boundVars = new HashSet<String>();
		boundVars.addAll(getDeclaredVars(quantifier));
		// Add all the declarations from the given
		boundVars.addAll(problemState.problem.given.vars);
		String undeclaredVar = null;
		for (String variable : variables(quantifier)) {
			if (!boundVars.contains(variable))
				if (undeclaredVar == null)
					undeclaredVar = variable;
				else
					return;
		}
		// There must be exactly one undeclared variable for this to work...
		if (undeclaredVar == null)
			return;

		// Build the subproblem
		KInput subProblem = getSubProblemForTransitiveQuantifier(problemState.problem, quantifier);
		if (!subSolvers.containsKey(subProblem)) {
			ProblemSolver subSolver = new ProblemSolver(subProblem, theorems);
			subSolvers.put(subProblem, subSolver);
			subSolver.getSolution();
		}
		if (subSolvers.get(subProblem).solved != null) {
			// The new problem with the quantifier constraint removed and added to the given
			KInput newProblem = problemState.problem;
			// FIXME: DN: This isn't the best way to do transitive quantifier breaking...
			String parent = ((KAtomic) quantifier.subject.property).args.get(0);
			String other = subProblem.goal.vars.get(0);
			KAtomic newChildConstraint = atomic("child", parent, undeclaredVar);
			newProblem = newProblem.withGoal((KProblem) newProblem.goal.withProperty(newProblem.goal.property
					.without(and(quantifier, newChildConstraint))));
			newProblem = newProblem.withGiven(newProblem.given.withProperty(and(quantifier, newChildConstraint,
					newProblem.given.property)));

			final String varToBind = undeclaredVar;
			Pseudocoder coder = new Pseudocoder() {
				@Override
				public void appendPseudocode(StringBuffer builder, int numTabs, ProblemState problemState,
						String returnString) {
					Pseudocoder.appendTabs(builder, numTabs);
					builder.append(varToBind + " = " + parent + ".any()\n");
					// FIXME: DN: This whole methodology is awful and needs to be redone later.
					ProblemState head = subSolvers.get(subProblem).solved;
					while (head.parentState != null) {
						head.parentState.childStates = Collections.singletonList(head);
						head = head.parentState;
					}
					head.childStates.get(0).rootTheorem.getPseudocoder().appendPseudocode(builder, numTabs,
							head.childStates.get(0), varToBind + " = " + other);
					if (problemState != null)
						if (problemState.childStates != null && problemState.childStates.size() > 0) {
							ProblemState childState = problemState.childStates.get(0);
							childState.rootTheorem.getPseudocoder().appendPseudocode(builder, numTabs + 1, childState,
									null);
						} else {
							new LineCoder(returnString).appendPseudocode(builder, numTabs, null, returnString);
						}
				}
			};

			addProblemState(newProblem, problemState, new MultistageTheorem(null, null, null, 10,
					"Smart checking for transitive quantifier", coder), Binding.EMPTY);
		}
	}

	private void doQuantifierSubProblemFor(ProblemState problemState, KQuantifier quantifier,
			Set<KProperty> givenChainer, Set<KProperty> findChainer) {
		// First we check and see if all the variables used in the quantifier
		// are bound. If any aren't, we can't solve the quantifier.
		HashSet<String> boundVars = new HashSet<String>();
		boundVars.addAll(getDeclaredVars(quantifier));
		// Add all the declarations from the given
		boundVars.addAll(problemState.problem.given.vars);
		for (String variable : variables(quantifier)) {
			if (!boundVars.contains(variable))
				return;
		}
		// Build the subproblem
		KInput subProblem = getSubProblemForQuantifier(problemState.problem, quantifier);
		if (!subSolvers.containsKey(subProblem)) {
			ProblemSolver subSolver = new ProblemSolver(subProblem, theorems);
			subSolvers.put(subProblem, subSolver);
			subSolver.getSolution();
		}
		if (subSolvers.get(subProblem).solved != null) {
			// The new problem with the quantifier constraint removed and added to the given
			KInput newProblem = problemState.problem;
			// FIXME: DN: This is a stupid way of removing properties here
			newProblem = newProblem.withGoal((KProblem) newProblem.goal.withProperty(newProblem.goal.property
					.without(quantifier)));
			newProblem = newProblem.withGiven(newProblem.given.withProperty(and(Arrays.asList(new KProperty[] {
					quantifier, newProblem.given.property }))));

			String newVariable = "NEW_VARIABLE";
			Pseudocoder coder = new Pseudocoder() {
				@Override
				public void appendPseudocode(StringBuffer builder, int numTabs, ProblemState problemState,
						String returnString) {
					Pseudocoder.appendTabs(builder, numTabs);
					builder.append(problemState.rootTheoremBinding.revar("boolean <" + newVariable + "> = true;\n"));
					// FIXME: DN: This whole methodology is awful and needs to be redone later.
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
							+ quantifier.isUniversal() + "\n"));
					if (problemState != null)
						if (problemState.childStates != null && problemState.childStates.size() > 0) {
							ProblemState childState = problemState.childStates.get(0);
							childState.rootTheorem.getPseudocoder().appendPseudocode(builder, numTabs + 1, childState,
									returnString);
						} else {
							new LineCoder(returnString).appendPseudocode(builder, numTabs + 1, null, null);
						}
				}
			};

			// Find all the declared variables throughout all the problem
			// states. We need this so that the new variable we make doesn't
			// conflict with any of them.
			HashSet<String> declaredVars = new HashSet<String>(newProblem.given.vars);
			ProblemState solved = subSolvers.get(subProblem).solved;
			while (solved != null) {
				declaredVars.addAll(solved.problem.given.vars);
				solved = solved.parentState;
			}
			addProblemState(newProblem, problemState, new MultistageTheorem(null, null, null, 10,
					"Brute-force checking of a quantifier.", coder), Binding.singleton(newVariable,
					InputUtil.getUnusedVar(declaredVars)));
		}
	}

	/**
	 * Produces a subproblem K for which: <br>
	 * If the quantifier is universal, a solution for K is a counterexample.<br>
	 * If the quantifier is existential, a solution for K is an example.
	 */
	public static KInput getSubProblemForQuantifier(KInput problem, KQuantifier quantifier) {
		MutableBinding rebindingForQuantifier = new MutableBinding();
		HashSet<String> usedVars = new HashSet<String>(variables(problem));
		for (String var : getDeclaredVars(quantifier.subject)) {
			String newVar = InputUtil.getUnusedVar(usedVars);
			usedVars.add(newVar);
			rebindingForQuantifier.bind(var, newVar);
		}
		KProblem newGoal = revar(quantifier.subject, rebindingForQuantifier.getArguments());
		KProperty newPredicate = revar(quantifier.predicate, rebindingForQuantifier.getArguments());
		newGoal = newGoal.withProperty((KProperty) canonicalize(and(newGoal.property,
				quantifier.isUniversal() ? negate(newPredicate) : newPredicate)));
		return problem.withGoal(newGoal);
	}

	/**
	 * Produces a subproblem which, if solved, provides a new "top" for the given transitive quantifier.
	 */
	public static KInput getSubProblemForTransitiveQuantifier(KInput problem, KQuantifier quantifier) {
		MutableBinding rebindingForQuantifier = new MutableBinding();
		HashSet<String> usedVars = new HashSet<String>(variables(problem));
		for (String var : getDeclaredVars(quantifier.subject)) {
			String newVar = InputUtil.getUnusedVar(usedVars);
			usedVars.add(newVar);
			rebindingForQuantifier.bind(var, newVar);
		}

		KProblem newGoal = revar(quantifier.subject, rebindingForQuantifier.getArguments());
		KProperty newPredicate = revar(quantifier.predicate, rebindingForQuantifier.getArguments());
		newGoal = newGoal.withProperty((KProperty) canonicalize(and(newGoal.property, negate(newPredicate))));
		return problem.withGoal(newGoal);
	}

	private static Binding rebind(List<String> vars, HashSet<String> usedVars) {
		MutableBinding binding = new MutableBinding();
		for (String var : vars) {
			String unusedVar = InputUtil.getUnusedVar(usedVars);
			binding.bind(var, unusedVar);
			break;
		}

		return binding.getImmutable();
	}

	private void addProblemState(KInput newProblem, ProblemState parentState, MultistageTheorem multistageTheorem,
			Binding binding) {
		// Simplify the problem
		newProblem = TransformUtil.removeGivenFromGoal(newProblem, new Chainer(theorems));

		if (newProblem.given.property != null)
			newProblem = newProblem.withGiven(newProblem.given
					.withProperty((KProperty) canonicalize(newProblem.given.property)));

		if (newProblem.goal != null)
			newProblem = newProblem.withGoal(newProblem.goal
					.withProperty((KProperty) canonicalize(newProblem.goal.property)));

		if (!reachedProblems.containsKey(newProblem)) {
			// System.out.println(this + ":::::" + newProblem);
			ProblemState newProblemState = new ProblemState(newProblem, parentState, multistageTheorem, binding);
			reachedProblems.put(newProblem, newProblemState);

			if (newProblem.goal.solved() && (solved == null || solved.cost > newProblemState.cost))
				solved = newProblemState;

			problemStates.add(newProblemState);
		}
	}

	public static String runWebSolver(String[] problemString) {
		return ProblemState.getOutputString(runSolver(problemString[0]).getSolution());
	}

	public static ProblemSolver runSolver(String problemString) {
		ArrayList<KTheorem> theorems = TheoremParser.parseFiles();
		theorems.addAll(MultiTheoremParser.parseFiles());
		ProblemSolver ret = new ProblemSolver((KInput) convertToKernel(QuickParser.parseInput(problemString)),
				theorems.toArray(new KTheorem[0]));
		ret.getSolution();
		return ret;
	}

	public static void main(String[] args) {
		ArrayList<KTheorem> theorems = TheoremParser.parseFiles();
		theorems.addAll(MultiTheoremParser.parseFiles());
		//System.out.println("GIMME A PROBLEM!");
		Scanner s = new Scanner(System.in);
		//while (true) {
			String problemString = s.nextLine();
			if (problemString.equalsIgnoreCase("exit")) {
				s.close();
				System.exit(0);
			}
			KInput input = (KInput) SugarUtil.convertToKernel(QuickParser.parseInput(problemString));
			ProblemSolver problemSolver = new ProblemSolver(input, theorems.toArray(new KTheorem[0]));
			ProblemState solution = problemSolver.getSolution();
			if (solution == null)
				System.out.println("I couldn't solve your problem. You'll have to find a better robot :-(");
			else {
				// System.out.println(makePretty(input));
				ProblemState solutionSave = solution;
				StringBuffer problems = new StringBuffer();
				do {
					problems.insert(0, resugar(convertToInput(solution.problem)) + "\n");
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
