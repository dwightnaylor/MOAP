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
	        newCompositeNode(grammarAccess.getInputAccess().getGivenProblemPropertyOptionalParserRuleCall_1_0()); 
	    }
		lv_given_1_0=ruleProblemPropertyOptional		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getInputRule());
	        }
       		set(
       			$current, 
       			"given",
        		lv_given_1_0, 
        		"ProblemPropertyOptional");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=';' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getInputAccess().getSemicolonKeyword_2());
    }
((
(
(
		lv_task_3_1=	'Find' 
    {
        newLeafNode(lv_task_3_1, grammarAccess.getInputAccess().getTaskFindKeyword_3_0_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getInputRule());
	        }
       		setWithLastConsumed($current, "task", lv_task_3_1, null);
	    }

    |		lv_task_3_2=	'Count' 
    {
        newLeafNode(lv_task_3_2, grammarAccess.getInputAccess().getTaskCountKeyword_3_0_0_1());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getInputRule());
	        }
       		setWithLastConsumed($current, "task", lv_task_3_2, null);
	    }

)

)
)(
(
(
		{ 
	        newCompositeNode(grammarAccess.getInputAccess().getGoalProblemParserRuleCall_3_1_0_0()); 
	    }
		lv_goal_4_1=ruleProblem		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getInputRule());
	        }
       		set(
       			$current, 
       			"goal",
        		lv_goal_4_1, 
        		"Problem");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getInputAccess().getGoalProblemNoVarsParserRuleCall_3_1_0_1()); 
	    }
		lv_goal_4_2=ruleProblemNoVars		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getInputRule());
	        }
       		set(
       			$current, 
       			"goal",
        		lv_goal_4_2, 
        		"ProblemNoVars");
	        afterParserOrEnumRuleCall();
	    }

)

)
))?(	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getInputAccess().getSemicolonKeyword_4_0());
    }
	otherlv_6='Theorems:' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getInputAccess().getTheoremsKeyword_4_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getInputAccess().getTheoremsTheoremParserRuleCall_4_2_0()); 
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
    	newLeafNode(otherlv_8, grammarAccess.getInputAccess().getSemicolonKeyword_4_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getInputAccess().getTheoremsTheoremParserRuleCall_4_3_1_0()); 
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
    	newLeafNode(otherlv_10, grammarAccess.getInputAccess().getSemicolonKeyword_4_4());
    }
)?)?)
;





// Entry rule entryRuleProblemNoVars
entryRuleProblemNoVars returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getProblemNoVarsRule()); }
	 iv_ruleProblemNoVars=ruleProblemNoVars 
	 { $current=$iv_ruleProblemNoVars.current; } 
	 EOF 
;

// Rule ProblemNoVars
ruleProblemNoVars returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getProblemNoVarsAccess().getPropertyImplicationParserRuleCall_0()); 
	    }
		lv_property_0_0=ruleImplication		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProblemNoVarsRule());
	        }
       		set(
       			$current, 
       			"property",
        		lv_property_0_0, 
        		"Implication");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleProblemPropertyOptional
entryRuleProblemPropertyOptional returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getProblemPropertyOptionalRule()); }
	 iv_ruleProblemPropertyOptional=ruleProblemPropertyOptional 
	 { $current=$iv_ruleProblemPropertyOptional.current; } 
	 EOF 
;

// Rule ProblemPropertyOptional
ruleProblemPropertyOptional returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getProblemPropertyOptionalAccess().getVarsDeclarationParserRuleCall_0_0()); 
	    }
		lv_vars_0_0=ruleDeclaration		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProblemPropertyOptionalRule());
	        }
       		add(
       			$current, 
       			"vars",
        		lv_vars_0_0, 
        		"Declaration");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_1=',' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getProblemPropertyOptionalAccess().getCommaKeyword_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getProblemPropertyOptionalAccess().getVarsDeclarationParserRuleCall_1_1_0()); 
	    }
		lv_vars_2_0=ruleDeclaration		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProblemPropertyOptionalRule());
	        }
       		add(
       			$current, 
       			"vars",
        		lv_vars_2_0, 
        		"Declaration");
	        afterParserOrEnumRuleCall();
	    }

)
))*(	otherlv_3='st' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getProblemPropertyOptionalAccess().getStKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getProblemPropertyOptionalAccess().getPropertyImplicationParserRuleCall_2_1_0()); 
	    }
		lv_property_4_0=ruleImplication		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProblemPropertyOptionalRule());
	        }
       		set(
       			$current, 
       			"property",
        		lv_property_4_0, 
        		"Implication");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
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
((
(
		{ 
	        newCompositeNode(grammarAccess.getProblemAccess().getVarsDeclarationParserRuleCall_0_0()); 
	    }
		lv_vars_0_0=ruleDeclaration		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProblemRule());
	        }
       		add(
       			$current, 
       			"vars",
        		lv_vars_0_0, 
        		"Declaration");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_1=',' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getProblemAccess().getCommaKeyword_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getProblemAccess().getVarsDeclarationParserRuleCall_1_1_0()); 
	    }
		lv_vars_2_0=ruleDeclaration		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProblemRule());
	        }
       		add(
       			$current, 
       			"vars",
        		lv_vars_2_0, 
        		"Declaration");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_3='st' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getProblemAccess().getStKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getProblemAccess().getPropertyImplicationParserRuleCall_3_0()); 
	    }
		lv_property_4_0=ruleImplication		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProblemRule());
	        }
       		set(
       			$current, 
       			"property",
        		lv_property_4_0, 
        		"Implication");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleProblemColon
