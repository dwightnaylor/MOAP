package kernelLanguage;

import static kernelLanguage.KernelFactory.*;

import java.util.*;
import java.util.stream.Collectors;

import algorithmMaker.util.KernelUtil;

public class KProblem extends KObject {
	public final List<String> vars;
	public final KProperty property;

	KProblem(List<String> vars, KProperty property) {
		this.property = property;
		this.vars = Collections.unmodifiableList(vars);
		HashSet<String> varSet = new HashSet<String>(vars);
		if (KernelUtil.ERROR_ON_NESTED_VARS)
			for (KObject object : KernelUtil.contents(property))
				if (object instanceof KProblem)
					for (String var : ((KProblem) object).vars)
						if (varSet.contains(var)) {
							throw new IllegalKernelException(
									"The variable \"" + var + "\" was declared in both a problem and its property.\n"
											+ "The variable list was " + vars + "\nThe property was :" + property);
						}
	}

	/**
	 * Reduces variables usage such that any undeclared variables are declared
	 * in the given, and any unused declarations in either the given or the goal
	 * are removed.
	 */
	public KProblem fixVariables() {
		return null;
	}

	public boolean solved() {
		return property == TRUE;
	}

	@Override
	int calculateHashCode() {
		int ret = property.hashCode();
		for (String var : vars)
			ret *= var.hashCode();

		return ret;
	}

	@Override
	String calculateToString() {
		StringBuffer ret = new StringBuffer();
		for (String var : vars) {
			if (ret.length() > 0)
				ret.append(",");

			ret.append(var);
		}
		if (vars.size() > 0 && property != TRUE)
			ret.append(" st ");

		if (property != TRUE)
			ret.append(property.toString());

		return ret.toString();
	}

	public KProblem withProperty(KProperty newProperty) {
		return KernelFactory.problem(vars, newProperty);
	}

	public KProblem withVars(List<String> newVars) {
		return KernelFactory.problem(newVars, property);
	}

	public KProblem withoutVars(String... varsToRemove) {
		return KernelFactory
				.problem(vars.stream().filter(x -> !new HashSet<String>(Arrays.asList(varsToRemove)).contains(x))
						.collect(Collectors.toList()), property);
	}
}
