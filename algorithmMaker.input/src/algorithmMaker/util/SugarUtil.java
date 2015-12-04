package algorithmMaker.util;

import java.util.*;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import algorithmMaker.QuickParser;
import algorithmMaker.input.*;
import algorithmMaker.input.impl.InputFactoryImpl;

/**
 * The class responsible for all of the "sugaring" and "desugaring" of input
 * 
 * @author Dwight Naylor
 */
public class SugarUtil {
	public static void desugar(Input input) {
		desugar(input.getGiven());
		desugar(input.getGoal());
	}

	public static void desugar(Problem problem) {
		ArrayList<Property> properties = new ArrayList<Property>();
		properties.add(problem.getProperty());
		// Go through all the declarations and remove their type declaration.
		// Replace it with type declaration atomics.
		HashSet<String> declaredVars = InputUtil.getDeclaredVars(problem);
		for (Declaration declaration : problem.getVars())
			if (declaration.getType() != null)
				properties.add(getDesugaredTypeDeclaration(declaration.getType(), declaration.getVarName(),
						declaredVars));

		problem.setProperty(InputUtil.andTogether(properties));

		// This whole chunk is JUST for removing nested atomics.
		desugarNestedAtomics(problem);
	}

	private static Property getDesugaredTypeDeclaration(Type type, String varName, HashSet<String> usedVars) {
		Property ret = InputUtil.createAtomic(InputUtil.TYPE_MARKER + type.getName(), varName);
		if (type.getTemplateType() != null) {
			String newVar = InputUtil.getUnusedVar(usedVars);
			usedVars.add(newVar);
			Quantifier quantifier = InputUtil.createQuantifier(
					InputUtil.FORALL,
					InputUtil.createProblem(Collections.singleton(newVar),
							InputUtil.createAtomic("child", varName, newVar)),
					getDesugaredTypeDeclaration(type.getTemplateType(), newVar, usedVars));
			usedVars.remove(newVar);
			ret = InputUtil.andTogether(Arrays.asList(new Property[] { ret, quantifier }));
		}
		return ret;
	}

	private static void desugarNestedAtomics(Problem problem) {
		problem.setProperty((Property) InputUtil.reduce(problem.getProperty(), new InputConverter() {
			@Override
			public EObject apply(EObject cur) {
				if (!(cur instanceof SugarAtomic))
					return cur;

				ArrayList<Atomic> newAtomics = new ArrayList<Atomic>();
				Hashtable<SugarNumericalProperty, String> nestedArgs = new Hashtable<SugarNumericalProperty, String>();
				denest((SugarAtomic) cur, InputUtil.getDeclaredVars(problem), nestedArgs, newAtomics, false);
				if (newAtomics.size() == 1)
					return newAtomics.iterator().next();

				ArrayList<String> varsToDeclare = new ArrayList<String>();
				for (SugarNumericalProperty property : nestedArgs.keySet())
					if (!(property instanceof SugarVariable))
						varsToDeclare.add(nestedArgs.get(property));

				Collections.sort(varsToDeclare);
				for (String var : varsToDeclare)
					problem.getVars().add(InputUtil.createDeclaration(var));

				return InputUtil.andTogether(newAtomics);
			}

			private void denest(SugarNumericalProperty property, HashSet<String> allVars,
					Hashtable<SugarNumericalProperty, String> nestedArgs, ArrayList<Atomic> newAtomics, boolean nested) {
				if (nestedArgs.containsKey(property))
					return;

				if (property instanceof SugarVariable) {
					nestedArgs.put(property, ((SugarVariable) property).getArg());
					return;
				}

				String newArg = null;
				if (nested) {
					newArg = InputUtil.getUnusedVar(allVars);
					allVars.add(newArg);
					nestedArgs.put(property, newArg);
				}
				Atomic replacement;
				if (property instanceof SugarAtomic) {
					replacement = InputUtil.createAtomic(((SugarAtomic) property).getFunction());
					for (SugarNumericalProperty argument : ((SugarAtomic) property).getArgs()) {
						denest(argument, allVars, nestedArgs, newAtomics, true);
						replacement.getArgs().add(nestedArgs.get(argument));
					}
				} else if (property instanceof Atomic) {
					replacement = InputUtil.createAtomic(((Atomic) property).getFunction());
					for (String argument : ((Atomic) property).getArgs())
						replacement.getArgs().add(argument);

				} else if (property instanceof SugarAddition) {
					SugarAddition addition = (SugarAddition) property;
					replacement = InputUtil.createAtomic(addition.getSymbol().equals("+") ? InputUtil.ADDITION
							: InputUtil.SUBTRACTION);
					denest(addition.getLeft(), allVars, nestedArgs, newAtomics, true);
					denest(addition.getRight(), allVars, nestedArgs, newAtomics, true);
					replacement.getArgs().add(nestedArgs.get(addition.getLeft()));
					replacement.getArgs().add(nestedArgs.get(addition.getRight()));
				} else if (property instanceof SugarMultiplication) {
					SugarMultiplication addition = (SugarMultiplication) property;
					replacement = InputUtil.createAtomic(addition.getSymbol().equals("*") ? InputUtil.MULTIPLICATION
							: InputUtil.DIVISION);
					denest(addition.getLeft(), allVars, nestedArgs, newAtomics, true);
					denest(addition.getRight(), allVars, nestedArgs, newAtomics, true);
					replacement.getArgs().add(nestedArgs.get(addition.getLeft()));
					replacement.getArgs().add(nestedArgs.get(addition.getRight()));
				} else {
					throw new UnsupportedOperationException("Can't denest a " + property.getClass());
				}
				if (nested)
					replacement.getArgs().add(newArg);

				newAtomics.add(replacement);
			}
		}));
	}