entryRuleProblemColon returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getProblemColonRule()); }
	 iv_ruleProblemColon=ruleProblemColon 
	 { $current=$iv_ruleProblemColon.current; } 
	 EOF 
;

// Rule ProblemColon
ruleProblemColon returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getProblemColonAccess().getVarsDeclarationParserRuleCall_0_0()); 
	    }
		lv_vars_0_0=ruleDeclaration		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProblemColonRule());
	        }
       		add(
       			$current, 
       			"vars",
        		lv_vars_0_0, 
        		"Declaration");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_1=',' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getProblemColonAccess().getCommaKeyword_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getProblemColonAccess().getVarsDeclarationParserRuleCall_1_1_0()); 
	    }
		lv_vars_2_0=ruleDeclaration		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProblemColonRule());
	        }
       		add(
       			$current, 
       			"vars",
        		lv_vars_2_0, 
        		"Declaration");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_3=':' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getProblemColonAccess().getColonKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getProblemColonAccess().getPropertyImplicationParserRuleCall_3_0()); 
	    }
		lv_property_4_0=ruleImplication		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProblemColonRule());
	        }
       		set(
       			$current, 
       			"property",
        		lv_property_4_0, 
        		"Implication");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleDeclaration
entryRuleDeclaration returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDeclarationRule()); }
	 iv_ruleDeclaration=ruleDeclaration 
	 { $current=$iv_ruleDeclaration.current; } 
	 EOF 
;

// Rule Declaration
ruleDeclaration returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 
	    }
		lv_type_0_0=ruleType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDeclarationRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_0_0, 
        		"Type");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		lv_varName_1_0=RULE_ID
		{
			newLeafNode(lv_varName_1_0, grammarAccess.getDeclarationAccess().getVarNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDeclarationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"varName",
        		lv_varName_1_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleType
entryRuleType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	 iv_ruleType=ruleType 
	 { $current=$iv_ruleType.current; } 
	 EOF 
;

// Rule Type
ruleType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)(	otherlv_1='<' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getLessThanSignKeyword_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTypeAccess().getTemplateTypeTypeParserRuleCall_1_1_0()); 
	    }
		lv_templateType_2_0=ruleType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTypeRule());
	        }
       		set(
       			$current, 
       			"templateType",
        		lv_templateType_2_0, 
        		"Type");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='>' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getGreaterThanSignKeyword_1_2());
    }
)?)
;





// Entry rule entryRuleImplication
entryRuleImplication returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getImplicationRule()); }
	 iv_ruleImplication=ruleImplication 
	 { $current=$iv_ruleImplication.current; } 
	 EOF 
;

// Rule Implication
ruleImplication returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getImplicationAccess().getORingParserRuleCall_0()); 
    }
    this_ORing_0=ruleORing
    { 
        $current = $this_ORing_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0(),
            $current);
    }
)(
(
(
		lv_implication_2_1=	'->' 
    {
        newLeafNode(lv_implication_2_1, grammarAccess.getImplicationAccess().getImplicationHyphenMinusGreaterThanSignKeyword_1_1_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getImplicationRule());
	        }
       		setWithLastConsumed($current, "implication", lv_implication_2_1, null);
	    }

    |		lv_implication_2_2=	'<-' 
    {
        newLeafNode(lv_implication_2_2, grammarAccess.getImplicationAccess().getImplicationLessThanSignHyphenMinusKeyword_1_1_0_1());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getImplicationRule());
	        }
       		setWithLastConsumed($current, "implication", lv_implication_2_2, null);
	    }

    |		lv_implication_2_3=	'<->' 
    {
        newLeafNode(lv_implication_2_3, grammarAccess.getImplicationAccess().getImplicationLessThanSignHyphenMinusGreaterThanSignKeyword_1_1_0_2());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getImplicationRule());
	        }
       		setWithLastConsumed($current, "implication", lv_implication_2_3, null);
	    }

)

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getImplicationAccess().getRightORingParserRuleCall_1_2_0()); 
	    }
		lv_right_3_0=ruleORing		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getImplicationRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"ORing");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
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

    |
    { 
        newCompositeNode(grammarAccess.getPrimaryAccess().getGroupingParserRuleCall_2()); 
    }
    this_Grouping_2=ruleGrouping
    { 
        $current = $this_Grouping_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getPrimaryAccess().getBooleanLiteralParserRuleCall_3()); 
    }
    this_BooleanLiteral_3=ruleBooleanLiteral
    { 
        $current = $this_BooleanLiteral_3.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getPrimaryAccess().getNegationParserRuleCall_4()); 
    }
    this_Negation_4=ruleNegation
    { 
        $current = $this_Negation_4.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleGrouping
entryRuleGrouping returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getGroupingRule()); }
	 iv_ruleGrouping=ruleGrouping 
	 { $current=$iv_ruleGrouping.current; } 
	 EOF 
