package edu.kit.ipd.sdq.cbsmdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import edu.kit.ipd.sdq.cbsmdsl.services.CbsmDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCbsmDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Repository'", "'{'", "'interfaces'", "','", "'}'", "'components'", "'dataTypes'", "'System'", "'providedRoles'", "'requiredRoles'", "'containedAssemblyContexts'", "'systemConnectors'", "'Environment'", "'containers'", "'links'", "'Allocation'", "'allocationContexts'", "'Interface'", "'signatures'", "'Component'", "'behaviorDescriptions'", "'CompositeComponent'", "'Signature'", "'returnType'", "'parameters'", "'Parameter'", "'type'", "'ProvidedRole'", "'providedInterface'", "'RequiredRole'", "'requiredInterface'", "'BehaviorDescription'", "'actions'", "'InternalAction'", "'predecessor'", "'successor'", "'ExternalCall'", "'requiredService'", "'requiredRoleOfService'", "'Loop'", "'loopBehavior'", "'Branch'", "'branchPaths'", "'BranchPath'", "'branchBehavior'", "'ComplexType'", "'SimpleType'", "'typeInstance'", "'AssemblyContext'", "'instantiatedComponent'", "'ProvidedDelegationConnector'", "'innerAssemblyContext'", "'outerAssemblyContext'", "'innerProvidedRole'", "'outerProvidedRole'", "'RequiredDelegationConnector'", "'innerRequiredRole'", "'outerRequiredRole'", "'AssemblyConnector'", "'connectedProvidedRole'", "'connectedRequiredRole'", "'connectedProvidedAssemblyContext'", "'connectedRequiredAssemblyContext'", "'Container'", "'Link'", "'linkedContainers'", "'('", "')'", "'AllocationContext'", "'allocatedContainer'", "'allocatedAssemblyContext'", "'Boolean'", "'Char'", "'Date'", "'Double'", "'Float'", "'List'", "'Int'", "'Long'", "'Map'", "'String'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalCbsmDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCbsmDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCbsmDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCbsmDsl.g"; }



     	private CbsmDslGrammarAccess grammarAccess;

        public InternalCbsmDslParser(TokenStream input, CbsmDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ViewType";
       	}

       	@Override
       	protected CbsmDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleViewType"
    // InternalCbsmDsl.g:65:1: entryRuleViewType returns [EObject current=null] : iv_ruleViewType= ruleViewType EOF ;
    public final EObject entryRuleViewType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewType = null;


        try {
            // InternalCbsmDsl.g:65:49: (iv_ruleViewType= ruleViewType EOF )
            // InternalCbsmDsl.g:66:2: iv_ruleViewType= ruleViewType EOF
            {
             newCompositeNode(grammarAccess.getViewTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleViewType=ruleViewType();

            state._fsp--;

             current =iv_ruleViewType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleViewType"


    // $ANTLR start "ruleViewType"
    // InternalCbsmDsl.g:72:1: ruleViewType returns [EObject current=null] : (this_Repository_0= ruleRepository | this_System_1= ruleSystem | this_Environment_2= ruleEnvironment | this_Allocation_3= ruleAllocation ) ;
    public final EObject ruleViewType() throws RecognitionException {
        EObject current = null;

        EObject this_Repository_0 = null;

        EObject this_System_1 = null;

        EObject this_Environment_2 = null;

        EObject this_Allocation_3 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:78:2: ( (this_Repository_0= ruleRepository | this_System_1= ruleSystem | this_Environment_2= ruleEnvironment | this_Allocation_3= ruleAllocation ) )
            // InternalCbsmDsl.g:79:2: (this_Repository_0= ruleRepository | this_System_1= ruleSystem | this_Environment_2= ruleEnvironment | this_Allocation_3= ruleAllocation )
            {
            // InternalCbsmDsl.g:79:2: (this_Repository_0= ruleRepository | this_System_1= ruleSystem | this_Environment_2= ruleEnvironment | this_Allocation_3= ruleAllocation )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 18:
                {
                alt1=2;
                }
                break;
            case 23:
                {
                alt1=3;
                }
                break;
            case 26:
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
                    // InternalCbsmDsl.g:80:3: this_Repository_0= ruleRepository
                    {

                    			newCompositeNode(grammarAccess.getViewTypeAccess().getRepositoryParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Repository_0=ruleRepository();

                    state._fsp--;


                    			current = this_Repository_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCbsmDsl.g:89:3: this_System_1= ruleSystem
                    {

                    			newCompositeNode(grammarAccess.getViewTypeAccess().getSystemParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_System_1=ruleSystem();

                    state._fsp--;


                    			current = this_System_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCbsmDsl.g:98:3: this_Environment_2= ruleEnvironment
                    {

                    			newCompositeNode(grammarAccess.getViewTypeAccess().getEnvironmentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Environment_2=ruleEnvironment();

                    state._fsp--;


                    			current = this_Environment_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCbsmDsl.g:107:3: this_Allocation_3= ruleAllocation
                    {

                    			newCompositeNode(grammarAccess.getViewTypeAccess().getAllocationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Allocation_3=ruleAllocation();

                    state._fsp--;


                    			current = this_Allocation_3;
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
    // $ANTLR end "ruleViewType"


    // $ANTLR start "entryRuleDataType"
    // InternalCbsmDsl.g:119:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalCbsmDsl.g:119:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalCbsmDsl.g:120:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalCbsmDsl.g:126:1: ruleDataType returns [EObject current=null] : (this_ComplexType_0= ruleComplexType | this_SimpleType_1= ruleSimpleType ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        EObject this_ComplexType_0 = null;

        EObject this_SimpleType_1 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:132:2: ( (this_ComplexType_0= ruleComplexType | this_SimpleType_1= ruleSimpleType ) )
            // InternalCbsmDsl.g:133:2: (this_ComplexType_0= ruleComplexType | this_SimpleType_1= ruleSimpleType )
            {
            // InternalCbsmDsl.g:133:2: (this_ComplexType_0= ruleComplexType | this_SimpleType_1= ruleSimpleType )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==56) ) {
                alt2=1;
            }
            else if ( (LA2_0==57) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCbsmDsl.g:134:3: this_ComplexType_0= ruleComplexType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getComplexTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComplexType_0=ruleComplexType();

                    state._fsp--;


                    			current = this_ComplexType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCbsmDsl.g:143:3: this_SimpleType_1= ruleSimpleType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getSimpleTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleType_1=ruleSimpleType();

                    state._fsp--;


                    			current = this_SimpleType_1;
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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleConnector"
    // InternalCbsmDsl.g:155:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // InternalCbsmDsl.g:155:50: (iv_ruleConnector= ruleConnector EOF )
            // InternalCbsmDsl.g:156:2: iv_ruleConnector= ruleConnector EOF
            {
             newCompositeNode(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnector=ruleConnector();

            state._fsp--;

             current =iv_ruleConnector; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // InternalCbsmDsl.g:162:1: ruleConnector returns [EObject current=null] : (this_ProvidedDelegationConnector_0= ruleProvidedDelegationConnector | this_RequiredDelegationConnector_1= ruleRequiredDelegationConnector | this_AssemblyConnector_2= ruleAssemblyConnector ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        EObject this_ProvidedDelegationConnector_0 = null;

        EObject this_RequiredDelegationConnector_1 = null;

        EObject this_AssemblyConnector_2 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:168:2: ( (this_ProvidedDelegationConnector_0= ruleProvidedDelegationConnector | this_RequiredDelegationConnector_1= ruleRequiredDelegationConnector | this_AssemblyConnector_2= ruleAssemblyConnector ) )
            // InternalCbsmDsl.g:169:2: (this_ProvidedDelegationConnector_0= ruleProvidedDelegationConnector | this_RequiredDelegationConnector_1= ruleRequiredDelegationConnector | this_AssemblyConnector_2= ruleAssemblyConnector )
            {
            // InternalCbsmDsl.g:169:2: (this_ProvidedDelegationConnector_0= ruleProvidedDelegationConnector | this_RequiredDelegationConnector_1= ruleRequiredDelegationConnector | this_AssemblyConnector_2= ruleAssemblyConnector )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt3=1;
                }
                break;
            case 66:
                {
                alt3=2;
                }
                break;
            case 69:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalCbsmDsl.g:170:3: this_ProvidedDelegationConnector_0= ruleProvidedDelegationConnector
                    {

                    			newCompositeNode(grammarAccess.getConnectorAccess().getProvidedDelegationConnectorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProvidedDelegationConnector_0=ruleProvidedDelegationConnector();

                    state._fsp--;


                    			current = this_ProvidedDelegationConnector_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCbsmDsl.g:179:3: this_RequiredDelegationConnector_1= ruleRequiredDelegationConnector
                    {

                    			newCompositeNode(grammarAccess.getConnectorAccess().getRequiredDelegationConnectorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RequiredDelegationConnector_1=ruleRequiredDelegationConnector();

                    state._fsp--;


                    			current = this_RequiredDelegationConnector_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCbsmDsl.g:188:3: this_AssemblyConnector_2= ruleAssemblyConnector
                    {

                    			newCompositeNode(grammarAccess.getConnectorAccess().getAssemblyConnectorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssemblyConnector_2=ruleAssemblyConnector();

                    state._fsp--;


                    			current = this_AssemblyConnector_2;
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
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRuleAction"
    // InternalCbsmDsl.g:200:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalCbsmDsl.g:200:47: (iv_ruleAction= ruleAction EOF )
            // InternalCbsmDsl.g:201:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalCbsmDsl.g:207:1: ruleAction returns [EObject current=null] : (this_InternalAction_0= ruleInternalAction | this_ExternalCall_1= ruleExternalCall | this_Loop_2= ruleLoop | this_Branch_3= ruleBranch ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_InternalAction_0 = null;

        EObject this_ExternalCall_1 = null;

        EObject this_Loop_2 = null;

        EObject this_Branch_3 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:213:2: ( (this_InternalAction_0= ruleInternalAction | this_ExternalCall_1= ruleExternalCall | this_Loop_2= ruleLoop | this_Branch_3= ruleBranch ) )
            // InternalCbsmDsl.g:214:2: (this_InternalAction_0= ruleInternalAction | this_ExternalCall_1= ruleExternalCall | this_Loop_2= ruleLoop | this_Branch_3= ruleBranch )
            {
            // InternalCbsmDsl.g:214:2: (this_InternalAction_0= ruleInternalAction | this_ExternalCall_1= ruleExternalCall | this_Loop_2= ruleLoop | this_Branch_3= ruleBranch )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt4=1;
                }
                break;
            case 47:
                {
                alt4=2;
                }
                break;
            case 50:
                {
                alt4=3;
                }
                break;
            case 52:
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
                    // InternalCbsmDsl.g:215:3: this_InternalAction_0= ruleInternalAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getInternalActionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_InternalAction_0=ruleInternalAction();

                    state._fsp--;


                    			current = this_InternalAction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCbsmDsl.g:224:3: this_ExternalCall_1= ruleExternalCall
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getExternalCallParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalCall_1=ruleExternalCall();

                    state._fsp--;


                    			current = this_ExternalCall_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCbsmDsl.g:233:3: this_Loop_2= ruleLoop
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getLoopParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Loop_2=ruleLoop();

                    state._fsp--;


                    			current = this_Loop_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCbsmDsl.g:242:3: this_Branch_3= ruleBranch
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getBranchParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Branch_3=ruleBranch();

                    state._fsp--;


                    			current = this_Branch_3;
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleRepository"
    // InternalCbsmDsl.g:254:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // InternalCbsmDsl.g:254:51: (iv_ruleRepository= ruleRepository EOF )
            // InternalCbsmDsl.g:255:2: iv_ruleRepository= ruleRepository EOF
            {
             newCompositeNode(grammarAccess.getRepositoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepository=ruleRepository();

            state._fsp--;

             current =iv_ruleRepository; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRepository"


    // $ANTLR start "ruleRepository"
    // InternalCbsmDsl.g:261:1: ruleRepository returns [EObject current=null] : ( () otherlv_1= 'Repository' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'interfaces' otherlv_5= '{' ( (lv_interfaces_6_0= ruleInterface ) ) (otherlv_7= ',' ( (lv_interfaces_8_0= ruleInterface ) ) )* otherlv_9= '}' )? (otherlv_10= 'components' otherlv_11= '{' ( (lv_components_12_0= ruleComponent ) ) (otherlv_13= ',' ( (lv_components_14_0= ruleComponent ) ) )* otherlv_15= '}' )? (otherlv_16= 'dataTypes' otherlv_17= '{' ( (lv_dataTypes_18_0= ruleDataType ) ) (otherlv_19= ',' ( (lv_dataTypes_20_0= ruleDataType ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_interfaces_6_0 = null;

        EObject lv_interfaces_8_0 = null;

        EObject lv_components_12_0 = null;

        EObject lv_components_14_0 = null;

        EObject lv_dataTypes_18_0 = null;

        EObject lv_dataTypes_20_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:267:2: ( ( () otherlv_1= 'Repository' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'interfaces' otherlv_5= '{' ( (lv_interfaces_6_0= ruleInterface ) ) (otherlv_7= ',' ( (lv_interfaces_8_0= ruleInterface ) ) )* otherlv_9= '}' )? (otherlv_10= 'components' otherlv_11= '{' ( (lv_components_12_0= ruleComponent ) ) (otherlv_13= ',' ( (lv_components_14_0= ruleComponent ) ) )* otherlv_15= '}' )? (otherlv_16= 'dataTypes' otherlv_17= '{' ( (lv_dataTypes_18_0= ruleDataType ) ) (otherlv_19= ',' ( (lv_dataTypes_20_0= ruleDataType ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // InternalCbsmDsl.g:268:2: ( () otherlv_1= 'Repository' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'interfaces' otherlv_5= '{' ( (lv_interfaces_6_0= ruleInterface ) ) (otherlv_7= ',' ( (lv_interfaces_8_0= ruleInterface ) ) )* otherlv_9= '}' )? (otherlv_10= 'components' otherlv_11= '{' ( (lv_components_12_0= ruleComponent ) ) (otherlv_13= ',' ( (lv_components_14_0= ruleComponent ) ) )* otherlv_15= '}' )? (otherlv_16= 'dataTypes' otherlv_17= '{' ( (lv_dataTypes_18_0= ruleDataType ) ) (otherlv_19= ',' ( (lv_dataTypes_20_0= ruleDataType ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // InternalCbsmDsl.g:268:2: ( () otherlv_1= 'Repository' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'interfaces' otherlv_5= '{' ( (lv_interfaces_6_0= ruleInterface ) ) (otherlv_7= ',' ( (lv_interfaces_8_0= ruleInterface ) ) )* otherlv_9= '}' )? (otherlv_10= 'components' otherlv_11= '{' ( (lv_components_12_0= ruleComponent ) ) (otherlv_13= ',' ( (lv_components_14_0= ruleComponent ) ) )* otherlv_15= '}' )? (otherlv_16= 'dataTypes' otherlv_17= '{' ( (lv_dataTypes_18_0= ruleDataType ) ) (otherlv_19= ',' ( (lv_dataTypes_20_0= ruleDataType ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // InternalCbsmDsl.g:269:3: () otherlv_1= 'Repository' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'interfaces' otherlv_5= '{' ( (lv_interfaces_6_0= ruleInterface ) ) (otherlv_7= ',' ( (lv_interfaces_8_0= ruleInterface ) ) )* otherlv_9= '}' )? (otherlv_10= 'components' otherlv_11= '{' ( (lv_components_12_0= ruleComponent ) ) (otherlv_13= ',' ( (lv_components_14_0= ruleComponent ) ) )* otherlv_15= '}' )? (otherlv_16= 'dataTypes' otherlv_17= '{' ( (lv_dataTypes_18_0= ruleDataType ) ) (otherlv_19= ',' ( (lv_dataTypes_20_0= ruleDataType ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // InternalCbsmDsl.g:269:3: ()
            // InternalCbsmDsl.g:270:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRepositoryAccess().getRepositoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRepositoryAccess().getRepositoryKeyword_1());
            		
            // InternalCbsmDsl.g:280:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCbsmDsl.g:281:4: (lv_name_2_0= ruleEString )
            {
            // InternalCbsmDsl.g:281:4: (lv_name_2_0= ruleEString )
            // InternalCbsmDsl.g:282:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRepositoryAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepositoryRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCbsmDsl.g:303:3: (otherlv_4= 'interfaces' otherlv_5= '{' ( (lv_interfaces_6_0= ruleInterface ) ) (otherlv_7= ',' ( (lv_interfaces_8_0= ruleInterface ) ) )* otherlv_9= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCbsmDsl.g:304:4: otherlv_4= 'interfaces' otherlv_5= '{' ( (lv_interfaces_6_0= ruleInterface ) ) (otherlv_7= ',' ( (lv_interfaces_8_0= ruleInterface ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getRepositoryAccess().getInterfacesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCbsmDsl.g:312:4: ( (lv_interfaces_6_0= ruleInterface ) )
                    // InternalCbsmDsl.g:313:5: (lv_interfaces_6_0= ruleInterface )
                    {
                    // InternalCbsmDsl.g:313:5: (lv_interfaces_6_0= ruleInterface )
                    // InternalCbsmDsl.g:314:6: lv_interfaces_6_0= ruleInterface
                    {

                    						newCompositeNode(grammarAccess.getRepositoryAccess().getInterfacesInterfaceParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_interfaces_6_0=ruleInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    						}
                    						add(
                    							current,
                    							"interfaces",
                    							lv_interfaces_6_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.Interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:331:4: (otherlv_7= ',' ( (lv_interfaces_8_0= ruleInterface ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:332:5: otherlv_7= ',' ( (lv_interfaces_8_0= ruleInterface ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getRepositoryAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:336:5: ( (lv_interfaces_8_0= ruleInterface ) )
                    	    // InternalCbsmDsl.g:337:6: (lv_interfaces_8_0= ruleInterface )
                    	    {
                    	    // InternalCbsmDsl.g:337:6: (lv_interfaces_8_0= ruleInterface )
                    	    // InternalCbsmDsl.g:338:7: lv_interfaces_8_0= ruleInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepositoryAccess().getInterfacesInterfaceParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_interfaces_8_0=ruleInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interfaces",
                    	    								lv_interfaces_8_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.Interface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalCbsmDsl.g:361:3: (otherlv_10= 'components' otherlv_11= '{' ( (lv_components_12_0= ruleComponent ) ) (otherlv_13= ',' ( (lv_components_14_0= ruleComponent ) ) )* otherlv_15= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCbsmDsl.g:362:4: otherlv_10= 'components' otherlv_11= '{' ( (lv_components_12_0= ruleComponent ) ) (otherlv_13= ',' ( (lv_components_14_0= ruleComponent ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getRepositoryAccess().getComponentsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCbsmDsl.g:370:4: ( (lv_components_12_0= ruleComponent ) )
                    // InternalCbsmDsl.g:371:5: (lv_components_12_0= ruleComponent )
                    {
                    // InternalCbsmDsl.g:371:5: (lv_components_12_0= ruleComponent )
                    // InternalCbsmDsl.g:372:6: lv_components_12_0= ruleComponent
                    {

                    						newCompositeNode(grammarAccess.getRepositoryAccess().getComponentsComponentParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_components_12_0=ruleComponent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    						}
                    						add(
                    							current,
                    							"components",
                    							lv_components_12_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.Component");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:389:4: (otherlv_13= ',' ( (lv_components_14_0= ruleComponent ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:390:5: otherlv_13= ',' ( (lv_components_14_0= ruleComponent ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getRepositoryAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:394:5: ( (lv_components_14_0= ruleComponent ) )
                    	    // InternalCbsmDsl.g:395:6: (lv_components_14_0= ruleComponent )
                    	    {
                    	    // InternalCbsmDsl.g:395:6: (lv_components_14_0= ruleComponent )
                    	    // InternalCbsmDsl.g:396:7: lv_components_14_0= ruleComponent
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepositoryAccess().getComponentsComponentParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_components_14_0=ruleComponent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"components",
                    	    								lv_components_14_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.Component");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_15, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalCbsmDsl.g:419:3: (otherlv_16= 'dataTypes' otherlv_17= '{' ( (lv_dataTypes_18_0= ruleDataType ) ) (otherlv_19= ',' ( (lv_dataTypes_20_0= ruleDataType ) ) )* otherlv_21= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCbsmDsl.g:420:4: otherlv_16= 'dataTypes' otherlv_17= '{' ( (lv_dataTypes_18_0= ruleDataType ) ) (otherlv_19= ',' ( (lv_dataTypes_20_0= ruleDataType ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getRepositoryAccess().getDataTypesKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_17, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCbsmDsl.g:428:4: ( (lv_dataTypes_18_0= ruleDataType ) )
                    // InternalCbsmDsl.g:429:5: (lv_dataTypes_18_0= ruleDataType )
                    {
                    // InternalCbsmDsl.g:429:5: (lv_dataTypes_18_0= ruleDataType )
                    // InternalCbsmDsl.g:430:6: lv_dataTypes_18_0= ruleDataType
                    {

                    						newCompositeNode(grammarAccess.getRepositoryAccess().getDataTypesDataTypeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_dataTypes_18_0=ruleDataType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    						}
                    						add(
                    							current,
                    							"dataTypes",
                    							lv_dataTypes_18_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.DataType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:447:4: (otherlv_19= ',' ( (lv_dataTypes_20_0= ruleDataType ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:448:5: otherlv_19= ',' ( (lv_dataTypes_20_0= ruleDataType ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_11); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getRepositoryAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:452:5: ( (lv_dataTypes_20_0= ruleDataType ) )
                    	    // InternalCbsmDsl.g:453:6: (lv_dataTypes_20_0= ruleDataType )
                    	    {
                    	    // InternalCbsmDsl.g:453:6: (lv_dataTypes_20_0= ruleDataType )
                    	    // InternalCbsmDsl.g:454:7: lv_dataTypes_20_0= ruleDataType
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepositoryAccess().getDataTypesDataTypeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_dataTypes_20_0=ruleDataType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"dataTypes",
                    	    								lv_dataTypes_20_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.DataType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_21, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleRepository"


    // $ANTLR start "entryRuleSystem"
    // InternalCbsmDsl.g:485:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalCbsmDsl.g:485:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalCbsmDsl.g:486:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalCbsmDsl.g:492:1: ruleSystem returns [EObject current=null] : ( () otherlv_1= 'System' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providedRoles' otherlv_5= '{' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= '}' )? (otherlv_10= 'requiredRoles' otherlv_11= '{' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= '}' )? (otherlv_16= 'containedAssemblyContexts' otherlv_17= '{' ( (lv_containedAssemblyContexts_18_0= ruleAssemblyContext ) ) (otherlv_19= ',' ( (lv_containedAssemblyContexts_20_0= ruleAssemblyContext ) ) )* otherlv_21= '}' )? (otherlv_22= 'systemConnectors' otherlv_23= '{' ( (lv_systemConnectors_24_0= ruleConnector ) ) (otherlv_25= ',' ( (lv_systemConnectors_26_0= ruleConnector ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_providedRoles_6_0 = null;

        EObject lv_providedRoles_8_0 = null;

        EObject lv_requiredRoles_12_0 = null;

        EObject lv_requiredRoles_14_0 = null;

        EObject lv_containedAssemblyContexts_18_0 = null;

        EObject lv_containedAssemblyContexts_20_0 = null;

        EObject lv_systemConnectors_24_0 = null;

        EObject lv_systemConnectors_26_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:498:2: ( ( () otherlv_1= 'System' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providedRoles' otherlv_5= '{' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= '}' )? (otherlv_10= 'requiredRoles' otherlv_11= '{' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= '}' )? (otherlv_16= 'containedAssemblyContexts' otherlv_17= '{' ( (lv_containedAssemblyContexts_18_0= ruleAssemblyContext ) ) (otherlv_19= ',' ( (lv_containedAssemblyContexts_20_0= ruleAssemblyContext ) ) )* otherlv_21= '}' )? (otherlv_22= 'systemConnectors' otherlv_23= '{' ( (lv_systemConnectors_24_0= ruleConnector ) ) (otherlv_25= ',' ( (lv_systemConnectors_26_0= ruleConnector ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) )
            // InternalCbsmDsl.g:499:2: ( () otherlv_1= 'System' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providedRoles' otherlv_5= '{' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= '}' )? (otherlv_10= 'requiredRoles' otherlv_11= '{' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= '}' )? (otherlv_16= 'containedAssemblyContexts' otherlv_17= '{' ( (lv_containedAssemblyContexts_18_0= ruleAssemblyContext ) ) (otherlv_19= ',' ( (lv_containedAssemblyContexts_20_0= ruleAssemblyContext ) ) )* otherlv_21= '}' )? (otherlv_22= 'systemConnectors' otherlv_23= '{' ( (lv_systemConnectors_24_0= ruleConnector ) ) (otherlv_25= ',' ( (lv_systemConnectors_26_0= ruleConnector ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            {
            // InternalCbsmDsl.g:499:2: ( () otherlv_1= 'System' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providedRoles' otherlv_5= '{' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= '}' )? (otherlv_10= 'requiredRoles' otherlv_11= '{' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= '}' )? (otherlv_16= 'containedAssemblyContexts' otherlv_17= '{' ( (lv_containedAssemblyContexts_18_0= ruleAssemblyContext ) ) (otherlv_19= ',' ( (lv_containedAssemblyContexts_20_0= ruleAssemblyContext ) ) )* otherlv_21= '}' )? (otherlv_22= 'systemConnectors' otherlv_23= '{' ( (lv_systemConnectors_24_0= ruleConnector ) ) (otherlv_25= ',' ( (lv_systemConnectors_26_0= ruleConnector ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            // InternalCbsmDsl.g:500:3: () otherlv_1= 'System' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providedRoles' otherlv_5= '{' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= '}' )? (otherlv_10= 'requiredRoles' otherlv_11= '{' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= '}' )? (otherlv_16= 'containedAssemblyContexts' otherlv_17= '{' ( (lv_containedAssemblyContexts_18_0= ruleAssemblyContext ) ) (otherlv_19= ',' ( (lv_containedAssemblyContexts_20_0= ruleAssemblyContext ) ) )* otherlv_21= '}' )? (otherlv_22= 'systemConnectors' otherlv_23= '{' ( (lv_systemConnectors_24_0= ruleConnector ) ) (otherlv_25= ',' ( (lv_systemConnectors_26_0= ruleConnector ) ) )* otherlv_27= '}' )? otherlv_28= '}'
            {
            // InternalCbsmDsl.g:500:3: ()
            // InternalCbsmDsl.g:501:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSystemAccess().getSystemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemAccess().getSystemKeyword_1());
            		
            // InternalCbsmDsl.g:511:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCbsmDsl.g:512:4: (lv_name_2_0= ruleEString )
            {
            // InternalCbsmDsl.g:512:4: (lv_name_2_0= ruleEString )
            // InternalCbsmDsl.g:513:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSystemAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCbsmDsl.g:534:3: (otherlv_4= 'providedRoles' otherlv_5= '{' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCbsmDsl.g:535:4: otherlv_4= 'providedRoles' otherlv_5= '{' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getSystemAccess().getProvidedRolesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCbsmDsl.g:543:4: ( (lv_providedRoles_6_0= ruleProvidedRole ) )
                    // InternalCbsmDsl.g:544:5: (lv_providedRoles_6_0= ruleProvidedRole )
                    {
                    // InternalCbsmDsl.g:544:5: (lv_providedRoles_6_0= ruleProvidedRole )
                    // InternalCbsmDsl.g:545:6: lv_providedRoles_6_0= ruleProvidedRole
                    {

                    						newCompositeNode(grammarAccess.getSystemAccess().getProvidedRolesProvidedRoleParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_providedRoles_6_0=ruleProvidedRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemRule());
                    						}
                    						add(
                    							current,
                    							"providedRoles",
                    							lv_providedRoles_6_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.ProvidedRole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:562:4: (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:563:5: otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getSystemAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:567:5: ( (lv_providedRoles_8_0= ruleProvidedRole ) )
                    	    // InternalCbsmDsl.g:568:6: (lv_providedRoles_8_0= ruleProvidedRole )
                    	    {
                    	    // InternalCbsmDsl.g:568:6: (lv_providedRoles_8_0= ruleProvidedRole )
                    	    // InternalCbsmDsl.g:569:7: lv_providedRoles_8_0= ruleProvidedRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemAccess().getProvidedRolesProvidedRoleParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_providedRoles_8_0=ruleProvidedRole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"providedRoles",
                    	    								lv_providedRoles_8_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.ProvidedRole");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_9, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalCbsmDsl.g:592:3: (otherlv_10= 'requiredRoles' otherlv_11= '{' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCbsmDsl.g:593:4: otherlv_10= 'requiredRoles' otherlv_11= '{' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getSystemAccess().getRequiredRolesKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_11, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCbsmDsl.g:601:4: ( (lv_requiredRoles_12_0= ruleRequiredRole ) )
                    // InternalCbsmDsl.g:602:5: (lv_requiredRoles_12_0= ruleRequiredRole )
                    {
                    // InternalCbsmDsl.g:602:5: (lv_requiredRoles_12_0= ruleRequiredRole )
                    // InternalCbsmDsl.g:603:6: lv_requiredRoles_12_0= ruleRequiredRole
                    {

                    						newCompositeNode(grammarAccess.getSystemAccess().getRequiredRolesRequiredRoleParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_requiredRoles_12_0=ruleRequiredRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemRule());
                    						}
                    						add(
                    							current,
                    							"requiredRoles",
                    							lv_requiredRoles_12_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.RequiredRole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:620:4: (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:621:5: otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getSystemAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:625:5: ( (lv_requiredRoles_14_0= ruleRequiredRole ) )
                    	    // InternalCbsmDsl.g:626:6: (lv_requiredRoles_14_0= ruleRequiredRole )
                    	    {
                    	    // InternalCbsmDsl.g:626:6: (lv_requiredRoles_14_0= ruleRequiredRole )
                    	    // InternalCbsmDsl.g:627:7: lv_requiredRoles_14_0= ruleRequiredRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemAccess().getRequiredRolesRequiredRoleParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_requiredRoles_14_0=ruleRequiredRole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"requiredRoles",
                    	    								lv_requiredRoles_14_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.RequiredRole");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_17); 

                    				newLeafNode(otherlv_15, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalCbsmDsl.g:650:3: (otherlv_16= 'containedAssemblyContexts' otherlv_17= '{' ( (lv_containedAssemblyContexts_18_0= ruleAssemblyContext ) ) (otherlv_19= ',' ( (lv_containedAssemblyContexts_20_0= ruleAssemblyContext ) ) )* otherlv_21= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCbsmDsl.g:651:4: otherlv_16= 'containedAssemblyContexts' otherlv_17= '{' ( (lv_containedAssemblyContexts_18_0= ruleAssemblyContext ) ) (otherlv_19= ',' ( (lv_containedAssemblyContexts_20_0= ruleAssemblyContext ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getSystemAccess().getContainedAssemblyContextsKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_17, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCbsmDsl.g:659:4: ( (lv_containedAssemblyContexts_18_0= ruleAssemblyContext ) )
                    // InternalCbsmDsl.g:660:5: (lv_containedAssemblyContexts_18_0= ruleAssemblyContext )
                    {
                    // InternalCbsmDsl.g:660:5: (lv_containedAssemblyContexts_18_0= ruleAssemblyContext )
                    // InternalCbsmDsl.g:661:6: lv_containedAssemblyContexts_18_0= ruleAssemblyContext
                    {

                    						newCompositeNode(grammarAccess.getSystemAccess().getContainedAssemblyContextsAssemblyContextParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_containedAssemblyContexts_18_0=ruleAssemblyContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemRule());
                    						}
                    						add(
                    							current,
                    							"containedAssemblyContexts",
                    							lv_containedAssemblyContexts_18_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.AssemblyContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:678:4: (otherlv_19= ',' ( (lv_containedAssemblyContexts_20_0= ruleAssemblyContext ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==14) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:679:5: otherlv_19= ',' ( (lv_containedAssemblyContexts_20_0= ruleAssemblyContext ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_18); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getSystemAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:683:5: ( (lv_containedAssemblyContexts_20_0= ruleAssemblyContext ) )
                    	    // InternalCbsmDsl.g:684:6: (lv_containedAssemblyContexts_20_0= ruleAssemblyContext )
                    	    {
                    	    // InternalCbsmDsl.g:684:6: (lv_containedAssemblyContexts_20_0= ruleAssemblyContext )
                    	    // InternalCbsmDsl.g:685:7: lv_containedAssemblyContexts_20_0= ruleAssemblyContext
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemAccess().getContainedAssemblyContextsAssemblyContextParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_containedAssemblyContexts_20_0=ruleAssemblyContext();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"containedAssemblyContexts",
                    	    								lv_containedAssemblyContexts_20_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.AssemblyContext");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_19); 

                    				newLeafNode(otherlv_21, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalCbsmDsl.g:708:3: (otherlv_22= 'systemConnectors' otherlv_23= '{' ( (lv_systemConnectors_24_0= ruleConnector ) ) (otherlv_25= ',' ( (lv_systemConnectors_26_0= ruleConnector ) ) )* otherlv_27= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCbsmDsl.g:709:4: otherlv_22= 'systemConnectors' otherlv_23= '{' ( (lv_systemConnectors_24_0= ruleConnector ) ) (otherlv_25= ',' ( (lv_systemConnectors_26_0= ruleConnector ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getSystemAccess().getSystemConnectorsKeyword_7_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_20); 

                    				newLeafNode(otherlv_23, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalCbsmDsl.g:717:4: ( (lv_systemConnectors_24_0= ruleConnector ) )
                    // InternalCbsmDsl.g:718:5: (lv_systemConnectors_24_0= ruleConnector )
                    {
                    // InternalCbsmDsl.g:718:5: (lv_systemConnectors_24_0= ruleConnector )
                    // InternalCbsmDsl.g:719:6: lv_systemConnectors_24_0= ruleConnector
                    {

                    						newCompositeNode(grammarAccess.getSystemAccess().getSystemConnectorsConnectorParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_systemConnectors_24_0=ruleConnector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemRule());
                    						}
                    						add(
                    							current,
                    							"systemConnectors",
                    							lv_systemConnectors_24_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.Connector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:736:4: (otherlv_25= ',' ( (lv_systemConnectors_26_0= ruleConnector ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==14) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:737:5: otherlv_25= ',' ( (lv_systemConnectors_26_0= ruleConnector ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_20); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getSystemAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:741:5: ( (lv_systemConnectors_26_0= ruleConnector ) )
                    	    // InternalCbsmDsl.g:742:6: (lv_systemConnectors_26_0= ruleConnector )
                    	    {
                    	    // InternalCbsmDsl.g:742:6: (lv_systemConnectors_26_0= ruleConnector )
                    	    // InternalCbsmDsl.g:743:7: lv_systemConnectors_26_0= ruleConnector
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemAccess().getSystemConnectorsConnectorParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_systemConnectors_26_0=ruleConnector();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"systemConnectors",
                    	    								lv_systemConnectors_26_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.Connector");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_27, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_28=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleEnvironment"
    // InternalCbsmDsl.g:774:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalCbsmDsl.g:774:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalCbsmDsl.g:775:2: iv_ruleEnvironment= ruleEnvironment EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironment=ruleEnvironment();

            state._fsp--;

             current =iv_ruleEnvironment; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // InternalCbsmDsl.g:781:1: ruleEnvironment returns [EObject current=null] : ( () otherlv_1= 'Environment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'containers' otherlv_5= '{' ( (lv_containers_6_0= ruleContainer ) ) (otherlv_7= ',' ( (lv_containers_8_0= ruleContainer ) ) )* otherlv_9= '}' )? (otherlv_10= 'links' otherlv_11= '{' ( (lv_links_12_0= ruleLink ) ) (otherlv_13= ',' ( (lv_links_14_0= ruleLink ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_containers_6_0 = null;

        EObject lv_containers_8_0 = null;

        EObject lv_links_12_0 = null;

        EObject lv_links_14_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:787:2: ( ( () otherlv_1= 'Environment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'containers' otherlv_5= '{' ( (lv_containers_6_0= ruleContainer ) ) (otherlv_7= ',' ( (lv_containers_8_0= ruleContainer ) ) )* otherlv_9= '}' )? (otherlv_10= 'links' otherlv_11= '{' ( (lv_links_12_0= ruleLink ) ) (otherlv_13= ',' ( (lv_links_14_0= ruleLink ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalCbsmDsl.g:788:2: ( () otherlv_1= 'Environment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'containers' otherlv_5= '{' ( (lv_containers_6_0= ruleContainer ) ) (otherlv_7= ',' ( (lv_containers_8_0= ruleContainer ) ) )* otherlv_9= '}' )? (otherlv_10= 'links' otherlv_11= '{' ( (lv_links_12_0= ruleLink ) ) (otherlv_13= ',' ( (lv_links_14_0= ruleLink ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalCbsmDsl.g:788:2: ( () otherlv_1= 'Environment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'containers' otherlv_5= '{' ( (lv_containers_6_0= ruleContainer ) ) (otherlv_7= ',' ( (lv_containers_8_0= ruleContainer ) ) )* otherlv_9= '}' )? (otherlv_10= 'links' otherlv_11= '{' ( (lv_links_12_0= ruleLink ) ) (otherlv_13= ',' ( (lv_links_14_0= ruleLink ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalCbsmDsl.g:789:3: () otherlv_1= 'Environment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'containers' otherlv_5= '{' ( (lv_containers_6_0= ruleContainer ) ) (otherlv_7= ',' ( (lv_containers_8_0= ruleContainer ) ) )* otherlv_9= '}' )? (otherlv_10= 'links' otherlv_11= '{' ( (lv_links_12_0= ruleLink ) ) (otherlv_13= ',' ( (lv_links_14_0= ruleLink ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalCbsmDsl.g:789:3: ()
            // InternalCbsmDsl.g:790:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentAccess().getEnvironmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_1());
            		
            // InternalCbsmDsl.g:800:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCbsmDsl.g:801:4: (lv_name_2_0= ruleEString )
            {
            // InternalCbsmDsl.g:801:4: (lv_name_2_0= ruleEString )
            // InternalCbsmDsl.g:802:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnvironmentAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCbsmDsl.g:823:3: (otherlv_4= 'containers' otherlv_5= '{' ( (lv_containers_6_0= ruleContainer ) ) (otherlv_7= ',' ( (lv_containers_8_0= ruleContainer ) ) )* otherlv_9= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCbsmDsl.g:824:4: otherlv_4= 'containers' otherlv_5= '{' ( (lv_containers_6_0= ruleContainer ) ) (otherlv_7= ',' ( (lv_containers_8_0= ruleContainer ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getContainersKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_22); 

                    				newLeafNode(otherlv_5, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCbsmDsl.g:832:4: ( (lv_containers_6_0= ruleContainer ) )
                    // InternalCbsmDsl.g:833:5: (lv_containers_6_0= ruleContainer )
                    {
                    // InternalCbsmDsl.g:833:5: (lv_containers_6_0= ruleContainer )
                    // InternalCbsmDsl.g:834:6: lv_containers_6_0= ruleContainer
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentAccess().getContainersContainerParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_containers_6_0=ruleContainer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    						}
                    						add(
                    							current,
                    							"containers",
                    							lv_containers_6_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.Container");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:851:4: (otherlv_7= ',' ( (lv_containers_8_0= ruleContainer ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==14) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:852:5: otherlv_7= ',' ( (lv_containers_8_0= ruleContainer ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_22); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getEnvironmentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:856:5: ( (lv_containers_8_0= ruleContainer ) )
                    	    // InternalCbsmDsl.g:857:6: (lv_containers_8_0= ruleContainer )
                    	    {
                    	    // InternalCbsmDsl.g:857:6: (lv_containers_8_0= ruleContainer )
                    	    // InternalCbsmDsl.g:858:7: lv_containers_8_0= ruleContainer
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnvironmentAccess().getContainersContainerParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_containers_8_0=ruleContainer();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"containers",
                    	    								lv_containers_8_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.Container");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_23); 

                    				newLeafNode(otherlv_9, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalCbsmDsl.g:881:3: (otherlv_10= 'links' otherlv_11= '{' ( (lv_links_12_0= ruleLink ) ) (otherlv_13= ',' ( (lv_links_14_0= ruleLink ) ) )* otherlv_15= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==25) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCbsmDsl.g:882:4: otherlv_10= 'links' otherlv_11= '{' ( (lv_links_12_0= ruleLink ) ) (otherlv_13= ',' ( (lv_links_14_0= ruleLink ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getEnvironmentAccess().getLinksKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_11, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCbsmDsl.g:890:4: ( (lv_links_12_0= ruleLink ) )
                    // InternalCbsmDsl.g:891:5: (lv_links_12_0= ruleLink )
                    {
                    // InternalCbsmDsl.g:891:5: (lv_links_12_0= ruleLink )
                    // InternalCbsmDsl.g:892:6: lv_links_12_0= ruleLink
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentAccess().getLinksLinkParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_links_12_0=ruleLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    						}
                    						add(
                    							current,
                    							"links",
                    							lv_links_12_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.Link");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:909:4: (otherlv_13= ',' ( (lv_links_14_0= ruleLink ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==14) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:910:5: otherlv_13= ',' ( (lv_links_14_0= ruleLink ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_24); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEnvironmentAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:914:5: ( (lv_links_14_0= ruleLink ) )
                    	    // InternalCbsmDsl.g:915:6: (lv_links_14_0= ruleLink )
                    	    {
                    	    // InternalCbsmDsl.g:915:6: (lv_links_14_0= ruleLink )
                    	    // InternalCbsmDsl.g:916:7: lv_links_14_0= ruleLink
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnvironmentAccess().getLinksLinkParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_links_14_0=ruleLink();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"links",
                    	    								lv_links_14_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.Link");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_15, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleAllocation"
    // InternalCbsmDsl.g:947:1: entryRuleAllocation returns [EObject current=null] : iv_ruleAllocation= ruleAllocation EOF ;
    public final EObject entryRuleAllocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocation = null;


        try {
            // InternalCbsmDsl.g:947:51: (iv_ruleAllocation= ruleAllocation EOF )
            // InternalCbsmDsl.g:948:2: iv_ruleAllocation= ruleAllocation EOF
            {
             newCompositeNode(grammarAccess.getAllocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllocation=ruleAllocation();

            state._fsp--;

             current =iv_ruleAllocation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAllocation"


    // $ANTLR start "ruleAllocation"
    // InternalCbsmDsl.g:954:1: ruleAllocation returns [EObject current=null] : ( () otherlv_1= 'Allocation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'allocationContexts' otherlv_5= '{' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) (otherlv_7= ',' ( (lv_allocationContexts_8_0= ruleAllocationContext ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleAllocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_allocationContexts_6_0 = null;

        EObject lv_allocationContexts_8_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:960:2: ( ( () otherlv_1= 'Allocation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'allocationContexts' otherlv_5= '{' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) (otherlv_7= ',' ( (lv_allocationContexts_8_0= ruleAllocationContext ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalCbsmDsl.g:961:2: ( () otherlv_1= 'Allocation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'allocationContexts' otherlv_5= '{' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) (otherlv_7= ',' ( (lv_allocationContexts_8_0= ruleAllocationContext ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalCbsmDsl.g:961:2: ( () otherlv_1= 'Allocation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'allocationContexts' otherlv_5= '{' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) (otherlv_7= ',' ( (lv_allocationContexts_8_0= ruleAllocationContext ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalCbsmDsl.g:962:3: () otherlv_1= 'Allocation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'allocationContexts' otherlv_5= '{' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) (otherlv_7= ',' ( (lv_allocationContexts_8_0= ruleAllocationContext ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalCbsmDsl.g:962:3: ()
            // InternalCbsmDsl.g:963:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAllocationAccess().getAllocationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAllocationAccess().getAllocationKeyword_1());
            		
            // InternalCbsmDsl.g:973:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCbsmDsl.g:974:4: (lv_name_2_0= ruleEString )
            {
            // InternalCbsmDsl.g:974:4: (lv_name_2_0= ruleEString )
            // InternalCbsmDsl.g:975:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAllocationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAllocationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getAllocationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCbsmDsl.g:996:3: (otherlv_4= 'allocationContexts' otherlv_5= '{' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) (otherlv_7= ',' ( (lv_allocationContexts_8_0= ruleAllocationContext ) ) )* otherlv_9= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==27) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCbsmDsl.g:997:4: otherlv_4= 'allocationContexts' otherlv_5= '{' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) (otherlv_7= ',' ( (lv_allocationContexts_8_0= ruleAllocationContext ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getAllocationAccess().getAllocationContextsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_26); 

                    				newLeafNode(otherlv_5, grammarAccess.getAllocationAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCbsmDsl.g:1005:4: ( (lv_allocationContexts_6_0= ruleAllocationContext ) )
                    // InternalCbsmDsl.g:1006:5: (lv_allocationContexts_6_0= ruleAllocationContext )
                    {
                    // InternalCbsmDsl.g:1006:5: (lv_allocationContexts_6_0= ruleAllocationContext )
                    // InternalCbsmDsl.g:1007:6: lv_allocationContexts_6_0= ruleAllocationContext
                    {

                    						newCompositeNode(grammarAccess.getAllocationAccess().getAllocationContextsAllocationContextParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_allocationContexts_6_0=ruleAllocationContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAllocationRule());
                    						}
                    						add(
                    							current,
                    							"allocationContexts",
                    							lv_allocationContexts_6_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.AllocationContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:1024:4: (otherlv_7= ',' ( (lv_allocationContexts_8_0= ruleAllocationContext ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==14) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:1025:5: otherlv_7= ',' ( (lv_allocationContexts_8_0= ruleAllocationContext ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_26); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getAllocationAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:1029:5: ( (lv_allocationContexts_8_0= ruleAllocationContext ) )
                    	    // InternalCbsmDsl.g:1030:6: (lv_allocationContexts_8_0= ruleAllocationContext )
                    	    {
                    	    // InternalCbsmDsl.g:1030:6: (lv_allocationContexts_8_0= ruleAllocationContext )
                    	    // InternalCbsmDsl.g:1031:7: lv_allocationContexts_8_0= ruleAllocationContext
                    	    {

                    	    							newCompositeNode(grammarAccess.getAllocationAccess().getAllocationContextsAllocationContextParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_allocationContexts_8_0=ruleAllocationContext();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAllocationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"allocationContexts",
                    	    								lv_allocationContexts_8_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.AllocationContext");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getAllocationAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getAllocationAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleAllocation"


    // $ANTLR start "entryRuleInterface"
    // InternalCbsmDsl.g:1062:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalCbsmDsl.g:1062:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalCbsmDsl.g:1063:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalCbsmDsl.g:1069:1: ruleInterface returns [EObject current=null] : ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_signatures_6_0 = null;

        EObject lv_signatures_8_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:1075:2: ( ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalCbsmDsl.g:1076:2: ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalCbsmDsl.g:1076:2: ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalCbsmDsl.g:1077:3: () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalCbsmDsl.g:1077:3: ()
            // InternalCbsmDsl.g:1078:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInterfaceAccess().getInterfaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInterfaceAccess().getInterfaceKeyword_1());
            		
            // InternalCbsmDsl.g:1088:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCbsmDsl.g:1089:4: (lv_name_2_0= ruleEString )
            {
            // InternalCbsmDsl.g:1089:4: (lv_name_2_0= ruleEString )
            // InternalCbsmDsl.g:1090:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInterfaceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInterfaceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCbsmDsl.g:1111:3: (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCbsmDsl.g:1112:4: otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getInterfaceAccess().getSignaturesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_28); 

                    				newLeafNode(otherlv_5, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCbsmDsl.g:1120:4: ( (lv_signatures_6_0= ruleSignature ) )
                    // InternalCbsmDsl.g:1121:5: (lv_signatures_6_0= ruleSignature )
                    {
                    // InternalCbsmDsl.g:1121:5: (lv_signatures_6_0= ruleSignature )
                    // InternalCbsmDsl.g:1122:6: lv_signatures_6_0= ruleSignature
                    {

                    						newCompositeNode(grammarAccess.getInterfaceAccess().getSignaturesSignatureParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_signatures_6_0=ruleSignature();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"signatures",
                    							lv_signatures_6_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.Signature");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:1139:4: (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==14) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:1140:5: otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_28); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getInterfaceAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:1144:5: ( (lv_signatures_8_0= ruleSignature ) )
                    	    // InternalCbsmDsl.g:1145:6: (lv_signatures_8_0= ruleSignature )
                    	    {
                    	    // InternalCbsmDsl.g:1145:6: (lv_signatures_8_0= ruleSignature )
                    	    // InternalCbsmDsl.g:1146:7: lv_signatures_8_0= ruleSignature
                    	    {

                    	    							newCompositeNode(grammarAccess.getInterfaceAccess().getSignaturesSignatureParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_signatures_8_0=ruleSignature();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"signatures",
                    	    								lv_signatures_8_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.Signature");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleComponent"
    // InternalCbsmDsl.g:1177:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalCbsmDsl.g:1177:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalCbsmDsl.g:1178:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalCbsmDsl.g:1184:1: ruleComponent returns [EObject current=null] : (this_BasicComponent_0= ruleBasicComponent | this_CompositeComponent_1= ruleCompositeComponent ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_BasicComponent_0 = null;

        EObject this_CompositeComponent_1 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:1190:2: ( (this_BasicComponent_0= ruleBasicComponent | this_CompositeComponent_1= ruleCompositeComponent ) )
            // InternalCbsmDsl.g:1191:2: (this_BasicComponent_0= ruleBasicComponent | this_CompositeComponent_1= ruleCompositeComponent )
            {
            // InternalCbsmDsl.g:1191:2: (this_BasicComponent_0= ruleBasicComponent | this_CompositeComponent_1= ruleCompositeComponent )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            else if ( (LA27_0==32) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalCbsmDsl.g:1192:3: this_BasicComponent_0= ruleBasicComponent
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getBasicComponentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BasicComponent_0=ruleBasicComponent();

                    state._fsp--;


                    			current = this_BasicComponent_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCbsmDsl.g:1201:3: this_CompositeComponent_1= ruleCompositeComponent
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getCompositeComponentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositeComponent_1=ruleCompositeComponent();

                    state._fsp--;


                    			current = this_CompositeComponent_1;
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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleBasicComponent"
    // InternalCbsmDsl.g:1213:1: entryRuleBasicComponent returns [EObject current=null] : iv_ruleBasicComponent= ruleBasicComponent EOF ;
    public final EObject entryRuleBasicComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicComponent = null;


        try {
            // InternalCbsmDsl.g:1213:55: (iv_ruleBasicComponent= ruleBasicComponent EOF )
            // InternalCbsmDsl.g:1214:2: iv_ruleBasicComponent= ruleBasicComponent EOF
            {
             newCompositeNode(grammarAccess.getBasicComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicComponent=ruleBasicComponent();

            state._fsp--;

             current =iv_ruleBasicComponent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBasicComponent"


    // $ANTLR start "ruleBasicComponent"
    // InternalCbsmDsl.g:1220:1: ruleBasicComponent returns [EObject current=null] : ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providedRoles' otherlv_5= '{' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= '}' )? (otherlv_10= 'requiredRoles' otherlv_11= '{' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= '}' )? (otherlv_16= 'behaviorDescriptions' otherlv_17= '{' ( (lv_behaviorDescriptions_18_0= ruleBehaviorDescription ) ) (otherlv_19= ',' ( (lv_behaviorDescriptions_20_0= ruleBehaviorDescription ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleBasicComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_providedRoles_6_0 = null;

        EObject lv_providedRoles_8_0 = null;

        EObject lv_requiredRoles_12_0 = null;

        EObject lv_requiredRoles_14_0 = null;

        EObject lv_behaviorDescriptions_18_0 = null;

        EObject lv_behaviorDescriptions_20_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:1226:2: ( ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providedRoles' otherlv_5= '{' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= '}' )? (otherlv_10= 'requiredRoles' otherlv_11= '{' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= '}' )? (otherlv_16= 'behaviorDescriptions' otherlv_17= '{' ( (lv_behaviorDescriptions_18_0= ruleBehaviorDescription ) ) (otherlv_19= ',' ( (lv_behaviorDescriptions_20_0= ruleBehaviorDescription ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // InternalCbsmDsl.g:1227:2: ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providedRoles' otherlv_5= '{' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= '}' )? (otherlv_10= 'requiredRoles' otherlv_11= '{' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= '}' )? (otherlv_16= 'behaviorDescriptions' otherlv_17= '{' ( (lv_behaviorDescriptions_18_0= ruleBehaviorDescription ) ) (otherlv_19= ',' ( (lv_behaviorDescriptions_20_0= ruleBehaviorDescription ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // InternalCbsmDsl.g:1227:2: ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providedRoles' otherlv_5= '{' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= '}' )? (otherlv_10= 'requiredRoles' otherlv_11= '{' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= '}' )? (otherlv_16= 'behaviorDescriptions' otherlv_17= '{' ( (lv_behaviorDescriptions_18_0= ruleBehaviorDescription ) ) (otherlv_19= ',' ( (lv_behaviorDescriptions_20_0= ruleBehaviorDescription ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // InternalCbsmDsl.g:1228:3: () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providedRoles' otherlv_5= '{' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= '}' )? (otherlv_10= 'requiredRoles' otherlv_11= '{' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= '}' )? (otherlv_16= 'behaviorDescriptions' otherlv_17= '{' ( (lv_behaviorDescriptions_18_0= ruleBehaviorDescription ) ) (otherlv_19= ',' ( (lv_behaviorDescriptions_20_0= ruleBehaviorDescription ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // InternalCbsmDsl.g:1228:3: ()
            // InternalCbsmDsl.g:1229:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBasicComponentAccess().getComponentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBasicComponentAccess().getComponentKeyword_1());
            		
            // InternalCbsmDsl.g:1239:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCbsmDsl.g:1240:4: (lv_name_2_0= ruleEString )
            {
            // InternalCbsmDsl.g:1240:4: (lv_name_2_0= ruleEString )
            // InternalCbsmDsl.g:1241:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBasicComponentAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBasicComponentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getBasicComponentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCbsmDsl.g:1262:3: (otherlv_4= 'providedRoles' otherlv_5= '{' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==19) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCbsmDsl.g:1263:4: otherlv_4= 'providedRoles' otherlv_5= '{' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getBasicComponentAccess().getProvidedRolesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getBasicComponentAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCbsmDsl.g:1271:4: ( (lv_providedRoles_6_0= ruleProvidedRole ) )
                    // InternalCbsmDsl.g:1272:5: (lv_providedRoles_6_0= ruleProvidedRole )
                    {
                    // InternalCbsmDsl.g:1272:5: (lv_providedRoles_6_0= ruleProvidedRole )
                    // InternalCbsmDsl.g:1273:6: lv_providedRoles_6_0= ruleProvidedRole
                    {

                    						newCompositeNode(grammarAccess.getBasicComponentAccess().getProvidedRolesProvidedRoleParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_providedRoles_6_0=ruleProvidedRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBasicComponentRule());
                    						}
                    						add(
                    							current,
                    							"providedRoles",
                    							lv_providedRoles_6_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.ProvidedRole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:1290:4: (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==14) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:1291:5: otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getBasicComponentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:1295:5: ( (lv_providedRoles_8_0= ruleProvidedRole ) )
                    	    // InternalCbsmDsl.g:1296:6: (lv_providedRoles_8_0= ruleProvidedRole )
                    	    {
                    	    // InternalCbsmDsl.g:1296:6: (lv_providedRoles_8_0= ruleProvidedRole )
                    	    // InternalCbsmDsl.g:1297:7: lv_providedRoles_8_0= ruleProvidedRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getBasicComponentAccess().getProvidedRolesProvidedRoleParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_providedRoles_8_0=ruleProvidedRole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBasicComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"providedRoles",
                    	    								lv_providedRoles_8_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.ProvidedRole");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_30); 

                    				newLeafNode(otherlv_9, grammarAccess.getBasicComponentAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalCbsmDsl.g:1320:3: (otherlv_10= 'requiredRoles' otherlv_11= '{' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==20) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCbsmDsl.g:1321:4: otherlv_10= 'requiredRoles' otherlv_11= '{' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getBasicComponentAccess().getRequiredRolesKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_11, grammarAccess.getBasicComponentAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCbsmDsl.g:1329:4: ( (lv_requiredRoles_12_0= ruleRequiredRole ) )
                    // InternalCbsmDsl.g:1330:5: (lv_requiredRoles_12_0= ruleRequiredRole )
                    {
                    // InternalCbsmDsl.g:1330:5: (lv_requiredRoles_12_0= ruleRequiredRole )
                    // InternalCbsmDsl.g:1331:6: lv_requiredRoles_12_0= ruleRequiredRole
                    {

                    						newCompositeNode(grammarAccess.getBasicComponentAccess().getRequiredRolesRequiredRoleParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_requiredRoles_12_0=ruleRequiredRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBasicComponentRule());
                    						}
                    						add(
                    							current,
                    							"requiredRoles",
                    							lv_requiredRoles_12_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.RequiredRole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:1348:4: (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==14) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:1349:5: otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getBasicComponentAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:1353:5: ( (lv_requiredRoles_14_0= ruleRequiredRole ) )
                    	    // InternalCbsmDsl.g:1354:6: (lv_requiredRoles_14_0= ruleRequiredRole )
                    	    {
                    	    // InternalCbsmDsl.g:1354:6: (lv_requiredRoles_14_0= ruleRequiredRole )
                    	    // InternalCbsmDsl.g:1355:7: lv_requiredRoles_14_0= ruleRequiredRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getBasicComponentAccess().getRequiredRolesRequiredRoleParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_requiredRoles_14_0=ruleRequiredRole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBasicComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"requiredRoles",
                    	    								lv_requiredRoles_14_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.RequiredRole");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_31); 

                    				newLeafNode(otherlv_15, grammarAccess.getBasicComponentAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalCbsmDsl.g:1378:3: (otherlv_16= 'behaviorDescriptions' otherlv_17= '{' ( (lv_behaviorDescriptions_18_0= ruleBehaviorDescription ) ) (otherlv_19= ',' ( (lv_behaviorDescriptions_20_0= ruleBehaviorDescription ) ) )* otherlv_21= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==31) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCbsmDsl.g:1379:4: otherlv_16= 'behaviorDescriptions' otherlv_17= '{' ( (lv_behaviorDescriptions_18_0= ruleBehaviorDescription ) ) (otherlv_19= ',' ( (lv_behaviorDescriptions_20_0= ruleBehaviorDescription ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getBasicComponentAccess().getBehaviorDescriptionsKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_32); 

                    				newLeafNode(otherlv_17, grammarAccess.getBasicComponentAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCbsmDsl.g:1387:4: ( (lv_behaviorDescriptions_18_0= ruleBehaviorDescription ) )
                    // InternalCbsmDsl.g:1388:5: (lv_behaviorDescriptions_18_0= ruleBehaviorDescription )
                    {
                    // InternalCbsmDsl.g:1388:5: (lv_behaviorDescriptions_18_0= ruleBehaviorDescription )
                    // InternalCbsmDsl.g:1389:6: lv_behaviorDescriptions_18_0= ruleBehaviorDescription
                    {

                    						newCompositeNode(grammarAccess.getBasicComponentAccess().getBehaviorDescriptionsBehaviorDescriptionParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_behaviorDescriptions_18_0=ruleBehaviorDescription();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBasicComponentRule());
                    						}
                    						add(
                    							current,
                    							"behaviorDescriptions",
                    							lv_behaviorDescriptions_18_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.BehaviorDescription");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:1406:4: (otherlv_19= ',' ( (lv_behaviorDescriptions_20_0= ruleBehaviorDescription ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==14) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:1407:5: otherlv_19= ',' ( (lv_behaviorDescriptions_20_0= ruleBehaviorDescription ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_32); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getBasicComponentAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:1411:5: ( (lv_behaviorDescriptions_20_0= ruleBehaviorDescription ) )
                    	    // InternalCbsmDsl.g:1412:6: (lv_behaviorDescriptions_20_0= ruleBehaviorDescription )
                    	    {
                    	    // InternalCbsmDsl.g:1412:6: (lv_behaviorDescriptions_20_0= ruleBehaviorDescription )
                    	    // InternalCbsmDsl.g:1413:7: lv_behaviorDescriptions_20_0= ruleBehaviorDescription
                    	    {

                    	    							newCompositeNode(grammarAccess.getBasicComponentAccess().getBehaviorDescriptionsBehaviorDescriptionParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_behaviorDescriptions_20_0=ruleBehaviorDescription();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBasicComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"behaviorDescriptions",
                    	    								lv_behaviorDescriptions_20_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.BehaviorDescription");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_21, grammarAccess.getBasicComponentAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getBasicComponentAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleBasicComponent"


    // $ANTLR start "entryRuleCompositeComponent"
    // InternalCbsmDsl.g:1444:1: entryRuleCompositeComponent returns [EObject current=null] : iv_ruleCompositeComponent= ruleCompositeComponent EOF ;
    public final EObject entryRuleCompositeComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeComponent = null;


        try {
            // InternalCbsmDsl.g:1444:59: (iv_ruleCompositeComponent= ruleCompositeComponent EOF )
            // InternalCbsmDsl.g:1445:2: iv_ruleCompositeComponent= ruleCompositeComponent EOF
            {
             newCompositeNode(grammarAccess.getCompositeComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeComponent=ruleCompositeComponent();

            state._fsp--;

             current =iv_ruleCompositeComponent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCompositeComponent"


    // $ANTLR start "ruleCompositeComponent"
    // InternalCbsmDsl.g:1451:1: ruleCompositeComponent returns [EObject current=null] : ( () otherlv_1= 'CompositeComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providedRoles' otherlv_5= '{' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= '}' )? (otherlv_10= 'requiredRoles' otherlv_11= '{' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= '}' )? (otherlv_16= 'behaviorDescriptions' otherlv_17= '{' ( (lv_behaviorDescriptions_18_0= ruleBehaviorDescription ) ) (otherlv_19= ',' ( (lv_behaviorDescriptions_20_0= ruleBehaviorDescription ) ) )* otherlv_21= '}' )? (otherlv_22= 'containedAssemblyContexts' otherlv_23= '{' ( (lv_containedAssemblyContexts_24_0= ruleAssemblyContext ) ) (otherlv_25= ',' ( (lv_containedAssemblyContexts_26_0= ruleAssemblyContext ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) ;
    public final EObject ruleCompositeComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_providedRoles_6_0 = null;

        EObject lv_providedRoles_8_0 = null;

        EObject lv_requiredRoles_12_0 = null;

        EObject lv_requiredRoles_14_0 = null;

        EObject lv_behaviorDescriptions_18_0 = null;

        EObject lv_behaviorDescriptions_20_0 = null;

        EObject lv_containedAssemblyContexts_24_0 = null;

        EObject lv_containedAssemblyContexts_26_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:1457:2: ( ( () otherlv_1= 'CompositeComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providedRoles' otherlv_5= '{' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= '}' )? (otherlv_10= 'requiredRoles' otherlv_11= '{' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= '}' )? (otherlv_16= 'behaviorDescriptions' otherlv_17= '{' ( (lv_behaviorDescriptions_18_0= ruleBehaviorDescription ) ) (otherlv_19= ',' ( (lv_behaviorDescriptions_20_0= ruleBehaviorDescription ) ) )* otherlv_21= '}' )? (otherlv_22= 'containedAssemblyContexts' otherlv_23= '{' ( (lv_containedAssemblyContexts_24_0= ruleAssemblyContext ) ) (otherlv_25= ',' ( (lv_containedAssemblyContexts_26_0= ruleAssemblyContext ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) )
            // InternalCbsmDsl.g:1458:2: ( () otherlv_1= 'CompositeComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providedRoles' otherlv_5= '{' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= '}' )? (otherlv_10= 'requiredRoles' otherlv_11= '{' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= '}' )? (otherlv_16= 'behaviorDescriptions' otherlv_17= '{' ( (lv_behaviorDescriptions_18_0= ruleBehaviorDescription ) ) (otherlv_19= ',' ( (lv_behaviorDescriptions_20_0= ruleBehaviorDescription ) ) )* otherlv_21= '}' )? (otherlv_22= 'containedAssemblyContexts' otherlv_23= '{' ( (lv_containedAssemblyContexts_24_0= ruleAssemblyContext ) ) (otherlv_25= ',' ( (lv_containedAssemblyContexts_26_0= ruleAssemblyContext ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            {
            // InternalCbsmDsl.g:1458:2: ( () otherlv_1= 'CompositeComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providedRoles' otherlv_5= '{' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= '}' )? (otherlv_10= 'requiredRoles' otherlv_11= '{' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= '}' )? (otherlv_16= 'behaviorDescriptions' otherlv_17= '{' ( (lv_behaviorDescriptions_18_0= ruleBehaviorDescription ) ) (otherlv_19= ',' ( (lv_behaviorDescriptions_20_0= ruleBehaviorDescription ) ) )* otherlv_21= '}' )? (otherlv_22= 'containedAssemblyContexts' otherlv_23= '{' ( (lv_containedAssemblyContexts_24_0= ruleAssemblyContext ) ) (otherlv_25= ',' ( (lv_containedAssemblyContexts_26_0= ruleAssemblyContext ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            // InternalCbsmDsl.g:1459:3: () otherlv_1= 'CompositeComponent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providedRoles' otherlv_5= '{' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= '}' )? (otherlv_10= 'requiredRoles' otherlv_11= '{' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= '}' )? (otherlv_16= 'behaviorDescriptions' otherlv_17= '{' ( (lv_behaviorDescriptions_18_0= ruleBehaviorDescription ) ) (otherlv_19= ',' ( (lv_behaviorDescriptions_20_0= ruleBehaviorDescription ) ) )* otherlv_21= '}' )? (otherlv_22= 'containedAssemblyContexts' otherlv_23= '{' ( (lv_containedAssemblyContexts_24_0= ruleAssemblyContext ) ) (otherlv_25= ',' ( (lv_containedAssemblyContexts_26_0= ruleAssemblyContext ) ) )* otherlv_27= '}' )? otherlv_28= '}'
            {
            // InternalCbsmDsl.g:1459:3: ()
            // InternalCbsmDsl.g:1460:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCompositeComponentAccess().getCompositeComponentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCompositeComponentAccess().getCompositeComponentKeyword_1());
            		
            // InternalCbsmDsl.g:1470:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCbsmDsl.g:1471:4: (lv_name_2_0= ruleEString )
            {
            // InternalCbsmDsl.g:1471:4: (lv_name_2_0= ruleEString )
            // InternalCbsmDsl.g:1472:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompositeComponentAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCbsmDsl.g:1493:3: (otherlv_4= 'providedRoles' otherlv_5= '{' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==19) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCbsmDsl.g:1494:4: otherlv_4= 'providedRoles' otherlv_5= '{' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getCompositeComponentAccess().getProvidedRolesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCbsmDsl.g:1502:4: ( (lv_providedRoles_6_0= ruleProvidedRole ) )
                    // InternalCbsmDsl.g:1503:5: (lv_providedRoles_6_0= ruleProvidedRole )
                    {
                    // InternalCbsmDsl.g:1503:5: (lv_providedRoles_6_0= ruleProvidedRole )
                    // InternalCbsmDsl.g:1504:6: lv_providedRoles_6_0= ruleProvidedRole
                    {

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getProvidedRolesProvidedRoleParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_providedRoles_6_0=ruleProvidedRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    						}
                    						add(
                    							current,
                    							"providedRoles",
                    							lv_providedRoles_6_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.ProvidedRole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:1521:4: (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==14) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:1522:5: otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getCompositeComponentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:1526:5: ( (lv_providedRoles_8_0= ruleProvidedRole ) )
                    	    // InternalCbsmDsl.g:1527:6: (lv_providedRoles_8_0= ruleProvidedRole )
                    	    {
                    	    // InternalCbsmDsl.g:1527:6: (lv_providedRoles_8_0= ruleProvidedRole )
                    	    // InternalCbsmDsl.g:1528:7: lv_providedRoles_8_0= ruleProvidedRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getProvidedRolesProvidedRoleParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_providedRoles_8_0=ruleProvidedRole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"providedRoles",
                    	    								lv_providedRoles_8_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.ProvidedRole");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_34); 

                    				newLeafNode(otherlv_9, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalCbsmDsl.g:1551:3: (otherlv_10= 'requiredRoles' otherlv_11= '{' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==20) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCbsmDsl.g:1552:4: otherlv_10= 'requiredRoles' otherlv_11= '{' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getCompositeComponentAccess().getRequiredRolesKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_11, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCbsmDsl.g:1560:4: ( (lv_requiredRoles_12_0= ruleRequiredRole ) )
                    // InternalCbsmDsl.g:1561:5: (lv_requiredRoles_12_0= ruleRequiredRole )
                    {
                    // InternalCbsmDsl.g:1561:5: (lv_requiredRoles_12_0= ruleRequiredRole )
                    // InternalCbsmDsl.g:1562:6: lv_requiredRoles_12_0= ruleRequiredRole
                    {

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getRequiredRolesRequiredRoleParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_requiredRoles_12_0=ruleRequiredRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    						}
                    						add(
                    							current,
                    							"requiredRoles",
                    							lv_requiredRoles_12_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.RequiredRole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:1579:4: (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==14) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:1580:5: otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getCompositeComponentAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:1584:5: ( (lv_requiredRoles_14_0= ruleRequiredRole ) )
                    	    // InternalCbsmDsl.g:1585:6: (lv_requiredRoles_14_0= ruleRequiredRole )
                    	    {
                    	    // InternalCbsmDsl.g:1585:6: (lv_requiredRoles_14_0= ruleRequiredRole )
                    	    // InternalCbsmDsl.g:1586:7: lv_requiredRoles_14_0= ruleRequiredRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getRequiredRolesRequiredRoleParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_requiredRoles_14_0=ruleRequiredRole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"requiredRoles",
                    	    								lv_requiredRoles_14_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.RequiredRole");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_35); 

                    				newLeafNode(otherlv_15, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalCbsmDsl.g:1609:3: (otherlv_16= 'behaviorDescriptions' otherlv_17= '{' ( (lv_behaviorDescriptions_18_0= ruleBehaviorDescription ) ) (otherlv_19= ',' ( (lv_behaviorDescriptions_20_0= ruleBehaviorDescription ) ) )* otherlv_21= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==31) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCbsmDsl.g:1610:4: otherlv_16= 'behaviorDescriptions' otherlv_17= '{' ( (lv_behaviorDescriptions_18_0= ruleBehaviorDescription ) ) (otherlv_19= ',' ( (lv_behaviorDescriptions_20_0= ruleBehaviorDescription ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getCompositeComponentAccess().getBehaviorDescriptionsKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_32); 

                    				newLeafNode(otherlv_17, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCbsmDsl.g:1618:4: ( (lv_behaviorDescriptions_18_0= ruleBehaviorDescription ) )
                    // InternalCbsmDsl.g:1619:5: (lv_behaviorDescriptions_18_0= ruleBehaviorDescription )
                    {
                    // InternalCbsmDsl.g:1619:5: (lv_behaviorDescriptions_18_0= ruleBehaviorDescription )
                    // InternalCbsmDsl.g:1620:6: lv_behaviorDescriptions_18_0= ruleBehaviorDescription
                    {

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getBehaviorDescriptionsBehaviorDescriptionParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_behaviorDescriptions_18_0=ruleBehaviorDescription();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    						}
                    						add(
                    							current,
                    							"behaviorDescriptions",
                    							lv_behaviorDescriptions_18_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.BehaviorDescription");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:1637:4: (otherlv_19= ',' ( (lv_behaviorDescriptions_20_0= ruleBehaviorDescription ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==14) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:1638:5: otherlv_19= ',' ( (lv_behaviorDescriptions_20_0= ruleBehaviorDescription ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_32); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getCompositeComponentAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:1642:5: ( (lv_behaviorDescriptions_20_0= ruleBehaviorDescription ) )
                    	    // InternalCbsmDsl.g:1643:6: (lv_behaviorDescriptions_20_0= ruleBehaviorDescription )
                    	    {
                    	    // InternalCbsmDsl.g:1643:6: (lv_behaviorDescriptions_20_0= ruleBehaviorDescription )
                    	    // InternalCbsmDsl.g:1644:7: lv_behaviorDescriptions_20_0= ruleBehaviorDescription
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getBehaviorDescriptionsBehaviorDescriptionParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_behaviorDescriptions_20_0=ruleBehaviorDescription();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"behaviorDescriptions",
                    	    								lv_behaviorDescriptions_20_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.BehaviorDescription");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_36); 

                    				newLeafNode(otherlv_21, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalCbsmDsl.g:1667:3: (otherlv_22= 'containedAssemblyContexts' otherlv_23= '{' ( (lv_containedAssemblyContexts_24_0= ruleAssemblyContext ) ) (otherlv_25= ',' ( (lv_containedAssemblyContexts_26_0= ruleAssemblyContext ) ) )* otherlv_27= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==21) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCbsmDsl.g:1668:4: otherlv_22= 'containedAssemblyContexts' otherlv_23= '{' ( (lv_containedAssemblyContexts_24_0= ruleAssemblyContext ) ) (otherlv_25= ',' ( (lv_containedAssemblyContexts_26_0= ruleAssemblyContext ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getCompositeComponentAccess().getContainedAssemblyContextsKeyword_7_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_23, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalCbsmDsl.g:1676:4: ( (lv_containedAssemblyContexts_24_0= ruleAssemblyContext ) )
                    // InternalCbsmDsl.g:1677:5: (lv_containedAssemblyContexts_24_0= ruleAssemblyContext )
                    {
                    // InternalCbsmDsl.g:1677:5: (lv_containedAssemblyContexts_24_0= ruleAssemblyContext )
                    // InternalCbsmDsl.g:1678:6: lv_containedAssemblyContexts_24_0= ruleAssemblyContext
                    {

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getContainedAssemblyContextsAssemblyContextParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_containedAssemblyContexts_24_0=ruleAssemblyContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    						}
                    						add(
                    							current,
                    							"containedAssemblyContexts",
                    							lv_containedAssemblyContexts_24_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.AssemblyContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:1695:4: (otherlv_25= ',' ( (lv_containedAssemblyContexts_26_0= ruleAssemblyContext ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==14) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:1696:5: otherlv_25= ',' ( (lv_containedAssemblyContexts_26_0= ruleAssemblyContext ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_18); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getCompositeComponentAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:1700:5: ( (lv_containedAssemblyContexts_26_0= ruleAssemblyContext ) )
                    	    // InternalCbsmDsl.g:1701:6: (lv_containedAssemblyContexts_26_0= ruleAssemblyContext )
                    	    {
                    	    // InternalCbsmDsl.g:1701:6: (lv_containedAssemblyContexts_26_0= ruleAssemblyContext )
                    	    // InternalCbsmDsl.g:1702:7: lv_containedAssemblyContexts_26_0= ruleAssemblyContext
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getContainedAssemblyContextsAssemblyContextParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_containedAssemblyContexts_26_0=ruleAssemblyContext();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"containedAssemblyContexts",
                    	    								lv_containedAssemblyContexts_26_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.AssemblyContext");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_27, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_28=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleCompositeComponent"


    // $ANTLR start "entryRuleEString"
    // InternalCbsmDsl.g:1733:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCbsmDsl.g:1733:47: (iv_ruleEString= ruleEString EOF )
            // InternalCbsmDsl.g:1734:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalCbsmDsl.g:1740:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalCbsmDsl.g:1746:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalCbsmDsl.g:1747:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalCbsmDsl.g:1747:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_STRING) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_ID) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalCbsmDsl.g:1748:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCbsmDsl.g:1756:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleSignature"
    // InternalCbsmDsl.g:1767:1: entryRuleSignature returns [EObject current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final EObject entryRuleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignature = null;


        try {
            // InternalCbsmDsl.g:1767:50: (iv_ruleSignature= ruleSignature EOF )
            // InternalCbsmDsl.g:1768:2: iv_ruleSignature= ruleSignature EOF
            {
             newCompositeNode(grammarAccess.getSignatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSignature=ruleSignature();

            state._fsp--;

             current =iv_ruleSignature; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // InternalCbsmDsl.g:1774:1: ruleSignature returns [EObject current=null] : ( () otherlv_1= 'Signature' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType' ( ( ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleSignature() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_parameters_10_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:1780:2: ( ( () otherlv_1= 'Signature' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType' ( ( ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalCbsmDsl.g:1781:2: ( () otherlv_1= 'Signature' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType' ( ( ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalCbsmDsl.g:1781:2: ( () otherlv_1= 'Signature' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType' ( ( ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalCbsmDsl.g:1782:3: () otherlv_1= 'Signature' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType' ( ( ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalCbsmDsl.g:1782:3: ()
            // InternalCbsmDsl.g:1783:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSignatureAccess().getSignatureAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSignatureAccess().getSignatureKeyword_1());
            		
            // InternalCbsmDsl.g:1793:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCbsmDsl.g:1794:4: (lv_name_2_0= ruleEString )
            {
            // InternalCbsmDsl.g:1794:4: (lv_name_2_0= ruleEString )
            // InternalCbsmDsl.g:1795:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSignatureAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSignatureRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCbsmDsl.g:1816:3: (otherlv_4= 'returnType' ( ( ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==34) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalCbsmDsl.g:1817:4: otherlv_4= 'returnType' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getSignatureAccess().getReturnTypeKeyword_4_0());
                    			
                    // InternalCbsmDsl.g:1821:4: ( ( ruleEString ) )
                    // InternalCbsmDsl.g:1822:5: ( ruleEString )
                    {
                    // InternalCbsmDsl.g:1822:5: ( ruleEString )
                    // InternalCbsmDsl.g:1823:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSignatureRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSignatureAccess().getReturnTypeDataTypeCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCbsmDsl.g:1838:3: (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= '}' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==35) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalCbsmDsl.g:1839:4: otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,35,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getSignatureAccess().getParametersKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_39); 

                    				newLeafNode(otherlv_7, grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCbsmDsl.g:1847:4: ( (lv_parameters_8_0= ruleParameter ) )
                    // InternalCbsmDsl.g:1848:5: (lv_parameters_8_0= ruleParameter )
                    {
                    // InternalCbsmDsl.g:1848:5: (lv_parameters_8_0= ruleParameter )
                    // InternalCbsmDsl.g:1849:6: lv_parameters_8_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_parameters_8_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSignatureRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_8_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:1866:4: (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==14) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:1867:5: otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_39); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getSignatureAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:1871:5: ( (lv_parameters_10_0= ruleParameter ) )
                    	    // InternalCbsmDsl.g:1872:6: (lv_parameters_10_0= ruleParameter )
                    	    {
                    	    // InternalCbsmDsl.g:1872:6: (lv_parameters_10_0= ruleParameter )
                    	    // InternalCbsmDsl.g:1873:7: lv_parameters_10_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_parameters_10_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSignatureRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_10_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleParameter"
    // InternalCbsmDsl.g:1904:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalCbsmDsl.g:1904:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalCbsmDsl.g:1905:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalCbsmDsl.g:1911:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:1917:2: ( (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalCbsmDsl.g:1918:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalCbsmDsl.g:1918:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalCbsmDsl.g:1919:3: otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            // InternalCbsmDsl.g:1923:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCbsmDsl.g:1924:4: (lv_name_1_0= ruleEString )
            {
            // InternalCbsmDsl.g:1924:4: (lv_name_1_0= ruleEString )
            // InternalCbsmDsl.g:1925:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getTypeKeyword_3());
            		
            // InternalCbsmDsl.g:1950:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:1951:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:1951:4: ( ruleEString )
            // InternalCbsmDsl.g:1952:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeDataTypeCrossReference_4_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleProvidedRole"
    // InternalCbsmDsl.g:1974:1: entryRuleProvidedRole returns [EObject current=null] : iv_ruleProvidedRole= ruleProvidedRole EOF ;
    public final EObject entryRuleProvidedRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedRole = null;


        try {
            // InternalCbsmDsl.g:1974:53: (iv_ruleProvidedRole= ruleProvidedRole EOF )
            // InternalCbsmDsl.g:1975:2: iv_ruleProvidedRole= ruleProvidedRole EOF
            {
             newCompositeNode(grammarAccess.getProvidedRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProvidedRole=ruleProvidedRole();

            state._fsp--;

             current =iv_ruleProvidedRole; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProvidedRole"


    // $ANTLR start "ruleProvidedRole"
    // InternalCbsmDsl.g:1981:1: ruleProvidedRole returns [EObject current=null] : (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providedInterface' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleProvidedRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:1987:2: ( (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providedInterface' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalCbsmDsl.g:1988:2: (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providedInterface' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalCbsmDsl.g:1988:2: (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providedInterface' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalCbsmDsl.g:1989:3: otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providedInterface' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProvidedRoleAccess().getProvidedRoleKeyword_0());
            		
            // InternalCbsmDsl.g:1993:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCbsmDsl.g:1994:4: (lv_name_1_0= ruleEString )
            {
            // InternalCbsmDsl.g:1994:4: (lv_name_1_0= ruleEString )
            // InternalCbsmDsl.g:1995:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProvidedRoleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProvidedRoleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getProvidedRoleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getProvidedRoleAccess().getProvidedInterfaceKeyword_3());
            		
            // InternalCbsmDsl.g:2020:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:2021:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:2021:4: ( ruleEString )
            // InternalCbsmDsl.g:2022:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProvidedRoleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getProvidedRoleAccess().getProvidedInterfaceInterfaceCrossReference_4_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getProvidedRoleAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleProvidedRole"


    // $ANTLR start "entryRuleRequiredRole"
    // InternalCbsmDsl.g:2044:1: entryRuleRequiredRole returns [EObject current=null] : iv_ruleRequiredRole= ruleRequiredRole EOF ;
    public final EObject entryRuleRequiredRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredRole = null;


        try {
            // InternalCbsmDsl.g:2044:53: (iv_ruleRequiredRole= ruleRequiredRole EOF )
            // InternalCbsmDsl.g:2045:2: iv_ruleRequiredRole= ruleRequiredRole EOF
            {
             newCompositeNode(grammarAccess.getRequiredRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequiredRole=ruleRequiredRole();

            state._fsp--;

             current =iv_ruleRequiredRole; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRequiredRole"


    // $ANTLR start "ruleRequiredRole"
    // InternalCbsmDsl.g:2051:1: ruleRequiredRole returns [EObject current=null] : (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'requiredInterface' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleRequiredRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:2057:2: ( (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'requiredInterface' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalCbsmDsl.g:2058:2: (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'requiredInterface' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalCbsmDsl.g:2058:2: (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'requiredInterface' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalCbsmDsl.g:2059:3: otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'requiredInterface' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRequiredRoleAccess().getRequiredRoleKeyword_0());
            		
            // InternalCbsmDsl.g:2063:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCbsmDsl.g:2064:4: (lv_name_1_0= ruleEString )
            {
            // InternalCbsmDsl.g:2064:4: (lv_name_1_0= ruleEString )
            // InternalCbsmDsl.g:2065:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequiredRoleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequiredRoleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getRequiredRoleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRequiredRoleAccess().getRequiredInterfaceKeyword_3());
            		
            // InternalCbsmDsl.g:2090:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:2091:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:2091:4: ( ruleEString )
            // InternalCbsmDsl.g:2092:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequiredRoleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRequiredRoleAccess().getRequiredInterfaceInterfaceCrossReference_4_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRequiredRoleAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleRequiredRole"


    // $ANTLR start "entryRuleBehaviorDescription"
    // InternalCbsmDsl.g:2114:1: entryRuleBehaviorDescription returns [EObject current=null] : iv_ruleBehaviorDescription= ruleBehaviorDescription EOF ;
    public final EObject entryRuleBehaviorDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorDescription = null;


        try {
            // InternalCbsmDsl.g:2114:60: (iv_ruleBehaviorDescription= ruleBehaviorDescription EOF )
            // InternalCbsmDsl.g:2115:2: iv_ruleBehaviorDescription= ruleBehaviorDescription EOF
            {
             newCompositeNode(grammarAccess.getBehaviorDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorDescription=ruleBehaviorDescription();

            state._fsp--;

             current =iv_ruleBehaviorDescription; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBehaviorDescription"


    // $ANTLR start "ruleBehaviorDescription"
    // InternalCbsmDsl.g:2121:1: ruleBehaviorDescription returns [EObject current=null] : ( () otherlv_1= 'BehaviorDescription' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actions' otherlv_5= '{' ( (lv_actions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAction ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleBehaviorDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_actions_6_0 = null;

        EObject lv_actions_8_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:2127:2: ( ( () otherlv_1= 'BehaviorDescription' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actions' otherlv_5= '{' ( (lv_actions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAction ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalCbsmDsl.g:2128:2: ( () otherlv_1= 'BehaviorDescription' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actions' otherlv_5= '{' ( (lv_actions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAction ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalCbsmDsl.g:2128:2: ( () otherlv_1= 'BehaviorDescription' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actions' otherlv_5= '{' ( (lv_actions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAction ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalCbsmDsl.g:2129:3: () otherlv_1= 'BehaviorDescription' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actions' otherlv_5= '{' ( (lv_actions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAction ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalCbsmDsl.g:2129:3: ()
            // InternalCbsmDsl.g:2130:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBehaviorDescriptionAccess().getBehaviorDescriptionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBehaviorDescriptionAccess().getBehaviorDescriptionKeyword_1());
            		
            // InternalCbsmDsl.g:2140:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCbsmDsl.g:2141:4: (lv_name_2_0= ruleEString )
            {
            // InternalCbsmDsl.g:2141:4: (lv_name_2_0= ruleEString )
            // InternalCbsmDsl.g:2142:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBehaviorDescriptionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBehaviorDescriptionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_43); 

            			newLeafNode(otherlv_3, grammarAccess.getBehaviorDescriptionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCbsmDsl.g:2163:3: (otherlv_4= 'actions' otherlv_5= '{' ( (lv_actions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAction ) ) )* otherlv_9= '}' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==43) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalCbsmDsl.g:2164:4: otherlv_4= 'actions' otherlv_5= '{' ( (lv_actions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAction ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getBehaviorDescriptionAccess().getActionsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_44); 

                    				newLeafNode(otherlv_5, grammarAccess.getBehaviorDescriptionAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCbsmDsl.g:2172:4: ( (lv_actions_6_0= ruleAction ) )
                    // InternalCbsmDsl.g:2173:5: (lv_actions_6_0= ruleAction )
                    {
                    // InternalCbsmDsl.g:2173:5: (lv_actions_6_0= ruleAction )
                    // InternalCbsmDsl.g:2174:6: lv_actions_6_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getBehaviorDescriptionAccess().getActionsActionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_actions_6_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBehaviorDescriptionRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_6_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:2191:4: (otherlv_7= ',' ( (lv_actions_8_0= ruleAction ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==14) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:2192:5: otherlv_7= ',' ( (lv_actions_8_0= ruleAction ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_44); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getBehaviorDescriptionAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:2196:5: ( (lv_actions_8_0= ruleAction ) )
                    	    // InternalCbsmDsl.g:2197:6: (lv_actions_8_0= ruleAction )
                    	    {
                    	    // InternalCbsmDsl.g:2197:6: (lv_actions_8_0= ruleAction )
                    	    // InternalCbsmDsl.g:2198:7: lv_actions_8_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getBehaviorDescriptionAccess().getActionsActionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_actions_8_0=ruleAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBehaviorDescriptionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_8_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getBehaviorDescriptionAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getBehaviorDescriptionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleBehaviorDescription"


    // $ANTLR start "entryRuleInternalAction"
    // InternalCbsmDsl.g:2229:1: entryRuleInternalAction returns [EObject current=null] : iv_ruleInternalAction= ruleInternalAction EOF ;
    public final EObject entryRuleInternalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalAction = null;


        try {
            // InternalCbsmDsl.g:2229:55: (iv_ruleInternalAction= ruleInternalAction EOF )
            // InternalCbsmDsl.g:2230:2: iv_ruleInternalAction= ruleInternalAction EOF
            {
             newCompositeNode(grammarAccess.getInternalActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInternalAction=ruleInternalAction();

            state._fsp--;

             current =iv_ruleInternalAction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInternalAction"


    // $ANTLR start "ruleInternalAction"
    // InternalCbsmDsl.g:2236:1: ruleInternalAction returns [EObject current=null] : ( () otherlv_1= 'InternalAction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleInternalAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:2242:2: ( ( () otherlv_1= 'InternalAction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalCbsmDsl.g:2243:2: ( () otherlv_1= 'InternalAction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalCbsmDsl.g:2243:2: ( () otherlv_1= 'InternalAction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalCbsmDsl.g:2244:3: () otherlv_1= 'InternalAction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalCbsmDsl.g:2244:3: ()
            // InternalCbsmDsl.g:2245:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInternalActionAccess().getInternalActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInternalActionAccess().getInternalActionKeyword_1());
            		
            // InternalCbsmDsl.g:2255:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCbsmDsl.g:2256:4: (lv_name_2_0= ruleEString )
            {
            // InternalCbsmDsl.g:2256:4: (lv_name_2_0= ruleEString )
            // InternalCbsmDsl.g:2257:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInternalActionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInternalActionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_45); 

            			newLeafNode(otherlv_3, grammarAccess.getInternalActionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCbsmDsl.g:2278:3: (otherlv_4= 'predecessor' ( ( ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==45) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalCbsmDsl.g:2279:4: otherlv_4= 'predecessor' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getInternalActionAccess().getPredecessorKeyword_4_0());
                    			
                    // InternalCbsmDsl.g:2283:4: ( ( ruleEString ) )
                    // InternalCbsmDsl.g:2284:5: ( ruleEString )
                    {
                    // InternalCbsmDsl.g:2284:5: ( ruleEString )
                    // InternalCbsmDsl.g:2285:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInternalActionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getInternalActionAccess().getPredecessorActionCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_46);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCbsmDsl.g:2300:3: (otherlv_6= 'successor' ( ( ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==46) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalCbsmDsl.g:2301:4: otherlv_6= 'successor' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getInternalActionAccess().getSuccessorKeyword_5_0());
                    			
                    // InternalCbsmDsl.g:2305:4: ( ( ruleEString ) )
                    // InternalCbsmDsl.g:2306:5: ( ruleEString )
                    {
                    // InternalCbsmDsl.g:2306:5: ( ruleEString )
                    // InternalCbsmDsl.g:2307:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInternalActionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getInternalActionAccess().getSuccessorActionCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getInternalActionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleInternalAction"


    // $ANTLR start "entryRuleExternalCall"
    // InternalCbsmDsl.g:2330:1: entryRuleExternalCall returns [EObject current=null] : iv_ruleExternalCall= ruleExternalCall EOF ;
    public final EObject entryRuleExternalCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalCall = null;


        try {
            // InternalCbsmDsl.g:2330:53: (iv_ruleExternalCall= ruleExternalCall EOF )
            // InternalCbsmDsl.g:2331:2: iv_ruleExternalCall= ruleExternalCall EOF
            {
             newCompositeNode(grammarAccess.getExternalCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalCall=ruleExternalCall();

            state._fsp--;

             current =iv_ruleExternalCall; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExternalCall"


    // $ANTLR start "ruleExternalCall"
    // InternalCbsmDsl.g:2337:1: ruleExternalCall returns [EObject current=null] : (otherlv_0= 'ExternalCall' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'predecessor' ( ( ruleEString ) ) )? (otherlv_5= 'successor' ( ( ruleEString ) ) )? otherlv_7= 'requiredService' ( ( ruleEString ) ) otherlv_9= 'requiredRoleOfService' ( ( ruleEString ) ) otherlv_11= '}' ) ;
    public final EObject ruleExternalCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:2343:2: ( (otherlv_0= 'ExternalCall' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'predecessor' ( ( ruleEString ) ) )? (otherlv_5= 'successor' ( ( ruleEString ) ) )? otherlv_7= 'requiredService' ( ( ruleEString ) ) otherlv_9= 'requiredRoleOfService' ( ( ruleEString ) ) otherlv_11= '}' ) )
            // InternalCbsmDsl.g:2344:2: (otherlv_0= 'ExternalCall' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'predecessor' ( ( ruleEString ) ) )? (otherlv_5= 'successor' ( ( ruleEString ) ) )? otherlv_7= 'requiredService' ( ( ruleEString ) ) otherlv_9= 'requiredRoleOfService' ( ( ruleEString ) ) otherlv_11= '}' )
            {
            // InternalCbsmDsl.g:2344:2: (otherlv_0= 'ExternalCall' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'predecessor' ( ( ruleEString ) ) )? (otherlv_5= 'successor' ( ( ruleEString ) ) )? otherlv_7= 'requiredService' ( ( ruleEString ) ) otherlv_9= 'requiredRoleOfService' ( ( ruleEString ) ) otherlv_11= '}' )
            // InternalCbsmDsl.g:2345:3: otherlv_0= 'ExternalCall' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'predecessor' ( ( ruleEString ) ) )? (otherlv_5= 'successor' ( ( ruleEString ) ) )? otherlv_7= 'requiredService' ( ( ruleEString ) ) otherlv_9= 'requiredRoleOfService' ( ( ruleEString ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalCallAccess().getExternalCallKeyword_0());
            		
            // InternalCbsmDsl.g:2349:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCbsmDsl.g:2350:4: (lv_name_1_0= ruleEString )
            {
            // InternalCbsmDsl.g:2350:4: (lv_name_1_0= ruleEString )
            // InternalCbsmDsl.g:2351:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExternalCallAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalCallRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalCallAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCbsmDsl.g:2372:3: (otherlv_3= 'predecessor' ( ( ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==45) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalCbsmDsl.g:2373:4: otherlv_3= 'predecessor' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getExternalCallAccess().getPredecessorKeyword_3_0());
                    			
                    // InternalCbsmDsl.g:2377:4: ( ( ruleEString ) )
                    // InternalCbsmDsl.g:2378:5: ( ruleEString )
                    {
                    // InternalCbsmDsl.g:2378:5: ( ruleEString )
                    // InternalCbsmDsl.g:2379:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExternalCallRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getExternalCallAccess().getPredecessorActionCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCbsmDsl.g:2394:3: (otherlv_5= 'successor' ( ( ruleEString ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==46) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalCbsmDsl.g:2395:4: otherlv_5= 'successor' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,46,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getExternalCallAccess().getSuccessorKeyword_4_0());
                    			
                    // InternalCbsmDsl.g:2399:4: ( ( ruleEString ) )
                    // InternalCbsmDsl.g:2400:5: ( ruleEString )
                    {
                    // InternalCbsmDsl.g:2400:5: ( ruleEString )
                    // InternalCbsmDsl.g:2401:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExternalCallRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getExternalCallAccess().getSuccessorActionCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_49);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getExternalCallAccess().getRequiredServiceKeyword_5());
            		
            // InternalCbsmDsl.g:2420:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:2421:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:2421:4: ( ruleEString )
            // InternalCbsmDsl.g:2422:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalCallRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExternalCallAccess().getRequiredServiceSignatureCrossReference_6_0());
            				
            pushFollow(FOLLOW_50);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getExternalCallAccess().getRequiredRoleOfServiceKeyword_7());
            		
            // InternalCbsmDsl.g:2440:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:2441:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:2441:4: ( ruleEString )
            // InternalCbsmDsl.g:2442:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalCallRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExternalCallAccess().getRequiredRoleOfServiceRequiredRoleCrossReference_8_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getExternalCallAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleExternalCall"


    // $ANTLR start "entryRuleLoop"
    // InternalCbsmDsl.g:2464:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalCbsmDsl.g:2464:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalCbsmDsl.g:2465:2: iv_ruleLoop= ruleLoop EOF
            {
             newCompositeNode(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoop=ruleLoop();

            state._fsp--;

             current =iv_ruleLoop; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalCbsmDsl.g:2471:1: ruleLoop returns [EObject current=null] : ( () otherlv_1= 'Loop' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? otherlv_8= 'loopBehavior' ( (lv_loopBehavior_9_0= ruleBehaviorDescription ) ) otherlv_10= '}' ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_loopBehavior_9_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:2477:2: ( ( () otherlv_1= 'Loop' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? otherlv_8= 'loopBehavior' ( (lv_loopBehavior_9_0= ruleBehaviorDescription ) ) otherlv_10= '}' ) )
            // InternalCbsmDsl.g:2478:2: ( () otherlv_1= 'Loop' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? otherlv_8= 'loopBehavior' ( (lv_loopBehavior_9_0= ruleBehaviorDescription ) ) otherlv_10= '}' )
            {
            // InternalCbsmDsl.g:2478:2: ( () otherlv_1= 'Loop' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? otherlv_8= 'loopBehavior' ( (lv_loopBehavior_9_0= ruleBehaviorDescription ) ) otherlv_10= '}' )
            // InternalCbsmDsl.g:2479:3: () otherlv_1= 'Loop' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? otherlv_8= 'loopBehavior' ( (lv_loopBehavior_9_0= ruleBehaviorDescription ) ) otherlv_10= '}'
            {
            // InternalCbsmDsl.g:2479:3: ()
            // InternalCbsmDsl.g:2480:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoopAccess().getLoopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getLoopKeyword_1());
            		
            // InternalCbsmDsl.g:2490:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCbsmDsl.g:2491:4: (lv_name_2_0= ruleEString )
            {
            // InternalCbsmDsl.g:2491:4: (lv_name_2_0= ruleEString )
            // InternalCbsmDsl.g:2492:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLoopAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_51); 

            			newLeafNode(otherlv_3, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCbsmDsl.g:2513:3: (otherlv_4= 'predecessor' ( ( ruleEString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==45) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalCbsmDsl.g:2514:4: otherlv_4= 'predecessor' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getLoopAccess().getPredecessorKeyword_4_0());
                    			
                    // InternalCbsmDsl.g:2518:4: ( ( ruleEString ) )
                    // InternalCbsmDsl.g:2519:5: ( ruleEString )
                    {
                    // InternalCbsmDsl.g:2519:5: ( ruleEString )
                    // InternalCbsmDsl.g:2520:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLoopRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLoopAccess().getPredecessorActionCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCbsmDsl.g:2535:3: (otherlv_6= 'successor' ( ( ruleEString ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==46) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalCbsmDsl.g:2536:4: otherlv_6= 'successor' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getLoopAccess().getSuccessorKeyword_5_0());
                    			
                    // InternalCbsmDsl.g:2540:4: ( ( ruleEString ) )
                    // InternalCbsmDsl.g:2541:5: ( ruleEString )
                    {
                    // InternalCbsmDsl.g:2541:5: ( ruleEString )
                    // InternalCbsmDsl.g:2542:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLoopRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLoopAccess().getSuccessorActionCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,51,FOLLOW_32); 

            			newLeafNode(otherlv_8, grammarAccess.getLoopAccess().getLoopBehaviorKeyword_6());
            		
            // InternalCbsmDsl.g:2561:3: ( (lv_loopBehavior_9_0= ruleBehaviorDescription ) )
            // InternalCbsmDsl.g:2562:4: (lv_loopBehavior_9_0= ruleBehaviorDescription )
            {
            // InternalCbsmDsl.g:2562:4: (lv_loopBehavior_9_0= ruleBehaviorDescription )
            // InternalCbsmDsl.g:2563:5: lv_loopBehavior_9_0= ruleBehaviorDescription
            {

            					newCompositeNode(grammarAccess.getLoopAccess().getLoopBehaviorBehaviorDescriptionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_12);
            lv_loopBehavior_9_0=ruleBehaviorDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopRule());
            					}
            					set(
            						current,
            						"loopBehavior",
            						lv_loopBehavior_9_0,
            						"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.BehaviorDescription");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleBranch"
    // InternalCbsmDsl.g:2588:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // InternalCbsmDsl.g:2588:47: (iv_ruleBranch= ruleBranch EOF )
            // InternalCbsmDsl.g:2589:2: iv_ruleBranch= ruleBranch EOF
            {
             newCompositeNode(grammarAccess.getBranchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBranch=ruleBranch();

            state._fsp--;

             current =iv_ruleBranch; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBranch"


    // $ANTLR start "ruleBranch"
    // InternalCbsmDsl.g:2595:1: ruleBranch returns [EObject current=null] : ( () otherlv_1= 'Branch' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? (otherlv_8= 'branchPaths' otherlv_9= '{' ( (lv_branchPaths_10_0= ruleBranchPath ) ) (otherlv_11= ',' ( (lv_branchPaths_12_0= ruleBranchPath ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_branchPaths_10_0 = null;

        EObject lv_branchPaths_12_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:2601:2: ( ( () otherlv_1= 'Branch' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? (otherlv_8= 'branchPaths' otherlv_9= '{' ( (lv_branchPaths_10_0= ruleBranchPath ) ) (otherlv_11= ',' ( (lv_branchPaths_12_0= ruleBranchPath ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalCbsmDsl.g:2602:2: ( () otherlv_1= 'Branch' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? (otherlv_8= 'branchPaths' otherlv_9= '{' ( (lv_branchPaths_10_0= ruleBranchPath ) ) (otherlv_11= ',' ( (lv_branchPaths_12_0= ruleBranchPath ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalCbsmDsl.g:2602:2: ( () otherlv_1= 'Branch' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? (otherlv_8= 'branchPaths' otherlv_9= '{' ( (lv_branchPaths_10_0= ruleBranchPath ) ) (otherlv_11= ',' ( (lv_branchPaths_12_0= ruleBranchPath ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalCbsmDsl.g:2603:3: () otherlv_1= 'Branch' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? (otherlv_8= 'branchPaths' otherlv_9= '{' ( (lv_branchPaths_10_0= ruleBranchPath ) ) (otherlv_11= ',' ( (lv_branchPaths_12_0= ruleBranchPath ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // InternalCbsmDsl.g:2603:3: ()
            // InternalCbsmDsl.g:2604:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBranchAccess().getBranchAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBranchAccess().getBranchKeyword_1());
            		
            // InternalCbsmDsl.g:2614:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCbsmDsl.g:2615:4: (lv_name_2_0= ruleEString )
            {
            // InternalCbsmDsl.g:2615:4: (lv_name_2_0= ruleEString )
            // InternalCbsmDsl.g:2616:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBranchAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBranchRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_54); 

            			newLeafNode(otherlv_3, grammarAccess.getBranchAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCbsmDsl.g:2637:3: (otherlv_4= 'predecessor' ( ( ruleEString ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==45) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalCbsmDsl.g:2638:4: otherlv_4= 'predecessor' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getBranchAccess().getPredecessorKeyword_4_0());
                    			
                    // InternalCbsmDsl.g:2642:4: ( ( ruleEString ) )
                    // InternalCbsmDsl.g:2643:5: ( ruleEString )
                    {
                    // InternalCbsmDsl.g:2643:5: ( ruleEString )
                    // InternalCbsmDsl.g:2644:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBranchRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBranchAccess().getPredecessorActionCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_55);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCbsmDsl.g:2659:3: (otherlv_6= 'successor' ( ( ruleEString ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==46) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalCbsmDsl.g:2660:4: otherlv_6= 'successor' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getBranchAccess().getSuccessorKeyword_5_0());
                    			
                    // InternalCbsmDsl.g:2664:4: ( ( ruleEString ) )
                    // InternalCbsmDsl.g:2665:5: ( ruleEString )
                    {
                    // InternalCbsmDsl.g:2665:5: ( ruleEString )
                    // InternalCbsmDsl.g:2666:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBranchRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBranchAccess().getSuccessorActionCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_56);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCbsmDsl.g:2681:3: (otherlv_8= 'branchPaths' otherlv_9= '{' ( (lv_branchPaths_10_0= ruleBranchPath ) ) (otherlv_11= ',' ( (lv_branchPaths_12_0= ruleBranchPath ) ) )* otherlv_13= '}' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==53) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalCbsmDsl.g:2682:4: otherlv_8= 'branchPaths' otherlv_9= '{' ( (lv_branchPaths_10_0= ruleBranchPath ) ) (otherlv_11= ',' ( (lv_branchPaths_12_0= ruleBranchPath ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,53,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getBranchAccess().getBranchPathsKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_57); 

                    				newLeafNode(otherlv_9, grammarAccess.getBranchAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCbsmDsl.g:2690:4: ( (lv_branchPaths_10_0= ruleBranchPath ) )
                    // InternalCbsmDsl.g:2691:5: (lv_branchPaths_10_0= ruleBranchPath )
                    {
                    // InternalCbsmDsl.g:2691:5: (lv_branchPaths_10_0= ruleBranchPath )
                    // InternalCbsmDsl.g:2692:6: lv_branchPaths_10_0= ruleBranchPath
                    {

                    						newCompositeNode(grammarAccess.getBranchAccess().getBranchPathsBranchPathParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_branchPaths_10_0=ruleBranchPath();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBranchRule());
                    						}
                    						add(
                    							current,
                    							"branchPaths",
                    							lv_branchPaths_10_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.BranchPath");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:2709:4: (otherlv_11= ',' ( (lv_branchPaths_12_0= ruleBranchPath ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==14) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:2710:5: otherlv_11= ',' ( (lv_branchPaths_12_0= ruleBranchPath ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_57); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getBranchAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:2714:5: ( (lv_branchPaths_12_0= ruleBranchPath ) )
                    	    // InternalCbsmDsl.g:2715:6: (lv_branchPaths_12_0= ruleBranchPath )
                    	    {
                    	    // InternalCbsmDsl.g:2715:6: (lv_branchPaths_12_0= ruleBranchPath )
                    	    // InternalCbsmDsl.g:2716:7: lv_branchPaths_12_0= ruleBranchPath
                    	    {

                    	    							newCompositeNode(grammarAccess.getBranchAccess().getBranchPathsBranchPathParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_branchPaths_12_0=ruleBranchPath();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBranchRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"branchPaths",
                    	    								lv_branchPaths_12_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.BranchPath");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_13, grammarAccess.getBranchAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getBranchAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleBranch"


    // $ANTLR start "entryRuleBranchPath"
    // InternalCbsmDsl.g:2747:1: entryRuleBranchPath returns [EObject current=null] : iv_ruleBranchPath= ruleBranchPath EOF ;
    public final EObject entryRuleBranchPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranchPath = null;


        try {
            // InternalCbsmDsl.g:2747:51: (iv_ruleBranchPath= ruleBranchPath EOF )
            // InternalCbsmDsl.g:2748:2: iv_ruleBranchPath= ruleBranchPath EOF
            {
             newCompositeNode(grammarAccess.getBranchPathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBranchPath=ruleBranchPath();

            state._fsp--;

             current =iv_ruleBranchPath; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBranchPath"


    // $ANTLR start "ruleBranchPath"
    // InternalCbsmDsl.g:2754:1: ruleBranchPath returns [EObject current=null] : ( () otherlv_1= 'BranchPath' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'branchBehavior' ( (lv_branchBehavior_5_0= ruleBehaviorDescription ) ) otherlv_6= '}' ) ;
    public final EObject ruleBranchPath() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_branchBehavior_5_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:2760:2: ( ( () otherlv_1= 'BranchPath' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'branchBehavior' ( (lv_branchBehavior_5_0= ruleBehaviorDescription ) ) otherlv_6= '}' ) )
            // InternalCbsmDsl.g:2761:2: ( () otherlv_1= 'BranchPath' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'branchBehavior' ( (lv_branchBehavior_5_0= ruleBehaviorDescription ) ) otherlv_6= '}' )
            {
            // InternalCbsmDsl.g:2761:2: ( () otherlv_1= 'BranchPath' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'branchBehavior' ( (lv_branchBehavior_5_0= ruleBehaviorDescription ) ) otherlv_6= '}' )
            // InternalCbsmDsl.g:2762:3: () otherlv_1= 'BranchPath' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'branchBehavior' ( (lv_branchBehavior_5_0= ruleBehaviorDescription ) ) otherlv_6= '}'
            {
            // InternalCbsmDsl.g:2762:3: ()
            // InternalCbsmDsl.g:2763:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBranchPathAccess().getBranchPathAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBranchPathAccess().getBranchPathKeyword_1());
            		
            // InternalCbsmDsl.g:2773:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCbsmDsl.g:2774:4: (lv_name_2_0= ruleEString )
            {
            // InternalCbsmDsl.g:2774:4: (lv_name_2_0= ruleEString )
            // InternalCbsmDsl.g:2775:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBranchPathAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBranchPathRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_58); 

            			newLeafNode(otherlv_3, grammarAccess.getBranchPathAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,55,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getBranchPathAccess().getBranchBehaviorKeyword_4());
            		
            // InternalCbsmDsl.g:2800:3: ( (lv_branchBehavior_5_0= ruleBehaviorDescription ) )
            // InternalCbsmDsl.g:2801:4: (lv_branchBehavior_5_0= ruleBehaviorDescription )
            {
            // InternalCbsmDsl.g:2801:4: (lv_branchBehavior_5_0= ruleBehaviorDescription )
            // InternalCbsmDsl.g:2802:5: lv_branchBehavior_5_0= ruleBehaviorDescription
            {

            					newCompositeNode(grammarAccess.getBranchPathAccess().getBranchBehaviorBehaviorDescriptionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_branchBehavior_5_0=ruleBehaviorDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBranchPathRule());
            					}
            					set(
            						current,
            						"branchBehavior",
            						lv_branchBehavior_5_0,
            						"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.BehaviorDescription");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getBranchPathAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleBranchPath"


    // $ANTLR start "entryRuleComplexType"
    // InternalCbsmDsl.g:2827:1: entryRuleComplexType returns [EObject current=null] : iv_ruleComplexType= ruleComplexType EOF ;
    public final EObject entryRuleComplexType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexType = null;


        try {
            // InternalCbsmDsl.g:2827:52: (iv_ruleComplexType= ruleComplexType EOF )
            // InternalCbsmDsl.g:2828:2: iv_ruleComplexType= ruleComplexType EOF
            {
             newCompositeNode(grammarAccess.getComplexTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexType=ruleComplexType();

            state._fsp--;

             current =iv_ruleComplexType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComplexType"


    // $ANTLR start "ruleComplexType"
    // InternalCbsmDsl.g:2834:1: ruleComplexType returns [EObject current=null] : ( () otherlv_1= 'ComplexType' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleComplexType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:2840:2: ( ( () otherlv_1= 'ComplexType' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalCbsmDsl.g:2841:2: ( () otherlv_1= 'ComplexType' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalCbsmDsl.g:2841:2: ( () otherlv_1= 'ComplexType' ( (lv_name_2_0= ruleEString ) ) )
            // InternalCbsmDsl.g:2842:3: () otherlv_1= 'ComplexType' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalCbsmDsl.g:2842:3: ()
            // InternalCbsmDsl.g:2843:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComplexTypeAccess().getComplexTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexTypeAccess().getComplexTypeKeyword_1());
            		
            // InternalCbsmDsl.g:2853:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCbsmDsl.g:2854:4: (lv_name_2_0= ruleEString )
            {
            // InternalCbsmDsl.g:2854:4: (lv_name_2_0= ruleEString )
            // InternalCbsmDsl.g:2855:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComplexTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.EString");
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
    // $ANTLR end "ruleComplexType"


    // $ANTLR start "entryRuleSimpleType"
    // InternalCbsmDsl.g:2876:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // InternalCbsmDsl.g:2876:51: (iv_ruleSimpleType= ruleSimpleType EOF )
            // InternalCbsmDsl.g:2877:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             newCompositeNode(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleType=ruleSimpleType();

            state._fsp--;

             current =iv_ruleSimpleType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSimpleType"


    // $ANTLR start "ruleSimpleType"
    // InternalCbsmDsl.g:2883:1: ruleSimpleType returns [EObject current=null] : (otherlv_0= 'SimpleType' otherlv_1= '{' otherlv_2= 'typeInstance' ( (lv_typeInstance_3_0= ruleSimpleTypeInstance ) ) otherlv_4= '}' ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_typeInstance_3_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:2889:2: ( (otherlv_0= 'SimpleType' otherlv_1= '{' otherlv_2= 'typeInstance' ( (lv_typeInstance_3_0= ruleSimpleTypeInstance ) ) otherlv_4= '}' ) )
            // InternalCbsmDsl.g:2890:2: (otherlv_0= 'SimpleType' otherlv_1= '{' otherlv_2= 'typeInstance' ( (lv_typeInstance_3_0= ruleSimpleTypeInstance ) ) otherlv_4= '}' )
            {
            // InternalCbsmDsl.g:2890:2: (otherlv_0= 'SimpleType' otherlv_1= '{' otherlv_2= 'typeInstance' ( (lv_typeInstance_3_0= ruleSimpleTypeInstance ) ) otherlv_4= '}' )
            // InternalCbsmDsl.g:2891:3: otherlv_0= 'SimpleType' otherlv_1= '{' otherlv_2= 'typeInstance' ( (lv_typeInstance_3_0= ruleSimpleTypeInstance ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSimpleTypeAccess().getSimpleTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_59); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,58,FOLLOW_60); 

            			newLeafNode(otherlv_2, grammarAccess.getSimpleTypeAccess().getTypeInstanceKeyword_2());
            		
            // InternalCbsmDsl.g:2903:3: ( (lv_typeInstance_3_0= ruleSimpleTypeInstance ) )
            // InternalCbsmDsl.g:2904:4: (lv_typeInstance_3_0= ruleSimpleTypeInstance )
            {
            // InternalCbsmDsl.g:2904:4: (lv_typeInstance_3_0= ruleSimpleTypeInstance )
            // InternalCbsmDsl.g:2905:5: lv_typeInstance_3_0= ruleSimpleTypeInstance
            {

            					newCompositeNode(grammarAccess.getSimpleTypeAccess().getTypeInstanceSimpleTypeInstanceEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_typeInstance_3_0=ruleSimpleTypeInstance();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleTypeRule());
            					}
            					set(
            						current,
            						"typeInstance",
            						lv_typeInstance_3_0,
            						"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.SimpleTypeInstance");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSimpleTypeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSimpleType"


    // $ANTLR start "entryRuleAssemblyContext"
    // InternalCbsmDsl.g:2930:1: entryRuleAssemblyContext returns [EObject current=null] : iv_ruleAssemblyContext= ruleAssemblyContext EOF ;
    public final EObject entryRuleAssemblyContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyContext = null;


        try {
            // InternalCbsmDsl.g:2930:56: (iv_ruleAssemblyContext= ruleAssemblyContext EOF )
            // InternalCbsmDsl.g:2931:2: iv_ruleAssemblyContext= ruleAssemblyContext EOF
            {
             newCompositeNode(grammarAccess.getAssemblyContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssemblyContext=ruleAssemblyContext();

            state._fsp--;

             current =iv_ruleAssemblyContext; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAssemblyContext"


    // $ANTLR start "ruleAssemblyContext"
    // InternalCbsmDsl.g:2937:1: ruleAssemblyContext returns [EObject current=null] : (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instantiatedComponent' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleAssemblyContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:2943:2: ( (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instantiatedComponent' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalCbsmDsl.g:2944:2: (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instantiatedComponent' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalCbsmDsl.g:2944:2: (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instantiatedComponent' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalCbsmDsl.g:2945:3: otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instantiatedComponent' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyContextAccess().getAssemblyContextKeyword_0());
            		
            // InternalCbsmDsl.g:2949:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCbsmDsl.g:2950:4: (lv_name_1_0= ruleEString )
            {
            // InternalCbsmDsl.g:2950:4: (lv_name_1_0= ruleEString )
            // InternalCbsmDsl.g:2951:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAssemblyContextAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssemblyContextRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_61); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,60,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getAssemblyContextAccess().getInstantiatedComponentKeyword_3());
            		
            // InternalCbsmDsl.g:2976:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:2977:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:2977:4: ( ruleEString )
            // InternalCbsmDsl.g:2978:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyContextAccess().getInstantiatedComponentComponentCrossReference_4_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleAssemblyContext"


    // $ANTLR start "entryRuleProvidedDelegationConnector"
    // InternalCbsmDsl.g:3000:1: entryRuleProvidedDelegationConnector returns [EObject current=null] : iv_ruleProvidedDelegationConnector= ruleProvidedDelegationConnector EOF ;
    public final EObject entryRuleProvidedDelegationConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedDelegationConnector = null;


        try {
            // InternalCbsmDsl.g:3000:68: (iv_ruleProvidedDelegationConnector= ruleProvidedDelegationConnector EOF )
            // InternalCbsmDsl.g:3001:2: iv_ruleProvidedDelegationConnector= ruleProvidedDelegationConnector EOF
            {
             newCompositeNode(grammarAccess.getProvidedDelegationConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProvidedDelegationConnector=ruleProvidedDelegationConnector();

            state._fsp--;

             current =iv_ruleProvidedDelegationConnector; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProvidedDelegationConnector"


    // $ANTLR start "ruleProvidedDelegationConnector"
    // InternalCbsmDsl.g:3007:1: ruleProvidedDelegationConnector returns [EObject current=null] : (otherlv_0= 'ProvidedDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'innerAssemblyContext' ( ( ruleEString ) ) otherlv_5= 'outerAssemblyContext' ( ( ruleEString ) ) otherlv_7= 'innerProvidedRole' ( ( ruleEString ) ) otherlv_9= 'outerProvidedRole' ( ( ruleEString ) ) otherlv_11= '}' ) ;
    public final EObject ruleProvidedDelegationConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:3013:2: ( (otherlv_0= 'ProvidedDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'innerAssemblyContext' ( ( ruleEString ) ) otherlv_5= 'outerAssemblyContext' ( ( ruleEString ) ) otherlv_7= 'innerProvidedRole' ( ( ruleEString ) ) otherlv_9= 'outerProvidedRole' ( ( ruleEString ) ) otherlv_11= '}' ) )
            // InternalCbsmDsl.g:3014:2: (otherlv_0= 'ProvidedDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'innerAssemblyContext' ( ( ruleEString ) ) otherlv_5= 'outerAssemblyContext' ( ( ruleEString ) ) otherlv_7= 'innerProvidedRole' ( ( ruleEString ) ) otherlv_9= 'outerProvidedRole' ( ( ruleEString ) ) otherlv_11= '}' )
            {
            // InternalCbsmDsl.g:3014:2: (otherlv_0= 'ProvidedDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'innerAssemblyContext' ( ( ruleEString ) ) otherlv_5= 'outerAssemblyContext' ( ( ruleEString ) ) otherlv_7= 'innerProvidedRole' ( ( ruleEString ) ) otherlv_9= 'outerProvidedRole' ( ( ruleEString ) ) otherlv_11= '}' )
            // InternalCbsmDsl.g:3015:3: otherlv_0= 'ProvidedDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'innerAssemblyContext' ( ( ruleEString ) ) otherlv_5= 'outerAssemblyContext' ( ( ruleEString ) ) otherlv_7= 'innerProvidedRole' ( ( ruleEString ) ) otherlv_9= 'outerProvidedRole' ( ( ruleEString ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProvidedDelegationConnectorAccess().getProvidedDelegationConnectorKeyword_0());
            		
            // InternalCbsmDsl.g:3019:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCbsmDsl.g:3020:4: (lv_name_1_0= ruleEString )
            {
            // InternalCbsmDsl.g:3020:4: (lv_name_1_0= ruleEString )
            // InternalCbsmDsl.g:3021:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProvidedDelegationConnectorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProvidedDelegationConnectorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_62); 

            			newLeafNode(otherlv_2, grammarAccess.getProvidedDelegationConnectorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,62,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getProvidedDelegationConnectorAccess().getInnerAssemblyContextKeyword_3());
            		
            // InternalCbsmDsl.g:3046:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:3047:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:3047:4: ( ruleEString )
            // InternalCbsmDsl.g:3048:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProvidedDelegationConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getProvidedDelegationConnectorAccess().getInnerAssemblyContextAssemblyContextCrossReference_4_0());
            				
            pushFollow(FOLLOW_63);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,63,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getProvidedDelegationConnectorAccess().getOuterAssemblyContextKeyword_5());
            		
            // InternalCbsmDsl.g:3066:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:3067:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:3067:4: ( ruleEString )
            // InternalCbsmDsl.g:3068:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProvidedDelegationConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getProvidedDelegationConnectorAccess().getOuterAssemblyContextAssemblyContextCrossReference_6_0());
            				
            pushFollow(FOLLOW_64);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,64,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getProvidedDelegationConnectorAccess().getInnerProvidedRoleKeyword_7());
            		
            // InternalCbsmDsl.g:3086:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:3087:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:3087:4: ( ruleEString )
            // InternalCbsmDsl.g:3088:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProvidedDelegationConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getProvidedDelegationConnectorAccess().getInnerProvidedRoleProvidedRoleCrossReference_8_0());
            				
            pushFollow(FOLLOW_65);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,65,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getProvidedDelegationConnectorAccess().getOuterProvidedRoleKeyword_9());
            		
            // InternalCbsmDsl.g:3106:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:3107:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:3107:4: ( ruleEString )
            // InternalCbsmDsl.g:3108:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProvidedDelegationConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getProvidedDelegationConnectorAccess().getOuterProvidedRoleProvidedRoleCrossReference_10_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getProvidedDelegationConnectorAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleProvidedDelegationConnector"


    // $ANTLR start "entryRuleRequiredDelegationConnector"
    // InternalCbsmDsl.g:3130:1: entryRuleRequiredDelegationConnector returns [EObject current=null] : iv_ruleRequiredDelegationConnector= ruleRequiredDelegationConnector EOF ;
    public final EObject entryRuleRequiredDelegationConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredDelegationConnector = null;


        try {
            // InternalCbsmDsl.g:3130:68: (iv_ruleRequiredDelegationConnector= ruleRequiredDelegationConnector EOF )
            // InternalCbsmDsl.g:3131:2: iv_ruleRequiredDelegationConnector= ruleRequiredDelegationConnector EOF
            {
             newCompositeNode(grammarAccess.getRequiredDelegationConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequiredDelegationConnector=ruleRequiredDelegationConnector();

            state._fsp--;

             current =iv_ruleRequiredDelegationConnector; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRequiredDelegationConnector"


    // $ANTLR start "ruleRequiredDelegationConnector"
    // InternalCbsmDsl.g:3137:1: ruleRequiredDelegationConnector returns [EObject current=null] : (otherlv_0= 'RequiredDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'innerAssemblyContext' ( ( ruleEString ) ) otherlv_5= 'outerAssemblyContext' ( ( ruleEString ) ) otherlv_7= 'innerRequiredRole' ( ( ruleEString ) ) otherlv_9= 'outerRequiredRole' ( ( ruleEString ) ) otherlv_11= '}' ) ;
    public final EObject ruleRequiredDelegationConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:3143:2: ( (otherlv_0= 'RequiredDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'innerAssemblyContext' ( ( ruleEString ) ) otherlv_5= 'outerAssemblyContext' ( ( ruleEString ) ) otherlv_7= 'innerRequiredRole' ( ( ruleEString ) ) otherlv_9= 'outerRequiredRole' ( ( ruleEString ) ) otherlv_11= '}' ) )
            // InternalCbsmDsl.g:3144:2: (otherlv_0= 'RequiredDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'innerAssemblyContext' ( ( ruleEString ) ) otherlv_5= 'outerAssemblyContext' ( ( ruleEString ) ) otherlv_7= 'innerRequiredRole' ( ( ruleEString ) ) otherlv_9= 'outerRequiredRole' ( ( ruleEString ) ) otherlv_11= '}' )
            {
            // InternalCbsmDsl.g:3144:2: (otherlv_0= 'RequiredDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'innerAssemblyContext' ( ( ruleEString ) ) otherlv_5= 'outerAssemblyContext' ( ( ruleEString ) ) otherlv_7= 'innerRequiredRole' ( ( ruleEString ) ) otherlv_9= 'outerRequiredRole' ( ( ruleEString ) ) otherlv_11= '}' )
            // InternalCbsmDsl.g:3145:3: otherlv_0= 'RequiredDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'innerAssemblyContext' ( ( ruleEString ) ) otherlv_5= 'outerAssemblyContext' ( ( ruleEString ) ) otherlv_7= 'innerRequiredRole' ( ( ruleEString ) ) otherlv_9= 'outerRequiredRole' ( ( ruleEString ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRequiredDelegationConnectorAccess().getRequiredDelegationConnectorKeyword_0());
            		
            // InternalCbsmDsl.g:3149:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCbsmDsl.g:3150:4: (lv_name_1_0= ruleEString )
            {
            // InternalCbsmDsl.g:3150:4: (lv_name_1_0= ruleEString )
            // InternalCbsmDsl.g:3151:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequiredDelegationConnectorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequiredDelegationConnectorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_62); 

            			newLeafNode(otherlv_2, grammarAccess.getRequiredDelegationConnectorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,62,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRequiredDelegationConnectorAccess().getInnerAssemblyContextKeyword_3());
            		
            // InternalCbsmDsl.g:3176:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:3177:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:3177:4: ( ruleEString )
            // InternalCbsmDsl.g:3178:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequiredDelegationConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRequiredDelegationConnectorAccess().getInnerAssemblyContextAssemblyContextCrossReference_4_0());
            				
            pushFollow(FOLLOW_63);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,63,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getRequiredDelegationConnectorAccess().getOuterAssemblyContextKeyword_5());
            		
            // InternalCbsmDsl.g:3196:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:3197:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:3197:4: ( ruleEString )
            // InternalCbsmDsl.g:3198:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequiredDelegationConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRequiredDelegationConnectorAccess().getOuterAssemblyContextAssemblyContextCrossReference_6_0());
            				
            pushFollow(FOLLOW_66);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,67,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getRequiredDelegationConnectorAccess().getInnerRequiredRoleKeyword_7());
            		
            // InternalCbsmDsl.g:3216:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:3217:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:3217:4: ( ruleEString )
            // InternalCbsmDsl.g:3218:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequiredDelegationConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRequiredDelegationConnectorAccess().getInnerRequiredRoleRequiredRoleCrossReference_8_0());
            				
            pushFollow(FOLLOW_67);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,68,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getRequiredDelegationConnectorAccess().getOuterRequiredRoleKeyword_9());
            		
            // InternalCbsmDsl.g:3236:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:3237:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:3237:4: ( ruleEString )
            // InternalCbsmDsl.g:3238:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequiredDelegationConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRequiredDelegationConnectorAccess().getOuterRequiredRoleRequiredRoleCrossReference_10_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getRequiredDelegationConnectorAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleRequiredDelegationConnector"


    // $ANTLR start "entryRuleAssemblyConnector"
    // InternalCbsmDsl.g:3260:1: entryRuleAssemblyConnector returns [EObject current=null] : iv_ruleAssemblyConnector= ruleAssemblyConnector EOF ;
    public final EObject entryRuleAssemblyConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyConnector = null;


        try {
            // InternalCbsmDsl.g:3260:58: (iv_ruleAssemblyConnector= ruleAssemblyConnector EOF )
            // InternalCbsmDsl.g:3261:2: iv_ruleAssemblyConnector= ruleAssemblyConnector EOF
            {
             newCompositeNode(grammarAccess.getAssemblyConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssemblyConnector=ruleAssemblyConnector();

            state._fsp--;

             current =iv_ruleAssemblyConnector; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAssemblyConnector"


    // $ANTLR start "ruleAssemblyConnector"
    // InternalCbsmDsl.g:3267:1: ruleAssemblyConnector returns [EObject current=null] : (otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'connectedProvidedRole' ( ( ruleEString ) ) otherlv_5= 'connectedRequiredRole' ( ( ruleEString ) ) otherlv_7= 'connectedProvidedAssemblyContext' ( ( ruleEString ) ) otherlv_9= 'connectedRequiredAssemblyContext' ( ( ruleEString ) ) otherlv_11= '}' ) ;
    public final EObject ruleAssemblyConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:3273:2: ( (otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'connectedProvidedRole' ( ( ruleEString ) ) otherlv_5= 'connectedRequiredRole' ( ( ruleEString ) ) otherlv_7= 'connectedProvidedAssemblyContext' ( ( ruleEString ) ) otherlv_9= 'connectedRequiredAssemblyContext' ( ( ruleEString ) ) otherlv_11= '}' ) )
            // InternalCbsmDsl.g:3274:2: (otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'connectedProvidedRole' ( ( ruleEString ) ) otherlv_5= 'connectedRequiredRole' ( ( ruleEString ) ) otherlv_7= 'connectedProvidedAssemblyContext' ( ( ruleEString ) ) otherlv_9= 'connectedRequiredAssemblyContext' ( ( ruleEString ) ) otherlv_11= '}' )
            {
            // InternalCbsmDsl.g:3274:2: (otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'connectedProvidedRole' ( ( ruleEString ) ) otherlv_5= 'connectedRequiredRole' ( ( ruleEString ) ) otherlv_7= 'connectedProvidedAssemblyContext' ( ( ruleEString ) ) otherlv_9= 'connectedRequiredAssemblyContext' ( ( ruleEString ) ) otherlv_11= '}' )
            // InternalCbsmDsl.g:3275:3: otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'connectedProvidedRole' ( ( ruleEString ) ) otherlv_5= 'connectedRequiredRole' ( ( ruleEString ) ) otherlv_7= 'connectedProvidedAssemblyContext' ( ( ruleEString ) ) otherlv_9= 'connectedRequiredAssemblyContext' ( ( ruleEString ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyConnectorAccess().getAssemblyConnectorKeyword_0());
            		
            // InternalCbsmDsl.g:3279:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCbsmDsl.g:3280:4: (lv_name_1_0= ruleEString )
            {
            // InternalCbsmDsl.g:3280:4: (lv_name_1_0= ruleEString )
            // InternalCbsmDsl.g:3281:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssemblyConnectorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_68); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyConnectorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,70,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getAssemblyConnectorAccess().getConnectedProvidedRoleKeyword_3());
            		
            // InternalCbsmDsl.g:3306:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:3307:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:3307:4: ( ruleEString )
            // InternalCbsmDsl.g:3308:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getConnectedProvidedRoleProvidedRoleCrossReference_4_0());
            				
            pushFollow(FOLLOW_69);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,71,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getAssemblyConnectorAccess().getConnectedRequiredRoleKeyword_5());
            		
            // InternalCbsmDsl.g:3326:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:3327:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:3327:4: ( ruleEString )
            // InternalCbsmDsl.g:3328:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getConnectedRequiredRoleRequiredRoleCrossReference_6_0());
            				
            pushFollow(FOLLOW_70);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,72,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getAssemblyConnectorAccess().getConnectedProvidedAssemblyContextKeyword_7());
            		
            // InternalCbsmDsl.g:3346:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:3347:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:3347:4: ( ruleEString )
            // InternalCbsmDsl.g:3348:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getConnectedProvidedAssemblyContextAssemblyContextCrossReference_8_0());
            				
            pushFollow(FOLLOW_71);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,73,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getAssemblyConnectorAccess().getConnectedRequiredAssemblyContextKeyword_9());
            		
            // InternalCbsmDsl.g:3366:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:3367:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:3367:4: ( ruleEString )
            // InternalCbsmDsl.g:3368:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getConnectedRequiredAssemblyContextAssemblyContextCrossReference_10_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getAssemblyConnectorAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleAssemblyConnector"


    // $ANTLR start "entryRuleContainer"
    // InternalCbsmDsl.g:3390:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalCbsmDsl.g:3390:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalCbsmDsl.g:3391:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalCbsmDsl.g:3397:1: ruleContainer returns [EObject current=null] : ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:3403:2: ( ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalCbsmDsl.g:3404:2: ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalCbsmDsl.g:3404:2: ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) )
            // InternalCbsmDsl.g:3405:3: () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalCbsmDsl.g:3405:3: ()
            // InternalCbsmDsl.g:3406:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContainerAccess().getContainerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,74,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getContainerKeyword_1());
            		
            // InternalCbsmDsl.g:3416:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCbsmDsl.g:3417:4: (lv_name_2_0= ruleEString )
            {
            // InternalCbsmDsl.g:3417:4: (lv_name_2_0= ruleEString )
            // InternalCbsmDsl.g:3418:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getContainerAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContainerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.EString");
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
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleLink"
    // InternalCbsmDsl.g:3439:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalCbsmDsl.g:3439:45: (iv_ruleLink= ruleLink EOF )
            // InternalCbsmDsl.g:3440:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalCbsmDsl.g:3446:1: ruleLink returns [EObject current=null] : (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'linkedContainers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:3452:2: ( (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'linkedContainers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) )
            // InternalCbsmDsl.g:3453:2: (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'linkedContainers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            {
            // InternalCbsmDsl.g:3453:2: (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'linkedContainers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            // InternalCbsmDsl.g:3454:3: otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'linkedContainers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            // InternalCbsmDsl.g:3458:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCbsmDsl.g:3459:4: (lv_name_1_0= ruleEString )
            {
            // InternalCbsmDsl.g:3459:4: (lv_name_1_0= ruleEString )
            // InternalCbsmDsl.g:3460:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLinkAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinkRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_72); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,76,FOLLOW_73); 

            			newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getLinkedContainersKeyword_3());
            		
            otherlv_4=(Token)match(input,77,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getLeftParenthesisKeyword_4());
            		
            // InternalCbsmDsl.g:3489:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:3490:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:3490:4: ( ruleEString )
            // InternalCbsmDsl.g:3491:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLinkAccess().getLinkedContainersContainerCrossReference_5_0());
            				
            pushFollow(FOLLOW_74);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCbsmDsl.g:3505:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==14) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalCbsmDsl.g:3506:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalCbsmDsl.g:3510:4: ( ( ruleEString ) )
            	    // InternalCbsmDsl.g:3511:5: ( ruleEString )
            	    {
            	    // InternalCbsmDsl.g:3511:5: ( ruleEString )
            	    // InternalCbsmDsl.g:3512:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLinkRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getLinkAccess().getLinkedContainersContainerCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_74);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            otherlv_8=(Token)match(input,78,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getLinkAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleAllocationContext"
    // InternalCbsmDsl.g:3539:1: entryRuleAllocationContext returns [EObject current=null] : iv_ruleAllocationContext= ruleAllocationContext EOF ;
    public final EObject entryRuleAllocationContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocationContext = null;


        try {
            // InternalCbsmDsl.g:3539:58: (iv_ruleAllocationContext= ruleAllocationContext EOF )
            // InternalCbsmDsl.g:3540:2: iv_ruleAllocationContext= ruleAllocationContext EOF
            {
             newCompositeNode(grammarAccess.getAllocationContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllocationContext=ruleAllocationContext();

            state._fsp--;

             current =iv_ruleAllocationContext; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAllocationContext"


    // $ANTLR start "ruleAllocationContext"
    // InternalCbsmDsl.g:3546:1: ruleAllocationContext returns [EObject current=null] : (otherlv_0= 'AllocationContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'allocatedContainer' ( ( ruleEString ) ) otherlv_5= 'allocatedAssemblyContext' ( ( ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleAllocationContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:3552:2: ( (otherlv_0= 'AllocationContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'allocatedContainer' ( ( ruleEString ) ) otherlv_5= 'allocatedAssemblyContext' ( ( ruleEString ) ) otherlv_7= '}' ) )
            // InternalCbsmDsl.g:3553:2: (otherlv_0= 'AllocationContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'allocatedContainer' ( ( ruleEString ) ) otherlv_5= 'allocatedAssemblyContext' ( ( ruleEString ) ) otherlv_7= '}' )
            {
            // InternalCbsmDsl.g:3553:2: (otherlv_0= 'AllocationContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'allocatedContainer' ( ( ruleEString ) ) otherlv_5= 'allocatedAssemblyContext' ( ( ruleEString ) ) otherlv_7= '}' )
            // InternalCbsmDsl.g:3554:3: otherlv_0= 'AllocationContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'allocatedContainer' ( ( ruleEString ) ) otherlv_5= 'allocatedAssemblyContext' ( ( ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAllocationContextAccess().getAllocationContextKeyword_0());
            		
            // InternalCbsmDsl.g:3558:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCbsmDsl.g:3559:4: (lv_name_1_0= ruleEString )
            {
            // InternalCbsmDsl.g:3559:4: (lv_name_1_0= ruleEString )
            // InternalCbsmDsl.g:3560:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAllocationContextAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAllocationContextRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_75); 

            			newLeafNode(otherlv_2, grammarAccess.getAllocationContextAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,80,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getAllocationContextAccess().getAllocatedContainerKeyword_3());
            		
            // InternalCbsmDsl.g:3585:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:3586:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:3586:4: ( ruleEString )
            // InternalCbsmDsl.g:3587:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllocationContextAccess().getAllocatedContainerContainerCrossReference_4_0());
            				
            pushFollow(FOLLOW_76);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,81,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextKeyword_5());
            		
            // InternalCbsmDsl.g:3605:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:3606:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:3606:4: ( ruleEString )
            // InternalCbsmDsl.g:3607:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextAssemblyContextCrossReference_6_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAllocationContextAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleAllocationContext"


    // $ANTLR start "ruleSimpleTypeInstance"
    // InternalCbsmDsl.g:3629:1: ruleSimpleTypeInstance returns [Enumerator current=null] : ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Int' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) ) ;
    public final Enumerator ruleSimpleTypeInstance() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;


        	enterRule();

        try {
            // InternalCbsmDsl.g:3635:2: ( ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Int' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) ) )
            // InternalCbsmDsl.g:3636:2: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Int' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) )
            {
            // InternalCbsmDsl.g:3636:2: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Int' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) )
            int alt59=10;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt59=1;
                }
                break;
            case 83:
                {
                alt59=2;
                }
                break;
            case 84:
                {
                alt59=3;
                }
                break;
            case 85:
                {
                alt59=4;
                }
                break;
            case 86:
                {
                alt59=5;
                }
                break;
            case 87:
                {
                alt59=6;
                }
                break;
            case 88:
                {
                alt59=7;
                }
                break;
            case 89:
                {
                alt59=8;
                }
                break;
            case 90:
                {
                alt59=9;
                }
                break;
            case 91:
                {
                alt59=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalCbsmDsl.g:3637:3: (enumLiteral_0= 'Boolean' )
                    {
                    // InternalCbsmDsl.g:3637:3: (enumLiteral_0= 'Boolean' )
                    // InternalCbsmDsl.g:3638:4: enumLiteral_0= 'Boolean'
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeInstanceAccess().getBooleanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSimpleTypeInstanceAccess().getBooleanEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCbsmDsl.g:3645:3: (enumLiteral_1= 'Char' )
                    {
                    // InternalCbsmDsl.g:3645:3: (enumLiteral_1= 'Char' )
                    // InternalCbsmDsl.g:3646:4: enumLiteral_1= 'Char'
                    {
                    enumLiteral_1=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeInstanceAccess().getCharEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSimpleTypeInstanceAccess().getCharEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCbsmDsl.g:3653:3: (enumLiteral_2= 'Date' )
                    {
                    // InternalCbsmDsl.g:3653:3: (enumLiteral_2= 'Date' )
                    // InternalCbsmDsl.g:3654:4: enumLiteral_2= 'Date'
                    {
                    enumLiteral_2=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeInstanceAccess().getDateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSimpleTypeInstanceAccess().getDateEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCbsmDsl.g:3661:3: (enumLiteral_3= 'Double' )
                    {
                    // InternalCbsmDsl.g:3661:3: (enumLiteral_3= 'Double' )
                    // InternalCbsmDsl.g:3662:4: enumLiteral_3= 'Double'
                    {
                    enumLiteral_3=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeInstanceAccess().getDoubleEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSimpleTypeInstanceAccess().getDoubleEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCbsmDsl.g:3669:3: (enumLiteral_4= 'Float' )
                    {
                    // InternalCbsmDsl.g:3669:3: (enumLiteral_4= 'Float' )
                    // InternalCbsmDsl.g:3670:4: enumLiteral_4= 'Float'
                    {
                    enumLiteral_4=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeInstanceAccess().getFloatEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSimpleTypeInstanceAccess().getFloatEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalCbsmDsl.g:3677:3: (enumLiteral_5= 'List' )
                    {
                    // InternalCbsmDsl.g:3677:3: (enumLiteral_5= 'List' )
                    // InternalCbsmDsl.g:3678:4: enumLiteral_5= 'List'
                    {
                    enumLiteral_5=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeInstanceAccess().getListEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSimpleTypeInstanceAccess().getListEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalCbsmDsl.g:3685:3: (enumLiteral_6= 'Int' )
                    {
                    // InternalCbsmDsl.g:3685:3: (enumLiteral_6= 'Int' )
                    // InternalCbsmDsl.g:3686:4: enumLiteral_6= 'Int'
                    {
                    enumLiteral_6=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeInstanceAccess().getIntEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getSimpleTypeInstanceAccess().getIntEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalCbsmDsl.g:3693:3: (enumLiteral_7= 'Long' )
                    {
                    // InternalCbsmDsl.g:3693:3: (enumLiteral_7= 'Long' )
                    // InternalCbsmDsl.g:3694:4: enumLiteral_7= 'Long'
                    {
                    enumLiteral_7=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeInstanceAccess().getLongEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getSimpleTypeInstanceAccess().getLongEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalCbsmDsl.g:3701:3: (enumLiteral_8= 'Map' )
                    {
                    // InternalCbsmDsl.g:3701:3: (enumLiteral_8= 'Map' )
                    // InternalCbsmDsl.g:3702:4: enumLiteral_8= 'Map'
                    {
                    enumLiteral_8=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeInstanceAccess().getMapEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getSimpleTypeInstanceAccess().getMapEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalCbsmDsl.g:3709:3: (enumLiteral_9= 'String' )
                    {
                    // InternalCbsmDsl.g:3709:3: (enumLiteral_9= 'String' )
                    // InternalCbsmDsl.g:3710:4: enumLiteral_9= 'String'
                    {
                    enumLiteral_9=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeInstanceAccess().getStringEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getSimpleTypeInstanceAccess().getStringEnumLiteralDeclaration_9());
                    			

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
    // $ANTLR end "ruleSimpleTypeInstance"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000003A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000788000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000708000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000608000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000003008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080188000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080108000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080388000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000080308000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000080208000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000C00008000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000800008000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000080000008000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0014900000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000600000008000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000400000008000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0001600000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0008600000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0008400000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0020600000008000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0020400000008000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0020000000008000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x000000000FFC0000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000004000L,0x0000000000004000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});

}