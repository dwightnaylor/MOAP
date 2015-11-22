package solver;

import inputHandling.MultiTheoremParser;
import inputHandling.TheoremParser;
import inputHandling.TransformUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.util.EcoreUtil;

import theorems.MultistageTheorem;
import theorems.multiTheorems.DirectReturn;
import algorithmMaker.QuickParser;
import algorithmMaker.input.Atomic;
import algorithmMaker.input.Declaration;
import algorithmMaker.input.Input;
import algorithmMaker.input.Problem;
import algorithmMaker.input.ProblemShell;
import algorithmMaker.input.Property;
import algorithmMaker.input.Quantifier;
import algorithmMaker.input.Theorem;
import algorithmMaker.input.Variable;
import algorithmMaker.util.InputUtil;
import bindings.Binding;
import bindings.MutableBinding;

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
			invertedTheorems[i] = theorems[i] instanceof MultistageTheorem ? theorems[i] : InputUtil
					.getConverse(theorems[i]);

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
		givenChainer.chain(problem.getGiven().getProperty(), TransformUtil.GIVEN);

		Chainer findChainer = new Chainer(false, invertedTheorems);
		findChainer.addBoundVars(InputUtil.getVarNames(problem.getGiven().getVars()));
		findChainer.previousLevelTheorems = givenChainer.nextLevelTheorems;
		findChainer.chain(problem.getGoal().getProperty(), TransformUtil.GOAL);

		// XXX:Given list x, list y, list z; Find a st child(x,a) & child(y,a) &
		// !child(z,a)

		addVariableRemovalTheorems(problem, findChainer);

		if (findChainer.nextLevelTheorems.size() > 0) {
			for (Entry<MultistageTheorem, ArrayList<Binding>> entry : findChainer.nextLevelTheorems.entrySet())
				for (Binding binding : entry.getValue()) {
					MultistageTheorem mst = entry.getKey();
					if (mst.getRequiredGoalTask() != null
							&& !problemState.problem.getTask().equals(mst.getRequiredGoalTask()))
						continue;

					Input newProblem = InputUtil.stupidCopy(problem);

					// Make the new given (just add in all the multi-theorem
					// results)
					ArrayList<Property> newGivenParts = new ArrayList<Property>();
					newGivenParts.add(newProblem.getGiven().getProperty());
					ArrayList<Property> newGoalParts = new ArrayList<Property>();
					newGoalParts.add(newProblem.getGoal().getProperty());

					if (mst instanceof DirectReturn) {
						String varToRemove = ((Variable) binding.getArguments().values().iterator().next()).getArg();
						newProblem.getGoal().getVars().removeIf(x -> x.getVarName().equals(varToRemove));
					} else {
						HashSet<String> usedVars = new HashSet<String>();
						usedVars.addAll(Arrays.asList(InputUtil.getVarNames(newProblem.getGiven().getVars())));
						usedVars.addAll(Arrays.asList(InputUtil.getVarNames(newProblem.getGoal().getVars())));

						MutableBinding newBinding = new MutableBinding();
						newBinding.addBindingsFrom(binding);

						Property givenResult = mst.getGivenResult();
						if (givenResult != null) {
							newBinding.addBindingsFrom(doBindings(newProblem.getGiven(), usedVars,
									InputUtil.getBindings(givenResult)));
							newGivenParts.add(InputUtil.revar(givenResult, newBinding.getArguments()));
						}
						Property findResult = mst.getFindResult();
						if (findResult != null) {
							newBinding.addBindingsFrom(doBindings(newProblem.getGoal(), usedVars,
									InputUtil.getBindings(findResult)));
							newGoalParts.add(InputUtil.revar(findResult, newBinding.getArguments()));
						}

						binding = newBinding.getImmutable();
					}

					newProblem.getGiven().setProperty(InputUtil.andTogether(newGivenParts));
					newProblem.getGoal().setProperty(InputUtil.andTogether(newGoalParts));

					if (mst.newGoalTask != null)
						newProblem.setTask(mst.newGoalTask);

					addProblemState(newProblem, problemState, mst, binding);
				}
		}
		// Our stupid way of looking for quantifiers for theorems...
		for (Property property : findChainer.copyProperties())
			doSubProblemMultitheorems(problemState, property, givenChainer.copyProperties(),
					findChainer.copyProperties());
	}

	private void doSubProblemMultitheorems(ProblemState problemState, Property property,
			HashSet<Property> givenChainer, HashSet<Property> findChainer) {
		if (property instanceof Quantifier)
			doQuantifierSubProblemFor(problemState, (Quantifier) property, givenChainer, findChainer);

		if (property instanceof ProblemShell)
			doShellSubProblem(problemState, (ProblemShell) property);

		// if (property instanceof Negation)
		// doNegationSubProblem(problemState, (Negation) property);
	}

	private void doShellSubProblem(ProblemState problemState, ProblemShell shell) {
		Input subProblem = InputUtil.stupidCopy(problemState.problem);
		subProblem.setGoal(InputUtil.stupidCopy(shell.getProblem()));
		subProblem.setTask(InputUtil.FIND);
		if (!subSolvers.containsKey(subProblem)) {
			ProblemSolver subSolver = new ProblemSolver(subProblem, theorems);
			subSolver.getSolution();
			subSolvers.put(subProblem, subSolver);
		}
		if (subSolvers.get(subProblem).solved != null) {
			// The new problem with the constraint removed
			Input newProblem = InputUtil.stupidCopy(problemState.problem);
			newProblem.setGoal((Problem) TransformUtil.removeProperties(newProblem.getGoal(), new HashSet<Property>(
					Collections.singleton(shell))));
			newProblem.setTask(InputUtil.FIND);
			newProblem.getGiven()
					.setProperty(
							InputUtil.andTogether(Arrays.asList(new Property[] { shell,
									newProblem.getGiven().getProperty() })));
			// The code to add to the pseudocode
			StringBuffer code = new StringBuffer();
			code.append(ProblemState.getOutputString(subSolvers.get(subProblem).solved) + "\n");

			// Find all the declared variables throughout all the problem
			// states. We need this so that the new variable we make doesn't
			// conflict with any of them.
			HashSet<String> declaredVars = InputUtil.getDeclaredVars(newProblem);
			ProblemState solved = subSolvers.get(subProblem).solved;
			while (solved != null) {
				declaredVars.addAll(InputUtil.getDeclaredVars(solved.problem));
				solved = solved.parentState;
			}
			addProblemState(newProblem, problemState, new MultistageTheorem(null, null, null, 0,
					"Solving of a problem shell", code.toString()), new Binding());
		}
	}

	private void doQuantifierSubProblemFor(ProblemState problemState, Quantifier quantifier,
			HashSet<Property> givenChainer, HashSet<Property> findChainer) {
		// First we check and see if all the variables used in the quantifier
		// are bound. If any aren't, we can't solve the quantifier.
		HashSet<String> boundVars = new HashSet<String>();
		boundVars.addAll(InputUtil.getDeclaredVars(quantifier));
		// Add all the declarations from the given
		boundVars.addAll(givenChainer.stream()
				.filter(x -> x instanceof Atomic && ((Atomic) x).getFunction().equals(InputUtil.BOUND))
				.map(x -> ((Variable) ((Atomic) x).getArgs().get(0)).getArg()).collect(Collectors.toList()));
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
			rebindingForQuantifier.bind(var, InputUtil.createVariable(newVar));
		}
		Problem newGoal = InputUtil.stupidCopy(InputUtil.revar(subject, rebindingForQuantifier.getArguments()));
		newGoal.setProperty(InputUtil.canonicalize(InputUtil.andTogether(Arrays.asList(new Property[] {
				newGoal.getProperty(),
				InputUtil.getNegated(InputUtil.stupidCopy(InputUtil.revar(quantifier.getPredicate(),
						rebindingForQuantifier.getArguments()))) }))));
		subProblem.setGoal(newGoal);
		subProblem.setTask(InputUtil.FIND);
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
			newProblem.setGoal((Problem) TransformUtil.removeProperties(newProblem.getGoal(), new HashSet<Property>(
					Collections.singleton(quantifier))));
			newProblem.setTask(InputUtil.FIND);
			newProblem.getGiven().setProperty(
					InputUtil.andTogether(Arrays.asList(new Property[] { quantifier,
							newProblem.getGiven().getProperty() })));

			// The code to add to the pseudocode
			StringBuffer code = new StringBuffer();
			code.append("boolean <nb> = true;\n");
			code.append(ProblemState.getOutputString(subSolvers.get(subProblem).solved)
					+ "{\n\t\t<nb> = false;\n\t\tbreak;\n\t}\n");
			code.append("if <nb> == " + quantifier.getQuantifier().equals(InputUtil.FORALL) + "\n\t");

			// Find all the declared variables throughout all the problem
			// states. We need this so that the new variable we make doesn't
			// conflict with any of them.
			HashSet<String> declaredVars = InputUtil.getDeclaredVars(newProblem);
			ProblemState solved = subSolvers.get(subProblem).solved;
			while (solved != null) {
				declaredVars.addAll(InputUtil.getDeclaredVars(solved.problem));
				solved = solved.parentState;
			}
			addProblemState(newProblem, problemState, new MultistageTheorem(null, null, null, 0,
					"Brute-force checking of a quantifier.", code.toString()), Binding.singleton("nb",
					InputUtil.createVariable(InputUtil.getUnusedVar(declaredVars))));
		}
	}

	// TODO:DN: Refactor and remove this method
	private static Binding doBindings(Problem problem, HashSet<String> usedVars, ArrayList<String> vars) {
		MutableBinding binding = new MutableBinding();
		for (String var : vars) {
			String unusedVar = InputUtil.getUnusedVar(usedVars);
			binding.bind(var, InputUtil.createVariable(unusedVar));
			problem.getVars().add(InputUtil.createDeclaration(unusedVar));
			break;
		}

		return binding.getImmutable();
	}

	private void addProblemState(Input newProblem, ProblemState parentState, MultistageTheorem multistageTheorem,
			Binding binding) {
		// Simplify the problem
		newProblem = TransformUtil.removeGivenFromGoal(newProblem, new Chainer(theorems));

		newProblem.getGiven().setProperty(InputUtil.canonicalize(newProblem.getGiven().getProperty()));
		newProblem.getGoal().setProperty(InputUtil.canonicalize(newProblem.getGoal().getProperty()));
		if (!reachedProblems.containsKey(newProblem)) {
			// System.out.println(this + ":::::" + TransformUtil.makePretty(newProblem));
			ProblemState newProblemState = new ProblemState(newProblem, parentState, multistageTheorem, binding);
			reachedProblems.put(newProblem, newProblemState);

			if (TransformUtil.isSolved(newProblem.getGoal()))
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
				binding.bind(DirectReturn.VAR_NAME, InputUtil.createVariable(var.getVarName()));
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
		Input input = QuickParser.parseInput(problemString);
		InputUtil.desugar(input);
		ProblemSolver ret = new ProblemSolver(input, theorems.toArray(new Theorem[0]));
		ret.getSolution();
		return ret;
	}

	public static void main(String[] args) {
		ArrayList<Theorem> theorems = TheoremParser.parseFiles();
		theorems.addAll(MultiTheoremParser.parseFiles());
		System.out.println("GIMME A PROBLEM!");
		Scanner s = new Scanner(System.in);
		while (true) {
			String problemString = s.nextLine();
			if (problemString.equalsIgnoreCase("exit")) {
				s.close();
				System.exit(0);
			}
			Input input = QuickParser.parseInput(problemString);
			InputUtil.desugar(input);
			ProblemState solution = new ProblemSolver(input, theorems.toArray(new Theorem[0])).getSolution();
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
			System.out.println("HIT ME WITH ANOTHER ONE!");
		}
	}
}
