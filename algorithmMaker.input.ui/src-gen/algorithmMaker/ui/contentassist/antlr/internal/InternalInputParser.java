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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Find'", "'Count'", "'forall'", "'exists'", "'TRUE'", "'FALSE'", "'+'", "'-'", "'*'", "'/'", "'Given'", "';'", "'('", "')'", "'Theorems:'", "','", "'st'", "'<'", "'>'", "'|'", "'&'", "'{'", "'}'", "'!'", "':'", "'->'", "'Test'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:153:1: ruleDeclaration : ( ( rule__Declaration__Group__0 ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:157:2: ( ( ( rule__Declaration__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:158:1: ( ( rule__Declaration__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:158:1: ( ( rule__Declaration__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:159:1: ( rule__Declaration__Group__0 )
            {
             before(grammarAccess.getDeclarationAccess().getGroup()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:160:1: ( rule__Declaration__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:160:2: rule__Declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0_in_ruleDeclaration274);
            rule__Declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleProblemShell"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:284:1: entryRuleProblemShell : ruleProblemShell EOF ;
    public final void entryRuleProblemShell() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:285:1: ( ruleProblemShell EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:286:1: ruleProblemShell EOF
            {
             before(grammarAccess.getProblemShellRule()); 
            pushFollow(FOLLOW_ruleProblemShell_in_entryRuleProblemShell541);
            ruleProblemShell();

            state._fsp--;

             after(grammarAccess.getProblemShellRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProblemShell548); 

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
    // $ANTLR end "entryRuleProblemShell"


    // $ANTLR start "ruleProblemShell"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:293:1: ruleProblemShell : ( ( rule__ProblemShell__Group__0 ) ) ;
    public final void ruleProblemShell() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:297:2: ( ( ( rule__ProblemShell__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:298:1: ( ( rule__ProblemShell__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:298:1: ( ( rule__ProblemShell__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:299:1: ( rule__ProblemShell__Group__0 )
            {
             before(grammarAccess.getProblemShellAccess().getGroup()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:300:1: ( rule__ProblemShell__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:300:2: rule__ProblemShell__Group__0
            {
            pushFollow(FOLLOW_rule__ProblemShell__Group__0_in_ruleProblemShell574);
            rule__ProblemShell__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProblemShellAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProblemShell"


    // $ANTLR start "entryRuleNegation"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:312:1: entryRuleNegation : ruleNegation EOF ;
    public final void entryRuleNegation() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:313:1: ( ruleNegation EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:314:1: ruleNegation EOF
            {
             before(grammarAccess.getNegationRule()); 
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation601);
            ruleNegation();

            state._fsp--;

             after(grammarAccess.getNegationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation608); 

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
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:321:1: ruleNegation : ( ( rule__Negation__Group__0 ) ) ;
    public final void ruleNegation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:325:2: ( ( ( rule__Negation__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:326:1: ( ( rule__Negation__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:326:1: ( ( rule__Negation__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:327:1: ( rule__Negation__Group__0 )
            {
             before(grammarAccess.getNegationAccess().getGroup()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:328:1: ( rule__Negation__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:328:2: rule__Negation__Group__0
            {
            pushFollow(FOLLOW_rule__Negation__Group__0_in_ruleNegation634);
            rule__Negation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNegationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNegation"


    // $ANTLR start "entryRuleQuantifier"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:340:1: entryRuleQuantifier : ruleQuantifier EOF ;
    public final void entryRuleQuantifier() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:341:1: ( ruleQuantifier EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:342:1: ruleQuantifier EOF
            {
             before(grammarAccess.getQuantifierRule()); 
            pushFollow(FOLLOW_ruleQuantifier_in_entryRuleQuantifier661);
            ruleQuantifier();

            state._fsp--;

             after(grammarAccess.getQuantifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantifier668); 

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:349:1: ruleQuantifier : ( ( rule__Quantifier__Group__0 ) ) ;
    public final void ruleQuantifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:353:2: ( ( ( rule__Quantifier__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:354:1: ( ( rule__Quantifier__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:354:1: ( ( rule__Quantifier__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:355:1: ( rule__Quantifier__Group__0 )
            {
             before(grammarAccess.getQuantifierAccess().getGroup()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:356:1: ( rule__Quantifier__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:356:2: rule__Quantifier__Group__0
            {
            pushFollow(FOLLOW_rule__Quantifier__Group__0_in_ruleQuantifier694);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:368:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:369:1: ( ruleAtomic EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:370:1: ruleAtomic EOF
            {
             before(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic721);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getAtomicRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic728); 

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:377:1: ruleAtomic : ( ( rule__Atomic__Group__0 ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:381:2: ( ( ( rule__Atomic__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:382:1: ( ( rule__Atomic__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:382:1: ( ( rule__Atomic__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:383:1: ( rule__Atomic__Group__0 )
            {
             before(grammarAccess.getAtomicAccess().getGroup()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:384:1: ( rule__Atomic__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:384:2: rule__Atomic__Group__0
            {
            pushFollow(FOLLOW_rule__Atomic__Group__0_in_ruleAtomic754);
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


    // $ANTLR start "entryRuleArgument"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:396:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:397:1: ( ruleArgument EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:398:1: ruleArgument EOF
            {
             before(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument781);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getArgumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument788); 

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
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:405:1: ruleArgument : ( ruleAddition ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:409:2: ( ( ruleAddition ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:410:1: ( ruleAddition )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:410:1: ( ruleAddition )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:411:1: ruleAddition
            {
             before(grammarAccess.getArgumentAccess().getAdditionParserRuleCall()); 
            pushFollow(FOLLOW_ruleAddition_in_ruleArgument814);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getArgumentAccess().getAdditionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleVariable"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:424:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:425:1: ( ruleVariable EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:426:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable840);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable847); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:433:1: ruleVariable : ( ( rule__Variable__ArgAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:437:2: ( ( ( rule__Variable__ArgAssignment ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:438:1: ( ( rule__Variable__ArgAssignment ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:438:1: ( ( rule__Variable__ArgAssignment ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:439:1: ( rule__Variable__ArgAssignment )
            {
             before(grammarAccess.getVariableAccess().getArgAssignment()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:440:1: ( rule__Variable__ArgAssignment )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:440:2: rule__Variable__ArgAssignment
            {
            pushFollow(FOLLOW_rule__Variable__ArgAssignment_in_ruleVariable873);
            rule__Variable__ArgAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getArgAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:452:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:453:1: ( ruleBooleanLiteral EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:454:1: ruleBooleanLiteral EOF
            {
             before(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral900);
            ruleBooleanLiteral();

            state._fsp--;

             after(grammarAccess.getBooleanLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral907); 

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:461:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__ValueAssignment ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:465:2: ( ( ( rule__BooleanLiteral__ValueAssignment ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:466:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:466:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:467:1: ( rule__BooleanLiteral__ValueAssignment )
            {
             before(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:468:1: ( rule__BooleanLiteral__ValueAssignment )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:468:2: rule__BooleanLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral933);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:480:1: entryRuleTheorem : ruleTheorem EOF ;
    public final void entryRuleTheorem() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:481:1: ( ruleTheorem EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:482:1: ruleTheorem EOF
            {
             before(grammarAccess.getTheoremRule()); 
            pushFollow(FOLLOW_ruleTheorem_in_entryRuleTheorem960);
            ruleTheorem();

            state._fsp--;

             after(grammarAccess.getTheoremRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTheorem967); 

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:489:1: ruleTheorem : ( ( rule__Theorem__Group__0 ) ) ;
    public final void ruleTheorem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:493:2: ( ( ( rule__Theorem__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:494:1: ( ( rule__Theorem__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:494:1: ( ( rule__Theorem__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:495:1: ( rule__Theorem__Group__0 )
            {
             before(grammarAccess.getTheoremAccess().getGroup()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:496:1: ( rule__Theorem__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:496:2: rule__Theorem__Group__0
            {
            pushFollow(FOLLOW_rule__Theorem__Group__0_in_ruleTheorem993);
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


    // $ANTLR start "entryRuleAddition"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:508:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:509:1: ( ruleAddition EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:510:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition1020);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAdditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition1027); 

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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:517:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:521:2: ( ( ( rule__Addition__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:522:1: ( ( rule__Addition__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:522:1: ( ( rule__Addition__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:523:1: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:524:1: ( rule__Addition__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:524:2: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_rule__Addition__Group__0_in_ruleAddition1053);
            rule__Addition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:536:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:537:1: ( ruleMultiplication EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:538:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication1080);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getMultiplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication1087); 

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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:545:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:549:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:550:1: ( ( rule__Multiplication__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:550:1: ( ( rule__Multiplication__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:551:1: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:552:1: ( rule__Multiplication__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:552:2: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication1113);
            rule__Multiplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleNumericalPrimary"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:564:1: entryRuleNumericalPrimary : ruleNumericalPrimary EOF ;
    public final void entryRuleNumericalPrimary() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:565:1: ( ruleNumericalPrimary EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:566:1: ruleNumericalPrimary EOF
            {
             before(grammarAccess.getNumericalPrimaryRule()); 
            pushFollow(FOLLOW_ruleNumericalPrimary_in_entryRuleNumericalPrimary1140);
            ruleNumericalPrimary();

            state._fsp--;

             after(grammarAccess.getNumericalPrimaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalPrimary1147); 

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
    // $ANTLR end "entryRuleNumericalPrimary"


    // $ANTLR start "ruleNumericalPrimary"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:573:1: ruleNumericalPrimary : ( ( rule__NumericalPrimary__Alternatives ) ) ;
    public final void ruleNumericalPrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:577:2: ( ( ( rule__NumericalPrimary__Alternatives ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:578:1: ( ( rule__NumericalPrimary__Alternatives ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:578:1: ( ( rule__NumericalPrimary__Alternatives ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:579:1: ( rule__NumericalPrimary__Alternatives )
            {
             before(grammarAccess.getNumericalPrimaryAccess().getAlternatives()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:580:1: ( rule__NumericalPrimary__Alternatives )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:580:2: rule__NumericalPrimary__Alternatives
            {
            pushFollow(FOLLOW_rule__NumericalPrimary__Alternatives_in_ruleNumericalPrimary1173);
            rule__NumericalPrimary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumericalPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumericalPrimary"


    // $ANTLR start "entryRuleNumberLiteral"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:592:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:593:1: ( ruleNumberLiteral EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:594:1: ruleNumberLiteral EOF
            {
             before(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral1200);
            ruleNumberLiteral();

            state._fsp--;

             after(grammarAccess.getNumberLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral1207); 

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
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:601:1: ruleNumberLiteral : ( ( rule__NumberLiteral__ValueAssignment ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:605:2: ( ( ( rule__NumberLiteral__ValueAssignment ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:606:1: ( ( rule__NumberLiteral__ValueAssignment ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:606:1: ( ( rule__NumberLiteral__ValueAssignment ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:607:1: ( rule__NumberLiteral__ValueAssignment )
            {
             before(grammarAccess.getNumberLiteralAccess().getValueAssignment()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:608:1: ( rule__NumberLiteral__ValueAssignment )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:608:2: rule__NumberLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__NumberLiteral__ValueAssignment_in_ruleNumberLiteral1233);
            rule__NumberLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "rule__Input__Alternatives_3"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:620:1: rule__Input__Alternatives_3 : ( ( ( rule__Input__Group_3_0__0 ) ) | ( ( rule__Input__Group_3_1__0 ) ) );
    public final void rule__Input__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:624:1: ( ( ( rule__Input__Group_3_0__0 ) ) | ( ( rule__Input__Group_3_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                alt1=1;
            }
            else if ( (LA1_0==37) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:625:1: ( ( rule__Input__Group_3_0__0 ) )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:625:1: ( ( rule__Input__Group_3_0__0 ) )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:626:1: ( rule__Input__Group_3_0__0 )
                    {
                     before(grammarAccess.getInputAccess().getGroup_3_0()); 
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:627:1: ( rule__Input__Group_3_0__0 )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:627:2: rule__Input__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__Input__Group_3_0__0_in_rule__Input__Alternatives_31269);
                    rule__Input__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInputAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:631:6: ( ( rule__Input__Group_3_1__0 ) )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:631:6: ( ( rule__Input__Group_3_1__0 ) )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:632:1: ( rule__Input__Group_3_1__0 )
                    {
                     before(grammarAccess.getInputAccess().getGroup_3_1()); 
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:633:1: ( rule__Input__Group_3_1__0 )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:633:2: rule__Input__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Input__Group_3_1__0_in_rule__Input__Alternatives_31287);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:642:1: rule__Input__TaskAlternatives_3_0_0_0 : ( ( 'Find' ) | ( 'Count' ) );
    public final void rule__Input__TaskAlternatives_3_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:646:1: ( ( 'Find' ) | ( 'Count' ) )
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
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:647:1: ( 'Find' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:647:1: ( 'Find' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:648:1: 'Find'
                    {
                     before(grammarAccess.getInputAccess().getTaskFindKeyword_3_0_0_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Input__TaskAlternatives_3_0_0_01321); 
                     after(grammarAccess.getInputAccess().getTaskFindKeyword_3_0_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:655:6: ( 'Count' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:655:6: ( 'Count' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:656:1: 'Count'
                    {
                     before(grammarAccess.getInputAccess().getTaskCountKeyword_3_0_0_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Input__TaskAlternatives_3_0_0_01341); 
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


    // $ANTLR start "rule__Declaration__Alternatives_1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:668:1: rule__Declaration__Alternatives_1 : ( ( ( rule__Declaration__VarNameAssignment_1_0 ) ) | ( ( rule__Declaration__Group_1_1__0 ) ) );
    public final void rule__Declaration__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:672:1: ( ( ( rule__Declaration__VarNameAssignment_1_0 ) ) | ( ( rule__Declaration__Group_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==23) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:673:1: ( ( rule__Declaration__VarNameAssignment_1_0 ) )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:673:1: ( ( rule__Declaration__VarNameAssignment_1_0 ) )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:674:1: ( rule__Declaration__VarNameAssignment_1_0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getVarNameAssignment_1_0()); 
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:675:1: ( rule__Declaration__VarNameAssignment_1_0 )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:675:2: rule__Declaration__VarNameAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Declaration__VarNameAssignment_1_0_in_rule__Declaration__Alternatives_11375);
                    rule__Declaration__VarNameAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclarationAccess().getVarNameAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:679:6: ( ( rule__Declaration__Group_1_1__0 ) )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:679:6: ( ( rule__Declaration__Group_1_1__0 ) )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:680:1: ( rule__Declaration__Group_1_1__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_1_1()); 
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:681:1: ( rule__Declaration__Group_1_1__0 )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:681:2: rule__Declaration__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Declaration__Group_1_1__0_in_rule__Declaration__Alternatives_11393);
                    rule__Declaration__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclarationAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__Declaration__Alternatives_1"


    // $ANTLR start "rule__Primary__Alternatives"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:690:1: rule__Primary__Alternatives : ( ( ruleAtomic ) | ( ruleQuantifier ) | ( ruleProblemShell ) | ( ( rule__Primary__Group_3__0 ) ) | ( ruleBooleanLiteral ) | ( ruleNegation ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:694:1: ( ( ruleAtomic ) | ( ruleQuantifier ) | ( ruleProblemShell ) | ( ( rule__Primary__Group_3__0 ) ) | ( ruleBooleanLiteral ) | ( ruleNegation ) )
            int alt4=6;
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
            case 32:
                {
                alt4=3;
                }
                break;
            case 23:
                {
                alt4=4;
                }
                break;
            case 15:
            case 16:
                {
                alt4=5;
                }
                break;
            case 34:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:695:1: ( ruleAtomic )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:695:1: ( ruleAtomic )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:696:1: ruleAtomic
                    {
                     before(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAtomic_in_rule__Primary__Alternatives1426);
                    ruleAtomic();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:701:6: ( ruleQuantifier )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:701:6: ( ruleQuantifier )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:702:1: ruleQuantifier
                    {
                     before(grammarAccess.getPrimaryAccess().getQuantifierParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleQuantifier_in_rule__Primary__Alternatives1443);
                    ruleQuantifier();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getQuantifierParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:707:6: ( ruleProblemShell )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:707:6: ( ruleProblemShell )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:708:1: ruleProblemShell
                    {
                     before(grammarAccess.getPrimaryAccess().getProblemShellParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleProblemShell_in_rule__Primary__Alternatives1460);
                    ruleProblemShell();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getProblemShellParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:713:6: ( ( rule__Primary__Group_3__0 ) )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:713:6: ( ( rule__Primary__Group_3__0 ) )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:714:1: ( rule__Primary__Group_3__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_3()); 
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:715:1: ( rule__Primary__Group_3__0 )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:715:2: rule__Primary__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Primary__Group_3__0_in_rule__Primary__Alternatives1477);
                    rule__Primary__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:719:6: ( ruleBooleanLiteral )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:719:6: ( ruleBooleanLiteral )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:720:1: ruleBooleanLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getBooleanLiteralParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_rule__Primary__Alternatives1495);
                    ruleBooleanLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getBooleanLiteralParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:725:6: ( ruleNegation )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:725:6: ( ruleNegation )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:726:1: ruleNegation
                    {
                     before(grammarAccess.getPrimaryAccess().getNegationParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleNegation_in_rule__Primary__Alternatives1512);
                    ruleNegation();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getNegationParserRuleCall_5()); 

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:736:1: rule__Quantifier__QuantifierAlternatives_0_0 : ( ( 'forall' ) | ( 'exists' ) );
    public final void rule__Quantifier__QuantifierAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:740:1: ( ( 'forall' ) | ( 'exists' ) )
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
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:741:1: ( 'forall' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:741:1: ( 'forall' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:742:1: 'forall'
                    {
                     before(grammarAccess.getQuantifierAccess().getQuantifierForallKeyword_0_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__Quantifier__QuantifierAlternatives_0_01545); 
                     after(grammarAccess.getQuantifierAccess().getQuantifierForallKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:749:6: ( 'exists' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:749:6: ( 'exists' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:750:1: 'exists'
                    {
                     before(grammarAccess.getQuantifierAccess().getQuantifierExistsKeyword_0_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__Quantifier__QuantifierAlternatives_0_01565); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:762:1: rule__BooleanLiteral__ValueAlternatives_0 : ( ( 'TRUE' ) | ( 'FALSE' ) );
    public final void rule__BooleanLiteral__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:766:1: ( ( 'TRUE' ) | ( 'FALSE' ) )
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
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:767:1: ( 'TRUE' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:767:1: ( 'TRUE' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:768:1: 'TRUE'
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getValueTRUEKeyword_0_0()); 
                    match(input,15,FOLLOW_15_in_rule__BooleanLiteral__ValueAlternatives_01600); 
                     after(grammarAccess.getBooleanLiteralAccess().getValueTRUEKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:775:6: ( 'FALSE' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:775:6: ( 'FALSE' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:776:1: 'FALSE'
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getValueFALSEKeyword_0_1()); 
                    match(input,16,FOLLOW_16_in_rule__BooleanLiteral__ValueAlternatives_01620); 
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


    // $ANTLR start "rule__Addition__SymbolAlternatives_1_1_0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:788:1: rule__Addition__SymbolAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__SymbolAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:792:1: ( ( '+' ) | ( '-' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:793:1: ( '+' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:793:1: ( '+' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:794:1: '+'
                    {
                     before(grammarAccess.getAdditionAccess().getSymbolPlusSignKeyword_1_1_0_0()); 
                    match(input,17,FOLLOW_17_in_rule__Addition__SymbolAlternatives_1_1_01655); 
                     after(grammarAccess.getAdditionAccess().getSymbolPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:801:6: ( '-' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:801:6: ( '-' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:802:1: '-'
                    {
                     before(grammarAccess.getAdditionAccess().getSymbolHyphenMinusKeyword_1_1_0_1()); 
                    match(input,18,FOLLOW_18_in_rule__Addition__SymbolAlternatives_1_1_01675); 
                     after(grammarAccess.getAdditionAccess().getSymbolHyphenMinusKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__Addition__SymbolAlternatives_1_1_0"


    // $ANTLR start "rule__Multiplication__SymbolAlternatives_1_1_0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:814:1: rule__Multiplication__SymbolAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Multiplication__SymbolAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:818:1: ( ( '*' ) | ( '/' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:819:1: ( '*' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:819:1: ( '*' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:820:1: '*'
                    {
                     before(grammarAccess.getMultiplicationAccess().getSymbolAsteriskKeyword_1_1_0_0()); 
                    match(input,19,FOLLOW_19_in_rule__Multiplication__SymbolAlternatives_1_1_01710); 
                     after(grammarAccess.getMultiplicationAccess().getSymbolAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:827:6: ( '/' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:827:6: ( '/' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:828:1: '/'
                    {
                     before(grammarAccess.getMultiplicationAccess().getSymbolSolidusKeyword_1_1_0_1()); 
                    match(input,20,FOLLOW_20_in_rule__Multiplication__SymbolAlternatives_1_1_01730); 
                     after(grammarAccess.getMultiplicationAccess().getSymbolSolidusKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__Multiplication__SymbolAlternatives_1_1_0"


    // $ANTLR start "rule__NumericalPrimary__Alternatives"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:840:1: rule__NumericalPrimary__Alternatives : ( ( ruleNumberLiteral ) | ( ruleAtomic ) | ( ( rule__NumericalPrimary__Group_2__0 ) ) | ( ruleVariable ) );
    public final void rule__NumericalPrimary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:844:1: ( ( ruleNumberLiteral ) | ( ruleAtomic ) | ( ( rule__NumericalPrimary__Group_2__0 ) ) | ( ruleVariable ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt9=1;
                }
                break;
            case RULE_ID:
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==EOF||(LA9_2>=17 && LA9_2<=20)||LA9_2==24||LA9_2==26) ) {
                    alt9=4;
                }
                else if ( (LA9_2==23) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:845:1: ( ruleNumberLiteral )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:845:1: ( ruleNumberLiteral )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:846:1: ruleNumberLiteral
                    {
                     before(grammarAccess.getNumericalPrimaryAccess().getNumberLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNumberLiteral_in_rule__NumericalPrimary__Alternatives1764);
                    ruleNumberLiteral();

                    state._fsp--;

                     after(grammarAccess.getNumericalPrimaryAccess().getNumberLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:851:6: ( ruleAtomic )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:851:6: ( ruleAtomic )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:852:1: ruleAtomic
                    {
                     before(grammarAccess.getNumericalPrimaryAccess().getAtomicParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAtomic_in_rule__NumericalPrimary__Alternatives1781);
                    ruleAtomic();

                    state._fsp--;

                     after(grammarAccess.getNumericalPrimaryAccess().getAtomicParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:857:6: ( ( rule__NumericalPrimary__Group_2__0 ) )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:857:6: ( ( rule__NumericalPrimary__Group_2__0 ) )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:858:1: ( rule__NumericalPrimary__Group_2__0 )
                    {
                     before(grammarAccess.getNumericalPrimaryAccess().getGroup_2()); 
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:859:1: ( rule__NumericalPrimary__Group_2__0 )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:859:2: rule__NumericalPrimary__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__NumericalPrimary__Group_2__0_in_rule__NumericalPrimary__Alternatives1798);
                    rule__NumericalPrimary__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNumericalPrimaryAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:863:6: ( ruleVariable )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:863:6: ( ruleVariable )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:864:1: ruleVariable
                    {
                     before(grammarAccess.getNumericalPrimaryAccess().getVariableParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleVariable_in_rule__NumericalPrimary__Alternatives1816);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getNumericalPrimaryAccess().getVariableParserRuleCall_3()); 

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
    // $ANTLR end "rule__NumericalPrimary__Alternatives"


    // $ANTLR start "rule__Input__Group__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:876:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:880:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:881:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__01846);
            rule__Input__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__1_in_rule__Input__Group__01849);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:888:1: rule__Input__Group__0__Impl : ( 'Given' ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:892:1: ( ( 'Given' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:893:1: ( 'Given' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:893:1: ( 'Given' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:894:1: 'Given'
            {
             before(grammarAccess.getInputAccess().getGivenKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Input__Group__0__Impl1877); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:907:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:911:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:912:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__11908);
            rule__Input__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__2_in_rule__Input__Group__11911);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:919:1: rule__Input__Group__1__Impl : ( ( rule__Input__GivenAssignment_1 ) ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:923:1: ( ( ( rule__Input__GivenAssignment_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:924:1: ( ( rule__Input__GivenAssignment_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:924:1: ( ( rule__Input__GivenAssignment_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:925:1: ( rule__Input__GivenAssignment_1 )
            {
             before(grammarAccess.getInputAccess().getGivenAssignment_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:926:1: ( rule__Input__GivenAssignment_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:926:2: rule__Input__GivenAssignment_1
            {
            pushFollow(FOLLOW_rule__Input__GivenAssignment_1_in_rule__Input__Group__1__Impl1938);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:936:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:940:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:941:2: rule__Input__Group__2__Impl rule__Input__Group__3
            {
            pushFollow(FOLLOW_rule__Input__Group__2__Impl_in_rule__Input__Group__21968);
            rule__Input__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__3_in_rule__Input__Group__21971);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:948:1: rule__Input__Group__2__Impl : ( ';' ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:952:1: ( ( ';' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:953:1: ( ';' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:953:1: ( ';' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:954:1: ';'
            {
             before(grammarAccess.getInputAccess().getSemicolonKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__Input__Group__2__Impl1999); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:967:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:971:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:972:2: rule__Input__Group__3__Impl rule__Input__Group__4
            {
            pushFollow(FOLLOW_rule__Input__Group__3__Impl_in_rule__Input__Group__32030);
            rule__Input__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__4_in_rule__Input__Group__32033);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:979:1: rule__Input__Group__3__Impl : ( ( rule__Input__Alternatives_3 ) ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:983:1: ( ( ( rule__Input__Alternatives_3 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:984:1: ( ( rule__Input__Alternatives_3 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:984:1: ( ( rule__Input__Alternatives_3 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:985:1: ( rule__Input__Alternatives_3 )
            {
             before(grammarAccess.getInputAccess().getAlternatives_3()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:986:1: ( rule__Input__Alternatives_3 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:986:2: rule__Input__Alternatives_3
            {
            pushFollow(FOLLOW_rule__Input__Alternatives_3_in_rule__Input__Group__3__Impl2060);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:996:1: rule__Input__Group__4 : rule__Input__Group__4__Impl ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1000:1: ( rule__Input__Group__4__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1001:2: rule__Input__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group__4__Impl_in_rule__Input__Group__42090);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1007:1: rule__Input__Group__4__Impl : ( ( rule__Input__Group_4__0 )? ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1011:1: ( ( ( rule__Input__Group_4__0 )? ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1012:1: ( ( rule__Input__Group_4__0 )? )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1012:1: ( ( rule__Input__Group_4__0 )? )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1013:1: ( rule__Input__Group_4__0 )?
            {
             before(grammarAccess.getInputAccess().getGroup_4()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1014:1: ( rule__Input__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1014:2: rule__Input__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Input__Group_4__0_in_rule__Input__Group__4__Impl2117);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1034:1: rule__Input__Group_3_0__0 : rule__Input__Group_3_0__0__Impl rule__Input__Group_3_0__1 ;
    public final void rule__Input__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1038:1: ( rule__Input__Group_3_0__0__Impl rule__Input__Group_3_0__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1039:2: rule__Input__Group_3_0__0__Impl rule__Input__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__Input__Group_3_0__0__Impl_in_rule__Input__Group_3_0__02158);
            rule__Input__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group_3_0__1_in_rule__Input__Group_3_0__02161);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1046:1: rule__Input__Group_3_0__0__Impl : ( ( rule__Input__TaskAssignment_3_0_0 ) ) ;
    public final void rule__Input__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1050:1: ( ( ( rule__Input__TaskAssignment_3_0_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1051:1: ( ( rule__Input__TaskAssignment_3_0_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1051:1: ( ( rule__Input__TaskAssignment_3_0_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1052:1: ( rule__Input__TaskAssignment_3_0_0 )
            {
             before(grammarAccess.getInputAccess().getTaskAssignment_3_0_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1053:1: ( rule__Input__TaskAssignment_3_0_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1053:2: rule__Input__TaskAssignment_3_0_0
            {
            pushFollow(FOLLOW_rule__Input__TaskAssignment_3_0_0_in_rule__Input__Group_3_0__0__Impl2188);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1063:1: rule__Input__Group_3_0__1 : rule__Input__Group_3_0__1__Impl ;
    public final void rule__Input__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1067:1: ( rule__Input__Group_3_0__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1068:2: rule__Input__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group_3_0__1__Impl_in_rule__Input__Group_3_0__12218);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1074:1: rule__Input__Group_3_0__1__Impl : ( ( rule__Input__GoalAssignment_3_0_1 ) ) ;
    public final void rule__Input__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1078:1: ( ( ( rule__Input__GoalAssignment_3_0_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1079:1: ( ( rule__Input__GoalAssignment_3_0_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1079:1: ( ( rule__Input__GoalAssignment_3_0_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1080:1: ( rule__Input__GoalAssignment_3_0_1 )
            {
             before(grammarAccess.getInputAccess().getGoalAssignment_3_0_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1081:1: ( rule__Input__GoalAssignment_3_0_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1081:2: rule__Input__GoalAssignment_3_0_1
            {
            pushFollow(FOLLOW_rule__Input__GoalAssignment_3_0_1_in_rule__Input__Group_3_0__1__Impl2245);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1095:1: rule__Input__Group_3_1__0 : rule__Input__Group_3_1__0__Impl rule__Input__Group_3_1__1 ;
    public final void rule__Input__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1099:1: ( rule__Input__Group_3_1__0__Impl rule__Input__Group_3_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1100:2: rule__Input__Group_3_1__0__Impl rule__Input__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Input__Group_3_1__0__Impl_in_rule__Input__Group_3_1__02279);
            rule__Input__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group_3_1__1_in_rule__Input__Group_3_1__02282);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1107:1: rule__Input__Group_3_1__0__Impl : ( ( rule__Input__TaskAssignment_3_1_0 ) ) ;
    public final void rule__Input__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1111:1: ( ( ( rule__Input__TaskAssignment_3_1_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1112:1: ( ( rule__Input__TaskAssignment_3_1_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1112:1: ( ( rule__Input__TaskAssignment_3_1_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1113:1: ( rule__Input__TaskAssignment_3_1_0 )
            {
             before(grammarAccess.getInputAccess().getTaskAssignment_3_1_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1114:1: ( rule__Input__TaskAssignment_3_1_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1114:2: rule__Input__TaskAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__Input__TaskAssignment_3_1_0_in_rule__Input__Group_3_1__0__Impl2309);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1124:1: rule__Input__Group_3_1__1 : rule__Input__Group_3_1__1__Impl rule__Input__Group_3_1__2 ;
    public final void rule__Input__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1128:1: ( rule__Input__Group_3_1__1__Impl rule__Input__Group_3_1__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1129:2: rule__Input__Group_3_1__1__Impl rule__Input__Group_3_1__2
            {
            pushFollow(FOLLOW_rule__Input__Group_3_1__1__Impl_in_rule__Input__Group_3_1__12339);
            rule__Input__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group_3_1__2_in_rule__Input__Group_3_1__12342);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1136:1: rule__Input__Group_3_1__1__Impl : ( '(' ) ;
    public final void rule__Input__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1140:1: ( ( '(' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1141:1: ( '(' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1141:1: ( '(' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1142:1: '('
            {
             before(grammarAccess.getInputAccess().getLeftParenthesisKeyword_3_1_1()); 
            match(input,23,FOLLOW_23_in_rule__Input__Group_3_1__1__Impl2370); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1155:1: rule__Input__Group_3_1__2 : rule__Input__Group_3_1__2__Impl rule__Input__Group_3_1__3 ;
    public final void rule__Input__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1159:1: ( rule__Input__Group_3_1__2__Impl rule__Input__Group_3_1__3 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1160:2: rule__Input__Group_3_1__2__Impl rule__Input__Group_3_1__3
            {
            pushFollow(FOLLOW_rule__Input__Group_3_1__2__Impl_in_rule__Input__Group_3_1__22401);
            rule__Input__Group_3_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group_3_1__3_in_rule__Input__Group_3_1__22404);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1167:1: rule__Input__Group_3_1__2__Impl : ( ( rule__Input__GoalAssignment_3_1_2 ) ) ;
    public final void rule__Input__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1171:1: ( ( ( rule__Input__GoalAssignment_3_1_2 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1172:1: ( ( rule__Input__GoalAssignment_3_1_2 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1172:1: ( ( rule__Input__GoalAssignment_3_1_2 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1173:1: ( rule__Input__GoalAssignment_3_1_2 )
            {
             before(grammarAccess.getInputAccess().getGoalAssignment_3_1_2()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1174:1: ( rule__Input__GoalAssignment_3_1_2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1174:2: rule__Input__GoalAssignment_3_1_2
            {
            pushFollow(FOLLOW_rule__Input__GoalAssignment_3_1_2_in_rule__Input__Group_3_1__2__Impl2431);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1184:1: rule__Input__Group_3_1__3 : rule__Input__Group_3_1__3__Impl ;
    public final void rule__Input__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1188:1: ( rule__Input__Group_3_1__3__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1189:2: rule__Input__Group_3_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group_3_1__3__Impl_in_rule__Input__Group_3_1__32461);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1195:1: rule__Input__Group_3_1__3__Impl : ( ')' ) ;
    public final void rule__Input__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1199:1: ( ( ')' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1200:1: ( ')' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1200:1: ( ')' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1201:1: ')'
            {
             before(grammarAccess.getInputAccess().getRightParenthesisKeyword_3_1_3()); 
            match(input,24,FOLLOW_24_in_rule__Input__Group_3_1__3__Impl2489); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1222:1: rule__Input__Group_4__0 : rule__Input__Group_4__0__Impl rule__Input__Group_4__1 ;
    public final void rule__Input__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1226:1: ( rule__Input__Group_4__0__Impl rule__Input__Group_4__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1227:2: rule__Input__Group_4__0__Impl rule__Input__Group_4__1
            {
            pushFollow(FOLLOW_rule__Input__Group_4__0__Impl_in_rule__Input__Group_4__02528);
            rule__Input__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group_4__1_in_rule__Input__Group_4__02531);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1234:1: rule__Input__Group_4__0__Impl : ( ';' ) ;
    public final void rule__Input__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1238:1: ( ( ';' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1239:1: ( ';' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1239:1: ( ';' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1240:1: ';'
            {
             before(grammarAccess.getInputAccess().getSemicolonKeyword_4_0()); 
            match(input,22,FOLLOW_22_in_rule__Input__Group_4__0__Impl2559); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1253:1: rule__Input__Group_4__1 : rule__Input__Group_4__1__Impl rule__Input__Group_4__2 ;
    public final void rule__Input__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1257:1: ( rule__Input__Group_4__1__Impl rule__Input__Group_4__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1258:2: rule__Input__Group_4__1__Impl rule__Input__Group_4__2
            {
            pushFollow(FOLLOW_rule__Input__Group_4__1__Impl_in_rule__Input__Group_4__12590);
            rule__Input__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group_4__2_in_rule__Input__Group_4__12593);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1265:1: rule__Input__Group_4__1__Impl : ( 'Theorems:' ) ;
    public final void rule__Input__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1269:1: ( ( 'Theorems:' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1270:1: ( 'Theorems:' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1270:1: ( 'Theorems:' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1271:1: 'Theorems:'
            {
             before(grammarAccess.getInputAccess().getTheoremsKeyword_4_1()); 
            match(input,25,FOLLOW_25_in_rule__Input__Group_4__1__Impl2621); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1284:1: rule__Input__Group_4__2 : rule__Input__Group_4__2__Impl rule__Input__Group_4__3 ;
    public final void rule__Input__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1288:1: ( rule__Input__Group_4__2__Impl rule__Input__Group_4__3 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1289:2: rule__Input__Group_4__2__Impl rule__Input__Group_4__3
            {
            pushFollow(FOLLOW_rule__Input__Group_4__2__Impl_in_rule__Input__Group_4__22652);
            rule__Input__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group_4__3_in_rule__Input__Group_4__22655);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1296:1: rule__Input__Group_4__2__Impl : ( ( rule__Input__TheoremsAssignment_4_2 ) ) ;
    public final void rule__Input__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1300:1: ( ( ( rule__Input__TheoremsAssignment_4_2 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1301:1: ( ( rule__Input__TheoremsAssignment_4_2 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1301:1: ( ( rule__Input__TheoremsAssignment_4_2 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1302:1: ( rule__Input__TheoremsAssignment_4_2 )
            {
             before(grammarAccess.getInputAccess().getTheoremsAssignment_4_2()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1303:1: ( rule__Input__TheoremsAssignment_4_2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1303:2: rule__Input__TheoremsAssignment_4_2
            {
            pushFollow(FOLLOW_rule__Input__TheoremsAssignment_4_2_in_rule__Input__Group_4__2__Impl2682);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1313:1: rule__Input__Group_4__3 : rule__Input__Group_4__3__Impl rule__Input__Group_4__4 ;
    public final void rule__Input__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1317:1: ( rule__Input__Group_4__3__Impl rule__Input__Group_4__4 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1318:2: rule__Input__Group_4__3__Impl rule__Input__Group_4__4
            {
            pushFollow(FOLLOW_rule__Input__Group_4__3__Impl_in_rule__Input__Group_4__32712);
            rule__Input__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group_4__4_in_rule__Input__Group_4__32715);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1325:1: rule__Input__Group_4__3__Impl : ( ( rule__Input__Group_4_3__0 )* ) ;
    public final void rule__Input__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1329:1: ( ( ( rule__Input__Group_4_3__0 )* ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1330:1: ( ( rule__Input__Group_4_3__0 )* )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1330:1: ( ( rule__Input__Group_4_3__0 )* )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1331:1: ( rule__Input__Group_4_3__0 )*
            {
             before(grammarAccess.getInputAccess().getGroup_4_3()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1332:1: ( rule__Input__Group_4_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==RULE_ID||(LA11_1>=13 && LA11_1<=16)||LA11_1==23||LA11_1==32||LA11_1==34) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1332:2: rule__Input__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Input__Group_4_3__0_in_rule__Input__Group_4__3__Impl2742);
            	    rule__Input__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1342:1: rule__Input__Group_4__4 : rule__Input__Group_4__4__Impl ;
    public final void rule__Input__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1346:1: ( rule__Input__Group_4__4__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1347:2: rule__Input__Group_4__4__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group_4__4__Impl_in_rule__Input__Group_4__42773);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1353:1: rule__Input__Group_4__4__Impl : ( ( ';' )? ) ;
    public final void rule__Input__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1357:1: ( ( ( ';' )? ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1358:1: ( ( ';' )? )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1358:1: ( ( ';' )? )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1359:1: ( ';' )?
            {
             before(grammarAccess.getInputAccess().getSemicolonKeyword_4_4()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1360:1: ( ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1361:2: ';'
                    {
                    match(input,22,FOLLOW_22_in_rule__Input__Group_4__4__Impl2802); 

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1382:1: rule__Input__Group_4_3__0 : rule__Input__Group_4_3__0__Impl rule__Input__Group_4_3__1 ;
    public final void rule__Input__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1386:1: ( rule__Input__Group_4_3__0__Impl rule__Input__Group_4_3__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1387:2: rule__Input__Group_4_3__0__Impl rule__Input__Group_4_3__1
            {
            pushFollow(FOLLOW_rule__Input__Group_4_3__0__Impl_in_rule__Input__Group_4_3__02845);
            rule__Input__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group_4_3__1_in_rule__Input__Group_4_3__02848);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1394:1: rule__Input__Group_4_3__0__Impl : ( ';' ) ;
    public final void rule__Input__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1398:1: ( ( ';' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1399:1: ( ';' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1399:1: ( ';' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1400:1: ';'
            {
             before(grammarAccess.getInputAccess().getSemicolonKeyword_4_3_0()); 
            match(input,22,FOLLOW_22_in_rule__Input__Group_4_3__0__Impl2876); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1413:1: rule__Input__Group_4_3__1 : rule__Input__Group_4_3__1__Impl ;
    public final void rule__Input__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1417:1: ( rule__Input__Group_4_3__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1418:2: rule__Input__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group_4_3__1__Impl_in_rule__Input__Group_4_3__12907);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1424:1: rule__Input__Group_4_3__1__Impl : ( ( rule__Input__TheoremsAssignment_4_3_1 ) ) ;
    public final void rule__Input__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1428:1: ( ( ( rule__Input__TheoremsAssignment_4_3_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1429:1: ( ( rule__Input__TheoremsAssignment_4_3_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1429:1: ( ( rule__Input__TheoremsAssignment_4_3_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1430:1: ( rule__Input__TheoremsAssignment_4_3_1 )
            {
             before(grammarAccess.getInputAccess().getTheoremsAssignment_4_3_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1431:1: ( rule__Input__TheoremsAssignment_4_3_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1431:2: rule__Input__TheoremsAssignment_4_3_1
            {
            pushFollow(FOLLOW_rule__Input__TheoremsAssignment_4_3_1_in_rule__Input__Group_4_3__1__Impl2934);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1445:1: rule__Problem__Group__0 : rule__Problem__Group__0__Impl rule__Problem__Group__1 ;
    public final void rule__Problem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1449:1: ( rule__Problem__Group__0__Impl rule__Problem__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1450:2: rule__Problem__Group__0__Impl rule__Problem__Group__1
            {
            pushFollow(FOLLOW_rule__Problem__Group__0__Impl_in_rule__Problem__Group__02968);
            rule__Problem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Problem__Group__1_in_rule__Problem__Group__02971);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1457:1: rule__Problem__Group__0__Impl : ( ( rule__Problem__VarsAssignment_0 ) ) ;
    public final void rule__Problem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1461:1: ( ( ( rule__Problem__VarsAssignment_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1462:1: ( ( rule__Problem__VarsAssignment_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1462:1: ( ( rule__Problem__VarsAssignment_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1463:1: ( rule__Problem__VarsAssignment_0 )
            {
             before(grammarAccess.getProblemAccess().getVarsAssignment_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1464:1: ( rule__Problem__VarsAssignment_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1464:2: rule__Problem__VarsAssignment_0
            {
            pushFollow(FOLLOW_rule__Problem__VarsAssignment_0_in_rule__Problem__Group__0__Impl2998);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1474:1: rule__Problem__Group__1 : rule__Problem__Group__1__Impl rule__Problem__Group__2 ;
    public final void rule__Problem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1478:1: ( rule__Problem__Group__1__Impl rule__Problem__Group__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1479:2: rule__Problem__Group__1__Impl rule__Problem__Group__2
            {
            pushFollow(FOLLOW_rule__Problem__Group__1__Impl_in_rule__Problem__Group__13028);
            rule__Problem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Problem__Group__2_in_rule__Problem__Group__13031);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1486:1: rule__Problem__Group__1__Impl : ( ( rule__Problem__Group_1__0 )* ) ;
    public final void rule__Problem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1490:1: ( ( ( rule__Problem__Group_1__0 )* ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1491:1: ( ( rule__Problem__Group_1__0 )* )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1491:1: ( ( rule__Problem__Group_1__0 )* )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1492:1: ( rule__Problem__Group_1__0 )*
            {
             before(grammarAccess.getProblemAccess().getGroup_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1493:1: ( rule__Problem__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1493:2: rule__Problem__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Problem__Group_1__0_in_rule__Problem__Group__1__Impl3058);
            	    rule__Problem__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1503:1: rule__Problem__Group__2 : rule__Problem__Group__2__Impl ;
    public final void rule__Problem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1507:1: ( rule__Problem__Group__2__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1508:2: rule__Problem__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Problem__Group__2__Impl_in_rule__Problem__Group__23089);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1514:1: rule__Problem__Group__2__Impl : ( ( rule__Problem__Group_2__0 )? ) ;
    public final void rule__Problem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1518:1: ( ( ( rule__Problem__Group_2__0 )? ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1519:1: ( ( rule__Problem__Group_2__0 )? )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1519:1: ( ( rule__Problem__Group_2__0 )? )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1520:1: ( rule__Problem__Group_2__0 )?
            {
             before(grammarAccess.getProblemAccess().getGroup_2()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1521:1: ( rule__Problem__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1521:2: rule__Problem__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Problem__Group_2__0_in_rule__Problem__Group__2__Impl3116);
                    rule__Problem__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProblemAccess().getGroup_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Problem__Group_1__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1537:1: rule__Problem__Group_1__0 : rule__Problem__Group_1__0__Impl rule__Problem__Group_1__1 ;
    public final void rule__Problem__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1541:1: ( rule__Problem__Group_1__0__Impl rule__Problem__Group_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1542:2: rule__Problem__Group_1__0__Impl rule__Problem__Group_1__1
            {
            pushFollow(FOLLOW_rule__Problem__Group_1__0__Impl_in_rule__Problem__Group_1__03153);
            rule__Problem__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Problem__Group_1__1_in_rule__Problem__Group_1__03156);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1549:1: rule__Problem__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Problem__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1553:1: ( ( ',' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1554:1: ( ',' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1554:1: ( ',' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1555:1: ','
            {
             before(grammarAccess.getProblemAccess().getCommaKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__Problem__Group_1__0__Impl3184); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1568:1: rule__Problem__Group_1__1 : rule__Problem__Group_1__1__Impl ;
    public final void rule__Problem__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1572:1: ( rule__Problem__Group_1__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1573:2: rule__Problem__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Problem__Group_1__1__Impl_in_rule__Problem__Group_1__13215);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1579:1: rule__Problem__Group_1__1__Impl : ( ( rule__Problem__VarsAssignment_1_1 ) ) ;
    public final void rule__Problem__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1583:1: ( ( ( rule__Problem__VarsAssignment_1_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1584:1: ( ( rule__Problem__VarsAssignment_1_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1584:1: ( ( rule__Problem__VarsAssignment_1_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1585:1: ( rule__Problem__VarsAssignment_1_1 )
            {
             before(grammarAccess.getProblemAccess().getVarsAssignment_1_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1586:1: ( rule__Problem__VarsAssignment_1_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1586:2: rule__Problem__VarsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Problem__VarsAssignment_1_1_in_rule__Problem__Group_1__1__Impl3242);
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


    // $ANTLR start "rule__Problem__Group_2__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1600:1: rule__Problem__Group_2__0 : rule__Problem__Group_2__0__Impl rule__Problem__Group_2__1 ;
    public final void rule__Problem__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1604:1: ( rule__Problem__Group_2__0__Impl rule__Problem__Group_2__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1605:2: rule__Problem__Group_2__0__Impl rule__Problem__Group_2__1
            {
            pushFollow(FOLLOW_rule__Problem__Group_2__0__Impl_in_rule__Problem__Group_2__03276);
            rule__Problem__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Problem__Group_2__1_in_rule__Problem__Group_2__03279);
            rule__Problem__Group_2__1();

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
    // $ANTLR end "rule__Problem__Group_2__0"


    // $ANTLR start "rule__Problem__Group_2__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1612:1: rule__Problem__Group_2__0__Impl : ( 'st' ) ;
    public final void rule__Problem__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1616:1: ( ( 'st' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1617:1: ( 'st' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1617:1: ( 'st' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1618:1: 'st'
            {
             before(grammarAccess.getProblemAccess().getStKeyword_2_0()); 
            match(input,27,FOLLOW_27_in_rule__Problem__Group_2__0__Impl3307); 
             after(grammarAccess.getProblemAccess().getStKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group_2__0__Impl"


    // $ANTLR start "rule__Problem__Group_2__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1631:1: rule__Problem__Group_2__1 : rule__Problem__Group_2__1__Impl ;
    public final void rule__Problem__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1635:1: ( rule__Problem__Group_2__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1636:2: rule__Problem__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Problem__Group_2__1__Impl_in_rule__Problem__Group_2__13338);
            rule__Problem__Group_2__1__Impl();

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
    // $ANTLR end "rule__Problem__Group_2__1"


    // $ANTLR start "rule__Problem__Group_2__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1642:1: rule__Problem__Group_2__1__Impl : ( ( rule__Problem__PropertyAssignment_2_1 ) ) ;
    public final void rule__Problem__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1646:1: ( ( ( rule__Problem__PropertyAssignment_2_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1647:1: ( ( rule__Problem__PropertyAssignment_2_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1647:1: ( ( rule__Problem__PropertyAssignment_2_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1648:1: ( rule__Problem__PropertyAssignment_2_1 )
            {
             before(grammarAccess.getProblemAccess().getPropertyAssignment_2_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1649:1: ( rule__Problem__PropertyAssignment_2_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1649:2: rule__Problem__PropertyAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Problem__PropertyAssignment_2_1_in_rule__Problem__Group_2__1__Impl3365);
            rule__Problem__PropertyAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getProblemAccess().getPropertyAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group_2__1__Impl"


    // $ANTLR start "rule__Declaration__Group__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1663:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1667:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1668:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__03399);
            rule__Declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__03402);
            rule__Declaration__Group__1();

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
    // $ANTLR end "rule__Declaration__Group__0"


    // $ANTLR start "rule__Declaration__Group__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1675:1: rule__Declaration__Group__0__Impl : ( ( rule__Declaration__TypeAssignment_0 )? ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1679:1: ( ( ( rule__Declaration__TypeAssignment_0 )? ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1680:1: ( ( rule__Declaration__TypeAssignment_0 )? )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1680:1: ( ( rule__Declaration__TypeAssignment_0 )? )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1681:1: ( rule__Declaration__TypeAssignment_0 )?
            {
             before(grammarAccess.getDeclarationAccess().getTypeAssignment_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1682:1: ( rule__Declaration__TypeAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==RULE_ID||LA15_1==23||LA15_1==28) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1682:2: rule__Declaration__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Declaration__TypeAssignment_0_in_rule__Declaration__Group__0__Impl3429);
                    rule__Declaration__TypeAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeclarationAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__0__Impl"


    // $ANTLR start "rule__Declaration__Group__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1692:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1696:1: ( rule__Declaration__Group__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1697:2: rule__Declaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__13460);
            rule__Declaration__Group__1__Impl();

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
    // $ANTLR end "rule__Declaration__Group__1"


    // $ANTLR start "rule__Declaration__Group__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1703:1: rule__Declaration__Group__1__Impl : ( ( rule__Declaration__Alternatives_1 ) ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1707:1: ( ( ( rule__Declaration__Alternatives_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1708:1: ( ( rule__Declaration__Alternatives_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1708:1: ( ( rule__Declaration__Alternatives_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1709:1: ( rule__Declaration__Alternatives_1 )
            {
             before(grammarAccess.getDeclarationAccess().getAlternatives_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1710:1: ( rule__Declaration__Alternatives_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1710:2: rule__Declaration__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Declaration__Alternatives_1_in_rule__Declaration__Group__1__Impl3487);
            rule__Declaration__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__1__Impl"


    // $ANTLR start "rule__Declaration__Group_1_1__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1724:1: rule__Declaration__Group_1_1__0 : rule__Declaration__Group_1_1__0__Impl rule__Declaration__Group_1_1__1 ;
    public final void rule__Declaration__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1728:1: ( rule__Declaration__Group_1_1__0__Impl rule__Declaration__Group_1_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1729:2: rule__Declaration__Group_1_1__0__Impl rule__Declaration__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group_1_1__0__Impl_in_rule__Declaration__Group_1_1__03521);
            rule__Declaration__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group_1_1__1_in_rule__Declaration__Group_1_1__03524);
            rule__Declaration__Group_1_1__1();

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
    // $ANTLR end "rule__Declaration__Group_1_1__0"


    // $ANTLR start "rule__Declaration__Group_1_1__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1736:1: rule__Declaration__Group_1_1__0__Impl : ( '(' ) ;
    public final void rule__Declaration__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1740:1: ( ( '(' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1741:1: ( '(' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1741:1: ( '(' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1742:1: '('
            {
             before(grammarAccess.getDeclarationAccess().getLeftParenthesisKeyword_1_1_0()); 
            match(input,23,FOLLOW_23_in_rule__Declaration__Group_1_1__0__Impl3552); 
             after(grammarAccess.getDeclarationAccess().getLeftParenthesisKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_1_1__0__Impl"


    // $ANTLR start "rule__Declaration__Group_1_1__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1755:1: rule__Declaration__Group_1_1__1 : rule__Declaration__Group_1_1__1__Impl rule__Declaration__Group_1_1__2 ;
    public final void rule__Declaration__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1759:1: ( rule__Declaration__Group_1_1__1__Impl rule__Declaration__Group_1_1__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1760:2: rule__Declaration__Group_1_1__1__Impl rule__Declaration__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__Declaration__Group_1_1__1__Impl_in_rule__Declaration__Group_1_1__13583);
            rule__Declaration__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group_1_1__2_in_rule__Declaration__Group_1_1__13586);
            rule__Declaration__Group_1_1__2();

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
    // $ANTLR end "rule__Declaration__Group_1_1__1"


    // $ANTLR start "rule__Declaration__Group_1_1__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1767:1: rule__Declaration__Group_1_1__1__Impl : ( ( rule__Declaration__VarNameAssignment_1_1_1 ) ) ;
    public final void rule__Declaration__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1771:1: ( ( ( rule__Declaration__VarNameAssignment_1_1_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1772:1: ( ( rule__Declaration__VarNameAssignment_1_1_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1772:1: ( ( rule__Declaration__VarNameAssignment_1_1_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1773:1: ( rule__Declaration__VarNameAssignment_1_1_1 )
            {
             before(grammarAccess.getDeclarationAccess().getVarNameAssignment_1_1_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1774:1: ( rule__Declaration__VarNameAssignment_1_1_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1774:2: rule__Declaration__VarNameAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Declaration__VarNameAssignment_1_1_1_in_rule__Declaration__Group_1_1__1__Impl3613);
            rule__Declaration__VarNameAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getVarNameAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_1_1__1__Impl"


    // $ANTLR start "rule__Declaration__Group_1_1__2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1784:1: rule__Declaration__Group_1_1__2 : rule__Declaration__Group_1_1__2__Impl ;
    public final void rule__Declaration__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1788:1: ( rule__Declaration__Group_1_1__2__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1789:2: rule__Declaration__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group_1_1__2__Impl_in_rule__Declaration__Group_1_1__23643);
            rule__Declaration__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__Declaration__Group_1_1__2"


    // $ANTLR start "rule__Declaration__Group_1_1__2__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1795:1: rule__Declaration__Group_1_1__2__Impl : ( ')' ) ;
    public final void rule__Declaration__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1799:1: ( ( ')' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1800:1: ( ')' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1800:1: ( ')' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1801:1: ')'
            {
             before(grammarAccess.getDeclarationAccess().getRightParenthesisKeyword_1_1_2()); 
            match(input,24,FOLLOW_24_in_rule__Declaration__Group_1_1__2__Impl3671); 
             after(grammarAccess.getDeclarationAccess().getRightParenthesisKeyword_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_1_1__2__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1820:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1824:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1825:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__03708);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group__1_in_rule__Type__Group__03711);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1832:1: rule__Type__Group__0__Impl : ( ( rule__Type__NameAssignment_0 ) ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1836:1: ( ( ( rule__Type__NameAssignment_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1837:1: ( ( rule__Type__NameAssignment_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1837:1: ( ( rule__Type__NameAssignment_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1838:1: ( rule__Type__NameAssignment_0 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1839:1: ( rule__Type__NameAssignment_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1839:2: rule__Type__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Type__NameAssignment_0_in_rule__Type__Group__0__Impl3738);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1849:1: rule__Type__Group__1 : rule__Type__Group__1__Impl ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1853:1: ( rule__Type__Group__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1854:2: rule__Type__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__13768);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1860:1: rule__Type__Group__1__Impl : ( ( rule__Type__Group_1__0 )? ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1864:1: ( ( ( rule__Type__Group_1__0 )? ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1865:1: ( ( rule__Type__Group_1__0 )? )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1865:1: ( ( rule__Type__Group_1__0 )? )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1866:1: ( rule__Type__Group_1__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1867:1: ( rule__Type__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1867:2: rule__Type__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_1__0_in_rule__Type__Group__1__Impl3795);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1881:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1885:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1886:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
            {
            pushFollow(FOLLOW_rule__Type__Group_1__0__Impl_in_rule__Type__Group_1__03830);
            rule__Type__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_1__1_in_rule__Type__Group_1__03833);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1893:1: rule__Type__Group_1__0__Impl : ( '<' ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1897:1: ( ( '<' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1898:1: ( '<' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1898:1: ( '<' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1899:1: '<'
            {
             before(grammarAccess.getTypeAccess().getLessThanSignKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__Type__Group_1__0__Impl3861); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1912:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl rule__Type__Group_1__2 ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1916:1: ( rule__Type__Group_1__1__Impl rule__Type__Group_1__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1917:2: rule__Type__Group_1__1__Impl rule__Type__Group_1__2
            {
            pushFollow(FOLLOW_rule__Type__Group_1__1__Impl_in_rule__Type__Group_1__13892);
            rule__Type__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_1__2_in_rule__Type__Group_1__13895);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1924:1: rule__Type__Group_1__1__Impl : ( ( rule__Type__TemplateTypeAssignment_1_1 ) ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1928:1: ( ( ( rule__Type__TemplateTypeAssignment_1_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1929:1: ( ( rule__Type__TemplateTypeAssignment_1_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1929:1: ( ( rule__Type__TemplateTypeAssignment_1_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1930:1: ( rule__Type__TemplateTypeAssignment_1_1 )
            {
             before(grammarAccess.getTypeAccess().getTemplateTypeAssignment_1_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1931:1: ( rule__Type__TemplateTypeAssignment_1_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1931:2: rule__Type__TemplateTypeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Type__TemplateTypeAssignment_1_1_in_rule__Type__Group_1__1__Impl3922);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1941:1: rule__Type__Group_1__2 : rule__Type__Group_1__2__Impl ;
    public final void rule__Type__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1945:1: ( rule__Type__Group_1__2__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1946:2: rule__Type__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_1__2__Impl_in_rule__Type__Group_1__23952);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1952:1: rule__Type__Group_1__2__Impl : ( '>' ) ;
    public final void rule__Type__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1956:1: ( ( '>' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1957:1: ( '>' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1957:1: ( '>' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1958:1: '>'
            {
             before(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_1_2()); 
            match(input,29,FOLLOW_29_in_rule__Type__Group_1__2__Impl3980); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1977:1: rule__ORing__Group__0 : rule__ORing__Group__0__Impl rule__ORing__Group__1 ;
    public final void rule__ORing__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1981:1: ( rule__ORing__Group__0__Impl rule__ORing__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1982:2: rule__ORing__Group__0__Impl rule__ORing__Group__1
            {
            pushFollow(FOLLOW_rule__ORing__Group__0__Impl_in_rule__ORing__Group__04017);
            rule__ORing__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ORing__Group__1_in_rule__ORing__Group__04020);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1989:1: rule__ORing__Group__0__Impl : ( ruleANDing ) ;
    public final void rule__ORing__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1993:1: ( ( ruleANDing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1994:1: ( ruleANDing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1994:1: ( ruleANDing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1995:1: ruleANDing
            {
             before(grammarAccess.getORingAccess().getANDingParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleANDing_in_rule__ORing__Group__0__Impl4047);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2006:1: rule__ORing__Group__1 : rule__ORing__Group__1__Impl ;
    public final void rule__ORing__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2010:1: ( rule__ORing__Group__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2011:2: rule__ORing__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ORing__Group__1__Impl_in_rule__ORing__Group__14076);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2017:1: rule__ORing__Group__1__Impl : ( ( rule__ORing__Group_1__0 )* ) ;
    public final void rule__ORing__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2021:1: ( ( ( rule__ORing__Group_1__0 )* ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2022:1: ( ( rule__ORing__Group_1__0 )* )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2022:1: ( ( rule__ORing__Group_1__0 )* )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2023:1: ( rule__ORing__Group_1__0 )*
            {
             before(grammarAccess.getORingAccess().getGroup_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2024:1: ( rule__ORing__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==30) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2024:2: rule__ORing__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ORing__Group_1__0_in_rule__ORing__Group__1__Impl4103);
            	    rule__ORing__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2038:1: rule__ORing__Group_1__0 : rule__ORing__Group_1__0__Impl rule__ORing__Group_1__1 ;
    public final void rule__ORing__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2042:1: ( rule__ORing__Group_1__0__Impl rule__ORing__Group_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2043:2: rule__ORing__Group_1__0__Impl rule__ORing__Group_1__1
            {
            pushFollow(FOLLOW_rule__ORing__Group_1__0__Impl_in_rule__ORing__Group_1__04138);
            rule__ORing__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ORing__Group_1__1_in_rule__ORing__Group_1__04141);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2050:1: rule__ORing__Group_1__0__Impl : ( () ) ;
    public final void rule__ORing__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2054:1: ( ( () ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2055:1: ( () )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2055:1: ( () )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2056:1: ()
            {
             before(grammarAccess.getORingAccess().getORingLeftAction_1_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2057:1: ()
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2059:1: 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2069:1: rule__ORing__Group_1__1 : rule__ORing__Group_1__1__Impl rule__ORing__Group_1__2 ;
    public final void rule__ORing__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2073:1: ( rule__ORing__Group_1__1__Impl rule__ORing__Group_1__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2074:2: rule__ORing__Group_1__1__Impl rule__ORing__Group_1__2
            {
            pushFollow(FOLLOW_rule__ORing__Group_1__1__Impl_in_rule__ORing__Group_1__14199);
            rule__ORing__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ORing__Group_1__2_in_rule__ORing__Group_1__14202);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2081:1: rule__ORing__Group_1__1__Impl : ( '|' ) ;
    public final void rule__ORing__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2085:1: ( ( '|' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2086:1: ( '|' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2086:1: ( '|' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2087:1: '|'
            {
             before(grammarAccess.getORingAccess().getVerticalLineKeyword_1_1()); 
            match(input,30,FOLLOW_30_in_rule__ORing__Group_1__1__Impl4230); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2100:1: rule__ORing__Group_1__2 : rule__ORing__Group_1__2__Impl ;
    public final void rule__ORing__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2104:1: ( rule__ORing__Group_1__2__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2105:2: rule__ORing__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ORing__Group_1__2__Impl_in_rule__ORing__Group_1__24261);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2111:1: rule__ORing__Group_1__2__Impl : ( ( rule__ORing__RightAssignment_1_2 ) ) ;
    public final void rule__ORing__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2115:1: ( ( ( rule__ORing__RightAssignment_1_2 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2116:1: ( ( rule__ORing__RightAssignment_1_2 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2116:1: ( ( rule__ORing__RightAssignment_1_2 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2117:1: ( rule__ORing__RightAssignment_1_2 )
            {
             before(grammarAccess.getORingAccess().getRightAssignment_1_2()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2118:1: ( rule__ORing__RightAssignment_1_2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2118:2: rule__ORing__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ORing__RightAssignment_1_2_in_rule__ORing__Group_1__2__Impl4288);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2134:1: rule__ANDing__Group__0 : rule__ANDing__Group__0__Impl rule__ANDing__Group__1 ;
    public final void rule__ANDing__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2138:1: ( rule__ANDing__Group__0__Impl rule__ANDing__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2139:2: rule__ANDing__Group__0__Impl rule__ANDing__Group__1
            {
            pushFollow(FOLLOW_rule__ANDing__Group__0__Impl_in_rule__ANDing__Group__04324);
            rule__ANDing__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ANDing__Group__1_in_rule__ANDing__Group__04327);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2146:1: rule__ANDing__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__ANDing__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2150:1: ( ( rulePrimary ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2151:1: ( rulePrimary )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2151:1: ( rulePrimary )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2152:1: rulePrimary
            {
             before(grammarAccess.getANDingAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__ANDing__Group__0__Impl4354);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2163:1: rule__ANDing__Group__1 : rule__ANDing__Group__1__Impl ;
    public final void rule__ANDing__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2167:1: ( rule__ANDing__Group__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2168:2: rule__ANDing__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ANDing__Group__1__Impl_in_rule__ANDing__Group__14383);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2174:1: rule__ANDing__Group__1__Impl : ( ( rule__ANDing__Group_1__0 )* ) ;
    public final void rule__ANDing__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2178:1: ( ( ( rule__ANDing__Group_1__0 )* ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2179:1: ( ( rule__ANDing__Group_1__0 )* )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2179:1: ( ( rule__ANDing__Group_1__0 )* )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2180:1: ( rule__ANDing__Group_1__0 )*
            {
             before(grammarAccess.getANDingAccess().getGroup_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2181:1: ( rule__ANDing__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==31) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2181:2: rule__ANDing__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ANDing__Group_1__0_in_rule__ANDing__Group__1__Impl4410);
            	    rule__ANDing__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2195:1: rule__ANDing__Group_1__0 : rule__ANDing__Group_1__0__Impl rule__ANDing__Group_1__1 ;
    public final void rule__ANDing__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2199:1: ( rule__ANDing__Group_1__0__Impl rule__ANDing__Group_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2200:2: rule__ANDing__Group_1__0__Impl rule__ANDing__Group_1__1
            {
            pushFollow(FOLLOW_rule__ANDing__Group_1__0__Impl_in_rule__ANDing__Group_1__04445);
            rule__ANDing__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ANDing__Group_1__1_in_rule__ANDing__Group_1__04448);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2207:1: rule__ANDing__Group_1__0__Impl : ( () ) ;
    public final void rule__ANDing__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2211:1: ( ( () ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2212:1: ( () )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2212:1: ( () )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2213:1: ()
            {
             before(grammarAccess.getANDingAccess().getANDingLeftAction_1_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2214:1: ()
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2216:1: 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2226:1: rule__ANDing__Group_1__1 : rule__ANDing__Group_1__1__Impl rule__ANDing__Group_1__2 ;
    public final void rule__ANDing__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2230:1: ( rule__ANDing__Group_1__1__Impl rule__ANDing__Group_1__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2231:2: rule__ANDing__Group_1__1__Impl rule__ANDing__Group_1__2
            {
            pushFollow(FOLLOW_rule__ANDing__Group_1__1__Impl_in_rule__ANDing__Group_1__14506);
            rule__ANDing__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ANDing__Group_1__2_in_rule__ANDing__Group_1__14509);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2238:1: rule__ANDing__Group_1__1__Impl : ( '&' ) ;
    public final void rule__ANDing__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2242:1: ( ( '&' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2243:1: ( '&' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2243:1: ( '&' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2244:1: '&'
            {
             before(grammarAccess.getANDingAccess().getAmpersandKeyword_1_1()); 
            match(input,31,FOLLOW_31_in_rule__ANDing__Group_1__1__Impl4537); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2257:1: rule__ANDing__Group_1__2 : rule__ANDing__Group_1__2__Impl ;
    public final void rule__ANDing__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2261:1: ( rule__ANDing__Group_1__2__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2262:2: rule__ANDing__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ANDing__Group_1__2__Impl_in_rule__ANDing__Group_1__24568);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2268:1: rule__ANDing__Group_1__2__Impl : ( ( rule__ANDing__RightAssignment_1_2 ) ) ;
    public final void rule__ANDing__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2272:1: ( ( ( rule__ANDing__RightAssignment_1_2 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2273:1: ( ( rule__ANDing__RightAssignment_1_2 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2273:1: ( ( rule__ANDing__RightAssignment_1_2 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2274:1: ( rule__ANDing__RightAssignment_1_2 )
            {
             before(grammarAccess.getANDingAccess().getRightAssignment_1_2()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2275:1: ( rule__ANDing__RightAssignment_1_2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2275:2: rule__ANDing__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ANDing__RightAssignment_1_2_in_rule__ANDing__Group_1__2__Impl4595);
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


    // $ANTLR start "rule__Primary__Group_3__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2291:1: rule__Primary__Group_3__0 : rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 ;
    public final void rule__Primary__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2295:1: ( rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2296:2: rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_3__0__Impl_in_rule__Primary__Group_3__04631);
            rule__Primary__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_3__1_in_rule__Primary__Group_3__04634);
            rule__Primary__Group_3__1();

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
    // $ANTLR end "rule__Primary__Group_3__0"


    // $ANTLR start "rule__Primary__Group_3__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2303:1: rule__Primary__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2307:1: ( ( '(' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2308:1: ( '(' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2308:1: ( '(' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2309:1: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,23,FOLLOW_23_in_rule__Primary__Group_3__0__Impl4662); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__0__Impl"


    // $ANTLR start "rule__Primary__Group_3__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2322:1: rule__Primary__Group_3__1 : rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 ;
    public final void rule__Primary__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2326:1: ( rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2327:2: rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2
            {
            pushFollow(FOLLOW_rule__Primary__Group_3__1__Impl_in_rule__Primary__Group_3__14693);
            rule__Primary__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_3__2_in_rule__Primary__Group_3__14696);
            rule__Primary__Group_3__2();

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
    // $ANTLR end "rule__Primary__Group_3__1"


    // $ANTLR start "rule__Primary__Group_3__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2334:1: rule__Primary__Group_3__1__Impl : ( ruleORing ) ;
    public final void rule__Primary__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2338:1: ( ( ruleORing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2339:1: ( ruleORing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2339:1: ( ruleORing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2340:1: ruleORing
            {
             before(grammarAccess.getPrimaryAccess().getORingParserRuleCall_3_1()); 
            pushFollow(FOLLOW_ruleORing_in_rule__Primary__Group_3__1__Impl4723);
            ruleORing();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getORingParserRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__1__Impl"


    // $ANTLR start "rule__Primary__Group_3__2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2351:1: rule__Primary__Group_3__2 : rule__Primary__Group_3__2__Impl ;
    public final void rule__Primary__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2355:1: ( rule__Primary__Group_3__2__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2356:2: rule__Primary__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_3__2__Impl_in_rule__Primary__Group_3__24752);
            rule__Primary__Group_3__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_3__2"


    // $ANTLR start "rule__Primary__Group_3__2__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2362:1: rule__Primary__Group_3__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2366:1: ( ( ')' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2367:1: ( ')' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2367:1: ( ')' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2368:1: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_2()); 
            match(input,24,FOLLOW_24_in_rule__Primary__Group_3__2__Impl4780); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__2__Impl"


    // $ANTLR start "rule__ProblemShell__Group__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2387:1: rule__ProblemShell__Group__0 : rule__ProblemShell__Group__0__Impl rule__ProblemShell__Group__1 ;
    public final void rule__ProblemShell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2391:1: ( rule__ProblemShell__Group__0__Impl rule__ProblemShell__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2392:2: rule__ProblemShell__Group__0__Impl rule__ProblemShell__Group__1
            {
            pushFollow(FOLLOW_rule__ProblemShell__Group__0__Impl_in_rule__ProblemShell__Group__04817);
            rule__ProblemShell__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProblemShell__Group__1_in_rule__ProblemShell__Group__04820);
            rule__ProblemShell__Group__1();

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
    // $ANTLR end "rule__ProblemShell__Group__0"


    // $ANTLR start "rule__ProblemShell__Group__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2399:1: rule__ProblemShell__Group__0__Impl : ( '{' ) ;
    public final void rule__ProblemShell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2403:1: ( ( '{' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2404:1: ( '{' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2404:1: ( '{' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2405:1: '{'
            {
             before(grammarAccess.getProblemShellAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__ProblemShell__Group__0__Impl4848); 
             after(grammarAccess.getProblemShellAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemShell__Group__0__Impl"


    // $ANTLR start "rule__ProblemShell__Group__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2418:1: rule__ProblemShell__Group__1 : rule__ProblemShell__Group__1__Impl rule__ProblemShell__Group__2 ;
    public final void rule__ProblemShell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2422:1: ( rule__ProblemShell__Group__1__Impl rule__ProblemShell__Group__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2423:2: rule__ProblemShell__Group__1__Impl rule__ProblemShell__Group__2
            {
            pushFollow(FOLLOW_rule__ProblemShell__Group__1__Impl_in_rule__ProblemShell__Group__14879);
            rule__ProblemShell__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProblemShell__Group__2_in_rule__ProblemShell__Group__14882);
            rule__ProblemShell__Group__2();

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
    // $ANTLR end "rule__ProblemShell__Group__1"


    // $ANTLR start "rule__ProblemShell__Group__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2430:1: rule__ProblemShell__Group__1__Impl : ( ( rule__ProblemShell__ProblemAssignment_1 ) ) ;
    public final void rule__ProblemShell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2434:1: ( ( ( rule__ProblemShell__ProblemAssignment_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2435:1: ( ( rule__ProblemShell__ProblemAssignment_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2435:1: ( ( rule__ProblemShell__ProblemAssignment_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2436:1: ( rule__ProblemShell__ProblemAssignment_1 )
            {
             before(grammarAccess.getProblemShellAccess().getProblemAssignment_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2437:1: ( rule__ProblemShell__ProblemAssignment_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2437:2: rule__ProblemShell__ProblemAssignment_1
            {
            pushFollow(FOLLOW_rule__ProblemShell__ProblemAssignment_1_in_rule__ProblemShell__Group__1__Impl4909);
            rule__ProblemShell__ProblemAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProblemShellAccess().getProblemAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemShell__Group__1__Impl"


    // $ANTLR start "rule__ProblemShell__Group__2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2447:1: rule__ProblemShell__Group__2 : rule__ProblemShell__Group__2__Impl ;
    public final void rule__ProblemShell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2451:1: ( rule__ProblemShell__Group__2__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2452:2: rule__ProblemShell__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ProblemShell__Group__2__Impl_in_rule__ProblemShell__Group__24939);
            rule__ProblemShell__Group__2__Impl();

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
    // $ANTLR end "rule__ProblemShell__Group__2"


    // $ANTLR start "rule__ProblemShell__Group__2__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2458:1: rule__ProblemShell__Group__2__Impl : ( '}' ) ;
    public final void rule__ProblemShell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2462:1: ( ( '}' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2463:1: ( '}' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2463:1: ( '}' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2464:1: '}'
            {
             before(grammarAccess.getProblemShellAccess().getRightCurlyBracketKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__ProblemShell__Group__2__Impl4967); 
             after(grammarAccess.getProblemShellAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemShell__Group__2__Impl"


    // $ANTLR start "rule__Negation__Group__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2483:1: rule__Negation__Group__0 : rule__Negation__Group__0__Impl rule__Negation__Group__1 ;
    public final void rule__Negation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2487:1: ( rule__Negation__Group__0__Impl rule__Negation__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2488:2: rule__Negation__Group__0__Impl rule__Negation__Group__1
            {
            pushFollow(FOLLOW_rule__Negation__Group__0__Impl_in_rule__Negation__Group__05004);
            rule__Negation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Negation__Group__1_in_rule__Negation__Group__05007);
            rule__Negation__Group__1();

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
    // $ANTLR end "rule__Negation__Group__0"


    // $ANTLR start "rule__Negation__Group__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2495:1: rule__Negation__Group__0__Impl : ( '!' ) ;
    public final void rule__Negation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2499:1: ( ( '!' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2500:1: ( '!' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2500:1: ( '!' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2501:1: '!'
            {
             before(grammarAccess.getNegationAccess().getExclamationMarkKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Negation__Group__0__Impl5035); 
             after(grammarAccess.getNegationAccess().getExclamationMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group__0__Impl"


    // $ANTLR start "rule__Negation__Group__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2514:1: rule__Negation__Group__1 : rule__Negation__Group__1__Impl ;
    public final void rule__Negation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2518:1: ( rule__Negation__Group__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2519:2: rule__Negation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Negation__Group__1__Impl_in_rule__Negation__Group__15066);
            rule__Negation__Group__1__Impl();

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
    // $ANTLR end "rule__Negation__Group__1"


    // $ANTLR start "rule__Negation__Group__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2525:1: rule__Negation__Group__1__Impl : ( ( rule__Negation__NegatedAssignment_1 ) ) ;
    public final void rule__Negation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2529:1: ( ( ( rule__Negation__NegatedAssignment_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2530:1: ( ( rule__Negation__NegatedAssignment_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2530:1: ( ( rule__Negation__NegatedAssignment_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2531:1: ( rule__Negation__NegatedAssignment_1 )
            {
             before(grammarAccess.getNegationAccess().getNegatedAssignment_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2532:1: ( rule__Negation__NegatedAssignment_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2532:2: rule__Negation__NegatedAssignment_1
            {
            pushFollow(FOLLOW_rule__Negation__NegatedAssignment_1_in_rule__Negation__Group__1__Impl5093);
            rule__Negation__NegatedAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNegationAccess().getNegatedAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group__1__Impl"


    // $ANTLR start "rule__Quantifier__Group__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2546:1: rule__Quantifier__Group__0 : rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1 ;
    public final void rule__Quantifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2550:1: ( rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2551:2: rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1
            {
            pushFollow(FOLLOW_rule__Quantifier__Group__0__Impl_in_rule__Quantifier__Group__05127);
            rule__Quantifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantifier__Group__1_in_rule__Quantifier__Group__05130);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2558:1: rule__Quantifier__Group__0__Impl : ( ( rule__Quantifier__QuantifierAssignment_0 ) ) ;
    public final void rule__Quantifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2562:1: ( ( ( rule__Quantifier__QuantifierAssignment_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2563:1: ( ( rule__Quantifier__QuantifierAssignment_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2563:1: ( ( rule__Quantifier__QuantifierAssignment_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2564:1: ( rule__Quantifier__QuantifierAssignment_0 )
            {
             before(grammarAccess.getQuantifierAccess().getQuantifierAssignment_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2565:1: ( rule__Quantifier__QuantifierAssignment_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2565:2: rule__Quantifier__QuantifierAssignment_0
            {
            pushFollow(FOLLOW_rule__Quantifier__QuantifierAssignment_0_in_rule__Quantifier__Group__0__Impl5157);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2575:1: rule__Quantifier__Group__1 : rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2 ;
    public final void rule__Quantifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2579:1: ( rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2580:2: rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2
            {
            pushFollow(FOLLOW_rule__Quantifier__Group__1__Impl_in_rule__Quantifier__Group__15187);
            rule__Quantifier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantifier__Group__2_in_rule__Quantifier__Group__15190);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2587:1: rule__Quantifier__Group__1__Impl : ( '(' ) ;
    public final void rule__Quantifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2591:1: ( ( '(' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2592:1: ( '(' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2592:1: ( '(' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2593:1: '('
            {
             before(grammarAccess.getQuantifierAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__Quantifier__Group__1__Impl5218); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2606:1: rule__Quantifier__Group__2 : rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3 ;
    public final void rule__Quantifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2610:1: ( rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2611:2: rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3
            {
            pushFollow(FOLLOW_rule__Quantifier__Group__2__Impl_in_rule__Quantifier__Group__25249);
            rule__Quantifier__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantifier__Group__3_in_rule__Quantifier__Group__25252);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2618:1: rule__Quantifier__Group__2__Impl : ( ( rule__Quantifier__SubjectAssignment_2 ) ) ;
    public final void rule__Quantifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2622:1: ( ( ( rule__Quantifier__SubjectAssignment_2 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2623:1: ( ( rule__Quantifier__SubjectAssignment_2 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2623:1: ( ( rule__Quantifier__SubjectAssignment_2 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2624:1: ( rule__Quantifier__SubjectAssignment_2 )
            {
             before(grammarAccess.getQuantifierAccess().getSubjectAssignment_2()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2625:1: ( rule__Quantifier__SubjectAssignment_2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2625:2: rule__Quantifier__SubjectAssignment_2
            {
            pushFollow(FOLLOW_rule__Quantifier__SubjectAssignment_2_in_rule__Quantifier__Group__2__Impl5279);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2635:1: rule__Quantifier__Group__3 : rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4 ;
    public final void rule__Quantifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2639:1: ( rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2640:2: rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4
            {
            pushFollow(FOLLOW_rule__Quantifier__Group__3__Impl_in_rule__Quantifier__Group__35309);
            rule__Quantifier__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantifier__Group__4_in_rule__Quantifier__Group__35312);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2647:1: rule__Quantifier__Group__3__Impl : ( ':' ) ;
    public final void rule__Quantifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2651:1: ( ( ':' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2652:1: ( ':' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2652:1: ( ':' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2653:1: ':'
            {
             before(grammarAccess.getQuantifierAccess().getColonKeyword_3()); 
            match(input,35,FOLLOW_35_in_rule__Quantifier__Group__3__Impl5340); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2666:1: rule__Quantifier__Group__4 : rule__Quantifier__Group__4__Impl rule__Quantifier__Group__5 ;
    public final void rule__Quantifier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2670:1: ( rule__Quantifier__Group__4__Impl rule__Quantifier__Group__5 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2671:2: rule__Quantifier__Group__4__Impl rule__Quantifier__Group__5
            {
            pushFollow(FOLLOW_rule__Quantifier__Group__4__Impl_in_rule__Quantifier__Group__45371);
            rule__Quantifier__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantifier__Group__5_in_rule__Quantifier__Group__45374);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2678:1: rule__Quantifier__Group__4__Impl : ( ( rule__Quantifier__PredicateAssignment_4 ) ) ;
    public final void rule__Quantifier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2682:1: ( ( ( rule__Quantifier__PredicateAssignment_4 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2683:1: ( ( rule__Quantifier__PredicateAssignment_4 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2683:1: ( ( rule__Quantifier__PredicateAssignment_4 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2684:1: ( rule__Quantifier__PredicateAssignment_4 )
            {
             before(grammarAccess.getQuantifierAccess().getPredicateAssignment_4()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2685:1: ( rule__Quantifier__PredicateAssignment_4 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2685:2: rule__Quantifier__PredicateAssignment_4
            {
            pushFollow(FOLLOW_rule__Quantifier__PredicateAssignment_4_in_rule__Quantifier__Group__4__Impl5401);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2695:1: rule__Quantifier__Group__5 : rule__Quantifier__Group__5__Impl ;
    public final void rule__Quantifier__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2699:1: ( rule__Quantifier__Group__5__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2700:2: rule__Quantifier__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Quantifier__Group__5__Impl_in_rule__Quantifier__Group__55431);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2706:1: rule__Quantifier__Group__5__Impl : ( ')' ) ;
    public final void rule__Quantifier__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2710:1: ( ( ')' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2711:1: ( ')' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2711:1: ( ')' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2712:1: ')'
            {
             before(grammarAccess.getQuantifierAccess().getRightParenthesisKeyword_5()); 
            match(input,24,FOLLOW_24_in_rule__Quantifier__Group__5__Impl5459); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2737:1: rule__Atomic__Group__0 : rule__Atomic__Group__0__Impl rule__Atomic__Group__1 ;
    public final void rule__Atomic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2741:1: ( rule__Atomic__Group__0__Impl rule__Atomic__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2742:2: rule__Atomic__Group__0__Impl rule__Atomic__Group__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group__0__Impl_in_rule__Atomic__Group__05502);
            rule__Atomic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group__1_in_rule__Atomic__Group__05505);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2749:1: rule__Atomic__Group__0__Impl : ( ( rule__Atomic__FunctionAssignment_0 ) ) ;
    public final void rule__Atomic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2753:1: ( ( ( rule__Atomic__FunctionAssignment_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2754:1: ( ( rule__Atomic__FunctionAssignment_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2754:1: ( ( rule__Atomic__FunctionAssignment_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2755:1: ( rule__Atomic__FunctionAssignment_0 )
            {
             before(grammarAccess.getAtomicAccess().getFunctionAssignment_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2756:1: ( rule__Atomic__FunctionAssignment_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2756:2: rule__Atomic__FunctionAssignment_0
            {
            pushFollow(FOLLOW_rule__Atomic__FunctionAssignment_0_in_rule__Atomic__Group__0__Impl5532);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2766:1: rule__Atomic__Group__1 : rule__Atomic__Group__1__Impl rule__Atomic__Group__2 ;
    public final void rule__Atomic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2770:1: ( rule__Atomic__Group__1__Impl rule__Atomic__Group__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2771:2: rule__Atomic__Group__1__Impl rule__Atomic__Group__2
            {
            pushFollow(FOLLOW_rule__Atomic__Group__1__Impl_in_rule__Atomic__Group__15562);
            rule__Atomic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group__2_in_rule__Atomic__Group__15565);
            rule__Atomic__Group__2();

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2778:1: rule__Atomic__Group__1__Impl : ( '(' ) ;
    public final void rule__Atomic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2782:1: ( ( '(' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2783:1: ( '(' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2783:1: ( '(' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2784:1: '('
            {
             before(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__Atomic__Group__1__Impl5593); 
             after(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Atomic__Group__2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2797:1: rule__Atomic__Group__2 : rule__Atomic__Group__2__Impl rule__Atomic__Group__3 ;
    public final void rule__Atomic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2801:1: ( rule__Atomic__Group__2__Impl rule__Atomic__Group__3 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2802:2: rule__Atomic__Group__2__Impl rule__Atomic__Group__3
            {
            pushFollow(FOLLOW_rule__Atomic__Group__2__Impl_in_rule__Atomic__Group__25624);
            rule__Atomic__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group__3_in_rule__Atomic__Group__25627);
            rule__Atomic__Group__3();

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
    // $ANTLR end "rule__Atomic__Group__2"


    // $ANTLR start "rule__Atomic__Group__2__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2809:1: rule__Atomic__Group__2__Impl : ( ( rule__Atomic__Group_2__0 )? ) ;
    public final void rule__Atomic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2813:1: ( ( ( rule__Atomic__Group_2__0 )? ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2814:1: ( ( rule__Atomic__Group_2__0 )? )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2814:1: ( ( rule__Atomic__Group_2__0 )? )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2815:1: ( rule__Atomic__Group_2__0 )?
            {
             before(grammarAccess.getAtomicAccess().getGroup_2()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2816:1: ( rule__Atomic__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_INT)||LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2816:2: rule__Atomic__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_2__0_in_rule__Atomic__Group__2__Impl5654);
                    rule__Atomic__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtomicAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group__2__Impl"


    // $ANTLR start "rule__Atomic__Group__3"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2826:1: rule__Atomic__Group__3 : rule__Atomic__Group__3__Impl ;
    public final void rule__Atomic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2830:1: ( rule__Atomic__Group__3__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2831:2: rule__Atomic__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group__3__Impl_in_rule__Atomic__Group__35685);
            rule__Atomic__Group__3__Impl();

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
    // $ANTLR end "rule__Atomic__Group__3"


    // $ANTLR start "rule__Atomic__Group__3__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2837:1: rule__Atomic__Group__3__Impl : ( ')' ) ;
    public final void rule__Atomic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2841:1: ( ( ')' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2842:1: ( ')' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2842:1: ( ')' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2843:1: ')'
            {
             before(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Atomic__Group__3__Impl5713); 
             after(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group__3__Impl"


    // $ANTLR start "rule__Atomic__Group_2__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2864:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2868:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2869:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__05752);
            rule__Atomic__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__05755);
            rule__Atomic__Group_2__1();

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
    // $ANTLR end "rule__Atomic__Group_2__0"


    // $ANTLR start "rule__Atomic__Group_2__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2876:1: rule__Atomic__Group_2__0__Impl : ( ( rule__Atomic__ArgsAssignment_2_0 ) ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2880:1: ( ( ( rule__Atomic__ArgsAssignment_2_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2881:1: ( ( rule__Atomic__ArgsAssignment_2_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2881:1: ( ( rule__Atomic__ArgsAssignment_2_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2882:1: ( rule__Atomic__ArgsAssignment_2_0 )
            {
             before(grammarAccess.getAtomicAccess().getArgsAssignment_2_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2883:1: ( rule__Atomic__ArgsAssignment_2_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2883:2: rule__Atomic__ArgsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Atomic__ArgsAssignment_2_0_in_rule__Atomic__Group_2__0__Impl5782);
            rule__Atomic__ArgsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getArgsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__0__Impl"


    // $ANTLR start "rule__Atomic__Group_2__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2893:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2897:1: ( rule__Atomic__Group_2__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2898:2: rule__Atomic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__15812);
            rule__Atomic__Group_2__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_2__1"


    // $ANTLR start "rule__Atomic__Group_2__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2904:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__Group_2_1__0 )* ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2908:1: ( ( ( rule__Atomic__Group_2_1__0 )* ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2909:1: ( ( rule__Atomic__Group_2_1__0 )* )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2909:1: ( ( rule__Atomic__Group_2_1__0 )* )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2910:1: ( rule__Atomic__Group_2_1__0 )*
            {
             before(grammarAccess.getAtomicAccess().getGroup_2_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2911:1: ( rule__Atomic__Group_2_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==26) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2911:2: rule__Atomic__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Atomic__Group_2_1__0_in_rule__Atomic__Group_2__1__Impl5839);
            	    rule__Atomic__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getAtomicAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__1__Impl"


    // $ANTLR start "rule__Atomic__Group_2_1__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2925:1: rule__Atomic__Group_2_1__0 : rule__Atomic__Group_2_1__0__Impl rule__Atomic__Group_2_1__1 ;
    public final void rule__Atomic__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2929:1: ( rule__Atomic__Group_2_1__0__Impl rule__Atomic__Group_2_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2930:2: rule__Atomic__Group_2_1__0__Impl rule__Atomic__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2_1__0__Impl_in_rule__Atomic__Group_2_1__05874);
            rule__Atomic__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_2_1__1_in_rule__Atomic__Group_2_1__05877);
            rule__Atomic__Group_2_1__1();

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
    // $ANTLR end "rule__Atomic__Group_2_1__0"


    // $ANTLR start "rule__Atomic__Group_2_1__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2937:1: rule__Atomic__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Atomic__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2941:1: ( ( ',' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2942:1: ( ',' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2942:1: ( ',' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2943:1: ','
            {
             before(grammarAccess.getAtomicAccess().getCommaKeyword_2_1_0()); 
            match(input,26,FOLLOW_26_in_rule__Atomic__Group_2_1__0__Impl5905); 
             after(grammarAccess.getAtomicAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2_1__0__Impl"


    // $ANTLR start "rule__Atomic__Group_2_1__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2956:1: rule__Atomic__Group_2_1__1 : rule__Atomic__Group_2_1__1__Impl ;
    public final void rule__Atomic__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2960:1: ( rule__Atomic__Group_2_1__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2961:2: rule__Atomic__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2_1__1__Impl_in_rule__Atomic__Group_2_1__15936);
            rule__Atomic__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_2_1__1"


    // $ANTLR start "rule__Atomic__Group_2_1__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2967:1: rule__Atomic__Group_2_1__1__Impl : ( ( rule__Atomic__ArgsAssignment_2_1_1 ) ) ;
    public final void rule__Atomic__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2971:1: ( ( ( rule__Atomic__ArgsAssignment_2_1_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2972:1: ( ( rule__Atomic__ArgsAssignment_2_1_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2972:1: ( ( rule__Atomic__ArgsAssignment_2_1_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2973:1: ( rule__Atomic__ArgsAssignment_2_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getArgsAssignment_2_1_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2974:1: ( rule__Atomic__ArgsAssignment_2_1_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2974:2: rule__Atomic__ArgsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Atomic__ArgsAssignment_2_1_1_in_rule__Atomic__Group_2_1__1__Impl5963);
            rule__Atomic__ArgsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getArgsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2_1__1__Impl"


    // $ANTLR start "rule__Theorem__Group__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2988:1: rule__Theorem__Group__0 : rule__Theorem__Group__0__Impl rule__Theorem__Group__1 ;
    public final void rule__Theorem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2992:1: ( rule__Theorem__Group__0__Impl rule__Theorem__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2993:2: rule__Theorem__Group__0__Impl rule__Theorem__Group__1
            {
            pushFollow(FOLLOW_rule__Theorem__Group__0__Impl_in_rule__Theorem__Group__05997);
            rule__Theorem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__1_in_rule__Theorem__Group__06000);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3000:1: rule__Theorem__Group__0__Impl : ( ( rule__Theorem__RequirementAssignment_0 ) ) ;
    public final void rule__Theorem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3004:1: ( ( ( rule__Theorem__RequirementAssignment_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3005:1: ( ( rule__Theorem__RequirementAssignment_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3005:1: ( ( rule__Theorem__RequirementAssignment_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3006:1: ( rule__Theorem__RequirementAssignment_0 )
            {
             before(grammarAccess.getTheoremAccess().getRequirementAssignment_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3007:1: ( rule__Theorem__RequirementAssignment_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3007:2: rule__Theorem__RequirementAssignment_0
            {
            pushFollow(FOLLOW_rule__Theorem__RequirementAssignment_0_in_rule__Theorem__Group__0__Impl6027);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3017:1: rule__Theorem__Group__1 : rule__Theorem__Group__1__Impl rule__Theorem__Group__2 ;
    public final void rule__Theorem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3021:1: ( rule__Theorem__Group__1__Impl rule__Theorem__Group__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3022:2: rule__Theorem__Group__1__Impl rule__Theorem__Group__2
            {
            pushFollow(FOLLOW_rule__Theorem__Group__1__Impl_in_rule__Theorem__Group__16057);
            rule__Theorem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__2_in_rule__Theorem__Group__16060);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3029:1: rule__Theorem__Group__1__Impl : ( '->' ) ;
    public final void rule__Theorem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3033:1: ( ( '->' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3034:1: ( '->' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3034:1: ( '->' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3035:1: '->'
            {
             before(grammarAccess.getTheoremAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__Theorem__Group__1__Impl6088); 
             after(grammarAccess.getTheoremAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3048:1: rule__Theorem__Group__2 : rule__Theorem__Group__2__Impl rule__Theorem__Group__3 ;
    public final void rule__Theorem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3052:1: ( rule__Theorem__Group__2__Impl rule__Theorem__Group__3 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3053:2: rule__Theorem__Group__2__Impl rule__Theorem__Group__3
            {
            pushFollow(FOLLOW_rule__Theorem__Group__2__Impl_in_rule__Theorem__Group__26119);
            rule__Theorem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__3_in_rule__Theorem__Group__26122);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3060:1: rule__Theorem__Group__2__Impl : ( ( rule__Theorem__ResultAssignment_2 ) ) ;
    public final void rule__Theorem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3064:1: ( ( ( rule__Theorem__ResultAssignment_2 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3065:1: ( ( rule__Theorem__ResultAssignment_2 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3065:1: ( ( rule__Theorem__ResultAssignment_2 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3066:1: ( rule__Theorem__ResultAssignment_2 )
            {
             before(grammarAccess.getTheoremAccess().getResultAssignment_2()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3067:1: ( rule__Theorem__ResultAssignment_2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3067:2: rule__Theorem__ResultAssignment_2
            {
            pushFollow(FOLLOW_rule__Theorem__ResultAssignment_2_in_rule__Theorem__Group__2__Impl6149);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3077:1: rule__Theorem__Group__3 : rule__Theorem__Group__3__Impl rule__Theorem__Group__4 ;
    public final void rule__Theorem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3081:1: ( rule__Theorem__Group__3__Impl rule__Theorem__Group__4 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3082:2: rule__Theorem__Group__3__Impl rule__Theorem__Group__4
            {
            pushFollow(FOLLOW_rule__Theorem__Group__3__Impl_in_rule__Theorem__Group__36179);
            rule__Theorem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__4_in_rule__Theorem__Group__36182);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3089:1: rule__Theorem__Group__3__Impl : ( ',' ) ;
    public final void rule__Theorem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3093:1: ( ( ',' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3094:1: ( ',' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3094:1: ( ',' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3095:1: ','
            {
             before(grammarAccess.getTheoremAccess().getCommaKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__Theorem__Group__3__Impl6210); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3108:1: rule__Theorem__Group__4 : rule__Theorem__Group__4__Impl rule__Theorem__Group__5 ;
    public final void rule__Theorem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3112:1: ( rule__Theorem__Group__4__Impl rule__Theorem__Group__5 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3113:2: rule__Theorem__Group__4__Impl rule__Theorem__Group__5
            {
            pushFollow(FOLLOW_rule__Theorem__Group__4__Impl_in_rule__Theorem__Group__46241);
            rule__Theorem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__5_in_rule__Theorem__Group__46244);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3120:1: rule__Theorem__Group__4__Impl : ( ( rule__Theorem__CostAssignment_4 ) ) ;
    public final void rule__Theorem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3124:1: ( ( ( rule__Theorem__CostAssignment_4 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3125:1: ( ( rule__Theorem__CostAssignment_4 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3125:1: ( ( rule__Theorem__CostAssignment_4 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3126:1: ( rule__Theorem__CostAssignment_4 )
            {
             before(grammarAccess.getTheoremAccess().getCostAssignment_4()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3127:1: ( rule__Theorem__CostAssignment_4 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3127:2: rule__Theorem__CostAssignment_4
            {
            pushFollow(FOLLOW_rule__Theorem__CostAssignment_4_in_rule__Theorem__Group__4__Impl6271);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3137:1: rule__Theorem__Group__5 : rule__Theorem__Group__5__Impl rule__Theorem__Group__6 ;
    public final void rule__Theorem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3141:1: ( rule__Theorem__Group__5__Impl rule__Theorem__Group__6 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3142:2: rule__Theorem__Group__5__Impl rule__Theorem__Group__6
            {
            pushFollow(FOLLOW_rule__Theorem__Group__5__Impl_in_rule__Theorem__Group__56301);
            rule__Theorem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__6_in_rule__Theorem__Group__56304);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3149:1: rule__Theorem__Group__5__Impl : ( ',' ) ;
    public final void rule__Theorem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3153:1: ( ( ',' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3154:1: ( ',' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3154:1: ( ',' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3155:1: ','
            {
             before(grammarAccess.getTheoremAccess().getCommaKeyword_5()); 
            match(input,26,FOLLOW_26_in_rule__Theorem__Group__5__Impl6332); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3168:1: rule__Theorem__Group__6 : rule__Theorem__Group__6__Impl rule__Theorem__Group__7 ;
    public final void rule__Theorem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3172:1: ( rule__Theorem__Group__6__Impl rule__Theorem__Group__7 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3173:2: rule__Theorem__Group__6__Impl rule__Theorem__Group__7
            {
            pushFollow(FOLLOW_rule__Theorem__Group__6__Impl_in_rule__Theorem__Group__66363);
            rule__Theorem__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group__7_in_rule__Theorem__Group__66366);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3180:1: rule__Theorem__Group__6__Impl : ( ( rule__Theorem__DescriptionAssignment_6 ) ) ;
    public final void rule__Theorem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3184:1: ( ( ( rule__Theorem__DescriptionAssignment_6 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3185:1: ( ( rule__Theorem__DescriptionAssignment_6 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3185:1: ( ( rule__Theorem__DescriptionAssignment_6 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3186:1: ( rule__Theorem__DescriptionAssignment_6 )
            {
             before(grammarAccess.getTheoremAccess().getDescriptionAssignment_6()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3187:1: ( rule__Theorem__DescriptionAssignment_6 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3187:2: rule__Theorem__DescriptionAssignment_6
            {
            pushFollow(FOLLOW_rule__Theorem__DescriptionAssignment_6_in_rule__Theorem__Group__6__Impl6393);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3197:1: rule__Theorem__Group__7 : rule__Theorem__Group__7__Impl ;
    public final void rule__Theorem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3201:1: ( rule__Theorem__Group__7__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3202:2: rule__Theorem__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Theorem__Group__7__Impl_in_rule__Theorem__Group__76423);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3208:1: rule__Theorem__Group__7__Impl : ( ( rule__Theorem__Group_7__0 )? ) ;
    public final void rule__Theorem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3212:1: ( ( ( rule__Theorem__Group_7__0 )? ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3213:1: ( ( rule__Theorem__Group_7__0 )? )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3213:1: ( ( rule__Theorem__Group_7__0 )? )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3214:1: ( rule__Theorem__Group_7__0 )?
            {
             before(grammarAccess.getTheoremAccess().getGroup_7()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3215:1: ( rule__Theorem__Group_7__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3215:2: rule__Theorem__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Theorem__Group_7__0_in_rule__Theorem__Group__7__Impl6450);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3241:1: rule__Theorem__Group_7__0 : rule__Theorem__Group_7__0__Impl rule__Theorem__Group_7__1 ;
    public final void rule__Theorem__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3245:1: ( rule__Theorem__Group_7__0__Impl rule__Theorem__Group_7__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3246:2: rule__Theorem__Group_7__0__Impl rule__Theorem__Group_7__1
            {
            pushFollow(FOLLOW_rule__Theorem__Group_7__0__Impl_in_rule__Theorem__Group_7__06497);
            rule__Theorem__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Theorem__Group_7__1_in_rule__Theorem__Group_7__06500);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3253:1: rule__Theorem__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Theorem__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3257:1: ( ( ',' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3258:1: ( ',' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3258:1: ( ',' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3259:1: ','
            {
             before(grammarAccess.getTheoremAccess().getCommaKeyword_7_0()); 
            match(input,26,FOLLOW_26_in_rule__Theorem__Group_7__0__Impl6528); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3272:1: rule__Theorem__Group_7__1 : rule__Theorem__Group_7__1__Impl ;
    public final void rule__Theorem__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3276:1: ( rule__Theorem__Group_7__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3277:2: rule__Theorem__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Theorem__Group_7__1__Impl_in_rule__Theorem__Group_7__16559);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3283:1: rule__Theorem__Group_7__1__Impl : ( ( rule__Theorem__PseudoCodeAssignment_7_1 ) ) ;
    public final void rule__Theorem__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3287:1: ( ( ( rule__Theorem__PseudoCodeAssignment_7_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3288:1: ( ( rule__Theorem__PseudoCodeAssignment_7_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3288:1: ( ( rule__Theorem__PseudoCodeAssignment_7_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3289:1: ( rule__Theorem__PseudoCodeAssignment_7_1 )
            {
             before(grammarAccess.getTheoremAccess().getPseudoCodeAssignment_7_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3290:1: ( rule__Theorem__PseudoCodeAssignment_7_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3290:2: rule__Theorem__PseudoCodeAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Theorem__PseudoCodeAssignment_7_1_in_rule__Theorem__Group_7__1__Impl6586);
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


    // $ANTLR start "rule__Addition__Group__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3304:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3308:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3309:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__06620);
            rule__Addition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__06623);
            rule__Addition__Group__1();

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
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3316:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3320:1: ( ( ruleMultiplication ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3321:1: ( ruleMultiplication )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3321:1: ( ruleMultiplication )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3322:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl6650);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3333:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3337:1: ( rule__Addition__Group__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3338:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__16679);
            rule__Addition__Group__1__Impl();

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
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3344:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3348:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3349:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3349:1: ( ( rule__Addition__Group_1__0 )* )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3350:1: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3351:1: ( rule__Addition__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=17 && LA22_0<=18)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3351:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl6706);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getAdditionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3365:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3369:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3370:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__06741);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__06744);
            rule__Addition__Group_1__1();

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
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3377:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3381:1: ( ( () ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3382:1: ( () )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3382:1: ( () )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3383:1: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3384:1: ()
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3386:1: 
            {
            }

             after(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3396:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3400:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3401:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__16802);
            rule__Addition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1__2_in_rule__Addition__Group_1__16805);
            rule__Addition__Group_1__2();

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
    // $ANTLR end "rule__Addition__Group_1__1"


    // $ANTLR start "rule__Addition__Group_1__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3408:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__SymbolAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3412:1: ( ( ( rule__Addition__SymbolAssignment_1_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3413:1: ( ( rule__Addition__SymbolAssignment_1_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3413:1: ( ( rule__Addition__SymbolAssignment_1_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3414:1: ( rule__Addition__SymbolAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getSymbolAssignment_1_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3415:1: ( rule__Addition__SymbolAssignment_1_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3415:2: rule__Addition__SymbolAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Addition__SymbolAssignment_1_1_in_rule__Addition__Group_1__1__Impl6832);
            rule__Addition__SymbolAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getSymbolAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3425:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3429:1: ( rule__Addition__Group_1__2__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3430:2: rule__Addition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__2__Impl_in_rule__Addition__Group_1__26862);
            rule__Addition__Group_1__2__Impl();

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
    // $ANTLR end "rule__Addition__Group_1__2"


    // $ANTLR start "rule__Addition__Group_1__2__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3436:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3440:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3441:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3441:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3442:1: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3443:1: ( rule__Addition__RightAssignment_1_2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3443:2: rule__Addition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Addition__RightAssignment_1_2_in_rule__Addition__Group_1__2__Impl6889);
            rule__Addition__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__2__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3459:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3463:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3464:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__06925);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__06928);
            rule__Multiplication__Group__1();

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
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3471:1: rule__Multiplication__Group__0__Impl : ( ruleNumericalPrimary ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3475:1: ( ( ruleNumericalPrimary ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3476:1: ( ruleNumericalPrimary )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3476:1: ( ruleNumericalPrimary )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3477:1: ruleNumericalPrimary
            {
             before(grammarAccess.getMultiplicationAccess().getNumericalPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleNumericalPrimary_in_rule__Multiplication__Group__0__Impl6955);
            ruleNumericalPrimary();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getNumericalPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3488:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3492:1: ( rule__Multiplication__Group__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3493:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__16984);
            rule__Multiplication__Group__1__Impl();

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
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3499:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3503:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3504:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3504:1: ( ( rule__Multiplication__Group_1__0 )* )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3505:1: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3506:1: ( rule__Multiplication__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=19 && LA23_0<=20)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3506:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl7011);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getMultiplicationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3520:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3524:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3525:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__07046);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__07049);
            rule__Multiplication__Group_1__1();

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
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3532:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3536:1: ( ( () ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3537:1: ( () )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3537:1: ( () )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3538:1: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3539:1: ()
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3541:1: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3551:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3555:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3556:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__17107);
            rule__Multiplication__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1__2_in_rule__Multiplication__Group_1__17110);
            rule__Multiplication__Group_1__2();

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
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3563:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__SymbolAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3567:1: ( ( ( rule__Multiplication__SymbolAssignment_1_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3568:1: ( ( rule__Multiplication__SymbolAssignment_1_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3568:1: ( ( rule__Multiplication__SymbolAssignment_1_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3569:1: ( rule__Multiplication__SymbolAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getSymbolAssignment_1_1()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3570:1: ( rule__Multiplication__SymbolAssignment_1_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3570:2: rule__Multiplication__SymbolAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Multiplication__SymbolAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl7137);
            rule__Multiplication__SymbolAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getSymbolAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3580:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3584:1: ( rule__Multiplication__Group_1__2__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3585:2: rule__Multiplication__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__2__Impl_in_rule__Multiplication__Group_1__27167);
            rule__Multiplication__Group_1__2__Impl();

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
    // $ANTLR end "rule__Multiplication__Group_1__2"


    // $ANTLR start "rule__Multiplication__Group_1__2__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3591:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3595:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3596:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3596:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3597:1: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3598:1: ( rule__Multiplication__RightAssignment_1_2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3598:2: rule__Multiplication__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Multiplication__RightAssignment_1_2_in_rule__Multiplication__Group_1__2__Impl7194);
            rule__Multiplication__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__2__Impl"


    // $ANTLR start "rule__NumericalPrimary__Group_2__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3614:1: rule__NumericalPrimary__Group_2__0 : rule__NumericalPrimary__Group_2__0__Impl rule__NumericalPrimary__Group_2__1 ;
    public final void rule__NumericalPrimary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3618:1: ( rule__NumericalPrimary__Group_2__0__Impl rule__NumericalPrimary__Group_2__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3619:2: rule__NumericalPrimary__Group_2__0__Impl rule__NumericalPrimary__Group_2__1
            {
            pushFollow(FOLLOW_rule__NumericalPrimary__Group_2__0__Impl_in_rule__NumericalPrimary__Group_2__07230);
            rule__NumericalPrimary__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumericalPrimary__Group_2__1_in_rule__NumericalPrimary__Group_2__07233);
            rule__NumericalPrimary__Group_2__1();

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
    // $ANTLR end "rule__NumericalPrimary__Group_2__0"


    // $ANTLR start "rule__NumericalPrimary__Group_2__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3626:1: rule__NumericalPrimary__Group_2__0__Impl : ( '(' ) ;
    public final void rule__NumericalPrimary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3630:1: ( ( '(' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3631:1: ( '(' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3631:1: ( '(' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3632:1: '('
            {
             before(grammarAccess.getNumericalPrimaryAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,23,FOLLOW_23_in_rule__NumericalPrimary__Group_2__0__Impl7261); 
             after(grammarAccess.getNumericalPrimaryAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericalPrimary__Group_2__0__Impl"


    // $ANTLR start "rule__NumericalPrimary__Group_2__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3645:1: rule__NumericalPrimary__Group_2__1 : rule__NumericalPrimary__Group_2__1__Impl rule__NumericalPrimary__Group_2__2 ;
    public final void rule__NumericalPrimary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3649:1: ( rule__NumericalPrimary__Group_2__1__Impl rule__NumericalPrimary__Group_2__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3650:2: rule__NumericalPrimary__Group_2__1__Impl rule__NumericalPrimary__Group_2__2
            {
            pushFollow(FOLLOW_rule__NumericalPrimary__Group_2__1__Impl_in_rule__NumericalPrimary__Group_2__17292);
            rule__NumericalPrimary__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumericalPrimary__Group_2__2_in_rule__NumericalPrimary__Group_2__17295);
            rule__NumericalPrimary__Group_2__2();

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
    // $ANTLR end "rule__NumericalPrimary__Group_2__1"


    // $ANTLR start "rule__NumericalPrimary__Group_2__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3657:1: rule__NumericalPrimary__Group_2__1__Impl : ( ruleNumericalPrimary ) ;
    public final void rule__NumericalPrimary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3661:1: ( ( ruleNumericalPrimary ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3662:1: ( ruleNumericalPrimary )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3662:1: ( ruleNumericalPrimary )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3663:1: ruleNumericalPrimary
            {
             before(grammarAccess.getNumericalPrimaryAccess().getNumericalPrimaryParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleNumericalPrimary_in_rule__NumericalPrimary__Group_2__1__Impl7322);
            ruleNumericalPrimary();

            state._fsp--;

             after(grammarAccess.getNumericalPrimaryAccess().getNumericalPrimaryParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericalPrimary__Group_2__1__Impl"


    // $ANTLR start "rule__NumericalPrimary__Group_2__2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3674:1: rule__NumericalPrimary__Group_2__2 : rule__NumericalPrimary__Group_2__2__Impl ;
    public final void rule__NumericalPrimary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3678:1: ( rule__NumericalPrimary__Group_2__2__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3679:2: rule__NumericalPrimary__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__NumericalPrimary__Group_2__2__Impl_in_rule__NumericalPrimary__Group_2__27351);
            rule__NumericalPrimary__Group_2__2__Impl();

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
    // $ANTLR end "rule__NumericalPrimary__Group_2__2"


    // $ANTLR start "rule__NumericalPrimary__Group_2__2__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3685:1: rule__NumericalPrimary__Group_2__2__Impl : ( ')' ) ;
    public final void rule__NumericalPrimary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3689:1: ( ( ')' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3690:1: ( ')' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3690:1: ( ')' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3691:1: ')'
            {
             before(grammarAccess.getNumericalPrimaryAccess().getRightParenthesisKeyword_2_2()); 
            match(input,24,FOLLOW_24_in_rule__NumericalPrimary__Group_2__2__Impl7379); 
             after(grammarAccess.getNumericalPrimaryAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericalPrimary__Group_2__2__Impl"


    // $ANTLR start "rule__Input__GivenAssignment_1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3711:1: rule__Input__GivenAssignment_1 : ( ruleProblem ) ;
    public final void rule__Input__GivenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3715:1: ( ( ruleProblem ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3716:1: ( ruleProblem )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3716:1: ( ruleProblem )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3717:1: ruleProblem
            {
             before(grammarAccess.getInputAccess().getGivenProblemParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleProblem_in_rule__Input__GivenAssignment_17421);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3726:1: rule__Input__TaskAssignment_3_0_0 : ( ( rule__Input__TaskAlternatives_3_0_0_0 ) ) ;
    public final void rule__Input__TaskAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3730:1: ( ( ( rule__Input__TaskAlternatives_3_0_0_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3731:1: ( ( rule__Input__TaskAlternatives_3_0_0_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3731:1: ( ( rule__Input__TaskAlternatives_3_0_0_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3732:1: ( rule__Input__TaskAlternatives_3_0_0_0 )
            {
             before(grammarAccess.getInputAccess().getTaskAlternatives_3_0_0_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3733:1: ( rule__Input__TaskAlternatives_3_0_0_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3733:2: rule__Input__TaskAlternatives_3_0_0_0
            {
            pushFollow(FOLLOW_rule__Input__TaskAlternatives_3_0_0_0_in_rule__Input__TaskAssignment_3_0_07452);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3742:1: rule__Input__GoalAssignment_3_0_1 : ( ruleProblem ) ;
    public final void rule__Input__GoalAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3746:1: ( ( ruleProblem ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3747:1: ( ruleProblem )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3747:1: ( ruleProblem )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3748:1: ruleProblem
            {
             before(grammarAccess.getInputAccess().getGoalProblemParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_ruleProblem_in_rule__Input__GoalAssignment_3_0_17485);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3757:1: rule__Input__TaskAssignment_3_1_0 : ( ( 'Test' ) ) ;
    public final void rule__Input__TaskAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3761:1: ( ( ( 'Test' ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3762:1: ( ( 'Test' ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3762:1: ( ( 'Test' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3763:1: ( 'Test' )
            {
             before(grammarAccess.getInputAccess().getTaskTestKeyword_3_1_0_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3764:1: ( 'Test' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3765:1: 'Test'
            {
             before(grammarAccess.getInputAccess().getTaskTestKeyword_3_1_0_0()); 
            match(input,37,FOLLOW_37_in_rule__Input__TaskAssignment_3_1_07521); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3780:1: rule__Input__GoalAssignment_3_1_2 : ( ruleProblemNoVars ) ;
    public final void rule__Input__GoalAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3784:1: ( ( ruleProblemNoVars ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3785:1: ( ruleProblemNoVars )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3785:1: ( ruleProblemNoVars )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3786:1: ruleProblemNoVars
            {
             before(grammarAccess.getInputAccess().getGoalProblemNoVarsParserRuleCall_3_1_2_0()); 
            pushFollow(FOLLOW_ruleProblemNoVars_in_rule__Input__GoalAssignment_3_1_27560);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3795:1: rule__Input__TheoremsAssignment_4_2 : ( ruleTheorem ) ;
    public final void rule__Input__TheoremsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3799:1: ( ( ruleTheorem ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3800:1: ( ruleTheorem )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3800:1: ( ruleTheorem )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3801:1: ruleTheorem
            {
             before(grammarAccess.getInputAccess().getTheoremsTheoremParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleTheorem_in_rule__Input__TheoremsAssignment_4_27591);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3810:1: rule__Input__TheoremsAssignment_4_3_1 : ( ruleTheorem ) ;
    public final void rule__Input__TheoremsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3814:1: ( ( ruleTheorem ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3815:1: ( ruleTheorem )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3815:1: ( ruleTheorem )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3816:1: ruleTheorem
            {
             before(grammarAccess.getInputAccess().getTheoremsTheoremParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_ruleTheorem_in_rule__Input__TheoremsAssignment_4_3_17622);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3825:1: rule__ProblemNoVars__PropertyAssignment : ( ruleORing ) ;
    public final void rule__ProblemNoVars__PropertyAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3829:1: ( ( ruleORing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3830:1: ( ruleORing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3830:1: ( ruleORing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3831:1: ruleORing
            {
             before(grammarAccess.getProblemNoVarsAccess().getPropertyORingParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleORing_in_rule__ProblemNoVars__PropertyAssignment7653);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3840:1: rule__Problem__VarsAssignment_0 : ( ruleDeclaration ) ;
    public final void rule__Problem__VarsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3844:1: ( ( ruleDeclaration ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3845:1: ( ruleDeclaration )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3845:1: ( ruleDeclaration )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3846:1: ruleDeclaration
            {
             before(grammarAccess.getProblemAccess().getVarsDeclarationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDeclaration_in_rule__Problem__VarsAssignment_07684);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3855:1: rule__Problem__VarsAssignment_1_1 : ( ruleDeclaration ) ;
    public final void rule__Problem__VarsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3859:1: ( ( ruleDeclaration ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3860:1: ( ruleDeclaration )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3860:1: ( ruleDeclaration )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3861:1: ruleDeclaration
            {
             before(grammarAccess.getProblemAccess().getVarsDeclarationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleDeclaration_in_rule__Problem__VarsAssignment_1_17715);
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


    // $ANTLR start "rule__Problem__PropertyAssignment_2_1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3870:1: rule__Problem__PropertyAssignment_2_1 : ( ruleORing ) ;
    public final void rule__Problem__PropertyAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3874:1: ( ( ruleORing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3875:1: ( ruleORing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3875:1: ( ruleORing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3876:1: ruleORing
            {
             before(grammarAccess.getProblemAccess().getPropertyORingParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleORing_in_rule__Problem__PropertyAssignment_2_17746);
            ruleORing();

            state._fsp--;

             after(grammarAccess.getProblemAccess().getPropertyORingParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__PropertyAssignment_2_1"


    // $ANTLR start "rule__Declaration__TypeAssignment_0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3885:1: rule__Declaration__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Declaration__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3889:1: ( ( ruleType ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3890:1: ( ruleType )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3890:1: ( ruleType )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3891:1: ruleType
            {
             before(grammarAccess.getDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Declaration__TypeAssignment_07777);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__TypeAssignment_0"


    // $ANTLR start "rule__Declaration__VarNameAssignment_1_0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3900:1: rule__Declaration__VarNameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Declaration__VarNameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3904:1: ( ( RULE_ID ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3905:1: ( RULE_ID )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3905:1: ( RULE_ID )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3906:1: RULE_ID
            {
             before(grammarAccess.getDeclarationAccess().getVarNameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Declaration__VarNameAssignment_1_07808); 
             after(grammarAccess.getDeclarationAccess().getVarNameIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__VarNameAssignment_1_0"


    // $ANTLR start "rule__Declaration__VarNameAssignment_1_1_1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3915:1: rule__Declaration__VarNameAssignment_1_1_1 : ( RULE_ID ) ;
    public final void rule__Declaration__VarNameAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3919:1: ( ( RULE_ID ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3920:1: ( RULE_ID )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3920:1: ( RULE_ID )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3921:1: RULE_ID
            {
             before(grammarAccess.getDeclarationAccess().getVarNameIDTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Declaration__VarNameAssignment_1_1_17839); 
             after(grammarAccess.getDeclarationAccess().getVarNameIDTerminalRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__VarNameAssignment_1_1_1"


    // $ANTLR start "rule__Type__NameAssignment_0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3930:1: rule__Type__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3934:1: ( ( RULE_ID ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3935:1: ( RULE_ID )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3935:1: ( RULE_ID )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3936:1: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Type__NameAssignment_07870); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3945:1: rule__Type__TemplateTypeAssignment_1_1 : ( ruleType ) ;
    public final void rule__Type__TemplateTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3949:1: ( ( ruleType ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3950:1: ( ruleType )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3950:1: ( ruleType )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3951:1: ruleType
            {
             before(grammarAccess.getTypeAccess().getTemplateTypeTypeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Type__TemplateTypeAssignment_1_17901);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3960:1: rule__ORing__RightAssignment_1_2 : ( ruleANDing ) ;
    public final void rule__ORing__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3964:1: ( ( ruleANDing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3965:1: ( ruleANDing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3965:1: ( ruleANDing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3966:1: ruleANDing
            {
             before(grammarAccess.getORingAccess().getRightANDingParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleANDing_in_rule__ORing__RightAssignment_1_27932);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3975:1: rule__ANDing__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__ANDing__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3979:1: ( ( rulePrimary ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3980:1: ( rulePrimary )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3980:1: ( rulePrimary )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3981:1: rulePrimary
            {
             before(grammarAccess.getANDingAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__ANDing__RightAssignment_1_27963);
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


    // $ANTLR start "rule__ProblemShell__ProblemAssignment_1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3990:1: rule__ProblemShell__ProblemAssignment_1 : ( ruleProblem ) ;
    public final void rule__ProblemShell__ProblemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3994:1: ( ( ruleProblem ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3995:1: ( ruleProblem )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3995:1: ( ruleProblem )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3996:1: ruleProblem
            {
             before(grammarAccess.getProblemShellAccess().getProblemProblemParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleProblem_in_rule__ProblemShell__ProblemAssignment_17994);
            ruleProblem();

            state._fsp--;

             after(grammarAccess.getProblemShellAccess().getProblemProblemParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemShell__ProblemAssignment_1"


    // $ANTLR start "rule__Negation__NegatedAssignment_1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4005:1: rule__Negation__NegatedAssignment_1 : ( rulePrimary ) ;
    public final void rule__Negation__NegatedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4009:1: ( ( rulePrimary ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4010:1: ( rulePrimary )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4010:1: ( rulePrimary )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4011:1: rulePrimary
            {
             before(grammarAccess.getNegationAccess().getNegatedPrimaryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__Negation__NegatedAssignment_18025);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getNegationAccess().getNegatedPrimaryParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__NegatedAssignment_1"


    // $ANTLR start "rule__Quantifier__QuantifierAssignment_0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4020:1: rule__Quantifier__QuantifierAssignment_0 : ( ( rule__Quantifier__QuantifierAlternatives_0_0 ) ) ;
    public final void rule__Quantifier__QuantifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4024:1: ( ( ( rule__Quantifier__QuantifierAlternatives_0_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4025:1: ( ( rule__Quantifier__QuantifierAlternatives_0_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4025:1: ( ( rule__Quantifier__QuantifierAlternatives_0_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4026:1: ( rule__Quantifier__QuantifierAlternatives_0_0 )
            {
             before(grammarAccess.getQuantifierAccess().getQuantifierAlternatives_0_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4027:1: ( rule__Quantifier__QuantifierAlternatives_0_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4027:2: rule__Quantifier__QuantifierAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__Quantifier__QuantifierAlternatives_0_0_in_rule__Quantifier__QuantifierAssignment_08056);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4036:1: rule__Quantifier__SubjectAssignment_2 : ( ruleProblem ) ;
    public final void rule__Quantifier__SubjectAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4040:1: ( ( ruleProblem ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4041:1: ( ruleProblem )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4041:1: ( ruleProblem )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4042:1: ruleProblem
            {
             before(grammarAccess.getQuantifierAccess().getSubjectProblemParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleProblem_in_rule__Quantifier__SubjectAssignment_28089);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4051:1: rule__Quantifier__PredicateAssignment_4 : ( ruleORing ) ;
    public final void rule__Quantifier__PredicateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4055:1: ( ( ruleORing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4056:1: ( ruleORing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4056:1: ( ruleORing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4057:1: ruleORing
            {
             before(grammarAccess.getQuantifierAccess().getPredicateORingParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleORing_in_rule__Quantifier__PredicateAssignment_48120);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4066:1: rule__Atomic__FunctionAssignment_0 : ( RULE_ID ) ;
    public final void rule__Atomic__FunctionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4070:1: ( ( RULE_ID ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4071:1: ( RULE_ID )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4071:1: ( RULE_ID )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4072:1: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getFunctionIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Atomic__FunctionAssignment_08151); 
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


    // $ANTLR start "rule__Atomic__ArgsAssignment_2_0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4081:1: rule__Atomic__ArgsAssignment_2_0 : ( ruleArgument ) ;
    public final void rule__Atomic__ArgsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4085:1: ( ( ruleArgument ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4086:1: ( ruleArgument )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4086:1: ( ruleArgument )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4087:1: ruleArgument
            {
             before(grammarAccess.getAtomicAccess().getArgsArgumentParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__Atomic__ArgsAssignment_2_08182);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getAtomicAccess().getArgsArgumentParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ArgsAssignment_2_0"


    // $ANTLR start "rule__Atomic__ArgsAssignment_2_1_1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4096:1: rule__Atomic__ArgsAssignment_2_1_1 : ( ruleArgument ) ;
    public final void rule__Atomic__ArgsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4100:1: ( ( ruleArgument ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4101:1: ( ruleArgument )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4101:1: ( ruleArgument )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4102:1: ruleArgument
            {
             before(grammarAccess.getAtomicAccess().getArgsArgumentParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__Atomic__ArgsAssignment_2_1_18213);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getAtomicAccess().getArgsArgumentParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ArgsAssignment_2_1_1"


    // $ANTLR start "rule__Variable__ArgAssignment"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4111:1: rule__Variable__ArgAssignment : ( RULE_ID ) ;
    public final void rule__Variable__ArgAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4115:1: ( ( RULE_ID ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4116:1: ( RULE_ID )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4116:1: ( RULE_ID )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4117:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getArgIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__ArgAssignment8244); 
             after(grammarAccess.getVariableAccess().getArgIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__ArgAssignment"


    // $ANTLR start "rule__BooleanLiteral__ValueAssignment"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4126:1: rule__BooleanLiteral__ValueAssignment : ( ( rule__BooleanLiteral__ValueAlternatives_0 ) ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4130:1: ( ( ( rule__BooleanLiteral__ValueAlternatives_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4131:1: ( ( rule__BooleanLiteral__ValueAlternatives_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4131:1: ( ( rule__BooleanLiteral__ValueAlternatives_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4132:1: ( rule__BooleanLiteral__ValueAlternatives_0 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4133:1: ( rule__BooleanLiteral__ValueAlternatives_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4133:2: rule__BooleanLiteral__ValueAlternatives_0
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__ValueAlternatives_0_in_rule__BooleanLiteral__ValueAssignment8275);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4142:1: rule__Theorem__RequirementAssignment_0 : ( ruleORing ) ;
    public final void rule__Theorem__RequirementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4146:1: ( ( ruleORing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4147:1: ( ruleORing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4147:1: ( ruleORing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4148:1: ruleORing
            {
             before(grammarAccess.getTheoremAccess().getRequirementORingParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleORing_in_rule__Theorem__RequirementAssignment_08308);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4157:1: rule__Theorem__ResultAssignment_2 : ( ruleORing ) ;
    public final void rule__Theorem__ResultAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4161:1: ( ( ruleORing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4162:1: ( ruleORing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4162:1: ( ruleORing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4163:1: ruleORing
            {
             before(grammarAccess.getTheoremAccess().getResultORingParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleORing_in_rule__Theorem__ResultAssignment_28339);
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4172:1: rule__Theorem__CostAssignment_4 : ( RULE_INT ) ;
    public final void rule__Theorem__CostAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4176:1: ( ( RULE_INT ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4177:1: ( RULE_INT )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4177:1: ( RULE_INT )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4178:1: RULE_INT
            {
             before(grammarAccess.getTheoremAccess().getCostINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Theorem__CostAssignment_48370); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4187:1: rule__Theorem__DescriptionAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Theorem__DescriptionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4191:1: ( ( RULE_STRING ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4192:1: ( RULE_STRING )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4192:1: ( RULE_STRING )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4193:1: RULE_STRING
            {
             before(grammarAccess.getTheoremAccess().getDescriptionSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Theorem__DescriptionAssignment_68401); 
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4202:1: rule__Theorem__PseudoCodeAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__Theorem__PseudoCodeAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4206:1: ( ( RULE_STRING ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4207:1: ( RULE_STRING )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4207:1: ( RULE_STRING )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4208:1: RULE_STRING
            {
             before(grammarAccess.getTheoremAccess().getPseudoCodeSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Theorem__PseudoCodeAssignment_7_18432); 
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


    // $ANTLR start "rule__Addition__SymbolAssignment_1_1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4217:1: rule__Addition__SymbolAssignment_1_1 : ( ( rule__Addition__SymbolAlternatives_1_1_0 ) ) ;
    public final void rule__Addition__SymbolAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4221:1: ( ( ( rule__Addition__SymbolAlternatives_1_1_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4222:1: ( ( rule__Addition__SymbolAlternatives_1_1_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4222:1: ( ( rule__Addition__SymbolAlternatives_1_1_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4223:1: ( rule__Addition__SymbolAlternatives_1_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getSymbolAlternatives_1_1_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4224:1: ( rule__Addition__SymbolAlternatives_1_1_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4224:2: rule__Addition__SymbolAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Addition__SymbolAlternatives_1_1_0_in_rule__Addition__SymbolAssignment_1_18463);
            rule__Addition__SymbolAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getSymbolAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__SymbolAssignment_1_1"


    // $ANTLR start "rule__Addition__RightAssignment_1_2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4233:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4237:1: ( ( ruleMultiplication ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4238:1: ( ruleMultiplication )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4238:1: ( ruleMultiplication )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4239:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_28496);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__RightAssignment_1_2"


    // $ANTLR start "rule__Multiplication__SymbolAssignment_1_1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4248:1: rule__Multiplication__SymbolAssignment_1_1 : ( ( rule__Multiplication__SymbolAlternatives_1_1_0 ) ) ;
    public final void rule__Multiplication__SymbolAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4252:1: ( ( ( rule__Multiplication__SymbolAlternatives_1_1_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4253:1: ( ( rule__Multiplication__SymbolAlternatives_1_1_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4253:1: ( ( rule__Multiplication__SymbolAlternatives_1_1_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4254:1: ( rule__Multiplication__SymbolAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getSymbolAlternatives_1_1_0()); 
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4255:1: ( rule__Multiplication__SymbolAlternatives_1_1_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4255:2: rule__Multiplication__SymbolAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Multiplication__SymbolAlternatives_1_1_0_in_rule__Multiplication__SymbolAssignment_1_18527);
            rule__Multiplication__SymbolAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getSymbolAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__SymbolAssignment_1_1"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4264:1: rule__Multiplication__RightAssignment_1_2 : ( ruleNumericalPrimary ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4268:1: ( ( ruleNumericalPrimary ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4269:1: ( ruleNumericalPrimary )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4269:1: ( ruleNumericalPrimary )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4270:1: ruleNumericalPrimary
            {
             before(grammarAccess.getMultiplicationAccess().getRightNumericalPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleNumericalPrimary_in_rule__Multiplication__RightAssignment_1_28560);
            ruleNumericalPrimary();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getRightNumericalPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__RightAssignment_1_2"


    // $ANTLR start "rule__NumberLiteral__ValueAssignment"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4279:1: rule__NumberLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__NumberLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4283:1: ( ( RULE_INT ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4284:1: ( RULE_INT )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4284:1: ( RULE_INT )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4285:1: RULE_INT
            {
             before(grammarAccess.getNumberLiteralAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NumberLiteral__ValueAssignment8591); 
             after(grammarAccess.getNumberLiteralAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__ValueAssignment"

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
    public static final BitSet FOLLOW_rule__Declaration__Group__0_in_ruleDeclaration274 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleProblemShell_in_entryRuleProblemShell541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProblemShell548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemShell__Group__0_in_ruleProblemShell574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Group__0_in_ruleNegation634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_entryRuleQuantifier661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantifier668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__0_in_ruleQuantifier694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group__0_in_ruleAtomic754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleArgument814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__ArgAssignment_in_ruleVariable873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTheorem_in_entryRuleTheorem960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTheorem967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__0_in_ruleTheorem993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0_in_ruleAddition1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication1080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalPrimary_in_entryRuleNumericalPrimary1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalPrimary1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericalPrimary__Alternatives_in_ruleNumericalPrimary1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral1200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLiteral__ValueAssignment_in_ruleNumberLiteral1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_3_0__0_in_rule__Input__Alternatives_31269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_3_1__0_in_rule__Input__Alternatives_31287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Input__TaskAlternatives_3_0_0_01321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Input__TaskAlternatives_3_0_0_01341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__VarNameAssignment_1_0_in_rule__Declaration__Alternatives_11375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_1_1__0_in_rule__Declaration__Alternatives_11393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rule__Primary__Alternatives1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_rule__Primary__Alternatives1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblemShell_in_rule__Primary__Alternatives1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_3__0_in_rule__Primary__Alternatives1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__Primary__Alternatives1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_rule__Primary__Alternatives1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Quantifier__QuantifierAlternatives_0_01545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Quantifier__QuantifierAlternatives_0_01565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BooleanLiteral__ValueAlternatives_01600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BooleanLiteral__ValueAlternatives_01620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Addition__SymbolAlternatives_1_1_01655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Addition__SymbolAlternatives_1_1_01675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Multiplication__SymbolAlternatives_1_1_01710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Multiplication__SymbolAlternatives_1_1_01730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_rule__NumericalPrimary__Alternatives1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rule__NumericalPrimary__Alternatives1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericalPrimary__Group_2__0_in_rule__NumericalPrimary__Alternatives1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__NumericalPrimary__Alternatives1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__01846 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__Input__Group__1_in_rule__Input__Group__01849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Input__Group__0__Impl1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__11908 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Input__Group__2_in_rule__Input__Group__11911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__GivenAssignment_1_in_rule__Input__Group__1__Impl1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__2__Impl_in_rule__Input__Group__21968 = new BitSet(new long[]{0x0000002000001800L});
    public static final BitSet FOLLOW_rule__Input__Group__3_in_rule__Input__Group__21971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Input__Group__2__Impl1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__3__Impl_in_rule__Input__Group__32030 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Input__Group__4_in_rule__Input__Group__32033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Alternatives_3_in_rule__Input__Group__3__Impl2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__4__Impl_in_rule__Input__Group__42090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_4__0_in_rule__Input__Group__4__Impl2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_3_0__0__Impl_in_rule__Input__Group_3_0__02158 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__Input__Group_3_0__1_in_rule__Input__Group_3_0__02161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__TaskAssignment_3_0_0_in_rule__Input__Group_3_0__0__Impl2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_3_0__1__Impl_in_rule__Input__Group_3_0__12218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__GoalAssignment_3_0_1_in_rule__Input__Group_3_0__1__Impl2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_3_1__0__Impl_in_rule__Input__Group_3_1__02279 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Input__Group_3_1__1_in_rule__Input__Group_3_1__02282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__TaskAssignment_3_1_0_in_rule__Input__Group_3_1__0__Impl2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_3_1__1__Impl_in_rule__Input__Group_3_1__12339 = new BitSet(new long[]{0x000000050081E010L});
    public static final BitSet FOLLOW_rule__Input__Group_3_1__2_in_rule__Input__Group_3_1__12342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Input__Group_3_1__1__Impl2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_3_1__2__Impl_in_rule__Input__Group_3_1__22401 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Input__Group_3_1__3_in_rule__Input__Group_3_1__22404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__GoalAssignment_3_1_2_in_rule__Input__Group_3_1__2__Impl2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_3_1__3__Impl_in_rule__Input__Group_3_1__32461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Input__Group_3_1__3__Impl2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_4__0__Impl_in_rule__Input__Group_4__02528 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Input__Group_4__1_in_rule__Input__Group_4__02531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Input__Group_4__0__Impl2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_4__1__Impl_in_rule__Input__Group_4__12590 = new BitSet(new long[]{0x000000050081E010L});
    public static final BitSet FOLLOW_rule__Input__Group_4__2_in_rule__Input__Group_4__12593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Input__Group_4__1__Impl2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_4__2__Impl_in_rule__Input__Group_4__22652 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Input__Group_4__3_in_rule__Input__Group_4__22655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__TheoremsAssignment_4_2_in_rule__Input__Group_4__2__Impl2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_4__3__Impl_in_rule__Input__Group_4__32712 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Input__Group_4__4_in_rule__Input__Group_4__32715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_4_3__0_in_rule__Input__Group_4__3__Impl2742 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Input__Group_4__4__Impl_in_rule__Input__Group_4__42773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Input__Group_4__4__Impl2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_4_3__0__Impl_in_rule__Input__Group_4_3__02845 = new BitSet(new long[]{0x000000050081E010L});
    public static final BitSet FOLLOW_rule__Input__Group_4_3__1_in_rule__Input__Group_4_3__02848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Input__Group_4_3__0__Impl2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_4_3__1__Impl_in_rule__Input__Group_4_3__12907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__TheoremsAssignment_4_3_1_in_rule__Input__Group_4_3__1__Impl2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group__0__Impl_in_rule__Problem__Group__02968 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__Problem__Group__1_in_rule__Problem__Group__02971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__VarsAssignment_0_in_rule__Problem__Group__0__Impl2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group__1__Impl_in_rule__Problem__Group__13028 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__Problem__Group__2_in_rule__Problem__Group__13031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group_1__0_in_rule__Problem__Group__1__Impl3058 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Problem__Group__2__Impl_in_rule__Problem__Group__23089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group_2__0_in_rule__Problem__Group__2__Impl3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group_1__0__Impl_in_rule__Problem__Group_1__03153 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__Problem__Group_1__1_in_rule__Problem__Group_1__03156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Problem__Group_1__0__Impl3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group_1__1__Impl_in_rule__Problem__Group_1__13215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__VarsAssignment_1_1_in_rule__Problem__Group_1__1__Impl3242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group_2__0__Impl_in_rule__Problem__Group_2__03276 = new BitSet(new long[]{0x000000050081E010L});
    public static final BitSet FOLLOW_rule__Problem__Group_2__1_in_rule__Problem__Group_2__03279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Problem__Group_2__0__Impl3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group_2__1__Impl_in_rule__Problem__Group_2__13338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__PropertyAssignment_2_1_in_rule__Problem__Group_2__1__Impl3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__03399 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__03402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__TypeAssignment_0_in_rule__Declaration__Group__0__Impl3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__13460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Alternatives_1_in_rule__Declaration__Group__1__Impl3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_1_1__0__Impl_in_rule__Declaration__Group_1_1__03521 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Declaration__Group_1_1__1_in_rule__Declaration__Group_1_1__03524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Declaration__Group_1_1__0__Impl3552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_1_1__1__Impl_in_rule__Declaration__Group_1_1__13583 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group_1_1__2_in_rule__Declaration__Group_1_1__13586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__VarNameAssignment_1_1_1_in_rule__Declaration__Group_1_1__1__Impl3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_1_1__2__Impl_in_rule__Declaration__Group_1_1__23643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Declaration__Group_1_1__2__Impl3671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__03708 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Type__Group__1_in_rule__Type__Group__03711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__NameAssignment_0_in_rule__Type__Group__0__Impl3738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__13768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__0_in_rule__Type__Group__1__Impl3795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__0__Impl_in_rule__Type__Group_1__03830 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Type__Group_1__1_in_rule__Type__Group_1__03833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Type__Group_1__0__Impl3861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__1__Impl_in_rule__Type__Group_1__13892 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Type__Group_1__2_in_rule__Type__Group_1__13895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__TemplateTypeAssignment_1_1_in_rule__Type__Group_1__1__Impl3922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__2__Impl_in_rule__Type__Group_1__23952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Type__Group_1__2__Impl3980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORing__Group__0__Impl_in_rule__ORing__Group__04017 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ORing__Group__1_in_rule__ORing__Group__04020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANDing_in_rule__ORing__Group__0__Impl4047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORing__Group__1__Impl_in_rule__ORing__Group__14076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORing__Group_1__0_in_rule__ORing__Group__1__Impl4103 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__ORing__Group_1__0__Impl_in_rule__ORing__Group_1__04138 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ORing__Group_1__1_in_rule__ORing__Group_1__04141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORing__Group_1__1__Impl_in_rule__ORing__Group_1__14199 = new BitSet(new long[]{0x000000050081E010L});
    public static final BitSet FOLLOW_rule__ORing__Group_1__2_in_rule__ORing__Group_1__14202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ORing__Group_1__1__Impl4230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORing__Group_1__2__Impl_in_rule__ORing__Group_1__24261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORing__RightAssignment_1_2_in_rule__ORing__Group_1__2__Impl4288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANDing__Group__0__Impl_in_rule__ANDing__Group__04324 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ANDing__Group__1_in_rule__ANDing__Group__04327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__ANDing__Group__0__Impl4354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANDing__Group__1__Impl_in_rule__ANDing__Group__14383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANDing__Group_1__0_in_rule__ANDing__Group__1__Impl4410 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__ANDing__Group_1__0__Impl_in_rule__ANDing__Group_1__04445 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ANDing__Group_1__1_in_rule__ANDing__Group_1__04448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANDing__Group_1__1__Impl_in_rule__ANDing__Group_1__14506 = new BitSet(new long[]{0x000000050081E010L});
    public static final BitSet FOLLOW_rule__ANDing__Group_1__2_in_rule__ANDing__Group_1__14509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ANDing__Group_1__1__Impl4537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANDing__Group_1__2__Impl_in_rule__ANDing__Group_1__24568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANDing__RightAssignment_1_2_in_rule__ANDing__Group_1__2__Impl4595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_3__0__Impl_in_rule__Primary__Group_3__04631 = new BitSet(new long[]{0x000000050081E010L});
    public static final BitSet FOLLOW_rule__Primary__Group_3__1_in_rule__Primary__Group_3__04634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Primary__Group_3__0__Impl4662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_3__1__Impl_in_rule__Primary__Group_3__14693 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Primary__Group_3__2_in_rule__Primary__Group_3__14696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_rule__Primary__Group_3__1__Impl4723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_3__2__Impl_in_rule__Primary__Group_3__24752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Primary__Group_3__2__Impl4780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemShell__Group__0__Impl_in_rule__ProblemShell__Group__04817 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__ProblemShell__Group__1_in_rule__ProblemShell__Group__04820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ProblemShell__Group__0__Impl4848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemShell__Group__1__Impl_in_rule__ProblemShell__Group__14879 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ProblemShell__Group__2_in_rule__ProblemShell__Group__14882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemShell__ProblemAssignment_1_in_rule__ProblemShell__Group__1__Impl4909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemShell__Group__2__Impl_in_rule__ProblemShell__Group__24939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ProblemShell__Group__2__Impl4967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Group__0__Impl_in_rule__Negation__Group__05004 = new BitSet(new long[]{0x000000050081E010L});
    public static final BitSet FOLLOW_rule__Negation__Group__1_in_rule__Negation__Group__05007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Negation__Group__0__Impl5035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Group__1__Impl_in_rule__Negation__Group__15066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__NegatedAssignment_1_in_rule__Negation__Group__1__Impl5093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__0__Impl_in_rule__Quantifier__Group__05127 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__1_in_rule__Quantifier__Group__05130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__QuantifierAssignment_0_in_rule__Quantifier__Group__0__Impl5157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__1__Impl_in_rule__Quantifier__Group__15187 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__2_in_rule__Quantifier__Group__15190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Quantifier__Group__1__Impl5218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__2__Impl_in_rule__Quantifier__Group__25249 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__3_in_rule__Quantifier__Group__25252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__SubjectAssignment_2_in_rule__Quantifier__Group__2__Impl5279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__3__Impl_in_rule__Quantifier__Group__35309 = new BitSet(new long[]{0x000000050081E010L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__4_in_rule__Quantifier__Group__35312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Quantifier__Group__3__Impl5340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__4__Impl_in_rule__Quantifier__Group__45371 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__5_in_rule__Quantifier__Group__45374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__PredicateAssignment_4_in_rule__Quantifier__Group__4__Impl5401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__5__Impl_in_rule__Quantifier__Group__55431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Quantifier__Group__5__Impl5459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group__0__Impl_in_rule__Atomic__Group__05502 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Atomic__Group__1_in_rule__Atomic__Group__05505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__FunctionAssignment_0_in_rule__Atomic__Group__0__Impl5532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group__1__Impl_in_rule__Atomic__Group__15562 = new BitSet(new long[]{0x0000000001800030L});
    public static final BitSet FOLLOW_rule__Atomic__Group__2_in_rule__Atomic__Group__15565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Atomic__Group__1__Impl5593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group__2__Impl_in_rule__Atomic__Group__25624 = new BitSet(new long[]{0x0000000001800030L});
    public static final BitSet FOLLOW_rule__Atomic__Group__3_in_rule__Atomic__Group__25627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__0_in_rule__Atomic__Group__2__Impl5654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group__3__Impl_in_rule__Atomic__Group__35685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Atomic__Group__3__Impl5713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__05752 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__05755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ArgsAssignment_2_0_in_rule__Atomic__Group_2__0__Impl5782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__15812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2_1__0_in_rule__Atomic__Group_2__1__Impl5839 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2_1__0__Impl_in_rule__Atomic__Group_2_1__05874 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2_1__1_in_rule__Atomic__Group_2_1__05877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Atomic__Group_2_1__0__Impl5905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2_1__1__Impl_in_rule__Atomic__Group_2_1__15936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ArgsAssignment_2_1_1_in_rule__Atomic__Group_2_1__1__Impl5963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__0__Impl_in_rule__Theorem__Group__05997 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Theorem__Group__1_in_rule__Theorem__Group__06000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__RequirementAssignment_0_in_rule__Theorem__Group__0__Impl6027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__1__Impl_in_rule__Theorem__Group__16057 = new BitSet(new long[]{0x000000050081E010L});
    public static final BitSet FOLLOW_rule__Theorem__Group__2_in_rule__Theorem__Group__16060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Theorem__Group__1__Impl6088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__2__Impl_in_rule__Theorem__Group__26119 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Theorem__Group__3_in_rule__Theorem__Group__26122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__ResultAssignment_2_in_rule__Theorem__Group__2__Impl6149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__3__Impl_in_rule__Theorem__Group__36179 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Theorem__Group__4_in_rule__Theorem__Group__36182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Theorem__Group__3__Impl6210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__4__Impl_in_rule__Theorem__Group__46241 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Theorem__Group__5_in_rule__Theorem__Group__46244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__CostAssignment_4_in_rule__Theorem__Group__4__Impl6271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__5__Impl_in_rule__Theorem__Group__56301 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Theorem__Group__6_in_rule__Theorem__Group__56304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Theorem__Group__5__Impl6332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__6__Impl_in_rule__Theorem__Group__66363 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Theorem__Group__7_in_rule__Theorem__Group__66366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__DescriptionAssignment_6_in_rule__Theorem__Group__6__Impl6393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__7__Impl_in_rule__Theorem__Group__76423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group_7__0_in_rule__Theorem__Group__7__Impl6450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group_7__0__Impl_in_rule__Theorem__Group_7__06497 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Theorem__Group_7__1_in_rule__Theorem__Group_7__06500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Theorem__Group_7__0__Impl6528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group_7__1__Impl_in_rule__Theorem__Group_7__16559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__PseudoCodeAssignment_7_1_in_rule__Theorem__Group_7__1__Impl6586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__06620 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__06623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl6650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__16679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl6706 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__06741 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__06744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__16802 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__2_in_rule__Addition__Group_1__16805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__SymbolAssignment_1_1_in_rule__Addition__Group_1__1__Impl6832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__2__Impl_in_rule__Addition__Group_1__26862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__RightAssignment_1_2_in_rule__Addition__Group_1__2__Impl6889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__06925 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__06928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalPrimary_in_rule__Multiplication__Group__0__Impl6955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__16984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl7011 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__07046 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__07049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__17107 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__2_in_rule__Multiplication__Group_1__17110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__SymbolAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl7137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__2__Impl_in_rule__Multiplication__Group_1__27167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__RightAssignment_1_2_in_rule__Multiplication__Group_1__2__Impl7194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericalPrimary__Group_2__0__Impl_in_rule__NumericalPrimary__Group_2__07230 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_rule__NumericalPrimary__Group_2__1_in_rule__NumericalPrimary__Group_2__07233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__NumericalPrimary__Group_2__0__Impl7261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericalPrimary__Group_2__1__Impl_in_rule__NumericalPrimary__Group_2__17292 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__NumericalPrimary__Group_2__2_in_rule__NumericalPrimary__Group_2__17295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalPrimary_in_rule__NumericalPrimary__Group_2__1__Impl7322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericalPrimary__Group_2__2__Impl_in_rule__NumericalPrimary__Group_2__27351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__NumericalPrimary__Group_2__2__Impl7379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblem_in_rule__Input__GivenAssignment_17421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__TaskAlternatives_3_0_0_0_in_rule__Input__TaskAssignment_3_0_07452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblem_in_rule__Input__GoalAssignment_3_0_17485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Input__TaskAssignment_3_1_07521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblemNoVars_in_rule__Input__GoalAssignment_3_1_27560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTheorem_in_rule__Input__TheoremsAssignment_4_27591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTheorem_in_rule__Input__TheoremsAssignment_4_3_17622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_rule__ProblemNoVars__PropertyAssignment7653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__Problem__VarsAssignment_07684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__Problem__VarsAssignment_1_17715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_rule__Problem__PropertyAssignment_2_17746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Declaration__TypeAssignment_07777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Declaration__VarNameAssignment_1_07808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Declaration__VarNameAssignment_1_1_17839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Type__NameAssignment_07870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Type__TemplateTypeAssignment_1_17901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANDing_in_rule__ORing__RightAssignment_1_27932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__ANDing__RightAssignment_1_27963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblem_in_rule__ProblemShell__ProblemAssignment_17994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__Negation__NegatedAssignment_18025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__QuantifierAlternatives_0_0_in_rule__Quantifier__QuantifierAssignment_08056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblem_in_rule__Quantifier__SubjectAssignment_28089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_rule__Quantifier__PredicateAssignment_48120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Atomic__FunctionAssignment_08151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Atomic__ArgsAssignment_2_08182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Atomic__ArgsAssignment_2_1_18213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__ArgAssignment8244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAlternatives_0_in_rule__BooleanLiteral__ValueAssignment8275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_rule__Theorem__RequirementAssignment_08308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_rule__Theorem__ResultAssignment_28339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Theorem__CostAssignment_48370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Theorem__DescriptionAssignment_68401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Theorem__PseudoCodeAssignment_7_18432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__SymbolAlternatives_1_1_0_in_rule__Addition__SymbolAssignment_1_18463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_28496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__SymbolAlternatives_1_1_0_in_rule__Multiplication__SymbolAssignment_1_18527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalPrimary_in_rule__Multiplication__RightAssignment_1_28560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NumberLiteral__ValueAssignment8591 = new BitSet(new long[]{0x0000000000000002L});

}