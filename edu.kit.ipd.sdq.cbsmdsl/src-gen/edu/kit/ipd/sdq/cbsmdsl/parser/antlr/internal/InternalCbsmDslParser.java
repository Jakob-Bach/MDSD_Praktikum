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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Repository'", "'{'", "'interfaces'", "','", "'}'", "'components'", "'dataTypes'", "'System'", "'providedRoles'", "'requiredRoles'", "'containedAssemblyContexts'", "'systemConnectors'", "'Environment'", "'containers'", "'links'", "'Allocation'", "'allocationContexts'", "'Interface'", "'signatures'", "'Component'", "'behaviorDescription'", "'Signature'", "'returnType'", "'parameters'", "'Parameter'", "'type'", "'ProvidedRole'", "'providedInterface'", "'RequiredRole'", "'requiredInterface'", "'BehaviorDescription'", "'actions'", "'Action'", "'predecessor'", "'successor'", "'InternalAction'", "'ExternalCall'", "'requiredService'", "'requiredRoleOfService'", "'Loop'", "'loopActions'", "'Branch'", "'branchPaths'", "'BranchPath'", "'pathActions'", "'ComplexType'", "'SimpleType'", "'typeInstance'", "'AssemblyContext'", "'instantiatedComponent'", "'ProvidedDelegationConnector'", "'innerAssemblyContext'", "'outerAssemblyContext'", "'innerProvidedRole'", "'outerProvidedRole'", "'RequiredDelegationConnector'", "'innerRequiredRole'", "'outerRequiredRole'", "'AssemblyConnector'", "'connectedProvidedRole'", "'connectedRequiredRole'", "'connectedProvidedAssemblyContext'", "'connectedRequiredAssemblyContext'", "'Container'", "'Link'", "'linkedContainers'", "'('", "')'", "'AllocationContext'", "'allocatedContainer'", "'allocatedAssemblyContext'", "'Boolean'", "'Char'", "'Date'", "'Double'", "'Float'", "'List'", "'Int'", "'Long'", "'Map'", "'String'"
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
    // InternalCbsmDsl.g:207:1: ruleAction returns [EObject current=null] : (this_Action_Impl_0= ruleAction_Impl | this_InternalAction_1= ruleInternalAction | this_ExternalCall_2= ruleExternalCall | this_Loop_3= ruleLoop | this_Branch_4= ruleBranch ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Action_Impl_0 = null;

        EObject this_InternalAction_1 = null;

        EObject this_ExternalCall_2 = null;

        EObject this_Loop_3 = null;

        EObject this_Branch_4 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:213:2: ( (this_Action_Impl_0= ruleAction_Impl | this_InternalAction_1= ruleInternalAction | this_ExternalCall_2= ruleExternalCall | this_Loop_3= ruleLoop | this_Branch_4= ruleBranch ) )
            // InternalCbsmDsl.g:214:2: (this_Action_Impl_0= ruleAction_Impl | this_InternalAction_1= ruleInternalAction | this_ExternalCall_2= ruleExternalCall | this_Loop_3= ruleLoop | this_Branch_4= ruleBranch )
            {
            // InternalCbsmDsl.g:214:2: (this_Action_Impl_0= ruleAction_Impl | this_InternalAction_1= ruleInternalAction | this_ExternalCall_2= ruleExternalCall | this_Loop_3= ruleLoop | this_Branch_4= ruleBranch )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt4=1;
                }
                break;
            case 46:
                {
                alt4=2;
                }
                break;
            case 47:
                {
                alt4=3;
                }
                break;
            case 50:
                {
                alt4=4;
                }
                break;
            case 52:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalCbsmDsl.g:215:3: this_Action_Impl_0= ruleAction_Impl
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getAction_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Action_Impl_0=ruleAction_Impl();

                    state._fsp--;


                    			current = this_Action_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCbsmDsl.g:224:3: this_InternalAction_1= ruleInternalAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getInternalActionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_InternalAction_1=ruleInternalAction();

                    state._fsp--;


                    			current = this_InternalAction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCbsmDsl.g:233:3: this_ExternalCall_2= ruleExternalCall
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getExternalCallParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalCall_2=ruleExternalCall();

                    state._fsp--;


                    			current = this_ExternalCall_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCbsmDsl.g:242:3: this_Loop_3= ruleLoop
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getLoopParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Loop_3=ruleLoop();

                    state._fsp--;


                    			current = this_Loop_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalCbsmDsl.g:251:3: this_Branch_4= ruleBranch
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getBranchParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Branch_4=ruleBranch();

                    state._fsp--;


                    			current = this_Branch_4;
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
    // InternalCbsmDsl.g:263:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // InternalCbsmDsl.g:263:51: (iv_ruleRepository= ruleRepository EOF )
            // InternalCbsmDsl.g:264:2: iv_ruleRepository= ruleRepository EOF
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
    // InternalCbsmDsl.g:270:1: ruleRepository returns [EObject current=null] : ( () otherlv_1= 'Repository' otherlv_2= '{' (otherlv_3= 'interfaces' otherlv_4= '{' ( (lv_interfaces_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) ) )* otherlv_8= '}' )? (otherlv_9= 'components' otherlv_10= '{' ( (lv_components_11_0= ruleComponent ) ) (otherlv_12= ',' ( (lv_components_13_0= ruleComponent ) ) )* otherlv_14= '}' )? (otherlv_15= 'dataTypes' otherlv_16= '{' ( (lv_dataTypes_17_0= ruleDataType ) ) (otherlv_18= ',' ( (lv_dataTypes_19_0= ruleDataType ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_interfaces_5_0 = null;

        EObject lv_interfaces_7_0 = null;

        EObject lv_components_11_0 = null;

        EObject lv_components_13_0 = null;

        EObject lv_dataTypes_17_0 = null;

        EObject lv_dataTypes_19_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:276:2: ( ( () otherlv_1= 'Repository' otherlv_2= '{' (otherlv_3= 'interfaces' otherlv_4= '{' ( (lv_interfaces_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) ) )* otherlv_8= '}' )? (otherlv_9= 'components' otherlv_10= '{' ( (lv_components_11_0= ruleComponent ) ) (otherlv_12= ',' ( (lv_components_13_0= ruleComponent ) ) )* otherlv_14= '}' )? (otherlv_15= 'dataTypes' otherlv_16= '{' ( (lv_dataTypes_17_0= ruleDataType ) ) (otherlv_18= ',' ( (lv_dataTypes_19_0= ruleDataType ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalCbsmDsl.g:277:2: ( () otherlv_1= 'Repository' otherlv_2= '{' (otherlv_3= 'interfaces' otherlv_4= '{' ( (lv_interfaces_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) ) )* otherlv_8= '}' )? (otherlv_9= 'components' otherlv_10= '{' ( (lv_components_11_0= ruleComponent ) ) (otherlv_12= ',' ( (lv_components_13_0= ruleComponent ) ) )* otherlv_14= '}' )? (otherlv_15= 'dataTypes' otherlv_16= '{' ( (lv_dataTypes_17_0= ruleDataType ) ) (otherlv_18= ',' ( (lv_dataTypes_19_0= ruleDataType ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalCbsmDsl.g:277:2: ( () otherlv_1= 'Repository' otherlv_2= '{' (otherlv_3= 'interfaces' otherlv_4= '{' ( (lv_interfaces_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) ) )* otherlv_8= '}' )? (otherlv_9= 'components' otherlv_10= '{' ( (lv_components_11_0= ruleComponent ) ) (otherlv_12= ',' ( (lv_components_13_0= ruleComponent ) ) )* otherlv_14= '}' )? (otherlv_15= 'dataTypes' otherlv_16= '{' ( (lv_dataTypes_17_0= ruleDataType ) ) (otherlv_18= ',' ( (lv_dataTypes_19_0= ruleDataType ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // InternalCbsmDsl.g:278:3: () otherlv_1= 'Repository' otherlv_2= '{' (otherlv_3= 'interfaces' otherlv_4= '{' ( (lv_interfaces_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) ) )* otherlv_8= '}' )? (otherlv_9= 'components' otherlv_10= '{' ( (lv_components_11_0= ruleComponent ) ) (otherlv_12= ',' ( (lv_components_13_0= ruleComponent ) ) )* otherlv_14= '}' )? (otherlv_15= 'dataTypes' otherlv_16= '{' ( (lv_dataTypes_17_0= ruleDataType ) ) (otherlv_18= ',' ( (lv_dataTypes_19_0= ruleDataType ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // InternalCbsmDsl.g:278:3: ()
            // InternalCbsmDsl.g:279:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRepositoryAccess().getRepositoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRepositoryAccess().getRepositoryKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCbsmDsl.g:293:3: (otherlv_3= 'interfaces' otherlv_4= '{' ( (lv_interfaces_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) ) )* otherlv_8= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCbsmDsl.g:294:4: otherlv_3= 'interfaces' otherlv_4= '{' ( (lv_interfaces_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRepositoryAccess().getInterfacesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalCbsmDsl.g:302:4: ( (lv_interfaces_5_0= ruleInterface ) )
                    // InternalCbsmDsl.g:303:5: (lv_interfaces_5_0= ruleInterface )
                    {
                    // InternalCbsmDsl.g:303:5: (lv_interfaces_5_0= ruleInterface )
                    // InternalCbsmDsl.g:304:6: lv_interfaces_5_0= ruleInterface
                    {

                    						newCompositeNode(grammarAccess.getRepositoryAccess().getInterfacesInterfaceParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_interfaces_5_0=ruleInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    						}
                    						add(
                    							current,
                    							"interfaces",
                    							lv_interfaces_5_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.Interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:321:4: (otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:322:5: otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRepositoryAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:326:5: ( (lv_interfaces_7_0= ruleInterface ) )
                    	    // InternalCbsmDsl.g:327:6: (lv_interfaces_7_0= ruleInterface )
                    	    {
                    	    // InternalCbsmDsl.g:327:6: (lv_interfaces_7_0= ruleInterface )
                    	    // InternalCbsmDsl.g:328:7: lv_interfaces_7_0= ruleInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepositoryAccess().getInterfacesInterfaceParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_interfaces_7_0=ruleInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interfaces",
                    	    								lv_interfaces_7_0,
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

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalCbsmDsl.g:351:3: (otherlv_9= 'components' otherlv_10= '{' ( (lv_components_11_0= ruleComponent ) ) (otherlv_12= ',' ( (lv_components_13_0= ruleComponent ) ) )* otherlv_14= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCbsmDsl.g:352:4: otherlv_9= 'components' otherlv_10= '{' ( (lv_components_11_0= ruleComponent ) ) (otherlv_12= ',' ( (lv_components_13_0= ruleComponent ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getRepositoryAccess().getComponentsKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCbsmDsl.g:360:4: ( (lv_components_11_0= ruleComponent ) )
                    // InternalCbsmDsl.g:361:5: (lv_components_11_0= ruleComponent )
                    {
                    // InternalCbsmDsl.g:361:5: (lv_components_11_0= ruleComponent )
                    // InternalCbsmDsl.g:362:6: lv_components_11_0= ruleComponent
                    {

                    						newCompositeNode(grammarAccess.getRepositoryAccess().getComponentsComponentParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_components_11_0=ruleComponent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    						}
                    						add(
                    							current,
                    							"components",
                    							lv_components_11_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.Component");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:379:4: (otherlv_12= ',' ( (lv_components_13_0= ruleComponent ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:380:5: otherlv_12= ',' ( (lv_components_13_0= ruleComponent ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getRepositoryAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:384:5: ( (lv_components_13_0= ruleComponent ) )
                    	    // InternalCbsmDsl.g:385:6: (lv_components_13_0= ruleComponent )
                    	    {
                    	    // InternalCbsmDsl.g:385:6: (lv_components_13_0= ruleComponent )
                    	    // InternalCbsmDsl.g:386:7: lv_components_13_0= ruleComponent
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepositoryAccess().getComponentsComponentParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_components_13_0=ruleComponent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"components",
                    	    								lv_components_13_0,
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

                    otherlv_14=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_14, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalCbsmDsl.g:409:3: (otherlv_15= 'dataTypes' otherlv_16= '{' ( (lv_dataTypes_17_0= ruleDataType ) ) (otherlv_18= ',' ( (lv_dataTypes_19_0= ruleDataType ) ) )* otherlv_20= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCbsmDsl.g:410:4: otherlv_15= 'dataTypes' otherlv_16= '{' ( (lv_dataTypes_17_0= ruleDataType ) ) (otherlv_18= ',' ( (lv_dataTypes_19_0= ruleDataType ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getRepositoryAccess().getDataTypesKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_16, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCbsmDsl.g:418:4: ( (lv_dataTypes_17_0= ruleDataType ) )
                    // InternalCbsmDsl.g:419:5: (lv_dataTypes_17_0= ruleDataType )
                    {
                    // InternalCbsmDsl.g:419:5: (lv_dataTypes_17_0= ruleDataType )
                    // InternalCbsmDsl.g:420:6: lv_dataTypes_17_0= ruleDataType
                    {

                    						newCompositeNode(grammarAccess.getRepositoryAccess().getDataTypesDataTypeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_dataTypes_17_0=ruleDataType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    						}
                    						add(
                    							current,
                    							"dataTypes",
                    							lv_dataTypes_17_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.DataType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:437:4: (otherlv_18= ',' ( (lv_dataTypes_19_0= ruleDataType ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:438:5: otherlv_18= ',' ( (lv_dataTypes_19_0= ruleDataType ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getRepositoryAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:442:5: ( (lv_dataTypes_19_0= ruleDataType ) )
                    	    // InternalCbsmDsl.g:443:6: (lv_dataTypes_19_0= ruleDataType )
                    	    {
                    	    // InternalCbsmDsl.g:443:6: (lv_dataTypes_19_0= ruleDataType )
                    	    // InternalCbsmDsl.g:444:7: lv_dataTypes_19_0= ruleDataType
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepositoryAccess().getDataTypesDataTypeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_dataTypes_19_0=ruleDataType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"dataTypes",
                    	    								lv_dataTypes_19_0,
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

                    otherlv_20=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_20, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalCbsmDsl.g:475:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalCbsmDsl.g:475:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalCbsmDsl.g:476:2: iv_ruleSystem= ruleSystem EOF
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
    // InternalCbsmDsl.g:482:1: ruleSystem returns [EObject current=null] : ( () otherlv_1= 'System' otherlv_2= '{' (otherlv_3= 'providedRoles' otherlv_4= '{' ( (lv_providedRoles_5_0= ruleProvidedRole ) ) (otherlv_6= ',' ( (lv_providedRoles_7_0= ruleProvidedRole ) ) )* otherlv_8= '}' )? (otherlv_9= 'requiredRoles' otherlv_10= '{' ( (lv_requiredRoles_11_0= ruleRequiredRole ) ) (otherlv_12= ',' ( (lv_requiredRoles_13_0= ruleRequiredRole ) ) )* otherlv_14= '}' )? (otherlv_15= 'containedAssemblyContexts' otherlv_16= '{' ( (lv_containedAssemblyContexts_17_0= ruleAssemblyContext ) ) (otherlv_18= ',' ( (lv_containedAssemblyContexts_19_0= ruleAssemblyContext ) ) )* otherlv_20= '}' )? (otherlv_21= 'systemConnectors' otherlv_22= '{' ( (lv_systemConnectors_23_0= ruleConnector ) ) (otherlv_24= ',' ( (lv_systemConnectors_25_0= ruleConnector ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        EObject lv_providedRoles_5_0 = null;

        EObject lv_providedRoles_7_0 = null;

        EObject lv_requiredRoles_11_0 = null;

        EObject lv_requiredRoles_13_0 = null;

        EObject lv_containedAssemblyContexts_17_0 = null;

        EObject lv_containedAssemblyContexts_19_0 = null;

        EObject lv_systemConnectors_23_0 = null;

        EObject lv_systemConnectors_25_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:488:2: ( ( () otherlv_1= 'System' otherlv_2= '{' (otherlv_3= 'providedRoles' otherlv_4= '{' ( (lv_providedRoles_5_0= ruleProvidedRole ) ) (otherlv_6= ',' ( (lv_providedRoles_7_0= ruleProvidedRole ) ) )* otherlv_8= '}' )? (otherlv_9= 'requiredRoles' otherlv_10= '{' ( (lv_requiredRoles_11_0= ruleRequiredRole ) ) (otherlv_12= ',' ( (lv_requiredRoles_13_0= ruleRequiredRole ) ) )* otherlv_14= '}' )? (otherlv_15= 'containedAssemblyContexts' otherlv_16= '{' ( (lv_containedAssemblyContexts_17_0= ruleAssemblyContext ) ) (otherlv_18= ',' ( (lv_containedAssemblyContexts_19_0= ruleAssemblyContext ) ) )* otherlv_20= '}' )? (otherlv_21= 'systemConnectors' otherlv_22= '{' ( (lv_systemConnectors_23_0= ruleConnector ) ) (otherlv_24= ',' ( (lv_systemConnectors_25_0= ruleConnector ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // InternalCbsmDsl.g:489:2: ( () otherlv_1= 'System' otherlv_2= '{' (otherlv_3= 'providedRoles' otherlv_4= '{' ( (lv_providedRoles_5_0= ruleProvidedRole ) ) (otherlv_6= ',' ( (lv_providedRoles_7_0= ruleProvidedRole ) ) )* otherlv_8= '}' )? (otherlv_9= 'requiredRoles' otherlv_10= '{' ( (lv_requiredRoles_11_0= ruleRequiredRole ) ) (otherlv_12= ',' ( (lv_requiredRoles_13_0= ruleRequiredRole ) ) )* otherlv_14= '}' )? (otherlv_15= 'containedAssemblyContexts' otherlv_16= '{' ( (lv_containedAssemblyContexts_17_0= ruleAssemblyContext ) ) (otherlv_18= ',' ( (lv_containedAssemblyContexts_19_0= ruleAssemblyContext ) ) )* otherlv_20= '}' )? (otherlv_21= 'systemConnectors' otherlv_22= '{' ( (lv_systemConnectors_23_0= ruleConnector ) ) (otherlv_24= ',' ( (lv_systemConnectors_25_0= ruleConnector ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // InternalCbsmDsl.g:489:2: ( () otherlv_1= 'System' otherlv_2= '{' (otherlv_3= 'providedRoles' otherlv_4= '{' ( (lv_providedRoles_5_0= ruleProvidedRole ) ) (otherlv_6= ',' ( (lv_providedRoles_7_0= ruleProvidedRole ) ) )* otherlv_8= '}' )? (otherlv_9= 'requiredRoles' otherlv_10= '{' ( (lv_requiredRoles_11_0= ruleRequiredRole ) ) (otherlv_12= ',' ( (lv_requiredRoles_13_0= ruleRequiredRole ) ) )* otherlv_14= '}' )? (otherlv_15= 'containedAssemblyContexts' otherlv_16= '{' ( (lv_containedAssemblyContexts_17_0= ruleAssemblyContext ) ) (otherlv_18= ',' ( (lv_containedAssemblyContexts_19_0= ruleAssemblyContext ) ) )* otherlv_20= '}' )? (otherlv_21= 'systemConnectors' otherlv_22= '{' ( (lv_systemConnectors_23_0= ruleConnector ) ) (otherlv_24= ',' ( (lv_systemConnectors_25_0= ruleConnector ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // InternalCbsmDsl.g:490:3: () otherlv_1= 'System' otherlv_2= '{' (otherlv_3= 'providedRoles' otherlv_4= '{' ( (lv_providedRoles_5_0= ruleProvidedRole ) ) (otherlv_6= ',' ( (lv_providedRoles_7_0= ruleProvidedRole ) ) )* otherlv_8= '}' )? (otherlv_9= 'requiredRoles' otherlv_10= '{' ( (lv_requiredRoles_11_0= ruleRequiredRole ) ) (otherlv_12= ',' ( (lv_requiredRoles_13_0= ruleRequiredRole ) ) )* otherlv_14= '}' )? (otherlv_15= 'containedAssemblyContexts' otherlv_16= '{' ( (lv_containedAssemblyContexts_17_0= ruleAssemblyContext ) ) (otherlv_18= ',' ( (lv_containedAssemblyContexts_19_0= ruleAssemblyContext ) ) )* otherlv_20= '}' )? (otherlv_21= 'systemConnectors' otherlv_22= '{' ( (lv_systemConnectors_23_0= ruleConnector ) ) (otherlv_24= ',' ( (lv_systemConnectors_25_0= ruleConnector ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            // InternalCbsmDsl.g:490:3: ()
            // InternalCbsmDsl.g:491:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSystemAccess().getSystemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemAccess().getSystemKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCbsmDsl.g:505:3: (otherlv_3= 'providedRoles' otherlv_4= '{' ( (lv_providedRoles_5_0= ruleProvidedRole ) ) (otherlv_6= ',' ( (lv_providedRoles_7_0= ruleProvidedRole ) ) )* otherlv_8= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCbsmDsl.g:506:4: otherlv_3= 'providedRoles' otherlv_4= '{' ( (lv_providedRoles_5_0= ruleProvidedRole ) ) (otherlv_6= ',' ( (lv_providedRoles_7_0= ruleProvidedRole ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getProvidedRolesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalCbsmDsl.g:514:4: ( (lv_providedRoles_5_0= ruleProvidedRole ) )
                    // InternalCbsmDsl.g:515:5: (lv_providedRoles_5_0= ruleProvidedRole )
                    {
                    // InternalCbsmDsl.g:515:5: (lv_providedRoles_5_0= ruleProvidedRole )
                    // InternalCbsmDsl.g:516:6: lv_providedRoles_5_0= ruleProvidedRole
                    {

                    						newCompositeNode(grammarAccess.getSystemAccess().getProvidedRolesProvidedRoleParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_providedRoles_5_0=ruleProvidedRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemRule());
                    						}
                    						add(
                    							current,
                    							"providedRoles",
                    							lv_providedRoles_5_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.ProvidedRole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:533:4: (otherlv_6= ',' ( (lv_providedRoles_7_0= ruleProvidedRole ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:534:5: otherlv_6= ',' ( (lv_providedRoles_7_0= ruleProvidedRole ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getSystemAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:538:5: ( (lv_providedRoles_7_0= ruleProvidedRole ) )
                    	    // InternalCbsmDsl.g:539:6: (lv_providedRoles_7_0= ruleProvidedRole )
                    	    {
                    	    // InternalCbsmDsl.g:539:6: (lv_providedRoles_7_0= ruleProvidedRole )
                    	    // InternalCbsmDsl.g:540:7: lv_providedRoles_7_0= ruleProvidedRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemAccess().getProvidedRolesProvidedRoleParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_providedRoles_7_0=ruleProvidedRole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"providedRoles",
                    	    								lv_providedRoles_7_0,
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

                    otherlv_8=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_8, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalCbsmDsl.g:563:3: (otherlv_9= 'requiredRoles' otherlv_10= '{' ( (lv_requiredRoles_11_0= ruleRequiredRole ) ) (otherlv_12= ',' ( (lv_requiredRoles_13_0= ruleRequiredRole ) ) )* otherlv_14= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCbsmDsl.g:564:4: otherlv_9= 'requiredRoles' otherlv_10= '{' ( (lv_requiredRoles_11_0= ruleRequiredRole ) ) (otherlv_12= ',' ( (lv_requiredRoles_13_0= ruleRequiredRole ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getSystemAccess().getRequiredRolesKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_10, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCbsmDsl.g:572:4: ( (lv_requiredRoles_11_0= ruleRequiredRole ) )
                    // InternalCbsmDsl.g:573:5: (lv_requiredRoles_11_0= ruleRequiredRole )
                    {
                    // InternalCbsmDsl.g:573:5: (lv_requiredRoles_11_0= ruleRequiredRole )
                    // InternalCbsmDsl.g:574:6: lv_requiredRoles_11_0= ruleRequiredRole
                    {

                    						newCompositeNode(grammarAccess.getSystemAccess().getRequiredRolesRequiredRoleParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_requiredRoles_11_0=ruleRequiredRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemRule());
                    						}
                    						add(
                    							current,
                    							"requiredRoles",
                    							lv_requiredRoles_11_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.RequiredRole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:591:4: (otherlv_12= ',' ( (lv_requiredRoles_13_0= ruleRequiredRole ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:592:5: otherlv_12= ',' ( (lv_requiredRoles_13_0= ruleRequiredRole ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_15); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getSystemAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:596:5: ( (lv_requiredRoles_13_0= ruleRequiredRole ) )
                    	    // InternalCbsmDsl.g:597:6: (lv_requiredRoles_13_0= ruleRequiredRole )
                    	    {
                    	    // InternalCbsmDsl.g:597:6: (lv_requiredRoles_13_0= ruleRequiredRole )
                    	    // InternalCbsmDsl.g:598:7: lv_requiredRoles_13_0= ruleRequiredRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemAccess().getRequiredRolesRequiredRoleParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_requiredRoles_13_0=ruleRequiredRole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"requiredRoles",
                    	    								lv_requiredRoles_13_0,
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

                    otherlv_14=(Token)match(input,15,FOLLOW_16); 

                    				newLeafNode(otherlv_14, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalCbsmDsl.g:621:3: (otherlv_15= 'containedAssemblyContexts' otherlv_16= '{' ( (lv_containedAssemblyContexts_17_0= ruleAssemblyContext ) ) (otherlv_18= ',' ( (lv_containedAssemblyContexts_19_0= ruleAssemblyContext ) ) )* otherlv_20= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCbsmDsl.g:622:4: otherlv_15= 'containedAssemblyContexts' otherlv_16= '{' ( (lv_containedAssemblyContexts_17_0= ruleAssemblyContext ) ) (otherlv_18= ',' ( (lv_containedAssemblyContexts_19_0= ruleAssemblyContext ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getSystemAccess().getContainedAssemblyContextsKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_16, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCbsmDsl.g:630:4: ( (lv_containedAssemblyContexts_17_0= ruleAssemblyContext ) )
                    // InternalCbsmDsl.g:631:5: (lv_containedAssemblyContexts_17_0= ruleAssemblyContext )
                    {
                    // InternalCbsmDsl.g:631:5: (lv_containedAssemblyContexts_17_0= ruleAssemblyContext )
                    // InternalCbsmDsl.g:632:6: lv_containedAssemblyContexts_17_0= ruleAssemblyContext
                    {

                    						newCompositeNode(grammarAccess.getSystemAccess().getContainedAssemblyContextsAssemblyContextParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_containedAssemblyContexts_17_0=ruleAssemblyContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemRule());
                    						}
                    						add(
                    							current,
                    							"containedAssemblyContexts",
                    							lv_containedAssemblyContexts_17_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.AssemblyContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:649:4: (otherlv_18= ',' ( (lv_containedAssemblyContexts_19_0= ruleAssemblyContext ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==14) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:650:5: otherlv_18= ',' ( (lv_containedAssemblyContexts_19_0= ruleAssemblyContext ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_17); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getSystemAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:654:5: ( (lv_containedAssemblyContexts_19_0= ruleAssemblyContext ) )
                    	    // InternalCbsmDsl.g:655:6: (lv_containedAssemblyContexts_19_0= ruleAssemblyContext )
                    	    {
                    	    // InternalCbsmDsl.g:655:6: (lv_containedAssemblyContexts_19_0= ruleAssemblyContext )
                    	    // InternalCbsmDsl.g:656:7: lv_containedAssemblyContexts_19_0= ruleAssemblyContext
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemAccess().getContainedAssemblyContextsAssemblyContextParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_containedAssemblyContexts_19_0=ruleAssemblyContext();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"containedAssemblyContexts",
                    	    								lv_containedAssemblyContexts_19_0,
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

                    otherlv_20=(Token)match(input,15,FOLLOW_18); 

                    				newLeafNode(otherlv_20, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalCbsmDsl.g:679:3: (otherlv_21= 'systemConnectors' otherlv_22= '{' ( (lv_systemConnectors_23_0= ruleConnector ) ) (otherlv_24= ',' ( (lv_systemConnectors_25_0= ruleConnector ) ) )* otherlv_26= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCbsmDsl.g:680:4: otherlv_21= 'systemConnectors' otherlv_22= '{' ( (lv_systemConnectors_23_0= ruleConnector ) ) (otherlv_24= ',' ( (lv_systemConnectors_25_0= ruleConnector ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getSystemAccess().getSystemConnectorsKeyword_6_0());
                    			
                    otherlv_22=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_22, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCbsmDsl.g:688:4: ( (lv_systemConnectors_23_0= ruleConnector ) )
                    // InternalCbsmDsl.g:689:5: (lv_systemConnectors_23_0= ruleConnector )
                    {
                    // InternalCbsmDsl.g:689:5: (lv_systemConnectors_23_0= ruleConnector )
                    // InternalCbsmDsl.g:690:6: lv_systemConnectors_23_0= ruleConnector
                    {

                    						newCompositeNode(grammarAccess.getSystemAccess().getSystemConnectorsConnectorParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_systemConnectors_23_0=ruleConnector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemRule());
                    						}
                    						add(
                    							current,
                    							"systemConnectors",
                    							lv_systemConnectors_23_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.Connector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:707:4: (otherlv_24= ',' ( (lv_systemConnectors_25_0= ruleConnector ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==14) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:708:5: otherlv_24= ',' ( (lv_systemConnectors_25_0= ruleConnector ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FOLLOW_19); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getSystemAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:712:5: ( (lv_systemConnectors_25_0= ruleConnector ) )
                    	    // InternalCbsmDsl.g:713:6: (lv_systemConnectors_25_0= ruleConnector )
                    	    {
                    	    // InternalCbsmDsl.g:713:6: (lv_systemConnectors_25_0= ruleConnector )
                    	    // InternalCbsmDsl.g:714:7: lv_systemConnectors_25_0= ruleConnector
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemAccess().getSystemConnectorsConnectorParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_systemConnectors_25_0=ruleConnector();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"systemConnectors",
                    	    								lv_systemConnectors_25_0,
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

                    otherlv_26=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_26, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalCbsmDsl.g:745:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalCbsmDsl.g:745:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalCbsmDsl.g:746:2: iv_ruleEnvironment= ruleEnvironment EOF
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
    // InternalCbsmDsl.g:752:1: ruleEnvironment returns [EObject current=null] : ( () otherlv_1= 'Environment' otherlv_2= '{' (otherlv_3= 'containers' otherlv_4= '{' ( (lv_containers_5_0= ruleContainer ) ) (otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) ) )* otherlv_8= '}' )? (otherlv_9= 'links' otherlv_10= '{' ( (lv_links_11_0= ruleLink ) ) (otherlv_12= ',' ( (lv_links_13_0= ruleLink ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_containers_5_0 = null;

        EObject lv_containers_7_0 = null;

        EObject lv_links_11_0 = null;

        EObject lv_links_13_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:758:2: ( ( () otherlv_1= 'Environment' otherlv_2= '{' (otherlv_3= 'containers' otherlv_4= '{' ( (lv_containers_5_0= ruleContainer ) ) (otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) ) )* otherlv_8= '}' )? (otherlv_9= 'links' otherlv_10= '{' ( (lv_links_11_0= ruleLink ) ) (otherlv_12= ',' ( (lv_links_13_0= ruleLink ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalCbsmDsl.g:759:2: ( () otherlv_1= 'Environment' otherlv_2= '{' (otherlv_3= 'containers' otherlv_4= '{' ( (lv_containers_5_0= ruleContainer ) ) (otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) ) )* otherlv_8= '}' )? (otherlv_9= 'links' otherlv_10= '{' ( (lv_links_11_0= ruleLink ) ) (otherlv_12= ',' ( (lv_links_13_0= ruleLink ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalCbsmDsl.g:759:2: ( () otherlv_1= 'Environment' otherlv_2= '{' (otherlv_3= 'containers' otherlv_4= '{' ( (lv_containers_5_0= ruleContainer ) ) (otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) ) )* otherlv_8= '}' )? (otherlv_9= 'links' otherlv_10= '{' ( (lv_links_11_0= ruleLink ) ) (otherlv_12= ',' ( (lv_links_13_0= ruleLink ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalCbsmDsl.g:760:3: () otherlv_1= 'Environment' otherlv_2= '{' (otherlv_3= 'containers' otherlv_4= '{' ( (lv_containers_5_0= ruleContainer ) ) (otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) ) )* otherlv_8= '}' )? (otherlv_9= 'links' otherlv_10= '{' ( (lv_links_11_0= ruleLink ) ) (otherlv_12= ',' ( (lv_links_13_0= ruleLink ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalCbsmDsl.g:760:3: ()
            // InternalCbsmDsl.g:761:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentAccess().getEnvironmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCbsmDsl.g:775:3: (otherlv_3= 'containers' otherlv_4= '{' ( (lv_containers_5_0= ruleContainer ) ) (otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) ) )* otherlv_8= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCbsmDsl.g:776:4: otherlv_3= 'containers' otherlv_4= '{' ( (lv_containers_5_0= ruleContainer ) ) (otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnvironmentAccess().getContainersKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalCbsmDsl.g:784:4: ( (lv_containers_5_0= ruleContainer ) )
                    // InternalCbsmDsl.g:785:5: (lv_containers_5_0= ruleContainer )
                    {
                    // InternalCbsmDsl.g:785:5: (lv_containers_5_0= ruleContainer )
                    // InternalCbsmDsl.g:786:6: lv_containers_5_0= ruleContainer
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentAccess().getContainersContainerParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_containers_5_0=ruleContainer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    						}
                    						add(
                    							current,
                    							"containers",
                    							lv_containers_5_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.Container");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:803:4: (otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==14) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:804:5: otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_21); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getEnvironmentAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:808:5: ( (lv_containers_7_0= ruleContainer ) )
                    	    // InternalCbsmDsl.g:809:6: (lv_containers_7_0= ruleContainer )
                    	    {
                    	    // InternalCbsmDsl.g:809:6: (lv_containers_7_0= ruleContainer )
                    	    // InternalCbsmDsl.g:810:7: lv_containers_7_0= ruleContainer
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnvironmentAccess().getContainersContainerParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_containers_7_0=ruleContainer();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"containers",
                    	    								lv_containers_7_0,
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

                    otherlv_8=(Token)match(input,15,FOLLOW_22); 

                    				newLeafNode(otherlv_8, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalCbsmDsl.g:833:3: (otherlv_9= 'links' otherlv_10= '{' ( (lv_links_11_0= ruleLink ) ) (otherlv_12= ',' ( (lv_links_13_0= ruleLink ) ) )* otherlv_14= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==25) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCbsmDsl.g:834:4: otherlv_9= 'links' otherlv_10= '{' ( (lv_links_11_0= ruleLink ) ) (otherlv_12= ',' ( (lv_links_13_0= ruleLink ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getEnvironmentAccess().getLinksKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_10, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCbsmDsl.g:842:4: ( (lv_links_11_0= ruleLink ) )
                    // InternalCbsmDsl.g:843:5: (lv_links_11_0= ruleLink )
                    {
                    // InternalCbsmDsl.g:843:5: (lv_links_11_0= ruleLink )
                    // InternalCbsmDsl.g:844:6: lv_links_11_0= ruleLink
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentAccess().getLinksLinkParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_links_11_0=ruleLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    						}
                    						add(
                    							current,
                    							"links",
                    							lv_links_11_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.Link");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:861:4: (otherlv_12= ',' ( (lv_links_13_0= ruleLink ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==14) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:862:5: otherlv_12= ',' ( (lv_links_13_0= ruleLink ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_23); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getEnvironmentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:866:5: ( (lv_links_13_0= ruleLink ) )
                    	    // InternalCbsmDsl.g:867:6: (lv_links_13_0= ruleLink )
                    	    {
                    	    // InternalCbsmDsl.g:867:6: (lv_links_13_0= ruleLink )
                    	    // InternalCbsmDsl.g:868:7: lv_links_13_0= ruleLink
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnvironmentAccess().getLinksLinkParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_links_13_0=ruleLink();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"links",
                    	    								lv_links_13_0,
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

                    otherlv_14=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_14, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalCbsmDsl.g:899:1: entryRuleAllocation returns [EObject current=null] : iv_ruleAllocation= ruleAllocation EOF ;
    public final EObject entryRuleAllocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocation = null;


        try {
            // InternalCbsmDsl.g:899:51: (iv_ruleAllocation= ruleAllocation EOF )
            // InternalCbsmDsl.g:900:2: iv_ruleAllocation= ruleAllocation EOF
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
    // InternalCbsmDsl.g:906:1: ruleAllocation returns [EObject current=null] : ( () otherlv_1= 'Allocation' otherlv_2= '{' (otherlv_3= 'allocationContexts' otherlv_4= '{' ( (lv_allocationContexts_5_0= ruleAllocationContext ) ) (otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleAllocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_allocationContexts_5_0 = null;

        EObject lv_allocationContexts_7_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:912:2: ( ( () otherlv_1= 'Allocation' otherlv_2= '{' (otherlv_3= 'allocationContexts' otherlv_4= '{' ( (lv_allocationContexts_5_0= ruleAllocationContext ) ) (otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalCbsmDsl.g:913:2: ( () otherlv_1= 'Allocation' otherlv_2= '{' (otherlv_3= 'allocationContexts' otherlv_4= '{' ( (lv_allocationContexts_5_0= ruleAllocationContext ) ) (otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalCbsmDsl.g:913:2: ( () otherlv_1= 'Allocation' otherlv_2= '{' (otherlv_3= 'allocationContexts' otherlv_4= '{' ( (lv_allocationContexts_5_0= ruleAllocationContext ) ) (otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalCbsmDsl.g:914:3: () otherlv_1= 'Allocation' otherlv_2= '{' (otherlv_3= 'allocationContexts' otherlv_4= '{' ( (lv_allocationContexts_5_0= ruleAllocationContext ) ) (otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalCbsmDsl.g:914:3: ()
            // InternalCbsmDsl.g:915:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAllocationAccess().getAllocationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAllocationAccess().getAllocationKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getAllocationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCbsmDsl.g:929:3: (otherlv_3= 'allocationContexts' otherlv_4= '{' ( (lv_allocationContexts_5_0= ruleAllocationContext ) ) (otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) ) )* otherlv_8= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==27) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCbsmDsl.g:930:4: otherlv_3= 'allocationContexts' otherlv_4= '{' ( (lv_allocationContexts_5_0= ruleAllocationContext ) ) (otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getAllocationAccess().getAllocationContextsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_25); 

                    				newLeafNode(otherlv_4, grammarAccess.getAllocationAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalCbsmDsl.g:938:4: ( (lv_allocationContexts_5_0= ruleAllocationContext ) )
                    // InternalCbsmDsl.g:939:5: (lv_allocationContexts_5_0= ruleAllocationContext )
                    {
                    // InternalCbsmDsl.g:939:5: (lv_allocationContexts_5_0= ruleAllocationContext )
                    // InternalCbsmDsl.g:940:6: lv_allocationContexts_5_0= ruleAllocationContext
                    {

                    						newCompositeNode(grammarAccess.getAllocationAccess().getAllocationContextsAllocationContextParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_allocationContexts_5_0=ruleAllocationContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAllocationRule());
                    						}
                    						add(
                    							current,
                    							"allocationContexts",
                    							lv_allocationContexts_5_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.AllocationContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:957:4: (otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==14) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:958:5: otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_25); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getAllocationAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:962:5: ( (lv_allocationContexts_7_0= ruleAllocationContext ) )
                    	    // InternalCbsmDsl.g:963:6: (lv_allocationContexts_7_0= ruleAllocationContext )
                    	    {
                    	    // InternalCbsmDsl.g:963:6: (lv_allocationContexts_7_0= ruleAllocationContext )
                    	    // InternalCbsmDsl.g:964:7: lv_allocationContexts_7_0= ruleAllocationContext
                    	    {

                    	    							newCompositeNode(grammarAccess.getAllocationAccess().getAllocationContextsAllocationContextParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_allocationContexts_7_0=ruleAllocationContext();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAllocationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"allocationContexts",
                    	    								lv_allocationContexts_7_0,
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

                    otherlv_8=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getAllocationAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getAllocationAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalCbsmDsl.g:995:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalCbsmDsl.g:995:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalCbsmDsl.g:996:2: iv_ruleInterface= ruleInterface EOF
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
    // InternalCbsmDsl.g:1002:1: ruleInterface returns [EObject current=null] : ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
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
            // InternalCbsmDsl.g:1008:2: ( ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalCbsmDsl.g:1009:2: ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalCbsmDsl.g:1009:2: ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalCbsmDsl.g:1010:3: () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalCbsmDsl.g:1010:3: ()
            // InternalCbsmDsl.g:1011:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInterfaceAccess().getInterfaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getInterfaceAccess().getInterfaceKeyword_1());
            		
            // InternalCbsmDsl.g:1021:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCbsmDsl.g:1022:4: (lv_name_2_0= ruleEString )
            {
            // InternalCbsmDsl.g:1022:4: (lv_name_2_0= ruleEString )
            // InternalCbsmDsl.g:1023:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInterfaceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
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
            		
            // InternalCbsmDsl.g:1044:3: (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCbsmDsl.g:1045:4: otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getInterfaceAccess().getSignaturesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_28); 

                    				newLeafNode(otherlv_5, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCbsmDsl.g:1053:4: ( (lv_signatures_6_0= ruleSignature ) )
                    // InternalCbsmDsl.g:1054:5: (lv_signatures_6_0= ruleSignature )
                    {
                    // InternalCbsmDsl.g:1054:5: (lv_signatures_6_0= ruleSignature )
                    // InternalCbsmDsl.g:1055:6: lv_signatures_6_0= ruleSignature
                    {

                    						newCompositeNode(grammarAccess.getInterfaceAccess().getSignaturesSignatureParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
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

                    // InternalCbsmDsl.g:1072:4: (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==14) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:1073:5: otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_28); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getInterfaceAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:1077:5: ( (lv_signatures_8_0= ruleSignature ) )
                    	    // InternalCbsmDsl.g:1078:6: (lv_signatures_8_0= ruleSignature )
                    	    {
                    	    // InternalCbsmDsl.g:1078:6: (lv_signatures_8_0= ruleSignature )
                    	    // InternalCbsmDsl.g:1079:7: lv_signatures_8_0= ruleSignature
                    	    {

                    	    							newCompositeNode(grammarAccess.getInterfaceAccess().getSignaturesSignatureParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
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

                    otherlv_9=(Token)match(input,15,FOLLOW_11); 

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
    // InternalCbsmDsl.g:1110:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalCbsmDsl.g:1110:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalCbsmDsl.g:1111:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalCbsmDsl.g:1117:1: ruleComponent returns [EObject current=null] : ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providedRoles' otherlv_5= '{' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= '}' )? (otherlv_10= 'requiredRoles' otherlv_11= '{' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= '}' )? (otherlv_16= 'behaviorDescription' ( (lv_behaviorDescription_17_0= ruleBehaviorDescription ) ) )? otherlv_18= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
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
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_providedRoles_6_0 = null;

        EObject lv_providedRoles_8_0 = null;

        EObject lv_requiredRoles_12_0 = null;

        EObject lv_requiredRoles_14_0 = null;

        EObject lv_behaviorDescription_17_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:1123:2: ( ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providedRoles' otherlv_5= '{' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= '}' )? (otherlv_10= 'requiredRoles' otherlv_11= '{' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= '}' )? (otherlv_16= 'behaviorDescription' ( (lv_behaviorDescription_17_0= ruleBehaviorDescription ) ) )? otherlv_18= '}' ) )
            // InternalCbsmDsl.g:1124:2: ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providedRoles' otherlv_5= '{' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= '}' )? (otherlv_10= 'requiredRoles' otherlv_11= '{' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= '}' )? (otherlv_16= 'behaviorDescription' ( (lv_behaviorDescription_17_0= ruleBehaviorDescription ) ) )? otherlv_18= '}' )
            {
            // InternalCbsmDsl.g:1124:2: ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providedRoles' otherlv_5= '{' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= '}' )? (otherlv_10= 'requiredRoles' otherlv_11= '{' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= '}' )? (otherlv_16= 'behaviorDescription' ( (lv_behaviorDescription_17_0= ruleBehaviorDescription ) ) )? otherlv_18= '}' )
            // InternalCbsmDsl.g:1125:3: () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providedRoles' otherlv_5= '{' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= '}' )? (otherlv_10= 'requiredRoles' otherlv_11= '{' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= '}' )? (otherlv_16= 'behaviorDescription' ( (lv_behaviorDescription_17_0= ruleBehaviorDescription ) ) )? otherlv_18= '}'
            {
            // InternalCbsmDsl.g:1125:3: ()
            // InternalCbsmDsl.g:1126:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentAccess().getComponentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentAccess().getComponentKeyword_1());
            		
            // InternalCbsmDsl.g:1136:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCbsmDsl.g:1137:4: (lv_name_2_0= ruleEString )
            {
            // InternalCbsmDsl.g:1137:4: (lv_name_2_0= ruleEString )
            // InternalCbsmDsl.g:1138:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentRule());
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

            			newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCbsmDsl.g:1159:3: (otherlv_4= 'providedRoles' otherlv_5= '{' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==19) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCbsmDsl.g:1160:4: otherlv_4= 'providedRoles' otherlv_5= '{' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getProvidedRolesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCbsmDsl.g:1168:4: ( (lv_providedRoles_6_0= ruleProvidedRole ) )
                    // InternalCbsmDsl.g:1169:5: (lv_providedRoles_6_0= ruleProvidedRole )
                    {
                    // InternalCbsmDsl.g:1169:5: (lv_providedRoles_6_0= ruleProvidedRole )
                    // InternalCbsmDsl.g:1170:6: lv_providedRoles_6_0= ruleProvidedRole
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getProvidedRolesProvidedRoleParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_providedRoles_6_0=ruleProvidedRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						add(
                    							current,
                    							"providedRoles",
                    							lv_providedRoles_6_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.ProvidedRole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:1187:4: (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==14) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:1188:5: otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:1192:5: ( (lv_providedRoles_8_0= ruleProvidedRole ) )
                    	    // InternalCbsmDsl.g:1193:6: (lv_providedRoles_8_0= ruleProvidedRole )
                    	    {
                    	    // InternalCbsmDsl.g:1193:6: (lv_providedRoles_8_0= ruleProvidedRole )
                    	    // InternalCbsmDsl.g:1194:7: lv_providedRoles_8_0= ruleProvidedRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getProvidedRolesProvidedRoleParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_providedRoles_8_0=ruleProvidedRole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
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
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_30); 

                    				newLeafNode(otherlv_9, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalCbsmDsl.g:1217:3: (otherlv_10= 'requiredRoles' otherlv_11= '{' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==20) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCbsmDsl.g:1218:4: otherlv_10= 'requiredRoles' otherlv_11= '{' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getComponentAccess().getRequiredRolesKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCbsmDsl.g:1226:4: ( (lv_requiredRoles_12_0= ruleRequiredRole ) )
                    // InternalCbsmDsl.g:1227:5: (lv_requiredRoles_12_0= ruleRequiredRole )
                    {
                    // InternalCbsmDsl.g:1227:5: (lv_requiredRoles_12_0= ruleRequiredRole )
                    // InternalCbsmDsl.g:1228:6: lv_requiredRoles_12_0= ruleRequiredRole
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getRequiredRolesRequiredRoleParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_requiredRoles_12_0=ruleRequiredRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						add(
                    							current,
                    							"requiredRoles",
                    							lv_requiredRoles_12_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.RequiredRole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:1245:4: (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==14) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:1246:5: otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_15); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getComponentAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:1250:5: ( (lv_requiredRoles_14_0= ruleRequiredRole ) )
                    	    // InternalCbsmDsl.g:1251:6: (lv_requiredRoles_14_0= ruleRequiredRole )
                    	    {
                    	    // InternalCbsmDsl.g:1251:6: (lv_requiredRoles_14_0= ruleRequiredRole )
                    	    // InternalCbsmDsl.g:1252:7: lv_requiredRoles_14_0= ruleRequiredRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getRequiredRolesRequiredRoleParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_requiredRoles_14_0=ruleRequiredRole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
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
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_31); 

                    				newLeafNode(otherlv_15, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalCbsmDsl.g:1275:3: (otherlv_16= 'behaviorDescription' ( (lv_behaviorDescription_17_0= ruleBehaviorDescription ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCbsmDsl.g:1276:4: otherlv_16= 'behaviorDescription' ( (lv_behaviorDescription_17_0= ruleBehaviorDescription ) )
                    {
                    otherlv_16=(Token)match(input,31,FOLLOW_32); 

                    				newLeafNode(otherlv_16, grammarAccess.getComponentAccess().getBehaviorDescriptionKeyword_6_0());
                    			
                    // InternalCbsmDsl.g:1280:4: ( (lv_behaviorDescription_17_0= ruleBehaviorDescription ) )
                    // InternalCbsmDsl.g:1281:5: (lv_behaviorDescription_17_0= ruleBehaviorDescription )
                    {
                    // InternalCbsmDsl.g:1281:5: (lv_behaviorDescription_17_0= ruleBehaviorDescription )
                    // InternalCbsmDsl.g:1282:6: lv_behaviorDescription_17_0= ruleBehaviorDescription
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getBehaviorDescriptionBehaviorDescriptionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_behaviorDescription_17_0=ruleBehaviorDescription();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						set(
                    							current,
                    							"behaviorDescription",
                    							lv_behaviorDescription_17_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.BehaviorDescription");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleEString"
    // InternalCbsmDsl.g:1308:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCbsmDsl.g:1308:47: (iv_ruleEString= ruleEString EOF )
            // InternalCbsmDsl.g:1309:2: iv_ruleEString= ruleEString EOF
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
    // InternalCbsmDsl.g:1315:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalCbsmDsl.g:1321:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalCbsmDsl.g:1322:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalCbsmDsl.g:1322:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_ID) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalCbsmDsl.g:1323:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCbsmDsl.g:1331:3: this_ID_1= RULE_ID
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
    // InternalCbsmDsl.g:1342:1: entryRuleSignature returns [EObject current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final EObject entryRuleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignature = null;


        try {
            // InternalCbsmDsl.g:1342:50: (iv_ruleSignature= ruleSignature EOF )
            // InternalCbsmDsl.g:1343:2: iv_ruleSignature= ruleSignature EOF
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
    // InternalCbsmDsl.g:1349:1: ruleSignature returns [EObject current=null] : ( () otherlv_1= 'Signature' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType' ( ( ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
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
            // InternalCbsmDsl.g:1355:2: ( ( () otherlv_1= 'Signature' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType' ( ( ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalCbsmDsl.g:1356:2: ( () otherlv_1= 'Signature' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType' ( ( ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalCbsmDsl.g:1356:2: ( () otherlv_1= 'Signature' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType' ( ( ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalCbsmDsl.g:1357:3: () otherlv_1= 'Signature' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType' ( ( ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalCbsmDsl.g:1357:3: ()
            // InternalCbsmDsl.g:1358:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSignatureAccess().getSignatureAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getSignatureAccess().getSignatureKeyword_1());
            		
            // InternalCbsmDsl.g:1368:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCbsmDsl.g:1369:4: (lv_name_2_0= ruleEString )
            {
            // InternalCbsmDsl.g:1369:4: (lv_name_2_0= ruleEString )
            // InternalCbsmDsl.g:1370:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSignatureAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_3=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCbsmDsl.g:1391:3: (otherlv_4= 'returnType' ( ( ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==33) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCbsmDsl.g:1392:4: otherlv_4= 'returnType' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getSignatureAccess().getReturnTypeKeyword_4_0());
                    			
                    // InternalCbsmDsl.g:1396:4: ( ( ruleEString ) )
                    // InternalCbsmDsl.g:1397:5: ( ruleEString )
                    {
                    // InternalCbsmDsl.g:1397:5: ( ruleEString )
                    // InternalCbsmDsl.g:1398:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSignatureRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSignatureAccess().getReturnTypeDataTypeCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCbsmDsl.g:1413:3: (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==34) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCbsmDsl.g:1414:4: otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getSignatureAccess().getParametersKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_35); 

                    				newLeafNode(otherlv_7, grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCbsmDsl.g:1422:4: ( (lv_parameters_8_0= ruleParameter ) )
                    // InternalCbsmDsl.g:1423:5: (lv_parameters_8_0= ruleParameter )
                    {
                    // InternalCbsmDsl.g:1423:5: (lv_parameters_8_0= ruleParameter )
                    // InternalCbsmDsl.g:1424:6: lv_parameters_8_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
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

                    // InternalCbsmDsl.g:1441:4: (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==14) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:1442:5: otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_35); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getSignatureAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:1446:5: ( (lv_parameters_10_0= ruleParameter ) )
                    	    // InternalCbsmDsl.g:1447:6: (lv_parameters_10_0= ruleParameter )
                    	    {
                    	    // InternalCbsmDsl.g:1447:6: (lv_parameters_10_0= ruleParameter )
                    	    // InternalCbsmDsl.g:1448:7: lv_parameters_10_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
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
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_11); 

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
    // InternalCbsmDsl.g:1479:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalCbsmDsl.g:1479:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalCbsmDsl.g:1480:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalCbsmDsl.g:1486:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:1492:2: ( (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalCbsmDsl.g:1493:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalCbsmDsl.g:1493:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalCbsmDsl.g:1494:3: otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            // InternalCbsmDsl.g:1498:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCbsmDsl.g:1499:4: (lv_name_1_0= ruleEString )
            {
            // InternalCbsmDsl.g:1499:4: (lv_name_1_0= ruleEString )
            // InternalCbsmDsl.g:1500:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_2=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getTypeKeyword_3());
            		
            // InternalCbsmDsl.g:1525:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:1526:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:1526:4: ( ruleEString )
            // InternalCbsmDsl.g:1527:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeDataTypeCrossReference_4_0());
            				
            pushFollow(FOLLOW_11);
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
    // InternalCbsmDsl.g:1549:1: entryRuleProvidedRole returns [EObject current=null] : iv_ruleProvidedRole= ruleProvidedRole EOF ;
    public final EObject entryRuleProvidedRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedRole = null;


        try {
            // InternalCbsmDsl.g:1549:53: (iv_ruleProvidedRole= ruleProvidedRole EOF )
            // InternalCbsmDsl.g:1550:2: iv_ruleProvidedRole= ruleProvidedRole EOF
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
    // InternalCbsmDsl.g:1556:1: ruleProvidedRole returns [EObject current=null] : (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providedInterface' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleProvidedRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:1562:2: ( (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providedInterface' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalCbsmDsl.g:1563:2: (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providedInterface' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalCbsmDsl.g:1563:2: (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providedInterface' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalCbsmDsl.g:1564:3: otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providedInterface' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getProvidedRoleAccess().getProvidedRoleKeyword_0());
            		
            // InternalCbsmDsl.g:1568:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCbsmDsl.g:1569:4: (lv_name_1_0= ruleEString )
            {
            // InternalCbsmDsl.g:1569:4: (lv_name_1_0= ruleEString )
            // InternalCbsmDsl.g:1570:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProvidedRoleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_2=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getProvidedRoleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,38,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getProvidedRoleAccess().getProvidedInterfaceKeyword_3());
            		
            // InternalCbsmDsl.g:1595:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:1596:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:1596:4: ( ruleEString )
            // InternalCbsmDsl.g:1597:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProvidedRoleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getProvidedRoleAccess().getProvidedInterfaceInterfaceCrossReference_4_0());
            				
            pushFollow(FOLLOW_11);
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
    // InternalCbsmDsl.g:1619:1: entryRuleRequiredRole returns [EObject current=null] : iv_ruleRequiredRole= ruleRequiredRole EOF ;
    public final EObject entryRuleRequiredRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredRole = null;


        try {
            // InternalCbsmDsl.g:1619:53: (iv_ruleRequiredRole= ruleRequiredRole EOF )
            // InternalCbsmDsl.g:1620:2: iv_ruleRequiredRole= ruleRequiredRole EOF
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
    // InternalCbsmDsl.g:1626:1: ruleRequiredRole returns [EObject current=null] : (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'requiredInterface' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleRequiredRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:1632:2: ( (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'requiredInterface' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalCbsmDsl.g:1633:2: (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'requiredInterface' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalCbsmDsl.g:1633:2: (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'requiredInterface' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalCbsmDsl.g:1634:3: otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'requiredInterface' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getRequiredRoleAccess().getRequiredRoleKeyword_0());
            		
            // InternalCbsmDsl.g:1638:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCbsmDsl.g:1639:4: (lv_name_1_0= ruleEString )
            {
            // InternalCbsmDsl.g:1639:4: (lv_name_1_0= ruleEString )
            // InternalCbsmDsl.g:1640:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequiredRoleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_2=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getRequiredRoleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,40,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getRequiredRoleAccess().getRequiredInterfaceKeyword_3());
            		
            // InternalCbsmDsl.g:1665:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:1666:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:1666:4: ( ruleEString )
            // InternalCbsmDsl.g:1667:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequiredRoleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRequiredRoleAccess().getRequiredInterfaceInterfaceCrossReference_4_0());
            				
            pushFollow(FOLLOW_11);
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
    // InternalCbsmDsl.g:1689:1: entryRuleBehaviorDescription returns [EObject current=null] : iv_ruleBehaviorDescription= ruleBehaviorDescription EOF ;
    public final EObject entryRuleBehaviorDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorDescription = null;


        try {
            // InternalCbsmDsl.g:1689:60: (iv_ruleBehaviorDescription= ruleBehaviorDescription EOF )
            // InternalCbsmDsl.g:1690:2: iv_ruleBehaviorDescription= ruleBehaviorDescription EOF
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
    // InternalCbsmDsl.g:1696:1: ruleBehaviorDescription returns [EObject current=null] : ( () otherlv_1= 'BehaviorDescription' otherlv_2= '{' (otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleBehaviorDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_actions_5_0 = null;

        EObject lv_actions_7_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:1702:2: ( ( () otherlv_1= 'BehaviorDescription' otherlv_2= '{' (otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalCbsmDsl.g:1703:2: ( () otherlv_1= 'BehaviorDescription' otherlv_2= '{' (otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalCbsmDsl.g:1703:2: ( () otherlv_1= 'BehaviorDescription' otherlv_2= '{' (otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalCbsmDsl.g:1704:3: () otherlv_1= 'BehaviorDescription' otherlv_2= '{' (otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalCbsmDsl.g:1704:3: ()
            // InternalCbsmDsl.g:1705:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBehaviorDescriptionAccess().getBehaviorDescriptionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBehaviorDescriptionAccess().getBehaviorDescriptionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getBehaviorDescriptionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCbsmDsl.g:1719:3: (otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* otherlv_8= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==42) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCbsmDsl.g:1720:4: otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getBehaviorDescriptionAccess().getActionsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_40); 

                    				newLeafNode(otherlv_4, grammarAccess.getBehaviorDescriptionAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalCbsmDsl.g:1728:4: ( (lv_actions_5_0= ruleAction ) )
                    // InternalCbsmDsl.g:1729:5: (lv_actions_5_0= ruleAction )
                    {
                    // InternalCbsmDsl.g:1729:5: (lv_actions_5_0= ruleAction )
                    // InternalCbsmDsl.g:1730:6: lv_actions_5_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getBehaviorDescriptionAccess().getActionsActionParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_actions_5_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBehaviorDescriptionRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_5_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:1747:4: (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==14) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:1748:5: otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_40); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getBehaviorDescriptionAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:1752:5: ( (lv_actions_7_0= ruleAction ) )
                    	    // InternalCbsmDsl.g:1753:6: (lv_actions_7_0= ruleAction )
                    	    {
                    	    // InternalCbsmDsl.g:1753:6: (lv_actions_7_0= ruleAction )
                    	    // InternalCbsmDsl.g:1754:7: lv_actions_7_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getBehaviorDescriptionAccess().getActionsActionParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_actions_7_0=ruleAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBehaviorDescriptionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_7_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getBehaviorDescriptionAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getBehaviorDescriptionAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleAction_Impl"
    // InternalCbsmDsl.g:1785:1: entryRuleAction_Impl returns [EObject current=null] : iv_ruleAction_Impl= ruleAction_Impl EOF ;
    public final EObject entryRuleAction_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction_Impl = null;


        try {
            // InternalCbsmDsl.g:1785:52: (iv_ruleAction_Impl= ruleAction_Impl EOF )
            // InternalCbsmDsl.g:1786:2: iv_ruleAction_Impl= ruleAction_Impl EOF
            {
             newCompositeNode(grammarAccess.getAction_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction_Impl=ruleAction_Impl();

            state._fsp--;

             current =iv_ruleAction_Impl; 
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
    // $ANTLR end "entryRuleAction_Impl"


    // $ANTLR start "ruleAction_Impl"
    // InternalCbsmDsl.g:1792:1: ruleAction_Impl returns [EObject current=null] : ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleAction_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:1798:2: ( ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalCbsmDsl.g:1799:2: ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalCbsmDsl.g:1799:2: ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalCbsmDsl.g:1800:3: () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalCbsmDsl.g:1800:3: ()
            // InternalCbsmDsl.g:1801:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAction_ImplAccess().getActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getAction_ImplAccess().getActionKeyword_1());
            		
            // InternalCbsmDsl.g:1811:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCbsmDsl.g:1812:4: (lv_name_2_0= ruleEString )
            {
            // InternalCbsmDsl.g:1812:4: (lv_name_2_0= ruleEString )
            // InternalCbsmDsl.g:1813:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAction_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAction_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getAction_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCbsmDsl.g:1834:3: (otherlv_4= 'predecessor' ( ( ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==44) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCbsmDsl.g:1835:4: otherlv_4= 'predecessor' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,44,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getAction_ImplAccess().getPredecessorKeyword_4_0());
                    			
                    // InternalCbsmDsl.g:1839:4: ( ( ruleEString ) )
                    // InternalCbsmDsl.g:1840:5: ( ruleEString )
                    {
                    // InternalCbsmDsl.g:1840:5: ( ruleEString )
                    // InternalCbsmDsl.g:1841:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAction_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAction_ImplAccess().getPredecessorActionCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCbsmDsl.g:1856:3: (otherlv_6= 'successor' ( ( ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==45) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCbsmDsl.g:1857:4: otherlv_6= 'successor' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,45,FOLLOW_26); 

                    				newLeafNode(otherlv_6, grammarAccess.getAction_ImplAccess().getSuccessorKeyword_5_0());
                    			
                    // InternalCbsmDsl.g:1861:4: ( ( ruleEString ) )
                    // InternalCbsmDsl.g:1862:5: ( ruleEString )
                    {
                    // InternalCbsmDsl.g:1862:5: ( ruleEString )
                    // InternalCbsmDsl.g:1863:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAction_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAction_ImplAccess().getSuccessorActionCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAction_ImplAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleAction_Impl"


    // $ANTLR start "entryRuleInternalAction"
    // InternalCbsmDsl.g:1886:1: entryRuleInternalAction returns [EObject current=null] : iv_ruleInternalAction= ruleInternalAction EOF ;
    public final EObject entryRuleInternalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalAction = null;


        try {
            // InternalCbsmDsl.g:1886:55: (iv_ruleInternalAction= ruleInternalAction EOF )
            // InternalCbsmDsl.g:1887:2: iv_ruleInternalAction= ruleInternalAction EOF
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
    // InternalCbsmDsl.g:1893:1: ruleInternalAction returns [EObject current=null] : ( () otherlv_1= 'InternalAction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
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
            // InternalCbsmDsl.g:1899:2: ( ( () otherlv_1= 'InternalAction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalCbsmDsl.g:1900:2: ( () otherlv_1= 'InternalAction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalCbsmDsl.g:1900:2: ( () otherlv_1= 'InternalAction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalCbsmDsl.g:1901:3: () otherlv_1= 'InternalAction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalCbsmDsl.g:1901:3: ()
            // InternalCbsmDsl.g:1902:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInternalActionAccess().getInternalActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getInternalActionAccess().getInternalActionKeyword_1());
            		
            // InternalCbsmDsl.g:1912:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCbsmDsl.g:1913:4: (lv_name_2_0= ruleEString )
            {
            // InternalCbsmDsl.g:1913:4: (lv_name_2_0= ruleEString )
            // InternalCbsmDsl.g:1914:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInternalActionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_3=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getInternalActionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCbsmDsl.g:1935:3: (otherlv_4= 'predecessor' ( ( ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==44) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCbsmDsl.g:1936:4: otherlv_4= 'predecessor' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,44,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getInternalActionAccess().getPredecessorKeyword_4_0());
                    			
                    // InternalCbsmDsl.g:1940:4: ( ( ruleEString ) )
                    // InternalCbsmDsl.g:1941:5: ( ruleEString )
                    {
                    // InternalCbsmDsl.g:1941:5: ( ruleEString )
                    // InternalCbsmDsl.g:1942:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInternalActionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getInternalActionAccess().getPredecessorActionCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCbsmDsl.g:1957:3: (otherlv_6= 'successor' ( ( ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==45) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCbsmDsl.g:1958:4: otherlv_6= 'successor' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,45,FOLLOW_26); 

                    				newLeafNode(otherlv_6, grammarAccess.getInternalActionAccess().getSuccessorKeyword_5_0());
                    			
                    // InternalCbsmDsl.g:1962:4: ( ( ruleEString ) )
                    // InternalCbsmDsl.g:1963:5: ( ruleEString )
                    {
                    // InternalCbsmDsl.g:1963:5: ( ruleEString )
                    // InternalCbsmDsl.g:1964:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInternalActionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getInternalActionAccess().getSuccessorActionCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_11);
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
    // InternalCbsmDsl.g:1987:1: entryRuleExternalCall returns [EObject current=null] : iv_ruleExternalCall= ruleExternalCall EOF ;
    public final EObject entryRuleExternalCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalCall = null;


        try {
            // InternalCbsmDsl.g:1987:53: (iv_ruleExternalCall= ruleExternalCall EOF )
            // InternalCbsmDsl.g:1988:2: iv_ruleExternalCall= ruleExternalCall EOF
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
    // InternalCbsmDsl.g:1994:1: ruleExternalCall returns [EObject current=null] : (otherlv_0= 'ExternalCall' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'predecessor' ( ( ruleEString ) ) )? (otherlv_5= 'successor' ( ( ruleEString ) ) )? otherlv_7= 'requiredService' ( ( ruleEString ) ) otherlv_9= 'requiredRoleOfService' ( ( ruleEString ) ) otherlv_11= '}' ) ;
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
            // InternalCbsmDsl.g:2000:2: ( (otherlv_0= 'ExternalCall' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'predecessor' ( ( ruleEString ) ) )? (otherlv_5= 'successor' ( ( ruleEString ) ) )? otherlv_7= 'requiredService' ( ( ruleEString ) ) otherlv_9= 'requiredRoleOfService' ( ( ruleEString ) ) otherlv_11= '}' ) )
            // InternalCbsmDsl.g:2001:2: (otherlv_0= 'ExternalCall' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'predecessor' ( ( ruleEString ) ) )? (otherlv_5= 'successor' ( ( ruleEString ) ) )? otherlv_7= 'requiredService' ( ( ruleEString ) ) otherlv_9= 'requiredRoleOfService' ( ( ruleEString ) ) otherlv_11= '}' )
            {
            // InternalCbsmDsl.g:2001:2: (otherlv_0= 'ExternalCall' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'predecessor' ( ( ruleEString ) ) )? (otherlv_5= 'successor' ( ( ruleEString ) ) )? otherlv_7= 'requiredService' ( ( ruleEString ) ) otherlv_9= 'requiredRoleOfService' ( ( ruleEString ) ) otherlv_11= '}' )
            // InternalCbsmDsl.g:2002:3: otherlv_0= 'ExternalCall' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'predecessor' ( ( ruleEString ) ) )? (otherlv_5= 'successor' ( ( ruleEString ) ) )? otherlv_7= 'requiredService' ( ( ruleEString ) ) otherlv_9= 'requiredRoleOfService' ( ( ruleEString ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalCallAccess().getExternalCallKeyword_0());
            		
            // InternalCbsmDsl.g:2006:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCbsmDsl.g:2007:4: (lv_name_1_0= ruleEString )
            {
            // InternalCbsmDsl.g:2007:4: (lv_name_1_0= ruleEString )
            // InternalCbsmDsl.g:2008:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExternalCallAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_2=(Token)match(input,12,FOLLOW_43); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalCallAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCbsmDsl.g:2029:3: (otherlv_3= 'predecessor' ( ( ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==44) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalCbsmDsl.g:2030:4: otherlv_3= 'predecessor' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,44,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getExternalCallAccess().getPredecessorKeyword_3_0());
                    			
                    // InternalCbsmDsl.g:2034:4: ( ( ruleEString ) )
                    // InternalCbsmDsl.g:2035:5: ( ruleEString )
                    {
                    // InternalCbsmDsl.g:2035:5: ( ruleEString )
                    // InternalCbsmDsl.g:2036:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExternalCallRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getExternalCallAccess().getPredecessorActionCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCbsmDsl.g:2051:3: (otherlv_5= 'successor' ( ( ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==45) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalCbsmDsl.g:2052:4: otherlv_5= 'successor' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,45,FOLLOW_26); 

                    				newLeafNode(otherlv_5, grammarAccess.getExternalCallAccess().getSuccessorKeyword_4_0());
                    			
                    // InternalCbsmDsl.g:2056:4: ( ( ruleEString ) )
                    // InternalCbsmDsl.g:2057:5: ( ruleEString )
                    {
                    // InternalCbsmDsl.g:2057:5: ( ruleEString )
                    // InternalCbsmDsl.g:2058:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExternalCallRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getExternalCallAccess().getSuccessorActionCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_45);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,48,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getExternalCallAccess().getRequiredServiceKeyword_5());
            		
            // InternalCbsmDsl.g:2077:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:2078:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:2078:4: ( ruleEString )
            // InternalCbsmDsl.g:2079:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalCallRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExternalCallAccess().getRequiredServiceSignatureCrossReference_6_0());
            				
            pushFollow(FOLLOW_46);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,49,FOLLOW_26); 

            			newLeafNode(otherlv_9, grammarAccess.getExternalCallAccess().getRequiredRoleOfServiceKeyword_7());
            		
            // InternalCbsmDsl.g:2097:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:2098:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:2098:4: ( ruleEString )
            // InternalCbsmDsl.g:2099:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalCallRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExternalCallAccess().getRequiredRoleOfServiceRequiredRoleCrossReference_8_0());
            				
            pushFollow(FOLLOW_11);
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
    // InternalCbsmDsl.g:2121:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalCbsmDsl.g:2121:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalCbsmDsl.g:2122:2: iv_ruleLoop= ruleLoop EOF
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
    // InternalCbsmDsl.g:2128:1: ruleLoop returns [EObject current=null] : ( () otherlv_1= 'Loop' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? (otherlv_8= 'loopActions' otherlv_9= '{' ( (lv_loopActions_10_0= ruleAction ) ) (otherlv_11= ',' ( (lv_loopActions_12_0= ruleAction ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleLoop() throws RecognitionException {
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

        EObject lv_loopActions_10_0 = null;

        EObject lv_loopActions_12_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:2134:2: ( ( () otherlv_1= 'Loop' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? (otherlv_8= 'loopActions' otherlv_9= '{' ( (lv_loopActions_10_0= ruleAction ) ) (otherlv_11= ',' ( (lv_loopActions_12_0= ruleAction ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalCbsmDsl.g:2135:2: ( () otherlv_1= 'Loop' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? (otherlv_8= 'loopActions' otherlv_9= '{' ( (lv_loopActions_10_0= ruleAction ) ) (otherlv_11= ',' ( (lv_loopActions_12_0= ruleAction ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalCbsmDsl.g:2135:2: ( () otherlv_1= 'Loop' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? (otherlv_8= 'loopActions' otherlv_9= '{' ( (lv_loopActions_10_0= ruleAction ) ) (otherlv_11= ',' ( (lv_loopActions_12_0= ruleAction ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalCbsmDsl.g:2136:3: () otherlv_1= 'Loop' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? (otherlv_8= 'loopActions' otherlv_9= '{' ( (lv_loopActions_10_0= ruleAction ) ) (otherlv_11= ',' ( (lv_loopActions_12_0= ruleAction ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // InternalCbsmDsl.g:2136:3: ()
            // InternalCbsmDsl.g:2137:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoopAccess().getLoopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getLoopKeyword_1());
            		
            // InternalCbsmDsl.g:2147:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCbsmDsl.g:2148:4: (lv_name_2_0= ruleEString )
            {
            // InternalCbsmDsl.g:2148:4: (lv_name_2_0= ruleEString )
            // InternalCbsmDsl.g:2149:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLoopAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_3=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_3, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCbsmDsl.g:2170:3: (otherlv_4= 'predecessor' ( ( ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==44) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalCbsmDsl.g:2171:4: otherlv_4= 'predecessor' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,44,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getLoopAccess().getPredecessorKeyword_4_0());
                    			
                    // InternalCbsmDsl.g:2175:4: ( ( ruleEString ) )
                    // InternalCbsmDsl.g:2176:5: ( ruleEString )
                    {
                    // InternalCbsmDsl.g:2176:5: ( ruleEString )
                    // InternalCbsmDsl.g:2177:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLoopRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLoopAccess().getPredecessorActionCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCbsmDsl.g:2192:3: (otherlv_6= 'successor' ( ( ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==45) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalCbsmDsl.g:2193:4: otherlv_6= 'successor' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,45,FOLLOW_26); 

                    				newLeafNode(otherlv_6, grammarAccess.getLoopAccess().getSuccessorKeyword_5_0());
                    			
                    // InternalCbsmDsl.g:2197:4: ( ( ruleEString ) )
                    // InternalCbsmDsl.g:2198:5: ( ruleEString )
                    {
                    // InternalCbsmDsl.g:2198:5: ( ruleEString )
                    // InternalCbsmDsl.g:2199:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLoopRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLoopAccess().getSuccessorActionCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_49);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCbsmDsl.g:2214:3: (otherlv_8= 'loopActions' otherlv_9= '{' ( (lv_loopActions_10_0= ruleAction ) ) (otherlv_11= ',' ( (lv_loopActions_12_0= ruleAction ) ) )* otherlv_13= '}' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==51) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalCbsmDsl.g:2215:4: otherlv_8= 'loopActions' otherlv_9= '{' ( (lv_loopActions_10_0= ruleAction ) ) (otherlv_11= ',' ( (lv_loopActions_12_0= ruleAction ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,51,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getLoopAccess().getLoopActionsKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_40); 

                    				newLeafNode(otherlv_9, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCbsmDsl.g:2223:4: ( (lv_loopActions_10_0= ruleAction ) )
                    // InternalCbsmDsl.g:2224:5: (lv_loopActions_10_0= ruleAction )
                    {
                    // InternalCbsmDsl.g:2224:5: (lv_loopActions_10_0= ruleAction )
                    // InternalCbsmDsl.g:2225:6: lv_loopActions_10_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getLoopAccess().getLoopActionsActionParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_loopActions_10_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoopRule());
                    						}
                    						add(
                    							current,
                    							"loopActions",
                    							lv_loopActions_10_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:2242:4: (otherlv_11= ',' ( (lv_loopActions_12_0= ruleAction ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==14) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:2243:5: otherlv_11= ',' ( (lv_loopActions_12_0= ruleAction ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_40); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getLoopAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:2247:5: ( (lv_loopActions_12_0= ruleAction ) )
                    	    // InternalCbsmDsl.g:2248:6: (lv_loopActions_12_0= ruleAction )
                    	    {
                    	    // InternalCbsmDsl.g:2248:6: (lv_loopActions_12_0= ruleAction )
                    	    // InternalCbsmDsl.g:2249:7: lv_loopActions_12_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getLoopAccess().getLoopActionsActionParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_loopActions_12_0=ruleAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLoopRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"loopActions",
                    	    								lv_loopActions_12_0,
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

                    otherlv_13=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalCbsmDsl.g:2280:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // InternalCbsmDsl.g:2280:47: (iv_ruleBranch= ruleBranch EOF )
            // InternalCbsmDsl.g:2281:2: iv_ruleBranch= ruleBranch EOF
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
    // InternalCbsmDsl.g:2287:1: ruleBranch returns [EObject current=null] : ( () otherlv_1= 'Branch' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? (otherlv_8= 'branchPaths' otherlv_9= '{' ( (lv_branchPaths_10_0= ruleBranchPath ) ) (otherlv_11= ',' ( (lv_branchPaths_12_0= ruleBranchPath ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
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
            // InternalCbsmDsl.g:2293:2: ( ( () otherlv_1= 'Branch' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? (otherlv_8= 'branchPaths' otherlv_9= '{' ( (lv_branchPaths_10_0= ruleBranchPath ) ) (otherlv_11= ',' ( (lv_branchPaths_12_0= ruleBranchPath ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalCbsmDsl.g:2294:2: ( () otherlv_1= 'Branch' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? (otherlv_8= 'branchPaths' otherlv_9= '{' ( (lv_branchPaths_10_0= ruleBranchPath ) ) (otherlv_11= ',' ( (lv_branchPaths_12_0= ruleBranchPath ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalCbsmDsl.g:2294:2: ( () otherlv_1= 'Branch' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? (otherlv_8= 'branchPaths' otherlv_9= '{' ( (lv_branchPaths_10_0= ruleBranchPath ) ) (otherlv_11= ',' ( (lv_branchPaths_12_0= ruleBranchPath ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalCbsmDsl.g:2295:3: () otherlv_1= 'Branch' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? (otherlv_8= 'branchPaths' otherlv_9= '{' ( (lv_branchPaths_10_0= ruleBranchPath ) ) (otherlv_11= ',' ( (lv_branchPaths_12_0= ruleBranchPath ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // InternalCbsmDsl.g:2295:3: ()
            // InternalCbsmDsl.g:2296:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBranchAccess().getBranchAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getBranchAccess().getBranchKeyword_1());
            		
            // InternalCbsmDsl.g:2306:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCbsmDsl.g:2307:4: (lv_name_2_0= ruleEString )
            {
            // InternalCbsmDsl.g:2307:4: (lv_name_2_0= ruleEString )
            // InternalCbsmDsl.g:2308:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBranchAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_3=(Token)match(input,12,FOLLOW_50); 

            			newLeafNode(otherlv_3, grammarAccess.getBranchAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCbsmDsl.g:2329:3: (otherlv_4= 'predecessor' ( ( ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==44) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalCbsmDsl.g:2330:4: otherlv_4= 'predecessor' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,44,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getBranchAccess().getPredecessorKeyword_4_0());
                    			
                    // InternalCbsmDsl.g:2334:4: ( ( ruleEString ) )
                    // InternalCbsmDsl.g:2335:5: ( ruleEString )
                    {
                    // InternalCbsmDsl.g:2335:5: ( ruleEString )
                    // InternalCbsmDsl.g:2336:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBranchRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBranchAccess().getPredecessorActionCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCbsmDsl.g:2351:3: (otherlv_6= 'successor' ( ( ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==45) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalCbsmDsl.g:2352:4: otherlv_6= 'successor' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,45,FOLLOW_26); 

                    				newLeafNode(otherlv_6, grammarAccess.getBranchAccess().getSuccessorKeyword_5_0());
                    			
                    // InternalCbsmDsl.g:2356:4: ( ( ruleEString ) )
                    // InternalCbsmDsl.g:2357:5: ( ruleEString )
                    {
                    // InternalCbsmDsl.g:2357:5: ( ruleEString )
                    // InternalCbsmDsl.g:2358:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBranchRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBranchAccess().getSuccessorActionCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCbsmDsl.g:2373:3: (otherlv_8= 'branchPaths' otherlv_9= '{' ( (lv_branchPaths_10_0= ruleBranchPath ) ) (otherlv_11= ',' ( (lv_branchPaths_12_0= ruleBranchPath ) ) )* otherlv_13= '}' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==53) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalCbsmDsl.g:2374:4: otherlv_8= 'branchPaths' otherlv_9= '{' ( (lv_branchPaths_10_0= ruleBranchPath ) ) (otherlv_11= ',' ( (lv_branchPaths_12_0= ruleBranchPath ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,53,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getBranchAccess().getBranchPathsKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_53); 

                    				newLeafNode(otherlv_9, grammarAccess.getBranchAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCbsmDsl.g:2382:4: ( (lv_branchPaths_10_0= ruleBranchPath ) )
                    // InternalCbsmDsl.g:2383:5: (lv_branchPaths_10_0= ruleBranchPath )
                    {
                    // InternalCbsmDsl.g:2383:5: (lv_branchPaths_10_0= ruleBranchPath )
                    // InternalCbsmDsl.g:2384:6: lv_branchPaths_10_0= ruleBranchPath
                    {

                    						newCompositeNode(grammarAccess.getBranchAccess().getBranchPathsBranchPathParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
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

                    // InternalCbsmDsl.g:2401:4: (otherlv_11= ',' ( (lv_branchPaths_12_0= ruleBranchPath ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==14) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:2402:5: otherlv_11= ',' ( (lv_branchPaths_12_0= ruleBranchPath ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_53); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getBranchAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:2406:5: ( (lv_branchPaths_12_0= ruleBranchPath ) )
                    	    // InternalCbsmDsl.g:2407:6: (lv_branchPaths_12_0= ruleBranchPath )
                    	    {
                    	    // InternalCbsmDsl.g:2407:6: (lv_branchPaths_12_0= ruleBranchPath )
                    	    // InternalCbsmDsl.g:2408:7: lv_branchPaths_12_0= ruleBranchPath
                    	    {

                    	    							newCompositeNode(grammarAccess.getBranchAccess().getBranchPathsBranchPathParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
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
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,15,FOLLOW_11); 

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
    // InternalCbsmDsl.g:2439:1: entryRuleBranchPath returns [EObject current=null] : iv_ruleBranchPath= ruleBranchPath EOF ;
    public final EObject entryRuleBranchPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranchPath = null;


        try {
            // InternalCbsmDsl.g:2439:51: (iv_ruleBranchPath= ruleBranchPath EOF )
            // InternalCbsmDsl.g:2440:2: iv_ruleBranchPath= ruleBranchPath EOF
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
    // InternalCbsmDsl.g:2446:1: ruleBranchPath returns [EObject current=null] : ( () otherlv_1= 'BranchPath' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pathActions' otherlv_5= '{' ( (lv_pathActions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_pathActions_8_0= ruleAction ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleBranchPath() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_pathActions_6_0 = null;

        EObject lv_pathActions_8_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:2452:2: ( ( () otherlv_1= 'BranchPath' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pathActions' otherlv_5= '{' ( (lv_pathActions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_pathActions_8_0= ruleAction ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalCbsmDsl.g:2453:2: ( () otherlv_1= 'BranchPath' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pathActions' otherlv_5= '{' ( (lv_pathActions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_pathActions_8_0= ruleAction ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalCbsmDsl.g:2453:2: ( () otherlv_1= 'BranchPath' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pathActions' otherlv_5= '{' ( (lv_pathActions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_pathActions_8_0= ruleAction ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalCbsmDsl.g:2454:3: () otherlv_1= 'BranchPath' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pathActions' otherlv_5= '{' ( (lv_pathActions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_pathActions_8_0= ruleAction ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalCbsmDsl.g:2454:3: ()
            // InternalCbsmDsl.g:2455:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBranchPathAccess().getBranchPathAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getBranchPathAccess().getBranchPathKeyword_1());
            		
            // InternalCbsmDsl.g:2465:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCbsmDsl.g:2466:4: (lv_name_2_0= ruleEString )
            {
            // InternalCbsmDsl.g:2466:4: (lv_name_2_0= ruleEString )
            // InternalCbsmDsl.g:2467:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBranchPathAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_3=(Token)match(input,12,FOLLOW_54); 

            			newLeafNode(otherlv_3, grammarAccess.getBranchPathAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCbsmDsl.g:2488:3: (otherlv_4= 'pathActions' otherlv_5= '{' ( (lv_pathActions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_pathActions_8_0= ruleAction ) ) )* otherlv_9= '}' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==55) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalCbsmDsl.g:2489:4: otherlv_4= 'pathActions' otherlv_5= '{' ( (lv_pathActions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_pathActions_8_0= ruleAction ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,55,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getBranchPathAccess().getPathActionsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_40); 

                    				newLeafNode(otherlv_5, grammarAccess.getBranchPathAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCbsmDsl.g:2497:4: ( (lv_pathActions_6_0= ruleAction ) )
                    // InternalCbsmDsl.g:2498:5: (lv_pathActions_6_0= ruleAction )
                    {
                    // InternalCbsmDsl.g:2498:5: (lv_pathActions_6_0= ruleAction )
                    // InternalCbsmDsl.g:2499:6: lv_pathActions_6_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getBranchPathAccess().getPathActionsActionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_pathActions_6_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBranchPathRule());
                    						}
                    						add(
                    							current,
                    							"pathActions",
                    							lv_pathActions_6_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbsmDsl.g:2516:4: (otherlv_7= ',' ( (lv_pathActions_8_0= ruleAction ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==14) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalCbsmDsl.g:2517:5: otherlv_7= ',' ( (lv_pathActions_8_0= ruleAction ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_40); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getBranchPathAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCbsmDsl.g:2521:5: ( (lv_pathActions_8_0= ruleAction ) )
                    	    // InternalCbsmDsl.g:2522:6: (lv_pathActions_8_0= ruleAction )
                    	    {
                    	    // InternalCbsmDsl.g:2522:6: (lv_pathActions_8_0= ruleAction )
                    	    // InternalCbsmDsl.g:2523:7: lv_pathActions_8_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getBranchPathAccess().getPathActionsActionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_pathActions_8_0=ruleAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBranchPathRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"pathActions",
                    	    								lv_pathActions_8_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CbsmDsl.Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getBranchPathAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getBranchPathAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalCbsmDsl.g:2554:1: entryRuleComplexType returns [EObject current=null] : iv_ruleComplexType= ruleComplexType EOF ;
    public final EObject entryRuleComplexType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexType = null;


        try {
            // InternalCbsmDsl.g:2554:52: (iv_ruleComplexType= ruleComplexType EOF )
            // InternalCbsmDsl.g:2555:2: iv_ruleComplexType= ruleComplexType EOF
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
    // InternalCbsmDsl.g:2561:1: ruleComplexType returns [EObject current=null] : ( () otherlv_1= 'ComplexType' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleComplexType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:2567:2: ( ( () otherlv_1= 'ComplexType' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalCbsmDsl.g:2568:2: ( () otherlv_1= 'ComplexType' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalCbsmDsl.g:2568:2: ( () otherlv_1= 'ComplexType' ( (lv_name_2_0= ruleEString ) ) )
            // InternalCbsmDsl.g:2569:3: () otherlv_1= 'ComplexType' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalCbsmDsl.g:2569:3: ()
            // InternalCbsmDsl.g:2570:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComplexTypeAccess().getComplexTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,56,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexTypeAccess().getComplexTypeKeyword_1());
            		
            // InternalCbsmDsl.g:2580:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCbsmDsl.g:2581:4: (lv_name_2_0= ruleEString )
            {
            // InternalCbsmDsl.g:2581:4: (lv_name_2_0= ruleEString )
            // InternalCbsmDsl.g:2582:5: lv_name_2_0= ruleEString
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
    // InternalCbsmDsl.g:2603:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // InternalCbsmDsl.g:2603:51: (iv_ruleSimpleType= ruleSimpleType EOF )
            // InternalCbsmDsl.g:2604:2: iv_ruleSimpleType= ruleSimpleType EOF
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
    // InternalCbsmDsl.g:2610:1: ruleSimpleType returns [EObject current=null] : (otherlv_0= 'SimpleType' otherlv_1= '{' otherlv_2= 'typeInstance' ( (lv_typeInstance_3_0= ruleSimpleTypeInstance ) ) otherlv_4= '}' ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_typeInstance_3_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:2616:2: ( (otherlv_0= 'SimpleType' otherlv_1= '{' otherlv_2= 'typeInstance' ( (lv_typeInstance_3_0= ruleSimpleTypeInstance ) ) otherlv_4= '}' ) )
            // InternalCbsmDsl.g:2617:2: (otherlv_0= 'SimpleType' otherlv_1= '{' otherlv_2= 'typeInstance' ( (lv_typeInstance_3_0= ruleSimpleTypeInstance ) ) otherlv_4= '}' )
            {
            // InternalCbsmDsl.g:2617:2: (otherlv_0= 'SimpleType' otherlv_1= '{' otherlv_2= 'typeInstance' ( (lv_typeInstance_3_0= ruleSimpleTypeInstance ) ) otherlv_4= '}' )
            // InternalCbsmDsl.g:2618:3: otherlv_0= 'SimpleType' otherlv_1= '{' otherlv_2= 'typeInstance' ( (lv_typeInstance_3_0= ruleSimpleTypeInstance ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSimpleTypeAccess().getSimpleTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_55); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,58,FOLLOW_56); 

            			newLeafNode(otherlv_2, grammarAccess.getSimpleTypeAccess().getTypeInstanceKeyword_2());
            		
            // InternalCbsmDsl.g:2630:3: ( (lv_typeInstance_3_0= ruleSimpleTypeInstance ) )
            // InternalCbsmDsl.g:2631:4: (lv_typeInstance_3_0= ruleSimpleTypeInstance )
            {
            // InternalCbsmDsl.g:2631:4: (lv_typeInstance_3_0= ruleSimpleTypeInstance )
            // InternalCbsmDsl.g:2632:5: lv_typeInstance_3_0= ruleSimpleTypeInstance
            {

            					newCompositeNode(grammarAccess.getSimpleTypeAccess().getTypeInstanceSimpleTypeInstanceEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
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
    // InternalCbsmDsl.g:2657:1: entryRuleAssemblyContext returns [EObject current=null] : iv_ruleAssemblyContext= ruleAssemblyContext EOF ;
    public final EObject entryRuleAssemblyContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyContext = null;


        try {
            // InternalCbsmDsl.g:2657:56: (iv_ruleAssemblyContext= ruleAssemblyContext EOF )
            // InternalCbsmDsl.g:2658:2: iv_ruleAssemblyContext= ruleAssemblyContext EOF
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
    // InternalCbsmDsl.g:2664:1: ruleAssemblyContext returns [EObject current=null] : (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instantiatedComponent' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleAssemblyContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:2670:2: ( (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instantiatedComponent' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalCbsmDsl.g:2671:2: (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instantiatedComponent' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalCbsmDsl.g:2671:2: (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instantiatedComponent' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalCbsmDsl.g:2672:3: otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instantiatedComponent' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyContextAccess().getAssemblyContextKeyword_0());
            		
            // InternalCbsmDsl.g:2676:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCbsmDsl.g:2677:4: (lv_name_1_0= ruleEString )
            {
            // InternalCbsmDsl.g:2677:4: (lv_name_1_0= ruleEString )
            // InternalCbsmDsl.g:2678:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAssemblyContextAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_2=(Token)match(input,12,FOLLOW_57); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,60,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getAssemblyContextAccess().getInstantiatedComponentKeyword_3());
            		
            // InternalCbsmDsl.g:2703:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:2704:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:2704:4: ( ruleEString )
            // InternalCbsmDsl.g:2705:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyContextAccess().getInstantiatedComponentComponentCrossReference_4_0());
            				
            pushFollow(FOLLOW_11);
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
    // InternalCbsmDsl.g:2727:1: entryRuleProvidedDelegationConnector returns [EObject current=null] : iv_ruleProvidedDelegationConnector= ruleProvidedDelegationConnector EOF ;
    public final EObject entryRuleProvidedDelegationConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedDelegationConnector = null;


        try {
            // InternalCbsmDsl.g:2727:68: (iv_ruleProvidedDelegationConnector= ruleProvidedDelegationConnector EOF )
            // InternalCbsmDsl.g:2728:2: iv_ruleProvidedDelegationConnector= ruleProvidedDelegationConnector EOF
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
    // InternalCbsmDsl.g:2734:1: ruleProvidedDelegationConnector returns [EObject current=null] : (otherlv_0= 'ProvidedDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'innerAssemblyContext' ( ( ruleEString ) ) otherlv_5= 'outerAssemblyContext' ( ( ruleEString ) ) otherlv_7= 'innerProvidedRole' ( ( ruleEString ) ) otherlv_9= 'outerProvidedRole' ( ( ruleEString ) ) otherlv_11= '}' ) ;
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
            // InternalCbsmDsl.g:2740:2: ( (otherlv_0= 'ProvidedDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'innerAssemblyContext' ( ( ruleEString ) ) otherlv_5= 'outerAssemblyContext' ( ( ruleEString ) ) otherlv_7= 'innerProvidedRole' ( ( ruleEString ) ) otherlv_9= 'outerProvidedRole' ( ( ruleEString ) ) otherlv_11= '}' ) )
            // InternalCbsmDsl.g:2741:2: (otherlv_0= 'ProvidedDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'innerAssemblyContext' ( ( ruleEString ) ) otherlv_5= 'outerAssemblyContext' ( ( ruleEString ) ) otherlv_7= 'innerProvidedRole' ( ( ruleEString ) ) otherlv_9= 'outerProvidedRole' ( ( ruleEString ) ) otherlv_11= '}' )
            {
            // InternalCbsmDsl.g:2741:2: (otherlv_0= 'ProvidedDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'innerAssemblyContext' ( ( ruleEString ) ) otherlv_5= 'outerAssemblyContext' ( ( ruleEString ) ) otherlv_7= 'innerProvidedRole' ( ( ruleEString ) ) otherlv_9= 'outerProvidedRole' ( ( ruleEString ) ) otherlv_11= '}' )
            // InternalCbsmDsl.g:2742:3: otherlv_0= 'ProvidedDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'innerAssemblyContext' ( ( ruleEString ) ) otherlv_5= 'outerAssemblyContext' ( ( ruleEString ) ) otherlv_7= 'innerProvidedRole' ( ( ruleEString ) ) otherlv_9= 'outerProvidedRole' ( ( ruleEString ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getProvidedDelegationConnectorAccess().getProvidedDelegationConnectorKeyword_0());
            		
            // InternalCbsmDsl.g:2746:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCbsmDsl.g:2747:4: (lv_name_1_0= ruleEString )
            {
            // InternalCbsmDsl.g:2747:4: (lv_name_1_0= ruleEString )
            // InternalCbsmDsl.g:2748:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProvidedDelegationConnectorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_2=(Token)match(input,12,FOLLOW_58); 

            			newLeafNode(otherlv_2, grammarAccess.getProvidedDelegationConnectorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,62,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getProvidedDelegationConnectorAccess().getInnerAssemblyContextKeyword_3());
            		
            // InternalCbsmDsl.g:2773:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:2774:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:2774:4: ( ruleEString )
            // InternalCbsmDsl.g:2775:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProvidedDelegationConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getProvidedDelegationConnectorAccess().getInnerAssemblyContextAssemblyContextCrossReference_4_0());
            				
            pushFollow(FOLLOW_59);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,63,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getProvidedDelegationConnectorAccess().getOuterAssemblyContextKeyword_5());
            		
            // InternalCbsmDsl.g:2793:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:2794:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:2794:4: ( ruleEString )
            // InternalCbsmDsl.g:2795:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProvidedDelegationConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getProvidedDelegationConnectorAccess().getOuterAssemblyContextAssemblyContextCrossReference_6_0());
            				
            pushFollow(FOLLOW_60);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,64,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getProvidedDelegationConnectorAccess().getInnerProvidedRoleKeyword_7());
            		
            // InternalCbsmDsl.g:2813:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:2814:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:2814:4: ( ruleEString )
            // InternalCbsmDsl.g:2815:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProvidedDelegationConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getProvidedDelegationConnectorAccess().getInnerProvidedRoleProvidedRoleCrossReference_8_0());
            				
            pushFollow(FOLLOW_61);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,65,FOLLOW_26); 

            			newLeafNode(otherlv_9, grammarAccess.getProvidedDelegationConnectorAccess().getOuterProvidedRoleKeyword_9());
            		
            // InternalCbsmDsl.g:2833:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:2834:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:2834:4: ( ruleEString )
            // InternalCbsmDsl.g:2835:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProvidedDelegationConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getProvidedDelegationConnectorAccess().getOuterProvidedRoleProvidedRoleCrossReference_10_0());
            				
            pushFollow(FOLLOW_11);
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
    // InternalCbsmDsl.g:2857:1: entryRuleRequiredDelegationConnector returns [EObject current=null] : iv_ruleRequiredDelegationConnector= ruleRequiredDelegationConnector EOF ;
    public final EObject entryRuleRequiredDelegationConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredDelegationConnector = null;


        try {
            // InternalCbsmDsl.g:2857:68: (iv_ruleRequiredDelegationConnector= ruleRequiredDelegationConnector EOF )
            // InternalCbsmDsl.g:2858:2: iv_ruleRequiredDelegationConnector= ruleRequiredDelegationConnector EOF
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
    // InternalCbsmDsl.g:2864:1: ruleRequiredDelegationConnector returns [EObject current=null] : (otherlv_0= 'RequiredDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'innerAssemblyContext' ( ( ruleEString ) ) otherlv_5= 'outerAssemblyContext' ( ( ruleEString ) ) otherlv_7= 'innerRequiredRole' ( ( ruleEString ) ) otherlv_9= 'outerRequiredRole' ( ( ruleEString ) ) otherlv_11= '}' ) ;
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
            // InternalCbsmDsl.g:2870:2: ( (otherlv_0= 'RequiredDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'innerAssemblyContext' ( ( ruleEString ) ) otherlv_5= 'outerAssemblyContext' ( ( ruleEString ) ) otherlv_7= 'innerRequiredRole' ( ( ruleEString ) ) otherlv_9= 'outerRequiredRole' ( ( ruleEString ) ) otherlv_11= '}' ) )
            // InternalCbsmDsl.g:2871:2: (otherlv_0= 'RequiredDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'innerAssemblyContext' ( ( ruleEString ) ) otherlv_5= 'outerAssemblyContext' ( ( ruleEString ) ) otherlv_7= 'innerRequiredRole' ( ( ruleEString ) ) otherlv_9= 'outerRequiredRole' ( ( ruleEString ) ) otherlv_11= '}' )
            {
            // InternalCbsmDsl.g:2871:2: (otherlv_0= 'RequiredDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'innerAssemblyContext' ( ( ruleEString ) ) otherlv_5= 'outerAssemblyContext' ( ( ruleEString ) ) otherlv_7= 'innerRequiredRole' ( ( ruleEString ) ) otherlv_9= 'outerRequiredRole' ( ( ruleEString ) ) otherlv_11= '}' )
            // InternalCbsmDsl.g:2872:3: otherlv_0= 'RequiredDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'innerAssemblyContext' ( ( ruleEString ) ) otherlv_5= 'outerAssemblyContext' ( ( ruleEString ) ) otherlv_7= 'innerRequiredRole' ( ( ruleEString ) ) otherlv_9= 'outerRequiredRole' ( ( ruleEString ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getRequiredDelegationConnectorAccess().getRequiredDelegationConnectorKeyword_0());
            		
            // InternalCbsmDsl.g:2876:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCbsmDsl.g:2877:4: (lv_name_1_0= ruleEString )
            {
            // InternalCbsmDsl.g:2877:4: (lv_name_1_0= ruleEString )
            // InternalCbsmDsl.g:2878:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequiredDelegationConnectorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_2=(Token)match(input,12,FOLLOW_58); 

            			newLeafNode(otherlv_2, grammarAccess.getRequiredDelegationConnectorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,62,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getRequiredDelegationConnectorAccess().getInnerAssemblyContextKeyword_3());
            		
            // InternalCbsmDsl.g:2903:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:2904:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:2904:4: ( ruleEString )
            // InternalCbsmDsl.g:2905:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequiredDelegationConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRequiredDelegationConnectorAccess().getInnerAssemblyContextAssemblyContextCrossReference_4_0());
            				
            pushFollow(FOLLOW_59);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,63,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getRequiredDelegationConnectorAccess().getOuterAssemblyContextKeyword_5());
            		
            // InternalCbsmDsl.g:2923:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:2924:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:2924:4: ( ruleEString )
            // InternalCbsmDsl.g:2925:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequiredDelegationConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRequiredDelegationConnectorAccess().getOuterAssemblyContextAssemblyContextCrossReference_6_0());
            				
            pushFollow(FOLLOW_62);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,67,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getRequiredDelegationConnectorAccess().getInnerRequiredRoleKeyword_7());
            		
            // InternalCbsmDsl.g:2943:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:2944:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:2944:4: ( ruleEString )
            // InternalCbsmDsl.g:2945:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequiredDelegationConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRequiredDelegationConnectorAccess().getInnerRequiredRoleRequiredRoleCrossReference_8_0());
            				
            pushFollow(FOLLOW_63);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,68,FOLLOW_26); 

            			newLeafNode(otherlv_9, grammarAccess.getRequiredDelegationConnectorAccess().getOuterRequiredRoleKeyword_9());
            		
            // InternalCbsmDsl.g:2963:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:2964:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:2964:4: ( ruleEString )
            // InternalCbsmDsl.g:2965:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequiredDelegationConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRequiredDelegationConnectorAccess().getOuterRequiredRoleRequiredRoleCrossReference_10_0());
            				
            pushFollow(FOLLOW_11);
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
    // InternalCbsmDsl.g:2987:1: entryRuleAssemblyConnector returns [EObject current=null] : iv_ruleAssemblyConnector= ruleAssemblyConnector EOF ;
    public final EObject entryRuleAssemblyConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyConnector = null;


        try {
            // InternalCbsmDsl.g:2987:58: (iv_ruleAssemblyConnector= ruleAssemblyConnector EOF )
            // InternalCbsmDsl.g:2988:2: iv_ruleAssemblyConnector= ruleAssemblyConnector EOF
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
    // InternalCbsmDsl.g:2994:1: ruleAssemblyConnector returns [EObject current=null] : (otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'connectedProvidedRole' ( ( ruleEString ) ) otherlv_5= 'connectedRequiredRole' ( ( ruleEString ) ) otherlv_7= 'connectedProvidedAssemblyContext' ( ( ruleEString ) ) otherlv_9= 'connectedRequiredAssemblyContext' ( ( ruleEString ) ) otherlv_11= '}' ) ;
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
            // InternalCbsmDsl.g:3000:2: ( (otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'connectedProvidedRole' ( ( ruleEString ) ) otherlv_5= 'connectedRequiredRole' ( ( ruleEString ) ) otherlv_7= 'connectedProvidedAssemblyContext' ( ( ruleEString ) ) otherlv_9= 'connectedRequiredAssemblyContext' ( ( ruleEString ) ) otherlv_11= '}' ) )
            // InternalCbsmDsl.g:3001:2: (otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'connectedProvidedRole' ( ( ruleEString ) ) otherlv_5= 'connectedRequiredRole' ( ( ruleEString ) ) otherlv_7= 'connectedProvidedAssemblyContext' ( ( ruleEString ) ) otherlv_9= 'connectedRequiredAssemblyContext' ( ( ruleEString ) ) otherlv_11= '}' )
            {
            // InternalCbsmDsl.g:3001:2: (otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'connectedProvidedRole' ( ( ruleEString ) ) otherlv_5= 'connectedRequiredRole' ( ( ruleEString ) ) otherlv_7= 'connectedProvidedAssemblyContext' ( ( ruleEString ) ) otherlv_9= 'connectedRequiredAssemblyContext' ( ( ruleEString ) ) otherlv_11= '}' )
            // InternalCbsmDsl.g:3002:3: otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'connectedProvidedRole' ( ( ruleEString ) ) otherlv_5= 'connectedRequiredRole' ( ( ruleEString ) ) otherlv_7= 'connectedProvidedAssemblyContext' ( ( ruleEString ) ) otherlv_9= 'connectedRequiredAssemblyContext' ( ( ruleEString ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyConnectorAccess().getAssemblyConnectorKeyword_0());
            		
            // InternalCbsmDsl.g:3006:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCbsmDsl.g:3007:4: (lv_name_1_0= ruleEString )
            {
            // InternalCbsmDsl.g:3007:4: (lv_name_1_0= ruleEString )
            // InternalCbsmDsl.g:3008:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_2=(Token)match(input,12,FOLLOW_64); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyConnectorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,70,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getAssemblyConnectorAccess().getConnectedProvidedRoleKeyword_3());
            		
            // InternalCbsmDsl.g:3033:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:3034:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:3034:4: ( ruleEString )
            // InternalCbsmDsl.g:3035:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getConnectedProvidedRoleProvidedRoleCrossReference_4_0());
            				
            pushFollow(FOLLOW_65);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,71,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getAssemblyConnectorAccess().getConnectedRequiredRoleKeyword_5());
            		
            // InternalCbsmDsl.g:3053:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:3054:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:3054:4: ( ruleEString )
            // InternalCbsmDsl.g:3055:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getConnectedRequiredRoleRequiredRoleCrossReference_6_0());
            				
            pushFollow(FOLLOW_66);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,72,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getAssemblyConnectorAccess().getConnectedProvidedAssemblyContextKeyword_7());
            		
            // InternalCbsmDsl.g:3073:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:3074:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:3074:4: ( ruleEString )
            // InternalCbsmDsl.g:3075:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getConnectedProvidedAssemblyContextAssemblyContextCrossReference_8_0());
            				
            pushFollow(FOLLOW_67);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,73,FOLLOW_26); 

            			newLeafNode(otherlv_9, grammarAccess.getAssemblyConnectorAccess().getConnectedRequiredAssemblyContextKeyword_9());
            		
            // InternalCbsmDsl.g:3093:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:3094:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:3094:4: ( ruleEString )
            // InternalCbsmDsl.g:3095:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getConnectedRequiredAssemblyContextAssemblyContextCrossReference_10_0());
            				
            pushFollow(FOLLOW_11);
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
    // InternalCbsmDsl.g:3117:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalCbsmDsl.g:3117:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalCbsmDsl.g:3118:2: iv_ruleContainer= ruleContainer EOF
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
    // InternalCbsmDsl.g:3124:1: ruleContainer returns [EObject current=null] : ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalCbsmDsl.g:3130:2: ( ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalCbsmDsl.g:3131:2: ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalCbsmDsl.g:3131:2: ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) )
            // InternalCbsmDsl.g:3132:3: () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalCbsmDsl.g:3132:3: ()
            // InternalCbsmDsl.g:3133:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContainerAccess().getContainerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,74,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getContainerKeyword_1());
            		
            // InternalCbsmDsl.g:3143:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCbsmDsl.g:3144:4: (lv_name_2_0= ruleEString )
            {
            // InternalCbsmDsl.g:3144:4: (lv_name_2_0= ruleEString )
            // InternalCbsmDsl.g:3145:5: lv_name_2_0= ruleEString
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
    // InternalCbsmDsl.g:3166:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalCbsmDsl.g:3166:45: (iv_ruleLink= ruleLink EOF )
            // InternalCbsmDsl.g:3167:2: iv_ruleLink= ruleLink EOF
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
    // InternalCbsmDsl.g:3173:1: ruleLink returns [EObject current=null] : (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'linkedContainers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) ;
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
            // InternalCbsmDsl.g:3179:2: ( (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'linkedContainers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) )
            // InternalCbsmDsl.g:3180:2: (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'linkedContainers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            {
            // InternalCbsmDsl.g:3180:2: (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'linkedContainers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            // InternalCbsmDsl.g:3181:3: otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'linkedContainers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            // InternalCbsmDsl.g:3185:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCbsmDsl.g:3186:4: (lv_name_1_0= ruleEString )
            {
            // InternalCbsmDsl.g:3186:4: (lv_name_1_0= ruleEString )
            // InternalCbsmDsl.g:3187:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLinkAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_2=(Token)match(input,12,FOLLOW_68); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,76,FOLLOW_69); 

            			newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getLinkedContainersKeyword_3());
            		
            otherlv_4=(Token)match(input,77,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getLeftParenthesisKeyword_4());
            		
            // InternalCbsmDsl.g:3216:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:3217:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:3217:4: ( ruleEString )
            // InternalCbsmDsl.g:3218:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLinkAccess().getLinkedContainersContainerCrossReference_5_0());
            				
            pushFollow(FOLLOW_70);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCbsmDsl.g:3232:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==14) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalCbsmDsl.g:3233:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_26); 

            	    				newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalCbsmDsl.g:3237:4: ( ( ruleEString ) )
            	    // InternalCbsmDsl.g:3238:5: ( ruleEString )
            	    {
            	    // InternalCbsmDsl.g:3238:5: ( ruleEString )
            	    // InternalCbsmDsl.g:3239:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLinkRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getLinkAccess().getLinkedContainersContainerCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_70);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            otherlv_8=(Token)match(input,78,FOLLOW_11); 

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
    // InternalCbsmDsl.g:3266:1: entryRuleAllocationContext returns [EObject current=null] : iv_ruleAllocationContext= ruleAllocationContext EOF ;
    public final EObject entryRuleAllocationContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocationContext = null;


        try {
            // InternalCbsmDsl.g:3266:58: (iv_ruleAllocationContext= ruleAllocationContext EOF )
            // InternalCbsmDsl.g:3267:2: iv_ruleAllocationContext= ruleAllocationContext EOF
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
    // InternalCbsmDsl.g:3273:1: ruleAllocationContext returns [EObject current=null] : (otherlv_0= 'AllocationContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'allocatedContainer' ( ( ruleEString ) ) otherlv_5= 'allocatedAssemblyContext' ( ( ruleEString ) ) otherlv_7= '}' ) ;
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
            // InternalCbsmDsl.g:3279:2: ( (otherlv_0= 'AllocationContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'allocatedContainer' ( ( ruleEString ) ) otherlv_5= 'allocatedAssemblyContext' ( ( ruleEString ) ) otherlv_7= '}' ) )
            // InternalCbsmDsl.g:3280:2: (otherlv_0= 'AllocationContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'allocatedContainer' ( ( ruleEString ) ) otherlv_5= 'allocatedAssemblyContext' ( ( ruleEString ) ) otherlv_7= '}' )
            {
            // InternalCbsmDsl.g:3280:2: (otherlv_0= 'AllocationContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'allocatedContainer' ( ( ruleEString ) ) otherlv_5= 'allocatedAssemblyContext' ( ( ruleEString ) ) otherlv_7= '}' )
            // InternalCbsmDsl.g:3281:3: otherlv_0= 'AllocationContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'allocatedContainer' ( ( ruleEString ) ) otherlv_5= 'allocatedAssemblyContext' ( ( ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getAllocationContextAccess().getAllocationContextKeyword_0());
            		
            // InternalCbsmDsl.g:3285:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCbsmDsl.g:3286:4: (lv_name_1_0= ruleEString )
            {
            // InternalCbsmDsl.g:3286:4: (lv_name_1_0= ruleEString )
            // InternalCbsmDsl.g:3287:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAllocationContextAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_2=(Token)match(input,12,FOLLOW_71); 

            			newLeafNode(otherlv_2, grammarAccess.getAllocationContextAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,80,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getAllocationContextAccess().getAllocatedContainerKeyword_3());
            		
            // InternalCbsmDsl.g:3312:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:3313:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:3313:4: ( ruleEString )
            // InternalCbsmDsl.g:3314:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllocationContextAccess().getAllocatedContainerContainerCrossReference_4_0());
            				
            pushFollow(FOLLOW_72);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,81,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextKeyword_5());
            		
            // InternalCbsmDsl.g:3332:3: ( ( ruleEString ) )
            // InternalCbsmDsl.g:3333:4: ( ruleEString )
            {
            // InternalCbsmDsl.g:3333:4: ( ruleEString )
            // InternalCbsmDsl.g:3334:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextAssemblyContextCrossReference_6_0());
            				
            pushFollow(FOLLOW_11);
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
    // InternalCbsmDsl.g:3356:1: ruleSimpleTypeInstance returns [Enumerator current=null] : ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Int' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) ) ;
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
            // InternalCbsmDsl.g:3362:2: ( ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Int' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) ) )
            // InternalCbsmDsl.g:3363:2: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Int' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) )
            {
            // InternalCbsmDsl.g:3363:2: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Int' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) )
            int alt55=10;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt55=1;
                }
                break;
            case 83:
                {
                alt55=2;
                }
                break;
            case 84:
                {
                alt55=3;
                }
                break;
            case 85:
                {
                alt55=4;
                }
                break;
            case 86:
                {
                alt55=5;
                }
                break;
            case 87:
                {
                alt55=6;
                }
                break;
            case 88:
                {
                alt55=7;
                }
                break;
            case 89:
                {
                alt55=8;
                }
                break;
            case 90:
                {
                alt55=9;
                }
                break;
            case 91:
                {
                alt55=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalCbsmDsl.g:3364:3: (enumLiteral_0= 'Boolean' )
                    {
                    // InternalCbsmDsl.g:3364:3: (enumLiteral_0= 'Boolean' )
                    // InternalCbsmDsl.g:3365:4: enumLiteral_0= 'Boolean'
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeInstanceAccess().getBooleanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSimpleTypeInstanceAccess().getBooleanEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCbsmDsl.g:3372:3: (enumLiteral_1= 'Char' )
                    {
                    // InternalCbsmDsl.g:3372:3: (enumLiteral_1= 'Char' )
                    // InternalCbsmDsl.g:3373:4: enumLiteral_1= 'Char'
                    {
                    enumLiteral_1=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeInstanceAccess().getCharEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSimpleTypeInstanceAccess().getCharEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCbsmDsl.g:3380:3: (enumLiteral_2= 'Date' )
                    {
                    // InternalCbsmDsl.g:3380:3: (enumLiteral_2= 'Date' )
                    // InternalCbsmDsl.g:3381:4: enumLiteral_2= 'Date'
                    {
                    enumLiteral_2=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeInstanceAccess().getDateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSimpleTypeInstanceAccess().getDateEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCbsmDsl.g:3388:3: (enumLiteral_3= 'Double' )
                    {
                    // InternalCbsmDsl.g:3388:3: (enumLiteral_3= 'Double' )
                    // InternalCbsmDsl.g:3389:4: enumLiteral_3= 'Double'
                    {
                    enumLiteral_3=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeInstanceAccess().getDoubleEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSimpleTypeInstanceAccess().getDoubleEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCbsmDsl.g:3396:3: (enumLiteral_4= 'Float' )
                    {
                    // InternalCbsmDsl.g:3396:3: (enumLiteral_4= 'Float' )
                    // InternalCbsmDsl.g:3397:4: enumLiteral_4= 'Float'
                    {
                    enumLiteral_4=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeInstanceAccess().getFloatEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSimpleTypeInstanceAccess().getFloatEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalCbsmDsl.g:3404:3: (enumLiteral_5= 'List' )
                    {
                    // InternalCbsmDsl.g:3404:3: (enumLiteral_5= 'List' )
                    // InternalCbsmDsl.g:3405:4: enumLiteral_5= 'List'
                    {
                    enumLiteral_5=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeInstanceAccess().getListEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSimpleTypeInstanceAccess().getListEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalCbsmDsl.g:3412:3: (enumLiteral_6= 'Int' )
                    {
                    // InternalCbsmDsl.g:3412:3: (enumLiteral_6= 'Int' )
                    // InternalCbsmDsl.g:3413:4: enumLiteral_6= 'Int'
                    {
                    enumLiteral_6=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeInstanceAccess().getIntEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getSimpleTypeInstanceAccess().getIntEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalCbsmDsl.g:3420:3: (enumLiteral_7= 'Long' )
                    {
                    // InternalCbsmDsl.g:3420:3: (enumLiteral_7= 'Long' )
                    // InternalCbsmDsl.g:3421:4: enumLiteral_7= 'Long'
                    {
                    enumLiteral_7=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeInstanceAccess().getLongEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getSimpleTypeInstanceAccess().getLongEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalCbsmDsl.g:3428:3: (enumLiteral_8= 'Map' )
                    {
                    // InternalCbsmDsl.g:3428:3: (enumLiteral_8= 'Map' )
                    // InternalCbsmDsl.g:3429:4: enumLiteral_8= 'Map'
                    {
                    enumLiteral_8=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeInstanceAccess().getMapEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getSimpleTypeInstanceAccess().getMapEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalCbsmDsl.g:3436:3: (enumLiteral_9= 'String' )
                    {
                    // InternalCbsmDsl.g:3436:3: (enumLiteral_9= 'String' )
                    // InternalCbsmDsl.g:3437:4: enumLiteral_9= 'String'
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000003A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000788000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000708000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000608000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000003008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080188000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080108000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000600008000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400008000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000008000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0014C80000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000300000008000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000200000008000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0001300000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001200000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0008300000008000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0008200000008000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0008000000008000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0020300000008000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0020200000008000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0020000000008000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0080000000008000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x000000000FFC0000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000004000L,0x0000000000004000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});

}