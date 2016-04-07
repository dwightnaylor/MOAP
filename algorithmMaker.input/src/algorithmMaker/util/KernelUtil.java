package algorithmMaker.util;

import static kernelLanguage.KernelFactory.*;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

import algorithmMaker.QuickParser;
import algorithmMaker.util.equalityTesting.*;
import algorithmMaker.util.metaProperties.Transitivity;
import kernelLanguage.*;

public class KernelUtil {

	/**
	 * Determines whether or not to crash when a nested variable is detected in the program. This includes things like
	 * forall(x st a(x) : forall(x st b(x) : c(x))), where there is an x declared inside a scope where an x has already
	 * been declared.
	 */
	public static final boolean ERROR_ON_NESTED_VARS = false;

	public static final Transitivity TRANSITIVITY = new Transitivity();

	public static final Comparator<KObject> KERNEL_COMPARATOR = new Comparator<KObject>() {
		@Override
		public int compare(KObject input1, KObject input2) {
			return input1.toString().compareTo(input2.toString());
		}
	};

	public static final Comparator<ArrayList<Appearance>> APPEARANCE_COMPARATOR = new Comparator<ArrayList<Appearance>>() {
		@Override
		public int compare(ArrayList<Appearance> a1, ArrayList<Appearance> a2) {
			for (int i = 0; i < Math.max(a1.size(), a2.size()); i++) {
				if (i >= a1.size())
					return 1;
				if (i >= a2.size())
					return -1;

				int currentCompare = a1.get(i).compareTo(a2.get(i));
				if (currentCompare != 0)
					return currentCompare;
			}
			return 0;
		}
	};

	// TODO:DN: Should BooleanLiteral be in the kernel? It should be c14d out.
	public static enum KType {
		KANDing, KAtomic, KBooleanLiteral, KInput, KNegation, KProblem, KQuantifier, KORing
	}

