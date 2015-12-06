package solver;

import static algorithmMaker.util.KernelUtil.*;
import static kernelLanguage.KernelFactory.*;

import java.util.*;

import kernelLanguage.*;
import theorems.*;
import algorithmMaker.util.*;
import bindings.*;

/**
 * Chains together facts using existing theorems to arrive at conclusions. Includes "costs" for each theorem, which
 * allow a priority-queue to determine when each theorem should be applied.
 * 
 * @author Dwight Naylor
 * @since 9/14/15
 */
public class Chainer {
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
	 * not appear in this table.
	 */
	private Hashtable<KTheorem, Fact<KQuantifier>> theoremDerivations = new Hashtable<KTheorem, Fact<KQuantifier>>();

	/**
	 * All of the theorems to pass on to the next layer of chaining
	 */
	public Hashtable<MultistageTheorem, ArrayList<Binding>> nextLevelTheorems = new Hashtable<MultistageTheorem, ArrayList<Binding>>();
	/**
	 * All of the theorems passed down from the previous level of chaining
	 */
	public Hashtable<MultistageTheorem, ArrayList<Binding>> previousLevelTheorems = new Hashtable<MultistageTheorem, ArrayList<Binding>>();

	public Chainer(KTheorem... theorems) {
		this(true, theorems);
	}

	@SuppressWarnings("unchecked")
	public <T extends KProperty> Fact<T> getProperty(T property) {
		return (Fact<T>) properties.get(property);
	}

	public Chainer(boolean isGivenChainer, KTheorem... theorems) {
		this.isGivenChainer = isGivenChainer;
		for (KTheorem theorem : theorems)
			addTheoremCatcher(getRequirement(theorem), theorem, null);
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
		return properties.containsKey(property);
	}

	private void addTheoremCatcher(KProperty requirement, KTheorem theorem, Fact<? extends KQuantifier> theoremBase) {
		KProperty devar = devar(requirement);
		if (requirement instanceof KANDing) {
			for (KProperty anded : getANDed((KANDing) requirement))
				addTheoremCatcher(anded, theorem, theoremBase);
		} else {
			if (!theoremCatchers.containsKey(devar))
				theoremCatchers.put(devar, new HashSet<KTheorem>());

			theoremCatchers.get(devar).add(theorem);
		}
	}

	@SafeVarargs
	public final void chain(KProperty property, KTheorem theorem, Fact<? extends KProperty>... prerequisites) {
		if (property instanceof KANDing)
			for (KProperty anded : getANDed((KANDing) property))
				chain(anded, theorem, prerequisites);
		else
			chain(new Fact<KProperty>(property, theorem, prerequisites));
	}

