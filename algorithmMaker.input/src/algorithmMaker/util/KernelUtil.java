package algorithmMaker.util;

import static kernelLanguage.KernelFactory.*;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import algorithmMaker.QuickParser;
import algorithmMaker.input.Theorem;
import kernelLanguage.*;

public class KernelUtil {

	public static final Comparator<KObject> KERNEL_COMPARATOR = new Comparator<KObject>() {
		@Override
		public int compare(KObject input1, KObject input2) {
			return input1.toString().compareTo(input2.toString());
		}
	};

	public static enum KType {
		KANDing, KAtomic, KBooleanLiteral, KInput, KNegation, KProblem, KQuantifier
	}

	public static KType KType(KObject object) {
		if (object instanceof KANDing)
			return KType.KANDing;
		if (object instanceof KAtomic)
			return KType.KAtomic;
		if (object instanceof KBooleanLiteral)
			return KType.KBooleanLiteral;
		if (object instanceof KInput)
			return KType.KInput;
		if (object instanceof KNegation)
			return KType.KNegation;
		if (object instanceof KProblem)
			return KType.KProblem;
		if (object instanceof KQuantifier)
			return KType.KQuantifier;

		throw new UnsupportedOperationException();
	}

	public static KInput parseInput(String string) {
		return (KInput) SugarUtil.convertToKernel(QuickParser.parseInput(string));
	}

	public static KProperty parseProperty(String string) {
		return (KProperty) SugarUtil.convertToKernel(QuickParser.parseProperty(string));
	}

	public static KTheorem parseTheorem(String string) {
		Theorem sugarTheorem = QuickParser.parseTheorem(string);
		return KernelFactory.theorem((KProperty) SugarUtil.convertToKernel(sugarTheorem.getRequirement()),
				(KProperty) SugarUtil.convertToKernel(sugarTheorem.getResult()), sugarTheorem.getCost(),
				sugarTheorem.getDescription());
	}

	public static HashSet<KAtomic> getAtomics(KObject object, String function) {
		HashSet<KAtomic> atomics = new HashSet<KAtomic>();
		accumulate(object, new Consumer<KObject>() {
			@Override
			public void accept(KObject t) {
				if (t instanceof KAtomic && ((KAtomic) t).function.equals(function))
					atomics.add((KAtomic) t);
			}
		});
		return atomics;
	}

	public static boolean isStructural(String function) {
		return function.equals(BOUND) || function.equals(UNBOUND) || function.equals(EQUAL);
	}

	public static HashSet<String> getDeclaredVars(KObject object) {
		HashSet<String> declaredVars = new HashSet<String>();
		accumulate(object, new Consumer<KObject>() {
			@Override
			public void accept(KObject k) {
				if (k instanceof KProblem)
					declaredVars.addAll(((KProblem) k).vars);
			}
		});
		return declaredVars;
	}

	public static HashSet<String> getUndeclaredVars(KObject object) {
		HashSet<String> undeclaredVars = new HashSet<String>();
		addUndeclaredVars(object, undeclaredVars, new HashSet<String>());
		return undeclaredVars;
	}

	private static void addUndeclaredVars(KObject object, HashSet<String> undeclaredVars, HashSet<String> declaredVars) {
		switch (KType(object)) {
		case KANDing:
			KANDing anding = (KANDing) object;
			addUndeclaredVars(anding.lhs, undeclaredVars, declaredVars);
			addUndeclaredVars(anding.rhs, undeclaredVars, declaredVars);
			break;
		case KInput:
			KInput input = (KInput) object;
			declaredVars.addAll(input.given.vars);
			addUndeclaredVars(input.given.property, undeclaredVars, declaredVars);
			addUndeclaredVars(input.goal, undeclaredVars, declaredVars);
			declaredVars.removeAll(input.given.vars);
			break;
		case KNegation:
			KNegation negation = (KNegation) object;
			addUndeclaredVars(negation.negated, undeclaredVars, declaredVars);
			break;
		case KProblem:
			declaredVars.addAll(((KProblem) object).vars);
			addUndeclaredVars(((KProblem) object).property, undeclaredVars, declaredVars);
			declaredVars.removeAll(((KProblem) object).vars);
			break;
		case KQuantifier:
			KQuantifier quantifier = (KQuantifier) object;
			declaredVars.addAll(quantifier.subject.vars);
			addUndeclaredVars(quantifier.subject.property, undeclaredVars, declaredVars);
			addUndeclaredVars(quantifier.predicate, undeclaredVars, declaredVars);
			declaredVars.removeAll(quantifier.subject.vars);
			break;
		case KAtomic:
			undeclaredVars.addAll(((KAtomic) object).args.stream().filter(x -> !declaredVars.contains(x))
					.collect(Collectors.toList()));
		case KBooleanLiteral:
		}
	}

