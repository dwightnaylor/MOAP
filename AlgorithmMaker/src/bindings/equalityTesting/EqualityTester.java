package bindings.equalityTesting;

import java.util.*;

import algorithmMaker.input.*;
import algorithmMaker.util.InputUtil;
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
	public static List<Binding> getEquivalentBindings(Property originalProperty, Property newProperty) {
		originalProperty = InputUtil.canonicalize(originalProperty);
		newProperty = InputUtil.canonicalize(newProperty);

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
			ArrayList<Appearance> appearances, int index, int subIndex, Property originalProperty, Property newProperty,
			Hashtable<Appearance, ArrayList<String>> originalAppearances,
			Hashtable<Appearance, ArrayList<String>> newAppearances) {
		if (index == appearances.size()) {
			if (InputUtil.canonicalize(InputUtil.revar(originalProperty, binding.getArguments())).equals(newProperty))
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

	public static Hashtable<Appearance, ArrayList<String>> getAppearances(Property property) {
		Hashtable<Appearance, ArrayList<String>> appearances = new Hashtable<Appearance, ArrayList<String>>();
		addAppearances(property, appearances, null);
		return appearances;
	}

	private static void addAppearances(Property property, Hashtable<Appearance, ArrayList<String>> appearances,
			Appearance prefix) {
		switch (InputUtil.kernelType(property)) {
		case ProblemShell: {
			addAppearances(((ProblemShell) property).getProblem().getProperty(), appearances, prefix);
			return;
		}
		case ANDing: {
			for (Property subProperty : InputUtil.getANDed((ANDing) property)) {
				addAppearances(subProperty, appearances, prefix);
			}
			return;
		}
		case Atomic: {
			Atomic atomic = (Atomic) property;
			for (int i = 0; i < atomic.getArgs().size(); i++) {
				AtomicAppearance appearance = new AtomicAppearance(atomic.getFunction(), i, prefix);
				if (!appearances.containsKey(appearance))
					appearances.put(appearance, new ArrayList<String>());

				appearances.get(appearance).add(atomic.getArgs().get(i));
			}
			return;
		}
		case Negation: {
			addAppearances(((Negation) property).getNegated(), appearances, new NegatedAppearance(prefix));
			return;
		}
		case Quantifier: {
			Quantifier quantifier = (Quantifier) property;
			addAppearances(quantifier.getSubject().getProperty(), appearances,
					new QuantifierAppearance(quantifier, true, prefix));
			addAppearances(quantifier.getPredicate(), appearances, new QuantifierAppearance(quantifier, false, prefix));
			return;
		}
		case Problem:
		case Input:
		case ORing:
			throw new UnsupportedOperationException();
		case BooleanLiteral:
		}
	}
}