	@SuppressWarnings("unchecked")
	public void chain(Fact<? extends KProperty> fact) {
		KProperty property = fact.property;
		if (hasProperty(property))
			return;

		properties.put(property, fact);

		KProperty devar = (KProperty) devar(property);
		if (!propertiesByStructure.containsKey(devar))
			propertiesByStructure.put(devar, new HashSet<Fact<? extends KProperty>>());

		propertiesByStructure.get(devar).add(fact);

		if (property instanceof KQuantifier) {
			KQuantifier quantifier = (KQuantifier) property;
			if (quantifier.isUniversal()) {
				KTheorem newTheorem = theorem(quantifier.subject.property, quantifier.predicate, 0, "Quantification");
				for (Binding existingBinding : getAllFulfillmentsOf(newTheorem.requirement)) {
					Fact<? extends KProperty>[] prerequisites = new Fact[existingBinding.getPrerequisites().size() + 1];
					prerequisites[0] = fact;
					System.arraycopy(existingBinding.getPrerequisites().toArray(new Fact[0]), 0, prerequisites, 1,
							existingBinding.getPrerequisites().size());
					chain(new Fact<KProperty>((KProperty) revar(newTheorem.result, existingBinding.getArguments()),
							newTheorem, prerequisites));
				}
				addTheoremCatcher(newTheorem.requirement, newTheorem, (Fact<? extends KQuantifier>) fact);
			}
		} else if (property instanceof KAtomic) {
			KAtomic atomic = (KAtomic) property;
			String function = atomic.function;

			for (String var : atomic.args) {
				if (!propertiesByVariable.containsKey(var))
					propertiesByVariable.put(var, new HashSet<Fact<? extends KProperty>>());

				propertiesByVariable.get(var).add(fact);
			}

			// If we're adding a new equality, perform updates of all the old
			// rules
			if (function.equals(EQUAL)) {
				// TODO:DN: Deal with equality for non-variable arguments
				if (propertiesByVariable.containsKey(atomic.args.get(0)))
					for (Fact<? extends KProperty> oldFact : propertiesByVariable.get(atomic.args.get(1))) {
						if (oldFact.property instanceof KAtomic && isStructural(((KAtomic) oldFact.property).function))
							continue;

						Hashtable<String, String> revars = new Hashtable<String, String>();
						revars.put(atomic.args.get(1), atomic.args.get(0));
						chain(new Fact<KAtomic>((KAtomic) revar(oldFact.property, revars), EQUALITY, oldFact, fact));
					}

				// Add the equality to the table. Only need to do one way
				// because the theorem for ab=ba will get the other.
				if (!equalities.contains(atomic.args.get(0)))
					equalities.put(atomic.args.get(0), new HashSet<Fact<KAtomic>>());

				equalities.get(atomic.args.get(0)).add((Fact<KAtomic>) fact);
			}

			// For all vars that have other vars equal to them, apply the new
			// rule to them
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

		// Go through all of the theorems that use this atomic's function
		// and check if any of them can be applied
		if (theoremCatchers.containsKey(devar))
			for (KTheorem theorem : theoremCatchers.get(devar)) {
				MutableBinding binding = new MutableBinding();
				if (theoremDerivations.containsKey(theorem))
					binding.addPrerequisite(this.theoremDerivations.get(theorem));

				attemptPropagation(theorem, fact, fact.property, binding);
			}
	}

	/**
	 * Attempts to propagate new facts from the asserted fact, using the given theorem. Assumes that the asserted fact
	 * has already been added to the database.
	 */
	private void attemptPropagation(KTheorem theorem, Fact<? extends KProperty> fact, KProperty asserted,
			MutableBinding binding) {
		KProperty devar = devar(asserted);
		KProperty requirement = getRequirement(theorem);
		ArrayList<Fact<? extends KProperty>> prerequisites = new ArrayList<Fact<? extends KProperty>>();
		prerequisites.add(fact);
		if (requirement instanceof KANDing) {
			ArrayList<KProperty> properties = getANDed((KANDing) requirement);
			// If we're outright missing a theorem needed for our application,
			// just quit.
			for (KProperty property : properties)
				if (!propertiesByStructure.containsKey(devar(property)))
					return;

			int lastUsableIndex = 0;
			for (int i = properties.size() - 1; i >= 0; i--)
				if (devar(properties.get(i)).equals(devar)) {
					lastUsableIndex = i;
					break;
				}

			attemptPropagation(theorem, properties, 0, fact, false, binding, lastUsableIndex);
		} else {
			// If the requirement isn't a compound one, then we know we satisfy
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
				for (String originalVar : declaredVars) {
					String newVar = InputUtil.getUnusedVar(declaredVars);
					declaredVars.add(newVar);
					newBinding.bind(originalVar, newVar);
				}
				binding = newBinding;
			}

			chain((KProperty) revar(theorem.result, binding.getArguments()), theorem, binding.getPrerequisites()
					.toArray(new Fact[0]));
		}
	}

	private void attemptPropagation(KTheorem theorem, ArrayList<KProperty> propertiesToSatisfy, int index,
			Fact<? extends KProperty> fact, boolean usedAsserted, MutableBinding binding, int lastUsableIndex) {
		// base case : when we've fulfilled all the atomics, we can assert our result.
		if (index == propertiesToSatisfy.size()) {
			attemptChaining(theorem, binding.getImmutable());
			return;
		}

		KProperty toSatisfy = propertiesToSatisfy.get(index);
		if (index == lastUsableIndex && !usedAsserted && binding.canBind(toSatisfy, fact.property)) {
			binding.applyBinding(toSatisfy, fact);

			attemptPropagation(theorem, propertiesToSatisfy, index + 1, fact, true, binding, lastUsableIndex);

			binding.undoLastBinding();
		} else {
			// TODO:DN: This has to make sure to canonicalize quantifiers before querying for them
			for (Fact<? extends KProperty> candidate : propertiesByStructure.get(devar(toSatisfy))) {
				if (binding.canBind(toSatisfy, candidate.property)) {
					binding.applyBinding(toSatisfy, candidate);

					attemptPropagation(theorem, propertiesToSatisfy, index + 1, fact,
							usedAsserted || candidate.equals(fact), binding, lastUsableIndex);

					binding.undoLastBinding();
				}
			}
		}
	}

	/**
	 * Finds all of the bindings within this chainer's property list that fulfill the given requirement.
	 */
	public ArrayList<Binding> getAllFulfillmentsOf(KProperty original) {
		if (original instanceof KAtomic) {
			ArrayList<Binding> ret = new ArrayList<Binding>();
			KProperty devarred = devar((KAtomic) original);
			if (propertiesByStructure.containsKey(devarred))
				for (Fact<? extends KProperty> fact : propertiesByStructure.get(devarred)) {
					MutableBinding binding = new MutableBinding();
					binding.applyBinding(original, fact);
					ret.add(binding.getImmutable());
				}
			return ret;
		}
		throw new UnsupportedOperationException("Dwight was too lazy to make a generic version of this function.");
	}
}
