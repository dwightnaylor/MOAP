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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'forall'", "'exists'", "'TRUE'", "'FALSE'", "'Given'", "';'", "'Find'", "'Theorems:'", "'st'", "','", "'('", "')'", "'<'", "'>'", "'|'", "'&'", "':'", "':-'"
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


    // $ANTLR start "entryRuleDeclaration"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:116:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:117:1: ( ruleDeclaration EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:118:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration181);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration188); 

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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:125:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:129:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:130:1: ( ( rule__Declaration__Alternatives ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:130:1: ( ( rule__Declaration__Alternatives ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:131:1: ( rule__Declaration__Alternatives )
            {
             before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:132:1: ( rule__Declaration__Alternatives )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:132:2: rule__Declaration__Alternatives
            {
            pushFollow(FOLLOW_rule__Declaration__Alternatives_in_ruleDeclaration214);
            rule__Declaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleType"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:144:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:145:1: ( ruleType EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:146:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType241);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType248); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:153:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:157:2: ( ( ( rule__Type__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:158:1: ( ( rule__Type__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:158:1: ( ( rule__Type__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:159:1: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:160:1: ( rule__Type__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:160:2: rule__Type__Group__0
            {
            pushFollow(FOLLOW_rule__Type__Group__0_in_ruleType274);
            rule__Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleORing"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:172:1: entryRuleORing : ruleORing EOF ;
    public final void entryRuleORing() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:173:1: ( ruleORing EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:174:1: ruleORing EOF
            {
             before(grammarAccess.getORingRule()); 
            pushFollow(FOLLOW_ruleORing_in_entryRuleORing301);
            ruleORing();

            state._fsp--;

             after(grammarAccess.getORingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleORing308); 

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:181:1: ruleORing : ( ( rule__ORing__Group__0 ) ) ;
    public final void ruleORing() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:185:2: ( ( ( rule__ORing__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:186:1: ( ( rule__ORing__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:186:1: ( ( rule__ORing__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:187:1: ( rule__ORing__Group__0 )
            {
             before(grammarAccess.getORingAccess().getGroup()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:188:1: ( rule__ORing__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:188:2: rule__ORing__Group__0
            {
            pushFollow(FOLLOW_rule__ORing__Group__0_in_ruleORing334);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:200:1: entryRuleANDing : ruleANDing EOF ;
    public final void entryRuleANDing() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:201:1: ( ruleANDing EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:202:1: ruleANDing EOF
            {
             before(grammarAccess.getANDingRule()); 
            pushFollow(FOLLOW_ruleANDing_in_entryRuleANDing361);
            ruleANDing();

            state._fsp--;

             after(grammarAccess.getANDingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleANDing368); 

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:209:1: ruleANDing : ( ( rule__ANDing__Group__0 ) ) ;
    public final void ruleANDing() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:213:2: ( ( ( rule__ANDing__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:214:1: ( ( rule__ANDing__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:214:1: ( ( rule__ANDing__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:215:1: ( rule__ANDing__Group__0 )
            {
             before(grammarAccess.getANDingAccess().getGroup()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:216:1: ( rule__ANDing__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:216:2: rule__ANDing__Group__0
            {
            pushFollow(FOLLOW_rule__ANDing__Group__0_in_ruleANDing394);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:228:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:229:1: ( rulePrimary EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:230:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary421);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary428); 

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:237:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:241:2: ( ( ( rule__Primary__Alternatives ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:242:1: ( ( rule__Primary__Alternatives ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:242:1: ( ( rule__Primary__Alternatives ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:243:1: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:244:1: ( rule__Primary__Alternatives )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:244:2: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_rule__Primary__Alternatives_in_rulePrimary454);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:256:1: entryRuleQuantifier : ruleQuantifier EOF ;
    public final void entryRuleQuantifier() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:257:1: ( ruleQuantifier EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:258:1: ruleQuantifier EOF
            {
             before(grammarAccess.getQuantifierRule()); 
            pushFollow(FOLLOW_ruleQuantifier_in_entryRuleQuantifier481);
            ruleQuantifier();

            state._fsp--;

             after(grammarAccess.getQuantifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantifier488); 

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:265:1: ruleQuantifier : ( ( rule__Quantifier__Group__0 ) ) ;
    public final void ruleQuantifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:269:2: ( ( ( rule__Quantifier__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:270:1: ( ( rule__Quantifier__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:270:1: ( ( rule__Quantifier__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:271:1: ( rule__Quantifier__Group__0 )
            {
             before(grammarAccess.getQuantifierAccess().getGroup()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:272:1: ( rule__Quantifier__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:272:2: rule__Quantifier__Group__0
            {
            pushFollow(FOLLOW_rule__Quantifier__Group__0_in_ruleQuantifier514);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:284:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:285:1: ( ruleAtomic EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:286:1: ruleAtomic EOF
            {
             before(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic541);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getAtomicRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic548); 

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:293:1: ruleAtomic : ( ( rule__Atomic__Group__0 ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:297:2: ( ( ( rule__Atomic__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:298:1: ( ( rule__Atomic__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:298:1: ( ( rule__Atomic__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:299:1: ( rule__Atomic__Group__0 )
            {
             before(grammarAccess.getAtomicAccess().getGroup()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:300:1: ( rule__Atomic__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:300:2: rule__Atomic__Group__0
            {
            pushFollow(FOLLOW_rule__Atomic__Group__0_in_ruleAtomic574);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:312:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:313:1: ( ruleBooleanLiteral EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:314:1: ruleBooleanLiteral EOF
            {
             before(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral601);
            ruleBooleanLiteral();

            state._fsp--;

             after(grammarAccess.getBooleanLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral608); 

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:321:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__ValueAssignment ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:325:2: ( ( ( rule__BooleanLiteral__ValueAssignment ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:326:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:326:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:327:1: ( rule__BooleanLiteral__ValueAssignment )
            {
             before(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:328:1: ( rule__BooleanLiteral__ValueAssignment )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:328:2: rule__BooleanLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral634);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:340:1: entryRuleTheorem : ruleTheorem EOF ;
    public final void entryRuleTheorem() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:341:1: ( ruleTheorem EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:342:1: ruleTheorem EOF
            {
             before(grammarAccess.getTheoremRule()); 
            pushFollow(FOLLOW_ruleTheorem_in_entryRuleTheorem661);
            ruleTheorem();

            state._fsp--;

             after(grammarAccess.getTheoremRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTheorem668); 

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:349:1: ruleTheorem : ( ( rule__Theorem__Group__0 ) ) ;
    public final void ruleTheorem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:353:2: ( ( ( rule__Theorem__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:354:1: ( ( rule__Theorem__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:354:1: ( ( rule__Theorem__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:355:1: ( rule__Theorem__Group__0 )
            {
             before(grammarAccess.getTheoremAccess().getGroup()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:356:1: ( rule__Theorem__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:356:2: rule__Theorem__Group__0
            {
            pushFollow(FOLLOW_rule__Theorem__Group__0_in_ruleTheorem694);
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


    // $ANTLR start "rule__Declaration__Alternatives"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:368:1: rule__Declaration__Alternatives : ( ( ( rule__Declaration__Group_0__0 ) ) | ( ( rule__Declaration__VarNameAssignment_1 ) ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:372:1: ( ( ( rule__Declaration__Group_0__0 ) ) | ( ( rule__Declaration__VarNameAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==21||LA1_1==23) ) {
                    alt1=1;
                }
                else if ( (LA1_1==EOF||(LA1_1>=19 && LA1_1<=20)) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:373:1: ( ( rule__Declaration__Group_0__0 ) )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:373:1: ( ( rule__Declaration__Group_0__0 ) )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:374:1: ( rule__Declaration__Group_0__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_0()); 
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:375:1: ( rule__Declaration__Group_0__0 )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:375:2: rule__Declaration__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Declaration__Group_0__0_in_rule__Declaration__Alternatives730);
                    rule__Declaration__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclarationAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:379:6: ( ( rule__Declaration__VarNameAssignment_1 ) )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:379:6: ( ( rule__Declaration__VarNameAssignment_1 ) )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:380:1: ( rule__Declaration__VarNameAssignment_1 )
                    {
                     before(grammarAccess.getDeclarationAccess().getVarNameAssignment_1()); 
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:381:1: ( rule__Declaration__VarNameAssignment_1 )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:381:2: rule__Declaration__VarNameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Declaration__VarNameAssignment_1_in_rule__Declaration__Alternatives748);
                    rule__Declaration__VarNameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclarationAccess().getVarNameAssignment_1()); 

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
    // $ANTLR end "rule__Declaration__Alternatives"


    // $ANTLR start "rule__Primary__Alternatives"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:390:1: rule__Primary__Alternatives : ( ( ruleAtomic ) | ( ruleQuantifier ) | ( ( rule__Primary__Group_2__0 ) ) | ( ruleBooleanLiteral ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:394:1: ( ( ruleAtomic ) | ( ruleQuantifier ) | ( ( rule__Primary__Group_2__0 ) ) | ( ruleBooleanLiteral ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case 11:
            case 12:
                {
                alt2=2;
                }
                break;
            case 21:
                {
                alt2=3;
                }
                break;
            case 13:
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:395:1: ( ruleAtomic )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:395:1: ( ruleAtomic )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:396:1: ruleAtomic
                    {
                     before(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAtomic_in_rule__Primary__Alternatives781);
                    ruleAtomic();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:401:6: ( ruleQuantifier )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:401:6: ( ruleQuantifier )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:402:1: ruleQuantifier
                    {
                     before(grammarAccess.getPrimaryAccess().getQuantifierParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleQuantifier_in_rule__Primary__Alternatives798);
                    ruleQuantifier();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getQuantifierParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:407:6: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:407:6: ( ( rule__Primary__Group_2__0 ) )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:408:1: ( rule__Primary__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:409:1: ( rule__Primary__Group_2__0 )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:409:2: rule__Primary__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Primary__Group_2__0_in_rule__Primary__Alternatives815);
                    rule__Primary__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:413:6: ( ruleBooleanLiteral )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:413:6: ( ruleBooleanLiteral )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:414:1: ruleBooleanLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getBooleanLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_rule__Primary__Alternatives833);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:424:1: rule__Quantifier__QuantifierAlternatives_0_0 : ( ( 'forall' ) | ( 'exists' ) );
    public final void rule__Quantifier__QuantifierAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:428:1: ( ( 'forall' ) | ( 'exists' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:429:1: ( 'forall' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:429:1: ( 'forall' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:430:1: 'forall'
                    {
                     before(grammarAccess.getQuantifierAccess().getQuantifierForallKeyword_0_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Quantifier__QuantifierAlternatives_0_0866); 
                     after(grammarAccess.getQuantifierAccess().getQuantifierForallKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:437:6: ( 'exists' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:437:6: ( 'exists' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:438:1: 'exists'
                    {
                     before(grammarAccess.getQuantifierAccess().getQuantifierExistsKeyword_0_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Quantifier__QuantifierAlternatives_0_0886); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:450:1: rule__BooleanLiteral__ValueAlternatives_0 : ( ( 'TRUE' ) | ( 'FALSE' ) );
    public final void rule__BooleanLiteral__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:454:1: ( ( 'TRUE' ) | ( 'FALSE' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:455:1: ( 'TRUE' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:455:1: ( 'TRUE' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:456:1: 'TRUE'
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getValueTRUEKeyword_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__BooleanLiteral__ValueAlternatives_0921); 
                     after(grammarAccess.getBooleanLiteralAccess().getValueTRUEKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:463:6: ( 'FALSE' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:463:6: ( 'FALSE' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:464:1: 'FALSE'
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getValueFALSEKeyword_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__BooleanLiteral__ValueAlternatives_0941); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:478:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:482:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:483:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__0973);
            rule__Input__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__1_in_rule__Input__Group__0976);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:490:1: rule__Input__Group__0__Impl : ( 'Given' ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:494:1: ( ( 'Given' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:495:1: ( 'Given' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:495:1: ( 'Given' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:496:1: 'Given'
            {
             before(grammarAccess.getInputAccess().getGivenKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Input__Group__0__Impl1004); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:509:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:513:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:514:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__11035);
            rule__Input__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__2_in_rule__Input__Group__11038);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:521:1: rule__Input__Group__1__Impl : ( ( rule__Input__GivenAssignment_1 ) ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:525:1: ( ( ( rule__Input__GivenAssignment_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:526:1: ( ( rule__Input__GivenAssignment_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:526:1: ( ( rule__Input__GivenAssignment_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:527:1: ( rule__Input__GivenAssignment_1 )
            {
             before(grammarAccess.getInputAccess().getGivenAssignment_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:528:1: ( rule__Input__GivenAssignment_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:528:2: rule__Input__GivenAssignment_1
            {
            pushFollow(FOLLOW_rule__Input__GivenAssignment_1_in_rule__Input__Group__1__Impl1065);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:538:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:542:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:543:2: rule__Input__Group__2__Impl rule__Input__Group__3
            {
            pushFollow(FOLLOW_rule__Input__Group__2__Impl_in_rule__Input__Group__21095);
            rule__Input__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__3_in_rule__Input__Group__21098);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:550:1: rule__Input__Group__2__Impl : ( ';' ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:554:1: ( ( ';' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:555:1: ( ';' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:555:1: ( ';' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:556:1: ';'
            {
             before(grammarAccess.getInputAccess().getSemicolonKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Input__Group__2__Impl1126); 
             after(grammarAccess.getInputAccess().getSemicolonKeyword_2()); 

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:569:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:573:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:574:2: rule__Input__Group__3__Impl rule__Input__Group__4
            {
            pushFollow(FOLLOW_rule__Input__Group__3__Impl_in_rule__Input__Group__31157);
            rule__Input__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__4_in_rule__Input__Group__31160);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:581:1: rule__Input__Group__3__Impl : ( 'Find' ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:585:1: ( ( 'Find' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:586:1: ( 'Find' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:586:1: ( 'Find' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:587:1: 'Find'
            {
             before(grammarAccess.getInputAccess().getFindKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Input__Group__3__Impl1188); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:600:1: rule__Input__Group__4 : rule__Input__Group__4__Impl rule__Input__Group__5 ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:604:1: ( rule__Input__Group__4__Impl rule__Input__Group__5 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:605:2: rule__Input__Group__4__Impl rule__Input__Group__5
            {
            pushFollow(FOLLOW_rule__Input__Group__4__Impl_in_rule__Input__Group__41219);
            rule__Input__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__5_in_rule__Input__Group__41222);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:612:1: rule__Input__Group__4__Impl : ( ( rule__Input__GoalAssignment_4 ) ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:616:1: ( ( ( rule__Input__GoalAssignment_4 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:617:1: ( ( rule__Input__GoalAssignment_4 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:617:1: ( ( rule__Input__GoalAssignment_4 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:618:1: ( rule__Input__GoalAssignment_4 )
            {
             before(grammarAccess.getInputAccess().getGoalAssignment_4()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:619:1: ( rule__Input__GoalAssignment_4 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:619:2: rule__Input__GoalAssignment_4
            {
            pushFollow(FOLLOW_rule__Input__GoalAssignment_4_in_rule__Input__Group__4__Impl1249);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:629:1: rule__Input__Group__5 : rule__Input__Group__5__Impl ;
    public final void rule__Input__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:633:1: ( rule__Input__Group__5__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:634:2: rule__Input__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group__5__Impl_in_rule__Input__Group__51279);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:640:1: rule__Input__Group__5__Impl : ( ( rule__Input__Group_5__0 )? ) ;
    public final void rule__Input__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:644:1: ( ( ( rule__Input__Group_5__0 )? ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:645:1: ( ( rule__Input__Group_5__0 )? )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:645:1: ( ( rule__Input__Group_5__0 )? )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:646:1: ( rule__Input__Group_5__0 )?
            {
             before(grammarAccess.getInputAccess().getGroup_5()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:647:1: ( rule__Input__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:647:2: rule__Input__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Input__Group_5__0_in_rule__Input__Group__5__Impl1306);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:669:1: rule__Input__Group_5__0 : rule__Input__Group_5__0__Impl rule__Input__Group_5__1 ;
    public final void rule__Input__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:673:1: ( rule__Input__Group_5__0__Impl rule__Input__Group_5__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:674:2: rule__Input__Group_5__0__Impl rule__Input__Group_5__1
            {
            pushFollow(FOLLOW_rule__Input__Group_5__0__Impl_in_rule__Input__Group_5__01349);
            rule__Input__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group_5__1_in_rule__Input__Group_5__01352);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:681:1: rule__Input__Group_5__0__Impl : ( ';' ) ;
    public final void rule__Input__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:685:1: ( ( ';' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:686:1: ( ';' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:686:1: ( ';' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:687:1: ';'
            {
             before(grammarAccess.getInputAccess().getSemicolonKeyword_5_0()); 
            match(input,16,FOLLOW_16_in_rule__Input__Group_5__0__Impl1380); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:700:1: rule__Input__Group_5__1 : rule__Input__Group_5__1__Impl rule__Input__Group_5__2 ;
    public final void rule__Input__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:704:1: ( rule__Input__Group_5__1__Impl rule__Input__Group_5__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:705:2: rule__Input__Group_5__1__Impl rule__Input__Group_5__2
            {
            pushFollow(FOLLOW_rule__Input__Group_5__1__Impl_in_rule__Input__Group_5__11411);
            rule__Input__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group_5__2_in_rule__Input__Group_5__11414);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:712:1: rule__Input__Group_5__1__Impl : ( 'Theorems:' ) ;
    public final void rule__Input__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:716:1: ( ( 'Theorems:' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:717:1: ( 'Theorems:' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:717:1: ( 'Theorems:' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:718:1: 'Theorems:'
            {
             before(grammarAccess.getInputAccess().getTheoremsKeyword_5_1()); 
            match(input,18,FOLLOW_18_in_rule__Input__Group_5__1__Impl1442); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:731:1: rule__Input__Group_5__2 : rule__Input__Group_5__2__Impl rule__Input__Group_5__3 ;
    public final void rule__Input__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:735:1: ( rule__Input__Group_5__2__Impl rule__Input__Group_5__3 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:736:2: rule__Input__Group_5__2__Impl rule__Input__Group_5__3
            {
            pushFollow(FOLLOW_rule__Input__Group_5__2__Impl_in_rule__Input__Group_5__21473);
            rule__Input__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group_5__3_in_rule__Input__Group_5__21476);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:743:1: rule__Input__Group_5__2__Impl : ( ( rule__Input__TheoremsAssignment_5_2 ) ) ;
    public final void rule__Input__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:747:1: ( ( ( rule__Input__TheoremsAssignment_5_2 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:748:1: ( ( rule__Input__TheoremsAssignment_5_2 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:748:1: ( ( rule__Input__TheoremsAssignment_5_2 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:749:1: ( rule__Input__TheoremsAssignment_5_2 )
            {
             before(grammarAccess.getInputAccess().getTheoremsAssignment_5_2()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:750:1: ( rule__Input__TheoremsAssignment_5_2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:750:2: rule__Input__TheoremsAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Input__TheoremsAssignment_5_2_in_rule__Input__Group_5__2__Impl1503);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:760:1: rule__Input__Group_5__3 : rule__Input__Group_5__3__Impl rule__Input__Group_5__4 ;
    public final void rule__Input__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:764:1: ( rule__Input__Group_5__3__Impl rule__Input__Group_5__4 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:765:2: rule__Input__Group_5__3__Impl rule__Input__Group_5__4
            {
            pushFollow(FOLLOW_rule__Input__Group_5__3__Impl_in_rule__Input__Group_5__31533);
            rule__Input__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group_5__4_in_rule__Input__Group_5__31536);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:772:1: rule__Input__Group_5__3__Impl : ( ( rule__Input__Group_5_3__0 )* ) ;
    public final void rule__Input__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:776:1: ( ( ( rule__Input__Group_5_3__0 )* ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:777:1: ( ( rule__Input__Group_5_3__0 )* )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:777:1: ( ( rule__Input__Group_5_3__0 )* )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:778:1: ( rule__Input__Group_5_3__0 )*
            {
             before(grammarAccess.getInputAccess().getGroup_5_3()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:779:1: ( rule__Input__Group_5_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==RULE_ID||(LA6_1>=11 && LA6_1<=14)||LA6_1==21) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:779:2: rule__Input__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Input__Group_5_3__0_in_rule__Input__Group_5__3__Impl1563);
            	    rule__Input__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:789:1: rule__Input__Group_5__4 : rule__Input__Group_5__4__Impl ;
    public final void rule__Input__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:793:1: ( rule__Input__Group_5__4__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:794:2: rule__Input__Group_5__4__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group_5__4__Impl_in_rule__Input__Group_5__41594);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:800:1: rule__Input__Group_5__4__Impl : ( ( ';' )? ) ;
    public final void rule__Input__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:804:1: ( ( ( ';' )? ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:805:1: ( ( ';' )? )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:805:1: ( ( ';' )? )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:806:1: ( ';' )?
            {
             before(grammarAccess.getInputAccess().getSemicolonKeyword_5_4()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:807:1: ( ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:808:2: ';'
                    {
                    match(input,16,FOLLOW_16_in_rule__Input__Group_5__4__Impl1623); 

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:829:1: rule__Input__Group_5_3__0 : rule__Input__Group_5_3__0__Impl rule__Input__Group_5_3__1 ;
    public final void rule__Input__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:833:1: ( rule__Input__Group_5_3__0__Impl rule__Input__Group_5_3__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:834:2: rule__Input__Group_5_3__0__Impl rule__Input__Group_5_3__1
            {
            pushFollow(FOLLOW_rule__Input__Group_5_3__0__Impl_in_rule__Input__Group_5_3__01666);
            rule__Input__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group_5_3__1_in_rule__Input__Group_5_3__01669);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:841:1: rule__Input__Group_5_3__0__Impl : ( ';' ) ;
    public final void rule__Input__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:845:1: ( ( ';' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:846:1: ( ';' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:846:1: ( ';' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:847:1: ';'
            {
             before(grammarAccess.getInputAccess().getSemicolonKeyword_5_3_0()); 
            match(input,16,FOLLOW_16_in_rule__Input__Group_5_3__0__Impl1697); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:860:1: rule__Input__Group_5_3__1 : rule__Input__Group_5_3__1__Impl ;
    public final void rule__Input__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:864:1: ( rule__Input__Group_5_3__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:865:2: rule__Input__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group_5_3__1__Impl_in_rule__Input__Group_5_3__11728);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:871:1: rule__Input__Group_5_3__1__Impl : ( ( rule__Input__TheoremsAssignment_5_3_1 ) ) ;
    public final void rule__Input__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:875:1: ( ( ( rule__Input__TheoremsAssignment_5_3_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:876:1: ( ( rule__Input__TheoremsAssignment_5_3_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:876:1: ( ( rule__Input__TheoremsAssignment_5_3_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:877:1: ( rule__Input__TheoremsAssignment_5_3_1 )
            {
             before(grammarAccess.getInputAccess().getTheoremsAssignment_5_3_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:878:1: ( rule__Input__TheoremsAssignment_5_3_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:878:2: rule__Input__TheoremsAssignment_5_3_1
            {
            pushFollow(FOLLOW_rule__Input__TheoremsAssignment_5_3_1_in_rule__Input__Group_5_3__1__Impl1755);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:892:1: rule__Problem__Group__0 : rule__Problem__Group__0__Impl rule__Problem__Group__1 ;
    public final void rule__Problem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:896:1: ( rule__Problem__Group__0__Impl rule__Problem__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:897:2: rule__Problem__Group__0__Impl rule__Problem__Group__1
            {
            pushFollow(FOLLOW_rule__Problem__Group__0__Impl_in_rule__Problem__Group__01789);
            rule__Problem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Problem__Group__1_in_rule__Problem__Group__01792);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:904:1: rule__Problem__Group__0__Impl : ( ( rule__Problem__Group_0__0 ) ) ;
    public final void rule__Problem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:908:1: ( ( ( rule__Problem__Group_0__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:909:1: ( ( rule__Problem__Group_0__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:909:1: ( ( rule__Problem__Group_0__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:910:1: ( rule__Problem__Group_0__0 )
            {
             before(grammarAccess.getProblemAccess().getGroup_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:911:1: ( rule__Problem__Group_0__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:911:2: rule__Problem__Group_0__0
            {
            pushFollow(FOLLOW_rule__Problem__Group_0__0_in_rule__Problem__Group__0__Impl1819);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:921:1: rule__Problem__Group__1 : rule__Problem__Group__1__Impl rule__Problem__Group__2 ;
    public final void rule__Problem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:925:1: ( rule__Problem__Group__1__Impl rule__Problem__Group__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:926:2: rule__Problem__Group__1__Impl rule__Problem__Group__2
            {
            pushFollow(FOLLOW_rule__Problem__Group__1__Impl_in_rule__Problem__Group__11849);
            rule__Problem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Problem__Group__2_in_rule__Problem__Group__11852);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:933:1: rule__Problem__Group__1__Impl : ( 'st' ) ;
    public final void rule__Problem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:937:1: ( ( 'st' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:938:1: ( 'st' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:938:1: ( 'st' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:939:1: 'st'
            {
             before(grammarAccess.getProblemAccess().getStKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__Problem__Group__1__Impl1880); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:952:1: rule__Problem__Group__2 : rule__Problem__Group__2__Impl ;
    public final void rule__Problem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:956:1: ( rule__Problem__Group__2__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:957:2: rule__Problem__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Problem__Group__2__Impl_in_rule__Problem__Group__21911);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:963:1: rule__Problem__Group__2__Impl : ( ( rule__Problem__PropertyAssignment_2 ) ) ;
    public final void rule__Problem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:967:1: ( ( ( rule__Problem__PropertyAssignment_2 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:968:1: ( ( rule__Problem__PropertyAssignment_2 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:968:1: ( ( rule__Problem__PropertyAssignment_2 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:969:1: ( rule__Problem__PropertyAssignment_2 )
            {
             before(grammarAccess.getProblemAccess().getPropertyAssignment_2()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:970:1: ( rule__Problem__PropertyAssignment_2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:970:2: rule__Problem__PropertyAssignment_2
            {
            pushFollow(FOLLOW_rule__Problem__PropertyAssignment_2_in_rule__Problem__Group__2__Impl1938);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:986:1: rule__Problem__Group_0__0 : rule__Problem__Group_0__0__Impl rule__Problem__Group_0__1 ;
    public final void rule__Problem__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:990:1: ( rule__Problem__Group_0__0__Impl rule__Problem__Group_0__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:991:2: rule__Problem__Group_0__0__Impl rule__Problem__Group_0__1
            {
            pushFollow(FOLLOW_rule__Problem__Group_0__0__Impl_in_rule__Problem__Group_0__01974);
            rule__Problem__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Problem__Group_0__1_in_rule__Problem__Group_0__01977);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:998:1: rule__Problem__Group_0__0__Impl : ( ( rule__Problem__VarsAssignment_0_0 ) ) ;
    public final void rule__Problem__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1002:1: ( ( ( rule__Problem__VarsAssignment_0_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1003:1: ( ( rule__Problem__VarsAssignment_0_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1003:1: ( ( rule__Problem__VarsAssignment_0_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1004:1: ( rule__Problem__VarsAssignment_0_0 )
            {
             before(grammarAccess.getProblemAccess().getVarsAssignment_0_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1005:1: ( rule__Problem__VarsAssignment_0_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1005:2: rule__Problem__VarsAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Problem__VarsAssignment_0_0_in_rule__Problem__Group_0__0__Impl2004);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1015:1: rule__Problem__Group_0__1 : rule__Problem__Group_0__1__Impl ;
    public final void rule__Problem__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1019:1: ( rule__Problem__Group_0__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1020:2: rule__Problem__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Problem__Group_0__1__Impl_in_rule__Problem__Group_0__12034);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1026:1: rule__Problem__Group_0__1__Impl : ( ( rule__Problem__Group_0_1__0 )* ) ;
    public final void rule__Problem__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1030:1: ( ( ( rule__Problem__Group_0_1__0 )* ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1031:1: ( ( rule__Problem__Group_0_1__0 )* )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1031:1: ( ( rule__Problem__Group_0_1__0 )* )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1032:1: ( rule__Problem__Group_0_1__0 )*
            {
             before(grammarAccess.getProblemAccess().getGroup_0_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1033:1: ( rule__Problem__Group_0_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1033:2: rule__Problem__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Problem__Group_0_1__0_in_rule__Problem__Group_0__1__Impl2061);
            	    rule__Problem__Group_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1047:1: rule__Problem__Group_0_1__0 : rule__Problem__Group_0_1__0__Impl rule__Problem__Group_0_1__1 ;
    public final void rule__Problem__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1051:1: ( rule__Problem__Group_0_1__0__Impl rule__Problem__Group_0_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1052:2: rule__Problem__Group_0_1__0__Impl rule__Problem__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__Problem__Group_0_1__0__Impl_in_rule__Problem__Group_0_1__02096);
            rule__Problem__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Problem__Group_0_1__1_in_rule__Problem__Group_0_1__02099);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1059:1: rule__Problem__Group_0_1__0__Impl : ( ',' ) ;
    public final void rule__Problem__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1063:1: ( ( ',' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1064:1: ( ',' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1064:1: ( ',' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1065:1: ','
            {
             before(grammarAccess.getProblemAccess().getCommaKeyword_0_1_0()); 
            match(input,20,FOLLOW_20_in_rule__Problem__Group_0_1__0__Impl2127); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1078:1: rule__Problem__Group_0_1__1 : rule__Problem__Group_0_1__1__Impl ;
    public final void rule__Problem__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1082:1: ( rule__Problem__Group_0_1__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1083:2: rule__Problem__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Problem__Group_0_1__1__Impl_in_rule__Problem__Group_0_1__12158);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1089:1: rule__Problem__Group_0_1__1__Impl : ( ( rule__Problem__VarsAssignment_0_1_1 ) ) ;
    public final void rule__Problem__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1093:1: ( ( ( rule__Problem__VarsAssignment_0_1_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1094:1: ( ( rule__Problem__VarsAssignment_0_1_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1094:1: ( ( rule__Problem__VarsAssignment_0_1_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1095:1: ( rule__Problem__VarsAssignment_0_1_1 )
            {
             before(grammarAccess.getProblemAccess().getVarsAssignment_0_1_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1096:1: ( rule__Problem__VarsAssignment_0_1_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1096:2: rule__Problem__VarsAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__Problem__VarsAssignment_0_1_1_in_rule__Problem__Group_0_1__1__Impl2185);
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


    // $ANTLR start "rule__Declaration__Group_0__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1110:1: rule__Declaration__Group_0__0 : rule__Declaration__Group_0__0__Impl rule__Declaration__Group_0__1 ;
    public final void rule__Declaration__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1114:1: ( rule__Declaration__Group_0__0__Impl rule__Declaration__Group_0__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1115:2: rule__Declaration__Group_0__0__Impl rule__Declaration__Group_0__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group_0__0__Impl_in_rule__Declaration__Group_0__02219);
            rule__Declaration__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group_0__1_in_rule__Declaration__Group_0__02222);
            rule__Declaration__Group_0__1();

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
    // $ANTLR end "rule__Declaration__Group_0__0"


    // $ANTLR start "rule__Declaration__Group_0__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1122:1: rule__Declaration__Group_0__0__Impl : ( ( rule__Declaration__TypeAssignment_0_0 ) ) ;
    public final void rule__Declaration__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1126:1: ( ( ( rule__Declaration__TypeAssignment_0_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1127:1: ( ( rule__Declaration__TypeAssignment_0_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1127:1: ( ( rule__Declaration__TypeAssignment_0_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1128:1: ( rule__Declaration__TypeAssignment_0_0 )
            {
             before(grammarAccess.getDeclarationAccess().getTypeAssignment_0_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1129:1: ( rule__Declaration__TypeAssignment_0_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1129:2: rule__Declaration__TypeAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Declaration__TypeAssignment_0_0_in_rule__Declaration__Group_0__0__Impl2249);
            rule__Declaration__TypeAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getTypeAssignment_0_0()); 

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
    // $ANTLR end "rule__Declaration__Group_0__0__Impl"


    // $ANTLR start "rule__Declaration__Group_0__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1139:1: rule__Declaration__Group_0__1 : rule__Declaration__Group_0__1__Impl rule__Declaration__Group_0__2 ;
    public final void rule__Declaration__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1143:1: ( rule__Declaration__Group_0__1__Impl rule__Declaration__Group_0__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1144:2: rule__Declaration__Group_0__1__Impl rule__Declaration__Group_0__2
            {
            pushFollow(FOLLOW_rule__Declaration__Group_0__1__Impl_in_rule__Declaration__Group_0__12279);
            rule__Declaration__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group_0__2_in_rule__Declaration__Group_0__12282);
            rule__Declaration__Group_0__2();

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
    // $ANTLR end "rule__Declaration__Group_0__1"


    // $ANTLR start "rule__Declaration__Group_0__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1151:1: rule__Declaration__Group_0__1__Impl : ( '(' ) ;
    public final void rule__Declaration__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1155:1: ( ( '(' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1156:1: ( '(' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1156:1: ( '(' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1157:1: '('
            {
             before(grammarAccess.getDeclarationAccess().getLeftParenthesisKeyword_0_1()); 
            match(input,21,FOLLOW_21_in_rule__Declaration__Group_0__1__Impl2310); 
             after(grammarAccess.getDeclarationAccess().getLeftParenthesisKeyword_0_1()); 

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
    // $ANTLR end "rule__Declaration__Group_0__1__Impl"


    // $ANTLR start "rule__Declaration__Group_0__2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1170:1: rule__Declaration__Group_0__2 : rule__Declaration__Group_0__2__Impl rule__Declaration__Group_0__3 ;
    public final void rule__Declaration__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1174:1: ( rule__Declaration__Group_0__2__Impl rule__Declaration__Group_0__3 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1175:2: rule__Declaration__Group_0__2__Impl rule__Declaration__Group_0__3
            {
            pushFollow(FOLLOW_rule__Declaration__Group_0__2__Impl_in_rule__Declaration__Group_0__22341);
            rule__Declaration__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group_0__3_in_rule__Declaration__Group_0__22344);
            rule__Declaration__Group_0__3();

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
    // $ANTLR end "rule__Declaration__Group_0__2"


    // $ANTLR start "rule__Declaration__Group_0__2__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1182:1: rule__Declaration__Group_0__2__Impl : ( ( rule__Declaration__VarNameAssignment_0_2 ) ) ;
    public final void rule__Declaration__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1186:1: ( ( ( rule__Declaration__VarNameAssignment_0_2 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1187:1: ( ( rule__Declaration__VarNameAssignment_0_2 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1187:1: ( ( rule__Declaration__VarNameAssignment_0_2 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1188:1: ( rule__Declaration__VarNameAssignment_0_2 )
            {
             before(grammarAccess.getDeclarationAccess().getVarNameAssignment_0_2()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1189:1: ( rule__Declaration__VarNameAssignment_0_2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1189:2: rule__Declaration__VarNameAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Declaration__VarNameAssignment_0_2_in_rule__Declaration__Group_0__2__Impl2371);
            rule__Declaration__VarNameAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getVarNameAssignment_0_2()); 

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
    // $ANTLR end "rule__Declaration__Group_0__2__Impl"


    // $ANTLR start "rule__Declaration__Group_0__3"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1199:1: rule__Declaration__Group_0__3 : rule__Declaration__Group_0__3__Impl ;
    public final void rule__Declaration__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1203:1: ( rule__Declaration__Group_0__3__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1204:2: rule__Declaration__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group_0__3__Impl_in_rule__Declaration__Group_0__32401);
            rule__Declaration__Group_0__3__Impl();

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
    // $ANTLR end "rule__Declaration__Group_0__3"


    // $ANTLR start "rule__Declaration__Group_0__3__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1210:1: rule__Declaration__Group_0__3__Impl : ( ')' ) ;
    public final void rule__Declaration__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1214:1: ( ( ')' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1215:1: ( ')' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1215:1: ( ')' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1216:1: ')'
            {
             before(grammarAccess.getDeclarationAccess().getRightParenthesisKeyword_0_3()); 
            match(input,22,FOLLOW_22_in_rule__Declaration__Group_0__3__Impl2429); 
             after(grammarAccess.getDeclarationAccess().getRightParenthesisKeyword_0_3()); 

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
    // $ANTLR end "rule__Declaration__Group_0__3__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1237:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1241:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1242:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__02468);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group__1_in_rule__Type__Group__02471);
            rule__Type__Group__1();

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
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1249:1: rule__Type__Group__0__Impl : ( ( rule__Type__NameAssignment_0 ) ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1253:1: ( ( ( rule__Type__NameAssignment_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1254:1: ( ( rule__Type__NameAssignment_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1254:1: ( ( rule__Type__NameAssignment_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1255:1: ( rule__Type__NameAssignment_0 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1256:1: ( rule__Type__NameAssignment_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1256:2: rule__Type__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Type__NameAssignment_0_in_rule__Type__Group__0__Impl2498);
            rule__Type__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1266:1: rule__Type__Group__1 : rule__Type__Group__1__Impl ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1270:1: ( rule__Type__Group__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1271:2: rule__Type__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__12528);
            rule__Type__Group__1__Impl();

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
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1277:1: rule__Type__Group__1__Impl : ( ( rule__Type__Group_1__0 )? ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1281:1: ( ( ( rule__Type__Group_1__0 )? ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1282:1: ( ( rule__Type__Group_1__0 )? )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1282:1: ( ( rule__Type__Group_1__0 )? )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1283:1: ( rule__Type__Group_1__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1284:1: ( rule__Type__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1284:2: rule__Type__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_1__0_in_rule__Type__Group__1__Impl2555);
                    rule__Type__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__Type__Group_1__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1298:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1302:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1303:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
            {
            pushFollow(FOLLOW_rule__Type__Group_1__0__Impl_in_rule__Type__Group_1__02590);
            rule__Type__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_1__1_in_rule__Type__Group_1__02593);
            rule__Type__Group_1__1();

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
    // $ANTLR end "rule__Type__Group_1__0"


    // $ANTLR start "rule__Type__Group_1__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1310:1: rule__Type__Group_1__0__Impl : ( '<' ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1314:1: ( ( '<' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1315:1: ( '<' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1315:1: ( '<' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1316:1: '<'
            {
             before(grammarAccess.getTypeAccess().getLessThanSignKeyword_1_0()); 
            match(input,23,FOLLOW_23_in_rule__Type__Group_1__0__Impl2621); 
             after(grammarAccess.getTypeAccess().getLessThanSignKeyword_1_0()); 

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
    // $ANTLR end "rule__Type__Group_1__0__Impl"


    // $ANTLR start "rule__Type__Group_1__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1329:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl rule__Type__Group_1__2 ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1333:1: ( rule__Type__Group_1__1__Impl rule__Type__Group_1__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1334:2: rule__Type__Group_1__1__Impl rule__Type__Group_1__2
            {
            pushFollow(FOLLOW_rule__Type__Group_1__1__Impl_in_rule__Type__Group_1__12652);
            rule__Type__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_1__2_in_rule__Type__Group_1__12655);
            rule__Type__Group_1__2();

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
    // $ANTLR end "rule__Type__Group_1__1"


    // $ANTLR start "rule__Type__Group_1__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1341:1: rule__Type__Group_1__1__Impl : ( ( rule__Type__TemplateTypeAssignment_1_1 ) ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1345:1: ( ( ( rule__Type__TemplateTypeAssignment_1_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1346:1: ( ( rule__Type__TemplateTypeAssignment_1_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1346:1: ( ( rule__Type__TemplateTypeAssignment_1_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1347:1: ( rule__Type__TemplateTypeAssignment_1_1 )
            {
             before(grammarAccess.getTypeAccess().getTemplateTypeAssignment_1_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1348:1: ( rule__Type__TemplateTypeAssignment_1_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1348:2: rule__Type__TemplateTypeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Type__TemplateTypeAssignment_1_1_in_rule__Type__Group_1__1__Impl2682);
            rule__Type__TemplateTypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getTemplateTypeAssignment_1_1()); 

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
    // $ANTLR end "rule__Type__Group_1__1__Impl"


    // $ANTLR start "rule__Type__Group_1__2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1358:1: rule__Type__Group_1__2 : rule__Type__Group_1__2__Impl ;
    public final void rule__Type__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1362:1: ( rule__Type__Group_1__2__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1363:2: rule__Type__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_1__2__Impl_in_rule__Type__Group_1__22712);
            rule__Type__Group_1__2__Impl();

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
    // $ANTLR end "rule__Type__Group_1__2"


    // $ANTLR start "rule__Type__Group_1__2__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1369:1: rule__Type__Group_1__2__Impl : ( '>' ) ;
    public final void rule__Type__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1373:1: ( ( '>' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1374:1: ( '>' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1374:1: ( '>' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1375:1: '>'
            {
             before(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_1_2()); 
            match(input,24,FOLLOW_24_in_rule__Type__Group_1__2__Impl2740); 
             after(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_1_2()); 

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
    // $ANTLR end "rule__Type__Group_1__2__Impl"


    // $ANTLR start "rule__ORing__Group__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1394:1: rule__ORing__Group__0 : rule__ORing__Group__0__Impl rule__ORing__Group__1 ;
    public final void rule__ORing__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1398:1: ( rule__ORing__Group__0__Impl rule__ORing__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1399:2: rule__ORing__Group__0__Impl rule__ORing__Group__1
            {
            pushFollow(FOLLOW_rule__ORing__Group__0__Impl_in_rule__ORing__Group__02777);
            rule__ORing__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ORing__Group__1_in_rule__ORing__Group__02780);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1406:1: rule__ORing__Group__0__Impl : ( ruleANDing ) ;
    public final void rule__ORing__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1410:1: ( ( ruleANDing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1411:1: ( ruleANDing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1411:1: ( ruleANDing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1412:1: ruleANDing
            {
             before(grammarAccess.getORingAccess().getANDingParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleANDing_in_rule__ORing__Group__0__Impl2807);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1423:1: rule__ORing__Group__1 : rule__ORing__Group__1__Impl ;
    public final void rule__ORing__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1427:1: ( rule__ORing__Group__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1428:2: rule__ORing__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ORing__Group__1__Impl_in_rule__ORing__Group__12836);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1434:1: rule__ORing__Group__1__Impl : ( ( rule__ORing__Group_1__0 )* ) ;
    public final void rule__ORing__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1438:1: ( ( ( rule__ORing__Group_1__0 )* ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1439:1: ( ( rule__ORing__Group_1__0 )* )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1439:1: ( ( rule__ORing__Group_1__0 )* )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1440:1: ( rule__ORing__Group_1__0 )*
            {
             before(grammarAccess.getORingAccess().getGroup_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1441:1: ( rule__ORing__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1441:2: rule__ORing__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ORing__Group_1__0_in_rule__ORing__Group__1__Impl2863);
            	    rule__ORing__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1455:1: rule__ORing__Group_1__0 : rule__ORing__Group_1__0__Impl rule__ORing__Group_1__1 ;
    public final void rule__ORing__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1459:1: ( rule__ORing__Group_1__0__Impl rule__ORing__Group_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1460:2: rule__ORing__Group_1__0__Impl rule__ORing__Group_1__1
            {
            pushFollow(FOLLOW_rule__ORing__Group_1__0__Impl_in_rule__ORing__Group_1__02898);
            rule__ORing__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ORing__Group_1__1_in_rule__ORing__Group_1__02901);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1467:1: rule__ORing__Group_1__0__Impl : ( () ) ;
    public final void rule__ORing__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1471:1: ( ( () ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1472:1: ( () )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1472:1: ( () )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1473:1: ()
            {
             before(grammarAccess.getORingAccess().getORingLeftAction_1_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1474:1: ()
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1476:1: 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1486:1: rule__ORing__Group_1__1 : rule__ORing__Group_1__1__Impl rule__ORing__Group_1__2 ;
    public final void rule__ORing__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1490:1: ( rule__ORing__Group_1__1__Impl rule__ORing__Group_1__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1491:2: rule__ORing__Group_1__1__Impl rule__ORing__Group_1__2
            {
            pushFollow(FOLLOW_rule__ORing__Group_1__1__Impl_in_rule__ORing__Group_1__12959);
            rule__ORing__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ORing__Group_1__2_in_rule__ORing__Group_1__12962);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1498:1: rule__ORing__Group_1__1__Impl : ( '|' ) ;
    public final void rule__ORing__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1502:1: ( ( '|' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1503:1: ( '|' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1503:1: ( '|' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1504:1: '|'
            {
             before(grammarAccess.getORingAccess().getVerticalLineKeyword_1_1()); 
            match(input,25,FOLLOW_25_in_rule__ORing__Group_1__1__Impl2990); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1517:1: rule__ORing__Group_1__2 : rule__ORing__Group_1__2__Impl ;
    public final void rule__ORing__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1521:1: ( rule__ORing__Group_1__2__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1522:2: rule__ORing__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ORing__Group_1__2__Impl_in_rule__ORing__Group_1__23021);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1528:1: rule__ORing__Group_1__2__Impl : ( ( rule__ORing__RightAssignment_1_2 ) ) ;
    public final void rule__ORing__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1532:1: ( ( ( rule__ORing__RightAssignment_1_2 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1533:1: ( ( rule__ORing__RightAssignment_1_2 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1533:1: ( ( rule__ORing__RightAssignment_1_2 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1534:1: ( rule__ORing__RightAssignment_1_2 )
            {
             before(grammarAccess.getORingAccess().getRightAssignment_1_2()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1535:1: ( rule__ORing__RightAssignment_1_2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1535:2: rule__ORing__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ORing__RightAssignment_1_2_in_rule__ORing__Group_1__2__Impl3048);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1551:1: rule__ANDing__Group__0 : rule__ANDing__Group__0__Impl rule__ANDing__Group__1 ;
    public final void rule__ANDing__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1555:1: ( rule__ANDing__Group__0__Impl rule__ANDing__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1556:2: rule__ANDing__Group__0__Impl rule__ANDing__Group__1
            {
            pushFollow(FOLLOW_rule__ANDing__Group__0__Impl_in_rule__ANDing__Group__03084);
            rule__ANDing__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ANDing__Group__1_in_rule__ANDing__Group__03087);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1563:1: rule__ANDing__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__ANDing__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1567:1: ( ( rulePrimary ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1568:1: ( rulePrimary )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1568:1: ( rulePrimary )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1569:1: rulePrimary
            {
             before(grammarAccess.getANDingAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__ANDing__Group__0__Impl3114);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1580:1: rule__ANDing__Group__1 : rule__ANDing__Group__1__Impl ;
    public final void rule__ANDing__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1584:1: ( rule__ANDing__Group__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1585:2: rule__ANDing__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ANDing__Group__1__Impl_in_rule__ANDing__Group__13143);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1591:1: rule__ANDing__Group__1__Impl : ( ( rule__ANDing__Group_1__0 )* ) ;
    public final void rule__ANDing__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1595:1: ( ( ( rule__ANDing__Group_1__0 )* ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1596:1: ( ( rule__ANDing__Group_1__0 )* )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1596:1: ( ( rule__ANDing__Group_1__0 )* )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1597:1: ( rule__ANDing__Group_1__0 )*
            {
             before(grammarAccess.getANDingAccess().getGroup_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1598:1: ( rule__ANDing__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1598:2: rule__ANDing__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ANDing__Group_1__0_in_rule__ANDing__Group__1__Impl3170);
            	    rule__ANDing__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1612:1: rule__ANDing__Group_1__0 : rule__ANDing__Group_1__0__Impl rule__ANDing__Group_1__1 ;
    public final void rule__ANDing__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1616:1: ( rule__ANDing__Group_1__0__Impl rule__ANDing__Group_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1617:2: rule__ANDing__Group_1__0__Impl rule__ANDing__Group_1__1
            {
            pushFollow(FOLLOW_rule__ANDing__Group_1__0__Impl_in_rule__ANDing__Group_1__03205);
            rule__ANDing__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ANDing__Group_1__1_in_rule__ANDing__Group_1__03208);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1624:1: rule__ANDing__Group_1__0__Impl : ( () ) ;
    public final void rule__ANDing__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1628:1: ( ( () ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1629:1: ( () )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1629:1: ( () )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1630:1: ()
            {
             before(grammarAccess.getANDingAccess().getANDingLeftAction_1_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1631:1: ()
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1633:1: 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1643:1: rule__ANDing__Group_1__1 : rule__ANDing__Group_1__1__Impl rule__ANDing__Group_1__2 ;
    public final void rule__ANDing__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1647:1: ( rule__ANDing__Group_1__1__Impl rule__ANDing__Group_1__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1648:2: rule__ANDing__Group_1__1__Impl rule__ANDing__Group_1__2
            {
            pushFollow(FOLLOW_rule__ANDing__Group_1__1__Impl_in_rule__ANDing__Group_1__13266);
            rule__ANDing__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ANDing__Group_1__2_in_rule__ANDing__Group_1__13269);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1655:1: rule__ANDing__Group_1__1__Impl : ( '&' ) ;
    public final void rule__ANDing__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1659:1: ( ( '&' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1660:1: ( '&' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1660:1: ( '&' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1661:1: '&'
            {
             before(grammarAccess.getANDingAccess().getAmpersandKeyword_1_1()); 
            match(input,26,FOLLOW_26_in_rule__ANDing__Group_1__1__Impl3297); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1674:1: rule__ANDing__Group_1__2 : rule__ANDing__Group_1__2__Impl ;
    public final void rule__ANDing__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1678:1: ( rule__ANDing__Group_1__2__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1679:2: rule__ANDing__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ANDing__Group_1__2__Impl_in_rule__ANDing__Group_1__23328);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1685:1: rule__ANDing__Group_1__2__Impl : ( ( rule__ANDing__RightAssignment_1_2 ) ) ;
    public final void rule__ANDing__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1689:1: ( ( ( rule__ANDing__RightAssignment_1_2 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1690:1: ( ( rule__ANDing__RightAssignment_1_2 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1690:1: ( ( rule__ANDing__RightAssignment_1_2 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1691:1: ( rule__ANDing__RightAssignment_1_2 )
            {
             before(grammarAccess.getANDingAccess().getRightAssignment_1_2()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1692:1: ( rule__ANDing__RightAssignment_1_2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1692:2: rule__ANDing__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ANDing__RightAssignment_1_2_in_rule__ANDing__Group_1__2__Impl3355);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1708:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1712:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1713:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_2__0__Impl_in_rule__Primary__Group_2__03391);
            rule__Primary__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_2__1_in_rule__Primary__Group_2__03394);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1720:1: rule__Primary__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1724:1: ( ( '(' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1725:1: ( '(' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1725:1: ( '(' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1726:1: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Primary__Group_2__0__Impl3422); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1739:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1743:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1744:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_rule__Primary__Group_2__1__Impl_in_rule__Primary__Group_2__13453);
            rule__Primary__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_2__2_in_rule__Primary__Group_2__13456);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1751:1: rule__Primary__Group_2__1__Impl : ( ruleORing ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1755:1: ( ( ruleORing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1756:1: ( ruleORing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1756:1: ( ruleORing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1757:1: ruleORing
            {
             before(grammarAccess.getPrimaryAccess().getORingParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleORing_in_rule__Primary__Group_2__1__Impl3483);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1768:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1772:1: ( rule__Primary__Group_2__2__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1773:2: rule__Primary__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_2__2__Impl_in_rule__Primary__Group_2__23512);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1779:1: rule__Primary__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1783:1: ( ( ')' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1784:1: ( ')' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1784:1: ( ')' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1785:1: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 
            match(input,22,FOLLOW_22_in_rule__Primary__Group_2__2__Impl3540); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1804:1: rule__Quantifier__Group__0 : rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1 ;
    public final void rule__Quantifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1808:1: ( rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1809:2: rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1
            {
            pushFollow(FOLLOW_rule__Quantifier__Group__0__Impl_in_rule__Quantifier__Group__03577);
            rule__Quantifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantifier__Group__1_in_rule__Quantifier__Group__03580);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1816:1: rule__Quantifier__Group__0__Impl : ( ( rule__Quantifier__QuantifierAssignment_0 ) ) ;
    public final void rule__Quantifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1820:1: ( ( ( rule__Quantifier__QuantifierAssignment_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1821:1: ( ( rule__Quantifier__QuantifierAssignment_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1821:1: ( ( rule__Quantifier__QuantifierAssignment_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1822:1: ( rule__Quantifier__QuantifierAssignment_0 )
            {
             before(grammarAccess.getQuantifierAccess().getQuantifierAssignment_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1823:1: ( rule__Quantifier__QuantifierAssignment_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1823:2: rule__Quantifier__QuantifierAssignment_0
            {
            pushFollow(FOLLOW_rule__Quantifier__QuantifierAssignment_0_in_rule__Quantifier__Group__0__Impl3607);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1833:1: rule__Quantifier__Group__1 : rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2 ;
    public final void rule__Quantifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1837:1: ( rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1838:2: rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2
            {
            pushFollow(FOLLOW_rule__Quantifier__Group__1__Impl_in_rule__Quantifier__Group__13637);
            rule__Quantifier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantifier__Group__2_in_rule__Quantifier__Group__13640);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1845:1: rule__Quantifier__Group__1__Impl : ( '(' ) ;
    public final void rule__Quantifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1849:1: ( ( '(' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1850:1: ( '(' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1850:1: ( '(' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1851:1: '('
            {
             before(grammarAccess.getQuantifierAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__Quantifier__Group__1__Impl3668); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1864:1: rule__Quantifier__Group__2 : rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3 ;
    public final void rule__Quantifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1868:1: ( rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1869:2: rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3
            {
            pushFollow(FOLLOW_rule__Quantifier__Group__2__Impl_in_rule__Quantifier__Group__23699);
            rule__Quantifier__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantifier__Group__3_in_rule__Quantifier__Group__23702);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1876:1: rule__Quantifier__Group__2__Impl : ( ( rule__Quantifier__SubjectAssignment_2 ) ) ;
    public final void rule__Quantifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1880:1: ( ( ( rule__Quantifier__SubjectAssignment_2 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1881:1: ( ( rule__Quantifier__SubjectAssignment_2 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1881:1: ( ( rule__Quantifier__SubjectAssignment_2 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1882:1: ( rule__Quantifier__SubjectAssignment_2 )
            {
             before(grammarAccess.getQuantifierAccess().getSubjectAssignment_2()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1883:1: ( rule__Quantifier__SubjectAssignment_2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1883:2: rule__Quantifier__SubjectAssignment_2
            {
            pushFollow(FOLLOW_rule__Quantifier__SubjectAssignment_2_in_rule__Quantifier__Group__2__Impl3729);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1893:1: rule__Quantifier__Group__3 : rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4 ;
    public final void rule__Quantifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1897:1: ( rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1898:2: rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4
            {
            pushFollow(FOLLOW_rule__Quantifier__Group__3__Impl_in_rule__Quantifier__Group__33759);
            rule__Quantifier__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantifier__Group__4_in_rule__Quantifier__Group__33762);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1905:1: rule__Quantifier__Group__3__Impl : ( ':' ) ;
    public final void rule__Quantifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1909:1: ( ( ':' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1910:1: ( ':' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1910:1: ( ':' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1911:1: ':'
            {
             before(grammarAccess.getQuantifierAccess().getColonKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__Quantifier__Group__3__Impl3790); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1924:1: rule__Quantifier__Group__4 : rule__Quantifier__Group__4__Impl rule__Quantifier__Group__5 ;
    public final void rule__Quantifier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1928:1: ( rule__Quantifier__Group__4__Impl rule__Quantifier__Group__5 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1929:2: rule__Quantifier__Group__4__Impl rule__Quantifier__Group__5
            {
            pushFollow(FOLLOW_rule__Quantifier__Group__4__Impl_in_rule__Quantifier__Group__43821);
            rule__Quantifier__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantifier__Group__5_in_rule__Quantifier__Group__43824);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1936:1: rule__Quantifier__Group__4__Impl : ( ( rule__Quantifier__PredicateAssignment_4 ) ) ;
    public final void rule__Quantifier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1940:1: ( ( ( rule__Quantifier__PredicateAssignment_4 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1941:1: ( ( rule__Quantifier__PredicateAssignment_4 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1941:1: ( ( rule__Quantifier__PredicateAssignment_4 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1942:1: ( rule__Quantifier__PredicateAssignment_4 )
            {
             before(grammarAccess.getQuantifierAccess().getPredicateAssignment_4()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1943:1: ( rule__Quantifier__PredicateAssignment_4 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1943:2: rule__Quantifier__PredicateAssignment_4
            {
            pushFollow(FOLLOW_rule__Quantifier__PredicateAssignment_4_in_rule__Quantifier__Group__4__Impl3851);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1953:1: rule__Quantifier__Group__5 : rule__Quantifier__Group__5__Impl ;
    public final void rule__Quantifier__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1957:1: ( rule__Quantifier__Group__5__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1958:2: rule__Quantifier__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Quantifier__Group__5__Impl_in_rule__Quantifier__Group__53881);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1964:1: rule__Quantifier__Group__5__Impl : ( ')' ) ;
    public final void rule__Quantifier__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1968:1: ( ( ')' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1969:1: ( ')' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1969:1: ( ')' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1970:1: ')'
            {
             before(grammarAccess.getQuantifierAccess().getRightParenthesisKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__Quantifier__Group__5__Impl3909); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1995:1: rule__Atomic__Group__0 : rule__Atomic__Group__0__Impl rule__Atomic__Group__1 ;
    public final void rule__Atomic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1999:1: ( rule__Atomic__Group__0__Impl rule__Atomic__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2000:2: rule__Atomic__Group__0__Impl rule__Atomic__Group__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group__0__Impl_in_rule__Atomic__Group__03952);
            rule__Atomic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group__1_in_rule__Atomic__Group__03955);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2007:1: rule__Atomic__Group__0__Impl : ( ( rule__Atomic__FunctionAssignment_0 ) ) ;
    public final void rule__Atomic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2011:1: ( ( ( rule__Atomic__FunctionAssignment_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2012:1: ( ( rule__Atomic__FunctionAssignment_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2012:1: ( ( rule__Atomic__FunctionAssignment_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2013:1: ( rule__Atomic__FunctionAssignment_0 )
            {
             before(grammarAccess.getAtomicAccess().getFunctionAssignment_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2014:1: ( rule__Atomic__FunctionAssignment_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2014:2: rule__Atomic__FunctionAssignment_0
            {
            pushFollow(FOLLOW_rule__Atomic__FunctionAssignment_0_in_rule__Atomic__Group__0__Impl3982);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2024:1: rule__Atomic__Group__1 : rule__Atomic__Group__1__Impl ;
    public final void rule__Atomic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2028:1: ( rule__Atomic__Group__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2029:2: rule__Atomic__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group__1__Impl_in_rule__Atomic__Group__14012);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2035:1: rule__Atomic__Group__1__Impl : ( ( rule__Atomic__Group_1__0 )? ) ;
    public final void rule__Atomic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2039:1: ( ( ( rule__Atomic__Group_1__0 )? ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2040:1: ( ( rule__Atomic__Group_1__0 )? )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2040:1: ( ( rule__Atomic__Group_1__0 )? )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2041:1: ( rule__Atomic__Group_1__0 )?
            {
             before(grammarAccess.getAtomicAccess().getGroup_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2042:1: ( rule__Atomic__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2042:2: rule__Atomic__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Group__1__Impl4039);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2056:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2060:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2061:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__04074);
            rule__Atomic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__04077);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2068:1: rule__Atomic__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2072:1: ( ( '(' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2073:1: ( '(' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2073:1: ( '(' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2074:1: '('
            {
             before(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,21,FOLLOW_21_in_rule__Atomic__Group_1__0__Impl4105); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2087:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl rule__Atomic__Group_1__2 ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2091:1: ( rule__Atomic__Group_1__1__Impl rule__Atomic__Group_1__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2092:2: rule__Atomic__Group_1__1__Impl rule__Atomic__Group_1__2
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__14136);
            rule__Atomic__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_1__2_in_rule__Atomic__Group_1__14139);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2099:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__Group_1_1__0 )? ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2103:1: ( ( ( rule__Atomic__Group_1_1__0 )? ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2104:1: ( ( rule__Atomic__Group_1_1__0 )? )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2104:1: ( ( rule__Atomic__Group_1_1__0 )? )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2105:1: ( rule__Atomic__Group_1_1__0 )?
            {
             before(grammarAccess.getAtomicAccess().getGroup_1_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2106:1: ( rule__Atomic__Group_1_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2106:2: rule__Atomic__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_1_1__0_in_rule__Atomic__Group_1__1__Impl4166);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2116:1: rule__Atomic__Group_1__2 : rule__Atomic__Group_1__2__Impl ;
    public final void rule__Atomic__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2120:1: ( rule__Atomic__Group_1__2__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2121:2: rule__Atomic__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__2__Impl_in_rule__Atomic__Group_1__24197);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2127:1: rule__Atomic__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Atomic__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2131:1: ( ( ')' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2132:1: ( ')' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2132:1: ( ')' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2133:1: ')'
            {
             before(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_1_2()); 
            match(input,22,FOLLOW_22_in_rule__Atomic__Group_1__2__Impl4225); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2152:1: rule__Atomic__Group_1_1__0 : rule__Atomic__Group_1_1__0__Impl rule__Atomic__Group_1_1__1 ;
    public final void rule__Atomic__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2156:1: ( rule__Atomic__Group_1_1__0__Impl rule__Atomic__Group_1_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2157:2: rule__Atomic__Group_1_1__0__Impl rule__Atomic__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1_1__0__Impl_in_rule__Atomic__Group_1_1__04262);
            rule__Atomic__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_1_1__1_in_rule__Atomic__Group_1_1__04265);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2164:1: rule__Atomic__Group_1_1__0__Impl : ( ( rule__Atomic__ArgsAssignment_1_1_0 ) ) ;
    public final void rule__Atomic__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2168:1: ( ( ( rule__Atomic__ArgsAssignment_1_1_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2169:1: ( ( rule__Atomic__ArgsAssignment_1_1_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2169:1: ( ( rule__Atomic__ArgsAssignment_1_1_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2170:1: ( rule__Atomic__ArgsAssignment_1_1_0 )
            {
             before(grammarAccess.getAtomicAccess().getArgsAssignment_1_1_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2171:1: ( rule__Atomic__ArgsAssignment_1_1_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2171:2: rule__Atomic__ArgsAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__Atomic__ArgsAssignment_1_1_0_in_rule__Atomic__Group_1_1__0__Impl4292);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2181:1: rule__Atomic__Group_1_1__1 : rule__Atomic__Group_1_1__1__Impl ;
    public final void rule__Atomic__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2185:1: ( rule__Atomic__Group_1_1__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2186:2: rule__Atomic__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1_1__1__Impl_in_rule__Atomic__Group_1_1__14322);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2192:1: rule__Atomic__Group_1_1__1__Impl : ( ( rule__Atomic__Group_1_1_1__0 )* ) ;
    public final void rule__Atomic__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2196:1: ( ( ( rule__Atomic__Group_1_1_1__0 )* ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2197:1: ( ( rule__Atomic__Group_1_1_1__0 )* )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2197:1: ( ( rule__Atomic__Group_1_1_1__0 )* )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2198:1: ( rule__Atomic__Group_1_1_1__0 )*
            {
             before(grammarAccess.getAtomicAccess().getGroup_1_1_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2199:1: ( rule__Atomic__Group_1_1_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2199:2: rule__Atomic__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Atomic__Group_1_1_1__0_in_rule__Atomic__Group_1_1__1__Impl4349);
            	    rule__Atomic__Group_1_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2213:1: rule__Atomic__Group_1_1_1__0 : rule__Atomic__Group_1_1_1__0__Impl rule__Atomic__Group_1_1_1__1 ;
    public final void rule__Atomic__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2217:1: ( rule__Atomic__Group_1_1_1__0__Impl rule__Atomic__Group_1_1_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2218:2: rule__Atomic__Group_1_1_1__0__Impl rule__Atomic__Group_1_1_1__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1_1_1__0__Impl_in_rule__Atomic__Group_1_1_1__04384);
            rule__Atomic__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_1_1_1__1_in_rule__Atomic__Group_1_1_1__04387);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2225:1: rule__Atomic__Group_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__Atomic__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2229:1: ( ( ',' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2230:1: ( ',' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2230:1: ( ',' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2231:1: ','
            {
             before(grammarAccess.getAtomicAccess().getCommaKeyword_1_1_1_0()); 
            match(input,20,FOLLOW_20_in_rule__Atomic__Group_1_1_1__0__Impl4415); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2244:1: rule__Atomic__Group_1_1_1__1 : rule__Atomic__Group_1_1_1__1__Impl ;
    public final void rule__Atomic__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2248:1: ( rule__Atomic__Group_1_1_1__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2249:2: rule__Atomic__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1_1_1__1__Impl_in_rule__Atomic__Group_1_1_1__14446);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2255:1: rule__Atomic__Group_1_1_1__1__Impl : ( ( rule__Atomic__ArgsAssignment_1_1_1_1 ) ) ;
    public final void rule__Atomic__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2259:1: ( ( ( rule__Atomic__ArgsAssignment_1_1_1_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2260:1: ( ( rule__Atomic__ArgsAssignment_1_1_1_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2260:1: ( ( rule__Atomic__ArgsAssignment_1_1_1_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2261:1: ( rule__Atomic__ArgsAssignment_1_1_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getArgsAssignment_1_1_1_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2262:1: ( rule__Atomic__ArgsAssignment_1_1_1_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2262:2: rule__Atomic__ArgsAssignment_1_1_1_1
            {
            pushFollow(FOLLOW_rule__Atomic__ArgsAssignment_1_1_1_1_in_rule__Atomic__Group_1_1_1__1__Impl4473);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2276:1: rule__Theorem__Group__0 : rule__Theorem__Group__0__Impl rule__Theorem__Group__1 ;
    public final void rule__Theorem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2280:1: ( rule__Theorem__Group__0__Impl rule__Theorem__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2281:2: rule__Theorem__Group__0__Impl rule__Theorem__Group__1
            {
            pushFollow(FOLLOW_rule__Theorem__Group__0__Impl_in_rule__Theorem__Group__04507);
            rule__Theorem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__1_in_rule__Theorem__Group__04510);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2288:1: rule__Theorem__Group__0__Impl : ( ( rule__Theorem__RequirementAssignment_0 ) ) ;
    public final void rule__Theorem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2292:1: ( ( ( rule__Theorem__RequirementAssignment_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2293:1: ( ( rule__Theorem__RequirementAssignment_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2293:1: ( ( rule__Theorem__RequirementAssignment_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2294:1: ( rule__Theorem__RequirementAssignment_0 )
            {
             before(grammarAccess.getTheoremAccess().getRequirementAssignment_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2295:1: ( rule__Theorem__RequirementAssignment_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2295:2: rule__Theorem__RequirementAssignment_0
            {
            pushFollow(FOLLOW_rule__Theorem__RequirementAssignment_0_in_rule__Theorem__Group__0__Impl4537);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2305:1: rule__Theorem__Group__1 : rule__Theorem__Group__1__Impl rule__Theorem__Group__2 ;
    public final void rule__Theorem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2309:1: ( rule__Theorem__Group__1__Impl rule__Theorem__Group__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2310:2: rule__Theorem__Group__1__Impl rule__Theorem__Group__2
            {
            pushFollow(FOLLOW_rule__Theorem__Group__1__Impl_in_rule__Theorem__Group__14567);
            rule__Theorem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__2_in_rule__Theorem__Group__14570);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2317:1: rule__Theorem__Group__1__Impl : ( ':-' ) ;
    public final void rule__Theorem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2321:1: ( ( ':-' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2322:1: ( ':-' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2322:1: ( ':-' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2323:1: ':-'
            {
             before(grammarAccess.getTheoremAccess().getColonHyphenMinusKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__Theorem__Group__1__Impl4598); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2336:1: rule__Theorem__Group__2 : rule__Theorem__Group__2__Impl rule__Theorem__Group__3 ;
    public final void rule__Theorem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2340:1: ( rule__Theorem__Group__2__Impl rule__Theorem__Group__3 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2341:2: rule__Theorem__Group__2__Impl rule__Theorem__Group__3
            {
            pushFollow(FOLLOW_rule__Theorem__Group__2__Impl_in_rule__Theorem__Group__24629);
            rule__Theorem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__3_in_rule__Theorem__Group__24632);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2348:1: rule__Theorem__Group__2__Impl : ( ( rule__Theorem__ResultAssignment_2 ) ) ;
    public final void rule__Theorem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2352:1: ( ( ( rule__Theorem__ResultAssignment_2 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2353:1: ( ( rule__Theorem__ResultAssignment_2 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2353:1: ( ( rule__Theorem__ResultAssignment_2 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2354:1: ( rule__Theorem__ResultAssignment_2 )
            {
             before(grammarAccess.getTheoremAccess().getResultAssignment_2()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2355:1: ( rule__Theorem__ResultAssignment_2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2355:2: rule__Theorem__ResultAssignment_2
            {
            pushFollow(FOLLOW_rule__Theorem__ResultAssignment_2_in_rule__Theorem__Group__2__Impl4659);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2365:1: rule__Theorem__Group__3 : rule__Theorem__Group__3__Impl rule__Theorem__Group__4 ;
    public final void rule__Theorem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2369:1: ( rule__Theorem__Group__3__Impl rule__Theorem__Group__4 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2370:2: rule__Theorem__Group__3__Impl rule__Theorem__Group__4
            {
            pushFollow(FOLLOW_rule__Theorem__Group__3__Impl_in_rule__Theorem__Group__34689);
            rule__Theorem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__4_in_rule__Theorem__Group__34692);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2377:1: rule__Theorem__Group__3__Impl : ( ',' ) ;
    public final void rule__Theorem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2381:1: ( ( ',' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2382:1: ( ',' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2382:1: ( ',' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2383:1: ','
            {
             before(grammarAccess.getTheoremAccess().getCommaKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__Theorem__Group__3__Impl4720); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2396:1: rule__Theorem__Group__4 : rule__Theorem__Group__4__Impl rule__Theorem__Group__5 ;
    public final void rule__Theorem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2400:1: ( rule__Theorem__Group__4__Impl rule__Theorem__Group__5 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2401:2: rule__Theorem__Group__4__Impl rule__Theorem__Group__5
            {
            pushFollow(FOLLOW_rule__Theorem__Group__4__Impl_in_rule__Theorem__Group__44751);
            rule__Theorem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__5_in_rule__Theorem__Group__44754);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2408:1: rule__Theorem__Group__4__Impl : ( ( rule__Theorem__CostAssignment_4 ) ) ;
    public final void rule__Theorem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2412:1: ( ( ( rule__Theorem__CostAssignment_4 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2413:1: ( ( rule__Theorem__CostAssignment_4 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2413:1: ( ( rule__Theorem__CostAssignment_4 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2414:1: ( rule__Theorem__CostAssignment_4 )
            {
             before(grammarAccess.getTheoremAccess().getCostAssignment_4()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2415:1: ( rule__Theorem__CostAssignment_4 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2415:2: rule__Theorem__CostAssignment_4
            {
            pushFollow(FOLLOW_rule__Theorem__CostAssignment_4_in_rule__Theorem__Group__4__Impl4781);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2425:1: rule__Theorem__Group__5 : rule__Theorem__Group__5__Impl rule__Theorem__Group__6 ;
    public final void rule__Theorem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2429:1: ( rule__Theorem__Group__5__Impl rule__Theorem__Group__6 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2430:2: rule__Theorem__Group__5__Impl rule__Theorem__Group__6
            {
            pushFollow(FOLLOW_rule__Theorem__Group__5__Impl_in_rule__Theorem__Group__54811);
            rule__Theorem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__6_in_rule__Theorem__Group__54814);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2437:1: rule__Theorem__Group__5__Impl : ( ',' ) ;
    public final void rule__Theorem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2441:1: ( ( ',' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2442:1: ( ',' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2442:1: ( ',' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2443:1: ','
            {
             before(grammarAccess.getTheoremAccess().getCommaKeyword_5()); 
            match(input,20,FOLLOW_20_in_rule__Theorem__Group__5__Impl4842); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2456:1: rule__Theorem__Group__6 : rule__Theorem__Group__6__Impl rule__Theorem__Group__7 ;
    public final void rule__Theorem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2460:1: ( rule__Theorem__Group__6__Impl rule__Theorem__Group__7 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2461:2: rule__Theorem__Group__6__Impl rule__Theorem__Group__7
            {
            pushFollow(FOLLOW_rule__Theorem__Group__6__Impl_in_rule__Theorem__Group__64873);
            rule__Theorem__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__7_in_rule__Theorem__Group__64876);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2468:1: rule__Theorem__Group__6__Impl : ( ( rule__Theorem__DescriptionAssignment_6 ) ) ;
    public final void rule__Theorem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2472:1: ( ( ( rule__Theorem__DescriptionAssignment_6 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2473:1: ( ( rule__Theorem__DescriptionAssignment_6 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2473:1: ( ( rule__Theorem__DescriptionAssignment_6 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2474:1: ( rule__Theorem__DescriptionAssignment_6 )
            {
             before(grammarAccess.getTheoremAccess().getDescriptionAssignment_6()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2475:1: ( rule__Theorem__DescriptionAssignment_6 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2475:2: rule__Theorem__DescriptionAssignment_6
            {
            pushFollow(FOLLOW_rule__Theorem__DescriptionAssignment_6_in_rule__Theorem__Group__6__Impl4903);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2485:1: rule__Theorem__Group__7 : rule__Theorem__Group__7__Impl ;
    public final void rule__Theorem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2489:1: ( rule__Theorem__Group__7__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2490:2: rule__Theorem__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Theorem__Group__7__Impl_in_rule__Theorem__Group__74933);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2496:1: rule__Theorem__Group__7__Impl : ( ( rule__Theorem__Group_7__0 )? ) ;
    public final void rule__Theorem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2500:1: ( ( ( rule__Theorem__Group_7__0 )? ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2501:1: ( ( rule__Theorem__Group_7__0 )? )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2501:1: ( ( rule__Theorem__Group_7__0 )? )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2502:1: ( rule__Theorem__Group_7__0 )?
            {
             before(grammarAccess.getTheoremAccess().getGroup_7()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2503:1: ( rule__Theorem__Group_7__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2503:2: rule__Theorem__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Theorem__Group_7__0_in_rule__Theorem__Group__7__Impl4960);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2529:1: rule__Theorem__Group_7__0 : rule__Theorem__Group_7__0__Impl rule__Theorem__Group_7__1 ;
    public final void rule__Theorem__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2533:1: ( rule__Theorem__Group_7__0__Impl rule__Theorem__Group_7__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2534:2: rule__Theorem__Group_7__0__Impl rule__Theorem__Group_7__1
            {
            pushFollow(FOLLOW_rule__Theorem__Group_7__0__Impl_in_rule__Theorem__Group_7__05007);
            rule__Theorem__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group_7__1_in_rule__Theorem__Group_7__05010);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2541:1: rule__Theorem__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Theorem__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2545:1: ( ( ',' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2546:1: ( ',' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2546:1: ( ',' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2547:1: ','
            {
             before(grammarAccess.getTheoremAccess().getCommaKeyword_7_0()); 
            match(input,20,FOLLOW_20_in_rule__Theorem__Group_7__0__Impl5038); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2560:1: rule__Theorem__Group_7__1 : rule__Theorem__Group_7__1__Impl ;
    public final void rule__Theorem__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2564:1: ( rule__Theorem__Group_7__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2565:2: rule__Theorem__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Theorem__Group_7__1__Impl_in_rule__Theorem__Group_7__15069);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2571:1: rule__Theorem__Group_7__1__Impl : ( ( rule__Theorem__PseudoCodeAssignment_7_1 ) ) ;
    public final void rule__Theorem__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2575:1: ( ( ( rule__Theorem__PseudoCodeAssignment_7_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2576:1: ( ( rule__Theorem__PseudoCodeAssignment_7_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2576:1: ( ( rule__Theorem__PseudoCodeAssignment_7_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2577:1: ( rule__Theorem__PseudoCodeAssignment_7_1 )
            {
             before(grammarAccess.getTheoremAccess().getPseudoCodeAssignment_7_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2578:1: ( rule__Theorem__PseudoCodeAssignment_7_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2578:2: rule__Theorem__PseudoCodeAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Theorem__PseudoCodeAssignment_7_1_in_rule__Theorem__Group_7__1__Impl5096);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2593:1: rule__Input__GivenAssignment_1 : ( ruleProblem ) ;
    public final void rule__Input__GivenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2597:1: ( ( ruleProblem ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2598:1: ( ruleProblem )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2598:1: ( ruleProblem )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2599:1: ruleProblem
            {
             before(grammarAccess.getInputAccess().getGivenProblemParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleProblem_in_rule__Input__GivenAssignment_15135);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2608:1: rule__Input__GoalAssignment_4 : ( ruleProblem ) ;
    public final void rule__Input__GoalAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2612:1: ( ( ruleProblem ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2613:1: ( ruleProblem )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2613:1: ( ruleProblem )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2614:1: ruleProblem
            {
             before(grammarAccess.getInputAccess().getGoalProblemParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleProblem_in_rule__Input__GoalAssignment_45166);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2623:1: rule__Input__TheoremsAssignment_5_2 : ( ruleTheorem ) ;
    public final void rule__Input__TheoremsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2627:1: ( ( ruleTheorem ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2628:1: ( ruleTheorem )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2628:1: ( ruleTheorem )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2629:1: ruleTheorem
            {
             before(grammarAccess.getInputAccess().getTheoremsTheoremParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_ruleTheorem_in_rule__Input__TheoremsAssignment_5_25197);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2638:1: rule__Input__TheoremsAssignment_5_3_1 : ( ruleTheorem ) ;
    public final void rule__Input__TheoremsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2642:1: ( ( ruleTheorem ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2643:1: ( ruleTheorem )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2643:1: ( ruleTheorem )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2644:1: ruleTheorem
            {
             before(grammarAccess.getInputAccess().getTheoremsTheoremParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_ruleTheorem_in_rule__Input__TheoremsAssignment_5_3_15228);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2653:1: rule__Problem__VarsAssignment_0_0 : ( ruleDeclaration ) ;
    public final void rule__Problem__VarsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2657:1: ( ( ruleDeclaration ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2658:1: ( ruleDeclaration )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2658:1: ( ruleDeclaration )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2659:1: ruleDeclaration
            {
             before(grammarAccess.getProblemAccess().getVarsDeclarationParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleDeclaration_in_rule__Problem__VarsAssignment_0_05259);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getProblemAccess().getVarsDeclarationParserRuleCall_0_0_0()); 

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2668:1: rule__Problem__VarsAssignment_0_1_1 : ( ruleDeclaration ) ;
    public final void rule__Problem__VarsAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2672:1: ( ( ruleDeclaration ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2673:1: ( ruleDeclaration )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2673:1: ( ruleDeclaration )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2674:1: ruleDeclaration
            {
             before(grammarAccess.getProblemAccess().getVarsDeclarationParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_ruleDeclaration_in_rule__Problem__VarsAssignment_0_1_15290);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getProblemAccess().getVarsDeclarationParserRuleCall_0_1_1_0()); 

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2683:1: rule__Problem__PropertyAssignment_2 : ( ruleORing ) ;
    public final void rule__Problem__PropertyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2687:1: ( ( ruleORing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2688:1: ( ruleORing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2688:1: ( ruleORing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2689:1: ruleORing
            {
             before(grammarAccess.getProblemAccess().getPropertyORingParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleORing_in_rule__Problem__PropertyAssignment_25321);
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


    // $ANTLR start "rule__Declaration__TypeAssignment_0_0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2698:1: rule__Declaration__TypeAssignment_0_0 : ( ruleType ) ;
    public final void rule__Declaration__TypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2702:1: ( ( ruleType ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2703:1: ( ruleType )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2703:1: ( ruleType )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2704:1: ruleType
            {
             before(grammarAccess.getDeclarationAccess().getTypeTypeParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Declaration__TypeAssignment_0_05352);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getTypeTypeParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Declaration__TypeAssignment_0_0"


    // $ANTLR start "rule__Declaration__VarNameAssignment_0_2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2713:1: rule__Declaration__VarNameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__Declaration__VarNameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2717:1: ( ( RULE_ID ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2718:1: ( RULE_ID )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2718:1: ( RULE_ID )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2719:1: RULE_ID
            {
             before(grammarAccess.getDeclarationAccess().getVarNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Declaration__VarNameAssignment_0_25383); 
             after(grammarAccess.getDeclarationAccess().getVarNameIDTerminalRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__Declaration__VarNameAssignment_0_2"


    // $ANTLR start "rule__Declaration__VarNameAssignment_1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2728:1: rule__Declaration__VarNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Declaration__VarNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2732:1: ( ( RULE_ID ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2733:1: ( RULE_ID )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2733:1: ( RULE_ID )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2734:1: RULE_ID
            {
             before(grammarAccess.getDeclarationAccess().getVarNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Declaration__VarNameAssignment_15414); 
             after(grammarAccess.getDeclarationAccess().getVarNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Declaration__VarNameAssignment_1"


    // $ANTLR start "rule__Type__NameAssignment_0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2743:1: rule__Type__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2747:1: ( ( RULE_ID ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2748:1: ( RULE_ID )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2748:1: ( RULE_ID )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2749:1: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Type__NameAssignment_05445); 
             after(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Type__NameAssignment_0"


    // $ANTLR start "rule__Type__TemplateTypeAssignment_1_1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2758:1: rule__Type__TemplateTypeAssignment_1_1 : ( ruleType ) ;
    public final void rule__Type__TemplateTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2762:1: ( ( ruleType ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2763:1: ( ruleType )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2763:1: ( ruleType )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2764:1: ruleType
            {
             before(grammarAccess.getTypeAccess().getTemplateTypeTypeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Type__TemplateTypeAssignment_1_15476);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getTemplateTypeTypeParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Type__TemplateTypeAssignment_1_1"


    // $ANTLR start "rule__ORing__RightAssignment_1_2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2773:1: rule__ORing__RightAssignment_1_2 : ( ruleANDing ) ;
    public final void rule__ORing__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2777:1: ( ( ruleANDing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2778:1: ( ruleANDing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2778:1: ( ruleANDing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2779:1: ruleANDing
            {
             before(grammarAccess.getORingAccess().getRightANDingParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleANDing_in_rule__ORing__RightAssignment_1_25507);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2788:1: rule__ANDing__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__ANDing__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2792:1: ( ( rulePrimary ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2793:1: ( rulePrimary )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2793:1: ( rulePrimary )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2794:1: rulePrimary
            {
             before(grammarAccess.getANDingAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__ANDing__RightAssignment_1_25538);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2803:1: rule__Quantifier__QuantifierAssignment_0 : ( ( rule__Quantifier__QuantifierAlternatives_0_0 ) ) ;
    public final void rule__Quantifier__QuantifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2807:1: ( ( ( rule__Quantifier__QuantifierAlternatives_0_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2808:1: ( ( rule__Quantifier__QuantifierAlternatives_0_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2808:1: ( ( rule__Quantifier__QuantifierAlternatives_0_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2809:1: ( rule__Quantifier__QuantifierAlternatives_0_0 )
            {
             before(grammarAccess.getQuantifierAccess().getQuantifierAlternatives_0_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2810:1: ( rule__Quantifier__QuantifierAlternatives_0_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2810:2: rule__Quantifier__QuantifierAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__Quantifier__QuantifierAlternatives_0_0_in_rule__Quantifier__QuantifierAssignment_05569);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2819:1: rule__Quantifier__SubjectAssignment_2 : ( ruleProblem ) ;
    public final void rule__Quantifier__SubjectAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2823:1: ( ( ruleProblem ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2824:1: ( ruleProblem )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2824:1: ( ruleProblem )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2825:1: ruleProblem
            {
             before(grammarAccess.getQuantifierAccess().getSubjectProblemParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleProblem_in_rule__Quantifier__SubjectAssignment_25602);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2834:1: rule__Quantifier__PredicateAssignment_4 : ( ruleORing ) ;
    public final void rule__Quantifier__PredicateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2838:1: ( ( ruleORing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2839:1: ( ruleORing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2839:1: ( ruleORing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2840:1: ruleORing
            {
             before(grammarAccess.getQuantifierAccess().getPredicateORingParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleORing_in_rule__Quantifier__PredicateAssignment_45633);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2849:1: rule__Atomic__FunctionAssignment_0 : ( RULE_ID ) ;
    public final void rule__Atomic__FunctionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2853:1: ( ( RULE_ID ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2854:1: ( RULE_ID )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2854:1: ( RULE_ID )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2855:1: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getFunctionIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Atomic__FunctionAssignment_05664); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2864:1: rule__Atomic__ArgsAssignment_1_1_0 : ( RULE_ID ) ;
    public final void rule__Atomic__ArgsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2868:1: ( ( RULE_ID ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2869:1: ( RULE_ID )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2869:1: ( RULE_ID )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2870:1: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getArgsIDTerminalRuleCall_1_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Atomic__ArgsAssignment_1_1_05695); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2879:1: rule__Atomic__ArgsAssignment_1_1_1_1 : ( RULE_ID ) ;
    public final void rule__Atomic__ArgsAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2883:1: ( ( RULE_ID ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2884:1: ( RULE_ID )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2884:1: ( RULE_ID )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2885:1: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getArgsIDTerminalRuleCall_1_1_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Atomic__ArgsAssignment_1_1_1_15726); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2894:1: rule__BooleanLiteral__ValueAssignment : ( ( rule__BooleanLiteral__ValueAlternatives_0 ) ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2898:1: ( ( ( rule__BooleanLiteral__ValueAlternatives_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2899:1: ( ( rule__BooleanLiteral__ValueAlternatives_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2899:1: ( ( rule__BooleanLiteral__ValueAlternatives_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2900:1: ( rule__BooleanLiteral__ValueAlternatives_0 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2901:1: ( rule__BooleanLiteral__ValueAlternatives_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2901:2: rule__BooleanLiteral__ValueAlternatives_0
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__ValueAlternatives_0_in_rule__BooleanLiteral__ValueAssignment5757);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2910:1: rule__Theorem__RequirementAssignment_0 : ( ruleORing ) ;
    public final void rule__Theorem__RequirementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2914:1: ( ( ruleORing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2915:1: ( ruleORing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2915:1: ( ruleORing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2916:1: ruleORing
            {
             before(grammarAccess.getTheoremAccess().getRequirementORingParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleORing_in_rule__Theorem__RequirementAssignment_05790);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2925:1: rule__Theorem__ResultAssignment_2 : ( ruleORing ) ;
    public final void rule__Theorem__ResultAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2929:1: ( ( ruleORing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2930:1: ( ruleORing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2930:1: ( ruleORing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2931:1: ruleORing
            {
             before(grammarAccess.getTheoremAccess().getResultORingParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleORing_in_rule__Theorem__ResultAssignment_25821);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2940:1: rule__Theorem__CostAssignment_4 : ( RULE_INT ) ;
    public final void rule__Theorem__CostAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2944:1: ( ( RULE_INT ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2945:1: ( RULE_INT )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2945:1: ( RULE_INT )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2946:1: RULE_INT
            {
             before(grammarAccess.getTheoremAccess().getCostINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Theorem__CostAssignment_45852); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2955:1: rule__Theorem__DescriptionAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Theorem__DescriptionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2959:1: ( ( RULE_STRING ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2960:1: ( RULE_STRING )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2960:1: ( RULE_STRING )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2961:1: RULE_STRING
            {
             before(grammarAccess.getTheoremAccess().getDescriptionSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Theorem__DescriptionAssignment_65883); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2970:1: rule__Theorem__PseudoCodeAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__Theorem__PseudoCodeAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2974:1: ( ( RULE_STRING ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2975:1: ( RULE_STRING )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2975:1: ( RULE_STRING )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2976:1: RULE_STRING
            {
             before(grammarAccess.getTheoremAccess().getPseudoCodeSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Theorem__PseudoCodeAssignment_7_15914); 
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
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Alternatives_in_ruleDeclaration214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0_in_ruleType274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_entryRuleORing301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleORing308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORing__Group__0_in_ruleORing334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANDing_in_entryRuleANDing361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleANDing368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANDing__Group__0_in_ruleANDing394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Alternatives_in_rulePrimary454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_entryRuleQuantifier481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantifier488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__0_in_ruleQuantifier514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group__0_in_ruleAtomic574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTheorem_in_entryRuleTheorem661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTheorem668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__0_in_ruleTheorem694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_0__0_in_rule__Declaration__Alternatives730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__VarNameAssignment_1_in_rule__Declaration__Alternatives748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rule__Primary__Alternatives781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_rule__Primary__Alternatives798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_2__0_in_rule__Primary__Alternatives815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__Primary__Alternatives833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Quantifier__QuantifierAlternatives_0_0866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Quantifier__QuantifierAlternatives_0_0886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BooleanLiteral__ValueAlternatives_0921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BooleanLiteral__ValueAlternatives_0941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__0973 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Input__Group__1_in_rule__Input__Group__0976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Input__Group__0__Impl1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__11035 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Input__Group__2_in_rule__Input__Group__11038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__GivenAssignment_1_in_rule__Input__Group__1__Impl1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__2__Impl_in_rule__Input__Group__21095 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Input__Group__3_in_rule__Input__Group__21098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Input__Group__2__Impl1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__3__Impl_in_rule__Input__Group__31157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Input__Group__4_in_rule__Input__Group__31160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Input__Group__3__Impl1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__4__Impl_in_rule__Input__Group__41219 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Input__Group__5_in_rule__Input__Group__41222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__GoalAssignment_4_in_rule__Input__Group__4__Impl1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__5__Impl_in_rule__Input__Group__51279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_5__0_in_rule__Input__Group__5__Impl1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_5__0__Impl_in_rule__Input__Group_5__01349 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Input__Group_5__1_in_rule__Input__Group_5__01352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Input__Group_5__0__Impl1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_5__1__Impl_in_rule__Input__Group_5__11411 = new BitSet(new long[]{0x0000000000207810L});
    public static final BitSet FOLLOW_rule__Input__Group_5__2_in_rule__Input__Group_5__11414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Input__Group_5__1__Impl1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_5__2__Impl_in_rule__Input__Group_5__21473 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Input__Group_5__3_in_rule__Input__Group_5__21476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__TheoremsAssignment_5_2_in_rule__Input__Group_5__2__Impl1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_5__3__Impl_in_rule__Input__Group_5__31533 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Input__Group_5__4_in_rule__Input__Group_5__31536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_5_3__0_in_rule__Input__Group_5__3__Impl1563 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Input__Group_5__4__Impl_in_rule__Input__Group_5__41594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Input__Group_5__4__Impl1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_5_3__0__Impl_in_rule__Input__Group_5_3__01666 = new BitSet(new long[]{0x0000000000207810L});
    public static final BitSet FOLLOW_rule__Input__Group_5_3__1_in_rule__Input__Group_5_3__01669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Input__Group_5_3__0__Impl1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_5_3__1__Impl_in_rule__Input__Group_5_3__11728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__TheoremsAssignment_5_3_1_in_rule__Input__Group_5_3__1__Impl1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group__0__Impl_in_rule__Problem__Group__01789 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Problem__Group__1_in_rule__Problem__Group__01792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group_0__0_in_rule__Problem__Group__0__Impl1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group__1__Impl_in_rule__Problem__Group__11849 = new BitSet(new long[]{0x0000000000207810L});
    public static final BitSet FOLLOW_rule__Problem__Group__2_in_rule__Problem__Group__11852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Problem__Group__1__Impl1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group__2__Impl_in_rule__Problem__Group__21911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__PropertyAssignment_2_in_rule__Problem__Group__2__Impl1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group_0__0__Impl_in_rule__Problem__Group_0__01974 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Problem__Group_0__1_in_rule__Problem__Group_0__01977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__VarsAssignment_0_0_in_rule__Problem__Group_0__0__Impl2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group_0__1__Impl_in_rule__Problem__Group_0__12034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group_0_1__0_in_rule__Problem__Group_0__1__Impl2061 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Problem__Group_0_1__0__Impl_in_rule__Problem__Group_0_1__02096 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Problem__Group_0_1__1_in_rule__Problem__Group_0_1__02099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Problem__Group_0_1__0__Impl2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group_0_1__1__Impl_in_rule__Problem__Group_0_1__12158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__VarsAssignment_0_1_1_in_rule__Problem__Group_0_1__1__Impl2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_0__0__Impl_in_rule__Declaration__Group_0__02219 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Declaration__Group_0__1_in_rule__Declaration__Group_0__02222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__TypeAssignment_0_0_in_rule__Declaration__Group_0__0__Impl2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_0__1__Impl_in_rule__Declaration__Group_0__12279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Declaration__Group_0__2_in_rule__Declaration__Group_0__12282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Declaration__Group_0__1__Impl2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_0__2__Impl_in_rule__Declaration__Group_0__22341 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Declaration__Group_0__3_in_rule__Declaration__Group_0__22344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__VarNameAssignment_0_2_in_rule__Declaration__Group_0__2__Impl2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_0__3__Impl_in_rule__Declaration__Group_0__32401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Declaration__Group_0__3__Impl2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__02468 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Type__Group__1_in_rule__Type__Group__02471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__NameAssignment_0_in_rule__Type__Group__0__Impl2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__12528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__0_in_rule__Type__Group__1__Impl2555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__0__Impl_in_rule__Type__Group_1__02590 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Type__Group_1__1_in_rule__Type__Group_1__02593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Type__Group_1__0__Impl2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__1__Impl_in_rule__Type__Group_1__12652 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Type__Group_1__2_in_rule__Type__Group_1__12655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__TemplateTypeAssignment_1_1_in_rule__Type__Group_1__1__Impl2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__2__Impl_in_rule__Type__Group_1__22712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Type__Group_1__2__Impl2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORing__Group__0__Impl_in_rule__ORing__Group__02777 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ORing__Group__1_in_rule__ORing__Group__02780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANDing_in_rule__ORing__Group__0__Impl2807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORing__Group__1__Impl_in_rule__ORing__Group__12836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORing__Group_1__0_in_rule__ORing__Group__1__Impl2863 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__ORing__Group_1__0__Impl_in_rule__ORing__Group_1__02898 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ORing__Group_1__1_in_rule__ORing__Group_1__02901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORing__Group_1__1__Impl_in_rule__ORing__Group_1__12959 = new BitSet(new long[]{0x0000000000207810L});
    public static final BitSet FOLLOW_rule__ORing__Group_1__2_in_rule__ORing__Group_1__12962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ORing__Group_1__1__Impl2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORing__Group_1__2__Impl_in_rule__ORing__Group_1__23021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORing__RightAssignment_1_2_in_rule__ORing__Group_1__2__Impl3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANDing__Group__0__Impl_in_rule__ANDing__Group__03084 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ANDing__Group__1_in_rule__ANDing__Group__03087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__ANDing__Group__0__Impl3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANDing__Group__1__Impl_in_rule__ANDing__Group__13143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANDing__Group_1__0_in_rule__ANDing__Group__1__Impl3170 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__ANDing__Group_1__0__Impl_in_rule__ANDing__Group_1__03205 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ANDing__Group_1__1_in_rule__ANDing__Group_1__03208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANDing__Group_1__1__Impl_in_rule__ANDing__Group_1__13266 = new BitSet(new long[]{0x0000000000207810L});
    public static final BitSet FOLLOW_rule__ANDing__Group_1__2_in_rule__ANDing__Group_1__13269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ANDing__Group_1__1__Impl3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANDing__Group_1__2__Impl_in_rule__ANDing__Group_1__23328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANDing__RightAssignment_1_2_in_rule__ANDing__Group_1__2__Impl3355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_2__0__Impl_in_rule__Primary__Group_2__03391 = new BitSet(new long[]{0x0000000000207810L});
    public static final BitSet FOLLOW_rule__Primary__Group_2__1_in_rule__Primary__Group_2__03394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Primary__Group_2__0__Impl3422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_2__1__Impl_in_rule__Primary__Group_2__13453 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Primary__Group_2__2_in_rule__Primary__Group_2__13456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_rule__Primary__Group_2__1__Impl3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_2__2__Impl_in_rule__Primary__Group_2__23512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Primary__Group_2__2__Impl3540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__0__Impl_in_rule__Quantifier__Group__03577 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__1_in_rule__Quantifier__Group__03580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__QuantifierAssignment_0_in_rule__Quantifier__Group__0__Impl3607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__1__Impl_in_rule__Quantifier__Group__13637 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__2_in_rule__Quantifier__Group__13640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Quantifier__Group__1__Impl3668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__2__Impl_in_rule__Quantifier__Group__23699 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__3_in_rule__Quantifier__Group__23702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__SubjectAssignment_2_in_rule__Quantifier__Group__2__Impl3729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__3__Impl_in_rule__Quantifier__Group__33759 = new BitSet(new long[]{0x0000000000207810L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__4_in_rule__Quantifier__Group__33762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Quantifier__Group__3__Impl3790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__4__Impl_in_rule__Quantifier__Group__43821 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__5_in_rule__Quantifier__Group__43824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__PredicateAssignment_4_in_rule__Quantifier__Group__4__Impl3851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__5__Impl_in_rule__Quantifier__Group__53881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Quantifier__Group__5__Impl3909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group__0__Impl_in_rule__Atomic__Group__03952 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Atomic__Group__1_in_rule__Atomic__Group__03955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__FunctionAssignment_0_in_rule__Atomic__Group__0__Impl3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group__1__Impl_in_rule__Atomic__Group__14012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Group__1__Impl4039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__04074 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__04077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Atomic__Group_1__0__Impl4105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__14136 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__2_in_rule__Atomic__Group_1__14139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1_1__0_in_rule__Atomic__Group_1__1__Impl4166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__2__Impl_in_rule__Atomic__Group_1__24197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Atomic__Group_1__2__Impl4225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1_1__0__Impl_in_rule__Atomic__Group_1_1__04262 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1_1__1_in_rule__Atomic__Group_1_1__04265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ArgsAssignment_1_1_0_in_rule__Atomic__Group_1_1__0__Impl4292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1_1__1__Impl_in_rule__Atomic__Group_1_1__14322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1_1_1__0_in_rule__Atomic__Group_1_1__1__Impl4349 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1_1_1__0__Impl_in_rule__Atomic__Group_1_1_1__04384 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1_1_1__1_in_rule__Atomic__Group_1_1_1__04387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Atomic__Group_1_1_1__0__Impl4415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1_1_1__1__Impl_in_rule__Atomic__Group_1_1_1__14446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ArgsAssignment_1_1_1_1_in_rule__Atomic__Group_1_1_1__1__Impl4473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__0__Impl_in_rule__Theorem__Group__04507 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Theorem__Group__1_in_rule__Theorem__Group__04510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__RequirementAssignment_0_in_rule__Theorem__Group__0__Impl4537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__1__Impl_in_rule__Theorem__Group__14567 = new BitSet(new long[]{0x0000000000207810L});
    public static final BitSet FOLLOW_rule__Theorem__Group__2_in_rule__Theorem__Group__14570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Theorem__Group__1__Impl4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__2__Impl_in_rule__Theorem__Group__24629 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Theorem__Group__3_in_rule__Theorem__Group__24632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__ResultAssignment_2_in_rule__Theorem__Group__2__Impl4659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__3__Impl_in_rule__Theorem__Group__34689 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Theorem__Group__4_in_rule__Theorem__Group__34692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Theorem__Group__3__Impl4720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__4__Impl_in_rule__Theorem__Group__44751 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Theorem__Group__5_in_rule__Theorem__Group__44754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__CostAssignment_4_in_rule__Theorem__Group__4__Impl4781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__5__Impl_in_rule__Theorem__Group__54811 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Theorem__Group__6_in_rule__Theorem__Group__54814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Theorem__Group__5__Impl4842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__6__Impl_in_rule__Theorem__Group__64873 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Theorem__Group__7_in_rule__Theorem__Group__64876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__DescriptionAssignment_6_in_rule__Theorem__Group__6__Impl4903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__7__Impl_in_rule__Theorem__Group__74933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group_7__0_in_rule__Theorem__Group__7__Impl4960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group_7__0__Impl_in_rule__Theorem__Group_7__05007 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Theorem__Group_7__1_in_rule__Theorem__Group_7__05010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Theorem__Group_7__0__Impl5038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group_7__1__Impl_in_rule__Theorem__Group_7__15069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__PseudoCodeAssignment_7_1_in_rule__Theorem__Group_7__1__Impl5096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblem_in_rule__Input__GivenAssignment_15135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblem_in_rule__Input__GoalAssignment_45166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTheorem_in_rule__Input__TheoremsAssignment_5_25197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTheorem_in_rule__Input__TheoremsAssignment_5_3_15228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__Problem__VarsAssignment_0_05259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__Problem__VarsAssignment_0_1_15290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_rule__Problem__PropertyAssignment_25321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Declaration__TypeAssignment_0_05352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Declaration__VarNameAssignment_0_25383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Declaration__VarNameAssignment_15414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Type__NameAssignment_05445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Type__TemplateTypeAssignment_1_15476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANDing_in_rule__ORing__RightAssignment_1_25507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__ANDing__RightAssignment_1_25538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__QuantifierAlternatives_0_0_in_rule__Quantifier__QuantifierAssignment_05569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblem_in_rule__Quantifier__SubjectAssignment_25602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_rule__Quantifier__PredicateAssignment_45633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Atomic__FunctionAssignment_05664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Atomic__ArgsAssignment_1_1_05695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Atomic__ArgsAssignment_1_1_1_15726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAlternatives_0_in_rule__BooleanLiteral__ValueAssignment5757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_rule__Theorem__RequirementAssignment_05790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_rule__Theorem__ResultAssignment_25821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Theorem__CostAssignment_45852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Theorem__DescriptionAssignment_65883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Theorem__PseudoCodeAssignment_7_15914 = new BitSet(new long[]{0x0000000000000002L});

}