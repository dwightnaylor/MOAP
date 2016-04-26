package algorithmMaker.util.equalityTesting;

import algorithmMaker.util.*;
import kernelLanguage.*;
import kernelLanguage.KQuantifier.Quantifier;

public class QuantifierAppearance extends Appearance {

	/**
	 * The quantifier type of the quantifier that the variable appears in.
	 */
	private final Quantifier quantifier;
	/**
	 * The number of variables declared by the quantifier.
	 */
	private final int numVars;
	private KProperty compactedSubject;

	public QuantifierAppearance(KQuantifier quantifier, Appearance parentAppearance) {
		super(parentAppearance);
		this.quantifier = quantifier.quantifier;
		this.numVars = quantifier.subject.vars.size();
		// TODO: DN: Canonicalize here
		compactedSubject = KernelUtil.devar(quantifier.subject.property);
	}

	@Override
	public int hashDeclaredData() {
		return quantifier.hashCode() * numVars * compactedSubject.hashCode();
	}

	@Override
	public int compareToSameType(Appearance o) {
		QuantifierAppearance other = (QuantifierAppearance) o;
		if (!quantifier.equals(other.quantifier))
			return quantifier.compareTo(other.quantifier);

		if (numVars != other.numVars)
			return numVars - other.numVars;

		if (!compactedSubject.equals(other.compactedSubject))
			return KernelUtil.KERNEL_COMPARATOR.compare(compactedSubject, other.compactedSubject);

		return 0;
	}
}
