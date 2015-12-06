package kernelLanguage;

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
}
