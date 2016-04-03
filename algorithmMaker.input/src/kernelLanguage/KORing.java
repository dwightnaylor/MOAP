package kernelLanguage;

import static kernelLanguage.KernelFactory.*;

import java.util.*;

import algorithmMaker.util.KernelUtil;

public class KORing extends KProperty {
	public final KProperty lhs;
	public final KProperty rhs;

	KORing(KProperty lhs, KProperty rhs) {
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
		ret.append(lhs);
		ret.append(" | ");
		ret.append(rhs);
		return ret.toString();
	}

	@Override
	protected KProperty without(Set<KProperty> toRemove) {
		KProperty newLhs = lhs.without(toRemove);
		KProperty newRhs = rhs.without(toRemove);
		if (newLhs == TRUE || newRhs == TRUE)
			return TRUE;

		if (newLhs == FALSE)
			if (newRhs == FALSE)
				return FALSE;
			else
				return newRhs;

		if (newRhs == FALSE)
			return newLhs;

		KORing ret = or(newLhs, newRhs);
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
