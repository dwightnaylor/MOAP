package bindings;

import static algorithmMaker.util.KernelUtil.getORed;

import java.util.*;

import algorithmMaker.util.KernelUtil;
import kernelLanguage.*;
import theorems.Fact;

public class MutableBinding extends Binding {

	public void bind(String originalVar, String newVar) {
		bindings.put(originalVar, newVar);
	}

	public void removeBinding(String arg) {
		bindings.remove(arg);
	}

	public void removeBindings(Collection<String> args) {
		for (String arg : args)
			removeBinding(arg);
	}

	protected Stack<ArrayList<String>> lastBindings = new Stack<ArrayList<String>>();

	public void applyBinding(KProperty original, Fact<? extends KProperty> asserted) {
		if (!KernelUtil.devar(original).equals(KernelUtil.devar(asserted.property))) {
			if (original instanceof KORing) {
				for (KProperty ored : getORed(original))
					if (canBind(ored, asserted.property)) {
						applyBinding(ored, asserted);
						return;
					}
			}
			throw new IllegalArgumentException(
					"Cannot bind two non-equivalent properties \"" + original + "\" and \"" + asserted.property + "\"");
		}

		ArrayList<String> newBindings = new ArrayList<String>();

		ArrayList<String> originalVars = KernelUtil.variables(original);
		ArrayList<String> assertedVars = KernelUtil.variables(asserted.property);
		for (int i = 0; i < originalVars.size(); i++) {
			String originalVar = originalVars.get(i);
			if (newBindings.contains(originalVar) && !bindings.get(originalVar).equals(assertedVars.get(i))) {
				throw new IllegalArgumentException("Binding \"" + original + "\" to \"" + asserted.property
						+ "\" caused a binding conflict. \"" + originalVar + "\" was bound to both \""
						+ bindings.get(originalVar) + "\" and \"" + assertedVars.get(i) + "\"");
			}
			if (!bindings.containsKey(originalVar)) {
				newBindings.add(originalVar);
			}

			bind(originalVar, assertedVars.get(i));
		}
		lastBindings.push(newBindings);

		prerequisites.add(asserted);
	}

	public void undoLastBinding() {
		for (String binding : lastBindings.pop())
			removeBinding(binding);

		prerequisites.remove(prerequisites.size() - 1);
	}

	@SuppressWarnings("unchecked")
	public Binding getImmutable() {
		Binding ret = new Binding();
		ret.bindings = (Hashtable<String, String>) bindings.clone();
		ret.prerequisites = (ArrayList<Fact<? extends KProperty>>) prerequisites.clone();
		return ret;
	}

	public void addBindingsFrom(Binding previousBinding) {
		for (String var : previousBinding.bindings.keySet())
			if (canBind(var, previousBinding.bindings.get(var)))
				bind(var, previousBinding.bindings.get(var));
	}

	public void addPrerequisite(Fact<? extends KProperty> fact) {
		prerequisites.add(fact);
	}
}
