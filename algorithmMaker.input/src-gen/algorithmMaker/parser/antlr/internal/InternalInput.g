/*
 * generated by Xtext
 */
grammar InternalInput;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package algorithmMaker.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package algorithmMaker.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import algorithmMaker.services.InputGrammarAccess;

}

@parser::members {

 	private InputGrammarAccess grammarAccess;
 	
    public InternalInputParser(TokenStream input, InputGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Input";	
   	}
   	
   	@Override
   	protected InputGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleInput
entryRuleInput returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getInputRule()); }
	 iv_ruleInput=ruleInput 
	 { $current=$iv_ruleInput.current; } 
	 EOF 
;

// Rule Input
ruleInput returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Given' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getInputAccess().getGivenKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getInputAccess().getGivenProblemParserRuleCall_1_0()); 
	    }
		lv_given_1_0=ruleProblem		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getInputRule());
	        }
       		set(
       			$current, 
       			"given",
        		lv_given_1_0, 
        		"Problem");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getInputAccess().getCommaKeyword_2());
    }
	otherlv_3='Find' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getInputAccess().getFindKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getInputAccess().getGoalProblemParserRuleCall_4_0()); 
	    }
		lv_goal_4_0=ruleProblem		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getInputRule());
	        }
       		set(
       			$current, 
       			"goal",
        		lv_goal_4_0, 
        		"Problem");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getInputAccess().getSemicolonKeyword_5_0());
    }
	otherlv_6='Theorems:' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getInputAccess().getTheoremsKeyword_5_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getInputAccess().getTheoremsTheoremParserRuleCall_5_2_0()); 
	    }
		lv_theorems_7_0=ruleTheorem		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getInputRule());
	        }
       		add(
       			$current, 
       			"theorems",
        		lv_theorems_7_0, 
        		"Theorem");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_8=';' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getInputAccess().getSemicolonKeyword_5_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getInputAccess().getTheoremsTheoremParserRuleCall_5_3_1_0()); 
	    }
		lv_theorems_9_0=ruleTheorem		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getInputRule());
	        }
       		add(
       			$current, 
       			"theorems",
        		lv_theorems_9_0, 
        		"Theorem");
	        afterParserOrEnumRuleCall();
	    }

)
))*(	otherlv_10=';' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getInputAccess().getSemicolonKeyword_5_4());
    }
)?)?)
;





// Entry rule entryRuleProblem
entryRuleProblem returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getProblemRule()); }
	 iv_ruleProblem=ruleProblem 
	 { $current=$iv_ruleProblem.current; } 
	 EOF 
;

// Rule Problem
ruleProblem returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
(
		lv_vars_0_0=RULE_ID
		{
			newLeafNode(lv_vars_0_0, grammarAccess.getProblemAccess().getVarsIDTerminalRuleCall_0_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getProblemRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"vars",
        		lv_vars_0_0, 
        		"ID");
	    }

)
)(	otherlv_1=',' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getProblemAccess().getCommaKeyword_0_1_0());
    }
(
(
		lv_vars_2_0=RULE_ID
		{
			newLeafNode(lv_vars_2_0, grammarAccess.getProblemAccess().getVarsIDTerminalRuleCall_0_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getProblemRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"vars",
        		lv_vars_2_0, 
        		"ID");
	    }

)
))*)	otherlv_3='st' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getProblemAccess().getStKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getProblemAccess().getPropertyORingParserRuleCall_2_0()); 
	    }
		lv_property_4_0=ruleORing		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProblemRule());
	        }
       		set(
       			$current, 
       			"property",
        		lv_property_4_0, 
        		"ORing");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleORing
entryRuleORing returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getORingRule()); }
	 iv_ruleORing=ruleORing 
	 { $current=$iv_ruleORing.current; } 
	 EOF 
;

// Rule ORing
ruleORing returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getORingAccess().getANDingParserRuleCall_0()); 
    }
    this_ANDing_0=ruleANDing
    { 
        $current = $this_ANDing_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getORingAccess().getORingLeftAction_1_0(),
            $current);
    }
)	otherlv_2='|' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getORingAccess().getVerticalLineKeyword_1_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getORingAccess().getRightANDingParserRuleCall_1_2_0()); 
	    }
		lv_right_3_0=ruleANDing		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getORingRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"ANDing");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleANDing
