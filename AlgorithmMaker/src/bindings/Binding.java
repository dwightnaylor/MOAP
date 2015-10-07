package bindings;

import java.util.ArrayList;
import java.util.Hashtable;

import algorithmMaker.input.Atomic;
import algorithmMaker.input.Property;
import theorems.Fact;

public class Binding {
	Hashtable<String, String> bindings = new Hashtable<String, String>();
	ArrayList<Fact<? extends Property>> prerequisites = new ArrayList<Fact<? extends Property>>();

	public String toString() {
		return "Binding:" + bindings.toString();
	}

	public boolean hasBinding(String originalVar, String newVar) {
		return bindings.containsKey(originalVar) && bindings.get(originalVar).equals(newVar);
	}

	public boolean canHaveAdditionalBindings(Binding other) {
		for (String var : other.bindings.keySet())
			if (bindings.containsKey(var) && !bindings.get(var).equals(other.bindings.get(var))) {
				System.out.println(var + ":" + bindings.get(var) + "," + other.bindings.get(var));
				return false;
			}

		return true;
	}

	public boolean canBind(Atomic original, Atomic asserted) {
		assert(original.getFunction().equals(asserted.getFunction()));
		for (int i = 0; i < original.getArgs().size(); i++)
			if (bindings.containsKey(original.getArgs().get(i))
					&& !hasBinding(original.getArgs().get(i), asserted.getArgs().get(i)))
				return false;

		return true;
	}

	public Hashtable<String, String> getArguments() {
		return bindings;
	}

	public ArrayList<Fact<? extends Property>> getPrerequisites() {
		return prerequisites;
	}

	public String revar(String pseudoCode) {
		String newCode = pseudoCode;
		for (String original : bindings.keySet())
			newCode = newCode.replaceAll('<' + original + '>', bindings.get(original));

		return newCode;
	}

	public String getBindingString() {
		return bindings.keySet().toString();
	}
}
