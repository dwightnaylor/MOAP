package kernelLanguage;

import java.util.*;

public abstract class KProperty extends KObject {

	public KProperty without(KProperty... toRemove) {
		return without(Arrays.asList(toRemove));
	}

	public KProperty without(Collection<KProperty> toRemove) {
		return without(new HashSet<KProperty>(toRemove));
	}

	protected abstract KProperty without(HashSet<KProperty> toRemove);
}
