package solver;

import java.util.*;

import bindings.*;
import theorems.MultistageTheorem;

public class ProblemGroup {
	public ProblemState parentState;
	public MultistageTheorem rootTheorem;
	public Binding rootTheoremBinding;
	/**
	 * All of the child states that must be solved for this group to be solved.
	 */
	public List<ProblemState> childStates;
	public int parentIndex;

	public ProblemGroup(ProblemState parentState, MultistageTheorem rootTheorem, Binding rootTheoremBinding,
			List<ProblemState> childStates) {
		this.parentState = parentState;
		if (parentState != null) {
			this.parentIndex = parentState.childGroups.size();
			parentState.childGroups.add(this);
		}
		this.rootTheorem = rootTheorem;
		this.rootTheoremBinding = rootTheoremBinding;
		this.childStates = childStates;
		for (int i = 0; i < childStates.size(); i++) {
			childStates.get(i).parentGroup = this;
			childStates.get(i).parentIndex = i;
		}
	}

	public ProblemGroup(ProblemState parentState, MultistageTheorem rootTheorem, Binding rootTheoremBinding,
			ProblemState... childStates) {
		this(parentState, rootTheorem, rootTheoremBinding, Arrays.asList(childStates));
	}

	public ProblemGroup getHeadNode() {
		ProblemGroup ret = this;
		while (ret.parentState != null) {
			ret = ret.parentState.parentGroup;
		}
		return ret;
	}

	public void printSolutionContents(int numTabs) {
		if (childStates.size() > 1) {
			for (int i = 0; i < numTabs; i++)
				System.out.print("\t");

			System.out.println("Problem Group of size " + childStates.size());
			for (ProblemState problemState : childStates) {
				for (int i = 0; i < numTabs; i++)
					System.out.print("\t");

				System.out.println("\t" + problemState);
				if (problemState.solutionIndex != -1)
					problemState.getSolutionGroup().printSolutionContents(numTabs + 2);
			}
		} else {
			ProblemState child = childStates.get(0);

			for (int i = 0; i < numTabs; i++)
				System.out.print("\t");

			System.out.println(child);

			if (child.solutionIndex != -1)
				child.getSolutionGroup().printSolutionContents(numTabs + 1);
		}
	}

	@Override
	public String toString() {
		return "Group of " + childStates.size() + ":" + childStates;
	}

	/**
	 * This is the solving cost, namely how long it will take the child nodes of this problem state to be solved, as
	 * well as how long it will take to integrate those solutions. For a problem group, this is a function of all of the
	 * solving times of all of the sub problems.
	 */
	public int getSolvingCost() {
		int[] subCosts = new int[childStates.size()];
		for (int i = 0; i < childStates.size(); i++)
			subCosts[i] = childStates.get(i).getSolvingCost();

		return rootTheorem.runtimeMerger.mergeRuntimes(subCosts);
	}
}
