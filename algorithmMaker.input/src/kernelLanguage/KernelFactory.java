package kernelLanguage;

import java.util.*;

import algorithmMaker.util.KernelUtil;
import kernelLanguage.KQuantifier.Quantifier;

//TODO: Comment this and explain (repeat) everything in README file
public class KernelFactory {
	public static final KBooleanLiteral TRUE = new KBooleanLiteral(true);
	public static final KBooleanLiteral FALSE = new KBooleanLiteral(false);

	private static Hashtable<KProperty, Hashtable<KProperty, KANDing>> andings = new Hashtable<KProperty, Hashtable<KProperty, KANDing>>();
	private static Hashtable<KProperty, Hashtable<KProperty, KORing>> orings = new Hashtable<KProperty, Hashtable<KProperty, KORing>>();
	private static Hashtable<String, Hashtable<List<String>, KAtomic>> atomics = new Hashtable<String, Hashtable<List<String>, KAtomic>>();
	private static Hashtable<KProblem, Hashtable<KProblem, KInput>> inputs = new Hashtable<KProblem, Hashtable<KProblem, KInput>>();
	private static Hashtable<KProperty, KNegation> negations = new Hashtable<KProperty, KNegation>();
	private static Hashtable<List<String>, Hashtable<KProperty, KProblem>> problems = new Hashtable<List<String>, Hashtable<KProperty, KProblem>>();
	private static Hashtable<Quantifier, Hashtable<KProblem, KQuantifier>> quantifiers = new Hashtable<Quantifier, Hashtable<KProblem, KQuantifier>>();

	public static final String CHILD_TYPE_MARKER = "child_type_";
	public static final String TYPE_MARKER = "type_";
	public static final String BOUND = "BOUND";
	public static final String UNBOUND = "UNBOUND";
	public static final String LITERAL = "LITERAL";
	public static final String EQUAL = "equal";

	public static final KProblem NULL_PROBLEM = problem(Collections.emptyList(), TRUE);

	public static KQuantifier universalQuantifier(KProblem subject) {
		return quantifier(Quantifier.forall, subject);
	}

	public static KQuantifier existentialQuantifier(KProblem subject) {
		return quantifier(Quantifier.exists, subject);
	}

	public static KQuantifier quantifier(Quantifier quantifier, KProblem subject) {
		if (!quantifiers.containsKey(quantifier))
			quantifiers.put(quantifier, new Hashtable<KProblem, KQuantifier>());

		if (!quantifiers.get(quantifier).containsKey(subject))
			quantifiers.get(quantifier).put(subject, new KQuantifier(quantifier, subject));

		return quantifiers.get(quantifier).get(subject);
	}

	public static KProblem problem(KProperty property, String... varsTemp) {
		return problem(Arrays.asList(varsTemp), property);
	}

	public static KProblem problem(Collection<String> varsTemp, KProperty property) {
		List<String> vars = Collections.unmodifiableList(new ArrayList<String>(varsTemp));
		if (!problems.containsKey(vars))
			problems.put(vars, new Hashtable<KProperty, KProblem>());

		if (!problems.get(vars).containsKey(property)) {
			KProblem initial = new KProblem(vars, property);
			problems.get(vars).put(property, initial);
			problems.get(vars).put(property, KernelUtil.cleanDeclarations(initial));
		}

		return problems.get(vars).get(property);
	}

	public static KProperty negate(KProperty negated) {
		if (negated instanceof KNegation)
			return ((KNegation) negated).negated;

		if (!negations.containsKey(negated))
			negations.put(negated, new KNegation(negated));

		return negations.get(negated);
	}

	public static KInput input(KProblem given, KProblem goal) {
		if (!inputs.containsKey(given))
			inputs.put(given, new Hashtable<KProblem, KInput>());

		if (!inputs.get(given).containsKey(goal)) {
			KInput initial = new KInput(given, goal);
			inputs.get(given).put(goal, initial);
			inputs.get(given).put(goal, KernelUtil.cleanDeclarations(initial));
		}

		return inputs.get(given).get(goal);
	}

