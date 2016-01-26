package kernelLanguage;

import java.util.HashSet;

public class KBooleanLiteral extends KProperty {
	public final boolean value;

	KBooleanLiteral(boolean value) {
		this.value = value;
	}

	@Override
	int calculateHashCode() {
		return value ? 9999 : -9999;
	}

	@Override
	String calculateToString() {
		return ("" + value).toUpperCase();
	}

	public KBooleanLiteral negate() {
		return KernelFactory.bool(!value);
	}

	@Override
	public KProperty without(HashSet<KProperty> toRemove) {
		return this;
	}

	@Override
	public void validate() {
	}
}
