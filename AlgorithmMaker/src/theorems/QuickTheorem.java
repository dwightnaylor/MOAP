package theorems;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import algorithmMaker.input.Property;
import algorithmMaker.input.Theorem;

public class QuickTheorem extends MinimalEObjectImpl.Container implements Theorem {
	
	private Property requirement;
	private Property result;
	private int cost;
	private String description;

	public QuickTheorem(Property requirement, Property result, int cost, String description){
		this.requirement = requirement;
		this.result = result;
		this.cost = cost;
		this.description = description;
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
}
