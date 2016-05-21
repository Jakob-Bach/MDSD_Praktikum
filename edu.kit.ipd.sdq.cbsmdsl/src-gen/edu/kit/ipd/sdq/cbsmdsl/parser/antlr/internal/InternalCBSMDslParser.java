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
import edu.kit.ipd.sdq.cbsmdsl.services.CBSMDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCBSMDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CompleteArchitecture'", "'{'", "'repository'", "'system'", "'environment'", "'allocation'", "'}'", "'Repository'", "'interfaces'", "','", "'components'", "'dataTypes'", "'System'", "'providedRoles'", "'requiredRoles'", "'containedAssemblyContexts'", "'systemConnectors'", "'Environment'", "'containers'", "'links'", "'Allocation'", "'allocationContexts'", "'Interface'", "'signatures'", "'Component'", "'behaviorDescription'", "'Signature'", "'returnType'", "'parameters'", "'Parameter'", "'type'", "'ProvidedRole'", "'providedInterface'", "'RequiredRole'", "'requiredInterface'", "'BehaviorDescription'", "'actions'", "'Action'", "'predecessor'", "'successor'", "'InternalAction'", "'ExternalCall'", "'requiredService'", "'requiredRoleOfService'", "'Loop'", "'loopActions'", "'Branch'", "'branchPaths'", "'BranchPath'", "'pathActions'", "'ComplexType'", "'SimpleType'", "'typeInstance'", "'AssemblyContext'", "'instantiatedComponent'", "'ProvidedDelegationConnector'", "'innerAssemblyContext'", "'outerAssemblyContext'", "'innerProvidedRole'", "'outerProvidedRole'", "'RequiredDelegationConnector'", "'innerRequiredRole'", "'outerRequiredRole'", "'AssemblyConnector'", "'connectedProvidedRole'", "'connectedRequiredRole'", "'connectedProvidedAssemblyContext'", "'connectedRequiredAssemblyContext'", "'Container'", "'Link'", "'linkedContainers'", "'('", "')'", "'AllocationContext'", "'allocatedContainer'", "'allocatedAssemblyContext'", "'Boolean'", "'Char'", "'Date'", "'Double'", "'Float'", "'List'", "'Int'", "'Long'", "'Map'", "'String'"
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
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
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
    public static final int T__95=95;
    public static final int T__96=96;
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


        public InternalCBSMDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCBSMDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCBSMDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCBSMDsl.g"; }



     	private CBSMDslGrammarAccess grammarAccess;

        public InternalCBSMDslParser(TokenStream input, CBSMDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "CompleteArchitecture";
       	}

       	@Override
       	protected CBSMDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCompleteArchitecture"
    // InternalCBSMDsl.g:65:1: entryRuleCompleteArchitecture returns [EObject current=null] : iv_ruleCompleteArchitecture= ruleCompleteArchitecture EOF ;
    public final EObject entryRuleCompleteArchitecture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompleteArchitecture = null;


        try {
            // InternalCBSMDsl.g:65:61: (iv_ruleCompleteArchitecture= ruleCompleteArchitecture EOF )
            // InternalCBSMDsl.g:66:2: iv_ruleCompleteArchitecture= ruleCompleteArchitecture EOF
            {
             newCompositeNode(grammarAccess.getCompleteArchitectureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompleteArchitecture=ruleCompleteArchitecture();

            state._fsp--;

             current =iv_ruleCompleteArchitecture; 
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
    // $ANTLR end "entryRuleCompleteArchitecture"


    // $ANTLR start "ruleCompleteArchitecture"
    // InternalCBSMDsl.g:72:1: ruleCompleteArchitecture returns [EObject current=null] : (otherlv_0= 'CompleteArchitecture' otherlv_1= '{' otherlv_2= 'repository' ( (lv_repository_3_0= ruleRepository ) ) otherlv_4= 'system' ( (lv_system_5_0= ruleSystem ) ) otherlv_6= 'environment' ( (lv_environment_7_0= ruleEnvironment ) ) otherlv_8= 'allocation' ( (lv_allocation_9_0= ruleAllocation ) ) otherlv_10= '}' ) ;
    public final EObject ruleCompleteArchitecture() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_repository_3_0 = null;

        EObject lv_system_5_0 = null;

        EObject lv_environment_7_0 = null;

        EObject lv_allocation_9_0 = null;



        	enterRule();

        try {
            // InternalCBSMDsl.g:78:2: ( (otherlv_0= 'CompleteArchitecture' otherlv_1= '{' otherlv_2= 'repository' ( (lv_repository_3_0= ruleRepository ) ) otherlv_4= 'system' ( (lv_system_5_0= ruleSystem ) ) otherlv_6= 'environment' ( (lv_environment_7_0= ruleEnvironment ) ) otherlv_8= 'allocation' ( (lv_allocation_9_0= ruleAllocation ) ) otherlv_10= '}' ) )
            // InternalCBSMDsl.g:79:2: (otherlv_0= 'CompleteArchitecture' otherlv_1= '{' otherlv_2= 'repository' ( (lv_repository_3_0= ruleRepository ) ) otherlv_4= 'system' ( (lv_system_5_0= ruleSystem ) ) otherlv_6= 'environment' ( (lv_environment_7_0= ruleEnvironment ) ) otherlv_8= 'allocation' ( (lv_allocation_9_0= ruleAllocation ) ) otherlv_10= '}' )
            {
            // InternalCBSMDsl.g:79:2: (otherlv_0= 'CompleteArchitecture' otherlv_1= '{' otherlv_2= 'repository' ( (lv_repository_3_0= ruleRepository ) ) otherlv_4= 'system' ( (lv_system_5_0= ruleSystem ) ) otherlv_6= 'environment' ( (lv_environment_7_0= ruleEnvironment ) ) otherlv_8= 'allocation' ( (lv_allocation_9_0= ruleAllocation ) ) otherlv_10= '}' )
            // InternalCBSMDsl.g:80:3: otherlv_0= 'CompleteArchitecture' otherlv_1= '{' otherlv_2= 'repository' ( (lv_repository_3_0= ruleRepository ) ) otherlv_4= 'system' ( (lv_system_5_0= ruleSystem ) ) otherlv_6= 'environment' ( (lv_environment_7_0= ruleEnvironment ) ) otherlv_8= 'allocation' ( (lv_allocation_9_0= ruleAllocation ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCompleteArchitectureAccess().getCompleteArchitectureKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCompleteArchitectureAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getCompleteArchitectureAccess().getRepositoryKeyword_2());
            		
            // InternalCBSMDsl.g:92:3: ( (lv_repository_3_0= ruleRepository ) )
            // InternalCBSMDsl.g:93:4: (lv_repository_3_0= ruleRepository )
            {
            // InternalCBSMDsl.g:93:4: (lv_repository_3_0= ruleRepository )
            // InternalCBSMDsl.g:94:5: lv_repository_3_0= ruleRepository
            {

            					newCompositeNode(grammarAccess.getCompleteArchitectureAccess().getRepositoryRepositoryParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_repository_3_0=ruleRepository();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompleteArchitectureRule());
            					}
            					set(
            						current,
            						"repository",
            						lv_repository_3_0,
            						"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.Repository");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getCompleteArchitectureAccess().getSystemKeyword_4());
            		
            // InternalCBSMDsl.g:115:3: ( (lv_system_5_0= ruleSystem ) )
            // InternalCBSMDsl.g:116:4: (lv_system_5_0= ruleSystem )
            {
            // InternalCBSMDsl.g:116:4: (lv_system_5_0= ruleSystem )
            // InternalCBSMDsl.g:117:5: lv_system_5_0= ruleSystem
            {

            					newCompositeNode(grammarAccess.getCompleteArchitectureAccess().getSystemSystemParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_system_5_0=ruleSystem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompleteArchitectureRule());
            					}
            					set(
            						current,
            						"system",
            						lv_system_5_0,
            						"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.System");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getCompleteArchitectureAccess().getEnvironmentKeyword_6());
            		
            // InternalCBSMDsl.g:138:3: ( (lv_environment_7_0= ruleEnvironment ) )
            // InternalCBSMDsl.g:139:4: (lv_environment_7_0= ruleEnvironment )
            {
            // InternalCBSMDsl.g:139:4: (lv_environment_7_0= ruleEnvironment )
            // InternalCBSMDsl.g:140:5: lv_environment_7_0= ruleEnvironment
            {

            					newCompositeNode(grammarAccess.getCompleteArchitectureAccess().getEnvironmentEnvironmentParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_10);
            lv_environment_7_0=ruleEnvironment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompleteArchitectureRule());
            					}
            					set(
            						current,
            						"environment",
            						lv_environment_7_0,
            						"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.Environment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getCompleteArchitectureAccess().getAllocationKeyword_8());
            		
            // InternalCBSMDsl.g:161:3: ( (lv_allocation_9_0= ruleAllocation ) )
            // InternalCBSMDsl.g:162:4: (lv_allocation_9_0= ruleAllocation )
            {
            // InternalCBSMDsl.g:162:4: (lv_allocation_9_0= ruleAllocation )
            // InternalCBSMDsl.g:163:5: lv_allocation_9_0= ruleAllocation
            {

            					newCompositeNode(grammarAccess.getCompleteArchitectureAccess().getAllocationAllocationParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_12);
            lv_allocation_9_0=ruleAllocation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompleteArchitectureRule());
            					}
            					set(
            						current,
            						"allocation",
            						lv_allocation_9_0,
            						"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.Allocation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getCompleteArchitectureAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleCompleteArchitecture"


    // $ANTLR start "entryRuleDataType"
    // InternalCBSMDsl.g:188:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalCBSMDsl.g:188:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalCBSMDsl.g:189:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalCBSMDsl.g:195:1: ruleDataType returns [EObject current=null] : (this_ComplexType_0= ruleComplexType | this_SimpleType_1= ruleSimpleType ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        EObject this_ComplexType_0 = null;

        EObject this_SimpleType_1 = null;



        	enterRule();

        try {
            // InternalCBSMDsl.g:201:2: ( (this_ComplexType_0= ruleComplexType | this_SimpleType_1= ruleSimpleType ) )
            // InternalCBSMDsl.g:202:2: (this_ComplexType_0= ruleComplexType | this_SimpleType_1= ruleSimpleType )
            {
            // InternalCBSMDsl.g:202:2: (this_ComplexType_0= ruleComplexType | this_SimpleType_1= ruleSimpleType )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==61) ) {
                alt1=1;
            }
            else if ( (LA1_0==62) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalCBSMDsl.g:203:3: this_ComplexType_0= ruleComplexType
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
                    // InternalCBSMDsl.g:212:3: this_SimpleType_1= ruleSimpleType
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
    // InternalCBSMDsl.g:224:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // InternalCBSMDsl.g:224:50: (iv_ruleConnector= ruleConnector EOF )
            // InternalCBSMDsl.g:225:2: iv_ruleConnector= ruleConnector EOF
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
    // InternalCBSMDsl.g:231:1: ruleConnector returns [EObject current=null] : (this_ProvidedDelegationConnector_0= ruleProvidedDelegationConnector | this_RequiredDelegationConnector_1= ruleRequiredDelegationConnector | this_AssemblyConnector_2= ruleAssemblyConnector ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        EObject this_ProvidedDelegationConnector_0 = null;

        EObject this_RequiredDelegationConnector_1 = null;

        EObject this_AssemblyConnector_2 = null;



        	enterRule();

        try {
            // InternalCBSMDsl.g:237:2: ( (this_ProvidedDelegationConnector_0= ruleProvidedDelegationConnector | this_RequiredDelegationConnector_1= ruleRequiredDelegationConnector | this_AssemblyConnector_2= ruleAssemblyConnector ) )
            // InternalCBSMDsl.g:238:2: (this_ProvidedDelegationConnector_0= ruleProvidedDelegationConnector | this_RequiredDelegationConnector_1= ruleRequiredDelegationConnector | this_AssemblyConnector_2= ruleAssemblyConnector )
            {
            // InternalCBSMDsl.g:238:2: (this_ProvidedDelegationConnector_0= ruleProvidedDelegationConnector | this_RequiredDelegationConnector_1= ruleRequiredDelegationConnector | this_AssemblyConnector_2= ruleAssemblyConnector )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt2=1;
                }
                break;
            case 71:
                {
                alt2=2;
                }
                break;
            case 74:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCBSMDsl.g:239:3: this_ProvidedDelegationConnector_0= ruleProvidedDelegationConnector
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
                    // InternalCBSMDsl.g:248:3: this_RequiredDelegationConnector_1= ruleRequiredDelegationConnector
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
                    // InternalCBSMDsl.g:257:3: this_AssemblyConnector_2= ruleAssemblyConnector
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
    // InternalCBSMDsl.g:269:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalCBSMDsl.g:269:47: (iv_ruleAction= ruleAction EOF )
            // InternalCBSMDsl.g:270:2: iv_ruleAction= ruleAction EOF
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
    // InternalCBSMDsl.g:276:1: ruleAction returns [EObject current=null] : (this_Action_Impl_0= ruleAction_Impl | this_InternalAction_1= ruleInternalAction | this_ExternalCall_2= ruleExternalCall | this_Loop_3= ruleLoop | this_Branch_4= ruleBranch ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Action_Impl_0 = null;

        EObject this_InternalAction_1 = null;

        EObject this_ExternalCall_2 = null;

        EObject this_Loop_3 = null;

        EObject this_Branch_4 = null;



        	enterRule();

        try {
            // InternalCBSMDsl.g:282:2: ( (this_Action_Impl_0= ruleAction_Impl | this_InternalAction_1= ruleInternalAction | this_ExternalCall_2= ruleExternalCall | this_Loop_3= ruleLoop | this_Branch_4= ruleBranch ) )
            // InternalCBSMDsl.g:283:2: (this_Action_Impl_0= ruleAction_Impl | this_InternalAction_1= ruleInternalAction | this_ExternalCall_2= ruleExternalCall | this_Loop_3= ruleLoop | this_Branch_4= ruleBranch )
            {
            // InternalCBSMDsl.g:283:2: (this_Action_Impl_0= ruleAction_Impl | this_InternalAction_1= ruleInternalAction | this_ExternalCall_2= ruleExternalCall | this_Loop_3= ruleLoop | this_Branch_4= ruleBranch )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt3=1;
                }
                break;
            case 51:
                {
                alt3=2;
                }
                break;
            case 52:
                {
                alt3=3;
                }
                break;
            case 55:
                {
                alt3=4;
                }
                break;
            case 57:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalCBSMDsl.g:284:3: this_Action_Impl_0= ruleAction_Impl
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
                    // InternalCBSMDsl.g:293:3: this_InternalAction_1= ruleInternalAction
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
                    // InternalCBSMDsl.g:302:3: this_ExternalCall_2= ruleExternalCall
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
                    // InternalCBSMDsl.g:311:3: this_Loop_3= ruleLoop
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
                    // InternalCBSMDsl.g:320:3: this_Branch_4= ruleBranch
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
    // InternalCBSMDsl.g:332:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // InternalCBSMDsl.g:332:51: (iv_ruleRepository= ruleRepository EOF )
            // InternalCBSMDsl.g:333:2: iv_ruleRepository= ruleRepository EOF
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
    // InternalCBSMDsl.g:339:1: ruleRepository returns [EObject current=null] : ( () otherlv_1= 'Repository' otherlv_2= '{' (otherlv_3= 'interfaces' otherlv_4= '{' ( (lv_interfaces_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) ) )* otherlv_8= '}' )? (otherlv_9= 'components' otherlv_10= '{' ( (lv_components_11_0= ruleComponent ) ) (otherlv_12= ',' ( (lv_components_13_0= ruleComponent ) ) )* otherlv_14= '}' )? (otherlv_15= 'dataTypes' otherlv_16= '{' ( (lv_dataTypes_17_0= ruleDataType ) ) (otherlv_18= ',' ( (lv_dataTypes_19_0= ruleDataType ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
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
            // InternalCBSMDsl.g:345:2: ( ( () otherlv_1= 'Repository' otherlv_2= '{' (otherlv_3= 'interfaces' otherlv_4= '{' ( (lv_interfaces_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) ) )* otherlv_8= '}' )? (otherlv_9= 'components' otherlv_10= '{' ( (lv_components_11_0= ruleComponent ) ) (otherlv_12= ',' ( (lv_components_13_0= ruleComponent ) ) )* otherlv_14= '}' )? (otherlv_15= 'dataTypes' otherlv_16= '{' ( (lv_dataTypes_17_0= ruleDataType ) ) (otherlv_18= ',' ( (lv_dataTypes_19_0= ruleDataType ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalCBSMDsl.g:346:2: ( () otherlv_1= 'Repository' otherlv_2= '{' (otherlv_3= 'interfaces' otherlv_4= '{' ( (lv_interfaces_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) ) )* otherlv_8= '}' )? (otherlv_9= 'components' otherlv_10= '{' ( (lv_components_11_0= ruleComponent ) ) (otherlv_12= ',' ( (lv_components_13_0= ruleComponent ) ) )* otherlv_14= '}' )? (otherlv_15= 'dataTypes' otherlv_16= '{' ( (lv_dataTypes_17_0= ruleDataType ) ) (otherlv_18= ',' ( (lv_dataTypes_19_0= ruleDataType ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalCBSMDsl.g:346:2: ( () otherlv_1= 'Repository' otherlv_2= '{' (otherlv_3= 'interfaces' otherlv_4= '{' ( (lv_interfaces_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) ) )* otherlv_8= '}' )? (otherlv_9= 'components' otherlv_10= '{' ( (lv_components_11_0= ruleComponent ) ) (otherlv_12= ',' ( (lv_components_13_0= ruleComponent ) ) )* otherlv_14= '}' )? (otherlv_15= 'dataTypes' otherlv_16= '{' ( (lv_dataTypes_17_0= ruleDataType ) ) (otherlv_18= ',' ( (lv_dataTypes_19_0= ruleDataType ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // InternalCBSMDsl.g:347:3: () otherlv_1= 'Repository' otherlv_2= '{' (otherlv_3= 'interfaces' otherlv_4= '{' ( (lv_interfaces_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) ) )* otherlv_8= '}' )? (otherlv_9= 'components' otherlv_10= '{' ( (lv_components_11_0= ruleComponent ) ) (otherlv_12= ',' ( (lv_components_13_0= ruleComponent ) ) )* otherlv_14= '}' )? (otherlv_15= 'dataTypes' otherlv_16= '{' ( (lv_dataTypes_17_0= ruleDataType ) ) (otherlv_18= ',' ( (lv_dataTypes_19_0= ruleDataType ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // InternalCBSMDsl.g:347:3: ()
            // InternalCBSMDsl.g:348:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRepositoryAccess().getRepositoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRepositoryAccess().getRepositoryKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCBSMDsl.g:362:3: (otherlv_3= 'interfaces' otherlv_4= '{' ( (lv_interfaces_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) ) )* otherlv_8= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCBSMDsl.g:363:4: otherlv_3= 'interfaces' otherlv_4= '{' ( (lv_interfaces_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRepositoryAccess().getInterfacesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalCBSMDsl.g:371:4: ( (lv_interfaces_5_0= ruleInterface ) )
                    // InternalCBSMDsl.g:372:5: (lv_interfaces_5_0= ruleInterface )
                    {
                    // InternalCBSMDsl.g:372:5: (lv_interfaces_5_0= ruleInterface )
                    // InternalCBSMDsl.g:373:6: lv_interfaces_5_0= ruleInterface
                    {

                    						newCompositeNode(grammarAccess.getRepositoryAccess().getInterfacesInterfaceParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_interfaces_5_0=ruleInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    						}
                    						add(
                    							current,
                    							"interfaces",
                    							lv_interfaces_5_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.Interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBSMDsl.g:390:4: (otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==20) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalCBSMDsl.g:391:5: otherlv_6= ',' ( (lv_interfaces_7_0= ruleInterface ) )
                    	    {
                    	    otherlv_6=(Token)match(input,20,FOLLOW_14); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRepositoryAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalCBSMDsl.g:395:5: ( (lv_interfaces_7_0= ruleInterface ) )
                    	    // InternalCBSMDsl.g:396:6: (lv_interfaces_7_0= ruleInterface )
                    	    {
                    	    // InternalCBSMDsl.g:396:6: (lv_interfaces_7_0= ruleInterface )
                    	    // InternalCBSMDsl.g:397:7: lv_interfaces_7_0= ruleInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepositoryAccess().getInterfacesInterfaceParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_interfaces_7_0=ruleInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interfaces",
                    	    								lv_interfaces_7_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.Interface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalCBSMDsl.g:420:3: (otherlv_9= 'components' otherlv_10= '{' ( (lv_components_11_0= ruleComponent ) ) (otherlv_12= ',' ( (lv_components_13_0= ruleComponent ) ) )* otherlv_14= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCBSMDsl.g:421:4: otherlv_9= 'components' otherlv_10= '{' ( (lv_components_11_0= ruleComponent ) ) (otherlv_12= ',' ( (lv_components_13_0= ruleComponent ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getRepositoryAccess().getComponentsKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_10, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCBSMDsl.g:429:4: ( (lv_components_11_0= ruleComponent ) )
                    // InternalCBSMDsl.g:430:5: (lv_components_11_0= ruleComponent )
                    {
                    // InternalCBSMDsl.g:430:5: (lv_components_11_0= ruleComponent )
                    // InternalCBSMDsl.g:431:6: lv_components_11_0= ruleComponent
                    {

                    						newCompositeNode(grammarAccess.getRepositoryAccess().getComponentsComponentParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_components_11_0=ruleComponent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    						}
                    						add(
                    							current,
                    							"components",
                    							lv_components_11_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.Component");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBSMDsl.g:448:4: (otherlv_12= ',' ( (lv_components_13_0= ruleComponent ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==20) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalCBSMDsl.g:449:5: otherlv_12= ',' ( (lv_components_13_0= ruleComponent ) )
                    	    {
                    	    otherlv_12=(Token)match(input,20,FOLLOW_17); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getRepositoryAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCBSMDsl.g:453:5: ( (lv_components_13_0= ruleComponent ) )
                    	    // InternalCBSMDsl.g:454:6: (lv_components_13_0= ruleComponent )
                    	    {
                    	    // InternalCBSMDsl.g:454:6: (lv_components_13_0= ruleComponent )
                    	    // InternalCBSMDsl.g:455:7: lv_components_13_0= ruleComponent
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepositoryAccess().getComponentsComponentParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_components_13_0=ruleComponent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"components",
                    	    								lv_components_13_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.Component");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,17,FOLLOW_18); 

                    				newLeafNode(otherlv_14, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalCBSMDsl.g:478:3: (otherlv_15= 'dataTypes' otherlv_16= '{' ( (lv_dataTypes_17_0= ruleDataType ) ) (otherlv_18= ',' ( (lv_dataTypes_19_0= ruleDataType ) ) )* otherlv_20= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCBSMDsl.g:479:4: otherlv_15= 'dataTypes' otherlv_16= '{' ( (lv_dataTypes_17_0= ruleDataType ) ) (otherlv_18= ',' ( (lv_dataTypes_19_0= ruleDataType ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getRepositoryAccess().getDataTypesKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_16, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCBSMDsl.g:487:4: ( (lv_dataTypes_17_0= ruleDataType ) )
                    // InternalCBSMDsl.g:488:5: (lv_dataTypes_17_0= ruleDataType )
                    {
                    // InternalCBSMDsl.g:488:5: (lv_dataTypes_17_0= ruleDataType )
                    // InternalCBSMDsl.g:489:6: lv_dataTypes_17_0= ruleDataType
                    {

                    						newCompositeNode(grammarAccess.getRepositoryAccess().getDataTypesDataTypeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_dataTypes_17_0=ruleDataType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    						}
                    						add(
                    							current,
                    							"dataTypes",
                    							lv_dataTypes_17_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.DataType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBSMDsl.g:506:4: (otherlv_18= ',' ( (lv_dataTypes_19_0= ruleDataType ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==20) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalCBSMDsl.g:507:5: otherlv_18= ',' ( (lv_dataTypes_19_0= ruleDataType ) )
                    	    {
                    	    otherlv_18=(Token)match(input,20,FOLLOW_19); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getRepositoryAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCBSMDsl.g:511:5: ( (lv_dataTypes_19_0= ruleDataType ) )
                    	    // InternalCBSMDsl.g:512:6: (lv_dataTypes_19_0= ruleDataType )
                    	    {
                    	    // InternalCBSMDsl.g:512:6: (lv_dataTypes_19_0= ruleDataType )
                    	    // InternalCBSMDsl.g:513:7: lv_dataTypes_19_0= ruleDataType
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepositoryAccess().getDataTypesDataTypeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_dataTypes_19_0=ruleDataType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"dataTypes",
                    	    								lv_dataTypes_19_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.DataType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_20, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,17,FOLLOW_2); 

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
    // InternalCBSMDsl.g:544:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalCBSMDsl.g:544:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalCBSMDsl.g:545:2: iv_ruleSystem= ruleSystem EOF
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
    // InternalCBSMDsl.g:551:1: ruleSystem returns [EObject current=null] : ( () otherlv_1= 'System' otherlv_2= '{' (otherlv_3= 'providedRoles' otherlv_4= '{' ( (lv_providedRoles_5_0= ruleProvidedRole ) ) (otherlv_6= ',' ( (lv_providedRoles_7_0= ruleProvidedRole ) ) )* otherlv_8= '}' )? (otherlv_9= 'requiredRoles' otherlv_10= '{' ( (lv_requiredRoles_11_0= ruleRequiredRole ) ) (otherlv_12= ',' ( (lv_requiredRoles_13_0= ruleRequiredRole ) ) )* otherlv_14= '}' )? (otherlv_15= 'containedAssemblyContexts' otherlv_16= '{' ( (lv_containedAssemblyContexts_17_0= ruleAssemblyContext ) ) (otherlv_18= ',' ( (lv_containedAssemblyContexts_19_0= ruleAssemblyContext ) ) )* otherlv_20= '}' )? (otherlv_21= 'systemConnectors' otherlv_22= '{' ( (lv_systemConnectors_23_0= ruleConnector ) ) (otherlv_24= ',' ( (lv_systemConnectors_25_0= ruleConnector ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
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
            // InternalCBSMDsl.g:557:2: ( ( () otherlv_1= 'System' otherlv_2= '{' (otherlv_3= 'providedRoles' otherlv_4= '{' ( (lv_providedRoles_5_0= ruleProvidedRole ) ) (otherlv_6= ',' ( (lv_providedRoles_7_0= ruleProvidedRole ) ) )* otherlv_8= '}' )? (otherlv_9= 'requiredRoles' otherlv_10= '{' ( (lv_requiredRoles_11_0= ruleRequiredRole ) ) (otherlv_12= ',' ( (lv_requiredRoles_13_0= ruleRequiredRole ) ) )* otherlv_14= '}' )? (otherlv_15= 'containedAssemblyContexts' otherlv_16= '{' ( (lv_containedAssemblyContexts_17_0= ruleAssemblyContext ) ) (otherlv_18= ',' ( (lv_containedAssemblyContexts_19_0= ruleAssemblyContext ) ) )* otherlv_20= '}' )? (otherlv_21= 'systemConnectors' otherlv_22= '{' ( (lv_systemConnectors_23_0= ruleConnector ) ) (otherlv_24= ',' ( (lv_systemConnectors_25_0= ruleConnector ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // InternalCBSMDsl.g:558:2: ( () otherlv_1= 'System' otherlv_2= '{' (otherlv_3= 'providedRoles' otherlv_4= '{' ( (lv_providedRoles_5_0= ruleProvidedRole ) ) (otherlv_6= ',' ( (lv_providedRoles_7_0= ruleProvidedRole ) ) )* otherlv_8= '}' )? (otherlv_9= 'requiredRoles' otherlv_10= '{' ( (lv_requiredRoles_11_0= ruleRequiredRole ) ) (otherlv_12= ',' ( (lv_requiredRoles_13_0= ruleRequiredRole ) ) )* otherlv_14= '}' )? (otherlv_15= 'containedAssemblyContexts' otherlv_16= '{' ( (lv_containedAssemblyContexts_17_0= ruleAssemblyContext ) ) (otherlv_18= ',' ( (lv_containedAssemblyContexts_19_0= ruleAssemblyContext ) ) )* otherlv_20= '}' )? (otherlv_21= 'systemConnectors' otherlv_22= '{' ( (lv_systemConnectors_23_0= ruleConnector ) ) (otherlv_24= ',' ( (lv_systemConnectors_25_0= ruleConnector ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // InternalCBSMDsl.g:558:2: ( () otherlv_1= 'System' otherlv_2= '{' (otherlv_3= 'providedRoles' otherlv_4= '{' ( (lv_providedRoles_5_0= ruleProvidedRole ) ) (otherlv_6= ',' ( (lv_providedRoles_7_0= ruleProvidedRole ) ) )* otherlv_8= '}' )? (otherlv_9= 'requiredRoles' otherlv_10= '{' ( (lv_requiredRoles_11_0= ruleRequiredRole ) ) (otherlv_12= ',' ( (lv_requiredRoles_13_0= ruleRequiredRole ) ) )* otherlv_14= '}' )? (otherlv_15= 'containedAssemblyContexts' otherlv_16= '{' ( (lv_containedAssemblyContexts_17_0= ruleAssemblyContext ) ) (otherlv_18= ',' ( (lv_containedAssemblyContexts_19_0= ruleAssemblyContext ) ) )* otherlv_20= '}' )? (otherlv_21= 'systemConnectors' otherlv_22= '{' ( (lv_systemConnectors_23_0= ruleConnector ) ) (otherlv_24= ',' ( (lv_systemConnectors_25_0= ruleConnector ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // InternalCBSMDsl.g:559:3: () otherlv_1= 'System' otherlv_2= '{' (otherlv_3= 'providedRoles' otherlv_4= '{' ( (lv_providedRoles_5_0= ruleProvidedRole ) ) (otherlv_6= ',' ( (lv_providedRoles_7_0= ruleProvidedRole ) ) )* otherlv_8= '}' )? (otherlv_9= 'requiredRoles' otherlv_10= '{' ( (lv_requiredRoles_11_0= ruleRequiredRole ) ) (otherlv_12= ',' ( (lv_requiredRoles_13_0= ruleRequiredRole ) ) )* otherlv_14= '}' )? (otherlv_15= 'containedAssemblyContexts' otherlv_16= '{' ( (lv_containedAssemblyContexts_17_0= ruleAssemblyContext ) ) (otherlv_18= ',' ( (lv_containedAssemblyContexts_19_0= ruleAssemblyContext ) ) )* otherlv_20= '}' )? (otherlv_21= 'systemConnectors' otherlv_22= '{' ( (lv_systemConnectors_23_0= ruleConnector ) ) (otherlv_24= ',' ( (lv_systemConnectors_25_0= ruleConnector ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            // InternalCBSMDsl.g:559:3: ()
            // InternalCBSMDsl.g:560:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSystemAccess().getSystemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemAccess().getSystemKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCBSMDsl.g:574:3: (otherlv_3= 'providedRoles' otherlv_4= '{' ( (lv_providedRoles_5_0= ruleProvidedRole ) ) (otherlv_6= ',' ( (lv_providedRoles_7_0= ruleProvidedRole ) ) )* otherlv_8= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCBSMDsl.g:575:4: otherlv_3= 'providedRoles' otherlv_4= '{' ( (lv_providedRoles_5_0= ruleProvidedRole ) ) (otherlv_6= ',' ( (lv_providedRoles_7_0= ruleProvidedRole ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getProvidedRolesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalCBSMDsl.g:583:4: ( (lv_providedRoles_5_0= ruleProvidedRole ) )
                    // InternalCBSMDsl.g:584:5: (lv_providedRoles_5_0= ruleProvidedRole )
                    {
                    // InternalCBSMDsl.g:584:5: (lv_providedRoles_5_0= ruleProvidedRole )
                    // InternalCBSMDsl.g:585:6: lv_providedRoles_5_0= ruleProvidedRole
                    {

                    						newCompositeNode(grammarAccess.getSystemAccess().getProvidedRolesProvidedRoleParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_providedRoles_5_0=ruleProvidedRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemRule());
                    						}
                    						add(
                    							current,
                    							"providedRoles",
                    							lv_providedRoles_5_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.ProvidedRole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBSMDsl.g:602:4: (otherlv_6= ',' ( (lv_providedRoles_7_0= ruleProvidedRole ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==20) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalCBSMDsl.g:603:5: otherlv_6= ',' ( (lv_providedRoles_7_0= ruleProvidedRole ) )
                    	    {
                    	    otherlv_6=(Token)match(input,20,FOLLOW_21); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getSystemAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalCBSMDsl.g:607:5: ( (lv_providedRoles_7_0= ruleProvidedRole ) )
                    	    // InternalCBSMDsl.g:608:6: (lv_providedRoles_7_0= ruleProvidedRole )
                    	    {
                    	    // InternalCBSMDsl.g:608:6: (lv_providedRoles_7_0= ruleProvidedRole )
                    	    // InternalCBSMDsl.g:609:7: lv_providedRoles_7_0= ruleProvidedRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemAccess().getProvidedRolesProvidedRoleParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_providedRoles_7_0=ruleProvidedRole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"providedRoles",
                    	    								lv_providedRoles_7_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.ProvidedRole");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_22); 

                    				newLeafNode(otherlv_8, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalCBSMDsl.g:632:3: (otherlv_9= 'requiredRoles' otherlv_10= '{' ( (lv_requiredRoles_11_0= ruleRequiredRole ) ) (otherlv_12= ',' ( (lv_requiredRoles_13_0= ruleRequiredRole ) ) )* otherlv_14= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCBSMDsl.g:633:4: otherlv_9= 'requiredRoles' otherlv_10= '{' ( (lv_requiredRoles_11_0= ruleRequiredRole ) ) (otherlv_12= ',' ( (lv_requiredRoles_13_0= ruleRequiredRole ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getSystemAccess().getRequiredRolesKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_10, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCBSMDsl.g:641:4: ( (lv_requiredRoles_11_0= ruleRequiredRole ) )
                    // InternalCBSMDsl.g:642:5: (lv_requiredRoles_11_0= ruleRequiredRole )
                    {
                    // InternalCBSMDsl.g:642:5: (lv_requiredRoles_11_0= ruleRequiredRole )
                    // InternalCBSMDsl.g:643:6: lv_requiredRoles_11_0= ruleRequiredRole
                    {

                    						newCompositeNode(grammarAccess.getSystemAccess().getRequiredRolesRequiredRoleParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_requiredRoles_11_0=ruleRequiredRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemRule());
                    						}
                    						add(
                    							current,
                    							"requiredRoles",
                    							lv_requiredRoles_11_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.RequiredRole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBSMDsl.g:660:4: (otherlv_12= ',' ( (lv_requiredRoles_13_0= ruleRequiredRole ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==20) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalCBSMDsl.g:661:5: otherlv_12= ',' ( (lv_requiredRoles_13_0= ruleRequiredRole ) )
                    	    {
                    	    otherlv_12=(Token)match(input,20,FOLLOW_23); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getSystemAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCBSMDsl.g:665:5: ( (lv_requiredRoles_13_0= ruleRequiredRole ) )
                    	    // InternalCBSMDsl.g:666:6: (lv_requiredRoles_13_0= ruleRequiredRole )
                    	    {
                    	    // InternalCBSMDsl.g:666:6: (lv_requiredRoles_13_0= ruleRequiredRole )
                    	    // InternalCBSMDsl.g:667:7: lv_requiredRoles_13_0= ruleRequiredRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemAccess().getRequiredRolesRequiredRoleParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_requiredRoles_13_0=ruleRequiredRole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"requiredRoles",
                    	    								lv_requiredRoles_13_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.RequiredRole");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,17,FOLLOW_24); 

                    				newLeafNode(otherlv_14, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalCBSMDsl.g:690:3: (otherlv_15= 'containedAssemblyContexts' otherlv_16= '{' ( (lv_containedAssemblyContexts_17_0= ruleAssemblyContext ) ) (otherlv_18= ',' ( (lv_containedAssemblyContexts_19_0= ruleAssemblyContext ) ) )* otherlv_20= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCBSMDsl.g:691:4: otherlv_15= 'containedAssemblyContexts' otherlv_16= '{' ( (lv_containedAssemblyContexts_17_0= ruleAssemblyContext ) ) (otherlv_18= ',' ( (lv_containedAssemblyContexts_19_0= ruleAssemblyContext ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getSystemAccess().getContainedAssemblyContextsKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_25); 

                    				newLeafNode(otherlv_16, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCBSMDsl.g:699:4: ( (lv_containedAssemblyContexts_17_0= ruleAssemblyContext ) )
                    // InternalCBSMDsl.g:700:5: (lv_containedAssemblyContexts_17_0= ruleAssemblyContext )
                    {
                    // InternalCBSMDsl.g:700:5: (lv_containedAssemblyContexts_17_0= ruleAssemblyContext )
                    // InternalCBSMDsl.g:701:6: lv_containedAssemblyContexts_17_0= ruleAssemblyContext
                    {

                    						newCompositeNode(grammarAccess.getSystemAccess().getContainedAssemblyContextsAssemblyContextParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_containedAssemblyContexts_17_0=ruleAssemblyContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemRule());
                    						}
                    						add(
                    							current,
                    							"containedAssemblyContexts",
                    							lv_containedAssemblyContexts_17_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.AssemblyContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBSMDsl.g:718:4: (otherlv_18= ',' ( (lv_containedAssemblyContexts_19_0= ruleAssemblyContext ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==20) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalCBSMDsl.g:719:5: otherlv_18= ',' ( (lv_containedAssemblyContexts_19_0= ruleAssemblyContext ) )
                    	    {
                    	    otherlv_18=(Token)match(input,20,FOLLOW_25); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getSystemAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCBSMDsl.g:723:5: ( (lv_containedAssemblyContexts_19_0= ruleAssemblyContext ) )
                    	    // InternalCBSMDsl.g:724:6: (lv_containedAssemblyContexts_19_0= ruleAssemblyContext )
                    	    {
                    	    // InternalCBSMDsl.g:724:6: (lv_containedAssemblyContexts_19_0= ruleAssemblyContext )
                    	    // InternalCBSMDsl.g:725:7: lv_containedAssemblyContexts_19_0= ruleAssemblyContext
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemAccess().getContainedAssemblyContextsAssemblyContextParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_containedAssemblyContexts_19_0=ruleAssemblyContext();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"containedAssemblyContexts",
                    	    								lv_containedAssemblyContexts_19_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.AssemblyContext");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,17,FOLLOW_26); 

                    				newLeafNode(otherlv_20, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalCBSMDsl.g:748:3: (otherlv_21= 'systemConnectors' otherlv_22= '{' ( (lv_systemConnectors_23_0= ruleConnector ) ) (otherlv_24= ',' ( (lv_systemConnectors_25_0= ruleConnector ) ) )* otherlv_26= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCBSMDsl.g:749:4: otherlv_21= 'systemConnectors' otherlv_22= '{' ( (lv_systemConnectors_23_0= ruleConnector ) ) (otherlv_24= ',' ( (lv_systemConnectors_25_0= ruleConnector ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getSystemAccess().getSystemConnectorsKeyword_6_0());
                    			
                    otherlv_22=(Token)match(input,12,FOLLOW_27); 

                    				newLeafNode(otherlv_22, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCBSMDsl.g:757:4: ( (lv_systemConnectors_23_0= ruleConnector ) )
                    // InternalCBSMDsl.g:758:5: (lv_systemConnectors_23_0= ruleConnector )
                    {
                    // InternalCBSMDsl.g:758:5: (lv_systemConnectors_23_0= ruleConnector )
                    // InternalCBSMDsl.g:759:6: lv_systemConnectors_23_0= ruleConnector
                    {

                    						newCompositeNode(grammarAccess.getSystemAccess().getSystemConnectorsConnectorParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_systemConnectors_23_0=ruleConnector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemRule());
                    						}
                    						add(
                    							current,
                    							"systemConnectors",
                    							lv_systemConnectors_23_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.Connector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBSMDsl.g:776:4: (otherlv_24= ',' ( (lv_systemConnectors_25_0= ruleConnector ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==20) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalCBSMDsl.g:777:5: otherlv_24= ',' ( (lv_systemConnectors_25_0= ruleConnector ) )
                    	    {
                    	    otherlv_24=(Token)match(input,20,FOLLOW_27); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getSystemAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCBSMDsl.g:781:5: ( (lv_systemConnectors_25_0= ruleConnector ) )
                    	    // InternalCBSMDsl.g:782:6: (lv_systemConnectors_25_0= ruleConnector )
                    	    {
                    	    // InternalCBSMDsl.g:782:6: (lv_systemConnectors_25_0= ruleConnector )
                    	    // InternalCBSMDsl.g:783:7: lv_systemConnectors_25_0= ruleConnector
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemAccess().getSystemConnectorsConnectorParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_systemConnectors_25_0=ruleConnector();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"systemConnectors",
                    	    								lv_systemConnectors_25_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.Connector");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_26, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,17,FOLLOW_2); 

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
    // InternalCBSMDsl.g:814:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalCBSMDsl.g:814:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalCBSMDsl.g:815:2: iv_ruleEnvironment= ruleEnvironment EOF
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
    // InternalCBSMDsl.g:821:1: ruleEnvironment returns [EObject current=null] : ( () otherlv_1= 'Environment' otherlv_2= '{' (otherlv_3= 'containers' otherlv_4= '{' ( (lv_containers_5_0= ruleContainer ) ) (otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) ) )* otherlv_8= '}' )? (otherlv_9= 'links' otherlv_10= '{' ( (lv_links_11_0= ruleLink ) ) (otherlv_12= ',' ( (lv_links_13_0= ruleLink ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
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
            // InternalCBSMDsl.g:827:2: ( ( () otherlv_1= 'Environment' otherlv_2= '{' (otherlv_3= 'containers' otherlv_4= '{' ( (lv_containers_5_0= ruleContainer ) ) (otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) ) )* otherlv_8= '}' )? (otherlv_9= 'links' otherlv_10= '{' ( (lv_links_11_0= ruleLink ) ) (otherlv_12= ',' ( (lv_links_13_0= ruleLink ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalCBSMDsl.g:828:2: ( () otherlv_1= 'Environment' otherlv_2= '{' (otherlv_3= 'containers' otherlv_4= '{' ( (lv_containers_5_0= ruleContainer ) ) (otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) ) )* otherlv_8= '}' )? (otherlv_9= 'links' otherlv_10= '{' ( (lv_links_11_0= ruleLink ) ) (otherlv_12= ',' ( (lv_links_13_0= ruleLink ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalCBSMDsl.g:828:2: ( () otherlv_1= 'Environment' otherlv_2= '{' (otherlv_3= 'containers' otherlv_4= '{' ( (lv_containers_5_0= ruleContainer ) ) (otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) ) )* otherlv_8= '}' )? (otherlv_9= 'links' otherlv_10= '{' ( (lv_links_11_0= ruleLink ) ) (otherlv_12= ',' ( (lv_links_13_0= ruleLink ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalCBSMDsl.g:829:3: () otherlv_1= 'Environment' otherlv_2= '{' (otherlv_3= 'containers' otherlv_4= '{' ( (lv_containers_5_0= ruleContainer ) ) (otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) ) )* otherlv_8= '}' )? (otherlv_9= 'links' otherlv_10= '{' ( (lv_links_11_0= ruleLink ) ) (otherlv_12= ',' ( (lv_links_13_0= ruleLink ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalCBSMDsl.g:829:3: ()
            // InternalCBSMDsl.g:830:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentAccess().getEnvironmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCBSMDsl.g:844:3: (otherlv_3= 'containers' otherlv_4= '{' ( (lv_containers_5_0= ruleContainer ) ) (otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) ) )* otherlv_8= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCBSMDsl.g:845:4: otherlv_3= 'containers' otherlv_4= '{' ( (lv_containers_5_0= ruleContainer ) ) (otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnvironmentAccess().getContainersKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_29); 

                    				newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalCBSMDsl.g:853:4: ( (lv_containers_5_0= ruleContainer ) )
                    // InternalCBSMDsl.g:854:5: (lv_containers_5_0= ruleContainer )
                    {
                    // InternalCBSMDsl.g:854:5: (lv_containers_5_0= ruleContainer )
                    // InternalCBSMDsl.g:855:6: lv_containers_5_0= ruleContainer
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentAccess().getContainersContainerParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_containers_5_0=ruleContainer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    						}
                    						add(
                    							current,
                    							"containers",
                    							lv_containers_5_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.Container");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBSMDsl.g:872:4: (otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==20) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalCBSMDsl.g:873:5: otherlv_6= ',' ( (lv_containers_7_0= ruleContainer ) )
                    	    {
                    	    otherlv_6=(Token)match(input,20,FOLLOW_29); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getEnvironmentAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalCBSMDsl.g:877:5: ( (lv_containers_7_0= ruleContainer ) )
                    	    // InternalCBSMDsl.g:878:6: (lv_containers_7_0= ruleContainer )
                    	    {
                    	    // InternalCBSMDsl.g:878:6: (lv_containers_7_0= ruleContainer )
                    	    // InternalCBSMDsl.g:879:7: lv_containers_7_0= ruleContainer
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnvironmentAccess().getContainersContainerParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_containers_7_0=ruleContainer();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"containers",
                    	    								lv_containers_7_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.Container");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_30); 

                    				newLeafNode(otherlv_8, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalCBSMDsl.g:902:3: (otherlv_9= 'links' otherlv_10= '{' ( (lv_links_11_0= ruleLink ) ) (otherlv_12= ',' ( (lv_links_13_0= ruleLink ) ) )* otherlv_14= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCBSMDsl.g:903:4: otherlv_9= 'links' otherlv_10= '{' ( (lv_links_11_0= ruleLink ) ) (otherlv_12= ',' ( (lv_links_13_0= ruleLink ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getEnvironmentAccess().getLinksKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_31); 

                    				newLeafNode(otherlv_10, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCBSMDsl.g:911:4: ( (lv_links_11_0= ruleLink ) )
                    // InternalCBSMDsl.g:912:5: (lv_links_11_0= ruleLink )
                    {
                    // InternalCBSMDsl.g:912:5: (lv_links_11_0= ruleLink )
                    // InternalCBSMDsl.g:913:6: lv_links_11_0= ruleLink
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentAccess().getLinksLinkParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_links_11_0=ruleLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    						}
                    						add(
                    							current,
                    							"links",
                    							lv_links_11_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.Link");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBSMDsl.g:930:4: (otherlv_12= ',' ( (lv_links_13_0= ruleLink ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==20) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalCBSMDsl.g:931:5: otherlv_12= ',' ( (lv_links_13_0= ruleLink ) )
                    	    {
                    	    otherlv_12=(Token)match(input,20,FOLLOW_31); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getEnvironmentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCBSMDsl.g:935:5: ( (lv_links_13_0= ruleLink ) )
                    	    // InternalCBSMDsl.g:936:6: (lv_links_13_0= ruleLink )
                    	    {
                    	    // InternalCBSMDsl.g:936:6: (lv_links_13_0= ruleLink )
                    	    // InternalCBSMDsl.g:937:7: lv_links_13_0= ruleLink
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnvironmentAccess().getLinksLinkParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_links_13_0=ruleLink();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"links",
                    	    								lv_links_13_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.Link");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_14, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,17,FOLLOW_2); 

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
    // InternalCBSMDsl.g:968:1: entryRuleAllocation returns [EObject current=null] : iv_ruleAllocation= ruleAllocation EOF ;
    public final EObject entryRuleAllocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocation = null;


        try {
            // InternalCBSMDsl.g:968:51: (iv_ruleAllocation= ruleAllocation EOF )
            // InternalCBSMDsl.g:969:2: iv_ruleAllocation= ruleAllocation EOF
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
    // InternalCBSMDsl.g:975:1: ruleAllocation returns [EObject current=null] : ( () otherlv_1= 'Allocation' otherlv_2= '{' (otherlv_3= 'allocationContexts' otherlv_4= '{' ( (lv_allocationContexts_5_0= ruleAllocationContext ) ) (otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalCBSMDsl.g:981:2: ( ( () otherlv_1= 'Allocation' otherlv_2= '{' (otherlv_3= 'allocationContexts' otherlv_4= '{' ( (lv_allocationContexts_5_0= ruleAllocationContext ) ) (otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalCBSMDsl.g:982:2: ( () otherlv_1= 'Allocation' otherlv_2= '{' (otherlv_3= 'allocationContexts' otherlv_4= '{' ( (lv_allocationContexts_5_0= ruleAllocationContext ) ) (otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalCBSMDsl.g:982:2: ( () otherlv_1= 'Allocation' otherlv_2= '{' (otherlv_3= 'allocationContexts' otherlv_4= '{' ( (lv_allocationContexts_5_0= ruleAllocationContext ) ) (otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalCBSMDsl.g:983:3: () otherlv_1= 'Allocation' otherlv_2= '{' (otherlv_3= 'allocationContexts' otherlv_4= '{' ( (lv_allocationContexts_5_0= ruleAllocationContext ) ) (otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalCBSMDsl.g:983:3: ()
            // InternalCBSMDsl.g:984:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAllocationAccess().getAllocationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAllocationAccess().getAllocationKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getAllocationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCBSMDsl.g:998:3: (otherlv_3= 'allocationContexts' otherlv_4= '{' ( (lv_allocationContexts_5_0= ruleAllocationContext ) ) (otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) ) )* otherlv_8= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCBSMDsl.g:999:4: otherlv_3= 'allocationContexts' otherlv_4= '{' ( (lv_allocationContexts_5_0= ruleAllocationContext ) ) (otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getAllocationAccess().getAllocationContextsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_33); 

                    				newLeafNode(otherlv_4, grammarAccess.getAllocationAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalCBSMDsl.g:1007:4: ( (lv_allocationContexts_5_0= ruleAllocationContext ) )
                    // InternalCBSMDsl.g:1008:5: (lv_allocationContexts_5_0= ruleAllocationContext )
                    {
                    // InternalCBSMDsl.g:1008:5: (lv_allocationContexts_5_0= ruleAllocationContext )
                    // InternalCBSMDsl.g:1009:6: lv_allocationContexts_5_0= ruleAllocationContext
                    {

                    						newCompositeNode(grammarAccess.getAllocationAccess().getAllocationContextsAllocationContextParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_allocationContexts_5_0=ruleAllocationContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAllocationRule());
                    						}
                    						add(
                    							current,
                    							"allocationContexts",
                    							lv_allocationContexts_5_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.AllocationContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBSMDsl.g:1026:4: (otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==20) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalCBSMDsl.g:1027:5: otherlv_6= ',' ( (lv_allocationContexts_7_0= ruleAllocationContext ) )
                    	    {
                    	    otherlv_6=(Token)match(input,20,FOLLOW_33); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getAllocationAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalCBSMDsl.g:1031:5: ( (lv_allocationContexts_7_0= ruleAllocationContext ) )
                    	    // InternalCBSMDsl.g:1032:6: (lv_allocationContexts_7_0= ruleAllocationContext )
                    	    {
                    	    // InternalCBSMDsl.g:1032:6: (lv_allocationContexts_7_0= ruleAllocationContext )
                    	    // InternalCBSMDsl.g:1033:7: lv_allocationContexts_7_0= ruleAllocationContext
                    	    {

                    	    							newCompositeNode(grammarAccess.getAllocationAccess().getAllocationContextsAllocationContextParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_allocationContexts_7_0=ruleAllocationContext();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAllocationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"allocationContexts",
                    	    								lv_allocationContexts_7_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.AllocationContext");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getAllocationAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

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
    // InternalCBSMDsl.g:1064:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalCBSMDsl.g:1064:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalCBSMDsl.g:1065:2: iv_ruleInterface= ruleInterface EOF
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
    // InternalCBSMDsl.g:1071:1: ruleInterface returns [EObject current=null] : ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
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
            // InternalCBSMDsl.g:1077:2: ( ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalCBSMDsl.g:1078:2: ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalCBSMDsl.g:1078:2: ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalCBSMDsl.g:1079:3: () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalCBSMDsl.g:1079:3: ()
            // InternalCBSMDsl.g:1080:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInterfaceAccess().getInterfaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getInterfaceAccess().getInterfaceKeyword_1());
            		
            // InternalCBSMDsl.g:1090:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCBSMDsl.g:1091:4: (lv_name_2_0= ruleEString )
            {
            // InternalCBSMDsl.g:1091:4: (lv_name_2_0= ruleEString )
            // InternalCBSMDsl.g:1092:5: lv_name_2_0= ruleEString
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
            						"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCBSMDsl.g:1113:3: (otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCBSMDsl.g:1114:4: otherlv_4= 'signatures' otherlv_5= '{' ( (lv_signatures_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getInterfaceAccess().getSignaturesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_36); 

                    				newLeafNode(otherlv_5, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCBSMDsl.g:1122:4: ( (lv_signatures_6_0= ruleSignature ) )
                    // InternalCBSMDsl.g:1123:5: (lv_signatures_6_0= ruleSignature )
                    {
                    // InternalCBSMDsl.g:1123:5: (lv_signatures_6_0= ruleSignature )
                    // InternalCBSMDsl.g:1124:6: lv_signatures_6_0= ruleSignature
                    {

                    						newCompositeNode(grammarAccess.getInterfaceAccess().getSignaturesSignatureParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_signatures_6_0=ruleSignature();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"signatures",
                    							lv_signatures_6_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.Signature");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBSMDsl.g:1141:4: (otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==20) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalCBSMDsl.g:1142:5: otherlv_7= ',' ( (lv_signatures_8_0= ruleSignature ) )
                    	    {
                    	    otherlv_7=(Token)match(input,20,FOLLOW_36); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getInterfaceAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCBSMDsl.g:1146:5: ( (lv_signatures_8_0= ruleSignature ) )
                    	    // InternalCBSMDsl.g:1147:6: (lv_signatures_8_0= ruleSignature )
                    	    {
                    	    // InternalCBSMDsl.g:1147:6: (lv_signatures_8_0= ruleSignature )
                    	    // InternalCBSMDsl.g:1148:7: lv_signatures_8_0= ruleSignature
                    	    {

                    	    							newCompositeNode(grammarAccess.getInterfaceAccess().getSignaturesSignatureParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_signatures_8_0=ruleSignature();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"signatures",
                    	    								lv_signatures_8_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.Signature");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_2); 

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
    // InternalCBSMDsl.g:1179:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalCBSMDsl.g:1179:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalCBSMDsl.g:1180:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalCBSMDsl.g:1186:1: ruleComponent returns [EObject current=null] : ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providedRoles' otherlv_5= '{' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= '}' )? (otherlv_10= 'requiredRoles' otherlv_11= '{' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= '}' )? (otherlv_16= 'behaviorDescription' ( (lv_behaviorDescription_17_0= ruleBehaviorDescription ) ) )? otherlv_18= '}' ) ;
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
            // InternalCBSMDsl.g:1192:2: ( ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providedRoles' otherlv_5= '{' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= '}' )? (otherlv_10= 'requiredRoles' otherlv_11= '{' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= '}' )? (otherlv_16= 'behaviorDescription' ( (lv_behaviorDescription_17_0= ruleBehaviorDescription ) ) )? otherlv_18= '}' ) )
            // InternalCBSMDsl.g:1193:2: ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providedRoles' otherlv_5= '{' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= '}' )? (otherlv_10= 'requiredRoles' otherlv_11= '{' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= '}' )? (otherlv_16= 'behaviorDescription' ( (lv_behaviorDescription_17_0= ruleBehaviorDescription ) ) )? otherlv_18= '}' )
            {
            // InternalCBSMDsl.g:1193:2: ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providedRoles' otherlv_5= '{' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= '}' )? (otherlv_10= 'requiredRoles' otherlv_11= '{' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= '}' )? (otherlv_16= 'behaviorDescription' ( (lv_behaviorDescription_17_0= ruleBehaviorDescription ) ) )? otherlv_18= '}' )
            // InternalCBSMDsl.g:1194:3: () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'providedRoles' otherlv_5= '{' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= '}' )? (otherlv_10= 'requiredRoles' otherlv_11= '{' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= '}' )? (otherlv_16= 'behaviorDescription' ( (lv_behaviorDescription_17_0= ruleBehaviorDescription ) ) )? otherlv_18= '}'
            {
            // InternalCBSMDsl.g:1194:3: ()
            // InternalCBSMDsl.g:1195:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentAccess().getComponentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentAccess().getComponentKeyword_1());
            		
            // InternalCBSMDsl.g:1205:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCBSMDsl.g:1206:4: (lv_name_2_0= ruleEString )
            {
            // InternalCBSMDsl.g:1206:4: (lv_name_2_0= ruleEString )
            // InternalCBSMDsl.g:1207:5: lv_name_2_0= ruleEString
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
            						"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCBSMDsl.g:1228:3: (otherlv_4= 'providedRoles' otherlv_5= '{' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==24) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCBSMDsl.g:1229:4: otherlv_4= 'providedRoles' otherlv_5= '{' ( (lv_providedRoles_6_0= ruleProvidedRole ) ) (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getProvidedRolesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCBSMDsl.g:1237:4: ( (lv_providedRoles_6_0= ruleProvidedRole ) )
                    // InternalCBSMDsl.g:1238:5: (lv_providedRoles_6_0= ruleProvidedRole )
                    {
                    // InternalCBSMDsl.g:1238:5: (lv_providedRoles_6_0= ruleProvidedRole )
                    // InternalCBSMDsl.g:1239:6: lv_providedRoles_6_0= ruleProvidedRole
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getProvidedRolesProvidedRoleParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_providedRoles_6_0=ruleProvidedRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						add(
                    							current,
                    							"providedRoles",
                    							lv_providedRoles_6_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.ProvidedRole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBSMDsl.g:1256:4: (otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==20) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalCBSMDsl.g:1257:5: otherlv_7= ',' ( (lv_providedRoles_8_0= ruleProvidedRole ) )
                    	    {
                    	    otherlv_7=(Token)match(input,20,FOLLOW_21); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCBSMDsl.g:1261:5: ( (lv_providedRoles_8_0= ruleProvidedRole ) )
                    	    // InternalCBSMDsl.g:1262:6: (lv_providedRoles_8_0= ruleProvidedRole )
                    	    {
                    	    // InternalCBSMDsl.g:1262:6: (lv_providedRoles_8_0= ruleProvidedRole )
                    	    // InternalCBSMDsl.g:1263:7: lv_providedRoles_8_0= ruleProvidedRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getProvidedRolesProvidedRoleParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_providedRoles_8_0=ruleProvidedRole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"providedRoles",
                    	    								lv_providedRoles_8_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.ProvidedRole");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,17,FOLLOW_38); 

                    				newLeafNode(otherlv_9, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalCBSMDsl.g:1286:3: (otherlv_10= 'requiredRoles' otherlv_11= '{' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==25) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCBSMDsl.g:1287:4: otherlv_10= 'requiredRoles' otherlv_11= '{' ( (lv_requiredRoles_12_0= ruleRequiredRole ) ) (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getComponentAccess().getRequiredRolesKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_11, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCBSMDsl.g:1295:4: ( (lv_requiredRoles_12_0= ruleRequiredRole ) )
                    // InternalCBSMDsl.g:1296:5: (lv_requiredRoles_12_0= ruleRequiredRole )
                    {
                    // InternalCBSMDsl.g:1296:5: (lv_requiredRoles_12_0= ruleRequiredRole )
                    // InternalCBSMDsl.g:1297:6: lv_requiredRoles_12_0= ruleRequiredRole
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getRequiredRolesRequiredRoleParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_requiredRoles_12_0=ruleRequiredRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						add(
                    							current,
                    							"requiredRoles",
                    							lv_requiredRoles_12_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.RequiredRole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBSMDsl.g:1314:4: (otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==20) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalCBSMDsl.g:1315:5: otherlv_13= ',' ( (lv_requiredRoles_14_0= ruleRequiredRole ) )
                    	    {
                    	    otherlv_13=(Token)match(input,20,FOLLOW_23); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getComponentAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCBSMDsl.g:1319:5: ( (lv_requiredRoles_14_0= ruleRequiredRole ) )
                    	    // InternalCBSMDsl.g:1320:6: (lv_requiredRoles_14_0= ruleRequiredRole )
                    	    {
                    	    // InternalCBSMDsl.g:1320:6: (lv_requiredRoles_14_0= ruleRequiredRole )
                    	    // InternalCBSMDsl.g:1321:7: lv_requiredRoles_14_0= ruleRequiredRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getRequiredRolesRequiredRoleParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_requiredRoles_14_0=ruleRequiredRole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"requiredRoles",
                    	    								lv_requiredRoles_14_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.RequiredRole");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,17,FOLLOW_39); 

                    				newLeafNode(otherlv_15, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalCBSMDsl.g:1344:3: (otherlv_16= 'behaviorDescription' ( (lv_behaviorDescription_17_0= ruleBehaviorDescription ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==36) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCBSMDsl.g:1345:4: otherlv_16= 'behaviorDescription' ( (lv_behaviorDescription_17_0= ruleBehaviorDescription ) )
                    {
                    otherlv_16=(Token)match(input,36,FOLLOW_40); 

                    				newLeafNode(otherlv_16, grammarAccess.getComponentAccess().getBehaviorDescriptionKeyword_6_0());
                    			
                    // InternalCBSMDsl.g:1349:4: ( (lv_behaviorDescription_17_0= ruleBehaviorDescription ) )
                    // InternalCBSMDsl.g:1350:5: (lv_behaviorDescription_17_0= ruleBehaviorDescription )
                    {
                    // InternalCBSMDsl.g:1350:5: (lv_behaviorDescription_17_0= ruleBehaviorDescription )
                    // InternalCBSMDsl.g:1351:6: lv_behaviorDescription_17_0= ruleBehaviorDescription
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getBehaviorDescriptionBehaviorDescriptionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_behaviorDescription_17_0=ruleBehaviorDescription();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						set(
                    							current,
                    							"behaviorDescription",
                    							lv_behaviorDescription_17_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.BehaviorDescription");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,17,FOLLOW_2); 

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
    // InternalCBSMDsl.g:1377:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCBSMDsl.g:1377:47: (iv_ruleEString= ruleEString EOF )
            // InternalCBSMDsl.g:1378:2: iv_ruleEString= ruleEString EOF
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
    // InternalCBSMDsl.g:1384:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalCBSMDsl.g:1390:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalCBSMDsl.g:1391:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalCBSMDsl.g:1391:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_ID) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalCBSMDsl.g:1392:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCBSMDsl.g:1400:3: this_ID_1= RULE_ID
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
    // InternalCBSMDsl.g:1411:1: entryRuleSignature returns [EObject current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final EObject entryRuleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignature = null;


        try {
            // InternalCBSMDsl.g:1411:50: (iv_ruleSignature= ruleSignature EOF )
            // InternalCBSMDsl.g:1412:2: iv_ruleSignature= ruleSignature EOF
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
    // InternalCBSMDsl.g:1418:1: ruleSignature returns [EObject current=null] : ( () otherlv_1= 'Signature' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType' ( ( ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
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
            // InternalCBSMDsl.g:1424:2: ( ( () otherlv_1= 'Signature' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType' ( ( ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalCBSMDsl.g:1425:2: ( () otherlv_1= 'Signature' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType' ( ( ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalCBSMDsl.g:1425:2: ( () otherlv_1= 'Signature' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType' ( ( ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalCBSMDsl.g:1426:3: () otherlv_1= 'Signature' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType' ( ( ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalCBSMDsl.g:1426:3: ()
            // InternalCBSMDsl.g:1427:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSignatureAccess().getSignatureAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getSignatureAccess().getSignatureKeyword_1());
            		
            // InternalCBSMDsl.g:1437:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCBSMDsl.g:1438:4: (lv_name_2_0= ruleEString )
            {
            // InternalCBSMDsl.g:1438:4: (lv_name_2_0= ruleEString )
            // InternalCBSMDsl.g:1439:5: lv_name_2_0= ruleEString
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
            						"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCBSMDsl.g:1460:3: (otherlv_4= 'returnType' ( ( ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==38) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCBSMDsl.g:1461:4: otherlv_4= 'returnType' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,38,FOLLOW_34); 

                    				newLeafNode(otherlv_4, grammarAccess.getSignatureAccess().getReturnTypeKeyword_4_0());
                    			
                    // InternalCBSMDsl.g:1465:4: ( ( ruleEString ) )
                    // InternalCBSMDsl.g:1466:5: ( ruleEString )
                    {
                    // InternalCBSMDsl.g:1466:5: ( ruleEString )
                    // InternalCBSMDsl.g:1467:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSignatureRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSignatureAccess().getReturnTypeDataTypeCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCBSMDsl.g:1482:3: (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==39) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCBSMDsl.g:1483:4: otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getSignatureAccess().getParametersKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_43); 

                    				newLeafNode(otherlv_7, grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCBSMDsl.g:1491:4: ( (lv_parameters_8_0= ruleParameter ) )
                    // InternalCBSMDsl.g:1492:5: (lv_parameters_8_0= ruleParameter )
                    {
                    // InternalCBSMDsl.g:1492:5: (lv_parameters_8_0= ruleParameter )
                    // InternalCBSMDsl.g:1493:6: lv_parameters_8_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_parameters_8_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSignatureRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_8_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBSMDsl.g:1510:4: (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==20) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalCBSMDsl.g:1511:5: otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) )
                    	    {
                    	    otherlv_9=(Token)match(input,20,FOLLOW_43); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getSignatureAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCBSMDsl.g:1515:5: ( (lv_parameters_10_0= ruleParameter ) )
                    	    // InternalCBSMDsl.g:1516:6: (lv_parameters_10_0= ruleParameter )
                    	    {
                    	    // InternalCBSMDsl.g:1516:6: (lv_parameters_10_0= ruleParameter )
                    	    // InternalCBSMDsl.g:1517:7: lv_parameters_10_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_parameters_10_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSignatureRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_10_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

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
    // InternalCBSMDsl.g:1548:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalCBSMDsl.g:1548:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalCBSMDsl.g:1549:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalCBSMDsl.g:1555:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCBSMDsl.g:1561:2: ( (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalCBSMDsl.g:1562:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalCBSMDsl.g:1562:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalCBSMDsl.g:1563:3: otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            // InternalCBSMDsl.g:1567:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBSMDsl.g:1568:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBSMDsl.g:1568:4: (lv_name_1_0= ruleEString )
            // InternalCBSMDsl.g:1569:5: lv_name_1_0= ruleEString
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
            						"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,41,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getTypeKeyword_3());
            		
            // InternalCBSMDsl.g:1594:3: ( ( ruleEString ) )
            // InternalCBSMDsl.g:1595:4: ( ruleEString )
            {
            // InternalCBSMDsl.g:1595:4: ( ruleEString )
            // InternalCBSMDsl.g:1596:5: ruleEString
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

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

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
    // InternalCBSMDsl.g:1618:1: entryRuleProvidedRole returns [EObject current=null] : iv_ruleProvidedRole= ruleProvidedRole EOF ;
    public final EObject entryRuleProvidedRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedRole = null;


        try {
            // InternalCBSMDsl.g:1618:53: (iv_ruleProvidedRole= ruleProvidedRole EOF )
            // InternalCBSMDsl.g:1619:2: iv_ruleProvidedRole= ruleProvidedRole EOF
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
    // InternalCBSMDsl.g:1625:1: ruleProvidedRole returns [EObject current=null] : (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providedInterface' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleProvidedRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCBSMDsl.g:1631:2: ( (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providedInterface' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalCBSMDsl.g:1632:2: (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providedInterface' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalCBSMDsl.g:1632:2: (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providedInterface' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalCBSMDsl.g:1633:3: otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providedInterface' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getProvidedRoleAccess().getProvidedRoleKeyword_0());
            		
            // InternalCBSMDsl.g:1637:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBSMDsl.g:1638:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBSMDsl.g:1638:4: (lv_name_1_0= ruleEString )
            // InternalCBSMDsl.g:1639:5: lv_name_1_0= ruleEString
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
            						"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getProvidedRoleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,43,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getProvidedRoleAccess().getProvidedInterfaceKeyword_3());
            		
            // InternalCBSMDsl.g:1664:3: ( ( ruleEString ) )
            // InternalCBSMDsl.g:1665:4: ( ruleEString )
            {
            // InternalCBSMDsl.g:1665:4: ( ruleEString )
            // InternalCBSMDsl.g:1666:5: ruleEString
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

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

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
    // InternalCBSMDsl.g:1688:1: entryRuleRequiredRole returns [EObject current=null] : iv_ruleRequiredRole= ruleRequiredRole EOF ;
    public final EObject entryRuleRequiredRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredRole = null;


        try {
            // InternalCBSMDsl.g:1688:53: (iv_ruleRequiredRole= ruleRequiredRole EOF )
            // InternalCBSMDsl.g:1689:2: iv_ruleRequiredRole= ruleRequiredRole EOF
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
    // InternalCBSMDsl.g:1695:1: ruleRequiredRole returns [EObject current=null] : (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'requiredInterface' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleRequiredRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCBSMDsl.g:1701:2: ( (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'requiredInterface' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalCBSMDsl.g:1702:2: (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'requiredInterface' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalCBSMDsl.g:1702:2: (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'requiredInterface' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalCBSMDsl.g:1703:3: otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'requiredInterface' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getRequiredRoleAccess().getRequiredRoleKeyword_0());
            		
            // InternalCBSMDsl.g:1707:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBSMDsl.g:1708:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBSMDsl.g:1708:4: (lv_name_1_0= ruleEString )
            // InternalCBSMDsl.g:1709:5: lv_name_1_0= ruleEString
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
            						"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getRequiredRoleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,45,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getRequiredRoleAccess().getRequiredInterfaceKeyword_3());
            		
            // InternalCBSMDsl.g:1734:3: ( ( ruleEString ) )
            // InternalCBSMDsl.g:1735:4: ( ruleEString )
            {
            // InternalCBSMDsl.g:1735:4: ( ruleEString )
            // InternalCBSMDsl.g:1736:5: ruleEString
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

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

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
    // InternalCBSMDsl.g:1758:1: entryRuleBehaviorDescription returns [EObject current=null] : iv_ruleBehaviorDescription= ruleBehaviorDescription EOF ;
    public final EObject entryRuleBehaviorDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorDescription = null;


        try {
            // InternalCBSMDsl.g:1758:60: (iv_ruleBehaviorDescription= ruleBehaviorDescription EOF )
            // InternalCBSMDsl.g:1759:2: iv_ruleBehaviorDescription= ruleBehaviorDescription EOF
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
    // InternalCBSMDsl.g:1765:1: ruleBehaviorDescription returns [EObject current=null] : ( () otherlv_1= 'BehaviorDescription' otherlv_2= '{' (otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalCBSMDsl.g:1771:2: ( ( () otherlv_1= 'BehaviorDescription' otherlv_2= '{' (otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalCBSMDsl.g:1772:2: ( () otherlv_1= 'BehaviorDescription' otherlv_2= '{' (otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalCBSMDsl.g:1772:2: ( () otherlv_1= 'BehaviorDescription' otherlv_2= '{' (otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalCBSMDsl.g:1773:3: () otherlv_1= 'BehaviorDescription' otherlv_2= '{' (otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalCBSMDsl.g:1773:3: ()
            // InternalCBSMDsl.g:1774:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBehaviorDescriptionAccess().getBehaviorDescriptionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBehaviorDescriptionAccess().getBehaviorDescriptionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getBehaviorDescriptionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCBSMDsl.g:1788:3: (otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* otherlv_8= '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==47) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCBSMDsl.g:1789:4: otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getBehaviorDescriptionAccess().getActionsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_48); 

                    				newLeafNode(otherlv_4, grammarAccess.getBehaviorDescriptionAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalCBSMDsl.g:1797:4: ( (lv_actions_5_0= ruleAction ) )
                    // InternalCBSMDsl.g:1798:5: (lv_actions_5_0= ruleAction )
                    {
                    // InternalCBSMDsl.g:1798:5: (lv_actions_5_0= ruleAction )
                    // InternalCBSMDsl.g:1799:6: lv_actions_5_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getBehaviorDescriptionAccess().getActionsActionParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_actions_5_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBehaviorDescriptionRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_5_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBSMDsl.g:1816:4: (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==20) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalCBSMDsl.g:1817:5: otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) )
                    	    {
                    	    otherlv_6=(Token)match(input,20,FOLLOW_48); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getBehaviorDescriptionAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalCBSMDsl.g:1821:5: ( (lv_actions_7_0= ruleAction ) )
                    	    // InternalCBSMDsl.g:1822:6: (lv_actions_7_0= ruleAction )
                    	    {
                    	    // InternalCBSMDsl.g:1822:6: (lv_actions_7_0= ruleAction )
                    	    // InternalCBSMDsl.g:1823:7: lv_actions_7_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getBehaviorDescriptionAccess().getActionsActionParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_actions_7_0=ruleAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBehaviorDescriptionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_7_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getBehaviorDescriptionAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

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
    // InternalCBSMDsl.g:1854:1: entryRuleAction_Impl returns [EObject current=null] : iv_ruleAction_Impl= ruleAction_Impl EOF ;
    public final EObject entryRuleAction_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction_Impl = null;


        try {
            // InternalCBSMDsl.g:1854:52: (iv_ruleAction_Impl= ruleAction_Impl EOF )
            // InternalCBSMDsl.g:1855:2: iv_ruleAction_Impl= ruleAction_Impl EOF
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
    // InternalCBSMDsl.g:1861:1: ruleAction_Impl returns [EObject current=null] : ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
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
            // InternalCBSMDsl.g:1867:2: ( ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalCBSMDsl.g:1868:2: ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalCBSMDsl.g:1868:2: ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalCBSMDsl.g:1869:3: () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalCBSMDsl.g:1869:3: ()
            // InternalCBSMDsl.g:1870:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAction_ImplAccess().getActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getAction_ImplAccess().getActionKeyword_1());
            		
            // InternalCBSMDsl.g:1880:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCBSMDsl.g:1881:4: (lv_name_2_0= ruleEString )
            {
            // InternalCBSMDsl.g:1881:4: (lv_name_2_0= ruleEString )
            // InternalCBSMDsl.g:1882:5: lv_name_2_0= ruleEString
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
            						"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_49); 

            			newLeafNode(otherlv_3, grammarAccess.getAction_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCBSMDsl.g:1903:3: (otherlv_4= 'predecessor' ( ( ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==49) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCBSMDsl.g:1904:4: otherlv_4= 'predecessor' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,49,FOLLOW_34); 

                    				newLeafNode(otherlv_4, grammarAccess.getAction_ImplAccess().getPredecessorKeyword_4_0());
                    			
                    // InternalCBSMDsl.g:1908:4: ( ( ruleEString ) )
                    // InternalCBSMDsl.g:1909:5: ( ruleEString )
                    {
                    // InternalCBSMDsl.g:1909:5: ( ruleEString )
                    // InternalCBSMDsl.g:1910:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAction_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAction_ImplAccess().getPredecessorActionCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_50);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCBSMDsl.g:1925:3: (otherlv_6= 'successor' ( ( ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==50) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCBSMDsl.g:1926:4: otherlv_6= 'successor' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,50,FOLLOW_34); 

                    				newLeafNode(otherlv_6, grammarAccess.getAction_ImplAccess().getSuccessorKeyword_5_0());
                    			
                    // InternalCBSMDsl.g:1930:4: ( ( ruleEString ) )
                    // InternalCBSMDsl.g:1931:5: ( ruleEString )
                    {
                    // InternalCBSMDsl.g:1931:5: ( ruleEString )
                    // InternalCBSMDsl.g:1932:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAction_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAction_ImplAccess().getSuccessorActionCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

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
    // InternalCBSMDsl.g:1955:1: entryRuleInternalAction returns [EObject current=null] : iv_ruleInternalAction= ruleInternalAction EOF ;
    public final EObject entryRuleInternalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalAction = null;


        try {
            // InternalCBSMDsl.g:1955:55: (iv_ruleInternalAction= ruleInternalAction EOF )
            // InternalCBSMDsl.g:1956:2: iv_ruleInternalAction= ruleInternalAction EOF
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
    // InternalCBSMDsl.g:1962:1: ruleInternalAction returns [EObject current=null] : ( () otherlv_1= 'InternalAction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
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
            // InternalCBSMDsl.g:1968:2: ( ( () otherlv_1= 'InternalAction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalCBSMDsl.g:1969:2: ( () otherlv_1= 'InternalAction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalCBSMDsl.g:1969:2: ( () otherlv_1= 'InternalAction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalCBSMDsl.g:1970:3: () otherlv_1= 'InternalAction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalCBSMDsl.g:1970:3: ()
            // InternalCBSMDsl.g:1971:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInternalActionAccess().getInternalActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getInternalActionAccess().getInternalActionKeyword_1());
            		
            // InternalCBSMDsl.g:1981:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCBSMDsl.g:1982:4: (lv_name_2_0= ruleEString )
            {
            // InternalCBSMDsl.g:1982:4: (lv_name_2_0= ruleEString )
            // InternalCBSMDsl.g:1983:5: lv_name_2_0= ruleEString
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
            						"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_49); 

            			newLeafNode(otherlv_3, grammarAccess.getInternalActionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCBSMDsl.g:2004:3: (otherlv_4= 'predecessor' ( ( ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==49) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCBSMDsl.g:2005:4: otherlv_4= 'predecessor' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,49,FOLLOW_34); 

                    				newLeafNode(otherlv_4, grammarAccess.getInternalActionAccess().getPredecessorKeyword_4_0());
                    			
                    // InternalCBSMDsl.g:2009:4: ( ( ruleEString ) )
                    // InternalCBSMDsl.g:2010:5: ( ruleEString )
                    {
                    // InternalCBSMDsl.g:2010:5: ( ruleEString )
                    // InternalCBSMDsl.g:2011:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInternalActionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getInternalActionAccess().getPredecessorActionCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_50);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCBSMDsl.g:2026:3: (otherlv_6= 'successor' ( ( ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==50) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCBSMDsl.g:2027:4: otherlv_6= 'successor' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,50,FOLLOW_34); 

                    				newLeafNode(otherlv_6, grammarAccess.getInternalActionAccess().getSuccessorKeyword_5_0());
                    			
                    // InternalCBSMDsl.g:2031:4: ( ( ruleEString ) )
                    // InternalCBSMDsl.g:2032:5: ( ruleEString )
                    {
                    // InternalCBSMDsl.g:2032:5: ( ruleEString )
                    // InternalCBSMDsl.g:2033:6: ruleEString
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

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

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
    // InternalCBSMDsl.g:2056:1: entryRuleExternalCall returns [EObject current=null] : iv_ruleExternalCall= ruleExternalCall EOF ;
    public final EObject entryRuleExternalCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalCall = null;


        try {
            // InternalCBSMDsl.g:2056:53: (iv_ruleExternalCall= ruleExternalCall EOF )
            // InternalCBSMDsl.g:2057:2: iv_ruleExternalCall= ruleExternalCall EOF
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
    // InternalCBSMDsl.g:2063:1: ruleExternalCall returns [EObject current=null] : (otherlv_0= 'ExternalCall' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'predecessor' ( ( ruleEString ) ) )? (otherlv_5= 'successor' ( ( ruleEString ) ) )? otherlv_7= 'requiredService' ( ( ruleEString ) ) otherlv_9= 'requiredRoleOfService' ( ( ruleEString ) ) otherlv_11= '}' ) ;
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
            // InternalCBSMDsl.g:2069:2: ( (otherlv_0= 'ExternalCall' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'predecessor' ( ( ruleEString ) ) )? (otherlv_5= 'successor' ( ( ruleEString ) ) )? otherlv_7= 'requiredService' ( ( ruleEString ) ) otherlv_9= 'requiredRoleOfService' ( ( ruleEString ) ) otherlv_11= '}' ) )
            // InternalCBSMDsl.g:2070:2: (otherlv_0= 'ExternalCall' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'predecessor' ( ( ruleEString ) ) )? (otherlv_5= 'successor' ( ( ruleEString ) ) )? otherlv_7= 'requiredService' ( ( ruleEString ) ) otherlv_9= 'requiredRoleOfService' ( ( ruleEString ) ) otherlv_11= '}' )
            {
            // InternalCBSMDsl.g:2070:2: (otherlv_0= 'ExternalCall' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'predecessor' ( ( ruleEString ) ) )? (otherlv_5= 'successor' ( ( ruleEString ) ) )? otherlv_7= 'requiredService' ( ( ruleEString ) ) otherlv_9= 'requiredRoleOfService' ( ( ruleEString ) ) otherlv_11= '}' )
            // InternalCBSMDsl.g:2071:3: otherlv_0= 'ExternalCall' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'predecessor' ( ( ruleEString ) ) )? (otherlv_5= 'successor' ( ( ruleEString ) ) )? otherlv_7= 'requiredService' ( ( ruleEString ) ) otherlv_9= 'requiredRoleOfService' ( ( ruleEString ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalCallAccess().getExternalCallKeyword_0());
            		
            // InternalCBSMDsl.g:2075:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBSMDsl.g:2076:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBSMDsl.g:2076:4: (lv_name_1_0= ruleEString )
            // InternalCBSMDsl.g:2077:5: lv_name_1_0= ruleEString
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
            						"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_51); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalCallAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCBSMDsl.g:2098:3: (otherlv_3= 'predecessor' ( ( ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==49) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCBSMDsl.g:2099:4: otherlv_3= 'predecessor' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_34); 

                    				newLeafNode(otherlv_3, grammarAccess.getExternalCallAccess().getPredecessorKeyword_3_0());
                    			
                    // InternalCBSMDsl.g:2103:4: ( ( ruleEString ) )
                    // InternalCBSMDsl.g:2104:5: ( ruleEString )
                    {
                    // InternalCBSMDsl.g:2104:5: ( ruleEString )
                    // InternalCBSMDsl.g:2105:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExternalCallRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getExternalCallAccess().getPredecessorActionCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCBSMDsl.g:2120:3: (otherlv_5= 'successor' ( ( ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==50) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalCBSMDsl.g:2121:4: otherlv_5= 'successor' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,50,FOLLOW_34); 

                    				newLeafNode(otherlv_5, grammarAccess.getExternalCallAccess().getSuccessorKeyword_4_0());
                    			
                    // InternalCBSMDsl.g:2125:4: ( ( ruleEString ) )
                    // InternalCBSMDsl.g:2126:5: ( ruleEString )
                    {
                    // InternalCBSMDsl.g:2126:5: ( ruleEString )
                    // InternalCBSMDsl.g:2127:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExternalCallRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getExternalCallAccess().getSuccessorActionCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,53,FOLLOW_34); 

            			newLeafNode(otherlv_7, grammarAccess.getExternalCallAccess().getRequiredServiceKeyword_5());
            		
            // InternalCBSMDsl.g:2146:3: ( ( ruleEString ) )
            // InternalCBSMDsl.g:2147:4: ( ruleEString )
            {
            // InternalCBSMDsl.g:2147:4: ( ruleEString )
            // InternalCBSMDsl.g:2148:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalCallRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExternalCallAccess().getRequiredServiceSignatureCrossReference_6_0());
            				
            pushFollow(FOLLOW_54);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,54,FOLLOW_34); 

            			newLeafNode(otherlv_9, grammarAccess.getExternalCallAccess().getRequiredRoleOfServiceKeyword_7());
            		
            // InternalCBSMDsl.g:2166:3: ( ( ruleEString ) )
            // InternalCBSMDsl.g:2167:4: ( ruleEString )
            {
            // InternalCBSMDsl.g:2167:4: ( ruleEString )
            // InternalCBSMDsl.g:2168:5: ruleEString
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

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

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
    // InternalCBSMDsl.g:2190:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalCBSMDsl.g:2190:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalCBSMDsl.g:2191:2: iv_ruleLoop= ruleLoop EOF
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
    // InternalCBSMDsl.g:2197:1: ruleLoop returns [EObject current=null] : ( () otherlv_1= 'Loop' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? (otherlv_8= 'loopActions' otherlv_9= '{' ( (lv_loopActions_10_0= ruleAction ) ) (otherlv_11= ',' ( (lv_loopActions_12_0= ruleAction ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
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
            // InternalCBSMDsl.g:2203:2: ( ( () otherlv_1= 'Loop' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? (otherlv_8= 'loopActions' otherlv_9= '{' ( (lv_loopActions_10_0= ruleAction ) ) (otherlv_11= ',' ( (lv_loopActions_12_0= ruleAction ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalCBSMDsl.g:2204:2: ( () otherlv_1= 'Loop' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? (otherlv_8= 'loopActions' otherlv_9= '{' ( (lv_loopActions_10_0= ruleAction ) ) (otherlv_11= ',' ( (lv_loopActions_12_0= ruleAction ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalCBSMDsl.g:2204:2: ( () otherlv_1= 'Loop' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? (otherlv_8= 'loopActions' otherlv_9= '{' ( (lv_loopActions_10_0= ruleAction ) ) (otherlv_11= ',' ( (lv_loopActions_12_0= ruleAction ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalCBSMDsl.g:2205:3: () otherlv_1= 'Loop' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? (otherlv_8= 'loopActions' otherlv_9= '{' ( (lv_loopActions_10_0= ruleAction ) ) (otherlv_11= ',' ( (lv_loopActions_12_0= ruleAction ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // InternalCBSMDsl.g:2205:3: ()
            // InternalCBSMDsl.g:2206:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoopAccess().getLoopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getLoopKeyword_1());
            		
            // InternalCBSMDsl.g:2216:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCBSMDsl.g:2217:4: (lv_name_2_0= ruleEString )
            {
            // InternalCBSMDsl.g:2217:4: (lv_name_2_0= ruleEString )
            // InternalCBSMDsl.g:2218:5: lv_name_2_0= ruleEString
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
            						"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_55); 

            			newLeafNode(otherlv_3, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCBSMDsl.g:2239:3: (otherlv_4= 'predecessor' ( ( ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==49) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalCBSMDsl.g:2240:4: otherlv_4= 'predecessor' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,49,FOLLOW_34); 

                    				newLeafNode(otherlv_4, grammarAccess.getLoopAccess().getPredecessorKeyword_4_0());
                    			
                    // InternalCBSMDsl.g:2244:4: ( ( ruleEString ) )
                    // InternalCBSMDsl.g:2245:5: ( ruleEString )
                    {
                    // InternalCBSMDsl.g:2245:5: ( ruleEString )
                    // InternalCBSMDsl.g:2246:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLoopRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLoopAccess().getPredecessorActionCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_56);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCBSMDsl.g:2261:3: (otherlv_6= 'successor' ( ( ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==50) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalCBSMDsl.g:2262:4: otherlv_6= 'successor' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,50,FOLLOW_34); 

                    				newLeafNode(otherlv_6, grammarAccess.getLoopAccess().getSuccessorKeyword_5_0());
                    			
                    // InternalCBSMDsl.g:2266:4: ( ( ruleEString ) )
                    // InternalCBSMDsl.g:2267:5: ( ruleEString )
                    {
                    // InternalCBSMDsl.g:2267:5: ( ruleEString )
                    // InternalCBSMDsl.g:2268:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLoopRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLoopAccess().getSuccessorActionCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_57);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCBSMDsl.g:2283:3: (otherlv_8= 'loopActions' otherlv_9= '{' ( (lv_loopActions_10_0= ruleAction ) ) (otherlv_11= ',' ( (lv_loopActions_12_0= ruleAction ) ) )* otherlv_13= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==56) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalCBSMDsl.g:2284:4: otherlv_8= 'loopActions' otherlv_9= '{' ( (lv_loopActions_10_0= ruleAction ) ) (otherlv_11= ',' ( (lv_loopActions_12_0= ruleAction ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,56,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getLoopAccess().getLoopActionsKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_48); 

                    				newLeafNode(otherlv_9, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCBSMDsl.g:2292:4: ( (lv_loopActions_10_0= ruleAction ) )
                    // InternalCBSMDsl.g:2293:5: (lv_loopActions_10_0= ruleAction )
                    {
                    // InternalCBSMDsl.g:2293:5: (lv_loopActions_10_0= ruleAction )
                    // InternalCBSMDsl.g:2294:6: lv_loopActions_10_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getLoopAccess().getLoopActionsActionParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_loopActions_10_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoopRule());
                    						}
                    						add(
                    							current,
                    							"loopActions",
                    							lv_loopActions_10_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBSMDsl.g:2311:4: (otherlv_11= ',' ( (lv_loopActions_12_0= ruleAction ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==20) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalCBSMDsl.g:2312:5: otherlv_11= ',' ( (lv_loopActions_12_0= ruleAction ) )
                    	    {
                    	    otherlv_11=(Token)match(input,20,FOLLOW_48); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getLoopAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCBSMDsl.g:2316:5: ( (lv_loopActions_12_0= ruleAction ) )
                    	    // InternalCBSMDsl.g:2317:6: (lv_loopActions_12_0= ruleAction )
                    	    {
                    	    // InternalCBSMDsl.g:2317:6: (lv_loopActions_12_0= ruleAction )
                    	    // InternalCBSMDsl.g:2318:7: lv_loopActions_12_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getLoopAccess().getLoopActionsActionParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_loopActions_12_0=ruleAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLoopRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"loopActions",
                    	    								lv_loopActions_12_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_13, grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,17,FOLLOW_2); 

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
    // InternalCBSMDsl.g:2349:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // InternalCBSMDsl.g:2349:47: (iv_ruleBranch= ruleBranch EOF )
            // InternalCBSMDsl.g:2350:2: iv_ruleBranch= ruleBranch EOF
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
    // InternalCBSMDsl.g:2356:1: ruleBranch returns [EObject current=null] : ( () otherlv_1= 'Branch' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? (otherlv_8= 'branchPaths' otherlv_9= '{' ( (lv_branchPaths_10_0= ruleBranchPath ) ) (otherlv_11= ',' ( (lv_branchPaths_12_0= ruleBranchPath ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
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
            // InternalCBSMDsl.g:2362:2: ( ( () otherlv_1= 'Branch' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? (otherlv_8= 'branchPaths' otherlv_9= '{' ( (lv_branchPaths_10_0= ruleBranchPath ) ) (otherlv_11= ',' ( (lv_branchPaths_12_0= ruleBranchPath ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalCBSMDsl.g:2363:2: ( () otherlv_1= 'Branch' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? (otherlv_8= 'branchPaths' otherlv_9= '{' ( (lv_branchPaths_10_0= ruleBranchPath ) ) (otherlv_11= ',' ( (lv_branchPaths_12_0= ruleBranchPath ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalCBSMDsl.g:2363:2: ( () otherlv_1= 'Branch' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? (otherlv_8= 'branchPaths' otherlv_9= '{' ( (lv_branchPaths_10_0= ruleBranchPath ) ) (otherlv_11= ',' ( (lv_branchPaths_12_0= ruleBranchPath ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalCBSMDsl.g:2364:3: () otherlv_1= 'Branch' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'predecessor' ( ( ruleEString ) ) )? (otherlv_6= 'successor' ( ( ruleEString ) ) )? (otherlv_8= 'branchPaths' otherlv_9= '{' ( (lv_branchPaths_10_0= ruleBranchPath ) ) (otherlv_11= ',' ( (lv_branchPaths_12_0= ruleBranchPath ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // InternalCBSMDsl.g:2364:3: ()
            // InternalCBSMDsl.g:2365:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBranchAccess().getBranchAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,57,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getBranchAccess().getBranchKeyword_1());
            		
            // InternalCBSMDsl.g:2375:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCBSMDsl.g:2376:4: (lv_name_2_0= ruleEString )
            {
            // InternalCBSMDsl.g:2376:4: (lv_name_2_0= ruleEString )
            // InternalCBSMDsl.g:2377:5: lv_name_2_0= ruleEString
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
            						"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_58); 

            			newLeafNode(otherlv_3, grammarAccess.getBranchAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCBSMDsl.g:2398:3: (otherlv_4= 'predecessor' ( ( ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==49) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalCBSMDsl.g:2399:4: otherlv_4= 'predecessor' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,49,FOLLOW_34); 

                    				newLeafNode(otherlv_4, grammarAccess.getBranchAccess().getPredecessorKeyword_4_0());
                    			
                    // InternalCBSMDsl.g:2403:4: ( ( ruleEString ) )
                    // InternalCBSMDsl.g:2404:5: ( ruleEString )
                    {
                    // InternalCBSMDsl.g:2404:5: ( ruleEString )
                    // InternalCBSMDsl.g:2405:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBranchRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBranchAccess().getPredecessorActionCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_59);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCBSMDsl.g:2420:3: (otherlv_6= 'successor' ( ( ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==50) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalCBSMDsl.g:2421:4: otherlv_6= 'successor' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,50,FOLLOW_34); 

                    				newLeafNode(otherlv_6, grammarAccess.getBranchAccess().getSuccessorKeyword_5_0());
                    			
                    // InternalCBSMDsl.g:2425:4: ( ( ruleEString ) )
                    // InternalCBSMDsl.g:2426:5: ( ruleEString )
                    {
                    // InternalCBSMDsl.g:2426:5: ( ruleEString )
                    // InternalCBSMDsl.g:2427:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBranchRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBranchAccess().getSuccessorActionCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_60);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCBSMDsl.g:2442:3: (otherlv_8= 'branchPaths' otherlv_9= '{' ( (lv_branchPaths_10_0= ruleBranchPath ) ) (otherlv_11= ',' ( (lv_branchPaths_12_0= ruleBranchPath ) ) )* otherlv_13= '}' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==58) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalCBSMDsl.g:2443:4: otherlv_8= 'branchPaths' otherlv_9= '{' ( (lv_branchPaths_10_0= ruleBranchPath ) ) (otherlv_11= ',' ( (lv_branchPaths_12_0= ruleBranchPath ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,58,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getBranchAccess().getBranchPathsKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_61); 

                    				newLeafNode(otherlv_9, grammarAccess.getBranchAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCBSMDsl.g:2451:4: ( (lv_branchPaths_10_0= ruleBranchPath ) )
                    // InternalCBSMDsl.g:2452:5: (lv_branchPaths_10_0= ruleBranchPath )
                    {
                    // InternalCBSMDsl.g:2452:5: (lv_branchPaths_10_0= ruleBranchPath )
                    // InternalCBSMDsl.g:2453:6: lv_branchPaths_10_0= ruleBranchPath
                    {

                    						newCompositeNode(grammarAccess.getBranchAccess().getBranchPathsBranchPathParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_branchPaths_10_0=ruleBranchPath();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBranchRule());
                    						}
                    						add(
                    							current,
                    							"branchPaths",
                    							lv_branchPaths_10_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.BranchPath");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBSMDsl.g:2470:4: (otherlv_11= ',' ( (lv_branchPaths_12_0= ruleBranchPath ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==20) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalCBSMDsl.g:2471:5: otherlv_11= ',' ( (lv_branchPaths_12_0= ruleBranchPath ) )
                    	    {
                    	    otherlv_11=(Token)match(input,20,FOLLOW_61); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getBranchAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCBSMDsl.g:2475:5: ( (lv_branchPaths_12_0= ruleBranchPath ) )
                    	    // InternalCBSMDsl.g:2476:6: (lv_branchPaths_12_0= ruleBranchPath )
                    	    {
                    	    // InternalCBSMDsl.g:2476:6: (lv_branchPaths_12_0= ruleBranchPath )
                    	    // InternalCBSMDsl.g:2477:7: lv_branchPaths_12_0= ruleBranchPath
                    	    {

                    	    							newCompositeNode(grammarAccess.getBranchAccess().getBranchPathsBranchPathParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_branchPaths_12_0=ruleBranchPath();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBranchRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"branchPaths",
                    	    								lv_branchPaths_12_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.BranchPath");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_13, grammarAccess.getBranchAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,17,FOLLOW_2); 

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
    // InternalCBSMDsl.g:2508:1: entryRuleBranchPath returns [EObject current=null] : iv_ruleBranchPath= ruleBranchPath EOF ;
    public final EObject entryRuleBranchPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranchPath = null;


        try {
            // InternalCBSMDsl.g:2508:51: (iv_ruleBranchPath= ruleBranchPath EOF )
            // InternalCBSMDsl.g:2509:2: iv_ruleBranchPath= ruleBranchPath EOF
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
    // InternalCBSMDsl.g:2515:1: ruleBranchPath returns [EObject current=null] : ( () otherlv_1= 'BranchPath' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pathActions' otherlv_5= '{' ( (lv_pathActions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_pathActions_8_0= ruleAction ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
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
            // InternalCBSMDsl.g:2521:2: ( ( () otherlv_1= 'BranchPath' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pathActions' otherlv_5= '{' ( (lv_pathActions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_pathActions_8_0= ruleAction ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalCBSMDsl.g:2522:2: ( () otherlv_1= 'BranchPath' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pathActions' otherlv_5= '{' ( (lv_pathActions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_pathActions_8_0= ruleAction ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalCBSMDsl.g:2522:2: ( () otherlv_1= 'BranchPath' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pathActions' otherlv_5= '{' ( (lv_pathActions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_pathActions_8_0= ruleAction ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalCBSMDsl.g:2523:3: () otherlv_1= 'BranchPath' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pathActions' otherlv_5= '{' ( (lv_pathActions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_pathActions_8_0= ruleAction ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalCBSMDsl.g:2523:3: ()
            // InternalCBSMDsl.g:2524:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBranchPathAccess().getBranchPathAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,59,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getBranchPathAccess().getBranchPathKeyword_1());
            		
            // InternalCBSMDsl.g:2534:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCBSMDsl.g:2535:4: (lv_name_2_0= ruleEString )
            {
            // InternalCBSMDsl.g:2535:4: (lv_name_2_0= ruleEString )
            // InternalCBSMDsl.g:2536:5: lv_name_2_0= ruleEString
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
            						"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_62); 

            			newLeafNode(otherlv_3, grammarAccess.getBranchPathAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCBSMDsl.g:2557:3: (otherlv_4= 'pathActions' otherlv_5= '{' ( (lv_pathActions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_pathActions_8_0= ruleAction ) ) )* otherlv_9= '}' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==60) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalCBSMDsl.g:2558:4: otherlv_4= 'pathActions' otherlv_5= '{' ( (lv_pathActions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_pathActions_8_0= ruleAction ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,60,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getBranchPathAccess().getPathActionsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_48); 

                    				newLeafNode(otherlv_5, grammarAccess.getBranchPathAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCBSMDsl.g:2566:4: ( (lv_pathActions_6_0= ruleAction ) )
                    // InternalCBSMDsl.g:2567:5: (lv_pathActions_6_0= ruleAction )
                    {
                    // InternalCBSMDsl.g:2567:5: (lv_pathActions_6_0= ruleAction )
                    // InternalCBSMDsl.g:2568:6: lv_pathActions_6_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getBranchPathAccess().getPathActionsActionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_pathActions_6_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBranchPathRule());
                    						}
                    						add(
                    							current,
                    							"pathActions",
                    							lv_pathActions_6_0,
                    							"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBSMDsl.g:2585:4: (otherlv_7= ',' ( (lv_pathActions_8_0= ruleAction ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==20) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalCBSMDsl.g:2586:5: otherlv_7= ',' ( (lv_pathActions_8_0= ruleAction ) )
                    	    {
                    	    otherlv_7=(Token)match(input,20,FOLLOW_48); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getBranchPathAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCBSMDsl.g:2590:5: ( (lv_pathActions_8_0= ruleAction ) )
                    	    // InternalCBSMDsl.g:2591:6: (lv_pathActions_8_0= ruleAction )
                    	    {
                    	    // InternalCBSMDsl.g:2591:6: (lv_pathActions_8_0= ruleAction )
                    	    // InternalCBSMDsl.g:2592:7: lv_pathActions_8_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getBranchPathAccess().getPathActionsActionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_pathActions_8_0=ruleAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBranchPathRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"pathActions",
                    	    								lv_pathActions_8_0,
                    	    								"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getBranchPathAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_2); 

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
    // InternalCBSMDsl.g:2623:1: entryRuleComplexType returns [EObject current=null] : iv_ruleComplexType= ruleComplexType EOF ;
    public final EObject entryRuleComplexType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexType = null;


        try {
            // InternalCBSMDsl.g:2623:52: (iv_ruleComplexType= ruleComplexType EOF )
            // InternalCBSMDsl.g:2624:2: iv_ruleComplexType= ruleComplexType EOF
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
    // InternalCBSMDsl.g:2630:1: ruleComplexType returns [EObject current=null] : ( () otherlv_1= 'ComplexType' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleComplexType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalCBSMDsl.g:2636:2: ( ( () otherlv_1= 'ComplexType' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalCBSMDsl.g:2637:2: ( () otherlv_1= 'ComplexType' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalCBSMDsl.g:2637:2: ( () otherlv_1= 'ComplexType' ( (lv_name_2_0= ruleEString ) ) )
            // InternalCBSMDsl.g:2638:3: () otherlv_1= 'ComplexType' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalCBSMDsl.g:2638:3: ()
            // InternalCBSMDsl.g:2639:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComplexTypeAccess().getComplexTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,61,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexTypeAccess().getComplexTypeKeyword_1());
            		
            // InternalCBSMDsl.g:2649:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCBSMDsl.g:2650:4: (lv_name_2_0= ruleEString )
            {
            // InternalCBSMDsl.g:2650:4: (lv_name_2_0= ruleEString )
            // InternalCBSMDsl.g:2651:5: lv_name_2_0= ruleEString
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
            						"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.EString");
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
    // InternalCBSMDsl.g:2672:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // InternalCBSMDsl.g:2672:51: (iv_ruleSimpleType= ruleSimpleType EOF )
            // InternalCBSMDsl.g:2673:2: iv_ruleSimpleType= ruleSimpleType EOF
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
    // InternalCBSMDsl.g:2679:1: ruleSimpleType returns [EObject current=null] : (otherlv_0= 'SimpleType' otherlv_1= '{' otherlv_2= 'typeInstance' ( (lv_typeInstance_3_0= ruleSimpleTypeInstance ) ) otherlv_4= '}' ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_typeInstance_3_0 = null;



        	enterRule();

        try {
            // InternalCBSMDsl.g:2685:2: ( (otherlv_0= 'SimpleType' otherlv_1= '{' otherlv_2= 'typeInstance' ( (lv_typeInstance_3_0= ruleSimpleTypeInstance ) ) otherlv_4= '}' ) )
            // InternalCBSMDsl.g:2686:2: (otherlv_0= 'SimpleType' otherlv_1= '{' otherlv_2= 'typeInstance' ( (lv_typeInstance_3_0= ruleSimpleTypeInstance ) ) otherlv_4= '}' )
            {
            // InternalCBSMDsl.g:2686:2: (otherlv_0= 'SimpleType' otherlv_1= '{' otherlv_2= 'typeInstance' ( (lv_typeInstance_3_0= ruleSimpleTypeInstance ) ) otherlv_4= '}' )
            // InternalCBSMDsl.g:2687:3: otherlv_0= 'SimpleType' otherlv_1= '{' otherlv_2= 'typeInstance' ( (lv_typeInstance_3_0= ruleSimpleTypeInstance ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSimpleTypeAccess().getSimpleTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_63); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,63,FOLLOW_64); 

            			newLeafNode(otherlv_2, grammarAccess.getSimpleTypeAccess().getTypeInstanceKeyword_2());
            		
            // InternalCBSMDsl.g:2699:3: ( (lv_typeInstance_3_0= ruleSimpleTypeInstance ) )
            // InternalCBSMDsl.g:2700:4: (lv_typeInstance_3_0= ruleSimpleTypeInstance )
            {
            // InternalCBSMDsl.g:2700:4: (lv_typeInstance_3_0= ruleSimpleTypeInstance )
            // InternalCBSMDsl.g:2701:5: lv_typeInstance_3_0= ruleSimpleTypeInstance
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
            						"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.SimpleTypeInstance");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

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
    // InternalCBSMDsl.g:2726:1: entryRuleAssemblyContext returns [EObject current=null] : iv_ruleAssemblyContext= ruleAssemblyContext EOF ;
    public final EObject entryRuleAssemblyContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyContext = null;


        try {
            // InternalCBSMDsl.g:2726:56: (iv_ruleAssemblyContext= ruleAssemblyContext EOF )
            // InternalCBSMDsl.g:2727:2: iv_ruleAssemblyContext= ruleAssemblyContext EOF
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
    // InternalCBSMDsl.g:2733:1: ruleAssemblyContext returns [EObject current=null] : (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instantiatedComponent' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleAssemblyContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCBSMDsl.g:2739:2: ( (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instantiatedComponent' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalCBSMDsl.g:2740:2: (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instantiatedComponent' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalCBSMDsl.g:2740:2: (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instantiatedComponent' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalCBSMDsl.g:2741:3: otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instantiatedComponent' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyContextAccess().getAssemblyContextKeyword_0());
            		
            // InternalCBSMDsl.g:2745:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBSMDsl.g:2746:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBSMDsl.g:2746:4: (lv_name_1_0= ruleEString )
            // InternalCBSMDsl.g:2747:5: lv_name_1_0= ruleEString
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
            						"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_65); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,65,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getAssemblyContextAccess().getInstantiatedComponentKeyword_3());
            		
            // InternalCBSMDsl.g:2772:3: ( ( ruleEString ) )
            // InternalCBSMDsl.g:2773:4: ( ruleEString )
            {
            // InternalCBSMDsl.g:2773:4: ( ruleEString )
            // InternalCBSMDsl.g:2774:5: ruleEString
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

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

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
    // InternalCBSMDsl.g:2796:1: entryRuleProvidedDelegationConnector returns [EObject current=null] : iv_ruleProvidedDelegationConnector= ruleProvidedDelegationConnector EOF ;
    public final EObject entryRuleProvidedDelegationConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedDelegationConnector = null;


        try {
            // InternalCBSMDsl.g:2796:68: (iv_ruleProvidedDelegationConnector= ruleProvidedDelegationConnector EOF )
            // InternalCBSMDsl.g:2797:2: iv_ruleProvidedDelegationConnector= ruleProvidedDelegationConnector EOF
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
    // InternalCBSMDsl.g:2803:1: ruleProvidedDelegationConnector returns [EObject current=null] : (otherlv_0= 'ProvidedDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'innerAssemblyContext' ( ( ruleEString ) ) otherlv_5= 'outerAssemblyContext' ( ( ruleEString ) ) otherlv_7= 'innerProvidedRole' ( ( ruleEString ) ) otherlv_9= 'outerProvidedRole' ( ( ruleEString ) ) otherlv_11= '}' ) ;
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
            // InternalCBSMDsl.g:2809:2: ( (otherlv_0= 'ProvidedDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'innerAssemblyContext' ( ( ruleEString ) ) otherlv_5= 'outerAssemblyContext' ( ( ruleEString ) ) otherlv_7= 'innerProvidedRole' ( ( ruleEString ) ) otherlv_9= 'outerProvidedRole' ( ( ruleEString ) ) otherlv_11= '}' ) )
            // InternalCBSMDsl.g:2810:2: (otherlv_0= 'ProvidedDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'innerAssemblyContext' ( ( ruleEString ) ) otherlv_5= 'outerAssemblyContext' ( ( ruleEString ) ) otherlv_7= 'innerProvidedRole' ( ( ruleEString ) ) otherlv_9= 'outerProvidedRole' ( ( ruleEString ) ) otherlv_11= '}' )
            {
            // InternalCBSMDsl.g:2810:2: (otherlv_0= 'ProvidedDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'innerAssemblyContext' ( ( ruleEString ) ) otherlv_5= 'outerAssemblyContext' ( ( ruleEString ) ) otherlv_7= 'innerProvidedRole' ( ( ruleEString ) ) otherlv_9= 'outerProvidedRole' ( ( ruleEString ) ) otherlv_11= '}' )
            // InternalCBSMDsl.g:2811:3: otherlv_0= 'ProvidedDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'innerAssemblyContext' ( ( ruleEString ) ) otherlv_5= 'outerAssemblyContext' ( ( ruleEString ) ) otherlv_7= 'innerProvidedRole' ( ( ruleEString ) ) otherlv_9= 'outerProvidedRole' ( ( ruleEString ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getProvidedDelegationConnectorAccess().getProvidedDelegationConnectorKeyword_0());
            		
            // InternalCBSMDsl.g:2815:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBSMDsl.g:2816:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBSMDsl.g:2816:4: (lv_name_1_0= ruleEString )
            // InternalCBSMDsl.g:2817:5: lv_name_1_0= ruleEString
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
            						"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_66); 

            			newLeafNode(otherlv_2, grammarAccess.getProvidedDelegationConnectorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,67,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getProvidedDelegationConnectorAccess().getInnerAssemblyContextKeyword_3());
            		
            // InternalCBSMDsl.g:2842:3: ( ( ruleEString ) )
            // InternalCBSMDsl.g:2843:4: ( ruleEString )
            {
            // InternalCBSMDsl.g:2843:4: ( ruleEString )
            // InternalCBSMDsl.g:2844:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProvidedDelegationConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getProvidedDelegationConnectorAccess().getInnerAssemblyContextAssemblyContextCrossReference_4_0());
            				
            pushFollow(FOLLOW_67);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,68,FOLLOW_34); 

            			newLeafNode(otherlv_5, grammarAccess.getProvidedDelegationConnectorAccess().getOuterAssemblyContextKeyword_5());
            		
            // InternalCBSMDsl.g:2862:3: ( ( ruleEString ) )
            // InternalCBSMDsl.g:2863:4: ( ruleEString )
            {
            // InternalCBSMDsl.g:2863:4: ( ruleEString )
            // InternalCBSMDsl.g:2864:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProvidedDelegationConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getProvidedDelegationConnectorAccess().getOuterAssemblyContextAssemblyContextCrossReference_6_0());
            				
            pushFollow(FOLLOW_68);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,69,FOLLOW_34); 

            			newLeafNode(otherlv_7, grammarAccess.getProvidedDelegationConnectorAccess().getInnerProvidedRoleKeyword_7());
            		
            // InternalCBSMDsl.g:2882:3: ( ( ruleEString ) )
            // InternalCBSMDsl.g:2883:4: ( ruleEString )
            {
            // InternalCBSMDsl.g:2883:4: ( ruleEString )
            // InternalCBSMDsl.g:2884:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProvidedDelegationConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getProvidedDelegationConnectorAccess().getInnerProvidedRoleProvidedRoleCrossReference_8_0());
            				
            pushFollow(FOLLOW_69);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,70,FOLLOW_34); 

            			newLeafNode(otherlv_9, grammarAccess.getProvidedDelegationConnectorAccess().getOuterProvidedRoleKeyword_9());
            		
            // InternalCBSMDsl.g:2902:3: ( ( ruleEString ) )
            // InternalCBSMDsl.g:2903:4: ( ruleEString )
            {
            // InternalCBSMDsl.g:2903:4: ( ruleEString )
            // InternalCBSMDsl.g:2904:5: ruleEString
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

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

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
    // InternalCBSMDsl.g:2926:1: entryRuleRequiredDelegationConnector returns [EObject current=null] : iv_ruleRequiredDelegationConnector= ruleRequiredDelegationConnector EOF ;
    public final EObject entryRuleRequiredDelegationConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredDelegationConnector = null;


        try {
            // InternalCBSMDsl.g:2926:68: (iv_ruleRequiredDelegationConnector= ruleRequiredDelegationConnector EOF )
            // InternalCBSMDsl.g:2927:2: iv_ruleRequiredDelegationConnector= ruleRequiredDelegationConnector EOF
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
    // InternalCBSMDsl.g:2933:1: ruleRequiredDelegationConnector returns [EObject current=null] : (otherlv_0= 'RequiredDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'innerAssemblyContext' ( ( ruleEString ) ) otherlv_5= 'outerAssemblyContext' ( ( ruleEString ) ) otherlv_7= 'innerRequiredRole' ( ( ruleEString ) ) otherlv_9= 'outerRequiredRole' ( ( ruleEString ) ) otherlv_11= '}' ) ;
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
            // InternalCBSMDsl.g:2939:2: ( (otherlv_0= 'RequiredDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'innerAssemblyContext' ( ( ruleEString ) ) otherlv_5= 'outerAssemblyContext' ( ( ruleEString ) ) otherlv_7= 'innerRequiredRole' ( ( ruleEString ) ) otherlv_9= 'outerRequiredRole' ( ( ruleEString ) ) otherlv_11= '}' ) )
            // InternalCBSMDsl.g:2940:2: (otherlv_0= 'RequiredDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'innerAssemblyContext' ( ( ruleEString ) ) otherlv_5= 'outerAssemblyContext' ( ( ruleEString ) ) otherlv_7= 'innerRequiredRole' ( ( ruleEString ) ) otherlv_9= 'outerRequiredRole' ( ( ruleEString ) ) otherlv_11= '}' )
            {
            // InternalCBSMDsl.g:2940:2: (otherlv_0= 'RequiredDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'innerAssemblyContext' ( ( ruleEString ) ) otherlv_5= 'outerAssemblyContext' ( ( ruleEString ) ) otherlv_7= 'innerRequiredRole' ( ( ruleEString ) ) otherlv_9= 'outerRequiredRole' ( ( ruleEString ) ) otherlv_11= '}' )
            // InternalCBSMDsl.g:2941:3: otherlv_0= 'RequiredDelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'innerAssemblyContext' ( ( ruleEString ) ) otherlv_5= 'outerAssemblyContext' ( ( ruleEString ) ) otherlv_7= 'innerRequiredRole' ( ( ruleEString ) ) otherlv_9= 'outerRequiredRole' ( ( ruleEString ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getRequiredDelegationConnectorAccess().getRequiredDelegationConnectorKeyword_0());
            		
            // InternalCBSMDsl.g:2945:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBSMDsl.g:2946:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBSMDsl.g:2946:4: (lv_name_1_0= ruleEString )
            // InternalCBSMDsl.g:2947:5: lv_name_1_0= ruleEString
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
            						"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_66); 

            			newLeafNode(otherlv_2, grammarAccess.getRequiredDelegationConnectorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,67,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getRequiredDelegationConnectorAccess().getInnerAssemblyContextKeyword_3());
            		
            // InternalCBSMDsl.g:2972:3: ( ( ruleEString ) )
            // InternalCBSMDsl.g:2973:4: ( ruleEString )
            {
            // InternalCBSMDsl.g:2973:4: ( ruleEString )
            // InternalCBSMDsl.g:2974:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequiredDelegationConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRequiredDelegationConnectorAccess().getInnerAssemblyContextAssemblyContextCrossReference_4_0());
            				
            pushFollow(FOLLOW_67);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,68,FOLLOW_34); 

            			newLeafNode(otherlv_5, grammarAccess.getRequiredDelegationConnectorAccess().getOuterAssemblyContextKeyword_5());
            		
            // InternalCBSMDsl.g:2992:3: ( ( ruleEString ) )
            // InternalCBSMDsl.g:2993:4: ( ruleEString )
            {
            // InternalCBSMDsl.g:2993:4: ( ruleEString )
            // InternalCBSMDsl.g:2994:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequiredDelegationConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRequiredDelegationConnectorAccess().getOuterAssemblyContextAssemblyContextCrossReference_6_0());
            				
            pushFollow(FOLLOW_70);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,72,FOLLOW_34); 

            			newLeafNode(otherlv_7, grammarAccess.getRequiredDelegationConnectorAccess().getInnerRequiredRoleKeyword_7());
            		
            // InternalCBSMDsl.g:3012:3: ( ( ruleEString ) )
            // InternalCBSMDsl.g:3013:4: ( ruleEString )
            {
            // InternalCBSMDsl.g:3013:4: ( ruleEString )
            // InternalCBSMDsl.g:3014:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequiredDelegationConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRequiredDelegationConnectorAccess().getInnerRequiredRoleRequiredRoleCrossReference_8_0());
            				
            pushFollow(FOLLOW_71);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,73,FOLLOW_34); 

            			newLeafNode(otherlv_9, grammarAccess.getRequiredDelegationConnectorAccess().getOuterRequiredRoleKeyword_9());
            		
            // InternalCBSMDsl.g:3032:3: ( ( ruleEString ) )
            // InternalCBSMDsl.g:3033:4: ( ruleEString )
            {
            // InternalCBSMDsl.g:3033:4: ( ruleEString )
            // InternalCBSMDsl.g:3034:5: ruleEString
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

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

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
    // InternalCBSMDsl.g:3056:1: entryRuleAssemblyConnector returns [EObject current=null] : iv_ruleAssemblyConnector= ruleAssemblyConnector EOF ;
    public final EObject entryRuleAssemblyConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyConnector = null;


        try {
            // InternalCBSMDsl.g:3056:58: (iv_ruleAssemblyConnector= ruleAssemblyConnector EOF )
            // InternalCBSMDsl.g:3057:2: iv_ruleAssemblyConnector= ruleAssemblyConnector EOF
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
    // InternalCBSMDsl.g:3063:1: ruleAssemblyConnector returns [EObject current=null] : (otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'connectedProvidedRole' ( ( ruleEString ) ) otherlv_5= 'connectedRequiredRole' ( ( ruleEString ) ) otherlv_7= 'connectedProvidedAssemblyContext' ( ( ruleEString ) ) otherlv_9= 'connectedRequiredAssemblyContext' ( ( ruleEString ) ) otherlv_11= '}' ) ;
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
            // InternalCBSMDsl.g:3069:2: ( (otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'connectedProvidedRole' ( ( ruleEString ) ) otherlv_5= 'connectedRequiredRole' ( ( ruleEString ) ) otherlv_7= 'connectedProvidedAssemblyContext' ( ( ruleEString ) ) otherlv_9= 'connectedRequiredAssemblyContext' ( ( ruleEString ) ) otherlv_11= '}' ) )
            // InternalCBSMDsl.g:3070:2: (otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'connectedProvidedRole' ( ( ruleEString ) ) otherlv_5= 'connectedRequiredRole' ( ( ruleEString ) ) otherlv_7= 'connectedProvidedAssemblyContext' ( ( ruleEString ) ) otherlv_9= 'connectedRequiredAssemblyContext' ( ( ruleEString ) ) otherlv_11= '}' )
            {
            // InternalCBSMDsl.g:3070:2: (otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'connectedProvidedRole' ( ( ruleEString ) ) otherlv_5= 'connectedRequiredRole' ( ( ruleEString ) ) otherlv_7= 'connectedProvidedAssemblyContext' ( ( ruleEString ) ) otherlv_9= 'connectedRequiredAssemblyContext' ( ( ruleEString ) ) otherlv_11= '}' )
            // InternalCBSMDsl.g:3071:3: otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'connectedProvidedRole' ( ( ruleEString ) ) otherlv_5= 'connectedRequiredRole' ( ( ruleEString ) ) otherlv_7= 'connectedProvidedAssemblyContext' ( ( ruleEString ) ) otherlv_9= 'connectedRequiredAssemblyContext' ( ( ruleEString ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,74,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyConnectorAccess().getAssemblyConnectorKeyword_0());
            		
            // InternalCBSMDsl.g:3075:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBSMDsl.g:3076:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBSMDsl.g:3076:4: (lv_name_1_0= ruleEString )
            // InternalCBSMDsl.g:3077:5: lv_name_1_0= ruleEString
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
            						"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_72); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyConnectorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,75,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getAssemblyConnectorAccess().getConnectedProvidedRoleKeyword_3());
            		
            // InternalCBSMDsl.g:3102:3: ( ( ruleEString ) )
            // InternalCBSMDsl.g:3103:4: ( ruleEString )
            {
            // InternalCBSMDsl.g:3103:4: ( ruleEString )
            // InternalCBSMDsl.g:3104:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getConnectedProvidedRoleProvidedRoleCrossReference_4_0());
            				
            pushFollow(FOLLOW_73);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,76,FOLLOW_34); 

            			newLeafNode(otherlv_5, grammarAccess.getAssemblyConnectorAccess().getConnectedRequiredRoleKeyword_5());
            		
            // InternalCBSMDsl.g:3122:3: ( ( ruleEString ) )
            // InternalCBSMDsl.g:3123:4: ( ruleEString )
            {
            // InternalCBSMDsl.g:3123:4: ( ruleEString )
            // InternalCBSMDsl.g:3124:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getConnectedRequiredRoleRequiredRoleCrossReference_6_0());
            				
            pushFollow(FOLLOW_74);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,77,FOLLOW_34); 

            			newLeafNode(otherlv_7, grammarAccess.getAssemblyConnectorAccess().getConnectedProvidedAssemblyContextKeyword_7());
            		
            // InternalCBSMDsl.g:3142:3: ( ( ruleEString ) )
            // InternalCBSMDsl.g:3143:4: ( ruleEString )
            {
            // InternalCBSMDsl.g:3143:4: ( ruleEString )
            // InternalCBSMDsl.g:3144:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getConnectedProvidedAssemblyContextAssemblyContextCrossReference_8_0());
            				
            pushFollow(FOLLOW_75);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,78,FOLLOW_34); 

            			newLeafNode(otherlv_9, grammarAccess.getAssemblyConnectorAccess().getConnectedRequiredAssemblyContextKeyword_9());
            		
            // InternalCBSMDsl.g:3162:3: ( ( ruleEString ) )
            // InternalCBSMDsl.g:3163:4: ( ruleEString )
            {
            // InternalCBSMDsl.g:3163:4: ( ruleEString )
            // InternalCBSMDsl.g:3164:5: ruleEString
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

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

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
    // InternalCBSMDsl.g:3186:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalCBSMDsl.g:3186:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalCBSMDsl.g:3187:2: iv_ruleContainer= ruleContainer EOF
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
    // InternalCBSMDsl.g:3193:1: ruleContainer returns [EObject current=null] : ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalCBSMDsl.g:3199:2: ( ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalCBSMDsl.g:3200:2: ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalCBSMDsl.g:3200:2: ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) )
            // InternalCBSMDsl.g:3201:3: () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalCBSMDsl.g:3201:3: ()
            // InternalCBSMDsl.g:3202:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContainerAccess().getContainerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,79,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getContainerKeyword_1());
            		
            // InternalCBSMDsl.g:3212:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCBSMDsl.g:3213:4: (lv_name_2_0= ruleEString )
            {
            // InternalCBSMDsl.g:3213:4: (lv_name_2_0= ruleEString )
            // InternalCBSMDsl.g:3214:5: lv_name_2_0= ruleEString
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
            						"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.EString");
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
    // InternalCBSMDsl.g:3235:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalCBSMDsl.g:3235:45: (iv_ruleLink= ruleLink EOF )
            // InternalCBSMDsl.g:3236:2: iv_ruleLink= ruleLink EOF
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
    // InternalCBSMDsl.g:3242:1: ruleLink returns [EObject current=null] : (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'linkedContainers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) ;
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
            // InternalCBSMDsl.g:3248:2: ( (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'linkedContainers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) )
            // InternalCBSMDsl.g:3249:2: (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'linkedContainers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            {
            // InternalCBSMDsl.g:3249:2: (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'linkedContainers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            // InternalCBSMDsl.g:3250:3: otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'linkedContainers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            // InternalCBSMDsl.g:3254:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBSMDsl.g:3255:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBSMDsl.g:3255:4: (lv_name_1_0= ruleEString )
            // InternalCBSMDsl.g:3256:5: lv_name_1_0= ruleEString
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
            						"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_76); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,81,FOLLOW_77); 

            			newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getLinkedContainersKeyword_3());
            		
            otherlv_4=(Token)match(input,82,FOLLOW_34); 

            			newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getLeftParenthesisKeyword_4());
            		
            // InternalCBSMDsl.g:3285:3: ( ( ruleEString ) )
            // InternalCBSMDsl.g:3286:4: ( ruleEString )
            {
            // InternalCBSMDsl.g:3286:4: ( ruleEString )
            // InternalCBSMDsl.g:3287:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLinkAccess().getLinkedContainersContainerCrossReference_5_0());
            				
            pushFollow(FOLLOW_78);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBSMDsl.g:3301:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==20) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalCBSMDsl.g:3302:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,20,FOLLOW_34); 

            	    				newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalCBSMDsl.g:3306:4: ( ( ruleEString ) )
            	    // InternalCBSMDsl.g:3307:5: ( ruleEString )
            	    {
            	    // InternalCBSMDsl.g:3307:5: ( ruleEString )
            	    // InternalCBSMDsl.g:3308:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLinkRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getLinkAccess().getLinkedContainersContainerCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_78);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            otherlv_8=(Token)match(input,83,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getLinkAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,17,FOLLOW_2); 

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
    // InternalCBSMDsl.g:3335:1: entryRuleAllocationContext returns [EObject current=null] : iv_ruleAllocationContext= ruleAllocationContext EOF ;
    public final EObject entryRuleAllocationContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocationContext = null;


        try {
            // InternalCBSMDsl.g:3335:58: (iv_ruleAllocationContext= ruleAllocationContext EOF )
            // InternalCBSMDsl.g:3336:2: iv_ruleAllocationContext= ruleAllocationContext EOF
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
    // InternalCBSMDsl.g:3342:1: ruleAllocationContext returns [EObject current=null] : (otherlv_0= 'AllocationContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'allocatedContainer' ( ( ruleEString ) ) otherlv_5= 'allocatedAssemblyContext' ( ( ruleEString ) ) otherlv_7= '}' ) ;
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
            // InternalCBSMDsl.g:3348:2: ( (otherlv_0= 'AllocationContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'allocatedContainer' ( ( ruleEString ) ) otherlv_5= 'allocatedAssemblyContext' ( ( ruleEString ) ) otherlv_7= '}' ) )
            // InternalCBSMDsl.g:3349:2: (otherlv_0= 'AllocationContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'allocatedContainer' ( ( ruleEString ) ) otherlv_5= 'allocatedAssemblyContext' ( ( ruleEString ) ) otherlv_7= '}' )
            {
            // InternalCBSMDsl.g:3349:2: (otherlv_0= 'AllocationContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'allocatedContainer' ( ( ruleEString ) ) otherlv_5= 'allocatedAssemblyContext' ( ( ruleEString ) ) otherlv_7= '}' )
            // InternalCBSMDsl.g:3350:3: otherlv_0= 'AllocationContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'allocatedContainer' ( ( ruleEString ) ) otherlv_5= 'allocatedAssemblyContext' ( ( ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,84,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getAllocationContextAccess().getAllocationContextKeyword_0());
            		
            // InternalCBSMDsl.g:3354:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBSMDsl.g:3355:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBSMDsl.g:3355:4: (lv_name_1_0= ruleEString )
            // InternalCBSMDsl.g:3356:5: lv_name_1_0= ruleEString
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
            						"edu.kit.ipd.sdq.cbsmdsl.CBSMDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_79); 

            			newLeafNode(otherlv_2, grammarAccess.getAllocationContextAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,85,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getAllocationContextAccess().getAllocatedContainerKeyword_3());
            		
            // InternalCBSMDsl.g:3381:3: ( ( ruleEString ) )
            // InternalCBSMDsl.g:3382:4: ( ruleEString )
            {
            // InternalCBSMDsl.g:3382:4: ( ruleEString )
            // InternalCBSMDsl.g:3383:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllocationContextAccess().getAllocatedContainerContainerCrossReference_4_0());
            				
            pushFollow(FOLLOW_80);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,86,FOLLOW_34); 

            			newLeafNode(otherlv_5, grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextKeyword_5());
            		
            // InternalCBSMDsl.g:3401:3: ( ( ruleEString ) )
            // InternalCBSMDsl.g:3402:4: ( ruleEString )
            {
            // InternalCBSMDsl.g:3402:4: ( ruleEString )
            // InternalCBSMDsl.g:3403:5: ruleEString
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

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

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
    // InternalCBSMDsl.g:3425:1: ruleSimpleTypeInstance returns [Enumerator current=null] : ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Int' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) ) ;
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
            // InternalCBSMDsl.g:3431:2: ( ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Int' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) ) )
            // InternalCBSMDsl.g:3432:2: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Int' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) )
            {
            // InternalCBSMDsl.g:3432:2: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'List' ) | (enumLiteral_6= 'Int' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'Map' ) | (enumLiteral_9= 'String' ) )
            int alt54=10;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt54=1;
                }
                break;
            case 88:
                {
                alt54=2;
                }
                break;
            case 89:
                {
                alt54=3;
                }
                break;
            case 90:
                {
                alt54=4;
                }
                break;
            case 91:
                {
                alt54=5;
                }
                break;
            case 92:
                {
                alt54=6;
                }
                break;
            case 93:
                {
                alt54=7;
                }
                break;
            case 94:
                {
                alt54=8;
                }
                break;
            case 95:
                {
                alt54=9;
                }
                break;
            case 96:
                {
                alt54=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalCBSMDsl.g:3433:3: (enumLiteral_0= 'Boolean' )
                    {
                    // InternalCBSMDsl.g:3433:3: (enumLiteral_0= 'Boolean' )
                    // InternalCBSMDsl.g:3434:4: enumLiteral_0= 'Boolean'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeInstanceAccess().getBooleanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSimpleTypeInstanceAccess().getBooleanEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCBSMDsl.g:3441:3: (enumLiteral_1= 'Char' )
                    {
                    // InternalCBSMDsl.g:3441:3: (enumLiteral_1= 'Char' )
                    // InternalCBSMDsl.g:3442:4: enumLiteral_1= 'Char'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeInstanceAccess().getCharEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSimpleTypeInstanceAccess().getCharEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCBSMDsl.g:3449:3: (enumLiteral_2= 'Date' )
                    {
                    // InternalCBSMDsl.g:3449:3: (enumLiteral_2= 'Date' )
                    // InternalCBSMDsl.g:3450:4: enumLiteral_2= 'Date'
                    {
                    enumLiteral_2=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeInstanceAccess().getDateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSimpleTypeInstanceAccess().getDateEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCBSMDsl.g:3457:3: (enumLiteral_3= 'Double' )
                    {
                    // InternalCBSMDsl.g:3457:3: (enumLiteral_3= 'Double' )
                    // InternalCBSMDsl.g:3458:4: enumLiteral_3= 'Double'
                    {
                    enumLiteral_3=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeInstanceAccess().getDoubleEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSimpleTypeInstanceAccess().getDoubleEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCBSMDsl.g:3465:3: (enumLiteral_4= 'Float' )
                    {
                    // InternalCBSMDsl.g:3465:3: (enumLiteral_4= 'Float' )
                    // InternalCBSMDsl.g:3466:4: enumLiteral_4= 'Float'
                    {
                    enumLiteral_4=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeInstanceAccess().getFloatEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSimpleTypeInstanceAccess().getFloatEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalCBSMDsl.g:3473:3: (enumLiteral_5= 'List' )
                    {
                    // InternalCBSMDsl.g:3473:3: (enumLiteral_5= 'List' )
                    // InternalCBSMDsl.g:3474:4: enumLiteral_5= 'List'
                    {
                    enumLiteral_5=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeInstanceAccess().getListEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSimpleTypeInstanceAccess().getListEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalCBSMDsl.g:3481:3: (enumLiteral_6= 'Int' )
                    {
                    // InternalCBSMDsl.g:3481:3: (enumLiteral_6= 'Int' )
                    // InternalCBSMDsl.g:3482:4: enumLiteral_6= 'Int'
                    {
                    enumLiteral_6=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeInstanceAccess().getIntEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getSimpleTypeInstanceAccess().getIntEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalCBSMDsl.g:3489:3: (enumLiteral_7= 'Long' )
                    {
                    // InternalCBSMDsl.g:3489:3: (enumLiteral_7= 'Long' )
                    // InternalCBSMDsl.g:3490:4: enumLiteral_7= 'Long'
                    {
                    enumLiteral_7=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeInstanceAccess().getLongEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getSimpleTypeInstanceAccess().getLongEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalCBSMDsl.g:3497:3: (enumLiteral_8= 'Map' )
                    {
                    // InternalCBSMDsl.g:3497:3: (enumLiteral_8= 'Map' )
                    // InternalCBSMDsl.g:3498:4: enumLiteral_8= 'Map'
                    {
                    enumLiteral_8=(Token)match(input,95,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypeInstanceAccess().getMapEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getSimpleTypeInstanceAccess().getMapEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalCBSMDsl.g:3505:3: (enumLiteral_9= 'String' )
                    {
                    // InternalCBSMDsl.g:3505:3: (enumLiteral_9= 'String' )
                    // InternalCBSMDsl.g:3506:4: enumLiteral_9= 'String'
                    {
                    enumLiteral_9=(Token)match(input,96,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000006A0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000620000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000F020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000E020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000C020000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000484L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000060020000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100020000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001003020000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000001002020000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000001000020000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x000000C000020000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000008000020000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000800000020000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0299000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0006000000020000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0004000000020000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0026000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0024000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0106000000020000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0104000000020000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0100000000020000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0406000000020000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0404000000020000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0400000000020000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x1000000000020000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x00000001FF800000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000100000L,0x0000000000080000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});

}