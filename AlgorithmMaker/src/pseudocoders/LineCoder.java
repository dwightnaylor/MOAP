package pseudocoders;

import bindings.Binding;
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
		for (String line : lines)
			if (line == null)
				throw new IllegalArgumentException("Cannot have null lines to a line coder.");
	}

	@Override
	public void appendPseudocode(StringBuffer builder, int numTabs, ProblemState problemState, Pseudocoder returnCoder,
			Binding binding) {
		for (String line : lines) {
			Pseudocoder.appendTabs(builder, numTabs);
			builder.append((problemState == null ? (binding == null ? line : binding.revar(line))
					: problemState.rootTheoremBinding.revar(line)) + "\n");
		}
		if (problemState != null)
			if (problemState.childStates != null && problemState.childStates.size() > 0) {
				ProblemState childState = problemState.childStates.get(0);
				childState.rootTheorem.getPseudocoder().appendPseudocode(builder, numTabs + (tabChildren ? 1 : 0),
						childState, returnCoder, null);
			} else {
				returnCoder.appendPseudocode(builder, numTabs + (tabChildren ? 1 : 0), null, null, null);
			}
	}
}
