package theorems.multiTheorems;

import static algorithmMaker.QuickParser.parseProperty;
import algorithmMaker.input.Property;
import algorithmMaker.util.InputUtil;
import theorems.MultistageTheorem;

public class EqualityTesting extends MultistageTheorem {

	private static final String DESCRIPTION = "We can check if two things are equal.";
	private static final String PSEUDOCODE = "if <x> == <y>";
	private static final Property GIVEN_REQUIREMENT = parseProperty(InputUtil.BOUND + "(x) & " + InputUtil.BOUND
			+ "(y)");
	private static final Property GOAL_REQUIREMENT = parseProperty(InputUtil.EQUAL + "(x,y)");

	public EqualityTesting() {
		super(GIVEN_REQUIREMENT, GOAL_REQUIREMENT, GOAL_REQUIREMENT, null, 1, DESCRIPTION, PSEUDOCODE);
		requireGoalTask(InputUtil.TEST);
	}
}
