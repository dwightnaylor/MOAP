package kernelLanguage;

import static kernelLanguage.KernelFactory.*;

import java.util.*;

import algorithmMaker.util.KernelUtil;

public class KQuantifier extends KProperty {
	public static enum Quantifier {
		forall, exists
	}

	public final Quantifier quantifier;
	public final KProblem subject;

	KQuantifier(Quantifier quantifier, KProblem subject) {
		this.quantifier = quantifier;
		this.subject = subject;
	}

	@Override
	protected KProperty without(Set<KProperty> toRemove) {
		KProperty newSubjectProperty = (KProperty) KernelUtil.canonicalizeOrder(subject.property.without(toRemove));
		if (newSubjectProperty instanceof KBooleanLiteral)
			return newSubjectProperty;

		KProperty ret = (KProperty) KernelUtil
				.canonicalizeOrder(withSubject(subject.withProperty(newSubjectProperty).withUnusedVarsRemoved()));
		if (toRemove.contains(ret))
			return TRUE;

		if (toRemove.contains(KernelUtil.canonicalizeOrder(negate(ret))))
			return FALSE;

		return ret;
	}

	public KQuantifier withSubject(KProblem newSubject) {
		return quantifier(quantifier, newSubject);
	}

	public KQuantifier withProperty(KProperty property) {
		return quantifier(quantifier, subject.withProperty(property));
	}

	public boolean isUniversal() {
		return quantifier.equals(Quantifier.forall);
	}

	@Override
	int calculateHashCode() {
		return (quantifier == Quantifier.forall ? 1 : -1) * subject.hashCode();
	}

	@Override
	String calculateToString() {
		StringBuffer ret = new StringBuffer();
		ret.append(quantifier);
		ret.append('(');
		ret.append(subject.toString().replace(" st ", " : "));
		ret.append(')');
		return ret.toString();
	}

	@Override
	public void validate() {
		subject.validate();
	}
}
