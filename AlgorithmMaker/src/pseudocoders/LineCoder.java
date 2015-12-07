package pseudocoders;

import solver.ProblemState;

public class LineCoder implements Pseudocoder {

	private final String[] lines;
	private final boolean tabChildren;

	public LineCoder(String... lines) {
		this(false, lines);
	}

	public LineCoder(boolean tabChildren, String... lines) {
		this.lines = lines;
		this.tabChildren = tabChildren;
	}

	@Override
	public void appendPseudocode(StringBuffer builder, int numTabs, ProblemState problemState, String returnString) {
		for (String line : lines) {
			Pseudocoder.appendTabs(builder, numTabs);
			builder.append((problemState == null ? line : problemState.rootTheoremBinding.revar(line)) + "\n");
		}
		if (problemState != null)
			if (problemState.childStates != null && problemState.childStates.size() > 0) {
				ProblemState childState = problemState.childStates.get(0);
				childState.rootTheorem.getPseudocoder().appendPseudocode(builder, numTabs + (tabChildren ? 1 : 0),
						childState, returnString);
			} else {
				new LineCoder(returnString).appendPseudocode(builder, numTabs + (tabChildren ? 1 : 0), null, null);
			}
	}
}