;

// Rule Grouping
ruleGrouping returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='(' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getGroupingAccess().getLeftParenthesisKeyword_0());
    }

    { 
        newCompositeNode(grammarAccess.getGroupingAccess().getImplicationParserRuleCall_1()); 
    }
    this_Implication_1=ruleImplication
    { 
        $current = $this_Implication_1.current; 
        afterParserOrEnumRuleCall();
    }
	otherlv_2=')' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getGroupingAccess().getRightParenthesisKeyword_2());
    }
)
;





// Entry rule entryRuleNegation
entryRuleNegation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNegationRule()); }
	 iv_ruleNegation=ruleNegation 
	 { $current=$iv_ruleNegation.current; } 
	 EOF 
;

// Rule Negation
ruleNegation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='!' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getNegationAccess().getExclamationMarkKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getNegationAccess().getNegatedPrimaryParserRuleCall_1_0()); 
	    }
		lv_negated_1_0=rulePrimary		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNegationRule());
	        }
       		set(
       			$current, 
       			"negated",
        		lv_negated_1_0, 
        		"Primary");
	        afterParserOrEnumRuleCall();
	    }

)
))
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
	        newCompositeNode(grammarAccess.getQuantifierAccess().getSubjectProblemColonParserRuleCall_2_0()); 
	    }
		lv_subject_2_0=ruleProblemColon		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getQuantifierRule());
	        }
       		set(
       			$current, 
       			"subject",
        		lv_subject_2_0, 
        		"ProblemColon");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getQuantifierAccess().getRightParenthesisKeyword_3());
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
)	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_1());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getAtomicAccess().getArgsAdditionParserRuleCall_2_0_0()); 
	    }
		lv_args_2_0=ruleAddition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAtomicRule());
	        }
       		add(
       			$current, 
       			"args",
        		lv_args_2_0, 
        		"Addition");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getAtomicAccess().getCommaKeyword_2_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAtomicAccess().getArgsAdditionParserRuleCall_2_1_1_0()); 
	    }
		lv_args_4_0=ruleAddition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAtomicRule());
	        }
       		add(
       			$current, 
       			"args",
        		lv_args_4_0, 
        		"Addition");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_5=')' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getAtomicAccess().getRightParenthesisKeyword_3());
    }
)
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
	        newCompositeNode(grammarAccess.getTheoremAccess().getContentImplicationParserRuleCall_0_0()); 
	    }
		lv_content_0_0=ruleImplication		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTheoremRule());
	        }
       		set(
       			$current, 
       			"content",
        		lv_content_0_0, 
        		"Implication");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1=':::' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getTheoremAccess().getColonColonColonKeyword_1());
    }
(
(
		lv_Description_2_0=RULE_STRING
		{
			newLeafNode(lv_Description_2_0, grammarAccess.getTheoremAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTheoremRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"Description",
        		lv_Description_2_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRuleAddition
entryRuleAddition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAdditionRule()); }
	 iv_ruleAddition=ruleAddition 
	 { $current=$iv_ruleAddition.current; } 
	 EOF 
;

// Rule Addition
ruleAddition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
    }
    this_Multiplication_0=ruleMultiplication
    { 
        $current = $this_Multiplication_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            $current);
    }
)(
(
(
		lv_symbol_2_1=	'+' 
    {
        newLeafNode(lv_symbol_2_1, grammarAccess.getAdditionAccess().getSymbolPlusSignKeyword_1_1_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAdditionRule());
	        }
       		setWithLastConsumed($current, "symbol", lv_symbol_2_1, null);
	    }

    |		lv_symbol_2_2=	'-' 
    {
        newLeafNode(lv_symbol_2_2, grammarAccess.getAdditionAccess().getSymbolHyphenMinusKeyword_1_1_0_1());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAdditionRule());
	        }
       		setWithLastConsumed($current, "symbol", lv_symbol_2_2, null);
	    }

)

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 
	    }
		lv_right_3_0=ruleMultiplication		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAdditionRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"Multiplication");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleMultiplication
