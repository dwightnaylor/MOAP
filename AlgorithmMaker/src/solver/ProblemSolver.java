package solver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.util.EcoreUtil;

import algorithmMaker.QuickParser;
import algorithmMaker.input.Input;
import algorithmMaker.input.Problem;
import algorithmMaker.input.Property;
import algorithmMaker.input.Theorem;
import algorithmMaker.util.InputUtil;
import bindings.Binding;
import bindings.MutableBinding;
import inputHandling.MultiTheoremParser;
import inputHandling.TheoremParser;
import inputHandling.TransformUtil;
import theorems.MultistageTheorem;
import theorems.multiTheorems.DirectReturn;

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
	public ArrayList<ProblemState> problemStates = new ArrayList<ProblemState>();

	boolean solved = false;

	private final Theorem[] theorems;

	public ProblemSolver(Input problem, Theorem... theorems) {
		this.theorems = theorems;
		addProblemState(problem, null, null, null);
	}

	public ProblemState getSolution() {
		while (!solved && problemStates.size() > 0)
			branch();

		return problemStates.size() == 0 ? null : problemStates.get(problemStates.size() - 1);
	}

	public void branch() {
		ProblemState problemState = problemStates.remove(0);
		Input problem = problemState.problem;

		Chainer givenChainer = new Chainer(theorems);
		givenChainer.addBoundVars(problem.getGiven().getVars());
		givenChainer.addUnboundVars(problem.getGoal().getVars());
		givenChainer.chain(problem.getGiven().getProperty(), TransformUtil.GIVEN);

		Chainer findChainer = new Chainer(false, theorems);
		findChainer.addBoundVars(problem.getGiven().getVars());
		findChainer.previousLevelTheorems = givenChainer.nextLevelTheorems;
		findChainer.chain(problem.getGoal().getProperty(), TransformUtil.GOAL);

		addVariableRemovalTheorems(problem, findChainer);
		
		if (findChainer.nextLevelTheorems.size() > 0) {
			for (Entry<MultistageTheorem, ArrayList<Binding>> entry : findChainer.nextLevelTheorems.entrySet())
				for (Binding binding : entry.getValue()) {
					Input newProblem = (Input) new EcoreUtil.Copier().copy(problem);

					// Make the new given (just add in all the multi-theorem
					// results)
					ArrayList<Property> newGivenParts = new ArrayList<Property>();
					newGivenParts.add(newProblem.getGiven().getProperty());
					ArrayList<Property> newGoalParts = new ArrayList<Property>();
					newGoalParts.add(newProblem.getGoal().getProperty());

					MultistageTheorem mst = entry.getKey();
					if (mst instanceof DirectReturn)
						newProblem.getGoal().getVars().remove(binding.getArguments().values().iterator().next());
					else {
						HashSet<String> usedVars = new HashSet<String>();
						usedVars.addAll(newProblem.getGiven().getVars());
						usedVars.addAll(newProblem.getGoal().getVars());

						MutableBinding newBinding = new MutableBinding();
						newBinding.addBindingsFrom(binding);

						Property givenResult = mst.getGivenResult();
						if (givenResult != null) {
							newBinding.addBindingsFrom(doBindings(newProblem.getGiven(), new HashSet<String>(newProblem
									.getGiven().getVars()), InputUtil.getBindings(givenResult)));
							newGivenParts.add(InputUtil.revar(givenResult, newBinding.getArguments()));
						}
						Property findResult = mst.getFindResult();
						if (findResult != null) {
							newBinding.addBindingsFrom(doBindings(newProblem.getGoal(), new HashSet<String>(newProblem
									.getGiven().getVars()), InputUtil.getBindings(findResult)));
							newGoalParts.add(InputUtil.revar(findResult, newBinding.getArguments()));
						}

						binding = newBinding.getImmutable();
					}

					newProblem.getGiven().setProperty(InputUtil.andTogether(newGivenParts));
					newProblem.getGoal().setProperty(InputUtil.andTogether(newGoalParts));

					addProblemState(newProblem, problemState, mst, binding);
				}
		}
	}

	private static Binding doBindings(Problem problem, HashSet<String> usedVars, ArrayList<String> vars) {
		MutableBinding binding = new MutableBinding();
		for (String var : vars)
			for (char name = 'a'; name <= 'z'; name++) {
				String stName = name + "";
				if (!usedVars.contains(stName)) {
					binding.bind(var, stName);
					problem.getVars().add(stName);
					break;
				}
			}

		return binding.getImmutable();
	}

	private void addProblemState(Input newProblem, ProblemState problemState, MultistageTheorem multistageTheorem,
			Binding binding) {
		// Simplify the problem
		newProblem = TransformUtil.simplify(newProblem, new Chainer(theorems));

		if (TransformUtil.isSolved(newProblem.getGoal()))
			solved = true;

		// FIXME: DN: Have to canonicalize before adding to the
		// statelist
		if (!reachedProblemStates.contains(newProblem)) {
			System.out.println(newProblem);
			reachedProblemStates.add(newProblem);
			problemStates.add(new ProblemState(newProblem, problemState, multistageTheorem, binding));
		}
	}

	private void addVariableRemovalTheorems(Input problem, Chainer findChainer) {
		HashSet<String> unbound = InputUtil.getUnboundVariables(EcoreUtil.copy(problem.getGoal().getProperty()));
		for (String var : problem.getGoal().getVars())
			// If the variable is unused...
			if (!unbound.contains(var)) {
				MutableBinding binding = new MutableBinding();
				binding.bind(DirectReturn.VAR_NAME, var);
				findChainer.nextLevelTheorems.put(new DirectReturn(),
						new ArrayList<Binding>(Collections.singleton(binding.getImmutable())));
			}
	}

	public static void main(String[] args) {
		ArrayList<Theorem> theorems = TheoremParser.parseFiles();
		theorems.addAll(MultiTheoremParser.parseFiles());
		// Scanner s = new Scanner(System.in);
		// ProblemSolver solver = new
		// ProblemSolver(QuickParser.parseInput(s.nextLine()),
		// theorems.toArray(new Theorem[0]));
		// s.close();
		 String problemString =
		 "Given a,c st type_list(a) & child_type_int(a) & type_list(c) & child_type_int(c), Find b st child(a,b) & child(c,b) & even(b)";
//		 String problemString =
//		 "Given a st type_list(a) & child_type_int(a), Find b st child(a,b) & even(b)";
//		String problemString = "Given a,b st even(b) & type_list(a), Find b st child(a,b)";
		ProblemSolver solver = new ProblemSolver(QuickParser.parseInput(problemString),
				theorems.toArray(new Theorem[0]));
		ProblemState solution = solver.getSolution();
		StringBuffer output = new StringBuffer();
		if (solution == null)
			System.out.println("I couldn't solve your problem. You'll have to find a better robot :-(");
		else
			System.out.println("This algorithm should solve your problem :-)");

		System.out.println(problemString);
		while (solution != null) {
			for (int i = 0; i < output.length(); i++)
				if (output.charAt(i) == '\n')
					output.insert(i + 1, "\t");

			// Don't try to show pseudocode used to get from the given to the
			// first step.
			if (solution.parentState != null)
				output.insert(0, solution.rootTheoremBinding.revar(solution.rootTheorem.getPseudoCode()) + "\n");

			solution = solution.parentState;
		}
		System.out.println(output);
	}
}
