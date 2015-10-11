package solver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;

import algorithmMaker.input.ANDing;
import algorithmMaker.input.Atomic;
import algorithmMaker.input.Property;
import algorithmMaker.input.Theorem;
import algorithmMaker.util.InputUtil;
import bindings.Binding;
import bindings.MutableBinding;
import inputHandling.TransformUtil;
import theorems.Fact;
import theorems.MultistageTheorem;

/**
 * Chains together facts using existing theorems to arrive at conclusions.
 * Includes "costs" for each theorem, which allow a priority-queue to determine
 * when each theorem should be applied.
 * 
 * @author Dwight Naylor
 * @since 9/14/15
 */
public class Chainer {
	/**
	 * Map from the method name to the list of theorems that may be looking for
	 * its use.
	 */
	private Hashtable<String, HashSet<Theorem>> theoremCatchers = new Hashtable<String, HashSet<Theorem>>();
	private boolean isGivenChainer = true;

	private Hashtable<Atomic, Fact<Atomic>> atomics = new Hashtable<Atomic, Fact<Atomic>>();
	private Hashtable<String, HashSet<Fact<Atomic>>> atomicsByFunction = new Hashtable<String, HashSet<Fact<Atomic>>>();
	private Hashtable<String, HashSet<Fact<Atomic>>> atomicsByVariable = new Hashtable<String, HashSet<Fact<Atomic>>>();
	/**
	 * The equality atomics for each given variable
	 */
	private Hashtable<String, HashSet<Fact<Atomic>>> equalities = new Hashtable<String, HashSet<Fact<Atomic>>>();

	public Hashtable<MultistageTheorem, ArrayList<Binding>> nextLevelTheorems = new Hashtable<MultistageTheorem, ArrayList<Binding>>();
	public Hashtable<MultistageTheorem, ArrayList<Binding>> previousLevelTheorems = new Hashtable<MultistageTheorem, ArrayList<Binding>>();

	public Chainer(Theorem... theorems) {
		this(true, theorems);
	}

	public Fact<Atomic> getFact(Atomic atomic) {
		return atomics.get(atomic);
	}

	public Chainer(boolean isGivenChainer, Theorem... theorems) {
		this.isGivenChainer = isGivenChainer;
		for (Theorem theorem : theorems) {
			Property requirement = getRequirement(theorem);
			if (requirement instanceof Atomic)
				addTheoremCatcher((Atomic) requirement, theorem);
			else if (requirement instanceof ANDing)
				for (Property anded : InputUtil.getANDed((ANDing) requirement))
					addTheoremCatcher((Atomic) anded, theorem);
		}
	}

	public void addBoundVars(Collection<String> vars) {
		for (String var : vars)
			chain(InputUtil.getAtomic(InputUtil.BOUND, var), TransformUtil.GIVEN);
	}

	public void addUnboundVars(Collection<String> vars) {
		for (String var : vars)
			if (!hasAtomic(InputUtil.getAtomic(InputUtil.BOUND, var)))
				chain(InputUtil.getAtomic(InputUtil.UNBOUND, var), TransformUtil.GIVEN);
	}

	private Property getRequirement(Theorem theorem) {
		Property requirement = theorem.getRequirement();
		if (!this.isGivenChainer && theorem instanceof MultistageTheorem)
			requirement = ((MultistageTheorem) theorem).getFindRequirement();

		return requirement;
	}

	public void resetFacts() {
		atomics = new Hashtable<Atomic, Fact<Atomic>>();
		atomicsByFunction = new Hashtable<String, HashSet<Fact<Atomic>>>();
		atomicsByVariable = new Hashtable<String, HashSet<Fact<Atomic>>>();
		nextLevelTheorems = new Hashtable<MultistageTheorem, ArrayList<Binding>>();
		previousLevelTheorems = new Hashtable<MultistageTheorem, ArrayList<Binding>>();
		equalities = new Hashtable<String, HashSet<Fact<Atomic>>>();
	}

	public boolean hasAtomic(Atomic given) {
		return atomics.containsKey(given);
	}

	private void addTheoremCatcher(Atomic atomic, Theorem theorem) {
		if (!theoremCatchers.containsKey(atomic.getFunction()))
			theoremCatchers.put(atomic.getFunction(), new HashSet<Theorem>());

		theoremCatchers.get(atomic.getFunction()).add(theorem);
	}

	public void chain(Property property, Theorem theorem, Fact<?>... prerequisites) {
		if (property instanceof Atomic)
			chain(new Fact<Atomic>((Atomic) property, theorem, prerequisites));
		else if (property instanceof ANDing)
			for (Property anded : InputUtil.getANDed((ANDing) property))
				chain(anded, theorem, prerequisites);
	}

