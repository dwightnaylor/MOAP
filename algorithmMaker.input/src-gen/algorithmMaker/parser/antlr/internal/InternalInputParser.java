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
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_ruleInput_in_entryRuleInput75);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInput85); 

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
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleInput122); 

                	newLeafNode(otherlv_0, grammarAccess.getInputAccess().getGivenKeyword_0());
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:84:1: ( (lv_given_1_0= ruleProblemPropertyOptional ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:85:1: (lv_given_1_0= ruleProblemPropertyOptional )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:85:1: (lv_given_1_0= ruleProblemPropertyOptional )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:86:3: lv_given_1_0= ruleProblemPropertyOptional
            {
             
            	        newCompositeNode(grammarAccess.getInputAccess().getGivenProblemPropertyOptionalParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleProblemPropertyOptional_in_ruleInput143);
            lv_given_1_0=ruleProblemPropertyOptional();

            state._fsp--;


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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleInput155); 

                	newLeafNode(otherlv_2, grammarAccess.getInputAccess().getSemicolonKeyword_2());
                
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
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 0, input);

                        throw nvae;
                    }
                    switch (alt1) {
                        case 1 :
                            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:109:3: lv_task_3_1= 'Find'
                            {
                            lv_task_3_1=(Token)match(input,13,FOLLOW_13_in_ruleInput177); 

                                    newLeafNode(lv_task_3_1, grammarAccess.getInputAccess().getTaskFindKeyword_3_0_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInputRule());
                            	        }
                                   		setWithLastConsumed(current, "task", lv_task_3_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:121:8: lv_task_3_2= 'Count'
                            {
                            lv_task_3_2=(Token)match(input,14,FOLLOW_14_in_ruleInput206); 

                                    newLeafNode(lv_task_3_2, grammarAccess.getInputAccess().getTaskCountKeyword_3_0_0_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInputRule());
                            	        }
                                   		setWithLastConsumed(current, "task", lv_task_3_2, null);
                            	    

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
                     
                    	        newCompositeNode(grammarAccess.getInputAccess().getGoalProblemParserRuleCall_3_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProblem_in_ruleInput243);
                    lv_goal_4_0=ruleProblem();

                    state._fsp--;


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
                    lv_task_5_0=(Token)match(input,15,FOLLOW_15_in_ruleInput269); 

                            newLeafNode(lv_task_5_0, grammarAccess.getInputAccess().getTaskTestKeyword_3_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputRule());
                    	        }
                           		setWithLastConsumed(current, "task", lv_task_5_0, "Test");
                    	    

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
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA2_0==23||LA2_0==25||(LA2_0>=27 && LA2_0<=29)||(LA2_0>=31 && LA2_0<=32)) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:173:3: lv_goal_6_1= ruleProblem
                            {
                             
                            	        newCompositeNode(grammarAccess.getInputAccess().getGoalProblemParserRuleCall_3_1_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleProblem_in_ruleInput305);
                            lv_goal_6_1=ruleProblem();

                            state._fsp--;


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
                            break;
                        case 2 :
                            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:188:8: lv_goal_6_2= ruleProblemNoVars
                            {
                             
                            	        newCompositeNode(grammarAccess.getInputAccess().getGoalProblemNoVarsParserRuleCall_3_1_1_0_1()); 
                            	    
                            pushFollow(FOLLOW_ruleProblemNoVars_in_ruleInput324);
                            lv_goal_6_2=ruleProblemNoVars();

                            state._fsp--;


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
                    otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruleInput343); 

                        	newLeafNode(otherlv_7, grammarAccess.getInputAccess().getSemicolonKeyword_4_0());
                        
                    otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleInput355); 

                        	newLeafNode(otherlv_8, grammarAccess.getInputAccess().getTheoremsKeyword_4_1());
                        
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:214:1: ( (lv_theorems_9_0= ruleTheorem ) )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:215:1: (lv_theorems_9_0= ruleTheorem )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:215:1: (lv_theorems_9_0= ruleTheorem )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:216:3: lv_theorems_9_0= ruleTheorem
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputAccess().getTheoremsTheoremParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTheorem_in_ruleInput376);
                    lv_theorems_9_0=ruleTheorem();

                    state._fsp--;


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
                    	    otherlv_10=(Token)match(input,12,FOLLOW_12_in_ruleInput389); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getInputAccess().getSemicolonKeyword_4_3_0());
                    	        
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:236:1: ( (lv_theorems_11_0= ruleTheorem ) )
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:237:1: (lv_theorems_11_0= ruleTheorem )
                    	    {
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:237:1: (lv_theorems_11_0= ruleTheorem )
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:238:3: lv_theorems_11_0= ruleTheorem
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInputAccess().getTheoremsTheoremParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTheorem_in_ruleInput410);
                    	    lv_theorems_11_0=ruleTheorem();

                    	    state._fsp--;


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
                            otherlv_12=(Token)match(input,12,FOLLOW_12_in_ruleInput425); 

                                	newLeafNode(otherlv_12, grammarAccess.getInputAccess().getSemicolonKeyword_4_4());
                                

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
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
             newCompositeNode(grammarAccess.getProblemNoVarsRule()); 
            pushFollow(FOLLOW_ruleProblemNoVars_in_entryRuleProblemNoVars465);
            iv_ruleProblemNoVars=ruleProblemNoVars();

            state._fsp--;

             current =iv_ruleProblemNoVars; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProblemNoVars475); 

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
             
            	        newCompositeNode(grammarAccess.getProblemNoVarsAccess().getPropertyORingParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleORing_in_ruleProblemNoVars520);
            lv_property_0_0=ruleORing();

            state._fsp--;


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

             leaveRule(); 
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
             newCompositeNode(grammarAccess.getProblemPropertyOptionalRule()); 
            pushFollow(FOLLOW_ruleProblemPropertyOptional_in_entryRuleProblemPropertyOptional555);
            iv_ruleProblemPropertyOptional=ruleProblemPropertyOptional();

            state._fsp--;

             current =iv_ruleProblemPropertyOptional; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProblemPropertyOptional565); 

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
             
            	        newCompositeNode(grammarAccess.getProblemPropertyOptionalAccess().getVarsDeclarationParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDeclaration_in_ruleProblemPropertyOptional611);
            lv_vars_0_0=ruleDeclaration();

            state._fsp--;


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
            	    otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleProblemPropertyOptional624); 

            	        	newLeafNode(otherlv_1, grammarAccess.getProblemPropertyOptionalAccess().getCommaKeyword_1_0());
            	        
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:340:1: ( (lv_vars_2_0= ruleDeclaration ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:341:1: (lv_vars_2_0= ruleDeclaration )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:341:1: (lv_vars_2_0= ruleDeclaration )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:342:3: lv_vars_2_0= ruleDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProblemPropertyOptionalAccess().getVarsDeclarationParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleProblemPropertyOptional645);
            	    lv_vars_2_0=ruleDeclaration();

            	    state._fsp--;


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
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleProblemPropertyOptional660); 

                        	newLeafNode(otherlv_3, grammarAccess.getProblemPropertyOptionalAccess().getStKeyword_2_0());
                        
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:362:1: ( (lv_property_4_0= ruleORing ) )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:363:1: (lv_property_4_0= ruleORing )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:363:1: (lv_property_4_0= ruleORing )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:364:3: lv_property_4_0= ruleORing
                    {
                     
                    	        newCompositeNode(grammarAccess.getProblemPropertyOptionalAccess().getPropertyORingParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleORing_in_ruleProblemPropertyOptional681);
                    lv_property_4_0=ruleORing();

                    state._fsp--;


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
                    break;

            }


            }


            }

             leaveRule(); 
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
             newCompositeNode(grammarAccess.getProblemRule()); 
            pushFollow(FOLLOW_ruleProblem_in_entryRuleProblem719);
            iv_ruleProblem=ruleProblem();

            state._fsp--;

             current =iv_ruleProblem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProblem729); 

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
             
            	        newCompositeNode(grammarAccess.getProblemAccess().getVarsDeclarationParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDeclaration_in_ruleProblem775);
            lv_vars_0_0=ruleDeclaration();

            state._fsp--;


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
            	    otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleProblem788); 

            	        	newLeafNode(otherlv_1, grammarAccess.getProblemAccess().getCommaKeyword_1_0());
            	        
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:423:1: ( (lv_vars_2_0= ruleDeclaration ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:424:1: (lv_vars_2_0= ruleDeclaration )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:424:1: (lv_vars_2_0= ruleDeclaration )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:425:3: lv_vars_2_0= ruleDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProblemAccess().getVarsDeclarationParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleProblem809);
            	    lv_vars_2_0=ruleDeclaration();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleProblem823); 

                	newLeafNode(otherlv_3, grammarAccess.getProblemAccess().getStKeyword_2());
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:445:1: ( (lv_property_4_0= ruleORing ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:446:1: (lv_property_4_0= ruleORing )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:446:1: (lv_property_4_0= ruleORing )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:447:3: lv_property_4_0= ruleORing
            {
             
            	        newCompositeNode(grammarAccess.getProblemAccess().getPropertyORingParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleORing_in_ruleProblem844);
            lv_property_4_0=ruleORing();

            state._fsp--;


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

             leaveRule(); 
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
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration880);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration890); 

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
                     
                    	        newCompositeNode(grammarAccess.getDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleDeclaration936);
                    lv_type_0_0=ruleType();

                    state._fsp--;


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
                    break;

            }

            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:502:3: ( (lv_varName_1_0= RULE_ID ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:503:1: (lv_varName_1_0= RULE_ID )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:503:1: (lv_varName_1_0= RULE_ID )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:504:3: lv_varName_1_0= RULE_ID
            {
            lv_varName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeclaration954); 

            			newLeafNode(lv_varName_1_0, grammarAccess.getDeclarationAccess().getVarNameIDTerminalRuleCall_1_0()); 
            		

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

             leaveRule(); 
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
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType995);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1005); 

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
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleType1047); 

            			newLeafNode(lv_name_0_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_0_0()); 
            		

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
                    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleType1065); 

                        	newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getLessThanSignKeyword_1_0());
                        
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:563:1: ( (lv_templateType_2_0= ruleType ) )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:564:1: (lv_templateType_2_0= ruleType )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:564:1: (lv_templateType_2_0= ruleType )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:565:3: lv_templateType_2_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getTemplateTypeTypeParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleType1086);
                    lv_templateType_2_0=ruleType();

                    state._fsp--;


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

                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleType1098); 

                        	newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getGreaterThanSignKeyword_1_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
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
             newCompositeNode(grammarAccess.getORingRule()); 
            pushFollow(FOLLOW_ruleORing_in_entryRuleORing1136);
            iv_ruleORing=ruleORing();

            state._fsp--;

             current =iv_ruleORing; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleORing1146); 

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
             
                    newCompositeNode(grammarAccess.getORingAccess().getANDingParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleANDing_in_ruleORing1193);
            this_ANDing_0=ruleANDing();

            state._fsp--;

             
                    current = this_ANDing_0; 
                    afterParserOrEnumRuleCall();
                
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

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getORingAccess().getORingLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleORing1214); 

            	        	newLeafNode(otherlv_2, grammarAccess.getORingAccess().getVerticalLineKeyword_1_1());
            	        
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:625:1: ( (lv_right_3_0= ruleANDing ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:626:1: (lv_right_3_0= ruleANDing )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:626:1: (lv_right_3_0= ruleANDing )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:627:3: lv_right_3_0= ruleANDing
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getORingAccess().getRightANDingParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleANDing_in_ruleORing1235);
            	    lv_right_3_0=ruleANDing();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
             newCompositeNode(grammarAccess.getANDingRule()); 
            pushFollow(FOLLOW_ruleANDing_in_entryRuleANDing1273);
            iv_ruleANDing=ruleANDing();

            state._fsp--;

             current =iv_ruleANDing; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleANDing1283); 

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
             
                    newCompositeNode(grammarAccess.getANDingAccess().getPrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimary_in_ruleANDing1330);
            this_Primary_0=rulePrimary();

            state._fsp--;

             
                    current = this_Primary_0; 
                    afterParserOrEnumRuleCall();
                
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

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getANDingAccess().getANDingLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleANDing1351); 

            	        	newLeafNode(otherlv_2, grammarAccess.getANDingAccess().getAmpersandKeyword_1_1());
            	        
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:683:1: ( (lv_right_3_0= rulePrimary ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:684:1: (lv_right_3_0= rulePrimary )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:684:1: (lv_right_3_0= rulePrimary )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:685:3: lv_right_3_0= rulePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getANDingAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimary_in_ruleANDing1372);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary1410);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary1420); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:718:1: rulePrimary returns [EObject current=null] : (this_Atomic_0= ruleAtomic | this_Quantifier_1= ruleQuantifier | this_ProblemShell_2= ruleProblemShell | (otherlv_3= '(' this_ORing_4= ruleORing otherlv_5= ')' ) | this_BooleanLiteral_6= ruleBooleanLiteral | this_Negation_7= ruleNegation ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_Atomic_0 = null;

        EObject this_Quantifier_1 = null;

        EObject this_ProblemShell_2 = null;

        EObject this_ORing_4 = null;

        EObject this_BooleanLiteral_6 = null;

        EObject this_Negation_7 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:721:28: ( (this_Atomic_0= ruleAtomic | this_Quantifier_1= ruleQuantifier | this_ProblemShell_2= ruleProblemShell | (otherlv_3= '(' this_ORing_4= ruleORing otherlv_5= ')' ) | this_BooleanLiteral_6= ruleBooleanLiteral | this_Negation_7= ruleNegation ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:722:1: (this_Atomic_0= ruleAtomic | this_Quantifier_1= ruleQuantifier | this_ProblemShell_2= ruleProblemShell | (otherlv_3= '(' this_ORing_4= ruleORing otherlv_5= ')' ) | this_BooleanLiteral_6= ruleBooleanLiteral | this_Negation_7= ruleNegation )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:722:1: (this_Atomic_0= ruleAtomic | this_Quantifier_1= ruleQuantifier | this_ProblemShell_2= ruleProblemShell | (otherlv_3= '(' this_ORing_4= ruleORing otherlv_5= ')' ) | this_BooleanLiteral_6= ruleBooleanLiteral | this_Negation_7= ruleNegation )
            int alt14=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt14=1;
                }
                break;
            case 28:
            case 29:
                {
                alt14=2;
                }
                break;
            case 25:
                {
                alt14=3;
                }
                break;
            case 23:
                {
                alt14=4;
                }
                break;
            case 31:
            case 32:
                {
                alt14=5;
                }
                break;
            case 27:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:723:5: this_Atomic_0= ruleAtomic
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAtomic_in_rulePrimary1467);
                    this_Atomic_0=ruleAtomic();

                    state._fsp--;

                     
                            current = this_Atomic_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:733:5: this_Quantifier_1= ruleQuantifier
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getQuantifierParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleQuantifier_in_rulePrimary1494);
                    this_Quantifier_1=ruleQuantifier();

                    state._fsp--;

                     
                            current = this_Quantifier_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:743:5: this_ProblemShell_2= ruleProblemShell
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getProblemShellParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleProblemShell_in_rulePrimary1521);
                    this_ProblemShell_2=ruleProblemShell();

                    state._fsp--;

                     
                            current = this_ProblemShell_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:752:6: (otherlv_3= '(' this_ORing_4= ruleORing otherlv_5= ')' )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:752:6: (otherlv_3= '(' this_ORing_4= ruleORing otherlv_5= ')' )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:752:8: otherlv_3= '(' this_ORing_4= ruleORing otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_rulePrimary1539); 

                        	newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getORingParserRuleCall_3_1()); 
                        
                    pushFollow(FOLLOW_ruleORing_in_rulePrimary1561);
                    this_ORing_4=ruleORing();

                    state._fsp--;

                     
                            current = this_ORing_4; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_5=(Token)match(input,24,FOLLOW_24_in_rulePrimary1572); 

                        	newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_2());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:771:5: this_BooleanLiteral_6= ruleBooleanLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getBooleanLiteralParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_rulePrimary1601);
                    this_BooleanLiteral_6=ruleBooleanLiteral();

                    state._fsp--;

                     
                            current = this_BooleanLiteral_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:781:5: this_Negation_7= ruleNegation
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getNegationParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleNegation_in_rulePrimary1628);
                    this_Negation_7=ruleNegation();

                    state._fsp--;

                     
                            current = this_Negation_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:797:1: entryRuleProblemShell returns [EObject current=null] : iv_ruleProblemShell= ruleProblemShell EOF ;
    public final EObject entryRuleProblemShell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProblemShell = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:798:2: (iv_ruleProblemShell= ruleProblemShell EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:799:2: iv_ruleProblemShell= ruleProblemShell EOF
            {
             newCompositeNode(grammarAccess.getProblemShellRule()); 
            pushFollow(FOLLOW_ruleProblemShell_in_entryRuleProblemShell1663);
            iv_ruleProblemShell=ruleProblemShell();

            state._fsp--;

             current =iv_ruleProblemShell; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProblemShell1673); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:806:1: ruleProblemShell returns [EObject current=null] : (otherlv_0= '{' ( (lv_problem_1_0= ruleProblem ) ) otherlv_2= '}' ) ;
    public final EObject ruleProblemShell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_problem_1_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:809:28: ( (otherlv_0= '{' ( (lv_problem_1_0= ruleProblem ) ) otherlv_2= '}' ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:810:1: (otherlv_0= '{' ( (lv_problem_1_0= ruleProblem ) ) otherlv_2= '}' )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:810:1: (otherlv_0= '{' ( (lv_problem_1_0= ruleProblem ) ) otherlv_2= '}' )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:810:3: otherlv_0= '{' ( (lv_problem_1_0= ruleProblem ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleProblemShell1710); 

                	newLeafNode(otherlv_0, grammarAccess.getProblemShellAccess().getLeftCurlyBracketKeyword_0());
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:814:1: ( (lv_problem_1_0= ruleProblem ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:815:1: (lv_problem_1_0= ruleProblem )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:815:1: (lv_problem_1_0= ruleProblem )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:816:3: lv_problem_1_0= ruleProblem
            {
             
            	        newCompositeNode(grammarAccess.getProblemShellAccess().getProblemProblemParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleProblem_in_ruleProblemShell1731);
            lv_problem_1_0=ruleProblem();

            state._fsp--;


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

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleProblemShell1743); 

                	newLeafNode(otherlv_2, grammarAccess.getProblemShellAccess().getRightCurlyBracketKeyword_2());
                

            }


            }

             leaveRule(); 
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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:844:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:845:2: (iv_ruleNegation= ruleNegation EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:846:2: iv_ruleNegation= ruleNegation EOF
            {
             newCompositeNode(grammarAccess.getNegationRule()); 
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation1779);
            iv_ruleNegation=ruleNegation();

            state._fsp--;

             current =iv_ruleNegation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation1789); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:853:1: ruleNegation returns [EObject current=null] : (otherlv_0= '!' ( (lv_negated_1_0= rulePrimary ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_negated_1_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:856:28: ( (otherlv_0= '!' ( (lv_negated_1_0= rulePrimary ) ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:857:1: (otherlv_0= '!' ( (lv_negated_1_0= rulePrimary ) ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:857:1: (otherlv_0= '!' ( (lv_negated_1_0= rulePrimary ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:857:3: otherlv_0= '!' ( (lv_negated_1_0= rulePrimary ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleNegation1826); 

                	newLeafNode(otherlv_0, grammarAccess.getNegationAccess().getExclamationMarkKeyword_0());
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:861:1: ( (lv_negated_1_0= rulePrimary ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:862:1: (lv_negated_1_0= rulePrimary )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:862:1: (lv_negated_1_0= rulePrimary )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:863:3: lv_negated_1_0= rulePrimary
            {
             
            	        newCompositeNode(grammarAccess.getNegationAccess().getNegatedPrimaryParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePrimary_in_ruleNegation1847);
            lv_negated_1_0=rulePrimary();

            state._fsp--;


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

             leaveRule(); 
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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:887:1: entryRuleQuantifier returns [EObject current=null] : iv_ruleQuantifier= ruleQuantifier EOF ;
    public final EObject entryRuleQuantifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifier = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:888:2: (iv_ruleQuantifier= ruleQuantifier EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:889:2: iv_ruleQuantifier= ruleQuantifier EOF
            {
             newCompositeNode(grammarAccess.getQuantifierRule()); 
            pushFollow(FOLLOW_ruleQuantifier_in_entryRuleQuantifier1883);
            iv_ruleQuantifier=ruleQuantifier();

            state._fsp--;

             current =iv_ruleQuantifier; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantifier1893); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:896:1: ruleQuantifier returns [EObject current=null] : ( ( ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) ) ) otherlv_1= '(' ( (lv_subject_2_0= ruleProblem ) ) otherlv_3= ':' ( (lv_predicate_4_0= ruleORing ) ) otherlv_5= ')' ) ;
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
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:899:28: ( ( ( ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) ) ) otherlv_1= '(' ( (lv_subject_2_0= ruleProblem ) ) otherlv_3= ':' ( (lv_predicate_4_0= ruleORing ) ) otherlv_5= ')' ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:900:1: ( ( ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) ) ) otherlv_1= '(' ( (lv_subject_2_0= ruleProblem ) ) otherlv_3= ':' ( (lv_predicate_4_0= ruleORing ) ) otherlv_5= ')' )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:900:1: ( ( ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) ) ) otherlv_1= '(' ( (lv_subject_2_0= ruleProblem ) ) otherlv_3= ':' ( (lv_predicate_4_0= ruleORing ) ) otherlv_5= ')' )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:900:2: ( ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) ) ) otherlv_1= '(' ( (lv_subject_2_0= ruleProblem ) ) otherlv_3= ':' ( (lv_predicate_4_0= ruleORing ) ) otherlv_5= ')'
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:900:2: ( ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:901:1: ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:901:1: ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:902:1: (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:902:1: (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            else if ( (LA15_0==29) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:903:3: lv_quantifier_0_1= 'forall'
                    {
                    lv_quantifier_0_1=(Token)match(input,28,FOLLOW_28_in_ruleQuantifier1938); 

                            newLeafNode(lv_quantifier_0_1, grammarAccess.getQuantifierAccess().getQuantifierForallKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuantifierRule());
                    	        }
                           		setWithLastConsumed(current, "quantifier", lv_quantifier_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:915:8: lv_quantifier_0_2= 'exists'
                    {
                    lv_quantifier_0_2=(Token)match(input,29,FOLLOW_29_in_ruleQuantifier1967); 

                            newLeafNode(lv_quantifier_0_2, grammarAccess.getQuantifierAccess().getQuantifierExistsKeyword_0_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuantifierRule());
                    	        }
                           		setWithLastConsumed(current, "quantifier", lv_quantifier_0_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleQuantifier1995); 

                	newLeafNode(otherlv_1, grammarAccess.getQuantifierAccess().getLeftParenthesisKeyword_1());
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:934:1: ( (lv_subject_2_0= ruleProblem ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:935:1: (lv_subject_2_0= ruleProblem )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:935:1: (lv_subject_2_0= ruleProblem )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:936:3: lv_subject_2_0= ruleProblem
            {
             
            	        newCompositeNode(grammarAccess.getQuantifierAccess().getSubjectProblemParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleProblem_in_ruleQuantifier2016);
            lv_subject_2_0=ruleProblem();

            state._fsp--;


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

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleQuantifier2028); 

                	newLeafNode(otherlv_3, grammarAccess.getQuantifierAccess().getColonKeyword_3());
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:956:1: ( (lv_predicate_4_0= ruleORing ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:957:1: (lv_predicate_4_0= ruleORing )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:957:1: (lv_predicate_4_0= ruleORing )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:958:3: lv_predicate_4_0= ruleORing
            {
             
            	        newCompositeNode(grammarAccess.getQuantifierAccess().getPredicateORingParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleORing_in_ruleQuantifier2049);
            lv_predicate_4_0=ruleORing();

            state._fsp--;


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

            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleQuantifier2061); 

                	newLeafNode(otherlv_5, grammarAccess.getQuantifierAccess().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleAtomic"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:986:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:987:2: (iv_ruleAtomic= ruleAtomic EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:988:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic2097);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic2107); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:995:1: ruleAtomic returns [EObject current=null] : ( ( (lv_Function_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleArgument ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleArgument ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_Function_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_args_2_0 = null;

        EObject lv_args_4_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:998:28: ( ( ( (lv_Function_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleArgument ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleArgument ) ) )* )? otherlv_5= ')' ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:999:1: ( ( (lv_Function_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleArgument ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleArgument ) ) )* )? otherlv_5= ')' )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:999:1: ( ( (lv_Function_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleArgument ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleArgument ) ) )* )? otherlv_5= ')' )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:999:2: ( (lv_Function_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleArgument ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleArgument ) ) )* )? otherlv_5= ')'
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:999:2: ( (lv_Function_0_0= RULE_ID ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1000:1: (lv_Function_0_0= RULE_ID )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1000:1: (lv_Function_0_0= RULE_ID )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1001:3: lv_Function_0_0= RULE_ID
            {
            lv_Function_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomic2149); 

            			newLeafNode(lv_Function_0_0, grammarAccess.getAtomicAccess().getFunctionIDTerminalRuleCall_0_0()); 
            		

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

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleAtomic2166); 

                	newLeafNode(otherlv_1, grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_1());
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1021:1: ( ( (lv_args_2_0= ruleArgument ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleArgument ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_INT)||LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1021:2: ( (lv_args_2_0= ruleArgument ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleArgument ) ) )*
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1021:2: ( (lv_args_2_0= ruleArgument ) )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1022:1: (lv_args_2_0= ruleArgument )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1022:1: (lv_args_2_0= ruleArgument )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1023:3: lv_args_2_0= ruleArgument
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicAccess().getArgsArgumentParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArgument_in_ruleAtomic2188);
                    lv_args_2_0=ruleArgument();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtomicRule());
                    	        }
                           		add(
                           			current, 
                           			"args",
                            		lv_args_2_0, 
                            		"Argument");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1039:2: (otherlv_3= ',' ( (lv_args_4_0= ruleArgument ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==17) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1039:4: otherlv_3= ',' ( (lv_args_4_0= ruleArgument ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleAtomic2201); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getAtomicAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1043:1: ( (lv_args_4_0= ruleArgument ) )
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1044:1: (lv_args_4_0= ruleArgument )
                    	    {
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1044:1: (lv_args_4_0= ruleArgument )
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1045:3: lv_args_4_0= ruleArgument
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAtomicAccess().getArgsArgumentParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleArgument_in_ruleAtomic2222);
                    	    lv_args_4_0=ruleArgument();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAtomicRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"args",
                    	            		lv_args_4_0, 
                    	            		"Argument");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

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

            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleAtomic2238); 

                	newLeafNode(otherlv_5, grammarAccess.getAtomicAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleArgument"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1073:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1074:2: (iv_ruleArgument= ruleArgument EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1075:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument2274);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument2284); 

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
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1082:1: ruleArgument returns [EObject current=null] : this_Addition_0= ruleAddition ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1085:28: (this_Addition_0= ruleAddition )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1087:5: this_Addition_0= ruleAddition
            {
             
                    newCompositeNode(grammarAccess.getArgumentAccess().getAdditionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleAddition_in_ruleArgument2330);
            this_Addition_0=ruleAddition();

            state._fsp--;

             
                    current = this_Addition_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleVariable"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1103:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1104:2: (iv_ruleVariable= ruleVariable EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1105:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable2364);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable2374); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1112:1: ruleVariable returns [EObject current=null] : ( (lv_arg_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_arg_0_0=null;

         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1115:28: ( ( (lv_arg_0_0= RULE_ID ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1116:1: ( (lv_arg_0_0= RULE_ID ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1116:1: ( (lv_arg_0_0= RULE_ID ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1117:1: (lv_arg_0_0= RULE_ID )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1117:1: (lv_arg_0_0= RULE_ID )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1118:3: lv_arg_0_0= RULE_ID
            {
            lv_arg_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable2415); 

            			newLeafNode(lv_arg_0_0, grammarAccess.getVariableAccess().getArgIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"arg",
                    		lv_arg_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1142:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1143:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1144:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral2455);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral2465); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1151:1: ruleBooleanLiteral returns [EObject current=null] : ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;

         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1154:28: ( ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1155:1: ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1155:1: ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1156:1: ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1156:1: ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1157:1: (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1157:1: (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            else if ( (LA18_0==32) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1158:3: lv_value_0_1= 'TRUE'
                    {
                    lv_value_0_1=(Token)match(input,31,FOLLOW_31_in_ruleBooleanLiteral2509); 

                            newLeafNode(lv_value_0_1, grammarAccess.getBooleanLiteralAccess().getValueTRUEKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1170:8: lv_value_0_2= 'FALSE'
                    {
                    lv_value_0_2=(Token)match(input,32,FOLLOW_32_in_ruleBooleanLiteral2538); 

                            newLeafNode(lv_value_0_2, grammarAccess.getBooleanLiteralAccess().getValueFALSEKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_2, null);
                    	    

                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1193:1: entryRuleTheorem returns [EObject current=null] : iv_ruleTheorem= ruleTheorem EOF ;
    public final EObject entryRuleTheorem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheorem = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1194:2: (iv_ruleTheorem= ruleTheorem EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1195:2: iv_ruleTheorem= ruleTheorem EOF
            {
             newCompositeNode(grammarAccess.getTheoremRule()); 
            pushFollow(FOLLOW_ruleTheorem_in_entryRuleTheorem2589);
            iv_ruleTheorem=ruleTheorem();

            state._fsp--;

             current =iv_ruleTheorem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTheorem2599); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1202:1: ruleTheorem returns [EObject current=null] : ( ( (lv_Requirement_0_0= ruleORing ) ) ( ( (lv_Implication_1_1= '->' | lv_Implication_1_2= '<-' | lv_Implication_1_3= '<->' ) ) ) ( (lv_Result_2_0= ruleORing ) ) otherlv_3= ',' ( (lv_Cost_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_Description_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_PseudoCode_8_0= RULE_STRING ) ) )? ) ;
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
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1205:28: ( ( ( (lv_Requirement_0_0= ruleORing ) ) ( ( (lv_Implication_1_1= '->' | lv_Implication_1_2= '<-' | lv_Implication_1_3= '<->' ) ) ) ( (lv_Result_2_0= ruleORing ) ) otherlv_3= ',' ( (lv_Cost_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_Description_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_PseudoCode_8_0= RULE_STRING ) ) )? ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1206:1: ( ( (lv_Requirement_0_0= ruleORing ) ) ( ( (lv_Implication_1_1= '->' | lv_Implication_1_2= '<-' | lv_Implication_1_3= '<->' ) ) ) ( (lv_Result_2_0= ruleORing ) ) otherlv_3= ',' ( (lv_Cost_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_Description_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_PseudoCode_8_0= RULE_STRING ) ) )? )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1206:1: ( ( (lv_Requirement_0_0= ruleORing ) ) ( ( (lv_Implication_1_1= '->' | lv_Implication_1_2= '<-' | lv_Implication_1_3= '<->' ) ) ) ( (lv_Result_2_0= ruleORing ) ) otherlv_3= ',' ( (lv_Cost_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_Description_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_PseudoCode_8_0= RULE_STRING ) ) )? )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1206:2: ( (lv_Requirement_0_0= ruleORing ) ) ( ( (lv_Implication_1_1= '->' | lv_Implication_1_2= '<-' | lv_Implication_1_3= '<->' ) ) ) ( (lv_Result_2_0= ruleORing ) ) otherlv_3= ',' ( (lv_Cost_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_Description_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_PseudoCode_8_0= RULE_STRING ) ) )?
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1206:2: ( (lv_Requirement_0_0= ruleORing ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1207:1: (lv_Requirement_0_0= ruleORing )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1207:1: (lv_Requirement_0_0= ruleORing )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1208:3: lv_Requirement_0_0= ruleORing
            {
             
            	        newCompositeNode(grammarAccess.getTheoremAccess().getRequirementORingParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleORing_in_ruleTheorem2645);
            lv_Requirement_0_0=ruleORing();

            state._fsp--;


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

            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1224:2: ( ( (lv_Implication_1_1= '->' | lv_Implication_1_2= '<-' | lv_Implication_1_3= '<->' ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1225:1: ( (lv_Implication_1_1= '->' | lv_Implication_1_2= '<-' | lv_Implication_1_3= '<->' ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1225:1: ( (lv_Implication_1_1= '->' | lv_Implication_1_2= '<-' | lv_Implication_1_3= '<->' ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1226:1: (lv_Implication_1_1= '->' | lv_Implication_1_2= '<-' | lv_Implication_1_3= '<->' )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1226:1: (lv_Implication_1_1= '->' | lv_Implication_1_2= '<-' | lv_Implication_1_3= '<->' )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt19=1;
                }
                break;
            case 34:
                {
                alt19=2;
                }
                break;
            case 35:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1227:3: lv_Implication_1_1= '->'
                    {
                    lv_Implication_1_1=(Token)match(input,33,FOLLOW_33_in_ruleTheorem2665); 

                            newLeafNode(lv_Implication_1_1, grammarAccess.getTheoremAccess().getImplicationHyphenMinusGreaterThanSignKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTheoremRule());
                    	        }
                           		setWithLastConsumed(current, "Implication", lv_Implication_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1239:8: lv_Implication_1_2= '<-'
                    {
                    lv_Implication_1_2=(Token)match(input,34,FOLLOW_34_in_ruleTheorem2694); 

                            newLeafNode(lv_Implication_1_2, grammarAccess.getTheoremAccess().getImplicationLessThanSignHyphenMinusKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTheoremRule());
                    	        }
                           		setWithLastConsumed(current, "Implication", lv_Implication_1_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1251:8: lv_Implication_1_3= '<->'
                    {
                    lv_Implication_1_3=(Token)match(input,35,FOLLOW_35_in_ruleTheorem2723); 

                            newLeafNode(lv_Implication_1_3, grammarAccess.getTheoremAccess().getImplicationLessThanSignHyphenMinusGreaterThanSignKeyword_1_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTheoremRule());
                    	        }
                           		setWithLastConsumed(current, "Implication", lv_Implication_1_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1266:2: ( (lv_Result_2_0= ruleORing ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1267:1: (lv_Result_2_0= ruleORing )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1267:1: (lv_Result_2_0= ruleORing )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1268:3: lv_Result_2_0= ruleORing
            {
             
            	        newCompositeNode(grammarAccess.getTheoremAccess().getResultORingParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleORing_in_ruleTheorem2760);
            lv_Result_2_0=ruleORing();

            state._fsp--;


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

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleTheorem2772); 

                	newLeafNode(otherlv_3, grammarAccess.getTheoremAccess().getCommaKeyword_3());
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1288:1: ( (lv_Cost_4_0= RULE_INT ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1289:1: (lv_Cost_4_0= RULE_INT )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1289:1: (lv_Cost_4_0= RULE_INT )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1290:3: lv_Cost_4_0= RULE_INT
            {
            lv_Cost_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTheorem2789); 

            			newLeafNode(lv_Cost_4_0, grammarAccess.getTheoremAccess().getCostINTTerminalRuleCall_4_0()); 
            		

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

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleTheorem2806); 

                	newLeafNode(otherlv_5, grammarAccess.getTheoremAccess().getCommaKeyword_5());
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1310:1: ( (lv_Description_6_0= RULE_STRING ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1311:1: (lv_Description_6_0= RULE_STRING )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1311:1: (lv_Description_6_0= RULE_STRING )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1312:3: lv_Description_6_0= RULE_STRING
            {
            lv_Description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTheorem2823); 

            			newLeafNode(lv_Description_6_0, grammarAccess.getTheoremAccess().getDescriptionSTRINGTerminalRuleCall_6_0()); 
            		

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

            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1328:2: (otherlv_7= ',' ( (lv_PseudoCode_8_0= RULE_STRING ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==17) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1328:4: otherlv_7= ',' ( (lv_PseudoCode_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleTheorem2841); 

                        	newLeafNode(otherlv_7, grammarAccess.getTheoremAccess().getCommaKeyword_7_0());
                        
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1332:1: ( (lv_PseudoCode_8_0= RULE_STRING ) )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1333:1: (lv_PseudoCode_8_0= RULE_STRING )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1333:1: (lv_PseudoCode_8_0= RULE_STRING )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1334:3: lv_PseudoCode_8_0= RULE_STRING
                    {
                    lv_PseudoCode_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTheorem2858); 

                    			newLeafNode(lv_PseudoCode_8_0, grammarAccess.getTheoremAccess().getPseudoCodeSTRINGTerminalRuleCall_7_1_0()); 
                    		

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
                    break;

            }


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleAddition"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1358:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1359:2: (iv_ruleAddition= ruleAddition EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1360:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition2901);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition2911); 

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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1367:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_2_1=null;
        Token lv_symbol_2_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1370:28: ( (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1371:1: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1371:1: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1372:5: this_Multiplication_0= ruleMultiplication ( () ( ( (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition2958);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;

             
                    current = this_Multiplication_0; 
                    afterParserOrEnumRuleCall();
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1380:1: ( () ( ( (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=36 && LA22_0<=37)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1380:2: () ( ( (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1380:2: ()
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1381:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1386:2: ( ( (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' ) ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1387:1: ( (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' ) )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1387:1: ( (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1388:1: (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1388:1: (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==36) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==37) ) {
            	        alt21=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1389:3: lv_symbol_2_1= '+'
            	            {
            	            lv_symbol_2_1=(Token)match(input,36,FOLLOW_36_in_ruleAddition2987); 

            	                    newLeafNode(lv_symbol_2_1, grammarAccess.getAdditionAccess().getSymbolPlusSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getAdditionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "symbol", lv_symbol_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1401:8: lv_symbol_2_2= '-'
            	            {
            	            lv_symbol_2_2=(Token)match(input,37,FOLLOW_37_in_ruleAddition3016); 

            	                    newLeafNode(lv_symbol_2_2, grammarAccess.getAdditionAccess().getSymbolHyphenMinusKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getAdditionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "symbol", lv_symbol_2_2, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1416:2: ( (lv_right_3_0= ruleMultiplication ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1417:1: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1417:1: (lv_right_3_0= ruleMultiplication )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1418:3: lv_right_3_0= ruleMultiplication
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition3053);
            	    lv_right_3_0=ruleMultiplication();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Multiplication");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1442:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1443:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1444:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication3091);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication3101); 

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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1451:1: ruleMultiplication returns [EObject current=null] : (this_NumericalPrimary_0= ruleNumericalPrimary ( () ( ( (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNumericalPrimary ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_2_1=null;
        Token lv_symbol_2_2=null;
        EObject this_NumericalPrimary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1454:28: ( (this_NumericalPrimary_0= ruleNumericalPrimary ( () ( ( (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNumericalPrimary ) ) )* ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1455:1: (this_NumericalPrimary_0= ruleNumericalPrimary ( () ( ( (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNumericalPrimary ) ) )* )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1455:1: (this_NumericalPrimary_0= ruleNumericalPrimary ( () ( ( (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNumericalPrimary ) ) )* )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1456:5: this_NumericalPrimary_0= ruleNumericalPrimary ( () ( ( (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNumericalPrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultiplicationAccess().getNumericalPrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleNumericalPrimary_in_ruleMultiplication3148);
            this_NumericalPrimary_0=ruleNumericalPrimary();

            state._fsp--;

             
                    current = this_NumericalPrimary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1464:1: ( () ( ( (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNumericalPrimary ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=38 && LA24_0<=39)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1464:2: () ( ( (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNumericalPrimary ) )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1464:2: ()
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1465:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1470:2: ( ( (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' ) ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1471:1: ( (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' ) )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1471:1: ( (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1472:1: (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1472:1: (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==38) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==39) ) {
            	        alt23=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1473:3: lv_symbol_2_1= '*'
            	            {
            	            lv_symbol_2_1=(Token)match(input,38,FOLLOW_38_in_ruleMultiplication3177); 

            	                    newLeafNode(lv_symbol_2_1, grammarAccess.getMultiplicationAccess().getSymbolAsteriskKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMultiplicationRule());
            	            	        }
            	                   		setWithLastConsumed(current, "symbol", lv_symbol_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1485:8: lv_symbol_2_2= '/'
            	            {
            	            lv_symbol_2_2=(Token)match(input,39,FOLLOW_39_in_ruleMultiplication3206); 

            	                    newLeafNode(lv_symbol_2_2, grammarAccess.getMultiplicationAccess().getSymbolSolidusKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMultiplicationRule());
            	            	        }
            	                   		setWithLastConsumed(current, "symbol", lv_symbol_2_2, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1500:2: ( (lv_right_3_0= ruleNumericalPrimary ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1501:1: (lv_right_3_0= ruleNumericalPrimary )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1501:1: (lv_right_3_0= ruleNumericalPrimary )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1502:3: lv_right_3_0= ruleNumericalPrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightNumericalPrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNumericalPrimary_in_ruleMultiplication3243);
            	    lv_right_3_0=ruleNumericalPrimary();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"NumericalPrimary");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleNumericalPrimary"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1526:1: entryRuleNumericalPrimary returns [EObject current=null] : iv_ruleNumericalPrimary= ruleNumericalPrimary EOF ;
    public final EObject entryRuleNumericalPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalPrimary = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1527:2: (iv_ruleNumericalPrimary= ruleNumericalPrimary EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1528:2: iv_ruleNumericalPrimary= ruleNumericalPrimary EOF
            {
             newCompositeNode(grammarAccess.getNumericalPrimaryRule()); 
            pushFollow(FOLLOW_ruleNumericalPrimary_in_entryRuleNumericalPrimary3281);
            iv_ruleNumericalPrimary=ruleNumericalPrimary();

            state._fsp--;

             current =iv_ruleNumericalPrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalPrimary3291); 

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
    // $ANTLR end "entryRuleNumericalPrimary"


    // $ANTLR start "ruleNumericalPrimary"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1535:1: ruleNumericalPrimary returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_Atomic_1= ruleAtomic | (otherlv_2= '(' this_NumericalPrimary_3= ruleNumericalPrimary otherlv_4= ')' ) | this_Variable_5= ruleVariable ) ;
    public final EObject ruleNumericalPrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_NumberLiteral_0 = null;

        EObject this_Atomic_1 = null;

        EObject this_NumericalPrimary_3 = null;

        EObject this_Variable_5 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1538:28: ( (this_NumberLiteral_0= ruleNumberLiteral | this_Atomic_1= ruleAtomic | (otherlv_2= '(' this_NumericalPrimary_3= ruleNumericalPrimary otherlv_4= ')' ) | this_Variable_5= ruleVariable ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1539:1: (this_NumberLiteral_0= ruleNumberLiteral | this_Atomic_1= ruleAtomic | (otherlv_2= '(' this_NumericalPrimary_3= ruleNumericalPrimary otherlv_4= ')' ) | this_Variable_5= ruleVariable )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1539:1: (this_NumberLiteral_0= ruleNumberLiteral | this_Atomic_1= ruleAtomic | (otherlv_2= '(' this_NumericalPrimary_3= ruleNumericalPrimary otherlv_4= ')' ) | this_Variable_5= ruleVariable )
            int alt25=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt25=1;
                }
                break;
            case RULE_ID:
                {
                int LA25_2 = input.LA(2);

                if ( (LA25_2==23) ) {
                    alt25=2;
                }
                else if ( (LA25_2==EOF||LA25_2==17||LA25_2==24||(LA25_2>=36 && LA25_2<=39)) ) {
                    alt25=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 2, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1540:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getNumericalPrimaryAccess().getNumberLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleNumericalPrimary3338);
                    this_NumberLiteral_0=ruleNumberLiteral();

                    state._fsp--;

                     
                            current = this_NumberLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1550:5: this_Atomic_1= ruleAtomic
                    {
                     
                            newCompositeNode(grammarAccess.getNumericalPrimaryAccess().getAtomicParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAtomic_in_ruleNumericalPrimary3365);
                    this_Atomic_1=ruleAtomic();

                    state._fsp--;

                     
                            current = this_Atomic_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1559:6: (otherlv_2= '(' this_NumericalPrimary_3= ruleNumericalPrimary otherlv_4= ')' )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1559:6: (otherlv_2= '(' this_NumericalPrimary_3= ruleNumericalPrimary otherlv_4= ')' )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1559:8: otherlv_2= '(' this_NumericalPrimary_3= ruleNumericalPrimary otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleNumericalPrimary3383); 

                        	newLeafNode(otherlv_2, grammarAccess.getNumericalPrimaryAccess().getLeftParenthesisKeyword_2_0());
                        
                     
                            newCompositeNode(grammarAccess.getNumericalPrimaryAccess().getNumericalPrimaryParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleNumericalPrimary_in_ruleNumericalPrimary3405);
                    this_NumericalPrimary_3=ruleNumericalPrimary();

                    state._fsp--;

                     
                            current = this_NumericalPrimary_3; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleNumericalPrimary3416); 

                        	newLeafNode(otherlv_4, grammarAccess.getNumericalPrimaryAccess().getRightParenthesisKeyword_2_2());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1578:5: this_Variable_5= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getNumericalPrimaryAccess().getVariableParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleNumericalPrimary3445);
                    this_Variable_5=ruleVariable();

                    state._fsp--;

                     
                            current = this_Variable_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumericalPrimary"


    // $ANTLR start "entryRuleNumberLiteral"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1594:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1595:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1596:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral3480);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral3490); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1603:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1606:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1607:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1607:1: ( (lv_value_0_0= RULE_INT ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1608:1: (lv_value_0_0= RULE_INT )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1608:1: (lv_value_0_0= RULE_INT )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1609:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumberLiteral3531); 

            			newLeafNode(lv_value_0_0, grammarAccess.getNumberLiteralAccess().getValueINTTerminalRuleCall_0()); 
            		

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

             leaveRule(); 
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

    // Delegated rules


 

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
    public static final BitSet FOLLOW_ruleAtomic_in_rulePrimary1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_rulePrimary1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblemShell_in_rulePrimary1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulePrimary1539 = new BitSet(new long[]{0x00000001BA800010L});
    public static final BitSet FOLLOW_ruleORing_in_rulePrimary1561 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePrimary1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rulePrimary1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_rulePrimary1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblemShell_in_entryRuleProblemShell1663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProblemShell1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleProblemShell1710 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProblem_in_ruleProblemShell1731 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleProblemShell1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation1779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleNegation1826 = new BitSet(new long[]{0x00000001BA800010L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleNegation1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_entryRuleQuantifier1883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantifier1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleQuantifier1938 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_29_in_ruleQuantifier1967 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleQuantifier1995 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProblem_in_ruleQuantifier2016 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleQuantifier2028 = new BitSet(new long[]{0x00000001BA800010L});
    public static final BitSet FOLLOW_ruleORing_in_ruleQuantifier2049 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleQuantifier2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic2097 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomic2149 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAtomic2166 = new BitSet(new long[]{0x0000000001800030L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleAtomic2188 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_17_in_ruleAtomic2201 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleAtomic2222 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_24_in_ruleAtomic2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument2274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleArgument2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable2364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral2455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleBooleanLiteral2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleBooleanLiteral2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTheorem_in_entryRuleTheorem2589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTheorem2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_ruleTheorem2645 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_33_in_ruleTheorem2665 = new BitSet(new long[]{0x00000001BA800010L});
    public static final BitSet FOLLOW_34_in_ruleTheorem2694 = new BitSet(new long[]{0x00000001BA800010L});
    public static final BitSet FOLLOW_35_in_ruleTheorem2723 = new BitSet(new long[]{0x00000001BA800010L});
    public static final BitSet FOLLOW_ruleORing_in_ruleTheorem2760 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTheorem2772 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTheorem2789 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTheorem2806 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTheorem2823 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleTheorem2841 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTheorem2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition2901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition2958 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_36_in_ruleAddition2987 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_37_in_ruleAddition3016 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition3053 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication3091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalPrimary_in_ruleMultiplication3148 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_38_in_ruleMultiplication3177 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_39_in_ruleMultiplication3206 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_ruleNumericalPrimary_in_ruleMultiplication3243 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_ruleNumericalPrimary_in_entryRuleNumericalPrimary3281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalPrimary3291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleNumericalPrimary3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_ruleNumericalPrimary3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleNumericalPrimary3383 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_ruleNumericalPrimary_in_ruleNumericalPrimary3405 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleNumericalPrimary3416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleNumericalPrimary3445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral3480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral3490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumberLiteral3531 = new BitSet(new long[]{0x0000000000000002L});

}