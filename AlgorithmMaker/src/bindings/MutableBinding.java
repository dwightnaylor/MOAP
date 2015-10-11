package bindings;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Stack;

import algorithmMaker.input.Atomic;
import algorithmMaker.input.Property;
import theorems.Fact;

public class MutableBinding extends Binding {
	public void bind(String originalVar, String newVar) {
		bindings.put(originalVar, newVar);
	}

	public void removeBinding(String arg) {
		bindings.remove(arg);
	}

	private Stack<ArrayList<String>> lastBindings = new Stack<ArrayList<String>>();

	public void applyBinding(Atomic original, Fact<Atomic> asserted) {
		lastBindings.push(new ArrayList<String>());
		for (int i = 0; i < original.getArgs().size(); i++) {
			String arg = original.getArgs().get(i);
			if (!bindings.containsKey(arg))
				lastBindings.peek().add(arg);

			bind(arg, asserted.property.getArgs().get(i));
		}

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
