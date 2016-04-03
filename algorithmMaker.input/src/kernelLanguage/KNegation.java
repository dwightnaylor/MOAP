package kernelLanguage;

import java.util.*;

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
		ret.append(
				(negated instanceof KANDing ? "(" : "") + negated.toString() + (negated instanceof KANDing ? ")" : ""));
		return ret.toString();
	}

	@Override
	protected KProperty without(Set<KProperty> toRemove) {
		KProperty newNegated = negated.without(toRemove);
		if (newNegated instanceof KBooleanLiteral)
			return ((KBooleanLiteral) newNegated).negate();

		if (toRemove.contains(newNegated))
			return KernelFactory.FALSE;

		KProperty ret = KernelFactory.negate(newNegated);

		if (toRemove.contains(ret))
			return KernelFactory.TRUE;

		return ret;
	}

	@Override
	public void validate() {
		negated.validate();
	}
}