	public static KType KType(KObject object) {
		if (object instanceof KANDing)
			return KType.KANDing;
		if (object instanceof KORing)
			return KType.KORing;
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

	public static ArrayList<ArrayList<String>> getDistinctProblems(KObject property) {
		ArrayList<ArrayList<String>> ret = new ArrayList<ArrayList<String>>();
		Hashtable<String, HashSet<KAtomic>> atomics = new Hashtable<String, HashSet<KAtomic>>();
		accumulate(property, new Consumer<KObject>() {
			@Override
			public void accept(KObject t) {
				if (t instanceof KAtomic)
					for (String var : ((KAtomic) t).args) {
						if (!atomics.containsKey(var))
							atomics.put(var, new HashSet<KAtomic>());

						atomics.get(var).add((KAtomic) t);
					}
			}
		});
		HashSet<String> exploredVars = new HashSet<String>();
		for (String var : atomics.keySet()) {
			if (exploredVars.contains(var))
				continue;
			exploredVars.add(var);

			ArrayList<String> varsInCurrentGroup = new ArrayList<String>(Collections.singleton(var));
			for (int i = 0; i < varsInCurrentGroup.size(); i++) {
				for (KAtomic atomic : atomics.get(varsInCurrentGroup.get(i))) {
					for (String arg : atomic.args) {
						if (exploredVars.contains(arg))
							continue;
						exploredVars.add(arg);

						varsInCurrentGroup.add(arg);
					}
				}
			}
			ret.add(varsInCurrentGroup);
		}
		return ret;
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
		return function.equals(BOUND) || function.equals(UNBOUND) || function.equals(EQUAL) || function.equals(LITERAL);
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

	private static void addUndeclaredVars(KObject object, HashSet<String> undeclaredVars,
			HashSet<String> declaredVars) {
		switch (KType(object)) {
		case KANDing:
			KANDing anding = (KANDing) object;
			addUndeclaredVars(anding.lhs, undeclaredVars, declaredVars);
			addUndeclaredVars(anding.rhs, undeclaredVars, declaredVars);
			break;
		case KORing:
			KORing oring = (KORing) object;
			addUndeclaredVars(oring.lhs, undeclaredVars, declaredVars);
			addUndeclaredVars(oring.rhs, undeclaredVars, declaredVars);
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

	public static ArrayList<KProperty> getORed(KProperty a) {
		ArrayList<KProperty> ret = new ArrayList<KProperty>();
		if (a instanceof KORing) {
			addORed((KORing) a, ret);
		} else {
			ret.add(a);
		}
		return ret;
	}

	private static void addORed(KORing a, ArrayList<KProperty> list) {
		if (a.lhs instanceof KORing)
			addORed((KORing) a.lhs, list);
		else
			list.add(a.lhs);

		if (a.rhs instanceof KORing)
			addORed((KORing) a.rhs, list);
		else
			list.add(a.rhs);
	}

	public static ArrayList<KProperty> getANDed(KProperty a) {
		ArrayList<KProperty> ret = new ArrayList<KProperty>();
		if (a instanceof KANDing) {
			addANDed((KANDing) a, ret);
		} else {
			ret.add(a);
		}
		return ret;
	}

	private static void addANDed(KANDing a, ArrayList<KProperty> list) {
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

	public static KObject canonicalizeOrder(KObject object) {
		KObject cnized = map(object, KernelMapper.ORDER_CANONICALIZER);
		while (cnized != object) {
			object = cnized;
			cnized = map(object, KernelMapper.ORDER_CANONICALIZER);
		}
		return cnized;
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
		case KORing:
			accumulate(((KORing) object).lhs, accumulator);
			accumulate(((KORing) object).rhs, accumulator);
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
			break;
		case KAtomic:
		case KBooleanLiteral:
		}
	}

	public static KObject map(KObject object, KernelMapper mapper) {
		if (object == null)
			return null;

		if (!mapper.cache.containsKey(object) || !mapper.useCache()) {
			mapper.pre(object);
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
			case KORing:
				KORing oring = ((KORing) object);
				KObject orLeft = map(oring.lhs, mapper);
				KObject orRight = map(oring.rhs, mapper);
				if (orLeft != null && orRight != null) {
					mapper.cache.put(object, mapper.apply(or((KProperty) orLeft, (KProperty) orRight)));
					break;
				}

				if (orLeft != null) {
					mapper.cache.put(object, orLeft);
					break;
				}
				if (orRight != null) {
					mapper.cache.put(object, orRight);
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
				mapper.cache.put(object, mapper
						.apply(problem(((KProblem) object).vars, reducedProperty == null ? TRUE : reducedProperty)));
				break;
			case KQuantifier:
				KQuantifier quantifier = (KQuantifier) object;
				KObject subject = map(quantifier.subject, mapper);
				if (subject == null) {
					mapper.cache.put(object, null);
					break;
				}

				mapper.cache.put(object,
						mapper.apply(quantifier(((KQuantifier) object).quantifier, (KProblem) subject)));
				break;

			case KAtomic:
			case KBooleanLiteral:
				mapper.cache.put(object, mapper.apply(object));
			}
			mapper.post(object);
		}

		return mapper.cache.get(object);
	}

	public static boolean isLiteralAtomic(KProperty property) {
		return property instanceof KAtomic && ((KAtomic) property).function.equals(LITERAL);
	}

	public static Hashtable<KObject, KObject> canonicalizations = new Hashtable<KObject, KObject>();

	public static KObject canonicalizeFully(KObject kObject) {
		if (!canonicalizations.containsKey(kObject)) {
			KObject canonicalized = null;
			switch (KType(kObject)) {
			case KAtomic: {
				// Canonicalizing an atomic is easy, just revar to the standard
				Hashtable<String, String> revars = new Hashtable<String, String>();
				ArrayList<String> newVars = new ArrayList<String>();
				for (String originalVar : variables(kObject)) {
					if (!revars.containsKey(originalVar))
						revars.put(originalVar, "v" + revars.size());

					newVars.add(revars.get(originalVar));
				}
				canonicalized = atomic(((KAtomic) kObject).function, newVars);
				break;
			}
			case KProblem:
			case KInput:
			case KQuantifier:
			case KANDing: {
				Hashtable<String, ArrayList<Appearance>> appearances = EqualityTester
						.getAppearances(canonicalizeOrder(kObject));
				ArrayList<String> vars = new ArrayList<String>(new HashSet<String>(variables(kObject)));
				Collections.sort(vars, new Comparator<String>() {
					@Override
					public int compare(String v1, String v2) {
						return APPEARANCE_COMPARATOR.compare(appearances.get(v1), appearances.get(v2));
					}
				});
				Hashtable<String, String> revars = new Hashtable<String, String>();
				int varCount = 0;
				for (String var : vars) {
					revars.put(var, "v" + varCount++);
				}
				canonicalized = canonicalizeOrder(revar(kObject, revars));
				break;
			}
			case KNegation:
				canonicalized = negate((KProperty) canonicalizeFully(((KNegation) kObject).negated));
				break;
			case KBooleanLiteral:
				canonicalized = kObject;
				break;
			case KORing:
				throw new UnsupportedOperationException();
			}
			canonicalizations.put(kObject, canonicalized);
		}
		return canonicalizations.get(kObject);
	}

	public static KInput withMinimumVariables(KInput input) {
		input = input.withGoal(input.goal.withoutVars(input.given.vars));
		return (KInput) KernelUtil.map(input, new KernelMapper() {
			Hashtable<String, Integer> currentVars = new Hashtable<String, Integer>();
			Hashtable<String, String> currentRevars = new Hashtable<String, String>();
			Hashtable<String, Stack<String>> oldRevars = new Hashtable<String, Stack<String>>();
			KInput original;

			Stack<HashSet<String>> unusableVars = new Stack<HashSet<String>>();

			@Override
			protected boolean useCache() {
				return false;
			}

			@Override
			protected void pre(KObject object) {
				if (object instanceof KInput)
					original = (KInput) object;

				if (object instanceof KProblem) {
					HashSet<String> vars = new HashSet<String>();
					KProblem problem = (KProblem) object;
					for (String var : problem.vars) {
						if (currentVars.containsKey(var)) {
							if (currentRevars.containsKey(var)) {
								if (!oldRevars.containsKey(var))
									oldRevars.put(var, new Stack<String>());

								oldRevars.get(var).push(currentRevars.get(var));
							}

							String newVar = InputUtil.getUnusedVar(currentVars.keySet(),
									unusableVars.isEmpty() ? Collections.emptySet() : unusableVars.peek());
							currentRevars.put(var, newVar);
							currentVars.put(newVar, 0);
							vars.add(newVar);
						} else {
							currentVars.put(var, 0);
							vars.add(var);
						}
					}
					unusableVars.push(vars);
				}
			}

			@Override
			protected void post(KObject object) {
				if (object instanceof KProblem) {
					HashSet<String> lastUnusableSet = unusableVars.pop();
					if (!unusableVars.isEmpty())
						unusableVars.peek().addAll(lastUnusableSet);

					KProblem problem = (KProblem) object;
					for (String var : problem.vars) {
						if (currentRevars.containsKey(var)) {
							currentVars.remove(currentRevars.get(var));
							if (oldRevars.containsKey(var) && !oldRevars.get(var).isEmpty()) {
								String oldRevar = oldRevars.get(var).pop();
								currentRevars.put(var, oldRevar);
							} else {
								currentRevars.remove(var);
							}
						} else {
							currentVars.remove(var);
						}
					}
				}
			}

			@Override
			public KObject calculateConversion(KObject object) {
				if (object instanceof KAtomic) {
					KAtomic atomic = (KAtomic) object;
					for (String arg : atomic.args) {
						if (currentVars.containsKey(arg))
							currentVars.put(arg, currentVars.get(arg) + 1);

						if (currentRevars.containsKey(arg)) {
							String revar = currentRevars.get(arg);
							currentVars.put(revar, currentVars.get(revar) + 1);
						}

						if (!currentVars.containsKey(arg))
							if (!currentRevars.containsKey(arg)) {
								if (unusableVars.peek().contains(arg)) {
									if (currentRevars.containsKey(arg)) {
										if (!oldRevars.containsKey(arg))
											oldRevars.put(arg, new Stack<String>());

										oldRevars.get(arg).push(currentRevars.get(arg));
									}
									String newVar = InputUtil.getUnusedVar(currentVars.keySet(), unusableVars.peek());
									currentRevars.put(arg, newVar);
									currentVars.put(newVar, 0);
								} else {
									currentVars.put(arg, 1);
								}
							}
					}
					return KernelUtil.revar(atomic, currentRevars);
				} else if (object instanceof KProblem) {
					// Don't use the built-in revar method because we don't want to rewrite all the sub-objects too.
					HashSet<String> vars = new HashSet<String>();
					KProblem problem = (KProblem) object;
					for (String var : problem.vars) {
						String actualVar = currentRevars.containsKey(var) ? currentRevars.get(var) : var;
						if (currentVars.get(actualVar) > 0)
							vars.add(actualVar);
					}
					ArrayList<String> varList = new ArrayList<String>(vars);
					Collections.sort(varList);
					return problem.withVars(varList);
				} else if (object instanceof KInput) {
					KInput input = (KInput) object;

					HashSet<String> undeclaredInGiven = KernelUtil.getUndeclaredVars(input.given.property);
					HashSet<String> undeclaredInGoal = KernelUtil.getUndeclaredVars(input.goal.property);

					HashSet<String> givenVars = new HashSet<String>(original.given.vars);
					givenVars.addAll(undeclaredInGiven);
					givenVars.removeIf(x -> !undeclaredInGiven.contains(x) && !undeclaredInGoal.contains(x));

					HashSet<String> goalVars = new HashSet<String>(undeclaredInGoal);
					goalVars.removeAll(givenVars);

					ArrayList<String> givenVarsSorted = new ArrayList<String>(givenVars);
					Collections.sort(givenVarsSorted);
					ArrayList<String> goalVarsSorted = new ArrayList<String>(goalVars);
					Collections.sort(goalVarsSorted);
					return input(input.given.withVars(givenVarsSorted), input.goal.withVars(goalVarsSorted));
				}
				return object;
			}
		});
	}
}
