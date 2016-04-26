package kernelLanguage;

import java.util.*;

public abstract class KProperty extends KObject {

	public KProperty without(KProperty... toRemove) {
		return without(Arrays.asList(toRemove));
	}

	public KProperty without(Collection<KProperty> toRemove) {
		return without(toRemove instanceof Set ? (Set<KProperty>) toRemove : new HashSet<KProperty>(toRemove));
	}

	protected abstract KProperty without(Set<KProperty> toRemove);
}
