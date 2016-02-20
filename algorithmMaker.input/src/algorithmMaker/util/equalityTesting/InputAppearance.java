package algorithmMaker.util.equalityTesting;

import algorithmMaker.util.KernelUtil;
import kernelLanguage.*;

public class InputAppearance extends Appearance {

	/**
	 * Whether this appearance was in the subject (true) or the predicate (false).
	 */
	private final boolean inGiven;
	/**
	 * The number of variables declared by the quantifier.
	 */
	private final int numVars;
	private KProperty compactedGiven;
	private KProperty compactedGoal;

	public InputAppearance(KInput input, boolean inGiven, Appearance parentAppearance) {
		super(parentAppearance);
		this.inGiven = inGiven;
		numVars = input.given.vars.size();
		// TODO: DN: Canonicalize here
		compactedGiven = KernelUtil.devar(input.given.property);
		compactedGoal = KernelUtil.devar(input.goal.property);
	}

	@Override
	public int compareToSameType(Appearance o) {
		InputAppearance other = (InputAppearance) o;
		if (inGiven != other.inGiven)
			return inGiven ? 1 : 0;

		if (numVars != other.numVars)
			return numVars - other.numVars;

		if (!compactedGiven.equals(other.compactedGiven))
			return KernelUtil.KERNEL_COMPARATOR.compare(compactedGiven, other.compactedGiven);

		if (!compactedGoal.equals(other.compactedGoal))
			return KernelUtil.KERNEL_COMPARATOR.compare(compactedGoal, other.compactedGoal);

		return 0;
	}

	@Override
	public int hashDeclaredData() {
		return (inGiven ? 1 : 9001) * numVars * compactedGiven.hashCode() * compactedGoal.hashCode();
	}
}
