package kernelLanguage;

import static kernelLanguage.KernelFactory.*;

import java.util.*;

import algorithmMaker.util.*;

public abstract class KProperty extends KObject {

	public KProperty without(KProperty... toRemove) {
		HashSet<KProperty> toRemoveSet = new HashSet<KProperty>(Arrays.asList(toRemove));
		KProperty ret = (KProperty) KernelUtil.map(this, new KernelMapper() {
			@Override
			public KObject calculateConversion(KObject object) {
				return toRemoveSet.contains(object) ? null : object;
			}
		});
		return ret == null ? TRUE : ret;
	}
}
