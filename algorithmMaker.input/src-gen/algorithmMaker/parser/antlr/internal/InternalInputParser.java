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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Given'", "';'", "'Find'", "'Count'", "'Theorems:'", "','", "'st'", "'<'", "'>'", "'|'", "'&'", "'('", "')'", "'{'", "'}'", "'!'", "'forall'", "'exists'", "':'", "'TRUE'", "'FALSE'", "'->'", "'<-'", "'<->'", "'+'", "'-'", "'*'", "'/'", "'.'"
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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:76:1: ruleInput returns [EObject current=null] : (otherlv_0= 'Given' ( (lv_given_1_0= ruleProblemPropertyOptional ) ) otherlv_2= ';' ( ( ( (lv_task_3_1= 'Find' | lv_task_3_2= 'Count' ) ) ) ( ( (lv_goal_4_1= ruleProblem | lv_goal_4_2= ruleProblemNoVars ) ) ) )? (otherlv_5= ';' otherlv_6= 'Theorems:' ( (lv_theorems_7_0= ruleTheorem ) ) (otherlv_8= ';' ( (lv_theorems_9_0= ruleTheorem ) ) )* (otherlv_10= ';' )? )? ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_task_3_1=null;
        Token lv_task_3_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_given_1_0 = null;

        EObject lv_goal_4_1 = null;

        EObject lv_goal_4_2 = null;

        EObject lv_theorems_7_0 = null;

        EObject lv_theorems_9_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:79:28: ( (otherlv_0= 'Given' ( (lv_given_1_0= ruleProblemPropertyOptional ) ) otherlv_2= ';' ( ( ( (lv_task_3_1= 'Find' | lv_task_3_2= 'Count' ) ) ) ( ( (lv_goal_4_1= ruleProblem | lv_goal_4_2= ruleProblemNoVars ) ) ) )? (otherlv_5= ';' otherlv_6= 'Theorems:' ( (lv_theorems_7_0= ruleTheorem ) ) (otherlv_8= ';' ( (lv_theorems_9_0= ruleTheorem ) ) )* (otherlv_10= ';' )? )? ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:80:1: (otherlv_0= 'Given' ( (lv_given_1_0= ruleProblemPropertyOptional ) ) otherlv_2= ';' ( ( ( (lv_task_3_1= 'Find' | lv_task_3_2= 'Count' ) ) ) ( ( (lv_goal_4_1= ruleProblem | lv_goal_4_2= ruleProblemNoVars ) ) ) )? (otherlv_5= ';' otherlv_6= 'Theorems:' ( (lv_theorems_7_0= ruleTheorem ) ) (otherlv_8= ';' ( (lv_theorems_9_0= ruleTheorem ) ) )* (otherlv_10= ';' )? )? )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:80:1: (otherlv_0= 'Given' ( (lv_given_1_0= ruleProblemPropertyOptional ) ) otherlv_2= ';' ( ( ( (lv_task_3_1= 'Find' | lv_task_3_2= 'Count' ) ) ) ( ( (lv_goal_4_1= ruleProblem | lv_goal_4_2= ruleProblemNoVars ) ) ) )? (otherlv_5= ';' otherlv_6= 'Theorems:' ( (lv_theorems_7_0= ruleTheorem ) ) (otherlv_8= ';' ( (lv_theorems_9_0= ruleTheorem ) ) )* (otherlv_10= ';' )? )? )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:80:3: otherlv_0= 'Given' ( (lv_given_1_0= ruleProblemPropertyOptional ) ) otherlv_2= ';' ( ( ( (lv_task_3_1= 'Find' | lv_task_3_2= 'Count' ) ) ) ( ( (lv_goal_4_1= ruleProblem | lv_goal_4_2= ruleProblemNoVars ) ) ) )? (otherlv_5= ';' otherlv_6= 'Theorems:' ( (lv_theorems_7_0= ruleTheorem ) ) (otherlv_8= ';' ( (lv_theorems_9_0= ruleTheorem ) ) )* (otherlv_10= ';' )? )?
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
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:106:1: ( ( ( (lv_task_3_1= 'Find' | lv_task_3_2= 'Count' ) ) ) ( ( (lv_goal_4_1= ruleProblem | lv_goal_4_2= ruleProblemNoVars ) ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=13 && LA3_0<=14)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:106:2: ( ( (lv_task_3_1= 'Find' | lv_task_3_2= 'Count' ) ) ) ( ( (lv_goal_4_1= ruleProblem | lv_goal_4_2= ruleProblemNoVars ) ) )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:106:2: ( ( (lv_task_3_1= 'Find' | lv_task_3_2= 'Count' ) ) )
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
                            lv_task_3_1=(Token)match(input,13,FOLLOW_13_in_ruleInput176); 

                                    newLeafNode(lv_task_3_1, grammarAccess.getInputAccess().getTaskFindKeyword_3_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInputRule());
                            	        }
                                   		setWithLastConsumed(current, "task", lv_task_3_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:121:8: lv_task_3_2= 'Count'
                            {
                            lv_task_3_2=(Token)match(input,14,FOLLOW_14_in_ruleInput205); 

                                    newLeafNode(lv_task_3_2, grammarAccess.getInputAccess().getTaskCountKeyword_3_0_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInputRule());
                            	        }
                                   		setWithLastConsumed(current, "task", lv_task_3_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }

                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:136:2: ( ( (lv_goal_4_1= ruleProblem | lv_goal_4_2= ruleProblemNoVars ) ) )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:137:1: ( (lv_goal_4_1= ruleProblem | lv_goal_4_2= ruleProblemNoVars ) )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:137:1: ( (lv_goal_4_1= ruleProblem | lv_goal_4_2= ruleProblemNoVars ) )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:138:1: (lv_goal_4_1= ruleProblem | lv_goal_4_2= ruleProblemNoVars )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:138:1: (lv_goal_4_1= ruleProblem | lv_goal_4_2= ruleProblemNoVars )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==RULE_ID) ) {
                        int LA2_1 = input.LA(2);

                        if ( (LA2_1==RULE_ID||(LA2_1>=16 && LA2_1<=18)) ) {
                            alt2=1;
                        }
                        else if ( (LA2_1==22) ) {
                            alt2=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA2_0==22||LA2_0==24||(LA2_0>=26 && LA2_0<=28)||(LA2_0>=30 && LA2_0<=31)) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:139:3: lv_goal_4_1= ruleProblem
                            {
                             
                            	        newCompositeNode(grammarAccess.getInputAccess().getGoalProblemParserRuleCall_3_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleProblem_in_ruleInput244);
                            lv_goal_4_1=ruleProblem();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getInputRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"goal",
                                    		lv_goal_4_1, 
                                    		"Problem");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;
                        case 2 :
                            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:154:8: lv_goal_4_2= ruleProblemNoVars
                            {
                             
                            	        newCompositeNode(grammarAccess.getInputAccess().getGoalProblemNoVarsParserRuleCall_3_1_0_1()); 
                            	    
                            pushFollow(FOLLOW_ruleProblemNoVars_in_ruleInput263);
                            lv_goal_4_2=ruleProblemNoVars();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getInputRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"goal",
                                    		lv_goal_4_2, 
                                    		"ProblemNoVars");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:172:4: (otherlv_5= ';' otherlv_6= 'Theorems:' ( (lv_theorems_7_0= ruleTheorem ) ) (otherlv_8= ';' ( (lv_theorems_9_0= ruleTheorem ) ) )* (otherlv_10= ';' )? )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:172:6: otherlv_5= ';' otherlv_6= 'Theorems:' ( (lv_theorems_7_0= ruleTheorem ) ) (otherlv_8= ';' ( (lv_theorems_9_0= ruleTheorem ) ) )* (otherlv_10= ';' )?
                    {
                    otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleInput281); 

                        	newLeafNode(otherlv_5, grammarAccess.getInputAccess().getSemicolonKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleInput293); 

                        	newLeafNode(otherlv_6, grammarAccess.getInputAccess().getTheoremsKeyword_4_1());
                        
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:180:1: ( (lv_theorems_7_0= ruleTheorem ) )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:181:1: (lv_theorems_7_0= ruleTheorem )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:181:1: (lv_theorems_7_0= ruleTheorem )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:182:3: lv_theorems_7_0= ruleTheorem
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputAccess().getTheoremsTheoremParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTheorem_in_ruleInput314);
                    lv_theorems_7_0=ruleTheorem();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputRule());
                    	        }
                           		add(
                           			current, 
                           			"theorems",
                            		lv_theorems_7_0, 
                            		"Theorem");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:198:2: (otherlv_8= ';' ( (lv_theorems_9_0= ruleTheorem ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==12) ) {
                            int LA4_1 = input.LA(2);

                            if ( (LA4_1==RULE_ID||LA4_1==22||LA4_1==24||(LA4_1>=26 && LA4_1<=28)||(LA4_1>=30 && LA4_1<=31)) ) {
                                alt4=1;
                            }


                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:198:4: otherlv_8= ';' ( (lv_theorems_9_0= ruleTheorem ) )
                    	    {
                    	    otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleInput327); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getInputAccess().getSemicolonKeyword_4_3_0());
                    	        
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:202:1: ( (lv_theorems_9_0= ruleTheorem ) )
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:203:1: (lv_theorems_9_0= ruleTheorem )
                    	    {
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:203:1: (lv_theorems_9_0= ruleTheorem )
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:204:3: lv_theorems_9_0= ruleTheorem
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInputAccess().getTheoremsTheoremParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTheorem_in_ruleInput348);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:220:4: (otherlv_10= ';' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==12) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:220:6: otherlv_10= ';'
                            {
                            otherlv_10=(Token)match(input,12,FOLLOW_12_in_ruleInput363); 

                                	newLeafNode(otherlv_10, grammarAccess.getInputAccess().getSemicolonKeyword_4_4());
                                

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:232:1: entryRuleProblemNoVars returns [EObject current=null] : iv_ruleProblemNoVars= ruleProblemNoVars EOF ;
    public final EObject entryRuleProblemNoVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProblemNoVars = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:233:2: (iv_ruleProblemNoVars= ruleProblemNoVars EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:234:2: iv_ruleProblemNoVars= ruleProblemNoVars EOF
            {
             newCompositeNode(grammarAccess.getProblemNoVarsRule()); 
            pushFollow(FOLLOW_ruleProblemNoVars_in_entryRuleProblemNoVars403);
            iv_ruleProblemNoVars=ruleProblemNoVars();

            state._fsp--;

             current =iv_ruleProblemNoVars; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProblemNoVars413); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:241:1: ruleProblemNoVars returns [EObject current=null] : ( (lv_property_0_0= ruleORing ) ) ;
    public final EObject ruleProblemNoVars() throws RecognitionException {
        EObject current = null;

        EObject lv_property_0_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:244:28: ( ( (lv_property_0_0= ruleORing ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:245:1: ( (lv_property_0_0= ruleORing ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:245:1: ( (lv_property_0_0= ruleORing ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:246:1: (lv_property_0_0= ruleORing )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:246:1: (lv_property_0_0= ruleORing )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:247:3: lv_property_0_0= ruleORing
            {
             
            	        newCompositeNode(grammarAccess.getProblemNoVarsAccess().getPropertyORingParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleORing_in_ruleProblemNoVars458);
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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:271:1: entryRuleProblemPropertyOptional returns [EObject current=null] : iv_ruleProblemPropertyOptional= ruleProblemPropertyOptional EOF ;
    public final EObject entryRuleProblemPropertyOptional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProblemPropertyOptional = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:272:2: (iv_ruleProblemPropertyOptional= ruleProblemPropertyOptional EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:273:2: iv_ruleProblemPropertyOptional= ruleProblemPropertyOptional EOF
            {
             newCompositeNode(grammarAccess.getProblemPropertyOptionalRule()); 
            pushFollow(FOLLOW_ruleProblemPropertyOptional_in_entryRuleProblemPropertyOptional493);
            iv_ruleProblemPropertyOptional=ruleProblemPropertyOptional();

            state._fsp--;

             current =iv_ruleProblemPropertyOptional; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProblemPropertyOptional503); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:280:1: ruleProblemPropertyOptional returns [EObject current=null] : ( ( (lv_vars_0_0= ruleDeclaration ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) ) )* (otherlv_3= 'st' ( (lv_property_4_0= ruleORing ) ) )? ) ;
    public final EObject ruleProblemPropertyOptional() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_vars_0_0 = null;

        EObject lv_vars_2_0 = null;

        EObject lv_property_4_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:283:28: ( ( ( (lv_vars_0_0= ruleDeclaration ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) ) )* (otherlv_3= 'st' ( (lv_property_4_0= ruleORing ) ) )? ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:284:1: ( ( (lv_vars_0_0= ruleDeclaration ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) ) )* (otherlv_3= 'st' ( (lv_property_4_0= ruleORing ) ) )? )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:284:1: ( ( (lv_vars_0_0= ruleDeclaration ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) ) )* (otherlv_3= 'st' ( (lv_property_4_0= ruleORing ) ) )? )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:284:2: ( (lv_vars_0_0= ruleDeclaration ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) ) )* (otherlv_3= 'st' ( (lv_property_4_0= ruleORing ) ) )?
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:284:2: ( (lv_vars_0_0= ruleDeclaration ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:285:1: (lv_vars_0_0= ruleDeclaration )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:285:1: (lv_vars_0_0= ruleDeclaration )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:286:3: lv_vars_0_0= ruleDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getProblemPropertyOptionalAccess().getVarsDeclarationParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDeclaration_in_ruleProblemPropertyOptional549);
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

            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:302:2: (otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:302:4: otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleProblemPropertyOptional562); 

            	        	newLeafNode(otherlv_1, grammarAccess.getProblemPropertyOptionalAccess().getCommaKeyword_1_0());
            	        
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:306:1: ( (lv_vars_2_0= ruleDeclaration ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:307:1: (lv_vars_2_0= ruleDeclaration )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:307:1: (lv_vars_2_0= ruleDeclaration )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:308:3: lv_vars_2_0= ruleDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProblemPropertyOptionalAccess().getVarsDeclarationParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleProblemPropertyOptional583);
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

            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:324:4: (otherlv_3= 'st' ( (lv_property_4_0= ruleORing ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:324:6: otherlv_3= 'st' ( (lv_property_4_0= ruleORing ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleProblemPropertyOptional598); 

                        	newLeafNode(otherlv_3, grammarAccess.getProblemPropertyOptionalAccess().getStKeyword_2_0());
                        
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:328:1: ( (lv_property_4_0= ruleORing ) )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:329:1: (lv_property_4_0= ruleORing )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:329:1: (lv_property_4_0= ruleORing )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:330:3: lv_property_4_0= ruleORing
                    {
                     
                    	        newCompositeNode(grammarAccess.getProblemPropertyOptionalAccess().getPropertyORingParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleORing_in_ruleProblemPropertyOptional619);
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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:354:1: entryRuleProblem returns [EObject current=null] : iv_ruleProblem= ruleProblem EOF ;
    public final EObject entryRuleProblem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProblem = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:355:2: (iv_ruleProblem= ruleProblem EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:356:2: iv_ruleProblem= ruleProblem EOF
            {
             newCompositeNode(grammarAccess.getProblemRule()); 
            pushFollow(FOLLOW_ruleProblem_in_entryRuleProblem657);
            iv_ruleProblem=ruleProblem();

            state._fsp--;

             current =iv_ruleProblem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProblem667); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:363:1: ruleProblem returns [EObject current=null] : ( ( (lv_vars_0_0= ruleDeclaration ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) ) )* otherlv_3= 'st' ( (lv_property_4_0= ruleORing ) ) ) ;
    public final EObject ruleProblem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_vars_0_0 = null;

        EObject lv_vars_2_0 = null;

        EObject lv_property_4_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:366:28: ( ( ( (lv_vars_0_0= ruleDeclaration ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) ) )* otherlv_3= 'st' ( (lv_property_4_0= ruleORing ) ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:367:1: ( ( (lv_vars_0_0= ruleDeclaration ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) ) )* otherlv_3= 'st' ( (lv_property_4_0= ruleORing ) ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:367:1: ( ( (lv_vars_0_0= ruleDeclaration ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) ) )* otherlv_3= 'st' ( (lv_property_4_0= ruleORing ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:367:2: ( (lv_vars_0_0= ruleDeclaration ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) ) )* otherlv_3= 'st' ( (lv_property_4_0= ruleORing ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:367:2: ( (lv_vars_0_0= ruleDeclaration ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:368:1: (lv_vars_0_0= ruleDeclaration )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:368:1: (lv_vars_0_0= ruleDeclaration )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:369:3: lv_vars_0_0= ruleDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getProblemAccess().getVarsDeclarationParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDeclaration_in_ruleProblem713);
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

            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:385:2: (otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:385:4: otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleProblem726); 

            	        	newLeafNode(otherlv_1, grammarAccess.getProblemAccess().getCommaKeyword_1_0());
            	        
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:389:1: ( (lv_vars_2_0= ruleDeclaration ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:390:1: (lv_vars_2_0= ruleDeclaration )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:390:1: (lv_vars_2_0= ruleDeclaration )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:391:3: lv_vars_2_0= ruleDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProblemAccess().getVarsDeclarationParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleProblem747);
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

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleProblem761); 

                	newLeafNode(otherlv_3, grammarAccess.getProblemAccess().getStKeyword_2());
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:411:1: ( (lv_property_4_0= ruleORing ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:412:1: (lv_property_4_0= ruleORing )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:412:1: (lv_property_4_0= ruleORing )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:413:3: lv_property_4_0= ruleORing
            {
             
            	        newCompositeNode(grammarAccess.getProblemAccess().getPropertyORingParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleORing_in_ruleProblem782);
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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:437:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:438:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:439:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration818);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration828); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:446:1: ruleDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) )? ( (lv_varName_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_varName_1_0=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:449:28: ( ( ( (lv_type_0_0= ruleType ) )? ( (lv_varName_1_0= RULE_ID ) ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:450:1: ( ( (lv_type_0_0= ruleType ) )? ( (lv_varName_1_0= RULE_ID ) ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:450:1: ( ( (lv_type_0_0= ruleType ) )? ( (lv_varName_1_0= RULE_ID ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:450:2: ( (lv_type_0_0= ruleType ) )? ( (lv_varName_1_0= RULE_ID ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:450:2: ( (lv_type_0_0= ruleType ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==RULE_ID||LA10_1==18) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:451:1: (lv_type_0_0= ruleType )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:451:1: (lv_type_0_0= ruleType )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:452:3: lv_type_0_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleDeclaration874);
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

            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:468:3: ( (lv_varName_1_0= RULE_ID ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:469:1: (lv_varName_1_0= RULE_ID )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:469:1: (lv_varName_1_0= RULE_ID )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:470:3: lv_varName_1_0= RULE_ID
            {
            lv_varName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeclaration892); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:494:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:495:2: (iv_ruleType= ruleType EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:496:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType933);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType943); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:503:1: ruleType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '<' ( (lv_templateType_2_0= ruleType ) ) otherlv_3= '>' )? ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_templateType_2_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:506:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '<' ( (lv_templateType_2_0= ruleType ) ) otherlv_3= '>' )? ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:507:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '<' ( (lv_templateType_2_0= ruleType ) ) otherlv_3= '>' )? )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:507:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '<' ( (lv_templateType_2_0= ruleType ) ) otherlv_3= '>' )? )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:507:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '<' ( (lv_templateType_2_0= ruleType ) ) otherlv_3= '>' )?
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:507:2: ( (lv_name_0_0= RULE_ID ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:508:1: (lv_name_0_0= RULE_ID )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:508:1: (lv_name_0_0= RULE_ID )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:509:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleType985); 

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

            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:525:2: (otherlv_1= '<' ( (lv_templateType_2_0= ruleType ) ) otherlv_3= '>' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:525:4: otherlv_1= '<' ( (lv_templateType_2_0= ruleType ) ) otherlv_3= '>'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleType1003); 

                        	newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getLessThanSignKeyword_1_0());
                        
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:529:1: ( (lv_templateType_2_0= ruleType ) )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:530:1: (lv_templateType_2_0= ruleType )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:530:1: (lv_templateType_2_0= ruleType )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:531:3: lv_templateType_2_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getTemplateTypeTypeParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleType1024);
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

                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleType1036); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:559:1: entryRuleORing returns [EObject current=null] : iv_ruleORing= ruleORing EOF ;
    public final EObject entryRuleORing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleORing = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:560:2: (iv_ruleORing= ruleORing EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:561:2: iv_ruleORing= ruleORing EOF
            {
             newCompositeNode(grammarAccess.getORingRule()); 
            pushFollow(FOLLOW_ruleORing_in_entryRuleORing1074);
            iv_ruleORing=ruleORing();

            state._fsp--;

             current =iv_ruleORing; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleORing1084); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:568:1: ruleORing returns [EObject current=null] : (this_ANDing_0= ruleANDing ( () otherlv_2= '|' ( (lv_right_3_0= ruleANDing ) ) )* ) ;
    public final EObject ruleORing() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ANDing_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:571:28: ( (this_ANDing_0= ruleANDing ( () otherlv_2= '|' ( (lv_right_3_0= ruleANDing ) ) )* ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:572:1: (this_ANDing_0= ruleANDing ( () otherlv_2= '|' ( (lv_right_3_0= ruleANDing ) ) )* )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:572:1: (this_ANDing_0= ruleANDing ( () otherlv_2= '|' ( (lv_right_3_0= ruleANDing ) ) )* )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:573:5: this_ANDing_0= ruleANDing ( () otherlv_2= '|' ( (lv_right_3_0= ruleANDing ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getORingAccess().getANDingParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleANDing_in_ruleORing1131);
            this_ANDing_0=ruleANDing();

            state._fsp--;

             
                    current = this_ANDing_0; 
                    afterParserOrEnumRuleCall();
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:581:1: ( () otherlv_2= '|' ( (lv_right_3_0= ruleANDing ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:581:2: () otherlv_2= '|' ( (lv_right_3_0= ruleANDing ) )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:581:2: ()
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:582:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getORingAccess().getORingLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleORing1152); 

            	        	newLeafNode(otherlv_2, grammarAccess.getORingAccess().getVerticalLineKeyword_1_1());
            	        
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:591:1: ( (lv_right_3_0= ruleANDing ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:592:1: (lv_right_3_0= ruleANDing )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:592:1: (lv_right_3_0= ruleANDing )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:593:3: lv_right_3_0= ruleANDing
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getORingAccess().getRightANDingParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleANDing_in_ruleORing1173);
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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:617:1: entryRuleANDing returns [EObject current=null] : iv_ruleANDing= ruleANDing EOF ;
    public final EObject entryRuleANDing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleANDing = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:618:2: (iv_ruleANDing= ruleANDing EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:619:2: iv_ruleANDing= ruleANDing EOF
            {
             newCompositeNode(grammarAccess.getANDingRule()); 
            pushFollow(FOLLOW_ruleANDing_in_entryRuleANDing1211);
            iv_ruleANDing=ruleANDing();

            state._fsp--;

             current =iv_ruleANDing; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleANDing1221); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:626:1: ruleANDing returns [EObject current=null] : (this_Primary_0= rulePrimary ( () otherlv_2= '&' ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleANDing() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:629:28: ( (this_Primary_0= rulePrimary ( () otherlv_2= '&' ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:630:1: (this_Primary_0= rulePrimary ( () otherlv_2= '&' ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:630:1: (this_Primary_0= rulePrimary ( () otherlv_2= '&' ( (lv_right_3_0= rulePrimary ) ) )* )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:631:5: this_Primary_0= rulePrimary ( () otherlv_2= '&' ( (lv_right_3_0= rulePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getANDingAccess().getPrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimary_in_ruleANDing1268);
            this_Primary_0=rulePrimary();

            state._fsp--;

             
                    current = this_Primary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:639:1: ( () otherlv_2= '&' ( (lv_right_3_0= rulePrimary ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==21) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:639:2: () otherlv_2= '&' ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:639:2: ()
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:640:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getANDingAccess().getANDingLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleANDing1289); 

            	        	newLeafNode(otherlv_2, grammarAccess.getANDingAccess().getAmpersandKeyword_1_1());
            	        
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:649:1: ( (lv_right_3_0= rulePrimary ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:650:1: (lv_right_3_0= rulePrimary )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:650:1: (lv_right_3_0= rulePrimary )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:651:3: lv_right_3_0= rulePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getANDingAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimary_in_ruleANDing1310);
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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:675:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:676:2: (iv_rulePrimary= rulePrimary EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:677:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary1348);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary1358); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:684:1: rulePrimary returns [EObject current=null] : (this_Atomic_0= ruleAtomic | this_Quantifier_1= ruleQuantifier | this_ProblemShell_2= ruleProblemShell | (otherlv_3= '(' this_ORing_4= ruleORing otherlv_5= ')' ) | this_BooleanLiteral_6= ruleBooleanLiteral | this_Negation_7= ruleNegation ) ;
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
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:687:28: ( (this_Atomic_0= ruleAtomic | this_Quantifier_1= ruleQuantifier | this_ProblemShell_2= ruleProblemShell | (otherlv_3= '(' this_ORing_4= ruleORing otherlv_5= ')' ) | this_BooleanLiteral_6= ruleBooleanLiteral | this_Negation_7= ruleNegation ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:688:1: (this_Atomic_0= ruleAtomic | this_Quantifier_1= ruleQuantifier | this_ProblemShell_2= ruleProblemShell | (otherlv_3= '(' this_ORing_4= ruleORing otherlv_5= ')' ) | this_BooleanLiteral_6= ruleBooleanLiteral | this_Negation_7= ruleNegation )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:688:1: (this_Atomic_0= ruleAtomic | this_Quantifier_1= ruleQuantifier | this_ProblemShell_2= ruleProblemShell | (otherlv_3= '(' this_ORing_4= ruleORing otherlv_5= ')' ) | this_BooleanLiteral_6= ruleBooleanLiteral | this_Negation_7= ruleNegation )
            int alt14=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt14=1;
                }
                break;
            case 27:
            case 28:
                {
                alt14=2;
                }
                break;
            case 24:
                {
                alt14=3;
                }
                break;
            case 22:
                {
                alt14=4;
                }
                break;
            case 30:
            case 31:
                {
                alt14=5;
                }
                break;
            case 26:
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
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:689:5: this_Atomic_0= ruleAtomic
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAtomic_in_rulePrimary1405);
                    this_Atomic_0=ruleAtomic();

                    state._fsp--;

                     
                            current = this_Atomic_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:699:5: this_Quantifier_1= ruleQuantifier
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getQuantifierParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleQuantifier_in_rulePrimary1432);
                    this_Quantifier_1=ruleQuantifier();

                    state._fsp--;

                     
                            current = this_Quantifier_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:709:5: this_ProblemShell_2= ruleProblemShell
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getProblemShellParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleProblemShell_in_rulePrimary1459);
                    this_ProblemShell_2=ruleProblemShell();

                    state._fsp--;

                     
                            current = this_ProblemShell_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:718:6: (otherlv_3= '(' this_ORing_4= ruleORing otherlv_5= ')' )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:718:6: (otherlv_3= '(' this_ORing_4= ruleORing otherlv_5= ')' )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:718:8: otherlv_3= '(' this_ORing_4= ruleORing otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_rulePrimary1477); 

                        	newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getORingParserRuleCall_3_1()); 
                        
                    pushFollow(FOLLOW_ruleORing_in_rulePrimary1499);
                    this_ORing_4=ruleORing();

                    state._fsp--;

                     
                            current = this_ORing_4; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_5=(Token)match(input,23,FOLLOW_23_in_rulePrimary1510); 

                        	newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_2());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:737:5: this_BooleanLiteral_6= ruleBooleanLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getBooleanLiteralParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_rulePrimary1539);
                    this_BooleanLiteral_6=ruleBooleanLiteral();

                    state._fsp--;

                     
                            current = this_BooleanLiteral_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:747:5: this_Negation_7= ruleNegation
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getNegationParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleNegation_in_rulePrimary1566);
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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:763:1: entryRuleProblemShell returns [EObject current=null] : iv_ruleProblemShell= ruleProblemShell EOF ;
    public final EObject entryRuleProblemShell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProblemShell = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:764:2: (iv_ruleProblemShell= ruleProblemShell EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:765:2: iv_ruleProblemShell= ruleProblemShell EOF
            {
             newCompositeNode(grammarAccess.getProblemShellRule()); 
            pushFollow(FOLLOW_ruleProblemShell_in_entryRuleProblemShell1601);
            iv_ruleProblemShell=ruleProblemShell();

            state._fsp--;

             current =iv_ruleProblemShell; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProblemShell1611); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:772:1: ruleProblemShell returns [EObject current=null] : (otherlv_0= '{' ( (lv_problem_1_0= ruleProblem ) ) otherlv_2= '}' ) ;
    public final EObject ruleProblemShell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_problem_1_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:775:28: ( (otherlv_0= '{' ( (lv_problem_1_0= ruleProblem ) ) otherlv_2= '}' ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:776:1: (otherlv_0= '{' ( (lv_problem_1_0= ruleProblem ) ) otherlv_2= '}' )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:776:1: (otherlv_0= '{' ( (lv_problem_1_0= ruleProblem ) ) otherlv_2= '}' )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:776:3: otherlv_0= '{' ( (lv_problem_1_0= ruleProblem ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleProblemShell1648); 

                	newLeafNode(otherlv_0, grammarAccess.getProblemShellAccess().getLeftCurlyBracketKeyword_0());
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:780:1: ( (lv_problem_1_0= ruleProblem ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:781:1: (lv_problem_1_0= ruleProblem )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:781:1: (lv_problem_1_0= ruleProblem )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:782:3: lv_problem_1_0= ruleProblem
            {
             
            	        newCompositeNode(grammarAccess.getProblemShellAccess().getProblemProblemParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleProblem_in_ruleProblemShell1669);
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

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleProblemShell1681); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:810:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:811:2: (iv_ruleNegation= ruleNegation EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:812:2: iv_ruleNegation= ruleNegation EOF
            {
             newCompositeNode(grammarAccess.getNegationRule()); 
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation1717);
            iv_ruleNegation=ruleNegation();

            state._fsp--;

             current =iv_ruleNegation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation1727); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:819:1: ruleNegation returns [EObject current=null] : (otherlv_0= '!' ( (lv_negated_1_0= rulePrimary ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_negated_1_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:822:28: ( (otherlv_0= '!' ( (lv_negated_1_0= rulePrimary ) ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:823:1: (otherlv_0= '!' ( (lv_negated_1_0= rulePrimary ) ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:823:1: (otherlv_0= '!' ( (lv_negated_1_0= rulePrimary ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:823:3: otherlv_0= '!' ( (lv_negated_1_0= rulePrimary ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleNegation1764); 

                	newLeafNode(otherlv_0, grammarAccess.getNegationAccess().getExclamationMarkKeyword_0());
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:827:1: ( (lv_negated_1_0= rulePrimary ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:828:1: (lv_negated_1_0= rulePrimary )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:828:1: (lv_negated_1_0= rulePrimary )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:829:3: lv_negated_1_0= rulePrimary
            {
             
            	        newCompositeNode(grammarAccess.getNegationAccess().getNegatedPrimaryParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePrimary_in_ruleNegation1785);
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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:853:1: entryRuleQuantifier returns [EObject current=null] : iv_ruleQuantifier= ruleQuantifier EOF ;
    public final EObject entryRuleQuantifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifier = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:854:2: (iv_ruleQuantifier= ruleQuantifier EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:855:2: iv_ruleQuantifier= ruleQuantifier EOF
            {
             newCompositeNode(grammarAccess.getQuantifierRule()); 
            pushFollow(FOLLOW_ruleQuantifier_in_entryRuleQuantifier1821);
            iv_ruleQuantifier=ruleQuantifier();

            state._fsp--;

             current =iv_ruleQuantifier; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantifier1831); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:862:1: ruleQuantifier returns [EObject current=null] : ( ( ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) ) ) otherlv_1= '(' ( (lv_subject_2_0= ruleProblem ) ) otherlv_3= ':' ( (lv_predicate_4_0= ruleORing ) ) otherlv_5= ')' ) ;
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
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:865:28: ( ( ( ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) ) ) otherlv_1= '(' ( (lv_subject_2_0= ruleProblem ) ) otherlv_3= ':' ( (lv_predicate_4_0= ruleORing ) ) otherlv_5= ')' ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:866:1: ( ( ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) ) ) otherlv_1= '(' ( (lv_subject_2_0= ruleProblem ) ) otherlv_3= ':' ( (lv_predicate_4_0= ruleORing ) ) otherlv_5= ')' )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:866:1: ( ( ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) ) ) otherlv_1= '(' ( (lv_subject_2_0= ruleProblem ) ) otherlv_3= ':' ( (lv_predicate_4_0= ruleORing ) ) otherlv_5= ')' )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:866:2: ( ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) ) ) otherlv_1= '(' ( (lv_subject_2_0= ruleProblem ) ) otherlv_3= ':' ( (lv_predicate_4_0= ruleORing ) ) otherlv_5= ')'
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:866:2: ( ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:867:1: ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:867:1: ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:868:1: (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:868:1: (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            else if ( (LA15_0==28) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:869:3: lv_quantifier_0_1= 'forall'
                    {
                    lv_quantifier_0_1=(Token)match(input,27,FOLLOW_27_in_ruleQuantifier1876); 

                            newLeafNode(lv_quantifier_0_1, grammarAccess.getQuantifierAccess().getQuantifierForallKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuantifierRule());
                    	        }
                           		setWithLastConsumed(current, "quantifier", lv_quantifier_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:881:8: lv_quantifier_0_2= 'exists'
                    {
                    lv_quantifier_0_2=(Token)match(input,28,FOLLOW_28_in_ruleQuantifier1905); 

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

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleQuantifier1933); 

                	newLeafNode(otherlv_1, grammarAccess.getQuantifierAccess().getLeftParenthesisKeyword_1());
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:900:1: ( (lv_subject_2_0= ruleProblem ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:901:1: (lv_subject_2_0= ruleProblem )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:901:1: (lv_subject_2_0= ruleProblem )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:902:3: lv_subject_2_0= ruleProblem
            {
             
            	        newCompositeNode(grammarAccess.getQuantifierAccess().getSubjectProblemParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleProblem_in_ruleQuantifier1954);
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

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleQuantifier1966); 

                	newLeafNode(otherlv_3, grammarAccess.getQuantifierAccess().getColonKeyword_3());
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:922:1: ( (lv_predicate_4_0= ruleORing ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:923:1: (lv_predicate_4_0= ruleORing )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:923:1: (lv_predicate_4_0= ruleORing )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:924:3: lv_predicate_4_0= ruleORing
            {
             
            	        newCompositeNode(grammarAccess.getQuantifierAccess().getPredicateORingParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleORing_in_ruleQuantifier1987);
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

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleQuantifier1999); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:952:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:953:2: (iv_ruleAtomic= ruleAtomic EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:954:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic2035);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic2045); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:961:1: ruleAtomic returns [EObject current=null] : ( ( (lv_Function_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleAddition ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleAddition ) ) )* )? otherlv_5= ')' ) ;
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
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:964:28: ( ( ( (lv_Function_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleAddition ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleAddition ) ) )* )? otherlv_5= ')' ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:965:1: ( ( (lv_Function_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleAddition ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleAddition ) ) )* )? otherlv_5= ')' )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:965:1: ( ( (lv_Function_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleAddition ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleAddition ) ) )* )? otherlv_5= ')' )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:965:2: ( (lv_Function_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleAddition ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleAddition ) ) )* )? otherlv_5= ')'
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:965:2: ( (lv_Function_0_0= RULE_ID ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:966:1: (lv_Function_0_0= RULE_ID )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:966:1: (lv_Function_0_0= RULE_ID )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:967:3: lv_Function_0_0= RULE_ID
            {
            lv_Function_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomic2087); 

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

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleAtomic2104); 

                	newLeafNode(otherlv_1, grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_1());
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:987:1: ( ( (lv_args_2_0= ruleAddition ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleAddition ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_INT)||LA17_0==22||LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:987:2: ( (lv_args_2_0= ruleAddition ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleAddition ) ) )*
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:987:2: ( (lv_args_2_0= ruleAddition ) )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:988:1: (lv_args_2_0= ruleAddition )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:988:1: (lv_args_2_0= ruleAddition )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:989:3: lv_args_2_0= ruleAddition
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicAccess().getArgsAdditionParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAddition_in_ruleAtomic2126);
                    lv_args_2_0=ruleAddition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtomicRule());
                    	        }
                           		add(
                           			current, 
                           			"args",
                            		lv_args_2_0, 
                            		"Addition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1005:2: (otherlv_3= ',' ( (lv_args_4_0= ruleAddition ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==16) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1005:4: otherlv_3= ',' ( (lv_args_4_0= ruleAddition ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleAtomic2139); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getAtomicAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1009:1: ( (lv_args_4_0= ruleAddition ) )
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1010:1: (lv_args_4_0= ruleAddition )
                    	    {
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1010:1: (lv_args_4_0= ruleAddition )
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1011:3: lv_args_4_0= ruleAddition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAtomicAccess().getArgsAdditionParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAddition_in_ruleAtomic2160);
                    	    lv_args_4_0=ruleAddition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAtomicRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"args",
                    	            		lv_args_4_0, 
                    	            		"Addition");
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

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleAtomic2176); 

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


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1039:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1040:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1041:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral2212);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral2222); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1048:1: ruleBooleanLiteral returns [EObject current=null] : ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;

         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1051:28: ( ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1052:1: ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1052:1: ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1053:1: ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1053:1: ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1054:1: (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1054:1: (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            else if ( (LA18_0==31) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1055:3: lv_value_0_1= 'TRUE'
                    {
                    lv_value_0_1=(Token)match(input,30,FOLLOW_30_in_ruleBooleanLiteral2266); 

                            newLeafNode(lv_value_0_1, grammarAccess.getBooleanLiteralAccess().getValueTRUEKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1067:8: lv_value_0_2= 'FALSE'
                    {
                    lv_value_0_2=(Token)match(input,31,FOLLOW_31_in_ruleBooleanLiteral2295); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1090:1: entryRuleTheorem returns [EObject current=null] : iv_ruleTheorem= ruleTheorem EOF ;
    public final EObject entryRuleTheorem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheorem = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1091:2: (iv_ruleTheorem= ruleTheorem EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1092:2: iv_ruleTheorem= ruleTheorem EOF
            {
             newCompositeNode(grammarAccess.getTheoremRule()); 
            pushFollow(FOLLOW_ruleTheorem_in_entryRuleTheorem2346);
            iv_ruleTheorem=ruleTheorem();

            state._fsp--;

             current =iv_ruleTheorem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTheorem2356); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1099:1: ruleTheorem returns [EObject current=null] : ( ( (lv_Requirement_0_0= ruleORing ) ) ( ( (lv_Implication_1_1= '->' | lv_Implication_1_2= '<-' | lv_Implication_1_3= '<->' ) ) ) ( (lv_Result_2_0= ruleORing ) ) otherlv_3= ',' ( (lv_Cost_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_Description_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_PseudoCode_8_0= RULE_STRING ) ) )? ) ;
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
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1102:28: ( ( ( (lv_Requirement_0_0= ruleORing ) ) ( ( (lv_Implication_1_1= '->' | lv_Implication_1_2= '<-' | lv_Implication_1_3= '<->' ) ) ) ( (lv_Result_2_0= ruleORing ) ) otherlv_3= ',' ( (lv_Cost_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_Description_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_PseudoCode_8_0= RULE_STRING ) ) )? ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1103:1: ( ( (lv_Requirement_0_0= ruleORing ) ) ( ( (lv_Implication_1_1= '->' | lv_Implication_1_2= '<-' | lv_Implication_1_3= '<->' ) ) ) ( (lv_Result_2_0= ruleORing ) ) otherlv_3= ',' ( (lv_Cost_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_Description_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_PseudoCode_8_0= RULE_STRING ) ) )? )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1103:1: ( ( (lv_Requirement_0_0= ruleORing ) ) ( ( (lv_Implication_1_1= '->' | lv_Implication_1_2= '<-' | lv_Implication_1_3= '<->' ) ) ) ( (lv_Result_2_0= ruleORing ) ) otherlv_3= ',' ( (lv_Cost_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_Description_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_PseudoCode_8_0= RULE_STRING ) ) )? )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1103:2: ( (lv_Requirement_0_0= ruleORing ) ) ( ( (lv_Implication_1_1= '->' | lv_Implication_1_2= '<-' | lv_Implication_1_3= '<->' ) ) ) ( (lv_Result_2_0= ruleORing ) ) otherlv_3= ',' ( (lv_Cost_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_Description_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_PseudoCode_8_0= RULE_STRING ) ) )?
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1103:2: ( (lv_Requirement_0_0= ruleORing ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1104:1: (lv_Requirement_0_0= ruleORing )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1104:1: (lv_Requirement_0_0= ruleORing )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1105:3: lv_Requirement_0_0= ruleORing
            {
             
            	        newCompositeNode(grammarAccess.getTheoremAccess().getRequirementORingParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleORing_in_ruleTheorem2402);
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

            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1121:2: ( ( (lv_Implication_1_1= '->' | lv_Implication_1_2= '<-' | lv_Implication_1_3= '<->' ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1122:1: ( (lv_Implication_1_1= '->' | lv_Implication_1_2= '<-' | lv_Implication_1_3= '<->' ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1122:1: ( (lv_Implication_1_1= '->' | lv_Implication_1_2= '<-' | lv_Implication_1_3= '<->' ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1123:1: (lv_Implication_1_1= '->' | lv_Implication_1_2= '<-' | lv_Implication_1_3= '<->' )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1123:1: (lv_Implication_1_1= '->' | lv_Implication_1_2= '<-' | lv_Implication_1_3= '<->' )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt19=1;
                }
                break;
            case 33:
                {
                alt19=2;
                }
                break;
            case 34:
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
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1124:3: lv_Implication_1_1= '->'
                    {
                    lv_Implication_1_1=(Token)match(input,32,FOLLOW_32_in_ruleTheorem2422); 

                            newLeafNode(lv_Implication_1_1, grammarAccess.getTheoremAccess().getImplicationHyphenMinusGreaterThanSignKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTheoremRule());
                    	        }
                           		setWithLastConsumed(current, "Implication", lv_Implication_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1136:8: lv_Implication_1_2= '<-'
                    {
                    lv_Implication_1_2=(Token)match(input,33,FOLLOW_33_in_ruleTheorem2451); 

                            newLeafNode(lv_Implication_1_2, grammarAccess.getTheoremAccess().getImplicationLessThanSignHyphenMinusKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTheoremRule());
                    	        }
                           		setWithLastConsumed(current, "Implication", lv_Implication_1_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1148:8: lv_Implication_1_3= '<->'
                    {
                    lv_Implication_1_3=(Token)match(input,34,FOLLOW_34_in_ruleTheorem2480); 

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

            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1163:2: ( (lv_Result_2_0= ruleORing ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1164:1: (lv_Result_2_0= ruleORing )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1164:1: (lv_Result_2_0= ruleORing )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1165:3: lv_Result_2_0= ruleORing
            {
             
            	        newCompositeNode(grammarAccess.getTheoremAccess().getResultORingParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleORing_in_ruleTheorem2517);
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleTheorem2529); 

                	newLeafNode(otherlv_3, grammarAccess.getTheoremAccess().getCommaKeyword_3());
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1185:1: ( (lv_Cost_4_0= RULE_INT ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1186:1: (lv_Cost_4_0= RULE_INT )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1186:1: (lv_Cost_4_0= RULE_INT )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1187:3: lv_Cost_4_0= RULE_INT
            {
            lv_Cost_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTheorem2546); 

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

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleTheorem2563); 

                	newLeafNode(otherlv_5, grammarAccess.getTheoremAccess().getCommaKeyword_5());
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1207:1: ( (lv_Description_6_0= RULE_STRING ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1208:1: (lv_Description_6_0= RULE_STRING )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1208:1: (lv_Description_6_0= RULE_STRING )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1209:3: lv_Description_6_0= RULE_STRING
            {
            lv_Description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTheorem2580); 

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

            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1225:2: (otherlv_7= ',' ( (lv_PseudoCode_8_0= RULE_STRING ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==16) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1225:4: otherlv_7= ',' ( (lv_PseudoCode_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleTheorem2598); 

                        	newLeafNode(otherlv_7, grammarAccess.getTheoremAccess().getCommaKeyword_7_0());
                        
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1229:1: ( (lv_PseudoCode_8_0= RULE_STRING ) )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1230:1: (lv_PseudoCode_8_0= RULE_STRING )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1230:1: (lv_PseudoCode_8_0= RULE_STRING )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1231:3: lv_PseudoCode_8_0= RULE_STRING
                    {
                    lv_PseudoCode_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTheorem2615); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1255:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1256:2: (iv_ruleAddition= ruleAddition EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1257:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition2658);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition2668); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1264:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_2_1=null;
        Token lv_symbol_2_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1267:28: ( (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1268:1: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1268:1: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1269:5: this_Multiplication_0= ruleMultiplication ( () ( ( (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition2715);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;

             
                    current = this_Multiplication_0; 
                    afterParserOrEnumRuleCall();
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1277:1: ( () ( ( (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=35 && LA22_0<=36)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1277:2: () ( ( (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1277:2: ()
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1278:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1283:2: ( ( (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' ) ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1284:1: ( (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' ) )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1284:1: ( (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1285:1: (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1285:1: (lv_symbol_2_1= '+' | lv_symbol_2_2= '-' )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==35) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==36) ) {
            	        alt21=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1286:3: lv_symbol_2_1= '+'
            	            {
            	            lv_symbol_2_1=(Token)match(input,35,FOLLOW_35_in_ruleAddition2744); 

            	                    newLeafNode(lv_symbol_2_1, grammarAccess.getAdditionAccess().getSymbolPlusSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getAdditionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "symbol", lv_symbol_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1298:8: lv_symbol_2_2= '-'
            	            {
            	            lv_symbol_2_2=(Token)match(input,36,FOLLOW_36_in_ruleAddition2773); 

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

            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1313:2: ( (lv_right_3_0= ruleMultiplication ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1314:1: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1314:1: (lv_right_3_0= ruleMultiplication )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1315:3: lv_right_3_0= ruleMultiplication
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition2810);
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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1339:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1340:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1341:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication2848);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication2858); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1348:1: ruleMultiplication returns [EObject current=null] : (this_NumericalPrimary_0= ruleNumericalPrimary ( () ( ( (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNumericalPrimary ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_2_1=null;
        Token lv_symbol_2_2=null;
        EObject this_NumericalPrimary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1351:28: ( (this_NumericalPrimary_0= ruleNumericalPrimary ( () ( ( (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNumericalPrimary ) ) )* ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1352:1: (this_NumericalPrimary_0= ruleNumericalPrimary ( () ( ( (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNumericalPrimary ) ) )* )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1352:1: (this_NumericalPrimary_0= ruleNumericalPrimary ( () ( ( (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNumericalPrimary ) ) )* )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1353:5: this_NumericalPrimary_0= ruleNumericalPrimary ( () ( ( (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNumericalPrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultiplicationAccess().getNumericalPrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleNumericalPrimary_in_ruleMultiplication2905);
            this_NumericalPrimary_0=ruleNumericalPrimary();

            state._fsp--;

             
                    current = this_NumericalPrimary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1361:1: ( () ( ( (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNumericalPrimary ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=37 && LA24_0<=38)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1361:2: () ( ( (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNumericalPrimary ) )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1361:2: ()
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1362:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1367:2: ( ( (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' ) ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1368:1: ( (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' ) )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1368:1: ( (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1369:1: (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1369:1: (lv_symbol_2_1= '*' | lv_symbol_2_2= '/' )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==37) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==38) ) {
            	        alt23=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1370:3: lv_symbol_2_1= '*'
            	            {
            	            lv_symbol_2_1=(Token)match(input,37,FOLLOW_37_in_ruleMultiplication2934); 

            	                    newLeafNode(lv_symbol_2_1, grammarAccess.getMultiplicationAccess().getSymbolAsteriskKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMultiplicationRule());
            	            	        }
            	                   		setWithLastConsumed(current, "symbol", lv_symbol_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1382:8: lv_symbol_2_2= '/'
            	            {
            	            lv_symbol_2_2=(Token)match(input,38,FOLLOW_38_in_ruleMultiplication2963); 

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

            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1397:2: ( (lv_right_3_0= ruleNumericalPrimary ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1398:1: (lv_right_3_0= ruleNumericalPrimary )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1398:1: (lv_right_3_0= ruleNumericalPrimary )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1399:3: lv_right_3_0= ruleNumericalPrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightNumericalPrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNumericalPrimary_in_ruleMultiplication3000);
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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1423:1: entryRuleNumericalPrimary returns [EObject current=null] : iv_ruleNumericalPrimary= ruleNumericalPrimary EOF ;
    public final EObject entryRuleNumericalPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalPrimary = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1424:2: (iv_ruleNumericalPrimary= ruleNumericalPrimary EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1425:2: iv_ruleNumericalPrimary= ruleNumericalPrimary EOF
            {
             newCompositeNode(grammarAccess.getNumericalPrimaryRule()); 
            pushFollow(FOLLOW_ruleNumericalPrimary_in_entryRuleNumericalPrimary3038);
            iv_ruleNumericalPrimary=ruleNumericalPrimary();

            state._fsp--;

             current =iv_ruleNumericalPrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalPrimary3048); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1432:1: ruleNumericalPrimary returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_Atomic_1= ruleAtomic | (otherlv_2= '(' this_NumericalPrimary_3= ruleNumericalPrimary otherlv_4= ')' ) | this_Variable_5= ruleVariable ) ;
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
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1435:28: ( (this_NumberLiteral_0= ruleNumberLiteral | this_Atomic_1= ruleAtomic | (otherlv_2= '(' this_NumericalPrimary_3= ruleNumericalPrimary otherlv_4= ')' ) | this_Variable_5= ruleVariable ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1436:1: (this_NumberLiteral_0= ruleNumberLiteral | this_Atomic_1= ruleAtomic | (otherlv_2= '(' this_NumericalPrimary_3= ruleNumericalPrimary otherlv_4= ')' ) | this_Variable_5= ruleVariable )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1436:1: (this_NumberLiteral_0= ruleNumberLiteral | this_Atomic_1= ruleAtomic | (otherlv_2= '(' this_NumericalPrimary_3= ruleNumericalPrimary otherlv_4= ')' ) | this_Variable_5= ruleVariable )
            int alt25=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 36:
                {
                alt25=1;
                }
                break;
            case RULE_ID:
                {
                int LA25_2 = input.LA(2);

                if ( (LA25_2==EOF||LA25_2==16||LA25_2==23||(LA25_2>=35 && LA25_2<=38)) ) {
                    alt25=4;
                }
                else if ( (LA25_2==22) ) {
                    alt25=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 2, input);

                    throw nvae;
                }
                }
                break;
            case 22:
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
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1437:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getNumericalPrimaryAccess().getNumberLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleNumericalPrimary3095);
                    this_NumberLiteral_0=ruleNumberLiteral();

                    state._fsp--;

                     
                            current = this_NumberLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1447:5: this_Atomic_1= ruleAtomic
                    {
                     
                            newCompositeNode(grammarAccess.getNumericalPrimaryAccess().getAtomicParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAtomic_in_ruleNumericalPrimary3122);
                    this_Atomic_1=ruleAtomic();

                    state._fsp--;

                     
                            current = this_Atomic_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1456:6: (otherlv_2= '(' this_NumericalPrimary_3= ruleNumericalPrimary otherlv_4= ')' )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1456:6: (otherlv_2= '(' this_NumericalPrimary_3= ruleNumericalPrimary otherlv_4= ')' )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1456:8: otherlv_2= '(' this_NumericalPrimary_3= ruleNumericalPrimary otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleNumericalPrimary3140); 

                        	newLeafNode(otherlv_2, grammarAccess.getNumericalPrimaryAccess().getLeftParenthesisKeyword_2_0());
                        
                     
                            newCompositeNode(grammarAccess.getNumericalPrimaryAccess().getNumericalPrimaryParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleNumericalPrimary_in_ruleNumericalPrimary3162);
                    this_NumericalPrimary_3=ruleNumericalPrimary();

                    state._fsp--;

                     
                            current = this_NumericalPrimary_3; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleNumericalPrimary3173); 

                        	newLeafNode(otherlv_4, grammarAccess.getNumericalPrimaryAccess().getRightParenthesisKeyword_2_2());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1475:5: this_Variable_5= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getNumericalPrimaryAccess().getVariableParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleNumericalPrimary3202);
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


    // $ANTLR start "entryRuleVariable"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1491:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1492:2: (iv_ruleVariable= ruleVariable EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1493:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable3237);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable3247); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1500:1: ruleVariable returns [EObject current=null] : ( (lv_arg_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_arg_0_0=null;

         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1503:28: ( ( (lv_arg_0_0= RULE_ID ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1504:1: ( (lv_arg_0_0= RULE_ID ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1504:1: ( (lv_arg_0_0= RULE_ID ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1505:1: (lv_arg_0_0= RULE_ID )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1505:1: (lv_arg_0_0= RULE_ID )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1506:3: lv_arg_0_0= RULE_ID
            {
            lv_arg_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable3288); 

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


    // $ANTLR start "entryRuleNumberLiteral"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1530:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1531:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1532:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral3328);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral3338); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1539:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleDOUBLE ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1542:28: ( ( (lv_value_0_0= ruleDOUBLE ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1543:1: ( (lv_value_0_0= ruleDOUBLE ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1543:1: ( (lv_value_0_0= ruleDOUBLE ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1544:1: (lv_value_0_0= ruleDOUBLE )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1544:1: (lv_value_0_0= ruleDOUBLE )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1545:3: lv_value_0_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueDOUBLEParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleNumberLiteral3383);
            lv_value_0_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNumberLiteralRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"DOUBLE");
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
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleDOUBLE"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1569:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1570:2: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1571:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE3419);
            iv_ruleDOUBLE=ruleDOUBLE();

            state._fsp--;

             current =iv_ruleDOUBLE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOUBLE3430); 

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
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1578:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1581:28: ( ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1582:1: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1582:1: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1582:2: (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1582:2: (kw= '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1583:2: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleDOUBLE3469); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDOUBLEAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE3486); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1()); 
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1595:1: (kw= '.' this_INT_3= RULE_INT )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:1596:2: kw= '.' this_INT_3= RULE_INT
            {
            kw=(Token)match(input,39,FOLLOW_39_in_ruleDOUBLE3505); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_2_0()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE3520); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2_1()); 
                

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
    // $ANTLR end "ruleDOUBLE"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleInput122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProblemPropertyOptional_in_ruleInput143 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInput155 = new BitSet(new long[]{0x0000000000007002L});
    public static final BitSet FOLLOW_13_in_ruleInput176 = new BitSet(new long[]{0x00000000DD400010L});
    public static final BitSet FOLLOW_14_in_ruleInput205 = new BitSet(new long[]{0x00000000DD400010L});
    public static final BitSet FOLLOW_ruleProblem_in_ruleInput244 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleProblemNoVars_in_ruleInput263 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleInput281 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInput293 = new BitSet(new long[]{0x00000000DD400010L});
    public static final BitSet FOLLOW_ruleTheorem_in_ruleInput314 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleInput327 = new BitSet(new long[]{0x00000000DD400010L});
    public static final BitSet FOLLOW_ruleTheorem_in_ruleInput348 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleInput363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblemNoVars_in_entryRuleProblemNoVars403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProblemNoVars413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_ruleProblemNoVars458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblemPropertyOptional_in_entryRuleProblemPropertyOptional493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProblemPropertyOptional503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleProblemPropertyOptional549 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_16_in_ruleProblemPropertyOptional562 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleProblemPropertyOptional583 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_17_in_ruleProblemPropertyOptional598 = new BitSet(new long[]{0x00000000DD400010L});
    public static final BitSet FOLLOW_ruleORing_in_ruleProblemPropertyOptional619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblem_in_entryRuleProblem657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProblem667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleProblem713 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleProblem726 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleProblem747 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleProblem761 = new BitSet(new long[]{0x00000000DD400010L});
    public static final BitSet FOLLOW_ruleORing_in_ruleProblem782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleDeclaration874 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeclaration892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleType985 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleType1003 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleType1024 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleType1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_entryRuleORing1074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleORing1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANDing_in_ruleORing1131 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleORing1152 = new BitSet(new long[]{0x00000000DD400010L});
    public static final BitSet FOLLOW_ruleANDing_in_ruleORing1173 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleANDing_in_entryRuleANDing1211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleANDing1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleANDing1268 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleANDing1289 = new BitSet(new long[]{0x00000000DD400010L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleANDing1310 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary1348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rulePrimary1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_rulePrimary1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblemShell_in_rulePrimary1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePrimary1477 = new BitSet(new long[]{0x00000000DD400010L});
    public static final BitSet FOLLOW_ruleORing_in_rulePrimary1499 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePrimary1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rulePrimary1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_rulePrimary1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblemShell_in_entryRuleProblemShell1601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProblemShell1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleProblemShell1648 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProblem_in_ruleProblemShell1669 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleProblemShell1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation1717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleNegation1764 = new BitSet(new long[]{0x00000000DD400010L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleNegation1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_entryRuleQuantifier1821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantifier1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleQuantifier1876 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_28_in_ruleQuantifier1905 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleQuantifier1933 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProblem_in_ruleQuantifier1954 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleQuantifier1966 = new BitSet(new long[]{0x00000000DD400010L});
    public static final BitSet FOLLOW_ruleORing_in_ruleQuantifier1987 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleQuantifier1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic2035 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomic2087 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAtomic2104 = new BitSet(new long[]{0x0000001000C00030L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleAtomic2126 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_16_in_ruleAtomic2139 = new BitSet(new long[]{0x0000001000400030L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleAtomic2160 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_23_in_ruleAtomic2176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral2212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleBooleanLiteral2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleBooleanLiteral2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTheorem_in_entryRuleTheorem2346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTheorem2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_ruleTheorem2402 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_32_in_ruleTheorem2422 = new BitSet(new long[]{0x00000000DD400010L});
    public static final BitSet FOLLOW_33_in_ruleTheorem2451 = new BitSet(new long[]{0x00000000DD400010L});
    public static final BitSet FOLLOW_34_in_ruleTheorem2480 = new BitSet(new long[]{0x00000000DD400010L});
    public static final BitSet FOLLOW_ruleORing_in_ruleTheorem2517 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleTheorem2529 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTheorem2546 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleTheorem2563 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTheorem2580 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleTheorem2598 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTheorem2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition2658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition2715 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_35_in_ruleAddition2744 = new BitSet(new long[]{0x0000001000400030L});
    public static final BitSet FOLLOW_36_in_ruleAddition2773 = new BitSet(new long[]{0x0000001000400030L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition2810 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication2848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalPrimary_in_ruleMultiplication2905 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_37_in_ruleMultiplication2934 = new BitSet(new long[]{0x0000001000400030L});
    public static final BitSet FOLLOW_38_in_ruleMultiplication2963 = new BitSet(new long[]{0x0000001000400030L});
    public static final BitSet FOLLOW_ruleNumericalPrimary_in_ruleMultiplication3000 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleNumericalPrimary_in_entryRuleNumericalPrimary3038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalPrimary3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleNumericalPrimary3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_ruleNumericalPrimary3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleNumericalPrimary3140 = new BitSet(new long[]{0x0000001000400030L});
    public static final BitSet FOLLOW_ruleNumericalPrimary_in_ruleNumericalPrimary3162 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleNumericalPrimary3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleNumericalPrimary3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable3237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable3288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral3328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleNumberLiteral3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE3419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOUBLE3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleDOUBLE3469 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE3486 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleDOUBLE3505 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE3520 = new BitSet(new long[]{0x0000000000000002L});

}