package kernelLanguage;

import static kernelLanguage.KernelFactory.*;
import algorithmMaker.util.KernelUtil;

public class KTheorem {
	public final KProperty requirement;
	public final KProperty result;
	public final int cost;
	public final String description;

	protected KTheorem(KProperty requirement, KProperty result, int cost, String description) {
		this.requirement = requirement;
		this.result = result;
		this.cost = cost;
		this.description = description;
	}

	@Override
	public String toString() {
		return requirement + "->" + result;
	}

	public KTheorem getContrapositive() {
		return theorem((KProperty) KernelUtil.canonicalizeOrder(negate(result)),
				(KProperty) KernelUtil.canonicalizeOrder(negate(requirement)), cost, "Contrapositive of " + description);
	}

	public KTheorem getConverse() {
		return theorem(result, requirement, cost, description);
	}

	public static void main(String[] args) {
		while (true) {
		}
	}

	public KTheorem canonicalize() {
		return theorem((KProperty) KernelUtil.canonicalizeOrder(requirement), (KProperty) KernelUtil.canonicalizeOrder(result),
				cost, description);
	}
}
