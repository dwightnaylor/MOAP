package kernelLanguage;


public class KQuantifier extends KProperty {
	public static enum Quantifier {
		forall, exists
	}

	public final Quantifier quantifier;
	public final KProblem subject;
	public final KProperty predicate;

	KQuantifier(Quantifier quantifier, KProblem subject, KProperty predicate) {
		this.quantifier = quantifier;
		this.subject = subject;
		this.predicate = predicate;
	}

	public boolean isUniversal() {
		return quantifier.equals(Quantifier.forall);
	}

	@Override
	int calculateHashCode() {
		return (quantifier == Quantifier.forall ? 1 : -1) * subject.hashCode() * predicate.hashCode();
	}

	@Override
	String calculateToString() {
		StringBuffer ret = new StringBuffer();
		ret.append(quantifier);
		ret.append('(');
		ret.append(subject.toString());
		ret.append(" : ");
		ret.append(predicate.toString());
		ret.append(')');
		return ret.toString();
	}
}
