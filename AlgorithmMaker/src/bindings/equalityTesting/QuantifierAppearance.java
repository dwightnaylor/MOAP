package bindings.equalityTesting;

import algorithmMaker.util.*;
import kernelLanguage.*;
import kernelLanguage.KQuantifier.Quantifier;

public class QuantifierAppearance extends Appearance {

	private final Quantifier quantifier;
	private final boolean inSubject;
	private final int numVars;
	private KProperty compactedSubject;
	private KProperty compactedPredicate;

	public QuantifierAppearance(KQuantifier quantifier, boolean inSubject, Appearance parentAppearance) {
		super(parentAppearance);
		this.quantifier = quantifier.quantifier;
		this.numVars = quantifier.subject.vars.size();
		this.inSubject = inSubject;

		// TODO: DN: Sort here?
		compactedSubject = KernelUtil.devar(quantifier.subject.property);
		compactedPredicate = KernelUtil.devar(quantifier.predicate);
	}

	@Override
	public int hashDeclaredData() {
		return quantifier.hashCode() * (inSubject ? 1 : 9001) * numVars * compactedSubject.hashCode()
				* compactedPredicate.hashCode();
	}

	@Override
	public int compareToSameType(Appearance o) {
		QuantifierAppearance other = (QuantifierAppearance) o;
		if (!quantifier.equals(other.quantifier))
			return quantifier.compareTo(other.quantifier);

		if (inSubject != other.inSubject)
			return inSubject ? 1 : 0;

		if (numVars != other.numVars)
			return numVars - other.numVars;

		if (!compactedSubject.equals(other.compactedSubject))
			return KernelUtil.KERNEL_COMPARATOR.compare(compactedSubject, other.compactedSubject);

		if (!compactedPredicate.equals(other.compactedPredicate))
			return KernelUtil.KERNEL_COMPARATOR.compare(compactedPredicate, other.compactedPredicate);

		return 0;
	}
}
