package theorems;

import kernelLanguage.*;
import pseudocoders.Pseudocoder;

public class MultistageTheorem extends KTheorem {

	private final KProperty goalRequirement;
	private final KProperty givenResult;
	private final KProperty goalResult;
	private final Pseudocoder pseudocoder;

	public MultistageTheorem(KProperty givenRequirement, KProperty goalRequirement, KProperty givenResult, int cost,
			String description, Pseudocoder pseudocoder) {
		this(givenRequirement, goalRequirement, givenResult, null, cost, description, pseudocoder);
	}

	public MultistageTheorem(KProperty givenRequirement, KProperty goalRequirement, KProperty givenResult,
			KProperty goalResult, int cost, String description, Pseudocoder pseudocoder) {
		super(givenRequirement, null, cost, description);
		this.goalRequirement = goalRequirement;
		this.givenResult = givenResult;
		this.goalResult = goalResult;
		this.pseudocoder = pseudocoder;
	}

	public MultistageTheorem copy() {
		return new MultistageTheorem(requirement, goalRequirement, givenResult, goalResult, cost, description,
				getPseudocoder());
	}

	public KProperty getGoalRequirement() {
		return goalRequirement;
	}

	public KProperty getGivenResult() {
		return givenResult;
	}

	public KProperty getGoalResult() {
		return goalResult;
	}

	public Pseudocoder getPseudocoder() {
		return pseudocoder;
	}
}
