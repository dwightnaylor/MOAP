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
}
