/*
 * generated by Xtext
 */
package algorithmMaker.validation;

import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;

import algorithmMaker.input.*;
import algorithmMaker.util.InputUtil;

/**
 * This class contains custom validation rules.
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html# validation
 */
public class InputJavaValidator extends algorithmMaker.validation.AbstractInputJavaValidator {
	// TODO:Validation: do typechecking
	// TODO:Validation: warn if desired output has nothing to do with input

	@Check
	public void checkForMultipleVariableDeclaration(Problem problem) {
		HashSet<String> declaredVariables = new HashSet<String>();
		EObject parent = problem.eContainer();
		while (parent != null) {
			if (parent instanceof Problem)
				for (Declaration declaration : ((Problem) parent).getVars())
					declaredVariables.add(declaration.getVarName());

			parent = parent.eContainer();
		}
		for (Declaration declaration : problem.getVars()) {
			String varName = declaration.getVarName();
			if (declaredVariables.contains(varName))
				error(varName + " was previously declared.", declaration, InputPackage.Literals.DECLARATION__VAR_NAME);

			declaredVariables.add(varName);
		}
	}

	@Check
	public void checkForRedeclarationOfVariableInGoal(Input input) {
		if (input.getGoal() == null)
			return;

		HashSet<String> declaredVariables = new HashSet<String>();
		for (Declaration declaration : input.getGiven().getVars())
			declaredVariables.add(declaration.getVarName());

		for (Declaration declaration : input.getGoal().getVars()) {
			String varName = declaration.getVarName();
			if (declaredVariables.contains(varName))
				error(varName + " was already declared in the given.", declaration,
						InputPackage.Literals.DECLARATION__VAR_NAME);
		}

	}

	@Check
	public void checkForUndeclaredVariables(Variable variable) {
		if (InputUtil.getDeclaration(variable, variable.getArg()) == null)
			error(variable + " cannot be resolved to a variable.", variable, InputPackage.Literals.VARIABLE__ARG);
	}
}
