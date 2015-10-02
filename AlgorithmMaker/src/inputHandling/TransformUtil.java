package inputHandling;

import java.util.ArrayList;
import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import theorems.MultistageTheorem;
import theorems.QuickTheorem;
import algorithmMaker.input.*;
import algorithmMaker.input.impl.InputFactoryImpl;
import algorithmMaker.util.InputUtil;
import solver.Chainer;

public class TransformUtil {

	// TODO: DN:Should move these somewhere else...
	public static final Theorem GIVEN = new QuickTheorem(null, null, 0, "GIVEN");
	public static final Theorem GOAL = new QuickTheorem(null, null, 0, "GOAL");

	public static Input simplify(Input input, Chainer chainer) {
		chainer.chain(input.getGiven().getProperty(), GIVEN);
		HashSet<Atomic> atomicsToRemove = new HashSet<Atomic>(chainer.getAtomics());
		Property simplifiedFind = (Property) simplify(input.getGoal().getProperty(), atomicsToRemove);
		if (simplifiedFind == null) {
			// FIXME: DN: Figure out what to do when a goal is null
		}
		Input inputRet = (Input) new EcoreUtil.Copier().copy(input);
		inputRet.getGoal().setProperty(simplifiedFind);
		return inputRet;
	}

	public static EObject simplify(EObject cur, HashSet<Atomic> atomicsToRemove) {
		switch (InputUtil.type(cur)) {
		case ANDing:
			EObject andLeft = simplify(((ANDing) cur).getLeft(), atomicsToRemove);
			EObject andRight = simplify(((ANDing) cur).getRight(), atomicsToRemove);
			if (andLeft != null && andRight != null)
				return cur;
			if (andLeft != null)
				return andLeft;
			if (andRight != null)
				return andRight;

			ANDing andRet = InputFactoryImpl.eINSTANCE.createANDing();
			andRet.setLeft((Property) andLeft);
			andRet.setRight((Property) andRight);
			return andRet;
		case Atomic:
			if (!atomicsToRemove.contains(cur))
				return cur;

			return null;
		case ORing:
			EObject orLeft = simplify(((ORing) cur).getLeft(), atomicsToRemove);
			EObject orRight = simplify(((ORing) cur).getRight(), atomicsToRemove);
			if (orLeft != null && orRight != null)
				return cur;
			if (orLeft != null)
				return orLeft;
			if (orRight != null)
				return orRight;

			ORing orRet = InputFactoryImpl.eINSTANCE.createORing();
			orRet.setLeft((Property) orLeft);
			orRet.setRight((Property) orRight);
			return orRet;
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
		}
		return null;
	}

	public static Input transform(Input input, MultistageTheorem... multistageTheorems) {
		Input clone = (Input) new EcoreUtil.Copier().copy(input);

		// Put in all of the new terms that the given has
		ArrayList<Property> newGiven = new ArrayList<Property>();
		newGiven.add(clone.getGiven().getProperty());
		for (MultistageTheorem mst : multistageTheorems) {
			newGiven.add(mst.getResult());
		}
		clone.getGiven().setProperty(InputUtil.andTogether(newGiven));

		// Add in all of the new variables used.
		for (String undeclaredVar : InputUtil.getUnboundVariables(clone.getGiven()))
			clone.getGiven().getVars().add(undeclaredVar);

		return clone;
	}
}
