package solver;

import inputHandling.TransformUtil;

import java.util.*;

import theorems.*;
import algorithmMaker.input.*;
import algorithmMaker.util.InputUtil;
import bindings.Binding;
import bindings.MutableBinding;

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
	private Hashtable<Property, HashSet<Theorem>> theoremCatchers = new Hashtable<Property, HashSet<Theorem>>();
	/**
	 * Determines whether this chainer is a "Given" chainer or a "Goal" chainer. If it's the former, then the chainer
	 * will use the given requirement of multitheorems. If it's the latter, it will use the goal requirement.
	 */
	private boolean isGivenChainer = true;

	public Hashtable<Property, Fact<? extends Property>> properties = new Hashtable<Property, Fact<? extends Property>>();
	private Hashtable<Property, HashSet<Fact<? extends Property>>> propertiesByStructure = new Hashtable<Property, HashSet<Fact<? extends Property>>>();
	private Hashtable<String, HashSet<Fact<? extends Property>>> propertiesByVariable = new Hashtable<String, HashSet<Fact<? extends Property>>>();
	/**
	 * The equality atomics for each given variable (namely, all of the equals(x,y) assertions for which x is the key
	 * variable)
	 */
	private Hashtable<String, HashSet<Fact<Atomic>>> equalities = new Hashtable<String, HashSet<Fact<Atomic>>>();

	/**
	 * All of the quantifiers used to derive given theorems. If the theorem was not derived from a quantifier, it will
	 * not appear in this table.
	 */
	private Hashtable<Theorem, Fact<Quantifier>> theoremDerivations = new Hashtable<Theorem, Fact<Quantifier>>();

	/**
	 * All of the theorems to pass on to the next layer of chaining
	 */
	public Hashtable<MultistageTheorem, ArrayList<Binding>> nextLevelTheorems = new Hashtable<MultistageTheorem, ArrayList<Binding>>();
	/**
	 * All of the theorems passed down from the previous level of chaining
	 */
	public Hashtable<MultistageTheorem, ArrayList<Binding>> previousLevelTheorems = new Hashtable<MultistageTheorem, ArrayList<Binding>>();

	public Chainer(Theorem... theorems) {
		this(true, theorems);
	}

	@SuppressWarnings("unchecked")
	public <T extends Property> Fact<T> getProperty(T property) {
		return (Fact<T>) properties.get(property);
	}

	public Chainer(boolean isGivenChainer, Theorem... theorems) {
		this.isGivenChainer = isGivenChainer;
		for (Theorem theorem : theorems)
			addTheoremCatcher(getRequirement(theorem), theorem, null);
	}

	public void addBoundVars(String... vars) {
		for (String var : vars) {
			chain(InputUtil.createAtomic(InputUtil.BOUND, var), TransformUtil.GIVEN);
			chain(InputUtil.createAtomic(InputUtil.EQUAL, var, var), TransformUtil.REFLEXIVE);
		}
	}

	public void addUnboundVars(String... vars) {
		for (String var : vars)
			if (!hasProperty(InputUtil.createAtomic(InputUtil.BOUND, var)))
				chain(InputUtil.createAtomic(InputUtil.UNBOUND, var), TransformUtil.GIVEN);
	}

	private Property getRequirement(Theorem theorem) {
		Property requirement = theorem.getRequirement();
		if (!this.isGivenChainer && theorem instanceof MultistageTheorem)
			requirement = ((MultistageTheorem) theorem).getFindRequirement();

		return requirement;
	}

	public void resetFacts() {
		properties = new Hashtable<Property, Fact<? extends Property>>();
		propertiesByStructure = new Hashtable<Property, HashSet<Fact<? extends Property>>>();
		propertiesByVariable = new Hashtable<String, HashSet<Fact<? extends Property>>>();
		nextLevelTheorems = new Hashtable<MultistageTheorem, ArrayList<Binding>>();
		previousLevelTheorems = new Hashtable<MultistageTheorem, ArrayList<Binding>>();
		equalities = new Hashtable<String, HashSet<Fact<Atomic>>>();
	}

	public boolean hasProperty(Property property) {
		return properties.containsKey(property);
	}

	private void addTheoremCatcher(Property requirement, Theorem theorem, Fact<? extends Quantifier> theoremBase) {
		Property devar = InputUtil.devar(requirement);
		if (requirement instanceof ANDing) {
			for (Property anded : InputUtil.getANDed((ANDing) requirement))
				addTheoremCatcher(anded, theorem, theoremBase);
		} else {
			if (!theoremCatchers.containsKey(devar))
				theoremCatchers.put(devar, new HashSet<Theorem>());

			theoremCatchers.get(devar).add(theorem);
		}
	}

	@SafeVarargs
	public final void chain(Property property, Theorem theorem, Fact<? extends Property>... prerequisites) {
		if (property instanceof ANDing)
			for (Property anded : InputUtil.getANDed((ANDing) property))
				chain(anded, theorem, prerequisites);
		else
			chain(new Fact<Property>(property, theorem, prerequisites));
	}

	@SuppressWarnings("unchecked")
	public void chain(Fact<? extends Property> fact) {
		Property property = fact.property;
		if (hasProperty(property))
			return;

		properties.put(property, fact);

		Property devar = (Property) InputUtil.devar(property);
		if (!propertiesByStructure.containsKey(devar))
			propertiesByStructure.put(devar, new HashSet<Fact<? extends Property>>());

		propertiesByStructure.get(devar).add(fact);

		if (property instanceof Quantifier) {
			Quantifier quantifier = (Quantifier) property;
			if (quantifier.getQuantifier().equals(InputUtil.FORALL)) {
				Theorem newTheorem = new QuickTheorem(quantifier.getSubject().getProperty(), quantifier.getPredicate(),
						0, "Quantification");
				for (Binding existingBinding : getAllFulfillmentsOf(newTheorem.getRequirement())) {
					Fact<? extends Property>[] prerequisites = new Fact[existingBinding.getPrerequisites().size() + 1];
					prerequisites[0] = fact;
					System.arraycopy(existingBinding.getPrerequisites().toArray(new Fact[0]), 0, prerequisites, 1,
							existingBinding.getPrerequisites().size());
					chain(new Fact<Property>(InputUtil.revar(newTheorem.getResult(), existingBinding.getArguments()),
							newTheorem, prerequisites));
				}
				addTheoremCatcher(newTheorem.getRequirement(), newTheorem, (Fact<? extends Quantifier>) fact);
			}
		} else if (property instanceof Atomic) {
			Atomic atomic = (Atomic) property;
			String function = atomic.getFunction();

			for (String var : atomic.getArgs()) {
				if (!propertiesByVariable.containsKey(var))
					propertiesByVariable.put(var, new HashSet<Fact<? extends Property>>());

				propertiesByVariable.get(var).add(fact);
			}

			// If we're adding a new equality, perform updates of all the old
			// rules
			if (function.equals(InputUtil.EQUAL)) {
				// TODO:DN: Deal with equality for non-variable arguments
				if (propertiesByVariable.containsKey(atomic.getArgs().get(0)))
					for (Fact<? extends Property> oldFact : propertiesByVariable.get(atomic.getArgs().get(1))) {
						if (oldFact.property instanceof Atomic
								&& InputUtil.isSpecial(((Atomic) oldFact.property).getFunction()))
							continue;

						Hashtable<String, String> revars = new Hashtable<String, String>();
						revars.put(atomic.getArgs().get(1), atomic.getArgs().get(0));
						chain(new Fact<Atomic>((Atomic) InputUtil.revar(oldFact.property, revars), TransformUtil.EQUAL,
								oldFact, fact));
					}

				// Add the equality to the table. Only need to do one way
				// because the theorem for ab=ba will get the other.
				if (!equalities.contains(atomic.getArgs().get(0)))
					equalities.put(atomic.getArgs().get(0), new HashSet<Fact<Atomic>>());

				equalities.get(atomic.getArgs().get(0)).add((Fact<Atomic>) fact);
			}

			// For all vars that have other vars equal to them, apply the new
			// rule to them
			if (fact.property instanceof Atomic && !InputUtil.isSpecial(((Atomic) fact.property).getFunction()))
				for (String arg : atomic.getArgs()) {
					if (equalities.containsKey(arg))
						for (Fact<Atomic> equalVar : equalities.get(arg)) {
							if (arg.equals(equalVar.property.getArgs().get(1)))
								continue;

							Hashtable<String, String> revars = new Hashtable<String, String>();
							revars.put(arg, equalVar.property.getArgs().get(1));
							chain(new Fact<Atomic>((Atomic) InputUtil.revar(fact.property, revars),
									TransformUtil.EQUAL, equalVar, fact));
						}
				}
		}

		// Go through all of the theorems that use this atomic's function
		// and check if any of them can be applied
		if (theoremCatchers.containsKey(devar))
			for (Theorem theorem : theoremCatchers.get(devar)) {
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
	private void attemptPropagation(Theorem theorem, Fact<? extends Property> fact, Property asserted,
			MutableBinding binding) {
		Property devar = InputUtil.devar(asserted);
		Property requirement = getRequirement(theorem);
		ArrayList<Fact<? extends Property>> prerequisites = new ArrayList<Fact<? extends Property>>();
		prerequisites.add(fact);
		if (requirement instanceof ANDing) {
			ArrayList<Property> properties = InputUtil.getANDed((ANDing) requirement);
			// If we're outright missing a theorem needed for our application,
			// just quit.
			for (Property property : properties)
				if (!propertiesByStructure.containsKey(InputUtil.devar(property)))
					return;

			int lastUsableIndex = 0;
			for (int i = properties.size() - 1; i >= 0; i--)
				if (InputUtil.devar(properties.get(i)).equals(devar)) {
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
	private void attemptChaining(Theorem theorem, Binding binding) {
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
			HashSet<String> declaredVars = InputUtil.getDeclaredVars(theorem.getResult());
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

			chain(InputUtil.revar(theorem.getResult(), binding.getArguments()), theorem, binding.getPrerequisites()
					.toArray(new Fact[0]));
		}
	}

	private void attemptPropagation(Theorem theorem, ArrayList<Property> propertiesToSatisfy, int index,
			Fact<? extends Property> fact, boolean usedAsserted, MutableBinding binding, int lastUsableIndex) {
		// base case : when we've fulfilled all the atomics, we can assert our result.
		if (index == propertiesToSatisfy.size()) {
			attemptChaining(theorem, binding.getImmutable());
			return;
		}

		Property toSatisfy = propertiesToSatisfy.get(index);
		if (index == lastUsableIndex && !usedAsserted && binding.canBind(toSatisfy, fact.property)) {
			binding.applyBinding(toSatisfy, fact);

			attemptPropagation(theorem, propertiesToSatisfy, index + 1, fact, true, binding, lastUsableIndex);

			binding.undoLastBinding();
		} else {
			// TODO:DN: This has to make sure to canonicalize quantifiers before querying for them
			for (Fact<? extends Property> candidate : propertiesByStructure.get(InputUtil.devar(toSatisfy))) {
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
	public ArrayList<Binding> getAllFulfillmentsOf(Property original) {
		if (original instanceof Atomic) {
			ArrayList<Binding> ret = new ArrayList<Binding>();
			Property devarred = InputUtil.devar((Atomic) original);
			if (propertiesByStructure.containsKey(devarred))
				for (Fact<? extends Property> fact : propertiesByStructure.get(devarred)) {
					MutableBinding binding = new MutableBinding();
					binding.applyBinding(original, fact);
					ret.add(binding.getImmutable());
				}
			return ret;
		}
		throw new UnsupportedOperationException("Dwight was too lazy to make a generic version of this function.");
	}
}
