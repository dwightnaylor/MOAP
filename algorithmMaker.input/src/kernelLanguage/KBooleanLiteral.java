package kernelLanguage;

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
}
