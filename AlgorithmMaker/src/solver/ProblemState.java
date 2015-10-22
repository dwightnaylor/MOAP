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

	@Override
	public int compareTo(ProblemState other) {
		return problem.getGoal().toString().compareTo(other.problem.getGoal().toString());
	}
	
	public static String getOutputString(ProblemState solution) {
		StringBuffer output = new StringBuffer();
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
		return output.toString();
	}
}
