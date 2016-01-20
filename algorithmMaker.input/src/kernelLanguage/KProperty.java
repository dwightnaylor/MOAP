package kernelLanguage;

import java.util.HashSet;

public abstract class KProperty extends KObject {

	public abstract KProperty without(HashSet<KProperty> toRemove);
}
