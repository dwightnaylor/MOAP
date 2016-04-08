package algorithmMaker.util;

import static kernelLanguage.KQuantifier.Quantifier.*;
import static kernelLanguage.KernelFactory.*;
import static algorithmMaker.util.KernelUtil.*;

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
				// RULE: Absorption
				ArrayList<KORing> orings = new ArrayList<KORing>();
				HashSet<KProperty> toRemove = new HashSet<KProperty>();
				for (KProperty possibleORing : hashedANDed)
					if (possibleORing instanceof KORing) {
						orings.add((KORing) possibleORing);
						for (KProperty ORed : getORed(possibleORing))
							toRemove.add(ORed);
					}

				hashedANDed.removeAll(toRemove);
				// RULE: Absorption (for ANDs of ORs)
				// TODO: Make absorption rule more efficient for ANDings
				for (int i = 0; i < orings.size(); i++) {
					HashSet<KProperty> cur = new HashSet<KProperty>(getORed(orings.get(i)));
					for (int j = i + 1; j < orings.size(); j++) {
						ArrayList<KProperty> inner = getORed(orings.get(j));
						if (cur.size() > inner.size()) {
							boolean cut = true;
							for (KProperty innerProperty : inner)
								if (!cur.contains(innerProperty)) {
									cut = false;
									break;
								}

							if (cut)
								hashedANDed.remove(orings.get(j));
						}
					}
				}

				ArrayList<KProperty> andedNoRepeats = new ArrayList<KProperty>(hashedANDed);
				// RULE: Commutative
				Collections.sort(andedNoRepeats, KernelUtil.KERNEL_COMPARATOR);
				andedNoRepeats.replaceAll(x -> (KProperty) calculateConversion(x));
				return and(andedNoRepeats);
			}
			case KORing: {
				// RULE: Idempotent
				HashSet<KProperty> hashedORed = new HashSet<KProperty>(KernelUtil.getORed((KORing) object));

				// RULE: Identity
				hashedORed.remove(FALSE);
				if (hashedORed.isEmpty())
					return FALSE;
				// RULE: Universal Bound
				if (hashedORed.contains(TRUE))
					return TRUE;
				// RULE: Negation
				for (KProperty possibleNegation : hashedORed)
					if (possibleNegation instanceof KNegation
							&& hashedORed.contains(((KNegation) possibleNegation).negated))
						return TRUE;
				// RULE: Absorption
				for (KProperty possibleANDing : hashedORed)
					if (possibleANDing instanceof KANDing)
						for (KProperty ANDed : getANDed(possibleANDing))
							if (hashedORed.contains(ANDed)) {
								hashedORed.remove(possibleANDing);
								break;
							}

				ArrayList<KProperty> oredNoRepeats = new ArrayList<KProperty>(hashedORed);
				// RULE: Commutative
				Collections.sort(oredNoRepeats, KernelUtil.KERNEL_COMPARATOR);
				oredNoRepeats.replaceAll(x -> (KProperty) calculateConversion(x));
				return or(oredNoRepeats);
			}
			case KNegation: {
				KNegation negation = (KNegation) object;
				// RULE: Double Negative
				KProperty negated = negation.negated;
				if (negated instanceof KNegation)
					return calculateConversion(((KNegation) negated).negated);

				// RULE: Demorgan's Law (AND)
				if (negated instanceof KANDing) {
					ArrayList<KProperty> children = getANDed(negated);
					children.replaceAll(x -> negate(x));
					return or(children);
				}
				// RULE: Demorgan's Law (OR)
				if (negated instanceof KORing) {
					ArrayList<KProperty> children = getORed(negated);
					children.replaceAll(x -> negate(x));
					return and(children);
				}
				// RULE: Quantifier Negation Sinking
				if (negated instanceof KQuantifier) {
					KQuantifier quantifier = (KQuantifier) negated;
					KProperty newProperty = (KProperty) calculateConversion(negate(quantifier.subject.property));
					if (quantifier.isUniversal())
						return quantifier(exists, quantifier.subject.withProperty(newProperty));
					else
						return quantifier(forall, quantifier.subject.withProperty(newProperty));
				}

				return negation;
			}
			case KQuantifier: {
				KQuantifier quantifier = (KQuantifier) object;
				KProperty newSubject = (KProperty) calculateConversion(quantifier.subject.property);
				// TODO (low): Deal with quantifier ordering (FA(E) vs E(FA))
				// TODO (low): Deal with quantifier splitting
				if (newSubject.equals(TRUE)) {
					return TRUE;
				} else if (newSubject.equals(FALSE)) {
					return FALSE;
				}

				if (!quantifier.isUniversal() && newSubject instanceof KORing) {
					ArrayList<KQuantifier> oredQuantifiers = new ArrayList<KQuantifier>();
					for (KProperty ored : getORed(newSubject))
						oredQuantifiers.add(quantifier(exists, problem(quantifier.subject.vars, ored)));

					return or(oredQuantifiers);
				}

				if (quantifier.isUniversal() && newSubject instanceof KANDing) {
					ArrayList<KQuantifier> andedQuantifiers = new ArrayList<KQuantifier>();
					for (KProperty anded : getANDed(newSubject))
						andedQuantifiers.add(quantifier(forall, problem(quantifier.subject.vars, anded)));

					return and(andedQuantifiers);
				}

				return quantifier(quantifier.quantifier, quantifier.subject.withProperty(newSubject));
				// This whole block is breaking up the quantifier into distinct
				// problems if there are several unrelated things inside one
				// quantifier.
				// TODO: Split unrelated quantifier pieces
				// ArrayList<ArrayList<String>> distinctProblems = KernelUtil.getDistinctProblems(ret);
				// KProperty[] andResults = new KProperty[distinctProblems.size()];
				// for (int i = 0; i < distinctProblems.size(); i++) {
				// ArrayList<String> var = distinctProblems.get(i);
				// andResults[i] = (KProperty) KernelUtil.map(KernelUtil.map(ret, new KernelMapper() {
				// @Override
				// public KObject calculateConversion(KObject object) {
				// if (object instanceof KAtomic) {
				// KAtomic atomic = (KAtomic) object;
				// for (String arg : atomic.args) {
				// if (!var.contains(arg))
				// return null;
				// }
				// }
				// if (object instanceof KProblem) {
				// ArrayList<String> varsToInclude = new ArrayList<String>(((KProblem) object).vars);
				// varsToInclude.removeIf(x -> !var.contains(x));
				// return ((KProblem) object).withVars(varsToInclude);
				// }
				// return object;
				// }
				// }), ORDER_CANONICALIZER);
				// }
				// return and(andResults);
			}
			case KInput:
				KInput input = (KInput) object;
				return input((KProblem) calculateConversion(input.given), (KProblem) calculateConversion(input.goal));
			case KProblem:
				KProblem problem = (KProblem) object;
				ArrayList<String> newVars = new ArrayList<String>(problem.vars);
				Collections.sort(newVars);
				return problem(newVars, (KProperty) calculateConversion(problem.property));
			case KBooleanLiteral:
			case KAtomic:
			}
			return object;
		}
	};

	public static final KernelMapper FULL_CANONICALIZER_HELPER = new KernelMapper() {
		@Override
		public KObject calculateConversion(KObject object) {
			if (object == null)
				return null;

			// Rules added according to their listing at
			// http://integral-table.com/downloads/logic.pdf

			switch (KernelUtil.KType(object)) {
			case KANDing: {
				ArrayList<KProperty> anded = new ArrayList<KProperty>(KernelUtil.getANDed((KProperty) object));
				anded.replaceAll(x -> (KProperty) calculateConversion(x));
				Collections.sort(anded, KernelUtil.KERNEL_COMPARATOR);
				return and(anded);
			}
			case KORing: {
				ArrayList<KProperty> ored = new ArrayList<KProperty>(KernelUtil.getORed((KProperty) object));
				ored.replaceAll(x -> (KProperty) calculateConversion(x));
				Collections.sort(ored, KernelUtil.KERNEL_COMPARATOR);
				return or(ored);
			}
			case KNegation:
				return negate((KProperty) calculateConversion(((KNegation) object).negated));
			case KQuantifier:
				return quantifier(((KQuantifier) object).quantifier,
						(KProblem) calculateConversion(((KQuantifier) object).subject));
			case KInput:
				KInput input = (KInput) object;
				return input((KProblem) calculateConversion(input.given), (KProblem) calculateConversion(input.goal));
			case KProblem:
				KProblem problem = (KProblem) object;
				ArrayList<String> newVars = new ArrayList<String>(problem.vars);
				Collections.sort(newVars);
				return problem(newVars, (KProperty) calculateConversion(problem.property));
			case KBooleanLiteral:
			case KAtomic:
			}
			return object;
		}
	};

	final HashMap<KObject, KObject> cache = new HashMap<KObject, KObject>();

	protected boolean useCache() {
		return true;
	}

	/**
	 * By default does nothing. Can be overridden to give a mapper an observation task before an object is used.
	 */
	protected void pre(KObject object) {
		// no-op, can be overwritten.
	}

	/**
	 * By default does nothing. Can be overridden to give a mapper an observation task after an object is used. Note
	 * that the incoming object will be the original object, not the mapped one.
	 */
	protected void post(KObject object) {
		// no-op, can be overwritten.
	}

	@Override
	public final KObject apply(KObject object) {
		if (useCache()) {
			if (!cache.containsKey(object)) {
				// Use this as a placeholder, also prevents recursion.
				cache.put(object, object);
				cache.put(object, calculateConversion(object));
			}

			return cache.get(object);
		} else
			return calculateConversion(object);
	}

	public abstract KObject calculateConversion(KObject object);
}