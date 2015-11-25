package bindings;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Stack;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import algorithmMaker.input.Atomic;
import algorithmMaker.input.Property;
import algorithmMaker.util.InputUtil;
import theorems.Fact;

public class MutableBinding extends Binding {
	public void bind(String originalVar, String newVar) {
		bindings.put(originalVar, newVar);
	}

	public void removeBinding(String arg) {
		bindings.remove(arg);
	}

	private Stack<ArrayList<String>> lastBindings = new Stack<ArrayList<String>>();

	public void applyBinding(Property original, Fact<? extends Property> asserted) {
		// TODO: Think about how this works with nested atomics after they're unnested
		if (!InputUtil.devar(original).equals(InputUtil.devar(asserted.property)))
			throw new IllegalArgumentException("Cannot bind two non-equivalent properties \"" + original + "\" and \""
					+ asserted.property + "\"");

		ArrayList<String> newBindings = new ArrayList<String>();

		TreeIterator<EObject> originalContents = original.eAllContents();
		TreeIterator<EObject> assertedContents = asserted.property.eAllContents();
		EObject nextOriginal = original;
		EObject nextAsserted = asserted.property;
		do {
			if (nextOriginal instanceof Atomic) {
				Atomic originalAtomic = (Atomic) nextOriginal;
				for (int i = 0; i < originalAtomic.getArgs().size(); i++) {
					String originalVar = originalAtomic.getArgs().get(i);
					if (!bindings.containsKey(originalVar))
						newBindings.add(originalVar);

					bind(originalVar, ((Atomic) nextAsserted).getArgs().get(i));
				}
			}
			nextOriginal = originalContents.hasNext() ? originalContents.next() : null;
			nextAsserted = assertedContents.hasNext() ? assertedContents.next() : null;
		} while (nextOriginal != null);
		lastBindings.push(newBindings);

		prerequisites.add(asserted);
	}

	public void undoLastBinding() {
		for (String binding : lastBindings.pop())
			bindings.remove(binding);

		prerequisites.remove(prerequisites.size() - 1);
	}

	@SuppressWarnings("unchecked")
	public Binding getImmutable() {
		Binding ret = new Binding();
		ret.bindings = (Hashtable<String, String>) bindings.clone();
		ret.prerequisites = (ArrayList<Fact<? extends Property>>) prerequisites.clone();
		return ret;
	}

	public void addBindingsFrom(Binding previousBinding) {
		for (String var : previousBinding.bindings.keySet())
			bind(var, previousBinding.bindings.get(var));
	}
}
