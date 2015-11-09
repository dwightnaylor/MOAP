package solver;

import algorithmMaker.input.Input;
import bindings.Binding;
import theorems.MultistageTheorem;

public class ProblemState implements Comparable<ProblemState> {
	public Input problem;
	ProblemState parentState;
	Binding rootTheoremBinding;
	MultistageTheorem rootTheorem;

	public ProblemState(Input problem, ProblemState parentState, MultistageTheorem multistageTheorem, Binding binding) {
		this.problem = problem;
		this.parentState = parentState;
		this.rootTheorem = multistageTheorem;
		this.rootTheoremBinding = binding;
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
		return problem.getGoal().toString().compareTo(other.problem.getGoal().toString());
	}

	public static String getOutputString(ProblemState solution) {
		System.out.println("===============");
		StringBuffer output = new StringBuffer();
		while (solution != null) {
			// Don't try to show pseudocode used to get from the given to the
			// first step.
			if (solution.parentState != null) {
				if (output.length() > 0) {
					System.out.println("ORIGINAL:");
					System.out.println(output);
					output.insert(0, "\t");
					for (int i = 0; i < output.length(); i++)
						if (output.charAt(i) == '\n')
							output.insert(i + 1, "\t");
					System.out.println("TABBED:");
					System.out.println(output);
				}

				String code = solution.rootTheoremBinding.revar(solution.rootTheorem.getPseudoCode());
				System.out.println("ADDING::::::::::");
				System.out.println(code);
				System.out.println("TO:");
				System.out.println(output);
				output.insert(0, code + "\n");
			}

			solution = solution.parentState;
		}
		return output.toString();
	}
}
