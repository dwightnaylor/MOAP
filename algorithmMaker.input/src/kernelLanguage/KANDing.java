package kernelLanguage;

import static kernelLanguage.KernelFactory.*;

import java.util.HashSet;

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
		ret.append(lhs);
		ret.append(" & ");
		ret.append(rhs);
		return ret.toString();
	}

	@Override
	public KProperty without(HashSet<KProperty> toRemove) {
		KProperty newLhs = lhs.without(toRemove);
		KProperty newRhs = rhs.without(toRemove);
		if (newLhs == FALSE || newRhs == FALSE)
			return FALSE;

		if (toRemove.contains(newLhs) || newLhs == TRUE)
			if (toRemove.contains(newRhs) || newRhs == TRUE)
				return TRUE;
			else
				return newRhs;

		if (toRemove.contains(newRhs) || newRhs == TRUE)
			return newLhs;

		return and(newLhs, newRhs);
	}
}
