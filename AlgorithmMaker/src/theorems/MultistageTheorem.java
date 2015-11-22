package theorems;

import algorithmMaker.input.Property;

public class MultistageTheorem extends QuickTheorem {

	private final Property findRequirement;
	private final Property givenResult;
	private final Property findResult;
	private String requiredGoalTask;
	public String newGoalTask;

	public MultistageTheorem(Property givenRequirement, Property findRequirement, Property givenResult, int cost,
			String description, String pseudocode) {
		this(givenRequirement, findRequirement, givenResult, null, cost, description, pseudocode);
	}

	public MultistageTheorem(Property givenRequirement, Property findRequirement, Property givenResult,
			Property findResult, int cost, String description, String pseudocode) {
		super(givenRequirement, null, cost, description, pseudocode);
		this.findRequirement = findRequirement;
		this.givenResult = givenResult;
		this.findResult = findResult;
	}

	public MultistageTheorem copy() {
		return new MultistageTheorem(this.getRequirement(), this.findRequirement, this.givenResult, this.findResult,
				this.getCost(), this.getDescription(), this.getPseudoCode());
	}

	public Property getFindRequirement() {
		return findRequirement;
	}

	public Property getGivenResult() {
		return givenResult;
	}

	public Property getFindResult() {
		return findResult;
	}

	public String getRequiredGoalTask() {
		return requiredGoalTask;
	}

	public void requireGoalTask(String requiredGoalTask) {
		this.requiredGoalTask = requiredGoalTask;
	}

	public void setNewGoalTask(String task) {
		this.newGoalTask = task;
	}
}
