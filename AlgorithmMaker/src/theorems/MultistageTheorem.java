package theorems;

import algorithmMaker.input.Property;

public class MultistageTheorem extends QuickTheorem {

	private final Property findRequirement;

	public MultistageTheorem(Property givenRequirement, Property findRequirement, int cost, String description) {
		this(givenRequirement, findRequirement, findRequirement, cost, description, QuickTheorem.NO_PSEUDOCODE_GIVEN);
	}

	public MultistageTheorem(Property givenRequirement, Property findRequirement, Property result, int cost,
			String description) {
		this(givenRequirement, findRequirement, result, cost, description, QuickTheorem.NO_PSEUDOCODE_GIVEN);
	}

	public MultistageTheorem(Property givenRequirement, Property findRequirement, Property result, int cost,
			String description, String pseudocode) {
		super(givenRequirement, result, cost, description, pseudocode);
		this.findRequirement = findRequirement;
	}

	public Property getFindRequirement() {
		return findRequirement;
	}
}
