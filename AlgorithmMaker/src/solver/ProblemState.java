package solver;

import java.util.Collection;

import bindings.Binding;
import algorithmMaker.input.Input;
import theorems.MultistageTheorem;

public class ProblemState {
	public Input problem;
	ProblemState parentState;
	Collection<MultistageTheorem> requisiteTheorems;
	Binding binding;

	public ProblemState(Input problem, ProblemState parentState) {
		this(problem, parentState, null, new Binding());
	}

	public ProblemState(Input problem, ProblemState parentState, Collection<MultistageTheorem> requisiteTheorems,
			Binding binding) {
		this.problem = problem;
		this.parentState = parentState;
		this.requisiteTheorems = requisiteTheorems;
		this.binding = binding;
	}
}