	private void addAtomic(Fact<Atomic> fact) {
		Atomic atomic = (Atomic) fact.property;
		if (atomics.containsKey(atomic))
			return;

		atomics.put(atomic, fact);
		String function = atomic.getFunction();

		if (!atomicsByFunction.containsKey(function))
			atomicsByFunction.put(function, new HashSet<Fact<Atomic>>());

		atomicsByFunction.get(function).add((Fact<Atomic>) fact);

		for (String var : atomic.getArgs()) {
			if (!atomicsByVariable.containsKey(var))
				atomicsByVariable.put(var, new HashSet<Fact<Atomic>>());

			atomicsByVariable.get(var).add(fact);
		}

		// If we're adding a new equality, perform updates of all the old rules
		if (function.equals(InputUtil.EQUAL)) {
			String var1 = atomic.getArgs().get(0);
			String var2 = atomic.getArgs().get(1);
			if (atomicsByVariable.containsKey(var1))
				for (Fact<Atomic> oldFact : atomicsByVariable.get(var1)) {
					if (InputUtil.isSpecial(oldFact.property.getFunction()))
						continue;

					Hashtable<String, String> revars = new Hashtable<String, String>();
					revars.put(var1, var2);
					chain(new Fact<Atomic>((Atomic) InputUtil.revar(oldFact.property, revars), TransformUtil.EQUAL,
							oldFact, fact));
				}

			if (!equalities.contains(var1))
				equalities.put(var1, new HashSet<Fact<Atomic>>());

			equalities.get(var1).add(fact);
		}

		if (!InputUtil.isSpecial(fact.property.getFunction()))
			for (String var : atomic.getArgs()) {
				if (equalities.containsKey(var))
					for (Fact<Atomic> equalVar : equalities.get(var)) {
						Hashtable<String, String> revars = new Hashtable<String, String>();
						revars.put(var, equalVar.property.getArgs().get(1));
						chain(new Fact<Atomic>((Atomic) InputUtil.revar(fact.property, revars), TransformUtil.EQUAL,
								equalVar, fact));
					}
			}
	}

	@SuppressWarnings("unchecked")
	public void chain(Fact<? extends Property> fact) {
		if(hasAtomic((Atomic) fact.property))
			return;
		
		if (fact.property instanceof Atomic) {
			addAtomic((Fact<Atomic>) fact);

			// Go through all of the theorems that use this atomic's function
			// and check if any of them can be applied
			String function = ((Atomic) fact.property).getFunction();
			if (theoremCatchers.containsKey(function))
				for (Theorem theorem : theoremCatchers.get(function))
					attemptPropagation(theorem, (Fact<Atomic>) fact, (Atomic) fact.property, new MutableBinding());
		} else
			try {
				throw new Exception("Can only have atomics as results for now.");
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(0);
			}
	}

	/**
	 * Attempts to propagate new facts from the asserted fact, using the given
	 * theorem. Assumes that the asserted fact has already been added to the
	 * database.
	 */
	private void attemptPropagation(Theorem theorem, Fact<Atomic> fact, Atomic asserted, MutableBinding binding) {
		Property requirement = getRequirement(theorem);
		ArrayList<Fact<? extends Property>> prerequisites = new ArrayList<Fact<? extends Property>>();
		prerequisites.add(fact);
		if (requirement instanceof ANDing) {
			ArrayList<Property> atomics = InputUtil.getANDed((ANDing) requirement);
			// We re-organize the atomics to that all of the ones that match the
			// assertion are at the end.
			// This is done to make propagation detection easier.
			int swapIndex = atomics.size() - 1;
			while (swapIndex > 0 && ((Atomic) atomics.get(swapIndex)).getFunction().equals(asserted.getFunction()))
				swapIndex--;

			for (int i = 0; i < swapIndex; i++) {
				Atomic cur = (Atomic) atomics.get(i);
				if (cur.getFunction().equals(asserted.getFunction())) {
					atomics.set(i, atomics.get(swapIndex));
					atomics.set(swapIndex, cur);
					while (((Atomic) atomics.get(swapIndex)).getFunction().equals(asserted.getFunction()))
						swapIndex--;
				}
			}
			// If we're outright missing a theorem needed for our application,
			// just quit.
			for (Property atomic : atomics)
				if (!atomicsByFunction.containsKey(((Atomic) atomic).getFunction()))
					return;

			attemptPropagation(theorem, atomics, 0, fact, false, binding);
		} else if (requirement instanceof Atomic) {
			// We already know that since the requirement is just an atomic
			// we're giving it something that satisfies it.
			binding.applyBinding((Atomic) requirement, (Fact<Atomic>) fact);
			attemptChaining(theorem, binding);
		}
	}

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
		} else
			chain(InputUtil.revar(theorem.getResult(), binding.getArguments()), theorem,
					binding.getPrerequisites().toArray(new Fact<?>[0]));
	}

	/**
	 * Helper method for propagation.
	 * 
	 * NOTE: Assumes atomicsToSatisfy has all of the atomics of the same
	 * function type as the asserted atomic at the end.
	 */
	private void attemptPropagation(Theorem theorem, ArrayList<Property> atomicsToSatisfy, int index, Fact<Atomic> fact,
			boolean usedAsserted, MutableBinding binding) {
		// base case : when we've fulfilled all the atomics, we can assert our
		// result.
		if (index == atomicsToSatisfy.size()) {
			attemptChaining(theorem, binding.getImmutable());
			return;
		}

		// If we're on the last element in our list, then we have to use the
		// asserted atomic. NOTE: This is only the case because we sorted the
		// incoming atomic list in such a way as to assure that the last element
		// would be something that the fact is related to.
		Atomic toSatisfy = (Atomic) atomicsToSatisfy.get(index);
		if (index == atomicsToSatisfy.size() - 1 && !usedAsserted) {
			if (!binding.canBind(toSatisfy, fact.property))
				return;

			binding.applyBinding(toSatisfy, fact);

			attemptPropagation(theorem, atomicsToSatisfy, index + 1, fact, true, binding);

			binding.undoLastBinding();
		} else {
			String function = toSatisfy.getFunction();
			for (Fact<Atomic> candidate : atomicsByFunction.get(function)) {
				if (binding.canBind(toSatisfy, candidate.property)) {
					binding.applyBinding(toSatisfy, candidate);

					attemptPropagation(theorem, atomicsToSatisfy, index + 1, fact,
							usedAsserted || candidate.equals(fact), binding);

					binding.undoLastBinding();
				}
			}
		}
	}

	public HashSet<Atomic> copyAtomics() {
		return new HashSet<Atomic>(atomics.keySet());
	}
}
