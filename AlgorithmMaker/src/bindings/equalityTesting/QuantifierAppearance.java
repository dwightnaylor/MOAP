package bindings.equalityTesting;

import algorithmMaker.input.Property;
import algorithmMaker.input.Quantifier;
import algorithmMaker.util.InputUtil;

public class QuantifierAppearance extends Appearance {

	private final String quantifier;
	private final boolean inSubject;
	private final int numVars;
	private Property compactedSubject;
	private Property compactedPredicate;

	public QuantifierAppearance(Quantifier quantifier, boolean inSubject, Appearance parentAppearance) {
		super(parentAppearance);
		this.quantifier = quantifier.getQuantifier();
		this.numVars = quantifier.getSubject().getVars().size();
		this.inSubject = inSubject;

		compactedSubject = InputUtil.sort(InputUtil.devar(quantifier.getSubject().getProperty()));
		compactedPredicate = InputUtil.sort(InputUtil.devar(quantifier.getPredicate()));
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
			return InputUtil.INPUT_COMPARATOR.compare(compactedSubject, other.compactedSubject);

		if (!compactedPredicate.equals(other.compactedPredicate))
			return InputUtil.INPUT_COMPARATOR.compare(compactedPredicate, other.compactedPredicate);

		return 0;
	}
}
