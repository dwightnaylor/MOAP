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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Given'", "';'", "'Find'", "'Theorems:'", "','", "'st'", "'('", "')'", "'<'", "'>'", "'|'", "'&'", "'forall'", "'exists'", "':'", "'TRUE'", "'FALSE'", "':-'"
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
    public static final int T__27=27;
    public static final int T__28=28;
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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:76:1: ruleInput returns [EObject current=null] : (otherlv_0= 'Given' ( (lv_given_1_0= ruleProblem ) ) otherlv_2= ';' otherlv_3= 'Find' ( (lv_goal_4_0= ruleProblem ) ) (otherlv_5= ';' otherlv_6= 'Theorems:' ( (lv_theorems_7_0= ruleTheorem ) ) (otherlv_8= ';' ( (lv_theorems_9_0= ruleTheorem ) ) )* (otherlv_10= ';' )? )? ) ;
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
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:79:28: ( (otherlv_0= 'Given' ( (lv_given_1_0= ruleProblem ) ) otherlv_2= ';' otherlv_3= 'Find' ( (lv_goal_4_0= ruleProblem ) ) (otherlv_5= ';' otherlv_6= 'Theorems:' ( (lv_theorems_7_0= ruleTheorem ) ) (otherlv_8= ';' ( (lv_theorems_9_0= ruleTheorem ) ) )* (otherlv_10= ';' )? )? ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:80:1: (otherlv_0= 'Given' ( (lv_given_1_0= ruleProblem ) ) otherlv_2= ';' otherlv_3= 'Find' ( (lv_goal_4_0= ruleProblem ) ) (otherlv_5= ';' otherlv_6= 'Theorems:' ( (lv_theorems_7_0= ruleTheorem ) ) (otherlv_8= ';' ( (lv_theorems_9_0= ruleTheorem ) ) )* (otherlv_10= ';' )? )? )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:80:1: (otherlv_0= 'Given' ( (lv_given_1_0= ruleProblem ) ) otherlv_2= ';' otherlv_3= 'Find' ( (lv_goal_4_0= ruleProblem ) ) (otherlv_5= ';' otherlv_6= 'Theorems:' ( (lv_theorems_7_0= ruleTheorem ) ) (otherlv_8= ';' ( (lv_theorems_9_0= ruleTheorem ) ) )* (otherlv_10= ';' )? )? )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:80:3: otherlv_0= 'Given' ( (lv_given_1_0= ruleProblem ) ) otherlv_2= ';' otherlv_3= 'Find' ( (lv_goal_4_0= ruleProblem ) ) (otherlv_5= ';' otherlv_6= 'Theorems:' ( (lv_theorems_7_0= ruleTheorem ) ) (otherlv_8= ';' ( (lv_theorems_9_0= ruleTheorem ) ) )* (otherlv_10= ';' )? )?
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

                	newLeafNode(otherlv_2, grammarAccess.getInputAccess().getSemicolonKeyword_2());
                
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

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:128:4: otherlv_5= ';' otherlv_6= 'Theorems:' ( (lv_theorems_7_0= ruleTheorem ) ) (otherlv_8= ';' ( (lv_theorems_9_0= ruleTheorem ) ) )* (otherlv_10= ';' )?
                    {
                    otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleInput201); 

                        	newLeafNode(otherlv_5, grammarAccess.getInputAccess().getSemicolonKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleInput213); 

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

                        if ( (LA1_0==12) ) {
                            int LA1_1 = input.LA(2);

                            if ( (LA1_1==RULE_ID||LA1_1==17||(LA1_1>=23 && LA1_1<=24)||(LA1_1>=26 && LA1_1<=27)) ) {
                                alt1=1;
                            }


                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:154:4: otherlv_8= ';' ( (lv_theorems_9_0= ruleTheorem ) )
                    	    {
                    	    otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleInput247); 

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

                    if ( (LA2_0==12) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:176:6: otherlv_10= ';'
                            {
                            otherlv_10=(Token)match(input,12,FOLLOW_12_in_ruleInput283); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:197:1: ruleProblem returns [EObject current=null] : ( ( ( (lv_vars_0_0= ruleDeclaration ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) ) )* ) otherlv_3= 'st' ( (lv_property_4_0= ruleORing ) ) ) ;
    public final EObject ruleProblem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_vars_0_0 = null;

        EObject lv_vars_2_0 = null;

        EObject lv_property_4_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:200:28: ( ( ( ( (lv_vars_0_0= ruleDeclaration ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) ) )* ) otherlv_3= 'st' ( (lv_property_4_0= ruleORing ) ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:201:1: ( ( ( (lv_vars_0_0= ruleDeclaration ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) ) )* ) otherlv_3= 'st' ( (lv_property_4_0= ruleORing ) ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:201:1: ( ( ( (lv_vars_0_0= ruleDeclaration ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) ) )* ) otherlv_3= 'st' ( (lv_property_4_0= ruleORing ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:201:2: ( ( (lv_vars_0_0= ruleDeclaration ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) ) )* ) otherlv_3= 'st' ( (lv_property_4_0= ruleORing ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:201:2: ( ( (lv_vars_0_0= ruleDeclaration ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) ) )* )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:201:3: ( (lv_vars_0_0= ruleDeclaration ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) ) )*
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:201:3: ( (lv_vars_0_0= ruleDeclaration ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:202:1: (lv_vars_0_0= ruleDeclaration )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:202:1: (lv_vars_0_0= ruleDeclaration )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:203:3: lv_vars_0_0= ruleDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getProblemAccess().getVarsDeclarationParserRuleCall_0_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDeclaration_in_ruleProblem380);
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

            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:219:2: (otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:219:4: otherlv_1= ',' ( (lv_vars_2_0= ruleDeclaration ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleProblem393); 

            	        	newLeafNode(otherlv_1, grammarAccess.getProblemAccess().getCommaKeyword_0_1_0());
            	        
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:223:1: ( (lv_vars_2_0= ruleDeclaration ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:224:1: (lv_vars_2_0= ruleDeclaration )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:224:1: (lv_vars_2_0= ruleDeclaration )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:225:3: lv_vars_2_0= ruleDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProblemAccess().getVarsDeclarationParserRuleCall_0_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleProblem414);
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
            	    break loop4;
                }
            } while (true);


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleProblem429); 

                	newLeafNode(otherlv_3, grammarAccess.getProblemAccess().getStKeyword_1());
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:245:1: ( (lv_property_4_0= ruleORing ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:246:1: (lv_property_4_0= ruleORing )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:246:1: (lv_property_4_0= ruleORing )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:247:3: lv_property_4_0= ruleORing
            {
             
            	        newCompositeNode(grammarAccess.getProblemAccess().getPropertyORingParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleORing_in_ruleProblem450);
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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:271:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:272:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:273:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration486);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration496); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:280:1: ruleDeclaration returns [EObject current=null] : ( ( ( (lv_type_0_0= ruleType ) ) otherlv_1= '(' ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= ')' ) | ( (lv_varName_4_0= RULE_ID ) ) ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_varName_2_0=null;
        Token otherlv_3=null;
        Token lv_varName_4_0=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:283:28: ( ( ( ( (lv_type_0_0= ruleType ) ) otherlv_1= '(' ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= ')' ) | ( (lv_varName_4_0= RULE_ID ) ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:284:1: ( ( ( (lv_type_0_0= ruleType ) ) otherlv_1= '(' ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= ')' ) | ( (lv_varName_4_0= RULE_ID ) ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:284:1: ( ( ( (lv_type_0_0= ruleType ) ) otherlv_1= '(' ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= ')' ) | ( (lv_varName_4_0= RULE_ID ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||(LA5_1>=15 && LA5_1<=16)) ) {
                    alt5=2;
                }
                else if ( (LA5_1==17||LA5_1==19) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:284:2: ( ( (lv_type_0_0= ruleType ) ) otherlv_1= '(' ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= ')' )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:284:2: ( ( (lv_type_0_0= ruleType ) ) otherlv_1= '(' ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= ')' )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:284:3: ( (lv_type_0_0= ruleType ) ) otherlv_1= '(' ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= ')'
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:284:3: ( (lv_type_0_0= ruleType ) )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:285:1: (lv_type_0_0= ruleType )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:285:1: (lv_type_0_0= ruleType )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:286:3: lv_type_0_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeclarationAccess().getTypeTypeParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleDeclaration543);
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

                    otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleDeclaration555); 

                        	newLeafNode(otherlv_1, grammarAccess.getDeclarationAccess().getLeftParenthesisKeyword_0_1());
                        
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:306:1: ( (lv_varName_2_0= RULE_ID ) )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:307:1: (lv_varName_2_0= RULE_ID )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:307:1: (lv_varName_2_0= RULE_ID )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:308:3: lv_varName_2_0= RULE_ID
                    {
                    lv_varName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeclaration572); 

                    			newLeafNode(lv_varName_2_0, grammarAccess.getDeclarationAccess().getVarNameIDTerminalRuleCall_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"varName",
                            		lv_varName_2_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleDeclaration589); 

                        	newLeafNode(otherlv_3, grammarAccess.getDeclarationAccess().getRightParenthesisKeyword_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:329:6: ( (lv_varName_4_0= RULE_ID ) )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:329:6: ( (lv_varName_4_0= RULE_ID ) )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:330:1: (lv_varName_4_0= RULE_ID )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:330:1: (lv_varName_4_0= RULE_ID )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:331:3: lv_varName_4_0= RULE_ID
                    {
                    lv_varName_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeclaration613); 

                    			newLeafNode(lv_varName_4_0, grammarAccess.getDeclarationAccess().getVarNameIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"varName",
                            		lv_varName_4_0, 
                            		"ID");
                    	    

                    }


                    }


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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleType"
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:355:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:356:2: (iv_ruleType= ruleType EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:357:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType654);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType664); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:364:1: ruleType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '<' ( (lv_templateType_2_0= ruleType ) ) otherlv_3= '>' )? ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_templateType_2_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:367:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '<' ( (lv_templateType_2_0= ruleType ) ) otherlv_3= '>' )? ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:368:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '<' ( (lv_templateType_2_0= ruleType ) ) otherlv_3= '>' )? )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:368:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '<' ( (lv_templateType_2_0= ruleType ) ) otherlv_3= '>' )? )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:368:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '<' ( (lv_templateType_2_0= ruleType ) ) otherlv_3= '>' )?
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:368:2: ( (lv_name_0_0= RULE_ID ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:369:1: (lv_name_0_0= RULE_ID )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:369:1: (lv_name_0_0= RULE_ID )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:370:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleType706); 

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

            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:386:2: (otherlv_1= '<' ( (lv_templateType_2_0= ruleType ) ) otherlv_3= '>' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:386:4: otherlv_1= '<' ( (lv_templateType_2_0= ruleType ) ) otherlv_3= '>'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleType724); 

                        	newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getLessThanSignKeyword_1_0());
                        
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:390:1: ( (lv_templateType_2_0= ruleType ) )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:391:1: (lv_templateType_2_0= ruleType )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:391:1: (lv_templateType_2_0= ruleType )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:392:3: lv_templateType_2_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getTemplateTypeTypeParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleType745);
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

                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleType757); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:420:1: entryRuleORing returns [EObject current=null] : iv_ruleORing= ruleORing EOF ;
    public final EObject entryRuleORing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleORing = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:421:2: (iv_ruleORing= ruleORing EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:422:2: iv_ruleORing= ruleORing EOF
            {
             newCompositeNode(grammarAccess.getORingRule()); 
            pushFollow(FOLLOW_ruleORing_in_entryRuleORing795);
            iv_ruleORing=ruleORing();

            state._fsp--;

             current =iv_ruleORing; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleORing805); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:429:1: ruleORing returns [EObject current=null] : (this_ANDing_0= ruleANDing ( () otherlv_2= '|' ( (lv_right_3_0= ruleANDing ) ) )* ) ;
    public final EObject ruleORing() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ANDing_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:432:28: ( (this_ANDing_0= ruleANDing ( () otherlv_2= '|' ( (lv_right_3_0= ruleANDing ) ) )* ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:433:1: (this_ANDing_0= ruleANDing ( () otherlv_2= '|' ( (lv_right_3_0= ruleANDing ) ) )* )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:433:1: (this_ANDing_0= ruleANDing ( () otherlv_2= '|' ( (lv_right_3_0= ruleANDing ) ) )* )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:434:5: this_ANDing_0= ruleANDing ( () otherlv_2= '|' ( (lv_right_3_0= ruleANDing ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getORingAccess().getANDingParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleANDing_in_ruleORing852);
            this_ANDing_0=ruleANDing();

            state._fsp--;

             
                    current = this_ANDing_0; 
                    afterParserOrEnumRuleCall();
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:442:1: ( () otherlv_2= '|' ( (lv_right_3_0= ruleANDing ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:442:2: () otherlv_2= '|' ( (lv_right_3_0= ruleANDing ) )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:442:2: ()
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:443:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getORingAccess().getORingLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleORing873); 

            	        	newLeafNode(otherlv_2, grammarAccess.getORingAccess().getVerticalLineKeyword_1_1());
            	        
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:452:1: ( (lv_right_3_0= ruleANDing ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:453:1: (lv_right_3_0= ruleANDing )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:453:1: (lv_right_3_0= ruleANDing )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:454:3: lv_right_3_0= ruleANDing
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getORingAccess().getRightANDingParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleANDing_in_ruleORing894);
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
            	    break loop7;
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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:478:1: entryRuleANDing returns [EObject current=null] : iv_ruleANDing= ruleANDing EOF ;
    public final EObject entryRuleANDing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleANDing = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:479:2: (iv_ruleANDing= ruleANDing EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:480:2: iv_ruleANDing= ruleANDing EOF
            {
             newCompositeNode(grammarAccess.getANDingRule()); 
            pushFollow(FOLLOW_ruleANDing_in_entryRuleANDing932);
            iv_ruleANDing=ruleANDing();

            state._fsp--;

             current =iv_ruleANDing; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleANDing942); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:487:1: ruleANDing returns [EObject current=null] : (this_Primary_0= rulePrimary ( () otherlv_2= '&' ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleANDing() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:490:28: ( (this_Primary_0= rulePrimary ( () otherlv_2= '&' ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:491:1: (this_Primary_0= rulePrimary ( () otherlv_2= '&' ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:491:1: (this_Primary_0= rulePrimary ( () otherlv_2= '&' ( (lv_right_3_0= rulePrimary ) ) )* )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:492:5: this_Primary_0= rulePrimary ( () otherlv_2= '&' ( (lv_right_3_0= rulePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getANDingAccess().getPrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimary_in_ruleANDing989);
            this_Primary_0=rulePrimary();

            state._fsp--;

             
                    current = this_Primary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:500:1: ( () otherlv_2= '&' ( (lv_right_3_0= rulePrimary ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:500:2: () otherlv_2= '&' ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:500:2: ()
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:501:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getANDingAccess().getANDingLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleANDing1010); 

            	        	newLeafNode(otherlv_2, grammarAccess.getANDingAccess().getAmpersandKeyword_1_1());
            	        
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:510:1: ( (lv_right_3_0= rulePrimary ) )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:511:1: (lv_right_3_0= rulePrimary )
            	    {
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:511:1: (lv_right_3_0= rulePrimary )
            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:512:3: lv_right_3_0= rulePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getANDingAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimary_in_ruleANDing1031);
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
            	    break loop8;
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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:536:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:537:2: (iv_rulePrimary= rulePrimary EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:538:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary1069);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary1079); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:545:1: rulePrimary returns [EObject current=null] : (this_Atomic_0= ruleAtomic | this_Quantifier_1= ruleQuantifier | (otherlv_2= '(' this_ORing_3= ruleORing otherlv_4= ')' ) | this_BooleanLiteral_5= ruleBooleanLiteral ) ;
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
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:548:28: ( (this_Atomic_0= ruleAtomic | this_Quantifier_1= ruleQuantifier | (otherlv_2= '(' this_ORing_3= ruleORing otherlv_4= ')' ) | this_BooleanLiteral_5= ruleBooleanLiteral ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:549:1: (this_Atomic_0= ruleAtomic | this_Quantifier_1= ruleQuantifier | (otherlv_2= '(' this_ORing_3= ruleORing otherlv_4= ')' ) | this_BooleanLiteral_5= ruleBooleanLiteral )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:549:1: (this_Atomic_0= ruleAtomic | this_Quantifier_1= ruleQuantifier | (otherlv_2= '(' this_ORing_3= ruleORing otherlv_4= ')' ) | this_BooleanLiteral_5= ruleBooleanLiteral )
            int alt9=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt9=1;
                }
                break;
            case 23:
            case 24:
                {
                alt9=2;
                }
                break;
            case 17:
                {
                alt9=3;
                }
                break;
            case 26:
            case 27:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:550:5: this_Atomic_0= ruleAtomic
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAtomic_in_rulePrimary1126);
                    this_Atomic_0=ruleAtomic();

                    state._fsp--;

                     
                            current = this_Atomic_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:560:5: this_Quantifier_1= ruleQuantifier
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getQuantifierParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleQuantifier_in_rulePrimary1153);
                    this_Quantifier_1=ruleQuantifier();

                    state._fsp--;

                     
                            current = this_Quantifier_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:569:6: (otherlv_2= '(' this_ORing_3= ruleORing otherlv_4= ')' )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:569:6: (otherlv_2= '(' this_ORing_3= ruleORing otherlv_4= ')' )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:569:8: otherlv_2= '(' this_ORing_3= ruleORing otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_rulePrimary1171); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getORingParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleORing_in_rulePrimary1193);
                    this_ORing_3=ruleORing();

                    state._fsp--;

                     
                            current = this_ORing_3; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_rulePrimary1204); 

                        	newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:588:5: this_BooleanLiteral_5= ruleBooleanLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getBooleanLiteralParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_rulePrimary1233);
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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:604:1: entryRuleQuantifier returns [EObject current=null] : iv_ruleQuantifier= ruleQuantifier EOF ;
    public final EObject entryRuleQuantifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifier = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:605:2: (iv_ruleQuantifier= ruleQuantifier EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:606:2: iv_ruleQuantifier= ruleQuantifier EOF
            {
             newCompositeNode(grammarAccess.getQuantifierRule()); 
            pushFollow(FOLLOW_ruleQuantifier_in_entryRuleQuantifier1268);
            iv_ruleQuantifier=ruleQuantifier();

            state._fsp--;

             current =iv_ruleQuantifier; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantifier1278); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:613:1: ruleQuantifier returns [EObject current=null] : ( ( ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) ) ) otherlv_1= '(' ( (lv_subject_2_0= ruleProblem ) ) otherlv_3= ':' ( (lv_predicate_4_0= ruleORing ) ) otherlv_5= ')' ) ;
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
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:616:28: ( ( ( ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) ) ) otherlv_1= '(' ( (lv_subject_2_0= ruleProblem ) ) otherlv_3= ':' ( (lv_predicate_4_0= ruleORing ) ) otherlv_5= ')' ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:617:1: ( ( ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) ) ) otherlv_1= '(' ( (lv_subject_2_0= ruleProblem ) ) otherlv_3= ':' ( (lv_predicate_4_0= ruleORing ) ) otherlv_5= ')' )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:617:1: ( ( ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) ) ) otherlv_1= '(' ( (lv_subject_2_0= ruleProblem ) ) otherlv_3= ':' ( (lv_predicate_4_0= ruleORing ) ) otherlv_5= ')' )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:617:2: ( ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) ) ) otherlv_1= '(' ( (lv_subject_2_0= ruleProblem ) ) otherlv_3= ':' ( (lv_predicate_4_0= ruleORing ) ) otherlv_5= ')'
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:617:2: ( ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:618:1: ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:618:1: ( (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:619:1: (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:619:1: (lv_quantifier_0_1= 'forall' | lv_quantifier_0_2= 'exists' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            else if ( (LA10_0==24) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:620:3: lv_quantifier_0_1= 'forall'
                    {
                    lv_quantifier_0_1=(Token)match(input,23,FOLLOW_23_in_ruleQuantifier1323); 

                            newLeafNode(lv_quantifier_0_1, grammarAccess.getQuantifierAccess().getQuantifierForallKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuantifierRule());
                    	        }
                           		setWithLastConsumed(current, "quantifier", lv_quantifier_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:632:8: lv_quantifier_0_2= 'exists'
                    {
                    lv_quantifier_0_2=(Token)match(input,24,FOLLOW_24_in_ruleQuantifier1352); 

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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleQuantifier1380); 

                	newLeafNode(otherlv_1, grammarAccess.getQuantifierAccess().getLeftParenthesisKeyword_1());
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:651:1: ( (lv_subject_2_0= ruleProblem ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:652:1: (lv_subject_2_0= ruleProblem )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:652:1: (lv_subject_2_0= ruleProblem )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:653:3: lv_subject_2_0= ruleProblem
            {
             
            	        newCompositeNode(grammarAccess.getQuantifierAccess().getSubjectProblemParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleProblem_in_ruleQuantifier1401);
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

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleQuantifier1413); 

                	newLeafNode(otherlv_3, grammarAccess.getQuantifierAccess().getColonKeyword_3());
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:673:1: ( (lv_predicate_4_0= ruleORing ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:674:1: (lv_predicate_4_0= ruleORing )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:674:1: (lv_predicate_4_0= ruleORing )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:675:3: lv_predicate_4_0= ruleORing
            {
             
            	        newCompositeNode(grammarAccess.getQuantifierAccess().getPredicateORingParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleORing_in_ruleQuantifier1434);
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

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleQuantifier1446); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:703:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:704:2: (iv_ruleAtomic= ruleAtomic EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:705:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic1482);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic1492); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:712:1: ruleAtomic returns [EObject current=null] : ( ( (lv_Function_0_0= RULE_ID ) ) (otherlv_1= '(' ( ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* )? otherlv_5= ')' )? ) ;
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
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:715:28: ( ( ( (lv_Function_0_0= RULE_ID ) ) (otherlv_1= '(' ( ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* )? otherlv_5= ')' )? ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:716:1: ( ( (lv_Function_0_0= RULE_ID ) ) (otherlv_1= '(' ( ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* )? otherlv_5= ')' )? )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:716:1: ( ( (lv_Function_0_0= RULE_ID ) ) (otherlv_1= '(' ( ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* )? otherlv_5= ')' )? )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:716:2: ( (lv_Function_0_0= RULE_ID ) ) (otherlv_1= '(' ( ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* )? otherlv_5= ')' )?
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:716:2: ( (lv_Function_0_0= RULE_ID ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:717:1: (lv_Function_0_0= RULE_ID )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:717:1: (lv_Function_0_0= RULE_ID )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:718:3: lv_Function_0_0= RULE_ID
            {
            lv_Function_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomic1534); 

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

            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:734:2: (otherlv_1= '(' ( ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* )? otherlv_5= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:734:4: otherlv_1= '(' ( ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* )? otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleAtomic1552); 

                        	newLeafNode(otherlv_1, grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:738:1: ( ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_ID) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:738:2: ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )*
                            {
                            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:738:2: ( (lv_args_2_0= RULE_ID ) )
                            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:739:1: (lv_args_2_0= RULE_ID )
                            {
                            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:739:1: (lv_args_2_0= RULE_ID )
                            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:740:3: lv_args_2_0= RULE_ID
                            {
                            lv_args_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomic1570); 

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

                            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:756:2: (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )*
                            loop11:
                            do {
                                int alt11=2;
                                int LA11_0 = input.LA(1);

                                if ( (LA11_0==15) ) {
                                    alt11=1;
                                }


                                switch (alt11) {
                            	case 1 :
                            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:756:4: otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) )
                            	    {
                            	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleAtomic1588); 

                            	        	newLeafNode(otherlv_3, grammarAccess.getAtomicAccess().getCommaKeyword_1_1_1_0());
                            	        
                            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:760:1: ( (lv_args_4_0= RULE_ID ) )
                            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:761:1: (lv_args_4_0= RULE_ID )
                            	    {
                            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:761:1: (lv_args_4_0= RULE_ID )
                            	    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:762:3: lv_args_4_0= RULE_ID
                            	    {
                            	    lv_args_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomic1605); 

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
                            	    break loop11;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleAtomic1626); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:790:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:791:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:792:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1664);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral1674); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:799:1: ruleBooleanLiteral returns [EObject current=null] : ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;

         enterRule(); 
            
        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:802:28: ( ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:803:1: ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:803:1: ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:804:1: ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:804:1: ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:805:1: (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:805:1: (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            else if ( (LA14_0==27) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:806:3: lv_value_0_1= 'TRUE'
                    {
                    lv_value_0_1=(Token)match(input,26,FOLLOW_26_in_ruleBooleanLiteral1718); 

                            newLeafNode(lv_value_0_1, grammarAccess.getBooleanLiteralAccess().getValueTRUEKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:818:8: lv_value_0_2= 'FALSE'
                    {
                    lv_value_0_2=(Token)match(input,27,FOLLOW_27_in_ruleBooleanLiteral1747); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:841:1: entryRuleTheorem returns [EObject current=null] : iv_ruleTheorem= ruleTheorem EOF ;
    public final EObject entryRuleTheorem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheorem = null;


        try {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:842:2: (iv_ruleTheorem= ruleTheorem EOF )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:843:2: iv_ruleTheorem= ruleTheorem EOF
            {
             newCompositeNode(grammarAccess.getTheoremRule()); 
            pushFollow(FOLLOW_ruleTheorem_in_entryRuleTheorem1798);
            iv_ruleTheorem=ruleTheorem();

            state._fsp--;

             current =iv_ruleTheorem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTheorem1808); 

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
    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:850:1: ruleTheorem returns [EObject current=null] : ( ( (lv_Requirement_0_0= ruleORing ) ) otherlv_1= ':-' ( (lv_Result_2_0= ruleORing ) ) otherlv_3= ',' ( (lv_Cost_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_Description_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_PseudoCode_8_0= RULE_STRING ) ) )? ) ;
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
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:853:28: ( ( ( (lv_Requirement_0_0= ruleORing ) ) otherlv_1= ':-' ( (lv_Result_2_0= ruleORing ) ) otherlv_3= ',' ( (lv_Cost_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_Description_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_PseudoCode_8_0= RULE_STRING ) ) )? ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:854:1: ( ( (lv_Requirement_0_0= ruleORing ) ) otherlv_1= ':-' ( (lv_Result_2_0= ruleORing ) ) otherlv_3= ',' ( (lv_Cost_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_Description_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_PseudoCode_8_0= RULE_STRING ) ) )? )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:854:1: ( ( (lv_Requirement_0_0= ruleORing ) ) otherlv_1= ':-' ( (lv_Result_2_0= ruleORing ) ) otherlv_3= ',' ( (lv_Cost_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_Description_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_PseudoCode_8_0= RULE_STRING ) ) )? )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:854:2: ( (lv_Requirement_0_0= ruleORing ) ) otherlv_1= ':-' ( (lv_Result_2_0= ruleORing ) ) otherlv_3= ',' ( (lv_Cost_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_Description_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_PseudoCode_8_0= RULE_STRING ) ) )?
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:854:2: ( (lv_Requirement_0_0= ruleORing ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:855:1: (lv_Requirement_0_0= ruleORing )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:855:1: (lv_Requirement_0_0= ruleORing )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:856:3: lv_Requirement_0_0= ruleORing
            {
             
            	        newCompositeNode(grammarAccess.getTheoremAccess().getRequirementORingParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleORing_in_ruleTheorem1854);
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

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleTheorem1866); 

                	newLeafNode(otherlv_1, grammarAccess.getTheoremAccess().getColonHyphenMinusKeyword_1());
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:876:1: ( (lv_Result_2_0= ruleORing ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:877:1: (lv_Result_2_0= ruleORing )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:877:1: (lv_Result_2_0= ruleORing )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:878:3: lv_Result_2_0= ruleORing
            {
             
            	        newCompositeNode(grammarAccess.getTheoremAccess().getResultORingParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleORing_in_ruleTheorem1887);
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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleTheorem1899); 

                	newLeafNode(otherlv_3, grammarAccess.getTheoremAccess().getCommaKeyword_3());
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:898:1: ( (lv_Cost_4_0= RULE_INT ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:899:1: (lv_Cost_4_0= RULE_INT )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:899:1: (lv_Cost_4_0= RULE_INT )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:900:3: lv_Cost_4_0= RULE_INT
            {
            lv_Cost_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTheorem1916); 

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

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleTheorem1933); 

                	newLeafNode(otherlv_5, grammarAccess.getTheoremAccess().getCommaKeyword_5());
                
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:920:1: ( (lv_Description_6_0= RULE_STRING ) )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:921:1: (lv_Description_6_0= RULE_STRING )
            {
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:921:1: (lv_Description_6_0= RULE_STRING )
            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:922:3: lv_Description_6_0= RULE_STRING
            {
            lv_Description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTheorem1950); 

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

            // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:938:2: (otherlv_7= ',' ( (lv_PseudoCode_8_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:938:4: otherlv_7= ',' ( (lv_PseudoCode_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleTheorem1968); 

                        	newLeafNode(otherlv_7, grammarAccess.getTheoremAccess().getCommaKeyword_7_0());
                        
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:942:1: ( (lv_PseudoCode_8_0= RULE_STRING ) )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:943:1: (lv_PseudoCode_8_0= RULE_STRING )
                    {
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:943:1: (lv_PseudoCode_8_0= RULE_STRING )
                    // ../algorithmMaker.input/src-gen/algorithmMaker/parser/antlr/internal/InternalInput.g:944:3: lv_PseudoCode_8_0= RULE_STRING
                    {
                    lv_PseudoCode_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTheorem1985); 

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
    public static final BitSet FOLLOW_ruleProblem_in_ruleInput188 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleInput201 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInput213 = new BitSet(new long[]{0x000000000D820010L});
    public static final BitSet FOLLOW_ruleTheorem_in_ruleInput234 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleInput247 = new BitSet(new long[]{0x000000000D820010L});
    public static final BitSet FOLLOW_ruleTheorem_in_ruleInput268 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleInput283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblem_in_entryRuleProblem323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProblem333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleProblem380 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleProblem393 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleProblem414 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleProblem429 = new BitSet(new long[]{0x000000000D820010L});
    public static final BitSet FOLLOW_ruleORing_in_ruleProblem450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleDeclaration543 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDeclaration555 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeclaration572 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDeclaration589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeclaration613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleType706 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleType724 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleType745 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleType757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_entryRuleORing795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleORing805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANDing_in_ruleORing852 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleORing873 = new BitSet(new long[]{0x000000000D820010L});
    public static final BitSet FOLLOW_ruleANDing_in_ruleORing894 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleANDing_in_entryRuleANDing932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleANDing942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleANDing989 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleANDing1010 = new BitSet(new long[]{0x000000000D820010L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleANDing1031 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary1069 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rulePrimary1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_rulePrimary1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePrimary1171 = new BitSet(new long[]{0x000000000D820010L});
    public static final BitSet FOLLOW_ruleORing_in_rulePrimary1193 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePrimary1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rulePrimary1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_entryRuleQuantifier1268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantifier1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleQuantifier1323 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_24_in_ruleQuantifier1352 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleQuantifier1380 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProblem_in_ruleQuantifier1401 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleQuantifier1413 = new BitSet(new long[]{0x000000000D820010L});
    public static final BitSet FOLLOW_ruleORing_in_ruleQuantifier1434 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleQuantifier1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic1482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomic1534 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleAtomic1552 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomic1570 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleAtomic1588 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomic1605 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleAtomic1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleBooleanLiteral1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleBooleanLiteral1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTheorem_in_entryRuleTheorem1798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTheorem1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_ruleTheorem1854 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTheorem1866 = new BitSet(new long[]{0x000000000D820010L});
    public static final BitSet FOLLOW_ruleORing_in_ruleTheorem1887 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTheorem1899 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTheorem1916 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTheorem1933 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTheorem1950 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleTheorem1968 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTheorem1985 = new BitSet(new long[]{0x0000000000000002L});

}