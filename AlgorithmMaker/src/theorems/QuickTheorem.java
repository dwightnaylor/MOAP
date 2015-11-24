package theorems;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import algorithmMaker.input.Property;
import algorithmMaker.input.Theorem;

public class QuickTheorem extends MinimalEObjectImpl.Container implements Theorem {

	public static final String NO_PSEUDOCODE_GIVEN = "NO PSEUDOCODE GIVEN";

	private Property requirement;
	private Property result;
	private int cost;
	private String description;
	private String pseudocode;

	public QuickTheorem(Property requirement, Property result, int cost, String description) {
		this(requirement, result, cost, description, NO_PSEUDOCODE_GIVEN);
	}

	public QuickTheorem(Property requirement, Property result, int cost, String description, String pseudocode) {
		this.requirement = requirement;
		this.result = result;
		this.cost = cost;
		this.description = description;
		this.pseudocode = pseudocode;
	}

	@Override
	public String getImplication() {
		return "->";
	}

	@Override
	public Property getRequirement() {
		return requirement;
	}

	@Override
	public Property getResult() {
		return result;
	}

	@Override
	public int getCost() {
		return cost;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public String getPseudoCode() {
		return pseudocode;
	}

	@Override
	public void setRequirement(Property value) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setResult(Property value) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setCost(int value) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setDescription(String value) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setPseudoCode(String value) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setImplication(String value) {
		throw new UnsupportedOperationException();
	}
}
