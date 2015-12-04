package inputHandling;

import java.util.ArrayList;
import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;

import solver.Chainer;
import theorems.MultistageTheorem;
import theorems.QuickTheorem;
import algorithmMaker.QuickParser;
import algorithmMaker.input.*;
import algorithmMaker.util.InputConverter;
import algorithmMaker.util.InputUtil;

/**
 * A class for fundamental transformations of input. All simple operations should instead go in InputUtil.java in the
 * algorithmMaker.input project.
 * 
 * @author Dwight Naylor
 */
public class TransformUtil {

	public static final MultistageTheorem GIVEN_PROBLEM = new MultistageTheorem(null, null, null, 0, "GIVEN PROBLEM",
			null);
	public static final Theorem GIVEN = new QuickTheorem(null, null, 0, "GIVEN");
	public static final Theorem REFLEXIVE = new QuickTheorem(null, null, 0, "Reflexive Property");
	public static final Theorem GOAL = new QuickTheorem(null, null, 0, "GOAL");
	public static final Theorem EQUAL = new QuickTheorem(null, null, 0, "Equal variables share properties.");

	public static boolean isSolved(Problem problem) {
		return problem.getProperty().equals(InputUtil.getBooleanLiteral(true));
	}

	/**
	 * Reduces the given input by taking things out of the goal if they are in the given, and reducing variable use in
	 * both halves.
	 */
	public static void removeGivenFromGoal(Input input, Chainer chainer) {
		if (input.getGoal() == null)
			return;

		HashSet<Property> toRemove = new HashSet<Property>();
		ArrayList<Declaration> vars = new ArrayList<Declaration>();
		vars.addAll(input.getGiven().getVars());
		vars.addAll(input.getGoal().getVars());
		for (Declaration declaration : vars) {
			String varName = declaration.getVarName();
			toRemove.add(InputUtil.createAtomic(InputUtil.EQUAL, varName, varName));
			toRemove.add(InputUtil.createAtomic(InputUtil.BOUND, varName));
			toRemove.add(InputUtil.createAtomic(InputUtil.UNBOUND, varName));
		}

		Property given = input.getGiven().getProperty();
		if (given != null) {
			Property reducedGiven = (Property) removeProperties(given, toRemove);
			input.getGiven().setProperty(reducedGiven == null ? QuickParser.parseProperty("TRUE") : reducedGiven);

			chainer.chain(input.getGiven().getProperty(), GIVEN);
		}
		toRemove.addAll(chainer.properties.keySet());
		Property find = input.getGoal().getProperty();
		if (find != null) {
			Property reducedFind = (Property) removeProperties(find, toRemove);
			input.getGoal().setProperty(reducedFind == null ? QuickParser.parseProperty("TRUE") : reducedFind);
		}

		if (given != null)
			compactVariables(input.getGiven(), input.getGoal());

		if (input.getGoal().getProperty().equals(InputUtil.getBooleanLiteral(true)))
			input.setGoal(null);
	}

	/**
	 * Sets the given problem to contain all the variables that appear within it. Removes any of the variables in the
	 * given from the goal.
	 */
	public static void compactVariables(Problem given, Problem goal) {
		given.getVars().clear();
		for (String var : InputUtil.getUnboundVariables(given.getProperty()))
			given.getVars().add(InputUtil.createDeclaration(var));

		for (String var : InputUtil.getUnboundVariables(goal.getProperty()))
			given.getVars().add(InputUtil.createDeclaration(var));

		// This is done in n^2 time here because we want to preserve order and I'm lazy.
		for (Declaration declaration : given.getVars())
			goal.getVars().removeIf(x -> x.getVarName().equals(declaration.getVarName()));
	}

	public static EObject removeProperties(EObject originalObject, HashSet<? extends Property> toRemove) {
		return InputUtil.reduce(originalObject, new InputConverter() {
			@Override
			public EObject apply(EObject cur) {
				if (toRemove.contains(cur))
					return null;

				return cur;
			}
		});
	}

	public static Input transform(Input input, MultistageTheorem... multistageTheorems) {
		Input clone = InputUtil.stupidCopy(input);

		// Put in all of the new terms that the given has
		ArrayList<Property> newGiven = new ArrayList<Property>();
		newGiven.add(clone.getGiven().getProperty());
		for (MultistageTheorem mst : multistageTheorems)
			newGiven.add(mst.getResult());

		clone.getGiven().setProperty(InputUtil.andTogether(newGiven));

		// Add in all of the new variables used.
		for (String undeclaredVar : InputUtil.getUnboundVariables(clone.getGiven()))
			clone.getGiven().getVars().add(InputUtil.createDeclaration(undeclaredVar));

		return clone;
	}
}
