package bindings;

import java.util.ArrayList;
import java.util.Hashtable;

import theorems.Fact;
import algorithmMaker.input.Argument;
import algorithmMaker.input.Property;
import algorithmMaker.util.InputUtil;

public class Binding {
	public static final Binding EMPTY = new MutableBinding().getImmutable();

	Hashtable<String, Argument> bindings = new Hashtable<String, Argument>();
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

	public boolean hasBinding(Argument originalVar, Argument newVar) {
		return bindings.containsKey(originalVar) && bindings.get(originalVar).equals(newVar);
	}

	public boolean canHaveAdditionalBindings(Binding other) {
		for (String var : other.bindings.keySet())
			if (!canBind(var, other.bindings.get(var)))
				return false;

		return true;
	}

	public boolean canBind(String original, Argument asserted) {
		return !bindings.containsKey(original) || bindings.get(original).equals(asserted);
	}

	public Hashtable<Argument, Argument> getArguments() {
		// TODO:DN: Don't clone here maybe
		Hashtable<Argument, Argument> ret = new Hashtable<Argument, Argument>();
		for (String key : bindings.keySet())
			ret.put(InputUtil.createVariable(key), bindings.get(key));

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
		ret.bind(string, InputUtil.createVariable(argument));
		return ret.getImmutable();
	}

	public static Binding createBinding(String[][] bindings) {
		MutableBinding ret = new MutableBinding();
		for (String[] binding : bindings)
			ret.bind(binding[0], InputUtil.createVariable(binding[1]));

		return ret.getImmutable();
	}
}