entryRuleMultiplication returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMultiplicationRule()); }
	 iv_ruleMultiplication=ruleMultiplication 
	 { $current=$iv_ruleMultiplication.current; } 
	 EOF 
;

// Rule Multiplication
ruleMultiplication returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getMultiplicationAccess().getNumericalPrimaryParserRuleCall_0()); 
    }
    this_NumericalPrimary_0=ruleNumericalPrimary
    { 
        $current = $this_NumericalPrimary_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            $current);
    }
)(
(
(
		lv_symbol_2_1=	'*' 
    {
        newLeafNode(lv_symbol_2_1, grammarAccess.getMultiplicationAccess().getSymbolAsteriskKeyword_1_1_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMultiplicationRule());
	        }
       		setWithLastConsumed($current, "symbol", lv_symbol_2_1, null);
	    }

    |		lv_symbol_2_2=	'/' 
    {
        newLeafNode(lv_symbol_2_2, grammarAccess.getMultiplicationAccess().getSymbolSolidusKeyword_1_1_0_1());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMultiplicationRule());
	        }
       		setWithLastConsumed($current, "symbol", lv_symbol_2_2, null);
	    }

)

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightNumericalPrimaryParserRuleCall_1_2_0()); 
	    }
		lv_right_3_0=ruleNumericalPrimary		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMultiplicationRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"NumericalPrimary");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleNumericalPrimary
entryRuleNumericalPrimary returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNumericalPrimaryRule()); }
	 iv_ruleNumericalPrimary=ruleNumericalPrimary 
	 { $current=$iv_ruleNumericalPrimary.current; } 
	 EOF 
;

// Rule NumericalPrimary
ruleNumericalPrimary returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getNumericalPrimaryAccess().getNumberLiteralParserRuleCall_0()); 
    }
    this_NumberLiteral_0=ruleNumberLiteral
    { 
        $current = $this_NumberLiteral_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getNumericalPrimaryAccess().getAtomicParserRuleCall_1()); 
    }
    this_Atomic_1=ruleAtomic
    { 
        $current = $this_Atomic_1.current; 
        afterParserOrEnumRuleCall();
    }

    |(	otherlv_2='(' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getNumericalPrimaryAccess().getLeftParenthesisKeyword_2_0());
    }

    { 
        newCompositeNode(grammarAccess.getNumericalPrimaryAccess().getNumericalPrimaryParserRuleCall_2_1()); 
    }
    this_NumericalPrimary_3=ruleNumericalPrimary
    { 
        $current = $this_NumericalPrimary_3.current; 
        afterParserOrEnumRuleCall();
    }
	otherlv_4=')' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getNumericalPrimaryAccess().getRightParenthesisKeyword_2_2());
    }
)
    |
    { 
        newCompositeNode(grammarAccess.getNumericalPrimaryAccess().getVariableParserRuleCall_3()); 
    }
    this_Variable_5=ruleVariable
    { 
        $current = $this_Variable_5.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleVariable
entryRuleVariable returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVariableRule()); }
	 iv_ruleVariable=ruleVariable 
	 { $current=$iv_ruleVariable.current; } 
	 EOF 
;

// Rule Variable
ruleVariable returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_arg_0_0=RULE_ID
		{
			newLeafNode(lv_arg_0_0, grammarAccess.getVariableAccess().getArgIDTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getVariableRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"arg",
        		lv_arg_0_0, 
        		"ID");
	    }

)
)
;





// Entry rule entryRuleNumberLiteral
entryRuleNumberLiteral returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNumberLiteralRule()); }
	 iv_ruleNumberLiteral=ruleNumberLiteral 
	 { $current=$iv_ruleNumberLiteral.current; } 
	 EOF 
;

// Rule NumberLiteral
ruleNumberLiteral returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueDOUBLEParserRuleCall_0()); 
	    }
		lv_value_0_0=ruleDOUBLE		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNumberLiteralRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"DOUBLE");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleDOUBLE
entryRuleDOUBLE returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getDOUBLERule()); } 
	 iv_ruleDOUBLE=ruleDOUBLE 
	 { $current=$iv_ruleDOUBLE.current.getText(); }  
	 EOF 
;

// Rule DOUBLE
ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	kw='-' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDOUBLEAccess().getHyphenMinusKeyword_0()); 
    }
)?    this_INT_1=RULE_INT    {
		$current.merge(this_INT_1);
    }

    { 
    newLeafNode(this_INT_1, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_2_0()); 
    }
    this_INT_3=RULE_INT    {
		$current.merge(this_INT_3);
    }

    { 
    newLeafNode(this_INT_3, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2_1()); 
    }
))
    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


