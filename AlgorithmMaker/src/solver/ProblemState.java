package solver;

import java.util.*;

import kernelLanguage.KInput;
import pseudocoders.LineCoder;
import theorems.MultistageTheorem;
import algorithmMaker.util.SugarUtil;
import bindings.Binding;

public class ProblemState implements Comparable<ProblemState> {
	public final int cost;
	public KInput problem;
	private String toStringSave;
	public ProblemState parentState;
	public Binding rootTheoremBinding;
	public MultistageTheorem rootTheorem;
	public List<ProblemState> childStates;

	public ProblemState(KInput problem, ProblemState parentState, MultistageTheorem multistageTheorem,
			Binding binding) {
		cost = (parentState == null ? 0 : parentState.cost) + (multistageTheorem == null ? 0 : multistageTheorem.cost);
		this.problem = problem;
		this.parentState = parentState;
		this.rootTheorem = multistageTheorem;
		this.rootTheoremBinding = binding;
	}

	public String toString() {
		if (toStringSave == null)
			toStringSave = SugarUtil.resugar(SugarUtil.convertToInput(problem)).toString();

		return toStringSave;
	}

	public int getDepth() {
		int ret = 0;
		ProblemState cur = this;
		while (cur.parentState != null) {
			ret++;
			cur = cur.parentState;
		}
		return ret;
	}

	@Override
	public int compareTo(ProblemState other) {
		return cost - other.cost;
	}

	public static String getOutputString(ProblemState solution) {
		ProblemState head = solution;
		while (head.parentState != null) {
			head.parentState.childStates = Collections.singletonList(head);
			head = head.parentState;
		}
		StringBuffer output = new StringBuffer();
		head.childStates.get(0).rootTheorem.getPseudocoder().appendPseudocode(output, 0, head.childStates.get(0),
				new LineCoder("return " + head.problem.goal.vars), head.rootTheoremBinding);
		return output.toString();
	}
}
