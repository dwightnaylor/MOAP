package solver;

import static algorithmMaker.util.KernelUtil.*;
import static kernelLanguage.KernelFactory.*;

import java.util.*;

import algorithmMaker.util.*;
import bindings.*;
import kernelLanguage.*;
import theorems.*;
import util.CollectionUtil;

/**
 * Chains together facts using existing theorems to arrive at conclusions. Includes "costs" for each theorem, which
 * allow a priority-queue to determine when each theorem should be applied.
 * 
 * @author Dwight Naylor
 * @since 9/14/15
 */
public class Chainer {
	/**
	 * Determines whether or not newly derived quantifiers should be made with a completely new, derived variable
	 * guaranteed to be unique, or should just be made with the standard formula.
	 */
	private static final boolean USE_UNIQUE_VARS = true;
	/**
	 * Map from a property to the list of theorems that may require it.
	 */
	private Hashtable<KProperty, HashSet<Fact<? extends KProperty>>> theoremCatchers = new Hashtable<KProperty, HashSet<Fact<? extends KProperty>>>();

	public Hashtable<KProperty, Fact<? extends KProperty>> properties = new Hashtable<KProperty, Fact<? extends KProperty>>();
	public Hashtable<KProperty, HashSet<Fact<? extends KProperty>>> propertiesByStructure = new Hashtable<KProperty, HashSet<Fact<? extends KProperty>>>();
	public Hashtable<String, HashSet<Fact<? extends KProperty>>> propertiesByVariable = new Hashtable<String, HashSet<Fact<? extends KProperty>>>();
	/**
	 * The equality atomics for each given variable (namely, all of the equals(x,y) assertions for which x is the key
	 * variable)
	 */
	private Hashtable<String, HashSet<Fact<KAtomic>>> equalities = new Hashtable<String, HashSet<Fact<KAtomic>>>();

	/**
	 * TODO:Kludge: This is a hell of a kludge to prevent cascading quantifiers around child(x,y) & exists(z st
	 * child(x,z) : equal(z,y))
	 */
	private boolean allowForQuantifierDerivation = true;
	private boolean allowForMSTs = true;

