package bindings;

import java.util.ArrayList;
import java.util.Hashtable;

import theorems.Fact;
import algorithmMaker.input.Argument;
import algorithmMaker.input.Property;
import algorithmMaker.util.InputUtil;

public class Binding {
	Hashtable<String, Argument> bindings = new Hashtable<String, Argument>();
	ArrayList<Fact<? extends Property>> prerequisites = new ArrayList<Fact<? extends Property>>();

	public String toString() {
		return "Binding:" + bindings.toString();
	}

	public boolean hasBinding(Argument originalVar, Argument newVar) {
		return bindings.containsKey(originalVar) && bindings.get(originalVar).equals(newVar);
	}

	public boolean canHaveAdditionalBindings(Binding other) {
		for (String var : other.bindings.keySet())
			if (bindings.containsKey(var) && !bindings.get(var).equals(other.bindings.get(var)))
				return false;

		return true;
	}

	public boolean canBind(Property original, Property asserted) {
		return InputUtil.devar(original).equals(InputUtil.devar(asserted));
	}

	public Hashtable<Argument, Argument> getArguments() {
		// TODO:DN: Don't clone here maybe
		Hashtable<Argument, Argument> ret = new Hashtable<Argument, Argument>();
		for (String key : bindings.keySet())
			ret.put(InputUtil.getVariable(key), bindings.get(key));

		return ret;
	}

	public ArrayList<Fact<? extends Property>> getPrerequisites() {
		return prerequisites;
	}

	public String revar(String pseudoCode) {
		String newCode = pseudoCode;
		for (String original : bindings.keySet())
			newCode = newCode.replaceAll('<' + original + '>', bindings.get(original).toString());

		return newCode;
	}

	public int size() {
		return bindings.size();
	}
}
