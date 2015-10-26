package bindings;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Stack;

import algorithmMaker.input.Argument;
import algorithmMaker.input.Atomic;
import algorithmMaker.input.Property;
import algorithmMaker.input.Variable;
import theorems.Fact;

public class MutableBinding extends Binding {
	public void bind(String originalVar, Argument newVar) {
		bindings.put(originalVar, newVar);
	}

	public void removeBinding(String arg) {
		bindings.remove(arg);
	}

	private Stack<ArrayList<String>> lastBindings = new Stack<ArrayList<String>>();

	public void applyBinding(Atomic original, Fact<Atomic> asserted) {
		lastBindings.push(new ArrayList<String>());
		// TODO:DN: Recursively go down a numerical argument and do any variable
		// bindings we can do
		for (int i = 0; i < original.getArgs().size(); i++) {
			if (original.getArgs().get(i) instanceof Variable) {
				String arg = ((Variable) original.getArgs().get(i)).getArg();
				if (!bindings.containsKey(arg))
					lastBindings.peek().add(arg);

				bind(arg, asserted.property.getArgs().get(i));
			} else if (!original.getArgs().get(i).equals(asserted.property.getArgs().get(i))) {
				throw new UnsupportedOperationException("Can't bind a non-variable to something");
			}
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
		ret.bindings = (Hashtable<String, Argument>) bindings.clone();
		ret.prerequisites = (ArrayList<Fact<? extends Property>>) prerequisites.clone();
		return ret;
	}

	public void addBindingsFrom(Binding previousBinding) {
		for (String var : previousBinding.bindings.keySet())
			bind(var, previousBinding.bindings.get(var));
	}
}
