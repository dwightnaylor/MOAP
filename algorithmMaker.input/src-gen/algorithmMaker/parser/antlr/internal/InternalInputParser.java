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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalInputParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Given'", "';'", "'Find'", "'Count'", "'Test'", "'Theorems:'", "','", "'st'", "'<'", "'>'", "'|'", "'&'", "'('", "')'", "'{'", "'}'", "'!'", "'forall'", "'exists'", "':'", "'TRUE'", "'FALSE'", "'->'", "'<-'", "'<->'", "'+'", "'-'", "'*'", "'/'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalInputParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalInputParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalInputParser.tokenNames; }
    public String getGrammarFileName() { return "../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g"; }



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



    // $ANTLR start "entryRuleInput"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:67:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:68:2: (iv_ruleInput= ruleInput EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:69:2: iv_ruleInput= ruleInput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputRule()); 
            }
            pushFollow(FOLLOW_ruleInput_in_entryRuleInput75);
            iv_ruleInput=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInput; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInput85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:76:1: ruleInput returns [EObject current=null] : (otherlv_0= 'Given' ( (lv_given_1_0= ruleProblemPropertyOptional ) ) otherlv_2= ';' ( ( ( ( (lv_task_3_1= 'Find' | lv_task_3_2= 'Count' ) ) ) ( (lv_goal_4_0= ruleProblem ) ) ) | ( ( (lv_task_5_0= 'Test' ) ) ( ( (lv_goal_6_1= ruleProblem | lv_goal_6_2= ruleProblemNoVars ) ) ) ) )? (otherlv_7= ';' otherlv_8= 'Theorems:' ( (lv_theorems_9_0= ruleTheorem ) ) (otherlv_10= ';' ( (lv_theorems_11_0= ruleTheorem ) ) )* (otherlv_12= ';' )? )? ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_task_3_1=null;
        Token lv_task_3_2=null;
        Token lv_task_5_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_given_1_0 = null;

        EObject lv_goal_4_0 = null;

        EObject lv_goal_6_1 = null;

        EObject lv_goal_6_2 = null;

        EObject lv_theorems_9_0 = null;

        EObject lv_theorems_11_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:79:28: ( (otherlv_0= 'Given' ( (lv_given_1_0= ruleProblemPropertyOptional ) ) otherlv_2= ';' ( ( ( ( (lv_task_3_1= 'Find' | lv_task_3_2= 'Count' ) ) ) ( (lv_goal_4_0= ruleProblem ) ) ) | ( ( (lv_task_5_0= 'Test' ) ) ( ( (lv_goal_6_1= ruleProblem | lv_goal_6_2= ruleProblemNoVars ) ) ) ) )? (otherlv_7= ';' otherlv_8= 'Theorems:' ( (lv_theorems_9_0= ruleTheorem ) ) (otherlv_10= ';' ( (lv_theorems_11_0= ruleTheorem ) ) )* (otherlv_12= ';' )? )? ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:80:1: (otherlv_0= 'Given' ( (lv_given_1_0= ruleProblemPropertyOptional ) ) otherlv_2= ';' ( ( ( ( (lv_task_3_1= 'Find' | lv_task_3_2= 'Count' ) ) ) ( (lv_goal_4_0= ruleProblem ) ) ) | ( ( (lv_task_5_0= 'Test' ) ) ( ( (lv_goal_6_1= ruleProblem | lv_goal_6_2= ruleProblemNoVars ) ) ) ) )? (otherlv_7= ';' otherlv_8= 'Theorems:' ( (lv_theorems_9_0= ruleTheorem ) ) (otherlv_10= ';' ( (lv_theorems_11_0= ruleTheorem ) ) )* (otherlv_12= ';' )? )? )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:80:1: (otherlv_0= 'Given' ( (lv_given_1_0= ruleProblemPropertyOptional ) ) otherlv_2= ';' ( ( ( ( (lv_task_3_1= 'Find' | lv_task_3_2= 'Count' ) ) ) ( (lv_goal_4_0= ruleProblem ) ) ) | ( ( (lv_task_5_0= 'Test' ) ) ( ( (lv_goal_6_1= ruleProblem | lv_goal_6_2= ruleProblemNoVars ) ) ) ) )? (otherlv_7= ';' otherlv_8= 'Theorems:' ( (lv_theorems_9_0= ruleTheorem ) ) (otherlv_10= ';' ( (lv_theorems_11_0= ruleTheorem ) ) )* (otherlv_12= ';' )? )? )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:80:3: otherlv_0= 'Given' ( (lv_given_1_0= ruleProblemPropertyOptional ) ) otherlv_2= ';' ( ( ( ( (lv_task_3_1= 'Find' | lv_task_3_2= 'Count' ) ) ) ( (lv_goal_4_0= ruleProblem ) ) ) | ( ( (lv_task_5_0= 'Test' ) ) ( ( (lv_goal_6_1= ruleProblem | lv_goal_6_2= ruleProblemNoVars ) ) ) ) )? (otherlv_7= ';' otherlv_8= 'Theorems:' ( (lv_theorems_9_0= ruleTheorem ) ) (otherlv_10= ';' ( (lv_theorems_11_0= ruleTheorem ) ) )* (otherlv_12= ';' )? )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleInput122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInputAccess().getGivenKeyword_0());
                  
            }
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:84:1: ( (lv_given_1_0= ruleProblemPropertyOptional ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:85:1: (lv_given_1_0= ruleProblemPropertyOptional )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:85:1: (lv_given_1_0= ruleProblemPropertyOptional )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:86:3: lv_given_1_0= ruleProblemPropertyOptional
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInputAccess().getGivenProblemPropertyOptionalParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleProblemPropertyOptional_in_ruleInput143);
            lv_given_1_0=ruleProblemPropertyOptional();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInputRule());
              	        }
                     		set(
                     			current, 
                     			"given",
                      		lv_given_1_0, 
                      		"ProblemPropertyOptional");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleInput155); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInputAccess().getSemicolonKeyword_2());
                  
            }
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:106:1: ( ( ( ( (lv_task_3_1= 'Find' | lv_task_3_2= 'Count' ) ) ) ( (lv_goal_4_0= ruleProblem ) ) ) | ( ( (lv_task_5_0= 'Test' ) ) ( ( (lv_goal_6_1= ruleProblem | lv_goal_6_2= ruleProblemNoVars ) ) ) ) )?
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=13 && LA3_0<=14)) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            switch (alt3) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:106:2: ( ( ( (lv_task_3_1= 'Find' | lv_task_3_2= 'Count' ) ) ) ( (lv_goal_4_0= ruleProblem ) ) )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:106:2: ( ( ( (lv_task_3_1= 'Find' | lv_task_3_2= 'Count' ) ) ) ( (lv_goal_4_0= ruleProblem ) ) )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:106:3: ( ( (lv_task_3_1= 'Find' | lv_task_3_2= 'Count' ) ) ) ( (lv_goal_4_0= ruleProblem ) )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:106:3: ( ( (lv_task_3_1= 'Find' | lv_task_3_2= 'Count' ) ) )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:107:1: ( (lv_task_3_1= 'Find' | lv_task_3_2= 'Count' ) )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:107:1: ( (lv_task_3_1= 'Find' | lv_task_3_2= 'Count' ) )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:108:1: (lv_task_3_1= 'Find' | lv_task_3_2= 'Count' )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:108:1: (lv_task_3_1= 'Find' | lv_task_3_2= 'Count' )
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==13) ) {
                        alt1=1;
                    }
                    else if ( (LA1_0==14) ) {
                        alt1=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 0, input);

                        throw nvae;
                    }
                    switch (alt1) {
                        case 1 :
                            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:109:3: lv_task_3_1= 'Find'
                            {
                            lv_task_3_1=(Token)match(input,13,FOLLOW_13_in_ruleInput177); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_task_3_1, grammarAccess.getInputAccess().getTaskFindKeyword_3_0_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getInputRule());
                              	        }
                                     		setWithLastConsumed(current, "task", lv_task_3_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:121:8: lv_task_3_2= 'Count'
                            {
                            lv_task_3_2=(Token)match(input,14,FOLLOW_14_in_ruleInput206); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_task_3_2, grammarAccess.getInputAccess().getTaskCountKeyword_3_0_0_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getInputRule());
                              	        }
                                     		setWithLastConsumed(current, "task", lv_task_3_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:136:2: ( (lv_goal_4_0= ruleProblem ) )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:137:1: (lv_goal_4_0= ruleProblem )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:137:1: (lv_goal_4_0= ruleProblem )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:138:3: lv_goal_4_0= ruleProblem
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInputAccess().getGoalProblemParserRuleCall_3_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleProblem_in_ruleInput243);
                    lv_goal_4_0=ruleProblem();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInputRule());
                      	        }
                             		set(
                             			current, 
                             			"goal",
                              		lv_goal_4_0, 
                              		"Problem");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:155:6: ( ( (lv_task_5_0= 'Test' ) ) ( ( (lv_goal_6_1= ruleProblem | lv_goal_6_2= ruleProblemNoVars ) ) ) )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:155:6: ( ( (lv_task_5_0= 'Test' ) ) ( ( (lv_goal_6_1= ruleProblem | lv_goal_6_2= ruleProblemNoVars ) ) ) )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:155:7: ( (lv_task_5_0= 'Test' ) ) ( ( (lv_goal_6_1= ruleProblem | lv_goal_6_2= ruleProblemNoVars ) ) )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:155:7: ( (lv_task_5_0= 'Test' ) )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:156:1: (lv_task_5_0= 'Test' )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:156:1: (lv_task_5_0= 'Test' )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:157:3: lv_task_5_0= 'Test'
                    {
                    lv_task_5_0=(Token)match(input,15,FOLLOW_15_in_ruleInput269); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_task_5_0, grammarAccess.getInputAccess().getTaskTestKeyword_3_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInputRule());
                      	        }
                             		setWithLastConsumed(current, "task", lv_task_5_0, "Test");
                      	    
                    }

                    }


                    }

                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:170:2: ( ( (lv_goal_6_1= ruleProblem | lv_goal_6_2= ruleProblemNoVars ) ) )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:171:1: ( (lv_goal_6_1= ruleProblem | lv_goal_6_2= ruleProblemNoVars ) )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:171:1: ( (lv_goal_6_1= ruleProblem | lv_goal_6_2= ruleProblemNoVars ) )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:172:1: (lv_goal_6_1= ruleProblem | lv_goal_6_2= ruleProblemNoVars )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:172:1: (lv_goal_6_1= ruleProblem | lv_goal_6_2= ruleProblemNoVars )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==RULE_ID) ) {
                        int LA2_1 = input.LA(2);

                        if ( (LA2_1==23) ) {
                            alt2=2;
                        }
                        else if ( (LA2_1==RULE_ID||(LA2_1>=17 && LA2_1<=19)) ) {
                            alt2=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA2_0==23||LA2_0==25||(LA2_0>=27 && LA2_0<=29)||(LA2_0>=31 && LA2_0<=32)) ) {
                        alt2=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:173:3: lv_goal_6_1= ruleProblem
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInputAccess().getGoalProblemParserRuleCall_3_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleProblem_in_ruleInput305);
                            lv_goal_6_1=ruleProblem();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getInputRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"goal",
                                      		lv_goal_6_1, 
                                      		"Problem");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:188:8: lv_goal_6_2= ruleProblemNoVars
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInputAccess().getGoalProblemNoVarsParserRuleCall_3_1_1_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleProblemNoVars_in_ruleInput324);
                            lv_goal_6_2=ruleProblemNoVars();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getInputRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"goal",
                                      		lv_goal_6_2, 
                                      		"ProblemNoVars");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;

            }

            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:206:5: (otherlv_7= ';' otherlv_8= 'Theorems:' ( (lv_theorems_9_0= ruleTheorem ) ) (otherlv_10= ';' ( (lv_theorems_11_0= ruleTheorem ) ) )* (otherlv_12= ';' )? )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:206:7: otherlv_7= ';' otherlv_8= 'Theorems:' ( (lv_theorems_9_0= ruleTheorem ) ) (otherlv_10= ';' ( (lv_theorems_11_0= ruleTheorem ) ) )* (otherlv_12= ';' )?
                    {
                    otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruleInput343); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getInputAccess().getSemicolonKeyword_4_0());
                          
                    }
                    otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleInput355); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getInputAccess().getTheoremsKeyword_4_1());
                          
                    }
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:214:1: ( (lv_theorems_9_0= ruleTheorem ) )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:215:1: (lv_theorems_9_0= ruleTheorem )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:215:1: (lv_theorems_9_0= ruleTheorem )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:216:3: lv_theorems_9_0= ruleTheorem
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInputAccess().getTheoremsTheoremParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTheorem_in_ruleInput376);
                    lv_theorems_9_0=ruleTheorem();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInputRule());
                      	        }
                             		add(
                             			current, 
                             			"theorems",
                              		lv_theorems_9_0, 
                              		"Theorem");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:232:2: (otherlv_10= ';' ( (lv_theorems_11_0= ruleTheorem ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==12) ) {
                            int LA4_1 = input.LA(2);

                            if ( (LA4_1==RULE_ID||LA4_1==23||LA4_1==25||(LA4_1>=27 && LA4_1<=29)||(LA4_1>=31 && LA4_1<=32)) ) {
                                alt4=1;
                            }


                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:232:4: otherlv_10= ';' ( (lv_theorems_11_0= ruleTheorem ) )
                    	    {
                    	    otherlv_10=(Token)match(input,12,FOLLOW_12_in_ruleInput389); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getInputAccess().getSemicolonKeyword_4_3_0());
                    	          
                    	    }
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:236:1: ( (lv_theorems_11_0= ruleTheorem ) )
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:237:1: (lv_theorems_11_0= ruleTheorem )
                    	    {
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:237:1: (lv_theorems_11_0= ruleTheorem )
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:238:3: lv_theorems_11_0= ruleTheorem
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInputAccess().getTheoremsTheoremParserRuleCall_4_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTheorem_in_ruleInput410);
                    	    lv_theorems_11_0=ruleTheorem();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getInputRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"theorems",
                    	              		lv_theorems_11_0, 
                    	              		"Theorem");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:254:4: (otherlv_12= ';' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==12) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:254:6: otherlv_12= ';'
                            {
                            otherlv_12=(Token)match(input,12,FOLLOW_12_in_ruleInput425); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_12, grammarAccess.getInputAccess().getSemicolonKeyword_4_4());
                                  
                            }

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleProblemNoVars"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:266:1: entryRuleProblemNoVars returns [EObject current=null] : iv_ruleProblemNoVars= ruleProblemNoVars EOF ;
    public final EObject entryRuleProblemNoVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProblemNoVars = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:267:2: (iv_ruleProblemNoVars= ruleProblemNoVars EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:268:2: iv_ruleProblemNoVars= ruleProblemNoVars EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProblemNoVarsRule()); 
            }
            pushFollow(FOLLOW_ruleProblemNoVars_in_entryRuleProblemNoVars465);
            iv_ruleProblemNoVars=ruleProblemNoVars();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProblemNoVars; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProblemNoVars475); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProblemNoVars"


    // $ANTLR start "ruleProblemNoVars"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:275:1: ruleProblemNoVars returns [EObject current=null] : ( (lv_property_0_0= ruleORing ) ) ;
    public final EObject ruleProblemNoVars() throws RecognitionException {
        EObject current = null;

        EObject lv_property_0_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:278:28: ( ( (lv_property_0_0= ruleORing ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:279:1: ( (lv_property_0_0= ruleORing ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:279:1: ( (lv_property_0_0= ruleORing ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:280:1: (lv_property_0_0= ruleORing )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:280:1: (lv_property_0_0= ruleORing )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:281:3: lv_property_0_0= ruleORing
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getProblemNoVarsAccess().getPropertyORingParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleORing_in_ruleProblemNoVars520);
            lv_property_0_0=ruleORing();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getProblemNoVarsRule());
              	        }
                     		set(
                     			current, 
                     			"property",
                      		lv_property_0_0, 
                      		"ORing");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProblemNoVars"


    // $ANTLR start "entryRuleProblemPropertyOptional"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:305:1: entryRuleProblemPropertyOptional returns [EObject current=null] : iv_ruleProblemPropertyOptional= ruleProblemPropertyOptional EOF ;
    public final EObject entryRuleProblemPropertyOptional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProblemPropertyOptional = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:306:2: (iv_ruleProblemPropertyOptional= ruleProblemPropertyOptional EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:307:2: iv_ruleProblemPropertyOptional= ruleProblemPropertyOptional EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProblemPropertyOptionalRule()); 
            }
            pushFollow(FOLLOW_ruleProblemPropertyOptional_in_entryRuleProblemPropertyOptional555);
            iv_ruleProblemPropertyOptional=ruleProblemPropertyOptional();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProblemPropertyOptional; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProblemPropertyOptional565); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProblemPropertyOptional"


    // $ANTLR start "ruleProblemPropertyOptional"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:314:1: ruleProblemPropertyOptional returns [EObject current=null] : ( ( (lv_vars_0_0= ruleDeclaration ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) ) )* (otherlv_3= 'st' ( (lv_property_4_0= ruleORing ) ) )? ) ;
    public final EObject ruleProblemPropertyOptional() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_vars_0_0 = null;

        EObject lv_vars_2_0 = null;

        EObject lv_property_4_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:317:28: ( ( ( (lv_vars_0_0= ruleDeclaration ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) ) )* (otherlv_3= 'st' ( (lv_property_4_0= ruleORing ) ) )? ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:318:1: ( ( (lv_vars_0_0= ruleDeclaration ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) ) )* (otherlv_3= 'st' ( (lv_property_4_0= ruleORing ) ) )? )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:318:1: ( ( (lv_vars_0_0= ruleDeclaration ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) ) )* (otherlv_3= 'st' ( (lv_property_4_0= ruleORing ) ) )? )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:318:2: ( (lv_vars_0_0= ruleDeclaration ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) ) )* (otherlv_3= 'st' ( (lv_property_4_0= ruleORing ) ) )?
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:318:2: ( (lv_vars_0_0= ruleDeclaration ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:319:1: (lv_vars_0_0= ruleDeclaration )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:319:1: (lv_vars_0_0= ruleDeclaration )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:320:3: lv_vars_0_0= ruleDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getProblemPropertyOptionalAccess().getVarsDeclarationParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDeclaration_in_ruleProblemPropertyOptional611);
            lv_vars_0_0=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getProblemPropertyOptionalRule());
              	        }
                     		add(
                     			current, 
                     			"vars",
                      		lv_vars_0_0, 
                      		"Declaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:336:2: (otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:336:4: otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleProblemPropertyOptional624); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getProblemPropertyOptionalAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:340:1: ( (lv_vars_2_0= ruleDeclaration ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:341:1: (lv_vars_2_0= ruleDeclaration )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:341:1: (lv_vars_2_0= ruleDeclaration )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:342:3: lv_vars_2_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProblemPropertyOptionalAccess().getVarsDeclarationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleProblemPropertyOptional645);
            	    lv_vars_2_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProblemPropertyOptionalRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"vars",
            	              		lv_vars_2_0, 
            	              		"Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:358:4: (otherlv_3= 'st' ( (lv_property_4_0= ruleORing ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:358:6: otherlv_3= 'st' ( (lv_property_4_0= ruleORing ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleProblemPropertyOptional660); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getProblemPropertyOptionalAccess().getStKeyword_2_0());
                          
                    }
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:362:1: ( (lv_property_4_0= ruleORing ) )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:363:1: (lv_property_4_0= ruleORing )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:363:1: (lv_property_4_0= ruleORing )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:364:3: lv_property_4_0= ruleORing
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getProblemPropertyOptionalAccess().getPropertyORingParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleORing_in_ruleProblemPropertyOptional681);
                    lv_property_4_0=ruleORing();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getProblemPropertyOptionalRule());
                      	        }
                             		set(
                             			current, 
                             			"property",
                              		lv_property_4_0, 
                              		"ORing");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProblemPropertyOptional"


    // $ANTLR start "entryRuleProblem"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:388:1: entryRuleProblem returns [EObject current=null] : iv_ruleProblem= ruleProblem EOF ;
    public final EObject entryRuleProblem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProblem = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:389:2: (iv_ruleProblem= ruleProblem EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:390:2: iv_ruleProblem= ruleProblem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProblemRule()); 
            }
            pushFollow(FOLLOW_ruleProblem_in_entryRuleProblem719);
            iv_ruleProblem=ruleProblem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProblem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProblem729); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProblem"


    // $ANTLR start "ruleProblem"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:397:1: ruleProblem returns [EObject current=null] : ( ( (lv_vars_0_0= ruleDeclaration ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) ) )* otherlv_3= 'st' ( (lv_property_4_0= ruleORing ) ) ) ;
    public final EObject ruleProblem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_vars_0_0 = null;

        EObject lv_vars_2_0 = null;

        EObject lv_property_4_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:400:28: ( ( ( (lv_vars_0_0= ruleDeclaration ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) ) )* otherlv_3= 'st' ( (lv_property_4_0= ruleORing ) ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:401:1: ( ( (lv_vars_0_0= ruleDeclaration ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) ) )* otherlv_3= 'st' ( (lv_property_4_0= ruleORing ) ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:401:1: ( ( (lv_vars_0_0= ruleDeclaration ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) ) )* otherlv_3= 'st' ( (lv_property_4_0= ruleORing ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:401:2: ( (lv_vars_0_0= ruleDeclaration ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) ) )* otherlv_3= 'st' ( (lv_property_4_0= ruleORing ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:401:2: ( (lv_vars_0_0= ruleDeclaration ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:402:1: (lv_vars_0_0= ruleDeclaration )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:402:1: (lv_vars_0_0= ruleDeclaration )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:403:3: lv_vars_0_0= ruleDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getProblemAccess().getVarsDeclarationParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDeclaration_in_ruleProblem775);
            lv_vars_0_0=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getProblemRule());
              	        }
                     		add(
                     			current, 
                     			"vars",
                      		lv_vars_0_0, 
                      		"Declaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:419:2: (otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:419:4: otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleProblem788); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getProblemAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:423:1: ( (lv_vars_2_0= ruleDeclaration ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:424:1: (lv_vars_2_0= ruleDeclaration )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:424:1: (lv_vars_2_0= ruleDeclaration )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:425:3: lv_vars_2_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProblemAccess().getVarsDeclarationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleProblem809);
            	    lv_vars_2_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProblemRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"vars",
            	              		lv_vars_2_0, 
            	              		"Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleProblem823); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getProblemAccess().getStKeyword_2());
                  
            }
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:445:1: ( (lv_property_4_0= ruleORing ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:446:1: (lv_property_4_0= ruleORing )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:446:1: (lv_property_4_0= ruleORing )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:447:3: lv_property_4_0= ruleORing
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getProblemAccess().getPropertyORingParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleORing_in_ruleProblem844);
            lv_property_4_0=ruleORing();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getProblemRule());
              	        }
                     		set(
                     			current, 
                     			"property",
                      		lv_property_4_0, 
                      		"ORing");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProblem"


    // $ANTLR start "entryRuleDeclaration"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:471:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:472:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:473:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration880);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration890); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:480:1: ruleDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) )? ( (lv_varName_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_varName_1_0=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:483:28: ( ( ( (lv_type_0_0= ruleType ) )? ( (lv_varName_1_0= RULE_ID ) ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:484:1: ( ( (lv_type_0_0= ruleType ) )? ( (lv_varName_1_0= RULE_ID ) ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:484:1: ( ( (lv_type_0_0= ruleType ) )? ( (lv_varName_1_0= RULE_ID ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:484:2: ( (lv_type_0_0= ruleType ) )? ( (lv_varName_1_0= RULE_ID ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:484:2: ( (lv_type_0_0= ruleType ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==RULE_ID||LA10_1==19) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:485:1: (lv_type_0_0= ruleType )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:485:1: (lv_type_0_0= ruleType )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:486:3: lv_type_0_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleDeclaration936);
                    lv_type_0_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_0_0, 
                              		"Type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:502:3: ( (lv_varName_1_0= RULE_ID ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:503:1: (lv_varName_1_0= RULE_ID )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:503:1: (lv_varName_1_0= RULE_ID )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:504:3: lv_varName_1_0= RULE_ID
            {
            lv_varName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeclaration954); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_varName_1_0, grammarAccess.getDeclarationAccess().getVarNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"varName",
                      		lv_varName_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleType"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:528:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:529:2: (iv_ruleType= ruleType EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:530:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType995);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1005); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:537:1: ruleType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '<' ( (lv_templateType_2_0= ruleType ) ) otherlv_3= '>' )? ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_templateType_2_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:540:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '<' ( (lv_templateType_2_0= ruleType ) ) otherlv_3= '>' )? ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:541:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '<' ( (lv_templateType_2_0= ruleType ) ) otherlv_3= '>' )? )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:541:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '<' ( (lv_templateType_2_0= ruleType ) ) otherlv_3= '>' )? )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:541:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '<' ( (lv_templateType_2_0= ruleType ) ) otherlv_3= '>' )?
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:541:2: ( (lv_name_0_0= RULE_ID ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:542:1: (lv_name_0_0= RULE_ID )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:542:1: (lv_name_0_0= RULE_ID )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:543:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleType1047); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTypeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:559:2: (otherlv_1= '<' ( (lv_templateType_2_0= ruleType ) ) otherlv_3= '>' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:559:4: otherlv_1= '<' ( (lv_templateType_2_0= ruleType ) ) otherlv_3= '>'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleType1065); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getLessThanSignKeyword_1_0());
                          
                    }
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:563:1: ( (lv_templateType_2_0= ruleType ) )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:564:1: (lv_templateType_2_0= ruleType )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:564:1: (lv_templateType_2_0= ruleType )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:565:3: lv_templateType_2_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeAccess().getTemplateTypeTypeParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleType1086);
                    lv_templateType_2_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"templateType",
                              		lv_templateType_2_0, 
                              		"Type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleType1098); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getGreaterThanSignKeyword_1_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleORing"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:593:1: entryRuleORing returns [EObject current=null] : iv_ruleORing= ruleORing EOF ;
    public final EObject entryRuleORing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleORing = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:594:2: (iv_ruleORing= ruleORing EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:595:2: iv_ruleORing= ruleORing EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getORingRule()); 
            }
            pushFollow(FOLLOW_ruleORing_in_entryRuleORing1136);
            iv_ruleORing=ruleORing();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleORing; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleORing1146); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleORing"


    // $ANTLR start "ruleORing"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:602:1: ruleORing returns [EObject current=null] : (this_ANDing_0= ruleANDing ( () otherlv_2= '|' ( (lv_right_3_0= ruleANDing ) ) )* ) ;
    public final EObject ruleORing() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ANDing_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:605:28: ( (this_ANDing_0= ruleANDing ( () otherlv_2= '|' ( (lv_right_3_0= ruleANDing ) ) )* ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:606:1: (this_ANDing_0= ruleANDing ( () otherlv_2= '|' ( (lv_right_3_0= ruleANDing ) ) )* )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:606:1: (this_ANDing_0= ruleANDing ( () otherlv_2= '|' ( (lv_right_3_0= ruleANDing ) ) )* )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:607:5: this_ANDing_0= ruleANDing ( () otherlv_2= '|' ( (lv_right_3_0= ruleANDing ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getORingAccess().getANDingParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleANDing_in_ruleORing1193);
            this_ANDing_0=ruleANDing();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ANDing_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:615:1: ( () otherlv_2= '|' ( (lv_right_3_0= ruleANDing ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:615:2: () otherlv_2= '|' ( (lv_right_3_0= ruleANDing ) )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:615:2: ()
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:616:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getORingAccess().getORingLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleORing1214); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getORingAccess().getVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:625:1: ( (lv_right_3_0= ruleANDing ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:626:1: (lv_right_3_0= ruleANDing )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:626:1: (lv_right_3_0= ruleANDing )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:627:3: lv_right_3_0= ruleANDing
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getORingAccess().getRightANDingParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleANDing_in_ruleORing1235);
            	    lv_right_3_0=ruleANDing();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getORingRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"ANDing");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleORing"


    // $ANTLR start "entryRuleANDing"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:651:1: entryRuleANDing returns [EObject current=null] : iv_ruleANDing= ruleANDing EOF ;
    public final EObject entryRuleANDing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleANDing = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:652:2: (iv_ruleANDing= ruleANDing EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:653:2: iv_ruleANDing= ruleANDing EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getANDingRule()); 
            }
            pushFollow(FOLLOW_ruleANDing_in_entryRuleANDing1273);
            iv_ruleANDing=ruleANDing();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleANDing; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleANDing1283); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleANDing"


    // $ANTLR start "ruleANDing"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:660:1: ruleANDing returns [EObject current=null] : (this_Primary_0= rulePrimary ( () otherlv_2= '&' ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleANDing() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:663:28: ( (this_Primary_0= rulePrimary ( () otherlv_2= '&' ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:664:1: (this_Primary_0= rulePrimary ( () otherlv_2= '&' ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:664:1: (this_Primary_0= rulePrimary ( () otherlv_2= '&' ( (lv_right_3_0= rulePrimary ) ) )* )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:665:5: this_Primary_0= rulePrimary ( () otherlv_2= '&' ( (lv_right_3_0= rulePrimary ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getANDingAccess().getPrimaryParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimary_in_ruleANDing1330);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Primary_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:673:1: ( () otherlv_2= '&' ( (lv_right_3_0= rulePrimary ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:673:2: () otherlv_2= '&' ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:673:2: ()
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:674:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getANDingAccess().getANDingLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleANDing1351); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getANDingAccess().getAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:683:1: ( (lv_right_3_0= rulePrimary ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:684:1: (lv_right_3_0= rulePrimary )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:684:1: (lv_right_3_0= rulePrimary )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:685:3: lv_right_3_0= rulePrimary
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getANDingAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrimary_in_ruleANDing1372);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getANDingRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"Primary");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleANDing"


    // $ANTLR start "entryRulePrimary"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:709:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:710:2: (iv_rulePrimary= rulePrimary EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:711:2: iv_rulePrimary= rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary1410);
            iv_rulePrimary=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary1420); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:718:1: rulePrimary returns [EObject current=null] : ( ( ( RULE_ID )=>this_Atomic_0= ruleAtomic ) | this_SugarAtomic_1= ruleSugarAtomic | this_Quantifier_2= ruleQuantifier | this_ProblemShell_3= ruleProblemShell | (otherlv_4= '(' this_ORing_5= ruleORing otherlv_6= ')' ) | this_BooleanLiteral_7= ruleBooleanLiteral | this_Negation_8= ruleNegation ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_Atomic_0 = null;

        EObject this_SugarAtomic_1 = null;

        EObject this_Quantifier_2 = null;

        EObject this_ProblemShell_3 = null;

        EObject this_ORing_5 = null;

        EObject this_BooleanLiteral_7 = null;

        EObject this_Negation_8 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:721:28: ( ( ( ( RULE_ID )=>this_Atomic_0= ruleAtomic ) | this_SugarAtomic_1= ruleSugarAtomic | this_Quantifier_2= ruleQuantifier | this_ProblemShell_3= ruleProblemShell | (otherlv_4= '(' this_ORing_5= ruleORing otherlv_6= ')' ) | this_BooleanLiteral_7= ruleBooleanLiteral | this_Negation_8= ruleNegation ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:722:1: ( ( ( RULE_ID )=>this_Atomic_0= ruleAtomic ) | this_SugarAtomic_1= ruleSugarAtomic | this_Quantifier_2= ruleQuantifier | this_ProblemShell_3= ruleProblemShell | (otherlv_4= '(' this_ORing_5= ruleORing otherlv_6= ')' ) | this_BooleanLiteral_7= ruleBooleanLiteral | this_Negation_8= ruleNegation )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:722:1: ( ( ( RULE_ID )=>this_Atomic_0= ruleAtomic ) | this_SugarAtomic_1= ruleSugarAtomic | this_Quantifier_2= ruleQuantifier | this_ProblemShell_3= ruleProblemShell | (otherlv_4= '(' this_ORing_5= ruleORing otherlv_6= ')' ) | this_BooleanLiteral_7= ruleBooleanLiteral | this_Negation_8= ruleNegation )
            int alt14=7;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:722:2: ( ( RULE_ID )=>this_Atomic_0= ruleAtomic )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:722:2: ( ( RULE_ID )=>this_Atomic_0= ruleAtomic )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:722:3: ( RULE_ID )=>this_Atomic_0= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomic_in_rulePrimary1473);
                    this_Atomic_0=ruleAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Atomic_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:733:5: this_SugarAtomic_1= ruleSugarAtomic
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryAccess().getSugarAtomicParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSugarAtomic_in_rulePrimary1501);
                    this_SugarAtomic_1=ruleSugarAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SugarAtomic_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:743:5: this_Quantifier_2= ruleQuantifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryAccess().getQuantifierParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleQuantifier_in_rulePrimary1528);
                    this_Quantifier_2=ruleQuantifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Quantifier_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:753:5: this_ProblemShell_3= ruleProblemShell
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryAccess().getProblemShellParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleProblemShell_in_rulePrimary1555);
                    this_ProblemShell_3=ruleProblemShell();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ProblemShell_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:762:6: (otherlv_4= '(' this_ORing_5= ruleORing otherlv_6= ')' )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:762:6: (otherlv_4= '(' this_ORing_5= ruleORing otherlv_6= ')' )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:762:8: otherlv_4= '(' this_ORing_5= ruleORing otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_23_in_rulePrimary1573); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryAccess().getORingParserRuleCall_4_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleORing_in_rulePrimary1595);
                    this_ORing_5=ruleORing();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ORing_5; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_rulePrimary1606); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:781:5: this_BooleanLiteral_7= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryAccess().getBooleanLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_rulePrimary1635);
                    this_BooleanLiteral_7=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanLiteral_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:791:5: this_Negation_8= ruleNegation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryAccess().getNegationParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNegation_in_rulePrimary1662);
                    this_Negation_8=ruleNegation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Negation_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleProblemShell"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:807:1: entryRuleProblemShell returns [EObject current=null] : iv_ruleProblemShell= ruleProblemShell EOF ;
    public final EObject entryRuleProblemShell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProblemShell = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:808:2: (iv_ruleProblemShell= ruleProblemShell EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:809:2: iv_ruleProblemShell= ruleProblemShell EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProblemShellRule()); 
            }
            pushFollow(FOLLOW_ruleProblemShell_in_entryRuleProblemShell1697);
            iv_ruleProblemShell=ruleProblemShell();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProblemShell; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProblemShell1707); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProblemShell"


    // $ANTLR start "ruleProblemShell"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:816:1: ruleProblemShell returns [EObject current=null] : (otherlv_0= '{' ( (lv_problem_1_0= ruleProblem ) ) otherlv_2= '}' ) ;
    public final EObject ruleProblemShell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_problem_1_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:819:28: ( (otherlv_0= '{' ( (lv_problem_1_0= ruleProblem ) ) otherlv_2= '}' ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:820:1: (otherlv_0= '{' ( (lv_problem_1_0= ruleProblem ) ) otherlv_2= '}' )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:820:1: (otherlv_0= '{' ( (lv_problem_1_0= ruleProblem ) ) otherlv_2= '}' )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:820:3: otherlv_0= '{' ( (lv_problem_1_0= ruleProblem ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleProblemShell1744); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getProblemShellAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:824:1: ( (lv_problem_1_0= ruleProblem ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:825:1: (lv_problem_1_0= ruleProblem )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:825:1: (lv_problem_1_0= ruleProblem )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:826:3: lv_problem_1_0= ruleProblem
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getProblemShellAccess().getProblemProblemParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleProblem_in_ruleProblemShell1765);
            lv_problem_1_0=ruleProblem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getProblemShellRule());
              	        }
                     		set(
                     			current, 
                     			"problem",
                      		lv_problem_1_0, 
                      		"Problem");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleProblemShell1777); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getProblemShellAccess().getRightCurlyBracketKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProblemShell"


    // $ANTLR start "entryRuleNegation"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:854:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:855:2: (iv_ruleNegation= ruleNegation EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:856:2: iv_ruleNegation= ruleNegation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegationRule()); 
            }
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation1813);
            iv_ruleNegation=ruleNegation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation1823); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:863:1: ruleNegation returns [EObject current=null] : (otherlv_0= '!' ( (lv_negated_1_0= rulePrimary ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_negated_1_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:866:28: ( (otherlv_0= '!' ( (lv_negated_1_0= rulePrimary ) ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:867:1: (otherlv_0= '!' ( (lv_negated_1_0= rulePrimary ) ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:867:1: (otherlv_0= '!' ( (lv_negated_1_0= rulePrimary ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:867:3: otherlv_0= '!' ( (lv_negated_1_0= rulePrimary ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleNegation1860); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNegationAccess().getExclamationMarkKeyword_0());
                  
            }
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:871:1: ( (lv_negated_1_0= rulePrimary ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:872:1: (lv_negated_1_0= rulePrimary )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:872:1: (lv_negated_1_0= rulePrimary )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:873:3: lv_negated_1_0= rulePrimary
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNegationAccess().getNegatedPrimaryParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePrimary_in_ruleNegation1881);
            lv_negated_1_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNegationRule());
              	        }
                     		set(
                     			current, 
                     			"negated",
                      		lv_negated_1_0, 
                      		"Primary");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNegation"


    // $ANTLR start "entryRuleQuantifier"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:897:1: entryRuleQuantifier returns [EObject current=null] : iv_ruleQuantifier= ruleQuantifier EOF ;
    public final EObject entryRuleQuantifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifier = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:898:2: (iv_ruleQuantifier= ruleQuantifier EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:899:2: iv_ruleQuantifier= ruleQuantifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuantifierRule()); 
            }
            pushFollow(FOLLOW_ruleQuantifier_in_entryRuleQuantifier1917);
            iv_ruleQuantifier=ruleQuantifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuantifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantifier1927); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuantifier"


    // $ANTLR start "ruleQuantifier"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:906:1: ruleQuantifier returns [EObject current=null] : ( ( ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) ) ) otherlv_1= '(' ( (lv_subject_2_0= ruleProblem ) ) otherlv_3= ':' ( (lv_predicate_4_0= ruleORing ) ) otherlv_5= ')' ) ;
    public final EObject ruleQuantifier() throws RecognitionException {
        EObject current = null;

        Token lv_quantifier_0_1=null;
        Token lv_quantifier_0_2=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_subject_2_0 = null;

        EObject lv_predicate_4_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:909:28: ( ( ( ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) ) ) otherlv_1= '(' ( (lv_subject_2_0= ruleProblem ) ) otherlv_3= ':' ( (lv_predicate_4_0= ruleORing ) ) otherlv_5= ')' ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:910:1: ( ( ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) ) ) otherlv_1= '(' ( (lv_subject_2_0= ruleProblem ) ) otherlv_3= ':' ( (lv_predicate_4_0= ruleORing ) ) otherlv_5= ')' )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:910:1: ( ( ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) ) ) otherlv_1= '(' ( (lv_subject_2_0= ruleProblem ) ) otherlv_3= ':' ( (lv_predicate_4_0= ruleORing ) ) otherlv_5= ')' )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:910:2: ( ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) ) ) otherlv_1= '(' ( (lv_subject_2_0= ruleProblem ) ) otherlv_3= ':' ( (lv_predicate_4_0= ruleORing ) ) otherlv_5= ')'
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:910:2: ( ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:911:1: ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:911:1: ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:912:1: (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:912:1: (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            else if ( (LA15_0==29) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:913:3: lv_quantifier_0_1= 'forall'
                    {
                    lv_quantifier_0_1=(Token)match(input,28,FOLLOW_28_in_ruleQuantifier1972); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_quantifier_0_1, grammarAccess.getQuantifierAccess().getQuantifierForallKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getQuantifierRule());
                      	        }
                             		setWithLastConsumed(current, "quantifier", lv_quantifier_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:925:8: lv_quantifier_0_2= 'exists'
                    {
                    lv_quantifier_0_2=(Token)match(input,29,FOLLOW_29_in_ruleQuantifier2001); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_quantifier_0_2, grammarAccess.getQuantifierAccess().getQuantifierExistsKeyword_0_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getQuantifierRule());
                      	        }
                             		setWithLastConsumed(current, "quantifier", lv_quantifier_0_2, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleQuantifier2029); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getQuantifierAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:944:1: ( (lv_subject_2_0= ruleProblem ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:945:1: (lv_subject_2_0= ruleProblem )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:945:1: (lv_subject_2_0= ruleProblem )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:946:3: lv_subject_2_0= ruleProblem
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuantifierAccess().getSubjectProblemParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleProblem_in_ruleQuantifier2050);
            lv_subject_2_0=ruleProblem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQuantifierRule());
              	        }
                     		set(
                     			current, 
                     			"subject",
                      		lv_subject_2_0, 
                      		"Problem");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleQuantifier2062); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getQuantifierAccess().getColonKeyword_3());
                  
            }
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:966:1: ( (lv_predicate_4_0= ruleORing ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:967:1: (lv_predicate_4_0= ruleORing )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:967:1: (lv_predicate_4_0= ruleORing )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:968:3: lv_predicate_4_0= ruleORing
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuantifierAccess().getPredicateORingParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleORing_in_ruleQuantifier2083);
            lv_predicate_4_0=ruleORing();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQuantifierRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_4_0, 
                      		"ORing");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleQuantifier2095); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getQuantifierAccess().getRightParenthesisKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuantifier"


    // $ANTLR start "entryRuleSugarAtomic"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:996:1: entryRuleSugarAtomic returns [EObject current=null] : iv_ruleSugarAtomic= ruleSugarAtomic EOF ;
    public final EObject entryRuleSugarAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSugarAtomic = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:997:2: (iv_ruleSugarAtomic= ruleSugarAtomic EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:998:2: iv_ruleSugarAtomic= ruleSugarAtomic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSugarAtomicRule()); 
            }
            pushFollow(FOLLOW_ruleSugarAtomic_in_entryRuleSugarAtomic2131);
            iv_ruleSugarAtomic=ruleSugarAtomic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSugarAtomic; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSugarAtomic2141); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSugarAtomic"


    // $ANTLR start "ruleSugarAtomic"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1005:1: ruleSugarAtomic returns [EObject current=null] : ( ( (lv_Function_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleSugarAddition ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleSugarAddition ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleSugarAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_Function_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_args_2_0 = null;

        EObject lv_args_4_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1008:28: ( ( ( (lv_Function_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleSugarAddition ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleSugarAddition ) ) )* )? otherlv_5= ')' ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1009:1: ( ( (lv_Function_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleSugarAddition ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleSugarAddition ) ) )* )? otherlv_5= ')' )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1009:1: ( ( (lv_Function_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleSugarAddition ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleSugarAddition ) ) )* )? otherlv_5= ')' )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1009:2: ( (lv_Function_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleSugarAddition ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleSugarAddition ) ) )* )? otherlv_5= ')'
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1009:2: ( (lv_Function_0_0= RULE_ID ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1010:1: (lv_Function_0_0= RULE_ID )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1010:1: (lv_Function_0_0= RULE_ID )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1011:3: lv_Function_0_0= RULE_ID
            {
            lv_Function_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSugarAtomic2183); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_Function_0_0, grammarAccess.getSugarAtomicAccess().getFunctionIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSugarAtomicRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"Function",
                      		lv_Function_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleSugarAtomic2200); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSugarAtomicAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1031:1: ( ( (lv_args_2_0= ruleSugarAddition ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleSugarAddition ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_INT)||LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1031:2: ( (lv_args_2_0= ruleSugarAddition ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleSugarAddition ) ) )*
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1031:2: ( (lv_args_2_0= ruleSugarAddition ) )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1032:1: (lv_args_2_0= ruleSugarAddition )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1032:1: (lv_args_2_0= ruleSugarAddition )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1033:3: lv_args_2_0= ruleSugarAddition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSugarAtomicAccess().getArgsSugarAdditionParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSugarAddition_in_ruleSugarAtomic2222);
                    lv_args_2_0=ruleSugarAddition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSugarAtomicRule());
                      	        }
                             		add(
                             			current, 
                             			"args",
                              		lv_args_2_0, 
                              		"SugarAddition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1049:2: (otherlv_3= ',' ( (lv_args_4_0= ruleSugarAddition ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==17) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1049:4: otherlv_3= ',' ( (lv_args_4_0= ruleSugarAddition ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleSugarAtomic2235); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getSugarAtomicAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1053:1: ( (lv_args_4_0= ruleSugarAddition ) )
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1054:1: (lv_args_4_0= ruleSugarAddition )
                    	    {
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1054:1: (lv_args_4_0= ruleSugarAddition )
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1055:3: lv_args_4_0= ruleSugarAddition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSugarAtomicAccess().getArgsSugarAdditionParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSugarAddition_in_ruleSugarAtomic2256);
                    	    lv_args_4_0=ruleSugarAddition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSugarAtomicRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"args",
                    	              		lv_args_4_0, 
                    	              		"SugarAddition");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleSugarAtomic2272); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSugarAtomicAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSugarAtomic"


    // $ANTLR start "entryRuleAtomic"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1083:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1084:2: (iv_ruleAtomic= ruleAtomic EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1085:2: iv_ruleAtomic= ruleAtomic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicRule()); 
            }
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic2308);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomic; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic2318); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1092:1: ruleAtomic returns [EObject current=null] : ( ( (lv_Function_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_Function_0_0=null;
        Token otherlv_1=null;
        Token lv_args_2_0=null;
        Token otherlv_3=null;
        Token lv_args_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1095:28: ( ( ( (lv_Function_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1096:1: ( ( (lv_Function_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* )? otherlv_5= ')' )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1096:1: ( ( (lv_Function_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* )? otherlv_5= ')' )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1096:2: ( (lv_Function_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* )? otherlv_5= ')'
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1096:2: ( (lv_Function_0_0= RULE_ID ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1097:1: (lv_Function_0_0= RULE_ID )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1097:1: (lv_Function_0_0= RULE_ID )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1098:3: lv_Function_0_0= RULE_ID
            {
            lv_Function_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomic2360); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_Function_0_0, grammarAccess.getAtomicAccess().getFunctionIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAtomicRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"Function",
                      		lv_Function_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleAtomic2377); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1118:1: ( ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1118:2: ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )*
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1118:2: ( (lv_args_2_0= RULE_ID ) )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1119:1: (lv_args_2_0= RULE_ID )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1119:1: (lv_args_2_0= RULE_ID )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1120:3: lv_args_2_0= RULE_ID
                    {
                    lv_args_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomic2395); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_args_2_0, grammarAccess.getAtomicAccess().getArgsIDTerminalRuleCall_2_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicRule());
                      	        }
                             		addWithLastConsumed(
                             			current, 
                             			"args",
                              		lv_args_2_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1136:2: (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==17) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1136:4: otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleAtomic2413); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getAtomicAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1140:1: ( (lv_args_4_0= RULE_ID ) )
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1141:1: (lv_args_4_0= RULE_ID )
                    	    {
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1141:1: (lv_args_4_0= RULE_ID )
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1142:3: lv_args_4_0= RULE_ID
                    	    {
                    	    lv_args_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomic2430); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_args_4_0, grammarAccess.getAtomicAccess().getArgsIDTerminalRuleCall_2_1_1_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getAtomicRule());
                    	      	        }
                    	             		addWithLastConsumed(
                    	             			current, 
                    	             			"args",
                    	              		lv_args_4_0, 
                    	              		"ID");
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleAtomic2451); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getAtomicAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1170:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1171:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1172:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral2487);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral2497); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1179:1: ruleBooleanLiteral returns [EObject current=null] : ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;

         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1182:28: ( ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1183:1: ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1183:1: ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1184:1: ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1184:1: ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1185:1: (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1185:1: (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            else if ( (LA20_0==32) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1186:3: lv_value_0_1= 'TRUE'
                    {
                    lv_value_0_1=(Token)match(input,31,FOLLOW_31_in_ruleBooleanLiteral2541); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_value_0_1, grammarAccess.getBooleanLiteralAccess().getValueTRUEKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "value", lv_value_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1198:8: lv_value_0_2= 'FALSE'
                    {
                    lv_value_0_2=(Token)match(input,32,FOLLOW_32_in_ruleBooleanLiteral2570); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_value_0_2, grammarAccess.getBooleanLiteralAccess().getValueFALSEKeyword_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "value", lv_value_0_2, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleTheorem"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1221:1: entryRuleTheorem returns [EObject current=null] : iv_ruleTheorem= ruleTheorem EOF ;
    public final EObject entryRuleTheorem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheorem = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1222:2: (iv_ruleTheorem= ruleTheorem EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1223:2: iv_ruleTheorem= ruleTheorem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTheoremRule()); 
            }
            pushFollow(FOLLOW_ruleTheorem_in_entryRuleTheorem2621);
            iv_ruleTheorem=ruleTheorem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTheorem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTheorem2631); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTheorem"


    // $ANTLR start "ruleTheorem"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1230:1: ruleTheorem returns [EObject current=null] : ( ( (lv_Requirement_0_0= ruleORing ) ) ( ( (lv_Implication_1_1= '->' | lv_Implication_1_2= '<-' | lv_Implication_1_3= '<->' ) ) ) ( (lv_Result_2_0= ruleORing ) ) otherlv_3= ',' ( (lv_Cost_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_Description_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_PseudoCode_8_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleTheorem() throws RecognitionException {
        EObject current = null;

        Token lv_Implication_1_1=null;
        Token lv_Implication_1_2=null;
        Token lv_Implication_1_3=null;
        Token otherlv_3=null;
        Token lv_Cost_4_0=null;
        Token otherlv_5=null;
        Token lv_Description_6_0=null;
        Token otherlv_7=null;
        Token lv_PseudoCode_8_0=null;
        EObject lv_Requirement_0_0 = null;

        EObject lv_Result_2_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1233:28: ( ( ( (lv_Requirement_0_0= ruleORing ) ) ( ( (lv_Implication_1_1= '->' | lv_Implication_1_2= '<-' | lv_Implication_1_3= '<->' ) ) ) ( (lv_Result_2_0= ruleORing ) ) otherlv_3= ',' ( (lv_Cost_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_Description_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_PseudoCode_8_0= RULE_STRING ) ) )? ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1234:1: ( ( (lv_Requirement_0_0= ruleORing ) ) ( ( (lv_Implication_1_1= '->' | lv_Implication_1_2= '<-' | lv_Implication_1_3= '<->' ) ) ) ( (lv_Result_2_0= ruleORing ) ) otherlv_3= ',' ( (lv_Cost_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_Description_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_PseudoCode_8_0= RULE_STRING ) ) )? )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1234:1: ( ( (lv_Requirement_0_0= ruleORing ) ) ( ( (lv_Implication_1_1= '->' | lv_Implication_1_2= '<-' | lv_Implication_1_3= '<->' ) ) ) ( (lv_Result_2_0= ruleORing ) ) otherlv_3= ',' ( (lv_Cost_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_Description_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_PseudoCode_8_0= RULE_STRING ) ) )? )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1234:2: ( (lv_Requirement_0_0= ruleORing ) ) ( ( (lv_Implication_1_1= '->' | lv_Implication_1_2= '<-' | lv_Implication_1_3= '<->' ) ) ) ( (lv_Result_2_0= ruleORing ) ) otherlv_3= ',' ( (lv_Cost_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_Description_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_PseudoCode_8_0= RULE_STRING ) ) )?
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1234:2: ( (lv_Requirement_0_0= ruleORing ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1235:1: (lv_Requirement_0_0= ruleORing )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1235:1: (lv_Requirement_0_0= ruleORing )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1236:3: lv_Requirement_0_0= ruleORing
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTheoremAccess().getRequirementORingParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleORing_in_ruleTheorem2677);
            lv_Requirement_0_0=ruleORing();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTheoremRule());
              	        }
                     		set(
                     			current, 
                     			"Requirement",
                      		lv_Requirement_0_0, 
                      		"ORing");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1252:2: ( ( (lv_Implication_1_1= '->' | lv_Implication_1_2= '<-' | lv_Implication_1_3= '<->' ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1253:1: ( (lv_Implication_1_1= '->' | lv_Implication_1_2= '<-' | lv_Implication_1_3= '<->' ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1253:1: ( (lv_Implication_1_1= '->' | lv_Implication_1_2= '<-' | lv_Implication_1_3= '<->' ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1254:1: (lv_Implication_1_1= '->' | lv_Implication_1_2= '<-' | lv_Implication_1_3= '<->' )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1254:1: (lv_Implication_1_1= '->' | lv_Implication_1_2= '<-' | lv_Implication_1_3= '<->' )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt21=1;
                }
                break;
            case 34:
                {
                alt21=2;
                }
                break;
            case 35:
                {
                alt21=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1255:3: lv_Implication_1_1= '->'
                    {
                    lv_Implication_1_1=(Token)match(input,33,FOLLOW_33_in_ruleTheorem2697); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_Implication_1_1, grammarAccess.getTheoremAccess().getImplicationHyphenMinusGreaterThanSignKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTheoremRule());
                      	        }
                             		setWithLastConsumed(current, "Implication", lv_Implication_1_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1267:8: lv_Implication_1_2= '<-'
                    {
                    lv_Implication_1_2=(Token)match(input,34,FOLLOW_34_in_ruleTheorem2726); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_Implication_1_2, grammarAccess.getTheoremAccess().getImplicationLessThanSignHyphenMinusKeyword_1_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTheoremRule());
                      	        }
                             		setWithLastConsumed(current, "Implication", lv_Implication_1_2, null);
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1279:8: lv_Implication_1_3= '<->'
                    {
                    lv_Implication_1_3=(Token)match(input,35,FOLLOW_35_in_ruleTheorem2755); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_Implication_1_3, grammarAccess.getTheoremAccess().getImplicationLessThanSignHyphenMinusGreaterThanSignKeyword_1_0_2());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTheoremRule());
                      	        }
                             		setWithLastConsumed(current, "Implication", lv_Implication_1_3, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1294:2: ( (lv_Result_2_0= ruleORing ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1295:1: (lv_Result_2_0= ruleORing )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1295:1: (lv_Result_2_0= ruleORing )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1296:3: lv_Result_2_0= ruleORing
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTheoremAccess().getResultORingParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleORing_in_ruleTheorem2792);
            lv_Result_2_0=ruleORing();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTheoremRule());
              	        }
                     		set(
                     			current, 
                     			"Result",
                      		lv_Result_2_0, 
                      		"ORing");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleTheorem2804); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTheoremAccess().getCommaKeyword_3());
                  
            }
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1316:1: ( (lv_Cost_4_0= RULE_INT ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1317:1: (lv_Cost_4_0= RULE_INT )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1317:1: (lv_Cost_4_0= RULE_INT )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1318:3: lv_Cost_4_0= RULE_INT
            {
            lv_Cost_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTheorem2821); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_Cost_4_0, grammarAccess.getTheoremAccess().getCostINTTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTheoremRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"Cost",
                      		lv_Cost_4_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleTheorem2838); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getTheoremAccess().getCommaKeyword_5());
                  
            }
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1338:1: ( (lv_Description_6_0= RULE_STRING ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1339:1: (lv_Description_6_0= RULE_STRING )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1339:1: (lv_Description_6_0= RULE_STRING )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1340:3: lv_Description_6_0= RULE_STRING
            {
            lv_Description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTheorem2855); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_Description_6_0, grammarAccess.getTheoremAccess().getDescriptionSTRINGTerminalRuleCall_6_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTheoremRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"Description",
                      		lv_Description_6_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1356:2: (otherlv_7= ',' ( (lv_PseudoCode_8_0= RULE_STRING ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==17) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1356:4: otherlv_7= ',' ( (lv_PseudoCode_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleTheorem2873); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getTheoremAccess().getCommaKeyword_7_0());
                          
                    }
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1360:1: ( (lv_PseudoCode_8_0= RULE_STRING ) )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1361:1: (lv_PseudoCode_8_0= RULE_STRING )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1361:1: (lv_PseudoCode_8_0= RULE_STRING )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1362:3: lv_PseudoCode_8_0= RULE_STRING
                    {
                    lv_PseudoCode_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTheorem2890); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_PseudoCode_8_0, grammarAccess.getTheoremAccess().getPseudoCodeSTRINGTerminalRuleCall_7_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTheoremRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"PseudoCode",
                              		lv_PseudoCode_8_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTheorem"


    // $ANTLR start "entryRuleSugarAddition"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1386:1: entryRuleSugarAddition returns [EObject current=null] : iv_ruleSugarAddition= ruleSugarAddition EOF ;
    public final EObject entryRuleSugarAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSugarAddition = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1387:2: (iv_ruleSugarAddition= ruleSugarAddition EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1388:2: iv_ruleSugarAddition= ruleSugarAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSugarAdditionRule()); 
            }
            pushFollow(FOLLOW_ruleSugarAddition_in_entryRuleSugarAddition2933);
            iv_ruleSugarAddition=ruleSugarAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSugarAddition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSugarAddition2943); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSugarAddition"


    // $ANTLR start "ruleSugarAddition"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1395:1: ruleSugarAddition returns [EObject current=null] : (this_SugarMultiplication_0= ruleSugarMultiplication ( () ( ( (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' ) ) ) ( (lv_right_3_0= ruleSugarMultiplication ) ) )* ) ;
    public final EObject ruleSugarAddition() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_2_1=null;
        Token lv_symbol_2_2=null;
        EObject this_SugarMultiplication_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1398:28: ( (this_SugarMultiplication_0= ruleSugarMultiplication ( () ( ( (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' ) ) ) ( (lv_right_3_0= ruleSugarMultiplication ) ) )* ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1399:1: (this_SugarMultiplication_0= ruleSugarMultiplication ( () ( ( (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' ) ) ) ( (lv_right_3_0= ruleSugarMultiplication ) ) )* )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1399:1: (this_SugarMultiplication_0= ruleSugarMultiplication ( () ( ( (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' ) ) ) ( (lv_right_3_0= ruleSugarMultiplication ) ) )* )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1400:5: this_SugarMultiplication_0= ruleSugarMultiplication ( () ( ( (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' ) ) ) ( (lv_right_3_0= ruleSugarMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSugarAdditionAccess().getSugarMultiplicationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSugarMultiplication_in_ruleSugarAddition2990);
            this_SugarMultiplication_0=ruleSugarMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SugarMultiplication_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1408:1: ( () ( ( (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' ) ) ) ( (lv_right_3_0= ruleSugarMultiplication ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=36 && LA24_0<=37)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1408:2: () ( ( (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' ) ) ) ( (lv_right_3_0= ruleSugarMultiplication ) )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1408:2: ()
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1409:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getSugarAdditionAccess().getSugarAdditionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1414:2: ( ( (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' ) ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1415:1: ( (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' ) )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1415:1: ( (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1416:1: (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1416:1: (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==36) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==37) ) {
            	        alt23=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1417:3: lv_symbol_2_1= '+'
            	            {
            	            lv_symbol_2_1=(Token)match(input,36,FOLLOW_36_in_ruleSugarAddition3019); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_symbol_2_1, grammarAccess.getSugarAdditionAccess().getSymbolPlusSignKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getSugarAdditionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "symbol", lv_symbol_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1429:8: lv_symbol_2_2= '-'
            	            {
            	            lv_symbol_2_2=(Token)match(input,37,FOLLOW_37_in_ruleSugarAddition3048); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_symbol_2_2, grammarAccess.getSugarAdditionAccess().getSymbolHyphenMinusKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getSugarAdditionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "symbol", lv_symbol_2_2, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1444:2: ( (lv_right_3_0= ruleSugarMultiplication ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1445:1: (lv_right_3_0= ruleSugarMultiplication )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1445:1: (lv_right_3_0= ruleSugarMultiplication )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1446:3: lv_right_3_0= ruleSugarMultiplication
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSugarAdditionAccess().getRightSugarMultiplicationParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSugarMultiplication_in_ruleSugarAddition3085);
            	    lv_right_3_0=ruleSugarMultiplication();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSugarAdditionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"SugarMultiplication");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSugarAddition"


    // $ANTLR start "entryRuleSugarMultiplication"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1470:1: entryRuleSugarMultiplication returns [EObject current=null] : iv_ruleSugarMultiplication= ruleSugarMultiplication EOF ;
    public final EObject entryRuleSugarMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSugarMultiplication = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1471:2: (iv_ruleSugarMultiplication= ruleSugarMultiplication EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1472:2: iv_ruleSugarMultiplication= ruleSugarMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSugarMultiplicationRule()); 
            }
            pushFollow(FOLLOW_ruleSugarMultiplication_in_entryRuleSugarMultiplication3123);
            iv_ruleSugarMultiplication=ruleSugarMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSugarMultiplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSugarMultiplication3133); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSugarMultiplication"


    // $ANTLR start "ruleSugarMultiplication"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1479:1: ruleSugarMultiplication returns [EObject current=null] : (this_SugarNumericalPrimary_0= ruleSugarNumericalPrimary ( () ( ( (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' ) ) ) ( (lv_right_3_0= ruleSugarNumericalPrimary ) ) )* ) ;
    public final EObject ruleSugarMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_2_1=null;
        Token lv_symbol_2_2=null;
        EObject this_SugarNumericalPrimary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1482:28: ( (this_SugarNumericalPrimary_0= ruleSugarNumericalPrimary ( () ( ( (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' ) ) ) ( (lv_right_3_0= ruleSugarNumericalPrimary ) ) )* ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1483:1: (this_SugarNumericalPrimary_0= ruleSugarNumericalPrimary ( () ( ( (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' ) ) ) ( (lv_right_3_0= ruleSugarNumericalPrimary ) ) )* )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1483:1: (this_SugarNumericalPrimary_0= ruleSugarNumericalPrimary ( () ( ( (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' ) ) ) ( (lv_right_3_0= ruleSugarNumericalPrimary ) ) )* )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1484:5: this_SugarNumericalPrimary_0= ruleSugarNumericalPrimary ( () ( ( (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' ) ) ) ( (lv_right_3_0= ruleSugarNumericalPrimary ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSugarMultiplicationAccess().getSugarNumericalPrimaryParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSugarNumericalPrimary_in_ruleSugarMultiplication3180);
            this_SugarNumericalPrimary_0=ruleSugarNumericalPrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SugarNumericalPrimary_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1492:1: ( () ( ( (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' ) ) ) ( (lv_right_3_0= ruleSugarNumericalPrimary ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=38 && LA26_0<=39)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1492:2: () ( ( (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' ) ) ) ( (lv_right_3_0= ruleSugarNumericalPrimary ) )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1492:2: ()
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1493:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getSugarMultiplicationAccess().getSugarMultiplicationLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1498:2: ( ( (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' ) ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1499:1: ( (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' ) )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1499:1: ( (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1500:1: (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1500:1: (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==38) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==39) ) {
            	        alt25=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1501:3: lv_symbol_2_1= '*'
            	            {
            	            lv_symbol_2_1=(Token)match(input,38,FOLLOW_38_in_ruleSugarMultiplication3209); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_symbol_2_1, grammarAccess.getSugarMultiplicationAccess().getSymbolAsteriskKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getSugarMultiplicationRule());
            	              	        }
            	                     		setWithLastConsumed(current, "symbol", lv_symbol_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1513:8: lv_symbol_2_2= '/'
            	            {
            	            lv_symbol_2_2=(Token)match(input,39,FOLLOW_39_in_ruleSugarMultiplication3238); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_symbol_2_2, grammarAccess.getSugarMultiplicationAccess().getSymbolSolidusKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getSugarMultiplicationRule());
            	              	        }
            	                     		setWithLastConsumed(current, "symbol", lv_symbol_2_2, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1528:2: ( (lv_right_3_0= ruleSugarNumericalPrimary ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1529:1: (lv_right_3_0= ruleSugarNumericalPrimary )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1529:1: (lv_right_3_0= ruleSugarNumericalPrimary )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1530:3: lv_right_3_0= ruleSugarNumericalPrimary
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSugarMultiplicationAccess().getRightSugarNumericalPrimaryParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSugarNumericalPrimary_in_ruleSugarMultiplication3275);
            	    lv_right_3_0=ruleSugarNumericalPrimary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSugarMultiplicationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"SugarNumericalPrimary");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSugarMultiplication"


    // $ANTLR start "entryRuleSugarNumericalPrimary"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1554:1: entryRuleSugarNumericalPrimary returns [EObject current=null] : iv_ruleSugarNumericalPrimary= ruleSugarNumericalPrimary EOF ;
    public final EObject entryRuleSugarNumericalPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSugarNumericalPrimary = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1555:2: (iv_ruleSugarNumericalPrimary= ruleSugarNumericalPrimary EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1556:2: iv_ruleSugarNumericalPrimary= ruleSugarNumericalPrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSugarNumericalPrimaryRule()); 
            }
            pushFollow(FOLLOW_ruleSugarNumericalPrimary_in_entryRuleSugarNumericalPrimary3313);
            iv_ruleSugarNumericalPrimary=ruleSugarNumericalPrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSugarNumericalPrimary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSugarNumericalPrimary3323); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSugarNumericalPrimary"


    // $ANTLR start "ruleSugarNumericalPrimary"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1563:1: ruleSugarNumericalPrimary returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | ( ( RULE_ID )=>this_Atomic_1= ruleAtomic ) | this_SugarAtomic_2= ruleSugarAtomic | (otherlv_3= '(' this_SugarNumericalPrimary_4= ruleSugarNumericalPrimary otherlv_5= ')' ) ) ;
    public final EObject ruleSugarNumericalPrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_NumberLiteral_0 = null;

        EObject this_Atomic_1 = null;

        EObject this_SugarAtomic_2 = null;

        EObject this_SugarNumericalPrimary_4 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1566:28: ( (this_NumberLiteral_0= ruleNumberLiteral | ( ( RULE_ID )=>this_Atomic_1= ruleAtomic ) | this_SugarAtomic_2= ruleSugarAtomic | (otherlv_3= '(' this_SugarNumericalPrimary_4= ruleSugarNumericalPrimary otherlv_5= ')' ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1567:1: (this_NumberLiteral_0= ruleNumberLiteral | ( ( RULE_ID )=>this_Atomic_1= ruleAtomic ) | this_SugarAtomic_2= ruleSugarAtomic | (otherlv_3= '(' this_SugarNumericalPrimary_4= ruleSugarNumericalPrimary otherlv_5= ')' ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1567:1: (this_NumberLiteral_0= ruleNumberLiteral | ( ( RULE_ID )=>this_Atomic_1= ruleAtomic ) | this_SugarAtomic_2= ruleSugarAtomic | (otherlv_3= '(' this_SugarNumericalPrimary_4= ruleSugarNumericalPrimary otherlv_5= ')' ) )
            int alt27=4;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1568:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSugarNumericalPrimaryAccess().getNumberLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleSugarNumericalPrimary3370);
                    this_NumberLiteral_0=ruleNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumberLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1577:6: ( ( RULE_ID )=>this_Atomic_1= ruleAtomic )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1577:6: ( ( RULE_ID )=>this_Atomic_1= ruleAtomic )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1577:7: ( RULE_ID )=>this_Atomic_1= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSugarNumericalPrimaryAccess().getAtomicParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomic_in_ruleSugarNumericalPrimary3403);
                    this_Atomic_1=ruleAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Atomic_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1588:5: this_SugarAtomic_2= ruleSugarAtomic
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSugarNumericalPrimaryAccess().getSugarAtomicParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSugarAtomic_in_ruleSugarNumericalPrimary3431);
                    this_SugarAtomic_2=ruleSugarAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SugarAtomic_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1597:6: (otherlv_3= '(' this_SugarNumericalPrimary_4= ruleSugarNumericalPrimary otherlv_5= ')' )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1597:6: (otherlv_3= '(' this_SugarNumericalPrimary_4= ruleSugarNumericalPrimary otherlv_5= ')' )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1597:8: otherlv_3= '(' this_SugarNumericalPrimary_4= ruleSugarNumericalPrimary otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleSugarNumericalPrimary3449); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getSugarNumericalPrimaryAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSugarNumericalPrimaryAccess().getSugarNumericalPrimaryParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSugarNumericalPrimary_in_ruleSugarNumericalPrimary3471);
                    this_SugarNumericalPrimary_4=ruleSugarNumericalPrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SugarNumericalPrimary_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleSugarNumericalPrimary3482); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getSugarNumericalPrimaryAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSugarNumericalPrimary"


    // $ANTLR start "entryRuleNumberLiteral"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1622:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1623:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1624:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral3519);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral3529); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1631:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1634:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1635:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1635:1: ( (lv_value_0_0= RULE_INT ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1636:1: (lv_value_0_0= RULE_INT )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1636:1: (lv_value_0_0= RULE_INT )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1637:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumberLiteral3570); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getNumberLiteralAccess().getValueINTTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNumberLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"INT");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberLiteral"

    // $ANTLR start synpred1_InternalInput
    public final void synpred1_InternalInput_fragment() throws RecognitionException {   
        // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:722:3: ( RULE_ID )
        // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:722:5: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred1_InternalInput1457); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalInput

    // $ANTLR start synpred2_InternalInput
    public final void synpred2_InternalInput_fragment() throws RecognitionException {   
        // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1577:7: ( RULE_ID )
        // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1577:9: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred2_InternalInput3387); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalInput

    // Delegated rules

    public final boolean synpred1_InternalInput() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalInput_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalInput() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalInput_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA27 dfa27 = new DFA27(this);
    static final String DFA14_eotS =
        "\15\uffff";
    static final String DFA14_eofS =
        "\15\uffff";
    static final String DFA14_minS =
        "\1\4\1\27\5\uffff\1\4\1\21\1\0\3\uffff";
    static final String DFA14_maxS =
        "\1\40\1\27\5\uffff\2\30\1\0\3\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\1\7\3\uffff\1\2\2\1";
    static final String DFA14_specialS =
        "\10\uffff\1\1\1\0\3\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1\22\uffff\1\4\1\uffff\1\3\1\uffff\1\6\2\2\1\uffff\2\5",
            "\1\7",
            "",
            "",
            "",
            "",
            "",
            "\1\10\1\12\21\uffff\1\12\1\11",
            "\1\13\5\uffff\1\12\1\14",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "722:1: ( ( ( RULE_ID )=>this_Atomic_0= ruleAtomic ) | this_SugarAtomic_1= ruleSugarAtomic | this_Quantifier_2= ruleQuantifier | this_ProblemShell_3= ruleProblemShell | (otherlv_4= '(' this_ORing_5= ruleORing otherlv_6= ')' ) | this_BooleanLiteral_7= ruleBooleanLiteral | this_Negation_8= ruleNegation )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_9 = input.LA(1);

                         
                        int index14_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalInput()) ) {s = 12;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index14_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_8 = input.LA(1);

                         
                        int index14_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_8==23) ) {s = 10;}

                        else if ( (LA14_8==17) && (synpred1_InternalInput())) {s = 11;}

                        else if ( (LA14_8==24) && (synpred1_InternalInput())) {s = 12;}

                         
                        input.seek(index14_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA27_eotS =
        "\12\uffff";
    static final String DFA27_eofS =
        "\12\uffff";
    static final String DFA27_minS =
        "\1\4\1\uffff\1\27\1\uffff\1\4\1\21\1\0\3\uffff";
    static final String DFA27_maxS =
        "\1\27\1\uffff\1\27\1\uffff\2\30\1\0\3\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\3\uffff\1\3\2\2";
    static final String DFA27_specialS =
        "\5\uffff\1\0\1\1\3\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\2\1\1\21\uffff\1\3",
            "",
            "\1\4",
            "",
            "\1\5\1\7\21\uffff\1\7\1\6",
            "\1\10\5\uffff\1\7\1\11",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1567:1: (this_NumberLiteral_0= ruleNumberLiteral | ( ( RULE_ID )=>this_Atomic_1= ruleAtomic ) | this_SugarAtomic_2= ruleSugarAtomic | (otherlv_3= '(' this_SugarNumericalPrimary_4= ruleSugarNumericalPrimary otherlv_5= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_5 = input.LA(1);

                         
                        int index27_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_5==23) ) {s = 7;}

                        else if ( (LA27_5==17) && (synpred2_InternalInput())) {s = 8;}

                        else if ( (LA27_5==24) && (synpred2_InternalInput())) {s = 9;}

                         
                        input.seek(index27_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_6 = input.LA(1);

                         
                        int index27_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalInput()) ) {s = 9;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index27_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleInput122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProblemPropertyOptional_in_ruleInput143 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInput155 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_13_in_ruleInput177 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14_in_ruleInput206 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProblem_in_ruleInput243 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_15_in_ruleInput269 = new BitSet(new long[]{0x00000001BA800010L});
    public static final BitSet FOLLOW_ruleProblem_in_ruleInput305 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleProblemNoVars_in_ruleInput324 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleInput343 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInput355 = new BitSet(new long[]{0x00000001BA800010L});
    public static final BitSet FOLLOW_ruleTheorem_in_ruleInput376 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleInput389 = new BitSet(new long[]{0x00000001BA800010L});
    public static final BitSet FOLLOW_ruleTheorem_in_ruleInput410 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleInput425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblemNoVars_in_entryRuleProblemNoVars465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProblemNoVars475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_ruleProblemNoVars520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblemPropertyOptional_in_entryRuleProblemPropertyOptional555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProblemPropertyOptional565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleProblemPropertyOptional611 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_17_in_ruleProblemPropertyOptional624 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleProblemPropertyOptional645 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_18_in_ruleProblemPropertyOptional660 = new BitSet(new long[]{0x00000001BA800010L});
    public static final BitSet FOLLOW_ruleORing_in_ruleProblemPropertyOptional681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblem_in_entryRuleProblem719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProblem729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleProblem775 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleProblem788 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleProblem809 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleProblem823 = new BitSet(new long[]{0x00000001BA800010L});
    public static final BitSet FOLLOW_ruleORing_in_ruleProblem844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleDeclaration936 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeclaration954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleType1047 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleType1065 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleType1086 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleType1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_entryRuleORing1136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleORing1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANDing_in_ruleORing1193 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleORing1214 = new BitSet(new long[]{0x00000001BA800010L});
    public static final BitSet FOLLOW_ruleANDing_in_ruleORing1235 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleANDing_in_entryRuleANDing1273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleANDing1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleANDing1330 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleANDing1351 = new BitSet(new long[]{0x00000001BA800010L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleANDing1372 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary1410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rulePrimary1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSugarAtomic_in_rulePrimary1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_rulePrimary1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblemShell_in_rulePrimary1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulePrimary1573 = new BitSet(new long[]{0x00000001BA800010L});
    public static final BitSet FOLLOW_ruleORing_in_rulePrimary1595 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePrimary1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rulePrimary1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_rulePrimary1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblemShell_in_entryRuleProblemShell1697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProblemShell1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleProblemShell1744 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProblem_in_ruleProblemShell1765 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleProblemShell1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation1813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleNegation1860 = new BitSet(new long[]{0x00000001BA800010L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleNegation1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_entryRuleQuantifier1917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantifier1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleQuantifier1972 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_29_in_ruleQuantifier2001 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleQuantifier2029 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProblem_in_ruleQuantifier2050 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleQuantifier2062 = new BitSet(new long[]{0x00000001BA800010L});
    public static final BitSet FOLLOW_ruleORing_in_ruleQuantifier2083 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleQuantifier2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSugarAtomic_in_entryRuleSugarAtomic2131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSugarAtomic2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSugarAtomic2183 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSugarAtomic2200 = new BitSet(new long[]{0x0000000001800030L});
    public static final BitSet FOLLOW_ruleSugarAddition_in_ruleSugarAtomic2222 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_17_in_ruleSugarAtomic2235 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_ruleSugarAddition_in_ruleSugarAtomic2256 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_24_in_ruleSugarAtomic2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic2308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomic2360 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAtomic2377 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomic2395 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_17_in_ruleAtomic2413 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomic2430 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_24_in_ruleAtomic2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral2487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleBooleanLiteral2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleBooleanLiteral2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTheorem_in_entryRuleTheorem2621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTheorem2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_ruleTheorem2677 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_33_in_ruleTheorem2697 = new BitSet(new long[]{0x00000001BA800010L});
    public static final BitSet FOLLOW_34_in_ruleTheorem2726 = new BitSet(new long[]{0x00000001BA800010L});
    public static final BitSet FOLLOW_35_in_ruleTheorem2755 = new BitSet(new long[]{0x00000001BA800010L});
    public static final BitSet FOLLOW_ruleORing_in_ruleTheorem2792 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTheorem2804 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTheorem2821 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTheorem2838 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTheorem2855 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleTheorem2873 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTheorem2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSugarAddition_in_entryRuleSugarAddition2933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSugarAddition2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSugarMultiplication_in_ruleSugarAddition2990 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_36_in_ruleSugarAddition3019 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_37_in_ruleSugarAddition3048 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_ruleSugarMultiplication_in_ruleSugarAddition3085 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_ruleSugarMultiplication_in_entryRuleSugarMultiplication3123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSugarMultiplication3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSugarNumericalPrimary_in_ruleSugarMultiplication3180 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_38_in_ruleSugarMultiplication3209 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_39_in_ruleSugarMultiplication3238 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_ruleSugarNumericalPrimary_in_ruleSugarMultiplication3275 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_ruleSugarNumericalPrimary_in_entryRuleSugarNumericalPrimary3313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSugarNumericalPrimary3323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleSugarNumericalPrimary3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_ruleSugarNumericalPrimary3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSugarAtomic_in_ruleSugarNumericalPrimary3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleSugarNumericalPrimary3449 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_ruleSugarNumericalPrimary_in_ruleSugarNumericalPrimary3471 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSugarNumericalPrimary3482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral3519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumberLiteral3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred1_InternalInput1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred2_InternalInput3387 = new BitSet(new long[]{0x0000000000000002L});

}