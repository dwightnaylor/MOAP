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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Given'", "','", "'Find'", "';'", "'Theorems:'", "'st'", "'|'", "'&'", "'('", "')'", "'forall'", "'exists'", "':'", "'TRUE'", "'FALSE'", "':-'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=5;
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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:76:1: ruleInput returns [EObject current=null] : (otherlv_0= 'Given' ( (lv_given_1_0= ruleProblem ) ) otherlv_2= ',' otherlv_3= 'Find' ( (lv_goal_4_0= ruleProblem ) ) (otherlv_5= ';' otherlv_6= 'Theorems:' ( (lv_theorems_7_0= ruleTheorem ) ) (otherlv_8= ';' ( (lv_theorems_9_0= ruleTheorem ) ) )* (otherlv_10= ';' )? )? ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_given_1_0 = null;

        EObject lv_goal_4_0 = null;

        EObject lv_theorems_7_0 = null;

        EObject lv_theorems_9_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:79:28: ( (otherlv_0= 'Given' ( (lv_given_1_0= ruleProblem ) ) otherlv_2= ',' otherlv_3= 'Find' ( (lv_goal_4_0= ruleProblem ) ) (otherlv_5= ';' otherlv_6= 'Theorems:' ( (lv_theorems_7_0= ruleTheorem ) ) (otherlv_8= ';' ( (lv_theorems_9_0= ruleTheorem ) ) )* (otherlv_10= ';' )? )? ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:80:1: (otherlv_0= 'Given' ( (lv_given_1_0= ruleProblem ) ) otherlv_2= ',' otherlv_3= 'Find' ( (lv_goal_4_0= ruleProblem ) ) (otherlv_5= ';' otherlv_6= 'Theorems:' ( (lv_theorems_7_0= ruleTheorem ) ) (otherlv_8= ';' ( (lv_theorems_9_0= ruleTheorem ) ) )* (otherlv_10= ';' )? )? )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:80:1: (otherlv_0= 'Given' ( (lv_given_1_0= ruleProblem ) ) otherlv_2= ',' otherlv_3= 'Find' ( (lv_goal_4_0= ruleProblem ) ) (otherlv_5= ';' otherlv_6= 'Theorems:' ( (lv_theorems_7_0= ruleTheorem ) ) (otherlv_8= ';' ( (lv_theorems_9_0= ruleTheorem ) ) )* (otherlv_10= ';' )? )? )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:80:3: otherlv_0= 'Given' ( (lv_given_1_0= ruleProblem ) ) otherlv_2= ',' otherlv_3= 'Find' ( (lv_goal_4_0= ruleProblem ) ) (otherlv_5= ';' otherlv_6= 'Theorems:' ( (lv_theorems_7_0= ruleTheorem ) ) (otherlv_8= ';' ( (lv_theorems_9_0= ruleTheorem ) ) )* (otherlv_10= ';' )? )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleInput122); 

                	newLeafNode(otherlv_0, grammarAccess.getInputAccess().getGivenKeyword_0());
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:84:1: ( (lv_given_1_0= ruleProblem ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:85:1: (lv_given_1_0= ruleProblem )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:85:1: (lv_given_1_0= ruleProblem )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:86:3: lv_given_1_0= ruleProblem
            {
             
            	        newCompositeNode(grammarAccess.getInputAccess().getGivenProblemParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleProblem_in_ruleInput143);
            lv_given_1_0=ruleProblem();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInputRule());
            	        }
                   		set(
                   			current, 
                   			"given",
                    		lv_given_1_0, 
                    		"Problem");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleInput155); 

                	newLeafNode(otherlv_2, grammarAccess.getInputAccess().getCommaKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleInput167); 

                	newLeafNode(otherlv_3, grammarAccess.getInputAccess().getFindKeyword_3());
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:110:1: ( (lv_goal_4_0= ruleProblem ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:111:1: (lv_goal_4_0= ruleProblem )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:111:1: (lv_goal_4_0= ruleProblem )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:112:3: lv_goal_4_0= ruleProblem
            {
             
            	        newCompositeNode(grammarAccess.getInputAccess().getGoalProblemParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleProblem_in_ruleInput188);
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

            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:128:2: (otherlv_5= ';' otherlv_6= 'Theorems:' ( (lv_theorems_7_0= ruleTheorem ) ) (otherlv_8= ';' ( (lv_theorems_9_0= ruleTheorem ) ) )* (otherlv_10= ';' )? )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:128:4: otherlv_5= ';' otherlv_6= 'Theorems:' ( (lv_theorems_7_0= ruleTheorem ) ) (otherlv_8= ';' ( (lv_theorems_9_0= ruleTheorem ) ) )* (otherlv_10= ';' )?
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleInput201); 

                        	newLeafNode(otherlv_5, grammarAccess.getInputAccess().getSemicolonKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleInput213); 

                        	newLeafNode(otherlv_6, grammarAccess.getInputAccess().getTheoremsKeyword_5_1());
                        
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:136:1: ( (lv_theorems_7_0= ruleTheorem ) )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:137:1: (lv_theorems_7_0= ruleTheorem )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:137:1: (lv_theorems_7_0= ruleTheorem )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:138:3: lv_theorems_7_0= ruleTheorem
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputAccess().getTheoremsTheoremParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTheorem_in_ruleInput234);
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

                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:154:2: (otherlv_8= ';' ( (lv_theorems_9_0= ruleTheorem ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            int LA1_1 = input.LA(2);

                            if ( (LA1_1==RULE_ID||LA1_1==19||(LA1_1>=21 && LA1_1<=22)||(LA1_1>=24 && LA1_1<=25)) ) {
                                alt1=1;
                            }


                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:154:4: otherlv_8= ';' ( (lv_theorems_9_0= ruleTheorem ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleInput247); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getInputAccess().getSemicolonKeyword_5_3_0());
                    	        
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:158:1: ( (lv_theorems_9_0= ruleTheorem ) )
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:159:1: (lv_theorems_9_0= ruleTheorem )
                    	    {
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:159:1: (lv_theorems_9_0= ruleTheorem )
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:160:3: lv_theorems_9_0= ruleTheorem
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInputAccess().getTheoremsTheoremParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTheorem_in_ruleInput268);
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
                    	    break loop1;
                        }
                    } while (true);

                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:176:4: (otherlv_10= ';' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==14) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:176:6: otherlv_10= ';'
                            {
                            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleInput283); 

                                	newLeafNode(otherlv_10, grammarAccess.getInputAccess().getSemicolonKeyword_5_4());
                                

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


    // $ANTLR start "entryRuleProblem"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:188:1: entryRuleProblem returns [EObject current=null] : iv_ruleProblem= ruleProblem EOF ;
    public final EObject entryRuleProblem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProblem = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:189:2: (iv_ruleProblem= ruleProblem EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:190:2: iv_ruleProblem= ruleProblem EOF
            {
             newCompositeNode(grammarAccess.getProblemRule()); 
            pushFollow(FOLLOW_ruleProblem_in_entryRuleProblem323);
            iv_ruleProblem=ruleProblem();

            state._fsp--;

             current =iv_ruleProblem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProblem333); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:197:1: ruleProblem returns [EObject current=null] : ( ( ( (lv_vars_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_ID ) ) )* ) otherlv_3= 'st' ( (lv_property_4_0= ruleORing ) ) ) ;
    public final EObject ruleProblem() throws RecognitionException {
        EObject current = null;

        Token lv_vars_0_0=null;
        Token otherlv_1=null;
        Token lv_vars_2_0=null;
        Token otherlv_3=null;
        EObject lv_property_4_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:200:28: ( ( ( ( (lv_vars_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_ID ) ) )* ) otherlv_3= 'st' ( (lv_property_4_0= ruleORing ) ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:201:1: ( ( ( (lv_vars_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_ID ) ) )* ) otherlv_3= 'st' ( (lv_property_4_0= ruleORing ) ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:201:1: ( ( ( (lv_vars_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_ID ) ) )* ) otherlv_3= 'st' ( (lv_property_4_0= ruleORing ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:201:2: ( ( (lv_vars_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_ID ) ) )* ) otherlv_3= 'st' ( (lv_property_4_0= ruleORing ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:201:2: ( ( (lv_vars_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_ID ) ) )* )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:201:3: ( (lv_vars_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_ID ) ) )*
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:201:3: ( (lv_vars_0_0= RULE_ID ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:202:1: (lv_vars_0_0= RULE_ID )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:202:1: (lv_vars_0_0= RULE_ID )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:203:3: lv_vars_0_0= RULE_ID
            {
            lv_vars_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProblem376); 

            			newLeafNode(lv_vars_0_0, grammarAccess.getProblemAccess().getVarsIDTerminalRuleCall_0_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProblemRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"vars",
                    		lv_vars_0_0, 
                    		"ID");
            	    

            }


            }

            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:219:2: (otherlv_1= ',' ( (lv_vars_2_0= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:219:4: otherlv_1= ',' ( (lv_vars_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleProblem394); 

            	        	newLeafNode(otherlv_1, grammarAccess.getProblemAccess().getCommaKeyword_0_1_0());
            	        
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:223:1: ( (lv_vars_2_0= RULE_ID ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:224:1: (lv_vars_2_0= RULE_ID )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:224:1: (lv_vars_2_0= RULE_ID )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:225:3: lv_vars_2_0= RULE_ID
            	    {
            	    lv_vars_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProblem411); 

            	    			newLeafNode(lv_vars_2_0, grammarAccess.getProblemAccess().getVarsIDTerminalRuleCall_0_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getProblemRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"vars",
            	            		lv_vars_2_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleProblem431); 

                	newLeafNode(otherlv_3, grammarAccess.getProblemAccess().getStKeyword_1());
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:245:1: ( (lv_property_4_0= ruleORing ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:246:1: (lv_property_4_0= ruleORing )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:246:1: (lv_property_4_0= ruleORing )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:247:3: lv_property_4_0= ruleORing
            {
             
            	        newCompositeNode(grammarAccess.getProblemAccess().getPropertyORingParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleORing_in_ruleProblem452);
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


    // $ANTLR start "entryRuleORing"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:271:1: entryRuleORing returns [EObject current=null] : iv_ruleORing= ruleORing EOF ;
    public final EObject entryRuleORing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleORing = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:272:2: (iv_ruleORing= ruleORing EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:273:2: iv_ruleORing= ruleORing EOF
            {
             newCompositeNode(grammarAccess.getORingRule()); 
            pushFollow(FOLLOW_ruleORing_in_entryRuleORing488);
            iv_ruleORing=ruleORing();

            state._fsp--;

             current =iv_ruleORing; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleORing498); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:280:1: ruleORing returns [EObject current=null] : (this_ANDing_0= ruleANDing ( () otherlv_2= '|' ( (lv_right_3_0= ruleANDing ) ) )* ) ;
    public final EObject ruleORing() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ANDing_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:283:28: ( (this_ANDing_0= ruleANDing ( () otherlv_2= '|' ( (lv_right_3_0= ruleANDing ) ) )* ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:284:1: (this_ANDing_0= ruleANDing ( () otherlv_2= '|' ( (lv_right_3_0= ruleANDing ) ) )* )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:284:1: (this_ANDing_0= ruleANDing ( () otherlv_2= '|' ( (lv_right_3_0= ruleANDing ) ) )* )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:285:5: this_ANDing_0= ruleANDing ( () otherlv_2= '|' ( (lv_right_3_0= ruleANDing ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getORingAccess().getANDingParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleANDing_in_ruleORing545);
            this_ANDing_0=ruleANDing();

            state._fsp--;

             
                    current = this_ANDing_0; 
                    afterParserOrEnumRuleCall();
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:293:1: ( () otherlv_2= '|' ( (lv_right_3_0= ruleANDing ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:293:2: () otherlv_2= '|' ( (lv_right_3_0= ruleANDing ) )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:293:2: ()
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:294:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getORingAccess().getORingLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleORing566); 

            	        	newLeafNode(otherlv_2, grammarAccess.getORingAccess().getVerticalLineKeyword_1_1());
            	        
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:303:1: ( (lv_right_3_0= ruleANDing ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:304:1: (lv_right_3_0= ruleANDing )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:304:1: (lv_right_3_0= ruleANDing )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:305:3: lv_right_3_0= ruleANDing
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getORingAccess().getRightANDingParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleANDing_in_ruleORing587);
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
            	    break loop5;
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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:329:1: entryRuleANDing returns [EObject current=null] : iv_ruleANDing= ruleANDing EOF ;
    public final EObject entryRuleANDing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleANDing = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:330:2: (iv_ruleANDing= ruleANDing EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:331:2: iv_ruleANDing= ruleANDing EOF
            {
             newCompositeNode(grammarAccess.getANDingRule()); 
            pushFollow(FOLLOW_ruleANDing_in_entryRuleANDing625);
            iv_ruleANDing=ruleANDing();

            state._fsp--;

             current =iv_ruleANDing; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleANDing635); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:338:1: ruleANDing returns [EObject current=null] : (this_Primary_0= rulePrimary ( () otherlv_2= '&' ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleANDing() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:341:28: ( (this_Primary_0= rulePrimary ( () otherlv_2= '&' ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:342:1: (this_Primary_0= rulePrimary ( () otherlv_2= '&' ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:342:1: (this_Primary_0= rulePrimary ( () otherlv_2= '&' ( (lv_right_3_0= rulePrimary ) ) )* )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:343:5: this_Primary_0= rulePrimary ( () otherlv_2= '&' ( (lv_right_3_0= rulePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getANDingAccess().getPrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimary_in_ruleANDing682);
            this_Primary_0=rulePrimary();

            state._fsp--;

             
                    current = this_Primary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:351:1: ( () otherlv_2= '&' ( (lv_right_3_0= rulePrimary ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:351:2: () otherlv_2= '&' ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:351:2: ()
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:352:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getANDingAccess().getANDingLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleANDing703); 

            	        	newLeafNode(otherlv_2, grammarAccess.getANDingAccess().getAmpersandKeyword_1_1());
            	        
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:361:1: ( (lv_right_3_0= rulePrimary ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:362:1: (lv_right_3_0= rulePrimary )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:362:1: (lv_right_3_0= rulePrimary )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:363:3: lv_right_3_0= rulePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getANDingAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimary_in_ruleANDing724);
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
            	    break loop6;
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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:387:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:388:2: (iv_rulePrimary= rulePrimary EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:389:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary762);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary772); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:396:1: rulePrimary returns [EObject current=null] : (this_Atomic_0= ruleAtomic | this_Quantifier_1= ruleQuantifier | (otherlv_2= '(' this_ORing_3= ruleORing otherlv_4= ')' ) | this_BooleanLiteral_5= ruleBooleanLiteral ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Atomic_0 = null;

        EObject this_Quantifier_1 = null;

        EObject this_ORing_3 = null;

        EObject this_BooleanLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:399:28: ( (this_Atomic_0= ruleAtomic | this_Quantifier_1= ruleQuantifier | (otherlv_2= '(' this_ORing_3= ruleORing otherlv_4= ')' ) | this_BooleanLiteral_5= ruleBooleanLiteral ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:400:1: (this_Atomic_0= ruleAtomic | this_Quantifier_1= ruleQuantifier | (otherlv_2= '(' this_ORing_3= ruleORing otherlv_4= ')' ) | this_BooleanLiteral_5= ruleBooleanLiteral )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:400:1: (this_Atomic_0= ruleAtomic | this_Quantifier_1= ruleQuantifier | (otherlv_2= '(' this_ORing_3= ruleORing otherlv_4= ')' ) | this_BooleanLiteral_5= ruleBooleanLiteral )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case 21:
            case 22:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            case 24:
            case 25:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:401:5: this_Atomic_0= ruleAtomic
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAtomic_in_rulePrimary819);
                    this_Atomic_0=ruleAtomic();

                    state._fsp--;

                     
                            current = this_Atomic_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:411:5: this_Quantifier_1= ruleQuantifier
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getQuantifierParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleQuantifier_in_rulePrimary846);
                    this_Quantifier_1=ruleQuantifier();

                    state._fsp--;

                     
                            current = this_Quantifier_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:420:6: (otherlv_2= '(' this_ORing_3= ruleORing otherlv_4= ')' )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:420:6: (otherlv_2= '(' this_ORing_3= ruleORing otherlv_4= ')' )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:420:8: otherlv_2= '(' this_ORing_3= ruleORing otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_rulePrimary864); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getORingParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleORing_in_rulePrimary886);
                    this_ORing_3=ruleORing();

                    state._fsp--;

                     
                            current = this_ORing_3; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_rulePrimary897); 

                        	newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:439:5: this_BooleanLiteral_5= ruleBooleanLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getBooleanLiteralParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_rulePrimary926);
                    this_BooleanLiteral_5=ruleBooleanLiteral();

                    state._fsp--;

                     
                            current = this_BooleanLiteral_5; 
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


    // $ANTLR start "entryRuleQuantifier"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:455:1: entryRuleQuantifier returns [EObject current=null] : iv_ruleQuantifier= ruleQuantifier EOF ;
    public final EObject entryRuleQuantifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifier = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:456:2: (iv_ruleQuantifier= ruleQuantifier EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:457:2: iv_ruleQuantifier= ruleQuantifier EOF
            {
             newCompositeNode(grammarAccess.getQuantifierRule()); 
            pushFollow(FOLLOW_ruleQuantifier_in_entryRuleQuantifier961);
            iv_ruleQuantifier=ruleQuantifier();

            state._fsp--;

             current =iv_ruleQuantifier; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantifier971); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:464:1: ruleQuantifier returns [EObject current=null] : ( ( ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) ) ) otherlv_1= '(' ( (lv_subject_2_0= ruleProblem ) ) otherlv_3= ':' ( (lv_predicate_4_0= ruleORing ) ) otherlv_5= ')' ) ;
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
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:467:28: ( ( ( ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) ) ) otherlv_1= '(' ( (lv_subject_2_0= ruleProblem ) ) otherlv_3= ':' ( (lv_predicate_4_0= ruleORing ) ) otherlv_5= ')' ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:468:1: ( ( ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) ) ) otherlv_1= '(' ( (lv_subject_2_0= ruleProblem ) ) otherlv_3= ':' ( (lv_predicate_4_0= ruleORing ) ) otherlv_5= ')' )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:468:1: ( ( ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) ) ) otherlv_1= '(' ( (lv_subject_2_0= ruleProblem ) ) otherlv_3= ':' ( (lv_predicate_4_0= ruleORing ) ) otherlv_5= ')' )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:468:2: ( ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) ) ) otherlv_1= '(' ( (lv_subject_2_0= ruleProblem ) ) otherlv_3= ':' ( (lv_predicate_4_0= ruleORing ) ) otherlv_5= ')'
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:468:2: ( ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:469:1: ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:469:1: ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:470:1: (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:470:1: (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:471:3: lv_quantifier_0_1= 'forall'
                    {
                    lv_quantifier_0_1=(Token)match(input,21,FOLLOW_21_in_ruleQuantifier1016); 

                            newLeafNode(lv_quantifier_0_1, grammarAccess.getQuantifierAccess().getQuantifierForallKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuantifierRule());
                    	        }
                           		setWithLastConsumed(current, "quantifier", lv_quantifier_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:483:8: lv_quantifier_0_2= 'exists'
                    {
                    lv_quantifier_0_2=(Token)match(input,22,FOLLOW_22_in_ruleQuantifier1045); 

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

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleQuantifier1073); 

                	newLeafNode(otherlv_1, grammarAccess.getQuantifierAccess().getLeftParenthesisKeyword_1());
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:502:1: ( (lv_subject_2_0= ruleProblem ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:503:1: (lv_subject_2_0= ruleProblem )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:503:1: (lv_subject_2_0= ruleProblem )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:504:3: lv_subject_2_0= ruleProblem
            {
             
            	        newCompositeNode(grammarAccess.getQuantifierAccess().getSubjectProblemParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleProblem_in_ruleQuantifier1094);
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

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleQuantifier1106); 

                	newLeafNode(otherlv_3, grammarAccess.getQuantifierAccess().getColonKeyword_3());
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:524:1: ( (lv_predicate_4_0= ruleORing ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:525:1: (lv_predicate_4_0= ruleORing )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:525:1: (lv_predicate_4_0= ruleORing )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:526:3: lv_predicate_4_0= ruleORing
            {
             
            	        newCompositeNode(grammarAccess.getQuantifierAccess().getPredicateORingParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleORing_in_ruleQuantifier1127);
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

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleQuantifier1139); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:554:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:555:2: (iv_ruleAtomic= ruleAtomic EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:556:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic1175);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic1185); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:563:1: ruleAtomic returns [EObject current=null] : ( ( (lv_Function_0_0= RULE_ID ) ) (otherlv_1= '(' ( ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* )? otherlv_5= ')' )? ) ;
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
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:566:28: ( ( ( (lv_Function_0_0= RULE_ID ) ) (otherlv_1= '(' ( ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* )? otherlv_5= ')' )? ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:567:1: ( ( (lv_Function_0_0= RULE_ID ) ) (otherlv_1= '(' ( ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* )? otherlv_5= ')' )? )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:567:1: ( ( (lv_Function_0_0= RULE_ID ) ) (otherlv_1= '(' ( ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* )? otherlv_5= ')' )? )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:567:2: ( (lv_Function_0_0= RULE_ID ) ) (otherlv_1= '(' ( ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* )? otherlv_5= ')' )?
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:567:2: ( (lv_Function_0_0= RULE_ID ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:568:1: (lv_Function_0_0= RULE_ID )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:568:1: (lv_Function_0_0= RULE_ID )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:569:3: lv_Function_0_0= RULE_ID
            {
            lv_Function_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomic1227); 

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

            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:585:2: (otherlv_1= '(' ( ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* )? otherlv_5= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:585:4: otherlv_1= '(' ( ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* )? otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleAtomic1245); 

                        	newLeafNode(otherlv_1, grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:589:1: ( ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_ID) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:589:2: ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )*
                            {
                            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:589:2: ( (lv_args_2_0= RULE_ID ) )
                            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:590:1: (lv_args_2_0= RULE_ID )
                            {
                            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:590:1: (lv_args_2_0= RULE_ID )
                            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:591:3: lv_args_2_0= RULE_ID
                            {
                            lv_args_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomic1263); 

                            			newLeafNode(lv_args_2_0, grammarAccess.getAtomicAccess().getArgsIDTerminalRuleCall_1_1_0_0()); 
                            		

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

                            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:607:2: (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )*
                            loop9:
                            do {
                                int alt9=2;
                                int LA9_0 = input.LA(1);

                                if ( (LA9_0==12) ) {
                                    alt9=1;
                                }


                                switch (alt9) {
                            	case 1 :
                            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:607:4: otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) )
                            	    {
                            	    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleAtomic1281); 

                            	        	newLeafNode(otherlv_3, grammarAccess.getAtomicAccess().getCommaKeyword_1_1_1_0());
                            	        
                            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:611:1: ( (lv_args_4_0= RULE_ID ) )
                            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:612:1: (lv_args_4_0= RULE_ID )
                            	    {
                            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:612:1: (lv_args_4_0= RULE_ID )
                            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:613:3: lv_args_4_0= RULE_ID
                            	    {
                            	    lv_args_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomic1298); 

                            	    			newLeafNode(lv_args_4_0, grammarAccess.getAtomicAccess().getArgsIDTerminalRuleCall_1_1_1_1_0()); 
                            	    		

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
                            	    break;

                            	default :
                            	    break loop9;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleAtomic1319); 

                        	newLeafNode(otherlv_5, grammarAccess.getAtomicAccess().getRightParenthesisKeyword_1_2());
                        

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
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:641:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:642:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:643:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1357);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral1367); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:650:1: ruleBooleanLiteral returns [EObject current=null] : ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;

         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:653:28: ( ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:654:1: ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:654:1: ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:655:1: ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:655:1: ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:656:1: (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:656:1: (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            else if ( (LA12_0==25) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:657:3: lv_value_0_1= 'TRUE'
                    {
                    lv_value_0_1=(Token)match(input,24,FOLLOW_24_in_ruleBooleanLiteral1411); 

                            newLeafNode(lv_value_0_1, grammarAccess.getBooleanLiteralAccess().getValueTRUEKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:669:8: lv_value_0_2= 'FALSE'
                    {
                    lv_value_0_2=(Token)match(input,25,FOLLOW_25_in_ruleBooleanLiteral1440); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:692:1: entryRuleTheorem returns [EObject current=null] : iv_ruleTheorem= ruleTheorem EOF ;
    public final EObject entryRuleTheorem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheorem = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:693:2: (iv_ruleTheorem= ruleTheorem EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:694:2: iv_ruleTheorem= ruleTheorem EOF
            {
             newCompositeNode(grammarAccess.getTheoremRule()); 
            pushFollow(FOLLOW_ruleTheorem_in_entryRuleTheorem1491);
            iv_ruleTheorem=ruleTheorem();

            state._fsp--;

             current =iv_ruleTheorem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTheorem1501); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:701:1: ruleTheorem returns [EObject current=null] : ( ( (lv_Requirement_0_0= ruleORing ) ) otherlv_1= ':-' ( (lv_Result_2_0= ruleORing ) ) otherlv_3= ',' ( (lv_Cost_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_Description_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_PseudoCode_8_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleTheorem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
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
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:704:28: ( ( ( (lv_Requirement_0_0= ruleORing ) ) otherlv_1= ':-' ( (lv_Result_2_0= ruleORing ) ) otherlv_3= ',' ( (lv_Cost_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_Description_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_PseudoCode_8_0= RULE_STRING ) ) )? ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:705:1: ( ( (lv_Requirement_0_0= ruleORing ) ) otherlv_1= ':-' ( (lv_Result_2_0= ruleORing ) ) otherlv_3= ',' ( (lv_Cost_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_Description_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_PseudoCode_8_0= RULE_STRING ) ) )? )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:705:1: ( ( (lv_Requirement_0_0= ruleORing ) ) otherlv_1= ':-' ( (lv_Result_2_0= ruleORing ) ) otherlv_3= ',' ( (lv_Cost_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_Description_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_PseudoCode_8_0= RULE_STRING ) ) )? )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:705:2: ( (lv_Requirement_0_0= ruleORing ) ) otherlv_1= ':-' ( (lv_Result_2_0= ruleORing ) ) otherlv_3= ',' ( (lv_Cost_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_Description_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_PseudoCode_8_0= RULE_STRING ) ) )?
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:705:2: ( (lv_Requirement_0_0= ruleORing ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:706:1: (lv_Requirement_0_0= ruleORing )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:706:1: (lv_Requirement_0_0= ruleORing )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:707:3: lv_Requirement_0_0= ruleORing
            {
             
            	        newCompositeNode(grammarAccess.getTheoremAccess().getRequirementORingParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleORing_in_ruleTheorem1547);
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

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleTheorem1559); 

                	newLeafNode(otherlv_1, grammarAccess.getTheoremAccess().getColonHyphenMinusKeyword_1());
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:727:1: ( (lv_Result_2_0= ruleORing ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:728:1: (lv_Result_2_0= ruleORing )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:728:1: (lv_Result_2_0= ruleORing )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:729:3: lv_Result_2_0= ruleORing
            {
             
            	        newCompositeNode(grammarAccess.getTheoremAccess().getResultORingParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleORing_in_ruleTheorem1580);
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

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleTheorem1592); 

                	newLeafNode(otherlv_3, grammarAccess.getTheoremAccess().getCommaKeyword_3());
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:749:1: ( (lv_Cost_4_0= RULE_INT ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:750:1: (lv_Cost_4_0= RULE_INT )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:750:1: (lv_Cost_4_0= RULE_INT )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:751:3: lv_Cost_4_0= RULE_INT
            {
            lv_Cost_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTheorem1609); 

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

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleTheorem1626); 

                	newLeafNode(otherlv_5, grammarAccess.getTheoremAccess().getCommaKeyword_5());
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:771:1: ( (lv_Description_6_0= RULE_STRING ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:772:1: (lv_Description_6_0= RULE_STRING )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:772:1: (lv_Description_6_0= RULE_STRING )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:773:3: lv_Description_6_0= RULE_STRING
            {
            lv_Description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTheorem1643); 

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

            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:789:2: (otherlv_7= ',' ( (lv_PseudoCode_8_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==12) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:789:4: otherlv_7= ',' ( (lv_PseudoCode_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruleTheorem1661); 

                        	newLeafNode(otherlv_7, grammarAccess.getTheoremAccess().getCommaKeyword_7_0());
                        
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:793:1: ( (lv_PseudoCode_8_0= RULE_STRING ) )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:794:1: (lv_PseudoCode_8_0= RULE_STRING )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:794:1: (lv_PseudoCode_8_0= RULE_STRING )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:795:3: lv_PseudoCode_8_0= RULE_STRING
                    {
                    lv_PseudoCode_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTheorem1678); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleInput122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProblem_in_ruleInput143 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInput155 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleInput167 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProblem_in_ruleInput188 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleInput201 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInput213 = new BitSet(new long[]{0x0000000003680010L});
    public static final BitSet FOLLOW_ruleTheorem_in_ruleInput234 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleInput247 = new BitSet(new long[]{0x0000000003680010L});
    public static final BitSet FOLLOW_ruleTheorem_in_ruleInput268 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleInput283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblem_in_entryRuleProblem323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProblem333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProblem376 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_12_in_ruleProblem394 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProblem411 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_16_in_ruleProblem431 = new BitSet(new long[]{0x0000000003680010L});
    public static final BitSet FOLLOW_ruleORing_in_ruleProblem452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_entryRuleORing488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleORing498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANDing_in_ruleORing545 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleORing566 = new BitSet(new long[]{0x0000000003680010L});
    public static final BitSet FOLLOW_ruleANDing_in_ruleORing587 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleANDing_in_entryRuleANDing625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleANDing635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleANDing682 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleANDing703 = new BitSet(new long[]{0x0000000003680010L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleANDing724 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rulePrimary819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_rulePrimary846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePrimary864 = new BitSet(new long[]{0x0000000003680010L});
    public static final BitSet FOLLOW_ruleORing_in_rulePrimary886 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePrimary897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rulePrimary926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_entryRuleQuantifier961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantifier971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleQuantifier1016 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_22_in_ruleQuantifier1045 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQuantifier1073 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProblem_in_ruleQuantifier1094 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleQuantifier1106 = new BitSet(new long[]{0x0000000003680010L});
    public static final BitSet FOLLOW_ruleORing_in_ruleQuantifier1127 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleQuantifier1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic1175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomic1227 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleAtomic1245 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomic1263 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_12_in_ruleAtomic1281 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomic1298 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_20_in_ruleAtomic1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleBooleanLiteral1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleBooleanLiteral1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTheorem_in_entryRuleTheorem1491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTheorem1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_ruleTheorem1547 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleTheorem1559 = new BitSet(new long[]{0x0000000003680010L});
    public static final BitSet FOLLOW_ruleORing_in_ruleTheorem1580 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTheorem1592 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTheorem1609 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTheorem1626 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTheorem1643 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleTheorem1661 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTheorem1678 = new BitSet(new long[]{0x0000000000000002L});

}