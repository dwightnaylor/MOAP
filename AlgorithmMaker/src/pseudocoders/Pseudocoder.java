package pseudocoders;

import bindings.Binding;
import solver.ProblemState;

public interface Pseudocoder {
	public void appendPseudocode(StringBuffer builder, int numTabs, ProblemState problemState, Pseudocoder returnCoder,
			Binding binding);

	public static void appendTabs(StringBuffer builder, int numTabs) {
		for (int i = 0; i < numTabs; i++)
			builder.append("\t");
	}

	public static Pseudocoder[] getReducedSubCoders(Pseudocoder[] subCoders) {
		Pseudocoder[] ret = new Pseudocoder[subCoders.length - 1];
		System.arraycopy(subCoders, 1, ret, 0, ret.length);
		return ret;
	}
}
