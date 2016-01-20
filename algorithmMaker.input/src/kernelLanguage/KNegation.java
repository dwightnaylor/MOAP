package kernelLanguage;

import java.util.HashSet;

public class KNegation extends KProperty {
	public final KProperty negated;

	KNegation(KProperty negated) {
		this.negated = negated;
	}

	@Override
	int calculateHashCode() {
		return -negated.hashCode();
	}

	@Override
	String calculateToString() {
		StringBuffer ret = new StringBuffer();
		ret.append('!');
		ret.append(negated.toString());
		return ret.toString();
	}

	@Override
	public KProperty without(HashSet<KProperty> toRemove) {
		KProperty newNegated = negated.without(toRemove);
		if (newNegated instanceof KBooleanLiteral)
			return ((KBooleanLiteral) newNegated).negate();

		if (toRemove.contains(this))
			return KernelFactory.TRUE;

		return KernelFactory.negate(newNegated);
	}
}
