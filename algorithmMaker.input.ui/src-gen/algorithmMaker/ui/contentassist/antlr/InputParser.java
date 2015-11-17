/*
 * generated by Xtext
 */
package algorithmMaker.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import algorithmMaker.services.InputGrammarAccess;

public class InputParser extends AbstractContentAssistParser {
	
	@Inject
	private InputGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected algorithmMaker.ui.contentassist.antlr.internal.InternalInputParser createParser() {
		algorithmMaker.ui.contentassist.antlr.internal.InternalInputParser result = new algorithmMaker.ui.contentassist.antlr.internal.InternalInputParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getInputAccess().getAlternatives_3(), "rule__Input__Alternatives_3");
					put(grammarAccess.getInputAccess().getTaskAlternatives_3_0_0_0(), "rule__Input__TaskAlternatives_3_0_0_0");
					put(grammarAccess.getDeclarationAccess().getAlternatives_1(), "rule__Declaration__Alternatives_1");
					put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
					put(grammarAccess.getQuantifierAccess().getQuantifierAlternatives_0_0(), "rule__Quantifier__QuantifierAlternatives_0_0");
					put(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_0(), "rule__BooleanLiteral__ValueAlternatives_0");
					put(grammarAccess.getAdditionAccess().getSymbolAlternatives_1_1_0(), "rule__Addition__SymbolAlternatives_1_1_0");
					put(grammarAccess.getMultiplicationAccess().getSymbolAlternatives_1_1_0(), "rule__Multiplication__SymbolAlternatives_1_1_0");
					put(grammarAccess.getNumericalPrimaryAccess().getAlternatives(), "rule__NumericalPrimary__Alternatives");
					put(grammarAccess.getInputAccess().getGroup(), "rule__Input__Group__0");
					put(grammarAccess.getInputAccess().getGroup_3_0(), "rule__Input__Group_3_0__0");
					put(grammarAccess.getInputAccess().getGroup_3_1(), "rule__Input__Group_3_1__0");
					put(grammarAccess.getInputAccess().getGroup_4(), "rule__Input__Group_4__0");
					put(grammarAccess.getInputAccess().getGroup_4_3(), "rule__Input__Group_4_3__0");
					put(grammarAccess.getProblemAccess().getGroup(), "rule__Problem__Group__0");
					put(grammarAccess.getProblemAccess().getGroup_1(), "rule__Problem__Group_1__0");
					put(grammarAccess.getProblemAccess().getGroup_2(), "rule__Problem__Group_2__0");
					put(grammarAccess.getDeclarationAccess().getGroup(), "rule__Declaration__Group__0");
					put(grammarAccess.getDeclarationAccess().getGroup_1_1(), "rule__Declaration__Group_1_1__0");
					put(grammarAccess.getTypeAccess().getGroup(), "rule__Type__Group__0");
					put(grammarAccess.getTypeAccess().getGroup_1(), "rule__Type__Group_1__0");
					put(grammarAccess.getORingAccess().getGroup(), "rule__ORing__Group__0");
					put(grammarAccess.getORingAccess().getGroup_1(), "rule__ORing__Group_1__0");
					put(grammarAccess.getANDingAccess().getGroup(), "rule__ANDing__Group__0");
					put(grammarAccess.getANDingAccess().getGroup_1(), "rule__ANDing__Group_1__0");
					put(grammarAccess.getPrimaryAccess().getGroup_3(), "rule__Primary__Group_3__0");
					put(grammarAccess.getProblemShellAccess().getGroup(), "rule__ProblemShell__Group__0");
					put(grammarAccess.getNegationAccess().getGroup(), "rule__Negation__Group__0");
					put(grammarAccess.getQuantifierAccess().getGroup(), "rule__Quantifier__Group__0");
					put(grammarAccess.getAtomicAccess().getGroup(), "rule__Atomic__Group__0");
					put(grammarAccess.getAtomicAccess().getGroup_2(), "rule__Atomic__Group_2__0");
					put(grammarAccess.getAtomicAccess().getGroup_2_1(), "rule__Atomic__Group_2_1__0");
					put(grammarAccess.getTheoremAccess().getGroup(), "rule__Theorem__Group__0");
					put(grammarAccess.getTheoremAccess().getGroup_7(), "rule__Theorem__Group_7__0");
					put(grammarAccess.getAdditionAccess().getGroup(), "rule__Addition__Group__0");
					put(grammarAccess.getAdditionAccess().getGroup_1(), "rule__Addition__Group_1__0");
					put(grammarAccess.getMultiplicationAccess().getGroup(), "rule__Multiplication__Group__0");
					put(grammarAccess.getMultiplicationAccess().getGroup_1(), "rule__Multiplication__Group_1__0");
					put(grammarAccess.getNumericalPrimaryAccess().getGroup_2(), "rule__NumericalPrimary__Group_2__0");
					put(grammarAccess.getInputAccess().getGivenAssignment_1(), "rule__Input__GivenAssignment_1");
					put(grammarAccess.getInputAccess().getTaskAssignment_3_0_0(), "rule__Input__TaskAssignment_3_0_0");
					put(grammarAccess.getInputAccess().getGoalAssignment_3_0_1(), "rule__Input__GoalAssignment_3_0_1");
					put(grammarAccess.getInputAccess().getTaskAssignment_3_1_0(), "rule__Input__TaskAssignment_3_1_0");
					put(grammarAccess.getInputAccess().getGoalAssignment_3_1_2(), "rule__Input__GoalAssignment_3_1_2");
					put(grammarAccess.getInputAccess().getTheoremsAssignment_4_2(), "rule__Input__TheoremsAssignment_4_2");
					put(grammarAccess.getInputAccess().getTheoremsAssignment_4_3_1(), "rule__Input__TheoremsAssignment_4_3_1");
					put(grammarAccess.getProblemNoVarsAccess().getPropertyAssignment(), "rule__ProblemNoVars__PropertyAssignment");
					put(grammarAccess.getProblemAccess().getVarsAssignment_0(), "rule__Problem__VarsAssignment_0");
					put(grammarAccess.getProblemAccess().getVarsAssignment_1_1(), "rule__Problem__VarsAssignment_1_1");
					put(grammarAccess.getProblemAccess().getPropertyAssignment_2_1(), "rule__Problem__PropertyAssignment_2_1");
					put(grammarAccess.getDeclarationAccess().getTypeAssignment_0(), "rule__Declaration__TypeAssignment_0");
					put(grammarAccess.getDeclarationAccess().getVarNameAssignment_1_0(), "rule__Declaration__VarNameAssignment_1_0");
					put(grammarAccess.getDeclarationAccess().getVarNameAssignment_1_1_1(), "rule__Declaration__VarNameAssignment_1_1_1");
					put(grammarAccess.getTypeAccess().getNameAssignment_0(), "rule__Type__NameAssignment_0");
					put(grammarAccess.getTypeAccess().getTemplateTypeAssignment_1_1(), "rule__Type__TemplateTypeAssignment_1_1");
					put(grammarAccess.getORingAccess().getRightAssignment_1_2(), "rule__ORing__RightAssignment_1_2");
					put(grammarAccess.getANDingAccess().getRightAssignment_1_2(), "rule__ANDing__RightAssignment_1_2");
					put(grammarAccess.getProblemShellAccess().getProblemAssignment_1(), "rule__ProblemShell__ProblemAssignment_1");
					put(grammarAccess.getNegationAccess().getNegatedAssignment_1(), "rule__Negation__NegatedAssignment_1");
					put(grammarAccess.getQuantifierAccess().getQuantifierAssignment_0(), "rule__Quantifier__QuantifierAssignment_0");
					put(grammarAccess.getQuantifierAccess().getSubjectAssignment_2(), "rule__Quantifier__SubjectAssignment_2");
					put(grammarAccess.getQuantifierAccess().getPredicateAssignment_4(), "rule__Quantifier__PredicateAssignment_4");
					put(grammarAccess.getAtomicAccess().getFunctionAssignment_0(), "rule__Atomic__FunctionAssignment_0");
					put(grammarAccess.getAtomicAccess().getArgsAssignment_2_0(), "rule__Atomic__ArgsAssignment_2_0");
					put(grammarAccess.getAtomicAccess().getArgsAssignment_2_1_1(), "rule__Atomic__ArgsAssignment_2_1_1");
					put(grammarAccess.getVariableAccess().getArgAssignment(), "rule__Variable__ArgAssignment");
					put(grammarAccess.getBooleanLiteralAccess().getValueAssignment(), "rule__BooleanLiteral__ValueAssignment");
					put(grammarAccess.getTheoremAccess().getRequirementAssignment_0(), "rule__Theorem__RequirementAssignment_0");
					put(grammarAccess.getTheoremAccess().getResultAssignment_2(), "rule__Theorem__ResultAssignment_2");
					put(grammarAccess.getTheoremAccess().getCostAssignment_4(), "rule__Theorem__CostAssignment_4");
					put(grammarAccess.getTheoremAccess().getDescriptionAssignment_6(), "rule__Theorem__DescriptionAssignment_6");
					put(grammarAccess.getTheoremAccess().getPseudoCodeAssignment_7_1(), "rule__Theorem__PseudoCodeAssignment_7_1");
					put(grammarAccess.getAdditionAccess().getSymbolAssignment_1_1(), "rule__Addition__SymbolAssignment_1_1");
					put(grammarAccess.getAdditionAccess().getRightAssignment_1_2(), "rule__Addition__RightAssignment_1_2");
					put(grammarAccess.getMultiplicationAccess().getSymbolAssignment_1_1(), "rule__Multiplication__SymbolAssignment_1_1");
					put(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2(), "rule__Multiplication__RightAssignment_1_2");
					put(grammarAccess.getNumberLiteralAccess().getValueAssignment(), "rule__NumberLiteral__ValueAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			algorithmMaker.ui.contentassist.antlr.internal.InternalInputParser typedParser = (algorithmMaker.ui.contentassist.antlr.internal.InternalInputParser) parser;
			typedParser.entryRuleInput();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public InputGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(InputGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
