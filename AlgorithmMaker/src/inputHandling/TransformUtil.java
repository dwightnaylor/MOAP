package inputHandling;

import java.util.ArrayList;
import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import theorems.MultistageTheorem;
import theorems.QuickTheorem;
import algorithmMaker.QuickParser;
import algorithmMaker.input.*;
import algorithmMaker.input.impl.InputFactoryImpl;
import algorithmMaker.util.InputUtil;
import solver.Chainer;

public class TransformUtil {

	public static final MultistageTheorem GIVEN_PROBLEM = new MultistageTheorem(null, null, null, 0, "GIVEN PROBLEM",
			null);
	public static final Theorem GIVEN = new QuickTheorem(null, null, 0, "GIVEN");
	public static final Theorem GOAL = new QuickTheorem(null, null, 0, "GOAL");

	public static boolean isSolved(Problem problem) {
		// TODO:DN: Do this better
		Problem solved = QuickParser.parseProblem("x st TRUE");
		solved.getVars().clear();
		return solved.equals(problem);
	}

	/**
	 * Reduces the given input by taking things out of the goal if they are in
	 * the given, and reducing variable use in both halves.
	 */
	public static Input simplify(Input input, Chainer chainer) {
		Input inputRet = (Input) new EcoreUtil.Copier().copy(input);

		Property given = input.getGiven().getProperty();
		if (given != null) {
			Property simplifiedGiven = (Property) simplify(given, new HashSet<Atomic>());
			inputRet.getGiven().setProperty(
					simplifiedGiven == null ? QuickParser.parseProperty("TRUE") : simplifiedGiven);
		}

		chainer.chain(inputRet.getGiven().getProperty(), GIVEN);
		HashSet<Atomic> atomicsToRemove = new HashSet<Atomic>(chainer.getAtomics());
		Property find = input.getGoal().getProperty();
		if (find != null) {
			Property simplifiedFind = (Property) simplify(find, atomicsToRemove);
			inputRet.getGoal().setProperty(simplifiedFind == null ? QuickParser.parseProperty("TRUE") : simplifiedFind);
		}

		InputUtil.compactVariables(inputRet.getGiven());
		// InputUtil.compactVariables(inputRet.getGoal());
		return inputRet;
	}

	public static EObject simplify(EObject cur, HashSet<Atomic> atomicsToRemove) {
		if (cur == null)
			return null;

		switch (InputUtil.type(cur)) {
		case ANDing:
			EObject andLeft = simplify(((ANDing) cur).getLeft(), atomicsToRemove);
			EObject andRight = simplify(((ANDing) cur).getRight(), atomicsToRemove);
			if (andLeft != null && andRight != null) {
				ANDing andRet = InputFactoryImpl.eINSTANCE.createANDing();
				andRet.setLeft((Property) andLeft);
				andRet.setRight((Property) andRight);
				return andRet;
			}
			if (andLeft != null)
				return andLeft;
			if (andRight != null)
				return andRight;

			return null;
		case ORing:
			EObject orLeft = simplify(((ORing) cur).getLeft(), atomicsToRemove);
			EObject orRight = simplify(((ORing) cur).getRight(), atomicsToRemove);
			if (orLeft != null && orRight != null) {
				ORing orRet = InputFactoryImpl.eINSTANCE.createORing();
				orRet.setLeft((Property) orLeft);
				orRet.setRight((Property) orRight);
				return orRet;
			}
			if (orLeft != null)
				return orLeft;
			if (orRight != null)
				return orRight;

			return null;
		case Quantifier:
			EObject requirement = simplify(((Quantifier) cur).getSubject(), atomicsToRemove);
			EObject result = simplify(((Quantifier) cur).getSubject(), atomicsToRemove);

			Quantifier quantifierRet = (Quantifier) new EcoreUtil.Copier().copy(cur);
			quantifierRet.setSubject((Problem) requirement);
			quantifierRet.setSubject((Problem) result);
			return quantifierRet;
		case Problem:
			EObject property = simplify(((Problem) cur).getProperty(), atomicsToRemove);

			if (property == null)
				return null;

			Problem problemRet = (Problem) new EcoreUtil.Copier().copy(cur);
			problemRet.setProperty((Property) property);
			return problemRet;
		case Input:
			throw new UnsupportedOperationException();
		case Atomic:
			if (atomicsToRemove.contains(cur) || ((Atomic) cur).getFunction().equals(InputUtil.BOUND)
					|| ((Atomic) cur).getFunction().equals(InputUtil.UNBOUND))
				return null;

			atomicsToRemove.add((Atomic) cur);
		case BooleanLiteral:
			return cur;
		}
		return null;
	}

	public static Input transform(Input input, MultistageTheorem... multistageTheorems) {
		Input clone = (Input) new EcoreUtil.Copier().copy(input);

		// Put in all of the new terms that the given has
		ArrayList<Property> newGiven = new ArrayList<Property>();
		newGiven.add(clone.getGiven().getProperty());
		for (MultistageTheorem mst : multistageTheorems)
			newGiven.add(mst.getResult());

		clone.getGiven().setProperty(InputUtil.andTogether(newGiven));

		// Add in all of the new variables used.
		for (String undeclaredVar : InputUtil.getUnboundVariables(clone.getGiven()))
			clone.getGiven().getVars().add(undeclaredVar);

		return clone;
	}
}
