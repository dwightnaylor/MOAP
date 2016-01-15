package pseudocoders;

import java.util.ArrayList;

import bindings.Binding;
import solver.ProblemState;

public class SequentialCoder implements Pseudocoder {

	private ArrayList<Pseudocoder> coders;
	private ArrayList<Binding> bindings;

	public SequentialCoder(ArrayList<Pseudocoder> coders, ArrayList<Binding> bindings) {
		this.coders = coders;
		this.bindings = bindings;
	}

	@Override
	public void appendPseudocode(StringBuffer builder, int numTabs, ProblemState problemState, Pseudocoder returnCoder,
			Binding binding) {
		for (int i = 0; i < coders.size(); i++) {
			coders.get(i).appendPseudocode(builder, numTabs, null, null, bindings.get(i));
		}
	}
}
