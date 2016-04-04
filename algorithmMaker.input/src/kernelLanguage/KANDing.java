package kernelLanguage;

import static kernelLanguage.KernelFactory.*;

import java.util.*;

import algorithmMaker.util.KernelUtil;

public class KANDing extends KProperty {
	public final KProperty lhs;
	public final KProperty rhs;

	KANDing(KProperty lhs, KProperty rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}

	@Override
	int calculateHashCode() {
		return lhs.hashCode() * rhs.hashCode();
	}

	@Override
	String calculateToString() {
		StringBuffer ret = new StringBuffer();
		ret.append(lhs instanceof KORing ? "(" + lhs + ")" : lhs);
		ret.append(" & ");
		ret.append(rhs instanceof KORing ? "(" + rhs + ")" : rhs);
		return ret.toString();
	}

	@Override
	protected KProperty without(Set<KProperty> toRemove) {
		KProperty newLhs = lhs.without(toRemove);
		KProperty newRhs = rhs.without(toRemove);
		if (newLhs == FALSE || newRhs == FALSE)
			return FALSE;

		if (newLhs == TRUE)
			if (newRhs == TRUE)
				return TRUE;
			else
				return newRhs;

		if (newRhs == TRUE)
			return newLhs;

		KANDing ret = and(newLhs, newRhs);

		if (toRemove.contains(KernelUtil.canonicalizeOrder(ret)))
			return TRUE;

		if (toRemove.contains(KernelUtil.canonicalizeOrder(negate(ret))))
			return FALSE;

		return ret;
	}

	@Override
	public void validate() {
		lhs.validate();
		rhs.validate();
	}
}
