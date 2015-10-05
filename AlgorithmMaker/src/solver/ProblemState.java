package solver;

import java.util.Collection;

import algorithmMaker.input.Input;
import theorems.MultistageTheorem;

public class ProblemState {
	public Input problem;
	ProblemState parentState;
	Collection<MultistageTheorem> requisiteTheorems;

	public ProblemState(Input problem, ProblemState parentState) {
		this(problem, parentState, null);
	}

	public ProblemState(Input problem, ProblemState parentState, Collection<MultistageTheorem> requisiteTheorems) {
		this.problem = problem;
		this.parentState = parentState;
		this.requisiteTheorems = requisiteTheorems;
	}
}
