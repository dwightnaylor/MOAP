package bindings.equalityTesting;

import java.util.*;
import kernelLanguage.*;

import algorithmMaker.util.KernelUtil;
import bindings.Binding;
import bindings.MutableBinding;

/**
 * This class is for third-order canonicalization. This is the removal of
 * variable name value from an expression. Namely, the point is to be able to
 * recognize the equivalence of "a(x) & b(x)" and "a(y) & b(y)", but reject the
 * equivalence of "a(x,y) & a(y,z)" and "a(x,y) & a(z,t)". This is also used in
 * theorem chaining to recognize equivalent expressions.
 * 
 * @author Dwight Naylor
 */
public class EqualityTester {
	/**
	 * Finds all the bindings from the original property to the new property
	 * that will make the two equivalent.<br>
	 * <br>
	 * This is used to determine the equivalences between two expressions
	 * regardless of variable naming. It is more complicated than
	 * InputUtil.devar(Property) because it will also take into account
	 * relationships between the variables. For example,
	 * <code> a(x,y) & a(y,z) </code>and <code> a(x,y) & a(z,q) </code> would
	 * both devar to <code> a(_,_) & a(_,_)</code>, but they are not equivalent
	 * in terms of variable relations.
	 */
	public static List<Binding> getEquivalentBindings(KProperty originalProperty, KProperty newProperty) {
		originalProperty = (KProperty) KernelUtil.canonicalize(originalProperty);
		newProperty = (KProperty) KernelUtil.canonicalize(newProperty);

		Hashtable<Appearance, ArrayList<String>> originalAppearances = getAppearances(originalProperty);
		Hashtable<Appearance, ArrayList<String>> newAppearances = getAppearances(newProperty);

		// If they have different appearance counts, they're not equivalent
		if (originalAppearances.size() != newAppearances.size())
			return Collections.emptyList();

		// If their appearance values aren't the same, they're not equivalent
		for (Appearance appearance : originalAppearances.keySet()) {
			if (!newAppearances.containsKey(appearance))
				return Collections.emptyList();

			if (originalAppearances.get(appearance).size() != newAppearances.get(appearance).size())
				return Collections.emptyList();
		}

		// Now comes the terrible part... we try every possible combination of
		// legal appearances until we find one that can make the two equal. We
		// then return that one... and keep searching.
		ArrayList<Binding> ret = new ArrayList<Binding>();
		addLegalBindings(ret, new MutableBinding(), new ArrayList<Appearance>(originalAppearances.keySet()), 0, 0,
				originalProperty, newProperty, originalAppearances, newAppearances);
		return ret;
	}

	private static void addLegalBindings(ArrayList<Binding> legalBindings, MutableBinding binding,
			ArrayList<Appearance> appearances, int index, int subIndex, KProperty originalProperty,
			KProperty newProperty, Hashtable<Appearance, ArrayList<String>> originalAppearances,
			Hashtable<Appearance, ArrayList<String>> newAppearances) {
		if (index == appearances.size()) {
			if (KernelUtil.canonicalize(KernelUtil.revar(originalProperty, binding.getArguments())).equals(newProperty))
				legalBindings.add(binding.getImmutable());

			return;
		}
		Appearance appearance = appearances.get(index);
		String currentVar = originalAppearances.get(appearance).get(subIndex);
		for (String varToRevar : newAppearances.get(appearance)) {
			if (binding.canBind(currentVar, varToRevar)) {
				binding.bind(currentVar, varToRevar);
				if (subIndex == originalAppearances.get(appearance).size() - 1)
					addLegalBindings(legalBindings, binding, appearances, index + 1, 0, originalProperty, newProperty,
							originalAppearances, newAppearances);
				else
					addLegalBindings(legalBindings, binding, appearances, index, subIndex + 1, originalProperty,
							newProperty, originalAppearances, newAppearances);

				binding.removeBinding(currentVar);
			}
		}
	}

	public static Hashtable<Appearance, ArrayList<String>> getAppearances(KProperty property) {
		Hashtable<Appearance, ArrayList<String>> appearances = new Hashtable<Appearance, ArrayList<String>>();
		addAppearances(property, appearances, null);
		return appearances;
	}

	private static void addAppearances(KProperty property, Hashtable<Appearance, ArrayList<String>> appearances,
			Appearance prefix) {
		switch (KernelUtil.KType(property)) {
		case KANDing: {
			for (KProperty subProperty : KernelUtil.getANDed((KANDing) property)) {
				addAppearances(subProperty, appearances, prefix);
			}
			return;
		}
		case KAtomic: {
			KAtomic atomic = (KAtomic) property;
			for (int i = 0; i < atomic.args.size(); i++) {
				AtomicAppearance appearance = new AtomicAppearance(atomic.function, i, prefix);
				if (!appearances.containsKey(appearance))
					appearances.put(appearance, new ArrayList<String>());

				appearances.get(appearance).add(atomic.args.get(i));
			}
			return;
		}
		case KNegation: {
			addAppearances(((KNegation) property).negated, appearances, new NegatedAppearance(prefix));
			return;
		}
		case KQuantifier: {
			KQuantifier quantifier = (KQuantifier) property;
			addAppearances(quantifier.subject.property, appearances,
					new QuantifierAppearance(quantifier, true, prefix));
			addAppearances(quantifier.predicate, appearances, new QuantifierAppearance(quantifier, false, prefix));
			return;
		}
		case KProblem:
		case KInput:
		case KBooleanLiteral:
		}
	}
}
