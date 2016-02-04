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
			if (contents instanceof ProblemState)
				stringCached = SugarUtil.resugar(SugarUtil.convertToInput(((ProblemState) contents).problem)).toString()
						.replace(";", ":::::");
			else if (contents instanceof ProblemGroup) {
				ProblemGroup group = (ProblemGroup) contents;
				stringCached = "GROUP of size " + group.childStates.size();
			}
		}
		return stringCached;
	}
}
