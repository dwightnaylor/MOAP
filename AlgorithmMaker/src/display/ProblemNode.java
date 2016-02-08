package display;

import algorithmMaker.util.SugarUtil;
import solver.*;

public class ProblemNode {
	/**
	 * Either a problemState or problemGroup
	 */
	final Object contents;

	public ProblemNode(ProblemState contents) {
		this.contents = contents;
	}

	public ProblemNode(ProblemGroup contents) {
		this.contents = contents;
	}

	private String stringCached;

	public String getDisplayString() {
		if (stringCached == null) {
			if (contents instanceof ProblemState) {
				ProblemState state = (ProblemState) contents;
				stringCached = state.getSolvingCost() + "," + state.getApproachCost() + ":::"
						+ SugarUtil.resugar(SugarUtil.convertToInput(state.problem)).toString().replace(";", ":::::");
			} else if (contents instanceof ProblemGroup) {
				stringCached = "";
			}
		}
		return stringCached;
	}
}
