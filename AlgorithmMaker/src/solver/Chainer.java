package solver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;

import org.eclipse.emf.common.util.EList;

import theorems.Fact;
import theorems.MultistageTheorem;
import algorithmMaker.input.ANDing;
import algorithmMaker.input.Atomic;
import algorithmMaker.input.Property;
import algorithmMaker.input.Theorem;
import algorithmMaker.util.InputUtil;
import bindings.Binding;
//import bindings.Binding;
import bindings.MutableBinding;

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
	private Hashtable<String, ArrayList<Theorem>> theoremCatchers = new Hashtable<String, ArrayList<Theorem>>();
	/**
	 * Map from a function name to all of the atomics that have been applied
	 * with that function.
	 */
	private Hashtable<String, HashSet<Fact<Atomic>>> appliedAtomics = new Hashtable<String, HashSet<Fact<Atomic>>>();

	public Hashtable<MultistageTheorem, ArrayList<Binding>> nextLevelTheorems = new Hashtable<MultistageTheorem, ArrayList<Binding>>();
	public Hashtable<MultistageTheorem, ArrayList<Binding>> previousLevelTheorems = new Hashtable<MultistageTheorem, ArrayList<Binding>>();

	private boolean isGivenChainer = true;

	public Chainer(Theorem... theorems) {
		this(true, theorems);
	}
	
	public Chainer(boolean isGivenChainer, Theorem... theorems) {
		this.isGivenChainer = isGivenChainer;
		for (Theorem theorem : theorems) {
			Property requirement = getRequirement(theorem);
			if (requirement instanceof Atomic)
				addTheoremCatcher((Atomic) requirement, theorem);
			else if (requirement instanceof ANDing)
				for (Property anded : InputUtil.getGrouped(requirement))
					addTheoremCatcher((Atomic) anded, theorem);
		}
	}

	private Property getRequirement(Theorem theorem) {
		Property requirement = theorem.getRequirement();
		if (!this.isGivenChainer && theorem instanceof MultistageTheorem)
			requirement = ((MultistageTheorem) theorem).getFindRequirement();

		return requirement;
	}

	public void resetFacts() {
		appliedAtomics = new Hashtable<String, HashSet<Fact<Atomic>>>();
	}

	public boolean hasAtomic(Atomic given) {
		return hasAtomic(new Fact<Atomic>(given, null));
	}

	public boolean hasAtomic(Fact<Atomic> given) {
		if (!appliedAtomics.containsKey(given.property.getFunction()))
			return false;

		for (Fact<Atomic> fact : appliedAtomics.get(given.property.getFunction())) {
			EList<String> args = fact.property.getArgs();
			boolean same = true;
			for (int i = 0; i < args.size(); i++)
				if (!args.get(i).equals(given.property.getArgs().get(i))) {
					same = false;
					break;
				}
			if (same)
				return true;
		}
		return false;
	}

	private void addTheoremCatcher(Atomic atomic, Theorem theorem) {
		if (!theoremCatchers.containsKey(atomic.getFunction()))
			theoremCatchers.put(atomic.getFunction(), new ArrayList<Theorem>());

		theoremCatchers.get(atomic.getFunction()).add(theorem);
	}

	public void chain(Property property, Theorem theorem, Fact<?>... prerequisites) {
		if (property instanceof Atomic)
			chain(new Fact<Atomic>((Atomic) property, theorem, prerequisites));
		else if (property instanceof ANDing)
			for (Property anded : InputUtil.getGrouped(property))
				chain(anded, theorem, prerequisites);
	}

	@SuppressWarnings("unchecked")
	public void chain(Fact<? extends Property> fact) {
		if (fact.property instanceof Atomic) {
			String function = ((Atomic) fact.property).getFunction();

			if (!appliedAtomics.containsKey(function))
				appliedAtomics.put(function, new HashSet<Fact<Atomic>>());

			appliedAtomics.get(function).add((Fact<Atomic>) fact);

			// Go through all of the theorems that use this atomic's function
			// and check if any of them can be applied
			if (theoremCatchers.containsKey(function))
				for (Theorem theorem : theoremCatchers.get(function))
					attemptPropagation(theorem, (Fact<Atomic>) fact, (Atomic) fact.property, new MutableBinding());
		} else
			try {
				throw new Exception("Can only have atomics as results now.");
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
	public void attemptPropagation(Theorem theorem, Fact<Atomic> fact, Atomic asserted, MutableBinding binding) {
		Property requirement = getRequirement(theorem);
		ArrayList<Fact<? extends Property>> prerequisites = new ArrayList<Fact<? extends Property>>();
		prerequisites.add(fact);
		if (requirement instanceof ANDing) {
			ArrayList<Property> atomics = InputUtil.getGrouped(requirement);
			// We re-organize the atomics to that all of the ones that match the
			// assertion are at the end.
			// This is done to make propagation detection easier.
			int swapIndex = atomics.size() - 1;
			while (((Atomic) atomics.get(swapIndex)).getFunction().equals(asserted.getFunction()))
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
				if (!appliedAtomics.containsKey(((Atomic) atomic).getFunction()))
					return;

			attemptPropagation(theorem, atomics, 0, fact, false, binding);
		} else if (requirement instanceof Atomic) {
			// We already know that since the requirement is just an atomic
			// we're giving it something that satisfies it.
			binding.applyBinding((Atomic) requirement, (Fact<Atomic>) fact);
			attemptChaining(theorem, binding);
		}
	}

	private void attemptChaining(Theorem theorem, MutableBinding binding) {
		if (theorem instanceof MultistageTheorem) {
			MultistageTheorem multistageTheorem = (MultistageTheorem) theorem;
			if (isGivenChainer) {
				if (!nextLevelTheorems.containsKey(multistageTheorem))
					nextLevelTheorems.put(multistageTheorem, new ArrayList<Binding>());

				nextLevelTheorems.get(multistageTheorem).add(binding.getImmutable());
			} else {
				if(previousLevelTheorems.containsKey(multistageTheorem)){
					for(Binding previousBinding : previousLevelTheorems.get(multistageTheorem)){
						if(previousBinding.canHaveAdditionalBindings(binding)){
							if (!nextLevelTheorems.containsKey(multistageTheorem))
								nextLevelTheorems.put(multistageTheorem, new ArrayList<Binding>());

							binding.addBindingsFrom(previousBinding);
							nextLevelTheorems.get(multistageTheorem).add(binding.getImmutable());
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
			return;
		}

		// If we're on the last element in our list, then we have to use the
		// asserted atomic. NOTE: This is only the case because we sorted the
		// incoming atomic list in such a way as to assure that the last element
		// would be something that the fact is related to.
		// TODO: DN: This doesn't work for theorems with multiple requirements
		// on the same atomic if we use the provided fact too early...
		Atomic toSatisfy = (Atomic) atomicsToSatisfy.get(index);
		if (index == atomicsToSatisfy.size() - 1 && !usedAsserted) {
			if (!binding.canBind(toSatisfy, fact.property))
				return;

			binding.applyBinding(toSatisfy, fact);

			attemptChaining(theorem, binding);

			binding.undoLastBinding();
		} else {
			for (Fact<Atomic> candidate : appliedAtomics.get(toSatisfy.getFunction())) {
				if (binding.canBind(toSatisfy, candidate.property)) {
					binding.applyBinding(toSatisfy, candidate);
					attemptPropagation(theorem, atomicsToSatisfy, index + 1, fact,
							usedAsserted || candidate.equals(fact), binding);

					binding.undoLastBinding();
				}
			}
		}
	}

	public ArrayList<Atomic> getAtomics() {
		ArrayList<Atomic> atomics = new ArrayList<Atomic>();
		for (HashSet<Fact<Atomic>> atomicGroup : appliedAtomics.values())
			for (Fact<Atomic> fact : atomicGroup)
				atomics.add(fact.property);

		return atomics;
	}
}
