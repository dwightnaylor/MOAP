package solver;

import inputHandling.TransformUtil;

import java.util.Collections;
import java.util.List;

import theorems.MultistageTheorem;
import algorithmMaker.input.Input;
import algorithmMaker.util.InputUtil;
import bindings.Binding;

public class ProblemState implements Comparable<ProblemState> {
	public Input problem;
	private String toStringSave;
	public ProblemState parentState;
	public Binding rootTheoremBinding;
	public MultistageTheorem rootTheorem;
	public List<ProblemState> childStates;

	public ProblemState(Input problem, ProblemState parentState, MultistageTheorem multistageTheorem, Binding binding) {
		this.problem = problem;
		this.parentState = parentState;
		this.rootTheorem = multistageTheorem;
		this.rootTheoremBinding = binding;
	}

	public String toString() {
		if (toStringSave == null)
			toStringSave = TransformUtil.makePretty(problem).toString();

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
		if (problem.getGoal() == null && other.problem.getGoal() == null)
			return 0;

		if (problem.getGoal() == null)
			return 1;

		if (other.problem.getGoal() == null)
			return -1;

		return problem.getGoal().toString().length() - other.problem.getGoal().toString().length();
	}

	public static String getOutputString(ProblemState solution) {
		ProblemState head = solution;
		while (head.parentState != null) {
			head.parentState.childStates = Collections.singletonList(head);
			head = head.parentState;
		}
		StringBuffer output = new StringBuffer();
		// FIXME: DN : SERIOUSLY THIS IS DISGUSTING CHANGE IT ASAP
		head.childStates.get(0).rootTheorem.getPseudocoder().appendPseudocode(output, 0, head.childStates.get(0),
				"return " + InputUtil.getDeclaredVars(TransformUtil.makePretty(head.problem).getGoal()));
		return output.toString();
	}
}
