package solver;

import algorithmMaker.input.Input;
import bindings.Binding;
import theorems.MultistageTheorem;

public class ProblemState {
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
	// Hashtable<MultistageTheorem, ArrayList<Binding>> bindings;
	//
	// public ProblemState(Input problem, ProblemState parentState,
	// Hashtable<MultistageTheorem, ArrayList<Binding>> bindings) {
	// this.problem = problem;
	// this.parentState = parentState;
	// this.bindings = bindings;
	// }
}
