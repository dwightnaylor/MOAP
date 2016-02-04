package bindings;

import static algorithmMaker.util.KernelUtil.devar;
import static kernelLanguage.KernelFactory.NULL;

import java.util.*;

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

		for (String var : bindings.keySet())
			if (!binding.bindings.containsKey(var) || !binding.bindings.get(var).equals(bindings.get(var)))
				return false;

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

		MutableBinding newBindings = new MutableBinding();

		ArrayList<String> originalVars = KernelUtil.variables(original);
		ArrayList<String> assertedVars = KernelUtil.variables(asserted);
		for (int i = 0; i < originalVars.size(); i++) {
			String originalVar = originalVars.get(i);
			String assertedVar = assertedVars.get(i);
			if (newBindings.bindings.containsKey(originalVar)
					&& !newBindings.bindings.get(originalVar).equals(assertedVars.get(i))) {
				return false;
			}
			if (!newBindings.canBind(originalVar, assertedVar))
				return false;

			newBindings.bind(originalVar, assertedVar);
		}

		return canHaveAdditionalBindings(newBindings);
	}

	public boolean wouldAddNewBinding(KProperty original, KProperty asserted) {
		if (!KernelUtil.devar(original).equals(KernelUtil.devar(asserted)))
			return false;

		MutableBinding newBindings = new MutableBinding();

		ArrayList<String> originalVars = KernelUtil.variables(original);
		ArrayList<String> assertedVars = KernelUtil.variables(asserted);
		for (int i = 0; i < originalVars.size(); i++) {
			String originalVar = originalVars.get(i);
			String assertedVar = assertedVars.get(i);
			if (!newBindings.canBind(originalVar, assertedVar))
				return false;

			newBindings.bind(originalVar, assertedVar);
		}

		return canHaveAdditionalBindings(newBindings);
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

	/**
	 * Finds all of the bindings from variables within container to variables
	 * within content which will make content a sub-property of container. <br>
	 * <br>
	 * NOTE: Due to the fact that I'm lazy, this method currently only uses the
	 * surface-representation of the given properties, meaning it will not
	 * "dig down" to find if a deeper equivalence exists.
	 * 
	 * @param container
	 * @param mappedContent
	 * @param theorems
	 * @param originalBinding
	 *            Must be either one or zero bindings. If there is a binding, it
	 *            is the binding that all other bindings must contain.
	 * @return
	 */
	public static ArrayList<Binding> findBindingWithin(KProperty container, KProperty content,
			Binding... originalBinding) {
		if (originalBinding.length > 1)
			throw new IllegalArgumentException("There can only be one originalBinding");

		// TODO: Make this method use deep similarity for analyzing the given
		// properties
		Hashtable<KProperty, ArrayList<KProperty>> containerByStructure = new Hashtable<KProperty, ArrayList<KProperty>>();
		for (KProperty anded : KernelUtil.getANDed(container)) {
			KProperty devar = devar(anded);
			if (!containerByStructure.containsKey(devar))
				containerByStructure.put(devar, new ArrayList<KProperty>());

			containerByStructure.get(devar).add(anded);
		}
		ArrayList<KProperty> structures = new ArrayList<KProperty>();
		Hashtable<KProperty, ArrayList<KProperty>> contentByStructure = new Hashtable<KProperty, ArrayList<KProperty>>();
		for (KProperty anded : KernelUtil.getANDed(content)) {
			KProperty devar = devar(anded);
			if (!containerByStructure.containsKey(devar)) {
				return null;
			}
			if (!contentByStructure.containsKey(devar)) {
				structures.add(devar);
				contentByStructure.put(devar, new ArrayList<KProperty>());
			}

			contentByStructure.get(devar).add(anded);
		}

		ArrayList<Binding> ret = new ArrayList<Binding>();
		OneToOneBinding binding = new OneToOneBinding();
		if (originalBinding.length > 0)
			binding.addBindingsFrom(originalBinding[0]);

		addBindingsWithin(ret, binding, containerByStructure, contentByStructure, structures, 0, 0);
		return ret;
	}

	public Binding getInverse() {
		MutableBinding ret = new MutableBinding();
		for (String key : bindings.keySet()) {
			if (ret.bindings.containsKey(bindings.get(key)))
				throw new IllegalArgumentException(
						"Can only invert a binding that is one-to-one. The binding " + this + " was not.");

			ret.bind(bindings.get(key), key);
		}
		return ret.getImmutable();
	}

	/**
	 * Helper method used for trying all possible combinations for a given
	 * container/content pair.
	 */
	private static void addBindingsWithin(ArrayList<Binding> bindingList, OneToOneBinding binding,
			Hashtable<KProperty, ArrayList<KProperty>> containerByStructure,
			Hashtable<KProperty, ArrayList<KProperty>> contentByStructure, ArrayList<KProperty> structures,
			int structureIndex, int subIndex) {
		if (subIndex == containerByStructure.get(structures.get(structureIndex)).size()) {
			subIndex = 0;
			structureIndex++;
		}
		if (structureIndex == structures.size()) {
			bindingList.add(binding.getImmutable());
			return;
		}

		KProperty containerProp = containerByStructure.get(structures.get(structureIndex)).get(subIndex);
		for (KProperty contentProp : contentByStructure.get(structures.get(structureIndex))) {
			if (binding.canBind(containerProp, contentProp)) {
				binding.applyBinding(containerProp, new Fact<KProperty>(contentProp, NULL));
				addBindingsWithin(bindingList, binding, containerByStructure, contentByStructure, structures,
						structureIndex, subIndex + 1);
				binding.undoLastBinding();
			}
		}
	}
}
