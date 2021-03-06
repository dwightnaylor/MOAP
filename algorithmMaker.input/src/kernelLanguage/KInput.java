package kernelLanguage;

import static kernelLanguage.KernelFactory.TRUE;

import java.util.HashSet;

import algorithmMaker.util.KernelUtil;

public class KInput extends KObject {
	public final KProblem given;
	public final KProblem goal;

	KInput(KProblem given, KProblem goal) {
		this.given = given;
		this.goal = goal;
		HashSet<String> varSet = new HashSet<String>(given.vars);
		if (KernelUtil.ERROR_ON_NESTED_VARS)
			for (KObject object : KernelUtil.contents(goal))
				if (object instanceof KProblem)
					for (String var : ((KProblem) object).vars)
						if (varSet.contains(var))
							throw new IllegalKernelException(
									"The variable \"" + var + "\" was declared in both an input given and its goal.");
	}

	@Override
	int calculateHashCode() {
		return given.hashCode() * goal.hashCode();
	}

	@Override
	String calculateToString() {
		StringBuffer ret = new StringBuffer();
		ret.append("Given ");
		ret.append(given.toString());
		ret.append(';');
		if (goal.vars.size() > 0 || goal.property != TRUE) {
			ret.append(" Find ");
			ret.append(goal.toString());
		}
		return ret.toString();
	}

	public KInput withGiven(KProblem newGiven) {
		return KernelFactory.input(newGiven, goal);
	}

	public KInput withGoal(KProblem newGoal) {
		return KernelFactory.input(given, newGoal);
	}

	public KInput withGivenProperty(KProperty newProperty) {
		return withGiven(given.withProperty(newProperty));
	}

	public KInput withGoalProperty(KProperty newProperty) {
		return withGoal(goal.withProperty(newProperty));
	}

	@Override
	public void validate() {
		goal.validate();
		given.validate();
		for (KObject subObject : KernelUtil.contents(goal)) {
			if (subObject instanceof KProblem) {
				for (String otherVar : ((KProblem) subObject).vars) {
					if (given.vars.contains(otherVar)) {
						throw new DirtyKernelException(
								"The variable " + otherVar + " was declared in both the given of \"" + this
										+ "\" and in \"" + subObject + "\", which is in the goal.");
					}
				}
			}
		}
	}
}
