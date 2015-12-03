package theorems;

import pseudocoders.Pseudocoder;
import algorithmMaker.input.Property;

public class MultistageTheorem extends QuickTheorem {

	private final Property findRequirement;
	private final Property givenResult;
	private final Property findResult;
	private final Pseudocoder pseudocoder;

	public MultistageTheorem(Property givenRequirement, Property findRequirement, Property givenResult, int cost,
			String description, Pseudocoder pseudocoder) {
		this(givenRequirement, findRequirement, givenResult, null, cost, description, pseudocoder);
	}

	public MultistageTheorem(Property givenRequirement, Property findRequirement, Property givenResult,
			Property findResult, int cost, String description, Pseudocoder pseudocoder) {
		super(givenRequirement, null, cost, description, null);
		this.findRequirement = findRequirement;
		this.givenResult = givenResult;
		this.findResult = findResult;
		this.pseudocoder = pseudocoder;
	}

	public MultistageTheorem copy() {
		return new MultistageTheorem(getRequirement(), findRequirement, givenResult, findResult, getCost(),
				getDescription(), getPseudocoder());
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

	public Pseudocoder getPseudocoder() {
		return pseudocoder;
	}
}
