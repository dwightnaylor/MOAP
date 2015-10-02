package solver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.util.EcoreUtil;

import algorithmMaker.input.Input;
import algorithmMaker.input.Property;
import algorithmMaker.input.Theorem;
import algorithmMaker.util.InputUtil;
import bindings.Binding;
import inputHandling.TransformUtil;
import theorems.MultistageTheorem;

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
	public ArrayList<Input> problemStates = new ArrayList<Input>();

	private final Theorem[] theorems;

	public ProblemSolver(Input problem, Theorem... theorems) {
		this.theorems = theorems;
		problemStates.add(problem);
	}

	public void branch() {
		Input problem = problemStates.remove(0);

		Chainer givenChainer = new Chainer(theorems);
		givenChainer.chain(problem.getGiven().getProperty(), TransformUtil.GIVEN);

		Chainer findChainer = new Chainer(false, theorems);
		findChainer.previousLevelTheorems = givenChainer.nextLevelTheorems;
		findChainer.chain(problem.getGoal().getProperty(), TransformUtil.GOAL);

		if (findChainer.nextLevelTheorems.size() > 0) {
			Input newProblem = (Input) new EcoreUtil.Copier().copy(problem);
			ArrayList<Property> newGiven = new ArrayList<Property>();
			newGiven.add(newProblem.getGiven().getProperty());
			for (Entry<MultistageTheorem, ArrayList<Binding>> entry : findChainer.nextLevelTheorems.entrySet())
				for (Binding binding : entry.getValue())
					newGiven.add(InputUtil.revar(entry.getKey().getResult(), binding.getArguments()));

			newProblem.getGiven().setProperty(InputUtil.andTogether(newGiven));

			// FIXME: DN: Have to canonicalize before adding to the
			// statelist
			problemStates.add(TransformUtil.simplify(newProblem, new Chainer(theorems)));
		}
	}
}
