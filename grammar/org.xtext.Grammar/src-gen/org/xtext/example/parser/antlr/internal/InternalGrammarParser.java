package org.xtext.example.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.services.GrammarGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGrammarParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'data'", "'{'", "','", "'}'", "':'", "'['", "']'", "'document'", "'allInOne'", "'='", "'$'", "'page'", "'('", "')'", "';'", "'row'", "'col'", "'.'", "'img'", "'src'", "'alt'", "'class'", "'colspan'", "'rowspan'", "'SUM'", "'PROD'", "'DIV'", "'-'", "'+'", "'if'", "'then'", "'is'", "'isNot'", "'with'", "'in'", "'from'", "'to'", "'style'", "'#'", "'true'", "'false'", "'%'", "'\\''"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_ID=6;
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
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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

    // delegates
    // delegators


        public InternalGrammarParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGrammarParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGrammarParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGrammar.g"; }



     	private GrammarGrammarAccess grammarAccess;

        public InternalGrammarParser(TokenStream input, GrammarGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected GrammarGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalGrammar.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalGrammar.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalGrammar.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalGrammar.g:71:1: ruleModel returns [EObject current=null] : ( (lv_document_0_0= ruleDocument ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_document_0_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:77:2: ( ( (lv_document_0_0= ruleDocument ) ) )
            // InternalGrammar.g:78:2: ( (lv_document_0_0= ruleDocument ) )
            {
            // InternalGrammar.g:78:2: ( (lv_document_0_0= ruleDocument ) )
            // InternalGrammar.g:79:3: (lv_document_0_0= ruleDocument )
            {
            // InternalGrammar.g:79:3: (lv_document_0_0= ruleDocument )
            // InternalGrammar.g:80:4: lv_document_0_0= ruleDocument
            {

            				newCompositeNode(grammarAccess.getModelAccess().getDocumentDocumentParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_document_0_0=ruleDocument();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				add(
            					current,
            					"document",
            					lv_document_0_0,
            					"org.xtext.example.Grammar.Document");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDocument"
    // InternalGrammar.g:100:1: entryRuleDocument returns [EObject current=null] : iv_ruleDocument= ruleDocument EOF ;
    public final EObject entryRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocument = null;


        try {
            // InternalGrammar.g:100:49: (iv_ruleDocument= ruleDocument EOF )
            // InternalGrammar.g:101:2: iv_ruleDocument= ruleDocument EOF
            {
             newCompositeNode(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocument=ruleDocument();

            state._fsp--;

             current =iv_ruleDocument; 
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
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // InternalGrammar.g:107:1: ruleDocument returns [EObject current=null] : ( ( (lv_data_0_0= ruleData ) )? ( (lv_build_1_0= ruleBuild ) ) ( (lv_style_2_0= ruleStyle ) )? ) ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_data_0_0 = null;

        EObject lv_build_1_0 = null;

        EObject lv_style_2_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:113:2: ( ( ( (lv_data_0_0= ruleData ) )? ( (lv_build_1_0= ruleBuild ) ) ( (lv_style_2_0= ruleStyle ) )? ) )
            // InternalGrammar.g:114:2: ( ( (lv_data_0_0= ruleData ) )? ( (lv_build_1_0= ruleBuild ) ) ( (lv_style_2_0= ruleStyle ) )? )
            {
            // InternalGrammar.g:114:2: ( ( (lv_data_0_0= ruleData ) )? ( (lv_build_1_0= ruleBuild ) ) ( (lv_style_2_0= ruleStyle ) )? )
            // InternalGrammar.g:115:3: ( (lv_data_0_0= ruleData ) )? ( (lv_build_1_0= ruleBuild ) ) ( (lv_style_2_0= ruleStyle ) )?
            {
            // InternalGrammar.g:115:3: ( (lv_data_0_0= ruleData ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalGrammar.g:116:4: (lv_data_0_0= ruleData )
                    {
                    // InternalGrammar.g:116:4: (lv_data_0_0= ruleData )
                    // InternalGrammar.g:117:5: lv_data_0_0= ruleData
                    {

                    					newCompositeNode(grammarAccess.getDocumentAccess().getDataDataParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_data_0_0=ruleData();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDocumentRule());
                    					}
                    					set(
                    						current,
                    						"data",
                    						lv_data_0_0,
                    						"org.xtext.example.Grammar.Data");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGrammar.g:134:3: ( (lv_build_1_0= ruleBuild ) )
            // InternalGrammar.g:135:4: (lv_build_1_0= ruleBuild )
            {
            // InternalGrammar.g:135:4: (lv_build_1_0= ruleBuild )
            // InternalGrammar.g:136:5: lv_build_1_0= ruleBuild
            {

            					newCompositeNode(grammarAccess.getDocumentAccess().getBuildBuildParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_build_1_0=ruleBuild();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDocumentRule());
            					}
            					set(
            						current,
            						"build",
            						lv_build_1_0,
            						"org.xtext.example.Grammar.Build");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGrammar.g:153:3: ( (lv_style_2_0= ruleStyle ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==48) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGrammar.g:154:4: (lv_style_2_0= ruleStyle )
                    {
                    // InternalGrammar.g:154:4: (lv_style_2_0= ruleStyle )
                    // InternalGrammar.g:155:5: lv_style_2_0= ruleStyle
                    {

                    					newCompositeNode(grammarAccess.getDocumentAccess().getStyleStyleParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_style_2_0=ruleStyle();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDocumentRule());
                    					}
                    					set(
                    						current,
                    						"style",
                    						lv_style_2_0,
                    						"org.xtext.example.Grammar.Style");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleData"
    // InternalGrammar.g:176:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // InternalGrammar.g:176:45: (iv_ruleData= ruleData EOF )
            // InternalGrammar.g:177:2: iv_ruleData= ruleData EOF
            {
             newCompositeNode(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleData=ruleData();

            state._fsp--;

             current =iv_ruleData; 
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
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalGrammar.g:183:1: ruleData returns [EObject current=null] : (otherlv_0= 'data' otherlv_1= '{' ( ( (lv_keyValue_2_0= ruleKeyValue ) ) (otherlv_3= ',' ( (lv_keyValue_4_0= ruleKeyValue ) ) )* ) otherlv_5= '}' ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_keyValue_2_0 = null;

        EObject lv_keyValue_4_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:189:2: ( (otherlv_0= 'data' otherlv_1= '{' ( ( (lv_keyValue_2_0= ruleKeyValue ) ) (otherlv_3= ',' ( (lv_keyValue_4_0= ruleKeyValue ) ) )* ) otherlv_5= '}' ) )
            // InternalGrammar.g:190:2: (otherlv_0= 'data' otherlv_1= '{' ( ( (lv_keyValue_2_0= ruleKeyValue ) ) (otherlv_3= ',' ( (lv_keyValue_4_0= ruleKeyValue ) ) )* ) otherlv_5= '}' )
            {
            // InternalGrammar.g:190:2: (otherlv_0= 'data' otherlv_1= '{' ( ( (lv_keyValue_2_0= ruleKeyValue ) ) (otherlv_3= ',' ( (lv_keyValue_4_0= ruleKeyValue ) ) )* ) otherlv_5= '}' )
            // InternalGrammar.g:191:3: otherlv_0= 'data' otherlv_1= '{' ( ( (lv_keyValue_2_0= ruleKeyValue ) ) (otherlv_3= ',' ( (lv_keyValue_4_0= ruleKeyValue ) ) )* ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDataAccess().getDataKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getDataAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGrammar.g:199:3: ( ( (lv_keyValue_2_0= ruleKeyValue ) ) (otherlv_3= ',' ( (lv_keyValue_4_0= ruleKeyValue ) ) )* )
            // InternalGrammar.g:200:4: ( (lv_keyValue_2_0= ruleKeyValue ) ) (otherlv_3= ',' ( (lv_keyValue_4_0= ruleKeyValue ) ) )*
            {
            // InternalGrammar.g:200:4: ( (lv_keyValue_2_0= ruleKeyValue ) )
            // InternalGrammar.g:201:5: (lv_keyValue_2_0= ruleKeyValue )
            {
            // InternalGrammar.g:201:5: (lv_keyValue_2_0= ruleKeyValue )
            // InternalGrammar.g:202:6: lv_keyValue_2_0= ruleKeyValue
            {

            						newCompositeNode(grammarAccess.getDataAccess().getKeyValueKeyValueParserRuleCall_2_0_0());
            					
            pushFollow(FOLLOW_7);
            lv_keyValue_2_0=ruleKeyValue();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getDataRule());
            						}
            						add(
            							current,
            							"keyValue",
            							lv_keyValue_2_0,
            							"org.xtext.example.Grammar.KeyValue");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalGrammar.g:219:4: (otherlv_3= ',' ( (lv_keyValue_4_0= ruleKeyValue ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGrammar.g:220:5: otherlv_3= ',' ( (lv_keyValue_4_0= ruleKeyValue ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_6); 

            	    					newLeafNode(otherlv_3, grammarAccess.getDataAccess().getCommaKeyword_2_1_0());
            	    				
            	    // InternalGrammar.g:224:5: ( (lv_keyValue_4_0= ruleKeyValue ) )
            	    // InternalGrammar.g:225:6: (lv_keyValue_4_0= ruleKeyValue )
            	    {
            	    // InternalGrammar.g:225:6: (lv_keyValue_4_0= ruleKeyValue )
            	    // InternalGrammar.g:226:7: lv_keyValue_4_0= ruleKeyValue
            	    {

            	    							newCompositeNode(grammarAccess.getDataAccess().getKeyValueKeyValueParserRuleCall_2_1_1_0());
            	    						
            	    pushFollow(FOLLOW_7);
            	    lv_keyValue_4_0=ruleKeyValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getDataRule());
            	    							}
            	    							add(
            	    								current,
            	    								"keyValue",
            	    								lv_keyValue_4_0,
            	    								"org.xtext.example.Grammar.KeyValue");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDataAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleKeyValue"
    // InternalGrammar.g:253:1: entryRuleKeyValue returns [EObject current=null] : iv_ruleKeyValue= ruleKeyValue EOF ;
    public final EObject entryRuleKeyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValue = null;


        try {
            // InternalGrammar.g:253:49: (iv_ruleKeyValue= ruleKeyValue EOF )
            // InternalGrammar.g:254:2: iv_ruleKeyValue= ruleKeyValue EOF
            {
             newCompositeNode(grammarAccess.getKeyValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeyValue=ruleKeyValue();

            state._fsp--;

             current =iv_ruleKeyValue; 
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
    // $ANTLR end "entryRuleKeyValue"


    // $ANTLR start "ruleKeyValue"
    // InternalGrammar.g:260:1: ruleKeyValue returns [EObject current=null] : ( ( (lv_string_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleKeyValue() throws RecognitionException {
        EObject current = null;

        Token lv_string_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:266:2: ( ( ( (lv_string_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalGrammar.g:267:2: ( ( (lv_string_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalGrammar.g:267:2: ( ( (lv_string_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) )
            // InternalGrammar.g:268:3: ( (lv_string_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) )
            {
            // InternalGrammar.g:268:3: ( (lv_string_0_0= RULE_STRING ) )
            // InternalGrammar.g:269:4: (lv_string_0_0= RULE_STRING )
            {
            // InternalGrammar.g:269:4: (lv_string_0_0= RULE_STRING )
            // InternalGrammar.g:270:5: lv_string_0_0= RULE_STRING
            {
            lv_string_0_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_string_0_0, grammarAccess.getKeyValueAccess().getStringSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKeyValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"string",
            						lv_string_0_0,
            						"org.xtext.example.Grammar.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getKeyValueAccess().getColonKeyword_1());
            		
            // InternalGrammar.g:290:3: ( (lv_value_2_0= ruleValue ) )
            // InternalGrammar.g:291:4: (lv_value_2_0= ruleValue )
            {
            // InternalGrammar.g:291:4: (lv_value_2_0= ruleValue )
            // InternalGrammar.g:292:5: lv_value_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getKeyValueAccess().getValueValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeyValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.Grammar.Value");
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
    // $ANTLR end "ruleKeyValue"


    // $ANTLR start "entryRuleValue"
    // InternalGrammar.g:313:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalGrammar.g:313:46: (iv_ruleValue= ruleValue EOF )
            // InternalGrammar.g:314:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalGrammar.g:320:1: ruleValue returns [EObject current=null] : ( ( (lv_string_0_0= RULE_STRING ) ) | ( (lv_integer_1_0= RULE_INT ) ) | ( (lv_floatValue_2_0= ruleFloat ) ) | ( (lv_trueV_3_0= ruleTRUE ) ) | ( (lv_falseV_4_0= ruleFALSE ) ) | ( (lv_array_5_0= ruleArray ) ) | ( (lv_nestedObject_6_0= ruleNestedObject ) ) | ( (lv_variable_7_0= ruleVariable ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_string_0_0=null;
        Token lv_integer_1_0=null;
        EObject lv_floatValue_2_0 = null;

        AntlrDatatypeRuleToken lv_trueV_3_0 = null;

        AntlrDatatypeRuleToken lv_falseV_4_0 = null;

        EObject lv_array_5_0 = null;

        EObject lv_nestedObject_6_0 = null;

        EObject lv_variable_7_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:326:2: ( ( ( (lv_string_0_0= RULE_STRING ) ) | ( (lv_integer_1_0= RULE_INT ) ) | ( (lv_floatValue_2_0= ruleFloat ) ) | ( (lv_trueV_3_0= ruleTRUE ) ) | ( (lv_falseV_4_0= ruleFALSE ) ) | ( (lv_array_5_0= ruleArray ) ) | ( (lv_nestedObject_6_0= ruleNestedObject ) ) | ( (lv_variable_7_0= ruleVariable ) ) ) )
            // InternalGrammar.g:327:2: ( ( (lv_string_0_0= RULE_STRING ) ) | ( (lv_integer_1_0= RULE_INT ) ) | ( (lv_floatValue_2_0= ruleFloat ) ) | ( (lv_trueV_3_0= ruleTRUE ) ) | ( (lv_falseV_4_0= ruleFALSE ) ) | ( (lv_array_5_0= ruleArray ) ) | ( (lv_nestedObject_6_0= ruleNestedObject ) ) | ( (lv_variable_7_0= ruleVariable ) ) )
            {
            // InternalGrammar.g:327:2: ( ( (lv_string_0_0= RULE_STRING ) ) | ( (lv_integer_1_0= RULE_INT ) ) | ( (lv_floatValue_2_0= ruleFloat ) ) | ( (lv_trueV_3_0= ruleTRUE ) ) | ( (lv_falseV_4_0= ruleFALSE ) ) | ( (lv_array_5_0= ruleArray ) ) | ( (lv_nestedObject_6_0= ruleNestedObject ) ) | ( (lv_variable_7_0= ruleVariable ) ) )
            int alt4=8;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalGrammar.g:328:3: ( (lv_string_0_0= RULE_STRING ) )
                    {
                    // InternalGrammar.g:328:3: ( (lv_string_0_0= RULE_STRING ) )
                    // InternalGrammar.g:329:4: (lv_string_0_0= RULE_STRING )
                    {
                    // InternalGrammar.g:329:4: (lv_string_0_0= RULE_STRING )
                    // InternalGrammar.g:330:5: lv_string_0_0= RULE_STRING
                    {
                    lv_string_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_string_0_0, grammarAccess.getValueAccess().getStringSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"string",
                    						lv_string_0_0,
                    						"org.xtext.example.Grammar.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGrammar.g:347:3: ( (lv_integer_1_0= RULE_INT ) )
                    {
                    // InternalGrammar.g:347:3: ( (lv_integer_1_0= RULE_INT ) )
                    // InternalGrammar.g:348:4: (lv_integer_1_0= RULE_INT )
                    {
                    // InternalGrammar.g:348:4: (lv_integer_1_0= RULE_INT )
                    // InternalGrammar.g:349:5: lv_integer_1_0= RULE_INT
                    {
                    lv_integer_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_integer_1_0, grammarAccess.getValueAccess().getIntegerINTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"integer",
                    						lv_integer_1_0,
                    						"org.xtext.example.Grammar.INT");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGrammar.g:366:3: ( (lv_floatValue_2_0= ruleFloat ) )
                    {
                    // InternalGrammar.g:366:3: ( (lv_floatValue_2_0= ruleFloat ) )
                    // InternalGrammar.g:367:4: (lv_floatValue_2_0= ruleFloat )
                    {
                    // InternalGrammar.g:367:4: (lv_floatValue_2_0= ruleFloat )
                    // InternalGrammar.g:368:5: lv_floatValue_2_0= ruleFloat
                    {

                    					newCompositeNode(grammarAccess.getValueAccess().getFloatValueFloatParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_floatValue_2_0=ruleFloat();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getValueRule());
                    					}
                    					set(
                    						current,
                    						"floatValue",
                    						lv_floatValue_2_0,
                    						"org.xtext.example.Grammar.Float");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGrammar.g:386:3: ( (lv_trueV_3_0= ruleTRUE ) )
                    {
                    // InternalGrammar.g:386:3: ( (lv_trueV_3_0= ruleTRUE ) )
                    // InternalGrammar.g:387:4: (lv_trueV_3_0= ruleTRUE )
                    {
                    // InternalGrammar.g:387:4: (lv_trueV_3_0= ruleTRUE )
                    // InternalGrammar.g:388:5: lv_trueV_3_0= ruleTRUE
                    {

                    					newCompositeNode(grammarAccess.getValueAccess().getTrueVTRUEParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_trueV_3_0=ruleTRUE();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getValueRule());
                    					}
                    					set(
                    						current,
                    						"trueV",
                    						lv_trueV_3_0,
                    						"org.xtext.example.Grammar.TRUE");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalGrammar.g:406:3: ( (lv_falseV_4_0= ruleFALSE ) )
                    {
                    // InternalGrammar.g:406:3: ( (lv_falseV_4_0= ruleFALSE ) )
                    // InternalGrammar.g:407:4: (lv_falseV_4_0= ruleFALSE )
                    {
                    // InternalGrammar.g:407:4: (lv_falseV_4_0= ruleFALSE )
                    // InternalGrammar.g:408:5: lv_falseV_4_0= ruleFALSE
                    {

                    					newCompositeNode(grammarAccess.getValueAccess().getFalseVFALSEParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_falseV_4_0=ruleFALSE();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getValueRule());
                    					}
                    					set(
                    						current,
                    						"falseV",
                    						lv_falseV_4_0,
                    						"org.xtext.example.Grammar.FALSE");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalGrammar.g:426:3: ( (lv_array_5_0= ruleArray ) )
                    {
                    // InternalGrammar.g:426:3: ( (lv_array_5_0= ruleArray ) )
                    // InternalGrammar.g:427:4: (lv_array_5_0= ruleArray )
                    {
                    // InternalGrammar.g:427:4: (lv_array_5_0= ruleArray )
                    // InternalGrammar.g:428:5: lv_array_5_0= ruleArray
                    {

                    					newCompositeNode(grammarAccess.getValueAccess().getArrayArrayParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_array_5_0=ruleArray();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getValueRule());
                    					}
                    					set(
                    						current,
                    						"array",
                    						lv_array_5_0,
                    						"org.xtext.example.Grammar.Array");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalGrammar.g:446:3: ( (lv_nestedObject_6_0= ruleNestedObject ) )
                    {
                    // InternalGrammar.g:446:3: ( (lv_nestedObject_6_0= ruleNestedObject ) )
                    // InternalGrammar.g:447:4: (lv_nestedObject_6_0= ruleNestedObject )
                    {
                    // InternalGrammar.g:447:4: (lv_nestedObject_6_0= ruleNestedObject )
                    // InternalGrammar.g:448:5: lv_nestedObject_6_0= ruleNestedObject
                    {

                    					newCompositeNode(grammarAccess.getValueAccess().getNestedObjectNestedObjectParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_nestedObject_6_0=ruleNestedObject();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getValueRule());
                    					}
                    					set(
                    						current,
                    						"nestedObject",
                    						lv_nestedObject_6_0,
                    						"org.xtext.example.Grammar.NestedObject");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalGrammar.g:466:3: ( (lv_variable_7_0= ruleVariable ) )
                    {
                    // InternalGrammar.g:466:3: ( (lv_variable_7_0= ruleVariable ) )
                    // InternalGrammar.g:467:4: (lv_variable_7_0= ruleVariable )
                    {
                    // InternalGrammar.g:467:4: (lv_variable_7_0= ruleVariable )
                    // InternalGrammar.g:468:5: lv_variable_7_0= ruleVariable
                    {

                    					newCompositeNode(grammarAccess.getValueAccess().getVariableVariableParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_variable_7_0=ruleVariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getValueRule());
                    					}
                    					set(
                    						current,
                    						"variable",
                    						lv_variable_7_0,
                    						"org.xtext.example.Grammar.Variable");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleArray"
    // InternalGrammar.g:489:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // InternalGrammar.g:489:46: (iv_ruleArray= ruleArray EOF )
            // InternalGrammar.g:490:2: iv_ruleArray= ruleArray EOF
            {
             newCompositeNode(grammarAccess.getArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArray=ruleArray();

            state._fsp--;

             current =iv_ruleArray; 
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
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // InternalGrammar.g:496:1: ruleArray returns [EObject current=null] : (otherlv_0= '[' ( ( (lv_values_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValue ) ) )* )? otherlv_4= ']' ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:502:2: ( (otherlv_0= '[' ( ( (lv_values_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValue ) ) )* )? otherlv_4= ']' ) )
            // InternalGrammar.g:503:2: (otherlv_0= '[' ( ( (lv_values_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValue ) ) )* )? otherlv_4= ']' )
            {
            // InternalGrammar.g:503:2: (otherlv_0= '[' ( ( (lv_values_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValue ) ) )* )? otherlv_4= ']' )
            // InternalGrammar.g:504:3: otherlv_0= '[' ( ( (lv_values_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValue ) ) )* )? otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalGrammar.g:508:3: ( ( (lv_values_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValue ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_INT)||LA6_0==12||LA6_0==16||LA6_0==21||(LA6_0>=50 && LA6_0<=51)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGrammar.g:509:4: ( (lv_values_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValue ) ) )*
                    {
                    // InternalGrammar.g:509:4: ( (lv_values_1_0= ruleValue ) )
                    // InternalGrammar.g:510:5: (lv_values_1_0= ruleValue )
                    {
                    // InternalGrammar.g:510:5: (lv_values_1_0= ruleValue )
                    // InternalGrammar.g:511:6: lv_values_1_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getArrayAccess().getValuesValueParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_values_1_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArrayRule());
                    						}
                    						add(
                    							current,
                    							"values",
                    							lv_values_1_0,
                    							"org.xtext.example.Grammar.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGrammar.g:528:4: (otherlv_2= ',' ( (lv_values_3_0= ruleValue ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==13) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalGrammar.g:529:5: otherlv_2= ',' ( (lv_values_3_0= ruleValue ) )
                    	    {
                    	    otherlv_2=(Token)match(input,13,FOLLOW_9); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getArrayAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalGrammar.g:533:5: ( (lv_values_3_0= ruleValue ) )
                    	    // InternalGrammar.g:534:6: (lv_values_3_0= ruleValue )
                    	    {
                    	    // InternalGrammar.g:534:6: (lv_values_3_0= ruleValue )
                    	    // InternalGrammar.g:535:7: lv_values_3_0= ruleValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getArrayAccess().getValuesValueParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_values_3_0=ruleValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getArrayRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"values",
                    	    								lv_values_3_0,
                    	    								"org.xtext.example.Grammar.Value");
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
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getArrayAccess().getRightSquareBracketKeyword_2());
            		

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
    // $ANTLR end "ruleArray"


    // $ANTLR start "entryRuleNestedObject"
    // InternalGrammar.g:562:1: entryRuleNestedObject returns [EObject current=null] : iv_ruleNestedObject= ruleNestedObject EOF ;
    public final EObject entryRuleNestedObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedObject = null;


        try {
            // InternalGrammar.g:562:53: (iv_ruleNestedObject= ruleNestedObject EOF )
            // InternalGrammar.g:563:2: iv_ruleNestedObject= ruleNestedObject EOF
            {
             newCompositeNode(grammarAccess.getNestedObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNestedObject=ruleNestedObject();

            state._fsp--;

             current =iv_ruleNestedObject; 
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
    // $ANTLR end "entryRuleNestedObject"


    // $ANTLR start "ruleNestedObject"
    // InternalGrammar.g:569:1: ruleNestedObject returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_keyValue_1_0= ruleKeyValue ) ) (otherlv_2= ',' ( (lv_keyValue_3_0= ruleKeyValue ) ) )* )? otherlv_4= '}' ) ;
    public final EObject ruleNestedObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_keyValue_1_0 = null;

        EObject lv_keyValue_3_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:575:2: ( (otherlv_0= '{' ( ( (lv_keyValue_1_0= ruleKeyValue ) ) (otherlv_2= ',' ( (lv_keyValue_3_0= ruleKeyValue ) ) )* )? otherlv_4= '}' ) )
            // InternalGrammar.g:576:2: (otherlv_0= '{' ( ( (lv_keyValue_1_0= ruleKeyValue ) ) (otherlv_2= ',' ( (lv_keyValue_3_0= ruleKeyValue ) ) )* )? otherlv_4= '}' )
            {
            // InternalGrammar.g:576:2: (otherlv_0= '{' ( ( (lv_keyValue_1_0= ruleKeyValue ) ) (otherlv_2= ',' ( (lv_keyValue_3_0= ruleKeyValue ) ) )* )? otherlv_4= '}' )
            // InternalGrammar.g:577:3: otherlv_0= '{' ( ( (lv_keyValue_1_0= ruleKeyValue ) ) (otherlv_2= ',' ( (lv_keyValue_3_0= ruleKeyValue ) ) )* )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getNestedObjectAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalGrammar.g:581:3: ( ( (lv_keyValue_1_0= ruleKeyValue ) ) (otherlv_2= ',' ( (lv_keyValue_3_0= ruleKeyValue ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGrammar.g:582:4: ( (lv_keyValue_1_0= ruleKeyValue ) ) (otherlv_2= ',' ( (lv_keyValue_3_0= ruleKeyValue ) ) )*
                    {
                    // InternalGrammar.g:582:4: ( (lv_keyValue_1_0= ruleKeyValue ) )
                    // InternalGrammar.g:583:5: (lv_keyValue_1_0= ruleKeyValue )
                    {
                    // InternalGrammar.g:583:5: (lv_keyValue_1_0= ruleKeyValue )
                    // InternalGrammar.g:584:6: lv_keyValue_1_0= ruleKeyValue
                    {

                    						newCompositeNode(grammarAccess.getNestedObjectAccess().getKeyValueKeyValueParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_keyValue_1_0=ruleKeyValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNestedObjectRule());
                    						}
                    						add(
                    							current,
                    							"keyValue",
                    							lv_keyValue_1_0,
                    							"org.xtext.example.Grammar.KeyValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGrammar.g:601:4: (otherlv_2= ',' ( (lv_keyValue_3_0= ruleKeyValue ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==13) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalGrammar.g:602:5: otherlv_2= ',' ( (lv_keyValue_3_0= ruleKeyValue ) )
                    	    {
                    	    otherlv_2=(Token)match(input,13,FOLLOW_6); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getNestedObjectAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalGrammar.g:606:5: ( (lv_keyValue_3_0= ruleKeyValue ) )
                    	    // InternalGrammar.g:607:6: (lv_keyValue_3_0= ruleKeyValue )
                    	    {
                    	    // InternalGrammar.g:607:6: (lv_keyValue_3_0= ruleKeyValue )
                    	    // InternalGrammar.g:608:7: lv_keyValue_3_0= ruleKeyValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getNestedObjectAccess().getKeyValueKeyValueParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_keyValue_3_0=ruleKeyValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNestedObjectRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"keyValue",
                    	    								lv_keyValue_3_0,
                    	    								"org.xtext.example.Grammar.KeyValue");
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
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getNestedObjectAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleNestedObject"


    // $ANTLR start "entryRuleBuild"
    // InternalGrammar.g:635:1: entryRuleBuild returns [EObject current=null] : iv_ruleBuild= ruleBuild EOF ;
    public final EObject entryRuleBuild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuild = null;


        try {
            // InternalGrammar.g:635:46: (iv_ruleBuild= ruleBuild EOF )
            // InternalGrammar.g:636:2: iv_ruleBuild= ruleBuild EOF
            {
             newCompositeNode(grammarAccess.getBuildRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBuild=ruleBuild();

            state._fsp--;

             current =iv_ruleBuild; 
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
    // $ANTLR end "entryRuleBuild"


    // $ANTLR start "ruleBuild"
    // InternalGrammar.g:642:1: ruleBuild returns [EObject current=null] : (otherlv_0= 'document' ( (lv_variable_1_0= ruleVariable ) ) ( ( (lv_allInOne_2_0= 'allInOne' ) ) otherlv_3= '=' ( ( (lv_trueV_4_0= ruleTRUE ) ) | ( (lv_falseF_5_0= ruleFALSE ) ) ) ) otherlv_6= '{' ( (lv_elementBuild_7_0= ruleElementBuild ) )* otherlv_8= '}' ) ;
    public final EObject ruleBuild() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_allInOne_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_variable_1_0 = null;

        AntlrDatatypeRuleToken lv_trueV_4_0 = null;

        AntlrDatatypeRuleToken lv_falseF_5_0 = null;

        EObject lv_elementBuild_7_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:648:2: ( (otherlv_0= 'document' ( (lv_variable_1_0= ruleVariable ) ) ( ( (lv_allInOne_2_0= 'allInOne' ) ) otherlv_3= '=' ( ( (lv_trueV_4_0= ruleTRUE ) ) | ( (lv_falseF_5_0= ruleFALSE ) ) ) ) otherlv_6= '{' ( (lv_elementBuild_7_0= ruleElementBuild ) )* otherlv_8= '}' ) )
            // InternalGrammar.g:649:2: (otherlv_0= 'document' ( (lv_variable_1_0= ruleVariable ) ) ( ( (lv_allInOne_2_0= 'allInOne' ) ) otherlv_3= '=' ( ( (lv_trueV_4_0= ruleTRUE ) ) | ( (lv_falseF_5_0= ruleFALSE ) ) ) ) otherlv_6= '{' ( (lv_elementBuild_7_0= ruleElementBuild ) )* otherlv_8= '}' )
            {
            // InternalGrammar.g:649:2: (otherlv_0= 'document' ( (lv_variable_1_0= ruleVariable ) ) ( ( (lv_allInOne_2_0= 'allInOne' ) ) otherlv_3= '=' ( ( (lv_trueV_4_0= ruleTRUE ) ) | ( (lv_falseF_5_0= ruleFALSE ) ) ) ) otherlv_6= '{' ( (lv_elementBuild_7_0= ruleElementBuild ) )* otherlv_8= '}' )
            // InternalGrammar.g:650:3: otherlv_0= 'document' ( (lv_variable_1_0= ruleVariable ) ) ( ( (lv_allInOne_2_0= 'allInOne' ) ) otherlv_3= '=' ( ( (lv_trueV_4_0= ruleTRUE ) ) | ( (lv_falseF_5_0= ruleFALSE ) ) ) ) otherlv_6= '{' ( (lv_elementBuild_7_0= ruleElementBuild ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getBuildAccess().getDocumentKeyword_0());
            		
            // InternalGrammar.g:654:3: ( (lv_variable_1_0= ruleVariable ) )
            // InternalGrammar.g:655:4: (lv_variable_1_0= ruleVariable )
            {
            // InternalGrammar.g:655:4: (lv_variable_1_0= ruleVariable )
            // InternalGrammar.g:656:5: lv_variable_1_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getBuildAccess().getVariableVariableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_variable_1_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBuildRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_1_0,
            						"org.xtext.example.Grammar.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGrammar.g:673:3: ( ( (lv_allInOne_2_0= 'allInOne' ) ) otherlv_3= '=' ( ( (lv_trueV_4_0= ruleTRUE ) ) | ( (lv_falseF_5_0= ruleFALSE ) ) ) )
            // InternalGrammar.g:674:4: ( (lv_allInOne_2_0= 'allInOne' ) ) otherlv_3= '=' ( ( (lv_trueV_4_0= ruleTRUE ) ) | ( (lv_falseF_5_0= ruleFALSE ) ) )
            {
            // InternalGrammar.g:674:4: ( (lv_allInOne_2_0= 'allInOne' ) )
            // InternalGrammar.g:675:5: (lv_allInOne_2_0= 'allInOne' )
            {
            // InternalGrammar.g:675:5: (lv_allInOne_2_0= 'allInOne' )
            // InternalGrammar.g:676:6: lv_allInOne_2_0= 'allInOne'
            {
            lv_allInOne_2_0=(Token)match(input,19,FOLLOW_14); 

            						newLeafNode(lv_allInOne_2_0, grammarAccess.getBuildAccess().getAllInOneAllInOneKeyword_2_0_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getBuildRule());
            						}
            						setWithLastConsumed(current, "allInOne", lv_allInOne_2_0, "allInOne");
            					

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_15); 

            				newLeafNode(otherlv_3, grammarAccess.getBuildAccess().getEqualsSignKeyword_2_1());
            			
            // InternalGrammar.g:692:4: ( ( (lv_trueV_4_0= ruleTRUE ) ) | ( (lv_falseF_5_0= ruleFALSE ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==50) ) {
                alt9=1;
            }
            else if ( (LA9_0==51) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalGrammar.g:693:5: ( (lv_trueV_4_0= ruleTRUE ) )
                    {
                    // InternalGrammar.g:693:5: ( (lv_trueV_4_0= ruleTRUE ) )
                    // InternalGrammar.g:694:6: (lv_trueV_4_0= ruleTRUE )
                    {
                    // InternalGrammar.g:694:6: (lv_trueV_4_0= ruleTRUE )
                    // InternalGrammar.g:695:7: lv_trueV_4_0= ruleTRUE
                    {

                    							newCompositeNode(grammarAccess.getBuildAccess().getTrueVTRUEParserRuleCall_2_2_0_0());
                    						
                    pushFollow(FOLLOW_5);
                    lv_trueV_4_0=ruleTRUE();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getBuildRule());
                    							}
                    							set(
                    								current,
                    								"trueV",
                    								lv_trueV_4_0,
                    								"org.xtext.example.Grammar.TRUE");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGrammar.g:713:5: ( (lv_falseF_5_0= ruleFALSE ) )
                    {
                    // InternalGrammar.g:713:5: ( (lv_falseF_5_0= ruleFALSE ) )
                    // InternalGrammar.g:714:6: (lv_falseF_5_0= ruleFALSE )
                    {
                    // InternalGrammar.g:714:6: (lv_falseF_5_0= ruleFALSE )
                    // InternalGrammar.g:715:7: lv_falseF_5_0= ruleFALSE
                    {

                    							newCompositeNode(grammarAccess.getBuildAccess().getFalseFFALSEParserRuleCall_2_2_1_0());
                    						
                    pushFollow(FOLLOW_5);
                    lv_falseF_5_0=ruleFALSE();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getBuildRule());
                    							}
                    							set(
                    								current,
                    								"falseF",
                    								lv_falseF_5_0,
                    								"org.xtext.example.Grammar.FALSE");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }


            }

            otherlv_6=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getBuildAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGrammar.g:738:3: ( (lv_elementBuild_7_0= ruleElementBuild ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=21 && LA10_0<=22)||LA10_0==40||LA10_0==44) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGrammar.g:739:4: (lv_elementBuild_7_0= ruleElementBuild )
            	    {
            	    // InternalGrammar.g:739:4: (lv_elementBuild_7_0= ruleElementBuild )
            	    // InternalGrammar.g:740:5: lv_elementBuild_7_0= ruleElementBuild
            	    {

            	    					newCompositeNode(grammarAccess.getBuildAccess().getElementBuildElementBuildParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_elementBuild_7_0=ruleElementBuild();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBuildRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elementBuild",
            	    						lv_elementBuild_7_0,
            	    						"org.xtext.example.Grammar.ElementBuild");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getBuildAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleBuild"


    // $ANTLR start "entryRuleElementBuild"
    // InternalGrammar.g:765:1: entryRuleElementBuild returns [EObject current=null] : iv_ruleElementBuild= ruleElementBuild EOF ;
    public final EObject entryRuleElementBuild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementBuild = null;


        try {
            // InternalGrammar.g:765:53: (iv_ruleElementBuild= ruleElementBuild EOF )
            // InternalGrammar.g:766:2: iv_ruleElementBuild= ruleElementBuild EOF
            {
             newCompositeNode(grammarAccess.getElementBuildRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementBuild=ruleElementBuild();

            state._fsp--;

             current =iv_ruleElementBuild; 
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
    // $ANTLR end "entryRuleElementBuild"


    // $ANTLR start "ruleElementBuild"
    // InternalGrammar.g:772:1: ruleElementBuild returns [EObject current=null] : ( ( (lv_variableD_0_0= ruleVariableD ) ) | ( (lv_page_1_0= rulePage ) ) | ( (lv_loop_2_0= ruleLoop ) ) | ( (lv_conditional_3_0= ruleConditional ) ) ) ;
    public final EObject ruleElementBuild() throws RecognitionException {
        EObject current = null;

        EObject lv_variableD_0_0 = null;

        EObject lv_page_1_0 = null;

        EObject lv_loop_2_0 = null;

        EObject lv_conditional_3_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:778:2: ( ( ( (lv_variableD_0_0= ruleVariableD ) ) | ( (lv_page_1_0= rulePage ) ) | ( (lv_loop_2_0= ruleLoop ) ) | ( (lv_conditional_3_0= ruleConditional ) ) ) )
            // InternalGrammar.g:779:2: ( ( (lv_variableD_0_0= ruleVariableD ) ) | ( (lv_page_1_0= rulePage ) ) | ( (lv_loop_2_0= ruleLoop ) ) | ( (lv_conditional_3_0= ruleConditional ) ) )
            {
            // InternalGrammar.g:779:2: ( ( (lv_variableD_0_0= ruleVariableD ) ) | ( (lv_page_1_0= rulePage ) ) | ( (lv_loop_2_0= ruleLoop ) ) | ( (lv_conditional_3_0= ruleConditional ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_ID) ) {
                    int LA11_5 = input.LA(3);

                    if ( (LA11_5==46) ) {
                        alt11=3;
                    }
                    else if ( (LA11_5==16||LA11_5==20) ) {
                        alt11=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                alt11=2;
                }
                break;
            case 44:
                {
                alt11=3;
                }
                break;
            case 40:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalGrammar.g:780:3: ( (lv_variableD_0_0= ruleVariableD ) )
                    {
                    // InternalGrammar.g:780:3: ( (lv_variableD_0_0= ruleVariableD ) )
                    // InternalGrammar.g:781:4: (lv_variableD_0_0= ruleVariableD )
                    {
                    // InternalGrammar.g:781:4: (lv_variableD_0_0= ruleVariableD )
                    // InternalGrammar.g:782:5: lv_variableD_0_0= ruleVariableD
                    {

                    					newCompositeNode(grammarAccess.getElementBuildAccess().getVariableDVariableDParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_variableD_0_0=ruleVariableD();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElementBuildRule());
                    					}
                    					set(
                    						current,
                    						"variableD",
                    						lv_variableD_0_0,
                    						"org.xtext.example.Grammar.VariableD");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGrammar.g:800:3: ( (lv_page_1_0= rulePage ) )
                    {
                    // InternalGrammar.g:800:3: ( (lv_page_1_0= rulePage ) )
                    // InternalGrammar.g:801:4: (lv_page_1_0= rulePage )
                    {
                    // InternalGrammar.g:801:4: (lv_page_1_0= rulePage )
                    // InternalGrammar.g:802:5: lv_page_1_0= rulePage
                    {

                    					newCompositeNode(grammarAccess.getElementBuildAccess().getPagePageParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_page_1_0=rulePage();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElementBuildRule());
                    					}
                    					set(
                    						current,
                    						"page",
                    						lv_page_1_0,
                    						"org.xtext.example.Grammar.Page");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGrammar.g:820:3: ( (lv_loop_2_0= ruleLoop ) )
                    {
                    // InternalGrammar.g:820:3: ( (lv_loop_2_0= ruleLoop ) )
                    // InternalGrammar.g:821:4: (lv_loop_2_0= ruleLoop )
                    {
                    // InternalGrammar.g:821:4: (lv_loop_2_0= ruleLoop )
                    // InternalGrammar.g:822:5: lv_loop_2_0= ruleLoop
                    {

                    					newCompositeNode(grammarAccess.getElementBuildAccess().getLoopLoopParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_loop_2_0=ruleLoop();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElementBuildRule());
                    					}
                    					set(
                    						current,
                    						"loop",
                    						lv_loop_2_0,
                    						"org.xtext.example.Grammar.Loop");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGrammar.g:840:3: ( (lv_conditional_3_0= ruleConditional ) )
                    {
                    // InternalGrammar.g:840:3: ( (lv_conditional_3_0= ruleConditional ) )
                    // InternalGrammar.g:841:4: (lv_conditional_3_0= ruleConditional )
                    {
                    // InternalGrammar.g:841:4: (lv_conditional_3_0= ruleConditional )
                    // InternalGrammar.g:842:5: lv_conditional_3_0= ruleConditional
                    {

                    					newCompositeNode(grammarAccess.getElementBuildAccess().getConditionalConditionalParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_conditional_3_0=ruleConditional();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElementBuildRule());
                    					}
                    					set(
                    						current,
                    						"conditional",
                    						lv_conditional_3_0,
                    						"org.xtext.example.Grammar.Conditional");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleElementBuild"


    // $ANTLR start "entryRuleVariable"
    // InternalGrammar.g:863:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalGrammar.g:863:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalGrammar.g:864:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalGrammar.g:870:1: ruleVariable returns [EObject current=null] : (otherlv_0= '$' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGrammar.g:876:2: ( (otherlv_0= '$' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGrammar.g:877:2: (otherlv_0= '$' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGrammar.g:877:2: (otherlv_0= '$' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGrammar.g:878:3: otherlv_0= '$' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getDollarSignKeyword_0());
            		
            // InternalGrammar.g:882:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrammar.g:883:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrammar.g:883:4: (lv_name_1_0= RULE_ID )
            // InternalGrammar.g:884:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.Grammar.ID");
            				

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleVariableD"
    // InternalGrammar.g:904:1: entryRuleVariableD returns [EObject current=null] : iv_ruleVariableD= ruleVariableD EOF ;
    public final EObject entryRuleVariableD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableD = null;


        try {
            // InternalGrammar.g:904:50: (iv_ruleVariableD= ruleVariableD EOF )
            // InternalGrammar.g:905:2: iv_ruleVariableD= ruleVariableD EOF
            {
             newCompositeNode(grammarAccess.getVariableDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableD=ruleVariableD();

            state._fsp--;

             current =iv_ruleVariableD; 
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
    // $ANTLR end "entryRuleVariableD"


    // $ANTLR start "ruleVariableD"
    // InternalGrammar.g:911:1: ruleVariableD returns [EObject current=null] : ( ( ( (lv_variable_0_0= ruleVariable ) ) (otherlv_1= '[' otherlv_2= '$' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ']' )? ) otherlv_5= '=' ( ( (lv_value_6_0= ruleValue ) ) | ( (lv_function_7_0= ruleFunction ) ) ) ) ;
    public final EObject ruleVariableD() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_variable_0_0 = null;

        EObject lv_value_6_0 = null;

        EObject lv_function_7_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:917:2: ( ( ( ( (lv_variable_0_0= ruleVariable ) ) (otherlv_1= '[' otherlv_2= '$' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ']' )? ) otherlv_5= '=' ( ( (lv_value_6_0= ruleValue ) ) | ( (lv_function_7_0= ruleFunction ) ) ) ) )
            // InternalGrammar.g:918:2: ( ( ( (lv_variable_0_0= ruleVariable ) ) (otherlv_1= '[' otherlv_2= '$' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ']' )? ) otherlv_5= '=' ( ( (lv_value_6_0= ruleValue ) ) | ( (lv_function_7_0= ruleFunction ) ) ) )
            {
            // InternalGrammar.g:918:2: ( ( ( (lv_variable_0_0= ruleVariable ) ) (otherlv_1= '[' otherlv_2= '$' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ']' )? ) otherlv_5= '=' ( ( (lv_value_6_0= ruleValue ) ) | ( (lv_function_7_0= ruleFunction ) ) ) )
            // InternalGrammar.g:919:3: ( ( (lv_variable_0_0= ruleVariable ) ) (otherlv_1= '[' otherlv_2= '$' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ']' )? ) otherlv_5= '=' ( ( (lv_value_6_0= ruleValue ) ) | ( (lv_function_7_0= ruleFunction ) ) )
            {
            // InternalGrammar.g:919:3: ( ( (lv_variable_0_0= ruleVariable ) ) (otherlv_1= '[' otherlv_2= '$' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ']' )? )
            // InternalGrammar.g:920:4: ( (lv_variable_0_0= ruleVariable ) ) (otherlv_1= '[' otherlv_2= '$' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ']' )?
            {
            // InternalGrammar.g:920:4: ( (lv_variable_0_0= ruleVariable ) )
            // InternalGrammar.g:921:5: (lv_variable_0_0= ruleVariable )
            {
            // InternalGrammar.g:921:5: (lv_variable_0_0= ruleVariable )
            // InternalGrammar.g:922:6: lv_variable_0_0= ruleVariable
            {

            						newCompositeNode(grammarAccess.getVariableDAccess().getVariableVariableParserRuleCall_0_0_0());
            					
            pushFollow(FOLLOW_18);
            lv_variable_0_0=ruleVariable();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getVariableDRule());
            						}
            						set(
            							current,
            							"variable",
            							lv_variable_0_0,
            							"org.xtext.example.Grammar.Variable");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalGrammar.g:939:4: (otherlv_1= '[' otherlv_2= '$' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ']' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGrammar.g:940:5: otherlv_1= '[' otherlv_2= '$' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ']'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_19); 

                    					newLeafNode(otherlv_1, grammarAccess.getVariableDAccess().getLeftSquareBracketKeyword_0_1_0());
                    				
                    otherlv_2=(Token)match(input,21,FOLLOW_17); 

                    					newLeafNode(otherlv_2, grammarAccess.getVariableDAccess().getDollarSignKeyword_0_1_1());
                    				
                    // InternalGrammar.g:948:5: ( (lv_name_3_0= RULE_ID ) )
                    // InternalGrammar.g:949:6: (lv_name_3_0= RULE_ID )
                    {
                    // InternalGrammar.g:949:6: (lv_name_3_0= RULE_ID )
                    // InternalGrammar.g:950:7: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_20); 

                    							newLeafNode(lv_name_3_0, grammarAccess.getVariableDAccess().getNameIDTerminalRuleCall_0_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getVariableDRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_3_0,
                    								"org.xtext.example.Grammar.ID");
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,17,FOLLOW_14); 

                    					newLeafNode(otherlv_4, grammarAccess.getVariableDAccess().getRightSquareBracketKeyword_0_1_3());
                    				

                    }
                    break;

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getVariableDAccess().getEqualsSignKeyword_1());
            		
            // InternalGrammar.g:976:3: ( ( (lv_value_6_0= ruleValue ) ) | ( (lv_function_7_0= ruleFunction ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_INT)||LA13_0==12||LA13_0==16||LA13_0==21||(LA13_0>=50 && LA13_0<=51)) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=35 && LA13_0<=37)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalGrammar.g:977:4: ( (lv_value_6_0= ruleValue ) )
                    {
                    // InternalGrammar.g:977:4: ( (lv_value_6_0= ruleValue ) )
                    // InternalGrammar.g:978:5: (lv_value_6_0= ruleValue )
                    {
                    // InternalGrammar.g:978:5: (lv_value_6_0= ruleValue )
                    // InternalGrammar.g:979:6: lv_value_6_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getVariableDAccess().getValueValueParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_6_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableDRule());
                    						}
                    						add(
                    							current,
                    							"value",
                    							lv_value_6_0,
                    							"org.xtext.example.Grammar.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGrammar.g:997:4: ( (lv_function_7_0= ruleFunction ) )
                    {
                    // InternalGrammar.g:997:4: ( (lv_function_7_0= ruleFunction ) )
                    // InternalGrammar.g:998:5: (lv_function_7_0= ruleFunction )
                    {
                    // InternalGrammar.g:998:5: (lv_function_7_0= ruleFunction )
                    // InternalGrammar.g:999:6: lv_function_7_0= ruleFunction
                    {

                    						newCompositeNode(grammarAccess.getVariableDAccess().getFunctionFunctionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_function_7_0=ruleFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableDRule());
                    						}
                    						add(
                    							current,
                    							"function",
                    							lv_function_7_0,
                    							"org.xtext.example.Grammar.Function");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleVariableD"


    // $ANTLR start "entryRulePage"
    // InternalGrammar.g:1021:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // InternalGrammar.g:1021:45: (iv_rulePage= rulePage EOF )
            // InternalGrammar.g:1022:2: iv_rulePage= rulePage EOF
            {
             newCompositeNode(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePage=rulePage();

            state._fsp--;

             current =iv_rulePage; 
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
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // InternalGrammar.g:1028:1: rulePage returns [EObject current=null] : (otherlv_0= 'page' otherlv_1= '(' ( ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? ) | ( (lv_string_5_0= RULE_STRING ) ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_elementPage_8_0= ruleElementPage ) )* otherlv_9= '}' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_string_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_variable_2_0 = null;

        EObject lv_objectC_3_0 = null;

        EObject lv_arrayC_4_0 = null;

        EObject lv_elementPage_8_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:1034:2: ( (otherlv_0= 'page' otherlv_1= '(' ( ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? ) | ( (lv_string_5_0= RULE_STRING ) ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_elementPage_8_0= ruleElementPage ) )* otherlv_9= '}' ) )
            // InternalGrammar.g:1035:2: (otherlv_0= 'page' otherlv_1= '(' ( ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? ) | ( (lv_string_5_0= RULE_STRING ) ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_elementPage_8_0= ruleElementPage ) )* otherlv_9= '}' )
            {
            // InternalGrammar.g:1035:2: (otherlv_0= 'page' otherlv_1= '(' ( ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? ) | ( (lv_string_5_0= RULE_STRING ) ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_elementPage_8_0= ruleElementPage ) )* otherlv_9= '}' )
            // InternalGrammar.g:1036:3: otherlv_0= 'page' otherlv_1= '(' ( ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? ) | ( (lv_string_5_0= RULE_STRING ) ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_elementPage_8_0= ruleElementPage ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getPageAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGrammar.g:1044:3: ( ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? ) | ( (lv_string_5_0= RULE_STRING ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_STRING) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalGrammar.g:1045:4: ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? )
                    {
                    // InternalGrammar.g:1045:4: ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? )
                    // InternalGrammar.g:1046:5: ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )?
                    {
                    // InternalGrammar.g:1046:5: ( (lv_variable_2_0= ruleVariable ) )
                    // InternalGrammar.g:1047:6: (lv_variable_2_0= ruleVariable )
                    {
                    // InternalGrammar.g:1047:6: (lv_variable_2_0= ruleVariable )
                    // InternalGrammar.g:1048:7: lv_variable_2_0= ruleVariable
                    {

                    							newCompositeNode(grammarAccess.getPageAccess().getVariableVariableParserRuleCall_2_0_0_0());
                    						
                    pushFollow(FOLLOW_23);
                    lv_variable_2_0=ruleVariable();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPageRule());
                    							}
                    							set(
                    								current,
                    								"variable",
                    								lv_variable_2_0,
                    								"org.xtext.example.Grammar.Variable");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalGrammar.g:1065:5: ( (lv_objectC_3_0= ruleObjectC ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==28) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalGrammar.g:1066:6: (lv_objectC_3_0= ruleObjectC )
                            {
                            // InternalGrammar.g:1066:6: (lv_objectC_3_0= ruleObjectC )
                            // InternalGrammar.g:1067:7: lv_objectC_3_0= ruleObjectC
                            {

                            							newCompositeNode(grammarAccess.getPageAccess().getObjectCObjectCParserRuleCall_2_0_1_0());
                            						
                            pushFollow(FOLLOW_24);
                            lv_objectC_3_0=ruleObjectC();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPageRule());
                            							}
                            							set(
                            								current,
                            								"objectC",
                            								lv_objectC_3_0,
                            								"org.xtext.example.Grammar.ObjectC");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalGrammar.g:1084:5: ( (lv_arrayC_4_0= ruleArrayC ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==16) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalGrammar.g:1085:6: (lv_arrayC_4_0= ruleArrayC )
                            {
                            // InternalGrammar.g:1085:6: (lv_arrayC_4_0= ruleArrayC )
                            // InternalGrammar.g:1086:7: lv_arrayC_4_0= ruleArrayC
                            {

                            							newCompositeNode(grammarAccess.getPageAccess().getArrayCArrayCParserRuleCall_2_0_2_0());
                            						
                            pushFollow(FOLLOW_25);
                            lv_arrayC_4_0=ruleArrayC();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPageRule());
                            							}
                            							set(
                            								current,
                            								"arrayC",
                            								lv_arrayC_4_0,
                            								"org.xtext.example.Grammar.ArrayC");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGrammar.g:1105:4: ( (lv_string_5_0= RULE_STRING ) )
                    {
                    // InternalGrammar.g:1105:4: ( (lv_string_5_0= RULE_STRING ) )
                    // InternalGrammar.g:1106:5: (lv_string_5_0= RULE_STRING )
                    {
                    // InternalGrammar.g:1106:5: (lv_string_5_0= RULE_STRING )
                    // InternalGrammar.g:1107:6: lv_string_5_0= RULE_STRING
                    {
                    lv_string_5_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

                    						newLeafNode(lv_string_5_0, grammarAccess.getPageAccess().getStringSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPageRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"string",
                    							lv_string_5_0,
                    							"org.xtext.example.Grammar.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getPageAccess().getRightParenthesisKeyword_3());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalGrammar.g:1132:3: ( (lv_elementPage_8_0= ruleElementPage ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==21||LA17_0==26||LA17_0==40||LA17_0==44) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGrammar.g:1133:4: (lv_elementPage_8_0= ruleElementPage )
            	    {
            	    // InternalGrammar.g:1133:4: (lv_elementPage_8_0= ruleElementPage )
            	    // InternalGrammar.g:1134:5: lv_elementPage_8_0= ruleElementPage
            	    {

            	    					newCompositeNode(grammarAccess.getPageAccess().getElementPageElementPageParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_elementPage_8_0=ruleElementPage();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elementPage",
            	    						lv_elementPage_8_0,
            	    						"org.xtext.example.Grammar.ElementPage");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleElementPage"
    // InternalGrammar.g:1159:1: entryRuleElementPage returns [EObject current=null] : iv_ruleElementPage= ruleElementPage EOF ;
    public final EObject entryRuleElementPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementPage = null;


        try {
            // InternalGrammar.g:1159:52: (iv_ruleElementPage= ruleElementPage EOF )
            // InternalGrammar.g:1160:2: iv_ruleElementPage= ruleElementPage EOF
            {
             newCompositeNode(grammarAccess.getElementPageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementPage=ruleElementPage();

            state._fsp--;

             current =iv_ruleElementPage; 
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
    // $ANTLR end "entryRuleElementPage"


    // $ANTLR start "ruleElementPage"
    // InternalGrammar.g:1166:1: ruleElementPage returns [EObject current=null] : ( ( (lv_row_0_0= ruleRow ) ) | ( (lv_loop_1_0= ruleLoop ) ) | ( (lv_conditional_2_0= ruleConditional ) ) | ( ( (lv_variable_3_0= ruleVariableD ) ) otherlv_4= ';' ) ) ;
    public final EObject ruleElementPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_row_0_0 = null;

        EObject lv_loop_1_0 = null;

        EObject lv_conditional_2_0 = null;

        EObject lv_variable_3_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:1172:2: ( ( ( (lv_row_0_0= ruleRow ) ) | ( (lv_loop_1_0= ruleLoop ) ) | ( (lv_conditional_2_0= ruleConditional ) ) | ( ( (lv_variable_3_0= ruleVariableD ) ) otherlv_4= ';' ) ) )
            // InternalGrammar.g:1173:2: ( ( (lv_row_0_0= ruleRow ) ) | ( (lv_loop_1_0= ruleLoop ) ) | ( (lv_conditional_2_0= ruleConditional ) ) | ( ( (lv_variable_3_0= ruleVariableD ) ) otherlv_4= ';' ) )
            {
            // InternalGrammar.g:1173:2: ( ( (lv_row_0_0= ruleRow ) ) | ( (lv_loop_1_0= ruleLoop ) ) | ( (lv_conditional_2_0= ruleConditional ) ) | ( ( (lv_variable_3_0= ruleVariableD ) ) otherlv_4= ';' ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt18=1;
                }
                break;
            case 44:
                {
                alt18=2;
                }
                break;
            case 21:
                {
                int LA18_3 = input.LA(2);

                if ( (LA18_3==RULE_ID) ) {
                    int LA18_5 = input.LA(3);

                    if ( (LA18_5==16||LA18_5==20) ) {
                        alt18=4;
                    }
                    else if ( (LA18_5==46) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 3, input);

                    throw nvae;
                }
                }
                break;
            case 40:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalGrammar.g:1174:3: ( (lv_row_0_0= ruleRow ) )
                    {
                    // InternalGrammar.g:1174:3: ( (lv_row_0_0= ruleRow ) )
                    // InternalGrammar.g:1175:4: (lv_row_0_0= ruleRow )
                    {
                    // InternalGrammar.g:1175:4: (lv_row_0_0= ruleRow )
                    // InternalGrammar.g:1176:5: lv_row_0_0= ruleRow
                    {

                    					newCompositeNode(grammarAccess.getElementPageAccess().getRowRowParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_row_0_0=ruleRow();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElementPageRule());
                    					}
                    					set(
                    						current,
                    						"row",
                    						lv_row_0_0,
                    						"org.xtext.example.Grammar.Row");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGrammar.g:1194:3: ( (lv_loop_1_0= ruleLoop ) )
                    {
                    // InternalGrammar.g:1194:3: ( (lv_loop_1_0= ruleLoop ) )
                    // InternalGrammar.g:1195:4: (lv_loop_1_0= ruleLoop )
                    {
                    // InternalGrammar.g:1195:4: (lv_loop_1_0= ruleLoop )
                    // InternalGrammar.g:1196:5: lv_loop_1_0= ruleLoop
                    {

                    					newCompositeNode(grammarAccess.getElementPageAccess().getLoopLoopParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_loop_1_0=ruleLoop();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElementPageRule());
                    					}
                    					set(
                    						current,
                    						"loop",
                    						lv_loop_1_0,
                    						"org.xtext.example.Grammar.Loop");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGrammar.g:1214:3: ( (lv_conditional_2_0= ruleConditional ) )
                    {
                    // InternalGrammar.g:1214:3: ( (lv_conditional_2_0= ruleConditional ) )
                    // InternalGrammar.g:1215:4: (lv_conditional_2_0= ruleConditional )
                    {
                    // InternalGrammar.g:1215:4: (lv_conditional_2_0= ruleConditional )
                    // InternalGrammar.g:1216:5: lv_conditional_2_0= ruleConditional
                    {

                    					newCompositeNode(grammarAccess.getElementPageAccess().getConditionalConditionalParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_conditional_2_0=ruleConditional();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElementPageRule());
                    					}
                    					set(
                    						current,
                    						"conditional",
                    						lv_conditional_2_0,
                    						"org.xtext.example.Grammar.Conditional");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGrammar.g:1234:3: ( ( (lv_variable_3_0= ruleVariableD ) ) otherlv_4= ';' )
                    {
                    // InternalGrammar.g:1234:3: ( ( (lv_variable_3_0= ruleVariableD ) ) otherlv_4= ';' )
                    // InternalGrammar.g:1235:4: ( (lv_variable_3_0= ruleVariableD ) ) otherlv_4= ';'
                    {
                    // InternalGrammar.g:1235:4: ( (lv_variable_3_0= ruleVariableD ) )
                    // InternalGrammar.g:1236:5: (lv_variable_3_0= ruleVariableD )
                    {
                    // InternalGrammar.g:1236:5: (lv_variable_3_0= ruleVariableD )
                    // InternalGrammar.g:1237:6: lv_variable_3_0= ruleVariableD
                    {

                    						newCompositeNode(grammarAccess.getElementPageAccess().getVariableVariableDParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_variable_3_0=ruleVariableD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementPageRule());
                    						}
                    						set(
                    							current,
                    							"variable",
                    							lv_variable_3_0,
                    							"org.xtext.example.Grammar.VariableD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getElementPageAccess().getSemicolonKeyword_3_1());
                    			

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
    // $ANTLR end "ruleElementPage"


    // $ANTLR start "entryRuleRow"
    // InternalGrammar.g:1263:1: entryRuleRow returns [EObject current=null] : iv_ruleRow= ruleRow EOF ;
    public final EObject entryRuleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRow = null;


        try {
            // InternalGrammar.g:1263:44: (iv_ruleRow= ruleRow EOF )
            // InternalGrammar.g:1264:2: iv_ruleRow= ruleRow EOF
            {
             newCompositeNode(grammarAccess.getRowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRow=ruleRow();

            state._fsp--;

             current =iv_ruleRow; 
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
    // $ANTLR end "entryRuleRow"


    // $ANTLR start "ruleRow"
    // InternalGrammar.g:1270:1: ruleRow returns [EObject current=null] : (otherlv_0= 'row' otherlv_1= '{' ( (lv_elementRow_2_0= ruleElementRow ) )* otherlv_3= '}' ) ;
    public final EObject ruleRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elementRow_2_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:1276:2: ( (otherlv_0= 'row' otherlv_1= '{' ( (lv_elementRow_2_0= ruleElementRow ) )* otherlv_3= '}' ) )
            // InternalGrammar.g:1277:2: (otherlv_0= 'row' otherlv_1= '{' ( (lv_elementRow_2_0= ruleElementRow ) )* otherlv_3= '}' )
            {
            // InternalGrammar.g:1277:2: (otherlv_0= 'row' otherlv_1= '{' ( (lv_elementRow_2_0= ruleElementRow ) )* otherlv_3= '}' )
            // InternalGrammar.g:1278:3: otherlv_0= 'row' otherlv_1= '{' ( (lv_elementRow_2_0= ruleElementRow ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRowAccess().getRowKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getRowAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGrammar.g:1286:3: ( (lv_elementRow_2_0= ruleElementRow ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==21||LA19_0==27||LA19_0==40||LA19_0==44) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGrammar.g:1287:4: (lv_elementRow_2_0= ruleElementRow )
            	    {
            	    // InternalGrammar.g:1287:4: (lv_elementRow_2_0= ruleElementRow )
            	    // InternalGrammar.g:1288:5: lv_elementRow_2_0= ruleElementRow
            	    {

            	    					newCompositeNode(grammarAccess.getRowAccess().getElementRowElementRowParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_elementRow_2_0=ruleElementRow();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRowRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elementRow",
            	    						lv_elementRow_2_0,
            	    						"org.xtext.example.Grammar.ElementRow");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRowAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleRow"


    // $ANTLR start "entryRuleElementRow"
    // InternalGrammar.g:1313:1: entryRuleElementRow returns [EObject current=null] : iv_ruleElementRow= ruleElementRow EOF ;
    public final EObject entryRuleElementRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementRow = null;


        try {
            // InternalGrammar.g:1313:51: (iv_ruleElementRow= ruleElementRow EOF )
            // InternalGrammar.g:1314:2: iv_ruleElementRow= ruleElementRow EOF
            {
             newCompositeNode(grammarAccess.getElementRowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementRow=ruleElementRow();

            state._fsp--;

             current =iv_ruleElementRow; 
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
    // $ANTLR end "entryRuleElementRow"


    // $ANTLR start "ruleElementRow"
    // InternalGrammar.g:1320:1: ruleElementRow returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariable ) ) | ( (lv_variableD_1_0= ruleVariableD ) ) | ( (lv_col_2_0= ruleCol ) ) | ( (lv_conditional_3_0= ruleConditional ) ) | ( (lv_loop_4_0= ruleLoop ) ) ) ;
    public final EObject ruleElementRow() throws RecognitionException {
        EObject current = null;

        EObject lv_variable_0_0 = null;

        EObject lv_variableD_1_0 = null;

        EObject lv_col_2_0 = null;

        EObject lv_conditional_3_0 = null;

        EObject lv_loop_4_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:1326:2: ( ( ( (lv_variable_0_0= ruleVariable ) ) | ( (lv_variableD_1_0= ruleVariableD ) ) | ( (lv_col_2_0= ruleCol ) ) | ( (lv_conditional_3_0= ruleConditional ) ) | ( (lv_loop_4_0= ruleLoop ) ) ) )
            // InternalGrammar.g:1327:2: ( ( (lv_variable_0_0= ruleVariable ) ) | ( (lv_variableD_1_0= ruleVariableD ) ) | ( (lv_col_2_0= ruleCol ) ) | ( (lv_conditional_3_0= ruleConditional ) ) | ( (lv_loop_4_0= ruleLoop ) ) )
            {
            // InternalGrammar.g:1327:2: ( ( (lv_variable_0_0= ruleVariable ) ) | ( (lv_variableD_1_0= ruleVariableD ) ) | ( (lv_col_2_0= ruleCol ) ) | ( (lv_conditional_3_0= ruleConditional ) ) | ( (lv_loop_4_0= ruleLoop ) ) )
            int alt20=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 16:
                    case 20:
                        {
                        alt20=2;
                        }
                        break;
                    case 46:
                        {
                        alt20=5;
                        }
                        break;
                    case EOF:
                    case 14:
                    case 21:
                    case 27:
                    case 40:
                    case 44:
                        {
                        alt20=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 5, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
                }
                break;
            case 27:
                {
                alt20=3;
                }
                break;
            case 40:
                {
                alt20=4;
                }
                break;
            case 44:
                {
                alt20=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalGrammar.g:1328:3: ( (lv_variable_0_0= ruleVariable ) )
                    {
                    // InternalGrammar.g:1328:3: ( (lv_variable_0_0= ruleVariable ) )
                    // InternalGrammar.g:1329:4: (lv_variable_0_0= ruleVariable )
                    {
                    // InternalGrammar.g:1329:4: (lv_variable_0_0= ruleVariable )
                    // InternalGrammar.g:1330:5: lv_variable_0_0= ruleVariable
                    {

                    					newCompositeNode(grammarAccess.getElementRowAccess().getVariableVariableParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_variable_0_0=ruleVariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElementRowRule());
                    					}
                    					set(
                    						current,
                    						"variable",
                    						lv_variable_0_0,
                    						"org.xtext.example.Grammar.Variable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGrammar.g:1348:3: ( (lv_variableD_1_0= ruleVariableD ) )
                    {
                    // InternalGrammar.g:1348:3: ( (lv_variableD_1_0= ruleVariableD ) )
                    // InternalGrammar.g:1349:4: (lv_variableD_1_0= ruleVariableD )
                    {
                    // InternalGrammar.g:1349:4: (lv_variableD_1_0= ruleVariableD )
                    // InternalGrammar.g:1350:5: lv_variableD_1_0= ruleVariableD
                    {

                    					newCompositeNode(grammarAccess.getElementRowAccess().getVariableDVariableDParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_variableD_1_0=ruleVariableD();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElementRowRule());
                    					}
                    					set(
                    						current,
                    						"variableD",
                    						lv_variableD_1_0,
                    						"org.xtext.example.Grammar.VariableD");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGrammar.g:1368:3: ( (lv_col_2_0= ruleCol ) )
                    {
                    // InternalGrammar.g:1368:3: ( (lv_col_2_0= ruleCol ) )
                    // InternalGrammar.g:1369:4: (lv_col_2_0= ruleCol )
                    {
                    // InternalGrammar.g:1369:4: (lv_col_2_0= ruleCol )
                    // InternalGrammar.g:1370:5: lv_col_2_0= ruleCol
                    {

                    					newCompositeNode(grammarAccess.getElementRowAccess().getColColParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_col_2_0=ruleCol();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElementRowRule());
                    					}
                    					set(
                    						current,
                    						"col",
                    						lv_col_2_0,
                    						"org.xtext.example.Grammar.Col");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGrammar.g:1388:3: ( (lv_conditional_3_0= ruleConditional ) )
                    {
                    // InternalGrammar.g:1388:3: ( (lv_conditional_3_0= ruleConditional ) )
                    // InternalGrammar.g:1389:4: (lv_conditional_3_0= ruleConditional )
                    {
                    // InternalGrammar.g:1389:4: (lv_conditional_3_0= ruleConditional )
                    // InternalGrammar.g:1390:5: lv_conditional_3_0= ruleConditional
                    {

                    					newCompositeNode(grammarAccess.getElementRowAccess().getConditionalConditionalParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_conditional_3_0=ruleConditional();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElementRowRule());
                    					}
                    					set(
                    						current,
                    						"conditional",
                    						lv_conditional_3_0,
                    						"org.xtext.example.Grammar.Conditional");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalGrammar.g:1408:3: ( (lv_loop_4_0= ruleLoop ) )
                    {
                    // InternalGrammar.g:1408:3: ( (lv_loop_4_0= ruleLoop ) )
                    // InternalGrammar.g:1409:4: (lv_loop_4_0= ruleLoop )
                    {
                    // InternalGrammar.g:1409:4: (lv_loop_4_0= ruleLoop )
                    // InternalGrammar.g:1410:5: lv_loop_4_0= ruleLoop
                    {

                    					newCompositeNode(grammarAccess.getElementRowAccess().getLoopLoopParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_loop_4_0=ruleLoop();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElementRowRule());
                    					}
                    					set(
                    						current,
                    						"loop",
                    						lv_loop_4_0,
                    						"org.xtext.example.Grammar.Loop");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleElementRow"


    // $ANTLR start "entryRuleCol"
    // InternalGrammar.g:1431:1: entryRuleCol returns [EObject current=null] : iv_ruleCol= ruleCol EOF ;
    public final EObject entryRuleCol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCol = null;


        try {
            // InternalGrammar.g:1431:44: (iv_ruleCol= ruleCol EOF )
            // InternalGrammar.g:1432:2: iv_ruleCol= ruleCol EOF
            {
             newCompositeNode(grammarAccess.getColRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCol=ruleCol();

            state._fsp--;

             current =iv_ruleCol; 
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
    // $ANTLR end "entryRuleCol"


    // $ANTLR start "ruleCol"
    // InternalGrammar.g:1438:1: ruleCol returns [EObject current=null] : (otherlv_0= 'col' ( (lv_fusion_1_0= ruleFusion ) ) ( ( (lv_img_2_0= ruleImg ) ) | ( ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )? ) | ( (lv_variableD_6_0= ruleVariableD ) ) | ( (lv_string_7_0= RULE_STRING ) ) | ( (lv_integer_8_0= RULE_INT ) ) | ( (lv_floatValue_9_0= ruleFloat ) ) | ( (lv_function_10_0= ruleFunction ) ) ) ( (lv_classD_11_0= ruleClassD ) ) ) ;
    public final EObject ruleCol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_string_7_0=null;
        Token lv_integer_8_0=null;
        EObject lv_fusion_1_0 = null;

        EObject lv_img_2_0 = null;

        EObject lv_variable_3_0 = null;

        EObject lv_objectC_4_0 = null;

        EObject lv_arrayC_5_0 = null;

        EObject lv_variableD_6_0 = null;

        EObject lv_floatValue_9_0 = null;

        EObject lv_function_10_0 = null;

        EObject lv_classD_11_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:1444:2: ( (otherlv_0= 'col' ( (lv_fusion_1_0= ruleFusion ) ) ( ( (lv_img_2_0= ruleImg ) ) | ( ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )? ) | ( (lv_variableD_6_0= ruleVariableD ) ) | ( (lv_string_7_0= RULE_STRING ) ) | ( (lv_integer_8_0= RULE_INT ) ) | ( (lv_floatValue_9_0= ruleFloat ) ) | ( (lv_function_10_0= ruleFunction ) ) ) ( (lv_classD_11_0= ruleClassD ) ) ) )
            // InternalGrammar.g:1445:2: (otherlv_0= 'col' ( (lv_fusion_1_0= ruleFusion ) ) ( ( (lv_img_2_0= ruleImg ) ) | ( ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )? ) | ( (lv_variableD_6_0= ruleVariableD ) ) | ( (lv_string_7_0= RULE_STRING ) ) | ( (lv_integer_8_0= RULE_INT ) ) | ( (lv_floatValue_9_0= ruleFloat ) ) | ( (lv_function_10_0= ruleFunction ) ) ) ( (lv_classD_11_0= ruleClassD ) ) )
            {
            // InternalGrammar.g:1445:2: (otherlv_0= 'col' ( (lv_fusion_1_0= ruleFusion ) ) ( ( (lv_img_2_0= ruleImg ) ) | ( ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )? ) | ( (lv_variableD_6_0= ruleVariableD ) ) | ( (lv_string_7_0= RULE_STRING ) ) | ( (lv_integer_8_0= RULE_INT ) ) | ( (lv_floatValue_9_0= ruleFloat ) ) | ( (lv_function_10_0= ruleFunction ) ) ) ( (lv_classD_11_0= ruleClassD ) ) )
            // InternalGrammar.g:1446:3: otherlv_0= 'col' ( (lv_fusion_1_0= ruleFusion ) ) ( ( (lv_img_2_0= ruleImg ) ) | ( ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )? ) | ( (lv_variableD_6_0= ruleVariableD ) ) | ( (lv_string_7_0= RULE_STRING ) ) | ( (lv_integer_8_0= RULE_INT ) ) | ( (lv_floatValue_9_0= ruleFloat ) ) | ( (lv_function_10_0= ruleFunction ) ) ) ( (lv_classD_11_0= ruleClassD ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getColAccess().getColKeyword_0());
            		
            // InternalGrammar.g:1450:3: ( (lv_fusion_1_0= ruleFusion ) )
            // InternalGrammar.g:1451:4: (lv_fusion_1_0= ruleFusion )
            {
            // InternalGrammar.g:1451:4: (lv_fusion_1_0= ruleFusion )
            // InternalGrammar.g:1452:5: lv_fusion_1_0= ruleFusion
            {

            					newCompositeNode(grammarAccess.getColAccess().getFusionFusionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
            lv_fusion_1_0=ruleFusion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColRule());
            					}
            					set(
            						current,
            						"fusion",
            						lv_fusion_1_0,
            						"org.xtext.example.Grammar.Fusion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGrammar.g:1469:3: ( ( (lv_img_2_0= ruleImg ) ) | ( ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )? ) | ( (lv_variableD_6_0= ruleVariableD ) ) | ( (lv_string_7_0= RULE_STRING ) ) | ( (lv_integer_8_0= RULE_INT ) ) | ( (lv_floatValue_9_0= ruleFloat ) ) | ( (lv_function_10_0= ruleFunction ) ) )
            int alt23=7;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalGrammar.g:1470:4: ( (lv_img_2_0= ruleImg ) )
                    {
                    // InternalGrammar.g:1470:4: ( (lv_img_2_0= ruleImg ) )
                    // InternalGrammar.g:1471:5: (lv_img_2_0= ruleImg )
                    {
                    // InternalGrammar.g:1471:5: (lv_img_2_0= ruleImg )
                    // InternalGrammar.g:1472:6: lv_img_2_0= ruleImg
                    {

                    						newCompositeNode(grammarAccess.getColAccess().getImgImgParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_img_2_0=ruleImg();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColRule());
                    						}
                    						set(
                    							current,
                    							"img",
                    							lv_img_2_0,
                    							"org.xtext.example.Grammar.Img");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGrammar.g:1490:4: ( ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )? )
                    {
                    // InternalGrammar.g:1490:4: ( ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )? )
                    // InternalGrammar.g:1491:5: ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )?
                    {
                    // InternalGrammar.g:1491:5: ( (lv_variable_3_0= ruleVariable ) )
                    // InternalGrammar.g:1492:6: (lv_variable_3_0= ruleVariable )
                    {
                    // InternalGrammar.g:1492:6: (lv_variable_3_0= ruleVariable )
                    // InternalGrammar.g:1493:7: lv_variable_3_0= ruleVariable
                    {

                    							newCompositeNode(grammarAccess.getColAccess().getVariableVariableParserRuleCall_2_1_0_0());
                    						
                    pushFollow(FOLLOW_32);
                    lv_variable_3_0=ruleVariable();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getColRule());
                    							}
                    							set(
                    								current,
                    								"variable",
                    								lv_variable_3_0,
                    								"org.xtext.example.Grammar.Variable");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalGrammar.g:1510:5: ( (lv_objectC_4_0= ruleObjectC ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==28) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalGrammar.g:1511:6: (lv_objectC_4_0= ruleObjectC )
                            {
                            // InternalGrammar.g:1511:6: (lv_objectC_4_0= ruleObjectC )
                            // InternalGrammar.g:1512:7: lv_objectC_4_0= ruleObjectC
                            {

                            							newCompositeNode(grammarAccess.getColAccess().getObjectCObjectCParserRuleCall_2_1_1_0());
                            						
                            pushFollow(FOLLOW_33);
                            lv_objectC_4_0=ruleObjectC();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getColRule());
                            							}
                            							set(
                            								current,
                            								"objectC",
                            								lv_objectC_4_0,
                            								"org.xtext.example.Grammar.ObjectC");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalGrammar.g:1529:5: ( (lv_arrayC_5_0= ruleArrayC ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==16) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalGrammar.g:1530:6: (lv_arrayC_5_0= ruleArrayC )
                            {
                            // InternalGrammar.g:1530:6: (lv_arrayC_5_0= ruleArrayC )
                            // InternalGrammar.g:1531:7: lv_arrayC_5_0= ruleArrayC
                            {

                            							newCompositeNode(grammarAccess.getColAccess().getArrayCArrayCParserRuleCall_2_1_2_0());
                            						
                            pushFollow(FOLLOW_31);
                            lv_arrayC_5_0=ruleArrayC();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getColRule());
                            							}
                            							set(
                            								current,
                            								"arrayC",
                            								lv_arrayC_5_0,
                            								"org.xtext.example.Grammar.ArrayC");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGrammar.g:1550:4: ( (lv_variableD_6_0= ruleVariableD ) )
                    {
                    // InternalGrammar.g:1550:4: ( (lv_variableD_6_0= ruleVariableD ) )
                    // InternalGrammar.g:1551:5: (lv_variableD_6_0= ruleVariableD )
                    {
                    // InternalGrammar.g:1551:5: (lv_variableD_6_0= ruleVariableD )
                    // InternalGrammar.g:1552:6: lv_variableD_6_0= ruleVariableD
                    {

                    						newCompositeNode(grammarAccess.getColAccess().getVariableDVariableDParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_variableD_6_0=ruleVariableD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColRule());
                    						}
                    						set(
                    							current,
                    							"variableD",
                    							lv_variableD_6_0,
                    							"org.xtext.example.Grammar.VariableD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGrammar.g:1570:4: ( (lv_string_7_0= RULE_STRING ) )
                    {
                    // InternalGrammar.g:1570:4: ( (lv_string_7_0= RULE_STRING ) )
                    // InternalGrammar.g:1571:5: (lv_string_7_0= RULE_STRING )
                    {
                    // InternalGrammar.g:1571:5: (lv_string_7_0= RULE_STRING )
                    // InternalGrammar.g:1572:6: lv_string_7_0= RULE_STRING
                    {
                    lv_string_7_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

                    						newLeafNode(lv_string_7_0, grammarAccess.getColAccess().getStringSTRINGTerminalRuleCall_2_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"string",
                    							lv_string_7_0,
                    							"org.xtext.example.Grammar.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalGrammar.g:1589:4: ( (lv_integer_8_0= RULE_INT ) )
                    {
                    // InternalGrammar.g:1589:4: ( (lv_integer_8_0= RULE_INT ) )
                    // InternalGrammar.g:1590:5: (lv_integer_8_0= RULE_INT )
                    {
                    // InternalGrammar.g:1590:5: (lv_integer_8_0= RULE_INT )
                    // InternalGrammar.g:1591:6: lv_integer_8_0= RULE_INT
                    {
                    lv_integer_8_0=(Token)match(input,RULE_INT,FOLLOW_31); 

                    						newLeafNode(lv_integer_8_0, grammarAccess.getColAccess().getIntegerINTTerminalRuleCall_2_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"integer",
                    							lv_integer_8_0,
                    							"org.xtext.example.Grammar.INT");
                    					

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalGrammar.g:1608:4: ( (lv_floatValue_9_0= ruleFloat ) )
                    {
                    // InternalGrammar.g:1608:4: ( (lv_floatValue_9_0= ruleFloat ) )
                    // InternalGrammar.g:1609:5: (lv_floatValue_9_0= ruleFloat )
                    {
                    // InternalGrammar.g:1609:5: (lv_floatValue_9_0= ruleFloat )
                    // InternalGrammar.g:1610:6: lv_floatValue_9_0= ruleFloat
                    {

                    						newCompositeNode(grammarAccess.getColAccess().getFloatValueFloatParserRuleCall_2_5_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_floatValue_9_0=ruleFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColRule());
                    						}
                    						set(
                    							current,
                    							"floatValue",
                    							lv_floatValue_9_0,
                    							"org.xtext.example.Grammar.Float");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalGrammar.g:1628:4: ( (lv_function_10_0= ruleFunction ) )
                    {
                    // InternalGrammar.g:1628:4: ( (lv_function_10_0= ruleFunction ) )
                    // InternalGrammar.g:1629:5: (lv_function_10_0= ruleFunction )
                    {
                    // InternalGrammar.g:1629:5: (lv_function_10_0= ruleFunction )
                    // InternalGrammar.g:1630:6: lv_function_10_0= ruleFunction
                    {

                    						newCompositeNode(grammarAccess.getColAccess().getFunctionFunctionParserRuleCall_2_6_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_function_10_0=ruleFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColRule());
                    						}
                    						set(
                    							current,
                    							"function",
                    							lv_function_10_0,
                    							"org.xtext.example.Grammar.Function");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGrammar.g:1648:3: ( (lv_classD_11_0= ruleClassD ) )
            // InternalGrammar.g:1649:4: (lv_classD_11_0= ruleClassD )
            {
            // InternalGrammar.g:1649:4: (lv_classD_11_0= ruleClassD )
            // InternalGrammar.g:1650:5: lv_classD_11_0= ruleClassD
            {

            					newCompositeNode(grammarAccess.getColAccess().getClassDClassDParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_classD_11_0=ruleClassD();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColRule());
            					}
            					set(
            						current,
            						"classD",
            						lv_classD_11_0,
            						"org.xtext.example.Grammar.ClassD");
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
    // $ANTLR end "ruleCol"


    // $ANTLR start "entryRuleArrayC"
    // InternalGrammar.g:1671:1: entryRuleArrayC returns [EObject current=null] : iv_ruleArrayC= ruleArrayC EOF ;
    public final EObject entryRuleArrayC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayC = null;


        try {
            // InternalGrammar.g:1671:47: (iv_ruleArrayC= ruleArrayC EOF )
            // InternalGrammar.g:1672:2: iv_ruleArrayC= ruleArrayC EOF
            {
             newCompositeNode(grammarAccess.getArrayCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrayC=ruleArrayC();

            state._fsp--;

             current =iv_ruleArrayC; 
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
    // $ANTLR end "entryRuleArrayC"


    // $ANTLR start "ruleArrayC"
    // InternalGrammar.g:1678:1: ruleArrayC returns [EObject current=null] : (otherlv_0= '[' ( (lv_position_1_0= rulePosition ) ) otherlv_2= ']' ) ;
    public final EObject ruleArrayC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_position_1_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:1684:2: ( (otherlv_0= '[' ( (lv_position_1_0= rulePosition ) ) otherlv_2= ']' ) )
            // InternalGrammar.g:1685:2: (otherlv_0= '[' ( (lv_position_1_0= rulePosition ) ) otherlv_2= ']' )
            {
            // InternalGrammar.g:1685:2: (otherlv_0= '[' ( (lv_position_1_0= rulePosition ) ) otherlv_2= ']' )
            // InternalGrammar.g:1686:3: otherlv_0= '[' ( (lv_position_1_0= rulePosition ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getArrayCAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalGrammar.g:1690:3: ( (lv_position_1_0= rulePosition ) )
            // InternalGrammar.g:1691:4: (lv_position_1_0= rulePosition )
            {
            // InternalGrammar.g:1691:4: (lv_position_1_0= rulePosition )
            // InternalGrammar.g:1692:5: lv_position_1_0= rulePosition
            {

            					newCompositeNode(grammarAccess.getArrayCAccess().getPositionPositionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_position_1_0=rulePosition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArrayCRule());
            					}
            					set(
            						current,
            						"position",
            						lv_position_1_0,
            						"org.xtext.example.Grammar.Position");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getArrayCAccess().getRightSquareBracketKeyword_2());
            		

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
    // $ANTLR end "ruleArrayC"


    // $ANTLR start "entryRulePosition"
    // InternalGrammar.g:1717:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // InternalGrammar.g:1717:49: (iv_rulePosition= rulePosition EOF )
            // InternalGrammar.g:1718:2: iv_rulePosition= rulePosition EOF
            {
             newCompositeNode(grammarAccess.getPositionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePosition=rulePosition();

            state._fsp--;

             current =iv_rulePosition; 
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
    // $ANTLR end "entryRulePosition"


    // $ANTLR start "rulePosition"
    // InternalGrammar.g:1724:1: rulePosition returns [EObject current=null] : ( ( (lv_integer_0_0= RULE_INT ) ) | ( (lv_variable_1_0= ruleVariable ) ) ) ;
    public final EObject rulePosition() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;
        EObject lv_variable_1_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:1730:2: ( ( ( (lv_integer_0_0= RULE_INT ) ) | ( (lv_variable_1_0= ruleVariable ) ) ) )
            // InternalGrammar.g:1731:2: ( ( (lv_integer_0_0= RULE_INT ) ) | ( (lv_variable_1_0= ruleVariable ) ) )
            {
            // InternalGrammar.g:1731:2: ( ( (lv_integer_0_0= RULE_INT ) ) | ( (lv_variable_1_0= ruleVariable ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT) ) {
                alt24=1;
            }
            else if ( (LA24_0==21) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalGrammar.g:1732:3: ( (lv_integer_0_0= RULE_INT ) )
                    {
                    // InternalGrammar.g:1732:3: ( (lv_integer_0_0= RULE_INT ) )
                    // InternalGrammar.g:1733:4: (lv_integer_0_0= RULE_INT )
                    {
                    // InternalGrammar.g:1733:4: (lv_integer_0_0= RULE_INT )
                    // InternalGrammar.g:1734:5: lv_integer_0_0= RULE_INT
                    {
                    lv_integer_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_integer_0_0, grammarAccess.getPositionAccess().getIntegerINTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPositionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"integer",
                    						lv_integer_0_0,
                    						"org.xtext.example.Grammar.INT");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGrammar.g:1751:3: ( (lv_variable_1_0= ruleVariable ) )
                    {
                    // InternalGrammar.g:1751:3: ( (lv_variable_1_0= ruleVariable ) )
                    // InternalGrammar.g:1752:4: (lv_variable_1_0= ruleVariable )
                    {
                    // InternalGrammar.g:1752:4: (lv_variable_1_0= ruleVariable )
                    // InternalGrammar.g:1753:5: lv_variable_1_0= ruleVariable
                    {

                    					newCompositeNode(grammarAccess.getPositionAccess().getVariableVariableParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_variable_1_0=ruleVariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPositionRule());
                    					}
                    					set(
                    						current,
                    						"variable",
                    						lv_variable_1_0,
                    						"org.xtext.example.Grammar.Variable");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "rulePosition"


    // $ANTLR start "entryRuleObjectC"
    // InternalGrammar.g:1774:1: entryRuleObjectC returns [EObject current=null] : iv_ruleObjectC= ruleObjectC EOF ;
    public final EObject entryRuleObjectC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectC = null;


        try {
            // InternalGrammar.g:1774:48: (iv_ruleObjectC= ruleObjectC EOF )
            // InternalGrammar.g:1775:2: iv_ruleObjectC= ruleObjectC EOF
            {
             newCompositeNode(grammarAccess.getObjectCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectC=ruleObjectC();

            state._fsp--;

             current =iv_ruleObjectC; 
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
    // $ANTLR end "entryRuleObjectC"


    // $ANTLR start "ruleObjectC"
    // InternalGrammar.g:1781:1: ruleObjectC returns [EObject current=null] : (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleObjectC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGrammar.g:1787:2: ( (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGrammar.g:1788:2: (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGrammar.g:1788:2: (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGrammar.g:1789:3: otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectCAccess().getFullStopKeyword_0());
            		
            // InternalGrammar.g:1793:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrammar.g:1794:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrammar.g:1794:4: (lv_name_1_0= RULE_ID )
            // InternalGrammar.g:1795:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getObjectCAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectCRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.Grammar.ID");
            				

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
    // $ANTLR end "ruleObjectC"


    // $ANTLR start "entryRuleImg"
    // InternalGrammar.g:1815:1: entryRuleImg returns [EObject current=null] : iv_ruleImg= ruleImg EOF ;
    public final EObject entryRuleImg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImg = null;


        try {
            // InternalGrammar.g:1815:44: (iv_ruleImg= ruleImg EOF )
            // InternalGrammar.g:1816:2: iv_ruleImg= ruleImg EOF
            {
             newCompositeNode(grammarAccess.getImgRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImg=ruleImg();

            state._fsp--;

             current =iv_ruleImg; 
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
    // $ANTLR end "entryRuleImg"


    // $ANTLR start "ruleImg"
    // InternalGrammar.g:1822:1: ruleImg returns [EObject current=null] : (otherlv_0= 'img' ( (lv_classD_1_0= ruleClassD ) ) otherlv_2= 'src' otherlv_3= ':' ( ( (lv_string_4_0= RULE_STRING ) ) | ( ( (lv_variable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )? ( (lv_arrayC_7_0= ruleArrayC ) )? ) ) (otherlv_8= 'alt' otherlv_9= ':' ( (lv_stringAlt_10_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleImg() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_string_4_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_stringAlt_10_0=null;
        EObject lv_classD_1_0 = null;

        EObject lv_variable_5_0 = null;

        EObject lv_objectC_6_0 = null;

        EObject lv_arrayC_7_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:1828:2: ( (otherlv_0= 'img' ( (lv_classD_1_0= ruleClassD ) ) otherlv_2= 'src' otherlv_3= ':' ( ( (lv_string_4_0= RULE_STRING ) ) | ( ( (lv_variable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )? ( (lv_arrayC_7_0= ruleArrayC ) )? ) ) (otherlv_8= 'alt' otherlv_9= ':' ( (lv_stringAlt_10_0= RULE_STRING ) ) )? ) )
            // InternalGrammar.g:1829:2: (otherlv_0= 'img' ( (lv_classD_1_0= ruleClassD ) ) otherlv_2= 'src' otherlv_3= ':' ( ( (lv_string_4_0= RULE_STRING ) ) | ( ( (lv_variable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )? ( (lv_arrayC_7_0= ruleArrayC ) )? ) ) (otherlv_8= 'alt' otherlv_9= ':' ( (lv_stringAlt_10_0= RULE_STRING ) ) )? )
            {
            // InternalGrammar.g:1829:2: (otherlv_0= 'img' ( (lv_classD_1_0= ruleClassD ) ) otherlv_2= 'src' otherlv_3= ':' ( ( (lv_string_4_0= RULE_STRING ) ) | ( ( (lv_variable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )? ( (lv_arrayC_7_0= ruleArrayC ) )? ) ) (otherlv_8= 'alt' otherlv_9= ':' ( (lv_stringAlt_10_0= RULE_STRING ) ) )? )
            // InternalGrammar.g:1830:3: otherlv_0= 'img' ( (lv_classD_1_0= ruleClassD ) ) otherlv_2= 'src' otherlv_3= ':' ( ( (lv_string_4_0= RULE_STRING ) ) | ( ( (lv_variable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )? ( (lv_arrayC_7_0= ruleArrayC ) )? ) ) (otherlv_8= 'alt' otherlv_9= ':' ( (lv_stringAlt_10_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getImgAccess().getImgKeyword_0());
            		
            // InternalGrammar.g:1834:3: ( (lv_classD_1_0= ruleClassD ) )
            // InternalGrammar.g:1835:4: (lv_classD_1_0= ruleClassD )
            {
            // InternalGrammar.g:1835:4: (lv_classD_1_0= ruleClassD )
            // InternalGrammar.g:1836:5: lv_classD_1_0= ruleClassD
            {

            					newCompositeNode(grammarAccess.getImgAccess().getClassDClassDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
            lv_classD_1_0=ruleClassD();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImgRule());
            					}
            					set(
            						current,
            						"classD",
            						lv_classD_1_0,
            						"org.xtext.example.Grammar.ClassD");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getImgAccess().getSrcKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getImgAccess().getColonKeyword_3());
            		
            // InternalGrammar.g:1861:3: ( ( (lv_string_4_0= RULE_STRING ) ) | ( ( (lv_variable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )? ( (lv_arrayC_7_0= ruleArrayC ) )? ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            else if ( (LA27_0==21) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalGrammar.g:1862:4: ( (lv_string_4_0= RULE_STRING ) )
                    {
                    // InternalGrammar.g:1862:4: ( (lv_string_4_0= RULE_STRING ) )
                    // InternalGrammar.g:1863:5: (lv_string_4_0= RULE_STRING )
                    {
                    // InternalGrammar.g:1863:5: (lv_string_4_0= RULE_STRING )
                    // InternalGrammar.g:1864:6: lv_string_4_0= RULE_STRING
                    {
                    lv_string_4_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

                    						newLeafNode(lv_string_4_0, grammarAccess.getImgAccess().getStringSTRINGTerminalRuleCall_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImgRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"string",
                    							lv_string_4_0,
                    							"org.xtext.example.Grammar.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGrammar.g:1881:4: ( ( (lv_variable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )? ( (lv_arrayC_7_0= ruleArrayC ) )? )
                    {
                    // InternalGrammar.g:1881:4: ( ( (lv_variable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )? ( (lv_arrayC_7_0= ruleArrayC ) )? )
                    // InternalGrammar.g:1882:5: ( (lv_variable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )? ( (lv_arrayC_7_0= ruleArrayC ) )?
                    {
                    // InternalGrammar.g:1882:5: ( (lv_variable_5_0= ruleVariable ) )
                    // InternalGrammar.g:1883:6: (lv_variable_5_0= ruleVariable )
                    {
                    // InternalGrammar.g:1883:6: (lv_variable_5_0= ruleVariable )
                    // InternalGrammar.g:1884:7: lv_variable_5_0= ruleVariable
                    {

                    							newCompositeNode(grammarAccess.getImgAccess().getVariableVariableParserRuleCall_4_1_0_0());
                    						
                    pushFollow(FOLLOW_37);
                    lv_variable_5_0=ruleVariable();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getImgRule());
                    							}
                    							set(
                    								current,
                    								"variable",
                    								lv_variable_5_0,
                    								"org.xtext.example.Grammar.Variable");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalGrammar.g:1901:5: ( (lv_objectC_6_0= ruleObjectC ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==28) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalGrammar.g:1902:6: (lv_objectC_6_0= ruleObjectC )
                            {
                            // InternalGrammar.g:1902:6: (lv_objectC_6_0= ruleObjectC )
                            // InternalGrammar.g:1903:7: lv_objectC_6_0= ruleObjectC
                            {

                            							newCompositeNode(grammarAccess.getImgAccess().getObjectCObjectCParserRuleCall_4_1_1_0());
                            						
                            pushFollow(FOLLOW_38);
                            lv_objectC_6_0=ruleObjectC();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getImgRule());
                            							}
                            							set(
                            								current,
                            								"objectC",
                            								lv_objectC_6_0,
                            								"org.xtext.example.Grammar.ObjectC");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalGrammar.g:1920:5: ( (lv_arrayC_7_0= ruleArrayC ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==16) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalGrammar.g:1921:6: (lv_arrayC_7_0= ruleArrayC )
                            {
                            // InternalGrammar.g:1921:6: (lv_arrayC_7_0= ruleArrayC )
                            // InternalGrammar.g:1922:7: lv_arrayC_7_0= ruleArrayC
                            {

                            							newCompositeNode(grammarAccess.getImgAccess().getArrayCArrayCParserRuleCall_4_1_2_0());
                            						
                            pushFollow(FOLLOW_36);
                            lv_arrayC_7_0=ruleArrayC();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getImgRule());
                            							}
                            							set(
                            								current,
                            								"arrayC",
                            								lv_arrayC_7_0,
                            								"org.xtext.example.Grammar.ArrayC");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalGrammar.g:1941:3: (otherlv_8= 'alt' otherlv_9= ':' ( (lv_stringAlt_10_0= RULE_STRING ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGrammar.g:1942:4: otherlv_8= 'alt' otherlv_9= ':' ( (lv_stringAlt_10_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,31,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getImgAccess().getAltKeyword_5_0());
                    			
                    otherlv_9=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getImgAccess().getColonKeyword_5_1());
                    			
                    // InternalGrammar.g:1950:4: ( (lv_stringAlt_10_0= RULE_STRING ) )
                    // InternalGrammar.g:1951:5: (lv_stringAlt_10_0= RULE_STRING )
                    {
                    // InternalGrammar.g:1951:5: (lv_stringAlt_10_0= RULE_STRING )
                    // InternalGrammar.g:1952:6: lv_stringAlt_10_0= RULE_STRING
                    {
                    lv_stringAlt_10_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_stringAlt_10_0, grammarAccess.getImgAccess().getStringAltSTRINGTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImgRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"stringAlt",
                    							lv_stringAlt_10_0,
                    							"org.xtext.example.Grammar.STRING");
                    					

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
    // $ANTLR end "ruleImg"


    // $ANTLR start "entryRuleClassD"
    // InternalGrammar.g:1973:1: entryRuleClassD returns [EObject current=null] : iv_ruleClassD= ruleClassD EOF ;
    public final EObject entryRuleClassD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassD = null;


        try {
            // InternalGrammar.g:1973:47: (iv_ruleClassD= ruleClassD EOF )
            // InternalGrammar.g:1974:2: iv_ruleClassD= ruleClassD EOF
            {
             newCompositeNode(grammarAccess.getClassDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassD=ruleClassD();

            state._fsp--;

             current =iv_ruleClassD; 
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
    // $ANTLR end "entryRuleClassD"


    // $ANTLR start "ruleClassD"
    // InternalGrammar.g:1980:1: ruleClassD returns [EObject current=null] : (otherlv_0= 'class' otherlv_1= '=' ( (lv_string_2_0= RULE_STRING ) ) )? ;
    public final EObject ruleClassD() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_string_2_0=null;


        	enterRule();

        try {
            // InternalGrammar.g:1986:2: ( (otherlv_0= 'class' otherlv_1= '=' ( (lv_string_2_0= RULE_STRING ) ) )? )
            // InternalGrammar.g:1987:2: (otherlv_0= 'class' otherlv_1= '=' ( (lv_string_2_0= RULE_STRING ) ) )?
            {
            // InternalGrammar.g:1987:2: (otherlv_0= 'class' otherlv_1= '=' ( (lv_string_2_0= RULE_STRING ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGrammar.g:1988:3: otherlv_0= 'class' otherlv_1= '=' ( (lv_string_2_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_14); 

                    			newLeafNode(otherlv_0, grammarAccess.getClassDAccess().getClassKeyword_0());
                    		
                    otherlv_1=(Token)match(input,20,FOLLOW_6); 

                    			newLeafNode(otherlv_1, grammarAccess.getClassDAccess().getEqualsSignKeyword_1());
                    		
                    // InternalGrammar.g:1996:3: ( (lv_string_2_0= RULE_STRING ) )
                    // InternalGrammar.g:1997:4: (lv_string_2_0= RULE_STRING )
                    {
                    // InternalGrammar.g:1997:4: (lv_string_2_0= RULE_STRING )
                    // InternalGrammar.g:1998:5: lv_string_2_0= RULE_STRING
                    {
                    lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_string_2_0, grammarAccess.getClassDAccess().getStringSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassDRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"string",
                    						lv_string_2_0,
                    						"org.xtext.example.Grammar.STRING");
                    				

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
    // $ANTLR end "ruleClassD"


    // $ANTLR start "entryRuleFusion"
    // InternalGrammar.g:2018:1: entryRuleFusion returns [EObject current=null] : iv_ruleFusion= ruleFusion EOF ;
    public final EObject entryRuleFusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFusion = null;


        try {
            // InternalGrammar.g:2018:47: (iv_ruleFusion= ruleFusion EOF )
            // InternalGrammar.g:2019:2: iv_ruleFusion= ruleFusion EOF
            {
             newCompositeNode(grammarAccess.getFusionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFusion=ruleFusion();

            state._fsp--;

             current =iv_ruleFusion; 
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
    // $ANTLR end "entryRuleFusion"


    // $ANTLR start "ruleFusion"
    // InternalGrammar.g:2025:1: ruleFusion returns [EObject current=null] : ( ( (lv_colspan_0_0= ruleColspan ) ) | ( (lv_rowspan_1_0= ruleRowspan ) ) )? ;
    public final EObject ruleFusion() throws RecognitionException {
        EObject current = null;

        EObject lv_colspan_0_0 = null;

        EObject lv_rowspan_1_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:2031:2: ( ( ( (lv_colspan_0_0= ruleColspan ) ) | ( (lv_rowspan_1_0= ruleRowspan ) ) )? )
            // InternalGrammar.g:2032:2: ( ( (lv_colspan_0_0= ruleColspan ) ) | ( (lv_rowspan_1_0= ruleRowspan ) ) )?
            {
            // InternalGrammar.g:2032:2: ( ( (lv_colspan_0_0= ruleColspan ) ) | ( (lv_rowspan_1_0= ruleRowspan ) ) )?
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==33) ) {
                alt30=1;
            }
            else if ( (LA30_0==34) ) {
                alt30=2;
            }
            switch (alt30) {
                case 1 :
                    // InternalGrammar.g:2033:3: ( (lv_colspan_0_0= ruleColspan ) )
                    {
                    // InternalGrammar.g:2033:3: ( (lv_colspan_0_0= ruleColspan ) )
                    // InternalGrammar.g:2034:4: (lv_colspan_0_0= ruleColspan )
                    {
                    // InternalGrammar.g:2034:4: (lv_colspan_0_0= ruleColspan )
                    // InternalGrammar.g:2035:5: lv_colspan_0_0= ruleColspan
                    {

                    					newCompositeNode(grammarAccess.getFusionAccess().getColspanColspanParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_colspan_0_0=ruleColspan();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFusionRule());
                    					}
                    					set(
                    						current,
                    						"colspan",
                    						lv_colspan_0_0,
                    						"org.xtext.example.Grammar.Colspan");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGrammar.g:2053:3: ( (lv_rowspan_1_0= ruleRowspan ) )
                    {
                    // InternalGrammar.g:2053:3: ( (lv_rowspan_1_0= ruleRowspan ) )
                    // InternalGrammar.g:2054:4: (lv_rowspan_1_0= ruleRowspan )
                    {
                    // InternalGrammar.g:2054:4: (lv_rowspan_1_0= ruleRowspan )
                    // InternalGrammar.g:2055:5: lv_rowspan_1_0= ruleRowspan
                    {

                    					newCompositeNode(grammarAccess.getFusionAccess().getRowspanRowspanParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_rowspan_1_0=ruleRowspan();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFusionRule());
                    					}
                    					set(
                    						current,
                    						"rowspan",
                    						lv_rowspan_1_0,
                    						"org.xtext.example.Grammar.Rowspan");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleFusion"


    // $ANTLR start "entryRuleColspan"
    // InternalGrammar.g:2076:1: entryRuleColspan returns [EObject current=null] : iv_ruleColspan= ruleColspan EOF ;
    public final EObject entryRuleColspan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColspan = null;


        try {
            // InternalGrammar.g:2076:48: (iv_ruleColspan= ruleColspan EOF )
            // InternalGrammar.g:2077:2: iv_ruleColspan= ruleColspan EOF
            {
             newCompositeNode(grammarAccess.getColspanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColspan=ruleColspan();

            state._fsp--;

             current =iv_ruleColspan; 
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
    // $ANTLR end "entryRuleColspan"


    // $ANTLR start "ruleColspan"
    // InternalGrammar.g:2083:1: ruleColspan returns [EObject current=null] : (otherlv_0= 'colspan' otherlv_1= ':' ( ( (lv_integer_2_0= RULE_INT ) ) | ( (lv_variable_3_0= ruleVariable ) ) ) ) ;
    public final EObject ruleColspan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_integer_2_0=null;
        EObject lv_variable_3_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:2089:2: ( (otherlv_0= 'colspan' otherlv_1= ':' ( ( (lv_integer_2_0= RULE_INT ) ) | ( (lv_variable_3_0= ruleVariable ) ) ) ) )
            // InternalGrammar.g:2090:2: (otherlv_0= 'colspan' otherlv_1= ':' ( ( (lv_integer_2_0= RULE_INT ) ) | ( (lv_variable_3_0= ruleVariable ) ) ) )
            {
            // InternalGrammar.g:2090:2: (otherlv_0= 'colspan' otherlv_1= ':' ( ( (lv_integer_2_0= RULE_INT ) ) | ( (lv_variable_3_0= ruleVariable ) ) ) )
            // InternalGrammar.g:2091:3: otherlv_0= 'colspan' otherlv_1= ':' ( ( (lv_integer_2_0= RULE_INT ) ) | ( (lv_variable_3_0= ruleVariable ) ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getColspanAccess().getColspanKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getColspanAccess().getColonKeyword_1());
            		
            // InternalGrammar.g:2099:3: ( ( (lv_integer_2_0= RULE_INT ) ) | ( (lv_variable_3_0= ruleVariable ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_INT) ) {
                alt31=1;
            }
            else if ( (LA31_0==21) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalGrammar.g:2100:4: ( (lv_integer_2_0= RULE_INT ) )
                    {
                    // InternalGrammar.g:2100:4: ( (lv_integer_2_0= RULE_INT ) )
                    // InternalGrammar.g:2101:5: (lv_integer_2_0= RULE_INT )
                    {
                    // InternalGrammar.g:2101:5: (lv_integer_2_0= RULE_INT )
                    // InternalGrammar.g:2102:6: lv_integer_2_0= RULE_INT
                    {
                    lv_integer_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_integer_2_0, grammarAccess.getColspanAccess().getIntegerINTTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColspanRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"integer",
                    							lv_integer_2_0,
                    							"org.xtext.example.Grammar.INT");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGrammar.g:2119:4: ( (lv_variable_3_0= ruleVariable ) )
                    {
                    // InternalGrammar.g:2119:4: ( (lv_variable_3_0= ruleVariable ) )
                    // InternalGrammar.g:2120:5: (lv_variable_3_0= ruleVariable )
                    {
                    // InternalGrammar.g:2120:5: (lv_variable_3_0= ruleVariable )
                    // InternalGrammar.g:2121:6: lv_variable_3_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getColspanAccess().getVariableVariableParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_variable_3_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColspanRule());
                    						}
                    						set(
                    							current,
                    							"variable",
                    							lv_variable_3_0,
                    							"org.xtext.example.Grammar.Variable");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleColspan"


    // $ANTLR start "entryRuleRowspan"
    // InternalGrammar.g:2143:1: entryRuleRowspan returns [EObject current=null] : iv_ruleRowspan= ruleRowspan EOF ;
    public final EObject entryRuleRowspan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRowspan = null;


        try {
            // InternalGrammar.g:2143:48: (iv_ruleRowspan= ruleRowspan EOF )
            // InternalGrammar.g:2144:2: iv_ruleRowspan= ruleRowspan EOF
            {
             newCompositeNode(grammarAccess.getRowspanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRowspan=ruleRowspan();

            state._fsp--;

             current =iv_ruleRowspan; 
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
    // $ANTLR end "entryRuleRowspan"


    // $ANTLR start "ruleRowspan"
    // InternalGrammar.g:2150:1: ruleRowspan returns [EObject current=null] : (otherlv_0= 'rowspan' otherlv_1= ':' ( ( (lv_integer_2_0= RULE_INT ) ) | ( (lv_variable_3_0= ruleVariable ) ) ) ) ;
    public final EObject ruleRowspan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_integer_2_0=null;
        EObject lv_variable_3_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:2156:2: ( (otherlv_0= 'rowspan' otherlv_1= ':' ( ( (lv_integer_2_0= RULE_INT ) ) | ( (lv_variable_3_0= ruleVariable ) ) ) ) )
            // InternalGrammar.g:2157:2: (otherlv_0= 'rowspan' otherlv_1= ':' ( ( (lv_integer_2_0= RULE_INT ) ) | ( (lv_variable_3_0= ruleVariable ) ) ) )
            {
            // InternalGrammar.g:2157:2: (otherlv_0= 'rowspan' otherlv_1= ':' ( ( (lv_integer_2_0= RULE_INT ) ) | ( (lv_variable_3_0= ruleVariable ) ) ) )
            // InternalGrammar.g:2158:3: otherlv_0= 'rowspan' otherlv_1= ':' ( ( (lv_integer_2_0= RULE_INT ) ) | ( (lv_variable_3_0= ruleVariable ) ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRowspanAccess().getRowspanKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRowspanAccess().getColonKeyword_1());
            		
            // InternalGrammar.g:2166:3: ( ( (lv_integer_2_0= RULE_INT ) ) | ( (lv_variable_3_0= ruleVariable ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_INT) ) {
                alt32=1;
            }
            else if ( (LA32_0==21) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalGrammar.g:2167:4: ( (lv_integer_2_0= RULE_INT ) )
                    {
                    // InternalGrammar.g:2167:4: ( (lv_integer_2_0= RULE_INT ) )
                    // InternalGrammar.g:2168:5: (lv_integer_2_0= RULE_INT )
                    {
                    // InternalGrammar.g:2168:5: (lv_integer_2_0= RULE_INT )
                    // InternalGrammar.g:2169:6: lv_integer_2_0= RULE_INT
                    {
                    lv_integer_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_integer_2_0, grammarAccess.getRowspanAccess().getIntegerINTTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRowspanRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"integer",
                    							lv_integer_2_0,
                    							"org.xtext.example.Grammar.INT");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGrammar.g:2186:4: ( (lv_variable_3_0= ruleVariable ) )
                    {
                    // InternalGrammar.g:2186:4: ( (lv_variable_3_0= ruleVariable ) )
                    // InternalGrammar.g:2187:5: (lv_variable_3_0= ruleVariable )
                    {
                    // InternalGrammar.g:2187:5: (lv_variable_3_0= ruleVariable )
                    // InternalGrammar.g:2188:6: lv_variable_3_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getRowspanAccess().getVariableVariableParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_variable_3_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRowspanRule());
                    						}
                    						set(
                    							current,
                    							"variable",
                    							lv_variable_3_0,
                    							"org.xtext.example.Grammar.Variable");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleRowspan"


    // $ANTLR start "entryRuleFunction"
    // InternalGrammar.g:2210:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalGrammar.g:2210:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalGrammar.g:2211:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalGrammar.g:2217:1: ruleFunction returns [EObject current=null] : ( ( (lv_sumFunction_0_0= ruleSumFunction ) ) | ( (lv_prodFunction_1_0= ruleProdFunction ) ) | ( (lv_divFunction_2_0= ruleDivFunction ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        EObject lv_sumFunction_0_0 = null;

        EObject lv_prodFunction_1_0 = null;

        EObject lv_divFunction_2_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:2223:2: ( ( ( (lv_sumFunction_0_0= ruleSumFunction ) ) | ( (lv_prodFunction_1_0= ruleProdFunction ) ) | ( (lv_divFunction_2_0= ruleDivFunction ) ) ) )
            // InternalGrammar.g:2224:2: ( ( (lv_sumFunction_0_0= ruleSumFunction ) ) | ( (lv_prodFunction_1_0= ruleProdFunction ) ) | ( (lv_divFunction_2_0= ruleDivFunction ) ) )
            {
            // InternalGrammar.g:2224:2: ( ( (lv_sumFunction_0_0= ruleSumFunction ) ) | ( (lv_prodFunction_1_0= ruleProdFunction ) ) | ( (lv_divFunction_2_0= ruleDivFunction ) ) )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt33=1;
                }
                break;
            case 36:
                {
                alt33=2;
                }
                break;
            case 37:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalGrammar.g:2225:3: ( (lv_sumFunction_0_0= ruleSumFunction ) )
                    {
                    // InternalGrammar.g:2225:3: ( (lv_sumFunction_0_0= ruleSumFunction ) )
                    // InternalGrammar.g:2226:4: (lv_sumFunction_0_0= ruleSumFunction )
                    {
                    // InternalGrammar.g:2226:4: (lv_sumFunction_0_0= ruleSumFunction )
                    // InternalGrammar.g:2227:5: lv_sumFunction_0_0= ruleSumFunction
                    {

                    					newCompositeNode(grammarAccess.getFunctionAccess().getSumFunctionSumFunctionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_sumFunction_0_0=ruleSumFunction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionRule());
                    					}
                    					set(
                    						current,
                    						"sumFunction",
                    						lv_sumFunction_0_0,
                    						"org.xtext.example.Grammar.SumFunction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGrammar.g:2245:3: ( (lv_prodFunction_1_0= ruleProdFunction ) )
                    {
                    // InternalGrammar.g:2245:3: ( (lv_prodFunction_1_0= ruleProdFunction ) )
                    // InternalGrammar.g:2246:4: (lv_prodFunction_1_0= ruleProdFunction )
                    {
                    // InternalGrammar.g:2246:4: (lv_prodFunction_1_0= ruleProdFunction )
                    // InternalGrammar.g:2247:5: lv_prodFunction_1_0= ruleProdFunction
                    {

                    					newCompositeNode(grammarAccess.getFunctionAccess().getProdFunctionProdFunctionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_prodFunction_1_0=ruleProdFunction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionRule());
                    					}
                    					set(
                    						current,
                    						"prodFunction",
                    						lv_prodFunction_1_0,
                    						"org.xtext.example.Grammar.ProdFunction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGrammar.g:2265:3: ( (lv_divFunction_2_0= ruleDivFunction ) )
                    {
                    // InternalGrammar.g:2265:3: ( (lv_divFunction_2_0= ruleDivFunction ) )
                    // InternalGrammar.g:2266:4: (lv_divFunction_2_0= ruleDivFunction )
                    {
                    // InternalGrammar.g:2266:4: (lv_divFunction_2_0= ruleDivFunction )
                    // InternalGrammar.g:2267:5: lv_divFunction_2_0= ruleDivFunction
                    {

                    					newCompositeNode(grammarAccess.getFunctionAccess().getDivFunctionDivFunctionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_divFunction_2_0=ruleDivFunction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionRule());
                    					}
                    					set(
                    						current,
                    						"divFunction",
                    						lv_divFunction_2_0,
                    						"org.xtext.example.Grammar.DivFunction");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleSumFunction"
    // InternalGrammar.g:2288:1: entryRuleSumFunction returns [EObject current=null] : iv_ruleSumFunction= ruleSumFunction EOF ;
    public final EObject entryRuleSumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumFunction = null;


        try {
            // InternalGrammar.g:2288:52: (iv_ruleSumFunction= ruleSumFunction EOF )
            // InternalGrammar.g:2289:2: iv_ruleSumFunction= ruleSumFunction EOF
            {
             newCompositeNode(grammarAccess.getSumFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSumFunction=ruleSumFunction();

            state._fsp--;

             current =iv_ruleSumFunction; 
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
    // $ANTLR end "entryRuleSumFunction"


    // $ANTLR start "ruleSumFunction"
    // InternalGrammar.g:2295:1: ruleSumFunction returns [EObject current=null] : (otherlv_0= 'SUM' otherlv_1= '(' ( ( ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )* )? | (otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) )+ otherlv_7= ']' ) ) otherlv_8= ')' ) ;
    public final EObject ruleSumFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_argument1_2_0 = null;

        EObject lv_argument1_4_0 = null;

        EObject lv_argument2_6_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:2301:2: ( (otherlv_0= 'SUM' otherlv_1= '(' ( ( ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )* )? | (otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) )+ otherlv_7= ']' ) ) otherlv_8= ')' ) )
            // InternalGrammar.g:2302:2: (otherlv_0= 'SUM' otherlv_1= '(' ( ( ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )* )? | (otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) )+ otherlv_7= ']' ) ) otherlv_8= ')' )
            {
            // InternalGrammar.g:2302:2: (otherlv_0= 'SUM' otherlv_1= '(' ( ( ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )* )? | (otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) )+ otherlv_7= ']' ) ) otherlv_8= ')' )
            // InternalGrammar.g:2303:3: otherlv_0= 'SUM' otherlv_1= '(' ( ( ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )* )? | (otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) )+ otherlv_7= ']' ) ) otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getSumFunctionAccess().getSUMKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getSumFunctionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGrammar.g:2311:3: ( ( ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )* )? | (otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) )+ otherlv_7= ']' ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_STRING && LA37_0<=RULE_INT)||LA37_0==21||LA37_0==24) ) {
                alt37=1;
            }
            else if ( (LA37_0==16) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalGrammar.g:2312:4: ( ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )* )?
                    {
                    // InternalGrammar.g:2312:4: ( ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )* )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( ((LA35_0>=RULE_STRING && LA35_0<=RULE_INT)||LA35_0==21) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalGrammar.g:2313:5: ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )*
                            {
                            // InternalGrammar.g:2313:5: ( (lv_argument1_2_0= ruleArgument1 ) )
                            // InternalGrammar.g:2314:6: (lv_argument1_2_0= ruleArgument1 )
                            {
                            // InternalGrammar.g:2314:6: (lv_argument1_2_0= ruleArgument1 )
                            // InternalGrammar.g:2315:7: lv_argument1_2_0= ruleArgument1
                            {

                            							newCompositeNode(grammarAccess.getSumFunctionAccess().getArgument1Argument1ParserRuleCall_2_0_0_0());
                            						
                            pushFollow(FOLLOW_40);
                            lv_argument1_2_0=ruleArgument1();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getSumFunctionRule());
                            							}
                            							add(
                            								current,
                            								"argument1",
                            								lv_argument1_2_0,
                            								"org.xtext.example.Grammar.Argument1");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalGrammar.g:2332:5: (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )*
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==13) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // InternalGrammar.g:2333:6: otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) )
                            	    {
                            	    otherlv_3=(Token)match(input,13,FOLLOW_9); 

                            	    						newLeafNode(otherlv_3, grammarAccess.getSumFunctionAccess().getCommaKeyword_2_0_1_0());
                            	    					
                            	    // InternalGrammar.g:2337:6: ( (lv_argument1_4_0= ruleArgument1 ) )
                            	    // InternalGrammar.g:2338:7: (lv_argument1_4_0= ruleArgument1 )
                            	    {
                            	    // InternalGrammar.g:2338:7: (lv_argument1_4_0= ruleArgument1 )
                            	    // InternalGrammar.g:2339:8: lv_argument1_4_0= ruleArgument1
                            	    {

                            	    								newCompositeNode(grammarAccess.getSumFunctionAccess().getArgument1Argument1ParserRuleCall_2_0_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_40);
                            	    lv_argument1_4_0=ruleArgument1();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getSumFunctionRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"argument1",
                            	    									lv_argument1_4_0,
                            	    									"org.xtext.example.Grammar.Argument1");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop34;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalGrammar.g:2359:4: (otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) )+ otherlv_7= ']' )
                    {
                    // InternalGrammar.g:2359:4: (otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) )+ otherlv_7= ']' )
                    // InternalGrammar.g:2360:5: otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) )+ otherlv_7= ']'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_9); 

                    					newLeafNode(otherlv_5, grammarAccess.getSumFunctionAccess().getLeftSquareBracketKeyword_2_1_0());
                    				
                    // InternalGrammar.g:2364:5: ( (lv_argument2_6_0= ruleArgument2 ) )+
                    int cnt36=0;
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==RULE_INT||LA36_0==21) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalGrammar.g:2365:6: (lv_argument2_6_0= ruleArgument2 )
                    	    {
                    	    // InternalGrammar.g:2365:6: (lv_argument2_6_0= ruleArgument2 )
                    	    // InternalGrammar.g:2366:7: lv_argument2_6_0= ruleArgument2
                    	    {

                    	    							newCompositeNode(grammarAccess.getSumFunctionAccess().getArgument2Argument2ParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_argument2_6_0=ruleArgument2();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSumFunctionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"argument2",
                    	    								lv_argument2_6_0,
                    	    								"org.xtext.example.Grammar.Argument2");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt36 >= 1 ) break loop36;
                                EarlyExitException eee =
                                    new EarlyExitException(36, input);
                                throw eee;
                        }
                        cnt36++;
                    } while (true);

                    otherlv_7=(Token)match(input,17,FOLLOW_25); 

                    					newLeafNode(otherlv_7, grammarAccess.getSumFunctionAccess().getRightSquareBracketKeyword_2_1_2());
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSumFunctionAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleSumFunction"


    // $ANTLR start "entryRuleProdFunction"
    // InternalGrammar.g:2397:1: entryRuleProdFunction returns [EObject current=null] : iv_ruleProdFunction= ruleProdFunction EOF ;
    public final EObject entryRuleProdFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProdFunction = null;


        try {
            // InternalGrammar.g:2397:53: (iv_ruleProdFunction= ruleProdFunction EOF )
            // InternalGrammar.g:2398:2: iv_ruleProdFunction= ruleProdFunction EOF
            {
             newCompositeNode(grammarAccess.getProdFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProdFunction=ruleProdFunction();

            state._fsp--;

             current =iv_ruleProdFunction; 
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
    // $ANTLR end "entryRuleProdFunction"


    // $ANTLR start "ruleProdFunction"
    // InternalGrammar.g:2404:1: ruleProdFunction returns [EObject current=null] : (otherlv_0= 'PROD' otherlv_1= '(' ( ( ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )* )? | (otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) ) otherlv_7= ']' ) ) otherlv_8= ')' ) ;
    public final EObject ruleProdFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_argument1_2_0 = null;

        EObject lv_argument1_4_0 = null;

        EObject lv_argument2_6_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:2410:2: ( (otherlv_0= 'PROD' otherlv_1= '(' ( ( ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )* )? | (otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) ) otherlv_7= ']' ) ) otherlv_8= ')' ) )
            // InternalGrammar.g:2411:2: (otherlv_0= 'PROD' otherlv_1= '(' ( ( ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )* )? | (otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) ) otherlv_7= ']' ) ) otherlv_8= ')' )
            {
            // InternalGrammar.g:2411:2: (otherlv_0= 'PROD' otherlv_1= '(' ( ( ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )* )? | (otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) ) otherlv_7= ']' ) ) otherlv_8= ')' )
            // InternalGrammar.g:2412:3: otherlv_0= 'PROD' otherlv_1= '(' ( ( ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )* )? | (otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) ) otherlv_7= ']' ) ) otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getProdFunctionAccess().getPRODKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getProdFunctionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGrammar.g:2420:3: ( ( ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )* )? | (otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) ) otherlv_7= ']' ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_INT)||LA40_0==21||LA40_0==24) ) {
                alt40=1;
            }
            else if ( (LA40_0==16) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalGrammar.g:2421:4: ( ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )* )?
                    {
                    // InternalGrammar.g:2421:4: ( ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )* )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( ((LA39_0>=RULE_STRING && LA39_0<=RULE_INT)||LA39_0==21) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalGrammar.g:2422:5: ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )*
                            {
                            // InternalGrammar.g:2422:5: ( (lv_argument1_2_0= ruleArgument1 ) )
                            // InternalGrammar.g:2423:6: (lv_argument1_2_0= ruleArgument1 )
                            {
                            // InternalGrammar.g:2423:6: (lv_argument1_2_0= ruleArgument1 )
                            // InternalGrammar.g:2424:7: lv_argument1_2_0= ruleArgument1
                            {

                            							newCompositeNode(grammarAccess.getProdFunctionAccess().getArgument1Argument1ParserRuleCall_2_0_0_0());
                            						
                            pushFollow(FOLLOW_40);
                            lv_argument1_2_0=ruleArgument1();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getProdFunctionRule());
                            							}
                            							add(
                            								current,
                            								"argument1",
                            								lv_argument1_2_0,
                            								"org.xtext.example.Grammar.Argument1");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalGrammar.g:2441:5: (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )*
                            loop38:
                            do {
                                int alt38=2;
                                int LA38_0 = input.LA(1);

                                if ( (LA38_0==13) ) {
                                    alt38=1;
                                }


                                switch (alt38) {
                            	case 1 :
                            	    // InternalGrammar.g:2442:6: otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) )
                            	    {
                            	    otherlv_3=(Token)match(input,13,FOLLOW_9); 

                            	    						newLeafNode(otherlv_3, grammarAccess.getProdFunctionAccess().getCommaKeyword_2_0_1_0());
                            	    					
                            	    // InternalGrammar.g:2446:6: ( (lv_argument1_4_0= ruleArgument1 ) )
                            	    // InternalGrammar.g:2447:7: (lv_argument1_4_0= ruleArgument1 )
                            	    {
                            	    // InternalGrammar.g:2447:7: (lv_argument1_4_0= ruleArgument1 )
                            	    // InternalGrammar.g:2448:8: lv_argument1_4_0= ruleArgument1
                            	    {

                            	    								newCompositeNode(grammarAccess.getProdFunctionAccess().getArgument1Argument1ParserRuleCall_2_0_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_40);
                            	    lv_argument1_4_0=ruleArgument1();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getProdFunctionRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"argument1",
                            	    									lv_argument1_4_0,
                            	    									"org.xtext.example.Grammar.Argument1");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop38;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalGrammar.g:2468:4: (otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) ) otherlv_7= ']' )
                    {
                    // InternalGrammar.g:2468:4: (otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) ) otherlv_7= ']' )
                    // InternalGrammar.g:2469:5: otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) ) otherlv_7= ']'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_9); 

                    					newLeafNode(otherlv_5, grammarAccess.getProdFunctionAccess().getLeftSquareBracketKeyword_2_1_0());
                    				
                    // InternalGrammar.g:2473:5: ( (lv_argument2_6_0= ruleArgument2 ) )
                    // InternalGrammar.g:2474:6: (lv_argument2_6_0= ruleArgument2 )
                    {
                    // InternalGrammar.g:2474:6: (lv_argument2_6_0= ruleArgument2 )
                    // InternalGrammar.g:2475:7: lv_argument2_6_0= ruleArgument2
                    {

                    							newCompositeNode(grammarAccess.getProdFunctionAccess().getArgument2Argument2ParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_20);
                    lv_argument2_6_0=ruleArgument2();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getProdFunctionRule());
                    							}
                    							add(
                    								current,
                    								"argument2",
                    								lv_argument2_6_0,
                    								"org.xtext.example.Grammar.Argument2");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,17,FOLLOW_25); 

                    					newLeafNode(otherlv_7, grammarAccess.getProdFunctionAccess().getRightSquareBracketKeyword_2_1_2());
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getProdFunctionAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleProdFunction"


    // $ANTLR start "entryRuleDivFunction"
    // InternalGrammar.g:2506:1: entryRuleDivFunction returns [EObject current=null] : iv_ruleDivFunction= ruleDivFunction EOF ;
    public final EObject entryRuleDivFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivFunction = null;


        try {
            // InternalGrammar.g:2506:52: (iv_ruleDivFunction= ruleDivFunction EOF )
            // InternalGrammar.g:2507:2: iv_ruleDivFunction= ruleDivFunction EOF
            {
             newCompositeNode(grammarAccess.getDivFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDivFunction=ruleDivFunction();

            state._fsp--;

             current =iv_ruleDivFunction; 
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
    // $ANTLR end "entryRuleDivFunction"


    // $ANTLR start "ruleDivFunction"
    // InternalGrammar.g:2513:1: ruleDivFunction returns [EObject current=null] : (otherlv_0= 'DIV' otherlv_1= '(' ( (lv_argument1_2_0= ruleArgument1 ) ) otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) otherlv_5= ')' ) ;
    public final EObject ruleDivFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_argument1_2_0 = null;

        EObject lv_argument1_4_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:2519:2: ( (otherlv_0= 'DIV' otherlv_1= '(' ( (lv_argument1_2_0= ruleArgument1 ) ) otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) otherlv_5= ')' ) )
            // InternalGrammar.g:2520:2: (otherlv_0= 'DIV' otherlv_1= '(' ( (lv_argument1_2_0= ruleArgument1 ) ) otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) otherlv_5= ')' )
            {
            // InternalGrammar.g:2520:2: (otherlv_0= 'DIV' otherlv_1= '(' ( (lv_argument1_2_0= ruleArgument1 ) ) otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) otherlv_5= ')' )
            // InternalGrammar.g:2521:3: otherlv_0= 'DIV' otherlv_1= '(' ( (lv_argument1_2_0= ruleArgument1 ) ) otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getDivFunctionAccess().getDIVKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getDivFunctionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGrammar.g:2529:3: ( (lv_argument1_2_0= ruleArgument1 ) )
            // InternalGrammar.g:2530:4: (lv_argument1_2_0= ruleArgument1 )
            {
            // InternalGrammar.g:2530:4: (lv_argument1_2_0= ruleArgument1 )
            // InternalGrammar.g:2531:5: lv_argument1_2_0= ruleArgument1
            {

            					newCompositeNode(grammarAccess.getDivFunctionAccess().getArgument1Argument1ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_41);
            lv_argument1_2_0=ruleArgument1();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDivFunctionRule());
            					}
            					add(
            						current,
            						"argument1",
            						lv_argument1_2_0,
            						"org.xtext.example.Grammar.Argument1");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getDivFunctionAccess().getCommaKeyword_3());
            		
            // InternalGrammar.g:2552:3: ( (lv_argument1_4_0= ruleArgument1 ) )
            // InternalGrammar.g:2553:4: (lv_argument1_4_0= ruleArgument1 )
            {
            // InternalGrammar.g:2553:4: (lv_argument1_4_0= ruleArgument1 )
            // InternalGrammar.g:2554:5: lv_argument1_4_0= ruleArgument1
            {

            					newCompositeNode(grammarAccess.getDivFunctionAccess().getArgument1Argument1ParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
            lv_argument1_4_0=ruleArgument1();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDivFunctionRule());
            					}
            					add(
            						current,
            						"argument1",
            						lv_argument1_4_0,
            						"org.xtext.example.Grammar.Argument1");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDivFunctionAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleDivFunction"


    // $ANTLR start "entryRuleArgument1"
    // InternalGrammar.g:2579:1: entryRuleArgument1 returns [EObject current=null] : iv_ruleArgument1= ruleArgument1 EOF ;
    public final EObject entryRuleArgument1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument1 = null;


        try {
            // InternalGrammar.g:2579:50: (iv_ruleArgument1= ruleArgument1 EOF )
            // InternalGrammar.g:2580:2: iv_ruleArgument1= ruleArgument1 EOF
            {
             newCompositeNode(grammarAccess.getArgument1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgument1=ruleArgument1();

            state._fsp--;

             current =iv_ruleArgument1; 
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
    // $ANTLR end "entryRuleArgument1"


    // $ANTLR start "ruleArgument1"
    // InternalGrammar.g:2586:1: ruleArgument1 returns [EObject current=null] : ( ( (lv_integer_0_0= RULE_INT ) ) | ( (lv_floatValue_1_0= ruleFloat ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )? ) ) ;
    public final EObject ruleArgument1() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;
        Token lv_string_2_0=null;
        EObject lv_floatValue_1_0 = null;

        EObject lv_variable_3_0 = null;

        EObject lv_objectC_4_0 = null;

        EObject lv_arrayC_5_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:2592:2: ( ( ( (lv_integer_0_0= RULE_INT ) ) | ( (lv_floatValue_1_0= ruleFloat ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )? ) ) )
            // InternalGrammar.g:2593:2: ( ( (lv_integer_0_0= RULE_INT ) ) | ( (lv_floatValue_1_0= ruleFloat ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )? ) )
            {
            // InternalGrammar.g:2593:2: ( ( (lv_integer_0_0= RULE_INT ) ) | ( (lv_floatValue_1_0= ruleFloat ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )? ) )
            int alt43=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==EOF||LA43_1==13||LA43_1==24) ) {
                    alt43=1;
                }
                else if ( (LA43_1==28) ) {
                    alt43=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt43=3;
                }
                break;
            case 21:
                {
                alt43=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalGrammar.g:2594:3: ( (lv_integer_0_0= RULE_INT ) )
                    {
                    // InternalGrammar.g:2594:3: ( (lv_integer_0_0= RULE_INT ) )
                    // InternalGrammar.g:2595:4: (lv_integer_0_0= RULE_INT )
                    {
                    // InternalGrammar.g:2595:4: (lv_integer_0_0= RULE_INT )
                    // InternalGrammar.g:2596:5: lv_integer_0_0= RULE_INT
                    {
                    lv_integer_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_integer_0_0, grammarAccess.getArgument1Access().getIntegerINTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getArgument1Rule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"integer",
                    						lv_integer_0_0,
                    						"org.xtext.example.Grammar.INT");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGrammar.g:2613:3: ( (lv_floatValue_1_0= ruleFloat ) )
                    {
                    // InternalGrammar.g:2613:3: ( (lv_floatValue_1_0= ruleFloat ) )
                    // InternalGrammar.g:2614:4: (lv_floatValue_1_0= ruleFloat )
                    {
                    // InternalGrammar.g:2614:4: (lv_floatValue_1_0= ruleFloat )
                    // InternalGrammar.g:2615:5: lv_floatValue_1_0= ruleFloat
                    {

                    					newCompositeNode(grammarAccess.getArgument1Access().getFloatValueFloatParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_floatValue_1_0=ruleFloat();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getArgument1Rule());
                    					}
                    					set(
                    						current,
                    						"floatValue",
                    						lv_floatValue_1_0,
                    						"org.xtext.example.Grammar.Float");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGrammar.g:2633:3: ( (lv_string_2_0= RULE_STRING ) )
                    {
                    // InternalGrammar.g:2633:3: ( (lv_string_2_0= RULE_STRING ) )
                    // InternalGrammar.g:2634:4: (lv_string_2_0= RULE_STRING )
                    {
                    // InternalGrammar.g:2634:4: (lv_string_2_0= RULE_STRING )
                    // InternalGrammar.g:2635:5: lv_string_2_0= RULE_STRING
                    {
                    lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_string_2_0, grammarAccess.getArgument1Access().getStringSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getArgument1Rule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"string",
                    						lv_string_2_0,
                    						"org.xtext.example.Grammar.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGrammar.g:2652:3: ( ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )? )
                    {
                    // InternalGrammar.g:2652:3: ( ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )? )
                    // InternalGrammar.g:2653:4: ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )?
                    {
                    // InternalGrammar.g:2653:4: ( (lv_variable_3_0= ruleVariable ) )
                    // InternalGrammar.g:2654:5: (lv_variable_3_0= ruleVariable )
                    {
                    // InternalGrammar.g:2654:5: (lv_variable_3_0= ruleVariable )
                    // InternalGrammar.g:2655:6: lv_variable_3_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getArgument1Access().getVariableVariableParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_variable_3_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArgument1Rule());
                    						}
                    						set(
                    							current,
                    							"variable",
                    							lv_variable_3_0,
                    							"org.xtext.example.Grammar.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGrammar.g:2672:4: ( (lv_objectC_4_0= ruleObjectC ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==28) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalGrammar.g:2673:5: (lv_objectC_4_0= ruleObjectC )
                            {
                            // InternalGrammar.g:2673:5: (lv_objectC_4_0= ruleObjectC )
                            // InternalGrammar.g:2674:6: lv_objectC_4_0= ruleObjectC
                            {

                            						newCompositeNode(grammarAccess.getArgument1Access().getObjectCObjectCParserRuleCall_3_1_0());
                            					
                            pushFollow(FOLLOW_43);
                            lv_objectC_4_0=ruleObjectC();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getArgument1Rule());
                            						}
                            						set(
                            							current,
                            							"objectC",
                            							lv_objectC_4_0,
                            							"org.xtext.example.Grammar.ObjectC");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalGrammar.g:2691:4: ( (lv_arrayC_5_0= ruleArrayC ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==16) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalGrammar.g:2692:5: (lv_arrayC_5_0= ruleArrayC )
                            {
                            // InternalGrammar.g:2692:5: (lv_arrayC_5_0= ruleArrayC )
                            // InternalGrammar.g:2693:6: lv_arrayC_5_0= ruleArrayC
                            {

                            						newCompositeNode(grammarAccess.getArgument1Access().getArrayCArrayCParserRuleCall_3_2_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_arrayC_5_0=ruleArrayC();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getArgument1Rule());
                            						}
                            						set(
                            							current,
                            							"arrayC",
                            							lv_arrayC_5_0,
                            							"org.xtext.example.Grammar.ArrayC");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

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
    // $ANTLR end "ruleArgument1"


    // $ANTLR start "entryRuleArgument2"
    // InternalGrammar.g:2715:1: entryRuleArgument2 returns [EObject current=null] : iv_ruleArgument2= ruleArgument2 EOF ;
    public final EObject entryRuleArgument2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument2 = null;


        try {
            // InternalGrammar.g:2715:50: (iv_ruleArgument2= ruleArgument2 EOF )
            // InternalGrammar.g:2716:2: iv_ruleArgument2= ruleArgument2 EOF
            {
             newCompositeNode(grammarAccess.getArgument2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgument2=ruleArgument2();

            state._fsp--;

             current =iv_ruleArgument2; 
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
    // $ANTLR end "entryRuleArgument2"


    // $ANTLR start "ruleArgument2"
    // InternalGrammar.g:2722:1: ruleArgument2 returns [EObject current=null] : ( ( ( (lv_variable_0_0= ruleVariable ) ) | ( (lv_integer_1_0= RULE_INT ) ) ) ( (otherlv_2= '-' | otherlv_3= '+' ) ( ( (lv_variable_4_0= ruleVariable ) ) | ( (lv_integerEnd1_5_0= RULE_INT ) ) ) )? otherlv_6= ',' ( ( (lv_variable_7_0= ruleVariable ) ) | ( (lv_integerEnd2_8_0= RULE_INT ) ) ) ( (otherlv_9= '-' | otherlv_10= '+' ) ( ( (lv_variable_11_0= ruleVariable ) ) | ( (lv_integerEnd3_12_0= RULE_INT ) ) ) )? ) ;
    public final EObject ruleArgument2() throws RecognitionException {
        EObject current = null;

        Token lv_integer_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_integerEnd1_5_0=null;
        Token otherlv_6=null;
        Token lv_integerEnd2_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_integerEnd3_12_0=null;
        EObject lv_variable_0_0 = null;

        EObject lv_variable_4_0 = null;

        EObject lv_variable_7_0 = null;

        EObject lv_variable_11_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:2728:2: ( ( ( ( (lv_variable_0_0= ruleVariable ) ) | ( (lv_integer_1_0= RULE_INT ) ) ) ( (otherlv_2= '-' | otherlv_3= '+' ) ( ( (lv_variable_4_0= ruleVariable ) ) | ( (lv_integerEnd1_5_0= RULE_INT ) ) ) )? otherlv_6= ',' ( ( (lv_variable_7_0= ruleVariable ) ) | ( (lv_integerEnd2_8_0= RULE_INT ) ) ) ( (otherlv_9= '-' | otherlv_10= '+' ) ( ( (lv_variable_11_0= ruleVariable ) ) | ( (lv_integerEnd3_12_0= RULE_INT ) ) ) )? ) )
            // InternalGrammar.g:2729:2: ( ( ( (lv_variable_0_0= ruleVariable ) ) | ( (lv_integer_1_0= RULE_INT ) ) ) ( (otherlv_2= '-' | otherlv_3= '+' ) ( ( (lv_variable_4_0= ruleVariable ) ) | ( (lv_integerEnd1_5_0= RULE_INT ) ) ) )? otherlv_6= ',' ( ( (lv_variable_7_0= ruleVariable ) ) | ( (lv_integerEnd2_8_0= RULE_INT ) ) ) ( (otherlv_9= '-' | otherlv_10= '+' ) ( ( (lv_variable_11_0= ruleVariable ) ) | ( (lv_integerEnd3_12_0= RULE_INT ) ) ) )? )
            {
            // InternalGrammar.g:2729:2: ( ( ( (lv_variable_0_0= ruleVariable ) ) | ( (lv_integer_1_0= RULE_INT ) ) ) ( (otherlv_2= '-' | otherlv_3= '+' ) ( ( (lv_variable_4_0= ruleVariable ) ) | ( (lv_integerEnd1_5_0= RULE_INT ) ) ) )? otherlv_6= ',' ( ( (lv_variable_7_0= ruleVariable ) ) | ( (lv_integerEnd2_8_0= RULE_INT ) ) ) ( (otherlv_9= '-' | otherlv_10= '+' ) ( ( (lv_variable_11_0= ruleVariable ) ) | ( (lv_integerEnd3_12_0= RULE_INT ) ) ) )? )
            // InternalGrammar.g:2730:3: ( ( (lv_variable_0_0= ruleVariable ) ) | ( (lv_integer_1_0= RULE_INT ) ) ) ( (otherlv_2= '-' | otherlv_3= '+' ) ( ( (lv_variable_4_0= ruleVariable ) ) | ( (lv_integerEnd1_5_0= RULE_INT ) ) ) )? otherlv_6= ',' ( ( (lv_variable_7_0= ruleVariable ) ) | ( (lv_integerEnd2_8_0= RULE_INT ) ) ) ( (otherlv_9= '-' | otherlv_10= '+' ) ( ( (lv_variable_11_0= ruleVariable ) ) | ( (lv_integerEnd3_12_0= RULE_INT ) ) ) )?
            {
            // InternalGrammar.g:2730:3: ( ( (lv_variable_0_0= ruleVariable ) ) | ( (lv_integer_1_0= RULE_INT ) ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==21) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_INT) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalGrammar.g:2731:4: ( (lv_variable_0_0= ruleVariable ) )
                    {
                    // InternalGrammar.g:2731:4: ( (lv_variable_0_0= ruleVariable ) )
                    // InternalGrammar.g:2732:5: (lv_variable_0_0= ruleVariable )
                    {
                    // InternalGrammar.g:2732:5: (lv_variable_0_0= ruleVariable )
                    // InternalGrammar.g:2733:6: lv_variable_0_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getArgument2Access().getVariableVariableParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_variable_0_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArgument2Rule());
                    						}
                    						add(
                    							current,
                    							"variable",
                    							lv_variable_0_0,
                    							"org.xtext.example.Grammar.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGrammar.g:2751:4: ( (lv_integer_1_0= RULE_INT ) )
                    {
                    // InternalGrammar.g:2751:4: ( (lv_integer_1_0= RULE_INT ) )
                    // InternalGrammar.g:2752:5: (lv_integer_1_0= RULE_INT )
                    {
                    // InternalGrammar.g:2752:5: (lv_integer_1_0= RULE_INT )
                    // InternalGrammar.g:2753:6: lv_integer_1_0= RULE_INT
                    {
                    lv_integer_1_0=(Token)match(input,RULE_INT,FOLLOW_44); 

                    						newLeafNode(lv_integer_1_0, grammarAccess.getArgument2Access().getIntegerINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getArgument2Rule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"integer",
                    							lv_integer_1_0,
                    							"org.xtext.example.Grammar.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGrammar.g:2770:3: ( (otherlv_2= '-' | otherlv_3= '+' ) ( ( (lv_variable_4_0= ruleVariable ) ) | ( (lv_integerEnd1_5_0= RULE_INT ) ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=38 && LA47_0<=39)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalGrammar.g:2771:4: (otherlv_2= '-' | otherlv_3= '+' ) ( ( (lv_variable_4_0= ruleVariable ) ) | ( (lv_integerEnd1_5_0= RULE_INT ) ) )
                    {
                    // InternalGrammar.g:2771:4: (otherlv_2= '-' | otherlv_3= '+' )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==38) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==39) ) {
                        alt45=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalGrammar.g:2772:5: otherlv_2= '-'
                            {
                            otherlv_2=(Token)match(input,38,FOLLOW_9); 

                            					newLeafNode(otherlv_2, grammarAccess.getArgument2Access().getHyphenMinusKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalGrammar.g:2777:5: otherlv_3= '+'
                            {
                            otherlv_3=(Token)match(input,39,FOLLOW_9); 

                            					newLeafNode(otherlv_3, grammarAccess.getArgument2Access().getPlusSignKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    // InternalGrammar.g:2782:4: ( ( (lv_variable_4_0= ruleVariable ) ) | ( (lv_integerEnd1_5_0= RULE_INT ) ) )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==21) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==RULE_INT) ) {
                        alt46=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalGrammar.g:2783:5: ( (lv_variable_4_0= ruleVariable ) )
                            {
                            // InternalGrammar.g:2783:5: ( (lv_variable_4_0= ruleVariable ) )
                            // InternalGrammar.g:2784:6: (lv_variable_4_0= ruleVariable )
                            {
                            // InternalGrammar.g:2784:6: (lv_variable_4_0= ruleVariable )
                            // InternalGrammar.g:2785:7: lv_variable_4_0= ruleVariable
                            {

                            							newCompositeNode(grammarAccess.getArgument2Access().getVariableVariableParserRuleCall_1_1_0_0());
                            						
                            pushFollow(FOLLOW_41);
                            lv_variable_4_0=ruleVariable();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getArgument2Rule());
                            							}
                            							add(
                            								current,
                            								"variable",
                            								lv_variable_4_0,
                            								"org.xtext.example.Grammar.Variable");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalGrammar.g:2803:5: ( (lv_integerEnd1_5_0= RULE_INT ) )
                            {
                            // InternalGrammar.g:2803:5: ( (lv_integerEnd1_5_0= RULE_INT ) )
                            // InternalGrammar.g:2804:6: (lv_integerEnd1_5_0= RULE_INT )
                            {
                            // InternalGrammar.g:2804:6: (lv_integerEnd1_5_0= RULE_INT )
                            // InternalGrammar.g:2805:7: lv_integerEnd1_5_0= RULE_INT
                            {
                            lv_integerEnd1_5_0=(Token)match(input,RULE_INT,FOLLOW_41); 

                            							newLeafNode(lv_integerEnd1_5_0, grammarAccess.getArgument2Access().getIntegerEnd1INTTerminalRuleCall_1_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getArgument2Rule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"integerEnd1",
                            								lv_integerEnd1_5_0,
                            								"org.xtext.example.Grammar.INT");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getArgument2Access().getCommaKeyword_2());
            		
            // InternalGrammar.g:2827:3: ( ( (lv_variable_7_0= ruleVariable ) ) | ( (lv_integerEnd2_8_0= RULE_INT ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==21) ) {
                alt48=1;
            }
            else if ( (LA48_0==RULE_INT) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalGrammar.g:2828:4: ( (lv_variable_7_0= ruleVariable ) )
                    {
                    // InternalGrammar.g:2828:4: ( (lv_variable_7_0= ruleVariable ) )
                    // InternalGrammar.g:2829:5: (lv_variable_7_0= ruleVariable )
                    {
                    // InternalGrammar.g:2829:5: (lv_variable_7_0= ruleVariable )
                    // InternalGrammar.g:2830:6: lv_variable_7_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getArgument2Access().getVariableVariableParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_45);
                    lv_variable_7_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArgument2Rule());
                    						}
                    						add(
                    							current,
                    							"variable",
                    							lv_variable_7_0,
                    							"org.xtext.example.Grammar.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGrammar.g:2848:4: ( (lv_integerEnd2_8_0= RULE_INT ) )
                    {
                    // InternalGrammar.g:2848:4: ( (lv_integerEnd2_8_0= RULE_INT ) )
                    // InternalGrammar.g:2849:5: (lv_integerEnd2_8_0= RULE_INT )
                    {
                    // InternalGrammar.g:2849:5: (lv_integerEnd2_8_0= RULE_INT )
                    // InternalGrammar.g:2850:6: lv_integerEnd2_8_0= RULE_INT
                    {
                    lv_integerEnd2_8_0=(Token)match(input,RULE_INT,FOLLOW_45); 

                    						newLeafNode(lv_integerEnd2_8_0, grammarAccess.getArgument2Access().getIntegerEnd2INTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getArgument2Rule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"integerEnd2",
                    							lv_integerEnd2_8_0,
                    							"org.xtext.example.Grammar.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGrammar.g:2867:3: ( (otherlv_9= '-' | otherlv_10= '+' ) ( ( (lv_variable_11_0= ruleVariable ) ) | ( (lv_integerEnd3_12_0= RULE_INT ) ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=38 && LA51_0<=39)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalGrammar.g:2868:4: (otherlv_9= '-' | otherlv_10= '+' ) ( ( (lv_variable_11_0= ruleVariable ) ) | ( (lv_integerEnd3_12_0= RULE_INT ) ) )
                    {
                    // InternalGrammar.g:2868:4: (otherlv_9= '-' | otherlv_10= '+' )
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==38) ) {
                        alt49=1;
                    }
                    else if ( (LA49_0==39) ) {
                        alt49=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 0, input);

                        throw nvae;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalGrammar.g:2869:5: otherlv_9= '-'
                            {
                            otherlv_9=(Token)match(input,38,FOLLOW_9); 

                            					newLeafNode(otherlv_9, grammarAccess.getArgument2Access().getHyphenMinusKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalGrammar.g:2874:5: otherlv_10= '+'
                            {
                            otherlv_10=(Token)match(input,39,FOLLOW_9); 

                            					newLeafNode(otherlv_10, grammarAccess.getArgument2Access().getPlusSignKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalGrammar.g:2879:4: ( ( (lv_variable_11_0= ruleVariable ) ) | ( (lv_integerEnd3_12_0= RULE_INT ) ) )
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==21) ) {
                        alt50=1;
                    }
                    else if ( (LA50_0==RULE_INT) ) {
                        alt50=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        throw nvae;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalGrammar.g:2880:5: ( (lv_variable_11_0= ruleVariable ) )
                            {
                            // InternalGrammar.g:2880:5: ( (lv_variable_11_0= ruleVariable ) )
                            // InternalGrammar.g:2881:6: (lv_variable_11_0= ruleVariable )
                            {
                            // InternalGrammar.g:2881:6: (lv_variable_11_0= ruleVariable )
                            // InternalGrammar.g:2882:7: lv_variable_11_0= ruleVariable
                            {

                            							newCompositeNode(grammarAccess.getArgument2Access().getVariableVariableParserRuleCall_4_1_0_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_variable_11_0=ruleVariable();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getArgument2Rule());
                            							}
                            							add(
                            								current,
                            								"variable",
                            								lv_variable_11_0,
                            								"org.xtext.example.Grammar.Variable");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalGrammar.g:2900:5: ( (lv_integerEnd3_12_0= RULE_INT ) )
                            {
                            // InternalGrammar.g:2900:5: ( (lv_integerEnd3_12_0= RULE_INT ) )
                            // InternalGrammar.g:2901:6: (lv_integerEnd3_12_0= RULE_INT )
                            {
                            // InternalGrammar.g:2901:6: (lv_integerEnd3_12_0= RULE_INT )
                            // InternalGrammar.g:2902:7: lv_integerEnd3_12_0= RULE_INT
                            {
                            lv_integerEnd3_12_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                            							newLeafNode(lv_integerEnd3_12_0, grammarAccess.getArgument2Access().getIntegerEnd3INTTerminalRuleCall_4_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getArgument2Rule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"integerEnd3",
                            								lv_integerEnd3_12_0,
                            								"org.xtext.example.Grammar.INT");
                            						

                            }


                            }


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
    // $ANTLR end "ruleArgument2"


    // $ANTLR start "entryRuleConditional"
    // InternalGrammar.g:2924:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // InternalGrammar.g:2924:52: (iv_ruleConditional= ruleConditional EOF )
            // InternalGrammar.g:2925:2: iv_ruleConditional= ruleConditional EOF
            {
             newCompositeNode(grammarAccess.getConditionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditional=ruleConditional();

            state._fsp--;

             current =iv_ruleConditional; 
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
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // InternalGrammar.g:2931:1: ruleConditional returns [EObject current=null] : (otherlv_0= 'if' ( ( (lv_equalCondition_1_0= ruleEqualCondition ) ) | ( (lv_notEqualCondition_2_0= ruleNoEqualCondition ) ) ) otherlv_3= 'then' otherlv_4= '{' ( (lv_otherElement_5_0= ruleOtherElement ) )* otherlv_6= '}' ) ;
    public final EObject ruleConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_equalCondition_1_0 = null;

        EObject lv_notEqualCondition_2_0 = null;

        EObject lv_otherElement_5_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:2937:2: ( (otherlv_0= 'if' ( ( (lv_equalCondition_1_0= ruleEqualCondition ) ) | ( (lv_notEqualCondition_2_0= ruleNoEqualCondition ) ) ) otherlv_3= 'then' otherlv_4= '{' ( (lv_otherElement_5_0= ruleOtherElement ) )* otherlv_6= '}' ) )
            // InternalGrammar.g:2938:2: (otherlv_0= 'if' ( ( (lv_equalCondition_1_0= ruleEqualCondition ) ) | ( (lv_notEqualCondition_2_0= ruleNoEqualCondition ) ) ) otherlv_3= 'then' otherlv_4= '{' ( (lv_otherElement_5_0= ruleOtherElement ) )* otherlv_6= '}' )
            {
            // InternalGrammar.g:2938:2: (otherlv_0= 'if' ( ( (lv_equalCondition_1_0= ruleEqualCondition ) ) | ( (lv_notEqualCondition_2_0= ruleNoEqualCondition ) ) ) otherlv_3= 'then' otherlv_4= '{' ( (lv_otherElement_5_0= ruleOtherElement ) )* otherlv_6= '}' )
            // InternalGrammar.g:2939:3: otherlv_0= 'if' ( ( (lv_equalCondition_1_0= ruleEqualCondition ) ) | ( (lv_notEqualCondition_2_0= ruleNoEqualCondition ) ) ) otherlv_3= 'then' otherlv_4= '{' ( (lv_otherElement_5_0= ruleOtherElement ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionalAccess().getIfKeyword_0());
            		
            // InternalGrammar.g:2943:3: ( ( (lv_equalCondition_1_0= ruleEqualCondition ) ) | ( (lv_notEqualCondition_2_0= ruleNoEqualCondition ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==21) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==RULE_ID) ) {
                    int LA52_2 = input.LA(3);

                    if ( (LA52_2==43) ) {
                        alt52=2;
                    }
                    else if ( (LA52_2==42) ) {
                        alt52=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalGrammar.g:2944:4: ( (lv_equalCondition_1_0= ruleEqualCondition ) )
                    {
                    // InternalGrammar.g:2944:4: ( (lv_equalCondition_1_0= ruleEqualCondition ) )
                    // InternalGrammar.g:2945:5: (lv_equalCondition_1_0= ruleEqualCondition )
                    {
                    // InternalGrammar.g:2945:5: (lv_equalCondition_1_0= ruleEqualCondition )
                    // InternalGrammar.g:2946:6: lv_equalCondition_1_0= ruleEqualCondition
                    {

                    						newCompositeNode(grammarAccess.getConditionalAccess().getEqualConditionEqualConditionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_equalCondition_1_0=ruleEqualCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionalRule());
                    						}
                    						set(
                    							current,
                    							"equalCondition",
                    							lv_equalCondition_1_0,
                    							"org.xtext.example.Grammar.EqualCondition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGrammar.g:2964:4: ( (lv_notEqualCondition_2_0= ruleNoEqualCondition ) )
                    {
                    // InternalGrammar.g:2964:4: ( (lv_notEqualCondition_2_0= ruleNoEqualCondition ) )
                    // InternalGrammar.g:2965:5: (lv_notEqualCondition_2_0= ruleNoEqualCondition )
                    {
                    // InternalGrammar.g:2965:5: (lv_notEqualCondition_2_0= ruleNoEqualCondition )
                    // InternalGrammar.g:2966:6: lv_notEqualCondition_2_0= ruleNoEqualCondition
                    {

                    						newCompositeNode(grammarAccess.getConditionalAccess().getNotEqualConditionNoEqualConditionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_notEqualCondition_2_0=ruleNoEqualCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionalRule());
                    						}
                    						set(
                    							current,
                    							"notEqualCondition",
                    							lv_notEqualCondition_2_0,
                    							"org.xtext.example.Grammar.NoEqualCondition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,41,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getConditionalAccess().getThenKeyword_2());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_4, grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGrammar.g:2992:3: ( (lv_otherElement_5_0= ruleOtherElement ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=21 && LA53_0<=22)||(LA53_0>=26 && LA53_0<=27)||LA53_0==40||LA53_0==44) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalGrammar.g:2993:4: (lv_otherElement_5_0= ruleOtherElement )
            	    {
            	    // InternalGrammar.g:2993:4: (lv_otherElement_5_0= ruleOtherElement )
            	    // InternalGrammar.g:2994:5: lv_otherElement_5_0= ruleOtherElement
            	    {

            	    					newCompositeNode(grammarAccess.getConditionalAccess().getOtherElementOtherElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_47);
            	    lv_otherElement_5_0=ruleOtherElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConditionalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"otherElement",
            	    						lv_otherElement_5_0,
            	    						"org.xtext.example.Grammar.OtherElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleEqualCondition"
    // InternalGrammar.g:3019:1: entryRuleEqualCondition returns [EObject current=null] : iv_ruleEqualCondition= ruleEqualCondition EOF ;
    public final EObject entryRuleEqualCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualCondition = null;


        try {
            // InternalGrammar.g:3019:55: (iv_ruleEqualCondition= ruleEqualCondition EOF )
            // InternalGrammar.g:3020:2: iv_ruleEqualCondition= ruleEqualCondition EOF
            {
             newCompositeNode(grammarAccess.getEqualConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqualCondition=ruleEqualCondition();

            state._fsp--;

             current =iv_ruleEqualCondition; 
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
    // $ANTLR end "entryRuleEqualCondition"


    // $ANTLR start "ruleEqualCondition"
    // InternalGrammar.g:3026:1: ruleEqualCondition returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) ) otherlv_3= 'then' ) ;
    public final EObject ruleEqualCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:3032:2: ( ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) ) otherlv_3= 'then' ) )
            // InternalGrammar.g:3033:2: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) ) otherlv_3= 'then' )
            {
            // InternalGrammar.g:3033:2: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) ) otherlv_3= 'then' )
            // InternalGrammar.g:3034:3: ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= 'is' ( (lv_value_2_0= ruleValue ) ) otherlv_3= 'then'
            {
            // InternalGrammar.g:3034:3: ( (lv_variable_0_0= ruleVariable ) )
            // InternalGrammar.g:3035:4: (lv_variable_0_0= ruleVariable )
            {
            // InternalGrammar.g:3035:4: (lv_variable_0_0= ruleVariable )
            // InternalGrammar.g:3036:5: lv_variable_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getEqualConditionAccess().getVariableVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_48);
            lv_variable_0_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEqualConditionRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_0_0,
            						"org.xtext.example.Grammar.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,42,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getEqualConditionAccess().getIsKeyword_1());
            		
            // InternalGrammar.g:3057:3: ( (lv_value_2_0= ruleValue ) )
            // InternalGrammar.g:3058:4: (lv_value_2_0= ruleValue )
            {
            // InternalGrammar.g:3058:4: (lv_value_2_0= ruleValue )
            // InternalGrammar.g:3059:5: lv_value_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getEqualConditionAccess().getValueValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_46);
            lv_value_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEqualConditionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.Grammar.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEqualConditionAccess().getThenKeyword_3());
            		

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
    // $ANTLR end "ruleEqualCondition"


    // $ANTLR start "entryRuleNoEqualCondition"
    // InternalGrammar.g:3084:1: entryRuleNoEqualCondition returns [EObject current=null] : iv_ruleNoEqualCondition= ruleNoEqualCondition EOF ;
    public final EObject entryRuleNoEqualCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoEqualCondition = null;


        try {
            // InternalGrammar.g:3084:57: (iv_ruleNoEqualCondition= ruleNoEqualCondition EOF )
            // InternalGrammar.g:3085:2: iv_ruleNoEqualCondition= ruleNoEqualCondition EOF
            {
             newCompositeNode(grammarAccess.getNoEqualConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNoEqualCondition=ruleNoEqualCondition();

            state._fsp--;

             current =iv_ruleNoEqualCondition; 
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
    // $ANTLR end "entryRuleNoEqualCondition"


    // $ANTLR start "ruleNoEqualCondition"
    // InternalGrammar.g:3091:1: ruleNoEqualCondition returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= 'isNot' ( (lv_value_2_0= ruleValue ) ) otherlv_3= 'then' ) ;
    public final EObject ruleNoEqualCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:3097:2: ( ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= 'isNot' ( (lv_value_2_0= ruleValue ) ) otherlv_3= 'then' ) )
            // InternalGrammar.g:3098:2: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= 'isNot' ( (lv_value_2_0= ruleValue ) ) otherlv_3= 'then' )
            {
            // InternalGrammar.g:3098:2: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= 'isNot' ( (lv_value_2_0= ruleValue ) ) otherlv_3= 'then' )
            // InternalGrammar.g:3099:3: ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= 'isNot' ( (lv_value_2_0= ruleValue ) ) otherlv_3= 'then'
            {
            // InternalGrammar.g:3099:3: ( (lv_variable_0_0= ruleVariable ) )
            // InternalGrammar.g:3100:4: (lv_variable_0_0= ruleVariable )
            {
            // InternalGrammar.g:3100:4: (lv_variable_0_0= ruleVariable )
            // InternalGrammar.g:3101:5: lv_variable_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getNoEqualConditionAccess().getVariableVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_49);
            lv_variable_0_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNoEqualConditionRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_0_0,
            						"org.xtext.example.Grammar.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getNoEqualConditionAccess().getIsNotKeyword_1());
            		
            // InternalGrammar.g:3122:3: ( (lv_value_2_0= ruleValue ) )
            // InternalGrammar.g:3123:4: (lv_value_2_0= ruleValue )
            {
            // InternalGrammar.g:3123:4: (lv_value_2_0= ruleValue )
            // InternalGrammar.g:3124:5: lv_value_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getNoEqualConditionAccess().getValueValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_46);
            lv_value_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNoEqualConditionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.Grammar.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getNoEqualConditionAccess().getThenKeyword_3());
            		

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
    // $ANTLR end "ruleNoEqualCondition"


    // $ANTLR start "entryRuleLoop"
    // InternalGrammar.g:3149:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalGrammar.g:3149:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalGrammar.g:3150:2: iv_ruleLoop= ruleLoop EOF
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
    // InternalGrammar.g:3156:1: ruleLoop returns [EObject current=null] : ( ( (lv_withLoop_0_0= ruleWith ) ) | ( (lv_forLoop_1_0= ruleFor ) ) ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        EObject lv_withLoop_0_0 = null;

        EObject lv_forLoop_1_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:3162:2: ( ( ( (lv_withLoop_0_0= ruleWith ) ) | ( (lv_forLoop_1_0= ruleFor ) ) ) )
            // InternalGrammar.g:3163:2: ( ( (lv_withLoop_0_0= ruleWith ) ) | ( (lv_forLoop_1_0= ruleFor ) ) )
            {
            // InternalGrammar.g:3163:2: ( ( (lv_withLoop_0_0= ruleWith ) ) | ( (lv_forLoop_1_0= ruleFor ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==44) ) {
                alt54=1;
            }
            else if ( (LA54_0==21) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalGrammar.g:3164:3: ( (lv_withLoop_0_0= ruleWith ) )
                    {
                    // InternalGrammar.g:3164:3: ( (lv_withLoop_0_0= ruleWith ) )
                    // InternalGrammar.g:3165:4: (lv_withLoop_0_0= ruleWith )
                    {
                    // InternalGrammar.g:3165:4: (lv_withLoop_0_0= ruleWith )
                    // InternalGrammar.g:3166:5: lv_withLoop_0_0= ruleWith
                    {

                    					newCompositeNode(grammarAccess.getLoopAccess().getWithLoopWithParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_withLoop_0_0=ruleWith();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLoopRule());
                    					}
                    					set(
                    						current,
                    						"withLoop",
                    						lv_withLoop_0_0,
                    						"org.xtext.example.Grammar.With");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGrammar.g:3184:3: ( (lv_forLoop_1_0= ruleFor ) )
                    {
                    // InternalGrammar.g:3184:3: ( (lv_forLoop_1_0= ruleFor ) )
                    // InternalGrammar.g:3185:4: (lv_forLoop_1_0= ruleFor )
                    {
                    // InternalGrammar.g:3185:4: (lv_forLoop_1_0= ruleFor )
                    // InternalGrammar.g:3186:5: lv_forLoop_1_0= ruleFor
                    {

                    					newCompositeNode(grammarAccess.getLoopAccess().getForLoopForParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_forLoop_1_0=ruleFor();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLoopRule());
                    					}
                    					set(
                    						current,
                    						"forLoop",
                    						lv_forLoop_1_0,
                    						"org.xtext.example.Grammar.For");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleWith"
    // InternalGrammar.g:3207:1: entryRuleWith returns [EObject current=null] : iv_ruleWith= ruleWith EOF ;
    public final EObject entryRuleWith() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWith = null;


        try {
            // InternalGrammar.g:3207:45: (iv_ruleWith= ruleWith EOF )
            // InternalGrammar.g:3208:2: iv_ruleWith= ruleWith EOF
            {
             newCompositeNode(grammarAccess.getWithRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWith=ruleWith();

            state._fsp--;

             current =iv_ruleWith; 
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
    // $ANTLR end "entryRuleWith"


    // $ANTLR start "ruleWith"
    // InternalGrammar.g:3214:1: ruleWith returns [EObject current=null] : (otherlv_0= 'with' ( (lv_init_1_0= ruleVariable ) ) otherlv_2= 'in' ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )? otherlv_6= '{' ( (lv_otherElement_7_0= ruleOtherElement ) )* otherlv_8= '}' ) ;
    public final EObject ruleWith() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_init_1_0 = null;

        EObject lv_variable_3_0 = null;

        EObject lv_objectC_4_0 = null;

        EObject lv_arrayC_5_0 = null;

        EObject lv_otherElement_7_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:3220:2: ( (otherlv_0= 'with' ( (lv_init_1_0= ruleVariable ) ) otherlv_2= 'in' ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )? otherlv_6= '{' ( (lv_otherElement_7_0= ruleOtherElement ) )* otherlv_8= '}' ) )
            // InternalGrammar.g:3221:2: (otherlv_0= 'with' ( (lv_init_1_0= ruleVariable ) ) otherlv_2= 'in' ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )? otherlv_6= '{' ( (lv_otherElement_7_0= ruleOtherElement ) )* otherlv_8= '}' )
            {
            // InternalGrammar.g:3221:2: (otherlv_0= 'with' ( (lv_init_1_0= ruleVariable ) ) otherlv_2= 'in' ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )? otherlv_6= '{' ( (lv_otherElement_7_0= ruleOtherElement ) )* otherlv_8= '}' )
            // InternalGrammar.g:3222:3: otherlv_0= 'with' ( (lv_init_1_0= ruleVariable ) ) otherlv_2= 'in' ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )? otherlv_6= '{' ( (lv_otherElement_7_0= ruleOtherElement ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getWithAccess().getWithKeyword_0());
            		
            // InternalGrammar.g:3226:3: ( (lv_init_1_0= ruleVariable ) )
            // InternalGrammar.g:3227:4: (lv_init_1_0= ruleVariable )
            {
            // InternalGrammar.g:3227:4: (lv_init_1_0= ruleVariable )
            // InternalGrammar.g:3228:5: lv_init_1_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getWithAccess().getInitVariableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_50);
            lv_init_1_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWithRule());
            					}
            					set(
            						current,
            						"init",
            						lv_init_1_0,
            						"org.xtext.example.Grammar.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,45,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getWithAccess().getInKeyword_2());
            		
            // InternalGrammar.g:3249:3: ( (lv_variable_3_0= ruleVariable ) )
            // InternalGrammar.g:3250:4: (lv_variable_3_0= ruleVariable )
            {
            // InternalGrammar.g:3250:4: (lv_variable_3_0= ruleVariable )
            // InternalGrammar.g:3251:5: lv_variable_3_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getWithAccess().getVariableVariableParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_51);
            lv_variable_3_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWithRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_3_0,
            						"org.xtext.example.Grammar.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGrammar.g:3268:3: ( (lv_objectC_4_0= ruleObjectC ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==28) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalGrammar.g:3269:4: (lv_objectC_4_0= ruleObjectC )
                    {
                    // InternalGrammar.g:3269:4: (lv_objectC_4_0= ruleObjectC )
                    // InternalGrammar.g:3270:5: lv_objectC_4_0= ruleObjectC
                    {

                    					newCompositeNode(grammarAccess.getWithAccess().getObjectCObjectCParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_52);
                    lv_objectC_4_0=ruleObjectC();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getWithRule());
                    					}
                    					set(
                    						current,
                    						"objectC",
                    						lv_objectC_4_0,
                    						"org.xtext.example.Grammar.ObjectC");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGrammar.g:3287:3: ( (lv_arrayC_5_0= ruleArrayC ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==16) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalGrammar.g:3288:4: (lv_arrayC_5_0= ruleArrayC )
                    {
                    // InternalGrammar.g:3288:4: (lv_arrayC_5_0= ruleArrayC )
                    // InternalGrammar.g:3289:5: lv_arrayC_5_0= ruleArrayC
                    {

                    					newCompositeNode(grammarAccess.getWithAccess().getArrayCArrayCParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_arrayC_5_0=ruleArrayC();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getWithRule());
                    					}
                    					set(
                    						current,
                    						"arrayC",
                    						lv_arrayC_5_0,
                    						"org.xtext.example.Grammar.ArrayC");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_6, grammarAccess.getWithAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalGrammar.g:3310:3: ( (lv_otherElement_7_0= ruleOtherElement ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=21 && LA57_0<=22)||(LA57_0>=26 && LA57_0<=27)||LA57_0==40||LA57_0==44) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalGrammar.g:3311:4: (lv_otherElement_7_0= ruleOtherElement )
            	    {
            	    // InternalGrammar.g:3311:4: (lv_otherElement_7_0= ruleOtherElement )
            	    // InternalGrammar.g:3312:5: lv_otherElement_7_0= ruleOtherElement
            	    {

            	    					newCompositeNode(grammarAccess.getWithAccess().getOtherElementOtherElementParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_47);
            	    lv_otherElement_7_0=ruleOtherElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWithRule());
            	    					}
            	    					add(
            	    						current,
            	    						"otherElement",
            	    						lv_otherElement_7_0,
            	    						"org.xtext.example.Grammar.OtherElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getWithAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleWith"


    // $ANTLR start "entryRuleFor"
    // InternalGrammar.g:3337:1: entryRuleFor returns [EObject current=null] : iv_ruleFor= ruleFor EOF ;
    public final EObject entryRuleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor = null;


        try {
            // InternalGrammar.g:3337:44: (iv_ruleFor= ruleFor EOF )
            // InternalGrammar.g:3338:2: iv_ruleFor= ruleFor EOF
            {
             newCompositeNode(grammarAccess.getForRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFor=ruleFor();

            state._fsp--;

             current =iv_ruleFor; 
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
    // $ANTLR end "entryRuleFor"


    // $ANTLR start "ruleFor"
    // InternalGrammar.g:3344:1: ruleFor returns [EObject current=null] : ( ( (lv_increment_0_0= ruleVariable ) ) otherlv_1= 'from' ( ( (lv_initWithVariable_2_0= ruleVariable ) ) | ( (lv_initWithInteger_3_0= RULE_INT ) ) ) otherlv_4= 'to' ( ( ( (lv_endWithVariable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )? ) | ( (lv_endWithInteger_7_0= RULE_INT ) ) ) otherlv_8= '{' ( (lv_otherElement_9_0= ruleOtherElement ) )* otherlv_10= '}' ) ;
    public final EObject ruleFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_initWithInteger_3_0=null;
        Token otherlv_4=null;
        Token lv_endWithInteger_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_increment_0_0 = null;

        EObject lv_initWithVariable_2_0 = null;

        EObject lv_endWithVariable_5_0 = null;

        EObject lv_objectC_6_0 = null;

        EObject lv_otherElement_9_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:3350:2: ( ( ( (lv_increment_0_0= ruleVariable ) ) otherlv_1= 'from' ( ( (lv_initWithVariable_2_0= ruleVariable ) ) | ( (lv_initWithInteger_3_0= RULE_INT ) ) ) otherlv_4= 'to' ( ( ( (lv_endWithVariable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )? ) | ( (lv_endWithInteger_7_0= RULE_INT ) ) ) otherlv_8= '{' ( (lv_otherElement_9_0= ruleOtherElement ) )* otherlv_10= '}' ) )
            // InternalGrammar.g:3351:2: ( ( (lv_increment_0_0= ruleVariable ) ) otherlv_1= 'from' ( ( (lv_initWithVariable_2_0= ruleVariable ) ) | ( (lv_initWithInteger_3_0= RULE_INT ) ) ) otherlv_4= 'to' ( ( ( (lv_endWithVariable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )? ) | ( (lv_endWithInteger_7_0= RULE_INT ) ) ) otherlv_8= '{' ( (lv_otherElement_9_0= ruleOtherElement ) )* otherlv_10= '}' )
            {
            // InternalGrammar.g:3351:2: ( ( (lv_increment_0_0= ruleVariable ) ) otherlv_1= 'from' ( ( (lv_initWithVariable_2_0= ruleVariable ) ) | ( (lv_initWithInteger_3_0= RULE_INT ) ) ) otherlv_4= 'to' ( ( ( (lv_endWithVariable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )? ) | ( (lv_endWithInteger_7_0= RULE_INT ) ) ) otherlv_8= '{' ( (lv_otherElement_9_0= ruleOtherElement ) )* otherlv_10= '}' )
            // InternalGrammar.g:3352:3: ( (lv_increment_0_0= ruleVariable ) ) otherlv_1= 'from' ( ( (lv_initWithVariable_2_0= ruleVariable ) ) | ( (lv_initWithInteger_3_0= RULE_INT ) ) ) otherlv_4= 'to' ( ( ( (lv_endWithVariable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )? ) | ( (lv_endWithInteger_7_0= RULE_INT ) ) ) otherlv_8= '{' ( (lv_otherElement_9_0= ruleOtherElement ) )* otherlv_10= '}'
            {
            // InternalGrammar.g:3352:3: ( (lv_increment_0_0= ruleVariable ) )
            // InternalGrammar.g:3353:4: (lv_increment_0_0= ruleVariable )
            {
            // InternalGrammar.g:3353:4: (lv_increment_0_0= ruleVariable )
            // InternalGrammar.g:3354:5: lv_increment_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getForAccess().getIncrementVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_53);
            lv_increment_0_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForRule());
            					}
            					set(
            						current,
            						"increment",
            						lv_increment_0_0,
            						"org.xtext.example.Grammar.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,46,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getForAccess().getFromKeyword_1());
            		
            // InternalGrammar.g:3375:3: ( ( (lv_initWithVariable_2_0= ruleVariable ) ) | ( (lv_initWithInteger_3_0= RULE_INT ) ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==21) ) {
                alt58=1;
            }
            else if ( (LA58_0==RULE_INT) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalGrammar.g:3376:4: ( (lv_initWithVariable_2_0= ruleVariable ) )
                    {
                    // InternalGrammar.g:3376:4: ( (lv_initWithVariable_2_0= ruleVariable ) )
                    // InternalGrammar.g:3377:5: (lv_initWithVariable_2_0= ruleVariable )
                    {
                    // InternalGrammar.g:3377:5: (lv_initWithVariable_2_0= ruleVariable )
                    // InternalGrammar.g:3378:6: lv_initWithVariable_2_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getForAccess().getInitWithVariableVariableParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_54);
                    lv_initWithVariable_2_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getForRule());
                    						}
                    						set(
                    							current,
                    							"initWithVariable",
                    							lv_initWithVariable_2_0,
                    							"org.xtext.example.Grammar.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGrammar.g:3396:4: ( (lv_initWithInteger_3_0= RULE_INT ) )
                    {
                    // InternalGrammar.g:3396:4: ( (lv_initWithInteger_3_0= RULE_INT ) )
                    // InternalGrammar.g:3397:5: (lv_initWithInteger_3_0= RULE_INT )
                    {
                    // InternalGrammar.g:3397:5: (lv_initWithInteger_3_0= RULE_INT )
                    // InternalGrammar.g:3398:6: lv_initWithInteger_3_0= RULE_INT
                    {
                    lv_initWithInteger_3_0=(Token)match(input,RULE_INT,FOLLOW_54); 

                    						newLeafNode(lv_initWithInteger_3_0, grammarAccess.getForAccess().getInitWithIntegerINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getForRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"initWithInteger",
                    							lv_initWithInteger_3_0,
                    							"org.xtext.example.Grammar.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,47,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getForAccess().getToKeyword_3());
            		
            // InternalGrammar.g:3419:3: ( ( ( (lv_endWithVariable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )? ) | ( (lv_endWithInteger_7_0= RULE_INT ) ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==21) ) {
                alt60=1;
            }
            else if ( (LA60_0==RULE_INT) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalGrammar.g:3420:4: ( ( (lv_endWithVariable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )? )
                    {
                    // InternalGrammar.g:3420:4: ( ( (lv_endWithVariable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )? )
                    // InternalGrammar.g:3421:5: ( (lv_endWithVariable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )?
                    {
                    // InternalGrammar.g:3421:5: ( (lv_endWithVariable_5_0= ruleVariable ) )
                    // InternalGrammar.g:3422:6: (lv_endWithVariable_5_0= ruleVariable )
                    {
                    // InternalGrammar.g:3422:6: (lv_endWithVariable_5_0= ruleVariable )
                    // InternalGrammar.g:3423:7: lv_endWithVariable_5_0= ruleVariable
                    {

                    							newCompositeNode(grammarAccess.getForAccess().getEndWithVariableVariableParserRuleCall_4_0_0_0());
                    						
                    pushFollow(FOLLOW_55);
                    lv_endWithVariable_5_0=ruleVariable();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getForRule());
                    							}
                    							set(
                    								current,
                    								"endWithVariable",
                    								lv_endWithVariable_5_0,
                    								"org.xtext.example.Grammar.Variable");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalGrammar.g:3440:5: ( (lv_objectC_6_0= ruleObjectC ) )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==28) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalGrammar.g:3441:6: (lv_objectC_6_0= ruleObjectC )
                            {
                            // InternalGrammar.g:3441:6: (lv_objectC_6_0= ruleObjectC )
                            // InternalGrammar.g:3442:7: lv_objectC_6_0= ruleObjectC
                            {

                            							newCompositeNode(grammarAccess.getForAccess().getObjectCObjectCParserRuleCall_4_0_1_0());
                            						
                            pushFollow(FOLLOW_5);
                            lv_objectC_6_0=ruleObjectC();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getForRule());
                            							}
                            							set(
                            								current,
                            								"objectC",
                            								lv_objectC_6_0,
                            								"org.xtext.example.Grammar.ObjectC");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGrammar.g:3461:4: ( (lv_endWithInteger_7_0= RULE_INT ) )
                    {
                    // InternalGrammar.g:3461:4: ( (lv_endWithInteger_7_0= RULE_INT ) )
                    // InternalGrammar.g:3462:5: (lv_endWithInteger_7_0= RULE_INT )
                    {
                    // InternalGrammar.g:3462:5: (lv_endWithInteger_7_0= RULE_INT )
                    // InternalGrammar.g:3463:6: lv_endWithInteger_7_0= RULE_INT
                    {
                    lv_endWithInteger_7_0=(Token)match(input,RULE_INT,FOLLOW_5); 

                    						newLeafNode(lv_endWithInteger_7_0, grammarAccess.getForAccess().getEndWithIntegerINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getForRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"endWithInteger",
                    							lv_endWithInteger_7_0,
                    							"org.xtext.example.Grammar.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_8, grammarAccess.getForAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalGrammar.g:3484:3: ( (lv_otherElement_9_0= ruleOtherElement ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( ((LA61_0>=21 && LA61_0<=22)||(LA61_0>=26 && LA61_0<=27)||LA61_0==40||LA61_0==44) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalGrammar.g:3485:4: (lv_otherElement_9_0= ruleOtherElement )
            	    {
            	    // InternalGrammar.g:3485:4: (lv_otherElement_9_0= ruleOtherElement )
            	    // InternalGrammar.g:3486:5: lv_otherElement_9_0= ruleOtherElement
            	    {

            	    					newCompositeNode(grammarAccess.getForAccess().getOtherElementOtherElementParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_47);
            	    lv_otherElement_9_0=ruleOtherElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getForRule());
            	    					}
            	    					add(
            	    						current,
            	    						"otherElement",
            	    						lv_otherElement_9_0,
            	    						"org.xtext.example.Grammar.OtherElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getForAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleFor"


    // $ANTLR start "entryRuleOtherElement"
    // InternalGrammar.g:3511:1: entryRuleOtherElement returns [EObject current=null] : iv_ruleOtherElement= ruleOtherElement EOF ;
    public final EObject entryRuleOtherElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherElement = null;


        try {
            // InternalGrammar.g:3511:53: (iv_ruleOtherElement= ruleOtherElement EOF )
            // InternalGrammar.g:3512:2: iv_ruleOtherElement= ruleOtherElement EOF
            {
             newCompositeNode(grammarAccess.getOtherElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOtherElement=ruleOtherElement();

            state._fsp--;

             current =iv_ruleOtherElement; 
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
    // $ANTLR end "entryRuleOtherElement"


    // $ANTLR start "ruleOtherElement"
    // InternalGrammar.g:3518:1: ruleOtherElement returns [EObject current=null] : ( ( (lv_page_0_0= rulePage ) ) | ( (lv_row_1_0= ruleRow ) ) | ( (lv_col_2_0= ruleCol ) ) | ( (lv_loop_3_0= ruleLoop ) ) | ( (lv_conditional_4_0= ruleConditional ) ) ) ;
    public final EObject ruleOtherElement() throws RecognitionException {
        EObject current = null;

        EObject lv_page_0_0 = null;

        EObject lv_row_1_0 = null;

        EObject lv_col_2_0 = null;

        EObject lv_loop_3_0 = null;

        EObject lv_conditional_4_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:3524:2: ( ( ( (lv_page_0_0= rulePage ) ) | ( (lv_row_1_0= ruleRow ) ) | ( (lv_col_2_0= ruleCol ) ) | ( (lv_loop_3_0= ruleLoop ) ) | ( (lv_conditional_4_0= ruleConditional ) ) ) )
            // InternalGrammar.g:3525:2: ( ( (lv_page_0_0= rulePage ) ) | ( (lv_row_1_0= ruleRow ) ) | ( (lv_col_2_0= ruleCol ) ) | ( (lv_loop_3_0= ruleLoop ) ) | ( (lv_conditional_4_0= ruleConditional ) ) )
            {
            // InternalGrammar.g:3525:2: ( ( (lv_page_0_0= rulePage ) ) | ( (lv_row_1_0= ruleRow ) ) | ( (lv_col_2_0= ruleCol ) ) | ( (lv_loop_3_0= ruleLoop ) ) | ( (lv_conditional_4_0= ruleConditional ) ) )
            int alt62=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt62=1;
                }
                break;
            case 26:
                {
                alt62=2;
                }
                break;
            case 27:
                {
                alt62=3;
                }
                break;
            case 21:
            case 44:
                {
                alt62=4;
                }
                break;
            case 40:
                {
                alt62=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // InternalGrammar.g:3526:3: ( (lv_page_0_0= rulePage ) )
                    {
                    // InternalGrammar.g:3526:3: ( (lv_page_0_0= rulePage ) )
                    // InternalGrammar.g:3527:4: (lv_page_0_0= rulePage )
                    {
                    // InternalGrammar.g:3527:4: (lv_page_0_0= rulePage )
                    // InternalGrammar.g:3528:5: lv_page_0_0= rulePage
                    {

                    					newCompositeNode(grammarAccess.getOtherElementAccess().getPagePageParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_page_0_0=rulePage();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOtherElementRule());
                    					}
                    					set(
                    						current,
                    						"page",
                    						lv_page_0_0,
                    						"org.xtext.example.Grammar.Page");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGrammar.g:3546:3: ( (lv_row_1_0= ruleRow ) )
                    {
                    // InternalGrammar.g:3546:3: ( (lv_row_1_0= ruleRow ) )
                    // InternalGrammar.g:3547:4: (lv_row_1_0= ruleRow )
                    {
                    // InternalGrammar.g:3547:4: (lv_row_1_0= ruleRow )
                    // InternalGrammar.g:3548:5: lv_row_1_0= ruleRow
                    {

                    					newCompositeNode(grammarAccess.getOtherElementAccess().getRowRowParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_row_1_0=ruleRow();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOtherElementRule());
                    					}
                    					set(
                    						current,
                    						"row",
                    						lv_row_1_0,
                    						"org.xtext.example.Grammar.Row");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGrammar.g:3566:3: ( (lv_col_2_0= ruleCol ) )
                    {
                    // InternalGrammar.g:3566:3: ( (lv_col_2_0= ruleCol ) )
                    // InternalGrammar.g:3567:4: (lv_col_2_0= ruleCol )
                    {
                    // InternalGrammar.g:3567:4: (lv_col_2_0= ruleCol )
                    // InternalGrammar.g:3568:5: lv_col_2_0= ruleCol
                    {

                    					newCompositeNode(grammarAccess.getOtherElementAccess().getColColParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_col_2_0=ruleCol();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOtherElementRule());
                    					}
                    					set(
                    						current,
                    						"col",
                    						lv_col_2_0,
                    						"org.xtext.example.Grammar.Col");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGrammar.g:3586:3: ( (lv_loop_3_0= ruleLoop ) )
                    {
                    // InternalGrammar.g:3586:3: ( (lv_loop_3_0= ruleLoop ) )
                    // InternalGrammar.g:3587:4: (lv_loop_3_0= ruleLoop )
                    {
                    // InternalGrammar.g:3587:4: (lv_loop_3_0= ruleLoop )
                    // InternalGrammar.g:3588:5: lv_loop_3_0= ruleLoop
                    {

                    					newCompositeNode(grammarAccess.getOtherElementAccess().getLoopLoopParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_loop_3_0=ruleLoop();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOtherElementRule());
                    					}
                    					set(
                    						current,
                    						"loop",
                    						lv_loop_3_0,
                    						"org.xtext.example.Grammar.Loop");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalGrammar.g:3606:3: ( (lv_conditional_4_0= ruleConditional ) )
                    {
                    // InternalGrammar.g:3606:3: ( (lv_conditional_4_0= ruleConditional ) )
                    // InternalGrammar.g:3607:4: (lv_conditional_4_0= ruleConditional )
                    {
                    // InternalGrammar.g:3607:4: (lv_conditional_4_0= ruleConditional )
                    // InternalGrammar.g:3608:5: lv_conditional_4_0= ruleConditional
                    {

                    					newCompositeNode(grammarAccess.getOtherElementAccess().getConditionalConditionalParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_conditional_4_0=ruleConditional();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOtherElementRule());
                    					}
                    					set(
                    						current,
                    						"conditional",
                    						lv_conditional_4_0,
                    						"org.xtext.example.Grammar.Conditional");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleOtherElement"


    // $ANTLR start "entryRuleStyle"
    // InternalGrammar.g:3629:1: entryRuleStyle returns [EObject current=null] : iv_ruleStyle= ruleStyle EOF ;
    public final EObject entryRuleStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyle = null;


        try {
            // InternalGrammar.g:3629:46: (iv_ruleStyle= ruleStyle EOF )
            // InternalGrammar.g:3630:2: iv_ruleStyle= ruleStyle EOF
            {
             newCompositeNode(grammarAccess.getStyleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStyle=ruleStyle();

            state._fsp--;

             current =iv_ruleStyle; 
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
    // $ANTLR end "entryRuleStyle"


    // $ANTLR start "ruleStyle"
    // InternalGrammar.g:3636:1: ruleStyle returns [EObject current=null] : (otherlv_0= 'style' otherlv_1= '{' ( (lv_css_2_0= ruleCss ) ) otherlv_3= '}' ) ;
    public final EObject ruleStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_css_2_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:3642:2: ( (otherlv_0= 'style' otherlv_1= '{' ( (lv_css_2_0= ruleCss ) ) otherlv_3= '}' ) )
            // InternalGrammar.g:3643:2: (otherlv_0= 'style' otherlv_1= '{' ( (lv_css_2_0= ruleCss ) ) otherlv_3= '}' )
            {
            // InternalGrammar.g:3643:2: (otherlv_0= 'style' otherlv_1= '{' ( (lv_css_2_0= ruleCss ) ) otherlv_3= '}' )
            // InternalGrammar.g:3644:3: otherlv_0= 'style' otherlv_1= '{' ( (lv_css_2_0= ruleCss ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getStyleAccess().getStyleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_56); 

            			newLeafNode(otherlv_1, grammarAccess.getStyleAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGrammar.g:3652:3: ( (lv_css_2_0= ruleCss ) )
            // InternalGrammar.g:3653:4: (lv_css_2_0= ruleCss )
            {
            // InternalGrammar.g:3653:4: (lv_css_2_0= ruleCss )
            // InternalGrammar.g:3654:5: lv_css_2_0= ruleCss
            {

            					newCompositeNode(grammarAccess.getStyleAccess().getCssCssParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_57);
            lv_css_2_0=ruleCss();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStyleRule());
            					}
            					set(
            						current,
            						"css",
            						lv_css_2_0,
            						"org.xtext.example.Grammar.Css");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getStyleAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleStyle"


    // $ANTLR start "entryRuleCss"
    // InternalGrammar.g:3679:1: entryRuleCss returns [EObject current=null] : iv_ruleCss= ruleCss EOF ;
    public final EObject entryRuleCss() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCss = null;


        try {
            // InternalGrammar.g:3679:44: (iv_ruleCss= ruleCss EOF )
            // InternalGrammar.g:3680:2: iv_ruleCss= ruleCss EOF
            {
             newCompositeNode(grammarAccess.getCssRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCss=ruleCss();

            state._fsp--;

             current =iv_ruleCss; 
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
    // $ANTLR end "entryRuleCss"


    // $ANTLR start "ruleCss"
    // InternalGrammar.g:3686:1: ruleCss returns [EObject current=null] : ( (lv_rules_0_0= ruleRule ) )* ;
    public final EObject ruleCss() throws RecognitionException {
        EObject current = null;

        EObject lv_rules_0_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:3692:2: ( ( (lv_rules_0_0= ruleRule ) )* )
            // InternalGrammar.g:3693:2: ( (lv_rules_0_0= ruleRule ) )*
            {
            // InternalGrammar.g:3693:2: ( (lv_rules_0_0= ruleRule ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_ID||LA63_0==28||LA63_0==49) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalGrammar.g:3694:3: (lv_rules_0_0= ruleRule )
            	    {
            	    // InternalGrammar.g:3694:3: (lv_rules_0_0= ruleRule )
            	    // InternalGrammar.g:3695:4: lv_rules_0_0= ruleRule
            	    {

            	    				newCompositeNode(grammarAccess.getCssAccess().getRulesRuleParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_58);
            	    lv_rules_0_0=ruleRule();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getCssRule());
            	    				}
            	    				add(
            	    					current,
            	    					"rules",
            	    					lv_rules_0_0,
            	    					"org.xtext.example.Grammar.Rule");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);


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
    // $ANTLR end "ruleCss"


    // $ANTLR start "entryRuleRule"
    // InternalGrammar.g:3715:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalGrammar.g:3715:45: (iv_ruleRule= ruleRule EOF )
            // InternalGrammar.g:3716:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalGrammar.g:3722:1: ruleRule returns [EObject current=null] : ( ( (lv_selector_0_0= ruleSelector ) ) otherlv_1= '{' ( (lv_declarations_2_0= ruleDeclaration ) )* otherlv_3= '}' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_selector_0_0 = null;

        EObject lv_declarations_2_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:3728:2: ( ( ( (lv_selector_0_0= ruleSelector ) ) otherlv_1= '{' ( (lv_declarations_2_0= ruleDeclaration ) )* otherlv_3= '}' ) )
            // InternalGrammar.g:3729:2: ( ( (lv_selector_0_0= ruleSelector ) ) otherlv_1= '{' ( (lv_declarations_2_0= ruleDeclaration ) )* otherlv_3= '}' )
            {
            // InternalGrammar.g:3729:2: ( ( (lv_selector_0_0= ruleSelector ) ) otherlv_1= '{' ( (lv_declarations_2_0= ruleDeclaration ) )* otherlv_3= '}' )
            // InternalGrammar.g:3730:3: ( (lv_selector_0_0= ruleSelector ) ) otherlv_1= '{' ( (lv_declarations_2_0= ruleDeclaration ) )* otherlv_3= '}'
            {
            // InternalGrammar.g:3730:3: ( (lv_selector_0_0= ruleSelector ) )
            // InternalGrammar.g:3731:4: (lv_selector_0_0= ruleSelector )
            {
            // InternalGrammar.g:3731:4: (lv_selector_0_0= ruleSelector )
            // InternalGrammar.g:3732:5: lv_selector_0_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getSelectorSelectorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_selector_0_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"selector",
            						lv_selector_0_0,
            						"org.xtext.example.Grammar.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_59); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGrammar.g:3753:3: ( (lv_declarations_2_0= ruleDeclaration ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==RULE_ID) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalGrammar.g:3754:4: (lv_declarations_2_0= ruleDeclaration )
            	    {
            	    // InternalGrammar.g:3754:4: (lv_declarations_2_0= ruleDeclaration )
            	    // InternalGrammar.g:3755:5: lv_declarations_2_0= ruleDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getRuleAccess().getDeclarationsDeclarationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_59);
            	    lv_declarations_2_0=ruleDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declarations",
            	    						lv_declarations_2_0,
            	    						"org.xtext.example.Grammar.Declaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleSelector"
    // InternalGrammar.g:3780:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalGrammar.g:3780:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalGrammar.g:3781:2: iv_ruleSelector= ruleSelector EOF
            {
             newCompositeNode(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelector=ruleSelector();

            state._fsp--;

             current =iv_ruleSelector; 
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
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // InternalGrammar.g:3787:1: ruleSelector returns [EObject current=null] : ( ( (lv_idSelector_0_0= ruleIDSelector ) ) | ( (lv_classSelector_1_0= ruleClassSelector ) ) | ( (lv_typeSelector_2_0= ruleTypeSelector ) ) ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        EObject lv_idSelector_0_0 = null;

        EObject lv_classSelector_1_0 = null;

        EObject lv_typeSelector_2_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:3793:2: ( ( ( (lv_idSelector_0_0= ruleIDSelector ) ) | ( (lv_classSelector_1_0= ruleClassSelector ) ) | ( (lv_typeSelector_2_0= ruleTypeSelector ) ) ) )
            // InternalGrammar.g:3794:2: ( ( (lv_idSelector_0_0= ruleIDSelector ) ) | ( (lv_classSelector_1_0= ruleClassSelector ) ) | ( (lv_typeSelector_2_0= ruleTypeSelector ) ) )
            {
            // InternalGrammar.g:3794:2: ( ( (lv_idSelector_0_0= ruleIDSelector ) ) | ( (lv_classSelector_1_0= ruleClassSelector ) ) | ( (lv_typeSelector_2_0= ruleTypeSelector ) ) )
            int alt65=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt65=1;
                }
                break;
            case 28:
                {
                alt65=2;
                }
                break;
            case RULE_ID:
                {
                alt65=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // InternalGrammar.g:3795:3: ( (lv_idSelector_0_0= ruleIDSelector ) )
                    {
                    // InternalGrammar.g:3795:3: ( (lv_idSelector_0_0= ruleIDSelector ) )
                    // InternalGrammar.g:3796:4: (lv_idSelector_0_0= ruleIDSelector )
                    {
                    // InternalGrammar.g:3796:4: (lv_idSelector_0_0= ruleIDSelector )
                    // InternalGrammar.g:3797:5: lv_idSelector_0_0= ruleIDSelector
                    {

                    					newCompositeNode(grammarAccess.getSelectorAccess().getIdSelectorIDSelectorParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_idSelector_0_0=ruleIDSelector();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelectorRule());
                    					}
                    					set(
                    						current,
                    						"idSelector",
                    						lv_idSelector_0_0,
                    						"org.xtext.example.Grammar.IDSelector");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGrammar.g:3815:3: ( (lv_classSelector_1_0= ruleClassSelector ) )
                    {
                    // InternalGrammar.g:3815:3: ( (lv_classSelector_1_0= ruleClassSelector ) )
                    // InternalGrammar.g:3816:4: (lv_classSelector_1_0= ruleClassSelector )
                    {
                    // InternalGrammar.g:3816:4: (lv_classSelector_1_0= ruleClassSelector )
                    // InternalGrammar.g:3817:5: lv_classSelector_1_0= ruleClassSelector
                    {

                    					newCompositeNode(grammarAccess.getSelectorAccess().getClassSelectorClassSelectorParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_classSelector_1_0=ruleClassSelector();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelectorRule());
                    					}
                    					set(
                    						current,
                    						"classSelector",
                    						lv_classSelector_1_0,
                    						"org.xtext.example.Grammar.ClassSelector");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGrammar.g:3835:3: ( (lv_typeSelector_2_0= ruleTypeSelector ) )
                    {
                    // InternalGrammar.g:3835:3: ( (lv_typeSelector_2_0= ruleTypeSelector ) )
                    // InternalGrammar.g:3836:4: (lv_typeSelector_2_0= ruleTypeSelector )
                    {
                    // InternalGrammar.g:3836:4: (lv_typeSelector_2_0= ruleTypeSelector )
                    // InternalGrammar.g:3837:5: lv_typeSelector_2_0= ruleTypeSelector
                    {

                    					newCompositeNode(grammarAccess.getSelectorAccess().getTypeSelectorTypeSelectorParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_typeSelector_2_0=ruleTypeSelector();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelectorRule());
                    					}
                    					set(
                    						current,
                    						"typeSelector",
                    						lv_typeSelector_2_0,
                    						"org.xtext.example.Grammar.TypeSelector");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleIDSelector"
    // InternalGrammar.g:3858:1: entryRuleIDSelector returns [EObject current=null] : iv_ruleIDSelector= ruleIDSelector EOF ;
    public final EObject entryRuleIDSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIDSelector = null;


        try {
            // InternalGrammar.g:3858:51: (iv_ruleIDSelector= ruleIDSelector EOF )
            // InternalGrammar.g:3859:2: iv_ruleIDSelector= ruleIDSelector EOF
            {
             newCompositeNode(grammarAccess.getIDSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIDSelector=ruleIDSelector();

            state._fsp--;

             current =iv_ruleIDSelector; 
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
    // $ANTLR end "entryRuleIDSelector"


    // $ANTLR start "ruleIDSelector"
    // InternalGrammar.g:3865:1: ruleIDSelector returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleIDSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGrammar.g:3871:2: ( (otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGrammar.g:3872:2: (otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGrammar.g:3872:2: (otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGrammar.g:3873:3: otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getIDSelectorAccess().getNumberSignKeyword_0());
            		
            // InternalGrammar.g:3877:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrammar.g:3878:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrammar.g:3878:4: (lv_name_1_0= RULE_ID )
            // InternalGrammar.g:3879:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIDSelectorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIDSelectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.Grammar.ID");
            				

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
    // $ANTLR end "ruleIDSelector"


    // $ANTLR start "entryRuleClassSelector"
    // InternalGrammar.g:3899:1: entryRuleClassSelector returns [EObject current=null] : iv_ruleClassSelector= ruleClassSelector EOF ;
    public final EObject entryRuleClassSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassSelector = null;


        try {
            // InternalGrammar.g:3899:54: (iv_ruleClassSelector= ruleClassSelector EOF )
            // InternalGrammar.g:3900:2: iv_ruleClassSelector= ruleClassSelector EOF
            {
             newCompositeNode(grammarAccess.getClassSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassSelector=ruleClassSelector();

            state._fsp--;

             current =iv_ruleClassSelector; 
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
    // $ANTLR end "entryRuleClassSelector"


    // $ANTLR start "ruleClassSelector"
    // InternalGrammar.g:3906:1: ruleClassSelector returns [EObject current=null] : (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleClassSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGrammar.g:3912:2: ( (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGrammar.g:3913:2: (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGrammar.g:3913:2: (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGrammar.g:3914:3: otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getClassSelectorAccess().getFullStopKeyword_0());
            		
            // InternalGrammar.g:3918:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrammar.g:3919:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrammar.g:3919:4: (lv_name_1_0= RULE_ID )
            // InternalGrammar.g:3920:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getClassSelectorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassSelectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.Grammar.ID");
            				

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
    // $ANTLR end "ruleClassSelector"


    // $ANTLR start "entryRuleTypeSelector"
    // InternalGrammar.g:3940:1: entryRuleTypeSelector returns [EObject current=null] : iv_ruleTypeSelector= ruleTypeSelector EOF ;
    public final EObject entryRuleTypeSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSelector = null;


        try {
            // InternalGrammar.g:3940:53: (iv_ruleTypeSelector= ruleTypeSelector EOF )
            // InternalGrammar.g:3941:2: iv_ruleTypeSelector= ruleTypeSelector EOF
            {
             newCompositeNode(grammarAccess.getTypeSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeSelector=ruleTypeSelector();

            state._fsp--;

             current =iv_ruleTypeSelector; 
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
    // $ANTLR end "entryRuleTypeSelector"


    // $ANTLR start "ruleTypeSelector"
    // InternalGrammar.g:3947:1: ruleTypeSelector returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleTypeSelector() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalGrammar.g:3953:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalGrammar.g:3954:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalGrammar.g:3954:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalGrammar.g:3955:3: (lv_name_0_0= RULE_ID )
            {
            // InternalGrammar.g:3955:3: (lv_name_0_0= RULE_ID )
            // InternalGrammar.g:3956:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getTypeSelectorAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTypeSelectorRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.xtext.example.Grammar.ID");
            			

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
    // $ANTLR end "ruleTypeSelector"


    // $ANTLR start "entryRuleDeclaration"
    // InternalGrammar.g:3975:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalGrammar.g:3975:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalGrammar.g:3976:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalGrammar.g:3982:1: ruleDeclaration returns [EObject current=null] : ( ( (lv_property_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_cssValue_2_0= ruleCssValue ) )+ otherlv_3= ';' ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_property_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_cssValue_2_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:3988:2: ( ( ( (lv_property_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_cssValue_2_0= ruleCssValue ) )+ otherlv_3= ';' ) )
            // InternalGrammar.g:3989:2: ( ( (lv_property_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_cssValue_2_0= ruleCssValue ) )+ otherlv_3= ';' )
            {
            // InternalGrammar.g:3989:2: ( ( (lv_property_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_cssValue_2_0= ruleCssValue ) )+ otherlv_3= ';' )
            // InternalGrammar.g:3990:3: ( (lv_property_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_cssValue_2_0= ruleCssValue ) )+ otherlv_3= ';'
            {
            // InternalGrammar.g:3990:3: ( (lv_property_0_0= RULE_ID ) )
            // InternalGrammar.g:3991:4: (lv_property_0_0= RULE_ID )
            {
            // InternalGrammar.g:3991:4: (lv_property_0_0= RULE_ID )
            // InternalGrammar.g:3992:5: lv_property_0_0= RULE_ID
            {
            lv_property_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_property_0_0, grammarAccess.getDeclarationAccess().getPropertyIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"property",
            						lv_property_0_0,
            						"org.xtext.example.Grammar.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_60); 

            			newLeafNode(otherlv_1, grammarAccess.getDeclarationAccess().getColonKeyword_1());
            		
            // InternalGrammar.g:4012:3: ( (lv_cssValue_2_0= ruleCssValue ) )+
            int cnt66=0;
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( ((LA66_0>=RULE_STRING && LA66_0<=RULE_ID)||LA66_0==13||LA66_0==49||(LA66_0>=52 && LA66_0<=53)) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalGrammar.g:4013:4: (lv_cssValue_2_0= ruleCssValue )
            	    {
            	    // InternalGrammar.g:4013:4: (lv_cssValue_2_0= ruleCssValue )
            	    // InternalGrammar.g:4014:5: lv_cssValue_2_0= ruleCssValue
            	    {

            	    					newCompositeNode(grammarAccess.getDeclarationAccess().getCssValueCssValueParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_61);
            	    lv_cssValue_2_0=ruleCssValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cssValue",
            	    						lv_cssValue_2_0,
            	    						"org.xtext.example.Grammar.CssValue");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt66 >= 1 ) break loop66;
                        EarlyExitException eee =
                            new EarlyExitException(66, input);
                        throw eee;
                }
                cnt66++;
            } while (true);

            otherlv_3=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDeclarationAccess().getSemicolonKeyword_3());
            		

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


    // $ANTLR start "entryRuleCssValue"
    // InternalGrammar.g:4039:1: entryRuleCssValue returns [EObject current=null] : iv_ruleCssValue= ruleCssValue EOF ;
    public final EObject entryRuleCssValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCssValue = null;


        try {
            // InternalGrammar.g:4039:49: (iv_ruleCssValue= ruleCssValue EOF )
            // InternalGrammar.g:4040:2: iv_ruleCssValue= ruleCssValue EOF
            {
             newCompositeNode(grammarAccess.getCssValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCssValue=ruleCssValue();

            state._fsp--;

             current =iv_ruleCssValue; 
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
    // $ANTLR end "entryRuleCssValue"


    // $ANTLR start "ruleCssValue"
    // InternalGrammar.g:4046:1: ruleCssValue returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_integer_2_0= RULE_INT ) ) | ( (lv_coma_3_0= ruleCOMA ) ) | ( (lv_apostrophe_4_0= ruleAPOSTROPHE ) ) | ( (lv_hashtag_5_0= ruleHASHTAG ) ) | ( (lv_pourcent_6_0= rulePOURCENT ) ) ) ;
    public final EObject ruleCssValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_string_1_0=null;
        Token lv_integer_2_0=null;
        AntlrDatatypeRuleToken lv_coma_3_0 = null;

        AntlrDatatypeRuleToken lv_apostrophe_4_0 = null;

        AntlrDatatypeRuleToken lv_hashtag_5_0 = null;

        AntlrDatatypeRuleToken lv_pourcent_6_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:4052:2: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_integer_2_0= RULE_INT ) ) | ( (lv_coma_3_0= ruleCOMA ) ) | ( (lv_apostrophe_4_0= ruleAPOSTROPHE ) ) | ( (lv_hashtag_5_0= ruleHASHTAG ) ) | ( (lv_pourcent_6_0= rulePOURCENT ) ) ) )
            // InternalGrammar.g:4053:2: ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_integer_2_0= RULE_INT ) ) | ( (lv_coma_3_0= ruleCOMA ) ) | ( (lv_apostrophe_4_0= ruleAPOSTROPHE ) ) | ( (lv_hashtag_5_0= ruleHASHTAG ) ) | ( (lv_pourcent_6_0= rulePOURCENT ) ) )
            {
            // InternalGrammar.g:4053:2: ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_integer_2_0= RULE_INT ) ) | ( (lv_coma_3_0= ruleCOMA ) ) | ( (lv_apostrophe_4_0= ruleAPOSTROPHE ) ) | ( (lv_hashtag_5_0= ruleHASHTAG ) ) | ( (lv_pourcent_6_0= rulePOURCENT ) ) )
            int alt67=7;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt67=1;
                }
                break;
            case RULE_STRING:
                {
                alt67=2;
                }
                break;
            case RULE_INT:
                {
                alt67=3;
                }
                break;
            case 13:
                {
                alt67=4;
                }
                break;
            case 53:
                {
                alt67=5;
                }
                break;
            case 49:
                {
                alt67=6;
                }
                break;
            case 52:
                {
                alt67=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // InternalGrammar.g:4054:3: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // InternalGrammar.g:4054:3: ( (lv_name_0_0= RULE_ID ) )
                    // InternalGrammar.g:4055:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalGrammar.g:4055:4: (lv_name_0_0= RULE_ID )
                    // InternalGrammar.g:4056:5: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getCssValueAccess().getNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCssValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.xtext.example.Grammar.ID");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGrammar.g:4073:3: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // InternalGrammar.g:4073:3: ( (lv_string_1_0= RULE_STRING ) )
                    // InternalGrammar.g:4074:4: (lv_string_1_0= RULE_STRING )
                    {
                    // InternalGrammar.g:4074:4: (lv_string_1_0= RULE_STRING )
                    // InternalGrammar.g:4075:5: lv_string_1_0= RULE_STRING
                    {
                    lv_string_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_string_1_0, grammarAccess.getCssValueAccess().getStringSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCssValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"string",
                    						lv_string_1_0,
                    						"org.xtext.example.Grammar.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGrammar.g:4092:3: ( (lv_integer_2_0= RULE_INT ) )
                    {
                    // InternalGrammar.g:4092:3: ( (lv_integer_2_0= RULE_INT ) )
                    // InternalGrammar.g:4093:4: (lv_integer_2_0= RULE_INT )
                    {
                    // InternalGrammar.g:4093:4: (lv_integer_2_0= RULE_INT )
                    // InternalGrammar.g:4094:5: lv_integer_2_0= RULE_INT
                    {
                    lv_integer_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_integer_2_0, grammarAccess.getCssValueAccess().getIntegerINTTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCssValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"integer",
                    						lv_integer_2_0,
                    						"org.xtext.example.Grammar.INT");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGrammar.g:4111:3: ( (lv_coma_3_0= ruleCOMA ) )
                    {
                    // InternalGrammar.g:4111:3: ( (lv_coma_3_0= ruleCOMA ) )
                    // InternalGrammar.g:4112:4: (lv_coma_3_0= ruleCOMA )
                    {
                    // InternalGrammar.g:4112:4: (lv_coma_3_0= ruleCOMA )
                    // InternalGrammar.g:4113:5: lv_coma_3_0= ruleCOMA
                    {

                    					newCompositeNode(grammarAccess.getCssValueAccess().getComaCOMAParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_coma_3_0=ruleCOMA();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCssValueRule());
                    					}
                    					set(
                    						current,
                    						"coma",
                    						lv_coma_3_0,
                    						"org.xtext.example.Grammar.COMA");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalGrammar.g:4131:3: ( (lv_apostrophe_4_0= ruleAPOSTROPHE ) )
                    {
                    // InternalGrammar.g:4131:3: ( (lv_apostrophe_4_0= ruleAPOSTROPHE ) )
                    // InternalGrammar.g:4132:4: (lv_apostrophe_4_0= ruleAPOSTROPHE )
                    {
                    // InternalGrammar.g:4132:4: (lv_apostrophe_4_0= ruleAPOSTROPHE )
                    // InternalGrammar.g:4133:5: lv_apostrophe_4_0= ruleAPOSTROPHE
                    {

                    					newCompositeNode(grammarAccess.getCssValueAccess().getApostropheAPOSTROPHEParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_apostrophe_4_0=ruleAPOSTROPHE();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCssValueRule());
                    					}
                    					set(
                    						current,
                    						"apostrophe",
                    						lv_apostrophe_4_0,
                    						"org.xtext.example.Grammar.APOSTROPHE");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalGrammar.g:4151:3: ( (lv_hashtag_5_0= ruleHASHTAG ) )
                    {
                    // InternalGrammar.g:4151:3: ( (lv_hashtag_5_0= ruleHASHTAG ) )
                    // InternalGrammar.g:4152:4: (lv_hashtag_5_0= ruleHASHTAG )
                    {
                    // InternalGrammar.g:4152:4: (lv_hashtag_5_0= ruleHASHTAG )
                    // InternalGrammar.g:4153:5: lv_hashtag_5_0= ruleHASHTAG
                    {

                    					newCompositeNode(grammarAccess.getCssValueAccess().getHashtagHASHTAGParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_hashtag_5_0=ruleHASHTAG();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCssValueRule());
                    					}
                    					set(
                    						current,
                    						"hashtag",
                    						lv_hashtag_5_0,
                    						"org.xtext.example.Grammar.HASHTAG");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalGrammar.g:4171:3: ( (lv_pourcent_6_0= rulePOURCENT ) )
                    {
                    // InternalGrammar.g:4171:3: ( (lv_pourcent_6_0= rulePOURCENT ) )
                    // InternalGrammar.g:4172:4: (lv_pourcent_6_0= rulePOURCENT )
                    {
                    // InternalGrammar.g:4172:4: (lv_pourcent_6_0= rulePOURCENT )
                    // InternalGrammar.g:4173:5: lv_pourcent_6_0= rulePOURCENT
                    {

                    					newCompositeNode(grammarAccess.getCssValueAccess().getPourcentPOURCENTParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_pourcent_6_0=rulePOURCENT();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCssValueRule());
                    					}
                    					set(
                    						current,
                    						"pourcent",
                    						lv_pourcent_6_0,
                    						"org.xtext.example.Grammar.POURCENT");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleCssValue"


    // $ANTLR start "entryRuleTRUE"
    // InternalGrammar.g:4194:1: entryRuleTRUE returns [String current=null] : iv_ruleTRUE= ruleTRUE EOF ;
    public final String entryRuleTRUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTRUE = null;


        try {
            // InternalGrammar.g:4194:44: (iv_ruleTRUE= ruleTRUE EOF )
            // InternalGrammar.g:4195:2: iv_ruleTRUE= ruleTRUE EOF
            {
             newCompositeNode(grammarAccess.getTRUERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTRUE=ruleTRUE();

            state._fsp--;

             current =iv_ruleTRUE.getText(); 
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
    // $ANTLR end "entryRuleTRUE"


    // $ANTLR start "ruleTRUE"
    // InternalGrammar.g:4201:1: ruleTRUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'true' ;
    public final AntlrDatatypeRuleToken ruleTRUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGrammar.g:4207:2: (kw= 'true' )
            // InternalGrammar.g:4208:2: kw= 'true'
            {
            kw=(Token)match(input,50,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getTRUEAccess().getTrueKeyword());
            	

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
    // $ANTLR end "ruleTRUE"


    // $ANTLR start "entryRuleFALSE"
    // InternalGrammar.g:4216:1: entryRuleFALSE returns [String current=null] : iv_ruleFALSE= ruleFALSE EOF ;
    public final String entryRuleFALSE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFALSE = null;


        try {
            // InternalGrammar.g:4216:45: (iv_ruleFALSE= ruleFALSE EOF )
            // InternalGrammar.g:4217:2: iv_ruleFALSE= ruleFALSE EOF
            {
             newCompositeNode(grammarAccess.getFALSERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFALSE=ruleFALSE();

            state._fsp--;

             current =iv_ruleFALSE.getText(); 
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
    // $ANTLR end "entryRuleFALSE"


    // $ANTLR start "ruleFALSE"
    // InternalGrammar.g:4223:1: ruleFALSE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'false' ;
    public final AntlrDatatypeRuleToken ruleFALSE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGrammar.g:4229:2: (kw= 'false' )
            // InternalGrammar.g:4230:2: kw= 'false'
            {
            kw=(Token)match(input,51,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getFALSEAccess().getFalseKeyword());
            	

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
    // $ANTLR end "ruleFALSE"


    // $ANTLR start "entryRuleHASHTAG"
    // InternalGrammar.g:4238:1: entryRuleHASHTAG returns [String current=null] : iv_ruleHASHTAG= ruleHASHTAG EOF ;
    public final String entryRuleHASHTAG() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHASHTAG = null;


        try {
            // InternalGrammar.g:4238:47: (iv_ruleHASHTAG= ruleHASHTAG EOF )
            // InternalGrammar.g:4239:2: iv_ruleHASHTAG= ruleHASHTAG EOF
            {
             newCompositeNode(grammarAccess.getHASHTAGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHASHTAG=ruleHASHTAG();

            state._fsp--;

             current =iv_ruleHASHTAG.getText(); 
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
    // $ANTLR end "entryRuleHASHTAG"


    // $ANTLR start "ruleHASHTAG"
    // InternalGrammar.g:4245:1: ruleHASHTAG returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '#' ;
    public final AntlrDatatypeRuleToken ruleHASHTAG() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGrammar.g:4251:2: (kw= '#' )
            // InternalGrammar.g:4252:2: kw= '#'
            {
            kw=(Token)match(input,49,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getHASHTAGAccess().getNumberSignKeyword());
            	

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
    // $ANTLR end "ruleHASHTAG"


    // $ANTLR start "entryRulePOURCENT"
    // InternalGrammar.g:4260:1: entryRulePOURCENT returns [String current=null] : iv_rulePOURCENT= rulePOURCENT EOF ;
    public final String entryRulePOURCENT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePOURCENT = null;


        try {
            // InternalGrammar.g:4260:48: (iv_rulePOURCENT= rulePOURCENT EOF )
            // InternalGrammar.g:4261:2: iv_rulePOURCENT= rulePOURCENT EOF
            {
             newCompositeNode(grammarAccess.getPOURCENTRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePOURCENT=rulePOURCENT();

            state._fsp--;

             current =iv_rulePOURCENT.getText(); 
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
    // $ANTLR end "entryRulePOURCENT"


    // $ANTLR start "rulePOURCENT"
    // InternalGrammar.g:4267:1: rulePOURCENT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '%' ;
    public final AntlrDatatypeRuleToken rulePOURCENT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGrammar.g:4273:2: (kw= '%' )
            // InternalGrammar.g:4274:2: kw= '%'
            {
            kw=(Token)match(input,52,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getPOURCENTAccess().getPercentSignKeyword());
            	

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
    // $ANTLR end "rulePOURCENT"


    // $ANTLR start "entryRuleCOMA"
    // InternalGrammar.g:4282:1: entryRuleCOMA returns [String current=null] : iv_ruleCOMA= ruleCOMA EOF ;
    public final String entryRuleCOMA() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCOMA = null;


        try {
            // InternalGrammar.g:4282:44: (iv_ruleCOMA= ruleCOMA EOF )
            // InternalGrammar.g:4283:2: iv_ruleCOMA= ruleCOMA EOF
            {
             newCompositeNode(grammarAccess.getCOMARule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCOMA=ruleCOMA();

            state._fsp--;

             current =iv_ruleCOMA.getText(); 
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
    // $ANTLR end "entryRuleCOMA"


    // $ANTLR start "ruleCOMA"
    // InternalGrammar.g:4289:1: ruleCOMA returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ',' ;
    public final AntlrDatatypeRuleToken ruleCOMA() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGrammar.g:4295:2: (kw= ',' )
            // InternalGrammar.g:4296:2: kw= ','
            {
            kw=(Token)match(input,13,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getCOMAAccess().getCommaKeyword());
            	

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
    // $ANTLR end "ruleCOMA"


    // $ANTLR start "entryRuleAPOSTROPHE"
    // InternalGrammar.g:4304:1: entryRuleAPOSTROPHE returns [String current=null] : iv_ruleAPOSTROPHE= ruleAPOSTROPHE EOF ;
    public final String entryRuleAPOSTROPHE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAPOSTROPHE = null;


        try {
            // InternalGrammar.g:4304:50: (iv_ruleAPOSTROPHE= ruleAPOSTROPHE EOF )
            // InternalGrammar.g:4305:2: iv_ruleAPOSTROPHE= ruleAPOSTROPHE EOF
            {
             newCompositeNode(grammarAccess.getAPOSTROPHERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAPOSTROPHE=ruleAPOSTROPHE();

            state._fsp--;

             current =iv_ruleAPOSTROPHE.getText(); 
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
    // $ANTLR end "entryRuleAPOSTROPHE"


    // $ANTLR start "ruleAPOSTROPHE"
    // InternalGrammar.g:4311:1: ruleAPOSTROPHE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '\\'' ;
    public final AntlrDatatypeRuleToken ruleAPOSTROPHE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGrammar.g:4317:2: (kw= '\\'' )
            // InternalGrammar.g:4318:2: kw= '\\''
            {
            kw=(Token)match(input,53,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getAPOSTROPHEAccess().getApostropheKeyword());
            	

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
    // $ANTLR end "ruleAPOSTROPHE"


    // $ANTLR start "entryRuleFloat"
    // InternalGrammar.g:4326:1: entryRuleFloat returns [EObject current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final EObject entryRuleFloat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloat = null;


        try {
            // InternalGrammar.g:4326:46: (iv_ruleFloat= ruleFloat EOF )
            // InternalGrammar.g:4327:2: iv_ruleFloat= ruleFloat EOF
            {
             newCompositeNode(grammarAccess.getFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloat=ruleFloat();

            state._fsp--;

             current =iv_ruleFloat; 
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
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // InternalGrammar.g:4333:1: ruleFloat returns [EObject current=null] : ( ( (lv_firstInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_secondInt_2_0= RULE_INT ) ) ) ;
    public final EObject ruleFloat() throws RecognitionException {
        EObject current = null;

        Token lv_firstInt_0_0=null;
        Token otherlv_1=null;
        Token lv_secondInt_2_0=null;


        	enterRule();

        try {
            // InternalGrammar.g:4339:2: ( ( ( (lv_firstInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_secondInt_2_0= RULE_INT ) ) ) )
            // InternalGrammar.g:4340:2: ( ( (lv_firstInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_secondInt_2_0= RULE_INT ) ) )
            {
            // InternalGrammar.g:4340:2: ( ( (lv_firstInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_secondInt_2_0= RULE_INT ) ) )
            // InternalGrammar.g:4341:3: ( (lv_firstInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_secondInt_2_0= RULE_INT ) )
            {
            // InternalGrammar.g:4341:3: ( (lv_firstInt_0_0= RULE_INT ) )
            // InternalGrammar.g:4342:4: (lv_firstInt_0_0= RULE_INT )
            {
            // InternalGrammar.g:4342:4: (lv_firstInt_0_0= RULE_INT )
            // InternalGrammar.g:4343:5: lv_firstInt_0_0= RULE_INT
            {
            lv_firstInt_0_0=(Token)match(input,RULE_INT,FOLLOW_62); 

            					newLeafNode(lv_firstInt_0_0, grammarAccess.getFloatAccess().getFirstIntINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFloatRule());
            					}
            					setWithLastConsumed(
            						current,
            						"firstInt",
            						lv_firstInt_0_0,
            						"org.xtext.example.Grammar.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_63); 

            			newLeafNode(otherlv_1, grammarAccess.getFloatAccess().getFullStopKeyword_1());
            		
            // InternalGrammar.g:4363:3: ( (lv_secondInt_2_0= RULE_INT ) )
            // InternalGrammar.g:4364:4: (lv_secondInt_2_0= RULE_INT )
            {
            // InternalGrammar.g:4364:4: (lv_secondInt_2_0= RULE_INT )
            // InternalGrammar.g:4365:5: lv_secondInt_2_0= RULE_INT
            {
            lv_secondInt_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_secondInt_2_0, grammarAccess.getFloatAccess().getSecondIntINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFloatRule());
            					}
            					setWithLastConsumed(
            						current,
            						"secondInt",
            						lv_secondInt_2_0,
            						"org.xtext.example.Grammar.INT");
            				

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
    // $ANTLR end "ruleFloat"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\2\uffff\1\10\7\uffff";
    static final String dfa_3s = "\1\4\1\uffff\1\15\7\uffff";
    static final String dfa_4s = "\1\63\1\uffff\1\54\7\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\1\10\1\2\1\3";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\6\uffff\1\6\3\uffff\1\5\4\uffff\1\7\34\uffff\1\3\1\4",
            "",
            "\2\10\2\uffff\1\10\3\uffff\2\10\2\uffff\3\10\1\11\3\uffff\1\10\7\uffff\2\10\2\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "327:2: ( ( (lv_string_0_0= RULE_STRING ) ) | ( (lv_integer_1_0= RULE_INT ) ) | ( (lv_floatValue_2_0= ruleFloat ) ) | ( (lv_trueV_3_0= ruleTRUE ) ) | ( (lv_falseV_4_0= ruleFALSE ) ) | ( (lv_array_5_0= ruleArray ) ) | ( (lv_nestedObject_6_0= ruleNestedObject ) ) | ( (lv_variable_7_0= ruleVariable ) ) )";
        }
    }
    static final String dfa_8s = "\17\uffff";
    static final String dfa_9s = "\4\uffff\1\7\1\uffff\1\11\7\uffff\1\11";
    static final String dfa_10s = "\1\4\1\uffff\1\6\1\uffff\1\16\1\uffff\1\16\3\uffff\1\5\1\uffff\1\6\1\21\1\16";
    static final String dfa_11s = "\1\45\1\uffff\1\6\1\uffff\1\54\1\uffff\1\54\3\uffff\1\25\1\uffff\1\6\1\21\1\54";
    static final String dfa_12s = "\1\uffff\1\1\1\uffff\1\4\1\uffff\1\7\1\uffff\1\5\1\6\1\2\1\uffff\1\3\3\uffff";
    static final String dfa_13s = "\17\uffff}>";
    static final String[] dfa_14s = {
            "\1\3\1\4\17\uffff\1\2\7\uffff\1\1\5\uffff\3\5",
            "",
            "\1\6",
            "",
            "\1\7\6\uffff\2\7\3\uffff\2\7\1\10\3\uffff\1\7\7\uffff\1\7\3\uffff\1\7",
            "",
            "\1\11\1\uffff\1\12\3\uffff\1\13\2\11\3\uffff\3\11\3\uffff\1\11\7\uffff\1\11\3\uffff\1\11",
            "",
            "",
            "",
            "\1\11\17\uffff\1\14",
            "",
            "\1\15",
            "\1\16",
            "\1\11\5\uffff\1\13\2\11\3\uffff\2\11\4\uffff\1\11\7\uffff\1\11\3\uffff\1\11"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "1469:3: ( ( (lv_img_2_0= ruleImg ) ) | ( ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )? ) | ( (lv_variableD_6_0= ruleVariableD ) ) | ( (lv_string_7_0= RULE_STRING ) ) | ( (lv_integer_8_0= RULE_INT ) ) | ( (lv_floatValue_9_0= ruleFloat ) ) | ( (lv_function_10_0= ruleFunction ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000C000000211030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000C000000231030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000C110000615030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000C003800211030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000011010000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000C110004615030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000C110008615030L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000C003E20211030L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000C003820211030L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000110010000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100010000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000090010002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000080010002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000C000001211030L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000010010002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x000000C000002000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x000C11000C615030L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000010011000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000010001000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0002000010004040L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0002000010000042L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0032000000002070L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0032000002002070L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000020L});

}