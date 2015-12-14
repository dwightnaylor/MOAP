package kernelLanguage;

import static kernelLanguage.KernelFactory.TRUE;

import java.util.*;

import algorithmMaker.util.KernelUtil;

public class KInput extends KObject {
	public final KProblem given;
	public final KProblem goal;

	KInput(KProblem given, KProblem goal) {
		this.given = given;
		this.goal = goal;
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

	public KInput withMinimumVariables() {
		HashSet<String> newGivenVarsSet = KernelUtil.getUndeclaredVars(given.withVars(Collections.emptyList()));
		newGivenVarsSet.addAll(KernelUtil.getUndeclaredVars(goal));
		ArrayList<String> newGivenVars = new ArrayList<String>(newGivenVarsSet);
		Collections.sort(newGivenVars);

		HashSet<String> newGoalVarsSet = KernelUtil.getUndeclaredVars(goal.withVars(Collections.emptyList()));
		newGoalVarsSet.removeAll(newGivenVarsSet);
		ArrayList<String> newGoalVars = new ArrayList<String>(newGoalVarsSet);
		Collections.sort(newGoalVars);

		return withGiven(given.withVars(newGivenVars)).withGoal(goal.withVars(newGoalVars));
	}
}