	@SuppressWarnings("unchecked")
	public static <T extends KObject> T revar(T object, Hashtable<String, String> revars) {
		return (T) map(object, new KernelMapper() {
			@Override
			public KObject calculateConversion(KObject object) {
				Function<String, String> replacer = x -> revars.containsKey(x) ? revars.get(x) : x;
				if (object instanceof KAtomic)
					return atomic(((KAtomic) object).function,
							((KAtomic) object).args.stream().map(replacer).collect(Collectors.toList()));

				if (object instanceof KProblem)
					return problem(((KProblem) object).vars.stream().map(replacer).collect(Collectors.toList()),
							((KProblem) object).property);

				return object;
			}
		});
	}

	public static ArrayList<KProperty> getANDed(KANDing a) {
		ArrayList<KProperty> ret = new ArrayList<KProperty>();
		addANDed(a, ret);
		return ret;
	}

	public static void addANDed(KANDing a, ArrayList<KProperty> list) {
		if (a.lhs instanceof KANDing)
			addANDed((KANDing) a.lhs, list);
		else
			list.add(a.lhs);

		if (a.rhs instanceof KANDing)
			addANDed((KANDing) a.rhs, list);
		else
			list.add(a.rhs);
	}

	@SuppressWarnings("unchecked")
	public static <T extends KObject> T devar(T object) {
		return (T) map(object, KernelMapper.DEVARRER);
	}

	public static KObject canonicalize(KObject object) {
		return map(object, KernelMapper.CANONICALIZER);
	}

	public static ArrayList<KObject> contents(KObject object) {
		ArrayList<KObject> ret = new ArrayList<KObject>();
		accumulate(object, new Consumer<KObject>() {
			@Override
			public void accept(KObject t) {
				ret.add(t);
			}
		});
		return ret;
	}

	public static ArrayList<String> variables(KObject object) {
		ArrayList<String> ret = new ArrayList<String>();
		accumulate(object, new Consumer<KObject>() {
			@Override
			public void accept(KObject t) {
				if (t instanceof KAtomic)
					ret.addAll(((KAtomic) t).args);
			}
		});
		return ret;
	}

	public static void accumulate(KObject object, Consumer<KObject> accumulator) {
		accumulator.accept(object);
		switch (KType(object)) {
		case KANDing:
			accumulate(((KANDing) object).lhs, accumulator);
			accumulate(((KANDing) object).rhs, accumulator);
			break;
		case KInput:
			accumulate(((KInput) object).given, accumulator);
			accumulate(((KInput) object).goal, accumulator);
			break;
		case KNegation:
			accumulate(((KNegation) object).negated, accumulator);
			break;
		case KProblem:
			accumulate(((KProblem) object).property, accumulator);
			break;
		case KQuantifier:
			accumulate(((KQuantifier) object).subject, accumulator);
			accumulate(((KQuantifier) object).predicate, accumulator);
			break;
		case KAtomic:
		case KBooleanLiteral:
		}
	}

	public static KObject map(KObject object, KernelMapper mapper) {
		if (object == null)
			return null;

		if (!mapper.cache.containsKey(object))
			switch (KType(object)) {
			case KANDing:
				KANDing anding = ((KANDing) object);
				KObject andLeft = map(anding.lhs, mapper);
				KObject andRight = map(anding.rhs, mapper);
				if (andLeft != null && andRight != null) {
					mapper.cache.put(object, mapper.apply(and((KProperty) andLeft, (KProperty) andRight)));
					break;
				}

				if (andLeft != null) {
					mapper.cache.put(object, andLeft);
					break;
				}
				if (andRight != null) {
					mapper.cache.put(object, andRight);
					break;
				}

				mapper.cache.put(object, null);
				break;
			case KInput:
				KInput input = (KInput) object;
				KObject newGiven = map(input.given, mapper);
				KObject newGoal = map(input.goal, mapper);

				mapper.cache.put(object, mapper.apply(input((KProblem) newGiven, (KProblem) newGoal)));
				break;
			case KNegation:
				KObject negated = map(((KNegation) object).negated, mapper);
				if (negated == null) {
					mapper.cache.put(object, null);
					break;
				}

				mapper.cache.put(object, mapper.apply(negate((KProperty) negated)));
				break;
			case KProblem:
				KProperty reducedProperty = (KProperty) map(((KProblem) object).property, mapper);
				mapper.cache.put(object, mapper.apply(problem(((KProblem) object).vars, reducedProperty == null ? TRUE
						: reducedProperty)));
				break;
			case KQuantifier:
				KQuantifier quantifier = (KQuantifier) object;
				KObject subject = map(quantifier.subject, mapper);
				KObject predicate = map(quantifier.predicate, mapper);
				if (subject == null || predicate == null) {
					mapper.cache.put(object, null);
					break;
				}

				mapper.cache.put(object, mapper.apply(quantifier(((KQuantifier) object).quantifier, (KProblem) subject,
						(KProperty) predicate)));
				break;

			case KAtomic:
			case KBooleanLiteral:
				mapper.cache.put(object, mapper.apply(object));
			}

		return mapper.cache.get(object);
	}

}
