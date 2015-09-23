import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;

import org.eclipse.emf.common.util.EList;

import algorithmMaker.input.ANDing;
import algorithmMaker.input.Atomic;
import algorithmMaker.input.Property;

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
	public void chain(Fact<?> fact) {
		Property property = fact.property;
		if (property instanceof Atomic)
			chain((Fact<Atomic>) fact, (Atomic) property);
		else
			try {
				throw new Exception("Can only have atomics as results now.");
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(0);
			}
	}

	private void chain(Fact<Atomic> fact, Atomic atomic) {
		String function = atomic.getFunction();
		if (!appliedAtomics.containsKey(function))
			appliedAtomics.put(function, new HashSet<Fact<Atomic>>());

		appliedAtomics.get(function).add((Fact<Atomic>) fact);

		// Go through all of the theorems that use this atomic's function
		// and check if any of them can be applied
		if (theoremCatchers.containsKey(function))
			for (Theorem theorem : theoremCatchers.get(function))
				attemptPropagation(theorem, fact, atomic, new Hashtable<String, String>());
	}

	/**
	 * Attempts to propagate new facts from the asserted fact, using the given
	 * theorem. Assumes that the asserted fact has already been added to the
	 * database.
	 */
	public void attemptPropagation(Theorem theorem, Fact<Atomic> fact, Atomic asserted,
			Hashtable<String, String> arguments) {
		Property requirement = theorem.requirement;
		ArrayList<Fact<?>> prerequisites = new ArrayList<Fact<?>>();
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

			attemptPropagation(theorem, atomics, 0, fact, false, arguments, prerequisites);
		} else if (requirement instanceof Atomic) {
			// We already know that since the requirement is just an atomic
			// we're giving it something that satisfies it.
			applyTheorem((Atomic) requirement, (Fact<Atomic>) fact, arguments, prerequisites);
			chain(InputUtil.revar(theorem.result, arguments), theorem, fact);
		}
	}

	/**
	 * Helper method for propagation.
	 * 
	 * NOTE: Assumes atomicsToSatisfy has all of the atomics of the same
	 * function type as the asserted atomic at the end.
	 */
	private void attemptPropagation(Theorem theorem, ArrayList<Property> atomicsToSatisfy, int index,
			Fact<Atomic> fact, boolean usedAsserted, Hashtable<String, String> arguments,
			ArrayList<Fact<?>> prerequisites) {
		// base case : when we've fulfilled all the atomics, we can assert our
		// result.
		if (index == atomicsToSatisfy.size()) {
			return;
		}

		// If we're on the last element in our list, then we have to use the
		// asserted atomic.
		Atomic toSatisfy = (Atomic) atomicsToSatisfy.get(index);
		if (index == atomicsToSatisfy.size() - 1 && !usedAsserted) {
			if (!canApplyTheorem(toSatisfy, fact.property, arguments))
				return;

			ArrayList<String> boundVars = applyTheorem(toSatisfy, fact, arguments, prerequisites);
			chain(InputUtil.revar(theorem.result, arguments), theorem, prerequisites.toArray(new Fact<?>[0]));
			for (String arg : boundVars)
				arguments.remove(arg);

			prerequisites.remove(prerequisites.size() - 1);
		} else {
			for (Fact<Atomic> candidate : appliedAtomics.get(toSatisfy.getFunction())) {
				if (canApplyTheorem(toSatisfy, candidate.property, arguments)) {
					ArrayList<String> boundVars = applyTheorem(toSatisfy, candidate, arguments, prerequisites);
					attemptPropagation(theorem, atomicsToSatisfy, index + 1, fact,
							usedAsserted || candidate.equals(fact), arguments, prerequisites);
					for (String arg : boundVars)
						arguments.remove(arg);

					prerequisites.remove(prerequisites.size() - 1);
				}
			}
		}
	}

	private boolean canApplyTheorem(Atomic original, Atomic asserted, Hashtable<String, String> arguments) {
		for (int i = 0; i < original.getArgs().size(); i++)
			if (arguments.containsKey(original.getArgs().get(i))
					&& !arguments.get(original.getArgs().get(i)).equals(asserted.getArgs().get(i)))
				return false;

		return true;
	}

	/**
	 * Adds all of the variable bindings that are needed to have the given
	 * asserted atomic be the implementation of the given original atomic. <br>
	 * <br>
	 * NOTE: Will not take into account collisions, but will simply overwrite
	 * pre-existing bindings.
	 */
	private ArrayList<String> applyTheorem(Atomic original, Fact<Atomic> asserted, Hashtable<String, String> arguments,
			ArrayList<Fact<?>> prerequisites) {
		ArrayList<String> boundVars = new ArrayList<String>();
		for (int i = 0; i < original.getArgs().size(); i++) {
			String arg = original.getArgs().get(i);
			if (!arguments.containsKey(arg))
				boundVars.add(arg);

			arguments.put(arg, asserted.property.getArgs().get(i));
		}

		prerequisites.add(asserted);
		return boundVars;
	}
}
