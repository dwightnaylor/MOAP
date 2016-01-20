package solver;

import static algorithmMaker.util.KernelUtil.*;
import static algorithmMaker.util.SugarUtil.*;
import static kernelLanguage.KernelFactory.*;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import algorithmMaker.QuickParser;
import algorithmMaker.util.*;
import bindings.*;
import display.Viewer;
import inputHandling.*;
import kernelLanguage.*;
import pseudocoders.*;
import theorems.MultistageTheorem;

/**
 * Translates an input between various states until a solution is reached.
 * 
 * @author Dwight Naylor
 */
public class ProblemSolver {
	private static final boolean SHOW_GRAPH = true;

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

	private int depth = 0;

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
		// NOTE: This line has to go after the bound vars, or all variables in
		// the goal will be unbound.
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

						Binding rebinding = rebind(KernelUtil.getAtomics(givenResult, BOUND).stream()
								.map(x -> x.args.get(0)).collect(Collectors.toList()), usedVars);
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

						Binding rebinding = rebind(KernelUtil.getAtomics(goalResult, BOUND).stream()
								.map(x -> x.args.get(0)).collect(Collectors.toList()), usedVars);
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
		// This whole way of catching multi-theorems is sort of hacky. Ideally
		// we'd like to have it all done within the
		// theorem chainer, and then we could just "pick them up" here. The
		// reason that isn't done is because the
		// chainer doesn't handle quantifiers very well.
		if (property instanceof KQuantifier) {
			KQuantifier quantifier = (KQuantifier) property;
			doQuantifierSubProblemFor(problemState, quantifier, givenChainer, findChainer);
			if (quantifier.isUniversal()) {
				// if the the quantifier's predicate is transitive...
				if (KernelUtil.satisfies(quantifier.predicate, TRANSITIVITY)) {
					doTransitiveQuantifierClosure(problemState, quantifier, givenChainer, findChainer);
				}
			}
		}
	}

	private void doTransitiveQuantifierClosure(ProblemState problemState, KQuantifier quantifier,
			Set<KProperty> givenChainer, Set<KProperty> findChainer) {
		MutableBinding usedVariables = new MutableBinding();
		ArrayList<KAtomic> involvedAtomics = KernelUtil.getInvolvedAtomics(quantifier.predicate, TRANSITIVITY);
		for (KAtomic atomic : involvedAtomics)
			usedVariables.bind(atomic.args.get(0), atomic.args.get(1));

		KProperty uninvolvedParts = quantifier.predicate.without(new HashSet<KProperty>(involvedAtomics));

		// We then have to make sure this quantifier is a true transitive
		// quantifier.
		ArrayList<Binding> bindings = Binding.findBindingWithin(problemState.problem.goal.property,
				quantifier.subject.property, usedVariables.getImmutable());
		// We do this by finding all possible "matches" from outside the
		// quantifier to the inside of the quantifier
		if (bindings != null)
			for (Binding binding : bindings) {
				KInput enumerationProblem = input(problemState.problem.given, quantifier.subject);
				if (!subSolvers.containsKey(enumerationProblem)) {
					ProblemSolver subSolver = new ProblemSolver(enumerationProblem, theorems);
					subSolver.depth = depth + 1;
					subSolvers.put(enumerationProblem, subSolver);
					subSolver.getSolution();
				}
				KProperty goalNonQuantifierPart = revar(quantifier.subject.property,
						binding.getInverse().getArguments());
				KProperty transitivityGiven = and(problemState.problem.given.property, quantifier.subject.property,
						goalNonQuantifierPart, uninvolvedParts);
				if (subSolvers.get(enumerationProblem).solved == null)
					return;

				KInput[] testProblems = new KInput[involvedAtomics.size()];
				for (int i = 0; i < involvedAtomics.size(); i++) {
					KAtomic atomic = involvedAtomics.get(i);
					testProblems[i] = input(
							problem(new ArrayList<String>(KernelUtil.getUndeclaredVars(transitivityGiven)),
									transitivityGiven),
							problem(new ArrayList<String>(), negate(atomic)));
					if (!subSolvers.containsKey(testProblems[i])) {
						ProblemSolver subSolver = new ProblemSolver(testProblems[i], theorems);
						subSolver.depth = depth + 1;
						subSolvers.put(testProblems[i], subSolver);
						subSolver.getSolution();
					}
					if (subSolvers.get(testProblems[i]).solved == null)
						return;
				}
				KInput newProblem = problemState.problem;
				newProblem = newProblem
						.withGiven(newProblem.given.withProperty(and(quantifier, goalNonQuantifierPart)));
				newProblem = TransformUtil.removeGivenFromGoal(newProblem, new Chainer(theorems));

				String newVariable = "NV";
				Pseudocoder coder = new Pseudocoder() {
					@Override
					public void appendPseudocode(StringBuffer builder, int numTabs, ProblemState problemState,
							Pseudocoder returnCoder, Binding unusedBinding) {
						for (int i = 0; i < testProblems.length; i++) {
							Pseudocoder.appendTabs(builder, numTabs);
							builder.append(problemState.rootTheoremBinding
									.revar(involvedAtomics.get(i).args.get(0) + " = null;\n"));
						}
						ArrayList<Binding> testBindings = new ArrayList<Binding>();
						ArrayList<Pseudocoder> testCoders = new ArrayList<Pseudocoder>();
						ArrayList<String> testLines = new ArrayList<String>();
						for (int i = 0; i < testProblems.length; i++) {
							String arg0 = involvedAtomics.get(i).args.get(0);
							String arg1 = involvedAtomics.get(i).args.get(1);
							testLines.add("if " + arg0 + " == null");
							String assign = "\t" + arg0 + " = " + arg1;
							testLines.add(assign);
							testBindings.add(Binding.createBinding(new String[][] { { "x", arg1 }, { "y", arg0 } }));
							testBindings.add(Binding.EMPTY);
							Pseudocoder pseudocoder = getRootSolvedState(testProblems[i]).rootTheorem.getPseudocoder();
							testCoders.add(pseudocoder);
							testCoders.add(new LineCoder(false, assign));
						}
						testBindings.add(0, Binding.EMPTY);
						testCoders.add(0, new LineCoder(testLines.toArray(new String[0])));
						ProblemState rootState = getRootSolvedState(enumerationProblem);
						rootState.rootTheorem.getPseudocoder().appendPseudocode(builder, numTabs, rootState,
								new SequentialCoder(testCoders, testBindings), binding);
					}
				};
				// System.out.println("new problem:" + newProblem);
				// System.exit(0);

				addProblemState(newProblem,
						problemState, new MultistageTheorem(null, null, null, 10,
								"Basic optimization on a transitive quantifier", coder),
						Binding.singleton(newVariable, "TESTVAR"));
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
			subSolver.depth = depth + 1;
			subSolvers.put(subProblem, subSolver);
			subSolver.getSolution();
		}
		if (subSolvers.get(subProblem).solved != null) {
			// The new problem with the quantifier constraint removed and added to the given
			KInput newProblem = problemState.problem;
			// FIXME: DN: This is a stupid way of removing properties here
			newProblem = newProblem.withGoal(newProblem.goal.withProperty(
					newProblem.goal.property.without(new HashSet<KProperty>(Collections.singleton(quantifier)))));
			newProblem = newProblem
					.withGiven(newProblem.given.withProperty(and(newProblem.given.property, quantifier)));

			String newVariable = "NEW_VARIABLE";
			Pseudocoder coder = new Pseudocoder() {
				@Override
				public void appendPseudocode(StringBuffer builder, int numTabs, ProblemState problemState,
						Pseudocoder returnCoder, Binding unusedBinding) {
					Pseudocoder.appendTabs(builder, numTabs);
					Binding binding = problemState.rootTheoremBinding;
					builder.append(binding.revar("boolean <" + newVariable + "> = true;\n"));
					// FIXME: DN: This whole methodology is awful and needs to
					// be redone later.
					ProblemState head = subSolvers.get(subProblem).solved;
					while (head.parentState != null) {
						head.parentState.childStates = Collections.singletonList(head);
						head = head.parentState;
					}
					ProblemState mainState = head.childStates.get(0);
					mainState.rootTheorem.getPseudocoder().appendPseudocode(builder, numTabs, mainState,
							new LineCoder(binding.revar("<" + newVariable + "> = false")), binding);
					Pseudocoder.appendTabs(builder, numTabs);
					builder.append(binding.revar("if <" + newVariable + "> == " + quantifier.isUniversal() + "\n"));
					if (problemState != null)
						if (problemState.childStates != null && problemState.childStates.size() > 0) {
							ProblemState childState = problemState.childStates.get(0);
							childState.rootTheorem.getPseudocoder().appendPseudocode(builder, numTabs + 1, childState,
									returnCoder, binding);
						} else {
							returnCoder.appendPseudocode(builder, numTabs + 1, null, null, binding);
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
			addProblemState(newProblem, problemState,
					new MultistageTheorem(null, null, null, 10, "Brute-force checking of a quantifier.", coder),
					Binding.singleton(newVariable, InputUtil.getUnusedVar(declaredVars)));
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
		newGoal = newGoal.withProperty((KProperty) canonicalize(
				and(newGoal.property, quantifier.isUniversal() ? negate(newPredicate) : newPredicate)));
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
			newProblem = newProblem
					.withGiven(newProblem.given.withProperty((KProperty) canonicalize(newProblem.given.property)));

		if (newProblem.goal != null)
			newProblem = newProblem
					.withGoal(newProblem.goal.withProperty((KProperty) canonicalize(newProblem.goal.property)));

		if (!reachedProblems.containsKey(newProblem)) {
			// for (int i = 0; i < depth; i++)
			// System.out.print("\t");
			// System.out.println(newProblem);

			ProblemState newProblemState = new ProblemState(newProblem, parentState, multistageTheorem, binding);
			reachedProblems.put(newProblem, newProblemState);

			if (newProblem.goal.solved() && (solved == null || solved.cost > newProblemState.cost))
				solved = newProblemState;

			problemStates.add(newProblemState);
		}
	}

	private ProblemState getRootSolvedState(KInput enumerationProblem) {
		ProblemState head = subSolvers.get(enumerationProblem).solved;
		while (head.parentState != null) {
			head.parentState.childStates = Collections.singletonList(head);
			head = head.parentState;
		}
		return head.childStates.get(0);
	}

	public static String runWebSolver(String[] problemString) {
		return ProblemState.getOutputString(runSolver(problemString[0]).getSolution());
	}

	public static ProblemSolver runSolver(String problemString) {
		ArrayList<KTheorem> theorems = TheoremParser.parseFiles();
		theorems.addAll(MultiTheoremParser.getMultiTheorems());
		ProblemSolver ret = new ProblemSolver((KInput) convertToKernel(QuickParser.parseInput(problemString)),
				theorems.toArray(new KTheorem[0]));
		ret.getSolution();
		return ret;
	}

	public static void main(String[] args) {
		ArrayList<KTheorem> theorems = TheoremParser.parseFiles();
		theorems.addAll(MultiTheoremParser.getMultiTheorems());
		System.out.println("GIMME A PROBLEM!");
		Scanner s = new Scanner(System.in);
		while (true) {
			String problemString = s.nextLine();
			if (problemString.equalsIgnoreCase("exit")) {
				s.close();
				System.exit(0);
			}
			KInput input = (KInput) convertToKernel(QuickParser.parseInput(problemString));
			ProblemSolver problemSolver = new ProblemSolver(input, theorems.toArray(new KTheorem[0]));
			ProblemState solution = problemSolver.getSolution();
			if (solution == null)
				System.out.println("I couldn't solve your problem. You'll have to find a better robot :-(");
			else {
				ProblemState solutionSave = solution;
				StringBuffer problems = new StringBuffer();
				do {
					problems.insert(0, resugar(convertToInput(solution.problem)) + "\n");
					solution = solution.parentState;
				} while (solution != null);
				// System.out.println(problems);

				System.out.println(ProblemState.getOutputString(solutionSave));
			}
			if (SHOW_GRAPH)
				Viewer.displaySolverResults(problemSolver);

			System.out.println("HIT ME WITH ANOTHER ONE!");
		}
	}
}
