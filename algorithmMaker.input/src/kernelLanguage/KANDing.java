package kernelLanguage;

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
}
