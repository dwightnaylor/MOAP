package theorems.multiTheorems;

import theorems.MultistageTheorem;

public class DirectReturn extends MultistageTheorem {

	private static final String DESCRIPTION = "If there are no additional requirements for a variable, we can just return it.";

	public static final String VAR_NAME = "var";

	public DirectReturn() {
		super(null, null, null, 0, DESCRIPTION, "return <" + VAR_NAME + ">");
	}
}