entryRuleANDing returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getANDingRule()); }
	 iv_ruleANDing=ruleANDing 
	 { $current=$iv_ruleANDing.current; } 
	 EOF 
;

// Rule ANDing
ruleANDing returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getANDingAccess().getPrimaryParserRuleCall_0()); 
    }
    this_Primary_0=rulePrimary
    { 
        $current = $this_Primary_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getANDingAccess().getANDingLeftAction_1_0(),
            $current);
    }
)	otherlv_2='&' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getANDingAccess().getAmpersandKeyword_1_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getANDingAccess().getRightPrimaryParserRuleCall_1_2_0()); 
	    }
		lv_right_3_0=rulePrimary		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getANDingRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"Primary");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRulePrimary
entryRulePrimary returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPrimaryRule()); }
	 iv_rulePrimary=rulePrimary 
	 { $current=$iv_rulePrimary.current; } 
	 EOF 
;

// Rule Primary
rulePrimary returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_0()); 
    }
    this_Atomic_0=ruleAtomic
    { 
        $current = $this_Atomic_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getPrimaryAccess().getQuantifierParserRuleCall_1()); 
    }
    this_Quantifier_1=ruleQuantifier
    { 
        $current = $this_Quantifier_1.current; 
        afterParserOrEnumRuleCall();
    }

    |(	otherlv_2='(' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0());
    }

    { 
        newCompositeNode(grammarAccess.getPrimaryAccess().getORingParserRuleCall_2_1()); 
    }
    this_ORing_3=ruleORing
    { 
        $current = $this_ORing_3.current; 
        afterParserOrEnumRuleCall();
    }
	otherlv_4=')' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2());
    }
)
    |
    { 
        newCompositeNode(grammarAccess.getPrimaryAccess().getBooleanLiteralParserRuleCall_3()); 
    }
    this_BooleanLiteral_5=ruleBooleanLiteral
    { 
        $current = $this_BooleanLiteral_5.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleQuantifier
entryRuleQuantifier returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getQuantifierRule()); }
	 iv_ruleQuantifier=ruleQuantifier 
	 { $current=$iv_ruleQuantifier.current; } 
	 EOF 
;

// Rule Quantifier
ruleQuantifier returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
(
		lv_quantifier_0_1=	'forall' 
    {
        newLeafNode(lv_quantifier_0_1, grammarAccess.getQuantifierAccess().getQuantifierForallKeyword_0_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getQuantifierRule());
	        }
       		setWithLastConsumed($current, "quantifier", lv_quantifier_0_1, null);
	    }

    |		lv_quantifier_0_2=	'exists' 
    {
        newLeafNode(lv_quantifier_0_2, grammarAccess.getQuantifierAccess().getQuantifierExistsKeyword_0_0_1());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getQuantifierRule());
	        }
       		setWithLastConsumed($current, "quantifier", lv_quantifier_0_2, null);
	    }

)

)
)	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getQuantifierAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getQuantifierAccess().getSubjectProblemParserRuleCall_2_0()); 
	    }
		lv_subject_2_0=ruleProblem		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getQuantifierRule());
	        }
       		set(
       			$current, 
       			"subject",
        		lv_subject_2_0, 
        		"Problem");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=':' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getQuantifierAccess().getColonKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getQuantifierAccess().getPredicateORingParserRuleCall_4_0()); 
	    }
		lv_predicate_4_0=ruleORing		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getQuantifierRule());
	        }
       		set(
       			$current, 
       			"predicate",
        		lv_predicate_4_0, 
        		"ORing");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5=')' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getQuantifierAccess().getRightParenthesisKeyword_5());
    }
)
;





// Entry rule entryRuleAtomic
entryRuleAtomic returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAtomicRule()); }
	 iv_ruleAtomic=ruleAtomic 
	 { $current=$iv_ruleAtomic.current; } 
	 EOF 
