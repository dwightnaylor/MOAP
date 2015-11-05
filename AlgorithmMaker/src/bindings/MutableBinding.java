package bindings;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Stack;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import theorems.Fact;
import algorithmMaker.input.Argument;
import algorithmMaker.input.Property;
import algorithmMaker.input.Variable;
import algorithmMaker.util.InputUtil;

public class MutableBinding extends Binding {
	public void bind(String originalVar, Argument newVar) {
		bindings.put(originalVar, newVar);
	}

	public void removeBinding(String arg) {
		bindings.remove(arg);
	}

	private Stack<ArrayList<String>> lastBindings = new Stack<ArrayList<String>>();

	public void applyBinding(Property original, Fact<? extends Property> asserted) {
		if (!InputUtil.devar(original).equals(InputUtil.devar(asserted.property)))
			throw new IllegalArgumentException("Cannot bind two non-equivalent properties \"" + original + "\" and \""
					+ asserted.property + "\"");

		ArrayList<String> newBindings = new ArrayList<String>();
		TreeIterator<EObject> originalContents = original.eAllContents();
		TreeIterator<EObject> assertedContents = asserted.property.eAllContents();
		while (originalContents.hasNext()) {
			EObject cur = originalContents.next();
			if (cur instanceof Variable) {
				String arg = ((Variable) cur).getArg();
				if (!bindings.containsKey(arg))
					newBindings.add(arg);

				bind(arg, (Variable) assertedContents.next());
			}
		}
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
		ret.bindings = (Hashtable<String, Argument>) bindings.clone();
		ret.prerequisites = (ArrayList<Fact<? extends Property>>) prerequisites.clone();
		return ret;
	}

	public void addBindingsFrom(Binding previousBinding) {
		for (String var : previousBinding.bindings.keySet())
			bind(var, previousBinding.bindings.get(var));
	}
}
