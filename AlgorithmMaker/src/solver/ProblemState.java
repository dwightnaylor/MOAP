package solver;

import static algorithmMaker.util.KernelUtil.canonicalizeOrder;

import java.util.*;

import algorithmMaker.QuickParser;
import algorithmMaker.util.InputUtil;
import inputHandling.TransformUtil;
import kernelLanguage.*;
import pseudocoders.LineCoder;

public class ProblemState implements Comparable<ProblemState> {
	/**
	 * All of the child states that can be used to solve this problem.
	 */
	public List<ProblemGroup> childGroups = new ArrayList<ProblemGroup>();
	public KInput problem;
	public ProblemGroup parentGroup;
	public int parentIndex;
	private int approachCostCache = -1;

	public int solutionIndex = -1;

	public ProblemState(KInput problem, KTheorem[] theorems) {
		// Simplify the problem
		problem = TransformUtil.removeGivenFromGoal(problem, new Chainer(theorems));

		if (problem.given.property != null)
			problem = problem.withGiven(problem.given.withProperty((KProperty) canonicalizeOrder(problem.given.property)));

		if (problem.goal != null)
			problem = problem.withGoal(problem.goal.withProperty((KProperty) canonicalizeOrder(problem.goal.property)));

		this.problem = problem;
	}

	@Override
	public String toString() {
		return "State(index:" + parentIndex + ",AC:" + getApproachCost() + ",SC:" + getSolvingCost() + "):" + problem;
	}

	@Override
	public int compareTo(ProblemState other) {
		return getApproachCost() - other.getApproachCost();
	}

	public ProblemGroup getSolutionGroup() {
		return childGroups.get(solutionIndex);
	}

	/**
	 * This is the runtime it takes to get as deep as this problem state in the program. Namely, if this is the top of
	 * the solution tree, then this function would return zero. If it's the bottom, it will return a large number.
	 * Unlike with solving cost, this cost cannot be evaluated with missing runtimes. If a runtime required for
	 * calculation is missing, the approach cost is -1
	 */
	public int getApproachCost() {
		if (this.approachCostCache == -1) {
			// The way we calculate approach cost is to walk up the required parts of the solution until we get to the
			// head, accumulating info as we go up.
			ProblemState state = this;
			int currentCost = 2;
			while (state != null) {
				int[] fakeSubStates = new int[state.parentGroup.childStates.size()];
				for (int i = 0; i < state.parentIndex; i++)
					fakeSubStates[i] = state.parentGroup.childStates.get(i).getSolvingCost();
				fakeSubStates[state.parentIndex] = currentCost;
				for (int i = state.parentIndex + 1; i < fakeSubStates.length; i++)
					fakeSubStates[i] = 2;// Minimum useful value for + and *...

				if (state.parentGroup.rootTheorem != null)
					currentCost = state.parentGroup.rootTheorem.runtimeMerger.mergeRuntimes(fakeSubStates);
				else
					currentCost = 2;

				state = state.parentGroup.parentState;
			}

			this.approachCostCache = currentCost;
		}
		return approachCostCache;
	}

	/**
	 * This is the solving cost, namely how long it will take the child nodes of this problem state to be solved, as
	 * well as how long it will take to integrate those solutions. For a problem state, this is a function of the best
	 * subgroup solving time.
	 * 
	 * @return
	 */
	public int getSolvingCost() {
		return solutionIndex == -1 ? 2 : getSolutionGroup().getSolvingCost();
	}

	public boolean isSolvable() {
		HashSet<KInput> problems = new HashSet<KInput>();
		ProblemState state = parentGroup.parentState;
		while (state != null) {
			problems.add(state.problem);
			state = state.parentGroup.parentState;
		}
		return !problems.contains(problem);
	}

	public static String getOutputString(ProblemGroup solutionHead, String originalProblem) {
		StringBuffer output = new StringBuffer();
		solutionHead.rootTheorem.getPseudocoder().appendPseudocode(output, 0, solutionHead, new LineCoder("return "
				+ InputUtil.convertToStrings(QuickParser.parseInput(originalProblem, false).getGoal().getVars())));
		return output.toString();
	}
}