;

// Rule Atomic
ruleAtomic returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_Function_0_0=RULE_ID
		{
			newLeafNode(lv_Function_0_0, grammarAccess.getAtomicAccess().getFunctionIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtomicRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"Function",
        		lv_Function_0_0, 
        		"ID");
	    }

)
)(	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_1_0());
    }
((
(
		lv_args_2_0=RULE_ID
		{
			newLeafNode(lv_args_2_0, grammarAccess.getAtomicAccess().getArgsIDTerminalRuleCall_1_1_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtomicRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"args",
        		lv_args_2_0, 
        		"ID");
	    }

)
)(	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getAtomicAccess().getCommaKeyword_1_1_1_0());
    }
(
(
		lv_args_4_0=RULE_ID
		{
			newLeafNode(lv_args_4_0, grammarAccess.getAtomicAccess().getArgsIDTerminalRuleCall_1_1_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtomicRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"args",
        		lv_args_4_0, 
        		"ID");
	    }

)
))*)?	otherlv_5=')' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getAtomicAccess().getRightParenthesisKeyword_1_2());
    }
)?)
;





// Entry rule entryRuleBooleanLiteral
entryRuleBooleanLiteral returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBooleanLiteralRule()); }
	 iv_ruleBooleanLiteral=ruleBooleanLiteral 
	 { $current=$iv_ruleBooleanLiteral.current; } 
	 EOF 
;

// Rule BooleanLiteral
ruleBooleanLiteral returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
(
		lv_value_0_1=	'TRUE' 
    {
        newLeafNode(lv_value_0_1, grammarAccess.getBooleanLiteralAccess().getValueTRUEKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getBooleanLiteralRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_0_1, null);
	    }

    |		lv_value_0_2=	'FALSE' 
    {
        newLeafNode(lv_value_0_2, grammarAccess.getBooleanLiteralAccess().getValueFALSEKeyword_0_1());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getBooleanLiteralRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_0_2, null);
	    }

)

)
)
;





// Entry rule entryRuleTheorem
entryRuleTheorem returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTheoremRule()); }
	 iv_ruleTheorem=ruleTheorem 
	 { $current=$iv_ruleTheorem.current; } 
	 EOF 
;

// Rule Theorem
ruleTheorem returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getTheoremAccess().getRequirementORingParserRuleCall_0_0()); 
	    }
		lv_Requirement_0_0=ruleORing		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTheoremRule());
	        }
       		set(
       			$current, 
       			"Requirement",
        		lv_Requirement_0_0, 
        		"ORing");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1=':-' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getTheoremAccess().getColonHyphenMinusKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTheoremAccess().getResultORingParserRuleCall_2_0()); 
	    }
		lv_Result_2_0=ruleORing		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTheoremRule());
	        }
       		set(
       			$current, 
       			"Result",
        		lv_Result_2_0, 
        		"ORing");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getTheoremAccess().getCommaKeyword_3());
    }
(
(
		lv_Cost_4_0=RULE_INT
		{
			newLeafNode(lv_Cost_4_0, grammarAccess.getTheoremAccess().getCostINTTerminalRuleCall_4_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTheoremRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"Cost",
        		lv_Cost_4_0, 
        		"INT");
	    }

)
)	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getTheoremAccess().getCommaKeyword_5());
    }
(
(
		lv_Description_6_0=RULE_STRING
		{
			newLeafNode(lv_Description_6_0, grammarAccess.getTheoremAccess().getDescriptionSTRINGTerminalRuleCall_6_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTheoremRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"Description",
        		lv_Description_6_0, 
        		"STRING");
	    }

)
)(	otherlv_7=',' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getTheoremAccess().getCommaKeyword_7_0());
    }
(
(
		lv_PseudoCode_8_0=RULE_STRING
		{
			newLeafNode(lv_PseudoCode_8_0, grammarAccess.getTheoremAccess().getPseudoCodeSTRINGTerminalRuleCall_7_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTheoremRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"PseudoCode",
        		lv_PseudoCode_8_0, 
        		"STRING");
	    }

)
))?)
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


