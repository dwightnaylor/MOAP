package theorems.multiTheorems;

import static algorithmMaker.QuickParser.parseProperty;

import algorithmMaker.input.Property;
import algorithmMaker.util.InputUtil;
import theorems.MultistageTheorem;

public class BruteForceTest extends MultistageTheorem {

	private static final String DESCRIPTION = "Children of an enumerable can be enumerated.";
	private static final String PSEUDOCODE = "foreach child <ny> of <x>";
	private static final Property GIVEN_REQUIREMENT = parseProperty("enumerable(x)");
	private static final Property GOAL_REQUIREMENT = parseProperty("child(x,y)");
	private static final Property GIVEN_RESULT = parseProperty("BOUND(ny) & child(x,ny)");
	private static final Property GOAL_RESULT = parseProperty(InputUtil.EQUAL + "(y,ny)");

	public BruteForceTest() {
		super(GIVEN_REQUIREMENT, GOAL_REQUIREMENT, GIVEN_RESULT, GOAL_RESULT, 10, DESCRIPTION, PSEUDOCODE);
		requireGoalTask(InputUtil.TEST);
	}
}
