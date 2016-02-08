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
	 * Map from the method name to the list of theorems that may be looking for its use.
	 */
	private Hashtable<KProperty, HashSet<KTheorem>> theoremCatchers = new Hashtable<KProperty, HashSet<KTheorem>>();
	/**
	 * Determines whether this chainer is a "Given" chainer or a "Goal" chainer. If it's the former, then the chainer
	 * will use the given requirement of multitheorems. If it's the latter, it will use the goal requirement.
	 */
	private boolean isGivenChainer = true;

	public Hashtable<KProperty, Fact<? extends KProperty>> properties = new Hashtable<KProperty, Fact<? extends KProperty>>();
	public Hashtable<KProperty, HashSet<Fact<? extends KProperty>>> propertiesByStructure = new Hashtable<KProperty, HashSet<Fact<? extends KProperty>>>();
	public Hashtable<String, HashSet<Fact<? extends KProperty>>> propertiesByVariable = new Hashtable<String, HashSet<Fact<? extends KProperty>>>();
	/**
	 * The equality atomics for each given variable (namely, all of the equals(x,y) assertions for which x is the key
	 * variable)
	 */
	private Hashtable<String, HashSet<Fact<KAtomic>>> equalities = new Hashtable<String, HashSet<Fact<KAtomic>>>();

	/**
	 * All of the quantifiers used to derive given theorems. If the theorem was not derived from a quantifier, it will
	 * not appear in this table. This isn't actually used to chain the new theorems, it just keeps a record of the steps
	 * taken to get to that theorem (they are the same as those taken to get to the original quantifier).
	 */
	Hashtable<KTheorem, Fact<KQuantifier>> theoremDerivations = new Hashtable<KTheorem, Fact<KQuantifier>>();

	/**
	 * All of the theorems to pass on to the next layer of chaining
	 */
	public Hashtable<MultistageTheorem, ArrayList<Binding>> nextLevelTheorems = new Hashtable<MultistageTheorem, ArrayList<Binding>>();
	/**
	 * All of the theorems passed down from the previous level of chaining
	 */
	public Hashtable<MultistageTheorem, ArrayList<Binding>> previousLevelTheorems = new Hashtable<MultistageTheorem, ArrayList<Binding>>();
	/**
	 * TODO:Kludge: This is a hell of a kludge to prevent cascading quantifiers around child(x,y) & exists(z st
	 * child(x,z) : equal(z,y))
	 */
	private boolean allowForQuantifierDerivation = true;

	public Chainer(KTheorem... theorems) {
		this(true, theorems);
	}

	public Chainer(boolean isGivenChainer, KTheorem... theorems) {
		this.isGivenChainer = isGivenChainer;
		for (KTheorem theorem : theorems)
			addTheoremCatcher(getRequirement(theorem), theorem, null);
	}

	public Chainer clone() {
		Chainer copy = new Chainer();
		copy.equalities = CollectionUtil.deepClone(equalities);
		copy.isGivenChainer = isGivenChainer;
		copy.nextLevelTheorems = CollectionUtil.deepClone(nextLevelTheorems);
		copy.previousLevelTheorems = CollectionUtil.deepClone(previousLevelTheorems);
		copy.properties = CollectionUtil.deepClone(properties);
		copy.propertiesByStructure = CollectionUtil.deepClone(propertiesByStructure);
		copy.propertiesByVariable = CollectionUtil.deepClone(propertiesByVariable);
		copy.theoremCatchers = CollectionUtil.deepClone(theoremCatchers);
		copy.theoremDerivations = CollectionUtil.deepClone(theoremDerivations);
		return copy;
	}

	public void clearProperties() {
		properties = new Hashtable<KProperty, Fact<? extends KProperty>>();
		propertiesByStructure = new Hashtable<KProperty, HashSet<Fact<? extends KProperty>>>();
		propertiesByVariable = new Hashtable<String, HashSet<Fact<? extends KProperty>>>();
	}

	@SuppressWarnings("unchecked")
	public <T extends KProperty> Fact<T> getProperty(T property) {
		return (Fact<T>) properties.get(property);
	}

	public void addBoundVars(String... vars) {
		for (String var : vars) {
			chain(atomic(BOUND, var), GIVEN);
			chain(atomic(EQUAL, var, var), REFLEXIVE);
		}
	}

	public void addUnboundVars(String... vars) {
		for (String var : vars)
			if (!hasProperty(atomic(BOUND, var)))
				chain(atomic(UNBOUND, var), GIVEN);
	}

	private KProperty getRequirement(KTheorem theorem) {
		KProperty requirement = theorem.requirement;
		if (!this.isGivenChainer && theorem instanceof MultistageTheorem)
			requirement = ((MultistageTheorem) theorem).getGoalRequirement();

		return requirement;
	}

	public void resetFacts() {
		properties = new Hashtable<KProperty, Fact<? extends KProperty>>();
		propertiesByStructure = new Hashtable<KProperty, HashSet<Fact<? extends KProperty>>>();
		propertiesByVariable = new Hashtable<String, HashSet<Fact<? extends KProperty>>>();
		nextLevelTheorems = new Hashtable<MultistageTheorem, ArrayList<Binding>>();
		previousLevelTheorems = new Hashtable<MultistageTheorem, ArrayList<Binding>>();
		equalities = new Hashtable<String, HashSet<Fact<KAtomic>>>();
	}

	public boolean hasProperty(KProperty property) {
		if (property instanceof KANDing) {
			for (KProperty anded : KernelUtil.getANDed(property))
				if (!properties.containsKey(anded))
					return false;

			return true;
		} else
			return properties.containsKey(property);
	}

	private void addTheoremCatcher(KProperty requirement, KTheorem theorem, Fact<? extends KQuantifier> theoremBase) {
		KProperty devar = devar(requirement);
		// TODO:DN: Split up quantifiers with ANDed predicates durin theorem catcher creation
		if (requirement instanceof KANDing) {
			for (KProperty anded : getANDed(requirement))
				addTheoremCatcher(anded, theorem, theoremBase);
		} else {
			if (!theoremCatchers.containsKey(devar))
				theoremCatchers.put(devar, new HashSet<KTheorem>());

			theoremCatchers.get(devar).add(theorem);
		}
	}

	@SafeVarargs
	public final void chain(KProperty property, KTheorem theorem, Fact<? extends KProperty>... prerequisites) {
		property = (KProperty) KernelUtil.canonicalize(property);
		if (property instanceof KANDing)
			for (KProperty anded : getANDed(property))
				chain(anded, theorem, prerequisites);
		else
			chain(new Fact<KProperty>(property, theorem, prerequisites));
	}

	@SuppressWarnings("unchecked")
	private void chain(Fact<? extends KProperty> fact) {
		KProperty property = fact.property;
		if (hasProperty(property) || KernelUtil.isLiteralAtomic(fact.property))
			return;

		if (property instanceof KNegation && hasProperty(((KNegation) property).negated)) {
			// printJustificationFor(fact, 0);
			throw new RuntimeException(
					"A chainer has both a property " + ((KNegation) property).negated + " and its negation.");
		}

		properties.put(property, fact);

		KProperty devar = devar(property);
		if (!propertiesByStructure.containsKey(devar))
			propertiesByStructure.put(devar, new HashSet<Fact<? extends KProperty>>());

		propertiesByStructure.get(devar).add(fact);

		if (property instanceof KQuantifier) {
			KQuantifier quantifier = (KQuantifier) property;
			// TODO: Handle the negated version for existential theorems (is this useful to do?)
			if (quantifier.isUniversal()) {
				// Add the theorem that's implied by the quantifier.
				ArrayList<KProperty> forwardRequirements = new ArrayList<KProperty>();
				forwardRequirements.add(quantifier.subject.property);
				ArrayList<KProperty> backwardResults = new ArrayList<KProperty>();
				backwardResults.add(negate(quantifier.subject.property));
				for (String var : KernelUtil.getUndeclaredVars(quantifier.subject)) {
					forwardRequirements.add(atomic(LITERAL, var));
					backwardResults.add(atomic(LITERAL, var));
				}

				// Also add the effective contrapositive of that theorem
				ArrayList<KProperty> forwardResults = new ArrayList<KProperty>();
				forwardResults.add(quantifier.predicate);
				ArrayList<KProperty> backwardRequirements = new ArrayList<KProperty>();
				backwardRequirements.add(negate(quantifier.predicate));
				for (String var : KernelUtil.getUndeclaredVars(quantifier.predicate))
					if (!quantifier.subject.vars.contains(var)) {
						forwardResults.add(atomic(LITERAL, var));
						backwardRequirements.add(atomic(LITERAL, var));
					}

				KTheorem newTheorem = theorem(and(forwardRequirements), and(forwardResults), 0, "Quantification");
				KTheorem newTheoremContrapositive = theorem(and(backwardRequirements), and(backwardResults), 0,
						"Quantification");
				addNewTheoremFromQuantifier(fact, newTheorem);
				addNewTheoremFromQuantifier(fact, newTheoremContrapositive);
			}
			if (allowForQuantifierDerivation) {
				// Here we add not only the quantifier, but every "easier" quantifier as well.
				Chainer subChainer = clone();
				subChainer.allowForQuantifierDerivation = false;
				// subChainer.clearProperties();
				subChainer.chain(quantifier.predicate, GIVEN);
				// TODO: Do this without brute-forcing over all facts...
				for (Fact<? extends KProperty> newPredicateFact : subChainer.properties.values()) {
					if (hasProperty(newPredicateFact.property))
						continue;

					KQuantifier newQuantifier = quantifier(quantifier.quantifier, quantifier.subject,
							newPredicateFact.property);
					KQuantifier devarredQuantifier = devar(newQuantifier);
					if (theoremCatchers.containsKey(devarredQuantifier))
						for (KTheorem theorem : (HashSet<KTheorem>) theoremCatchers.get(devarredQuantifier).clone()) {
							beginPropagation(theorem, new Fact<KQuantifier>(newQuantifier, GIVEN));
						}
				}
			}
		} else if (property instanceof KAtomic) {
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
						if (oldFact.property instanceof KAtomic && isStructural(((KAtomic) oldFact.property).function))
							continue;

						Hashtable<String, String> revars = new Hashtable<String, String>();
						revars.put(atomic.args.get(1), atomic.args.get(0));
						chain(new Fact<KAtomic>((KAtomic) revar(oldFact.property, revars), EQUALITY, oldFact, fact));
					}
				}

				// Add the equality to the table. Only need to do one way because of the theorem for ab=ba
				if (!equalities.contains(atomic.args.get(0)))
					equalities.put(atomic.args.get(0), new HashSet<Fact<KAtomic>>());

				equalities.get(atomic.args.get(0)).add((Fact<KAtomic>) fact);
			}

			// For all vars that have other vars equal to them, apply the new rule to them
			if (fact.property instanceof KAtomic && !isStructural(((KAtomic) fact.property).function))
				for (String arg : atomic.args) {
					if (equalities.containsKey(arg))
						for (Fact<KAtomic> equalVar : equalities.get(arg)) {
							if (arg.equals(equalVar.property.args.get(1)))
								continue;

							Hashtable<String, String> revars = new Hashtable<String, String>();
							revars.put(arg, equalVar.property.args.get(1));
							chain(new Fact<KAtomic>((KAtomic) revar(fact.property, revars), EQUALITY, equalVar, fact));
						}
				}
		}

		// Go through all of the theorems that use this property and check if any of them can be applied We clone the
		// theoremCatcher list because it could be modified inside the loop and we want to be alerted if that happens.
		// TODO: DN: Make sure the modified internal loop doesn't ignore the new theorem when chaining
		if (theoremCatchers.containsKey(devar))
			for (KTheorem theorem : (HashSet<KTheorem>) theoremCatchers.get(devar).clone())
				beginPropagation(theorem, fact);
	}

	@SuppressWarnings("unchecked")
	private void addNewTheoremFromQuantifier(Fact<? extends KProperty> fact, KTheorem newTheorem) {
		// First, add all the existing properties that already satisfy the theorem
		for (Binding existingBinding : getAllFulfillmentsOf(newTheorem.requirement)) {
			Fact<? extends KProperty>[] prerequisites = new Fact[existingBinding.getPrerequisites().size() + 1];
			prerequisites[0] = fact;
			System.arraycopy(existingBinding.getPrerequisites().toArray(new Fact[0]), 0, prerequisites, 1,
					existingBinding.getPrerequisites().size());
			chain(revar(newTheorem.result, existingBinding.getArguments()), newTheorem, prerequisites);
		}
		// Then add in the theorem for future properties.
		theoremDerivations.put(newTheorem, (Fact<KQuantifier>) fact);
		newTheorem = newTheorem.canonicalize();
		addTheoremCatcher(newTheorem.requirement, newTheorem, (Fact<? extends KQuantifier>) fact);
	}

	/**
	 * Attempts to propagate new facts from the asserted fact, using the given theorem. Assumes that the asserted fact
	 * has already been added to the database.
	 */
	private void beginPropagation(KTheorem theorem, Fact<? extends KProperty> fact) {
		MutableBinding binding = new MutableBinding();
		if (theoremDerivations.containsKey(theorem))
			binding.addPrerequisite(this.theoremDerivations.get(theorem));

		KProperty devar = devar(fact.property);
		KProperty requirement = getRequirement(theorem);
		// TODO: DN: Use these prerequisites...
		ArrayList<Fact<? extends KProperty>> prerequisites = new ArrayList<Fact<? extends KProperty>>();
		prerequisites.add(fact);
		if (requirement instanceof KANDing) {
			ArrayList<KProperty> properties = getANDed(requirement);
			// If we're outright missing a theorem needed for our application,
			// just quit.
			for (KProperty property : properties)
				if (!KernelUtil.isLiteralAtomic(property) && !propertiesByStructure.containsKey(devar(property)))
					return;

			int lastUsableIndex = 0;
			for (int i = properties.size() - 1; i >= 0; i--)
				if (devar(properties.get(i)).equals(devar)) {
					lastUsableIndex = i;
					break;
				}

			propagateFromANDing(theorem, properties, 0, fact, false, binding, lastUsableIndex);
		} else if (requirement instanceof KQuantifier) {
			if (binding.canBind(requirement, fact.property)) {
				binding.applyBinding(requirement, fact);
				attemptChaining(theorem, binding.getImmutable());
			}
		} else if (requirement instanceof KAtomic || requirement instanceof KNegation) {
			// If the requirement isn't an atomic one, then we know we satisfy
			// it already, because there's nothing else to look for.
			binding.applyBinding(requirement, fact);
			attemptChaining(theorem, binding.getImmutable());
		}
	}

	@SuppressWarnings("unchecked")
	private void attemptChaining(KTheorem theorem, Binding binding) {
		if (theorem instanceof MultistageTheorem) {
			MultistageTheorem multistageTheorem = (MultistageTheorem) theorem;
			if (isGivenChainer) {
				if (!nextLevelTheorems.containsKey(multistageTheorem))
					nextLevelTheorems.put(multistageTheorem, new ArrayList<Binding>());

				nextLevelTheorems.get(multistageTheorem).add(binding);
			} else {
				if (previousLevelTheorems.containsKey(multistageTheorem)) {
					for (Binding previousBinding : previousLevelTheorems.get(multistageTheorem)) {
						if (previousBinding.canHaveAdditionalBindings(binding)) {
							if (!nextLevelTheorems.containsKey(multistageTheorem))
								nextLevelTheorems.put(multistageTheorem, new ArrayList<Binding>());

							MutableBinding newBinding = new MutableBinding();
							newBinding.addBindingsFrom(binding);
							newBinding.addBindingsFrom(previousBinding);
							nextLevelTheorems.get(multistageTheorem).add(newBinding.getImmutable());
						}
					}
				}
			}
		} else {
			HashSet<String> declaredVars = new HashSet<String>(KernelUtil.getDeclaredVars(theorem.result));
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

			chain(revar(theorem.result, binding.getArguments()), theorem,
					binding.getPrerequisites().toArray(new Fact[0]));
		}
	}

	private static String getUniqueVar() {
		return "cv" + varCount++;
	}

	private static int varCount = 0;

	private void propagateFromANDing(KTheorem theorem, ArrayList<KProperty> propertiesToSatisfy, int index,
			Fact<? extends KProperty> fact, boolean usedAsserted, MutableBinding binding, int lastUsableIndex) {
		// base case : when we've fulfilled all the atomics, we can assert our result.
		if (index == propertiesToSatisfy.size()) {
			attemptChaining(theorem, binding.getImmutable());
			return;
		}

		KProperty toSatisfy = propertiesToSatisfy.get(index);
		if (index == lastUsableIndex && !usedAsserted && binding.canBind(toSatisfy, fact.property)) {
			binding.applyBinding(toSatisfy, fact);

			propagateFromANDing(theorem, propertiesToSatisfy, index + 1, fact, true, binding, lastUsableIndex);

			binding.undoLastBinding();
		} else {
			// The one special type of requirement is LITERAL(x), where the variable must actually have the name used in
			// the requirement.
			if (KernelUtil.isLiteralAtomic(toSatisfy)) {
				KAtomic literal = (KAtomic) toSatisfy;
				String var = literal.args.get(0);
				if (binding.canBind(var, var)) {
					boolean alreadyBound = binding.hasBinding(var, var);
					binding.bind(var, var);

					propagateFromANDing(theorem, propertiesToSatisfy, index + 1, fact, usedAsserted, binding,
							lastUsableIndex);

					if (!alreadyBound)
						binding.removeBinding(var);
				}
			} else {
				// TODO:DN: This has to make sure to canonicalize quantifiers before querying for them
				for (Fact<? extends KProperty> candidate : CollectionUtil
						.deepClone(propertiesByStructure.get(devar(toSatisfy)))) {
					if (binding.canBind(toSatisfy, candidate.property)) {
						binding.applyBinding(toSatisfy, candidate);

						propagateFromANDing(theorem, propertiesToSatisfy, index + 1, fact,
								usedAsserted || candidate.equals(fact), binding, lastUsableIndex);

						binding.undoLastBinding();
					}
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
			KProperty devarred = devar(original);
			if (propertiesByStructure.containsKey(devarred))
				for (Fact<? extends KProperty> fact : propertiesByStructure.get(devarred)) {
					MutableBinding binding = new MutableBinding();
					binding.applyBinding(original, fact);
					ret.add(binding.getImmutable());
				}
			return ret;
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
			KProperty devarred = devar((KQuantifier) original);
			if (propertiesByStructure.containsKey(devarred))
				for (Fact<? extends KProperty> fact : propertiesByStructure.get(devarred)) {
					MutableBinding binding = new MutableBinding();
					if (binding.canBind(original, fact.property)) {
						binding.applyBinding(original, fact);
						// binding.removeBindings(((KQuantifier)
						// original).subject.vars);
						ret.add(binding.getImmutable());
					}
				}
			return ret;
		}
		throw new UnsupportedOperationException("Dwight was too lazy to make a generic version of this function.");
	}

	public static void printJustificationFor(Fact<?> fact, int numTabs) {
		for (int i = 0; i < numTabs; i++)
			System.out.print("\t");

		System.out.println(fact);
		for (int i = 0; i < numTabs; i++)
			System.out.print("\t");

		System.out.println(fact.theorem + ":::" + fact.theorem.description);
		for (Fact<?> subFact : fact.prerequisites)
			printJustificationFor(subFact, numTabs + 1);

	}
}
