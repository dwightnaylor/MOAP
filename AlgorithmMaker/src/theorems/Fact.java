package theorems;

import static algorithmMaker.util.KernelUtil.*;
import static kernelLanguage.KernelFactory.*;

import kernelLanguage.*;
import solver.Chainer;

/**
 * @author dwight
 *
 * @param <T>
 *            Should be either an atomic...or???
 */
public class Fact<T extends KProperty> {
	private static final String CONVERSE = "Converse of:";
	private static final String GIVEN = "Given";
	public T property;
	public Fact<? extends KProperty>[] prerequisites;
	public String description;
	/**
	 * Determines if this fact is real, or is just a pseudofact used for chaining effects.
	 */
	public final boolean isRealFact;

	@SafeVarargs
	public Fact(T property, String description, Fact<? extends KProperty>... prerequisites) {
		this(property, true, description, prerequisites);
	}

	@SuppressWarnings("unchecked")
	@SafeVarargs
	public Fact(T property, boolean isRealFact, String description, Fact<? extends KProperty>... prerequisites) {
		this.isRealFact = isRealFact;
		this.property = (T) canonicalizeOrder(property);
		this.description = description;
		this.prerequisites = prerequisites;
	}

	@Override
	public String toString() {
		return "Fact[" + property.toString() + "]";
	}

	@Override
	public int hashCode() {
		return property.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof Fact && ((Fact<?>) obj).property == property;
	}

	public static Fact<KProperty> given(String propertyString) {
		return new Fact<KProperty>(parseProperty(propertyString), GIVEN);
	}

	public static Fact<KQuantifier> givenTheorem(String propertyString, String... description) {
		return givenTheorem(parseProperty(propertyString), description);
	}

	public static Fact<KQuantifier> givenTheorem(KProperty property, String... description) {
		if (description.length > 1)
			throw new UnsupportedOperationException("'description' is a zero or one optional variable");

		return new Fact<KQuantifier>(universalQuantifier(problem(getUndeclaredVars(property), property)),
				description.length == 0 ? GIVEN : description[0]);
	}

	public boolean hasConverse() {
		return property instanceof KORing
				|| (property instanceof KQuantifier && ((KQuantifier) property).subject.property instanceof KORing);
	}

	@SuppressWarnings("unchecked")
	public Fact<T> getConverse() {
		String newDescription = (description != null && description.startsWith(CONVERSE)) ? description
				: (CONVERSE + description);
		if ((property instanceof KORing))
			return new Fact<T>(
					(T) canonicalizeOrder(or(negate(((KORing) property).lhs), negate(((KORing) property).rhs))), false,
					newDescription, prerequisites);
		else if (property instanceof KQuantifier && ((KQuantifier) property).subject.property instanceof KORing) {
			KQuantifier quantifier = (KQuantifier) property;
			KORing oring = (KORing) quantifier.subject.property;
			return new Fact<T>(
					(T) quantifier
							.withProperty((KProperty) canonicalizeOrder(or(negate(oring.lhs), negate(oring.rhs)))),
					false, newDescription, prerequisites);
		}

		Chainer.printJustificationFor(this);
		throw new UnsupportedOperationException("Can only find the converse of an ORing or ORing quantifier.");
	}
}
