package inputHandling;

import static kernelLanguage.KernelFactory.*;

import java.util.*;

import algorithmMaker.util.KernelUtil;
import kernelLanguage.*;
import solver.Chainer;

/**
 * A class for fundamental transformations of input. All simple operations should instead go in InputUtil.java in the
 * algorithmMaker.input project.
 * 
 * @author Dwight Naylor
 */
public class TransformUtil {
	/**
	 * Reduces the given input by taking things out of the goal if they are in the given, and reducing variable use in
	 * both halves.
	 * 
	 * @return
	 */
	public static KInput removeGivenFromGoal(KInput input, Chainer chainer) {
		HashSet<KProperty> toRemove = new HashSet<KProperty>();
		ArrayList<String> vars = new ArrayList<String>();
		vars.addAll(input.given.vars);
		vars.addAll(input.goal.vars);
		for (String var : vars) {
			toRemove.add(atomic(EQUAL, var, var));
			toRemove.add(atomic(BOUND, var));
			toRemove.add(atomic(UNBOUND, var));
		}

		KProperty given = input.given.property;
		if (given != null) {
			chainer.chain(given);
			input = input.withGiven(input.given.withProperty(given.without(toRemove)));
		}

		toRemove.addAll(chainer.properties.keySet());

		KProperty find = input.goal.property;
		if (find != null) {
			input = input.withGoal(input.goal.withProperty(find.without(toRemove)));
		}

		return KernelUtil.withMinimumVariables(input);
	}
}
