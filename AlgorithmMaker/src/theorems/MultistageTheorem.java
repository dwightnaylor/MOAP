package theorems;

import algorithmMaker.input.Property;

public class MultistageTheorem extends QuickTheorem {

	private final Property findRequirement;

	public MultistageTheorem(Property givenRequirement, Property findRequirement, Property result, int cost,
			String description) {
		super(givenRequirement, result, cost, description);
		this.findRequirement = findRequirement;
	}

	public Property getFindRequirement() {
		return findRequirement;
	}
}
