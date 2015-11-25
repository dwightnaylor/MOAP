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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalInputParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Find'", "'Count'", "'forall'", "'exists'", "'TRUE'", "'FALSE'", "'->'", "'<-'", "'<->'", "'+'", "'-'", "'*'", "'/'", "'Given'", "';'", "'Theorems:'", "','", "'st'", "'<'", "'>'", "'|'", "'&'", "'('", "')'", "'{'", "'}'", "'!'", "':'", "'Test'"
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:61:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:62:1: ( ruleInput EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:63:1: ruleInput EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputRule()); 
            }
            pushFollow(FOLLOW_ruleInput_in_entryRuleInput67);
            ruleInput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInput74); if (state.failed) return ;

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:70:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:74:2: ( ( ( rule__Input__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:75:1: ( ( rule__Input__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:75:1: ( ( rule__Input__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:76:1: ( rule__Input__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getGroup()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:77:1: ( rule__Input__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:77:2: rule__Input__Group__0
            {
            pushFollow(FOLLOW_rule__Input__Group__0_in_ruleInput100);
            rule__Input__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:89:1: entryRuleProblemNoVars : ruleProblemNoVars EOF ;
    public final void entryRuleProblemNoVars() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:90:1: ( ruleProblemNoVars EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:91:1: ruleProblemNoVars EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProblemNoVarsRule()); 
            }
            pushFollow(FOLLOW_ruleProblemNoVars_in_entryRuleProblemNoVars127);
            ruleProblemNoVars();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProblemNoVarsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProblemNoVars134); if (state.failed) return ;

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:98:1: ruleProblemNoVars : ( ( rule__ProblemNoVars__PropertyAssignment ) ) ;
    public final void ruleProblemNoVars() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:102:2: ( ( ( rule__ProblemNoVars__PropertyAssignment ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:103:1: ( ( rule__ProblemNoVars__PropertyAssignment ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:103:1: ( ( rule__ProblemNoVars__PropertyAssignment ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:104:1: ( rule__ProblemNoVars__PropertyAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProblemNoVarsAccess().getPropertyAssignment()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:105:1: ( rule__ProblemNoVars__PropertyAssignment )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:105:2: rule__ProblemNoVars__PropertyAssignment
            {
            pushFollow(FOLLOW_rule__ProblemNoVars__PropertyAssignment_in_ruleProblemNoVars160);
            rule__ProblemNoVars__PropertyAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProblemNoVarsAccess().getPropertyAssignment()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleProblemPropertyOptional"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:117:1: entryRuleProblemPropertyOptional : ruleProblemPropertyOptional EOF ;
    public final void entryRuleProblemPropertyOptional() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:118:1: ( ruleProblemPropertyOptional EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:119:1: ruleProblemPropertyOptional EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProblemPropertyOptionalRule()); 
            }
            pushFollow(FOLLOW_ruleProblemPropertyOptional_in_entryRuleProblemPropertyOptional187);
            ruleProblemPropertyOptional();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProblemPropertyOptionalRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProblemPropertyOptional194); if (state.failed) return ;

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
    // $ANTLR end "entryRuleProblemPropertyOptional"


    // $ANTLR start "ruleProblemPropertyOptional"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:126:1: ruleProblemPropertyOptional : ( ( rule__ProblemPropertyOptional__Group__0 ) ) ;
    public final void ruleProblemPropertyOptional() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:130:2: ( ( ( rule__ProblemPropertyOptional__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:131:1: ( ( rule__ProblemPropertyOptional__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:131:1: ( ( rule__ProblemPropertyOptional__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:132:1: ( rule__ProblemPropertyOptional__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProblemPropertyOptionalAccess().getGroup()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:133:1: ( rule__ProblemPropertyOptional__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:133:2: rule__ProblemPropertyOptional__Group__0
            {
            pushFollow(FOLLOW_rule__ProblemPropertyOptional__Group__0_in_ruleProblemPropertyOptional220);
            rule__ProblemPropertyOptional__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProblemPropertyOptionalAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProblemPropertyOptional"


    // $ANTLR start "entryRuleProblem"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:145:1: entryRuleProblem : ruleProblem EOF ;
    public final void entryRuleProblem() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:146:1: ( ruleProblem EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:147:1: ruleProblem EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProblemRule()); 
            }
            pushFollow(FOLLOW_ruleProblem_in_entryRuleProblem247);
            ruleProblem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProblemRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProblem254); if (state.failed) return ;

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:154:1: ruleProblem : ( ( rule__Problem__Group__0 ) ) ;
    public final void ruleProblem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:158:2: ( ( ( rule__Problem__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:159:1: ( ( rule__Problem__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:159:1: ( ( rule__Problem__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:160:1: ( rule__Problem__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProblemAccess().getGroup()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:161:1: ( rule__Problem__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:161:2: rule__Problem__Group__0
            {
            pushFollow(FOLLOW_rule__Problem__Group__0_in_ruleProblem280);
            rule__Problem__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProblemAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:173:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:174:1: ( ruleDeclaration EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:175:1: ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration307);
            ruleDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration314); if (state.failed) return ;

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:182:1: ruleDeclaration : ( ( rule__Declaration__Group__0 ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:186:2: ( ( ( rule__Declaration__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:187:1: ( ( rule__Declaration__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:187:1: ( ( rule__Declaration__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:188:1: ( rule__Declaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getGroup()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:189:1: ( rule__Declaration__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:189:2: rule__Declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0_in_ruleDeclaration340);
            rule__Declaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:201:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:202:1: ( ruleType EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:203:1: ruleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType367);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType374); if (state.failed) return ;

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:210:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:214:2: ( ( ( rule__Type__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:215:1: ( ( rule__Type__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:215:1: ( ( rule__Type__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:216:1: ( rule__Type__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getGroup()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:217:1: ( rule__Type__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:217:2: rule__Type__Group__0
            {
            pushFollow(FOLLOW_rule__Type__Group__0_in_ruleType400);
            rule__Type__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:229:1: entryRuleORing : ruleORing EOF ;
    public final void entryRuleORing() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:230:1: ( ruleORing EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:231:1: ruleORing EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getORingRule()); 
            }
            pushFollow(FOLLOW_ruleORing_in_entryRuleORing427);
            ruleORing();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getORingRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleORing434); if (state.failed) return ;

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:238:1: ruleORing : ( ( rule__ORing__Group__0 ) ) ;
    public final void ruleORing() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:242:2: ( ( ( rule__ORing__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:243:1: ( ( rule__ORing__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:243:1: ( ( rule__ORing__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:244:1: ( rule__ORing__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getORingAccess().getGroup()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:245:1: ( rule__ORing__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:245:2: rule__ORing__Group__0
            {
            pushFollow(FOLLOW_rule__ORing__Group__0_in_ruleORing460);
            rule__ORing__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getORingAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:257:1: entryRuleANDing : ruleANDing EOF ;
    public final void entryRuleANDing() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:258:1: ( ruleANDing EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:259:1: ruleANDing EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getANDingRule()); 
            }
            pushFollow(FOLLOW_ruleANDing_in_entryRuleANDing487);
            ruleANDing();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getANDingRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleANDing494); if (state.failed) return ;

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:266:1: ruleANDing : ( ( rule__ANDing__Group__0 ) ) ;
    public final void ruleANDing() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:270:2: ( ( ( rule__ANDing__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:271:1: ( ( rule__ANDing__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:271:1: ( ( rule__ANDing__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:272:1: ( rule__ANDing__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getANDingAccess().getGroup()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:273:1: ( rule__ANDing__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:273:2: rule__ANDing__Group__0
            {
            pushFollow(FOLLOW_rule__ANDing__Group__0_in_ruleANDing520);
            rule__ANDing__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getANDingAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:285:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:286:1: ( rulePrimary EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:287:1: rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary547);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary554); if (state.failed) return ;

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:294:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:298:2: ( ( ( rule__Primary__Alternatives ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:299:1: ( ( rule__Primary__Alternatives ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:299:1: ( ( rule__Primary__Alternatives ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:300:1: ( rule__Primary__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:301:1: ( rule__Primary__Alternatives )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:301:2: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_rule__Primary__Alternatives_in_rulePrimary580);
            rule__Primary__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getAlternatives()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:313:1: entryRuleProblemShell : ruleProblemShell EOF ;
    public final void entryRuleProblemShell() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:314:1: ( ruleProblemShell EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:315:1: ruleProblemShell EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProblemShellRule()); 
            }
            pushFollow(FOLLOW_ruleProblemShell_in_entryRuleProblemShell607);
            ruleProblemShell();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProblemShellRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProblemShell614); if (state.failed) return ;

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:322:1: ruleProblemShell : ( ( rule__ProblemShell__Group__0 ) ) ;
    public final void ruleProblemShell() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:326:2: ( ( ( rule__ProblemShell__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:327:1: ( ( rule__ProblemShell__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:327:1: ( ( rule__ProblemShell__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:328:1: ( rule__ProblemShell__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProblemShellAccess().getGroup()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:329:1: ( rule__ProblemShell__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:329:2: rule__ProblemShell__Group__0
            {
            pushFollow(FOLLOW_rule__ProblemShell__Group__0_in_ruleProblemShell640);
            rule__ProblemShell__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProblemShellAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:341:1: entryRuleNegation : ruleNegation EOF ;
    public final void entryRuleNegation() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:342:1: ( ruleNegation EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:343:1: ruleNegation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationRule()); 
            }
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation667);
            ruleNegation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation674); if (state.failed) return ;

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:350:1: ruleNegation : ( ( rule__Negation__Group__0 ) ) ;
    public final void ruleNegation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:354:2: ( ( ( rule__Negation__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:355:1: ( ( rule__Negation__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:355:1: ( ( rule__Negation__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:356:1: ( rule__Negation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationAccess().getGroup()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:357:1: ( rule__Negation__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:357:2: rule__Negation__Group__0
            {
            pushFollow(FOLLOW_rule__Negation__Group__0_in_ruleNegation700);
            rule__Negation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegationAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:369:1: entryRuleQuantifier : ruleQuantifier EOF ;
    public final void entryRuleQuantifier() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:370:1: ( ruleQuantifier EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:371:1: ruleQuantifier EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifierRule()); 
            }
            pushFollow(FOLLOW_ruleQuantifier_in_entryRuleQuantifier727);
            ruleQuantifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifierRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantifier734); if (state.failed) return ;

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:378:1: ruleQuantifier : ( ( rule__Quantifier__Group__0 ) ) ;
    public final void ruleQuantifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:382:2: ( ( ( rule__Quantifier__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:383:1: ( ( rule__Quantifier__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:383:1: ( ( rule__Quantifier__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:384:1: ( rule__Quantifier__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifierAccess().getGroup()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:385:1: ( rule__Quantifier__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:385:2: rule__Quantifier__Group__0
            {
            pushFollow(FOLLOW_rule__Quantifier__Group__0_in_ruleQuantifier760);
            rule__Quantifier__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifierAccess().getGroup()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleSugarAtomic"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:397:1: entryRuleSugarAtomic : ruleSugarAtomic EOF ;
    public final void entryRuleSugarAtomic() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:398:1: ( ruleSugarAtomic EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:399:1: ruleSugarAtomic EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarAtomicRule()); 
            }
            pushFollow(FOLLOW_ruleSugarAtomic_in_entryRuleSugarAtomic787);
            ruleSugarAtomic();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarAtomicRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSugarAtomic794); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSugarAtomic"


    // $ANTLR start "ruleSugarAtomic"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:406:1: ruleSugarAtomic : ( ( rule__SugarAtomic__Group__0 ) ) ;
    public final void ruleSugarAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:410:2: ( ( ( rule__SugarAtomic__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:411:1: ( ( rule__SugarAtomic__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:411:1: ( ( rule__SugarAtomic__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:412:1: ( rule__SugarAtomic__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarAtomicAccess().getGroup()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:413:1: ( rule__SugarAtomic__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:413:2: rule__SugarAtomic__Group__0
            {
            pushFollow(FOLLOW_rule__SugarAtomic__Group__0_in_ruleSugarAtomic820);
            rule__SugarAtomic__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarAtomicAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSugarAtomic"


    // $ANTLR start "entryRuleAtomic"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:425:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:426:1: ( ruleAtomic EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:427:1: ruleAtomic EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicRule()); 
            }
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic847);
            ruleAtomic();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic854); if (state.failed) return ;

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:434:1: ruleAtomic : ( ( rule__Atomic__Group__0 ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:438:2: ( ( ( rule__Atomic__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:439:1: ( ( rule__Atomic__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:439:1: ( ( rule__Atomic__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:440:1: ( rule__Atomic__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getGroup()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:441:1: ( rule__Atomic__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:441:2: rule__Atomic__Group__0
            {
            pushFollow(FOLLOW_rule__Atomic__Group__0_in_ruleAtomic880);
            rule__Atomic__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:453:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:454:1: ( ruleBooleanLiteral EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:455:1: ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral907);
            ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral914); if (state.failed) return ;

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:462:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__ValueAssignment ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:466:2: ( ( ( rule__BooleanLiteral__ValueAssignment ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:467:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:467:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:468:1: ( rule__BooleanLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:469:1: ( rule__BooleanLiteral__ValueAssignment )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:469:2: rule__BooleanLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral940);
            rule__BooleanLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:481:1: entryRuleTheorem : ruleTheorem EOF ;
    public final void entryRuleTheorem() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:482:1: ( ruleTheorem EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:483:1: ruleTheorem EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheoremRule()); 
            }
            pushFollow(FOLLOW_ruleTheorem_in_entryRuleTheorem967);
            ruleTheorem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheoremRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTheorem974); if (state.failed) return ;

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:490:1: ruleTheorem : ( ( rule__Theorem__Group__0 ) ) ;
    public final void ruleTheorem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:494:2: ( ( ( rule__Theorem__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:495:1: ( ( rule__Theorem__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:495:1: ( ( rule__Theorem__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:496:1: ( rule__Theorem__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheoremAccess().getGroup()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:497:1: ( rule__Theorem__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:497:2: rule__Theorem__Group__0
            {
            pushFollow(FOLLOW_rule__Theorem__Group__0_in_ruleTheorem1000);
            rule__Theorem__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheoremAccess().getGroup()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleSugarAddition"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:509:1: entryRuleSugarAddition : ruleSugarAddition EOF ;
    public final void entryRuleSugarAddition() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:510:1: ( ruleSugarAddition EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:511:1: ruleSugarAddition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarAdditionRule()); 
            }
            pushFollow(FOLLOW_ruleSugarAddition_in_entryRuleSugarAddition1027);
            ruleSugarAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarAdditionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSugarAddition1034); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSugarAddition"


    // $ANTLR start "ruleSugarAddition"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:518:1: ruleSugarAddition : ( ( rule__SugarAddition__Group__0 ) ) ;
    public final void ruleSugarAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:522:2: ( ( ( rule__SugarAddition__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:523:1: ( ( rule__SugarAddition__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:523:1: ( ( rule__SugarAddition__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:524:1: ( rule__SugarAddition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarAdditionAccess().getGroup()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:525:1: ( rule__SugarAddition__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:525:2: rule__SugarAddition__Group__0
            {
            pushFollow(FOLLOW_rule__SugarAddition__Group__0_in_ruleSugarAddition1060);
            rule__SugarAddition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarAdditionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSugarAddition"


    // $ANTLR start "entryRuleSugarMultiplication"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:537:1: entryRuleSugarMultiplication : ruleSugarMultiplication EOF ;
    public final void entryRuleSugarMultiplication() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:538:1: ( ruleSugarMultiplication EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:539:1: ruleSugarMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarMultiplicationRule()); 
            }
            pushFollow(FOLLOW_ruleSugarMultiplication_in_entryRuleSugarMultiplication1087);
            ruleSugarMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarMultiplicationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSugarMultiplication1094); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSugarMultiplication"


    // $ANTLR start "ruleSugarMultiplication"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:546:1: ruleSugarMultiplication : ( ( rule__SugarMultiplication__Group__0 ) ) ;
    public final void ruleSugarMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:550:2: ( ( ( rule__SugarMultiplication__Group__0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:551:1: ( ( rule__SugarMultiplication__Group__0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:551:1: ( ( rule__SugarMultiplication__Group__0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:552:1: ( rule__SugarMultiplication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarMultiplicationAccess().getGroup()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:553:1: ( rule__SugarMultiplication__Group__0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:553:2: rule__SugarMultiplication__Group__0
            {
            pushFollow(FOLLOW_rule__SugarMultiplication__Group__0_in_ruleSugarMultiplication1120);
            rule__SugarMultiplication__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarMultiplicationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSugarMultiplication"


    // $ANTLR start "entryRuleSugarNumericalPrimary"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:565:1: entryRuleSugarNumericalPrimary : ruleSugarNumericalPrimary EOF ;
    public final void entryRuleSugarNumericalPrimary() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:566:1: ( ruleSugarNumericalPrimary EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:567:1: ruleSugarNumericalPrimary EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarNumericalPrimaryRule()); 
            }
            pushFollow(FOLLOW_ruleSugarNumericalPrimary_in_entryRuleSugarNumericalPrimary1147);
            ruleSugarNumericalPrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarNumericalPrimaryRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSugarNumericalPrimary1154); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSugarNumericalPrimary"


    // $ANTLR start "ruleSugarNumericalPrimary"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:574:1: ruleSugarNumericalPrimary : ( ( rule__SugarNumericalPrimary__Alternatives ) ) ;
    public final void ruleSugarNumericalPrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:578:2: ( ( ( rule__SugarNumericalPrimary__Alternatives ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:579:1: ( ( rule__SugarNumericalPrimary__Alternatives ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:579:1: ( ( rule__SugarNumericalPrimary__Alternatives ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:580:1: ( rule__SugarNumericalPrimary__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarNumericalPrimaryAccess().getAlternatives()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:581:1: ( rule__SugarNumericalPrimary__Alternatives )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:581:2: rule__SugarNumericalPrimary__Alternatives
            {
            pushFollow(FOLLOW_rule__SugarNumericalPrimary__Alternatives_in_ruleSugarNumericalPrimary1180);
            rule__SugarNumericalPrimary__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarNumericalPrimaryAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSugarNumericalPrimary"


    // $ANTLR start "entryRuleNumberLiteral"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:593:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:594:1: ( ruleNumberLiteral EOF )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:595:1: ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral1207);
            ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral1214); if (state.failed) return ;

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:602:1: ruleNumberLiteral : ( ( rule__NumberLiteral__ValueAssignment ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:606:2: ( ( ( rule__NumberLiteral__ValueAssignment ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:607:1: ( ( rule__NumberLiteral__ValueAssignment ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:607:1: ( ( rule__NumberLiteral__ValueAssignment ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:608:1: ( rule__NumberLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getValueAssignment()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:609:1: ( rule__NumberLiteral__ValueAssignment )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:609:2: rule__NumberLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__NumberLiteral__ValueAssignment_in_ruleNumberLiteral1240);
            rule__NumberLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLiteralAccess().getValueAssignment()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:621:1: rule__Input__Alternatives_3 : ( ( ( rule__Input__Group_3_0__0 ) ) | ( ( rule__Input__Group_3_1__0 ) ) );
    public final void rule__Input__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:625:1: ( ( ( rule__Input__Group_3_0__0 ) ) | ( ( rule__Input__Group_3_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                alt1=1;
            }
            else if ( (LA1_0==39) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:626:1: ( ( rule__Input__Group_3_0__0 ) )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:626:1: ( ( rule__Input__Group_3_0__0 ) )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:627:1: ( rule__Input__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInputAccess().getGroup_3_0()); 
                    }
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:628:1: ( rule__Input__Group_3_0__0 )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:628:2: rule__Input__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__Input__Group_3_0__0_in_rule__Input__Alternatives_31276);
                    rule__Input__Group_3_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInputAccess().getGroup_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:632:6: ( ( rule__Input__Group_3_1__0 ) )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:632:6: ( ( rule__Input__Group_3_1__0 ) )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:633:1: ( rule__Input__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInputAccess().getGroup_3_1()); 
                    }
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:634:1: ( rule__Input__Group_3_1__0 )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:634:2: rule__Input__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Input__Group_3_1__0_in_rule__Input__Alternatives_31294);
                    rule__Input__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInputAccess().getGroup_3_1()); 
                    }

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:643:1: rule__Input__TaskAlternatives_3_0_0_0 : ( ( 'Find' ) | ( 'Count' ) );
    public final void rule__Input__TaskAlternatives_3_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:647:1: ( ( 'Find' ) | ( 'Count' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:648:1: ( 'Find' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:648:1: ( 'Find' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:649:1: 'Find'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInputAccess().getTaskFindKeyword_3_0_0_0_0()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__Input__TaskAlternatives_3_0_0_01328); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInputAccess().getTaskFindKeyword_3_0_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:656:6: ( 'Count' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:656:6: ( 'Count' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:657:1: 'Count'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInputAccess().getTaskCountKeyword_3_0_0_0_1()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__Input__TaskAlternatives_3_0_0_01348); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInputAccess().getTaskCountKeyword_3_0_0_0_1()); 
                    }

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


    // $ANTLR start "rule__Input__GoalAlternatives_3_1_1_0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:669:1: rule__Input__GoalAlternatives_3_1_1_0 : ( ( ruleProblem ) | ( ruleProblemNoVars ) );
    public final void rule__Input__GoalAlternatives_3_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:673:1: ( ( ruleProblem ) | ( ruleProblemNoVars ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==33) ) {
                    alt3=2;
                }
                else if ( (LA3_1==RULE_ID||(LA3_1>=27 && LA3_1<=29)) ) {
                    alt3=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA3_0>=13 && LA3_0<=16)||LA3_0==33||LA3_0==35||LA3_0==37) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:674:1: ( ruleProblem )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:674:1: ( ruleProblem )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:675:1: ruleProblem
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInputAccess().getGoalProblemParserRuleCall_3_1_1_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleProblem_in_rule__Input__GoalAlternatives_3_1_1_01382);
                    ruleProblem();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInputAccess().getGoalProblemParserRuleCall_3_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:680:6: ( ruleProblemNoVars )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:680:6: ( ruleProblemNoVars )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:681:1: ruleProblemNoVars
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInputAccess().getGoalProblemNoVarsParserRuleCall_3_1_1_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleProblemNoVars_in_rule__Input__GoalAlternatives_3_1_1_01399);
                    ruleProblemNoVars();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInputAccess().getGoalProblemNoVarsParserRuleCall_3_1_1_0_1()); 
                    }

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
    // $ANTLR end "rule__Input__GoalAlternatives_3_1_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:691:1: rule__Primary__Alternatives : ( ( ( ruleAtomic ) ) | ( ruleSugarAtomic ) | ( ruleQuantifier ) | ( ruleProblemShell ) | ( ( rule__Primary__Group_4__0 ) ) | ( ruleBooleanLiteral ) | ( ruleNegation ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:695:1: ( ( ( ruleAtomic ) ) | ( ruleSugarAtomic ) | ( ruleQuantifier ) | ( ruleProblemShell ) | ( ( rule__Primary__Group_4__0 ) ) | ( ruleBooleanLiteral ) | ( ruleNegation ) )
            int alt4=7;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:696:1: ( ( ruleAtomic ) )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:696:1: ( ( ruleAtomic ) )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:697:1: ( ruleAtomic )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_0()); 
                    }
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:698:1: ( ruleAtomic )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:698:3: ruleAtomic
                    {
                    pushFollow(FOLLOW_ruleAtomic_in_rule__Primary__Alternatives1432);
                    ruleAtomic();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:702:6: ( ruleSugarAtomic )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:702:6: ( ruleSugarAtomic )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:703:1: ruleSugarAtomic
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getSugarAtomicParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleSugarAtomic_in_rule__Primary__Alternatives1450);
                    ruleSugarAtomic();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getSugarAtomicParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:708:6: ( ruleQuantifier )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:708:6: ( ruleQuantifier )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:709:1: ruleQuantifier
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getQuantifierParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleQuantifier_in_rule__Primary__Alternatives1467);
                    ruleQuantifier();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getQuantifierParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:714:6: ( ruleProblemShell )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:714:6: ( ruleProblemShell )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:715:1: ruleProblemShell
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getProblemShellParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleProblemShell_in_rule__Primary__Alternatives1484);
                    ruleProblemShell();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getProblemShellParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:720:6: ( ( rule__Primary__Group_4__0 ) )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:720:6: ( ( rule__Primary__Group_4__0 ) )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:721:1: ( rule__Primary__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_4()); 
                    }
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:722:1: ( rule__Primary__Group_4__0 )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:722:2: rule__Primary__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Primary__Group_4__0_in_rule__Primary__Alternatives1501);
                    rule__Primary__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:726:6: ( ruleBooleanLiteral )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:726:6: ( ruleBooleanLiteral )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:727:1: ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getBooleanLiteralParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_rule__Primary__Alternatives1519);
                    ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getBooleanLiteralParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:732:6: ( ruleNegation )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:732:6: ( ruleNegation )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:733:1: ruleNegation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getNegationParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_ruleNegation_in_rule__Primary__Alternatives1536);
                    ruleNegation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getNegationParserRuleCall_6()); 
                    }

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:743:1: rule__Quantifier__QuantifierAlternatives_0_0 : ( ( 'forall' ) | ( 'exists' ) );
    public final void rule__Quantifier__QuantifierAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:747:1: ( ( 'forall' ) | ( 'exists' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:748:1: ( 'forall' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:748:1: ( 'forall' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:749:1: 'forall'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQuantifierAccess().getQuantifierForallKeyword_0_0_0()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__Quantifier__QuantifierAlternatives_0_01569); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQuantifierAccess().getQuantifierForallKeyword_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:756:6: ( 'exists' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:756:6: ( 'exists' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:757:1: 'exists'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQuantifierAccess().getQuantifierExistsKeyword_0_0_1()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__Quantifier__QuantifierAlternatives_0_01589); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQuantifierAccess().getQuantifierExistsKeyword_0_0_1()); 
                    }

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:769:1: rule__BooleanLiteral__ValueAlternatives_0 : ( ( 'TRUE' ) | ( 'FALSE' ) );
    public final void rule__BooleanLiteral__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:773:1: ( ( 'TRUE' ) | ( 'FALSE' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:774:1: ( 'TRUE' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:774:1: ( 'TRUE' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:775:1: 'TRUE'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanLiteralAccess().getValueTRUEKeyword_0_0()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__BooleanLiteral__ValueAlternatives_01624); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanLiteralAccess().getValueTRUEKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:782:6: ( 'FALSE' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:782:6: ( 'FALSE' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:783:1: 'FALSE'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanLiteralAccess().getValueFALSEKeyword_0_1()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__BooleanLiteral__ValueAlternatives_01644); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanLiteralAccess().getValueFALSEKeyword_0_1()); 
                    }

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


    // $ANTLR start "rule__Theorem__ImplicationAlternatives_1_0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:795:1: rule__Theorem__ImplicationAlternatives_1_0 : ( ( '->' ) | ( '<-' ) | ( '<->' ) );
    public final void rule__Theorem__ImplicationAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:799:1: ( ( '->' ) | ( '<-' ) | ( '<->' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:800:1: ( '->' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:800:1: ( '->' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:801:1: '->'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTheoremAccess().getImplicationHyphenMinusGreaterThanSignKeyword_1_0_0()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__Theorem__ImplicationAlternatives_1_01679); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTheoremAccess().getImplicationHyphenMinusGreaterThanSignKeyword_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:808:6: ( '<-' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:808:6: ( '<-' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:809:1: '<-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTheoremAccess().getImplicationLessThanSignHyphenMinusKeyword_1_0_1()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__Theorem__ImplicationAlternatives_1_01699); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTheoremAccess().getImplicationLessThanSignHyphenMinusKeyword_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:816:6: ( '<->' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:816:6: ( '<->' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:817:1: '<->'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTheoremAccess().getImplicationLessThanSignHyphenMinusGreaterThanSignKeyword_1_0_2()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__Theorem__ImplicationAlternatives_1_01719); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTheoremAccess().getImplicationLessThanSignHyphenMinusGreaterThanSignKeyword_1_0_2()); 
                    }

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
    // $ANTLR end "rule__Theorem__ImplicationAlternatives_1_0"


    // $ANTLR start "rule__SugarAddition__SymbolAlternatives_1_1_0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:829:1: rule__SugarAddition__SymbolAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__SugarAddition__SymbolAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:833:1: ( ( '+' ) | ( '-' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            else if ( (LA8_0==21) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:834:1: ( '+' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:834:1: ( '+' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:835:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSugarAdditionAccess().getSymbolPlusSignKeyword_1_1_0_0()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__SugarAddition__SymbolAlternatives_1_1_01754); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSugarAdditionAccess().getSymbolPlusSignKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:842:6: ( '-' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:842:6: ( '-' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:843:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSugarAdditionAccess().getSymbolHyphenMinusKeyword_1_1_0_1()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__SugarAddition__SymbolAlternatives_1_1_01774); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSugarAdditionAccess().getSymbolHyphenMinusKeyword_1_1_0_1()); 
                    }

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
    // $ANTLR end "rule__SugarAddition__SymbolAlternatives_1_1_0"


    // $ANTLR start "rule__SugarMultiplication__SymbolAlternatives_1_1_0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:855:1: rule__SugarMultiplication__SymbolAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__SugarMultiplication__SymbolAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:859:1: ( ( '*' ) | ( '/' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            else if ( (LA9_0==23) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:860:1: ( '*' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:860:1: ( '*' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:861:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSugarMultiplicationAccess().getSymbolAsteriskKeyword_1_1_0_0()); 
                    }
                    match(input,22,FOLLOW_22_in_rule__SugarMultiplication__SymbolAlternatives_1_1_01809); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSugarMultiplicationAccess().getSymbolAsteriskKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:868:6: ( '/' )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:868:6: ( '/' )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:869:1: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSugarMultiplicationAccess().getSymbolSolidusKeyword_1_1_0_1()); 
                    }
                    match(input,23,FOLLOW_23_in_rule__SugarMultiplication__SymbolAlternatives_1_1_01829); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSugarMultiplicationAccess().getSymbolSolidusKeyword_1_1_0_1()); 
                    }

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
    // $ANTLR end "rule__SugarMultiplication__SymbolAlternatives_1_1_0"


    // $ANTLR start "rule__SugarNumericalPrimary__Alternatives"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:881:1: rule__SugarNumericalPrimary__Alternatives : ( ( ruleNumberLiteral ) | ( ( ruleAtomic ) ) | ( ruleSugarAtomic ) | ( ( rule__SugarNumericalPrimary__Group_3__0 ) ) );
    public final void rule__SugarNumericalPrimary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:885:1: ( ( ruleNumberLiteral ) | ( ( ruleAtomic ) ) | ( ruleSugarAtomic ) | ( ( rule__SugarNumericalPrimary__Group_3__0 ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt10=1;
                }
                break;
            case RULE_ID:
                {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==33) ) {
                    switch ( input.LA(3) ) {
                    case RULE_INT:
                    case 33:
                        {
                        alt10=3;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA10_6 = input.LA(4);

                        if ( (LA10_6==33) ) {
                            alt10=3;
                        }
                        else if ( (LA10_6==27||LA10_6==34) ) {
                            alt10=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 34:
                        {
                        int LA10_7 = input.LA(4);

                        if ( (synpred17_InternalInput()) ) {
                            alt10=2;
                        }
                        else if ( (synpred18_InternalInput()) ) {
                            alt10=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 4, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                alt10=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:886:1: ( ruleNumberLiteral )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:886:1: ( ruleNumberLiteral )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:887:1: ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSugarNumericalPrimaryAccess().getNumberLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_rule__SugarNumericalPrimary__Alternatives1863);
                    ruleNumberLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSugarNumericalPrimaryAccess().getNumberLiteralParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:892:6: ( ( ruleAtomic ) )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:892:6: ( ( ruleAtomic ) )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:893:1: ( ruleAtomic )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSugarNumericalPrimaryAccess().getAtomicParserRuleCall_1()); 
                    }
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:894:1: ( ruleAtomic )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:894:3: ruleAtomic
                    {
                    pushFollow(FOLLOW_ruleAtomic_in_rule__SugarNumericalPrimary__Alternatives1881);
                    ruleAtomic();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSugarNumericalPrimaryAccess().getAtomicParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:898:6: ( ruleSugarAtomic )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:898:6: ( ruleSugarAtomic )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:899:1: ruleSugarAtomic
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSugarNumericalPrimaryAccess().getSugarAtomicParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleSugarAtomic_in_rule__SugarNumericalPrimary__Alternatives1899);
                    ruleSugarAtomic();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSugarNumericalPrimaryAccess().getSugarAtomicParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:904:6: ( ( rule__SugarNumericalPrimary__Group_3__0 ) )
                    {
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:904:6: ( ( rule__SugarNumericalPrimary__Group_3__0 ) )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:905:1: ( rule__SugarNumericalPrimary__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSugarNumericalPrimaryAccess().getGroup_3()); 
                    }
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:906:1: ( rule__SugarNumericalPrimary__Group_3__0 )
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:906:2: rule__SugarNumericalPrimary__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__SugarNumericalPrimary__Group_3__0_in_rule__SugarNumericalPrimary__Alternatives1916);
                    rule__SugarNumericalPrimary__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSugarNumericalPrimaryAccess().getGroup_3()); 
                    }

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
    // $ANTLR end "rule__SugarNumericalPrimary__Alternatives"


    // $ANTLR start "rule__Input__Group__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:917:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:921:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:922:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__01947);
            rule__Input__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group__1_in_rule__Input__Group__01950);
            rule__Input__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:929:1: rule__Input__Group__0__Impl : ( 'Given' ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:933:1: ( ( 'Given' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:934:1: ( 'Given' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:934:1: ( 'Given' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:935:1: 'Given'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getGivenKeyword_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Input__Group__0__Impl1978); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getGivenKeyword_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:948:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:952:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:953:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__12009);
            rule__Input__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group__2_in_rule__Input__Group__12012);
            rule__Input__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:960:1: rule__Input__Group__1__Impl : ( ( rule__Input__GivenAssignment_1 ) ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:964:1: ( ( ( rule__Input__GivenAssignment_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:965:1: ( ( rule__Input__GivenAssignment_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:965:1: ( ( rule__Input__GivenAssignment_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:966:1: ( rule__Input__GivenAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getGivenAssignment_1()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:967:1: ( rule__Input__GivenAssignment_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:967:2: rule__Input__GivenAssignment_1
            {
            pushFollow(FOLLOW_rule__Input__GivenAssignment_1_in_rule__Input__Group__1__Impl2039);
            rule__Input__GivenAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getGivenAssignment_1()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:977:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:981:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:982:2: rule__Input__Group__2__Impl rule__Input__Group__3
            {
            pushFollow(FOLLOW_rule__Input__Group__2__Impl_in_rule__Input__Group__22069);
            rule__Input__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group__3_in_rule__Input__Group__22072);
            rule__Input__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:989:1: rule__Input__Group__2__Impl : ( ';' ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:993:1: ( ( ';' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:994:1: ( ';' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:994:1: ( ';' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:995:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getSemicolonKeyword_2()); 
            }
            match(input,25,FOLLOW_25_in_rule__Input__Group__2__Impl2100); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1008:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1012:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1013:2: rule__Input__Group__3__Impl rule__Input__Group__4
            {
            pushFollow(FOLLOW_rule__Input__Group__3__Impl_in_rule__Input__Group__32131);
            rule__Input__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group__4_in_rule__Input__Group__32134);
            rule__Input__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1020:1: rule__Input__Group__3__Impl : ( ( rule__Input__Alternatives_3 )? ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1024:1: ( ( ( rule__Input__Alternatives_3 )? ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1025:1: ( ( rule__Input__Alternatives_3 )? )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1025:1: ( ( rule__Input__Alternatives_3 )? )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1026:1: ( rule__Input__Alternatives_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getAlternatives_3()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1027:1: ( rule__Input__Alternatives_3 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=11 && LA11_0<=12)||LA11_0==39) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1027:2: rule__Input__Alternatives_3
                    {
                    pushFollow(FOLLOW_rule__Input__Alternatives_3_in_rule__Input__Group__3__Impl2161);
                    rule__Input__Alternatives_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getAlternatives_3()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1037:1: rule__Input__Group__4 : rule__Input__Group__4__Impl ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1041:1: ( rule__Input__Group__4__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1042:2: rule__Input__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group__4__Impl_in_rule__Input__Group__42192);
            rule__Input__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1048:1: rule__Input__Group__4__Impl : ( ( rule__Input__Group_4__0 )? ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1052:1: ( ( ( rule__Input__Group_4__0 )? ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1053:1: ( ( rule__Input__Group_4__0 )? )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1053:1: ( ( rule__Input__Group_4__0 )? )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1054:1: ( rule__Input__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getGroup_4()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1055:1: ( rule__Input__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1055:2: rule__Input__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Input__Group_4__0_in_rule__Input__Group__4__Impl2219);
                    rule__Input__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getGroup_4()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1075:1: rule__Input__Group_3_0__0 : rule__Input__Group_3_0__0__Impl rule__Input__Group_3_0__1 ;
    public final void rule__Input__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1079:1: ( rule__Input__Group_3_0__0__Impl rule__Input__Group_3_0__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1080:2: rule__Input__Group_3_0__0__Impl rule__Input__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__Input__Group_3_0__0__Impl_in_rule__Input__Group_3_0__02260);
            rule__Input__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group_3_0__1_in_rule__Input__Group_3_0__02263);
            rule__Input__Group_3_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1087:1: rule__Input__Group_3_0__0__Impl : ( ( rule__Input__TaskAssignment_3_0_0 ) ) ;
    public final void rule__Input__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1091:1: ( ( ( rule__Input__TaskAssignment_3_0_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1092:1: ( ( rule__Input__TaskAssignment_3_0_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1092:1: ( ( rule__Input__TaskAssignment_3_0_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1093:1: ( rule__Input__TaskAssignment_3_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getTaskAssignment_3_0_0()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1094:1: ( rule__Input__TaskAssignment_3_0_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1094:2: rule__Input__TaskAssignment_3_0_0
            {
            pushFollow(FOLLOW_rule__Input__TaskAssignment_3_0_0_in_rule__Input__Group_3_0__0__Impl2290);
            rule__Input__TaskAssignment_3_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getTaskAssignment_3_0_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1104:1: rule__Input__Group_3_0__1 : rule__Input__Group_3_0__1__Impl ;
    public final void rule__Input__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1108:1: ( rule__Input__Group_3_0__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1109:2: rule__Input__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group_3_0__1__Impl_in_rule__Input__Group_3_0__12320);
            rule__Input__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1115:1: rule__Input__Group_3_0__1__Impl : ( ( rule__Input__GoalAssignment_3_0_1 ) ) ;
    public final void rule__Input__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1119:1: ( ( ( rule__Input__GoalAssignment_3_0_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1120:1: ( ( rule__Input__GoalAssignment_3_0_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1120:1: ( ( rule__Input__GoalAssignment_3_0_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1121:1: ( rule__Input__GoalAssignment_3_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getGoalAssignment_3_0_1()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1122:1: ( rule__Input__GoalAssignment_3_0_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1122:2: rule__Input__GoalAssignment_3_0_1
            {
            pushFollow(FOLLOW_rule__Input__GoalAssignment_3_0_1_in_rule__Input__Group_3_0__1__Impl2347);
            rule__Input__GoalAssignment_3_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getGoalAssignment_3_0_1()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1136:1: rule__Input__Group_3_1__0 : rule__Input__Group_3_1__0__Impl rule__Input__Group_3_1__1 ;
    public final void rule__Input__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1140:1: ( rule__Input__Group_3_1__0__Impl rule__Input__Group_3_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1141:2: rule__Input__Group_3_1__0__Impl rule__Input__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Input__Group_3_1__0__Impl_in_rule__Input__Group_3_1__02381);
            rule__Input__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group_3_1__1_in_rule__Input__Group_3_1__02384);
            rule__Input__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1148:1: rule__Input__Group_3_1__0__Impl : ( ( rule__Input__TaskAssignment_3_1_0 ) ) ;
    public final void rule__Input__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1152:1: ( ( ( rule__Input__TaskAssignment_3_1_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1153:1: ( ( rule__Input__TaskAssignment_3_1_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1153:1: ( ( rule__Input__TaskAssignment_3_1_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1154:1: ( rule__Input__TaskAssignment_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getTaskAssignment_3_1_0()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1155:1: ( rule__Input__TaskAssignment_3_1_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1155:2: rule__Input__TaskAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__Input__TaskAssignment_3_1_0_in_rule__Input__Group_3_1__0__Impl2411);
            rule__Input__TaskAssignment_3_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getTaskAssignment_3_1_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1165:1: rule__Input__Group_3_1__1 : rule__Input__Group_3_1__1__Impl ;
    public final void rule__Input__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1169:1: ( rule__Input__Group_3_1__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1170:2: rule__Input__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group_3_1__1__Impl_in_rule__Input__Group_3_1__12441);
            rule__Input__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1176:1: rule__Input__Group_3_1__1__Impl : ( ( rule__Input__GoalAssignment_3_1_1 ) ) ;
    public final void rule__Input__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1180:1: ( ( ( rule__Input__GoalAssignment_3_1_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1181:1: ( ( rule__Input__GoalAssignment_3_1_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1181:1: ( ( rule__Input__GoalAssignment_3_1_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1182:1: ( rule__Input__GoalAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getGoalAssignment_3_1_1()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1183:1: ( rule__Input__GoalAssignment_3_1_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1183:2: rule__Input__GoalAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Input__GoalAssignment_3_1_1_in_rule__Input__Group_3_1__1__Impl2468);
            rule__Input__GoalAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getGoalAssignment_3_1_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Input__Group_4__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1197:1: rule__Input__Group_4__0 : rule__Input__Group_4__0__Impl rule__Input__Group_4__1 ;
    public final void rule__Input__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1201:1: ( rule__Input__Group_4__0__Impl rule__Input__Group_4__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1202:2: rule__Input__Group_4__0__Impl rule__Input__Group_4__1
            {
            pushFollow(FOLLOW_rule__Input__Group_4__0__Impl_in_rule__Input__Group_4__02502);
            rule__Input__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group_4__1_in_rule__Input__Group_4__02505);
            rule__Input__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1209:1: rule__Input__Group_4__0__Impl : ( ';' ) ;
    public final void rule__Input__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1213:1: ( ( ';' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1214:1: ( ';' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1214:1: ( ';' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1215:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getSemicolonKeyword_4_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Input__Group_4__0__Impl2533); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getSemicolonKeyword_4_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1228:1: rule__Input__Group_4__1 : rule__Input__Group_4__1__Impl rule__Input__Group_4__2 ;
    public final void rule__Input__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1232:1: ( rule__Input__Group_4__1__Impl rule__Input__Group_4__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1233:2: rule__Input__Group_4__1__Impl rule__Input__Group_4__2
            {
            pushFollow(FOLLOW_rule__Input__Group_4__1__Impl_in_rule__Input__Group_4__12564);
            rule__Input__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group_4__2_in_rule__Input__Group_4__12567);
            rule__Input__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1240:1: rule__Input__Group_4__1__Impl : ( 'Theorems:' ) ;
    public final void rule__Input__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1244:1: ( ( 'Theorems:' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1245:1: ( 'Theorems:' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1245:1: ( 'Theorems:' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1246:1: 'Theorems:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getTheoremsKeyword_4_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__Input__Group_4__1__Impl2595); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getTheoremsKeyword_4_1()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1259:1: rule__Input__Group_4__2 : rule__Input__Group_4__2__Impl rule__Input__Group_4__3 ;
    public final void rule__Input__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1263:1: ( rule__Input__Group_4__2__Impl rule__Input__Group_4__3 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1264:2: rule__Input__Group_4__2__Impl rule__Input__Group_4__3
            {
            pushFollow(FOLLOW_rule__Input__Group_4__2__Impl_in_rule__Input__Group_4__22626);
            rule__Input__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group_4__3_in_rule__Input__Group_4__22629);
            rule__Input__Group_4__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1271:1: rule__Input__Group_4__2__Impl : ( ( rule__Input__TheoremsAssignment_4_2 ) ) ;
    public final void rule__Input__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1275:1: ( ( ( rule__Input__TheoremsAssignment_4_2 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1276:1: ( ( rule__Input__TheoremsAssignment_4_2 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1276:1: ( ( rule__Input__TheoremsAssignment_4_2 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1277:1: ( rule__Input__TheoremsAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getTheoremsAssignment_4_2()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1278:1: ( rule__Input__TheoremsAssignment_4_2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1278:2: rule__Input__TheoremsAssignment_4_2
            {
            pushFollow(FOLLOW_rule__Input__TheoremsAssignment_4_2_in_rule__Input__Group_4__2__Impl2656);
            rule__Input__TheoremsAssignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getTheoremsAssignment_4_2()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1288:1: rule__Input__Group_4__3 : rule__Input__Group_4__3__Impl rule__Input__Group_4__4 ;
    public final void rule__Input__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1292:1: ( rule__Input__Group_4__3__Impl rule__Input__Group_4__4 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1293:2: rule__Input__Group_4__3__Impl rule__Input__Group_4__4
            {
            pushFollow(FOLLOW_rule__Input__Group_4__3__Impl_in_rule__Input__Group_4__32686);
            rule__Input__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group_4__4_in_rule__Input__Group_4__32689);
            rule__Input__Group_4__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1300:1: rule__Input__Group_4__3__Impl : ( ( rule__Input__Group_4_3__0 )* ) ;
    public final void rule__Input__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1304:1: ( ( ( rule__Input__Group_4_3__0 )* ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1305:1: ( ( rule__Input__Group_4_3__0 )* )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1305:1: ( ( rule__Input__Group_4_3__0 )* )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1306:1: ( rule__Input__Group_4_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getGroup_4_3()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1307:1: ( rule__Input__Group_4_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25) ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==RULE_ID||(LA13_1>=13 && LA13_1<=16)||LA13_1==33||LA13_1==35||LA13_1==37) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1307:2: rule__Input__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Input__Group_4_3__0_in_rule__Input__Group_4__3__Impl2716);
            	    rule__Input__Group_4_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getGroup_4_3()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1317:1: rule__Input__Group_4__4 : rule__Input__Group_4__4__Impl ;
    public final void rule__Input__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1321:1: ( rule__Input__Group_4__4__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1322:2: rule__Input__Group_4__4__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group_4__4__Impl_in_rule__Input__Group_4__42747);
            rule__Input__Group_4__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1328:1: rule__Input__Group_4__4__Impl : ( ( ';' )? ) ;
    public final void rule__Input__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1332:1: ( ( ( ';' )? ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1333:1: ( ( ';' )? )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1333:1: ( ( ';' )? )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1334:1: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getSemicolonKeyword_4_4()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1335:1: ( ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1336:2: ';'
                    {
                    match(input,25,FOLLOW_25_in_rule__Input__Group_4__4__Impl2776); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getSemicolonKeyword_4_4()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1357:1: rule__Input__Group_4_3__0 : rule__Input__Group_4_3__0__Impl rule__Input__Group_4_3__1 ;
    public final void rule__Input__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1361:1: ( rule__Input__Group_4_3__0__Impl rule__Input__Group_4_3__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1362:2: rule__Input__Group_4_3__0__Impl rule__Input__Group_4_3__1
            {
            pushFollow(FOLLOW_rule__Input__Group_4_3__0__Impl_in_rule__Input__Group_4_3__02819);
            rule__Input__Group_4_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group_4_3__1_in_rule__Input__Group_4_3__02822);
            rule__Input__Group_4_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1369:1: rule__Input__Group_4_3__0__Impl : ( ';' ) ;
    public final void rule__Input__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1373:1: ( ( ';' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1374:1: ( ';' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1374:1: ( ';' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1375:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getSemicolonKeyword_4_3_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Input__Group_4_3__0__Impl2850); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getSemicolonKeyword_4_3_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1388:1: rule__Input__Group_4_3__1 : rule__Input__Group_4_3__1__Impl ;
    public final void rule__Input__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1392:1: ( rule__Input__Group_4_3__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1393:2: rule__Input__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group_4_3__1__Impl_in_rule__Input__Group_4_3__12881);
            rule__Input__Group_4_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1399:1: rule__Input__Group_4_3__1__Impl : ( ( rule__Input__TheoremsAssignment_4_3_1 ) ) ;
    public final void rule__Input__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1403:1: ( ( ( rule__Input__TheoremsAssignment_4_3_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1404:1: ( ( rule__Input__TheoremsAssignment_4_3_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1404:1: ( ( rule__Input__TheoremsAssignment_4_3_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1405:1: ( rule__Input__TheoremsAssignment_4_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getTheoremsAssignment_4_3_1()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1406:1: ( rule__Input__TheoremsAssignment_4_3_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1406:2: rule__Input__TheoremsAssignment_4_3_1
            {
            pushFollow(FOLLOW_rule__Input__TheoremsAssignment_4_3_1_in_rule__Input__Group_4_3__1__Impl2908);
            rule__Input__TheoremsAssignment_4_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getTheoremsAssignment_4_3_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__ProblemPropertyOptional__Group__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1420:1: rule__ProblemPropertyOptional__Group__0 : rule__ProblemPropertyOptional__Group__0__Impl rule__ProblemPropertyOptional__Group__1 ;
    public final void rule__ProblemPropertyOptional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1424:1: ( rule__ProblemPropertyOptional__Group__0__Impl rule__ProblemPropertyOptional__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1425:2: rule__ProblemPropertyOptional__Group__0__Impl rule__ProblemPropertyOptional__Group__1
            {
            pushFollow(FOLLOW_rule__ProblemPropertyOptional__Group__0__Impl_in_rule__ProblemPropertyOptional__Group__02942);
            rule__ProblemPropertyOptional__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ProblemPropertyOptional__Group__1_in_rule__ProblemPropertyOptional__Group__02945);
            rule__ProblemPropertyOptional__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemPropertyOptional__Group__0"


    // $ANTLR start "rule__ProblemPropertyOptional__Group__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1432:1: rule__ProblemPropertyOptional__Group__0__Impl : ( ( rule__ProblemPropertyOptional__VarsAssignment_0 ) ) ;
    public final void rule__ProblemPropertyOptional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1436:1: ( ( ( rule__ProblemPropertyOptional__VarsAssignment_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1437:1: ( ( rule__ProblemPropertyOptional__VarsAssignment_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1437:1: ( ( rule__ProblemPropertyOptional__VarsAssignment_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1438:1: ( rule__ProblemPropertyOptional__VarsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProblemPropertyOptionalAccess().getVarsAssignment_0()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1439:1: ( rule__ProblemPropertyOptional__VarsAssignment_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1439:2: rule__ProblemPropertyOptional__VarsAssignment_0
            {
            pushFollow(FOLLOW_rule__ProblemPropertyOptional__VarsAssignment_0_in_rule__ProblemPropertyOptional__Group__0__Impl2972);
            rule__ProblemPropertyOptional__VarsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProblemPropertyOptionalAccess().getVarsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemPropertyOptional__Group__0__Impl"


    // $ANTLR start "rule__ProblemPropertyOptional__Group__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1449:1: rule__ProblemPropertyOptional__Group__1 : rule__ProblemPropertyOptional__Group__1__Impl rule__ProblemPropertyOptional__Group__2 ;
    public final void rule__ProblemPropertyOptional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1453:1: ( rule__ProblemPropertyOptional__Group__1__Impl rule__ProblemPropertyOptional__Group__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1454:2: rule__ProblemPropertyOptional__Group__1__Impl rule__ProblemPropertyOptional__Group__2
            {
            pushFollow(FOLLOW_rule__ProblemPropertyOptional__Group__1__Impl_in_rule__ProblemPropertyOptional__Group__13002);
            rule__ProblemPropertyOptional__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ProblemPropertyOptional__Group__2_in_rule__ProblemPropertyOptional__Group__13005);
            rule__ProblemPropertyOptional__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemPropertyOptional__Group__1"


    // $ANTLR start "rule__ProblemPropertyOptional__Group__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1461:1: rule__ProblemPropertyOptional__Group__1__Impl : ( ( rule__ProblemPropertyOptional__Group_1__0 )* ) ;
    public final void rule__ProblemPropertyOptional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1465:1: ( ( ( rule__ProblemPropertyOptional__Group_1__0 )* ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1466:1: ( ( rule__ProblemPropertyOptional__Group_1__0 )* )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1466:1: ( ( rule__ProblemPropertyOptional__Group_1__0 )* )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1467:1: ( rule__ProblemPropertyOptional__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProblemPropertyOptionalAccess().getGroup_1()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1468:1: ( rule__ProblemPropertyOptional__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1468:2: rule__ProblemPropertyOptional__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ProblemPropertyOptional__Group_1__0_in_rule__ProblemPropertyOptional__Group__1__Impl3032);
            	    rule__ProblemPropertyOptional__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProblemPropertyOptionalAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemPropertyOptional__Group__1__Impl"


    // $ANTLR start "rule__ProblemPropertyOptional__Group__2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1478:1: rule__ProblemPropertyOptional__Group__2 : rule__ProblemPropertyOptional__Group__2__Impl ;
    public final void rule__ProblemPropertyOptional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1482:1: ( rule__ProblemPropertyOptional__Group__2__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1483:2: rule__ProblemPropertyOptional__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ProblemPropertyOptional__Group__2__Impl_in_rule__ProblemPropertyOptional__Group__23063);
            rule__ProblemPropertyOptional__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemPropertyOptional__Group__2"


    // $ANTLR start "rule__ProblemPropertyOptional__Group__2__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1489:1: rule__ProblemPropertyOptional__Group__2__Impl : ( ( rule__ProblemPropertyOptional__Group_2__0 )? ) ;
    public final void rule__ProblemPropertyOptional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1493:1: ( ( ( rule__ProblemPropertyOptional__Group_2__0 )? ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1494:1: ( ( rule__ProblemPropertyOptional__Group_2__0 )? )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1494:1: ( ( rule__ProblemPropertyOptional__Group_2__0 )? )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1495:1: ( rule__ProblemPropertyOptional__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProblemPropertyOptionalAccess().getGroup_2()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1496:1: ( rule__ProblemPropertyOptional__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1496:2: rule__ProblemPropertyOptional__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ProblemPropertyOptional__Group_2__0_in_rule__ProblemPropertyOptional__Group__2__Impl3090);
                    rule__ProblemPropertyOptional__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProblemPropertyOptionalAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemPropertyOptional__Group__2__Impl"


    // $ANTLR start "rule__ProblemPropertyOptional__Group_1__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1512:1: rule__ProblemPropertyOptional__Group_1__0 : rule__ProblemPropertyOptional__Group_1__0__Impl rule__ProblemPropertyOptional__Group_1__1 ;
    public final void rule__ProblemPropertyOptional__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1516:1: ( rule__ProblemPropertyOptional__Group_1__0__Impl rule__ProblemPropertyOptional__Group_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1517:2: rule__ProblemPropertyOptional__Group_1__0__Impl rule__ProblemPropertyOptional__Group_1__1
            {
            pushFollow(FOLLOW_rule__ProblemPropertyOptional__Group_1__0__Impl_in_rule__ProblemPropertyOptional__Group_1__03127);
            rule__ProblemPropertyOptional__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ProblemPropertyOptional__Group_1__1_in_rule__ProblemPropertyOptional__Group_1__03130);
            rule__ProblemPropertyOptional__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemPropertyOptional__Group_1__0"


    // $ANTLR start "rule__ProblemPropertyOptional__Group_1__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1524:1: rule__ProblemPropertyOptional__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ProblemPropertyOptional__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1528:1: ( ( ',' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1529:1: ( ',' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1529:1: ( ',' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1530:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProblemPropertyOptionalAccess().getCommaKeyword_1_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__ProblemPropertyOptional__Group_1__0__Impl3158); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProblemPropertyOptionalAccess().getCommaKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemPropertyOptional__Group_1__0__Impl"


    // $ANTLR start "rule__ProblemPropertyOptional__Group_1__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1543:1: rule__ProblemPropertyOptional__Group_1__1 : rule__ProblemPropertyOptional__Group_1__1__Impl ;
    public final void rule__ProblemPropertyOptional__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1547:1: ( rule__ProblemPropertyOptional__Group_1__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1548:2: rule__ProblemPropertyOptional__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ProblemPropertyOptional__Group_1__1__Impl_in_rule__ProblemPropertyOptional__Group_1__13189);
            rule__ProblemPropertyOptional__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemPropertyOptional__Group_1__1"


    // $ANTLR start "rule__ProblemPropertyOptional__Group_1__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1554:1: rule__ProblemPropertyOptional__Group_1__1__Impl : ( ( rule__ProblemPropertyOptional__VarsAssignment_1_1 ) ) ;
    public final void rule__ProblemPropertyOptional__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1558:1: ( ( ( rule__ProblemPropertyOptional__VarsAssignment_1_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1559:1: ( ( rule__ProblemPropertyOptional__VarsAssignment_1_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1559:1: ( ( rule__ProblemPropertyOptional__VarsAssignment_1_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1560:1: ( rule__ProblemPropertyOptional__VarsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProblemPropertyOptionalAccess().getVarsAssignment_1_1()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1561:1: ( rule__ProblemPropertyOptional__VarsAssignment_1_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1561:2: rule__ProblemPropertyOptional__VarsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ProblemPropertyOptional__VarsAssignment_1_1_in_rule__ProblemPropertyOptional__Group_1__1__Impl3216);
            rule__ProblemPropertyOptional__VarsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProblemPropertyOptionalAccess().getVarsAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemPropertyOptional__Group_1__1__Impl"


    // $ANTLR start "rule__ProblemPropertyOptional__Group_2__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1575:1: rule__ProblemPropertyOptional__Group_2__0 : rule__ProblemPropertyOptional__Group_2__0__Impl rule__ProblemPropertyOptional__Group_2__1 ;
    public final void rule__ProblemPropertyOptional__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1579:1: ( rule__ProblemPropertyOptional__Group_2__0__Impl rule__ProblemPropertyOptional__Group_2__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1580:2: rule__ProblemPropertyOptional__Group_2__0__Impl rule__ProblemPropertyOptional__Group_2__1
            {
            pushFollow(FOLLOW_rule__ProblemPropertyOptional__Group_2__0__Impl_in_rule__ProblemPropertyOptional__Group_2__03250);
            rule__ProblemPropertyOptional__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ProblemPropertyOptional__Group_2__1_in_rule__ProblemPropertyOptional__Group_2__03253);
            rule__ProblemPropertyOptional__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemPropertyOptional__Group_2__0"


    // $ANTLR start "rule__ProblemPropertyOptional__Group_2__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1587:1: rule__ProblemPropertyOptional__Group_2__0__Impl : ( 'st' ) ;
    public final void rule__ProblemPropertyOptional__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1591:1: ( ( 'st' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1592:1: ( 'st' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1592:1: ( 'st' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1593:1: 'st'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProblemPropertyOptionalAccess().getStKeyword_2_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__ProblemPropertyOptional__Group_2__0__Impl3281); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProblemPropertyOptionalAccess().getStKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemPropertyOptional__Group_2__0__Impl"


    // $ANTLR start "rule__ProblemPropertyOptional__Group_2__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1606:1: rule__ProblemPropertyOptional__Group_2__1 : rule__ProblemPropertyOptional__Group_2__1__Impl ;
    public final void rule__ProblemPropertyOptional__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1610:1: ( rule__ProblemPropertyOptional__Group_2__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1611:2: rule__ProblemPropertyOptional__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ProblemPropertyOptional__Group_2__1__Impl_in_rule__ProblemPropertyOptional__Group_2__13312);
            rule__ProblemPropertyOptional__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemPropertyOptional__Group_2__1"


    // $ANTLR start "rule__ProblemPropertyOptional__Group_2__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1617:1: rule__ProblemPropertyOptional__Group_2__1__Impl : ( ( rule__ProblemPropertyOptional__PropertyAssignment_2_1 ) ) ;
    public final void rule__ProblemPropertyOptional__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1621:1: ( ( ( rule__ProblemPropertyOptional__PropertyAssignment_2_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1622:1: ( ( rule__ProblemPropertyOptional__PropertyAssignment_2_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1622:1: ( ( rule__ProblemPropertyOptional__PropertyAssignment_2_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1623:1: ( rule__ProblemPropertyOptional__PropertyAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProblemPropertyOptionalAccess().getPropertyAssignment_2_1()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1624:1: ( rule__ProblemPropertyOptional__PropertyAssignment_2_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1624:2: rule__ProblemPropertyOptional__PropertyAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ProblemPropertyOptional__PropertyAssignment_2_1_in_rule__ProblemPropertyOptional__Group_2__1__Impl3339);
            rule__ProblemPropertyOptional__PropertyAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProblemPropertyOptionalAccess().getPropertyAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemPropertyOptional__Group_2__1__Impl"


    // $ANTLR start "rule__Problem__Group__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1638:1: rule__Problem__Group__0 : rule__Problem__Group__0__Impl rule__Problem__Group__1 ;
    public final void rule__Problem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1642:1: ( rule__Problem__Group__0__Impl rule__Problem__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1643:2: rule__Problem__Group__0__Impl rule__Problem__Group__1
            {
            pushFollow(FOLLOW_rule__Problem__Group__0__Impl_in_rule__Problem__Group__03373);
            rule__Problem__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Problem__Group__1_in_rule__Problem__Group__03376);
            rule__Problem__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1650:1: rule__Problem__Group__0__Impl : ( ( rule__Problem__VarsAssignment_0 ) ) ;
    public final void rule__Problem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1654:1: ( ( ( rule__Problem__VarsAssignment_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1655:1: ( ( rule__Problem__VarsAssignment_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1655:1: ( ( rule__Problem__VarsAssignment_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1656:1: ( rule__Problem__VarsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProblemAccess().getVarsAssignment_0()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1657:1: ( rule__Problem__VarsAssignment_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1657:2: rule__Problem__VarsAssignment_0
            {
            pushFollow(FOLLOW_rule__Problem__VarsAssignment_0_in_rule__Problem__Group__0__Impl3403);
            rule__Problem__VarsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProblemAccess().getVarsAssignment_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1667:1: rule__Problem__Group__1 : rule__Problem__Group__1__Impl rule__Problem__Group__2 ;
    public final void rule__Problem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1671:1: ( rule__Problem__Group__1__Impl rule__Problem__Group__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1672:2: rule__Problem__Group__1__Impl rule__Problem__Group__2
            {
            pushFollow(FOLLOW_rule__Problem__Group__1__Impl_in_rule__Problem__Group__13433);
            rule__Problem__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Problem__Group__2_in_rule__Problem__Group__13436);
            rule__Problem__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1679:1: rule__Problem__Group__1__Impl : ( ( rule__Problem__Group_1__0 )* ) ;
    public final void rule__Problem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1683:1: ( ( ( rule__Problem__Group_1__0 )* ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1684:1: ( ( rule__Problem__Group_1__0 )* )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1684:1: ( ( rule__Problem__Group_1__0 )* )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1685:1: ( rule__Problem__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProblemAccess().getGroup_1()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1686:1: ( rule__Problem__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1686:2: rule__Problem__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Problem__Group_1__0_in_rule__Problem__Group__1__Impl3463);
            	    rule__Problem__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProblemAccess().getGroup_1()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1696:1: rule__Problem__Group__2 : rule__Problem__Group__2__Impl rule__Problem__Group__3 ;
    public final void rule__Problem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1700:1: ( rule__Problem__Group__2__Impl rule__Problem__Group__3 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1701:2: rule__Problem__Group__2__Impl rule__Problem__Group__3
            {
            pushFollow(FOLLOW_rule__Problem__Group__2__Impl_in_rule__Problem__Group__23494);
            rule__Problem__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Problem__Group__3_in_rule__Problem__Group__23497);
            rule__Problem__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1708:1: rule__Problem__Group__2__Impl : ( 'st' ) ;
    public final void rule__Problem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1712:1: ( ( 'st' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1713:1: ( 'st' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1713:1: ( 'st' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1714:1: 'st'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProblemAccess().getStKeyword_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__Problem__Group__2__Impl3525); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProblemAccess().getStKeyword_2()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1727:1: rule__Problem__Group__3 : rule__Problem__Group__3__Impl ;
    public final void rule__Problem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1731:1: ( rule__Problem__Group__3__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1732:2: rule__Problem__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Problem__Group__3__Impl_in_rule__Problem__Group__33556);
            rule__Problem__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1738:1: rule__Problem__Group__3__Impl : ( ( rule__Problem__PropertyAssignment_3 ) ) ;
    public final void rule__Problem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1742:1: ( ( ( rule__Problem__PropertyAssignment_3 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1743:1: ( ( rule__Problem__PropertyAssignment_3 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1743:1: ( ( rule__Problem__PropertyAssignment_3 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1744:1: ( rule__Problem__PropertyAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProblemAccess().getPropertyAssignment_3()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1745:1: ( rule__Problem__PropertyAssignment_3 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1745:2: rule__Problem__PropertyAssignment_3
            {
            pushFollow(FOLLOW_rule__Problem__PropertyAssignment_3_in_rule__Problem__Group__3__Impl3583);
            rule__Problem__PropertyAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProblemAccess().getPropertyAssignment_3()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1763:1: rule__Problem__Group_1__0 : rule__Problem__Group_1__0__Impl rule__Problem__Group_1__1 ;
    public final void rule__Problem__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1767:1: ( rule__Problem__Group_1__0__Impl rule__Problem__Group_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1768:2: rule__Problem__Group_1__0__Impl rule__Problem__Group_1__1
            {
            pushFollow(FOLLOW_rule__Problem__Group_1__0__Impl_in_rule__Problem__Group_1__03621);
            rule__Problem__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Problem__Group_1__1_in_rule__Problem__Group_1__03624);
            rule__Problem__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1775:1: rule__Problem__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Problem__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1779:1: ( ( ',' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1780:1: ( ',' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1780:1: ( ',' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1781:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProblemAccess().getCommaKeyword_1_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Problem__Group_1__0__Impl3652); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProblemAccess().getCommaKeyword_1_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1794:1: rule__Problem__Group_1__1 : rule__Problem__Group_1__1__Impl ;
    public final void rule__Problem__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1798:1: ( rule__Problem__Group_1__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1799:2: rule__Problem__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Problem__Group_1__1__Impl_in_rule__Problem__Group_1__13683);
            rule__Problem__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1805:1: rule__Problem__Group_1__1__Impl : ( ( rule__Problem__VarsAssignment_1_1 ) ) ;
    public final void rule__Problem__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1809:1: ( ( ( rule__Problem__VarsAssignment_1_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1810:1: ( ( rule__Problem__VarsAssignment_1_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1810:1: ( ( rule__Problem__VarsAssignment_1_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1811:1: ( rule__Problem__VarsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProblemAccess().getVarsAssignment_1_1()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1812:1: ( rule__Problem__VarsAssignment_1_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1812:2: rule__Problem__VarsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Problem__VarsAssignment_1_1_in_rule__Problem__Group_1__1__Impl3710);
            rule__Problem__VarsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProblemAccess().getVarsAssignment_1_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Declaration__Group__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1826:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1830:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1831:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__03744);
            rule__Declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__03747);
            rule__Declaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1838:1: rule__Declaration__Group__0__Impl : ( ( rule__Declaration__TypeAssignment_0 )? ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1842:1: ( ( ( rule__Declaration__TypeAssignment_0 )? ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1843:1: ( ( rule__Declaration__TypeAssignment_0 )? )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1843:1: ( ( rule__Declaration__TypeAssignment_0 )? )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1844:1: ( rule__Declaration__TypeAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getTypeAssignment_0()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1845:1: ( rule__Declaration__TypeAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==RULE_ID||LA18_1==29) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1845:2: rule__Declaration__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Declaration__TypeAssignment_0_in_rule__Declaration__Group__0__Impl3774);
                    rule__Declaration__TypeAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1855:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1859:1: ( rule__Declaration__Group__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1860:2: rule__Declaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__13805);
            rule__Declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1866:1: rule__Declaration__Group__1__Impl : ( ( rule__Declaration__VarNameAssignment_1 ) ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1870:1: ( ( ( rule__Declaration__VarNameAssignment_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1871:1: ( ( rule__Declaration__VarNameAssignment_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1871:1: ( ( rule__Declaration__VarNameAssignment_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1872:1: ( rule__Declaration__VarNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getVarNameAssignment_1()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1873:1: ( rule__Declaration__VarNameAssignment_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1873:2: rule__Declaration__VarNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Declaration__VarNameAssignment_1_in_rule__Declaration__Group__1__Impl3832);
            rule__Declaration__VarNameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationAccess().getVarNameAssignment_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Type__Group__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1887:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1891:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1892:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__03866);
            rule__Type__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group__1_in_rule__Type__Group__03869);
            rule__Type__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1899:1: rule__Type__Group__0__Impl : ( ( rule__Type__NameAssignment_0 ) ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1903:1: ( ( ( rule__Type__NameAssignment_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1904:1: ( ( rule__Type__NameAssignment_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1904:1: ( ( rule__Type__NameAssignment_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1905:1: ( rule__Type__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getNameAssignment_0()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1906:1: ( rule__Type__NameAssignment_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1906:2: rule__Type__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Type__NameAssignment_0_in_rule__Type__Group__0__Impl3896);
            rule__Type__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getNameAssignment_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1916:1: rule__Type__Group__1 : rule__Type__Group__1__Impl ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1920:1: ( rule__Type__Group__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1921:2: rule__Type__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__13926);
            rule__Type__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1927:1: rule__Type__Group__1__Impl : ( ( rule__Type__Group_1__0 )? ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1931:1: ( ( ( rule__Type__Group_1__0 )? ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1932:1: ( ( rule__Type__Group_1__0 )? )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1932:1: ( ( rule__Type__Group_1__0 )? )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1933:1: ( rule__Type__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getGroup_1()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1934:1: ( rule__Type__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1934:2: rule__Type__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_1__0_in_rule__Type__Group__1__Impl3953);
                    rule__Type__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getGroup_1()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1948:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1952:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1953:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
            {
            pushFollow(FOLLOW_rule__Type__Group_1__0__Impl_in_rule__Type__Group_1__03988);
            rule__Type__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_1__1_in_rule__Type__Group_1__03991);
            rule__Type__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1960:1: rule__Type__Group_1__0__Impl : ( '<' ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1964:1: ( ( '<' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1965:1: ( '<' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1965:1: ( '<' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1966:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getLessThanSignKeyword_1_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__Type__Group_1__0__Impl4019); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getLessThanSignKeyword_1_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1979:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl rule__Type__Group_1__2 ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1983:1: ( rule__Type__Group_1__1__Impl rule__Type__Group_1__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1984:2: rule__Type__Group_1__1__Impl rule__Type__Group_1__2
            {
            pushFollow(FOLLOW_rule__Type__Group_1__1__Impl_in_rule__Type__Group_1__14050);
            rule__Type__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group_1__2_in_rule__Type__Group_1__14053);
            rule__Type__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1991:1: rule__Type__Group_1__1__Impl : ( ( rule__Type__TemplateTypeAssignment_1_1 ) ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1995:1: ( ( ( rule__Type__TemplateTypeAssignment_1_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1996:1: ( ( rule__Type__TemplateTypeAssignment_1_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1996:1: ( ( rule__Type__TemplateTypeAssignment_1_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1997:1: ( rule__Type__TemplateTypeAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getTemplateTypeAssignment_1_1()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1998:1: ( rule__Type__TemplateTypeAssignment_1_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:1998:2: rule__Type__TemplateTypeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Type__TemplateTypeAssignment_1_1_in_rule__Type__Group_1__1__Impl4080);
            rule__Type__TemplateTypeAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getTemplateTypeAssignment_1_1()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2008:1: rule__Type__Group_1__2 : rule__Type__Group_1__2__Impl ;
    public final void rule__Type__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2012:1: ( rule__Type__Group_1__2__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2013:2: rule__Type__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_1__2__Impl_in_rule__Type__Group_1__24110);
            rule__Type__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2019:1: rule__Type__Group_1__2__Impl : ( '>' ) ;
    public final void rule__Type__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2023:1: ( ( '>' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2024:1: ( '>' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2024:1: ( '>' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2025:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_1_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__Type__Group_1__2__Impl4138); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getGreaterThanSignKeyword_1_2()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2044:1: rule__ORing__Group__0 : rule__ORing__Group__0__Impl rule__ORing__Group__1 ;
    public final void rule__ORing__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2048:1: ( rule__ORing__Group__0__Impl rule__ORing__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2049:2: rule__ORing__Group__0__Impl rule__ORing__Group__1
            {
            pushFollow(FOLLOW_rule__ORing__Group__0__Impl_in_rule__ORing__Group__04175);
            rule__ORing__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ORing__Group__1_in_rule__ORing__Group__04178);
            rule__ORing__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2056:1: rule__ORing__Group__0__Impl : ( ruleANDing ) ;
    public final void rule__ORing__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2060:1: ( ( ruleANDing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2061:1: ( ruleANDing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2061:1: ( ruleANDing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2062:1: ruleANDing
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getORingAccess().getANDingParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleANDing_in_rule__ORing__Group__0__Impl4205);
            ruleANDing();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getORingAccess().getANDingParserRuleCall_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2073:1: rule__ORing__Group__1 : rule__ORing__Group__1__Impl ;
    public final void rule__ORing__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2077:1: ( rule__ORing__Group__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2078:2: rule__ORing__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ORing__Group__1__Impl_in_rule__ORing__Group__14234);
            rule__ORing__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2084:1: rule__ORing__Group__1__Impl : ( ( rule__ORing__Group_1__0 )* ) ;
    public final void rule__ORing__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2088:1: ( ( ( rule__ORing__Group_1__0 )* ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2089:1: ( ( rule__ORing__Group_1__0 )* )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2089:1: ( ( rule__ORing__Group_1__0 )* )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2090:1: ( rule__ORing__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getORingAccess().getGroup_1()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2091:1: ( rule__ORing__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==31) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2091:2: rule__ORing__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ORing__Group_1__0_in_rule__ORing__Group__1__Impl4261);
            	    rule__ORing__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getORingAccess().getGroup_1()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2105:1: rule__ORing__Group_1__0 : rule__ORing__Group_1__0__Impl rule__ORing__Group_1__1 ;
    public final void rule__ORing__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2109:1: ( rule__ORing__Group_1__0__Impl rule__ORing__Group_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2110:2: rule__ORing__Group_1__0__Impl rule__ORing__Group_1__1
            {
            pushFollow(FOLLOW_rule__ORing__Group_1__0__Impl_in_rule__ORing__Group_1__04296);
            rule__ORing__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ORing__Group_1__1_in_rule__ORing__Group_1__04299);
            rule__ORing__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2117:1: rule__ORing__Group_1__0__Impl : ( () ) ;
    public final void rule__ORing__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2121:1: ( ( () ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2122:1: ( () )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2122:1: ( () )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2123:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getORingAccess().getORingLeftAction_1_0()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2124:1: ()
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2126:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getORingAccess().getORingLeftAction_1_0()); 
            }

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2136:1: rule__ORing__Group_1__1 : rule__ORing__Group_1__1__Impl rule__ORing__Group_1__2 ;
    public final void rule__ORing__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2140:1: ( rule__ORing__Group_1__1__Impl rule__ORing__Group_1__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2141:2: rule__ORing__Group_1__1__Impl rule__ORing__Group_1__2
            {
            pushFollow(FOLLOW_rule__ORing__Group_1__1__Impl_in_rule__ORing__Group_1__14357);
            rule__ORing__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ORing__Group_1__2_in_rule__ORing__Group_1__14360);
            rule__ORing__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2148:1: rule__ORing__Group_1__1__Impl : ( '|' ) ;
    public final void rule__ORing__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2152:1: ( ( '|' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2153:1: ( '|' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2153:1: ( '|' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2154:1: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getORingAccess().getVerticalLineKeyword_1_1()); 
            }
            match(input,31,FOLLOW_31_in_rule__ORing__Group_1__1__Impl4388); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getORingAccess().getVerticalLineKeyword_1_1()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2167:1: rule__ORing__Group_1__2 : rule__ORing__Group_1__2__Impl ;
    public final void rule__ORing__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2171:1: ( rule__ORing__Group_1__2__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2172:2: rule__ORing__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ORing__Group_1__2__Impl_in_rule__ORing__Group_1__24419);
            rule__ORing__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2178:1: rule__ORing__Group_1__2__Impl : ( ( rule__ORing__RightAssignment_1_2 ) ) ;
    public final void rule__ORing__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2182:1: ( ( ( rule__ORing__RightAssignment_1_2 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2183:1: ( ( rule__ORing__RightAssignment_1_2 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2183:1: ( ( rule__ORing__RightAssignment_1_2 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2184:1: ( rule__ORing__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getORingAccess().getRightAssignment_1_2()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2185:1: ( rule__ORing__RightAssignment_1_2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2185:2: rule__ORing__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ORing__RightAssignment_1_2_in_rule__ORing__Group_1__2__Impl4446);
            rule__ORing__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getORingAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2201:1: rule__ANDing__Group__0 : rule__ANDing__Group__0__Impl rule__ANDing__Group__1 ;
    public final void rule__ANDing__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2205:1: ( rule__ANDing__Group__0__Impl rule__ANDing__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2206:2: rule__ANDing__Group__0__Impl rule__ANDing__Group__1
            {
            pushFollow(FOLLOW_rule__ANDing__Group__0__Impl_in_rule__ANDing__Group__04482);
            rule__ANDing__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ANDing__Group__1_in_rule__ANDing__Group__04485);
            rule__ANDing__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2213:1: rule__ANDing__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__ANDing__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2217:1: ( ( rulePrimary ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2218:1: ( rulePrimary )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2218:1: ( rulePrimary )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2219:1: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getANDingAccess().getPrimaryParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePrimary_in_rule__ANDing__Group__0__Impl4512);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getANDingAccess().getPrimaryParserRuleCall_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2230:1: rule__ANDing__Group__1 : rule__ANDing__Group__1__Impl ;
    public final void rule__ANDing__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2234:1: ( rule__ANDing__Group__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2235:2: rule__ANDing__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ANDing__Group__1__Impl_in_rule__ANDing__Group__14541);
            rule__ANDing__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2241:1: rule__ANDing__Group__1__Impl : ( ( rule__ANDing__Group_1__0 )* ) ;
    public final void rule__ANDing__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2245:1: ( ( ( rule__ANDing__Group_1__0 )* ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2246:1: ( ( rule__ANDing__Group_1__0 )* )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2246:1: ( ( rule__ANDing__Group_1__0 )* )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2247:1: ( rule__ANDing__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getANDingAccess().getGroup_1()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2248:1: ( rule__ANDing__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==32) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2248:2: rule__ANDing__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ANDing__Group_1__0_in_rule__ANDing__Group__1__Impl4568);
            	    rule__ANDing__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getANDingAccess().getGroup_1()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2262:1: rule__ANDing__Group_1__0 : rule__ANDing__Group_1__0__Impl rule__ANDing__Group_1__1 ;
    public final void rule__ANDing__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2266:1: ( rule__ANDing__Group_1__0__Impl rule__ANDing__Group_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2267:2: rule__ANDing__Group_1__0__Impl rule__ANDing__Group_1__1
            {
            pushFollow(FOLLOW_rule__ANDing__Group_1__0__Impl_in_rule__ANDing__Group_1__04603);
            rule__ANDing__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ANDing__Group_1__1_in_rule__ANDing__Group_1__04606);
            rule__ANDing__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2274:1: rule__ANDing__Group_1__0__Impl : ( () ) ;
    public final void rule__ANDing__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2278:1: ( ( () ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2279:1: ( () )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2279:1: ( () )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2280:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getANDingAccess().getANDingLeftAction_1_0()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2281:1: ()
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2283:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getANDingAccess().getANDingLeftAction_1_0()); 
            }

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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2293:1: rule__ANDing__Group_1__1 : rule__ANDing__Group_1__1__Impl rule__ANDing__Group_1__2 ;
    public final void rule__ANDing__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2297:1: ( rule__ANDing__Group_1__1__Impl rule__ANDing__Group_1__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2298:2: rule__ANDing__Group_1__1__Impl rule__ANDing__Group_1__2
            {
            pushFollow(FOLLOW_rule__ANDing__Group_1__1__Impl_in_rule__ANDing__Group_1__14664);
            rule__ANDing__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ANDing__Group_1__2_in_rule__ANDing__Group_1__14667);
            rule__ANDing__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2305:1: rule__ANDing__Group_1__1__Impl : ( '&' ) ;
    public final void rule__ANDing__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2309:1: ( ( '&' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2310:1: ( '&' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2310:1: ( '&' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2311:1: '&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getANDingAccess().getAmpersandKeyword_1_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__ANDing__Group_1__1__Impl4695); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getANDingAccess().getAmpersandKeyword_1_1()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2324:1: rule__ANDing__Group_1__2 : rule__ANDing__Group_1__2__Impl ;
    public final void rule__ANDing__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2328:1: ( rule__ANDing__Group_1__2__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2329:2: rule__ANDing__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ANDing__Group_1__2__Impl_in_rule__ANDing__Group_1__24726);
            rule__ANDing__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2335:1: rule__ANDing__Group_1__2__Impl : ( ( rule__ANDing__RightAssignment_1_2 ) ) ;
    public final void rule__ANDing__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2339:1: ( ( ( rule__ANDing__RightAssignment_1_2 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2340:1: ( ( rule__ANDing__RightAssignment_1_2 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2340:1: ( ( rule__ANDing__RightAssignment_1_2 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2341:1: ( rule__ANDing__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getANDingAccess().getRightAssignment_1_2()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2342:1: ( rule__ANDing__RightAssignment_1_2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2342:2: rule__ANDing__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ANDing__RightAssignment_1_2_in_rule__ANDing__Group_1__2__Impl4753);
            rule__ANDing__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getANDingAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Primary__Group_4__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2358:1: rule__Primary__Group_4__0 : rule__Primary__Group_4__0__Impl rule__Primary__Group_4__1 ;
    public final void rule__Primary__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2362:1: ( rule__Primary__Group_4__0__Impl rule__Primary__Group_4__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2363:2: rule__Primary__Group_4__0__Impl rule__Primary__Group_4__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_4__0__Impl_in_rule__Primary__Group_4__04789);
            rule__Primary__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Primary__Group_4__1_in_rule__Primary__Group_4__04792);
            rule__Primary__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__0"


    // $ANTLR start "rule__Primary__Group_4__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2370:1: rule__Primary__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2374:1: ( ( '(' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2375:1: ( '(' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2375:1: ( '(' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2376:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_4_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__Primary__Group_4__0__Impl4820); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__0__Impl"


    // $ANTLR start "rule__Primary__Group_4__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2389:1: rule__Primary__Group_4__1 : rule__Primary__Group_4__1__Impl rule__Primary__Group_4__2 ;
    public final void rule__Primary__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2393:1: ( rule__Primary__Group_4__1__Impl rule__Primary__Group_4__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2394:2: rule__Primary__Group_4__1__Impl rule__Primary__Group_4__2
            {
            pushFollow(FOLLOW_rule__Primary__Group_4__1__Impl_in_rule__Primary__Group_4__14851);
            rule__Primary__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Primary__Group_4__2_in_rule__Primary__Group_4__14854);
            rule__Primary__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__1"


    // $ANTLR start "rule__Primary__Group_4__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2401:1: rule__Primary__Group_4__1__Impl : ( ruleORing ) ;
    public final void rule__Primary__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2405:1: ( ( ruleORing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2406:1: ( ruleORing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2406:1: ( ruleORing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2407:1: ruleORing
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getORingParserRuleCall_4_1()); 
            }
            pushFollow(FOLLOW_ruleORing_in_rule__Primary__Group_4__1__Impl4881);
            ruleORing();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getORingParserRuleCall_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__1__Impl"


    // $ANTLR start "rule__Primary__Group_4__2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2418:1: rule__Primary__Group_4__2 : rule__Primary__Group_4__2__Impl ;
    public final void rule__Primary__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2422:1: ( rule__Primary__Group_4__2__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2423:2: rule__Primary__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_4__2__Impl_in_rule__Primary__Group_4__24910);
            rule__Primary__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__2"


    // $ANTLR start "rule__Primary__Group_4__2__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2429:1: rule__Primary__Group_4__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2433:1: ( ( ')' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2434:1: ( ')' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2434:1: ( ')' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2435:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_4_2()); 
            }
            match(input,34,FOLLOW_34_in_rule__Primary__Group_4__2__Impl4938); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__2__Impl"


    // $ANTLR start "rule__ProblemShell__Group__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2454:1: rule__ProblemShell__Group__0 : rule__ProblemShell__Group__0__Impl rule__ProblemShell__Group__1 ;
    public final void rule__ProblemShell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2458:1: ( rule__ProblemShell__Group__0__Impl rule__ProblemShell__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2459:2: rule__ProblemShell__Group__0__Impl rule__ProblemShell__Group__1
            {
            pushFollow(FOLLOW_rule__ProblemShell__Group__0__Impl_in_rule__ProblemShell__Group__04975);
            rule__ProblemShell__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ProblemShell__Group__1_in_rule__ProblemShell__Group__04978);
            rule__ProblemShell__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2466:1: rule__ProblemShell__Group__0__Impl : ( '{' ) ;
    public final void rule__ProblemShell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2470:1: ( ( '{' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2471:1: ( '{' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2471:1: ( '{' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2472:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProblemShellAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__ProblemShell__Group__0__Impl5006); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProblemShellAccess().getLeftCurlyBracketKeyword_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2485:1: rule__ProblemShell__Group__1 : rule__ProblemShell__Group__1__Impl rule__ProblemShell__Group__2 ;
    public final void rule__ProblemShell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2489:1: ( rule__ProblemShell__Group__1__Impl rule__ProblemShell__Group__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2490:2: rule__ProblemShell__Group__1__Impl rule__ProblemShell__Group__2
            {
            pushFollow(FOLLOW_rule__ProblemShell__Group__1__Impl_in_rule__ProblemShell__Group__15037);
            rule__ProblemShell__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ProblemShell__Group__2_in_rule__ProblemShell__Group__15040);
            rule__ProblemShell__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2497:1: rule__ProblemShell__Group__1__Impl : ( ( rule__ProblemShell__ProblemAssignment_1 ) ) ;
    public final void rule__ProblemShell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2501:1: ( ( ( rule__ProblemShell__ProblemAssignment_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2502:1: ( ( rule__ProblemShell__ProblemAssignment_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2502:1: ( ( rule__ProblemShell__ProblemAssignment_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2503:1: ( rule__ProblemShell__ProblemAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProblemShellAccess().getProblemAssignment_1()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2504:1: ( rule__ProblemShell__ProblemAssignment_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2504:2: rule__ProblemShell__ProblemAssignment_1
            {
            pushFollow(FOLLOW_rule__ProblemShell__ProblemAssignment_1_in_rule__ProblemShell__Group__1__Impl5067);
            rule__ProblemShell__ProblemAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProblemShellAccess().getProblemAssignment_1()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2514:1: rule__ProblemShell__Group__2 : rule__ProblemShell__Group__2__Impl ;
    public final void rule__ProblemShell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2518:1: ( rule__ProblemShell__Group__2__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2519:2: rule__ProblemShell__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ProblemShell__Group__2__Impl_in_rule__ProblemShell__Group__25097);
            rule__ProblemShell__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2525:1: rule__ProblemShell__Group__2__Impl : ( '}' ) ;
    public final void rule__ProblemShell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2529:1: ( ( '}' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2530:1: ( '}' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2530:1: ( '}' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2531:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProblemShellAccess().getRightCurlyBracketKeyword_2()); 
            }
            match(input,36,FOLLOW_36_in_rule__ProblemShell__Group__2__Impl5125); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProblemShellAccess().getRightCurlyBracketKeyword_2()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2550:1: rule__Negation__Group__0 : rule__Negation__Group__0__Impl rule__Negation__Group__1 ;
    public final void rule__Negation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2554:1: ( rule__Negation__Group__0__Impl rule__Negation__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2555:2: rule__Negation__Group__0__Impl rule__Negation__Group__1
            {
            pushFollow(FOLLOW_rule__Negation__Group__0__Impl_in_rule__Negation__Group__05162);
            rule__Negation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Negation__Group__1_in_rule__Negation__Group__05165);
            rule__Negation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2562:1: rule__Negation__Group__0__Impl : ( '!' ) ;
    public final void rule__Negation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2566:1: ( ( '!' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2567:1: ( '!' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2567:1: ( '!' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2568:1: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationAccess().getExclamationMarkKeyword_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__Negation__Group__0__Impl5193); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegationAccess().getExclamationMarkKeyword_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2581:1: rule__Negation__Group__1 : rule__Negation__Group__1__Impl ;
    public final void rule__Negation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2585:1: ( rule__Negation__Group__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2586:2: rule__Negation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Negation__Group__1__Impl_in_rule__Negation__Group__15224);
            rule__Negation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2592:1: rule__Negation__Group__1__Impl : ( ( rule__Negation__NegatedAssignment_1 ) ) ;
    public final void rule__Negation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2596:1: ( ( ( rule__Negation__NegatedAssignment_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2597:1: ( ( rule__Negation__NegatedAssignment_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2597:1: ( ( rule__Negation__NegatedAssignment_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2598:1: ( rule__Negation__NegatedAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationAccess().getNegatedAssignment_1()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2599:1: ( rule__Negation__NegatedAssignment_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2599:2: rule__Negation__NegatedAssignment_1
            {
            pushFollow(FOLLOW_rule__Negation__NegatedAssignment_1_in_rule__Negation__Group__1__Impl5251);
            rule__Negation__NegatedAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegationAccess().getNegatedAssignment_1()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2613:1: rule__Quantifier__Group__0 : rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1 ;
    public final void rule__Quantifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2617:1: ( rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2618:2: rule__Quantifier__Group__0__Impl rule__Quantifier__Group__1
            {
            pushFollow(FOLLOW_rule__Quantifier__Group__0__Impl_in_rule__Quantifier__Group__05285);
            rule__Quantifier__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Quantifier__Group__1_in_rule__Quantifier__Group__05288);
            rule__Quantifier__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2625:1: rule__Quantifier__Group__0__Impl : ( ( rule__Quantifier__QuantifierAssignment_0 ) ) ;
    public final void rule__Quantifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2629:1: ( ( ( rule__Quantifier__QuantifierAssignment_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2630:1: ( ( rule__Quantifier__QuantifierAssignment_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2630:1: ( ( rule__Quantifier__QuantifierAssignment_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2631:1: ( rule__Quantifier__QuantifierAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifierAccess().getQuantifierAssignment_0()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2632:1: ( rule__Quantifier__QuantifierAssignment_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2632:2: rule__Quantifier__QuantifierAssignment_0
            {
            pushFollow(FOLLOW_rule__Quantifier__QuantifierAssignment_0_in_rule__Quantifier__Group__0__Impl5315);
            rule__Quantifier__QuantifierAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifierAccess().getQuantifierAssignment_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2642:1: rule__Quantifier__Group__1 : rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2 ;
    public final void rule__Quantifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2646:1: ( rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2647:2: rule__Quantifier__Group__1__Impl rule__Quantifier__Group__2
            {
            pushFollow(FOLLOW_rule__Quantifier__Group__1__Impl_in_rule__Quantifier__Group__15345);
            rule__Quantifier__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Quantifier__Group__2_in_rule__Quantifier__Group__15348);
            rule__Quantifier__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2654:1: rule__Quantifier__Group__1__Impl : ( '(' ) ;
    public final void rule__Quantifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2658:1: ( ( '(' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2659:1: ( '(' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2659:1: ( '(' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2660:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifierAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__Quantifier__Group__1__Impl5376); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifierAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2673:1: rule__Quantifier__Group__2 : rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3 ;
    public final void rule__Quantifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2677:1: ( rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2678:2: rule__Quantifier__Group__2__Impl rule__Quantifier__Group__3
            {
            pushFollow(FOLLOW_rule__Quantifier__Group__2__Impl_in_rule__Quantifier__Group__25407);
            rule__Quantifier__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Quantifier__Group__3_in_rule__Quantifier__Group__25410);
            rule__Quantifier__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2685:1: rule__Quantifier__Group__2__Impl : ( ( rule__Quantifier__SubjectAssignment_2 ) ) ;
    public final void rule__Quantifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2689:1: ( ( ( rule__Quantifier__SubjectAssignment_2 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2690:1: ( ( rule__Quantifier__SubjectAssignment_2 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2690:1: ( ( rule__Quantifier__SubjectAssignment_2 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2691:1: ( rule__Quantifier__SubjectAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifierAccess().getSubjectAssignment_2()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2692:1: ( rule__Quantifier__SubjectAssignment_2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2692:2: rule__Quantifier__SubjectAssignment_2
            {
            pushFollow(FOLLOW_rule__Quantifier__SubjectAssignment_2_in_rule__Quantifier__Group__2__Impl5437);
            rule__Quantifier__SubjectAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifierAccess().getSubjectAssignment_2()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2702:1: rule__Quantifier__Group__3 : rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4 ;
    public final void rule__Quantifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2706:1: ( rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2707:2: rule__Quantifier__Group__3__Impl rule__Quantifier__Group__4
            {
            pushFollow(FOLLOW_rule__Quantifier__Group__3__Impl_in_rule__Quantifier__Group__35467);
            rule__Quantifier__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Quantifier__Group__4_in_rule__Quantifier__Group__35470);
            rule__Quantifier__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2714:1: rule__Quantifier__Group__3__Impl : ( ':' ) ;
    public final void rule__Quantifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2718:1: ( ( ':' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2719:1: ( ':' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2719:1: ( ':' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2720:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifierAccess().getColonKeyword_3()); 
            }
            match(input,38,FOLLOW_38_in_rule__Quantifier__Group__3__Impl5498); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifierAccess().getColonKeyword_3()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2733:1: rule__Quantifier__Group__4 : rule__Quantifier__Group__4__Impl rule__Quantifier__Group__5 ;
    public final void rule__Quantifier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2737:1: ( rule__Quantifier__Group__4__Impl rule__Quantifier__Group__5 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2738:2: rule__Quantifier__Group__4__Impl rule__Quantifier__Group__5
            {
            pushFollow(FOLLOW_rule__Quantifier__Group__4__Impl_in_rule__Quantifier__Group__45529);
            rule__Quantifier__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Quantifier__Group__5_in_rule__Quantifier__Group__45532);
            rule__Quantifier__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2745:1: rule__Quantifier__Group__4__Impl : ( ( rule__Quantifier__PredicateAssignment_4 ) ) ;
    public final void rule__Quantifier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2749:1: ( ( ( rule__Quantifier__PredicateAssignment_4 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2750:1: ( ( rule__Quantifier__PredicateAssignment_4 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2750:1: ( ( rule__Quantifier__PredicateAssignment_4 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2751:1: ( rule__Quantifier__PredicateAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifierAccess().getPredicateAssignment_4()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2752:1: ( rule__Quantifier__PredicateAssignment_4 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2752:2: rule__Quantifier__PredicateAssignment_4
            {
            pushFollow(FOLLOW_rule__Quantifier__PredicateAssignment_4_in_rule__Quantifier__Group__4__Impl5559);
            rule__Quantifier__PredicateAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifierAccess().getPredicateAssignment_4()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2762:1: rule__Quantifier__Group__5 : rule__Quantifier__Group__5__Impl ;
    public final void rule__Quantifier__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2766:1: ( rule__Quantifier__Group__5__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2767:2: rule__Quantifier__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Quantifier__Group__5__Impl_in_rule__Quantifier__Group__55589);
            rule__Quantifier__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2773:1: rule__Quantifier__Group__5__Impl : ( ')' ) ;
    public final void rule__Quantifier__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2777:1: ( ( ')' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2778:1: ( ')' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2778:1: ( ')' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2779:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifierAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,34,FOLLOW_34_in_rule__Quantifier__Group__5__Impl5617); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifierAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__SugarAtomic__Group__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2804:1: rule__SugarAtomic__Group__0 : rule__SugarAtomic__Group__0__Impl rule__SugarAtomic__Group__1 ;
    public final void rule__SugarAtomic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2808:1: ( rule__SugarAtomic__Group__0__Impl rule__SugarAtomic__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2809:2: rule__SugarAtomic__Group__0__Impl rule__SugarAtomic__Group__1
            {
            pushFollow(FOLLOW_rule__SugarAtomic__Group__0__Impl_in_rule__SugarAtomic__Group__05660);
            rule__SugarAtomic__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SugarAtomic__Group__1_in_rule__SugarAtomic__Group__05663);
            rule__SugarAtomic__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarAtomic__Group__0"


    // $ANTLR start "rule__SugarAtomic__Group__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2816:1: rule__SugarAtomic__Group__0__Impl : ( ( rule__SugarAtomic__FunctionAssignment_0 ) ) ;
    public final void rule__SugarAtomic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2820:1: ( ( ( rule__SugarAtomic__FunctionAssignment_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2821:1: ( ( rule__SugarAtomic__FunctionAssignment_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2821:1: ( ( rule__SugarAtomic__FunctionAssignment_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2822:1: ( rule__SugarAtomic__FunctionAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarAtomicAccess().getFunctionAssignment_0()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2823:1: ( rule__SugarAtomic__FunctionAssignment_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2823:2: rule__SugarAtomic__FunctionAssignment_0
            {
            pushFollow(FOLLOW_rule__SugarAtomic__FunctionAssignment_0_in_rule__SugarAtomic__Group__0__Impl5690);
            rule__SugarAtomic__FunctionAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarAtomicAccess().getFunctionAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarAtomic__Group__0__Impl"


    // $ANTLR start "rule__SugarAtomic__Group__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2833:1: rule__SugarAtomic__Group__1 : rule__SugarAtomic__Group__1__Impl rule__SugarAtomic__Group__2 ;
    public final void rule__SugarAtomic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2837:1: ( rule__SugarAtomic__Group__1__Impl rule__SugarAtomic__Group__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2838:2: rule__SugarAtomic__Group__1__Impl rule__SugarAtomic__Group__2
            {
            pushFollow(FOLLOW_rule__SugarAtomic__Group__1__Impl_in_rule__SugarAtomic__Group__15720);
            rule__SugarAtomic__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SugarAtomic__Group__2_in_rule__SugarAtomic__Group__15723);
            rule__SugarAtomic__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarAtomic__Group__1"


    // $ANTLR start "rule__SugarAtomic__Group__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2845:1: rule__SugarAtomic__Group__1__Impl : ( '(' ) ;
    public final void rule__SugarAtomic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2849:1: ( ( '(' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2850:1: ( '(' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2850:1: ( '(' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2851:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarAtomicAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__SugarAtomic__Group__1__Impl5751); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarAtomicAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarAtomic__Group__1__Impl"


    // $ANTLR start "rule__SugarAtomic__Group__2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2864:1: rule__SugarAtomic__Group__2 : rule__SugarAtomic__Group__2__Impl rule__SugarAtomic__Group__3 ;
    public final void rule__SugarAtomic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2868:1: ( rule__SugarAtomic__Group__2__Impl rule__SugarAtomic__Group__3 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2869:2: rule__SugarAtomic__Group__2__Impl rule__SugarAtomic__Group__3
            {
            pushFollow(FOLLOW_rule__SugarAtomic__Group__2__Impl_in_rule__SugarAtomic__Group__25782);
            rule__SugarAtomic__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SugarAtomic__Group__3_in_rule__SugarAtomic__Group__25785);
            rule__SugarAtomic__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarAtomic__Group__2"


    // $ANTLR start "rule__SugarAtomic__Group__2__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2876:1: rule__SugarAtomic__Group__2__Impl : ( ( rule__SugarAtomic__Group_2__0 )? ) ;
    public final void rule__SugarAtomic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2880:1: ( ( ( rule__SugarAtomic__Group_2__0 )? ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2881:1: ( ( rule__SugarAtomic__Group_2__0 )? )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2881:1: ( ( rule__SugarAtomic__Group_2__0 )? )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2882:1: ( rule__SugarAtomic__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarAtomicAccess().getGroup_2()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2883:1: ( rule__SugarAtomic__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_INT)||LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2883:2: rule__SugarAtomic__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SugarAtomic__Group_2__0_in_rule__SugarAtomic__Group__2__Impl5812);
                    rule__SugarAtomic__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarAtomicAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarAtomic__Group__2__Impl"


    // $ANTLR start "rule__SugarAtomic__Group__3"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2893:1: rule__SugarAtomic__Group__3 : rule__SugarAtomic__Group__3__Impl ;
    public final void rule__SugarAtomic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2897:1: ( rule__SugarAtomic__Group__3__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2898:2: rule__SugarAtomic__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SugarAtomic__Group__3__Impl_in_rule__SugarAtomic__Group__35843);
            rule__SugarAtomic__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarAtomic__Group__3"


    // $ANTLR start "rule__SugarAtomic__Group__3__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2904:1: rule__SugarAtomic__Group__3__Impl : ( ')' ) ;
    public final void rule__SugarAtomic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2908:1: ( ( ')' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2909:1: ( ')' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2909:1: ( ')' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2910:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarAtomicAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,34,FOLLOW_34_in_rule__SugarAtomic__Group__3__Impl5871); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarAtomicAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarAtomic__Group__3__Impl"


    // $ANTLR start "rule__SugarAtomic__Group_2__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2931:1: rule__SugarAtomic__Group_2__0 : rule__SugarAtomic__Group_2__0__Impl rule__SugarAtomic__Group_2__1 ;
    public final void rule__SugarAtomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2935:1: ( rule__SugarAtomic__Group_2__0__Impl rule__SugarAtomic__Group_2__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2936:2: rule__SugarAtomic__Group_2__0__Impl rule__SugarAtomic__Group_2__1
            {
            pushFollow(FOLLOW_rule__SugarAtomic__Group_2__0__Impl_in_rule__SugarAtomic__Group_2__05910);
            rule__SugarAtomic__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SugarAtomic__Group_2__1_in_rule__SugarAtomic__Group_2__05913);
            rule__SugarAtomic__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarAtomic__Group_2__0"


    // $ANTLR start "rule__SugarAtomic__Group_2__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2943:1: rule__SugarAtomic__Group_2__0__Impl : ( ( rule__SugarAtomic__ArgsAssignment_2_0 ) ) ;
    public final void rule__SugarAtomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2947:1: ( ( ( rule__SugarAtomic__ArgsAssignment_2_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2948:1: ( ( rule__SugarAtomic__ArgsAssignment_2_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2948:1: ( ( rule__SugarAtomic__ArgsAssignment_2_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2949:1: ( rule__SugarAtomic__ArgsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarAtomicAccess().getArgsAssignment_2_0()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2950:1: ( rule__SugarAtomic__ArgsAssignment_2_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2950:2: rule__SugarAtomic__ArgsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__SugarAtomic__ArgsAssignment_2_0_in_rule__SugarAtomic__Group_2__0__Impl5940);
            rule__SugarAtomic__ArgsAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarAtomicAccess().getArgsAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarAtomic__Group_2__0__Impl"


    // $ANTLR start "rule__SugarAtomic__Group_2__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2960:1: rule__SugarAtomic__Group_2__1 : rule__SugarAtomic__Group_2__1__Impl ;
    public final void rule__SugarAtomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2964:1: ( rule__SugarAtomic__Group_2__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2965:2: rule__SugarAtomic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SugarAtomic__Group_2__1__Impl_in_rule__SugarAtomic__Group_2__15970);
            rule__SugarAtomic__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarAtomic__Group_2__1"


    // $ANTLR start "rule__SugarAtomic__Group_2__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2971:1: rule__SugarAtomic__Group_2__1__Impl : ( ( rule__SugarAtomic__Group_2_1__0 )* ) ;
    public final void rule__SugarAtomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2975:1: ( ( ( rule__SugarAtomic__Group_2_1__0 )* ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2976:1: ( ( rule__SugarAtomic__Group_2_1__0 )* )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2976:1: ( ( rule__SugarAtomic__Group_2_1__0 )* )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2977:1: ( rule__SugarAtomic__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarAtomicAccess().getGroup_2_1()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2978:1: ( rule__SugarAtomic__Group_2_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==27) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2978:2: rule__SugarAtomic__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SugarAtomic__Group_2_1__0_in_rule__SugarAtomic__Group_2__1__Impl5997);
            	    rule__SugarAtomic__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarAtomicAccess().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarAtomic__Group_2__1__Impl"


    // $ANTLR start "rule__SugarAtomic__Group_2_1__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2992:1: rule__SugarAtomic__Group_2_1__0 : rule__SugarAtomic__Group_2_1__0__Impl rule__SugarAtomic__Group_2_1__1 ;
    public final void rule__SugarAtomic__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2996:1: ( rule__SugarAtomic__Group_2_1__0__Impl rule__SugarAtomic__Group_2_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:2997:2: rule__SugarAtomic__Group_2_1__0__Impl rule__SugarAtomic__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__SugarAtomic__Group_2_1__0__Impl_in_rule__SugarAtomic__Group_2_1__06032);
            rule__SugarAtomic__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SugarAtomic__Group_2_1__1_in_rule__SugarAtomic__Group_2_1__06035);
            rule__SugarAtomic__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarAtomic__Group_2_1__0"


    // $ANTLR start "rule__SugarAtomic__Group_2_1__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3004:1: rule__SugarAtomic__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__SugarAtomic__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3008:1: ( ( ',' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3009:1: ( ',' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3009:1: ( ',' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3010:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarAtomicAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__SugarAtomic__Group_2_1__0__Impl6063); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarAtomicAccess().getCommaKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarAtomic__Group_2_1__0__Impl"


    // $ANTLR start "rule__SugarAtomic__Group_2_1__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3023:1: rule__SugarAtomic__Group_2_1__1 : rule__SugarAtomic__Group_2_1__1__Impl ;
    public final void rule__SugarAtomic__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3027:1: ( rule__SugarAtomic__Group_2_1__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3028:2: rule__SugarAtomic__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SugarAtomic__Group_2_1__1__Impl_in_rule__SugarAtomic__Group_2_1__16094);
            rule__SugarAtomic__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarAtomic__Group_2_1__1"


    // $ANTLR start "rule__SugarAtomic__Group_2_1__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3034:1: rule__SugarAtomic__Group_2_1__1__Impl : ( ( rule__SugarAtomic__ArgsAssignment_2_1_1 ) ) ;
    public final void rule__SugarAtomic__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3038:1: ( ( ( rule__SugarAtomic__ArgsAssignment_2_1_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3039:1: ( ( rule__SugarAtomic__ArgsAssignment_2_1_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3039:1: ( ( rule__SugarAtomic__ArgsAssignment_2_1_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3040:1: ( rule__SugarAtomic__ArgsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarAtomicAccess().getArgsAssignment_2_1_1()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3041:1: ( rule__SugarAtomic__ArgsAssignment_2_1_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3041:2: rule__SugarAtomic__ArgsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__SugarAtomic__ArgsAssignment_2_1_1_in_rule__SugarAtomic__Group_2_1__1__Impl6121);
            rule__SugarAtomic__ArgsAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarAtomicAccess().getArgsAssignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarAtomic__Group_2_1__1__Impl"


    // $ANTLR start "rule__Atomic__Group__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3055:1: rule__Atomic__Group__0 : rule__Atomic__Group__0__Impl rule__Atomic__Group__1 ;
    public final void rule__Atomic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3059:1: ( rule__Atomic__Group__0__Impl rule__Atomic__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3060:2: rule__Atomic__Group__0__Impl rule__Atomic__Group__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group__0__Impl_in_rule__Atomic__Group__06155);
            rule__Atomic__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Atomic__Group__1_in_rule__Atomic__Group__06158);
            rule__Atomic__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3067:1: rule__Atomic__Group__0__Impl : ( ( rule__Atomic__FunctionAssignment_0 ) ) ;
    public final void rule__Atomic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3071:1: ( ( ( rule__Atomic__FunctionAssignment_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3072:1: ( ( rule__Atomic__FunctionAssignment_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3072:1: ( ( rule__Atomic__FunctionAssignment_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3073:1: ( rule__Atomic__FunctionAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getFunctionAssignment_0()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3074:1: ( rule__Atomic__FunctionAssignment_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3074:2: rule__Atomic__FunctionAssignment_0
            {
            pushFollow(FOLLOW_rule__Atomic__FunctionAssignment_0_in_rule__Atomic__Group__0__Impl6185);
            rule__Atomic__FunctionAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getFunctionAssignment_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3084:1: rule__Atomic__Group__1 : rule__Atomic__Group__1__Impl rule__Atomic__Group__2 ;
    public final void rule__Atomic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3088:1: ( rule__Atomic__Group__1__Impl rule__Atomic__Group__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3089:2: rule__Atomic__Group__1__Impl rule__Atomic__Group__2
            {
            pushFollow(FOLLOW_rule__Atomic__Group__1__Impl_in_rule__Atomic__Group__16215);
            rule__Atomic__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Atomic__Group__2_in_rule__Atomic__Group__16218);
            rule__Atomic__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3096:1: rule__Atomic__Group__1__Impl : ( '(' ) ;
    public final void rule__Atomic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3100:1: ( ( '(' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3101:1: ( '(' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3101:1: ( '(' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3102:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__Atomic__Group__1__Impl6246); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3115:1: rule__Atomic__Group__2 : rule__Atomic__Group__2__Impl rule__Atomic__Group__3 ;
    public final void rule__Atomic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3119:1: ( rule__Atomic__Group__2__Impl rule__Atomic__Group__3 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3120:2: rule__Atomic__Group__2__Impl rule__Atomic__Group__3
            {
            pushFollow(FOLLOW_rule__Atomic__Group__2__Impl_in_rule__Atomic__Group__26277);
            rule__Atomic__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Atomic__Group__3_in_rule__Atomic__Group__26280);
            rule__Atomic__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3127:1: rule__Atomic__Group__2__Impl : ( ( rule__Atomic__Group_2__0 )? ) ;
    public final void rule__Atomic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3131:1: ( ( ( rule__Atomic__Group_2__0 )? ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3132:1: ( ( rule__Atomic__Group_2__0 )? )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3132:1: ( ( rule__Atomic__Group_2__0 )? )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3133:1: ( rule__Atomic__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getGroup_2()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3134:1: ( rule__Atomic__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3134:2: rule__Atomic__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_2__0_in_rule__Atomic__Group__2__Impl6307);
                    rule__Atomic__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getGroup_2()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3144:1: rule__Atomic__Group__3 : rule__Atomic__Group__3__Impl ;
    public final void rule__Atomic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3148:1: ( rule__Atomic__Group__3__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3149:2: rule__Atomic__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group__3__Impl_in_rule__Atomic__Group__36338);
            rule__Atomic__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3155:1: rule__Atomic__Group__3__Impl : ( ')' ) ;
    public final void rule__Atomic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3159:1: ( ( ')' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3160:1: ( ')' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3160:1: ( ')' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3161:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,34,FOLLOW_34_in_rule__Atomic__Group__3__Impl6366); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3182:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3186:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3187:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__06405);
            rule__Atomic__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__06408);
            rule__Atomic__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3194:1: rule__Atomic__Group_2__0__Impl : ( ( rule__Atomic__ArgsAssignment_2_0 ) ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3198:1: ( ( ( rule__Atomic__ArgsAssignment_2_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3199:1: ( ( rule__Atomic__ArgsAssignment_2_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3199:1: ( ( rule__Atomic__ArgsAssignment_2_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3200:1: ( rule__Atomic__ArgsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getArgsAssignment_2_0()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3201:1: ( rule__Atomic__ArgsAssignment_2_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3201:2: rule__Atomic__ArgsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Atomic__ArgsAssignment_2_0_in_rule__Atomic__Group_2__0__Impl6435);
            rule__Atomic__ArgsAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getArgsAssignment_2_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3211:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3215:1: ( rule__Atomic__Group_2__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3216:2: rule__Atomic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__16465);
            rule__Atomic__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3222:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__Group_2_1__0 )* ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3226:1: ( ( ( rule__Atomic__Group_2_1__0 )* ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3227:1: ( ( rule__Atomic__Group_2_1__0 )* )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3227:1: ( ( rule__Atomic__Group_2_1__0 )* )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3228:1: ( rule__Atomic__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getGroup_2_1()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3229:1: ( rule__Atomic__Group_2_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==27) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3229:2: rule__Atomic__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Atomic__Group_2_1__0_in_rule__Atomic__Group_2__1__Impl6492);
            	    rule__Atomic__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getGroup_2_1()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3243:1: rule__Atomic__Group_2_1__0 : rule__Atomic__Group_2_1__0__Impl rule__Atomic__Group_2_1__1 ;
    public final void rule__Atomic__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3247:1: ( rule__Atomic__Group_2_1__0__Impl rule__Atomic__Group_2_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3248:2: rule__Atomic__Group_2_1__0__Impl rule__Atomic__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2_1__0__Impl_in_rule__Atomic__Group_2_1__06527);
            rule__Atomic__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Atomic__Group_2_1__1_in_rule__Atomic__Group_2_1__06530);
            rule__Atomic__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3255:1: rule__Atomic__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Atomic__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3259:1: ( ( ',' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3260:1: ( ',' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3260:1: ( ',' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3261:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Atomic__Group_2_1__0__Impl6558); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getCommaKeyword_2_1_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3274:1: rule__Atomic__Group_2_1__1 : rule__Atomic__Group_2_1__1__Impl ;
    public final void rule__Atomic__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3278:1: ( rule__Atomic__Group_2_1__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3279:2: rule__Atomic__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2_1__1__Impl_in_rule__Atomic__Group_2_1__16589);
            rule__Atomic__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3285:1: rule__Atomic__Group_2_1__1__Impl : ( ( rule__Atomic__ArgsAssignment_2_1_1 ) ) ;
    public final void rule__Atomic__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3289:1: ( ( ( rule__Atomic__ArgsAssignment_2_1_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3290:1: ( ( rule__Atomic__ArgsAssignment_2_1_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3290:1: ( ( rule__Atomic__ArgsAssignment_2_1_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3291:1: ( rule__Atomic__ArgsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getArgsAssignment_2_1_1()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3292:1: ( rule__Atomic__ArgsAssignment_2_1_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3292:2: rule__Atomic__ArgsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Atomic__ArgsAssignment_2_1_1_in_rule__Atomic__Group_2_1__1__Impl6616);
            rule__Atomic__ArgsAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getArgsAssignment_2_1_1()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3306:1: rule__Theorem__Group__0 : rule__Theorem__Group__0__Impl rule__Theorem__Group__1 ;
    public final void rule__Theorem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3310:1: ( rule__Theorem__Group__0__Impl rule__Theorem__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3311:2: rule__Theorem__Group__0__Impl rule__Theorem__Group__1
            {
            pushFollow(FOLLOW_rule__Theorem__Group__0__Impl_in_rule__Theorem__Group__06650);
            rule__Theorem__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Theorem__Group__1_in_rule__Theorem__Group__06653);
            rule__Theorem__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3318:1: rule__Theorem__Group__0__Impl : ( ( rule__Theorem__RequirementAssignment_0 ) ) ;
    public final void rule__Theorem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3322:1: ( ( ( rule__Theorem__RequirementAssignment_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3323:1: ( ( rule__Theorem__RequirementAssignment_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3323:1: ( ( rule__Theorem__RequirementAssignment_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3324:1: ( rule__Theorem__RequirementAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheoremAccess().getRequirementAssignment_0()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3325:1: ( rule__Theorem__RequirementAssignment_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3325:2: rule__Theorem__RequirementAssignment_0
            {
            pushFollow(FOLLOW_rule__Theorem__RequirementAssignment_0_in_rule__Theorem__Group__0__Impl6680);
            rule__Theorem__RequirementAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheoremAccess().getRequirementAssignment_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3335:1: rule__Theorem__Group__1 : rule__Theorem__Group__1__Impl rule__Theorem__Group__2 ;
    public final void rule__Theorem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3339:1: ( rule__Theorem__Group__1__Impl rule__Theorem__Group__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3340:2: rule__Theorem__Group__1__Impl rule__Theorem__Group__2
            {
            pushFollow(FOLLOW_rule__Theorem__Group__1__Impl_in_rule__Theorem__Group__16710);
            rule__Theorem__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Theorem__Group__2_in_rule__Theorem__Group__16713);
            rule__Theorem__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3347:1: rule__Theorem__Group__1__Impl : ( ( rule__Theorem__ImplicationAssignment_1 ) ) ;
    public final void rule__Theorem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3351:1: ( ( ( rule__Theorem__ImplicationAssignment_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3352:1: ( ( rule__Theorem__ImplicationAssignment_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3352:1: ( ( rule__Theorem__ImplicationAssignment_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3353:1: ( rule__Theorem__ImplicationAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheoremAccess().getImplicationAssignment_1()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3354:1: ( rule__Theorem__ImplicationAssignment_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3354:2: rule__Theorem__ImplicationAssignment_1
            {
            pushFollow(FOLLOW_rule__Theorem__ImplicationAssignment_1_in_rule__Theorem__Group__1__Impl6740);
            rule__Theorem__ImplicationAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheoremAccess().getImplicationAssignment_1()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3364:1: rule__Theorem__Group__2 : rule__Theorem__Group__2__Impl rule__Theorem__Group__3 ;
    public final void rule__Theorem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3368:1: ( rule__Theorem__Group__2__Impl rule__Theorem__Group__3 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3369:2: rule__Theorem__Group__2__Impl rule__Theorem__Group__3
            {
            pushFollow(FOLLOW_rule__Theorem__Group__2__Impl_in_rule__Theorem__Group__26770);
            rule__Theorem__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Theorem__Group__3_in_rule__Theorem__Group__26773);
            rule__Theorem__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3376:1: rule__Theorem__Group__2__Impl : ( ( rule__Theorem__ResultAssignment_2 ) ) ;
    public final void rule__Theorem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3380:1: ( ( ( rule__Theorem__ResultAssignment_2 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3381:1: ( ( rule__Theorem__ResultAssignment_2 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3381:1: ( ( rule__Theorem__ResultAssignment_2 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3382:1: ( rule__Theorem__ResultAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheoremAccess().getResultAssignment_2()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3383:1: ( rule__Theorem__ResultAssignment_2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3383:2: rule__Theorem__ResultAssignment_2
            {
            pushFollow(FOLLOW_rule__Theorem__ResultAssignment_2_in_rule__Theorem__Group__2__Impl6800);
            rule__Theorem__ResultAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheoremAccess().getResultAssignment_2()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3393:1: rule__Theorem__Group__3 : rule__Theorem__Group__3__Impl rule__Theorem__Group__4 ;
    public final void rule__Theorem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3397:1: ( rule__Theorem__Group__3__Impl rule__Theorem__Group__4 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3398:2: rule__Theorem__Group__3__Impl rule__Theorem__Group__4
            {
            pushFollow(FOLLOW_rule__Theorem__Group__3__Impl_in_rule__Theorem__Group__36830);
            rule__Theorem__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Theorem__Group__4_in_rule__Theorem__Group__36833);
            rule__Theorem__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3405:1: rule__Theorem__Group__3__Impl : ( ',' ) ;
    public final void rule__Theorem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3409:1: ( ( ',' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3410:1: ( ',' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3410:1: ( ',' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3411:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheoremAccess().getCommaKeyword_3()); 
            }
            match(input,27,FOLLOW_27_in_rule__Theorem__Group__3__Impl6861); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheoremAccess().getCommaKeyword_3()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3424:1: rule__Theorem__Group__4 : rule__Theorem__Group__4__Impl rule__Theorem__Group__5 ;
    public final void rule__Theorem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3428:1: ( rule__Theorem__Group__4__Impl rule__Theorem__Group__5 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3429:2: rule__Theorem__Group__4__Impl rule__Theorem__Group__5
            {
            pushFollow(FOLLOW_rule__Theorem__Group__4__Impl_in_rule__Theorem__Group__46892);
            rule__Theorem__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Theorem__Group__5_in_rule__Theorem__Group__46895);
            rule__Theorem__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3436:1: rule__Theorem__Group__4__Impl : ( ( rule__Theorem__CostAssignment_4 ) ) ;
    public final void rule__Theorem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3440:1: ( ( ( rule__Theorem__CostAssignment_4 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3441:1: ( ( rule__Theorem__CostAssignment_4 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3441:1: ( ( rule__Theorem__CostAssignment_4 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3442:1: ( rule__Theorem__CostAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheoremAccess().getCostAssignment_4()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3443:1: ( rule__Theorem__CostAssignment_4 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3443:2: rule__Theorem__CostAssignment_4
            {
            pushFollow(FOLLOW_rule__Theorem__CostAssignment_4_in_rule__Theorem__Group__4__Impl6922);
            rule__Theorem__CostAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheoremAccess().getCostAssignment_4()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3453:1: rule__Theorem__Group__5 : rule__Theorem__Group__5__Impl rule__Theorem__Group__6 ;
    public final void rule__Theorem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3457:1: ( rule__Theorem__Group__5__Impl rule__Theorem__Group__6 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3458:2: rule__Theorem__Group__5__Impl rule__Theorem__Group__6
            {
            pushFollow(FOLLOW_rule__Theorem__Group__5__Impl_in_rule__Theorem__Group__56952);
            rule__Theorem__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Theorem__Group__6_in_rule__Theorem__Group__56955);
            rule__Theorem__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3465:1: rule__Theorem__Group__5__Impl : ( ',' ) ;
    public final void rule__Theorem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3469:1: ( ( ',' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3470:1: ( ',' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3470:1: ( ',' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3471:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheoremAccess().getCommaKeyword_5()); 
            }
            match(input,27,FOLLOW_27_in_rule__Theorem__Group__5__Impl6983); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheoremAccess().getCommaKeyword_5()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3484:1: rule__Theorem__Group__6 : rule__Theorem__Group__6__Impl rule__Theorem__Group__7 ;
    public final void rule__Theorem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3488:1: ( rule__Theorem__Group__6__Impl rule__Theorem__Group__7 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3489:2: rule__Theorem__Group__6__Impl rule__Theorem__Group__7
            {
            pushFollow(FOLLOW_rule__Theorem__Group__6__Impl_in_rule__Theorem__Group__67014);
            rule__Theorem__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Theorem__Group__7_in_rule__Theorem__Group__67017);
            rule__Theorem__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3496:1: rule__Theorem__Group__6__Impl : ( ( rule__Theorem__DescriptionAssignment_6 ) ) ;
    public final void rule__Theorem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3500:1: ( ( ( rule__Theorem__DescriptionAssignment_6 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3501:1: ( ( rule__Theorem__DescriptionAssignment_6 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3501:1: ( ( rule__Theorem__DescriptionAssignment_6 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3502:1: ( rule__Theorem__DescriptionAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheoremAccess().getDescriptionAssignment_6()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3503:1: ( rule__Theorem__DescriptionAssignment_6 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3503:2: rule__Theorem__DescriptionAssignment_6
            {
            pushFollow(FOLLOW_rule__Theorem__DescriptionAssignment_6_in_rule__Theorem__Group__6__Impl7044);
            rule__Theorem__DescriptionAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheoremAccess().getDescriptionAssignment_6()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3513:1: rule__Theorem__Group__7 : rule__Theorem__Group__7__Impl ;
    public final void rule__Theorem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3517:1: ( rule__Theorem__Group__7__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3518:2: rule__Theorem__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Theorem__Group__7__Impl_in_rule__Theorem__Group__77074);
            rule__Theorem__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3524:1: rule__Theorem__Group__7__Impl : ( ( rule__Theorem__Group_7__0 )? ) ;
    public final void rule__Theorem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3528:1: ( ( ( rule__Theorem__Group_7__0 )? ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3529:1: ( ( rule__Theorem__Group_7__0 )? )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3529:1: ( ( rule__Theorem__Group_7__0 )? )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3530:1: ( rule__Theorem__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheoremAccess().getGroup_7()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3531:1: ( rule__Theorem__Group_7__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==27) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3531:2: rule__Theorem__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Theorem__Group_7__0_in_rule__Theorem__Group__7__Impl7101);
                    rule__Theorem__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheoremAccess().getGroup_7()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3557:1: rule__Theorem__Group_7__0 : rule__Theorem__Group_7__0__Impl rule__Theorem__Group_7__1 ;
    public final void rule__Theorem__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3561:1: ( rule__Theorem__Group_7__0__Impl rule__Theorem__Group_7__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3562:2: rule__Theorem__Group_7__0__Impl rule__Theorem__Group_7__1
            {
            pushFollow(FOLLOW_rule__Theorem__Group_7__0__Impl_in_rule__Theorem__Group_7__07148);
            rule__Theorem__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Theorem__Group_7__1_in_rule__Theorem__Group_7__07151);
            rule__Theorem__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3569:1: rule__Theorem__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Theorem__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3573:1: ( ( ',' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3574:1: ( ',' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3574:1: ( ',' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3575:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheoremAccess().getCommaKeyword_7_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Theorem__Group_7__0__Impl7179); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheoremAccess().getCommaKeyword_7_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3588:1: rule__Theorem__Group_7__1 : rule__Theorem__Group_7__1__Impl ;
    public final void rule__Theorem__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3592:1: ( rule__Theorem__Group_7__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3593:2: rule__Theorem__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Theorem__Group_7__1__Impl_in_rule__Theorem__Group_7__17210);
            rule__Theorem__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3599:1: rule__Theorem__Group_7__1__Impl : ( ( rule__Theorem__PseudoCodeAssignment_7_1 ) ) ;
    public final void rule__Theorem__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3603:1: ( ( ( rule__Theorem__PseudoCodeAssignment_7_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3604:1: ( ( rule__Theorem__PseudoCodeAssignment_7_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3604:1: ( ( rule__Theorem__PseudoCodeAssignment_7_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3605:1: ( rule__Theorem__PseudoCodeAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheoremAccess().getPseudoCodeAssignment_7_1()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3606:1: ( rule__Theorem__PseudoCodeAssignment_7_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3606:2: rule__Theorem__PseudoCodeAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Theorem__PseudoCodeAssignment_7_1_in_rule__Theorem__Group_7__1__Impl7237);
            rule__Theorem__PseudoCodeAssignment_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheoremAccess().getPseudoCodeAssignment_7_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__SugarAddition__Group__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3620:1: rule__SugarAddition__Group__0 : rule__SugarAddition__Group__0__Impl rule__SugarAddition__Group__1 ;
    public final void rule__SugarAddition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3624:1: ( rule__SugarAddition__Group__0__Impl rule__SugarAddition__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3625:2: rule__SugarAddition__Group__0__Impl rule__SugarAddition__Group__1
            {
            pushFollow(FOLLOW_rule__SugarAddition__Group__0__Impl_in_rule__SugarAddition__Group__07271);
            rule__SugarAddition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SugarAddition__Group__1_in_rule__SugarAddition__Group__07274);
            rule__SugarAddition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarAddition__Group__0"


    // $ANTLR start "rule__SugarAddition__Group__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3632:1: rule__SugarAddition__Group__0__Impl : ( ruleSugarMultiplication ) ;
    public final void rule__SugarAddition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3636:1: ( ( ruleSugarMultiplication ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3637:1: ( ruleSugarMultiplication )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3637:1: ( ruleSugarMultiplication )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3638:1: ruleSugarMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarAdditionAccess().getSugarMultiplicationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleSugarMultiplication_in_rule__SugarAddition__Group__0__Impl7301);
            ruleSugarMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarAdditionAccess().getSugarMultiplicationParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarAddition__Group__0__Impl"


    // $ANTLR start "rule__SugarAddition__Group__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3649:1: rule__SugarAddition__Group__1 : rule__SugarAddition__Group__1__Impl ;
    public final void rule__SugarAddition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3653:1: ( rule__SugarAddition__Group__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3654:2: rule__SugarAddition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SugarAddition__Group__1__Impl_in_rule__SugarAddition__Group__17330);
            rule__SugarAddition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarAddition__Group__1"


    // $ANTLR start "rule__SugarAddition__Group__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3660:1: rule__SugarAddition__Group__1__Impl : ( ( rule__SugarAddition__Group_1__0 )* ) ;
    public final void rule__SugarAddition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3664:1: ( ( ( rule__SugarAddition__Group_1__0 )* ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3665:1: ( ( rule__SugarAddition__Group_1__0 )* )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3665:1: ( ( rule__SugarAddition__Group_1__0 )* )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3666:1: ( rule__SugarAddition__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarAdditionAccess().getGroup_1()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3667:1: ( rule__SugarAddition__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=20 && LA27_0<=21)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3667:2: rule__SugarAddition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SugarAddition__Group_1__0_in_rule__SugarAddition__Group__1__Impl7357);
            	    rule__SugarAddition__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarAdditionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarAddition__Group__1__Impl"


    // $ANTLR start "rule__SugarAddition__Group_1__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3681:1: rule__SugarAddition__Group_1__0 : rule__SugarAddition__Group_1__0__Impl rule__SugarAddition__Group_1__1 ;
    public final void rule__SugarAddition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3685:1: ( rule__SugarAddition__Group_1__0__Impl rule__SugarAddition__Group_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3686:2: rule__SugarAddition__Group_1__0__Impl rule__SugarAddition__Group_1__1
            {
            pushFollow(FOLLOW_rule__SugarAddition__Group_1__0__Impl_in_rule__SugarAddition__Group_1__07392);
            rule__SugarAddition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SugarAddition__Group_1__1_in_rule__SugarAddition__Group_1__07395);
            rule__SugarAddition__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarAddition__Group_1__0"


    // $ANTLR start "rule__SugarAddition__Group_1__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3693:1: rule__SugarAddition__Group_1__0__Impl : ( () ) ;
    public final void rule__SugarAddition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3697:1: ( ( () ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3698:1: ( () )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3698:1: ( () )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3699:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarAdditionAccess().getSugarAdditionLeftAction_1_0()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3700:1: ()
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3702:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarAdditionAccess().getSugarAdditionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarAddition__Group_1__0__Impl"


    // $ANTLR start "rule__SugarAddition__Group_1__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3712:1: rule__SugarAddition__Group_1__1 : rule__SugarAddition__Group_1__1__Impl rule__SugarAddition__Group_1__2 ;
    public final void rule__SugarAddition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3716:1: ( rule__SugarAddition__Group_1__1__Impl rule__SugarAddition__Group_1__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3717:2: rule__SugarAddition__Group_1__1__Impl rule__SugarAddition__Group_1__2
            {
            pushFollow(FOLLOW_rule__SugarAddition__Group_1__1__Impl_in_rule__SugarAddition__Group_1__17453);
            rule__SugarAddition__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SugarAddition__Group_1__2_in_rule__SugarAddition__Group_1__17456);
            rule__SugarAddition__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarAddition__Group_1__1"


    // $ANTLR start "rule__SugarAddition__Group_1__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3724:1: rule__SugarAddition__Group_1__1__Impl : ( ( rule__SugarAddition__SymbolAssignment_1_1 ) ) ;
    public final void rule__SugarAddition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3728:1: ( ( ( rule__SugarAddition__SymbolAssignment_1_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3729:1: ( ( rule__SugarAddition__SymbolAssignment_1_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3729:1: ( ( rule__SugarAddition__SymbolAssignment_1_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3730:1: ( rule__SugarAddition__SymbolAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarAdditionAccess().getSymbolAssignment_1_1()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3731:1: ( rule__SugarAddition__SymbolAssignment_1_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3731:2: rule__SugarAddition__SymbolAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SugarAddition__SymbolAssignment_1_1_in_rule__SugarAddition__Group_1__1__Impl7483);
            rule__SugarAddition__SymbolAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarAdditionAccess().getSymbolAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarAddition__Group_1__1__Impl"


    // $ANTLR start "rule__SugarAddition__Group_1__2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3741:1: rule__SugarAddition__Group_1__2 : rule__SugarAddition__Group_1__2__Impl ;
    public final void rule__SugarAddition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3745:1: ( rule__SugarAddition__Group_1__2__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3746:2: rule__SugarAddition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SugarAddition__Group_1__2__Impl_in_rule__SugarAddition__Group_1__27513);
            rule__SugarAddition__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarAddition__Group_1__2"


    // $ANTLR start "rule__SugarAddition__Group_1__2__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3752:1: rule__SugarAddition__Group_1__2__Impl : ( ( rule__SugarAddition__RightAssignment_1_2 ) ) ;
    public final void rule__SugarAddition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3756:1: ( ( ( rule__SugarAddition__RightAssignment_1_2 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3757:1: ( ( rule__SugarAddition__RightAssignment_1_2 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3757:1: ( ( rule__SugarAddition__RightAssignment_1_2 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3758:1: ( rule__SugarAddition__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarAdditionAccess().getRightAssignment_1_2()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3759:1: ( rule__SugarAddition__RightAssignment_1_2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3759:2: rule__SugarAddition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__SugarAddition__RightAssignment_1_2_in_rule__SugarAddition__Group_1__2__Impl7540);
            rule__SugarAddition__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarAdditionAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarAddition__Group_1__2__Impl"


    // $ANTLR start "rule__SugarMultiplication__Group__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3775:1: rule__SugarMultiplication__Group__0 : rule__SugarMultiplication__Group__0__Impl rule__SugarMultiplication__Group__1 ;
    public final void rule__SugarMultiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3779:1: ( rule__SugarMultiplication__Group__0__Impl rule__SugarMultiplication__Group__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3780:2: rule__SugarMultiplication__Group__0__Impl rule__SugarMultiplication__Group__1
            {
            pushFollow(FOLLOW_rule__SugarMultiplication__Group__0__Impl_in_rule__SugarMultiplication__Group__07576);
            rule__SugarMultiplication__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SugarMultiplication__Group__1_in_rule__SugarMultiplication__Group__07579);
            rule__SugarMultiplication__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarMultiplication__Group__0"


    // $ANTLR start "rule__SugarMultiplication__Group__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3787:1: rule__SugarMultiplication__Group__0__Impl : ( ruleSugarNumericalPrimary ) ;
    public final void rule__SugarMultiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3791:1: ( ( ruleSugarNumericalPrimary ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3792:1: ( ruleSugarNumericalPrimary )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3792:1: ( ruleSugarNumericalPrimary )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3793:1: ruleSugarNumericalPrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarMultiplicationAccess().getSugarNumericalPrimaryParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleSugarNumericalPrimary_in_rule__SugarMultiplication__Group__0__Impl7606);
            ruleSugarNumericalPrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarMultiplicationAccess().getSugarNumericalPrimaryParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarMultiplication__Group__0__Impl"


    // $ANTLR start "rule__SugarMultiplication__Group__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3804:1: rule__SugarMultiplication__Group__1 : rule__SugarMultiplication__Group__1__Impl ;
    public final void rule__SugarMultiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3808:1: ( rule__SugarMultiplication__Group__1__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3809:2: rule__SugarMultiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SugarMultiplication__Group__1__Impl_in_rule__SugarMultiplication__Group__17635);
            rule__SugarMultiplication__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarMultiplication__Group__1"


    // $ANTLR start "rule__SugarMultiplication__Group__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3815:1: rule__SugarMultiplication__Group__1__Impl : ( ( rule__SugarMultiplication__Group_1__0 )* ) ;
    public final void rule__SugarMultiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3819:1: ( ( ( rule__SugarMultiplication__Group_1__0 )* ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3820:1: ( ( rule__SugarMultiplication__Group_1__0 )* )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3820:1: ( ( rule__SugarMultiplication__Group_1__0 )* )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3821:1: ( rule__SugarMultiplication__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarMultiplicationAccess().getGroup_1()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3822:1: ( rule__SugarMultiplication__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=22 && LA28_0<=23)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3822:2: rule__SugarMultiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SugarMultiplication__Group_1__0_in_rule__SugarMultiplication__Group__1__Impl7662);
            	    rule__SugarMultiplication__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarMultiplicationAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarMultiplication__Group__1__Impl"


    // $ANTLR start "rule__SugarMultiplication__Group_1__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3836:1: rule__SugarMultiplication__Group_1__0 : rule__SugarMultiplication__Group_1__0__Impl rule__SugarMultiplication__Group_1__1 ;
    public final void rule__SugarMultiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3840:1: ( rule__SugarMultiplication__Group_1__0__Impl rule__SugarMultiplication__Group_1__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3841:2: rule__SugarMultiplication__Group_1__0__Impl rule__SugarMultiplication__Group_1__1
            {
            pushFollow(FOLLOW_rule__SugarMultiplication__Group_1__0__Impl_in_rule__SugarMultiplication__Group_1__07697);
            rule__SugarMultiplication__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SugarMultiplication__Group_1__1_in_rule__SugarMultiplication__Group_1__07700);
            rule__SugarMultiplication__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarMultiplication__Group_1__0"


    // $ANTLR start "rule__SugarMultiplication__Group_1__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3848:1: rule__SugarMultiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__SugarMultiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3852:1: ( ( () ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3853:1: ( () )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3853:1: ( () )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3854:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarMultiplicationAccess().getSugarMultiplicationLeftAction_1_0()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3855:1: ()
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3857:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarMultiplicationAccess().getSugarMultiplicationLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarMultiplication__Group_1__0__Impl"


    // $ANTLR start "rule__SugarMultiplication__Group_1__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3867:1: rule__SugarMultiplication__Group_1__1 : rule__SugarMultiplication__Group_1__1__Impl rule__SugarMultiplication__Group_1__2 ;
    public final void rule__SugarMultiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3871:1: ( rule__SugarMultiplication__Group_1__1__Impl rule__SugarMultiplication__Group_1__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3872:2: rule__SugarMultiplication__Group_1__1__Impl rule__SugarMultiplication__Group_1__2
            {
            pushFollow(FOLLOW_rule__SugarMultiplication__Group_1__1__Impl_in_rule__SugarMultiplication__Group_1__17758);
            rule__SugarMultiplication__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SugarMultiplication__Group_1__2_in_rule__SugarMultiplication__Group_1__17761);
            rule__SugarMultiplication__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarMultiplication__Group_1__1"


    // $ANTLR start "rule__SugarMultiplication__Group_1__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3879:1: rule__SugarMultiplication__Group_1__1__Impl : ( ( rule__SugarMultiplication__SymbolAssignment_1_1 ) ) ;
    public final void rule__SugarMultiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3883:1: ( ( ( rule__SugarMultiplication__SymbolAssignment_1_1 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3884:1: ( ( rule__SugarMultiplication__SymbolAssignment_1_1 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3884:1: ( ( rule__SugarMultiplication__SymbolAssignment_1_1 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3885:1: ( rule__SugarMultiplication__SymbolAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarMultiplicationAccess().getSymbolAssignment_1_1()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3886:1: ( rule__SugarMultiplication__SymbolAssignment_1_1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3886:2: rule__SugarMultiplication__SymbolAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SugarMultiplication__SymbolAssignment_1_1_in_rule__SugarMultiplication__Group_1__1__Impl7788);
            rule__SugarMultiplication__SymbolAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarMultiplicationAccess().getSymbolAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarMultiplication__Group_1__1__Impl"


    // $ANTLR start "rule__SugarMultiplication__Group_1__2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3896:1: rule__SugarMultiplication__Group_1__2 : rule__SugarMultiplication__Group_1__2__Impl ;
    public final void rule__SugarMultiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3900:1: ( rule__SugarMultiplication__Group_1__2__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3901:2: rule__SugarMultiplication__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SugarMultiplication__Group_1__2__Impl_in_rule__SugarMultiplication__Group_1__27818);
            rule__SugarMultiplication__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarMultiplication__Group_1__2"


    // $ANTLR start "rule__SugarMultiplication__Group_1__2__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3907:1: rule__SugarMultiplication__Group_1__2__Impl : ( ( rule__SugarMultiplication__RightAssignment_1_2 ) ) ;
    public final void rule__SugarMultiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3911:1: ( ( ( rule__SugarMultiplication__RightAssignment_1_2 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3912:1: ( ( rule__SugarMultiplication__RightAssignment_1_2 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3912:1: ( ( rule__SugarMultiplication__RightAssignment_1_2 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3913:1: ( rule__SugarMultiplication__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarMultiplicationAccess().getRightAssignment_1_2()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3914:1: ( rule__SugarMultiplication__RightAssignment_1_2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3914:2: rule__SugarMultiplication__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__SugarMultiplication__RightAssignment_1_2_in_rule__SugarMultiplication__Group_1__2__Impl7845);
            rule__SugarMultiplication__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarMultiplicationAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarMultiplication__Group_1__2__Impl"


    // $ANTLR start "rule__SugarNumericalPrimary__Group_3__0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3930:1: rule__SugarNumericalPrimary__Group_3__0 : rule__SugarNumericalPrimary__Group_3__0__Impl rule__SugarNumericalPrimary__Group_3__1 ;
    public final void rule__SugarNumericalPrimary__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3934:1: ( rule__SugarNumericalPrimary__Group_3__0__Impl rule__SugarNumericalPrimary__Group_3__1 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3935:2: rule__SugarNumericalPrimary__Group_3__0__Impl rule__SugarNumericalPrimary__Group_3__1
            {
            pushFollow(FOLLOW_rule__SugarNumericalPrimary__Group_3__0__Impl_in_rule__SugarNumericalPrimary__Group_3__07881);
            rule__SugarNumericalPrimary__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SugarNumericalPrimary__Group_3__1_in_rule__SugarNumericalPrimary__Group_3__07884);
            rule__SugarNumericalPrimary__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarNumericalPrimary__Group_3__0"


    // $ANTLR start "rule__SugarNumericalPrimary__Group_3__0__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3942:1: rule__SugarNumericalPrimary__Group_3__0__Impl : ( '(' ) ;
    public final void rule__SugarNumericalPrimary__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3946:1: ( ( '(' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3947:1: ( '(' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3947:1: ( '(' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3948:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarNumericalPrimaryAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__SugarNumericalPrimary__Group_3__0__Impl7912); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarNumericalPrimaryAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarNumericalPrimary__Group_3__0__Impl"


    // $ANTLR start "rule__SugarNumericalPrimary__Group_3__1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3961:1: rule__SugarNumericalPrimary__Group_3__1 : rule__SugarNumericalPrimary__Group_3__1__Impl rule__SugarNumericalPrimary__Group_3__2 ;
    public final void rule__SugarNumericalPrimary__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3965:1: ( rule__SugarNumericalPrimary__Group_3__1__Impl rule__SugarNumericalPrimary__Group_3__2 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3966:2: rule__SugarNumericalPrimary__Group_3__1__Impl rule__SugarNumericalPrimary__Group_3__2
            {
            pushFollow(FOLLOW_rule__SugarNumericalPrimary__Group_3__1__Impl_in_rule__SugarNumericalPrimary__Group_3__17943);
            rule__SugarNumericalPrimary__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SugarNumericalPrimary__Group_3__2_in_rule__SugarNumericalPrimary__Group_3__17946);
            rule__SugarNumericalPrimary__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarNumericalPrimary__Group_3__1"


    // $ANTLR start "rule__SugarNumericalPrimary__Group_3__1__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3973:1: rule__SugarNumericalPrimary__Group_3__1__Impl : ( ruleSugarNumericalPrimary ) ;
    public final void rule__SugarNumericalPrimary__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3977:1: ( ( ruleSugarNumericalPrimary ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3978:1: ( ruleSugarNumericalPrimary )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3978:1: ( ruleSugarNumericalPrimary )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3979:1: ruleSugarNumericalPrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarNumericalPrimaryAccess().getSugarNumericalPrimaryParserRuleCall_3_1()); 
            }
            pushFollow(FOLLOW_ruleSugarNumericalPrimary_in_rule__SugarNumericalPrimary__Group_3__1__Impl7973);
            ruleSugarNumericalPrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarNumericalPrimaryAccess().getSugarNumericalPrimaryParserRuleCall_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarNumericalPrimary__Group_3__1__Impl"


    // $ANTLR start "rule__SugarNumericalPrimary__Group_3__2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3990:1: rule__SugarNumericalPrimary__Group_3__2 : rule__SugarNumericalPrimary__Group_3__2__Impl ;
    public final void rule__SugarNumericalPrimary__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3994:1: ( rule__SugarNumericalPrimary__Group_3__2__Impl )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:3995:2: rule__SugarNumericalPrimary__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__SugarNumericalPrimary__Group_3__2__Impl_in_rule__SugarNumericalPrimary__Group_3__28002);
            rule__SugarNumericalPrimary__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarNumericalPrimary__Group_3__2"


    // $ANTLR start "rule__SugarNumericalPrimary__Group_3__2__Impl"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4001:1: rule__SugarNumericalPrimary__Group_3__2__Impl : ( ')' ) ;
    public final void rule__SugarNumericalPrimary__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4005:1: ( ( ')' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4006:1: ( ')' )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4006:1: ( ')' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4007:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarNumericalPrimaryAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,34,FOLLOW_34_in_rule__SugarNumericalPrimary__Group_3__2__Impl8030); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarNumericalPrimaryAccess().getRightParenthesisKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarNumericalPrimary__Group_3__2__Impl"


    // $ANTLR start "rule__Input__GivenAssignment_1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4027:1: rule__Input__GivenAssignment_1 : ( ruleProblemPropertyOptional ) ;
    public final void rule__Input__GivenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4031:1: ( ( ruleProblemPropertyOptional ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4032:1: ( ruleProblemPropertyOptional )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4032:1: ( ruleProblemPropertyOptional )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4033:1: ruleProblemPropertyOptional
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getGivenProblemPropertyOptionalParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleProblemPropertyOptional_in_rule__Input__GivenAssignment_18072);
            ruleProblemPropertyOptional();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getGivenProblemPropertyOptionalParserRuleCall_1_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4042:1: rule__Input__TaskAssignment_3_0_0 : ( ( rule__Input__TaskAlternatives_3_0_0_0 ) ) ;
    public final void rule__Input__TaskAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4046:1: ( ( ( rule__Input__TaskAlternatives_3_0_0_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4047:1: ( ( rule__Input__TaskAlternatives_3_0_0_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4047:1: ( ( rule__Input__TaskAlternatives_3_0_0_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4048:1: ( rule__Input__TaskAlternatives_3_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getTaskAlternatives_3_0_0_0()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4049:1: ( rule__Input__TaskAlternatives_3_0_0_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4049:2: rule__Input__TaskAlternatives_3_0_0_0
            {
            pushFollow(FOLLOW_rule__Input__TaskAlternatives_3_0_0_0_in_rule__Input__TaskAssignment_3_0_08103);
            rule__Input__TaskAlternatives_3_0_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getTaskAlternatives_3_0_0_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4058:1: rule__Input__GoalAssignment_3_0_1 : ( ruleProblem ) ;
    public final void rule__Input__GoalAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4062:1: ( ( ruleProblem ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4063:1: ( ruleProblem )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4063:1: ( ruleProblem )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4064:1: ruleProblem
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getGoalProblemParserRuleCall_3_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleProblem_in_rule__Input__GoalAssignment_3_0_18136);
            ruleProblem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getGoalProblemParserRuleCall_3_0_1_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4073:1: rule__Input__TaskAssignment_3_1_0 : ( ( 'Test' ) ) ;
    public final void rule__Input__TaskAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4077:1: ( ( ( 'Test' ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4078:1: ( ( 'Test' ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4078:1: ( ( 'Test' ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4079:1: ( 'Test' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getTaskTestKeyword_3_1_0_0()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4080:1: ( 'Test' )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4081:1: 'Test'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getTaskTestKeyword_3_1_0_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__Input__TaskAssignment_3_1_08172); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getTaskTestKeyword_3_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getTaskTestKeyword_3_1_0_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Input__GoalAssignment_3_1_1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4096:1: rule__Input__GoalAssignment_3_1_1 : ( ( rule__Input__GoalAlternatives_3_1_1_0 ) ) ;
    public final void rule__Input__GoalAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4100:1: ( ( ( rule__Input__GoalAlternatives_3_1_1_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4101:1: ( ( rule__Input__GoalAlternatives_3_1_1_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4101:1: ( ( rule__Input__GoalAlternatives_3_1_1_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4102:1: ( rule__Input__GoalAlternatives_3_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getGoalAlternatives_3_1_1_0()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4103:1: ( rule__Input__GoalAlternatives_3_1_1_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4103:2: rule__Input__GoalAlternatives_3_1_1_0
            {
            pushFollow(FOLLOW_rule__Input__GoalAlternatives_3_1_1_0_in_rule__Input__GoalAssignment_3_1_18211);
            rule__Input__GoalAlternatives_3_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getGoalAlternatives_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__GoalAssignment_3_1_1"


    // $ANTLR start "rule__Input__TheoremsAssignment_4_2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4112:1: rule__Input__TheoremsAssignment_4_2 : ( ruleTheorem ) ;
    public final void rule__Input__TheoremsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4116:1: ( ( ruleTheorem ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4117:1: ( ruleTheorem )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4117:1: ( ruleTheorem )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4118:1: ruleTheorem
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getTheoremsTheoremParserRuleCall_4_2_0()); 
            }
            pushFollow(FOLLOW_ruleTheorem_in_rule__Input__TheoremsAssignment_4_28244);
            ruleTheorem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getTheoremsTheoremParserRuleCall_4_2_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4127:1: rule__Input__TheoremsAssignment_4_3_1 : ( ruleTheorem ) ;
    public final void rule__Input__TheoremsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4131:1: ( ( ruleTheorem ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4132:1: ( ruleTheorem )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4132:1: ( ruleTheorem )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4133:1: ruleTheorem
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getTheoremsTheoremParserRuleCall_4_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleTheorem_in_rule__Input__TheoremsAssignment_4_3_18275);
            ruleTheorem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getTheoremsTheoremParserRuleCall_4_3_1_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4142:1: rule__ProblemNoVars__PropertyAssignment : ( ruleORing ) ;
    public final void rule__ProblemNoVars__PropertyAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4146:1: ( ( ruleORing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4147:1: ( ruleORing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4147:1: ( ruleORing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4148:1: ruleORing
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProblemNoVarsAccess().getPropertyORingParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleORing_in_rule__ProblemNoVars__PropertyAssignment8306);
            ruleORing();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProblemNoVarsAccess().getPropertyORingParserRuleCall_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__ProblemPropertyOptional__VarsAssignment_0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4157:1: rule__ProblemPropertyOptional__VarsAssignment_0 : ( ruleDeclaration ) ;
    public final void rule__ProblemPropertyOptional__VarsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4161:1: ( ( ruleDeclaration ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4162:1: ( ruleDeclaration )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4162:1: ( ruleDeclaration )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4163:1: ruleDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProblemPropertyOptionalAccess().getVarsDeclarationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_rule__ProblemPropertyOptional__VarsAssignment_08337);
            ruleDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProblemPropertyOptionalAccess().getVarsDeclarationParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemPropertyOptional__VarsAssignment_0"


    // $ANTLR start "rule__ProblemPropertyOptional__VarsAssignment_1_1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4172:1: rule__ProblemPropertyOptional__VarsAssignment_1_1 : ( ruleDeclaration ) ;
    public final void rule__ProblemPropertyOptional__VarsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4176:1: ( ( ruleDeclaration ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4177:1: ( ruleDeclaration )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4177:1: ( ruleDeclaration )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4178:1: ruleDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProblemPropertyOptionalAccess().getVarsDeclarationParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_rule__ProblemPropertyOptional__VarsAssignment_1_18368);
            ruleDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProblemPropertyOptionalAccess().getVarsDeclarationParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemPropertyOptional__VarsAssignment_1_1"


    // $ANTLR start "rule__ProblemPropertyOptional__PropertyAssignment_2_1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4187:1: rule__ProblemPropertyOptional__PropertyAssignment_2_1 : ( ruleORing ) ;
    public final void rule__ProblemPropertyOptional__PropertyAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4191:1: ( ( ruleORing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4192:1: ( ruleORing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4192:1: ( ruleORing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4193:1: ruleORing
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProblemPropertyOptionalAccess().getPropertyORingParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleORing_in_rule__ProblemPropertyOptional__PropertyAssignment_2_18399);
            ruleORing();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProblemPropertyOptionalAccess().getPropertyORingParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemPropertyOptional__PropertyAssignment_2_1"


    // $ANTLR start "rule__Problem__VarsAssignment_0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4202:1: rule__Problem__VarsAssignment_0 : ( ruleDeclaration ) ;
    public final void rule__Problem__VarsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4206:1: ( ( ruleDeclaration ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4207:1: ( ruleDeclaration )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4207:1: ( ruleDeclaration )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4208:1: ruleDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProblemAccess().getVarsDeclarationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_rule__Problem__VarsAssignment_08430);
            ruleDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProblemAccess().getVarsDeclarationParserRuleCall_0_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4217:1: rule__Problem__VarsAssignment_1_1 : ( ruleDeclaration ) ;
    public final void rule__Problem__VarsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4221:1: ( ( ruleDeclaration ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4222:1: ( ruleDeclaration )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4222:1: ( ruleDeclaration )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4223:1: ruleDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProblemAccess().getVarsDeclarationParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_rule__Problem__VarsAssignment_1_18461);
            ruleDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProblemAccess().getVarsDeclarationParserRuleCall_1_1_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4232:1: rule__Problem__PropertyAssignment_3 : ( ruleORing ) ;
    public final void rule__Problem__PropertyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4236:1: ( ( ruleORing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4237:1: ( ruleORing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4237:1: ( ruleORing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4238:1: ruleORing
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProblemAccess().getPropertyORingParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleORing_in_rule__Problem__PropertyAssignment_38492);
            ruleORing();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProblemAccess().getPropertyORingParserRuleCall_3_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Declaration__TypeAssignment_0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4247:1: rule__Declaration__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Declaration__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4251:1: ( ( ruleType ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4252:1: ( ruleType )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4252:1: ( ruleType )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4253:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__Declaration__TypeAssignment_08523);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Declaration__VarNameAssignment_1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4262:1: rule__Declaration__VarNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Declaration__VarNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4266:1: ( ( RULE_ID ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4267:1: ( RULE_ID )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4267:1: ( RULE_ID )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4268:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getVarNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Declaration__VarNameAssignment_18554); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationAccess().getVarNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4277:1: rule__Type__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4281:1: ( ( RULE_ID ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4282:1: ( RULE_ID )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4282:1: ( RULE_ID )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4283:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Type__NameAssignment_08585); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4292:1: rule__Type__TemplateTypeAssignment_1_1 : ( ruleType ) ;
    public final void rule__Type__TemplateTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4296:1: ( ( ruleType ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4297:1: ( ruleType )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4297:1: ( ruleType )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4298:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getTemplateTypeTypeParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__Type__TemplateTypeAssignment_1_18616);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getTemplateTypeTypeParserRuleCall_1_1_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4307:1: rule__ORing__RightAssignment_1_2 : ( ruleANDing ) ;
    public final void rule__ORing__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4311:1: ( ( ruleANDing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4312:1: ( ruleANDing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4312:1: ( ruleANDing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4313:1: ruleANDing
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getORingAccess().getRightANDingParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleANDing_in_rule__ORing__RightAssignment_1_28647);
            ruleANDing();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getORingAccess().getRightANDingParserRuleCall_1_2_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4322:1: rule__ANDing__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__ANDing__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4326:1: ( ( rulePrimary ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4327:1: ( rulePrimary )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4327:1: ( rulePrimary )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4328:1: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getANDingAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_rulePrimary_in_rule__ANDing__RightAssignment_1_28678);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getANDingAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4337:1: rule__ProblemShell__ProblemAssignment_1 : ( ruleProblem ) ;
    public final void rule__ProblemShell__ProblemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4341:1: ( ( ruleProblem ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4342:1: ( ruleProblem )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4342:1: ( ruleProblem )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4343:1: ruleProblem
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProblemShellAccess().getProblemProblemParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleProblem_in_rule__ProblemShell__ProblemAssignment_18709);
            ruleProblem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProblemShellAccess().getProblemProblemParserRuleCall_1_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4352:1: rule__Negation__NegatedAssignment_1 : ( rulePrimary ) ;
    public final void rule__Negation__NegatedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4356:1: ( ( rulePrimary ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4357:1: ( rulePrimary )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4357:1: ( rulePrimary )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4358:1: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationAccess().getNegatedPrimaryParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_rulePrimary_in_rule__Negation__NegatedAssignment_18740);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegationAccess().getNegatedPrimaryParserRuleCall_1_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4367:1: rule__Quantifier__QuantifierAssignment_0 : ( ( rule__Quantifier__QuantifierAlternatives_0_0 ) ) ;
    public final void rule__Quantifier__QuantifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4371:1: ( ( ( rule__Quantifier__QuantifierAlternatives_0_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4372:1: ( ( rule__Quantifier__QuantifierAlternatives_0_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4372:1: ( ( rule__Quantifier__QuantifierAlternatives_0_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4373:1: ( rule__Quantifier__QuantifierAlternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifierAccess().getQuantifierAlternatives_0_0()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4374:1: ( rule__Quantifier__QuantifierAlternatives_0_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4374:2: rule__Quantifier__QuantifierAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__Quantifier__QuantifierAlternatives_0_0_in_rule__Quantifier__QuantifierAssignment_08771);
            rule__Quantifier__QuantifierAlternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifierAccess().getQuantifierAlternatives_0_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4383:1: rule__Quantifier__SubjectAssignment_2 : ( ruleProblem ) ;
    public final void rule__Quantifier__SubjectAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4387:1: ( ( ruleProblem ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4388:1: ( ruleProblem )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4388:1: ( ruleProblem )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4389:1: ruleProblem
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifierAccess().getSubjectProblemParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleProblem_in_rule__Quantifier__SubjectAssignment_28804);
            ruleProblem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifierAccess().getSubjectProblemParserRuleCall_2_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4398:1: rule__Quantifier__PredicateAssignment_4 : ( ruleORing ) ;
    public final void rule__Quantifier__PredicateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4402:1: ( ( ruleORing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4403:1: ( ruleORing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4403:1: ( ruleORing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4404:1: ruleORing
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifierAccess().getPredicateORingParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleORing_in_rule__Quantifier__PredicateAssignment_48835);
            ruleORing();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifierAccess().getPredicateORingParserRuleCall_4_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__SugarAtomic__FunctionAssignment_0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4413:1: rule__SugarAtomic__FunctionAssignment_0 : ( RULE_ID ) ;
    public final void rule__SugarAtomic__FunctionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4417:1: ( ( RULE_ID ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4418:1: ( RULE_ID )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4418:1: ( RULE_ID )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4419:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarAtomicAccess().getFunctionIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SugarAtomic__FunctionAssignment_08866); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarAtomicAccess().getFunctionIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarAtomic__FunctionAssignment_0"


    // $ANTLR start "rule__SugarAtomic__ArgsAssignment_2_0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4428:1: rule__SugarAtomic__ArgsAssignment_2_0 : ( ruleSugarAddition ) ;
    public final void rule__SugarAtomic__ArgsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4432:1: ( ( ruleSugarAddition ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4433:1: ( ruleSugarAddition )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4433:1: ( ruleSugarAddition )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4434:1: ruleSugarAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarAtomicAccess().getArgsSugarAdditionParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleSugarAddition_in_rule__SugarAtomic__ArgsAssignment_2_08897);
            ruleSugarAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarAtomicAccess().getArgsSugarAdditionParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarAtomic__ArgsAssignment_2_0"


    // $ANTLR start "rule__SugarAtomic__ArgsAssignment_2_1_1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4443:1: rule__SugarAtomic__ArgsAssignment_2_1_1 : ( ruleSugarAddition ) ;
    public final void rule__SugarAtomic__ArgsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4447:1: ( ( ruleSugarAddition ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4448:1: ( ruleSugarAddition )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4448:1: ( ruleSugarAddition )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4449:1: ruleSugarAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarAtomicAccess().getArgsSugarAdditionParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleSugarAddition_in_rule__SugarAtomic__ArgsAssignment_2_1_18928);
            ruleSugarAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarAtomicAccess().getArgsSugarAdditionParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarAtomic__ArgsAssignment_2_1_1"


    // $ANTLR start "rule__Atomic__FunctionAssignment_0"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4458:1: rule__Atomic__FunctionAssignment_0 : ( RULE_ID ) ;
    public final void rule__Atomic__FunctionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4462:1: ( ( RULE_ID ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4463:1: ( RULE_ID )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4463:1: ( RULE_ID )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4464:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getFunctionIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Atomic__FunctionAssignment_08959); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getFunctionIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4473:1: rule__Atomic__ArgsAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__Atomic__ArgsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4477:1: ( ( RULE_ID ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4478:1: ( RULE_ID )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4478:1: ( RULE_ID )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4479:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getArgsIDTerminalRuleCall_2_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Atomic__ArgsAssignment_2_08990); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getArgsIDTerminalRuleCall_2_0_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4488:1: rule__Atomic__ArgsAssignment_2_1_1 : ( RULE_ID ) ;
    public final void rule__Atomic__ArgsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4492:1: ( ( RULE_ID ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4493:1: ( RULE_ID )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4493:1: ( RULE_ID )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4494:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getArgsIDTerminalRuleCall_2_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Atomic__ArgsAssignment_2_1_19021); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getArgsIDTerminalRuleCall_2_1_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__BooleanLiteral__ValueAssignment"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4503:1: rule__BooleanLiteral__ValueAssignment : ( ( rule__BooleanLiteral__ValueAlternatives_0 ) ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4507:1: ( ( ( rule__BooleanLiteral__ValueAlternatives_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4508:1: ( ( rule__BooleanLiteral__ValueAlternatives_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4508:1: ( ( rule__BooleanLiteral__ValueAlternatives_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4509:1: ( rule__BooleanLiteral__ValueAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_0()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4510:1: ( rule__BooleanLiteral__ValueAlternatives_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4510:2: rule__BooleanLiteral__ValueAlternatives_0
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__ValueAlternatives_0_in_rule__BooleanLiteral__ValueAssignment9052);
            rule__BooleanLiteral__ValueAlternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4519:1: rule__Theorem__RequirementAssignment_0 : ( ruleORing ) ;
    public final void rule__Theorem__RequirementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4523:1: ( ( ruleORing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4524:1: ( ruleORing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4524:1: ( ruleORing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4525:1: ruleORing
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheoremAccess().getRequirementORingParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleORing_in_rule__Theorem__RequirementAssignment_09085);
            ruleORing();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheoremAccess().getRequirementORingParserRuleCall_0_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Theorem__ImplicationAssignment_1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4534:1: rule__Theorem__ImplicationAssignment_1 : ( ( rule__Theorem__ImplicationAlternatives_1_0 ) ) ;
    public final void rule__Theorem__ImplicationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4538:1: ( ( ( rule__Theorem__ImplicationAlternatives_1_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4539:1: ( ( rule__Theorem__ImplicationAlternatives_1_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4539:1: ( ( rule__Theorem__ImplicationAlternatives_1_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4540:1: ( rule__Theorem__ImplicationAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheoremAccess().getImplicationAlternatives_1_0()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4541:1: ( rule__Theorem__ImplicationAlternatives_1_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4541:2: rule__Theorem__ImplicationAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Theorem__ImplicationAlternatives_1_0_in_rule__Theorem__ImplicationAssignment_19116);
            rule__Theorem__ImplicationAlternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheoremAccess().getImplicationAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theorem__ImplicationAssignment_1"


    // $ANTLR start "rule__Theorem__ResultAssignment_2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4550:1: rule__Theorem__ResultAssignment_2 : ( ruleORing ) ;
    public final void rule__Theorem__ResultAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4554:1: ( ( ruleORing ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4555:1: ( ruleORing )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4555:1: ( ruleORing )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4556:1: ruleORing
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheoremAccess().getResultORingParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleORing_in_rule__Theorem__ResultAssignment_29149);
            ruleORing();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheoremAccess().getResultORingParserRuleCall_2_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4565:1: rule__Theorem__CostAssignment_4 : ( RULE_INT ) ;
    public final void rule__Theorem__CostAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4569:1: ( ( RULE_INT ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4570:1: ( RULE_INT )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4570:1: ( RULE_INT )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4571:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheoremAccess().getCostINTTerminalRuleCall_4_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Theorem__CostAssignment_49180); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheoremAccess().getCostINTTerminalRuleCall_4_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4580:1: rule__Theorem__DescriptionAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Theorem__DescriptionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4584:1: ( ( RULE_STRING ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4585:1: ( RULE_STRING )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4585:1: ( RULE_STRING )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4586:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheoremAccess().getDescriptionSTRINGTerminalRuleCall_6_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Theorem__DescriptionAssignment_69211); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheoremAccess().getDescriptionSTRINGTerminalRuleCall_6_0()); 
            }

            }


            }

        }
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
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4595:1: rule__Theorem__PseudoCodeAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__Theorem__PseudoCodeAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4599:1: ( ( RULE_STRING ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4600:1: ( RULE_STRING )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4600:1: ( RULE_STRING )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4601:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTheoremAccess().getPseudoCodeSTRINGTerminalRuleCall_7_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Theorem__PseudoCodeAssignment_7_19242); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTheoremAccess().getPseudoCodeSTRINGTerminalRuleCall_7_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__SugarAddition__SymbolAssignment_1_1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4610:1: rule__SugarAddition__SymbolAssignment_1_1 : ( ( rule__SugarAddition__SymbolAlternatives_1_1_0 ) ) ;
    public final void rule__SugarAddition__SymbolAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4614:1: ( ( ( rule__SugarAddition__SymbolAlternatives_1_1_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4615:1: ( ( rule__SugarAddition__SymbolAlternatives_1_1_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4615:1: ( ( rule__SugarAddition__SymbolAlternatives_1_1_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4616:1: ( rule__SugarAddition__SymbolAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarAdditionAccess().getSymbolAlternatives_1_1_0()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4617:1: ( rule__SugarAddition__SymbolAlternatives_1_1_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4617:2: rule__SugarAddition__SymbolAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__SugarAddition__SymbolAlternatives_1_1_0_in_rule__SugarAddition__SymbolAssignment_1_19273);
            rule__SugarAddition__SymbolAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarAdditionAccess().getSymbolAlternatives_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarAddition__SymbolAssignment_1_1"


    // $ANTLR start "rule__SugarAddition__RightAssignment_1_2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4626:1: rule__SugarAddition__RightAssignment_1_2 : ( ruleSugarMultiplication ) ;
    public final void rule__SugarAddition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4630:1: ( ( ruleSugarMultiplication ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4631:1: ( ruleSugarMultiplication )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4631:1: ( ruleSugarMultiplication )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4632:1: ruleSugarMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarAdditionAccess().getRightSugarMultiplicationParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleSugarMultiplication_in_rule__SugarAddition__RightAssignment_1_29306);
            ruleSugarMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarAdditionAccess().getRightSugarMultiplicationParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarAddition__RightAssignment_1_2"


    // $ANTLR start "rule__SugarMultiplication__SymbolAssignment_1_1"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4641:1: rule__SugarMultiplication__SymbolAssignment_1_1 : ( ( rule__SugarMultiplication__SymbolAlternatives_1_1_0 ) ) ;
    public final void rule__SugarMultiplication__SymbolAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4645:1: ( ( ( rule__SugarMultiplication__SymbolAlternatives_1_1_0 ) ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4646:1: ( ( rule__SugarMultiplication__SymbolAlternatives_1_1_0 ) )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4646:1: ( ( rule__SugarMultiplication__SymbolAlternatives_1_1_0 ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4647:1: ( rule__SugarMultiplication__SymbolAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarMultiplicationAccess().getSymbolAlternatives_1_1_0()); 
            }
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4648:1: ( rule__SugarMultiplication__SymbolAlternatives_1_1_0 )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4648:2: rule__SugarMultiplication__SymbolAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__SugarMultiplication__SymbolAlternatives_1_1_0_in_rule__SugarMultiplication__SymbolAssignment_1_19337);
            rule__SugarMultiplication__SymbolAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarMultiplicationAccess().getSymbolAlternatives_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarMultiplication__SymbolAssignment_1_1"


    // $ANTLR start "rule__SugarMultiplication__RightAssignment_1_2"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4657:1: rule__SugarMultiplication__RightAssignment_1_2 : ( ruleSugarNumericalPrimary ) ;
    public final void rule__SugarMultiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4661:1: ( ( ruleSugarNumericalPrimary ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4662:1: ( ruleSugarNumericalPrimary )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4662:1: ( ruleSugarNumericalPrimary )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4663:1: ruleSugarNumericalPrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSugarMultiplicationAccess().getRightSugarNumericalPrimaryParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleSugarNumericalPrimary_in_rule__SugarMultiplication__RightAssignment_1_29370);
            ruleSugarNumericalPrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSugarMultiplicationAccess().getRightSugarNumericalPrimaryParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SugarMultiplication__RightAssignment_1_2"


    // $ANTLR start "rule__NumberLiteral__ValueAssignment"
    // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4672:1: rule__NumberLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__NumberLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4676:1: ( ( RULE_INT ) )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4677:1: ( RULE_INT )
            {
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4677:1: ( RULE_INT )
            // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:4678:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NumberLiteral__ValueAssignment9401); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLiteralAccess().getValueINTTerminalRuleCall_0()); 
            }

            }


            }

        }
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

    // $ANTLR start synpred4_InternalInput
    public final void synpred4_InternalInput_fragment() throws RecognitionException {   
        // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:696:1: ( ( ( ruleAtomic ) ) )
        // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:696:1: ( ( ruleAtomic ) )
        {
        // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:696:1: ( ( ruleAtomic ) )
        // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:697:1: ( ruleAtomic )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_0()); 
        }
        // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:698:1: ( ruleAtomic )
        // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:698:3: ruleAtomic
        {
        pushFollow(FOLLOW_ruleAtomic_in_synpred4_InternalInput1432);
        ruleAtomic();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred4_InternalInput

    // $ANTLR start synpred5_InternalInput
    public final void synpred5_InternalInput_fragment() throws RecognitionException {   
        // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:702:6: ( ( ruleSugarAtomic ) )
        // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:702:6: ( ruleSugarAtomic )
        {
        // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:702:6: ( ruleSugarAtomic )
        // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:703:1: ruleSugarAtomic
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getPrimaryAccess().getSugarAtomicParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_ruleSugarAtomic_in_synpred5_InternalInput1450);
        ruleSugarAtomic();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalInput

    // $ANTLR start synpred17_InternalInput
    public final void synpred17_InternalInput_fragment() throws RecognitionException {   
        // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:892:6: ( ( ( ruleAtomic ) ) )
        // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:892:6: ( ( ruleAtomic ) )
        {
        // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:892:6: ( ( ruleAtomic ) )
        // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:893:1: ( ruleAtomic )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getSugarNumericalPrimaryAccess().getAtomicParserRuleCall_1()); 
        }
        // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:894:1: ( ruleAtomic )
        // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:894:3: ruleAtomic
        {
        pushFollow(FOLLOW_ruleAtomic_in_synpred17_InternalInput1881);
        ruleAtomic();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred17_InternalInput

    // $ANTLR start synpred18_InternalInput
    public final void synpred18_InternalInput_fragment() throws RecognitionException {   
        // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:898:6: ( ( ruleSugarAtomic ) )
        // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:898:6: ( ruleSugarAtomic )
        {
        // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:898:6: ( ruleSugarAtomic )
        // ../algorithmMaker.input.ui/src-gen/algorithmMaker/ui/contentassist/antlr/internal/InternalInput.g:899:1: ruleSugarAtomic
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getSugarNumericalPrimaryAccess().getSugarAtomicParserRuleCall_2()); 
        }
        pushFollow(FOLLOW_ruleSugarAtomic_in_synpred18_InternalInput1899);
        ruleSugarAtomic();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalInput

    // Delegated rules

    public final boolean synpred18_InternalInput() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalInput_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalInput() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalInput_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalInput() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalInput_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalInput() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalInput_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\14\uffff";
    static final String DFA4_eofS =
        "\14\uffff";
    static final String DFA4_minS =
        "\1\4\1\41\5\uffff\1\4\1\uffff\1\33\1\0\1\uffff";
    static final String DFA4_maxS =
        "\1\45\1\41\5\uffff\1\42\1\uffff\1\42\1\0\1\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\1\7\1\uffff\1\2\2\uffff\1\1";
    static final String DFA4_specialS =
        "\12\uffff\1\0\1\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\10\uffff\2\2\2\5\20\uffff\1\4\1\uffff\1\3\1\uffff\1\6",
            "\1\7",
            "",
            "",
            "",
            "",
            "",
            "\1\11\1\10\33\uffff\1\10\1\12",
            "",
            "\1\13\5\uffff\1\10\1\13",
            "\1\uffff",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "691:1: rule__Primary__Alternatives : ( ( ( ruleAtomic ) ) | ( ruleSugarAtomic ) | ( ruleQuantifier ) | ( ruleProblemShell ) | ( ( rule__Primary__Group_4__0 ) ) | ( ruleBooleanLiteral ) | ( ruleNegation ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_10 = input.LA(1);

                         
                        int index4_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalInput()) ) {s = 11;}

                        else if ( (synpred5_InternalInput()) ) {s = 8;}

                         
                        input.seek(index4_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__0_in_ruleInput100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblemNoVars_in_entryRuleProblemNoVars127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProblemNoVars134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemNoVars__PropertyAssignment_in_ruleProblemNoVars160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblemPropertyOptional_in_entryRuleProblemPropertyOptional187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProblemPropertyOptional194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemPropertyOptional__Group__0_in_ruleProblemPropertyOptional220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblem_in_entryRuleProblem247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProblem254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group__0_in_ruleProblem280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0_in_ruleDeclaration340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0_in_ruleType400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_entryRuleORing427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleORing434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORing__Group__0_in_ruleORing460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANDing_in_entryRuleANDing487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleANDing494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANDing__Group__0_in_ruleANDing520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Alternatives_in_rulePrimary580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblemShell_in_entryRuleProblemShell607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProblemShell614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemShell__Group__0_in_ruleProblemShell640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Group__0_in_ruleNegation700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_entryRuleQuantifier727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantifier734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__0_in_ruleQuantifier760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSugarAtomic_in_entryRuleSugarAtomic787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSugarAtomic794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarAtomic__Group__0_in_ruleSugarAtomic820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group__0_in_ruleAtomic880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTheorem_in_entryRuleTheorem967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTheorem974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__0_in_ruleTheorem1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSugarAddition_in_entryRuleSugarAddition1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSugarAddition1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarAddition__Group__0_in_ruleSugarAddition1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSugarMultiplication_in_entryRuleSugarMultiplication1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSugarMultiplication1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarMultiplication__Group__0_in_ruleSugarMultiplication1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSugarNumericalPrimary_in_entryRuleSugarNumericalPrimary1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSugarNumericalPrimary1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarNumericalPrimary__Alternatives_in_ruleSugarNumericalPrimary1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLiteral__ValueAssignment_in_ruleNumberLiteral1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_3_0__0_in_rule__Input__Alternatives_31276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_3_1__0_in_rule__Input__Alternatives_31294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Input__TaskAlternatives_3_0_0_01328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Input__TaskAlternatives_3_0_0_01348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblem_in_rule__Input__GoalAlternatives_3_1_1_01382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblemNoVars_in_rule__Input__GoalAlternatives_3_1_1_01399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rule__Primary__Alternatives1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSugarAtomic_in_rule__Primary__Alternatives1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_rule__Primary__Alternatives1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblemShell_in_rule__Primary__Alternatives1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_4__0_in_rule__Primary__Alternatives1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__Primary__Alternatives1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_rule__Primary__Alternatives1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Quantifier__QuantifierAlternatives_0_01569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Quantifier__QuantifierAlternatives_0_01589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BooleanLiteral__ValueAlternatives_01624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BooleanLiteral__ValueAlternatives_01644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Theorem__ImplicationAlternatives_1_01679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Theorem__ImplicationAlternatives_1_01699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Theorem__ImplicationAlternatives_1_01719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SugarAddition__SymbolAlternatives_1_1_01754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SugarAddition__SymbolAlternatives_1_1_01774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SugarMultiplication__SymbolAlternatives_1_1_01809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SugarMultiplication__SymbolAlternatives_1_1_01829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_rule__SugarNumericalPrimary__Alternatives1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rule__SugarNumericalPrimary__Alternatives1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSugarAtomic_in_rule__SugarNumericalPrimary__Alternatives1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarNumericalPrimary__Group_3__0_in_rule__SugarNumericalPrimary__Alternatives1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__01947 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Input__Group__1_in_rule__Input__Group__01950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Input__Group__0__Impl1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__12009 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Input__Group__2_in_rule__Input__Group__12012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__GivenAssignment_1_in_rule__Input__Group__1__Impl2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__2__Impl_in_rule__Input__Group__22069 = new BitSet(new long[]{0x0000008002001800L});
    public static final BitSet FOLLOW_rule__Input__Group__3_in_rule__Input__Group__22072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Input__Group__2__Impl2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__3__Impl_in_rule__Input__Group__32131 = new BitSet(new long[]{0x0000008002001800L});
    public static final BitSet FOLLOW_rule__Input__Group__4_in_rule__Input__Group__32134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Alternatives_3_in_rule__Input__Group__3__Impl2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__4__Impl_in_rule__Input__Group__42192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_4__0_in_rule__Input__Group__4__Impl2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_3_0__0__Impl_in_rule__Input__Group_3_0__02260 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Input__Group_3_0__1_in_rule__Input__Group_3_0__02263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__TaskAssignment_3_0_0_in_rule__Input__Group_3_0__0__Impl2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_3_0__1__Impl_in_rule__Input__Group_3_0__12320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__GoalAssignment_3_0_1_in_rule__Input__Group_3_0__1__Impl2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_3_1__0__Impl_in_rule__Input__Group_3_1__02381 = new BitSet(new long[]{0x0000002A0001E010L});
    public static final BitSet FOLLOW_rule__Input__Group_3_1__1_in_rule__Input__Group_3_1__02384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__TaskAssignment_3_1_0_in_rule__Input__Group_3_1__0__Impl2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_3_1__1__Impl_in_rule__Input__Group_3_1__12441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__GoalAssignment_3_1_1_in_rule__Input__Group_3_1__1__Impl2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_4__0__Impl_in_rule__Input__Group_4__02502 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Input__Group_4__1_in_rule__Input__Group_4__02505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Input__Group_4__0__Impl2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_4__1__Impl_in_rule__Input__Group_4__12564 = new BitSet(new long[]{0x0000002A0001E010L});
    public static final BitSet FOLLOW_rule__Input__Group_4__2_in_rule__Input__Group_4__12567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Input__Group_4__1__Impl2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_4__2__Impl_in_rule__Input__Group_4__22626 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Input__Group_4__3_in_rule__Input__Group_4__22629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__TheoremsAssignment_4_2_in_rule__Input__Group_4__2__Impl2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_4__3__Impl_in_rule__Input__Group_4__32686 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Input__Group_4__4_in_rule__Input__Group_4__32689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_4_3__0_in_rule__Input__Group_4__3__Impl2716 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Input__Group_4__4__Impl_in_rule__Input__Group_4__42747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Input__Group_4__4__Impl2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_4_3__0__Impl_in_rule__Input__Group_4_3__02819 = new BitSet(new long[]{0x0000002A0001E010L});
    public static final BitSet FOLLOW_rule__Input__Group_4_3__1_in_rule__Input__Group_4_3__02822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Input__Group_4_3__0__Impl2850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_4_3__1__Impl_in_rule__Input__Group_4_3__12881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__TheoremsAssignment_4_3_1_in_rule__Input__Group_4_3__1__Impl2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemPropertyOptional__Group__0__Impl_in_rule__ProblemPropertyOptional__Group__02942 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__ProblemPropertyOptional__Group__1_in_rule__ProblemPropertyOptional__Group__02945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemPropertyOptional__VarsAssignment_0_in_rule__ProblemPropertyOptional__Group__0__Impl2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemPropertyOptional__Group__1__Impl_in_rule__ProblemPropertyOptional__Group__13002 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__ProblemPropertyOptional__Group__2_in_rule__ProblemPropertyOptional__Group__13005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemPropertyOptional__Group_1__0_in_rule__ProblemPropertyOptional__Group__1__Impl3032 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__ProblemPropertyOptional__Group__2__Impl_in_rule__ProblemPropertyOptional__Group__23063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemPropertyOptional__Group_2__0_in_rule__ProblemPropertyOptional__Group__2__Impl3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemPropertyOptional__Group_1__0__Impl_in_rule__ProblemPropertyOptional__Group_1__03127 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProblemPropertyOptional__Group_1__1_in_rule__ProblemPropertyOptional__Group_1__03130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ProblemPropertyOptional__Group_1__0__Impl3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemPropertyOptional__Group_1__1__Impl_in_rule__ProblemPropertyOptional__Group_1__13189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemPropertyOptional__VarsAssignment_1_1_in_rule__ProblemPropertyOptional__Group_1__1__Impl3216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemPropertyOptional__Group_2__0__Impl_in_rule__ProblemPropertyOptional__Group_2__03250 = new BitSet(new long[]{0x0000002A0001E010L});
    public static final BitSet FOLLOW_rule__ProblemPropertyOptional__Group_2__1_in_rule__ProblemPropertyOptional__Group_2__03253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ProblemPropertyOptional__Group_2__0__Impl3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemPropertyOptional__Group_2__1__Impl_in_rule__ProblemPropertyOptional__Group_2__13312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemPropertyOptional__PropertyAssignment_2_1_in_rule__ProblemPropertyOptional__Group_2__1__Impl3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group__0__Impl_in_rule__Problem__Group__03373 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__Problem__Group__1_in_rule__Problem__Group__03376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__VarsAssignment_0_in_rule__Problem__Group__0__Impl3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group__1__Impl_in_rule__Problem__Group__13433 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__Problem__Group__2_in_rule__Problem__Group__13436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group_1__0_in_rule__Problem__Group__1__Impl3463 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Problem__Group__2__Impl_in_rule__Problem__Group__23494 = new BitSet(new long[]{0x0000002A0001E010L});
    public static final BitSet FOLLOW_rule__Problem__Group__3_in_rule__Problem__Group__23497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Problem__Group__2__Impl3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group__3__Impl_in_rule__Problem__Group__33556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__PropertyAssignment_3_in_rule__Problem__Group__3__Impl3583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group_1__0__Impl_in_rule__Problem__Group_1__03621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Problem__Group_1__1_in_rule__Problem__Group_1__03624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Problem__Group_1__0__Impl3652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__Group_1__1__Impl_in_rule__Problem__Group_1__13683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Problem__VarsAssignment_1_1_in_rule__Problem__Group_1__1__Impl3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__03744 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__03747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__TypeAssignment_0_in_rule__Declaration__Group__0__Impl3774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__13805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__VarNameAssignment_1_in_rule__Declaration__Group__1__Impl3832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__03866 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Type__Group__1_in_rule__Type__Group__03869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__NameAssignment_0_in_rule__Type__Group__0__Impl3896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__13926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__0_in_rule__Type__Group__1__Impl3953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__0__Impl_in_rule__Type__Group_1__03988 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Type__Group_1__1_in_rule__Type__Group_1__03991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Type__Group_1__0__Impl4019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__1__Impl_in_rule__Type__Group_1__14050 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Type__Group_1__2_in_rule__Type__Group_1__14053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__TemplateTypeAssignment_1_1_in_rule__Type__Group_1__1__Impl4080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1__2__Impl_in_rule__Type__Group_1__24110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Type__Group_1__2__Impl4138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORing__Group__0__Impl_in_rule__ORing__Group__04175 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ORing__Group__1_in_rule__ORing__Group__04178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANDing_in_rule__ORing__Group__0__Impl4205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORing__Group__1__Impl_in_rule__ORing__Group__14234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORing__Group_1__0_in_rule__ORing__Group__1__Impl4261 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__ORing__Group_1__0__Impl_in_rule__ORing__Group_1__04296 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ORing__Group_1__1_in_rule__ORing__Group_1__04299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORing__Group_1__1__Impl_in_rule__ORing__Group_1__14357 = new BitSet(new long[]{0x0000002A0001E010L});
    public static final BitSet FOLLOW_rule__ORing__Group_1__2_in_rule__ORing__Group_1__14360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ORing__Group_1__1__Impl4388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORing__Group_1__2__Impl_in_rule__ORing__Group_1__24419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORing__RightAssignment_1_2_in_rule__ORing__Group_1__2__Impl4446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANDing__Group__0__Impl_in_rule__ANDing__Group__04482 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ANDing__Group__1_in_rule__ANDing__Group__04485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__ANDing__Group__0__Impl4512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANDing__Group__1__Impl_in_rule__ANDing__Group__14541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANDing__Group_1__0_in_rule__ANDing__Group__1__Impl4568 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__ANDing__Group_1__0__Impl_in_rule__ANDing__Group_1__04603 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ANDing__Group_1__1_in_rule__ANDing__Group_1__04606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANDing__Group_1__1__Impl_in_rule__ANDing__Group_1__14664 = new BitSet(new long[]{0x0000002A0001E010L});
    public static final BitSet FOLLOW_rule__ANDing__Group_1__2_in_rule__ANDing__Group_1__14667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ANDing__Group_1__1__Impl4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANDing__Group_1__2__Impl_in_rule__ANDing__Group_1__24726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANDing__RightAssignment_1_2_in_rule__ANDing__Group_1__2__Impl4753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_4__0__Impl_in_rule__Primary__Group_4__04789 = new BitSet(new long[]{0x0000002A0001E010L});
    public static final BitSet FOLLOW_rule__Primary__Group_4__1_in_rule__Primary__Group_4__04792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Primary__Group_4__0__Impl4820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_4__1__Impl_in_rule__Primary__Group_4__14851 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Primary__Group_4__2_in_rule__Primary__Group_4__14854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_rule__Primary__Group_4__1__Impl4881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_4__2__Impl_in_rule__Primary__Group_4__24910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Primary__Group_4__2__Impl4938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemShell__Group__0__Impl_in_rule__ProblemShell__Group__04975 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProblemShell__Group__1_in_rule__ProblemShell__Group__04978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ProblemShell__Group__0__Impl5006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemShell__Group__1__Impl_in_rule__ProblemShell__Group__15037 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__ProblemShell__Group__2_in_rule__ProblemShell__Group__15040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemShell__ProblemAssignment_1_in_rule__ProblemShell__Group__1__Impl5067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemShell__Group__2__Impl_in_rule__ProblemShell__Group__25097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ProblemShell__Group__2__Impl5125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Group__0__Impl_in_rule__Negation__Group__05162 = new BitSet(new long[]{0x0000002A0001E010L});
    public static final BitSet FOLLOW_rule__Negation__Group__1_in_rule__Negation__Group__05165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Negation__Group__0__Impl5193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Group__1__Impl_in_rule__Negation__Group__15224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__NegatedAssignment_1_in_rule__Negation__Group__1__Impl5251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__0__Impl_in_rule__Quantifier__Group__05285 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__1_in_rule__Quantifier__Group__05288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__QuantifierAssignment_0_in_rule__Quantifier__Group__0__Impl5315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__1__Impl_in_rule__Quantifier__Group__15345 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__2_in_rule__Quantifier__Group__15348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Quantifier__Group__1__Impl5376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__2__Impl_in_rule__Quantifier__Group__25407 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__3_in_rule__Quantifier__Group__25410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__SubjectAssignment_2_in_rule__Quantifier__Group__2__Impl5437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__3__Impl_in_rule__Quantifier__Group__35467 = new BitSet(new long[]{0x0000002A0001E010L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__4_in_rule__Quantifier__Group__35470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Quantifier__Group__3__Impl5498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__4__Impl_in_rule__Quantifier__Group__45529 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__5_in_rule__Quantifier__Group__45532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__PredicateAssignment_4_in_rule__Quantifier__Group__4__Impl5559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group__5__Impl_in_rule__Quantifier__Group__55589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Quantifier__Group__5__Impl5617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarAtomic__Group__0__Impl_in_rule__SugarAtomic__Group__05660 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__SugarAtomic__Group__1_in_rule__SugarAtomic__Group__05663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarAtomic__FunctionAssignment_0_in_rule__SugarAtomic__Group__0__Impl5690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarAtomic__Group__1__Impl_in_rule__SugarAtomic__Group__15720 = new BitSet(new long[]{0x0000000600000030L});
    public static final BitSet FOLLOW_rule__SugarAtomic__Group__2_in_rule__SugarAtomic__Group__15723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__SugarAtomic__Group__1__Impl5751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarAtomic__Group__2__Impl_in_rule__SugarAtomic__Group__25782 = new BitSet(new long[]{0x0000000600000030L});
    public static final BitSet FOLLOW_rule__SugarAtomic__Group__3_in_rule__SugarAtomic__Group__25785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarAtomic__Group_2__0_in_rule__SugarAtomic__Group__2__Impl5812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarAtomic__Group__3__Impl_in_rule__SugarAtomic__Group__35843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__SugarAtomic__Group__3__Impl5871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarAtomic__Group_2__0__Impl_in_rule__SugarAtomic__Group_2__05910 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__SugarAtomic__Group_2__1_in_rule__SugarAtomic__Group_2__05913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarAtomic__ArgsAssignment_2_0_in_rule__SugarAtomic__Group_2__0__Impl5940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarAtomic__Group_2__1__Impl_in_rule__SugarAtomic__Group_2__15970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarAtomic__Group_2_1__0_in_rule__SugarAtomic__Group_2__1__Impl5997 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__SugarAtomic__Group_2_1__0__Impl_in_rule__SugarAtomic__Group_2_1__06032 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_rule__SugarAtomic__Group_2_1__1_in_rule__SugarAtomic__Group_2_1__06035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__SugarAtomic__Group_2_1__0__Impl6063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarAtomic__Group_2_1__1__Impl_in_rule__SugarAtomic__Group_2_1__16094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarAtomic__ArgsAssignment_2_1_1_in_rule__SugarAtomic__Group_2_1__1__Impl6121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group__0__Impl_in_rule__Atomic__Group__06155 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Atomic__Group__1_in_rule__Atomic__Group__06158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__FunctionAssignment_0_in_rule__Atomic__Group__0__Impl6185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group__1__Impl_in_rule__Atomic__Group__16215 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_rule__Atomic__Group__2_in_rule__Atomic__Group__16218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Atomic__Group__1__Impl6246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group__2__Impl_in_rule__Atomic__Group__26277 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_rule__Atomic__Group__3_in_rule__Atomic__Group__26280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__0_in_rule__Atomic__Group__2__Impl6307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group__3__Impl_in_rule__Atomic__Group__36338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Atomic__Group__3__Impl6366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__06405 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__06408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ArgsAssignment_2_0_in_rule__Atomic__Group_2__0__Impl6435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__16465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2_1__0_in_rule__Atomic__Group_2__1__Impl6492 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2_1__0__Impl_in_rule__Atomic__Group_2_1__06527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2_1__1_in_rule__Atomic__Group_2_1__06530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Atomic__Group_2_1__0__Impl6558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2_1__1__Impl_in_rule__Atomic__Group_2_1__16589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ArgsAssignment_2_1_1_in_rule__Atomic__Group_2_1__1__Impl6616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__0__Impl_in_rule__Theorem__Group__06650 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_rule__Theorem__Group__1_in_rule__Theorem__Group__06653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__RequirementAssignment_0_in_rule__Theorem__Group__0__Impl6680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__1__Impl_in_rule__Theorem__Group__16710 = new BitSet(new long[]{0x0000002A0001E010L});
    public static final BitSet FOLLOW_rule__Theorem__Group__2_in_rule__Theorem__Group__16713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__ImplicationAssignment_1_in_rule__Theorem__Group__1__Impl6740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__2__Impl_in_rule__Theorem__Group__26770 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Theorem__Group__3_in_rule__Theorem__Group__26773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__ResultAssignment_2_in_rule__Theorem__Group__2__Impl6800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__3__Impl_in_rule__Theorem__Group__36830 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Theorem__Group__4_in_rule__Theorem__Group__36833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Theorem__Group__3__Impl6861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__4__Impl_in_rule__Theorem__Group__46892 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Theorem__Group__5_in_rule__Theorem__Group__46895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__CostAssignment_4_in_rule__Theorem__Group__4__Impl6922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__5__Impl_in_rule__Theorem__Group__56952 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Theorem__Group__6_in_rule__Theorem__Group__56955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Theorem__Group__5__Impl6983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__6__Impl_in_rule__Theorem__Group__67014 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Theorem__Group__7_in_rule__Theorem__Group__67017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__DescriptionAssignment_6_in_rule__Theorem__Group__6__Impl7044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group__7__Impl_in_rule__Theorem__Group__77074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group_7__0_in_rule__Theorem__Group__7__Impl7101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group_7__0__Impl_in_rule__Theorem__Group_7__07148 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Theorem__Group_7__1_in_rule__Theorem__Group_7__07151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Theorem__Group_7__0__Impl7179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__Group_7__1__Impl_in_rule__Theorem__Group_7__17210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__PseudoCodeAssignment_7_1_in_rule__Theorem__Group_7__1__Impl7237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarAddition__Group__0__Impl_in_rule__SugarAddition__Group__07271 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__SugarAddition__Group__1_in_rule__SugarAddition__Group__07274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSugarMultiplication_in_rule__SugarAddition__Group__0__Impl7301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarAddition__Group__1__Impl_in_rule__SugarAddition__Group__17330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarAddition__Group_1__0_in_rule__SugarAddition__Group__1__Impl7357 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_rule__SugarAddition__Group_1__0__Impl_in_rule__SugarAddition__Group_1__07392 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__SugarAddition__Group_1__1_in_rule__SugarAddition__Group_1__07395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarAddition__Group_1__1__Impl_in_rule__SugarAddition__Group_1__17453 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_rule__SugarAddition__Group_1__2_in_rule__SugarAddition__Group_1__17456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarAddition__SymbolAssignment_1_1_in_rule__SugarAddition__Group_1__1__Impl7483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarAddition__Group_1__2__Impl_in_rule__SugarAddition__Group_1__27513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarAddition__RightAssignment_1_2_in_rule__SugarAddition__Group_1__2__Impl7540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarMultiplication__Group__0__Impl_in_rule__SugarMultiplication__Group__07576 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__SugarMultiplication__Group__1_in_rule__SugarMultiplication__Group__07579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSugarNumericalPrimary_in_rule__SugarMultiplication__Group__0__Impl7606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarMultiplication__Group__1__Impl_in_rule__SugarMultiplication__Group__17635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarMultiplication__Group_1__0_in_rule__SugarMultiplication__Group__1__Impl7662 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_rule__SugarMultiplication__Group_1__0__Impl_in_rule__SugarMultiplication__Group_1__07697 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__SugarMultiplication__Group_1__1_in_rule__SugarMultiplication__Group_1__07700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarMultiplication__Group_1__1__Impl_in_rule__SugarMultiplication__Group_1__17758 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_rule__SugarMultiplication__Group_1__2_in_rule__SugarMultiplication__Group_1__17761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarMultiplication__SymbolAssignment_1_1_in_rule__SugarMultiplication__Group_1__1__Impl7788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarMultiplication__Group_1__2__Impl_in_rule__SugarMultiplication__Group_1__27818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarMultiplication__RightAssignment_1_2_in_rule__SugarMultiplication__Group_1__2__Impl7845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarNumericalPrimary__Group_3__0__Impl_in_rule__SugarNumericalPrimary__Group_3__07881 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_rule__SugarNumericalPrimary__Group_3__1_in_rule__SugarNumericalPrimary__Group_3__07884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__SugarNumericalPrimary__Group_3__0__Impl7912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarNumericalPrimary__Group_3__1__Impl_in_rule__SugarNumericalPrimary__Group_3__17943 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__SugarNumericalPrimary__Group_3__2_in_rule__SugarNumericalPrimary__Group_3__17946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSugarNumericalPrimary_in_rule__SugarNumericalPrimary__Group_3__1__Impl7973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarNumericalPrimary__Group_3__2__Impl_in_rule__SugarNumericalPrimary__Group_3__28002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__SugarNumericalPrimary__Group_3__2__Impl8030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblemPropertyOptional_in_rule__Input__GivenAssignment_18072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__TaskAlternatives_3_0_0_0_in_rule__Input__TaskAssignment_3_0_08103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblem_in_rule__Input__GoalAssignment_3_0_18136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Input__TaskAssignment_3_1_08172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__GoalAlternatives_3_1_1_0_in_rule__Input__GoalAssignment_3_1_18211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTheorem_in_rule__Input__TheoremsAssignment_4_28244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTheorem_in_rule__Input__TheoremsAssignment_4_3_18275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_rule__ProblemNoVars__PropertyAssignment8306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__ProblemPropertyOptional__VarsAssignment_08337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__ProblemPropertyOptional__VarsAssignment_1_18368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_rule__ProblemPropertyOptional__PropertyAssignment_2_18399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__Problem__VarsAssignment_08430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__Problem__VarsAssignment_1_18461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_rule__Problem__PropertyAssignment_38492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Declaration__TypeAssignment_08523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Declaration__VarNameAssignment_18554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Type__NameAssignment_08585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Type__TemplateTypeAssignment_1_18616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANDing_in_rule__ORing__RightAssignment_1_28647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__ANDing__RightAssignment_1_28678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblem_in_rule__ProblemShell__ProblemAssignment_18709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__Negation__NegatedAssignment_18740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__QuantifierAlternatives_0_0_in_rule__Quantifier__QuantifierAssignment_08771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblem_in_rule__Quantifier__SubjectAssignment_28804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_rule__Quantifier__PredicateAssignment_48835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SugarAtomic__FunctionAssignment_08866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSugarAddition_in_rule__SugarAtomic__ArgsAssignment_2_08897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSugarAddition_in_rule__SugarAtomic__ArgsAssignment_2_1_18928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Atomic__FunctionAssignment_08959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Atomic__ArgsAssignment_2_08990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Atomic__ArgsAssignment_2_1_19021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAlternatives_0_in_rule__BooleanLiteral__ValueAssignment9052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_rule__Theorem__RequirementAssignment_09085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Theorem__ImplicationAlternatives_1_0_in_rule__Theorem__ImplicationAssignment_19116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORing_in_rule__Theorem__ResultAssignment_29149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Theorem__CostAssignment_49180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Theorem__DescriptionAssignment_69211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Theorem__PseudoCodeAssignment_7_19242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarAddition__SymbolAlternatives_1_1_0_in_rule__SugarAddition__SymbolAssignment_1_19273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSugarMultiplication_in_rule__SugarAddition__RightAssignment_1_29306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SugarMultiplication__SymbolAlternatives_1_1_0_in_rule__SugarMultiplication__SymbolAssignment_1_19337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSugarNumericalPrimary_in_rule__SugarMultiplication__RightAssignment_1_29370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NumberLiteral__ValueAssignment9401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_synpred4_InternalInput1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSugarAtomic_in_synpred5_InternalInput1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_synpred17_InternalInput1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSugarAtomic_in_synpred18_InternalInput1899 = new BitSet(new long[]{0x0000000000000002L});

}