	public Chainer(Fact<?>... initialInfo) {
		for (Fact<?> fact : initialInfo)
			chain(fact);
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Fact<KAtomic>> getTransferTheorems() {
		ArrayList<Fact<KAtomic>> ret = new ArrayList<Fact<KAtomic>>();
		for (KProperty property : properties.keySet())
			if (property instanceof KAtomic && ((KAtomic) property).function.startsWith(MultistageTheorem.TRANSFER))
				ret.add((Fact<KAtomic>) properties.get(property));

		return ret;
	}

	public Hashtable<MultistageTheorem, ArrayList<Binding>> getCompletionTheorems() {
		Hashtable<MultistageTheorem, ArrayList<Binding>> theorems = new Hashtable<MultistageTheorem, ArrayList<Binding>>();
		for (KProperty property : properties.keySet())
			if (property instanceof KAtomic && ((KAtomic) property).function.startsWith(MultistageTheorem.COMPLETION)) {
				MultistageTheorem theorem = MultistageTheorem.getTheorem(((KAtomic) property).function);

				ArrayList<String> originalVars = variables(theorem.getTransferAtomic());
				ArrayList<String> usedVars = variables(property);
				MutableBinding binding = new MutableBinding();
				for (int i = 0; i < usedVars.size(); i++)
					binding.bind(originalVars.get(i), usedVars.get(i));

				if (!theorems.containsKey(theorem))
					theorems.put(theorem, new ArrayList<Binding>());

				theorems.get(theorem).add(binding);
			}

		return theorems;
	}

	public Chainer clone() {
		Chainer copy = new Chainer();
		copy.equalities = CollectionUtil.deepClone(equalities);
		copy.properties = CollectionUtil.deepClone(properties);
		copy.propertiesByStructure = CollectionUtil.deepClone(propertiesByStructure);
		copy.propertiesByVariable = CollectionUtil.deepClone(propertiesByVariable);
		copy.theoremCatchers = CollectionUtil.deepClone(theoremCatchers);
		return copy;
	}

	public void clearProperties() {
		properties = new Hashtable<KProperty, Fact<? extends KProperty>>();
		propertiesByStructure = new Hashtable<KProperty, HashSet<Fact<? extends KProperty>>>();
		propertiesByVariable = new Hashtable<String, HashSet<Fact<? extends KProperty>>>();
	}

	public <T extends KProperty> HashSet<Fact<? extends KProperty>> getProperties(T property) {
		HashSet<Fact<? extends KProperty>> ret = new HashSet<Fact<? extends KProperty>>();
		addProperties(property, false, ret);
		return ret;
	}

	public <T extends KProperty> HashSet<Fact<? extends KProperty>> getPropertyDevarred(T property) {
		HashSet<Fact<? extends KProperty>> ret = new HashSet<Fact<? extends KProperty>>();
		addProperties(property, true, ret);
		return ret;
	}

	private <T extends KProperty> void addProperties(T property, boolean devar,
			HashSet<Fact<? extends KProperty>> ret) {
		if (property instanceof KORing) {
			for (KProperty ored : KernelUtil.getORed(property))
				addProperties(ored, devar, ret);
		} else if (property instanceof KANDing) {
			HashSet<Fact<? extends KProperty>> anding = null;
			for (KProperty anded : KernelUtil.getANDed(property)) {
				HashSet<Fact<? extends KProperty>> satisfiers = devar ? getPropertyDevarred(anded)
						: getProperties(anded);
				if (anding == null)
					anding = satisfiers;
				else
					anding.retainAll(satisfiers);
			}
		} else if (devar) {
			T devarred = devar(property);
			if (propertiesByStructure.containsKey(devarred))
				ret.addAll(propertiesByStructure.get(devarred));
		} else
			ret.add(properties.get(property));
	}

	public void addBoundVars(String... vars) {
		for (String var : vars) {
			chain(atomic(BOUND, var));
			chain(atomic(EQUAL, var, var));
		}
	}

	public void addUnboundVars(String... vars) {
		for (String var : vars)
			if (!hasProperty(atomic(BOUND, var)))
				chain(atomic(UNBOUND, var));
	}

	public void resetFacts() {
		properties = new Hashtable<KProperty, Fact<? extends KProperty>>();
		propertiesByStructure = new Hashtable<KProperty, HashSet<Fact<? extends KProperty>>>();
		propertiesByVariable = new Hashtable<String, HashSet<Fact<? extends KProperty>>>();
		equalities = new Hashtable<String, HashSet<Fact<KAtomic>>>();
	}

	public boolean hasProperty(KProperty property) {
		return hasProperty(property, false);
	}

	public boolean hasPropertyDevarred(KProperty property) {
		return hasProperty(property, true);
	}

	private boolean hasProperty(KProperty property, boolean devar) {
		if (property instanceof KORing) {
			for (KProperty ored : KernelUtil.getORed(property))
				if (hasProperty(ored, devar))
					return true;

			return devar ? propertiesByStructure.containsKey(devar(property)) : properties.containsKey(property);
		} else if (property instanceof KANDing) {
			for (KProperty anded : KernelUtil.getANDed(property))
				if (!hasProperty(anded, devar))
					return devar ? propertiesByStructure.containsKey(devar(property))
							: properties.containsKey(property);

			return true;
		} else {
			if (devar)
				return propertiesByStructure.containsKey(devar(property));
			else {
				if (property instanceof KQuantifier) {
					KQuantifier quantifier = (KQuantifier) property;
					if (propertiesByStructure.containsKey(devar(property)))
						for (Fact<? extends KProperty> fact : propertiesByStructure.get(devar(property))) {
							KQuantifier other = (KQuantifier) fact.property;
							if (!quantifier.quantifier.equals(other.quantifier))
								continue;

							ArrayList<String> propVars = variables(quantifier);
							ArrayList<String> otherVars = variables(other);
							Hashtable<String, String> varMatches = new Hashtable<String, String>();
							HashSet<String> propDeclared = getDeclaredVars(quantifier);
							HashSet<String> otherDeclared = getDeclaredVars(other);
							boolean matches = true;
							for (int i = 0; i < propVars.size(); i++) {
								String pv = propVars.get(i);
								String ov = otherVars.get(i);
								if (!pv.equals(ov)) {
									if (!propDeclared.contains(pv) || !otherDeclared.contains(ov)
											|| varMatches.containsKey(pv) && !varMatches.get(pv).equals(ov)
											|| varMatches.contains(ov) && (!varMatches.containsKey(pv)
													|| !varMatches.get(pv).equals(ov))) {
										matches = false;
										break;
									}
								}
							}
							if (matches)
								return true;
						}
					return false;
				} else
					return properties.containsKey(property);
			}
		}
	}

	@SafeVarargs
	public final void chain(KProperty property, Fact<? extends KProperty>... prerequisites) {
		chain(property, "Given", prerequisites);
	}

	@SafeVarargs
	public final void chain(KProperty property, String description, Fact<? extends KProperty>... prerequisites) {
		property = (KProperty) KernelUtil.canonicalizeOrder(property);
		if (property instanceof KANDing)
			for (KProperty anded : getANDed(property))
				chain(anded, description, prerequisites);
		else
			chain(new Fact<KProperty>(property, description, prerequisites));
	}

	@SuppressWarnings("unchecked")
	void chain(Fact<? extends KProperty> fact) {
		KProperty property = fact.property;
		if (!allowForMSTs && property instanceof KAtomic
				&& MultistageTheorem.isMSTStructural(((KAtomic) property).function))
			return;

		if (hasProperty(property) || KernelUtil.isLiteralAtomic(property))
			return;

		// If we already have the negated version of a property, throw an error cause something's gone horribly wrong.
		KProperty negated = (KProperty) canonicalizeOrder(negate(property));
		if (hasProperty(negated)) {
			printJustificationFor(fact);
			printJustificationFor(getProperties(negated).iterator().next());
			throw new RuntimeException("A chainer has both a property \"" + property + "\" and its negation.");
		}

		if (fact.isRealFact && !(property instanceof KBooleanLiteral))
			properties.put(property, fact);

		KProperty devar = devar(property);
		if (!hasPropertyDevarred(devar))
			propertiesByStructure.put(devar, new HashSet<Fact<? extends KProperty>>());

		if (!(devar instanceof KORing))
			propertiesByStructure.get(devar).add(fact);

		if (property instanceof KQuantifier) {
			KQuantifier quantifier = (KQuantifier) property;
			// TODO: Handle the negated version for existential theorems (is this useful to do?)
			// FIXME: Shouldn't only chain KAtomic existential quantifiers
			// ----The key problem with just allowing all existentials is that it explodes our branching costs later.
			if (quantifier.isUniversal() || quantifier.subject.property instanceof KAtomic) {
				// We can add universal quantifiers as new theorems.
				if (quantifier.subject.property instanceof KORing)
					for (KProperty ored : getORed(quantifier.subject.property))
						addTheoremCatcher((KProperty) canonicalizeOrder(negate(ored)), (Fact<KQuantifier>) fact);

				if (fact.isRealFact && allowForQuantifierDerivation) {
					// Here we add not only the quantifier, but every "easier" quantifier as well.
					Chainer subChainer = clone();
					subChainer.allowForQuantifierDerivation = false;
					subChainer.allowForMSTs = false;

					KProperty reducedQuantifier = quantifier.subject.property.without(properties.keySet());
					if (!(reducedQuantifier instanceof KBooleanLiteral)) {
						subChainer.chain(reducedQuantifier, "Quantifier subject");

						Set<KProperty> keySet = new HashSet<KProperty>(subChainer.properties.keySet());
						keySet.removeIf(
								x -> x instanceof KAtomic && MultistageTheorem.isMSTStructural(((KAtomic) x).function));

						// TODO: Do this without brute-forcing over all facts...
						for (Fact<? extends KProperty> newSubjectFact : subChainer.properties.values()) {
							if (hasProperty(newSubjectFact.property) || (newSubjectFact.property instanceof KAtomic
									&& MultistageTheorem.isMSTStructural(((KAtomic) newSubjectFact.property).function)))
								continue;

							boolean usedVars = false;
							for (String var : variables(newSubjectFact.property)) {
								if (quantifier.subject.vars.contains(var)) {
									usedVars = true;
									break;
								}
							}
							if (usedVars)
								chain(quantifier(quantifier.quantifier,
										quantifier.subject.withProperty(newSubjectFact.property)),
										"Equivalent quantifier", fact, newSubjectFact);
						}
					}
				}
			}
		} else if (property instanceof KAtomic) {
			chainAtomic(fact, property);
		} else if (property instanceof KANDing) {
			for (KProperty anded : getANDed(property))
				chain(anded);
		} else if (property instanceof KORing) {
			for (KProperty ored : getORed(property))
				addTheoremCatcher((KProperty) canonicalizeOrder(negate(ored)), (Fact<KORing>) fact);
		} else if (property instanceof KNegation || property instanceof KBooleanLiteral) {
			// no-op
		} else {
			printJustificationFor(fact);
			throw new UnsupportedOperationException("Chainer does not know how to chain \"" + property + "\"");
		}
		// TODO: Deal with ORings passed to a chainer (why? idk)

		// Go through all of the theorems that use this property and check if any of them can be applied We clone the
		// theoremCatcher list because it could be modified inside the loop and we want to be alerted if that happens.
		// TODO: DN: Make sure the modified internal loop doesn't ignore the new theorem when chaining
		if (fact.isRealFact && theoremCatchers.containsKey(devar))
			for (Fact<KQuantifier> theorem : (HashSet<Fact<KQuantifier>>) theoremCatchers.get(devar).clone())
				beginPropagation(theorem, fact);
	}

	@SuppressWarnings("unchecked")
	private void chainAtomic(Fact<? extends KProperty> fact, KProperty property) {
		KAtomic atomic = (KAtomic) property;
		String function = atomic.function;

		for (String var : atomic.args) {
			if (!propertiesByVariable.containsKey(var))
				propertiesByVariable.put(var, new HashSet<Fact<? extends KProperty>>());

			propertiesByVariable.get(var).add(fact);
		}

		// If we're adding a new equality, perform updates of all the old rules
		if (function.equals(EQUAL)) {
			// TODO:DN: Deal with equality for non-variable arguments
			if (propertiesByVariable.containsKey(atomic.args.get(0))) {
				for (Fact<? extends KProperty> oldFact : CollectionUtil
						.deepClone(propertiesByVariable.get(atomic.args.get(1)))) {
					if (oldFact.property instanceof KAtomic
							&& (isStructural(((KAtomic) oldFact.property).function)
									|| MultistageTheorem.isMSTStructural(((KAtomic) oldFact.property).function))
							|| (oldFact.property instanceof KNegation
									&& ((KNegation) oldFact.property).negated instanceof KAtomic
									&& isStructural(((KAtomic) ((KNegation) oldFact.property).negated).function)))
						continue;

					Hashtable<String, String> revars = new Hashtable<String, String>();
					revars.put(atomic.args.get(1), atomic.args.get(0));
					chain(new Fact<KAtomic>((KAtomic) revar(oldFact.property, revars),
							"Equal variables share properties.", oldFact, fact));
				}
			}

			// Add the equality to the table. Only need to do one way because of the theorem for ab=ba
			if (!equalities.contains(atomic.args.get(0)))
				equalities.put(atomic.args.get(0), new HashSet<Fact<KAtomic>>());

			equalities.get(atomic.args.get(0)).add((Fact<KAtomic>) fact);
		}

		// For all vars that have other vars equal to them, apply the new rule to them
		if (fact.property instanceof KAtomic && !isStructural(((KAtomic) fact.property).function)
				&& !MultistageTheorem.isMSTStructural(((KAtomic) fact.property).function))
			for (String arg : atomic.args) {
				if (equalities.containsKey(arg))
					for (Fact<KAtomic> equalVar : equalities.get(arg)) {
						if (arg.equals(equalVar.property.args.get(1)))
							continue;

						Hashtable<String, String> revars = new Hashtable<String, String>();
						revars.put(arg, equalVar.property.args.get(1));
						chain(new Fact<KAtomic>((KAtomic) revar(fact.property, revars),
								"Equal variables share properties.", equalVar, fact));
					}
			}
	}

	public void addTheoremCatcher(KProperty requirement, Fact<? extends KProperty> fact) {
		if (requirement instanceof KORing) {
			for (KProperty ored : getORed(requirement))
				addTheoremCatcher(ored, fact);

			return;
		} else if (requirement instanceof KANDing) {
			for (KProperty anded : getANDed(requirement))
				addTheoremCatcher(anded, fact);

			return;
		}
		KProperty devar = (KProperty) devar(canonicalizeOrder(requirement));
		if (!theoremCatchers.containsKey(devar))
			theoremCatchers.put(devar, new HashSet<Fact<? extends KProperty>>());

		theoremCatchers.get(devar).add(fact);
		for (Fact<?> preExisting : getPropertyDevarred(devar))
			beginPropagation(fact, preExisting);
	}

	/**
	 * Attempts to propagate new facts from the asserted fact, using the given theorem. Assumes that the asserted fact
	 * has already been added to the database.
	 */
	private void beginPropagation(Fact<? extends KProperty> theorem, Fact<? extends KProperty> fact) {
		MutableBinding binding = new MutableBinding();
		binding.addPrerequisite(theorem);

		KProperty requirement = (KProperty) canonicalizeOrder(theorem.property);
		if (requirement instanceof KQuantifier) {
			// In the rare case we actually have to bind a quantifier, just use the quantifier
			if (binding.canBind(requirement, fact.property)) {
				binding.applyBinding(requirement, fact);
				revarAndChain(theorem, fact.property, fact.description, binding.getImmutable());
			}
			// Usually the quantifier is a theorem. In this case, chain it if possible.
			KQuantifier quantifier = (KQuantifier) requirement;
			if (quantifier.subject.property instanceof KORing) {
				ArrayList<KProperty> negatedProperties = getORed(quantifier.subject.property);
				// We can have at most one property which has no negation present
				// If there were two, we wouldn't have enough to force a clause
				boolean missingProperty = false;
				for (int i = 0; i < negatedProperties.size(); i++) {
					KProperty prop = (KProperty) canonicalizeOrder(negate(negatedProperties.get(i)));
					negatedProperties.set(i, prop);
					if (!KernelUtil.isLiteralAtomic(prop) && !hasPropertyDevarred(prop)) {
						if (missingProperty)
							return;

						missingProperty = true;
					}
				}

				HashSet<String> declaredVars = getDeclaredVars(quantifier);
				for (String var : variables(quantifier.subject.property))
					if (!declaredVars.contains(var))
						binding.bind(var, var);

				// Go through the list of properties and chain from all of them
				ArrayList<KProperty> originalProperties = getORed(quantifier.subject.property);
				KProperty removed = negatedProperties.remove(0);
				for (int i = 0; i < originalProperties.size(); i++) {
					if (i > 0)
						removed = negatedProperties.set(i - 1, removed);

					propagateFromANDing(theorem, negatedProperties, 0, originalProperties.get(i), "Only option in OR",
							binding);
				}
			} else {
				throw new UnsupportedOperationException("Can't handle quantifier \"" + quantifier + "\"");
			}
		} else if (requirement instanceof KORing) {
			KORing oring = (KORing) requirement;
			ArrayList<KProperty> properties = getORed(oring);
			KProperty missingProp = null;
			for (int i = 0; i < properties.size(); i++) {
				KProperty prop = (KProperty) canonicalizeOrder(negate(properties.get(i)));
				if (KernelUtil.isLiteralAtomic(prop) || hasProperty(prop)) {
					properties.set(i, prop);
				} else {
					if (missingProp != null)
						return;

					missingProp = negate(prop);
					properties.remove(i--);
				}
			}

			if (missingProp == null)
				throw new RuntimeException(
						"Missingprop should never be null here. That would mean the property was already disproven...");
			else
				chain(new Fact<KProperty>(missingProp, "Only option in OR", theorem));
		} else {
			throw new UnsupportedOperationException("Cannot try to chain with requirement \"" + requirement + "\"");
		}
	}

	@SuppressWarnings("unchecked")
	private void revarAndChain(Fact<? extends KProperty> theorem, KProperty result, String description,
			Binding binding) {
		// Go through any variables that may have been declared inside the theorem (IE in quantifiers) and revar them
		// with a unique identifier to prevent collisions with other variables.
		HashSet<String> declaredVars = new HashSet<String>(KernelUtil.getDeclaredVars(result));
		if (declaredVars.size() > 0) {
			MutableBinding newBinding = new MutableBinding();
			newBinding.addBindingsFrom(binding);
			HashSet<String> usedVars = new HashSet<String>(declaredVars);
			usedVars.addAll(binding.getArguments().values());
			for (String originalVar : declaredVars) {
				String newVar;
				if (USE_UNIQUE_VARS)
					newVar = getUniqueVar();
				else
					newVar = InputUtil.getUnusedVar(usedVars);
				declaredVars.add(newVar);
				newBinding.bind(originalVar, newVar);
				usedVars.add(newVar);
			}
			binding = newBinding;
		}

		chain(revar(result, binding.getArguments()), description, binding.getPrerequisites().toArray(new Fact[0]));
	}

	private void propagateFromANDing(Fact<? extends KProperty> theorem, ArrayList<KProperty> propertiesToSatisfy,
			int index, KProperty property, String description, MutableBinding binding) {
		// base case : when we've fulfilled all the atomics, we can assert our result.
		if (index == propertiesToSatisfy.size()) {
			revarAndChain(theorem, property, description, binding.getImmutable());
			return;
		}

		KProperty toSatisfy = propertiesToSatisfy.get(index);
		// The one special type of requirement is LITERAL(x), where the variable must actually have the name used in
		// the requirement.
		if (KernelUtil.isLiteralAtomic(toSatisfy)) {
			KAtomic literal = (KAtomic) toSatisfy;
			String var = literal.args.get(0);
			if (binding.canBind(var, var)) {
				boolean alreadyBound = binding.hasBinding(var, var);
				binding.bind(var, var);

				propagateFromANDing(theorem, propertiesToSatisfy, index + 1, property, description, binding);

				if (!alreadyBound)
					binding.removeBinding(var);
			}
		} else {
			// TODO:DN: This has to make sure to canonicalize quantifiers before querying for them
			for (Fact<? extends KProperty> candidate : CollectionUtil.deepClone(getPropertyDevarred(toSatisfy))) {
				if (binding.canBind(toSatisfy, candidate.property)) {
					binding.applyBinding(toSatisfy, candidate);

					propagateFromANDing(theorem, propertiesToSatisfy, index + 1, property, description, binding);

					binding.undoLastBinding();
				}
			}
		}
	}

	public ArrayList<Binding> getAllFulfillmentsOf(KProperty original, Collection<String> realVariables) {
		ArrayList<Binding> ret = new ArrayList<Binding>();
		for (Binding partial : getAllFulfillmentsOf(original)) {
			Hashtable<String, String> arguments = partial.getArguments();
			boolean fitsRealVariables = true;
			for (String originalVar : arguments.keySet()) {
				if (realVariables.contains(originalVar) && !arguments.get(originalVar).equals(originalVar)) {
					fitsRealVariables = false;
				}
			}
			if (!fitsRealVariables)
				continue;

			MutableBinding reducedBinding = new MutableBinding();
			reducedBinding.removeBindings(realVariables);
			ret.add(reducedBinding.getImmutable());
		}
		return ret;
	}

	/**
	 * Finds all of the bindings within this chainer's property list that fulfill the given requirement.
	 */
	public List<Binding> getAllFulfillmentsOf(KProperty original) {
		if (KernelUtil.isLiteralAtomic(original)) {
			return Collections.singletonList(
					Binding.singleton(((KAtomic) original).args.get(0), ((KAtomic) original).args.get(0)));
		}
		if (original instanceof KAtomic || original instanceof KNegation) {
			ArrayList<Binding> ret = new ArrayList<Binding>();
			if (hasPropertyDevarred(original))
				for (Fact<? extends KProperty> fact : getPropertyDevarred(original)) {
					MutableBinding binding = new MutableBinding();
					binding.applyBinding(original, fact);
					ret.add(binding.getImmutable());
				}
			return ret;
		} else if (original instanceof KORing) {
			HashSet<Binding> ret = new HashSet<Binding>();
			KORing oring = (KORing) original;
			for (KProperty ored : getORed(oring))
				ret.addAll(getAllFulfillmentsOf(ored));

			return new ArrayList<Binding>(ret);
		} else if (original instanceof KANDing) {
			// TODO: DN: Don't use brute-enumeration for this, it's awful... but it sure is easy.
			List<Binding> lhsFills = getAllFulfillmentsOf(((KANDing) original).lhs);
			List<Binding> rhsFills = getAllFulfillmentsOf(((KANDing) original).rhs);
			ArrayList<Binding> ret = new ArrayList<Binding>();
			for (Binding lhsBinding : lhsFills)
				for (Binding rhsBinding : rhsFills)
					if (lhsBinding.canHaveAdditionalBindings(rhsBinding)) {
						MutableBinding newBinding = new MutableBinding();
						newBinding.addBindingsFrom(lhsBinding);
						newBinding.addBindingsFrom(rhsBinding);
						ret.add(newBinding);
					}
			// @hashorder
			return ret;
		} else if (original instanceof KQuantifier) {
			// TODO: Canonicalize quantifiers before using them in a chainer. (sort ANDs, etc)
			ArrayList<Binding> ret = new ArrayList<Binding>();
			KProperty devarred = (KProperty) devar(canonicalizeOrder(original));
			if (propertiesByStructure.containsKey(devarred))
				for (Fact<? extends KProperty> fact : propertiesByStructure.get(devarred)) {
					MutableBinding binding = new MutableBinding();
					if (binding.canBind(original, fact.property)) {
						binding.applyBinding(original, fact);
						ret.add(binding.getImmutable());
					}
				}
			return ret;
		}
		throw new UnsupportedOperationException("Dwight was too lazy to make a generic version of this function.");
	}

	public static void printJustificationFor(Fact<?> fact) {
		printJustificationFor(fact, 0);
	}

	public static void printJustificationFor(Fact<?> fact, int numTabs) {
		for (int i = 0; i < numTabs; i++)
			System.err.print("\t");
		System.err.println(fact + ":::" + fact.description);

		for (Fact<?> subFact : fact.prerequisites)
			printJustificationFor(subFact, numTabs + 1);
	}

	private static String getUniqueVar() {
		return "cv" + varCount++;
	}

	private static int varCount = 0;

	@SuppressWarnings("unchecked")
	public ArrayList<Fact<KQuantifier>> getTheorems() {
		ArrayList<Fact<KQuantifier>> theorems = new ArrayList<Fact<KQuantifier>>();
		for (Fact<? extends KProperty> fact : properties.values()) {
			KProperty property = fact.property;
			if (property instanceof KQuantifier) {
				KQuantifier quantifier = (KQuantifier) property;
				if (quantifier.subject.property instanceof KORing) {
					theorems.add((Fact<KQuantifier>) fact);
				}
			}
		}
		return theorems;
	}
}
