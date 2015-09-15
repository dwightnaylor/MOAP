import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;

import algorithmMaker.input.ANDing;
import algorithmMaker.input.Atomic;
import algorithmMaker.input.Property;

/**
 * Chains together facts using existing theorems to arrive at conclusions. Includes "costs" for each theorem, which allow a priority-queue to determine when
 * each theorem should be applied.
 * 
 * @author Dwight Naylor
 * @since 9/14/15
 */
public class Chainer {
	/**
	 * Map from the method name to the list of theorems that may be looking for its use.
	 */
	Hashtable<String, ArrayList<Theorem>> theoremCatchers = new Hashtable<String, ArrayList<Theorem>>();
	/**
	 * Map from a function name to all of the atomics that have been applied with that function.
	 */
	Hashtable<String, HashSet<Atomic>> appliedAtomics = new Hashtable<String, HashSet<Atomic>>();

	ArrayList<Theorem> theorems = new ArrayList<Theorem>();

	public Chainer(Theorem... theorems) {
		for (Theorem theorem : theorems) {
			Property requirement = theorem.requirement;
			if (requirement instanceof Atomic)
				addTheoremCatcher((Atomic) requirement, theorem);
			else if (requirement instanceof ANDing)
				for (Property anded : InputUtil.getGrouped(requirement))
					addTheoremCatcher((Atomic) anded, theorem);

		}
	}

	private void addTheoremCatcher(Atomic atomic, Theorem theorem) {
		if (!theoremCatchers.containsKey(atomic.getFunction())) {
			theoremCatchers.put(atomic.getFunction(), new ArrayList<Theorem>());
		}
		theoremCatchers.get(atomic.getFunction()).add(theorem);
	}

	public void chain(Property property) {
		if (property instanceof Atomic)
			chain((Atomic) property);
		else if (property instanceof ANDing) {
			for (Property anded : InputUtil.getGrouped(property))
				chain((Atomic) anded);
		}
	}

	public void chain(Atomic atomic) {
		String function = atomic.getFunction();
		if (!appliedAtomics.containsKey(function))
			appliedAtomics.put(function, new HashSet<Atomic>());

		appliedAtomics.get(function).add(atomic);

		// Go through all of the theorems that use this atomic's function and check if any of them can be applied
		if (theoremCatchers.containsKey(function))
			for (Theorem theorem : theoremCatchers.get(function))
				attemptPropagation(theorem, atomic, new Hashtable<String, String>());
	}

	/**
	 * Attempts to propagate new facts from the asserted fact, using the given theorem. Assumes that the asserted fact has already been added to the database.
	 */
	public void attemptPropagation(Theorem theorem, Atomic asserted, Hashtable<String, String> arguments) {
		Property requirement = theorem.requirement;
		Property result = theorem.result;
		if (requirement instanceof ANDing) {
			ArrayList<Property> atomics = InputUtil.getGrouped(requirement);
			// We re-organize the atomics to that all of the ones that match the assertion are at the end.
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
			// If we're outright missing a theorem needed for our application, just quit.
			for (Property atomic : atomics)
				if (!appliedAtomics.containsKey(((Atomic) atomic).getFunction()))
					return;

			attemptPropagation(atomics, 0, result, asserted, false, arguments);
		} else if (requirement instanceof Atomic) {
			// We already know that since the requirement is just an atomic we're giving it something that satisfies it.
			applyTheorem((Atomic) requirement, asserted, arguments);
			chain(InputUtil.revar(result, arguments));
		}
	}

	/**
	 * Helper method for propagation.
	 * 
	 * NOTE: Assumes atomicsToSatisfy has all of the atomics of the same function type as the asserted atomic at the end.
	 */
	private void attemptPropagation(ArrayList<Property> atomicsToSatisfy, int index, Property result, Atomic asserted, boolean usedAsserted,
			Hashtable<String, String> arguments) {
		// base case : when we've fulfilled all the atomics, we can assert our result.
		if (index == atomicsToSatisfy.size()) {
			return;
		}

		// If we're on the last element in our list, then we have to use the asserted atomic.
		Atomic toSatisfy = (Atomic) atomicsToSatisfy.get(index);
		if (index == atomicsToSatisfy.size() - 1 && !usedAsserted) {
			if (!canApplyTheorem(toSatisfy, asserted, arguments))
				return;

			applyTheorem(toSatisfy, asserted, arguments);
			chain(InputUtil.revar(result, arguments));
		} else {
			for (Atomic candidate : appliedAtomics.get(toSatisfy.getFunction())) {
				if (canApplyTheorem(toSatisfy, candidate, arguments)) {
					applyTheorem(toSatisfy, candidate, arguments);
					attemptPropagation(atomicsToSatisfy, index + 1, result, asserted, usedAsserted || candidate.equals(asserted), arguments);
					removeTheorem(toSatisfy, arguments);
				}
			}
		}
	}

	private boolean canApplyTheorem(Atomic original, Atomic asserted, Hashtable<String, String> arguments) {
		for (int i = 0; i < original.getArgs().size(); i++)
			if (arguments.containsKey(original.getArgs().get(i)) && !arguments.get(original.getArgs().get(i)).equals(asserted.getArgs().get(i)))
				return false;

		return true;
	}

	/**
	 * Adds all of the variable bindings that are needed to have the given asserted atomic be the implementation of the given original atomic. <br>
	 * <br>
	 * NOTE: Will not take into account collisions, but will simply overwrite pre-existing bindings.
	 */
	private void applyTheorem(Atomic original, Atomic asserted, Hashtable<String, String> arguments) {
		for (int i = 0; i < original.getArgs().size(); i++)
			arguments.put(original.getArgs().get(i), asserted.getArgs().get(i));
	}

	private void removeTheorem(Atomic original, Hashtable<String, String> arguments) {
		for (int i = 0; i < original.getArgs().size(); i++)
			arguments.remove(arguments.get(original.getArgs().get(i)));
	}
}
