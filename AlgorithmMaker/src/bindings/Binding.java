package bindings;

import java.util.*;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import algorithmMaker.input.Atomic;
import algorithmMaker.input.Property;
import algorithmMaker.util.InputUtil;
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

	// TODO:DN: Think about how this will work with quantifiers since they declare variables. Also applyBinding()...
	public boolean canBind(Property original, Property asserted) {
		if (!InputUtil.devar(original).equals(InputUtil.devar(asserted)))
			return false;

		Hashtable<String, String> newBindings = new Hashtable<String, String>();

		TreeIterator<EObject> originalContents = original.eAllContents();
		TreeIterator<EObject> assertedContents = asserted.eAllContents();
		EObject nextOriginal = original;
		EObject nextAsserted = asserted;
		do {
			if (nextOriginal instanceof Atomic) {
				Atomic originalAtomic = (Atomic) nextOriginal;
				for (int i = 0; i < originalAtomic.getArgs().size(); i++) {
					String originalVar = originalAtomic.getArgs().get(i);
					String assertedVar = ((Atomic) nextAsserted).getArgs().get(i);
					if (bindings.containsKey(originalVar) && !bindings.get(originalVar).equals(assertedVar)
							|| newBindings.containsKey(originalVar)
							&& !newBindings.get(originalVar).equals(assertedVar))
						return false;

					newBindings.put(originalVar, assertedVar);
				}
			}
			nextOriginal = originalContents.hasNext() ? originalContents.next() : null;
			nextAsserted = assertedContents.hasNext() ? assertedContents.next() : null;
		} while (nextOriginal != null);

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
