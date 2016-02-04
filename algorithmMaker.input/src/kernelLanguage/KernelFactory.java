package kernelLanguage;

import java.util.*;

import algorithmMaker.util.KernelUtil;
import kernelLanguage.KQuantifier.Quantifier;

public class KernelFactory {
	private static Hashtable<KProperty, Hashtable<KProperty, KANDing>> andings = new Hashtable<KProperty, Hashtable<KProperty, KANDing>>();
	private static Hashtable<String, Hashtable<List<String>, KAtomic>> atomics = new Hashtable<String, Hashtable<List<String>, KAtomic>>();
	public static final KBooleanLiteral TRUE = new KBooleanLiteral(true);
	public static final KBooleanLiteral FALSE = new KBooleanLiteral(false);
	public static Hashtable<KProblem, Hashtable<KProblem, KInput>> inputs = new Hashtable<KProblem, Hashtable<KProblem, KInput>>();
	private static Hashtable<KProperty, KNegation> negations = new Hashtable<KProperty, KNegation>();
	private static Hashtable<List<String>, Hashtable<KProperty, KProblem>> problems = new Hashtable<List<String>, Hashtable<KProperty, KProblem>>();
	private static Hashtable<Quantifier, Hashtable<KProblem, Hashtable<KProperty, KQuantifier>>> quantifiers = new Hashtable<Quantifier, Hashtable<KProblem, Hashtable<KProperty, KQuantifier>>>();
	private static Hashtable<KProperty, Hashtable<KProperty, KTheorem>> theorems = new Hashtable<KProperty, Hashtable<KProperty, KTheorem>>();

	public static final String TYPE_MARKER = "type_";
	public static final String BOUND = "BOUND";
	public static final String UNBOUND = "UNBOUND";
	public static final String EQUAL = "equal";
	public static final String ADDITION = "plus";
	public static final String SUBTRACTION = "minus";
	public static final String MULTIPLICATION = "times";
	public static final String DIVISION = "divide";

	/**
	 * The theorem used to defend proofs done where no defense should be needed. A "dummy" theorem. Used for internal
	 * proving and the like.
	 */
	public static final KTheorem NULL = new KTheorem(null, null, 0, "NULL");
	public static final KTheorem GIVEN = new KTheorem(null, null, 0, "GIVEN");
	public static final KTheorem REFLEXIVE = new KTheorem(null, null, 0, "Reflexive Property");
	public static final KTheorem GOAL = new KTheorem(null, null, 0, "GOAL");
	public static final KTheorem EQUALITY = new KTheorem(null, null, 0, "Equal variables share properties.");

	public static final KProblem NULL_PROBLEM = problem(Collections.emptyList(), TRUE);

	public static KTheorem theorem(KProperty requirement, KProperty result, int cost, String description) {
		if (!theorems.containsKey(requirement))
			theorems.put(requirement, new Hashtable<KProperty, KTheorem>());

		if (!theorems.get(requirement).containsKey(result))
			theorems.get(requirement).put(result, new KTheorem(requirement, result, cost, description));

		KTheorem ret = theorems.get(requirement).get(result);
		if (cost != ret.cost)
			throw new RuntimeException("Cannot have multiple costs for the same theorem.");

		if (!Objects.equals(description, ret.description)) {
			System.err.println("Multiple descriptions for theorem:" + ret);
			System.err.println("Original was " + ret.description);
			System.err.println("New is " + description);
			throw new RuntimeException("Cannot have multiple descriptions for the same theorem.");
		}

		return ret;
	}

	public static KQuantifier quantifier(Quantifier quantifier, KProblem subject, KProperty predicate) {
		if (!quantifiers.containsKey(quantifier))
			quantifiers.put(quantifier, new Hashtable<KProblem, Hashtable<KProperty, KQuantifier>>());

		if (!quantifiers.get(quantifier).containsKey(subject))
			quantifiers.get(quantifier).put(subject, new Hashtable<KProperty, KQuantifier>());

		if (!quantifiers.get(quantifier).get(subject).containsKey(predicate)) {
			KQuantifier initial = new KQuantifier(quantifier, subject, predicate);
			quantifiers.get(quantifier).get(subject).put(predicate, initial);
			quantifiers.get(quantifier).get(subject).put(predicate, KernelUtil.cleanDeclarations(initial));
		}

		return quantifiers.get(quantifier).get(subject).get(predicate);
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

	public static KNegation negate(KProperty negated) {
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
		if (lhs instanceof KANDing) {
			return and(((KANDing) lhs).lhs, and(((KANDing) lhs).rhs, rhs));
		}
		if (!andings.containsKey(lhs))
			andings.put(lhs, new Hashtable<KProperty, KANDing>());

		if (!andings.get(lhs).containsKey(rhs))
			andings.get(lhs).put(rhs, new KANDing(lhs, rhs));

		return andings.get(lhs).get(rhs);
	}

	public static KProperty and(KProperty... contents) {
		return and(Arrays.asList(contents));
	}

	public static KProperty and(List<KProperty> contents) {
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
}
