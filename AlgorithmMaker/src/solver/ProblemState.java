package solver;

import inputHandling.TransformUtil;
import algorithmMaker.input.Input;
import bindings.Binding;
import theorems.MultistageTheorem;

public class ProblemState implements Comparable<ProblemState> {
	public Input problem;
	private String toStringSave;
	public ProblemState parentState;
	Binding rootTheoremBinding;
	public MultistageTheorem rootTheorem;

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
		return problem.getGoal().toString().length() - other.problem.getGoal().toString().length();
	}

	public static String getOutputString(ProblemState solution) {
		StringBuffer output = new StringBuffer();
		while (solution != null) {
			// Don't try to show pseudocode used to get from the given to the
			// first step.
			if (solution.parentState != null) {
				if (output.length() > 0) {
					output.insert(0, "\t");
					for (int i = 0; i < output.length(); i++)
						if (output.charAt(i) == '\n')
							output.insert(i + 1, "\t");
				}

				output.insert(0, solution.rootTheoremBinding.revar(solution.rootTheorem.getPseudoCode()) + "\n");
			}

			solution = solution.parentState;
		}
		return output.toString();
	}
}
