package algorithmMaker.util.metaProperties;

import java.util.*;

import kernelLanguage.*;

public class Transitivity implements MetaProperty {

	private static final HashSet<String> properties = new HashSet<String>(
			Arrays.asList(new String[] { "lessThanEqual", "greaterThanEqual", "lessThan", "greaterThan", "equal" }));

	public Transitivity() {
	}

	@Override
	public boolean satisfiedBy(KObject object) {
		return object instanceof KAtomic && properties.contains(((KAtomic) object).function);
	}

}
