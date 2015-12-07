package bindings;

import java.util.ArrayList;
import java.util.Hashtable;

import algorithmMaker.util.KernelUtil;
import kernelLanguage.KProperty;
import theorems.Fact;

public class Binding {
	public static final Binding EMPTY = new MutableBinding().getImmutable();

	Hashtable<String, String> bindings = new Hashtable<String, String>();
	ArrayList<Fact<? extends KProperty>> prerequisites = new ArrayList<Fact<? extends KProperty>>();

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

	// TODO:DN: Think about how this will work with quantifiers since they
	// declare variables. Also applyBinding()...
	public boolean canBind(KProperty original, KProperty asserted) {
		if (!KernelUtil.devar(original).equals(KernelUtil.devar(asserted)))
			return false;

		Hashtable<String, String> newBindings = new Hashtable<String, String>();

		ArrayList<String> originalVars = KernelUtil.variables(original);
		ArrayList<String> assertedVars = KernelUtil.variables(asserted);
		for (int i = 0; i < originalVars.size(); i++) {
			String originalVar = originalVars.get(i);
			String assertedVar = assertedVars.get(i);
			if (bindings.containsKey(originalVar) && !bindings.get(originalVar).equals(assertedVar)
					|| newBindings.containsKey(originalVar) && !newBindings.get(originalVar).equals(assertedVar))
				return false;

			newBindings.put(originalVar, assertedVar);
		}

		return true;
	}

	public boolean canBind(String original, String asserted) {
		return !bindings.containsKey(original) || bindings.get(original).equals(asserted);
	}

	public Hashtable<String, String> getArguments() {
		Hashtable<String, String> ret = new Hashtable<String, String>();
		for (String key : bindings.keySet())
			ret.put(key, bindings.get(key));

		return ret;
	}

	public ArrayList<Fact<? extends KProperty>> getPrerequisites() {
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