	// TODO:DN: This method also has to be fixed up...god this is hacky
	public static Input resugar(Input problem) {
		Input ret = InputFactoryImpl.eINSTANCE.createInput();
		ret.setGiven(resugar(problem.getGiven()));
		ret.setTask(problem.getTask());
		ret.setGoal(resugar(problem.getGoal()));

		if (ret.getGiven() != null) {
			Hashtable<String, Declaration> originalDeclarations = new Hashtable<String, Declaration>();
			for (Declaration declaration : ret.getGiven().getVars())
				originalDeclarations.put(declaration.getVarName(), declaration);

			if (ret.getGoal() != null)
				for (Declaration declaration : ret.getGoal().getVars())
					originalDeclarations.put(declaration.getVarName(), declaration);

			ret.getGiven().getVars().clear();
			if (ret.getGiven().getProperty() != null)
				for (String var : InputUtil.getUnboundVariables(ret.getGiven().getProperty()))
					ret.getGiven()
							.getVars()
							.add(originalDeclarations.containsKey(var) ? originalDeclarations.get(var) : InputUtil
									.createDeclaration(var));

			if (ret.getGoal() != null && ret.getGoal().getProperty() != null) {
				for (String var : InputUtil.getUnboundVariables(ret.getGoal().getProperty()))
					ret.getGiven()
							.getVars()
							.add(originalDeclarations.containsKey(var) ? originalDeclarations.get(var) : InputUtil
									.createDeclaration(var));

				ret.getGoal().getVars().clear();
				for (String var : InputUtil.getUnboundVariables(ret.getGoal().getProperty()))
					ret.getGoal()
							.getVars()
							.add(originalDeclarations.containsKey(var) ? originalDeclarations.get(var) : InputUtil
									.createDeclaration(var));
			}
		}
		return ret;
	}

	public static Problem resugar(Problem problem) {
		if (problem == null)
			return null;
		// TODO:RESUGAR: Collapse arithmetic (PROPERLY, the current way is AWFUL!)
		// TODO:RESUGAR: Re-nest atomics if possible (PROPERLY, the current way is AWFUL!)
		// TODO:RESUGAR: collapse quantifiers if possible (child_type...)
		Hashtable<String, String[]> replacements = new Hashtable<String, String[]>();
		TreeIterator<EObject> contents = (problem.eContainer() == null ? problem : problem.eContainer()).eAllContents();
		while (contents.hasNext()) {
			EObject cur = contents.next();
			if (cur instanceof Atomic && InputUtil.isArithmetic(((Atomic) cur).getFunction())) {
				Atomic atomic = (Atomic) cur;
				replacements.put(atomic.getArgs().get(2),
						new String[] { atomic.getArgs().get(0), InputUtil.getSymbol(atomic.getFunction()),
								atomic.getArgs().get(1) });
			}
		}
		return (Problem) InputUtil.reduce(problem, new InputConverter() {

			private String breakDown(String arg, Hashtable<String, String[]> replacements) {
				if (!replacements.containsKey(arg))
					return arg;

				String[] rep = replacements.get(arg);
				return breakDown(rep[0], replacements) + rep[1] + breakDown(rep[2], replacements);
			}

			@Override
			public EObject apply(EObject cur) {
				if (cur instanceof Problem) {
					ArrayList<Property> topLevelAtomics = InputUtil.getTopLevelElements(((Problem) cur).getProperty());
					for (int i = 0; i < topLevelAtomics.size(); i++) {
						if (topLevelAtomics.get(i) instanceof Atomic) {
							Atomic atomic = (Atomic) topLevelAtomics.get(i);
							String function = atomic.getFunction();
							if (InputUtil.isTypeAtomic(function)) {
								Declaration declaration = InputUtil.getDeclaration(atomic, atomic.getArgs().get(0));
								if (declaration.getType() == null)
									declaration.setType(InputFactoryImpl.eINSTANCE.createType());

								declaration.getType().setName(InputUtil.getDeclaredType(function));
								topLevelAtomics.remove(i--);
							} else if (InputUtil.isChildTypeAtomic(function)) {
								Declaration declaration = InputUtil.getDeclaration(atomic, atomic.getArgs().get(0));
								if (declaration.getType() == null)
									declaration.setType(InputFactoryImpl.eINSTANCE.createType());

								Type childType = InputFactoryImpl.eINSTANCE.createType();
								childType.setName(InputUtil.getDeclaredChildType(function));
								declaration.getType().setTemplateType(childType);
								topLevelAtomics.remove(i--);
							} else if (InputUtil.isArithmetic(function)) {
								topLevelAtomics.remove(i--);
							} else {
								boolean useSugarAtomic = false;
								for (String arg : atomic.getArgs())
									if (replacements.containsKey(arg)) {
										useSugarAtomic = true;
										break;
									}
								if (useSugarAtomic) {
									SugarAtomic newAtomic = InputFactoryImpl.eINSTANCE.createSugarAtomic();
									for (String arg : atomic.getArgs()) {
										newAtomic.getArgs().add(
												QuickParser.parseSugarNumericalProperty(breakDown(arg, replacements)));
									}
									newAtomic.setFunction(function);
									topLevelAtomics.add(i, newAtomic);
								} else {
									topLevelAtomics.add(i, InputUtil.stupidCopy(atomic));
								}
								topLevelAtomics.remove(i + 1);
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
