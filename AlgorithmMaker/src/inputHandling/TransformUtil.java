package inputHandling;

import java.util.ArrayList;
import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;

import solver.Chainer;
import theorems.MultistageTheorem;
import theorems.QuickTheorem;
import algorithmMaker.QuickParser;
import algorithmMaker.input.Atomic;
import algorithmMaker.input.Declaration;
import algorithmMaker.input.Input;
import algorithmMaker.input.Problem;
import algorithmMaker.input.Property;
import algorithmMaker.input.Theorem;
import algorithmMaker.input.Type;
import algorithmMaker.input.Variable;
import algorithmMaker.input.impl.InputFactoryImpl;
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
	public static Input removeGivenFromGoal(Input input, Chainer chainer) {
		if (input.getGoal() == null)
			return input;

		Input inputRet = InputUtil.stupidCopy(input);
		HashSet<Property> toRemove = new HashSet<Property>();
		ArrayList<Declaration> vars = new ArrayList<Declaration>();
		vars.addAll(input.getGiven().getVars());
		vars.addAll(input.getGoal().getVars());
		for (Declaration declaration : vars) {
			String varName = declaration.getVarName();
			toRemove.add(InputUtil.getAtomic(InputUtil.EQUAL, varName, varName));
			toRemove.add(InputUtil.getAtomic(InputUtil.BOUND, varName));
			toRemove.add(InputUtil.getAtomic(InputUtil.UNBOUND, varName));
		}

		Property given = input.getGiven().getProperty();
		if (given != null) {
			Property reducedGiven = (Property) removeProperties(given, toRemove);
			inputRet.getGiven().setProperty(reducedGiven == null ? QuickParser.parseProperty("TRUE") : reducedGiven);
		}

		chainer.chain(inputRet.getGiven().getProperty(), GIVEN);
		toRemove.addAll(chainer.copyProperties());
		Property find = input.getGoal().getProperty();
		if (find != null) {
			Property reducedFind = (Property) removeProperties(find, toRemove);
			inputRet.getGoal().setProperty(reducedFind == null ? QuickParser.parseProperty("TRUE") : reducedFind);
		}

		InputUtil.compactVariables(inputRet.getGiven());

		if (inputRet.getGoal().getProperty().equals(InputUtil.getBooleanLiteral(true)))
			inputRet.setGoal(null);
		
		return inputRet;
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

	public static Input makePretty(Input problem) {
		return (Input) InputUtil.reduce(problem, x -> x instanceof Problem ? makePretty((Problem) x) : x);
	}

	public static Problem makePretty(Problem problem) {
		return (Problem) InputUtil.reduce(problem, new InputConverter() {
			@Override
			public EObject apply(EObject cur) {
				if (cur instanceof Problem) {
					ArrayList<Property> topLevelAtomics = InputUtil.getTopLevelElements(((Problem) cur).getProperty());
					for (int i = 0; i < topLevelAtomics.size(); i++) {
						if (topLevelAtomics.get(i) instanceof Atomic) {
							Atomic atomic = (Atomic) topLevelAtomics.get(i);
							String function = atomic.getFunction();
							if (InputUtil.isTypeAtomic(function)) {
								Declaration declaration = InputUtil.findDeclarationFor((Variable) atomic.getArgs().get(
										0));
								if (declaration.getType() == null)
									declaration.setType(InputFactoryImpl.eINSTANCE.createType());

								declaration.getType().setName(InputUtil.getDeclaredType(function));
								topLevelAtomics.remove(i--);
							} else if (InputUtil.isChildTypeAtomic(function)) {
								Declaration declaration = InputUtil.findDeclarationFor((Variable) atomic.getArgs().get(
										0));
								if (declaration.getType() == null)
									declaration.setType(InputFactoryImpl.eINSTANCE.createType());

								Type childType = InputFactoryImpl.eINSTANCE.createType();
								childType.setName(InputUtil.getDeclaredChildType(function));
								declaration.getType().setTemplateType(childType);
								topLevelAtomics.remove(i--);
							}
						}
					}
					((Problem) cur).setProperty(InputUtil.andTogether(topLevelAtomics));
				}
				return cur;
			}
		});
	}
}
