package theorems;

import static kernelLanguage.KernelFactory.*;

import java.util.*;

import algorithmMaker.util.KernelUtil;
import kernelLanguage.*;
import pseudocoders.*;
import runtimeAnalysis.*;

public class MultistageTheorem {

	public static final MultistageTheorem GIVEN_MULTI = new MultistageTheorem(null, null, null, null, r -> r[0],
			"GIVEN (multi)", new LineCoder(LineCoder.EXIT_STRING + "0"));

	public static final String TRANSFER = "__TRANSFER_";
	public static final String COMPLETION = "__COMPLETION_";

	private final KProperty givenRequirement;
	private final KProperty goalRequirement;
	private final KProperty givenResult;
	private final KProperty goalResult;
	private final Pseudocoder pseudocoder;
	private final String description;

	/**
	 * A unique ID given to each Multistage theorem so that its theorems within chainers are properly connected to
	 * one-another.
	 */
	private final int ID;
	public RuntimeMerger runtimeMerger;

	private static ArrayList<MultistageTheorem> MST_LIST;

	public MultistageTheorem(KProperty givenRequirement, KProperty goalRequirement, KProperty givenResult,
			KProperty goalResult, RuntimeMerger runtimeMerger, String description, Pseudocoder pseudocoder) {
		this.givenRequirement = givenRequirement;
		this.goalRequirement = goalRequirement;
		this.givenResult = givenResult;
		this.goalResult = goalResult;
		this.runtimeMerger = runtimeMerger;
		this.pseudocoder = pseudocoder;
		this.description = description;
		if (MST_LIST == null)
			MST_LIST = new ArrayList<MultistageTheorem>();
		ID = MST_LIST.size();
		MST_LIST.add(this);
		// TODO: Sort out which undeclared variables are allowed in multitheorems
	}

	public static MultistageTheorem getTheorem(String completionAtomic) {
		return MST_LIST.get(Integer.parseInt(completionAtomic.substring(COMPLETION.length())));
	}

	public Fact<KQuantifier> getGivenTheorem() {
		return new Fact<KQuantifier>(
				universalQuantifier(problem(implication(givenRequirement, getTransferAtomic()), getCreatedVariables())),
				false, getDescription());
	}

	public Fact<KQuantifier> getGoalTheorem() {
		return new Fact<KQuantifier>(universalQuantifier(problem(
				implication(and(goalRequirement, getTransferAtomic()), getCompletionAtomic()), getCreatedVariables())),
				false, getDescription());
	}

	public static boolean isMSTStructural(String function) {
		return function.startsWith(TRANSFER) || function.startsWith(COMPLETION);
	}

	public KAtomic getTransferAtomic() {
		return atomic(TRANSFER + ID, getCreatedVariables());
	}

	public KAtomic getCompletionAtomic() {
		return atomic(COMPLETION + ID, getCreatedVariables());
	}

	private String[] getCreatedVariables() {
		return KernelUtil.getUndeclaredVars(givenRequirement).toArray(new String[0]);
	}

	public KProperty getGivenRequirement() {
		return givenRequirement;
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

	public String getDescription() {
		return description;
	}
}
