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

import org.eclipse.emf.ecore.util.EcoreUtil;

import theorems.MultistageTheorem;
import theorems.multiTheorems.DirectReturn;
import algorithmMaker.QuickParser;
import algorithmMaker.input.Declaration;
import algorithmMaker.input.Input;
import algorithmMaker.input.Negation;
import algorithmMaker.input.Problem;
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
	HashSet<Input> reachedProblemStates = new HashSet<Input>();

	// TODO: Should eventually be a priority queue.
	// Everything in this queue is assumed to be simplified already
	public PriorityQueue<ProblemState> problemStates = new PriorityQueue<ProblemState>();

	Hashtable<Input, ProblemSolver> subSolvers = new Hashtable<Input, ProblemSolver>();

	ProblemState solved = null;

	private final Theorem[] theorems;

	public ProblemSolver(Input problem, Theorem... theorems) {
		this.theorems = theorems;
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
		givenChainer.addUnboundVars(InputUtil.getVarNames(problem.getGoal().getVars()));
		givenChainer.chain(problem.getGiven().getProperty(), TransformUtil.GIVEN);

		Chainer findChainer = new Chainer(false, theorems);
		findChainer.addBoundVars(InputUtil.getVarNames(problem.getGiven().getVars()));
		findChainer.previousLevelTheorems = givenChainer.nextLevelTheorems;
		findChainer.chain(problem.getGoal().getProperty(), TransformUtil.GOAL);

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
							newBinding.addBindingsFrom(
									doBindings(newProblem.getGiven(), usedVars, InputUtil.getBindings(givenResult)));
							newGivenParts.add(InputUtil.revar(givenResult, newBinding.getArguments()));
						}
						Property findResult = mst.getFindResult();
						if (findResult != null) {
							newBinding.addBindingsFrom(
									doBindings(newProblem.getGoal(), usedVars, InputUtil.getBindings(findResult)));
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
		for (Property property : InputUtil.getTopLevelElements(problem.getGoal().getProperty())) {
			if (property instanceof Quantifier)
				doQuantifierSubproblemFor(problemState, (Quantifier) property, false);

			if (property instanceof Negation)
				if (((Negation) property).getNegated() instanceof Quantifier)
					doQuantifierSubproblemFor(problemState, (Quantifier) ((Negation) property).getNegated(), true);
		}
	}

	/**
	 * Our dumb way of adding quantifier-requiring multitheorems.
	 */
	private void doQuantifierSubproblemFor(ProblemState problemState, Quantifier quantifier, boolean negated) {
		Input subProblem = InputUtil.stupidCopy(problemState.problem);
		Problem newGoal = InputUtil.stupidCopy(quantifier.getSubject());
		newGoal.setProperty(InputUtil.canonicalize(InputUtil.andTogether(Arrays.asList(new Property[] {
				newGoal.getProperty(), InputUtil.getNegated(InputUtil.stupidCopy(quantifier.getPredicate())) }))));
		subProblem.setGoal(newGoal);
		subProblem.setTask(InputUtil.FIND);
		if (!subSolvers.containsKey(subProblem)) {
			ProblemSolver subSolver = new ProblemSolver(subProblem, theorems);
			subSolver.getSolution();
			subSolvers.put(subProblem, subSolver);
		}
		if (subSolvers.get(subProblem).solved != null) {
			HashSet<Property> toRemove = new HashSet<Property>();
			toRemove.add(negated ? InputUtil.getNegated(quantifier) : quantifier);
			Input newProblem = InputUtil.stupidCopy(problemState.problem);
			newProblem.setGoal((Problem) TransformUtil.removeProperties(newProblem.getGoal(), toRemove));
			newProblem.setTask(InputUtil.FIND);
			newProblem.getGiven().setProperty(InputUtil
					.andTogether(Arrays.asList(new Property[] { quantifier, newProblem.getGiven().getProperty() })));

			StringBuffer code = new StringBuffer();
			code.append("boolean <nb> = true;\n");
			code.append(ProblemState.getOutputString(subSolvers.get(subProblem).solved)
					+ "{\n\t\t<nb> = false;\n\t\tbreak;\n\t}\n");
			code.append("if <nb> == " + (negated ^ quantifier.getQuantifier().equals(InputUtil.FORALL)) + "\n\t");

			HashSet<String> declaredVars = InputUtil.getDeclaredVars(newProblem);
			ProblemState solved = subSolvers.get(subProblem).solved;
			while (solved != null) {
				declaredVars.addAll(InputUtil.getDeclaredVars(solved.problem));
				solved = solved.parentState;
			}
			addProblemState(newProblem, problemState,
					new MultistageTheorem(null, null, null, 0, "Brute-force checking of a quantifier.",
							code.toString()),
					Binding.singleton("nb", InputUtil.createArgument(InputUtil.getUnusedVar(declaredVars))));
		}
	}

	// TODO:DN: Refactor and remove this method
	private static Binding doBindings(Problem problem, HashSet<String> usedVars, ArrayList<String> vars) {
		MutableBinding binding = new MutableBinding();
		for (String var : vars) {
			String unusedVar = InputUtil.getUnusedVar(usedVars);
			binding.bind(var, InputUtil.getVariable(unusedVar));
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
		if (!reachedProblemStates.contains(newProblem)) {
			// System.out.println(this + ":::::" + newProblem);
			reachedProblemStates.add(newProblem);
			ProblemState newProblemState = new ProblemState(newProblem, parentState, multistageTheorem, binding);

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
				binding.bind(DirectReturn.VAR_NAME, InputUtil.getVariable(var.getVarName()));
				findChainer.nextLevelTheorems.put(new DirectReturn(),
						new ArrayList<Binding>(Collections.singleton(binding.getImmutable())));
			}
		}
	}

	public static String runWebSolver(String[] problemString) {
		ArrayList<Theorem> theorems = TheoremParser.parseFiles();
		theorems.addAll(MultiTheoremParser.parseFiles());
		Input input = QuickParser.parseInput(problemString[0]);
		InputUtil.desugar(input);
		return ProblemState.getOutputString(new ProblemSolver(input, theorems.toArray(new Theorem[0])).getSolution());
	}

	public static void main(String[] args) {
		ArrayList<Theorem> theorems = TheoremParser.parseFiles();
		theorems.addAll(MultiTheoremParser.parseFiles());
		String problemString =
		// Problems...
		// "Given list<int>(a), list<int>(b); Find c st child(a,c) & child(b,c)
		// & even(c)";

		// FIXME: Given list<int>(a),b,c st forall(c st child(a,c) :
		// !equal(b,c)); Find b st child(a,b) shouldn't have c in given when
		// this is simplified...

		// "Given list<int> x st TRUE; Find z st child(x,z) & forall(y st
		// child(x,y) : equal(y,z))";
		"Given list<int>(x) st TRUE; Find z st child(x,z) & forall(c st child(x,c) : lessThanEqual(c,z))";
		Input input = QuickParser.parseInput(problemString);
		InputUtil.desugar(input);
		ProblemState solution = new ProblemSolver(input, theorems.toArray(new Theorem[0])).getSolution();
		if (solution == null)
			System.out.println("I couldn't solve your problem. You'll have to find a better robot :-(");

		System.out.println(TransformUtil.makePretty(input));
		ProblemState solutionSave = solution;
		// if (solution != null) {
		// StringBuffer problems = new StringBuffer();
		// do {
		// problems.insert(0, TransformUtil.makePretty(solution.problem) +
		// "\n");
		// solution = solution.parentState;
		// } while (solution != null);
		// System.out.println(problems);
		// }

		System.out.println(ProblemState.getOutputString(solutionSave));
	}
}
