package theorems.multiTheorems;

import static algorithmMaker.QuickParser.parseProperty;
import algorithmMaker.input.Property;
import algorithmMaker.util.InputUtil;
import theorems.MultistageTheorem;

public class Testing extends MultistageTheorem {

	private static final String DESCRIPTION = "We can check if a number is even.";
	private static final String PSEUDOCODE = "if <x> % 2 == 0";
	private static final Property GIVEN_REQUIREMENT = parseProperty("BOUND(x)");
	private static final Property GOAL_REQUIREMENT = parseProperty("even(x)");

	public Testing() {
		super(GIVEN_REQUIREMENT, GOAL_REQUIREMENT, GOAL_REQUIREMENT, null, 1, DESCRIPTION, PSEUDOCODE);
		requireGoalTask(InputUtil.TEST);
	}
}
