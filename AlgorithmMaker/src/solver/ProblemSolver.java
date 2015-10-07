package solver;

import inputHandling.MultiTheoremParser;
import inputHandling.TheoremParser;
import inputHandling.TransformUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.util.EcoreUtil;

import theorems.MultistageTheorem;
import algorithmMaker.QuickParser;
import algorithmMaker.input.Input;
import algorithmMaker.input.Property;
import algorithmMaker.input.Theorem;
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
	public ArrayList<ProblemState> problemStates = new ArrayList<ProblemState>();

	boolean solved = false;

	private final Theorem[] theorems;

	public ProblemSolver(Input problem, Theorem... theorems) {
		this.theorems = theorems;
		addProblemState(problem, null, Collections.singleton(TransformUtil.GIVEN_PROBLEM), new Binding());
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
		givenChainer.chain(problem.getGiven().getProperty(), TransformUtil.GIVEN);

		Chainer findChainer = new Chainer(false, theorems);
		findChainer.previousLevelTheorems = givenChainer.nextLevelTheorems;
		findChainer.chain(problem.getGoal().getProperty(), TransformUtil.GOAL);

		if (findChainer.nextLevelTheorems.size() > 0) {
			Input newProblem = (Input) new EcoreUtil.Copier().copy(problem);

			// Make the new given (just add in all the multi-theorem results)
			MutableBinding completeBinding = new MutableBinding();
			ArrayList<Property> newGiven = new ArrayList<Property>();
			newGiven.add(newProblem.getGiven().getProperty());
			for (Entry<MultistageTheorem, ArrayList<Binding>> entry : findChainer.nextLevelTheorems.entrySet())
				for (Binding binding : entry.getValue()) {
					if (!completeBinding.canHaveAdditionalBindings(binding))
						throw new UnsupportedOperationException(
								"Can't have conflicting bindings. Assuming this never happens for now.");

					completeBinding.addBindingsFrom(binding);

					newGiven.add(InputUtil.revar(entry.getKey().getResult(), binding.getArguments()));
				}

			newProblem.getGiven().setProperty(InputUtil.andTogether(newGiven));

			addProblemState(newProblem, problemState, findChainer.nextLevelTheorems.keySet(),
					completeBinding.getImmutable());
		}
	}

	private void addProblemState(Input newProblem, ProblemState problemState,
			Collection<MultistageTheorem> prerequisites, Binding binding) {
		// Simplify the problem
		newProblem = TransformUtil.simplify(newProblem, new Chainer(theorems));

		if (TransformUtil.isSolved(newProblem.getGoal()))
			solved = true;

		// FIXME: DN: Have to canonicalize before adding to the
		// statelist
		if (!reachedProblemStates.contains(newProblem)) {
			reachedProblemStates.add(newProblem);
			problemStates.add(new ProblemState(newProblem, problemState, prerequisites, binding));
		}
	}

	public static void main(String[] args) {
		ArrayList<Theorem> theorems = TheoremParser.parseFiles();
		theorems.addAll(MultiTheoremParser.parseFiles());
		Scanner s = new Scanner(System.in);
		ProblemSolver solver = new ProblemSolver(QuickParser.parseInput(s.nextLine()), theorems.toArray(new Theorem[0]));
		s.close();
		ProblemState solution = solver.getSolution();
		StringBuffer output = new StringBuffer();
		System.out.println("This algorithm should solve your problem:");
		while (solution != null) {
			for (int i = 0; i < output.length(); i++)
				if (output.charAt(i) == '\n')
					output.insert(i + 1, "\t");

			if (TransformUtil.isSolved(solution.problem.getGoal()))
				output.insert(0, "return " + solution.binding.getBindingString() + "\n");

			if (solution.parentState != null)
				for (MultistageTheorem mst : solution.requisiteTheorems)
					output.insert(0, solution.binding.revar(mst.getPseudoCode()) + "\n");

			solution = solution.parentState;
		}
		System.out.println(output);
	}
}
