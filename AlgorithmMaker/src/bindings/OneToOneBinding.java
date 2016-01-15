package bindings;

import java.util.*;

/**
 * A special binding class for making one-to-one bindings. The default binding
 * class only allows for many-to-one, but this class will actively force
 * one-to-one.<br>
 * <br>
 * NOTE: Once made into an immutable copy, the copy's methods will not note the
 * one-to-one relationship, and will once again test only for many-to-one.
 */
public class OneToOneBinding extends MutableBinding {

	private Hashtable<String, String> reverseBindings = new Hashtable<String, String>();

	public void bind(String originalVar, String newVar) {
		if (reverseBindings.containsKey(newVar))
			bindings.remove(reverseBindings.get(newVar));

		if (bindings.containsKey(originalVar))
			reverseBindings.remove(bindings.get(newVar));

		bindings.put(originalVar, newVar);
		reverseBindings.put(newVar, originalVar);
	}

	public void removeBinding(String arg) {
		if (bindings.containsKey(arg))
			reverseBindings.remove(bindings.get(arg));

		bindings.remove(arg);
	}

	public boolean canHaveAdditionalBindings(Binding other) {
		HashSet<String> newBindingTargets = new HashSet<String>();

		for (String var : other.bindings.keySet()) {
			String target = other.bindings.get(var);
			if (!canBind(var, target) || newBindingTargets.contains(target))
				return false;
			else
				newBindingTargets.add(target);
		}

		return true;
	}

	public boolean canBind(String original, String asserted) {
		return (!bindings.containsKey(original) || bindings.get(original).equals(asserted))
				&& (!reverseBindings.containsKey(asserted) || reverseBindings.get(asserted).equals(original));
	}
}
