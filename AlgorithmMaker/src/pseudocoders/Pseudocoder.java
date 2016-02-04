package pseudocoders;

import solver.ProblemGroup;

public interface Pseudocoder {
	/**
	 * Adds this coder's content to the given pseudocode
	 * 
	 * @param currentPseudocode
	 *            The existing pseudocode block.
	 * @param numTabs
	 *            The number of tabs to put before any code generated by this
	 *            coder.
	 * @param problemGroup
	 *            The problem group that was present before this pseudocode is
	 *            applied.
	 * @param returnCoder
	 *            The coder to use when this pseudocoder is "done".
	 * @param binding
	 *            The binding apply to the code generated by this pseudocoder.
	 * @return How many tabs "deep" this solution goes. Used for problem nesting.
	 */
	public int appendPseudocode(StringBuffer currentPseudocode, int numTabs, ProblemGroup problemGroup,
			Pseudocoder returnCoder);

	public static void appendTabs(StringBuffer builder, int numTabs) {
		for (int i = 0; i < numTabs; i++)
			builder.append("\t");
	}
}
