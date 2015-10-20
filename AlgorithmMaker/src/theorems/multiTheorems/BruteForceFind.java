package theorems.multiTheorems;

import static algorithmMaker.QuickParser.parseProperty;

import algorithmMaker.input.Property;
import algorithmMaker.util.InputUtil;
import theorems.MultistageTheorem;

public class BruteForceFind extends MultistageTheorem {

	private static final String DESCRIPTION = "Children of an enumerable can be enumerated.";
	private static final String PSEUDOCODE = "foreach child <y> of <x>";
	private static final Property GIVEN_REQUIREMENT = parseProperty("enumerable(x)");
	private static final Property GOAL_REQUIREMENT = parseProperty("child(x,y)");
	private static final Property GIVEN_RESULT = parseProperty("child(x,y)");

	public BruteForceFind() {
		super(GIVEN_REQUIREMENT, GOAL_REQUIREMENT, GIVEN_RESULT, null, 10, DESCRIPTION, PSEUDOCODE);
		requireGoalTask(InputUtil.FIND);
		setNewGoalTask(InputUtil.TEST);
	}
}
