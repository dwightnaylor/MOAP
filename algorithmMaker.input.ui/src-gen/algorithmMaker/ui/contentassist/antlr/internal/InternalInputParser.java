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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Find'", "'Count'", "'forall'", "'exists'", "'TRUE'", "'FALSE'", "'Given'", "';'", "'('", "')'", "'Theorems:'", "'st'", "','", "'<'", "'>'", "'|'", "'&'", "':'", "':-'", "'Test'"
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
    public static final int T__30=30;
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


    // $ANTLR start "entryRuleProblemNoVars"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:88:1: entryRuleProblemNoVars : ruleProblemNoVars EOF ;
    public final void entryRuleProblemNoVars() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:89:1: ( ruleProblemNoVars EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:90:1: ruleProblemNoVars EOF
            {
             before(grammarAccess.getProblemNoVarsRule()); 
            pushFollow(FOLLOW_ruleProblemNoVars_in_entryRuleProblemNoVars121);
            ruleProblemNoVars();

            state._fsp--;

             after(grammarAccess.getProblemNoVarsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProblemNoVars128); 

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
    // $ANTLR end "entryRuleProblemNoVars"


    // $ANTLR start "ruleProblemNoVars"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:97:1: ruleProblemNoVars : ( ( rule__ProblemNoVars__PropertyAssignment ) ) ;
    public final void ruleProblemNoVars() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:101:2: ( ( ( rule__ProblemNoVars__PropertyAssignment ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:102:1: ( ( rule__ProblemNoVars__PropertyAssignment ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:102:1: ( ( rule__ProblemNoVars__PropertyAssignment ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:103:1: ( rule__ProblemNoVars__PropertyAssignment )
            {
             before(grammarAccess.getProblemNoVarsAccess().getPropertyAssignment()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:104:1: ( rule__ProblemNoVars__PropertyAssignment )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:104:2: rule__ProblemNoVars__PropertyAssignment
            {
            pushFollow(FOLLOW_rule__ProblemNoVars__PropertyAssignment_in_ruleProblemNoVars154);
            rule__ProblemNoVars__PropertyAssignment();

            state._fsp--;


            }

             after(grammarAccess.getProblemNoVarsAccess().getPropertyAssignment()); 

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
    // $ANTLR end "ruleProblemNoVars"


    // $ANTLR start "entryRuleProblem"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:116:1: entryRuleProblem : ruleProblem EOF ;
    public final void entryRuleProblem() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:117:1: ( ruleProblem EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:118:1: ruleProblem EOF
            {
             before(grammarAccess.getProblemRule()); 
            pushFollow(FOLLOW_ruleProblem_in_entryRuleProblem181);
            ruleProblem();

            state._fsp--;

             after(grammarAccess.getProblemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProblem188); 

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:125:1: ruleProblem : ( ( rule__Problem__Group__0 ) ) ;
    public final void ruleProblem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:129:2: ( ( ( rule__Problem__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:130:1: ( ( rule__Problem__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:130:1: ( ( rule__Problem__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:131:1: ( rule__Problem__Group__0 )
            {
             before(grammarAccess.getProblemAccess().getGroup()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:132:1: ( rule__Problem__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:132:2: rule__Problem__Group__0
            {
            pushFollow(FOLLOW_rule__Problem__Group__0_in_ruleProblem214);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:144:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:145:1: ( ruleDeclaration EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:146:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration241);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration248); 

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:153:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:157:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:158:1: ( ( rule__Declaration__Alternatives ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:158:1: ( ( rule__Declaration__Alternatives ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:159:1: ( rule__Declaration__Alternatives )
            {
             before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:160:1: ( rule__Declaration__Alternatives )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:160:2: rule__Declaration__Alternatives
            {
            pushFollow(FOLLOW_rule__Declaration__Alternatives_in_ruleDeclaration274);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:172:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:173:1: ( ruleType EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:174:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType301);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType308); 

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:181:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:185:2: ( ( ( rule__Type__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:186:1: ( ( rule__Type__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:186:1: ( ( rule__Type__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:187:1: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:188:1: ( rule__Type__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:188:2: rule__Type__Group__0
            {
            pushFollow(FOLLOW_rule__Type__Group__0_in_ruleType334);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:200:1: entryRuleORing : ruleORing EOF ;
    public final void entryRuleORing() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:201:1: ( ruleORing EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:202:1: ruleORing EOF
            {
             before(grammarAccess.getORingRule()); 
            pushFollow(FOLLOW_ruleORing_in_entryRuleORing361);
            ruleORing();

            state._fsp--;

             after(grammarAccess.getORingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleORing368); 

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:209:1: ruleORing : ( ( rule__ORing__Group__0 ) ) ;
    public final void ruleORing() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:213:2: ( ( ( rule__ORing__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:214:1: ( ( rule__ORing__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:214:1: ( ( rule__ORing__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:215:1: ( rule__ORing__Group__0 )
            {
             before(grammarAccess.getORingAccess().getGroup()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:216:1: ( rule__ORing__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:216:2: rule__ORing__Group__0
            {
            pushFollow(FOLLOW_rule__ORing__Group__0_in_ruleORing394);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:228:1: entryRuleANDing : ruleANDing EOF ;
    public final void entryRuleANDing() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:229:1: ( ruleANDing EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:230:1: ruleANDing EOF
            {
             before(grammarAccess.getANDingRule()); 
            pushFollow(FOLLOW_ruleANDing_in_entryRuleANDing421);
            ruleANDing();

            state._fsp--;

             after(grammarAccess.getANDingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleANDing428); 

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:237:1: ruleANDing : ( ( rule__ANDing__Group__0 ) ) ;
    public final void ruleANDing() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:241:2: ( ( ( rule__ANDing__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:242:1: ( ( rule__ANDing__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:242:1: ( ( rule__ANDing__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:243:1: ( rule__ANDing__Group__0 )
            {
             before(grammarAccess.getANDingAccess().getGroup()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:244:1: ( rule__ANDing__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:244:2: rule__ANDing__Group__0
            {
            pushFollow(FOLLOW_rule__ANDing__Group__0_in_ruleANDing454);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:256:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:257:1: ( rulePrimary EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:258:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary481);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary488); 

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:265:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:269:2: ( ( ( rule__Primary__Alternatives ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:270:1: ( ( rule__Primary__Alternatives ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:270:1: ( ( rule__Primary__Alternatives ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:271:1: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:272:1: ( rule__Primary__Alternatives )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:272:2: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_rule__Primary__Alternatives_in_rulePrimary514);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:284:1: entryRuleQuantifier : ruleQuantifier EOF ;
    public final void entryRuleQuantifier() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:285:1: ( ruleQuantifier EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:286:1: ruleQuantifier EOF
            {
             before(grammarAccess.getQuantifierRule()); 
            pushFollow(FOLLOW_ruleQuantifier_in_entryRuleQuantifier541);
            ruleQuantifier();

            state._fsp--;

             after(grammarAccess.getQuantifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantifier548); 

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:293:1: ruleQuantifier : ( ( rule__Quantifier__Group__0 ) ) ;
    public final void ruleQuantifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:297:2: ( ( ( rule__Quantifier__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:298:1: ( ( rule__Quantifier__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:298:1: ( ( rule__Quantifier__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:299:1: ( rule__Quantifier__Group__0 )
            {
             before(grammarAccess.getQuantifierAccess().getGroup()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:300:1: ( rule__Quantifier__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:300:2: rule__Quantifier__Group__0
            {
            pushFollow(FOLLOW_rule__Quantifier__Group__0_in_ruleQuantifier574);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:312:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:313:1: ( ruleAtomic EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:314:1: ruleAtomic EOF
            {
             before(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic601);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getAtomicRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic608); 

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:321:1: ruleAtomic : ( ( rule__Atomic__Group__0 ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:325:2: ( ( ( rule__Atomic__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:326:1: ( ( rule__Atomic__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:326:1: ( ( rule__Atomic__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:327:1: ( rule__Atomic__Group__0 )
            {
             before(grammarAccess.getAtomicAccess().getGroup()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:328:1: ( rule__Atomic__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:328:2: rule__Atomic__Group__0
            {
            pushFollow(FOLLOW_rule__Atomic__Group__0_in_ruleAtomic634);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:340:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:341:1: ( ruleBooleanLiteral EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:342:1: ruleBooleanLiteral EOF
            {
             before(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral661);
            ruleBooleanLiteral();

            state._fsp--;

             after(grammarAccess.getBooleanLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral668); 

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:349:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__ValueAssignment ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:353:2: ( ( ( rule__BooleanLiteral__ValueAssignment ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:354:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:354:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:355:1: ( rule__BooleanLiteral__ValueAssignment )
            {
             before(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:356:1: ( rule__BooleanLiteral__ValueAssignment )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:356:2: rule__BooleanLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral694);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:368:1: entryRuleTheorem : ruleTheorem EOF ;
    public final void entryRuleTheorem() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:369:1: ( ruleTheorem EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:370:1: ruleTheorem EOF
            {
             before(grammarAccess.getTheoremRule()); 
            pushFollow(FOLLOW_ruleTheorem_in_entryRuleTheorem721);
            ruleTheorem();

            state._fsp--;

             after(grammarAccess.getTheoremRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTheorem728); 

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:377:1: ruleTheorem : ( ( rule__Theorem__Group__0 ) ) ;
    public final void ruleTheorem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:381:2: ( ( ( rule__Theorem__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:382:1: ( ( rule__Theorem__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:382:1: ( ( rule__Theorem__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:383:1: ( rule__Theorem__Group__0 )
            {
             before(grammarAccess.getTheoremAccess().getGroup()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:384:1: ( rule__Theorem__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:384:2: rule__Theorem__Group__0
            {
            pushFollow(FOLLOW_rule__Theorem__Group__0_in_ruleTheorem754);
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


    // $ANTLR start "rule__Input__Alternatives_3"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:396:1: rule__Input__Alternatives_3 : ( ( ( rule__Input__Group_3_0__0 ) ) | ( ( rule__Input__Group_3_1__0 ) ) );
    public final void rule__Input__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:400:1: ( ( ( rule__Input__Group_3_0__0 ) ) | ( ( rule__Input__Group_3_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                alt1=1;
            }
            else if ( (LA1_0==30) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:401:1: ( ( rule__Input__Group_3_0__0 ) )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:401:1: ( ( rule__Input__Group_3_0__0 ) )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:402:1: ( rule__Input__Group_3_0__0 )
                    {
                     before(grammarAccess.getInputAccess().getGroup_3_0()); 
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:403:1: ( rule__Input__Group_3_0__0 )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:403:2: rule__Input__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__Input__Group_3_0__0_in_rule__Input__Alternatives_3790);
                    rule__Input__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInputAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:407:6: ( ( rule__Input__Group_3_1__0 ) )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:407:6: ( ( rule__Input__Group_3_1__0 ) )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:408:1: ( rule__Input__Group_3_1__0 )
                    {
                     before(grammarAccess.getInputAccess().getGroup_3_1()); 
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:409:1: ( rule__Input__Group_3_1__0 )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:409:2: rule__Input__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Input__Group_3_1__0_in_rule__Input__Alternatives_3808);
                    rule__Input__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInputAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__Input__Alternatives_3"


    // $ANTLR start "rule__Input__TaskAlternatives_3_0_0_0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:418:1: rule__Input__TaskAlternatives_3_0_0_0 : ( ( 'Find' ) | ( 'Count' ) );
    public final void rule__Input__TaskAlternatives_3_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:422:1: ( ( 'Find' ) | ( 'Count' ) )
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
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:423:1: ( 'Find' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:423:1: ( 'Find' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:424:1: 'Find'
                    {
                     before(grammarAccess.getInputAccess().getTaskFindKeyword_3_0_0_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Input__TaskAlternatives_3_0_0_0842); 
                     after(grammarAccess.getInputAccess().getTaskFindKeyword_3_0_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:431:6: ( 'Count' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:431:6: ( 'Count' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:432:1: 'Count'
                    {
                     before(grammarAccess.getInputAccess().getTaskCountKeyword_3_0_0_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Input__TaskAlternatives_3_0_0_0862); 
                     after(grammarAccess.getInputAccess().getTaskCountKeyword_3_0_0_0_1()); 

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
    // $ANTLR end "rule__Input__TaskAlternatives_3_0_0_0"


    // $ANTLR start "rule__Declaration__Alternatives"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:444:1: rule__Declaration__Alternatives : ( ( ( rule__Declaration__Group_0__0 ) ) | ( ( rule__Declaration__VarNameAssignment_1 ) ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:448:1: ( ( ( rule__Declaration__Group_0__0 ) ) | ( ( rule__Declaration__VarNameAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||(LA3_1>=22 && LA3_1<=23)) ) {
                    alt3=2;
                }
                else if ( (LA3_1==19||LA3_1==24) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:449:1: ( ( rule__Declaration__Group_0__0 ) )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:449:1: ( ( rule__Declaration__Group_0__0 ) )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:450:1: ( rule__Declaration__Group_0__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_0()); 
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:451:1: ( rule__Declaration__Group_0__0 )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:451:2: rule__Declaration__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Declaration__Group_0__0_in_rule__Declaration__Alternatives896);
                    rule__Declaration__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclarationAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:455:6: ( ( rule__Declaration__VarNameAssignment_1 ) )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:455:6: ( ( rule__Declaration__VarNameAssignment_1 ) )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:456:1: ( rule__Declaration__VarNameAssignment_1 )
                    {
                     before(grammarAccess.getDeclarationAccess().getVarNameAssignment_1()); 
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:457:1: ( rule__Declaration__VarNameAssignment_1 )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:457:2: rule__Declaration__VarNameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Declaration__VarNameAssignment_1_in_rule__Declaration__Alternatives914);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:466:1: rule__Primary__Alternatives : ( ( ruleAtomic ) | ( ruleQuantifier ) | ( ( rule__Primary__Group_2__0 ) ) | ( ruleBooleanLiteral ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:470:1: ( ( ruleAtomic ) | ( ruleQuantifier ) | ( ( rule__Primary__Group_2__0 ) ) | ( ruleBooleanLiteral ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case 13:
            case 14:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            case 15:
            case 16:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:471:1: ( ruleAtomic )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:471:1: ( ruleAtomic )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:472:1: ruleAtomic
                    {
                     before(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAtomic_in_rule__Primary__Alternatives947);
                    ruleAtomic();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:477:6: ( ruleQuantifier )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:477:6: ( ruleQuantifier )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:478:1: ruleQuantifier
                    {
                     before(grammarAccess.getPrimaryAccess().getQuantifierParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleQuantifier_in_rule__Primary__Alternatives964);
                    ruleQuantifier();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getQuantifierParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:483:6: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:483:6: ( ( rule__Primary__Group_2__0 ) )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:484:1: ( rule__Primary__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:485:1: ( rule__Primary__Group_2__0 )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:485:2: rule__Primary__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Primary__Group_2__0_in_rule__Primary__Alternatives981);
                    rule__Primary__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:489:6: ( ruleBooleanLiteral )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:489:6: ( ruleBooleanLiteral )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:490:1: ruleBooleanLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getBooleanLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_rule__Primary__Alternatives999);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:500:1: rule__Quantifier__QuantifierAlternatives_0_0 : ( ( 'forall' ) | ( 'exists' ) );
    public final void rule__Quantifier__QuantifierAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:504:1: ( ( 'forall' ) | ( 'exists' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:505:1: ( 'forall' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:505:1: ( 'forall' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:506:1: 'forall'
                    {
                     before(grammarAccess.getQuantifierAccess().getQuantifierForallKeyword_0_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__Quantifier__QuantifierAlternatives_0_01032); 
                     after(grammarAccess.getQuantifierAccess().getQuantifierForallKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:513:6: ( 'exists' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:513:6: ( 'exists' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:514:1: 'exists'
                    {
                     before(grammarAccess.getQuantifierAccess().getQuantifierExistsKeyword_0_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__Quantifier__QuantifierAlternatives_0_01052); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:526:1: rule__BooleanLiteral__ValueAlternatives_0 : ( ( 'TRUE' ) | ( 'FALSE' ) );
    public final void rule__BooleanLiteral__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:530:1: ( ( 'TRUE' ) | ( 'FALSE' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:531:1: ( 'TRUE' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:531:1: ( 'TRUE' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:532:1: 'TRUE'
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getValueTRUEKeyword_0_0()); 
                    match(input,15,FOLLOW_15_in_rule__BooleanLiteral__ValueAlternatives_01087); 
                     after(grammarAccess.getBooleanLiteralAccess().getValueTRUEKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:539:6: ( 'FALSE' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:539:6: ( 'FALSE' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:540:1: 'FALSE'
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getValueFALSEKeyword_0_1()); 
                    match(input,16,FOLLOW_16_in_rule__BooleanLiteral__ValueAlternatives_01107); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:554:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:558:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:559:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__01139);
            rule__Input__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__1_in_rule__Input__Group__01142);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:566:1: rule__Input__Group__0__Impl : ( 'Given' ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:570:1: ( ( 'Given' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:571:1: ( 'Given' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:571:1: ( 'Given' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:572:1: 'Given'
            {
             before(grammarAccess.getInputAccess().getGivenKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Input__Group__0__Impl1170); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:585:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:589:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:590:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__11201);
            rule__Input__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__2_in_rule__Input__Group__11204);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:597:1: rule__Input__Group__1__Impl : ( ( rule__Input__GivenAssignment_1 ) ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:601:1: ( ( ( rule__Input__GivenAssignment_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:602:1: ( ( rule__Input__GivenAssignment_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:602:1: ( ( rule__Input__GivenAssignment_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:603:1: ( rule__Input__GivenAssignment_1 )
            {
             before(grammarAccess.getInputAccess().getGivenAssignment_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:604:1: ( rule__Input__GivenAssignment_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:604:2: rule__Input__GivenAssignment_1
            {
            pushFollow(FOLLOW_rule__Input__GivenAssignment_1_in_rule__Input__Group__1__Impl1231);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:614:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:618:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:619:2: rule__Input__Group__2__Impl rule__Input__Group__3
            {
            pushFollow(FOLLOW_rule__Input__Group__2__Impl_in_rule__Input__Group__21261);
            rule__Input__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__3_in_rule__Input__Group__21264);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:626:1: rule__Input__Group__2__Impl : ( ';' ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:630:1: ( ( ';' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:631:1: ( ';' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:631:1: ( ';' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:632:1: ';'
            {
             before(grammarAccess.getInputAccess().getSemicolonKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Input__Group__2__Impl1292); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:645:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:649:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:650:2: rule__Input__Group__3__Impl rule__Input__Group__4
            {
            pushFollow(FOLLOW_rule__Input__Group__3__Impl_in_rule__Input__Group__31323);
            rule__Input__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__4_in_rule__Input__Group__31326);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:657:1: rule__Input__Group__3__Impl : ( ( rule__Input__Alternatives_3 ) ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:661:1: ( ( ( rule__Input__Alternatives_3 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:662:1: ( ( rule__Input__Alternatives_3 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:662:1: ( ( rule__Input__Alternatives_3 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:663:1: ( rule__Input__Alternatives_3 )
            {
             before(grammarAccess.getInputAccess().getAlternatives_3()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:664:1: ( rule__Input__Alternatives_3 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:664:2: rule__Input__Alternatives_3
            {
            pushFollow(FOLLOW_rule__Input__Alternatives_3_in_rule__Input__Group__3__Impl1353);
            rule__Input__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getAlternatives_3()); 

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:674:1: rule__Input__Group__4 : rule__Input__Group__4__Impl ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:678:1: ( rule__Input__Group__4__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:679:2: rule__Input__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group__4__Impl_in_rule__Input__Group__41383);
            rule__Input__Group__4__Impl();

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:685:1: rule__Input__Group__4__Impl : ( ( rule__Input__Group_4__0 )? ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:689:1: ( ( ( rule__Input__Group_4__0 )? ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:690:1: ( ( rule__Input__Group_4__0 )? )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:690:1: ( ( rule__Input__Group_4__0 )? )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:691:1: ( rule__Input__Group_4__0 )?
            {
             before(grammarAccess.getInputAccess().getGroup_4()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:692:1: ( rule__Input__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:692:2: rule__Input__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Input__Group_4__0_in_rule__Input__Group__4__Impl1410);
                    rule__Input__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputAccess().getGroup_4()); 

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


    // $ANTLR start "rule__Input__Group_3_0__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:712:1: rule__Input__Group_3_0__0 : rule__Input__Group_3_0__0__Impl rule__Input__Group_3_0__1 ;
    public final void rule__Input__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:716:1: ( rule__Input__Group_3_0__0__Impl rule__Input__Group_3_0__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:717:2: rule__Input__Group_3_0__0__Impl rule__Input__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__Input__Group_3_0__0__Impl_in_rule__Input__Group_3_0__01451);
            rule__Input__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group_3_0__1_in_rule__Input__Group_3_0__01454);
            rule__Input__Group_3_0__1();

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
    // $ANTLR end "rule__Input__Group_3_0__0"


    // $ANTLR start "rule__Input__Group_3_0__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:724:1: rule__Input__Group_3_0__0__Impl : ( ( rule__Input__TaskAssignment_3_0_0 ) ) ;
    public final void rule__Input__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:728:1: ( ( ( rule__Input__TaskAssignment_3_0_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:729:1: ( ( rule__Input__TaskAssignment_3_0_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:729:1: ( ( rule__Input__TaskAssignment_3_0_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:730:1: ( rule__Input__TaskAssignment_3_0_0 )
            {
             before(grammarAccess.getInputAccess().getTaskAssignment_3_0_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:731:1: ( rule__Input__TaskAssignment_3_0_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:731:2: rule__Input__TaskAssignment_3_0_0
            {
            pushFollow(FOLLOW_rule__Input__TaskAssignment_3_0_0_in_rule__Input__Group_3_0__0__Impl1481);
            rule__Input__TaskAssignment_3_0_0();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getTaskAssignment_3_0_0()); 

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
    // $ANTLR end "rule__Input__Group_3_0__0__Impl"


    // $ANTLR start "rule__Input__Group_3_0__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:741:1: rule__Input__Group_3_0__1 : rule__Input__Group_3_0__1__Impl ;
    public final void rule__Input__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:745:1: ( rule__Input__Group_3_0__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:746:2: rule__Input__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group_3_0__1__Impl_in_rule__Input__Group_3_0__11511);
            rule__Input__Group_3_0__1__Impl();

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
    // $ANTLR end "rule__Input__Group_3_0__1"


    // $ANTLR start "rule__Input__Group_3_0__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:752:1: rule__Input__Group_3_0__1__Impl : ( ( rule__Input__GoalAssignment_3_0_1 ) ) ;
    public final void rule__Input__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:756:1: ( ( ( rule__Input__GoalAssignment_3_0_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:757:1: ( ( rule__Input__GoalAssignment_3_0_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:757:1: ( ( rule__Input__GoalAssignment_3_0_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:758:1: ( rule__Input__GoalAssignment_3_0_1 )
            {
             before(grammarAccess.getInputAccess().getGoalAssignment_3_0_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:759:1: ( rule__Input__GoalAssignment_3_0_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:759:2: rule__Input__GoalAssignment_3_0_1
            {
            pushFollow(FOLLOW_rule__Input__GoalAssignment_3_0_1_in_rule__Input__Group_3_0__1__Impl1538);
            rule__Input__GoalAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getGoalAssignment_3_0_1()); 

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
    // $ANTLR end "rule__Input__Group_3_0__1__Impl"


    // $ANTLR start "rule__Input__Group_3_1__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:773:1: rule__Input__Group_3_1__0 : rule__Input__Group_3_1__0__Impl rule__Input__Group_3_1__1 ;
    public final void rule__Input__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:777:1: ( rule__Input__Group_3_1__0__Impl rule__Input__Group_3_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:778:2: rule__Input__Group_3_1__0__Impl rule__Input__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Input__Group_3_1__0__Impl_in_rule__Input__Group_3_1__01572);
            rule__Input__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group_3_1__1_in_rule__Input__Group_3_1__01575);
            rule__Input__Group_3_1__1();

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
    // $ANTLR end "rule__Input__Group_3_1__0"


    // $ANTLR start "rule__Input__Group_3_1__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:785:1: rule__Input__Group_3_1__0__Impl : ( ( rule__Input__TaskAssignment_3_1_0 ) ) ;
    public final void rule__Input__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:789:1: ( ( ( rule__Input__TaskAssignment_3_1_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:790:1: ( ( rule__Input__TaskAssignment_3_1_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:790:1: ( ( rule__Input__TaskAssignment_3_1_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:791:1: ( rule__Input__TaskAssignment_3_1_0 )
            {
             before(grammarAccess.getInputAccess().getTaskAssignment_3_1_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:792:1: ( rule__Input__TaskAssignment_3_1_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:792:2: rule__Input__TaskAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__Input__TaskAssignment_3_1_0_in_rule__Input__Group_3_1__0__Impl1602);
            rule__Input__TaskAssignment_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getTaskAssignment_3_1_0()); 

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
    // $ANTLR end "rule__Input__Group_3_1__0__Impl"


    // $ANTLR start "rule__Input__Group_3_1__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:802:1: rule__Input__Group_3_1__1 : rule__Input__Group_3_1__1__Impl rule__Input__Group_3_1__2 ;
    public final void rule__Input__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:806:1: ( rule__Input__Group_3_1__1__Impl rule__Input__Group_3_1__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:807:2: rule__Input__Group_3_1__1__Impl rule__Input__Group_3_1__2
            {
            pushFollow(FOLLOW_rule__Input__Group_3_1__1__Impl_in_rule__Input__Group_3_1__11632);
            rule__Input__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group_3_1__2_in_rule__Input__Group_3_1__11635);
            rule__Input__Group_3_1__2();

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
    // $ANTLR end "rule__Input__Group_3_1__1"


    // $ANTLR start "rule__Input__Group_3_1__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:814:1: rule__Input__Group_3_1__1__Impl : ( '(' ) ;
    public final void rule__Input__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:818:1: ( ( '(' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:819:1: ( '(' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:819:1: ( '(' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:820:1: '('
            {
             before(grammarAccess.getInputAccess().getLeftParenthesisKeyword_3_1_1()); 
            match(input,19,FOLLOW_19_in_rule__Input__Group_3_1__1__Impl1663); 
             after(grammarAccess.getInputAccess().getLeftParenthesisKeyword_3_1_1()); 

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
    // $ANTLR end "rule__Input__Group_3_1__1__Impl"


    // $ANTLR start "rule__Input__Group_3_1__2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:833:1: rule__Input__Group_3_1__2 : rule__Input__Group_3_1__2__Impl rule__Input__Group_3_1__3 ;
    public final void rule__Input__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:837:1: ( rule__Input__Group_3_1__2__Impl rule__Input__Group_3_1__3 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:838:2: rule__Input__Group_3_1__2__Impl rule__Input__Group_3_1__3
            {
            pushFollow(FOLLOW_rule__Input__Group_3_1__2__Impl_in_rule__Input__Group_3_1__21694);
            rule__Input__Group_3_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group_3_1__3_in_rule__Input__Group_3_1__21697);
            rule__Input__Group_3_1__3();

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
    // $ANTLR end "rule__Input__Group_3_1__2"


    // $ANTLR start "rule__Input__Group_3_1__2__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:845:1: rule__Input__Group_3_1__2__Impl : ( ( rule__Input__GoalAssignment_3_1_2 ) ) ;
    public final void rule__Input__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:849:1: ( ( ( rule__Input__GoalAssignment_3_1_2 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:850:1: ( ( rule__Input__GoalAssignment_3_1_2 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:850:1: ( ( rule__Input__GoalAssignment_3_1_2 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:851:1: ( rule__Input__GoalAssignment_3_1_2 )
            {
             before(grammarAccess.getInputAccess().getGoalAssignment_3_1_2()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:852:1: ( rule__Input__GoalAssignment_3_1_2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:852:2: rule__Input__GoalAssignment_3_1_2
            {
            pushFollow(FOLLOW_rule__Input__GoalAssignment_3_1_2_in_rule__Input__Group_3_1__2__Impl1724);
            rule__Input__GoalAssignment_3_1_2();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getGoalAssignment_3_1_2()); 

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
    // $ANTLR end "rule__Input__Group_3_1__2__Impl"


    // $ANTLR start "rule__Input__Group_3_1__3"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:862:1: rule__Input__Group_3_1__3 : rule__Input__Group_3_1__3__Impl ;
    public final void rule__Input__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:866:1: ( rule__Input__Group_3_1__3__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:867:2: rule__Input__Group_3_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group_3_1__3__Impl_in_rule__Input__Group_3_1__31754);
            rule__Input__Group_3_1__3__Impl();

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
    // $ANTLR end "rule__Input__Group_3_1__3"


    // $ANTLR start "rule__Input__Group_3_1__3__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:873:1: rule__Input__Group_3_1__3__Impl : ( ')' ) ;
    public final void rule__Input__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:877:1: ( ( ')' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:878:1: ( ')' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:878:1: ( ')' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:879:1: ')'
            {
             before(grammarAccess.getInputAccess().getRightParenthesisKeyword_3_1_3()); 
            match(input,20,FOLLOW_20_in_rule__Input__Group_3_1__3__Impl1782); 
             after(grammarAccess.getInputAccess().getRightParenthesisKeyword_3_1_3()); 

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
    // $ANTLR end "rule__Input__Group_3_1__3__Impl"


    // $ANTLR start "rule__Input__Group_4__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:900:1: rule__Input__Group_4__0 : rule__Input__Group_4__0__Impl rule__Input__Group_4__1 ;
    public final void rule__Input__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:904:1: ( rule__Input__Group_4__0__Impl rule__Input__Group_4__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:905:2: rule__Input__Group_4__0__Impl rule__Input__Group_4__1
            {
            pushFollow(FOLLOW_rule__Input__Group_4__0__Impl_in_rule__Input__Group_4__01821);
            rule__Input__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group_4__1_in_rule__Input__Group_4__01824);
            rule__Input__Group_4__1();

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
    // $ANTLR end "rule__Input__Group_4__0"


    // $ANTLR start "rule__Input__Group_4__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:912:1: rule__Input__Group_4__0__Impl : ( ';' ) ;
    public final void rule__Input__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:916:1: ( ( ';' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:917:1: ( ';' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:917:1: ( ';' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:918:1: ';'
            {
             before(grammarAccess.getInputAccess().getSemicolonKeyword_4_0()); 
            match(input,18,FOLLOW_18_in_rule__Input__Group_4__0__Impl1852); 
             after(grammarAccess.getInputAccess().getSemicolonKeyword_4_0()); 

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
    // $ANTLR end "rule__Input__Group_4__0__Impl"


    // $ANTLR start "rule__Input__Group_4__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:931:1: rule__Input__Group_4__1 : rule__Input__Group_4__1__Impl rule__Input__Group_4__2 ;
    public final void rule__Input__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:935:1: ( rule__Input__Group_4__1__Impl rule__Input__Group_4__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:936:2: rule__Input__Group_4__1__Impl rule__Input__Group_4__2
            {
            pushFollow(FOLLOW_rule__Input__Group_4__1__Impl_in_rule__Input__Group_4__11883);
            rule__Input__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group_4__2_in_rule__Input__Group_4__11886);
            rule__Input__Group_4__2();

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
    // $ANTLR end "rule__Input__Group_4__1"


    // $ANTLR start "rule__Input__Group_4__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:943:1: rule__Input__Group_4__1__Impl : ( 'Theorems:' ) ;
    public final void rule__Input__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:947:1: ( ( 'Theorems:' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:948:1: ( 'Theorems:' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:948:1: ( 'Theorems:' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:949:1: 'Theorems:'
            {
             before(grammarAccess.getInputAccess().getTheoremsKeyword_4_1()); 
            match(input,21,FOLLOW_21_in_rule__Input__Group_4__1__Impl1914); 
             after(grammarAccess.getInputAccess().getTheoremsKeyword_4_1()); 

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
    // $ANTLR end "rule__Input__Group_4__1__Impl"


    // $ANTLR start "rule__Input__Group_4__2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:962:1: rule__Input__Group_4__2 : rule__Input__Group_4__2__Impl rule__Input__Group_4__3 ;
    public final void rule__Input__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:966:1: ( rule__Input__Group_4__2__Impl rule__Input__Group_4__3 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:967:2: rule__Input__Group_4__2__Impl rule__Input__Group_4__3
            {
            pushFollow(FOLLOW_rule__Input__Group_4__2__Impl_in_rule__Input__Group_4__21945);
            rule__Input__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group_4__3_in_rule__Input__Group_4__21948);
            rule__Input__Group_4__3();

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
    // $ANTLR end "rule__Input__Group_4__2"


    // $ANTLR start "rule__Input__Group_4__2__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:974:1: rule__Input__Group_4__2__Impl : ( ( rule__Input__TheoremsAssignment_4_2 ) ) ;
    public final void rule__Input__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:978:1: ( ( ( rule__Input__TheoremsAssignment_4_2 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:979:1: ( ( rule__Input__TheoremsAssignment_4_2 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:979:1: ( ( rule__Input__TheoremsAssignment_4_2 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:980:1: ( rule__Input__TheoremsAssignment_4_2 )
            {
             before(grammarAccess.getInputAccess().getTheoremsAssignment_4_2()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:981:1: ( rule__Input__TheoremsAssignment_4_2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:981:2: rule__Input__TheoremsAssignment_4_2
            {
            pushFollow(FOLLOW_rule__Input__TheoremsAssignment_4_2_in_rule__Input__Group_4__2__Impl1975);
            rule__Input__TheoremsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getTheoremsAssignment_4_2()); 

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
    // $ANTLR end "rule__Input__Group_4__2__Impl"


    // $ANTLR start "rule__Input__Group_4__3"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:991:1: rule__Input__Group_4__3 : rule__Input__Group_4__3__Impl rule__Input__Group_4__4 ;
    public final void rule__Input__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:995:1: ( rule__Input__Group_4__3__Impl rule__Input__Group_4__4 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:996:2: rule__Input__Group_4__3__Impl rule__Input__Group_4__4
            {
            pushFollow(FOLLOW_rule__Input__Group_4__3__Impl_in_rule__Input__Group_4__32005);
            rule__Input__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group_4__4_in_rule__Input__Group_4__32008);
            rule__Input__Group_4__4();

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
    // $ANTLR end "rule__Input__Group_4__3"


    // $ANTLR start "rule__Input__Group_4__3__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1003:1: rule__Input__Group_4__3__Impl : ( ( rule__Input__Group_4_3__0 )* ) ;
    public final void rule__Input__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1007:1: ( ( ( rule__Input__Group_4_3__0 )* ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1008:1: ( ( rule__Input__Group_4_3__0 )* )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1008:1: ( ( rule__Input__Group_4_3__0 )* )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1009:1: ( rule__Input__Group_4_3__0 )*
            {
             before(grammarAccess.getInputAccess().getGroup_4_3()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1010:1: ( rule__Input__Group_4_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==RULE_ID||(LA8_1>=13 && LA8_1<=16)||LA8_1==19) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1010:2: rule__Input__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Input__Group_4_3__0_in_rule__Input__Group_4__3__Impl2035);
            	    rule__Input__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getInputAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Input__Group_4__3__Impl"


    // $ANTLR start "rule__Input__Group_4__4"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1020:1: rule__Input__Group_4__4 : rule__Input__Group_4__4__Impl ;
    public final void rule__Input__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1024:1: ( rule__Input__Group_4__4__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1025:2: rule__Input__Group_4__4__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group_4__4__Impl_in_rule__Input__Group_4__42066);
            rule__Input__Group_4__4__Impl();

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
    // $ANTLR end "rule__Input__Group_4__4"


    // $ANTLR start "rule__Input__Group_4__4__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1031:1: rule__Input__Group_4__4__Impl : ( ( ';' )? ) ;
    public final void rule__Input__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1035:1: ( ( ( ';' )? ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1036:1: ( ( ';' )? )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1036:1: ( ( ';' )? )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1037:1: ( ';' )?
            {
             before(grammarAccess.getInputAccess().getSemicolonKeyword_4_4()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1038:1: ( ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1039:2: ';'
                    {
                    match(input,18,FOLLOW_18_in_rule__Input__Group_4__4__Impl2095); 

                    }
                    break;

            }

             after(grammarAccess.getInputAccess().getSemicolonKeyword_4_4()); 

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
    // $ANTLR end "rule__Input__Group_4__4__Impl"


    // $ANTLR start "rule__Input__Group_4_3__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1060:1: rule__Input__Group_4_3__0 : rule__Input__Group_4_3__0__Impl rule__Input__Group_4_3__1 ;
    public final void rule__Input__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1064:1: ( rule__Input__Group_4_3__0__Impl rule__Input__Group_4_3__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1065:2: rule__Input__Group_4_3__0__Impl rule__Input__Group_4_3__1
            {
            pushFollow(FOLLOW_rule__Input__Group_4_3__0__Impl_in_rule__Input__Group_4_3__02138);
            rule__Input__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group_4_3__1_in_rule__Input__Group_4_3__02141);
            rule__Input__Group_4_3__1();

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
    // $ANTLR end "rule__Input__Group_4_3__0"


    // $ANTLR start "rule__Input__Group_4_3__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1072:1: rule__Input__Group_4_3__0__Impl : ( ';' ) ;
    public final void rule__Input__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1076:1: ( ( ';' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1077:1: ( ';' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1077:1: ( ';' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1078:1: ';'
            {
             before(grammarAccess.getInputAccess().getSemicolonKeyword_4_3_0()); 
            match(input,18,FOLLOW_18_in_rule__Input__Group_4_3__0__Impl2169); 
             after(grammarAccess.getInputAccess().getSemicolonKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Input__Group_4_3__0__Impl"


    // $ANTLR start "rule__Input__Group_4_3__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1091:1: rule__Input__Group_4_3__1 : rule__Input__Group_4_3__1__Impl ;
    public final void rule__Input__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1095:1: ( rule__Input__Group_4_3__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1096:2: rule__Input__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group_4_3__1__Impl_in_rule__Input__Group_4_3__12200);
            rule__Input__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Input__Group_4_3__1"


    // $ANTLR start "rule__Input__Group_4_3__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1102:1: rule__Input__Group_4_3__1__Impl : ( ( rule__Input__TheoremsAssignment_4_3_1 ) ) ;
    public final void rule__Input__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1106:1: ( ( ( rule__Input__TheoremsAssignment_4_3_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1107:1: ( ( rule__Input__TheoremsAssignment_4_3_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1107:1: ( ( rule__Input__TheoremsAssignment_4_3_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1108:1: ( rule__Input__TheoremsAssignment_4_3_1 )
            {
             before(grammarAccess.getInputAccess().getTheoremsAssignment_4_3_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1109:1: ( rule__Input__TheoremsAssignment_4_3_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1109:2: rule__Input__TheoremsAssignment_4_3_1
            {
            pushFollow(FOLLOW_rule__Input__TheoremsAssignment_4_3_1_in_rule__Input__Group_4_3__1__Impl2227);
            rule__Input__TheoremsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getTheoremsAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Input__Group_4_3__1__Impl"


    // $ANTLR start "rule__Problem__Group__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1123:1: rule__Problem__Group__0 : rule__Problem__Group__0__Impl rule__Problem__Group__1 ;
    public final void rule__Problem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1127:1: ( rule__Problem__Group__0__Impl rule__Problem__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1128:2: rule__Problem__Group__0__Impl rule__Problem__Group__1
            {
            pushFollow(FOLLOW_rule__Problem__Group__0__Impl_in_rule__Problem__Group__02261);
            rule__Problem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Problem__Group__1_in_rule__Problem__Group__02264);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1135:1: rule__Problem__Group__0__Impl : ( ( rule__Problem__VarsAssignment_0 ) ) ;
    public final void rule__Problem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1139:1: ( ( ( rule__Problem__VarsAssignment_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1140:1: ( ( rule__Problem__VarsAssignment_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1140:1: ( ( rule__Problem__VarsAssignment_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1141:1: ( rule__Problem__VarsAssignment_0 )
            {
             before(grammarAccess.getProblemAccess().getVarsAssignment_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1142:1: ( rule__Problem__VarsAssignment_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1142:2: rule__Problem__VarsAssignment_0
            {
            pushFollow(FOLLOW_rule__Problem__VarsAssignment_0_in_rule__Problem__Group__0__Impl2291);
            rule__Problem__VarsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProblemAccess().getVarsAssignment_0()); 

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1152:1: rule__Problem__Group__1 : rule__Problem__Group__1__Impl rule__Problem__Group__2 ;
    public final void rule__Problem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1156:1: ( rule__Problem__Group__1__Impl rule__Problem__Group__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1157:2: rule__Problem__Group__1__Impl rule__Problem__Group__2
            {
            pushFollow(FOLLOW_rule__Problem__Group__1__Impl_in_rule__Problem__Group__12321);
            rule__Problem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Problem__Group__2_in_rule__Problem__Group__12324);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1164:1: rule__Problem__Group__1__Impl : ( ( rule__Problem__Group_1__0 )* ) ;
    public final void rule__Problem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1168:1: ( ( ( rule__Problem__Group_1__0 )* ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1169:1: ( ( rule__Problem__Group_1__0 )* )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1169:1: ( ( rule__Problem__Group_1__0 )* )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1170:1: ( rule__Problem__Group_1__0 )*
            {
             before(grammarAccess.getProblemAccess().getGroup_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1171:1: ( rule__Problem__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1171:2: rule__Problem__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Problem__Group_1__0_in_rule__Problem__Group__1__Impl2351);
            	    rule__Problem__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getProblemAccess().getGroup_1()); 

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1181:1: rule__Problem__Group__2 : rule__Problem__Group__2__Impl rule__Problem__Group__3 ;
    public final void rule__Problem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1185:1: ( rule__Problem__Group__2__Impl rule__Problem__Group__3 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1186:2: rule__Problem__Group__2__Impl rule__Problem__Group__3
            {
            pushFollow(FOLLOW_rule__Problem__Group__2__Impl_in_rule__Problem__Group__22382);
            rule__Problem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Problem__Group__3_in_rule__Problem__Group__22385);
            rule__Problem__Group__3();

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1193:1: rule__Problem__Group__2__Impl : ( 'st' ) ;
    public final void rule__Problem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1197:1: ( ( 'st' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1198:1: ( 'st' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1198:1: ( 'st' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1199:1: 'st'
            {
             before(grammarAccess.getProblemAccess().getStKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__Problem__Group__2__Impl2413); 
             after(grammarAccess.getProblemAccess().getStKeyword_2()); 

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


    // $ANTLR start "rule__Problem__Group__3"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1212:1: rule__Problem__Group__3 : rule__Problem__Group__3__Impl ;
    public final void rule__Problem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1216:1: ( rule__Problem__Group__3__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1217:2: rule__Problem__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Problem__Group__3__Impl_in_rule__Problem__Group__32444);
            rule__Problem__Group__3__Impl();

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
    // $ANTLR end "rule__Problem__Group__3"


    // $ANTLR start "rule__Problem__Group__3__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1223:1: rule__Problem__Group__3__Impl : ( ( rule__Problem__PropertyAssignment_3 ) ) ;
    public final void rule__Problem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1227:1: ( ( ( rule__Problem__PropertyAssignment_3 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1228:1: ( ( rule__Problem__PropertyAssignment_3 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1228:1: ( ( rule__Problem__PropertyAssignment_3 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1229:1: ( rule__Problem__PropertyAssignment_3 )
            {
             before(grammarAccess.getProblemAccess().getPropertyAssignment_3()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1230:1: ( rule__Problem__PropertyAssignment_3 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1230:2: rule__Problem__PropertyAssignment_3
            {
            pushFollow(FOLLOW_rule__Problem__PropertyAssignment_3_in_rule__Problem__Group__3__Impl2471);
            rule__Problem__PropertyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProblemAccess().getPropertyAssignment_3()); 

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
    // $ANTLR end "rule__Problem__Group__3__Impl"


    // $ANTLR start "rule__Problem__Group_1__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1248:1: rule__Problem__Group_1__0 : rule__Problem__Group_1__0__Impl rule__Problem__Group_1__1 ;
    public final void rule__Problem__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1252:1: ( rule__Problem__Group_1__0__Impl rule__Problem__Group_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1253:2: rule__Problem__Group_1__0__Impl rule__Problem__Group_1__1
            {
            pushFollow(FOLLOW_rule__Problem__Group_1__0__Impl_in_rule__Problem__Group_1__02509);
            rule__Problem__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Problem__Group_1__1_in_rule__Problem__Group_1__02512);
            rule__Problem__Group_1__1();

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
    // $ANTLR end "rule__Problem__Group_1__0"


    // $ANTLR start "rule__Problem__Group_1__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1260:1: rule__Problem__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Problem__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1264:1: ( ( ',' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1265:1: ( ',' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1265:1: ( ',' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1266:1: ','
            {
             before(grammarAccess.getProblemAccess().getCommaKeyword_1_0()); 
            match(input,23,FOLLOW_23_in_rule__Problem__Group_1__0__Impl2540); 
             after(grammarAccess.getProblemAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__Problem__Group_1__0__Impl"


    // $ANTLR start "rule__Problem__Group_1__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1279:1: rule__Problem__Group_1__1 : rule__Problem__Group_1__1__Impl ;
    public final void rule__Problem__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1283:1: ( rule__Problem__Group_1__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1284:2: rule__Problem__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Problem__Group_1__1__Impl_in_rule__Problem__Group_1__12571);
            rule__Problem__Group_1__1__Impl();

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
    // $ANTLR end "rule__Problem__Group_1__1"


    // $ANTLR start "rule__Problem__Group_1__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1290:1: rule__Problem__Group_1__1__Impl : ( ( rule__Problem__VarsAssignment_1_1 ) ) ;
    public final void rule__Problem__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1294:1: ( ( ( rule__Problem__VarsAssignment_1_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1295:1: ( ( rule__Problem__VarsAssignment_1_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1295:1: ( ( rule__Problem__VarsAssignment_1_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1296:1: ( rule__Problem__VarsAssignment_1_1 )
            {
             before(grammarAccess.getProblemAccess().getVarsAssignment_1_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1297:1: ( rule__Problem__VarsAssignment_1_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1297:2: rule__Problem__VarsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Problem__VarsAssignment_1_1_in_rule__Problem__Group_1__1__Impl2598);
            rule__Problem__VarsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getProblemAccess().getVarsAssignment_1_1()); 

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
    // $ANTLR end "rule__Problem__Group_1__1__Impl"


    // $ANTLR start "rule__Declaration__Group_0__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1311:1: rule__Declaration__Group_0__0 : rule__Declaration__Group_0__0__Impl rule__Declaration__Group_0__1 ;
    public final void rule__Declaration__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1315:1: ( rule__Declaration__Group_0__0__Impl rule__Declaration__Group_0__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1316:2: rule__Declaration__Group_0__0__Impl rule__Declaration__Group_0__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group_0__0__Impl_in_rule__Declaration__Group_0__02632);
            rule__Declaration__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group_0__1_in_rule__Declaration__Group_0__02635);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1323:1: rule__Declaration__Group_0__0__Impl : ( ( rule__Declaration__TypeAssignment_0_0 ) ) ;
    public final void rule__Declaration__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1327:1: ( ( ( rule__Declaration__TypeAssignment_0_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1328:1: ( ( rule__Declaration__TypeAssignment_0_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1328:1: ( ( rule__Declaration__TypeAssignment_0_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1329:1: ( rule__Declaration__TypeAssignment_0_0 )
            {
             before(grammarAccess.getDeclarationAccess().getTypeAssignment_0_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1330:1: ( rule__Declaration__TypeAssignment_0_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1330:2: rule__Declaration__TypeAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Declaration__TypeAssignment_0_0_in_rule__Declaration__Group_0__0__Impl2662);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1340:1: rule__Declaration__Group_0__1 : rule__Declaration__Group_0__1__Impl rule__Declaration__Group_0__2 ;
    public final void rule__Declaration__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1344:1: ( rule__Declaration__Group_0__1__Impl rule__Declaration__Group_0__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1345:2: rule__Declaration__Group_0__1__Impl rule__Declaration__Group_0__2
            {
            pushFollow(FOLLOW_rule__Declaration__Group_0__1__Impl_in_rule__Declaration__Group_0__12692);
            rule__Declaration__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group_0__2_in_rule__Declaration__Group_0__12695);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1352:1: rule__Declaration__Group_0__1__Impl : ( '(' ) ;
    public final void rule__Declaration__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1356:1: ( ( '(' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1357:1: ( '(' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1357:1: ( '(' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1358:1: '('
            {
             before(grammarAccess.getDeclarationAccess().getLeftParenthesisKeyword_0_1()); 
            match(input,19,FOLLOW_19_in_rule__Declaration__Group_0__1__Impl2723); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1371:1: rule__Declaration__Group_0__2 : rule__Declaration__Group_0__2__Impl rule__Declaration__Group_0__3 ;
    public final void rule__Declaration__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1375:1: ( rule__Declaration__Group_0__2__Impl rule__Declaration__Group_0__3 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1376:2: rule__Declaration__Group_0__2__Impl rule__Declaration__Group_0__3
            {
            pushFollow(FOLLOW_rule__Declaration__Group_0__2__Impl_in_rule__Declaration__Group_0__22754);
            rule__Declaration__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group_0__3_in_rule__Declaration__Group_0__22757);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1383:1: rule__Declaration__Group_0__2__Impl : ( ( rule__Declaration__VarNameAssignment_0_2 ) ) ;
    public final void rule__Declaration__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1387:1: ( ( ( rule__Declaration__VarNameAssignment_0_2 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1388:1: ( ( rule__Declaration__VarNameAssignment_0_2 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1388:1: ( ( rule__Declaration__VarNameAssignment_0_2 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1389:1: ( rule__Declaration__VarNameAssignment_0_2 )
            {
             before(grammarAccess.getDeclarationAccess().getVarNameAssignment_0_2()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1390:1: ( rule__Declaration__VarNameAssignment_0_2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1390:2: rule__Declaration__VarNameAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Declaration__VarNameAssignment_0_2_in_rule__Declaration__Group_0__2__Impl2784);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1400:1: rule__Declaration__Group_0__3 : rule__Declaration__Group_0__3__Impl ;
    public final void rule__Declaration__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1404:1: ( rule__Declaration__Group_0__3__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1405:2: rule__Declaration__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group_0__3__Impl_in_rule__Declaration__Group_0__32814);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1411:1: rule__Declaration__Group_0__3__Impl : ( ')' ) ;
    public final void rule__Declaration__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1415:1: ( ( ')' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1416:1: ( ')' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1416:1: ( ')' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1417:1: ')'
            {
             before(grammarAccess.getDeclarationAccess().getRightParenthesisKeyword_0_3()); 
            match(input,20,FOLLOW_20_in_rule__Declaration__Group_0__3__Impl2842); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1438:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1442:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1443:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__02881);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group__1_in_rule__Type__Group__02884);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1450:1: rule__Type__Group__0__Impl : ( ( rule__Type__NameAssignment_0 ) ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1454:1: ( ( ( rule__Type__NameAssignment_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1455:1: ( ( rule__Type__NameAssignment_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1455:1: ( ( rule__Type__NameAssignment_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1456:1: ( rule__Type__NameAssignment_0 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1457:1: ( rule__Type__NameAssignment_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1457:2: rule__Type__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Type__NameAssignment_0_in_rule__Type__Group__0__Impl2911);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1467:1: rule__Type__Group__1 : rule__Type__Group__1__Impl ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1471:1: ( rule__Type__Group__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1472:2: rule__Type__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__12941);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1478:1: rule__Type__Group__1__Impl : ( ( rule__Type__Group_1__0 )? ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1482:1: ( ( ( rule__Type__Group_1__0 )? ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1483:1: ( ( rule__Type__Group_1__0 )? )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1483:1: ( ( rule__Type__Group_1__0 )? )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1484:1: ( rule__Type__Group_1__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1485:1: ( rule__Type__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1485:2: rule__Type__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_1__0_in_rule__Type__Group__1__Impl2968);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1499:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1503:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1504:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
            {
            pushFollow(FOLLOW_rule__Type__Group_1__0__Impl_in_rule__Type__Group_1__03003);
            rule__Type__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_1__1_in_rule__Type__Group_1__03006);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1511:1: rule__Type__Group_1__0__Impl : ( '<' ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1515:1: ( ( '<' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1516:1: ( '<' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1516:1: ( '<' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1517:1: '<'
            {
             before(grammarAccess.getTypeAccess().getLessThanSignKeyword_1_0()); 
            match(input,24,FOLLOW_24_in_rule__Type__Group_1__0__Impl3034); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1530:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl rule__Type__Group_1__2 ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1534:1: ( rule__Type__Group_1__1__Impl rule__Type__Group_1__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1535:2: rule__Type__Group_1__1__Impl rule__Type__Group_1__2
            {
            pushFollow(FOLLOW_rule__Type__Group_1__1__Impl_in_rule__Type__Group_1__13065);
            rule__Type__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_1__2_in_rule__Type__Group_1__13068);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1542:1: rule__Type__Group_1__1__Impl : ( ( rule__Type__TemplateTypeAssignment_1_1 ) ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1546:1: ( ( ( rule__Type__TemplateTypeAssignment_1_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1547:1: ( ( rule__Type__TemplateTypeAssignment_1_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1547:1: ( ( rule__Type__TemplateTypeAssignment_1_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1548:1: ( rule__Type__TemplateTypeAssignment_1_1 )
            {
             before(grammarAccess.getTypeAccess().getTemplateTypeAssignment_1_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1549:1: ( rule__Type__TemplateTypeAssignment_1_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1549:2: rule__Type__TemplateTypeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Type__TemplateTypeAssignment_1_1_in_rule__Type__Group_1__1__Impl3095);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1559:1: rule__Type__Group_1__2 : rule__Type__Group_1__2__Impl ;
    public final void rule__Type__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1563:1: ( rule__Type__Group_1__2__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1564:2: rule__Type__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_1__2__Impl_in_rule__Type__Group_1__23125);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1570:1: rule__Type__Group_1__2__Impl : ( '>' ) ;
    public final void rule__Type__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1574:1: ( ( '>' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1575:1: ( '>' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1575:1: ( '>' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1576:1: '>'
            {
             before(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_1_2()); 
            match(input,25,FOLLOW_25_in_rule__Type__Group_1__2__Impl3153); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1595:1: rule__ORing__Group__0 : rule__ORing__Group__0__Impl rule__ORing__Group__1 ;
    public final void rule__ORing__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1599:1: ( rule__ORing__Group__0__Impl rule__ORing__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1600:2: rule__ORing__Group__0__Impl rule__ORing__Group__1
            {
            pushFollow(FOLLOW_rule__ORing__Group__0__Impl_in_rule__ORing__Group__03190);
            rule__ORing__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ORing__Group__1_in_rule__ORing__Group__03193);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1607:1: rule__ORing__Group__0__Impl : ( ruleANDing ) ;
    public final void rule__ORing__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1611:1: ( ( ruleANDing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1612:1: ( ruleANDing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1612:1: ( ruleANDing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1613:1: ruleANDing
            {
             before(grammarAccess.getORingAccess().getANDingParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleANDing_in_rule__ORing__Group__0__Impl3220);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1624:1: rule__ORing__Group__1 : rule__ORing__Group__1__Impl ;
    public final void rule__ORing__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1628:1: ( rule__ORing__Group__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1629:2: rule__ORing__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ORing__Group__1__Impl_in_rule__ORing__Group__13249);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1635:1: rule__ORing__Group__1__Impl : ( ( rule__ORing__Group_1__0 )* ) ;
    public final void rule__ORing__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1639:1: ( ( ( rule__ORing__Group_1__0 )* ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1640:1: ( ( rule__ORing__Group_1__0 )* )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1640:1: ( ( rule__ORing__Group_1__0 )* )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1641:1: ( rule__ORing__Group_1__0 )*
            {
             before(grammarAccess.getORingAccess().getGroup_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1642:1: ( rule__ORing__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1642:2: rule__ORing__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ORing__Group_1__0_in_rule__ORing__Group__1__Impl3276);
            	    rule__ORing__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1656:1: rule__ORing__Group_1__0 : rule__ORing__Group_1__0__Impl rule__ORing__Group_1__1 ;
    public final void rule__ORing__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1660:1: ( rule__ORing__Group_1__0__Impl rule__ORing__Group_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1661:2: rule__ORing__Group_1__0__Impl rule__ORing__Group_1__1
            {
            pushFollow(FOLLOW_rule__ORing__Group_1__0__Impl_in_rule__ORing__Group_1__03311);
            rule__ORing__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ORing__Group_1__1_in_rule__ORing__Group_1__03314);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1668:1: rule__ORing__Group_1__0__Impl : ( () ) ;
    public final void rule__ORing__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1672:1: ( ( () ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1673:1: ( () )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1673:1: ( () )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1674:1: ()
            {
             before(grammarAccess.getORingAccess().getORingLeftAction_1_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1675:1: ()
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1677:1: 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1687:1: rule__ORing__Group_1__1 : rule__ORing__Group_1__1__Impl rule__ORing__Group_1__2 ;
    public final void rule__ORing__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1691:1: ( rule__ORing__Group_1__1__Impl rule__ORing__Group_1__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1692:2: rule__ORing__Group_1__1__Impl rule__ORing__Group_1__2
            {
            pushFollow(FOLLOW_rule__ORing__Group_1__1__Impl_in_rule__ORing__Group_1__13372);
            rule__ORing__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ORing__Group_1__2_in_rule__ORing__Group_1__13375);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1699:1: rule__ORing__Group_1__1__Impl : ( '|' ) ;
    public final void rule__ORing__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1703:1: ( ( '|' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1704:1: ( '|' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1704:1: ( '|' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1705:1: '|'
            {
             before(grammarAccess.getORingAccess().getVerticalLineKeyword_1_1()); 
            match(input,26,FOLLOW_26_in_rule__ORing__Group_1__1__Impl3403); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1718:1: rule__ORing__Group_1__2 : rule__ORing__Group_1__2__Impl ;
    public final void rule__ORing__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1722:1: ( rule__ORing__Group_1__2__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1723:2: rule__ORing__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ORing__Group_1__2__Impl_in_rule__ORing__Group_1__23434);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1729:1: rule__ORing__Group_1__2__Impl : ( ( rule__ORing__RightAssignment_1_2 ) ) ;
    public final void rule__ORing__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1733:1: ( ( ( rule__ORing__RightAssignment_1_2 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1734:1: ( ( rule__ORing__RightAssignment_1_2 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1734:1: ( ( rule__ORing__RightAssignment_1_2 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1735:1: ( rule__ORing__RightAssignment_1_2 )
            {
             before(grammarAccess.getORingAccess().getRightAssignment_1_2()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1736:1: ( rule__ORing__RightAssignment_1_2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1736:2: rule__ORing__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ORing__RightAssignment_1_2_in_rule__ORing__Group_1__2__Impl3461);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1752:1: rule__ANDing__Group__0 : rule__ANDing__Group__0__Impl rule__ANDing__Group__1 ;
    public final void rule__ANDing__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1756:1: ( rule__ANDing__Group__0__Impl rule__ANDing__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1757:2: rule__ANDing__Group__0__Impl rule__ANDing__Group__1
            {
            pushFollow(FOLLOW_rule__ANDing__Group__0__Impl_in_rule__ANDing__Group__03497);
            rule__ANDing__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ANDing__Group__1_in_rule__ANDing__Group__03500);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1764:1: rule__ANDing__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__ANDing__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1768:1: ( ( rulePrimary ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1769:1: ( rulePrimary )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1769:1: ( rulePrimary )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1770:1: rulePrimary
            {
             before(grammarAccess.getANDingAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__ANDing__Group__0__Impl3527);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1781:1: rule__ANDing__Group__1 : rule__ANDing__Group__1__Impl ;
    public final void rule__ANDing__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1785:1: ( rule__ANDing__Group__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1786:2: rule__ANDing__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ANDing__Group__1__Impl_in_rule__ANDing__Group__13556);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1792:1: rule__ANDing__Group__1__Impl : ( ( rule__ANDing__Group_1__0 )* ) ;
    public final void rule__ANDing__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1796:1: ( ( ( rule__ANDing__Group_1__0 )* ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1797:1: ( ( rule__ANDing__Group_1__0 )* )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1797:1: ( ( rule__ANDing__Group_1__0 )* )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1798:1: ( rule__ANDing__Group_1__0 )*
            {
             before(grammarAccess.getANDingAccess().getGroup_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1799:1: ( rule__ANDing__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1799:2: rule__ANDing__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ANDing__Group_1__0_in_rule__ANDing__Group__1__Impl3583);
            	    rule__ANDing__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1813:1: rule__ANDing__Group_1__0 : rule__ANDing__Group_1__0__Impl rule__ANDing__Group_1__1 ;
    public final void rule__ANDing__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1817:1: ( rule__ANDing__Group_1__0__Impl rule__ANDing__Group_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1818:2: rule__ANDing__Group_1__0__Impl rule__ANDing__Group_1__1
            {
            pushFollow(FOLLOW_rule__ANDing__Group_1__0__Impl_in_rule__ANDing__Group_1__03618);
            rule__ANDing__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ANDing__Group_1__1_in_rule__ANDing__Group_1__03621);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1825:1: rule__ANDing__Group_1__0__Impl : ( () ) ;
    public final void rule__ANDing__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1829:1: ( ( () ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1830:1: ( () )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1830:1: ( () )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1831:1: ()
            {
             before(grammarAccess.getANDingAccess().getANDingLeftAction_1_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1832:1: ()
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1834:1: 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1844:1: rule__ANDing__Group_1__1 : rule__ANDing__Group_1__1__Impl rule__ANDing__Group_1__2 ;
    public final void rule__ANDing__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1848:1: ( rule__ANDing__Group_1__1__Impl rule__ANDing__Group_1__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1849:2: rule__ANDing__Group_1__1__Impl rule__ANDing__Group_1__2
            {
            pushFollow(FOLLOW_rule__ANDing__Group_1__1__Impl_in_rule__ANDing__Group_1__13679);
            rule__ANDing__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ANDing__Group_1__2_in_rule__ANDing__Group_1__13682);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1856:1: rule__ANDing__Group_1__1__Impl : ( '&' ) ;
    public final void rule__ANDing__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1860:1: ( ( '&' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1861:1: ( '&' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1861:1: ( '&' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1862:1: '&'
            {
             before(grammarAccess.getANDingAccess().getAmpersandKeyword_1_1()); 
            match(input,27,FOLLOW_27_in_rule__ANDing__Group_1__1__Impl3710); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1875:1: rule__ANDing__Group_1__2 : rule__ANDing__Group_1__2__Impl ;
    public final void rule__ANDing__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1879:1: ( rule__ANDing__Group_1__2__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1880:2: rule__ANDing__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ANDing__Group_1__2__Impl_in_rule__ANDing__Group_1__23741);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1886:1: rule__ANDing__Group_1__2__Impl : ( ( rule__ANDing__RightAssignment_1_2 ) ) ;
    public final void rule__ANDing__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1890:1: ( ( ( rule__ANDing__RightAssignment_1_2 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1891:1: ( ( rule__ANDing__RightAssignment_1_2 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1891:1: ( ( rule__ANDing__RightAssignment_1_2 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1892:1: ( rule__ANDing__RightAssignment_1_2 )
            {
             before(grammarAccess.getANDingAccess().getRightAssignment_1_2()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1893:1: ( rule__ANDing__RightAssignment_1_2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1893:2: rule__ANDing__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ANDing__RightAssignment_1_2_in_rule__ANDing__Group_1__2__Impl3768);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1909:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1913:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1914:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_2__0__Impl_in_rule__Primary__Group_2__03804);
            rule__Primary__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_2__1_in_rule__Primary__Group_2__03807);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1921:1: rule__Primary__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1925:1: ( ( '(' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1926:1: ( '(' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1926:1: ( '(' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1927:1: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,19,FOLLOW_19_in_rule__Primary__Group_2__0__Impl3835); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1940:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1944:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1945:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_rule__Primary__Group_2__1__Impl_in_rule__Primary__Group_2__13866);
            rule__Primary__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_2__2_in_rule__Primary__Group_2__13869);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1952:1: rule__Primary__Group_2__1__Impl : ( ruleORing ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1956:1: ( ( ruleORing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1957:1: ( ruleORing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1957:1: ( ruleORing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1958:1: ruleORing
            {
             before(grammarAccess.getPrimaryAccess().getORingParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleORing_in_rule__Primary__Group_2__1__Impl3896);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1969:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1973:1: ( rule__Primary__Group_2__2__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1974:2: rule__Primary__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_2__2__Impl_in_rule__Primary__Group_2__23925);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1980:1: rule__Primary__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1984:1: ( ( ')' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1985:1: ( ')' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1985:1: ( ')' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1986:1: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 
            match(input,20,FOLLOW_20_in_rule__Primary__Group_2__2__Impl3953); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2005:1: rule__Quantifier__Group__0 : rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1 ;
    public final void rule__Quantifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2009:1: ( rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2010:2: rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1
            {
            pushFollow(FOLLOW_rule__Quantifier__Group__0__Impl_in_rule__Quantifier__Group__03990);
            rule__Quantifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantifier__Group__1_in_rule__Quantifier__Group__03993);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2017:1: rule__Quantifier__Group__0__Impl : ( ( rule__Quantifier__QuantifierAssignment_0 ) ) ;
    public final void rule__Quantifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2021:1: ( ( ( rule__Quantifier__QuantifierAssignment_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2022:1: ( ( rule__Quantifier__QuantifierAssignment_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2022:1: ( ( rule__Quantifier__QuantifierAssignment_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2023:1: ( rule__Quantifier__QuantifierAssignment_0 )
            {
             before(grammarAccess.getQuantifierAccess().getQuantifierAssignment_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2024:1: ( rule__Quantifier__QuantifierAssignment_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2024:2: rule__Quantifier__QuantifierAssignment_0
            {
            pushFollow(FOLLOW_rule__Quantifier__QuantifierAssignment_0_in_rule__Quantifier__Group__0__Impl4020);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2034:1: rule__Quantifier__Group__1 : rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2 ;
    public final void rule__Quantifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2038:1: ( rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2039:2: rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2
            {
            pushFollow(FOLLOW_rule__Quantifier__Group__1__Impl_in_rule__Quantifier__Group__14050);
            rule__Quantifier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantifier__Group__2_in_rule__Quantifier__Group__14053);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2046:1: rule__Quantifier__Group__1__Impl : ( '(' ) ;
    public final void rule__Quantifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2050:1: ( ( '(' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2051:1: ( '(' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2051:1: ( '(' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2052:1: '('
            {
             before(grammarAccess.getQuantifierAccess().getLeftParenthesisKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__Quantifier__Group__1__Impl4081); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2065:1: rule__Quantifier__Group__2 : rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3 ;
    public final void rule__Quantifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2069:1: ( rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2070:2: rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3
            {
            pushFollow(FOLLOW_rule__Quantifier__Group__2__Impl_in_rule__Quantifier__Group__24112);
            rule__Quantifier__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantifier__Group__3_in_rule__Quantifier__Group__24115);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2077:1: rule__Quantifier__Group__2__Impl : ( ( rule__Quantifier__SubjectAssignment_2 ) ) ;
    public final void rule__Quantifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2081:1: ( ( ( rule__Quantifier__SubjectAssignment_2 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2082:1: ( ( rule__Quantifier__SubjectAssignment_2 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2082:1: ( ( rule__Quantifier__SubjectAssignment_2 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2083:1: ( rule__Quantifier__SubjectAssignment_2 )
            {
             before(grammarAccess.getQuantifierAccess().getSubjectAssignment_2()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2084:1: ( rule__Quantifier__SubjectAssignment_2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2084:2: rule__Quantifier__SubjectAssignment_2
            {
            pushFollow(FOLLOW_rule__Quantifier__SubjectAssignment_2_in_rule__Quantifier__Group__2__Impl4142);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2094:1: rule__Quantifier__Group__3 : rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4 ;
    public final void rule__Quantifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2098:1: ( rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2099:2: rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4
            {
            pushFollow(FOLLOW_rule__Quantifier__Group__3__Impl_in_rule__Quantifier__Group__34172);
            rule__Quantifier__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantifier__Group__4_in_rule__Quantifier__Group__34175);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2106:1: rule__Quantifier__Group__3__Impl : ( ':' ) ;
    public final void rule__Quantifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2110:1: ( ( ':' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2111:1: ( ':' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2111:1: ( ':' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2112:1: ':'
            {
             before(grammarAccess.getQuantifierAccess().getColonKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__Quantifier__Group__3__Impl4203); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2125:1: rule__Quantifier__Group__4 : rule__Quantifier__Group__4__Impl rule__Quantifier__Group__5 ;
    public final void rule__Quantifier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2129:1: ( rule__Quantifier__Group__4__Impl rule__Quantifier__Group__5 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2130:2: rule__Quantifier__Group__4__Impl rule__Quantifier__Group__5
            {
            pushFollow(FOLLOW_rule__Quantifier__Group__4__Impl_in_rule__Quantifier__Group__44234);
            rule__Quantifier__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantifier__Group__5_in_rule__Quantifier__Group__44237);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2137:1: rule__Quantifier__Group__4__Impl : ( ( rule__Quantifier__PredicateAssignment_4 ) ) ;
    public final void rule__Quantifier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2141:1: ( ( ( rule__Quantifier__PredicateAssignment_4 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2142:1: ( ( rule__Quantifier__PredicateAssignment_4 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2142:1: ( ( rule__Quantifier__PredicateAssignment_4 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2143:1: ( rule__Quantifier__PredicateAssignment_4 )
            {
             before(grammarAccess.getQuantifierAccess().getPredicateAssignment_4()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2144:1: ( rule__Quantifier__PredicateAssignment_4 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2144:2: rule__Quantifier__PredicateAssignment_4
            {
            pushFollow(FOLLOW_rule__Quantifier__PredicateAssignment_4_in_rule__Quantifier__Group__4__Impl4264);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2154:1: rule__Quantifier__Group__5 : rule__Quantifier__Group__5__Impl ;
    public final void rule__Quantifier__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2158:1: ( rule__Quantifier__Group__5__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2159:2: rule__Quantifier__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Quantifier__Group__5__Impl_in_rule__Quantifier__Group__54294);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2165:1: rule__Quantifier__Group__5__Impl : ( ')' ) ;
    public final void rule__Quantifier__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2169:1: ( ( ')' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2170:1: ( ')' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2170:1: ( ')' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2171:1: ')'
            {
             before(grammarAccess.getQuantifierAccess().getRightParenthesisKeyword_5()); 
            match(input,20,FOLLOW_20_in_rule__Quantifier__Group__5__Impl4322); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2196:1: rule__Atomic__Group__0 : rule__Atomic__Group__0__Impl rule__Atomic__Group__1 ;
    public final void rule__Atomic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2200:1: ( rule__Atomic__Group__0__Impl rule__Atomic__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2201:2: rule__Atomic__Group__0__Impl rule__Atomic__Group__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group__0__Impl_in_rule__Atomic__Group__04365);
            rule__Atomic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group__1_in_rule__Atomic__Group__04368);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2208:1: rule__Atomic__Group__0__Impl : ( ( rule__Atomic__FunctionAssignment_0 ) ) ;
    public final void rule__Atomic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2212:1: ( ( ( rule__Atomic__FunctionAssignment_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2213:1: ( ( rule__Atomic__FunctionAssignment_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2213:1: ( ( rule__Atomic__FunctionAssignment_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2214:1: ( rule__Atomic__FunctionAssignment_0 )
            {
             before(grammarAccess.getAtomicAccess().getFunctionAssignment_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2215:1: ( rule__Atomic__FunctionAssignment_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2215:2: rule__Atomic__FunctionAssignment_0
            {
            pushFollow(FOLLOW_rule__Atomic__FunctionAssignment_0_in_rule__Atomic__Group__0__Impl4395);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2225:1: rule__Atomic__Group__1 : rule__Atomic__Group__1__Impl ;
    public final void rule__Atomic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2229:1: ( rule__Atomic__Group__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2230:2: rule__Atomic__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group__1__Impl_in_rule__Atomic__Group__14425);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2236:1: rule__Atomic__Group__1__Impl : ( ( rule__Atomic__Group_1__0 )? ) ;
    public final void rule__Atomic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2240:1: ( ( ( rule__Atomic__Group_1__0 )? ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2241:1: ( ( rule__Atomic__Group_1__0 )? )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2241:1: ( ( rule__Atomic__Group_1__0 )? )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2242:1: ( rule__Atomic__Group_1__0 )?
            {
             before(grammarAccess.getAtomicAccess().getGroup_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2243:1: ( rule__Atomic__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2243:2: rule__Atomic__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Group__1__Impl4452);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2257:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2261:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2262:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__04487);
            rule__Atomic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__04490);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2269:1: rule__Atomic__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2273:1: ( ( '(' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2274:1: ( '(' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2274:1: ( '(' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2275:1: '('
            {
             before(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__Atomic__Group_1__0__Impl4518); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2288:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl rule__Atomic__Group_1__2 ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2292:1: ( rule__Atomic__Group_1__1__Impl rule__Atomic__Group_1__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2293:2: rule__Atomic__Group_1__1__Impl rule__Atomic__Group_1__2
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__14549);
            rule__Atomic__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_1__2_in_rule__Atomic__Group_1__14552);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2300:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__Group_1_1__0 )? ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2304:1: ( ( ( rule__Atomic__Group_1_1__0 )? ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2305:1: ( ( rule__Atomic__Group_1_1__0 )? )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2305:1: ( ( rule__Atomic__Group_1_1__0 )? )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2306:1: ( rule__Atomic__Group_1_1__0 )?
            {
             before(grammarAccess.getAtomicAccess().getGroup_1_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2307:1: ( rule__Atomic__Group_1_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2307:2: rule__Atomic__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_1_1__0_in_rule__Atomic__Group_1__1__Impl4579);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2317:1: rule__Atomic__Group_1__2 : rule__Atomic__Group_1__2__Impl ;
    public final void rule__Atomic__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2321:1: ( rule__Atomic__Group_1__2__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2322:2: rule__Atomic__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__2__Impl_in_rule__Atomic__Group_1__24610);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2328:1: rule__Atomic__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Atomic__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2332:1: ( ( ')' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2333:1: ( ')' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2333:1: ( ')' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2334:1: ')'
            {
             before(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_1_2()); 
            match(input,20,FOLLOW_20_in_rule__Atomic__Group_1__2__Impl4638); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2353:1: rule__Atomic__Group_1_1__0 : rule__Atomic__Group_1_1__0__Impl rule__Atomic__Group_1_1__1 ;
    public final void rule__Atomic__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2357:1: ( rule__Atomic__Group_1_1__0__Impl rule__Atomic__Group_1_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2358:2: rule__Atomic__Group_1_1__0__Impl rule__Atomic__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1_1__0__Impl_in_rule__Atomic__Group_1_1__04675);
            rule__Atomic__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_1_1__1_in_rule__Atomic__Group_1_1__04678);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2365:1: rule__Atomic__Group_1_1__0__Impl : ( ( rule__Atomic__ArgsAssignment_1_1_0 ) ) ;
    public final void rule__Atomic__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2369:1: ( ( ( rule__Atomic__ArgsAssignment_1_1_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2370:1: ( ( rule__Atomic__ArgsAssignment_1_1_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2370:1: ( ( rule__Atomic__ArgsAssignment_1_1_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2371:1: ( rule__Atomic__ArgsAssignment_1_1_0 )
            {
             before(grammarAccess.getAtomicAccess().getArgsAssignment_1_1_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2372:1: ( rule__Atomic__ArgsAssignment_1_1_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2372:2: rule__Atomic__ArgsAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__Atomic__ArgsAssignment_1_1_0_in_rule__Atomic__Group_1_1__0__Impl4705);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2382:1: rule__Atomic__Group_1_1__1 : rule__Atomic__Group_1_1__1__Impl ;
    public final void rule__Atomic__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2386:1: ( rule__Atomic__Group_1_1__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2387:2: rule__Atomic__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1_1__1__Impl_in_rule__Atomic__Group_1_1__14735);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2393:1: rule__Atomic__Group_1_1__1__Impl : ( ( rule__Atomic__Group_1_1_1__0 )* ) ;
    public final void rule__Atomic__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2397:1: ( ( ( rule__Atomic__Group_1_1_1__0 )* ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2398:1: ( ( rule__Atomic__Group_1_1_1__0 )* )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2398:1: ( ( rule__Atomic__Group_1_1_1__0 )* )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2399:1: ( rule__Atomic__Group_1_1_1__0 )*
            {
             before(grammarAccess.getAtomicAccess().getGroup_1_1_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2400:1: ( rule__Atomic__Group_1_1_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2400:2: rule__Atomic__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Atomic__Group_1_1_1__0_in_rule__Atomic__Group_1_1__1__Impl4762);
            	    rule__Atomic__Group_1_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2414:1: rule__Atomic__Group_1_1_1__0 : rule__Atomic__Group_1_1_1__0__Impl rule__Atomic__Group_1_1_1__1 ;
    public final void rule__Atomic__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2418:1: ( rule__Atomic__Group_1_1_1__0__Impl rule__Atomic__Group_1_1_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2419:2: rule__Atomic__Group_1_1_1__0__Impl rule__Atomic__Group_1_1_1__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1_1_1__0__Impl_in_rule__Atomic__Group_1_1_1__04797);
            rule__Atomic__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_1_1_1__1_in_rule__Atomic__Group_1_1_1__04800);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2426:1: rule__Atomic__Group_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__Atomic__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2430:1: ( ( ',' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2431:1: ( ',' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2431:1: ( ',' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2432:1: ','
            {
             before(grammarAccess.getAtomicAccess().getCommaKeyword_1_1_1_0()); 
            match(input,23,FOLLOW_23_in_rule__Atomic__Group_1_1_1__0__Impl4828); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2445:1: rule__Atomic__Group_1_1_1__1 : rule__Atomic__Group_1_1_1__1__Impl ;
    public final void rule__Atomic__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2449:1: ( rule__Atomic__Group_1_1_1__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2450:2: rule__Atomic__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1_1_1__1__Impl_in_rule__Atomic__Group_1_1_1__14859);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2456:1: rule__Atomic__Group_1_1_1__1__Impl : ( ( rule__Atomic__ArgsAssignment_1_1_1_1 ) ) ;
    public final void rule__Atomic__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2460:1: ( ( ( rule__Atomic__ArgsAssignment_1_1_1_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2461:1: ( ( rule__Atomic__ArgsAssignment_1_1_1_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2461:1: ( ( rule__Atomic__ArgsAssignment_1_1_1_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2462:1: ( rule__Atomic__ArgsAssignment_1_1_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getArgsAssignment_1_1_1_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2463:1: ( rule__Atomic__ArgsAssignment_1_1_1_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2463:2: rule__Atomic__ArgsAssignment_1_1_1_1
            {
            pushFollow(FOLLOW_rule__Atomic__ArgsAssignment_1_1_1_1_in_rule__Atomic__Group_1_1_1__1__Impl4886);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2477:1: rule__Theorem__Group__0 : rule__Theorem__Group__0__Impl rule__Theorem__Group__1 ;
    public final void rule__Theorem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2481:1: ( rule__Theorem__Group__0__Impl rule__Theorem__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2482:2: rule__Theorem__Group__0__Impl rule__Theorem__Group__1
            {
            pushFollow(FOLLOW_rule__Theorem__Group__0__Impl_in_rule__Theorem__Group__04920);
            rule__Theorem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__1_in_rule__Theorem__Group__04923);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2489:1: rule__Theorem__Group__0__Impl : ( ( rule__Theorem__RequirementAssignment_0 ) ) ;
    public final void rule__Theorem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2493:1: ( ( ( rule__Theorem__RequirementAssignment_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2494:1: ( ( rule__Theorem__RequirementAssignment_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2494:1: ( ( rule__Theorem__RequirementAssignment_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2495:1: ( rule__Theorem__RequirementAssignment_0 )
            {
             before(grammarAccess.getTheoremAccess().getRequirementAssignment_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2496:1: ( rule__Theorem__RequirementAssignment_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2496:2: rule__Theorem__RequirementAssignment_0
            {
            pushFollow(FOLLOW_rule__Theorem__RequirementAssignment_0_in_rule__Theorem__Group__0__Impl4950);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2506:1: rule__Theorem__Group__1 : rule__Theorem__Group__1__Impl rule__Theorem__Group__2 ;
    public final void rule__Theorem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2510:1: ( rule__Theorem__Group__1__Impl rule__Theorem__Group__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2511:2: rule__Theorem__Group__1__Impl rule__Theorem__Group__2
            {
            pushFollow(FOLLOW_rule__Theorem__Group__1__Impl_in_rule__Theorem__Group__14980);
            rule__Theorem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__2_in_rule__Theorem__Group__14983);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2518:1: rule__Theorem__Group__1__Impl : ( ':-' ) ;
    public final void rule__Theorem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2522:1: ( ( ':-' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2523:1: ( ':-' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2523:1: ( ':-' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2524:1: ':-'
            {
             before(grammarAccess.getTheoremAccess().getColonHyphenMinusKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__Theorem__Group__1__Impl5011); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2537:1: rule__Theorem__Group__2 : rule__Theorem__Group__2__Impl rule__Theorem__Group__3 ;
    public final void rule__Theorem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2541:1: ( rule__Theorem__Group__2__Impl rule__Theorem__Group__3 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2542:2: rule__Theorem__Group__2__Impl rule__Theorem__Group__3
            {
            pushFollow(FOLLOW_rule__Theorem__Group__2__Impl_in_rule__Theorem__Group__25042);
            rule__Theorem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__3_in_rule__Theorem__Group__25045);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2549:1: rule__Theorem__Group__2__Impl : ( ( rule__Theorem__ResultAssignment_2 ) ) ;
    public final void rule__Theorem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2553:1: ( ( ( rule__Theorem__ResultAssignment_2 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2554:1: ( ( rule__Theorem__ResultAssignment_2 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2554:1: ( ( rule__Theorem__ResultAssignment_2 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2555:1: ( rule__Theorem__ResultAssignment_2 )
            {
             before(grammarAccess.getTheoremAccess().getResultAssignment_2()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2556:1: ( rule__Theorem__ResultAssignment_2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2556:2: rule__Theorem__ResultAssignment_2
            {
            pushFollow(FOLLOW_rule__Theorem__ResultAssignment_2_in_rule__Theorem__Group__2__Impl5072);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2566:1: rule__Theorem__Group__3 : rule__Theorem__Group__3__Impl rule__Theorem__Group__4 ;
    public final void rule__Theorem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2570:1: ( rule__Theorem__Group__3__Impl rule__Theorem__Group__4 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2571:2: rule__Theorem__Group__3__Impl rule__Theorem__Group__4
            {
            pushFollow(FOLLOW_rule__Theorem__Group__3__Impl_in_rule__Theorem__Group__35102);
            rule__Theorem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__4_in_rule__Theorem__Group__35105);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2578:1: rule__Theorem__Group__3__Impl : ( ',' ) ;
    public final void rule__Theorem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2582:1: ( ( ',' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2583:1: ( ',' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2583:1: ( ',' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2584:1: ','
            {
             before(grammarAccess.getTheoremAccess().getCommaKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__Theorem__Group__3__Impl5133); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2597:1: rule__Theorem__Group__4 : rule__Theorem__Group__4__Impl rule__Theorem__Group__5 ;
    public final void rule__Theorem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2601:1: ( rule__Theorem__Group__4__Impl rule__Theorem__Group__5 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2602:2: rule__Theorem__Group__4__Impl rule__Theorem__Group__5
            {
            pushFollow(FOLLOW_rule__Theorem__Group__4__Impl_in_rule__Theorem__Group__45164);
            rule__Theorem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__5_in_rule__Theorem__Group__45167);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2609:1: rule__Theorem__Group__4__Impl : ( ( rule__Theorem__CostAssignment_4 ) ) ;
    public final void rule__Theorem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2613:1: ( ( ( rule__Theorem__CostAssignment_4 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2614:1: ( ( rule__Theorem__CostAssignment_4 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2614:1: ( ( rule__Theorem__CostAssignment_4 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2615:1: ( rule__Theorem__CostAssignment_4 )
            {
             before(grammarAccess.getTheoremAccess().getCostAssignment_4()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2616:1: ( rule__Theorem__CostAssignment_4 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2616:2: rule__Theorem__CostAssignment_4
            {
            pushFollow(FOLLOW_rule__Theorem__CostAssignment_4_in_rule__Theorem__Group__4__Impl5194);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2626:1: rule__Theorem__Group__5 : rule__Theorem__Group__5__Impl rule__Theorem__Group__6 ;
    public final void rule__Theorem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2630:1: ( rule__Theorem__Group__5__Impl rule__Theorem__Group__6 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2631:2: rule__Theorem__Group__5__Impl rule__Theorem__Group__6
            {
            pushFollow(FOLLOW_rule__Theorem__Group__5__Impl_in_rule__Theorem__Group__55224);
            rule__Theorem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__6_in_rule__Theorem__Group__55227);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2638:1: rule__Theorem__Group__5__Impl : ( ',' ) ;
    public final void rule__Theorem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2642:1: ( ( ',' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2643:1: ( ',' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2643:1: ( ',' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2644:1: ','
            {
             before(grammarAccess.getTheoremAccess().getCommaKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__Theorem__Group__5__Impl5255); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2657:1: rule__Theorem__Group__6 : rule__Theorem__Group__6__Impl rule__Theorem__Group__7 ;
    public final void rule__Theorem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2661:1: ( rule__Theorem__Group__6__Impl rule__Theorem__Group__7 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2662:2: rule__Theorem__Group__6__Impl rule__Theorem__Group__7
            {
            pushFollow(FOLLOW_rule__Theorem__Group__6__Impl_in_rule__Theorem__Group__65286);
            rule__Theorem__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__7_in_rule__Theorem__Group__65289);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2669:1: rule__Theorem__Group__6__Impl : ( ( rule__Theorem__DescriptionAssignment_6 ) ) ;
    public final void rule__Theorem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2673:1: ( ( ( rule__Theorem__DescriptionAssignment_6 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2674:1: ( ( rule__Theorem__DescriptionAssignment_6 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2674:1: ( ( rule__Theorem__DescriptionAssignment_6 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2675:1: ( rule__Theorem__DescriptionAssignment_6 )
            {
             before(grammarAccess.getTheoremAccess().getDescriptionAssignment_6()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2676:1: ( rule__Theorem__DescriptionAssignment_6 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2676:2: rule__Theorem__DescriptionAssignment_6
            {
            pushFollow(FOLLOW_rule__Theorem__DescriptionAssignment_6_in_rule__Theorem__Group__6__Impl5316);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2686:1: rule__Theorem__Group__7 : rule__Theorem__Group__7__Impl ;
    public final void rule__Theorem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2690:1: ( rule__Theorem__Group__7__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2691:2: rule__Theorem__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Theorem__Group__7__Impl_in_rule__Theorem__Group__75346);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2697:1: rule__Theorem__Group__7__Impl : ( ( rule__Theorem__Group_7__0 )? ) ;
    public final void rule__Theorem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2701:1: ( ( ( rule__Theorem__Group_7__0 )? ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2702:1: ( ( rule__Theorem__Group_7__0 )? )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2702:1: ( ( rule__Theorem__Group_7__0 )? )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2703:1: ( rule__Theorem__Group_7__0 )?
            {
             before(grammarAccess.getTheoremAccess().getGroup_7()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2704:1: ( rule__Theorem__Group_7__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2704:2: rule__Theorem__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Theorem__Group_7__0_in_rule__Theorem__Group__7__Impl5373);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2730:1: rule__Theorem__Group_7__0 : rule__Theorem__Group_7__0__Impl rule__Theorem__Group_7__1 ;
    public final void rule__Theorem__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2734:1: ( rule__Theorem__Group_7__0__Impl rule__Theorem__Group_7__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2735:2: rule__Theorem__Group_7__0__Impl rule__Theorem__Group_7__1
            {
            pushFollow(FOLLOW_rule__Theorem__Group_7__0__Impl_in_rule__Theorem__Group_7__05420);
            rule__Theorem__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group_7__1_in_rule__Theorem__Group_7__05423);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2742:1: rule__Theorem__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Theorem__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2746:1: ( ( ',' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2747:1: ( ',' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2747:1: ( ',' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2748:1: ','
            {
             before(grammarAccess.getTheoremAccess().getCommaKeyword_7_0()); 
            match(input,23,FOLLOW_23_in_rule__Theorem__Group_7__0__Impl5451); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2761:1: rule__Theorem__Group_7__1 : rule__Theorem__Group_7__1__Impl ;
    public final void rule__Theorem__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2765:1: ( rule__Theorem__Group_7__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2766:2: rule__Theorem__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Theorem__Group_7__1__Impl_in_rule__Theorem__Group_7__15482);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2772:1: rule__Theorem__Group_7__1__Impl : ( ( rule__Theorem__PseudoCodeAssignment_7_1 ) ) ;
    public final void rule__Theorem__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2776:1: ( ( ( rule__Theorem__PseudoCodeAssignment_7_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2777:1: ( ( rule__Theorem__PseudoCodeAssignment_7_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2777:1: ( ( rule__Theorem__PseudoCodeAssignment_7_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2778:1: ( rule__Theorem__PseudoCodeAssignment_7_1 )
            {
             before(grammarAccess.getTheoremAccess().getPseudoCodeAssignment_7_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2779:1: ( rule__Theorem__PseudoCodeAssignment_7_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2779:2: rule__Theorem__PseudoCodeAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Theorem__PseudoCodeAssignment_7_1_in_rule__Theorem__Group_7__1__Impl5509);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2794:1: rule__Input__GivenAssignment_1 : ( ruleProblem ) ;
    public final void rule__Input__GivenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2798:1: ( ( ruleProblem ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2799:1: ( ruleProblem )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2799:1: ( ruleProblem )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2800:1: ruleProblem
            {
             before(grammarAccess.getInputAccess().getGivenProblemParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleProblem_in_rule__Input__GivenAssignment_15548);
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


    // $ANTLR start "rule__Input__TaskAssignment_3_0_0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2809:1: rule__Input__TaskAssignment_3_0_0 : ( ( rule__Input__TaskAlternatives_3_0_0_0 ) ) ;
    public final void rule__Input__TaskAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2813:1: ( ( ( rule__Input__TaskAlternatives_3_0_0_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2814:1: ( ( rule__Input__TaskAlternatives_3_0_0_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2814:1: ( ( rule__Input__TaskAlternatives_3_0_0_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2815:1: ( rule__Input__TaskAlternatives_3_0_0_0 )
            {
             before(grammarAccess.getInputAccess().getTaskAlternatives_3_0_0_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2816:1: ( rule__Input__TaskAlternatives_3_0_0_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2816:2: rule__Input__TaskAlternatives_3_0_0_0
            {
            pushFollow(FOLLOW_rule__Input__TaskAlternatives_3_0_0_0_in_rule__Input__TaskAssignment_3_0_05579);
            rule__Input__TaskAlternatives_3_0_0_0();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getTaskAlternatives_3_0_0_0()); 

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
    // $ANTLR end "rule__Input__TaskAssignment_3_0_0"


    // $ANTLR start "rule__Input__GoalAssignment_3_0_1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2825:1: rule__Input__GoalAssignment_3_0_1 : ( ruleProblem ) ;
    public final void rule__Input__GoalAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2829:1: ( ( ruleProblem ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2830:1: ( ruleProblem )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2830:1: ( ruleProblem )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2831:1: ruleProblem
            {
             before(grammarAccess.getInputAccess().getGoalProblemParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_ruleProblem_in_rule__Input__GoalAssignment_3_0_15612);
            ruleProblem();

            state._fsp--;

             after(grammarAccess.getInputAccess().getGoalProblemParserRuleCall_3_0_1_0()); 

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
    // $ANTLR end "rule__Input__GoalAssignment_3_0_1"


    // $ANTLR start "rule__Input__TaskAssignment_3_1_0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2840:1: rule__Input__TaskAssignment_3_1_0 : ( ( 'Test' ) ) ;
    public final void rule__Input__TaskAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2844:1: ( ( ( 'Test' ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2845:1: ( ( 'Test' ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2845:1: ( ( 'Test' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2846:1: ( 'Test' )
            {
             before(grammarAccess.getInputAccess().getTaskTestKeyword_3_1_0_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2847:1: ( 'Test' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2848:1: 'Test'
            {
             before(grammarAccess.getInputAccess().getTaskTestKeyword_3_1_0_0()); 
            match(input,30,FOLLOW_30_in_rule__Input__TaskAssignment_3_1_05648); 
             after(grammarAccess.getInputAccess().getTaskTestKeyword_3_1_0_0()); 

            }

             after(grammarAccess.getInputAccess().getTaskTestKeyword_3_1_0_0()); 

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
    // $ANTLR end "rule__Input__TaskAssignment_3_1_0"


    // $ANTLR start "rule__Input__GoalAssignment_3_1_2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2863:1: rule__Input__GoalAssignment_3_1_2 : ( ruleProblemNoVars ) ;
    public final void rule__Input__GoalAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2867:1: ( ( ruleProblemNoVars ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2868:1: ( ruleProblemNoVars )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2868:1: ( ruleProblemNoVars )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2869:1: ruleProblemNoVars
            {
             before(grammarAccess.getInputAccess().getGoalProblemNoVarsParserRuleCall_3_1_2_0()); 
            pushFollow(FOLLOW_ruleProblemNoVars_in_rule__Input__GoalAssignment_3_1_25687);
            ruleProblemNoVars();

            state._fsp--;

             after(grammarAccess.getInputAccess().getGoalProblemNoVarsParserRuleCall_3_1_2_0()); 

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
    // $ANTLR end "rule__Input__GoalAssignment_3_1_2"


    // $ANTLR start "rule__Input__TheoremsAssignment_4_2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2878:1: rule__Input__TheoremsAssignment_4_2 : ( ruleTheorem ) ;
    public final void rule__Input__TheoremsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2882:1: ( ( ruleTheorem ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2883:1: ( ruleTheorem )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2883:1: ( ruleTheorem )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2884:1: ruleTheorem
            {
             before(grammarAccess.getInputAccess().getTheoremsTheoremParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleTheorem_in_rule__Input__TheoremsAssignment_4_25718);
            ruleTheorem();

            state._fsp--;

             after(grammarAccess.getInputAccess().getTheoremsTheoremParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Input__TheoremsAssignment_4_2"


    // $ANTLR start "rule__Input__TheoremsAssignment_4_3_1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2893:1: rule__Input__TheoremsAssignment_4_3_1 : ( ruleTheorem ) ;
    public final void rule__Input__TheoremsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2897:1: ( ( ruleTheorem ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2898:1: ( ruleTheorem )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2898:1: ( ruleTheorem )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2899:1: ruleTheorem
            {
             before(grammarAccess.getInputAccess().getTheoremsTheoremParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_ruleTheorem_in_rule__Input__TheoremsAssignment_4_3_15749);
            ruleTheorem();

            state._fsp--;

             after(grammarAccess.getInputAccess().getTheoremsTheoremParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Input__TheoremsAssignment_4_3_1"


    // $ANTLR start "rule__ProblemNoVars__PropertyAssignment"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2908:1: rule__ProblemNoVars__PropertyAssignment : ( ruleORing ) ;
    public final void rule__ProblemNoVars__PropertyAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2912:1: ( ( ruleORing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2913:1: ( ruleORing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2913:1: ( ruleORing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2914:1: ruleORing
            {
             before(grammarAccess.getProblemNoVarsAccess().getPropertyORingParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleORing_in_rule__ProblemNoVars__PropertyAssignment5780);
            ruleORing();

            state._fsp--;

             after(grammarAccess.getProblemNoVarsAccess().getPropertyORingParserRuleCall_0()); 

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
    // $ANTLR end "rule__ProblemNoVars__PropertyAssignment"


    // $ANTLR start "rule__Problem__VarsAssignment_0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2923:1: rule__Problem__VarsAssignment_0 : ( ruleDeclaration ) ;
    public final void rule__Problem__VarsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2927:1: ( ( ruleDeclaration ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2928:1: ( ruleDeclaration )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2928:1: ( ruleDeclaration )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2929:1: ruleDeclaration
            {
             before(grammarAccess.getProblemAccess().getVarsDeclarationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDeclaration_in_rule__Problem__VarsAssignment_05811);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getProblemAccess().getVarsDeclarationParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Problem__VarsAssignment_0"


    // $ANTLR start "rule__Problem__VarsAssignment_1_1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2938:1: rule__Problem__VarsAssignment_1_1 : ( ruleDeclaration ) ;
    public final void rule__Problem__VarsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2942:1: ( ( ruleDeclaration ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2943:1: ( ruleDeclaration )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2943:1: ( ruleDeclaration )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2944:1: ruleDeclaration
            {
             before(grammarAccess.getProblemAccess().getVarsDeclarationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleDeclaration_in_rule__Problem__VarsAssignment_1_15842);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getProblemAccess().getVarsDeclarationParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Problem__VarsAssignment_1_1"


    // $ANTLR start "rule__Problem__PropertyAssignment_3"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2953:1: rule__Problem__PropertyAssignment_3 : ( ruleORing ) ;
    public final void rule__Problem__PropertyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2957:1: ( ( ruleORing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2958:1: ( ruleORing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2958:1: ( ruleORing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2959:1: ruleORing
            {
             before(grammarAccess.getProblemAccess().getPropertyORingParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleORing_in_rule__Problem__PropertyAssignment_35873);
            ruleORing();

            state._fsp--;

             after(grammarAccess.getProblemAccess().getPropertyORingParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Problem__PropertyAssignment_3"


    // $ANTLR start "rule__Declaration__TypeAssignment_0_0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2968:1: rule__Declaration__TypeAssignment_0_0 : ( ruleType ) ;
    public final void rule__Declaration__TypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2972:1: ( ( ruleType ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2973:1: ( ruleType )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2973:1: ( ruleType )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2974:1: ruleType
            {
             before(grammarAccess.getDeclarationAccess().getTypeTypeParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Declaration__TypeAssignment_0_05904);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2983:1: rule__Declaration__VarNameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__Declaration__VarNameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2987:1: ( ( RULE_ID ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2988:1: ( RULE_ID )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2988:1: ( RULE_ID )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2989:1: RULE_ID
            {
             before(grammarAccess.getDeclarationAccess().getVarNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Declaration__VarNameAssignment_0_25935); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2998:1: rule__Declaration__VarNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Declaration__VarNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3002:1: ( ( RULE_ID ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3003:1: ( RULE_ID )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3003:1: ( RULE_ID )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3004:1: RULE_ID
            {
             before(grammarAccess.getDeclarationAccess().getVarNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Declaration__VarNameAssignment_15966); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3013:1: rule__Type__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3017:1: ( ( RULE_ID ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3018:1: ( RULE_ID )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3018:1: ( RULE_ID )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3019:1: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Type__NameAssignment_05997); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3028:1: rule__Type__TemplateTypeAssignment_1_1 : ( ruleType ) ;
    public final void rule__Type__TemplateTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3032:1: ( ( ruleType ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3033:1: ( ruleType )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3033:1: ( ruleType )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3034:1: ruleType
            {
             before(grammarAccess.getTypeAccess().getTemplateTypeTypeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Type__TemplateTypeAssignment_1_16028);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3043:1: rule__ORing__RightAssignment_1_2 : ( ruleANDing ) ;
    public final void rule__ORing__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3047:1: ( ( ruleANDing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3048:1: ( ruleANDing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3048:1: ( ruleANDing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3049:1: ruleANDing
            {
             before(grammarAccess.getORingAccess().getRightANDingParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleANDing_in_rule__ORing__RightAssignment_1_26059);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3058:1: rule__ANDing__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__ANDing__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3062:1: ( ( rulePrimary ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3063:1: ( rulePrimary )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3063:1: ( rulePrimary )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3064:1: rulePrimary
            {
             before(grammarAccess.getANDingAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__ANDing__RightAssignment_1_26090);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3073:1: rule__Quantifier__QuantifierAssignment_0 : ( ( rule__Quantifier__QuantifierAlternatives_0_0 ) ) ;
    public final void rule__Quantifier__QuantifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3077:1: ( ( ( rule__Quantifier__QuantifierAlternatives_0_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3078:1: ( ( rule__Quantifier__QuantifierAlternatives_0_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3078:1: ( ( rule__Quantifier__QuantifierAlternatives_0_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3079:1: ( rule__Quantifier__QuantifierAlternatives_0_0 )
            {
             before(grammarAccess.getQuantifierAccess().getQuantifierAlternatives_0_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3080:1: ( rule__Quantifier__QuantifierAlternatives_0_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3080:2: rule__Quantifier__QuantifierAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__Quantifier__QuantifierAlternatives_0_0_in_rule__Quantifier__QuantifierAssignment_06121);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3089:1: rule__Quantifier__SubjectAssignment_2 : ( ruleProblem ) ;
    public final void rule__Quantifier__SubjectAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3093:1: ( ( ruleProblem ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3094:1: ( ruleProblem )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3094:1: ( ruleProblem )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3095:1: ruleProblem
            {
             before(grammarAccess.getQuantifierAccess().getSubjectProblemParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleProblem_in_rule__Quantifier__SubjectAssignment_26154);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3104:1: rule__Quantifier__PredicateAssignment_4 : ( ruleORing ) ;
    public final void rule__Quantifier__PredicateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3108:1: ( ( ruleORing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3109:1: ( ruleORing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3109:1: ( ruleORing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3110:1: ruleORing
            {
             before(grammarAccess.getQuantifierAccess().getPredicateORingParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleORing_in_rule__Quantifier__PredicateAssignment_46185);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3119:1: rule__Atomic__FunctionAssignment_0 : ( RULE_ID ) ;
    public final void rule__Atomic__FunctionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3123:1: ( ( RULE_ID ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3124:1: ( RULE_ID )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3124:1: ( RULE_ID )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3125:1: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getFunctionIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Atomic__FunctionAssignment_06216); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3134:1: rule__Atomic__ArgsAssignment_1_1_0 : ( RULE_ID ) ;
    public final void rule__Atomic__ArgsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3138:1: ( ( RULE_ID ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3139:1: ( RULE_ID )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3139:1: ( RULE_ID )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3140:1: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getArgsIDTerminalRuleCall_1_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Atomic__ArgsAssignment_1_1_06247); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3149:1: rule__Atomic__ArgsAssignment_1_1_1_1 : ( RULE_ID ) ;
    public final void rule__Atomic__ArgsAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3153:1: ( ( RULE_ID ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3154:1: ( RULE_ID )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3154:1: ( RULE_ID )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3155:1: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getArgsIDTerminalRuleCall_1_1_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Atomic__ArgsAssignment_1_1_1_16278); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3164:1: rule__BooleanLiteral__ValueAssignment : ( ( rule__BooleanLiteral__ValueAlternatives_0 ) ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3168:1: ( ( ( rule__BooleanLiteral__ValueAlternatives_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3169:1: ( ( rule__BooleanLiteral__ValueAlternatives_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3169:1: ( ( rule__BooleanLiteral__ValueAlternatives_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3170:1: ( rule__BooleanLiteral__ValueAlternatives_0 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3171:1: ( rule__BooleanLiteral__ValueAlternatives_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3171:2: rule__BooleanLiteral__ValueAlternatives_0
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__ValueAlternatives_0_in_rule__BooleanLiteral__ValueAssignment6309);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3180:1: rule__Theorem__RequirementAssignment_0 : ( ruleORing ) ;
    public final void rule__Theorem__RequirementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3184:1: ( ( ruleORing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3185:1: ( ruleORing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3185:1: ( ruleORing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3186:1: ruleORing
            {
             before(grammarAccess.getTheoremAccess().getRequirementORingParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleORing_in_rule__Theorem__RequirementAssignment_06342);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3195:1: rule__Theorem__ResultAssignment_2 : ( ruleORing ) ;
    public final void rule__Theorem__ResultAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3199:1: ( ( ruleORing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3200:1: ( ruleORing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3200:1: ( ruleORing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3201:1: ruleORing
            {
             before(grammarAccess.getTheoremAccess().getResultORingParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleORing_in_rule__Theorem__ResultAssignment_26373);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3210:1: rule__Theorem__CostAssignment_4 : ( RULE_INT ) ;
    public final void rule__Theorem__CostAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3214:1: ( ( RULE_INT ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3215:1: ( RULE_INT )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3215:1: ( RULE_INT )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3216:1: RULE_INT
            {
             before(grammarAccess.getTheoremAccess().getCostINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Theorem__CostAssignment_46404); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3225:1: rule__Theorem__DescriptionAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Theorem__DescriptionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3229:1: ( ( RULE_STRING ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3230:1: ( RULE_STRING )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3230:1: ( RULE_STRING )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3231:1: RULE_STRING
            {
             before(grammarAccess.getTheoremAccess().getDescriptionSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Theorem__DescriptionAssignment_66435); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3240:1: rule__Theorem__PseudoCodeAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__Theorem__PseudoCodeAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3244:1: ( ( RULE_STRING ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3245:1: ( RULE_STRING )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3245:1: ( RULE_STRING )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3246:1: RULE_STRING
            {
             before(grammarAccess.getTheoremAccess().getPseudoCodeSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Theorem__PseudoCodeAssignment_7_16466); 
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
    public static final BitSet FOLLOW_ruleProblemNoVars_in_entryRuleProblemNoVars121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProblemNoVars128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemNoVars__PropertyAssignment_in_ruleProblemNoVars154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblem_in_entryRuleProblem181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProblem188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group__0_in_ruleProblem214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Alternatives_in_ruleDeclaration274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0_in_ruleType334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_entryRuleORing361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleORing368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORing__Group__0_in_ruleORing394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANDing_in_entryRuleANDing421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleANDing428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANDing__Group__0_in_ruleANDing454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Alternatives_in_rulePrimary514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_entryRuleQuantifier541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantifier548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__0_in_ruleQuantifier574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group__0_in_ruleAtomic634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTheorem_in_entryRuleTheorem721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTheorem728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__0_in_ruleTheorem754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_3_0__0_in_rule__Input__Alternatives_3790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_3_1__0_in_rule__Input__Alternatives_3808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Input__TaskAlternatives_3_0_0_0842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Input__TaskAlternatives_3_0_0_0862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_0__0_in_rule__Declaration__Alternatives896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__VarNameAssignment_1_in_rule__Declaration__Alternatives914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rule__Primary__Alternatives947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_rule__Primary__Alternatives964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_2__0_in_rule__Primary__Alternatives981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__Primary__Alternatives999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Quantifier__QuantifierAlternatives_0_01032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Quantifier__QuantifierAlternatives_0_01052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BooleanLiteral__ValueAlternatives_01087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BooleanLiteral__ValueAlternatives_01107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__01139 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Input__Group__1_in_rule__Input__Group__01142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Input__Group__0__Impl1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__11201 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Input__Group__2_in_rule__Input__Group__11204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__GivenAssignment_1_in_rule__Input__Group__1__Impl1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__2__Impl_in_rule__Input__Group__21261 = new BitSet(new long[]{0x0000000040001800L});
    public static final BitSet FOLLOW_rule__Input__Group__3_in_rule__Input__Group__21264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Input__Group__2__Impl1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__3__Impl_in_rule__Input__Group__31323 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Input__Group__4_in_rule__Input__Group__31326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Alternatives_3_in_rule__Input__Group__3__Impl1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__4__Impl_in_rule__Input__Group__41383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_4__0_in_rule__Input__Group__4__Impl1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_3_0__0__Impl_in_rule__Input__Group_3_0__01451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Input__Group_3_0__1_in_rule__Input__Group_3_0__01454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__TaskAssignment_3_0_0_in_rule__Input__Group_3_0__0__Impl1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_3_0__1__Impl_in_rule__Input__Group_3_0__11511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__GoalAssignment_3_0_1_in_rule__Input__Group_3_0__1__Impl1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_3_1__0__Impl_in_rule__Input__Group_3_1__01572 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Input__Group_3_1__1_in_rule__Input__Group_3_1__01575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__TaskAssignment_3_1_0_in_rule__Input__Group_3_1__0__Impl1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_3_1__1__Impl_in_rule__Input__Group_3_1__11632 = new BitSet(new long[]{0x000000000009E010L});
    public static final BitSet FOLLOW_rule__Input__Group_3_1__2_in_rule__Input__Group_3_1__11635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Input__Group_3_1__1__Impl1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_3_1__2__Impl_in_rule__Input__Group_3_1__21694 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Input__Group_3_1__3_in_rule__Input__Group_3_1__21697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__GoalAssignment_3_1_2_in_rule__Input__Group_3_1__2__Impl1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_3_1__3__Impl_in_rule__Input__Group_3_1__31754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Input__Group_3_1__3__Impl1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_4__0__Impl_in_rule__Input__Group_4__01821 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Input__Group_4__1_in_rule__Input__Group_4__01824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Input__Group_4__0__Impl1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_4__1__Impl_in_rule__Input__Group_4__11883 = new BitSet(new long[]{0x000000000009E010L});
    public static final BitSet FOLLOW_rule__Input__Group_4__2_in_rule__Input__Group_4__11886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Input__Group_4__1__Impl1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_4__2__Impl_in_rule__Input__Group_4__21945 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Input__Group_4__3_in_rule__Input__Group_4__21948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__TheoremsAssignment_4_2_in_rule__Input__Group_4__2__Impl1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_4__3__Impl_in_rule__Input__Group_4__32005 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Input__Group_4__4_in_rule__Input__Group_4__32008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_4_3__0_in_rule__Input__Group_4__3__Impl2035 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Input__Group_4__4__Impl_in_rule__Input__Group_4__42066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Input__Group_4__4__Impl2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_4_3__0__Impl_in_rule__Input__Group_4_3__02138 = new BitSet(new long[]{0x000000000009E010L});
    public static final BitSet FOLLOW_rule__Input__Group_4_3__1_in_rule__Input__Group_4_3__02141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Input__Group_4_3__0__Impl2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_4_3__1__Impl_in_rule__Input__Group_4_3__12200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__TheoremsAssignment_4_3_1_in_rule__Input__Group_4_3__1__Impl2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group__0__Impl_in_rule__Problem__Group__02261 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__Problem__Group__1_in_rule__Problem__Group__02264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__VarsAssignment_0_in_rule__Problem__Group__0__Impl2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group__1__Impl_in_rule__Problem__Group__12321 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__Problem__Group__2_in_rule__Problem__Group__12324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group_1__0_in_rule__Problem__Group__1__Impl2351 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Problem__Group__2__Impl_in_rule__Problem__Group__22382 = new BitSet(new long[]{0x000000000009E010L});
    public static final BitSet FOLLOW_rule__Problem__Group__3_in_rule__Problem__Group__22385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Problem__Group__2__Impl2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group__3__Impl_in_rule__Problem__Group__32444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__PropertyAssignment_3_in_rule__Problem__Group__3__Impl2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group_1__0__Impl_in_rule__Problem__Group_1__02509 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Problem__Group_1__1_in_rule__Problem__Group_1__02512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Problem__Group_1__0__Impl2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group_1__1__Impl_in_rule__Problem__Group_1__12571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__VarsAssignment_1_1_in_rule__Problem__Group_1__1__Impl2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_0__0__Impl_in_rule__Declaration__Group_0__02632 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Declaration__Group_0__1_in_rule__Declaration__Group_0__02635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__TypeAssignment_0_0_in_rule__Declaration__Group_0__0__Impl2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_0__1__Impl_in_rule__Declaration__Group_0__12692 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Declaration__Group_0__2_in_rule__Declaration__Group_0__12695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Declaration__Group_0__1__Impl2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_0__2__Impl_in_rule__Declaration__Group_0__22754 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Declaration__Group_0__3_in_rule__Declaration__Group_0__22757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__VarNameAssignment_0_2_in_rule__Declaration__Group_0__2__Impl2784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_0__3__Impl_in_rule__Declaration__Group_0__32814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Declaration__Group_0__3__Impl2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__02881 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Type__Group__1_in_rule__Type__Group__02884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__NameAssignment_0_in_rule__Type__Group__0__Impl2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__12941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__0_in_rule__Type__Group__1__Impl2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__0__Impl_in_rule__Type__Group_1__03003 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Type__Group_1__1_in_rule__Type__Group_1__03006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Type__Group_1__0__Impl3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__1__Impl_in_rule__Type__Group_1__13065 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Type__Group_1__2_in_rule__Type__Group_1__13068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__TemplateTypeAssignment_1_1_in_rule__Type__Group_1__1__Impl3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__2__Impl_in_rule__Type__Group_1__23125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Type__Group_1__2__Impl3153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORing__Group__0__Impl_in_rule__ORing__Group__03190 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ORing__Group__1_in_rule__ORing__Group__03193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANDing_in_rule__ORing__Group__0__Impl3220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORing__Group__1__Impl_in_rule__ORing__Group__13249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORing__Group_1__0_in_rule__ORing__Group__1__Impl3276 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__ORing__Group_1__0__Impl_in_rule__ORing__Group_1__03311 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ORing__Group_1__1_in_rule__ORing__Group_1__03314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORing__Group_1__1__Impl_in_rule__ORing__Group_1__13372 = new BitSet(new long[]{0x000000000009E010L});
    public static final BitSet FOLLOW_rule__ORing__Group_1__2_in_rule__ORing__Group_1__13375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ORing__Group_1__1__Impl3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORing__Group_1__2__Impl_in_rule__ORing__Group_1__23434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORing__RightAssignment_1_2_in_rule__ORing__Group_1__2__Impl3461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANDing__Group__0__Impl_in_rule__ANDing__Group__03497 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ANDing__Group__1_in_rule__ANDing__Group__03500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__ANDing__Group__0__Impl3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANDing__Group__1__Impl_in_rule__ANDing__Group__13556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANDing__Group_1__0_in_rule__ANDing__Group__1__Impl3583 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__ANDing__Group_1__0__Impl_in_rule__ANDing__Group_1__03618 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ANDing__Group_1__1_in_rule__ANDing__Group_1__03621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANDing__Group_1__1__Impl_in_rule__ANDing__Group_1__13679 = new BitSet(new long[]{0x000000000009E010L});
    public static final BitSet FOLLOW_rule__ANDing__Group_1__2_in_rule__ANDing__Group_1__13682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ANDing__Group_1__1__Impl3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANDing__Group_1__2__Impl_in_rule__ANDing__Group_1__23741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANDing__RightAssignment_1_2_in_rule__ANDing__Group_1__2__Impl3768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_2__0__Impl_in_rule__Primary__Group_2__03804 = new BitSet(new long[]{0x000000000009E010L});
    public static final BitSet FOLLOW_rule__Primary__Group_2__1_in_rule__Primary__Group_2__03807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Primary__Group_2__0__Impl3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_2__1__Impl_in_rule__Primary__Group_2__13866 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Primary__Group_2__2_in_rule__Primary__Group_2__13869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_rule__Primary__Group_2__1__Impl3896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_2__2__Impl_in_rule__Primary__Group_2__23925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Primary__Group_2__2__Impl3953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__0__Impl_in_rule__Quantifier__Group__03990 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__1_in_rule__Quantifier__Group__03993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__QuantifierAssignment_0_in_rule__Quantifier__Group__0__Impl4020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__1__Impl_in_rule__Quantifier__Group__14050 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__2_in_rule__Quantifier__Group__14053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Quantifier__Group__1__Impl4081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__2__Impl_in_rule__Quantifier__Group__24112 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__3_in_rule__Quantifier__Group__24115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__SubjectAssignment_2_in_rule__Quantifier__Group__2__Impl4142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__3__Impl_in_rule__Quantifier__Group__34172 = new BitSet(new long[]{0x000000000009E010L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__4_in_rule__Quantifier__Group__34175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Quantifier__Group__3__Impl4203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__4__Impl_in_rule__Quantifier__Group__44234 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__5_in_rule__Quantifier__Group__44237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__PredicateAssignment_4_in_rule__Quantifier__Group__4__Impl4264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__5__Impl_in_rule__Quantifier__Group__54294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Quantifier__Group__5__Impl4322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group__0__Impl_in_rule__Atomic__Group__04365 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Atomic__Group__1_in_rule__Atomic__Group__04368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__FunctionAssignment_0_in_rule__Atomic__Group__0__Impl4395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group__1__Impl_in_rule__Atomic__Group__14425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Group__1__Impl4452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__04487 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__04490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Atomic__Group_1__0__Impl4518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__14549 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__2_in_rule__Atomic__Group_1__14552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1_1__0_in_rule__Atomic__Group_1__1__Impl4579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__2__Impl_in_rule__Atomic__Group_1__24610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Atomic__Group_1__2__Impl4638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1_1__0__Impl_in_rule__Atomic__Group_1_1__04675 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1_1__1_in_rule__Atomic__Group_1_1__04678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ArgsAssignment_1_1_0_in_rule__Atomic__Group_1_1__0__Impl4705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1_1__1__Impl_in_rule__Atomic__Group_1_1__14735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1_1_1__0_in_rule__Atomic__Group_1_1__1__Impl4762 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1_1_1__0__Impl_in_rule__Atomic__Group_1_1_1__04797 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1_1_1__1_in_rule__Atomic__Group_1_1_1__04800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Atomic__Group_1_1_1__0__Impl4828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1_1_1__1__Impl_in_rule__Atomic__Group_1_1_1__14859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ArgsAssignment_1_1_1_1_in_rule__Atomic__Group_1_1_1__1__Impl4886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__0__Impl_in_rule__Theorem__Group__04920 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Theorem__Group__1_in_rule__Theorem__Group__04923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__RequirementAssignment_0_in_rule__Theorem__Group__0__Impl4950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__1__Impl_in_rule__Theorem__Group__14980 = new BitSet(new long[]{0x000000000009E010L});
    public static final BitSet FOLLOW_rule__Theorem__Group__2_in_rule__Theorem__Group__14983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Theorem__Group__1__Impl5011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__2__Impl_in_rule__Theorem__Group__25042 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Theorem__Group__3_in_rule__Theorem__Group__25045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__ResultAssignment_2_in_rule__Theorem__Group__2__Impl5072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__3__Impl_in_rule__Theorem__Group__35102 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Theorem__Group__4_in_rule__Theorem__Group__35105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Theorem__Group__3__Impl5133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__4__Impl_in_rule__Theorem__Group__45164 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Theorem__Group__5_in_rule__Theorem__Group__45167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__CostAssignment_4_in_rule__Theorem__Group__4__Impl5194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__5__Impl_in_rule__Theorem__Group__55224 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Theorem__Group__6_in_rule__Theorem__Group__55227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Theorem__Group__5__Impl5255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__6__Impl_in_rule__Theorem__Group__65286 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Theorem__Group__7_in_rule__Theorem__Group__65289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__DescriptionAssignment_6_in_rule__Theorem__Group__6__Impl5316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__7__Impl_in_rule__Theorem__Group__75346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group_7__0_in_rule__Theorem__Group__7__Impl5373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group_7__0__Impl_in_rule__Theorem__Group_7__05420 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Theorem__Group_7__1_in_rule__Theorem__Group_7__05423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Theorem__Group_7__0__Impl5451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group_7__1__Impl_in_rule__Theorem__Group_7__15482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__PseudoCodeAssignment_7_1_in_rule__Theorem__Group_7__1__Impl5509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblem_in_rule__Input__GivenAssignment_15548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__TaskAlternatives_3_0_0_0_in_rule__Input__TaskAssignment_3_0_05579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblem_in_rule__Input__GoalAssignment_3_0_15612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Input__TaskAssignment_3_1_05648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblemNoVars_in_rule__Input__GoalAssignment_3_1_25687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTheorem_in_rule__Input__TheoremsAssignment_4_25718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTheorem_in_rule__Input__TheoremsAssignment_4_3_15749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_rule__ProblemNoVars__PropertyAssignment5780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__Problem__VarsAssignment_05811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__Problem__VarsAssignment_1_15842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_rule__Problem__PropertyAssignment_35873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Declaration__TypeAssignment_0_05904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Declaration__VarNameAssignment_0_25935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Declaration__VarNameAssignment_15966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Type__NameAssignment_05997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Type__TemplateTypeAssignment_1_16028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANDing_in_rule__ORing__RightAssignment_1_26059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__ANDing__RightAssignment_1_26090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__QuantifierAlternatives_0_0_in_rule__Quantifier__QuantifierAssignment_06121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblem_in_rule__Quantifier__SubjectAssignment_26154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_rule__Quantifier__PredicateAssignment_46185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Atomic__FunctionAssignment_06216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Atomic__ArgsAssignment_1_1_06247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Atomic__ArgsAssignment_1_1_1_16278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAlternatives_0_in_rule__BooleanLiteral__ValueAssignment6309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_rule__Theorem__RequirementAssignment_06342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_rule__Theorem__ResultAssignment_26373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Theorem__CostAssignment_46404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Theorem__DescriptionAssignment_66435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Theorem__PseudoCodeAssignment_7_16466 = new BitSet(new long[]{0x0000000000000002L});

}