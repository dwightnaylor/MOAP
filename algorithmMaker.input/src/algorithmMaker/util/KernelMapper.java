package algorithmMaker.util;

import static kernelLanguage.KQuantifier.Quantifier.*;
import static kernelLanguage.KernelFactory.*;

import java.util.*;
import java.util.function.Function;

import kernelLanguage.*;

public abstract class KernelMapper implements Function<KObject, KObject> {

	public static final KernelMapper DEVARRER = new KernelMapper() {
		@Override
		public KObject calculateConversion(KObject object) {
			if (object instanceof KAtomic)
				return atomic(((KAtomic) object).function, Collections.nCopies(((KAtomic) object).args.size(), "_"));

			if (object instanceof KProblem)
				return problem(Collections.nCopies(((KProblem) object).vars.size(), "_"), ((KProblem) object).property);

			return object;
		}
	};

	public static final KernelMapper ORDER_CANONICALIZER = new KernelMapper() {
		@Override
		public KObject calculateConversion(KObject object) {
			if (object == null)
				return null;

			// Rules added according to their listing at
			// http://integral-table.com/downloads/logic.pdf

			switch (KernelUtil.KType(object)) {
			case KANDing: {
				// RULE: Idempotent
				HashSet<KProperty> hashedANDed = new HashSet<KProperty>(KernelUtil.getANDed((KANDing) object));

				// RULE: Identity
				hashedANDed.remove(TRUE);
				if (hashedANDed.isEmpty())
					return TRUE;
				// RULE: Universal Bound
				if (hashedANDed.contains(FALSE))
					return FALSE;
				// RULE: Negation
				for (KProperty possibleNegation : hashedANDed)
					if (possibleNegation instanceof KNegation
							&& hashedANDed.contains(((KNegation) possibleNegation).negated))
						return FALSE;
				// RULE: Absorption removed because ORing was taken out

				ArrayList<KProperty> andedNoRepeats = new ArrayList<KProperty>(hashedANDed);
				// RULE: Commutative
				Collections.sort(andedNoRepeats, KernelUtil.KERNEL_COMPARATOR);
				andedNoRepeats.replaceAll(x -> (KProperty) calculateConversion(x));
				return and(andedNoRepeats);
			}
			case KNegation: {
				KNegation negation = (KNegation) object;
				// RULE: Double Negative
				KProperty negated = negation.negated;
				if (negated instanceof KNegation)
					return calculateConversion(((KNegation) negated).negated);

				// RULE: Demorgan's Law (AND) removed since ORing was removed
				// RULE: Demorgan's Law (OR) removed since ORing was removed
				// RULE: Quantifier Negation Sinking
				if (negated instanceof KQuantifier) {
					KQuantifier quantifier = (KQuantifier) negated;
					if (quantifier.isUniversal())
						return quantifier(exists, quantifier.subject, negate(quantifier.predicate));
					else
						return quantifier(forall, quantifier.subject, negate(quantifier.predicate));
				}

				return negation;
			}
			case KQuantifier: {
				KQuantifier quantifier = (KQuantifier) object;
				KProperty newSubject = (KProperty) calculateConversion(quantifier.subject.property);
				KProperty newPredicate = (KProperty) calculateConversion(quantifier.predicate);
				// TODO (low): Deal with quantifier ordering (FA(E) vs E(FA))
				// TODO (low): Deal with quantifier splitting
				KProperty ret;
				if (newSubject.equals(KernelFactory.TRUE)) {
					ret = newPredicate;
				} else if (newSubject.equals(KernelFactory.FALSE)) {
					return null;
				} else {
					ret = quantifier(quantifier.quantifier, problem(quantifier.subject.vars, newSubject), newPredicate);
				}
				// This whole block is breaking up the quantifier into distinct
				// problems if there are several unrelated things inside one
				// quantifier.
				ArrayList<ArrayList<String>> distinctProblems = KernelUtil.getDistinctProblems(ret);
				KProperty[] andResults = new KProperty[distinctProblems.size()];
				for (int i = 0; i < distinctProblems.size(); i++) {
					ArrayList<String> var = distinctProblems.get(i);
					andResults[i] = (KProperty) KernelUtil.map(KernelUtil.map(ret, new KernelMapper() {
						@Override
						public KObject calculateConversion(KObject object) {
							if (object instanceof KAtomic) {
								KAtomic atomic = (KAtomic) object;
								for (String arg : atomic.args) {
									if (!var.contains(arg))
										return null;
								}
							}
							if (object instanceof KProblem) {
								ArrayList<String> varsToInclude = new ArrayList<String>(((KProblem) object).vars);
								varsToInclude.removeIf(x -> !var.contains(x));
								return ((KProblem) object).withVars(varsToInclude);
							}
							return object;
						}
					}), ORDER_CANONICALIZER);
				}
				return KernelFactory.and(andResults);
			}
			case KBooleanLiteral:
			case KAtomic:
			case KInput:
			case KProblem:
			}
			return object;
		}
	};

	final HashMap<KObject, KObject> cache = new HashMap<KObject, KObject>();

	@Override
	public final KObject apply(KObject object) {
		if (!cache.containsKey(object)) {
			// Use this as a placeholder, also prevents recursion.
			cache.put(object, object);
			cache.put(object, calculateConversion(object));
		}

		return cache.get(object);
	}

	public abstract KObject calculateConversion(KObject object);
}