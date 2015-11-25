package bindings;

import java.util.ArrayList;
import java.util.Hashtable;

import algorithmMaker.input.Property;
import theorems.Fact;

public class Binding {
	public static final Binding EMPTY = new MutableBinding().getImmutable();

	Hashtable<String, String> bindings = new Hashtable<String, String>();
	ArrayList<Fact<? extends Property>> prerequisites = new ArrayList<Fact<? extends Property>>();

	public String toString() {
		return "Binding:" + bindings.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Binding))
			return false;

		Binding binding = (Binding) obj;
		if (bindings.size() != binding.bindings.size())
			return false;

		for (String var : bindings.keySet()) {
			if (!binding.bindings.containsKey(var))
				return false;

			if (!binding.bindings.get(var).equals(bindings.get(var)))
				return false;
		}

		return true;
	}

	public boolean hasBinding(String originalVar, String newVar) {
		return bindings.containsKey(originalVar) && bindings.get(originalVar).equals(newVar);
	}

	public boolean canHaveAdditionalBindings(Binding other) {
		for (String var : other.bindings.keySet())
			if (!canBind(var, other.bindings.get(var)))
				return false;

		return true;
	}

	public boolean canBind(String original, String asserted) {
		return !bindings.containsKey(original) || bindings.get(original).equals(asserted);
	}

	public Hashtable<String, String> getArguments() {
		// TODO:DN: Don't clone here maybe
		Hashtable<String, String> ret = new Hashtable<String, String>();
		for (String key : bindings.keySet())
			ret.put(key, bindings.get(key));

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

	public static Binding singleton(String string, String argument) {
		MutableBinding ret = new MutableBinding();
		ret.bind(string, argument);
		return ret.getImmutable();
	}

	public static Binding createBinding(String[][] bindings) {
		MutableBinding ret = new MutableBinding();
		for (String[] binding : bindings)
			ret.bind(binding[0], binding[1]);

		return ret.getImmutable();
	}
}
