package algorithmMaker.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import algorithmMaker.services.InputGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalInputParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'forall'", "'exists'", "'TRUE'", "'FALSE'", "'Given'", "','", "'Find'", "';'", "'Theorems:'", "'st'", "'|'", "'&'", "'('", "')'", "':'", "':-'"
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
    public String getGrammarFileName() { return "../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g"; }


     
     	private InputGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(InputGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleInput"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:60:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:61:1: ( ruleInput EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:62:1: ruleInput EOF
            {
             before(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_ruleInput_in_entryRuleInput61);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getInputRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInput68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:69:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:73:2: ( ( ( rule__Input__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:74:1: ( ( rule__Input__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:74:1: ( ( rule__Input__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:75:1: ( rule__Input__Group__0 )
            {
             before(grammarAccess.getInputAccess().getGroup()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:76:1: ( rule__Input__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:76:2: rule__Input__Group__0
            {
            pushFollow(FOLLOW_rule__Input__Group__0_in_ruleInput94);
            rule__Input__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleProblem"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:88:1: entryRuleProblem : ruleProblem EOF ;
    public final void entryRuleProblem() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:89:1: ( ruleProblem EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:90:1: ruleProblem EOF
            {
             before(grammarAccess.getProblemRule()); 
            pushFollow(FOLLOW_ruleProblem_in_entryRuleProblem121);
            ruleProblem();

            state._fsp--;

             after(grammarAccess.getProblemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProblem128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProblem"


    // $ANTLR start "ruleProblem"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:97:1: ruleProblem : ( ( rule__Problem__Group__0 ) ) ;
    public final void ruleProblem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:101:2: ( ( ( rule__Problem__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:102:1: ( ( rule__Problem__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:102:1: ( ( rule__Problem__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:103:1: ( rule__Problem__Group__0 )
            {
             before(grammarAccess.getProblemAccess().getGroup()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:104:1: ( rule__Problem__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:104:2: rule__Problem__Group__0
            {
            pushFollow(FOLLOW_rule__Problem__Group__0_in_ruleProblem154);
            rule__Problem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProblemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProblem"


    // $ANTLR start "entryRuleORing"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:116:1: entryRuleORing : ruleORing EOF ;
    public final void entryRuleORing() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:117:1: ( ruleORing EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:118:1: ruleORing EOF
            {
             before(grammarAccess.getORingRule()); 
            pushFollow(FOLLOW_ruleORing_in_entryRuleORing181);
            ruleORing();

            state._fsp--;

             after(grammarAccess.getORingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleORing188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleORing"


    // $ANTLR start "ruleORing"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:125:1: ruleORing : ( ( rule__ORing__Group__0 ) ) ;
    public final void ruleORing() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:129:2: ( ( ( rule__ORing__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:130:1: ( ( rule__ORing__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:130:1: ( ( rule__ORing__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:131:1: ( rule__ORing__Group__0 )
            {
             before(grammarAccess.getORingAccess().getGroup()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:132:1: ( rule__ORing__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:132:2: rule__ORing__Group__0
            {
            pushFollow(FOLLOW_rule__ORing__Group__0_in_ruleORing214);
            rule__ORing__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getORingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleORing"


    // $ANTLR start "entryRuleANDing"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:144:1: entryRuleANDing : ruleANDing EOF ;
    public final void entryRuleANDing() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:145:1: ( ruleANDing EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:146:1: ruleANDing EOF
            {
             before(grammarAccess.getANDingRule()); 
            pushFollow(FOLLOW_ruleANDing_in_entryRuleANDing241);
            ruleANDing();

            state._fsp--;

             after(grammarAccess.getANDingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleANDing248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleANDing"


    // $ANTLR start "ruleANDing"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:153:1: ruleANDing : ( ( rule__ANDing__Group__0 ) ) ;
    public final void ruleANDing() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:157:2: ( ( ( rule__ANDing__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:158:1: ( ( rule__ANDing__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:158:1: ( ( rule__ANDing__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:159:1: ( rule__ANDing__Group__0 )
            {
             before(grammarAccess.getANDingAccess().getGroup()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:160:1: ( rule__ANDing__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:160:2: rule__ANDing__Group__0
            {
            pushFollow(FOLLOW_rule__ANDing__Group__0_in_ruleANDing274);
            rule__ANDing__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getANDingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleANDing"


    // $ANTLR start "entryRulePrimary"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:172:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:173:1: ( rulePrimary EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:174:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary301);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:181:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:185:2: ( ( ( rule__Primary__Alternatives ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:186:1: ( ( rule__Primary__Alternatives ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:186:1: ( ( rule__Primary__Alternatives ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:187:1: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:188:1: ( rule__Primary__Alternatives )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:188:2: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_rule__Primary__Alternatives_in_rulePrimary334);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleQuantifier"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:200:1: entryRuleQuantifier : ruleQuantifier EOF ;
    public final void entryRuleQuantifier() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:201:1: ( ruleQuantifier EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:202:1: ruleQuantifier EOF
            {
             before(grammarAccess.getQuantifierRule()); 
            pushFollow(FOLLOW_ruleQuantifier_in_entryRuleQuantifier361);
            ruleQuantifier();

            state._fsp--;

             after(grammarAccess.getQuantifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantifier368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuantifier"


    // $ANTLR start "ruleQuantifier"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:209:1: ruleQuantifier : ( ( rule__Quantifier__Group__0 ) ) ;
    public final void ruleQuantifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:213:2: ( ( ( rule__Quantifier__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:214:1: ( ( rule__Quantifier__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:214:1: ( ( rule__Quantifier__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:215:1: ( rule__Quantifier__Group__0 )
            {
             before(grammarAccess.getQuantifierAccess().getGroup()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:216:1: ( rule__Quantifier__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:216:2: rule__Quantifier__Group__0
            {
            pushFollow(FOLLOW_rule__Quantifier__Group__0_in_ruleQuantifier394);
            rule__Quantifier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuantifierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuantifier"


    // $ANTLR start "entryRuleAtomic"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:228:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:229:1: ( ruleAtomic EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:230:1: ruleAtomic EOF
            {
             before(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic421);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getAtomicRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:237:1: ruleAtomic : ( ( rule__Atomic__Group__0 ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:241:2: ( ( ( rule__Atomic__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:242:1: ( ( rule__Atomic__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:242:1: ( ( rule__Atomic__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:243:1: ( rule__Atomic__Group__0 )
            {
             before(grammarAccess.getAtomicAccess().getGroup()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:244:1: ( rule__Atomic__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:244:2: rule__Atomic__Group__0
            {
            pushFollow(FOLLOW_rule__Atomic__Group__0_in_ruleAtomic454);
            rule__Atomic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:256:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:257:1: ( ruleBooleanLiteral EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:258:1: ruleBooleanLiteral EOF
            {
             before(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral481);
            ruleBooleanLiteral();

            state._fsp--;

             after(grammarAccess.getBooleanLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:265:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__ValueAssignment ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:269:2: ( ( ( rule__BooleanLiteral__ValueAssignment ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:270:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:270:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:271:1: ( rule__BooleanLiteral__ValueAssignment )
            {
             before(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:272:1: ( rule__BooleanLiteral__ValueAssignment )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:272:2: rule__BooleanLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral514);
            rule__BooleanLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleTheorem"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:284:1: entryRuleTheorem : ruleTheorem EOF ;
    public final void entryRuleTheorem() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:285:1: ( ruleTheorem EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:286:1: ruleTheorem EOF
            {
             before(grammarAccess.getTheoremRule()); 
            pushFollow(FOLLOW_ruleTheorem_in_entryRuleTheorem541);
            ruleTheorem();

            state._fsp--;

             after(grammarAccess.getTheoremRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTheorem548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTheorem"


    // $ANTLR start "ruleTheorem"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:293:1: ruleTheorem : ( ( rule__Theorem__Group__0 ) ) ;
    public final void ruleTheorem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:297:2: ( ( ( rule__Theorem__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:298:1: ( ( rule__Theorem__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:298:1: ( ( rule__Theorem__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:299:1: ( rule__Theorem__Group__0 )
            {
             before(grammarAccess.getTheoremAccess().getGroup()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:300:1: ( rule__Theorem__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:300:2: rule__Theorem__Group__0
            {
            pushFollow(FOLLOW_rule__Theorem__Group__0_in_ruleTheorem574);
            rule__Theorem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTheoremAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTheorem"


    // $ANTLR start "rule__Primary__Alternatives"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:312:1: rule__Primary__Alternatives : ( ( ruleAtomic ) | ( ruleQuantifier ) | ( ( rule__Primary__Group_2__0 ) ) | ( ruleBooleanLiteral ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:316:1: ( ( ruleAtomic ) | ( ruleQuantifier ) | ( ( rule__Primary__Group_2__0 ) ) | ( ruleBooleanLiteral ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt1=1;
                }
                break;
            case 11:
            case 12:
                {
                alt1=2;
                }
                break;
            case 23:
                {
                alt1=3;
                }
                break;
            case 13:
            case 14:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:317:1: ( ruleAtomic )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:317:1: ( ruleAtomic )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:318:1: ruleAtomic
                    {
                     before(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAtomic_in_rule__Primary__Alternatives610);
                    ruleAtomic();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:323:6: ( ruleQuantifier )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:323:6: ( ruleQuantifier )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:324:1: ruleQuantifier
                    {
                     before(grammarAccess.getPrimaryAccess().getQuantifierParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleQuantifier_in_rule__Primary__Alternatives627);
                    ruleQuantifier();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getQuantifierParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:329:6: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:329:6: ( ( rule__Primary__Group_2__0 ) )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:330:1: ( rule__Primary__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:331:1: ( rule__Primary__Group_2__0 )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:331:2: rule__Primary__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Primary__Group_2__0_in_rule__Primary__Alternatives644);
                    rule__Primary__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:335:6: ( ruleBooleanLiteral )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:335:6: ( ruleBooleanLiteral )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:336:1: ruleBooleanLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getBooleanLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_rule__Primary__Alternatives662);
                    ruleBooleanLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getBooleanLiteralParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Quantifier__QuantifierAlternatives_0_0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:346:1: rule__Quantifier__QuantifierAlternatives_0_0 : ( ( 'forall' ) | ( 'exists' ) );
    public final void rule__Quantifier__QuantifierAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:350:1: ( ( 'forall' ) | ( 'exists' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:351:1: ( 'forall' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:351:1: ( 'forall' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:352:1: 'forall'
                    {
                     before(grammarAccess.getQuantifierAccess().getQuantifierForallKeyword_0_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Quantifier__QuantifierAlternatives_0_0695); 
                     after(grammarAccess.getQuantifierAccess().getQuantifierForallKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:359:6: ( 'exists' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:359:6: ( 'exists' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:360:1: 'exists'
                    {
                     before(grammarAccess.getQuantifierAccess().getQuantifierExistsKeyword_0_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Quantifier__QuantifierAlternatives_0_0715); 
                     after(grammarAccess.getQuantifierAccess().getQuantifierExistsKeyword_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifier__QuantifierAlternatives_0_0"


    // $ANTLR start "rule__BooleanLiteral__ValueAlternatives_0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:372:1: rule__BooleanLiteral__ValueAlternatives_0 : ( ( 'TRUE' ) | ( 'FALSE' ) );
    public final void rule__BooleanLiteral__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:376:1: ( ( 'TRUE' ) | ( 'FALSE' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:377:1: ( 'TRUE' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:377:1: ( 'TRUE' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:378:1: 'TRUE'
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getValueTRUEKeyword_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__BooleanLiteral__ValueAlternatives_0750); 
                     after(grammarAccess.getBooleanLiteralAccess().getValueTRUEKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:385:6: ( 'FALSE' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:385:6: ( 'FALSE' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:386:1: 'FALSE'
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getValueFALSEKeyword_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__BooleanLiteral__ValueAlternatives_0770); 
                     after(grammarAccess.getBooleanLiteralAccess().getValueFALSEKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__ValueAlternatives_0"


    // $ANTLR start "rule__Input__Group__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:400:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:404:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:405:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__0802);
            rule__Input__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__1_in_rule__Input__Group__0805);
            rule__Input__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0"


    // $ANTLR start "rule__Input__Group__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:412:1: rule__Input__Group__0__Impl : ( 'Given' ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:416:1: ( ( 'Given' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:417:1: ( 'Given' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:417:1: ( 'Given' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:418:1: 'Given'
            {
             before(grammarAccess.getInputAccess().getGivenKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Input__Group__0__Impl833); 
             after(grammarAccess.getInputAccess().getGivenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0__Impl"


    // $ANTLR start "rule__Input__Group__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:431:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:435:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:436:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__1864);
            rule__Input__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__2_in_rule__Input__Group__1867);
            rule__Input__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1"


    // $ANTLR start "rule__Input__Group__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:443:1: rule__Input__Group__1__Impl : ( ( rule__Input__GivenAssignment_1 ) ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:447:1: ( ( ( rule__Input__GivenAssignment_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:448:1: ( ( rule__Input__GivenAssignment_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:448:1: ( ( rule__Input__GivenAssignment_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:449:1: ( rule__Input__GivenAssignment_1 )
            {
             before(grammarAccess.getInputAccess().getGivenAssignment_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:450:1: ( rule__Input__GivenAssignment_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:450:2: rule__Input__GivenAssignment_1
            {
            pushFollow(FOLLOW_rule__Input__GivenAssignment_1_in_rule__Input__Group__1__Impl894);
            rule__Input__GivenAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getGivenAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1__Impl"


    // $ANTLR start "rule__Input__Group__2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:460:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:464:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:465:2: rule__Input__Group__2__Impl rule__Input__Group__3
            {
            pushFollow(FOLLOW_rule__Input__Group__2__Impl_in_rule__Input__Group__2924);
            rule__Input__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__3_in_rule__Input__Group__2927);
            rule__Input__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__2"


    // $ANTLR start "rule__Input__Group__2__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:472:1: rule__Input__Group__2__Impl : ( ',' ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:476:1: ( ( ',' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:477:1: ( ',' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:477:1: ( ',' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:478:1: ','
            {
             before(grammarAccess.getInputAccess().getCommaKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Input__Group__2__Impl955); 
             after(grammarAccess.getInputAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__2__Impl"


    // $ANTLR start "rule__Input__Group__3"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:491:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:495:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:496:2: rule__Input__Group__3__Impl rule__Input__Group__4
            {
            pushFollow(FOLLOW_rule__Input__Group__3__Impl_in_rule__Input__Group__3986);
            rule__Input__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__4_in_rule__Input__Group__3989);
            rule__Input__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__3"


    // $ANTLR start "rule__Input__Group__3__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:503:1: rule__Input__Group__3__Impl : ( 'Find' ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:507:1: ( ( 'Find' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:508:1: ( 'Find' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:508:1: ( 'Find' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:509:1: 'Find'
            {
             before(grammarAccess.getInputAccess().getFindKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Input__Group__3__Impl1017); 
             after(grammarAccess.getInputAccess().getFindKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__3__Impl"


    // $ANTLR start "rule__Input__Group__4"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:522:1: rule__Input__Group__4 : rule__Input__Group__4__Impl rule__Input__Group__5 ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:526:1: ( rule__Input__Group__4__Impl rule__Input__Group__5 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:527:2: rule__Input__Group__4__Impl rule__Input__Group__5
            {
            pushFollow(FOLLOW_rule__Input__Group__4__Impl_in_rule__Input__Group__41048);
            rule__Input__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__5_in_rule__Input__Group__41051);
            rule__Input__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__4"


    // $ANTLR start "rule__Input__Group__4__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:534:1: rule__Input__Group__4__Impl : ( ( rule__Input__GoalAssignment_4 ) ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:538:1: ( ( ( rule__Input__GoalAssignment_4 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:539:1: ( ( rule__Input__GoalAssignment_4 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:539:1: ( ( rule__Input__GoalAssignment_4 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:540:1: ( rule__Input__GoalAssignment_4 )
            {
             before(grammarAccess.getInputAccess().getGoalAssignment_4()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:541:1: ( rule__Input__GoalAssignment_4 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:541:2: rule__Input__GoalAssignment_4
            {
            pushFollow(FOLLOW_rule__Input__GoalAssignment_4_in_rule__Input__Group__4__Impl1078);
            rule__Input__GoalAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getGoalAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__4__Impl"


    // $ANTLR start "rule__Input__Group__5"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:551:1: rule__Input__Group__5 : rule__Input__Group__5__Impl ;
    public final void rule__Input__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:555:1: ( rule__Input__Group__5__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:556:2: rule__Input__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group__5__Impl_in_rule__Input__Group__51108);
            rule__Input__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__5"


    // $ANTLR start "rule__Input__Group__5__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:562:1: rule__Input__Group__5__Impl : ( ( rule__Input__Group_5__0 )? ) ;
    public final void rule__Input__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:566:1: ( ( ( rule__Input__Group_5__0 )? ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:567:1: ( ( rule__Input__Group_5__0 )? )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:567:1: ( ( rule__Input__Group_5__0 )? )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:568:1: ( rule__Input__Group_5__0 )?
            {
             before(grammarAccess.getInputAccess().getGroup_5()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:569:1: ( rule__Input__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:569:2: rule__Input__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Input__Group_5__0_in_rule__Input__Group__5__Impl1135);
                    rule__Input__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__5__Impl"


    // $ANTLR start "rule__Input__Group_5__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:591:1: rule__Input__Group_5__0 : rule__Input__Group_5__0__Impl rule__Input__Group_5__1 ;
    public final void rule__Input__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:595:1: ( rule__Input__Group_5__0__Impl rule__Input__Group_5__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:596:2: rule__Input__Group_5__0__Impl rule__Input__Group_5__1
            {
            pushFollow(FOLLOW_rule__Input__Group_5__0__Impl_in_rule__Input__Group_5__01178);
            rule__Input__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group_5__1_in_rule__Input__Group_5__01181);
            rule__Input__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_5__0"


    // $ANTLR start "rule__Input__Group_5__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:603:1: rule__Input__Group_5__0__Impl : ( ';' ) ;
    public final void rule__Input__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:607:1: ( ( ';' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:608:1: ( ';' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:608:1: ( ';' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:609:1: ';'
            {
             before(grammarAccess.getInputAccess().getSemicolonKeyword_5_0()); 
            match(input,18,FOLLOW_18_in_rule__Input__Group_5__0__Impl1209); 
             after(grammarAccess.getInputAccess().getSemicolonKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_5__0__Impl"


    // $ANTLR start "rule__Input__Group_5__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:622:1: rule__Input__Group_5__1 : rule__Input__Group_5__1__Impl rule__Input__Group_5__2 ;
    public final void rule__Input__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:626:1: ( rule__Input__Group_5__1__Impl rule__Input__Group_5__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:627:2: rule__Input__Group_5__1__Impl rule__Input__Group_5__2
            {
            pushFollow(FOLLOW_rule__Input__Group_5__1__Impl_in_rule__Input__Group_5__11240);
            rule__Input__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group_5__2_in_rule__Input__Group_5__11243);
            rule__Input__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_5__1"


    // $ANTLR start "rule__Input__Group_5__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:634:1: rule__Input__Group_5__1__Impl : ( 'Theorems:' ) ;
    public final void rule__Input__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:638:1: ( ( 'Theorems:' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:639:1: ( 'Theorems:' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:639:1: ( 'Theorems:' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:640:1: 'Theorems:'
            {
             before(grammarAccess.getInputAccess().getTheoremsKeyword_5_1()); 
            match(input,19,FOLLOW_19_in_rule__Input__Group_5__1__Impl1271); 
             after(grammarAccess.getInputAccess().getTheoremsKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_5__1__Impl"


    // $ANTLR start "rule__Input__Group_5__2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:653:1: rule__Input__Group_5__2 : rule__Input__Group_5__2__Impl rule__Input__Group_5__3 ;
    public final void rule__Input__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:657:1: ( rule__Input__Group_5__2__Impl rule__Input__Group_5__3 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:658:2: rule__Input__Group_5__2__Impl rule__Input__Group_5__3
            {
            pushFollow(FOLLOW_rule__Input__Group_5__2__Impl_in_rule__Input__Group_5__21302);
            rule__Input__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group_5__3_in_rule__Input__Group_5__21305);
            rule__Input__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_5__2"


    // $ANTLR start "rule__Input__Group_5__2__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:665:1: rule__Input__Group_5__2__Impl : ( ( rule__Input__TheoremsAssignment_5_2 ) ) ;
    public final void rule__Input__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:669:1: ( ( ( rule__Input__TheoremsAssignment_5_2 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:670:1: ( ( rule__Input__TheoremsAssignment_5_2 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:670:1: ( ( rule__Input__TheoremsAssignment_5_2 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:671:1: ( rule__Input__TheoremsAssignment_5_2 )
            {
             before(grammarAccess.getInputAccess().getTheoremsAssignment_5_2()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:672:1: ( rule__Input__TheoremsAssignment_5_2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:672:2: rule__Input__TheoremsAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Input__TheoremsAssignment_5_2_in_rule__Input__Group_5__2__Impl1332);
            rule__Input__TheoremsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getTheoremsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_5__2__Impl"


    // $ANTLR start "rule__Input__Group_5__3"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:682:1: rule__Input__Group_5__3 : rule__Input__Group_5__3__Impl rule__Input__Group_5__4 ;
    public final void rule__Input__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:686:1: ( rule__Input__Group_5__3__Impl rule__Input__Group_5__4 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:687:2: rule__Input__Group_5__3__Impl rule__Input__Group_5__4
            {
            pushFollow(FOLLOW_rule__Input__Group_5__3__Impl_in_rule__Input__Group_5__31362);
            rule__Input__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group_5__4_in_rule__Input__Group_5__31365);
            rule__Input__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_5__3"


    // $ANTLR start "rule__Input__Group_5__3__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:694:1: rule__Input__Group_5__3__Impl : ( ( rule__Input__Group_5_3__0 )* ) ;
    public final void rule__Input__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:698:1: ( ( ( rule__Input__Group_5_3__0 )* ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:699:1: ( ( rule__Input__Group_5_3__0 )* )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:699:1: ( ( rule__Input__Group_5_3__0 )* )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:700:1: ( rule__Input__Group_5_3__0 )*
            {
             before(grammarAccess.getInputAccess().getGroup_5_3()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:701:1: ( rule__Input__Group_5_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==RULE_ID||(LA5_1>=11 && LA5_1<=14)||LA5_1==23) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:701:2: rule__Input__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Input__Group_5_3__0_in_rule__Input__Group_5__3__Impl1392);
            	    rule__Input__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getInputAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_5__3__Impl"


    // $ANTLR start "rule__Input__Group_5__4"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:711:1: rule__Input__Group_5__4 : rule__Input__Group_5__4__Impl ;
    public final void rule__Input__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:715:1: ( rule__Input__Group_5__4__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:716:2: rule__Input__Group_5__4__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group_5__4__Impl_in_rule__Input__Group_5__41423);
            rule__Input__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_5__4"


    // $ANTLR start "rule__Input__Group_5__4__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:722:1: rule__Input__Group_5__4__Impl : ( ( ';' )? ) ;
    public final void rule__Input__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:726:1: ( ( ( ';' )? ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:727:1: ( ( ';' )? )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:727:1: ( ( ';' )? )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:728:1: ( ';' )?
            {
             before(grammarAccess.getInputAccess().getSemicolonKeyword_5_4()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:729:1: ( ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:730:2: ';'
                    {
                    match(input,18,FOLLOW_18_in_rule__Input__Group_5__4__Impl1452); 

                    }
                    break;

            }

             after(grammarAccess.getInputAccess().getSemicolonKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_5__4__Impl"


    // $ANTLR start "rule__Input__Group_5_3__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:751:1: rule__Input__Group_5_3__0 : rule__Input__Group_5_3__0__Impl rule__Input__Group_5_3__1 ;
    public final void rule__Input__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:755:1: ( rule__Input__Group_5_3__0__Impl rule__Input__Group_5_3__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:756:2: rule__Input__Group_5_3__0__Impl rule__Input__Group_5_3__1
            {
            pushFollow(FOLLOW_rule__Input__Group_5_3__0__Impl_in_rule__Input__Group_5_3__01495);
            rule__Input__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group_5_3__1_in_rule__Input__Group_5_3__01498);
            rule__Input__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_5_3__0"


    // $ANTLR start "rule__Input__Group_5_3__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:763:1: rule__Input__Group_5_3__0__Impl : ( ';' ) ;
    public final void rule__Input__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:767:1: ( ( ';' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:768:1: ( ';' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:768:1: ( ';' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:769:1: ';'
            {
             before(grammarAccess.getInputAccess().getSemicolonKeyword_5_3_0()); 
            match(input,18,FOLLOW_18_in_rule__Input__Group_5_3__0__Impl1526); 
             after(grammarAccess.getInputAccess().getSemicolonKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_5_3__0__Impl"


    // $ANTLR start "rule__Input__Group_5_3__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:782:1: rule__Input__Group_5_3__1 : rule__Input__Group_5_3__1__Impl ;
    public final void rule__Input__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:786:1: ( rule__Input__Group_5_3__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:787:2: rule__Input__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group_5_3__1__Impl_in_rule__Input__Group_5_3__11557);
            rule__Input__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_5_3__1"


    // $ANTLR start "rule__Input__Group_5_3__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:793:1: rule__Input__Group_5_3__1__Impl : ( ( rule__Input__TheoremsAssignment_5_3_1 ) ) ;
    public final void rule__Input__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:797:1: ( ( ( rule__Input__TheoremsAssignment_5_3_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:798:1: ( ( rule__Input__TheoremsAssignment_5_3_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:798:1: ( ( rule__Input__TheoremsAssignment_5_3_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:799:1: ( rule__Input__TheoremsAssignment_5_3_1 )
            {
             before(grammarAccess.getInputAccess().getTheoremsAssignment_5_3_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:800:1: ( rule__Input__TheoremsAssignment_5_3_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:800:2: rule__Input__TheoremsAssignment_5_3_1
            {
            pushFollow(FOLLOW_rule__Input__TheoremsAssignment_5_3_1_in_rule__Input__Group_5_3__1__Impl1584);
            rule__Input__TheoremsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getTheoremsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_5_3__1__Impl"


    // $ANTLR start "rule__Problem__Group__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:814:1: rule__Problem__Group__0 : rule__Problem__Group__0__Impl rule__Problem__Group__1 ;
    public final void rule__Problem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:818:1: ( rule__Problem__Group__0__Impl rule__Problem__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:819:2: rule__Problem__Group__0__Impl rule__Problem__Group__1
            {
            pushFollow(FOLLOW_rule__Problem__Group__0__Impl_in_rule__Problem__Group__01618);
            rule__Problem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Problem__Group__1_in_rule__Problem__Group__01621);
            rule__Problem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group__0"


    // $ANTLR start "rule__Problem__Group__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:826:1: rule__Problem__Group__0__Impl : ( ( rule__Problem__Group_0__0 ) ) ;
    public final void rule__Problem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:830:1: ( ( ( rule__Problem__Group_0__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:831:1: ( ( rule__Problem__Group_0__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:831:1: ( ( rule__Problem__Group_0__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:832:1: ( rule__Problem__Group_0__0 )
            {
             before(grammarAccess.getProblemAccess().getGroup_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:833:1: ( rule__Problem__Group_0__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:833:2: rule__Problem__Group_0__0
            {
            pushFollow(FOLLOW_rule__Problem__Group_0__0_in_rule__Problem__Group__0__Impl1648);
            rule__Problem__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getProblemAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group__0__Impl"


    // $ANTLR start "rule__Problem__Group__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:843:1: rule__Problem__Group__1 : rule__Problem__Group__1__Impl rule__Problem__Group__2 ;
    public final void rule__Problem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:847:1: ( rule__Problem__Group__1__Impl rule__Problem__Group__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:848:2: rule__Problem__Group__1__Impl rule__Problem__Group__2
            {
            pushFollow(FOLLOW_rule__Problem__Group__1__Impl_in_rule__Problem__Group__11678);
            rule__Problem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Problem__Group__2_in_rule__Problem__Group__11681);
            rule__Problem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group__1"


    // $ANTLR start "rule__Problem__Group__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:855:1: rule__Problem__Group__1__Impl : ( 'st' ) ;
    public final void rule__Problem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:859:1: ( ( 'st' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:860:1: ( 'st' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:860:1: ( 'st' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:861:1: 'st'
            {
             before(grammarAccess.getProblemAccess().getStKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Problem__Group__1__Impl1709); 
             after(grammarAccess.getProblemAccess().getStKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group__1__Impl"


    // $ANTLR start "rule__Problem__Group__2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:874:1: rule__Problem__Group__2 : rule__Problem__Group__2__Impl ;
    public final void rule__Problem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:878:1: ( rule__Problem__Group__2__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:879:2: rule__Problem__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Problem__Group__2__Impl_in_rule__Problem__Group__21740);
            rule__Problem__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group__2"


    // $ANTLR start "rule__Problem__Group__2__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:885:1: rule__Problem__Group__2__Impl : ( ( rule__Problem__PropertyAssignment_2 ) ) ;
    public final void rule__Problem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:889:1: ( ( ( rule__Problem__PropertyAssignment_2 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:890:1: ( ( rule__Problem__PropertyAssignment_2 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:890:1: ( ( rule__Problem__PropertyAssignment_2 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:891:1: ( rule__Problem__PropertyAssignment_2 )
            {
             before(grammarAccess.getProblemAccess().getPropertyAssignment_2()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:892:1: ( rule__Problem__PropertyAssignment_2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:892:2: rule__Problem__PropertyAssignment_2
            {
            pushFollow(FOLLOW_rule__Problem__PropertyAssignment_2_in_rule__Problem__Group__2__Impl1767);
            rule__Problem__PropertyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProblemAccess().getPropertyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group__2__Impl"


    // $ANTLR start "rule__Problem__Group_0__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:908:1: rule__Problem__Group_0__0 : rule__Problem__Group_0__0__Impl rule__Problem__Group_0__1 ;
    public final void rule__Problem__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:912:1: ( rule__Problem__Group_0__0__Impl rule__Problem__Group_0__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:913:2: rule__Problem__Group_0__0__Impl rule__Problem__Group_0__1
            {
            pushFollow(FOLLOW_rule__Problem__Group_0__0__Impl_in_rule__Problem__Group_0__01803);
            rule__Problem__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Problem__Group_0__1_in_rule__Problem__Group_0__01806);
            rule__Problem__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group_0__0"


    // $ANTLR start "rule__Problem__Group_0__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:920:1: rule__Problem__Group_0__0__Impl : ( ( rule__Problem__VarsAssignment_0_0 ) ) ;
    public final void rule__Problem__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:924:1: ( ( ( rule__Problem__VarsAssignment_0_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:925:1: ( ( rule__Problem__VarsAssignment_0_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:925:1: ( ( rule__Problem__VarsAssignment_0_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:926:1: ( rule__Problem__VarsAssignment_0_0 )
            {
             before(grammarAccess.getProblemAccess().getVarsAssignment_0_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:927:1: ( rule__Problem__VarsAssignment_0_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:927:2: rule__Problem__VarsAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Problem__VarsAssignment_0_0_in_rule__Problem__Group_0__0__Impl1833);
            rule__Problem__VarsAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getProblemAccess().getVarsAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group_0__0__Impl"


    // $ANTLR start "rule__Problem__Group_0__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:937:1: rule__Problem__Group_0__1 : rule__Problem__Group_0__1__Impl ;
    public final void rule__Problem__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:941:1: ( rule__Problem__Group_0__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:942:2: rule__Problem__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Problem__Group_0__1__Impl_in_rule__Problem__Group_0__11863);
            rule__Problem__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group_0__1"


    // $ANTLR start "rule__Problem__Group_0__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:948:1: rule__Problem__Group_0__1__Impl : ( ( rule__Problem__Group_0_1__0 )* ) ;
    public final void rule__Problem__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:952:1: ( ( ( rule__Problem__Group_0_1__0 )* ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:953:1: ( ( rule__Problem__Group_0_1__0 )* )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:953:1: ( ( rule__Problem__Group_0_1__0 )* )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:954:1: ( rule__Problem__Group_0_1__0 )*
            {
             before(grammarAccess.getProblemAccess().getGroup_0_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:955:1: ( rule__Problem__Group_0_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:955:2: rule__Problem__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Problem__Group_0_1__0_in_rule__Problem__Group_0__1__Impl1890);
            	    rule__Problem__Group_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getProblemAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group_0__1__Impl"


    // $ANTLR start "rule__Problem__Group_0_1__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:969:1: rule__Problem__Group_0_1__0 : rule__Problem__Group_0_1__0__Impl rule__Problem__Group_0_1__1 ;
    public final void rule__Problem__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:973:1: ( rule__Problem__Group_0_1__0__Impl rule__Problem__Group_0_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:974:2: rule__Problem__Group_0_1__0__Impl rule__Problem__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__Problem__Group_0_1__0__Impl_in_rule__Problem__Group_0_1__01925);
            rule__Problem__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Problem__Group_0_1__1_in_rule__Problem__Group_0_1__01928);
            rule__Problem__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group_0_1__0"


    // $ANTLR start "rule__Problem__Group_0_1__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:981:1: rule__Problem__Group_0_1__0__Impl : ( ',' ) ;
    public final void rule__Problem__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:985:1: ( ( ',' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:986:1: ( ',' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:986:1: ( ',' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:987:1: ','
            {
             before(grammarAccess.getProblemAccess().getCommaKeyword_0_1_0()); 
            match(input,16,FOLLOW_16_in_rule__Problem__Group_0_1__0__Impl1956); 
             after(grammarAccess.getProblemAccess().getCommaKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group_0_1__0__Impl"


    // $ANTLR start "rule__Problem__Group_0_1__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1000:1: rule__Problem__Group_0_1__1 : rule__Problem__Group_0_1__1__Impl ;
    public final void rule__Problem__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1004:1: ( rule__Problem__Group_0_1__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1005:2: rule__Problem__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Problem__Group_0_1__1__Impl_in_rule__Problem__Group_0_1__11987);
            rule__Problem__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group_0_1__1"


    // $ANTLR start "rule__Problem__Group_0_1__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1011:1: rule__Problem__Group_0_1__1__Impl : ( ( rule__Problem__VarsAssignment_0_1_1 ) ) ;
    public final void rule__Problem__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1015:1: ( ( ( rule__Problem__VarsAssignment_0_1_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1016:1: ( ( rule__Problem__VarsAssignment_0_1_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1016:1: ( ( rule__Problem__VarsAssignment_0_1_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1017:1: ( rule__Problem__VarsAssignment_0_1_1 )
            {
             before(grammarAccess.getProblemAccess().getVarsAssignment_0_1_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1018:1: ( rule__Problem__VarsAssignment_0_1_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1018:2: rule__Problem__VarsAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__Problem__VarsAssignment_0_1_1_in_rule__Problem__Group_0_1__1__Impl2014);
            rule__Problem__VarsAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getProblemAccess().getVarsAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group_0_1__1__Impl"


    // $ANTLR start "rule__ORing__Group__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1032:1: rule__ORing__Group__0 : rule__ORing__Group__0__Impl rule__ORing__Group__1 ;
    public final void rule__ORing__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1036:1: ( rule__ORing__Group__0__Impl rule__ORing__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1037:2: rule__ORing__Group__0__Impl rule__ORing__Group__1
            {
            pushFollow(FOLLOW_rule__ORing__Group__0__Impl_in_rule__ORing__Group__02048);
            rule__ORing__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ORing__Group__1_in_rule__ORing__Group__02051);
            rule__ORing__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORing__Group__0"


    // $ANTLR start "rule__ORing__Group__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1044:1: rule__ORing__Group__0__Impl : ( ruleANDing ) ;
    public final void rule__ORing__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1048:1: ( ( ruleANDing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1049:1: ( ruleANDing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1049:1: ( ruleANDing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1050:1: ruleANDing
            {
             before(grammarAccess.getORingAccess().getANDingParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleANDing_in_rule__ORing__Group__0__Impl2078);
            ruleANDing();

            state._fsp--;

             after(grammarAccess.getORingAccess().getANDingParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORing__Group__0__Impl"


    // $ANTLR start "rule__ORing__Group__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1061:1: rule__ORing__Group__1 : rule__ORing__Group__1__Impl ;
    public final void rule__ORing__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1065:1: ( rule__ORing__Group__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1066:2: rule__ORing__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ORing__Group__1__Impl_in_rule__ORing__Group__12107);
            rule__ORing__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORing__Group__1"


    // $ANTLR start "rule__ORing__Group__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1072:1: rule__ORing__Group__1__Impl : ( ( rule__ORing__Group_1__0 )* ) ;
    public final void rule__ORing__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1076:1: ( ( ( rule__ORing__Group_1__0 )* ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1077:1: ( ( rule__ORing__Group_1__0 )* )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1077:1: ( ( rule__ORing__Group_1__0 )* )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1078:1: ( rule__ORing__Group_1__0 )*
            {
             before(grammarAccess.getORingAccess().getGroup_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1079:1: ( rule__ORing__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1079:2: rule__ORing__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ORing__Group_1__0_in_rule__ORing__Group__1__Impl2134);
            	    rule__ORing__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getORingAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORing__Group__1__Impl"


    // $ANTLR start "rule__ORing__Group_1__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1093:1: rule__ORing__Group_1__0 : rule__ORing__Group_1__0__Impl rule__ORing__Group_1__1 ;
    public final void rule__ORing__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1097:1: ( rule__ORing__Group_1__0__Impl rule__ORing__Group_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1098:2: rule__ORing__Group_1__0__Impl rule__ORing__Group_1__1
            {
            pushFollow(FOLLOW_rule__ORing__Group_1__0__Impl_in_rule__ORing__Group_1__02169);
            rule__ORing__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ORing__Group_1__1_in_rule__ORing__Group_1__02172);
            rule__ORing__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORing__Group_1__0"


    // $ANTLR start "rule__ORing__Group_1__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1105:1: rule__ORing__Group_1__0__Impl : ( () ) ;
    public final void rule__ORing__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1109:1: ( ( () ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1110:1: ( () )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1110:1: ( () )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1111:1: ()
            {
             before(grammarAccess.getORingAccess().getORingLeftAction_1_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1112:1: ()
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1114:1: 
            {
            }

             after(grammarAccess.getORingAccess().getORingLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORing__Group_1__0__Impl"


    // $ANTLR start "rule__ORing__Group_1__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1124:1: rule__ORing__Group_1__1 : rule__ORing__Group_1__1__Impl rule__ORing__Group_1__2 ;
    public final void rule__ORing__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1128:1: ( rule__ORing__Group_1__1__Impl rule__ORing__Group_1__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1129:2: rule__ORing__Group_1__1__Impl rule__ORing__Group_1__2
            {
            pushFollow(FOLLOW_rule__ORing__Group_1__1__Impl_in_rule__ORing__Group_1__12230);
            rule__ORing__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ORing__Group_1__2_in_rule__ORing__Group_1__12233);
            rule__ORing__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORing__Group_1__1"


    // $ANTLR start "rule__ORing__Group_1__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1136:1: rule__ORing__Group_1__1__Impl : ( '|' ) ;
    public final void rule__ORing__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1140:1: ( ( '|' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1141:1: ( '|' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1141:1: ( '|' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1142:1: '|'
            {
             before(grammarAccess.getORingAccess().getVerticalLineKeyword_1_1()); 
            match(input,21,FOLLOW_21_in_rule__ORing__Group_1__1__Impl2261); 
             after(grammarAccess.getORingAccess().getVerticalLineKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORing__Group_1__1__Impl"


    // $ANTLR start "rule__ORing__Group_1__2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1155:1: rule__ORing__Group_1__2 : rule__ORing__Group_1__2__Impl ;
    public final void rule__ORing__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1159:1: ( rule__ORing__Group_1__2__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1160:2: rule__ORing__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ORing__Group_1__2__Impl_in_rule__ORing__Group_1__22292);
            rule__ORing__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORing__Group_1__2"


    // $ANTLR start "rule__ORing__Group_1__2__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1166:1: rule__ORing__Group_1__2__Impl : ( ( rule__ORing__RightAssignment_1_2 ) ) ;
    public final void rule__ORing__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1170:1: ( ( ( rule__ORing__RightAssignment_1_2 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1171:1: ( ( rule__ORing__RightAssignment_1_2 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1171:1: ( ( rule__ORing__RightAssignment_1_2 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1172:1: ( rule__ORing__RightAssignment_1_2 )
            {
             before(grammarAccess.getORingAccess().getRightAssignment_1_2()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1173:1: ( rule__ORing__RightAssignment_1_2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1173:2: rule__ORing__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ORing__RightAssignment_1_2_in_rule__ORing__Group_1__2__Impl2319);
            rule__ORing__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getORingAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORing__Group_1__2__Impl"


    // $ANTLR start "rule__ANDing__Group__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1189:1: rule__ANDing__Group__0 : rule__ANDing__Group__0__Impl rule__ANDing__Group__1 ;
    public final void rule__ANDing__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1193:1: ( rule__ANDing__Group__0__Impl rule__ANDing__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1194:2: rule__ANDing__Group__0__Impl rule__ANDing__Group__1
            {
            pushFollow(FOLLOW_rule__ANDing__Group__0__Impl_in_rule__ANDing__Group__02355);
            rule__ANDing__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ANDing__Group__1_in_rule__ANDing__Group__02358);
            rule__ANDing__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDing__Group__0"


    // $ANTLR start "rule__ANDing__Group__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1201:1: rule__ANDing__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__ANDing__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1205:1: ( ( rulePrimary ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1206:1: ( rulePrimary )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1206:1: ( rulePrimary )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1207:1: rulePrimary
            {
             before(grammarAccess.getANDingAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__ANDing__Group__0__Impl2385);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getANDingAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDing__Group__0__Impl"


    // $ANTLR start "rule__ANDing__Group__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1218:1: rule__ANDing__Group__1 : rule__ANDing__Group__1__Impl ;
    public final void rule__ANDing__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1222:1: ( rule__ANDing__Group__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1223:2: rule__ANDing__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ANDing__Group__1__Impl_in_rule__ANDing__Group__12414);
            rule__ANDing__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDing__Group__1"


    // $ANTLR start "rule__ANDing__Group__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1229:1: rule__ANDing__Group__1__Impl : ( ( rule__ANDing__Group_1__0 )* ) ;
    public final void rule__ANDing__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1233:1: ( ( ( rule__ANDing__Group_1__0 )* ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1234:1: ( ( rule__ANDing__Group_1__0 )* )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1234:1: ( ( rule__ANDing__Group_1__0 )* )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1235:1: ( rule__ANDing__Group_1__0 )*
            {
             before(grammarAccess.getANDingAccess().getGroup_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1236:1: ( rule__ANDing__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1236:2: rule__ANDing__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ANDing__Group_1__0_in_rule__ANDing__Group__1__Impl2441);
            	    rule__ANDing__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getANDingAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDing__Group__1__Impl"


    // $ANTLR start "rule__ANDing__Group_1__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1250:1: rule__ANDing__Group_1__0 : rule__ANDing__Group_1__0__Impl rule__ANDing__Group_1__1 ;
    public final void rule__ANDing__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1254:1: ( rule__ANDing__Group_1__0__Impl rule__ANDing__Group_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1255:2: rule__ANDing__Group_1__0__Impl rule__ANDing__Group_1__1
            {
            pushFollow(FOLLOW_rule__ANDing__Group_1__0__Impl_in_rule__ANDing__Group_1__02476);
            rule__ANDing__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ANDing__Group_1__1_in_rule__ANDing__Group_1__02479);
            rule__ANDing__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDing__Group_1__0"


    // $ANTLR start "rule__ANDing__Group_1__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1262:1: rule__ANDing__Group_1__0__Impl : ( () ) ;
    public final void rule__ANDing__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1266:1: ( ( () ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1267:1: ( () )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1267:1: ( () )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1268:1: ()
            {
             before(grammarAccess.getANDingAccess().getANDingLeftAction_1_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1269:1: ()
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1271:1: 
            {
            }

             after(grammarAccess.getANDingAccess().getANDingLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDing__Group_1__0__Impl"


    // $ANTLR start "rule__ANDing__Group_1__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1281:1: rule__ANDing__Group_1__1 : rule__ANDing__Group_1__1__Impl rule__ANDing__Group_1__2 ;
    public final void rule__ANDing__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1285:1: ( rule__ANDing__Group_1__1__Impl rule__ANDing__Group_1__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1286:2: rule__ANDing__Group_1__1__Impl rule__ANDing__Group_1__2
            {
            pushFollow(FOLLOW_rule__ANDing__Group_1__1__Impl_in_rule__ANDing__Group_1__12537);
            rule__ANDing__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ANDing__Group_1__2_in_rule__ANDing__Group_1__12540);
            rule__ANDing__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDing__Group_1__1"


    // $ANTLR start "rule__ANDing__Group_1__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1293:1: rule__ANDing__Group_1__1__Impl : ( '&' ) ;
    public final void rule__ANDing__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1297:1: ( ( '&' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1298:1: ( '&' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1298:1: ( '&' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1299:1: '&'
            {
             before(grammarAccess.getANDingAccess().getAmpersandKeyword_1_1()); 
            match(input,22,FOLLOW_22_in_rule__ANDing__Group_1__1__Impl2568); 
             after(grammarAccess.getANDingAccess().getAmpersandKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDing__Group_1__1__Impl"


    // $ANTLR start "rule__ANDing__Group_1__2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1312:1: rule__ANDing__Group_1__2 : rule__ANDing__Group_1__2__Impl ;
    public final void rule__ANDing__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1316:1: ( rule__ANDing__Group_1__2__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1317:2: rule__ANDing__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ANDing__Group_1__2__Impl_in_rule__ANDing__Group_1__22599);
            rule__ANDing__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDing__Group_1__2"


    // $ANTLR start "rule__ANDing__Group_1__2__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1323:1: rule__ANDing__Group_1__2__Impl : ( ( rule__ANDing__RightAssignment_1_2 ) ) ;
    public final void rule__ANDing__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1327:1: ( ( ( rule__ANDing__RightAssignment_1_2 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1328:1: ( ( rule__ANDing__RightAssignment_1_2 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1328:1: ( ( rule__ANDing__RightAssignment_1_2 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1329:1: ( rule__ANDing__RightAssignment_1_2 )
            {
             before(grammarAccess.getANDingAccess().getRightAssignment_1_2()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1330:1: ( rule__ANDing__RightAssignment_1_2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1330:2: rule__ANDing__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ANDing__RightAssignment_1_2_in_rule__ANDing__Group_1__2__Impl2626);
            rule__ANDing__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getANDingAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDing__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_2__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1346:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1350:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1351:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_2__0__Impl_in_rule__Primary__Group_2__02662);
            rule__Primary__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_2__1_in_rule__Primary__Group_2__02665);
            rule__Primary__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__0"


    // $ANTLR start "rule__Primary__Group_2__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1358:1: rule__Primary__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1362:1: ( ( '(' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1363:1: ( '(' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1363:1: ( '(' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1364:1: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,23,FOLLOW_23_in_rule__Primary__Group_2__0__Impl2693); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__0__Impl"


    // $ANTLR start "rule__Primary__Group_2__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1377:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1381:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1382:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_rule__Primary__Group_2__1__Impl_in_rule__Primary__Group_2__12724);
            rule__Primary__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_2__2_in_rule__Primary__Group_2__12727);
            rule__Primary__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__1"


    // $ANTLR start "rule__Primary__Group_2__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1389:1: rule__Primary__Group_2__1__Impl : ( ruleORing ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1393:1: ( ( ruleORing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1394:1: ( ruleORing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1394:1: ( ruleORing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1395:1: ruleORing
            {
             before(grammarAccess.getPrimaryAccess().getORingParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleORing_in_rule__Primary__Group_2__1__Impl2754);
            ruleORing();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getORingParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__1__Impl"


    // $ANTLR start "rule__Primary__Group_2__2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1406:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1410:1: ( rule__Primary__Group_2__2__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1411:2: rule__Primary__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_2__2__Impl_in_rule__Primary__Group_2__22783);
            rule__Primary__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__2"


    // $ANTLR start "rule__Primary__Group_2__2__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1417:1: rule__Primary__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1421:1: ( ( ')' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1422:1: ( ')' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1422:1: ( ')' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1423:1: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 
            match(input,24,FOLLOW_24_in_rule__Primary__Group_2__2__Impl2811); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__2__Impl"


    // $ANTLR start "rule__Quantifier__Group__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1442:1: rule__Quantifier__Group__0 : rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1 ;
    public final void rule__Quantifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1446:1: ( rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1447:2: rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1
            {
            pushFollow(FOLLOW_rule__Quantifier__Group__0__Impl_in_rule__Quantifier__Group__02848);
            rule__Quantifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantifier__Group__1_in_rule__Quantifier__Group__02851);
            rule__Quantifier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifier__Group__0"


    // $ANTLR start "rule__Quantifier__Group__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1454:1: rule__Quantifier__Group__0__Impl : ( ( rule__Quantifier__QuantifierAssignment_0 ) ) ;
    public final void rule__Quantifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1458:1: ( ( ( rule__Quantifier__QuantifierAssignment_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1459:1: ( ( rule__Quantifier__QuantifierAssignment_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1459:1: ( ( rule__Quantifier__QuantifierAssignment_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1460:1: ( rule__Quantifier__QuantifierAssignment_0 )
            {
             before(grammarAccess.getQuantifierAccess().getQuantifierAssignment_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1461:1: ( rule__Quantifier__QuantifierAssignment_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1461:2: rule__Quantifier__QuantifierAssignment_0
            {
            pushFollow(FOLLOW_rule__Quantifier__QuantifierAssignment_0_in_rule__Quantifier__Group__0__Impl2878);
            rule__Quantifier__QuantifierAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQuantifierAccess().getQuantifierAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifier__Group__0__Impl"


    // $ANTLR start "rule__Quantifier__Group__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1471:1: rule__Quantifier__Group__1 : rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2 ;
    public final void rule__Quantifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1475:1: ( rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1476:2: rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2
            {
            pushFollow(FOLLOW_rule__Quantifier__Group__1__Impl_in_rule__Quantifier__Group__12908);
            rule__Quantifier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantifier__Group__2_in_rule__Quantifier__Group__12911);
            rule__Quantifier__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifier__Group__1"


    // $ANTLR start "rule__Quantifier__Group__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1483:1: rule__Quantifier__Group__1__Impl : ( '(' ) ;
    public final void rule__Quantifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1487:1: ( ( '(' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1488:1: ( '(' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1488:1: ( '(' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1489:1: '('
            {
             before(grammarAccess.getQuantifierAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__Quantifier__Group__1__Impl2939); 
             after(grammarAccess.getQuantifierAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifier__Group__1__Impl"


    // $ANTLR start "rule__Quantifier__Group__2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1502:1: rule__Quantifier__Group__2 : rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3 ;
    public final void rule__Quantifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1506:1: ( rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1507:2: rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3
            {
            pushFollow(FOLLOW_rule__Quantifier__Group__2__Impl_in_rule__Quantifier__Group__22970);
            rule__Quantifier__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantifier__Group__3_in_rule__Quantifier__Group__22973);
            rule__Quantifier__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifier__Group__2"


    // $ANTLR start "rule__Quantifier__Group__2__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1514:1: rule__Quantifier__Group__2__Impl : ( ( rule__Quantifier__SubjectAssignment_2 ) ) ;
    public final void rule__Quantifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1518:1: ( ( ( rule__Quantifier__SubjectAssignment_2 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1519:1: ( ( rule__Quantifier__SubjectAssignment_2 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1519:1: ( ( rule__Quantifier__SubjectAssignment_2 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1520:1: ( rule__Quantifier__SubjectAssignment_2 )
            {
             before(grammarAccess.getQuantifierAccess().getSubjectAssignment_2()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1521:1: ( rule__Quantifier__SubjectAssignment_2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1521:2: rule__Quantifier__SubjectAssignment_2
            {
            pushFollow(FOLLOW_rule__Quantifier__SubjectAssignment_2_in_rule__Quantifier__Group__2__Impl3000);
            rule__Quantifier__SubjectAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQuantifierAccess().getSubjectAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifier__Group__2__Impl"


    // $ANTLR start "rule__Quantifier__Group__3"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1531:1: rule__Quantifier__Group__3 : rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4 ;
    public final void rule__Quantifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1535:1: ( rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1536:2: rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4
            {
            pushFollow(FOLLOW_rule__Quantifier__Group__3__Impl_in_rule__Quantifier__Group__33030);
            rule__Quantifier__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantifier__Group__4_in_rule__Quantifier__Group__33033);
            rule__Quantifier__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifier__Group__3"


    // $ANTLR start "rule__Quantifier__Group__3__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1543:1: rule__Quantifier__Group__3__Impl : ( ':' ) ;
    public final void rule__Quantifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1547:1: ( ( ':' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1548:1: ( ':' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1548:1: ( ':' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1549:1: ':'
            {
             before(grammarAccess.getQuantifierAccess().getColonKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__Quantifier__Group__3__Impl3061); 
             after(grammarAccess.getQuantifierAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifier__Group__3__Impl"


    // $ANTLR start "rule__Quantifier__Group__4"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1562:1: rule__Quantifier__Group__4 : rule__Quantifier__Group__4__Impl rule__Quantifier__Group__5 ;
    public final void rule__Quantifier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1566:1: ( rule__Quantifier__Group__4__Impl rule__Quantifier__Group__5 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1567:2: rule__Quantifier__Group__4__Impl rule__Quantifier__Group__5
            {
            pushFollow(FOLLOW_rule__Quantifier__Group__4__Impl_in_rule__Quantifier__Group__43092);
            rule__Quantifier__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantifier__Group__5_in_rule__Quantifier__Group__43095);
            rule__Quantifier__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifier__Group__4"


    // $ANTLR start "rule__Quantifier__Group__4__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1574:1: rule__Quantifier__Group__4__Impl : ( ( rule__Quantifier__PredicateAssignment_4 ) ) ;
    public final void rule__Quantifier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1578:1: ( ( ( rule__Quantifier__PredicateAssignment_4 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1579:1: ( ( rule__Quantifier__PredicateAssignment_4 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1579:1: ( ( rule__Quantifier__PredicateAssignment_4 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1580:1: ( rule__Quantifier__PredicateAssignment_4 )
            {
             before(grammarAccess.getQuantifierAccess().getPredicateAssignment_4()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1581:1: ( rule__Quantifier__PredicateAssignment_4 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1581:2: rule__Quantifier__PredicateAssignment_4
            {
            pushFollow(FOLLOW_rule__Quantifier__PredicateAssignment_4_in_rule__Quantifier__Group__4__Impl3122);
            rule__Quantifier__PredicateAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getQuantifierAccess().getPredicateAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifier__Group__4__Impl"


    // $ANTLR start "rule__Quantifier__Group__5"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1591:1: rule__Quantifier__Group__5 : rule__Quantifier__Group__5__Impl ;
    public final void rule__Quantifier__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1595:1: ( rule__Quantifier__Group__5__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1596:2: rule__Quantifier__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Quantifier__Group__5__Impl_in_rule__Quantifier__Group__53152);
            rule__Quantifier__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifier__Group__5"


    // $ANTLR start "rule__Quantifier__Group__5__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1602:1: rule__Quantifier__Group__5__Impl : ( ')' ) ;
    public final void rule__Quantifier__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1606:1: ( ( ')' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1607:1: ( ')' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1607:1: ( ')' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1608:1: ')'
            {
             before(grammarAccess.getQuantifierAccess().getRightParenthesisKeyword_5()); 
            match(input,24,FOLLOW_24_in_rule__Quantifier__Group__5__Impl3180); 
             after(grammarAccess.getQuantifierAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifier__Group__5__Impl"


    // $ANTLR start "rule__Atomic__Group__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1633:1: rule__Atomic__Group__0 : rule__Atomic__Group__0__Impl rule__Atomic__Group__1 ;
    public final void rule__Atomic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1637:1: ( rule__Atomic__Group__0__Impl rule__Atomic__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1638:2: rule__Atomic__Group__0__Impl rule__Atomic__Group__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group__0__Impl_in_rule__Atomic__Group__03223);
            rule__Atomic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group__1_in_rule__Atomic__Group__03226);
            rule__Atomic__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group__0"


    // $ANTLR start "rule__Atomic__Group__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1645:1: rule__Atomic__Group__0__Impl : ( ( rule__Atomic__FunctionAssignment_0 ) ) ;
    public final void rule__Atomic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1649:1: ( ( ( rule__Atomic__FunctionAssignment_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1650:1: ( ( rule__Atomic__FunctionAssignment_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1650:1: ( ( rule__Atomic__FunctionAssignment_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1651:1: ( rule__Atomic__FunctionAssignment_0 )
            {
             before(grammarAccess.getAtomicAccess().getFunctionAssignment_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1652:1: ( rule__Atomic__FunctionAssignment_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1652:2: rule__Atomic__FunctionAssignment_0
            {
            pushFollow(FOLLOW_rule__Atomic__FunctionAssignment_0_in_rule__Atomic__Group__0__Impl3253);
            rule__Atomic__FunctionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getFunctionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group__0__Impl"


    // $ANTLR start "rule__Atomic__Group__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1662:1: rule__Atomic__Group__1 : rule__Atomic__Group__1__Impl ;
    public final void rule__Atomic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1666:1: ( rule__Atomic__Group__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1667:2: rule__Atomic__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group__1__Impl_in_rule__Atomic__Group__13283);
            rule__Atomic__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group__1"


    // $ANTLR start "rule__Atomic__Group__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1673:1: rule__Atomic__Group__1__Impl : ( ( rule__Atomic__Group_1__0 )? ) ;
    public final void rule__Atomic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1677:1: ( ( ( rule__Atomic__Group_1__0 )? ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1678:1: ( ( rule__Atomic__Group_1__0 )? )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1678:1: ( ( rule__Atomic__Group_1__0 )? )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1679:1: ( rule__Atomic__Group_1__0 )?
            {
             before(grammarAccess.getAtomicAccess().getGroup_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1680:1: ( rule__Atomic__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1680:2: rule__Atomic__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Group__1__Impl3310);
                    rule__Atomic__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtomicAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group__1__Impl"


    // $ANTLR start "rule__Atomic__Group_1__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1694:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1698:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1699:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__03345);
            rule__Atomic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__03348);
            rule__Atomic__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__0"


    // $ANTLR start "rule__Atomic__Group_1__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1706:1: rule__Atomic__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1710:1: ( ( '(' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1711:1: ( '(' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1711:1: ( '(' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1712:1: '('
            {
             before(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,23,FOLLOW_23_in_rule__Atomic__Group_1__0__Impl3376); 
             after(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__0__Impl"


    // $ANTLR start "rule__Atomic__Group_1__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1725:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl rule__Atomic__Group_1__2 ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1729:1: ( rule__Atomic__Group_1__1__Impl rule__Atomic__Group_1__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1730:2: rule__Atomic__Group_1__1__Impl rule__Atomic__Group_1__2
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__13407);
            rule__Atomic__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_1__2_in_rule__Atomic__Group_1__13410);
            rule__Atomic__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__1"


    // $ANTLR start "rule__Atomic__Group_1__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1737:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__Group_1_1__0 )? ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1741:1: ( ( ( rule__Atomic__Group_1_1__0 )? ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1742:1: ( ( rule__Atomic__Group_1_1__0 )? )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1742:1: ( ( rule__Atomic__Group_1_1__0 )? )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1743:1: ( rule__Atomic__Group_1_1__0 )?
            {
             before(grammarAccess.getAtomicAccess().getGroup_1_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1744:1: ( rule__Atomic__Group_1_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1744:2: rule__Atomic__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_1_1__0_in_rule__Atomic__Group_1__1__Impl3437);
                    rule__Atomic__Group_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtomicAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__1__Impl"


    // $ANTLR start "rule__Atomic__Group_1__2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1754:1: rule__Atomic__Group_1__2 : rule__Atomic__Group_1__2__Impl ;
    public final void rule__Atomic__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1758:1: ( rule__Atomic__Group_1__2__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1759:2: rule__Atomic__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__2__Impl_in_rule__Atomic__Group_1__23468);
            rule__Atomic__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__2"


    // $ANTLR start "rule__Atomic__Group_1__2__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1765:1: rule__Atomic__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Atomic__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1769:1: ( ( ')' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1770:1: ( ')' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1770:1: ( ')' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1771:1: ')'
            {
             before(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_1_2()); 
            match(input,24,FOLLOW_24_in_rule__Atomic__Group_1__2__Impl3496); 
             after(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__2__Impl"


    // $ANTLR start "rule__Atomic__Group_1_1__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1790:1: rule__Atomic__Group_1_1__0 : rule__Atomic__Group_1_1__0__Impl rule__Atomic__Group_1_1__1 ;
    public final void rule__Atomic__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1794:1: ( rule__Atomic__Group_1_1__0__Impl rule__Atomic__Group_1_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1795:2: rule__Atomic__Group_1_1__0__Impl rule__Atomic__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1_1__0__Impl_in_rule__Atomic__Group_1_1__03533);
            rule__Atomic__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_1_1__1_in_rule__Atomic__Group_1_1__03536);
            rule__Atomic__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1_1__0"


    // $ANTLR start "rule__Atomic__Group_1_1__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1802:1: rule__Atomic__Group_1_1__0__Impl : ( ( rule__Atomic__ArgsAssignment_1_1_0 ) ) ;
    public final void rule__Atomic__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1806:1: ( ( ( rule__Atomic__ArgsAssignment_1_1_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1807:1: ( ( rule__Atomic__ArgsAssignment_1_1_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1807:1: ( ( rule__Atomic__ArgsAssignment_1_1_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1808:1: ( rule__Atomic__ArgsAssignment_1_1_0 )
            {
             before(grammarAccess.getAtomicAccess().getArgsAssignment_1_1_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1809:1: ( rule__Atomic__ArgsAssignment_1_1_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1809:2: rule__Atomic__ArgsAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__Atomic__ArgsAssignment_1_1_0_in_rule__Atomic__Group_1_1__0__Impl3563);
            rule__Atomic__ArgsAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getArgsAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1_1__0__Impl"


    // $ANTLR start "rule__Atomic__Group_1_1__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1819:1: rule__Atomic__Group_1_1__1 : rule__Atomic__Group_1_1__1__Impl ;
    public final void rule__Atomic__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1823:1: ( rule__Atomic__Group_1_1__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1824:2: rule__Atomic__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1_1__1__Impl_in_rule__Atomic__Group_1_1__13593);
            rule__Atomic__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1_1__1"


    // $ANTLR start "rule__Atomic__Group_1_1__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1830:1: rule__Atomic__Group_1_1__1__Impl : ( ( rule__Atomic__Group_1_1_1__0 )* ) ;
    public final void rule__Atomic__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1834:1: ( ( ( rule__Atomic__Group_1_1_1__0 )* ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1835:1: ( ( rule__Atomic__Group_1_1_1__0 )* )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1835:1: ( ( rule__Atomic__Group_1_1_1__0 )* )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1836:1: ( rule__Atomic__Group_1_1_1__0 )*
            {
             before(grammarAccess.getAtomicAccess().getGroup_1_1_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1837:1: ( rule__Atomic__Group_1_1_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1837:2: rule__Atomic__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Atomic__Group_1_1_1__0_in_rule__Atomic__Group_1_1__1__Impl3620);
            	    rule__Atomic__Group_1_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getAtomicAccess().getGroup_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1_1__1__Impl"


    // $ANTLR start "rule__Atomic__Group_1_1_1__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1851:1: rule__Atomic__Group_1_1_1__0 : rule__Atomic__Group_1_1_1__0__Impl rule__Atomic__Group_1_1_1__1 ;
    public final void rule__Atomic__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1855:1: ( rule__Atomic__Group_1_1_1__0__Impl rule__Atomic__Group_1_1_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1856:2: rule__Atomic__Group_1_1_1__0__Impl rule__Atomic__Group_1_1_1__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1_1_1__0__Impl_in_rule__Atomic__Group_1_1_1__03655);
            rule__Atomic__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_1_1_1__1_in_rule__Atomic__Group_1_1_1__03658);
            rule__Atomic__Group_1_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1_1_1__0"


    // $ANTLR start "rule__Atomic__Group_1_1_1__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1863:1: rule__Atomic__Group_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__Atomic__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1867:1: ( ( ',' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1868:1: ( ',' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1868:1: ( ',' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1869:1: ','
            {
             before(grammarAccess.getAtomicAccess().getCommaKeyword_1_1_1_0()); 
            match(input,16,FOLLOW_16_in_rule__Atomic__Group_1_1_1__0__Impl3686); 
             after(grammarAccess.getAtomicAccess().getCommaKeyword_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__Atomic__Group_1_1_1__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1882:1: rule__Atomic__Group_1_1_1__1 : rule__Atomic__Group_1_1_1__1__Impl ;
    public final void rule__Atomic__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1886:1: ( rule__Atomic__Group_1_1_1__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1887:2: rule__Atomic__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1_1_1__1__Impl_in_rule__Atomic__Group_1_1_1__13717);
            rule__Atomic__Group_1_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1_1_1__1"


    // $ANTLR start "rule__Atomic__Group_1_1_1__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1893:1: rule__Atomic__Group_1_1_1__1__Impl : ( ( rule__Atomic__ArgsAssignment_1_1_1_1 ) ) ;
    public final void rule__Atomic__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1897:1: ( ( ( rule__Atomic__ArgsAssignment_1_1_1_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1898:1: ( ( rule__Atomic__ArgsAssignment_1_1_1_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1898:1: ( ( rule__Atomic__ArgsAssignment_1_1_1_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1899:1: ( rule__Atomic__ArgsAssignment_1_1_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getArgsAssignment_1_1_1_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1900:1: ( rule__Atomic__ArgsAssignment_1_1_1_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1900:2: rule__Atomic__ArgsAssignment_1_1_1_1
            {
            pushFollow(FOLLOW_rule__Atomic__ArgsAssignment_1_1_1_1_in_rule__Atomic__Group_1_1_1__1__Impl3744);
            rule__Atomic__ArgsAssignment_1_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getArgsAssignment_1_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__Theorem__Group__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1914:1: rule__Theorem__Group__0 : rule__Theorem__Group__0__Impl rule__Theorem__Group__1 ;
    public final void rule__Theorem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1918:1: ( rule__Theorem__Group__0__Impl rule__Theorem__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1919:2: rule__Theorem__Group__0__Impl rule__Theorem__Group__1
            {
            pushFollow(FOLLOW_rule__Theorem__Group__0__Impl_in_rule__Theorem__Group__03778);
            rule__Theorem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__1_in_rule__Theorem__Group__03781);
            rule__Theorem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__0"


    // $ANTLR start "rule__Theorem__Group__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1926:1: rule__Theorem__Group__0__Impl : ( ( rule__Theorem__RequirementAssignment_0 ) ) ;
    public final void rule__Theorem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1930:1: ( ( ( rule__Theorem__RequirementAssignment_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1931:1: ( ( rule__Theorem__RequirementAssignment_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1931:1: ( ( rule__Theorem__RequirementAssignment_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1932:1: ( rule__Theorem__RequirementAssignment_0 )
            {
             before(grammarAccess.getTheoremAccess().getRequirementAssignment_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1933:1: ( rule__Theorem__RequirementAssignment_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1933:2: rule__Theorem__RequirementAssignment_0
            {
            pushFollow(FOLLOW_rule__Theorem__RequirementAssignment_0_in_rule__Theorem__Group__0__Impl3808);
            rule__Theorem__RequirementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTheoremAccess().getRequirementAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__0__Impl"


    // $ANTLR start "rule__Theorem__Group__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1943:1: rule__Theorem__Group__1 : rule__Theorem__Group__1__Impl rule__Theorem__Group__2 ;
    public final void rule__Theorem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1947:1: ( rule__Theorem__Group__1__Impl rule__Theorem__Group__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1948:2: rule__Theorem__Group__1__Impl rule__Theorem__Group__2
            {
            pushFollow(FOLLOW_rule__Theorem__Group__1__Impl_in_rule__Theorem__Group__13838);
            rule__Theorem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__2_in_rule__Theorem__Group__13841);
            rule__Theorem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__1"


    // $ANTLR start "rule__Theorem__Group__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1955:1: rule__Theorem__Group__1__Impl : ( ':-' ) ;
    public final void rule__Theorem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1959:1: ( ( ':-' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1960:1: ( ':-' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1960:1: ( ':-' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1961:1: ':-'
            {
             before(grammarAccess.getTheoremAccess().getColonHyphenMinusKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__Theorem__Group__1__Impl3869); 
             after(grammarAccess.getTheoremAccess().getColonHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__1__Impl"


    // $ANTLR start "rule__Theorem__Group__2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1974:1: rule__Theorem__Group__2 : rule__Theorem__Group__2__Impl rule__Theorem__Group__3 ;
    public final void rule__Theorem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1978:1: ( rule__Theorem__Group__2__Impl rule__Theorem__Group__3 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1979:2: rule__Theorem__Group__2__Impl rule__Theorem__Group__3
            {
            pushFollow(FOLLOW_rule__Theorem__Group__2__Impl_in_rule__Theorem__Group__23900);
            rule__Theorem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__3_in_rule__Theorem__Group__23903);
            rule__Theorem__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__2"


    // $ANTLR start "rule__Theorem__Group__2__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1986:1: rule__Theorem__Group__2__Impl : ( ( rule__Theorem__ResultAssignment_2 ) ) ;
    public final void rule__Theorem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1990:1: ( ( ( rule__Theorem__ResultAssignment_2 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1991:1: ( ( rule__Theorem__ResultAssignment_2 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1991:1: ( ( rule__Theorem__ResultAssignment_2 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1992:1: ( rule__Theorem__ResultAssignment_2 )
            {
             before(grammarAccess.getTheoremAccess().getResultAssignment_2()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1993:1: ( rule__Theorem__ResultAssignment_2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1993:2: rule__Theorem__ResultAssignment_2
            {
            pushFollow(FOLLOW_rule__Theorem__ResultAssignment_2_in_rule__Theorem__Group__2__Impl3930);
            rule__Theorem__ResultAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTheoremAccess().getResultAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__2__Impl"


    // $ANTLR start "rule__Theorem__Group__3"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2003:1: rule__Theorem__Group__3 : rule__Theorem__Group__3__Impl rule__Theorem__Group__4 ;
    public final void rule__Theorem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2007:1: ( rule__Theorem__Group__3__Impl rule__Theorem__Group__4 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2008:2: rule__Theorem__Group__3__Impl rule__Theorem__Group__4
            {
            pushFollow(FOLLOW_rule__Theorem__Group__3__Impl_in_rule__Theorem__Group__33960);
            rule__Theorem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__4_in_rule__Theorem__Group__33963);
            rule__Theorem__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__3"


    // $ANTLR start "rule__Theorem__Group__3__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2015:1: rule__Theorem__Group__3__Impl : ( ',' ) ;
    public final void rule__Theorem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2019:1: ( ( ',' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2020:1: ( ',' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2020:1: ( ',' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2021:1: ','
            {
             before(grammarAccess.getTheoremAccess().getCommaKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__Theorem__Group__3__Impl3991); 
             after(grammarAccess.getTheoremAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__3__Impl"


    // $ANTLR start "rule__Theorem__Group__4"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2034:1: rule__Theorem__Group__4 : rule__Theorem__Group__4__Impl rule__Theorem__Group__5 ;
    public final void rule__Theorem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2038:1: ( rule__Theorem__Group__4__Impl rule__Theorem__Group__5 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2039:2: rule__Theorem__Group__4__Impl rule__Theorem__Group__5
            {
            pushFollow(FOLLOW_rule__Theorem__Group__4__Impl_in_rule__Theorem__Group__44022);
            rule__Theorem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__5_in_rule__Theorem__Group__44025);
            rule__Theorem__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__4"


    // $ANTLR start "rule__Theorem__Group__4__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2046:1: rule__Theorem__Group__4__Impl : ( ( rule__Theorem__CostAssignment_4 ) ) ;
    public final void rule__Theorem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2050:1: ( ( ( rule__Theorem__CostAssignment_4 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2051:1: ( ( rule__Theorem__CostAssignment_4 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2051:1: ( ( rule__Theorem__CostAssignment_4 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2052:1: ( rule__Theorem__CostAssignment_4 )
            {
             before(grammarAccess.getTheoremAccess().getCostAssignment_4()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2053:1: ( rule__Theorem__CostAssignment_4 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2053:2: rule__Theorem__CostAssignment_4
            {
            pushFollow(FOLLOW_rule__Theorem__CostAssignment_4_in_rule__Theorem__Group__4__Impl4052);
            rule__Theorem__CostAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTheoremAccess().getCostAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__4__Impl"


    // $ANTLR start "rule__Theorem__Group__5"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2063:1: rule__Theorem__Group__5 : rule__Theorem__Group__5__Impl rule__Theorem__Group__6 ;
    public final void rule__Theorem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2067:1: ( rule__Theorem__Group__5__Impl rule__Theorem__Group__6 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2068:2: rule__Theorem__Group__5__Impl rule__Theorem__Group__6
            {
            pushFollow(FOLLOW_rule__Theorem__Group__5__Impl_in_rule__Theorem__Group__54082);
            rule__Theorem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__6_in_rule__Theorem__Group__54085);
            rule__Theorem__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__5"


    // $ANTLR start "rule__Theorem__Group__5__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2075:1: rule__Theorem__Group__5__Impl : ( ',' ) ;
    public final void rule__Theorem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2079:1: ( ( ',' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2080:1: ( ',' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2080:1: ( ',' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2081:1: ','
            {
             before(grammarAccess.getTheoremAccess().getCommaKeyword_5()); 
            match(input,16,FOLLOW_16_in_rule__Theorem__Group__5__Impl4113); 
             after(grammarAccess.getTheoremAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__5__Impl"


    // $ANTLR start "rule__Theorem__Group__6"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2094:1: rule__Theorem__Group__6 : rule__Theorem__Group__6__Impl rule__Theorem__Group__7 ;
    public final void rule__Theorem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2098:1: ( rule__Theorem__Group__6__Impl rule__Theorem__Group__7 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2099:2: rule__Theorem__Group__6__Impl rule__Theorem__Group__7
            {
            pushFollow(FOLLOW_rule__Theorem__Group__6__Impl_in_rule__Theorem__Group__64144);
            rule__Theorem__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__7_in_rule__Theorem__Group__64147);
            rule__Theorem__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__6"


    // $ANTLR start "rule__Theorem__Group__6__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2106:1: rule__Theorem__Group__6__Impl : ( ( rule__Theorem__DescriptionAssignment_6 ) ) ;
    public final void rule__Theorem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2110:1: ( ( ( rule__Theorem__DescriptionAssignment_6 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2111:1: ( ( rule__Theorem__DescriptionAssignment_6 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2111:1: ( ( rule__Theorem__DescriptionAssignment_6 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2112:1: ( rule__Theorem__DescriptionAssignment_6 )
            {
             before(grammarAccess.getTheoremAccess().getDescriptionAssignment_6()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2113:1: ( rule__Theorem__DescriptionAssignment_6 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2113:2: rule__Theorem__DescriptionAssignment_6
            {
            pushFollow(FOLLOW_rule__Theorem__DescriptionAssignment_6_in_rule__Theorem__Group__6__Impl4174);
            rule__Theorem__DescriptionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTheoremAccess().getDescriptionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__6__Impl"


    // $ANTLR start "rule__Theorem__Group__7"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2123:1: rule__Theorem__Group__7 : rule__Theorem__Group__7__Impl ;
    public final void rule__Theorem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2127:1: ( rule__Theorem__Group__7__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2128:2: rule__Theorem__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Theorem__Group__7__Impl_in_rule__Theorem__Group__74204);
            rule__Theorem__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__7"


    // $ANTLR start "rule__Theorem__Group__7__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2134:1: rule__Theorem__Group__7__Impl : ( ( rule__Theorem__Group_7__0 )? ) ;
    public final void rule__Theorem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2138:1: ( ( ( rule__Theorem__Group_7__0 )? ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2139:1: ( ( rule__Theorem__Group_7__0 )? )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2139:1: ( ( rule__Theorem__Group_7__0 )? )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2140:1: ( rule__Theorem__Group_7__0 )?
            {
             before(grammarAccess.getTheoremAccess().getGroup_7()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2141:1: ( rule__Theorem__Group_7__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2141:2: rule__Theorem__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Theorem__Group_7__0_in_rule__Theorem__Group__7__Impl4231);
                    rule__Theorem__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTheoremAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group__7__Impl"


    // $ANTLR start "rule__Theorem__Group_7__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2167:1: rule__Theorem__Group_7__0 : rule__Theorem__Group_7__0__Impl rule__Theorem__Group_7__1 ;
    public final void rule__Theorem__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2171:1: ( rule__Theorem__Group_7__0__Impl rule__Theorem__Group_7__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2172:2: rule__Theorem__Group_7__0__Impl rule__Theorem__Group_7__1
            {
            pushFollow(FOLLOW_rule__Theorem__Group_7__0__Impl_in_rule__Theorem__Group_7__04278);
            rule__Theorem__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group_7__1_in_rule__Theorem__Group_7__04281);
            rule__Theorem__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group_7__0"


    // $ANTLR start "rule__Theorem__Group_7__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2179:1: rule__Theorem__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Theorem__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2183:1: ( ( ',' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2184:1: ( ',' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2184:1: ( ',' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2185:1: ','
            {
             before(grammarAccess.getTheoremAccess().getCommaKeyword_7_0()); 
            match(input,16,FOLLOW_16_in_rule__Theorem__Group_7__0__Impl4309); 
             after(grammarAccess.getTheoremAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group_7__0__Impl"


    // $ANTLR start "rule__Theorem__Group_7__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2198:1: rule__Theorem__Group_7__1 : rule__Theorem__Group_7__1__Impl ;
    public final void rule__Theorem__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2202:1: ( rule__Theorem__Group_7__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2203:2: rule__Theorem__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Theorem__Group_7__1__Impl_in_rule__Theorem__Group_7__14340);
            rule__Theorem__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group_7__1"


    // $ANTLR start "rule__Theorem__Group_7__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2209:1: rule__Theorem__Group_7__1__Impl : ( ( rule__Theorem__PseudoCodeAssignment_7_1 ) ) ;
    public final void rule__Theorem__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2213:1: ( ( ( rule__Theorem__PseudoCodeAssignment_7_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2214:1: ( ( rule__Theorem__PseudoCodeAssignment_7_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2214:1: ( ( rule__Theorem__PseudoCodeAssignment_7_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2215:1: ( rule__Theorem__PseudoCodeAssignment_7_1 )
            {
             before(grammarAccess.getTheoremAccess().getPseudoCodeAssignment_7_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2216:1: ( rule__Theorem__PseudoCodeAssignment_7_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2216:2: rule__Theorem__PseudoCodeAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Theorem__PseudoCodeAssignment_7_1_in_rule__Theorem__Group_7__1__Impl4367);
            rule__Theorem__PseudoCodeAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getTheoremAccess().getPseudoCodeAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__Group_7__1__Impl"


    // $ANTLR start "rule__Input__GivenAssignment_1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2231:1: rule__Input__GivenAssignment_1 : ( ruleProblem ) ;
    public final void rule__Input__GivenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2235:1: ( ( ruleProblem ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2236:1: ( ruleProblem )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2236:1: ( ruleProblem )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2237:1: ruleProblem
            {
             before(grammarAccess.getInputAccess().getGivenProblemParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleProblem_in_rule__Input__GivenAssignment_14406);
            ruleProblem();

            state._fsp--;

             after(grammarAccess.getInputAccess().getGivenProblemParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__GivenAssignment_1"


    // $ANTLR start "rule__Input__GoalAssignment_4"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2246:1: rule__Input__GoalAssignment_4 : ( ruleProblem ) ;
    public final void rule__Input__GoalAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2250:1: ( ( ruleProblem ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2251:1: ( ruleProblem )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2251:1: ( ruleProblem )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2252:1: ruleProblem
            {
             before(grammarAccess.getInputAccess().getGoalProblemParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleProblem_in_rule__Input__GoalAssignment_44437);
            ruleProblem();

            state._fsp--;

             after(grammarAccess.getInputAccess().getGoalProblemParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__GoalAssignment_4"


    // $ANTLR start "rule__Input__TheoremsAssignment_5_2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2261:1: rule__Input__TheoremsAssignment_5_2 : ( ruleTheorem ) ;
    public final void rule__Input__TheoremsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2265:1: ( ( ruleTheorem ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2266:1: ( ruleTheorem )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2266:1: ( ruleTheorem )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2267:1: ruleTheorem
            {
             before(grammarAccess.getInputAccess().getTheoremsTheoremParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_ruleTheorem_in_rule__Input__TheoremsAssignment_5_24468);
            ruleTheorem();

            state._fsp--;

             after(grammarAccess.getInputAccess().getTheoremsTheoremParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__TheoremsAssignment_5_2"


    // $ANTLR start "rule__Input__TheoremsAssignment_5_3_1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2276:1: rule__Input__TheoremsAssignment_5_3_1 : ( ruleTheorem ) ;
    public final void rule__Input__TheoremsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2280:1: ( ( ruleTheorem ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2281:1: ( ruleTheorem )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2281:1: ( ruleTheorem )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2282:1: ruleTheorem
            {
             before(grammarAccess.getInputAccess().getTheoremsTheoremParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_ruleTheorem_in_rule__Input__TheoremsAssignment_5_3_14499);
            ruleTheorem();

            state._fsp--;

             after(grammarAccess.getInputAccess().getTheoremsTheoremParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__TheoremsAssignment_5_3_1"


    // $ANTLR start "rule__Problem__VarsAssignment_0_0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2291:1: rule__Problem__VarsAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Problem__VarsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2295:1: ( ( RULE_ID ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2296:1: ( RULE_ID )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2296:1: ( RULE_ID )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2297:1: RULE_ID
            {
             before(grammarAccess.getProblemAccess().getVarsIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Problem__VarsAssignment_0_04530); 
             after(grammarAccess.getProblemAccess().getVarsIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__VarsAssignment_0_0"


    // $ANTLR start "rule__Problem__VarsAssignment_0_1_1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2306:1: rule__Problem__VarsAssignment_0_1_1 : ( RULE_ID ) ;
    public final void rule__Problem__VarsAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2310:1: ( ( RULE_ID ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2311:1: ( RULE_ID )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2311:1: ( RULE_ID )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2312:1: RULE_ID
            {
             before(grammarAccess.getProblemAccess().getVarsIDTerminalRuleCall_0_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Problem__VarsAssignment_0_1_14561); 
             after(grammarAccess.getProblemAccess().getVarsIDTerminalRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__VarsAssignment_0_1_1"


    // $ANTLR start "rule__Problem__PropertyAssignment_2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2321:1: rule__Problem__PropertyAssignment_2 : ( ruleORing ) ;
    public final void rule__Problem__PropertyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2325:1: ( ( ruleORing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2326:1: ( ruleORing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2326:1: ( ruleORing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2327:1: ruleORing
            {
             before(grammarAccess.getProblemAccess().getPropertyORingParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleORing_in_rule__Problem__PropertyAssignment_24592);
            ruleORing();

            state._fsp--;

             after(grammarAccess.getProblemAccess().getPropertyORingParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__PropertyAssignment_2"


    // $ANTLR start "rule__ORing__RightAssignment_1_2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2336:1: rule__ORing__RightAssignment_1_2 : ( ruleANDing ) ;
    public final void rule__ORing__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2340:1: ( ( ruleANDing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2341:1: ( ruleANDing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2341:1: ( ruleANDing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2342:1: ruleANDing
            {
             before(grammarAccess.getORingAccess().getRightANDingParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleANDing_in_rule__ORing__RightAssignment_1_24623);
            ruleANDing();

            state._fsp--;

             after(grammarAccess.getORingAccess().getRightANDingParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORing__RightAssignment_1_2"


    // $ANTLR start "rule__ANDing__RightAssignment_1_2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2351:1: rule__ANDing__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__ANDing__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2355:1: ( ( rulePrimary ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2356:1: ( rulePrimary )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2356:1: ( rulePrimary )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2357:1: rulePrimary
            {
             before(grammarAccess.getANDingAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__ANDing__RightAssignment_1_24654);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getANDingAccess().getRightPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDing__RightAssignment_1_2"


    // $ANTLR start "rule__Quantifier__QuantifierAssignment_0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2366:1: rule__Quantifier__QuantifierAssignment_0 : ( ( rule__Quantifier__QuantifierAlternatives_0_0 ) ) ;
    public final void rule__Quantifier__QuantifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2370:1: ( ( ( rule__Quantifier__QuantifierAlternatives_0_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2371:1: ( ( rule__Quantifier__QuantifierAlternatives_0_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2371:1: ( ( rule__Quantifier__QuantifierAlternatives_0_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2372:1: ( rule__Quantifier__QuantifierAlternatives_0_0 )
            {
             before(grammarAccess.getQuantifierAccess().getQuantifierAlternatives_0_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2373:1: ( rule__Quantifier__QuantifierAlternatives_0_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2373:2: rule__Quantifier__QuantifierAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__Quantifier__QuantifierAlternatives_0_0_in_rule__Quantifier__QuantifierAssignment_04685);
            rule__Quantifier__QuantifierAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getQuantifierAccess().getQuantifierAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifier__QuantifierAssignment_0"


    // $ANTLR start "rule__Quantifier__SubjectAssignment_2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2382:1: rule__Quantifier__SubjectAssignment_2 : ( ruleProblem ) ;
    public final void rule__Quantifier__SubjectAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2386:1: ( ( ruleProblem ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2387:1: ( ruleProblem )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2387:1: ( ruleProblem )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2388:1: ruleProblem
            {
             before(grammarAccess.getQuantifierAccess().getSubjectProblemParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleProblem_in_rule__Quantifier__SubjectAssignment_24718);
            ruleProblem();

            state._fsp--;

             after(grammarAccess.getQuantifierAccess().getSubjectProblemParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifier__SubjectAssignment_2"


    // $ANTLR start "rule__Quantifier__PredicateAssignment_4"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2397:1: rule__Quantifier__PredicateAssignment_4 : ( ruleORing ) ;
    public final void rule__Quantifier__PredicateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2401:1: ( ( ruleORing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2402:1: ( ruleORing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2402:1: ( ruleORing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2403:1: ruleORing
            {
             before(grammarAccess.getQuantifierAccess().getPredicateORingParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleORing_in_rule__Quantifier__PredicateAssignment_44749);
            ruleORing();

            state._fsp--;

             after(grammarAccess.getQuantifierAccess().getPredicateORingParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantifier__PredicateAssignment_4"


    // $ANTLR start "rule__Atomic__FunctionAssignment_0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2412:1: rule__Atomic__FunctionAssignment_0 : ( RULE_ID ) ;
    public final void rule__Atomic__FunctionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2416:1: ( ( RULE_ID ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2417:1: ( RULE_ID )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2417:1: ( RULE_ID )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2418:1: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getFunctionIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Atomic__FunctionAssignment_04780); 
             after(grammarAccess.getAtomicAccess().getFunctionIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__FunctionAssignment_0"


    // $ANTLR start "rule__Atomic__ArgsAssignment_1_1_0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2427:1: rule__Atomic__ArgsAssignment_1_1_0 : ( RULE_ID ) ;
    public final void rule__Atomic__ArgsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2431:1: ( ( RULE_ID ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2432:1: ( RULE_ID )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2432:1: ( RULE_ID )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2433:1: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getArgsIDTerminalRuleCall_1_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Atomic__ArgsAssignment_1_1_04811); 
             after(grammarAccess.getAtomicAccess().getArgsIDTerminalRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ArgsAssignment_1_1_0"


    // $ANTLR start "rule__Atomic__ArgsAssignment_1_1_1_1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2442:1: rule__Atomic__ArgsAssignment_1_1_1_1 : ( RULE_ID ) ;
    public final void rule__Atomic__ArgsAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2446:1: ( ( RULE_ID ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2447:1: ( RULE_ID )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2447:1: ( RULE_ID )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2448:1: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getArgsIDTerminalRuleCall_1_1_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Atomic__ArgsAssignment_1_1_1_14842); 
             after(grammarAccess.getAtomicAccess().getArgsIDTerminalRuleCall_1_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ArgsAssignment_1_1_1_1"


    // $ANTLR start "rule__BooleanLiteral__ValueAssignment"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2457:1: rule__BooleanLiteral__ValueAssignment : ( ( rule__BooleanLiteral__ValueAlternatives_0 ) ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2461:1: ( ( ( rule__BooleanLiteral__ValueAlternatives_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2462:1: ( ( rule__BooleanLiteral__ValueAlternatives_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2462:1: ( ( rule__BooleanLiteral__ValueAlternatives_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2463:1: ( rule__BooleanLiteral__ValueAlternatives_0 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2464:1: ( rule__BooleanLiteral__ValueAlternatives_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2464:2: rule__BooleanLiteral__ValueAlternatives_0
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__ValueAlternatives_0_in_rule__BooleanLiteral__ValueAssignment4873);
            rule__BooleanLiteral__ValueAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__ValueAssignment"


    // $ANTLR start "rule__Theorem__RequirementAssignment_0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2473:1: rule__Theorem__RequirementAssignment_0 : ( ruleORing ) ;
    public final void rule__Theorem__RequirementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2477:1: ( ( ruleORing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2478:1: ( ruleORing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2478:1: ( ruleORing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2479:1: ruleORing
            {
             before(grammarAccess.getTheoremAccess().getRequirementORingParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleORing_in_rule__Theorem__RequirementAssignment_04906);
            ruleORing();

            state._fsp--;

             after(grammarAccess.getTheoremAccess().getRequirementORingParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__RequirementAssignment_0"


    // $ANTLR start "rule__Theorem__ResultAssignment_2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2488:1: rule__Theorem__ResultAssignment_2 : ( ruleORing ) ;
    public final void rule__Theorem__ResultAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2492:1: ( ( ruleORing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2493:1: ( ruleORing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2493:1: ( ruleORing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2494:1: ruleORing
            {
             before(grammarAccess.getTheoremAccess().getResultORingParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleORing_in_rule__Theorem__ResultAssignment_24937);
            ruleORing();

            state._fsp--;

             after(grammarAccess.getTheoremAccess().getResultORingParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__ResultAssignment_2"


    // $ANTLR start "rule__Theorem__CostAssignment_4"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2503:1: rule__Theorem__CostAssignment_4 : ( RULE_INT ) ;
    public final void rule__Theorem__CostAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2507:1: ( ( RULE_INT ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2508:1: ( RULE_INT )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2508:1: ( RULE_INT )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2509:1: RULE_INT
            {
             before(grammarAccess.getTheoremAccess().getCostINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Theorem__CostAssignment_44968); 
             after(grammarAccess.getTheoremAccess().getCostINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__CostAssignment_4"


    // $ANTLR start "rule__Theorem__DescriptionAssignment_6"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2518:1: rule__Theorem__DescriptionAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Theorem__DescriptionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2522:1: ( ( RULE_STRING ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2523:1: ( RULE_STRING )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2523:1: ( RULE_STRING )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2524:1: RULE_STRING
            {
             before(grammarAccess.getTheoremAccess().getDescriptionSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Theorem__DescriptionAssignment_64999); 
             after(grammarAccess.getTheoremAccess().getDescriptionSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__DescriptionAssignment_6"


    // $ANTLR start "rule__Theorem__PseudoCodeAssignment_7_1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2533:1: rule__Theorem__PseudoCodeAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__Theorem__PseudoCodeAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2537:1: ( ( RULE_STRING ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2538:1: ( RULE_STRING )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2538:1: ( RULE_STRING )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2539:1: RULE_STRING
            {
             before(grammarAccess.getTheoremAccess().getPseudoCodeSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Theorem__PseudoCodeAssignment_7_15030); 
             after(grammarAccess.getTheoremAccess().getPseudoCodeSTRINGTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__PseudoCodeAssignment_7_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__0_in_ruleInput94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblem_in_entryRuleProblem121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProblem128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group__0_in_ruleProblem154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_entryRuleORing181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleORing188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORing__Group__0_in_ruleORing214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANDing_in_entryRuleANDing241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleANDing248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANDing__Group__0_in_ruleANDing274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Alternatives_in_rulePrimary334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_entryRuleQuantifier361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantifier368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__0_in_ruleQuantifier394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group__0_in_ruleAtomic454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTheorem_in_entryRuleTheorem541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTheorem548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__0_in_ruleTheorem574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rule__Primary__Alternatives610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_rule__Primary__Alternatives627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_2__0_in_rule__Primary__Alternatives644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__Primary__Alternatives662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Quantifier__QuantifierAlternatives_0_0695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Quantifier__QuantifierAlternatives_0_0715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BooleanLiteral__ValueAlternatives_0750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BooleanLiteral__ValueAlternatives_0770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__0802 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Input__Group__1_in_rule__Input__Group__0805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Input__Group__0__Impl833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__1864 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Input__Group__2_in_rule__Input__Group__1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__GivenAssignment_1_in_rule__Input__Group__1__Impl894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__2__Impl_in_rule__Input__Group__2924 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Input__Group__3_in_rule__Input__Group__2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Input__Group__2__Impl955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__3__Impl_in_rule__Input__Group__3986 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Input__Group__4_in_rule__Input__Group__3989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Input__Group__3__Impl1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__4__Impl_in_rule__Input__Group__41048 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Input__Group__5_in_rule__Input__Group__41051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__GoalAssignment_4_in_rule__Input__Group__4__Impl1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__5__Impl_in_rule__Input__Group__51108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_5__0_in_rule__Input__Group__5__Impl1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_5__0__Impl_in_rule__Input__Group_5__01178 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Input__Group_5__1_in_rule__Input__Group_5__01181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Input__Group_5__0__Impl1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_5__1__Impl_in_rule__Input__Group_5__11240 = new BitSet(new long[]{0x0000000000807810L});
    public static final BitSet FOLLOW_rule__Input__Group_5__2_in_rule__Input__Group_5__11243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Input__Group_5__1__Impl1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_5__2__Impl_in_rule__Input__Group_5__21302 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Input__Group_5__3_in_rule__Input__Group_5__21305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__TheoremsAssignment_5_2_in_rule__Input__Group_5__2__Impl1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_5__3__Impl_in_rule__Input__Group_5__31362 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Input__Group_5__4_in_rule__Input__Group_5__31365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_5_3__0_in_rule__Input__Group_5__3__Impl1392 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Input__Group_5__4__Impl_in_rule__Input__Group_5__41423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Input__Group_5__4__Impl1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_5_3__0__Impl_in_rule__Input__Group_5_3__01495 = new BitSet(new long[]{0x0000000000807810L});
    public static final BitSet FOLLOW_rule__Input__Group_5_3__1_in_rule__Input__Group_5_3__01498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Input__Group_5_3__0__Impl1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_5_3__1__Impl_in_rule__Input__Group_5_3__11557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__TheoremsAssignment_5_3_1_in_rule__Input__Group_5_3__1__Impl1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group__0__Impl_in_rule__Problem__Group__01618 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Problem__Group__1_in_rule__Problem__Group__01621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group_0__0_in_rule__Problem__Group__0__Impl1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group__1__Impl_in_rule__Problem__Group__11678 = new BitSet(new long[]{0x0000000000807810L});
    public static final BitSet FOLLOW_rule__Problem__Group__2_in_rule__Problem__Group__11681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Problem__Group__1__Impl1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group__2__Impl_in_rule__Problem__Group__21740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__PropertyAssignment_2_in_rule__Problem__Group__2__Impl1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group_0__0__Impl_in_rule__Problem__Group_0__01803 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Problem__Group_0__1_in_rule__Problem__Group_0__01806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__VarsAssignment_0_0_in_rule__Problem__Group_0__0__Impl1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group_0__1__Impl_in_rule__Problem__Group_0__11863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group_0_1__0_in_rule__Problem__Group_0__1__Impl1890 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Problem__Group_0_1__0__Impl_in_rule__Problem__Group_0_1__01925 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Problem__Group_0_1__1_in_rule__Problem__Group_0_1__01928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Problem__Group_0_1__0__Impl1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group_0_1__1__Impl_in_rule__Problem__Group_0_1__11987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__VarsAssignment_0_1_1_in_rule__Problem__Group_0_1__1__Impl2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORing__Group__0__Impl_in_rule__ORing__Group__02048 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ORing__Group__1_in_rule__ORing__Group__02051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANDing_in_rule__ORing__Group__0__Impl2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORing__Group__1__Impl_in_rule__ORing__Group__12107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORing__Group_1__0_in_rule__ORing__Group__1__Impl2134 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__ORing__Group_1__0__Impl_in_rule__ORing__Group_1__02169 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ORing__Group_1__1_in_rule__ORing__Group_1__02172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORing__Group_1__1__Impl_in_rule__ORing__Group_1__12230 = new BitSet(new long[]{0x0000000000807810L});
    public static final BitSet FOLLOW_rule__ORing__Group_1__2_in_rule__ORing__Group_1__12233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ORing__Group_1__1__Impl2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORing__Group_1__2__Impl_in_rule__ORing__Group_1__22292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORing__RightAssignment_1_2_in_rule__ORing__Group_1__2__Impl2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANDing__Group__0__Impl_in_rule__ANDing__Group__02355 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ANDing__Group__1_in_rule__ANDing__Group__02358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__ANDing__Group__0__Impl2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANDing__Group__1__Impl_in_rule__ANDing__Group__12414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANDing__Group_1__0_in_rule__ANDing__Group__1__Impl2441 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__ANDing__Group_1__0__Impl_in_rule__ANDing__Group_1__02476 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ANDing__Group_1__1_in_rule__ANDing__Group_1__02479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANDing__Group_1__1__Impl_in_rule__ANDing__Group_1__12537 = new BitSet(new long[]{0x0000000000807810L});
    public static final BitSet FOLLOW_rule__ANDing__Group_1__2_in_rule__ANDing__Group_1__12540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ANDing__Group_1__1__Impl2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANDing__Group_1__2__Impl_in_rule__ANDing__Group_1__22599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANDing__RightAssignment_1_2_in_rule__ANDing__Group_1__2__Impl2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_2__0__Impl_in_rule__Primary__Group_2__02662 = new BitSet(new long[]{0x0000000000807810L});
    public static final BitSet FOLLOW_rule__Primary__Group_2__1_in_rule__Primary__Group_2__02665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Primary__Group_2__0__Impl2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_2__1__Impl_in_rule__Primary__Group_2__12724 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Primary__Group_2__2_in_rule__Primary__Group_2__12727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_rule__Primary__Group_2__1__Impl2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_2__2__Impl_in_rule__Primary__Group_2__22783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Primary__Group_2__2__Impl2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__0__Impl_in_rule__Quantifier__Group__02848 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__1_in_rule__Quantifier__Group__02851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__QuantifierAssignment_0_in_rule__Quantifier__Group__0__Impl2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__1__Impl_in_rule__Quantifier__Group__12908 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__2_in_rule__Quantifier__Group__12911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Quantifier__Group__1__Impl2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__2__Impl_in_rule__Quantifier__Group__22970 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__3_in_rule__Quantifier__Group__22973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__SubjectAssignment_2_in_rule__Quantifier__Group__2__Impl3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__3__Impl_in_rule__Quantifier__Group__33030 = new BitSet(new long[]{0x0000000000807810L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__4_in_rule__Quantifier__Group__33033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Quantifier__Group__3__Impl3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__4__Impl_in_rule__Quantifier__Group__43092 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__5_in_rule__Quantifier__Group__43095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__PredicateAssignment_4_in_rule__Quantifier__Group__4__Impl3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__5__Impl_in_rule__Quantifier__Group__53152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Quantifier__Group__5__Impl3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group__0__Impl_in_rule__Atomic__Group__03223 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Atomic__Group__1_in_rule__Atomic__Group__03226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__FunctionAssignment_0_in_rule__Atomic__Group__0__Impl3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group__1__Impl_in_rule__Atomic__Group__13283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Group__1__Impl3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__03345 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__03348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Atomic__Group_1__0__Impl3376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__13407 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__2_in_rule__Atomic__Group_1__13410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1_1__0_in_rule__Atomic__Group_1__1__Impl3437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__2__Impl_in_rule__Atomic__Group_1__23468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Atomic__Group_1__2__Impl3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1_1__0__Impl_in_rule__Atomic__Group_1_1__03533 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1_1__1_in_rule__Atomic__Group_1_1__03536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ArgsAssignment_1_1_0_in_rule__Atomic__Group_1_1__0__Impl3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1_1__1__Impl_in_rule__Atomic__Group_1_1__13593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1_1_1__0_in_rule__Atomic__Group_1_1__1__Impl3620 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1_1_1__0__Impl_in_rule__Atomic__Group_1_1_1__03655 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1_1_1__1_in_rule__Atomic__Group_1_1_1__03658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Atomic__Group_1_1_1__0__Impl3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1_1_1__1__Impl_in_rule__Atomic__Group_1_1_1__13717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ArgsAssignment_1_1_1_1_in_rule__Atomic__Group_1_1_1__1__Impl3744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__0__Impl_in_rule__Theorem__Group__03778 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Theorem__Group__1_in_rule__Theorem__Group__03781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__RequirementAssignment_0_in_rule__Theorem__Group__0__Impl3808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__1__Impl_in_rule__Theorem__Group__13838 = new BitSet(new long[]{0x0000000000807810L});
    public static final BitSet FOLLOW_rule__Theorem__Group__2_in_rule__Theorem__Group__13841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Theorem__Group__1__Impl3869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__2__Impl_in_rule__Theorem__Group__23900 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Theorem__Group__3_in_rule__Theorem__Group__23903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__ResultAssignment_2_in_rule__Theorem__Group__2__Impl3930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__3__Impl_in_rule__Theorem__Group__33960 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Theorem__Group__4_in_rule__Theorem__Group__33963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Theorem__Group__3__Impl3991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__4__Impl_in_rule__Theorem__Group__44022 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Theorem__Group__5_in_rule__Theorem__Group__44025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__CostAssignment_4_in_rule__Theorem__Group__4__Impl4052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__5__Impl_in_rule__Theorem__Group__54082 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Theorem__Group__6_in_rule__Theorem__Group__54085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Theorem__Group__5__Impl4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__6__Impl_in_rule__Theorem__Group__64144 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Theorem__Group__7_in_rule__Theorem__Group__64147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__DescriptionAssignment_6_in_rule__Theorem__Group__6__Impl4174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__7__Impl_in_rule__Theorem__Group__74204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group_7__0_in_rule__Theorem__Group__7__Impl4231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group_7__0__Impl_in_rule__Theorem__Group_7__04278 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Theorem__Group_7__1_in_rule__Theorem__Group_7__04281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Theorem__Group_7__0__Impl4309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group_7__1__Impl_in_rule__Theorem__Group_7__14340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__PseudoCodeAssignment_7_1_in_rule__Theorem__Group_7__1__Impl4367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblem_in_rule__Input__GivenAssignment_14406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblem_in_rule__Input__GoalAssignment_44437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTheorem_in_rule__Input__TheoremsAssignment_5_24468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTheorem_in_rule__Input__TheoremsAssignment_5_3_14499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Problem__VarsAssignment_0_04530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Problem__VarsAssignment_0_1_14561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_rule__Problem__PropertyAssignment_24592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANDing_in_rule__ORing__RightAssignment_1_24623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__ANDing__RightAssignment_1_24654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__QuantifierAlternatives_0_0_in_rule__Quantifier__QuantifierAssignment_04685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblem_in_rule__Quantifier__SubjectAssignment_24718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_rule__Quantifier__PredicateAssignment_44749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Atomic__FunctionAssignment_04780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Atomic__ArgsAssignment_1_1_04811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Atomic__ArgsAssignment_1_1_1_14842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAlternatives_0_in_rule__BooleanLiteral__ValueAssignment4873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_rule__Theorem__RequirementAssignment_04906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_rule__Theorem__ResultAssignment_24937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Theorem__CostAssignment_44968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Theorem__DescriptionAssignment_64999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Theorem__PseudoCodeAssignment_7_15030 = new BitSet(new long[]{0x0000000000000002L});

}