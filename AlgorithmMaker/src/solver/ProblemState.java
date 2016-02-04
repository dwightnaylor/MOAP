package solver;

import static algorithmMaker.util.KernelUtil.canonicalize;

import java.util.*;

import algorithmMaker.QuickParser;
import algorithmMaker.util.InputUtil;
import inputHandling.TransformUtil;
import kernelLanguage.*;
import pseudocoders.LineCoder;
import runtimeAnalysis.RuntimeMerger;

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
			problem = problem.withGiven(problem.given.withProperty((KProperty) canonicalize(problem.given.property)));

		if (problem.goal != null)
			problem = problem.withGoal(problem.goal.withProperty((KProperty) canonicalize(problem.goal.property)));

		this.problem = problem;
	}

	@Override
	public String toString() {
		return "State(index:" + parentIndex + ",cost:" + getApproachCost() + "):" + problem;
	}

	@Override
	public int compareTo(ProblemState other) {
		return getApproachCost() - other.getApproachCost();
	}

	public ProblemGroup getSolutionGroup() {
		return childGroups.get(solutionIndex);
	}

	public ProblemGroup getBestChildState(boolean allowForMissingRuntimes) {
		int minCost = -1;
		ProblemGroup ret = null;
		for (ProblemGroup problemGroup : childGroups) {
			int curCost = problemGroup.getCost(allowForMissingRuntimes);
			if (curCost >= 0 && (minCost < 0 || curCost < minCost)) {
				minCost = curCost;
				ret = problemGroup;
			}
		}
		return ret;
	}

	/**
	 * This is the runtime it takes to get as deep as this problem state in the program. Namely, if this is the top of
	 * the solution tree, then this function would return zero. If it's the bottom, it will return a large number.
	 * Unlike with solving cost, this cost cannot be evaluated with missing runtimes. If a runtime required for
	 * calculation is missing, the approach cost is -1
	 */
	public int getApproachCost() {
		if (this.approachCostCache == -1) {
			ProblemState state = this;
			int currentNodeCost = 1;
			while (state != null) {
				int[] subCosts = new int[state.parentGroup.childStates.size()];
				for (int i = 0; i < state.parentIndex; i++)
					subCosts[i] = Math.max(1, state.parentGroup.childStates.get(i).getCost(false));

				subCosts[state.parentIndex] = currentNodeCost;
				if (state.parentGroup.parentState != null)
					currentNodeCost = state.parentGroup.rootTheorem.runtimeMerger.mergeRuntimes(subCosts);
				else
					currentNodeCost = new RuntimeMerger() {
						@Override
						public int mergeRuntimes(int... runtimes) {
							int ret = 0;
							for (int rt : runtimes)
								ret += rt;
							return ret;
						}
					}.mergeRuntimes(subCosts);

				state = state.parentGroup.parentState;
			}
			approachCostCache = currentNodeCost;
		}
		return approachCostCache;
	}

	/**
	 * This is the solving cost, namely how long it will take the child nodes of this problem state to be solved, as
	 * well as how long it will take to integrate those solutions. For a problem state, this is a function of the best
	 * subgroup solving time.
	 * 
	 * @param allowForMissingRuntimes
	 *            This determines whether or not a cost should be calculated even when some runtime areas are missing.
	 *            This means, for example, if we had the solution which did not have its last step figured out, we would
	 *            be able to calculate the runtime assuming that missing step was free.
	 * @return
	 */
	public int getCost(boolean allowForMissingRuntimes) {
		ProblemGroup bestChild = getBestChildState(allowForMissingRuntimes);
		return bestChild == null ? -1 : bestChild.getCost(allowForMissingRuntimes);
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
