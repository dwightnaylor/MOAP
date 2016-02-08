package theorems;

import kernelLanguage.*;
import pseudocoders.*;
import runtimeAnalysis.*;

public class MultistageTheorem extends KTheorem {

	public static final MultistageTheorem GIVEN_MULTI = new MultistageTheorem(null, null, null, r -> r[0],
			"GIVEN (multi)", new LineCoder(LineCoder.EXIT_STRING + "0"));

	private final KProperty goalRequirement;
	private final KProperty givenResult;
	private final KProperty goalResult;
	private final Pseudocoder pseudocoder;
	public RuntimeMerger runtimeMerger;

	public MultistageTheorem(KProperty givenRequirement, KProperty goalRequirement, KProperty givenResult,
			RuntimeMerger runtimeMerger, String description, Pseudocoder pseudocoder) {
		this(givenRequirement, goalRequirement, givenResult, null, runtimeMerger, description, pseudocoder);
	}

	public MultistageTheorem(KProperty givenRequirement, KProperty goalRequirement, KProperty givenResult,
			KProperty goalResult, RuntimeMerger runtimeMerger, String description, Pseudocoder pseudocoder) {
		super(givenRequirement, null, 0, description);
		// TODO: Rework standard theorem's cost
		this.goalRequirement = goalRequirement;
		this.givenResult = givenResult;
		this.goalResult = goalResult;
		this.runtimeMerger = runtimeMerger;
		this.pseudocoder = pseudocoder;
	}

	public MultistageTheorem copy() {
		return new MultistageTheorem(requirement, goalRequirement, givenResult, goalResult, runtimeMerger, description,
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