	public static KBooleanLiteral bool(boolean value) {
		return value ? TRUE : FALSE;
	}

	public static KQuantifier generalImplication(KProperty lhs, KProperty rhs) {
		HashSet<String> undeclaredVars = KernelUtil.getUndeclaredVars(lhs);
		undeclaredVars.addAll(KernelUtil.getUndeclaredVars(rhs));
		return quantifier(KQuantifier.Quantifier.forall, problem(undeclaredVars, implication(lhs, rhs)));
	}

	public static KORing implication(KProperty lhs, KProperty rhs) {
		return or(negate(lhs), rhs);
	}

	public static KAtomic atomic(String function, String... args) {
		for (char c : function.toCharArray())
			if (!Character.isAlphabetic(c) && !Character.isDigit(c) && c != '_')
				throw new IllegalArgumentException("The character " + c + " is not allowed in atomic names.");

		return atomic(function, Arrays.asList(args));
	}

	public static KAtomic atomic(String function, Collection<String> argsTemp) {
		List<String> args = Collections.unmodifiableList(new ArrayList<String>(argsTemp));
		if (!atomics.containsKey(function))
			atomics.put(function, new Hashtable<List<String>, KAtomic>());

		if (!atomics.get(function).containsKey(args))
			atomics.get(function).put(args, new KAtomic(function, args));

		return atomics.get(function).get(args);
	}

	public static KANDing and(KProperty lhs, KProperty rhs) {
		if (lhs instanceof KANDing)
			return and(((KANDing) lhs).lhs, and(((KANDing) lhs).rhs, rhs));

		if (!andings.containsKey(lhs))
			andings.put(lhs, new Hashtable<KProperty, KANDing>());

		if (!andings.get(lhs).containsKey(rhs))
			andings.get(lhs).put(rhs, new KANDing(lhs, rhs));

		return andings.get(lhs).get(rhs);
	}

	public static KProperty and(KProperty... contents) {
		return and(Arrays.asList(contents));
	}

	public static KProperty and(List<? extends KProperty> contents) {
		int index = contents.size() - 1;
		KProperty rhs = null;
		while (rhs == null) {
			if (index == -1)
				return null;

			rhs = contents.get(index--);
		}
		for (; index >= 0; index--) {
			if (contents.get(index) != null)
				rhs = and(contents.get(index), rhs);
		}
		return rhs;
	}

	public static KORing or(KProperty lhs, KProperty rhs) {
		if (lhs instanceof KORing)
			return or(((KORing) lhs).lhs, or(((KORing) lhs).rhs, rhs));

		if (!orings.containsKey(lhs))
			orings.put(lhs, new Hashtable<KProperty, KORing>());

		if (!orings.get(lhs).containsKey(rhs))
			orings.get(lhs).put(rhs, new KORing(lhs, rhs));

		return orings.get(lhs).get(rhs);
	}

	public static KProperty or(KProperty... contents) {
		return or(Arrays.asList(contents));
	}

	public static KProperty or(List<? extends KProperty> contents) {
		int index = contents.size() - 1;
		KProperty rhs = null;
		while (rhs == null) {
			if (index == -1)
				return null;

			rhs = contents.get(index--);
		}
		for (; index >= 0; index--) {
			if (contents.get(index) != null)
				rhs = or(contents.get(index), rhs);
		}
		return rhs;
	}

	public static boolean isTypeAtomic(String function) {
		return function != null && function.startsWith(TYPE_MARKER);
	}

	public static boolean isChildTypeAtomic(String function) {
		return function != null && function.startsWith(CHILD_TYPE_MARKER);
	}

	public static String getDeclaredType(String function) {
		return function.substring(TYPE_MARKER.length());
	}

	public static String getDeclaredChildType(String function) {
		return function.substring(CHILD_TYPE_MARKER.length());
	}
}
