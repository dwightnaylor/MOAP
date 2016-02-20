package algorithmMaker.util.equalityTesting;

import java.util.*;

import algorithmMaker.util.KernelUtil;
import kernelLanguage.*;

/**
 * This class is for third-order canonicalization. This is the removal of variable name value from an expression.
 * Namely, the point is to be able to recognize the equivalence of "a(x) & b(x)" and "a(y) & b(y)", but reject the
 * equivalence of "a(x,y) & a(y,z)" and "a(x,y) & a(z,t)". This is also used in theorem chaining to recognize equivalent
 * expressions.
 * 
 * @author Dwight Naylor
 */
public class EqualityTester {
	// /**
	// * Finds all the bindings from the original property to the new property that will make the two equivalent.<br>
	// * <br>
	// * This is used to determine the equivalences between two expressions regardless of variable naming. It is more
	// * complicated than InputUtil.devar(Property) because it will also take into account relationships between the
	// * variables. For example, <code> a(x,y) & a(y,z) </code>and <code> a(x,y) & a(z,q) </code> would both devar to
	// * <code> a(_,_) & a(_,_)</code>, but they are not equivalent in terms of variable relations.
	// */
	// public static List<Binding> getEquivalentBindings(KProperty originalProperty, KProperty newProperty) {
	// originalProperty = (KProperty) KernelUtil.canonicalizeOrder(originalProperty);
	// newProperty = (KProperty) KernelUtil.canonicalizeOrder(newProperty);
	//
	// Hashtable<String, ArrayList<Appearance>> originalAppearances = getAppearances(originalProperty);
	// Hashtable<String, ArrayList<Appearance>> newAppearances = getAppearances(newProperty);
	//
	// // If they have different appearance counts, they're not equivalent
	// if (originalAppearances.size() != newAppearances.size())
	// return Collections.emptyList();
	//
	// // If their appearance values aren't the same, they're not equivalent
	// for (Appearance appearance : originalAppearances.keySet()) {
	// if (!newAppearances.containsKey(appearance))
	// return Collections.emptyList();
	//
	// if (originalAppearances.get(appearance).size() != newAppearances.get(appearance).size())
	// return Collections.emptyList();
	// }
	//
	// // Now comes the terrible part... we try every possible combination of
	// // legal appearances until we find one that can make the two equal. We
	// // then return that one... and keep searching.
	// ArrayList<Binding> ret = new ArrayList<Binding>();
	// addLegalBindings(ret, new MutableBinding(), new ArrayList<Appearance>(originalAppearances.keySet()), 0, 0,
	// originalProperty, newProperty, originalAppearances, newAppearances);
	// return ret;
	// }

	// private static void addLegalBindings(ArrayList<Binding> legalBindings, MutableBinding binding,
	// ArrayList<Appearance> appearances, int index, int subIndex, KProperty originalProperty,
	// KProperty newProperty, Hashtable<Appearance, ArrayList<String>> originalAppearances,
	// Hashtable<Appearance, ArrayList<String>> newAppearances) {
	// if (index == appearances.size()) {
	// if (KernelUtil.canonicalizeOrder(KernelUtil.revar(originalProperty, binding.getArguments()))
	// .equals(newProperty))
	// legalBindings.add(binding.getImmutable());
	//
	// return;
	// }
	// Appearance appearance = appearances.get(index);
	// String currentVar = originalAppearances.get(appearance).get(subIndex);
	// for (String varToRevar : newAppearances.get(appearance)) {
	// if (binding.canBind(currentVar, varToRevar)) {
	// binding.bind(currentVar, varToRevar);
	// if (subIndex == originalAppearances.get(appearance).size() - 1)
	// addLegalBindings(legalBindings, binding, appearances, index + 1, 0, originalProperty, newProperty,
	// originalAppearances, newAppearances);
	// else
	// addLegalBindings(legalBindings, binding, appearances, index, subIndex + 1, originalProperty,
	// newProperty, originalAppearances, newAppearances);
	//
	// binding.removeBinding(currentVar);
	// }
	// }
	// }

	private static Hashtable<KObject, KObject> singleLayerCanonicalizations = new Hashtable<KObject, KObject>();

	public static Hashtable<String, ArrayList<Appearance>> getAppearances(KObject property) {
		Hashtable<String, ArrayList<Appearance>> appearances = new Hashtable<String, ArrayList<Appearance>>();
		addAppearances(property, appearances, null);
		return appearances;
	}

	private static void addAppearances(KObject kObject, Hashtable<String, ArrayList<Appearance>> appearances,
			Appearance prefix) {
		kObject = getSingleCanonicalized(kObject);

		switch (KernelUtil.KType(kObject)) {
		case KANDing: {
			for (KProperty subProperty : KernelUtil.getANDed((KANDing) kObject)) {
				addAppearances(subProperty, appearances, prefix);
			}
			return;
		}
		case KAtomic: {
			KAtomic atomic = (KAtomic) kObject;
			for (int i = 0; i < atomic.args.size(); i++) {
				String variable = atomic.args.get(i);
				if (!appearances.containsKey(variable))
					appearances.put(variable, new ArrayList<Appearance>());

				appearances.get(variable).add(new AtomicAppearance(atomic.function, i, prefix));
			}
			return;
		}
		case KNegation: {
			addAppearances(((KNegation) kObject).negated, appearances, new NegatedAppearance(prefix));
			return;
		}
		case KQuantifier: {
			KQuantifier quantifier = (KQuantifier) kObject;
			addAppearances(quantifier.subject.property, appearances,
					new QuantifierAppearance(quantifier, true, prefix));
			addAppearances(quantifier.predicate, appearances, new QuantifierAppearance(quantifier, false, prefix));
			return;
		}
		case KInput: {
			KInput input = (KInput) kObject;
			addAppearances(input.given.property, appearances, new InputAppearance(input, true, prefix));
			addAppearances(input.goal.property, appearances, new InputAppearance(input, false, prefix));
			return;
		}
		case KProblem:
		case KBooleanLiteral:
		}
	}

	/**
	 * TODO:This is a very simple form of canonicalization, temporarily being used only for helping us do work here.
	 */
	private static KObject getSingleCanonicalized(KObject kObject) {
		if (!singleLayerCanonicalizations.containsKey(kObject)) {
			KObject canonicalized = kObject;

			singleLayerCanonicalizations.put(kObject, canonicalized);
		}
		return singleLayerCanonicalizations.get(kObject);
	}
}
