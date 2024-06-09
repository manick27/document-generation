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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'data'", "'{'", "','", "'}'", "':'", "'['", "']'", "'document'", "'allInOne'", "'='", "'$'", "'page'", "'('", "')'", "';'", "'title'", "'subtitle'", "'subsubtitle'", "'row'", "'col'", "'.'", "'img'", "'src'", "'alt'", "'class'", "'colspan'", "'rowspan'", "'SUM'", "'PROD'", "'DIV'", "'-'", "'+'", "'if'", "'then'", "'else'", "'=='", "'!='", "'<'", "'>'", "'with'", "'in'", "'from'", "'to'", "'style'", "'#'", "'true'", "'false'", "'%'", "'\\''"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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

            if ( (LA2_0==54) ) {
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

            if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_INT)||LA6_0==12||LA6_0==16||LA6_0==21||(LA6_0>=56 && LA6_0<=57)) ) {
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

            if ( (LA9_0==56) ) {
                alt9=1;
            }
            else if ( (LA9_0==57) ) {
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

                if ( (LA10_0==RULE_ID||(LA10_0>=21 && LA10_0<=22)||LA10_0==43||LA10_0==50) ) {
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
            case RULE_ID:
                {
                alt11=1;
                }
                break;
            case 22:
                {
                alt11=2;
                }
                break;
            case 21:
            case 50:
                {
                alt11=3;
                }
                break;
            case 43:
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


    // $ANTLR start "entryRuleSuperVariable"
    // InternalGrammar.g:904:1: entryRuleSuperVariable returns [EObject current=null] : iv_ruleSuperVariable= ruleSuperVariable EOF ;
    public final EObject entryRuleSuperVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperVariable = null;


        try {
            // InternalGrammar.g:904:54: (iv_ruleSuperVariable= ruleSuperVariable EOF )
            // InternalGrammar.g:905:2: iv_ruleSuperVariable= ruleSuperVariable EOF
            {
             newCompositeNode(grammarAccess.getSuperVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSuperVariable=ruleSuperVariable();

            state._fsp--;

             current =iv_ruleSuperVariable; 
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
    // $ANTLR end "entryRuleSuperVariable"


    // $ANTLR start "ruleSuperVariable"
    // InternalGrammar.g:911:1: ruleSuperVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSuperVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalGrammar.g:917:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalGrammar.g:918:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalGrammar.g:918:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalGrammar.g:919:3: (lv_name_0_0= RULE_ID )
            {
            // InternalGrammar.g:919:3: (lv_name_0_0= RULE_ID )
            // InternalGrammar.g:920:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getSuperVariableAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSuperVariableRule());
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
    // $ANTLR end "ruleSuperVariable"


    // $ANTLR start "entryRuleVariableD"
    // InternalGrammar.g:939:1: entryRuleVariableD returns [EObject current=null] : iv_ruleVariableD= ruleVariableD EOF ;
    public final EObject entryRuleVariableD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableD = null;


        try {
            // InternalGrammar.g:939:50: (iv_ruleVariableD= ruleVariableD EOF )
            // InternalGrammar.g:940:2: iv_ruleVariableD= ruleVariableD EOF
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
    // InternalGrammar.g:946:1: ruleVariableD returns [EObject current=null] : ( ( (lv_superVariable_0_0= ruleSuperVariable ) ) otherlv_1= '=' ( ( (lv_value_2_0= ruleValue ) ) | ( (lv_classVariable_3_0= ruleClassVariable ) ) | ( (lv_function_4_0= ruleFunction ) ) ) ) ;
    public final EObject ruleVariableD() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_superVariable_0_0 = null;

        EObject lv_value_2_0 = null;

        EObject lv_classVariable_3_0 = null;

        EObject lv_function_4_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:952:2: ( ( ( (lv_superVariable_0_0= ruleSuperVariable ) ) otherlv_1= '=' ( ( (lv_value_2_0= ruleValue ) ) | ( (lv_classVariable_3_0= ruleClassVariable ) ) | ( (lv_function_4_0= ruleFunction ) ) ) ) )
            // InternalGrammar.g:953:2: ( ( (lv_superVariable_0_0= ruleSuperVariable ) ) otherlv_1= '=' ( ( (lv_value_2_0= ruleValue ) ) | ( (lv_classVariable_3_0= ruleClassVariable ) ) | ( (lv_function_4_0= ruleFunction ) ) ) )
            {
            // InternalGrammar.g:953:2: ( ( (lv_superVariable_0_0= ruleSuperVariable ) ) otherlv_1= '=' ( ( (lv_value_2_0= ruleValue ) ) | ( (lv_classVariable_3_0= ruleClassVariable ) ) | ( (lv_function_4_0= ruleFunction ) ) ) )
            // InternalGrammar.g:954:3: ( (lv_superVariable_0_0= ruleSuperVariable ) ) otherlv_1= '=' ( ( (lv_value_2_0= ruleValue ) ) | ( (lv_classVariable_3_0= ruleClassVariable ) ) | ( (lv_function_4_0= ruleFunction ) ) )
            {
            // InternalGrammar.g:954:3: ( (lv_superVariable_0_0= ruleSuperVariable ) )
            // InternalGrammar.g:955:4: (lv_superVariable_0_0= ruleSuperVariable )
            {
            // InternalGrammar.g:955:4: (lv_superVariable_0_0= ruleSuperVariable )
            // InternalGrammar.g:956:5: lv_superVariable_0_0= ruleSuperVariable
            {

            					newCompositeNode(grammarAccess.getVariableDAccess().getSuperVariableSuperVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_superVariable_0_0=ruleSuperVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableDRule());
            					}
            					set(
            						current,
            						"superVariable",
            						lv_superVariable_0_0,
            						"org.xtext.example.Grammar.SuperVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableDAccess().getEqualsSignKeyword_1());
            		
            // InternalGrammar.g:977:3: ( ( (lv_value_2_0= ruleValue ) ) | ( (lv_classVariable_3_0= ruleClassVariable ) ) | ( (lv_function_4_0= ruleFunction ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case 12:
            case 16:
            case 21:
            case 56:
            case 57:
                {
                alt12=1;
                }
                break;
            case 31:
                {
                alt12=2;
                }
                break;
            case 38:
            case 39:
            case 40:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalGrammar.g:978:4: ( (lv_value_2_0= ruleValue ) )
                    {
                    // InternalGrammar.g:978:4: ( (lv_value_2_0= ruleValue ) )
                    // InternalGrammar.g:979:5: (lv_value_2_0= ruleValue )
                    {
                    // InternalGrammar.g:979:5: (lv_value_2_0= ruleValue )
                    // InternalGrammar.g:980:6: lv_value_2_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getVariableDAccess().getValueValueParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableDRule());
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
                    break;
                case 2 :
                    // InternalGrammar.g:998:4: ( (lv_classVariable_3_0= ruleClassVariable ) )
                    {
                    // InternalGrammar.g:998:4: ( (lv_classVariable_3_0= ruleClassVariable ) )
                    // InternalGrammar.g:999:5: (lv_classVariable_3_0= ruleClassVariable )
                    {
                    // InternalGrammar.g:999:5: (lv_classVariable_3_0= ruleClassVariable )
                    // InternalGrammar.g:1000:6: lv_classVariable_3_0= ruleClassVariable
                    {

                    						newCompositeNode(grammarAccess.getVariableDAccess().getClassVariableClassVariableParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_classVariable_3_0=ruleClassVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableDRule());
                    						}
                    						set(
                    							current,
                    							"classVariable",
                    							lv_classVariable_3_0,
                    							"org.xtext.example.Grammar.ClassVariable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGrammar.g:1018:4: ( (lv_function_4_0= ruleFunction ) )
                    {
                    // InternalGrammar.g:1018:4: ( (lv_function_4_0= ruleFunction ) )
                    // InternalGrammar.g:1019:5: (lv_function_4_0= ruleFunction )
                    {
                    // InternalGrammar.g:1019:5: (lv_function_4_0= ruleFunction )
                    // InternalGrammar.g:1020:6: lv_function_4_0= ruleFunction
                    {

                    						newCompositeNode(grammarAccess.getVariableDAccess().getFunctionFunctionParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_function_4_0=ruleFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableDRule());
                    						}
                    						add(
                    							current,
                    							"function",
                    							lv_function_4_0,
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
    // InternalGrammar.g:1042:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // InternalGrammar.g:1042:45: (iv_rulePage= rulePage EOF )
            // InternalGrammar.g:1043:2: iv_rulePage= rulePage EOF
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
    // InternalGrammar.g:1049:1: rulePage returns [EObject current=null] : (otherlv_0= 'page' otherlv_1= '(' ( ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? ) | ( (lv_string_5_0= RULE_STRING ) ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_titles_8_0= ruleTitle ) )* ( (lv_elementPage_9_0= ruleElementPage ) )* otherlv_10= '}' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_string_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject lv_variable_2_0 = null;

        EObject lv_objectC_3_0 = null;

        EObject lv_arrayC_4_0 = null;

        EObject lv_titles_8_0 = null;

        EObject lv_elementPage_9_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:1055:2: ( (otherlv_0= 'page' otherlv_1= '(' ( ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? ) | ( (lv_string_5_0= RULE_STRING ) ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_titles_8_0= ruleTitle ) )* ( (lv_elementPage_9_0= ruleElementPage ) )* otherlv_10= '}' ) )
            // InternalGrammar.g:1056:2: (otherlv_0= 'page' otherlv_1= '(' ( ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? ) | ( (lv_string_5_0= RULE_STRING ) ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_titles_8_0= ruleTitle ) )* ( (lv_elementPage_9_0= ruleElementPage ) )* otherlv_10= '}' )
            {
            // InternalGrammar.g:1056:2: (otherlv_0= 'page' otherlv_1= '(' ( ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? ) | ( (lv_string_5_0= RULE_STRING ) ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_titles_8_0= ruleTitle ) )* ( (lv_elementPage_9_0= ruleElementPage ) )* otherlv_10= '}' )
            // InternalGrammar.g:1057:3: otherlv_0= 'page' otherlv_1= '(' ( ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? ) | ( (lv_string_5_0= RULE_STRING ) ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_titles_8_0= ruleTitle ) )* ( (lv_elementPage_9_0= ruleElementPage ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getPageAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGrammar.g:1065:3: ( ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? ) | ( (lv_string_5_0= RULE_STRING ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_STRING) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalGrammar.g:1066:4: ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? )
                    {
                    // InternalGrammar.g:1066:4: ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? )
                    // InternalGrammar.g:1067:5: ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )?
                    {
                    // InternalGrammar.g:1067:5: ( (lv_variable_2_0= ruleVariable ) )
                    // InternalGrammar.g:1068:6: (lv_variable_2_0= ruleVariable )
                    {
                    // InternalGrammar.g:1068:6: (lv_variable_2_0= ruleVariable )
                    // InternalGrammar.g:1069:7: lv_variable_2_0= ruleVariable
                    {

                    							newCompositeNode(grammarAccess.getPageAccess().getVariableVariableParserRuleCall_2_0_0_0());
                    						
                    pushFollow(FOLLOW_20);
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

                    // InternalGrammar.g:1086:5: ( (lv_objectC_3_0= ruleObjectC ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==31) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalGrammar.g:1087:6: (lv_objectC_3_0= ruleObjectC )
                            {
                            // InternalGrammar.g:1087:6: (lv_objectC_3_0= ruleObjectC )
                            // InternalGrammar.g:1088:7: lv_objectC_3_0= ruleObjectC
                            {

                            							newCompositeNode(grammarAccess.getPageAccess().getObjectCObjectCParserRuleCall_2_0_1_0());
                            						
                            pushFollow(FOLLOW_21);
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

                    // InternalGrammar.g:1105:5: ( (lv_arrayC_4_0= ruleArrayC ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==16) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalGrammar.g:1106:6: (lv_arrayC_4_0= ruleArrayC )
                            {
                            // InternalGrammar.g:1106:6: (lv_arrayC_4_0= ruleArrayC )
                            // InternalGrammar.g:1107:7: lv_arrayC_4_0= ruleArrayC
                            {

                            							newCompositeNode(grammarAccess.getPageAccess().getArrayCArrayCParserRuleCall_2_0_2_0());
                            						
                            pushFollow(FOLLOW_22);
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
                    // InternalGrammar.g:1126:4: ( (lv_string_5_0= RULE_STRING ) )
                    {
                    // InternalGrammar.g:1126:4: ( (lv_string_5_0= RULE_STRING ) )
                    // InternalGrammar.g:1127:5: (lv_string_5_0= RULE_STRING )
                    {
                    // InternalGrammar.g:1127:5: (lv_string_5_0= RULE_STRING )
                    // InternalGrammar.g:1128:6: lv_string_5_0= RULE_STRING
                    {
                    lv_string_5_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

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
            		
            otherlv_7=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_7, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalGrammar.g:1153:3: ( (lv_titles_8_0= ruleTitle ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=26 && LA16_0<=28)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGrammar.g:1154:4: (lv_titles_8_0= ruleTitle )
            	    {
            	    // InternalGrammar.g:1154:4: (lv_titles_8_0= ruleTitle )
            	    // InternalGrammar.g:1155:5: lv_titles_8_0= ruleTitle
            	    {

            	    					newCompositeNode(grammarAccess.getPageAccess().getTitlesTitleParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_titles_8_0=ruleTitle();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"titles",
            	    						lv_titles_8_0,
            	    						"org.xtext.example.Grammar.Title");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalGrammar.g:1172:3: ( (lv_elementPage_9_0= ruleElementPage ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||LA17_0==21||LA17_0==29||LA17_0==43||LA17_0==50) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGrammar.g:1173:4: (lv_elementPage_9_0= ruleElementPage )
            	    {
            	    // InternalGrammar.g:1173:4: (lv_elementPage_9_0= ruleElementPage )
            	    // InternalGrammar.g:1174:5: lv_elementPage_9_0= ruleElementPage
            	    {

            	    					newCompositeNode(grammarAccess.getPageAccess().getElementPageElementPageParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_elementPage_9_0=ruleElementPage();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elementPage",
            	    						lv_elementPage_9_0,
            	    						"org.xtext.example.Grammar.ElementPage");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalGrammar.g:1199:1: entryRuleElementPage returns [EObject current=null] : iv_ruleElementPage= ruleElementPage EOF ;
    public final EObject entryRuleElementPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementPage = null;


        try {
            // InternalGrammar.g:1199:52: (iv_ruleElementPage= ruleElementPage EOF )
            // InternalGrammar.g:1200:2: iv_ruleElementPage= ruleElementPage EOF
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
    // InternalGrammar.g:1206:1: ruleElementPage returns [EObject current=null] : ( ( (lv_row_0_0= ruleRow ) ) | ( (lv_loop_1_0= ruleLoop ) ) | ( (lv_conditional_2_0= ruleConditional ) ) | ( ( (lv_variable_3_0= ruleVariableD ) ) otherlv_4= ';' ) ) ;
    public final EObject ruleElementPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_row_0_0 = null;

        EObject lv_loop_1_0 = null;

        EObject lv_conditional_2_0 = null;

        EObject lv_variable_3_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:1212:2: ( ( ( (lv_row_0_0= ruleRow ) ) | ( (lv_loop_1_0= ruleLoop ) ) | ( (lv_conditional_2_0= ruleConditional ) ) | ( ( (lv_variable_3_0= ruleVariableD ) ) otherlv_4= ';' ) ) )
            // InternalGrammar.g:1213:2: ( ( (lv_row_0_0= ruleRow ) ) | ( (lv_loop_1_0= ruleLoop ) ) | ( (lv_conditional_2_0= ruleConditional ) ) | ( ( (lv_variable_3_0= ruleVariableD ) ) otherlv_4= ';' ) )
            {
            // InternalGrammar.g:1213:2: ( ( (lv_row_0_0= ruleRow ) ) | ( (lv_loop_1_0= ruleLoop ) ) | ( (lv_conditional_2_0= ruleConditional ) ) | ( ( (lv_variable_3_0= ruleVariableD ) ) otherlv_4= ';' ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt18=1;
                }
                break;
            case 21:
            case 50:
                {
                alt18=2;
                }
                break;
            case 43:
                {
                alt18=3;
                }
                break;
            case RULE_ID:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalGrammar.g:1214:3: ( (lv_row_0_0= ruleRow ) )
                    {
                    // InternalGrammar.g:1214:3: ( (lv_row_0_0= ruleRow ) )
                    // InternalGrammar.g:1215:4: (lv_row_0_0= ruleRow )
                    {
                    // InternalGrammar.g:1215:4: (lv_row_0_0= ruleRow )
                    // InternalGrammar.g:1216:5: lv_row_0_0= ruleRow
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
                    // InternalGrammar.g:1234:3: ( (lv_loop_1_0= ruleLoop ) )
                    {
                    // InternalGrammar.g:1234:3: ( (lv_loop_1_0= ruleLoop ) )
                    // InternalGrammar.g:1235:4: (lv_loop_1_0= ruleLoop )
                    {
                    // InternalGrammar.g:1235:4: (lv_loop_1_0= ruleLoop )
                    // InternalGrammar.g:1236:5: lv_loop_1_0= ruleLoop
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
                    // InternalGrammar.g:1254:3: ( (lv_conditional_2_0= ruleConditional ) )
                    {
                    // InternalGrammar.g:1254:3: ( (lv_conditional_2_0= ruleConditional ) )
                    // InternalGrammar.g:1255:4: (lv_conditional_2_0= ruleConditional )
                    {
                    // InternalGrammar.g:1255:4: (lv_conditional_2_0= ruleConditional )
                    // InternalGrammar.g:1256:5: lv_conditional_2_0= ruleConditional
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
                    // InternalGrammar.g:1274:3: ( ( (lv_variable_3_0= ruleVariableD ) ) otherlv_4= ';' )
                    {
                    // InternalGrammar.g:1274:3: ( ( (lv_variable_3_0= ruleVariableD ) ) otherlv_4= ';' )
                    // InternalGrammar.g:1275:4: ( (lv_variable_3_0= ruleVariableD ) ) otherlv_4= ';'
                    {
                    // InternalGrammar.g:1275:4: ( (lv_variable_3_0= ruleVariableD ) )
                    // InternalGrammar.g:1276:5: (lv_variable_3_0= ruleVariableD )
                    {
                    // InternalGrammar.g:1276:5: (lv_variable_3_0= ruleVariableD )
                    // InternalGrammar.g:1277:6: lv_variable_3_0= ruleVariableD
                    {

                    						newCompositeNode(grammarAccess.getElementPageAccess().getVariableVariableDParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_25);
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


    // $ANTLR start "entryRuleTitle"
    // InternalGrammar.g:1303:1: entryRuleTitle returns [EObject current=null] : iv_ruleTitle= ruleTitle EOF ;
    public final EObject entryRuleTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitle = null;


        try {
            // InternalGrammar.g:1303:46: (iv_ruleTitle= ruleTitle EOF )
            // InternalGrammar.g:1304:2: iv_ruleTitle= ruleTitle EOF
            {
             newCompositeNode(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTitle=ruleTitle();

            state._fsp--;

             current =iv_ruleTitle; 
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
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // InternalGrammar.g:1310:1: ruleTitle returns [EObject current=null] : ( ( (lv_bigTitle_0_0= ruleBigTitle ) ) | ( (lv_subTitle_1_0= ruleSubTitle ) ) | ( (lv_subSubTitle_2_0= ruleSubSubTitle ) ) ) ;
    public final EObject ruleTitle() throws RecognitionException {
        EObject current = null;

        EObject lv_bigTitle_0_0 = null;

        EObject lv_subTitle_1_0 = null;

        EObject lv_subSubTitle_2_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:1316:2: ( ( ( (lv_bigTitle_0_0= ruleBigTitle ) ) | ( (lv_subTitle_1_0= ruleSubTitle ) ) | ( (lv_subSubTitle_2_0= ruleSubSubTitle ) ) ) )
            // InternalGrammar.g:1317:2: ( ( (lv_bigTitle_0_0= ruleBigTitle ) ) | ( (lv_subTitle_1_0= ruleSubTitle ) ) | ( (lv_subSubTitle_2_0= ruleSubSubTitle ) ) )
            {
            // InternalGrammar.g:1317:2: ( ( (lv_bigTitle_0_0= ruleBigTitle ) ) | ( (lv_subTitle_1_0= ruleSubTitle ) ) | ( (lv_subSubTitle_2_0= ruleSubSubTitle ) ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt19=1;
                }
                break;
            case 27:
                {
                alt19=2;
                }
                break;
            case 28:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalGrammar.g:1318:3: ( (lv_bigTitle_0_0= ruleBigTitle ) )
                    {
                    // InternalGrammar.g:1318:3: ( (lv_bigTitle_0_0= ruleBigTitle ) )
                    // InternalGrammar.g:1319:4: (lv_bigTitle_0_0= ruleBigTitle )
                    {
                    // InternalGrammar.g:1319:4: (lv_bigTitle_0_0= ruleBigTitle )
                    // InternalGrammar.g:1320:5: lv_bigTitle_0_0= ruleBigTitle
                    {

                    					newCompositeNode(grammarAccess.getTitleAccess().getBigTitleBigTitleParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_bigTitle_0_0=ruleBigTitle();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTitleRule());
                    					}
                    					set(
                    						current,
                    						"bigTitle",
                    						lv_bigTitle_0_0,
                    						"org.xtext.example.Grammar.BigTitle");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGrammar.g:1338:3: ( (lv_subTitle_1_0= ruleSubTitle ) )
                    {
                    // InternalGrammar.g:1338:3: ( (lv_subTitle_1_0= ruleSubTitle ) )
                    // InternalGrammar.g:1339:4: (lv_subTitle_1_0= ruleSubTitle )
                    {
                    // InternalGrammar.g:1339:4: (lv_subTitle_1_0= ruleSubTitle )
                    // InternalGrammar.g:1340:5: lv_subTitle_1_0= ruleSubTitle
                    {

                    					newCompositeNode(grammarAccess.getTitleAccess().getSubTitleSubTitleParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_subTitle_1_0=ruleSubTitle();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTitleRule());
                    					}
                    					set(
                    						current,
                    						"subTitle",
                    						lv_subTitle_1_0,
                    						"org.xtext.example.Grammar.SubTitle");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGrammar.g:1358:3: ( (lv_subSubTitle_2_0= ruleSubSubTitle ) )
                    {
                    // InternalGrammar.g:1358:3: ( (lv_subSubTitle_2_0= ruleSubSubTitle ) )
                    // InternalGrammar.g:1359:4: (lv_subSubTitle_2_0= ruleSubSubTitle )
                    {
                    // InternalGrammar.g:1359:4: (lv_subSubTitle_2_0= ruleSubSubTitle )
                    // InternalGrammar.g:1360:5: lv_subSubTitle_2_0= ruleSubSubTitle
                    {

                    					newCompositeNode(grammarAccess.getTitleAccess().getSubSubTitleSubSubTitleParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_subSubTitle_2_0=ruleSubSubTitle();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTitleRule());
                    					}
                    					set(
                    						current,
                    						"subSubTitle",
                    						lv_subSubTitle_2_0,
                    						"org.xtext.example.Grammar.SubSubTitle");
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
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleBigTitle"
    // InternalGrammar.g:1381:1: entryRuleBigTitle returns [EObject current=null] : iv_ruleBigTitle= ruleBigTitle EOF ;
    public final EObject entryRuleBigTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBigTitle = null;


        try {
            // InternalGrammar.g:1381:49: (iv_ruleBigTitle= ruleBigTitle EOF )
            // InternalGrammar.g:1382:2: iv_ruleBigTitle= ruleBigTitle EOF
            {
             newCompositeNode(grammarAccess.getBigTitleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBigTitle=ruleBigTitle();

            state._fsp--;

             current =iv_ruleBigTitle; 
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
    // $ANTLR end "entryRuleBigTitle"


    // $ANTLR start "ruleBigTitle"
    // InternalGrammar.g:1388:1: ruleBigTitle returns [EObject current=null] : (otherlv_0= 'title' otherlv_1= ':' ( ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? ) | ( (lv_string_5_0= RULE_STRING ) ) ) ( (lv_classD_6_0= ruleClassD ) ) ) ;
    public final EObject ruleBigTitle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_string_5_0=null;
        EObject lv_variable_2_0 = null;

        EObject lv_objectC_3_0 = null;

        EObject lv_arrayC_4_0 = null;

        EObject lv_classD_6_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:1394:2: ( (otherlv_0= 'title' otherlv_1= ':' ( ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? ) | ( (lv_string_5_0= RULE_STRING ) ) ) ( (lv_classD_6_0= ruleClassD ) ) ) )
            // InternalGrammar.g:1395:2: (otherlv_0= 'title' otherlv_1= ':' ( ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? ) | ( (lv_string_5_0= RULE_STRING ) ) ) ( (lv_classD_6_0= ruleClassD ) ) )
            {
            // InternalGrammar.g:1395:2: (otherlv_0= 'title' otherlv_1= ':' ( ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? ) | ( (lv_string_5_0= RULE_STRING ) ) ) ( (lv_classD_6_0= ruleClassD ) ) )
            // InternalGrammar.g:1396:3: otherlv_0= 'title' otherlv_1= ':' ( ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? ) | ( (lv_string_5_0= RULE_STRING ) ) ) ( (lv_classD_6_0= ruleClassD ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getBigTitleAccess().getTitleKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getBigTitleAccess().getColonKeyword_1());
            		
            // InternalGrammar.g:1404:3: ( ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? ) | ( (lv_string_5_0= RULE_STRING ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==21) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_STRING) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalGrammar.g:1405:4: ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? )
                    {
                    // InternalGrammar.g:1405:4: ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? )
                    // InternalGrammar.g:1406:5: ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )?
                    {
                    // InternalGrammar.g:1406:5: ( (lv_variable_2_0= ruleVariable ) )
                    // InternalGrammar.g:1407:6: (lv_variable_2_0= ruleVariable )
                    {
                    // InternalGrammar.g:1407:6: (lv_variable_2_0= ruleVariable )
                    // InternalGrammar.g:1408:7: lv_variable_2_0= ruleVariable
                    {

                    							newCompositeNode(grammarAccess.getBigTitleAccess().getVariableVariableParserRuleCall_2_0_0_0());
                    						
                    pushFollow(FOLLOW_26);
                    lv_variable_2_0=ruleVariable();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getBigTitleRule());
                    							}
                    							set(
                    								current,
                    								"variable",
                    								lv_variable_2_0,
                    								"org.xtext.example.Grammar.Variable");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalGrammar.g:1425:5: ( (lv_objectC_3_0= ruleObjectC ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==31) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalGrammar.g:1426:6: (lv_objectC_3_0= ruleObjectC )
                            {
                            // InternalGrammar.g:1426:6: (lv_objectC_3_0= ruleObjectC )
                            // InternalGrammar.g:1427:7: lv_objectC_3_0= ruleObjectC
                            {

                            							newCompositeNode(grammarAccess.getBigTitleAccess().getObjectCObjectCParserRuleCall_2_0_1_0());
                            						
                            pushFollow(FOLLOW_27);
                            lv_objectC_3_0=ruleObjectC();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getBigTitleRule());
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

                    // InternalGrammar.g:1444:5: ( (lv_arrayC_4_0= ruleArrayC ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==16) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalGrammar.g:1445:6: (lv_arrayC_4_0= ruleArrayC )
                            {
                            // InternalGrammar.g:1445:6: (lv_arrayC_4_0= ruleArrayC )
                            // InternalGrammar.g:1446:7: lv_arrayC_4_0= ruleArrayC
                            {

                            							newCompositeNode(grammarAccess.getBigTitleAccess().getArrayCArrayCParserRuleCall_2_0_2_0());
                            						
                            pushFollow(FOLLOW_28);
                            lv_arrayC_4_0=ruleArrayC();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getBigTitleRule());
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
                    // InternalGrammar.g:1465:4: ( (lv_string_5_0= RULE_STRING ) )
                    {
                    // InternalGrammar.g:1465:4: ( (lv_string_5_0= RULE_STRING ) )
                    // InternalGrammar.g:1466:5: (lv_string_5_0= RULE_STRING )
                    {
                    // InternalGrammar.g:1466:5: (lv_string_5_0= RULE_STRING )
                    // InternalGrammar.g:1467:6: lv_string_5_0= RULE_STRING
                    {
                    lv_string_5_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

                    						newLeafNode(lv_string_5_0, grammarAccess.getBigTitleAccess().getStringSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBigTitleRule());
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

            // InternalGrammar.g:1484:3: ( (lv_classD_6_0= ruleClassD ) )
            // InternalGrammar.g:1485:4: (lv_classD_6_0= ruleClassD )
            {
            // InternalGrammar.g:1485:4: (lv_classD_6_0= ruleClassD )
            // InternalGrammar.g:1486:5: lv_classD_6_0= ruleClassD
            {

            					newCompositeNode(grammarAccess.getBigTitleAccess().getClassDClassDParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_classD_6_0=ruleClassD();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBigTitleRule());
            					}
            					set(
            						current,
            						"classD",
            						lv_classD_6_0,
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
    // $ANTLR end "ruleBigTitle"


    // $ANTLR start "entryRuleSubTitle"
    // InternalGrammar.g:1507:1: entryRuleSubTitle returns [EObject current=null] : iv_ruleSubTitle= ruleSubTitle EOF ;
    public final EObject entryRuleSubTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubTitle = null;


        try {
            // InternalGrammar.g:1507:49: (iv_ruleSubTitle= ruleSubTitle EOF )
            // InternalGrammar.g:1508:2: iv_ruleSubTitle= ruleSubTitle EOF
            {
             newCompositeNode(grammarAccess.getSubTitleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubTitle=ruleSubTitle();

            state._fsp--;

             current =iv_ruleSubTitle; 
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
    // $ANTLR end "entryRuleSubTitle"


    // $ANTLR start "ruleSubTitle"
    // InternalGrammar.g:1514:1: ruleSubTitle returns [EObject current=null] : (otherlv_0= 'subtitle' otherlv_1= ':' ( ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? ) | ( (lv_string_5_0= RULE_STRING ) ) ) ( (lv_classD_6_0= ruleClassD ) ) ) ;
    public final EObject ruleSubTitle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_string_5_0=null;
        EObject lv_variable_2_0 = null;

        EObject lv_objectC_3_0 = null;

        EObject lv_arrayC_4_0 = null;

        EObject lv_classD_6_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:1520:2: ( (otherlv_0= 'subtitle' otherlv_1= ':' ( ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? ) | ( (lv_string_5_0= RULE_STRING ) ) ) ( (lv_classD_6_0= ruleClassD ) ) ) )
            // InternalGrammar.g:1521:2: (otherlv_0= 'subtitle' otherlv_1= ':' ( ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? ) | ( (lv_string_5_0= RULE_STRING ) ) ) ( (lv_classD_6_0= ruleClassD ) ) )
            {
            // InternalGrammar.g:1521:2: (otherlv_0= 'subtitle' otherlv_1= ':' ( ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? ) | ( (lv_string_5_0= RULE_STRING ) ) ) ( (lv_classD_6_0= ruleClassD ) ) )
            // InternalGrammar.g:1522:3: otherlv_0= 'subtitle' otherlv_1= ':' ( ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? ) | ( (lv_string_5_0= RULE_STRING ) ) ) ( (lv_classD_6_0= ruleClassD ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getSubTitleAccess().getSubtitleKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getSubTitleAccess().getColonKeyword_1());
            		
            // InternalGrammar.g:1530:3: ( ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? ) | ( (lv_string_5_0= RULE_STRING ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==21) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_STRING) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalGrammar.g:1531:4: ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? )
                    {
                    // InternalGrammar.g:1531:4: ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? )
                    // InternalGrammar.g:1532:5: ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )?
                    {
                    // InternalGrammar.g:1532:5: ( (lv_variable_2_0= ruleVariable ) )
                    // InternalGrammar.g:1533:6: (lv_variable_2_0= ruleVariable )
                    {
                    // InternalGrammar.g:1533:6: (lv_variable_2_0= ruleVariable )
                    // InternalGrammar.g:1534:7: lv_variable_2_0= ruleVariable
                    {

                    							newCompositeNode(grammarAccess.getSubTitleAccess().getVariableVariableParserRuleCall_2_0_0_0());
                    						
                    pushFollow(FOLLOW_26);
                    lv_variable_2_0=ruleVariable();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSubTitleRule());
                    							}
                    							set(
                    								current,
                    								"variable",
                    								lv_variable_2_0,
                    								"org.xtext.example.Grammar.Variable");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalGrammar.g:1551:5: ( (lv_objectC_3_0= ruleObjectC ) )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==31) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalGrammar.g:1552:6: (lv_objectC_3_0= ruleObjectC )
                            {
                            // InternalGrammar.g:1552:6: (lv_objectC_3_0= ruleObjectC )
                            // InternalGrammar.g:1553:7: lv_objectC_3_0= ruleObjectC
                            {

                            							newCompositeNode(grammarAccess.getSubTitleAccess().getObjectCObjectCParserRuleCall_2_0_1_0());
                            						
                            pushFollow(FOLLOW_27);
                            lv_objectC_3_0=ruleObjectC();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getSubTitleRule());
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

                    // InternalGrammar.g:1570:5: ( (lv_arrayC_4_0= ruleArrayC ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==16) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalGrammar.g:1571:6: (lv_arrayC_4_0= ruleArrayC )
                            {
                            // InternalGrammar.g:1571:6: (lv_arrayC_4_0= ruleArrayC )
                            // InternalGrammar.g:1572:7: lv_arrayC_4_0= ruleArrayC
                            {

                            							newCompositeNode(grammarAccess.getSubTitleAccess().getArrayCArrayCParserRuleCall_2_0_2_0());
                            						
                            pushFollow(FOLLOW_28);
                            lv_arrayC_4_0=ruleArrayC();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getSubTitleRule());
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
                    // InternalGrammar.g:1591:4: ( (lv_string_5_0= RULE_STRING ) )
                    {
                    // InternalGrammar.g:1591:4: ( (lv_string_5_0= RULE_STRING ) )
                    // InternalGrammar.g:1592:5: (lv_string_5_0= RULE_STRING )
                    {
                    // InternalGrammar.g:1592:5: (lv_string_5_0= RULE_STRING )
                    // InternalGrammar.g:1593:6: lv_string_5_0= RULE_STRING
                    {
                    lv_string_5_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

                    						newLeafNode(lv_string_5_0, grammarAccess.getSubTitleAccess().getStringSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSubTitleRule());
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

            // InternalGrammar.g:1610:3: ( (lv_classD_6_0= ruleClassD ) )
            // InternalGrammar.g:1611:4: (lv_classD_6_0= ruleClassD )
            {
            // InternalGrammar.g:1611:4: (lv_classD_6_0= ruleClassD )
            // InternalGrammar.g:1612:5: lv_classD_6_0= ruleClassD
            {

            					newCompositeNode(grammarAccess.getSubTitleAccess().getClassDClassDParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_classD_6_0=ruleClassD();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubTitleRule());
            					}
            					set(
            						current,
            						"classD",
            						lv_classD_6_0,
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
    // $ANTLR end "ruleSubTitle"


    // $ANTLR start "entryRuleSubSubTitle"
    // InternalGrammar.g:1633:1: entryRuleSubSubTitle returns [EObject current=null] : iv_ruleSubSubTitle= ruleSubSubTitle EOF ;
    public final EObject entryRuleSubSubTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubSubTitle = null;


        try {
            // InternalGrammar.g:1633:52: (iv_ruleSubSubTitle= ruleSubSubTitle EOF )
            // InternalGrammar.g:1634:2: iv_ruleSubSubTitle= ruleSubSubTitle EOF
            {
             newCompositeNode(grammarAccess.getSubSubTitleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubSubTitle=ruleSubSubTitle();

            state._fsp--;

             current =iv_ruleSubSubTitle; 
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
    // $ANTLR end "entryRuleSubSubTitle"


    // $ANTLR start "ruleSubSubTitle"
    // InternalGrammar.g:1640:1: ruleSubSubTitle returns [EObject current=null] : (otherlv_0= 'subsubtitle' otherlv_1= ':' ( ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? ) | ( (lv_string_5_0= RULE_STRING ) ) ) ( (lv_classD_6_0= ruleClassD ) ) ) ;
    public final EObject ruleSubSubTitle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_string_5_0=null;
        EObject lv_variable_2_0 = null;

        EObject lv_objectC_3_0 = null;

        EObject lv_arrayC_4_0 = null;

        EObject lv_classD_6_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:1646:2: ( (otherlv_0= 'subsubtitle' otherlv_1= ':' ( ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? ) | ( (lv_string_5_0= RULE_STRING ) ) ) ( (lv_classD_6_0= ruleClassD ) ) ) )
            // InternalGrammar.g:1647:2: (otherlv_0= 'subsubtitle' otherlv_1= ':' ( ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? ) | ( (lv_string_5_0= RULE_STRING ) ) ) ( (lv_classD_6_0= ruleClassD ) ) )
            {
            // InternalGrammar.g:1647:2: (otherlv_0= 'subsubtitle' otherlv_1= ':' ( ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? ) | ( (lv_string_5_0= RULE_STRING ) ) ) ( (lv_classD_6_0= ruleClassD ) ) )
            // InternalGrammar.g:1648:3: otherlv_0= 'subsubtitle' otherlv_1= ':' ( ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? ) | ( (lv_string_5_0= RULE_STRING ) ) ) ( (lv_classD_6_0= ruleClassD ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getSubSubTitleAccess().getSubsubtitleKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getSubSubTitleAccess().getColonKeyword_1());
            		
            // InternalGrammar.g:1656:3: ( ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? ) | ( (lv_string_5_0= RULE_STRING ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==21) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_STRING) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalGrammar.g:1657:4: ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? )
                    {
                    // InternalGrammar.g:1657:4: ( ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )? )
                    // InternalGrammar.g:1658:5: ( (lv_variable_2_0= ruleVariable ) ) ( (lv_objectC_3_0= ruleObjectC ) )? ( (lv_arrayC_4_0= ruleArrayC ) )?
                    {
                    // InternalGrammar.g:1658:5: ( (lv_variable_2_0= ruleVariable ) )
                    // InternalGrammar.g:1659:6: (lv_variable_2_0= ruleVariable )
                    {
                    // InternalGrammar.g:1659:6: (lv_variable_2_0= ruleVariable )
                    // InternalGrammar.g:1660:7: lv_variable_2_0= ruleVariable
                    {

                    							newCompositeNode(grammarAccess.getSubSubTitleAccess().getVariableVariableParserRuleCall_2_0_0_0());
                    						
                    pushFollow(FOLLOW_26);
                    lv_variable_2_0=ruleVariable();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSubSubTitleRule());
                    							}
                    							set(
                    								current,
                    								"variable",
                    								lv_variable_2_0,
                    								"org.xtext.example.Grammar.Variable");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalGrammar.g:1677:5: ( (lv_objectC_3_0= ruleObjectC ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==31) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalGrammar.g:1678:6: (lv_objectC_3_0= ruleObjectC )
                            {
                            // InternalGrammar.g:1678:6: (lv_objectC_3_0= ruleObjectC )
                            // InternalGrammar.g:1679:7: lv_objectC_3_0= ruleObjectC
                            {

                            							newCompositeNode(grammarAccess.getSubSubTitleAccess().getObjectCObjectCParserRuleCall_2_0_1_0());
                            						
                            pushFollow(FOLLOW_27);
                            lv_objectC_3_0=ruleObjectC();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getSubSubTitleRule());
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

                    // InternalGrammar.g:1696:5: ( (lv_arrayC_4_0= ruleArrayC ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==16) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalGrammar.g:1697:6: (lv_arrayC_4_0= ruleArrayC )
                            {
                            // InternalGrammar.g:1697:6: (lv_arrayC_4_0= ruleArrayC )
                            // InternalGrammar.g:1698:7: lv_arrayC_4_0= ruleArrayC
                            {

                            							newCompositeNode(grammarAccess.getSubSubTitleAccess().getArrayCArrayCParserRuleCall_2_0_2_0());
                            						
                            pushFollow(FOLLOW_28);
                            lv_arrayC_4_0=ruleArrayC();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getSubSubTitleRule());
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
                    // InternalGrammar.g:1717:4: ( (lv_string_5_0= RULE_STRING ) )
                    {
                    // InternalGrammar.g:1717:4: ( (lv_string_5_0= RULE_STRING ) )
                    // InternalGrammar.g:1718:5: (lv_string_5_0= RULE_STRING )
                    {
                    // InternalGrammar.g:1718:5: (lv_string_5_0= RULE_STRING )
                    // InternalGrammar.g:1719:6: lv_string_5_0= RULE_STRING
                    {
                    lv_string_5_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

                    						newLeafNode(lv_string_5_0, grammarAccess.getSubSubTitleAccess().getStringSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSubSubTitleRule());
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

            // InternalGrammar.g:1736:3: ( (lv_classD_6_0= ruleClassD ) )
            // InternalGrammar.g:1737:4: (lv_classD_6_0= ruleClassD )
            {
            // InternalGrammar.g:1737:4: (lv_classD_6_0= ruleClassD )
            // InternalGrammar.g:1738:5: lv_classD_6_0= ruleClassD
            {

            					newCompositeNode(grammarAccess.getSubSubTitleAccess().getClassDClassDParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_classD_6_0=ruleClassD();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubSubTitleRule());
            					}
            					set(
            						current,
            						"classD",
            						lv_classD_6_0,
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
    // $ANTLR end "ruleSubSubTitle"


    // $ANTLR start "entryRuleRow"
    // InternalGrammar.g:1759:1: entryRuleRow returns [EObject current=null] : iv_ruleRow= ruleRow EOF ;
    public final EObject entryRuleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRow = null;


        try {
            // InternalGrammar.g:1759:44: (iv_ruleRow= ruleRow EOF )
            // InternalGrammar.g:1760:2: iv_ruleRow= ruleRow EOF
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
    // InternalGrammar.g:1766:1: ruleRow returns [EObject current=null] : (otherlv_0= 'row' otherlv_1= '{' ( (lv_elementRow_2_0= ruleElementRow ) )* otherlv_3= '}' ) ;
    public final EObject ruleRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elementRow_2_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:1772:2: ( (otherlv_0= 'row' otherlv_1= '{' ( (lv_elementRow_2_0= ruleElementRow ) )* otherlv_3= '}' ) )
            // InternalGrammar.g:1773:2: (otherlv_0= 'row' otherlv_1= '{' ( (lv_elementRow_2_0= ruleElementRow ) )* otherlv_3= '}' )
            {
            // InternalGrammar.g:1773:2: (otherlv_0= 'row' otherlv_1= '{' ( (lv_elementRow_2_0= ruleElementRow ) )* otherlv_3= '}' )
            // InternalGrammar.g:1774:3: otherlv_0= 'row' otherlv_1= '{' ( (lv_elementRow_2_0= ruleElementRow ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRowAccess().getRowKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getRowAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGrammar.g:1782:3: ( (lv_elementRow_2_0= ruleElementRow ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID||LA29_0==21||LA29_0==30||LA29_0==43||LA29_0==50) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalGrammar.g:1783:4: (lv_elementRow_2_0= ruleElementRow )
            	    {
            	    // InternalGrammar.g:1783:4: (lv_elementRow_2_0= ruleElementRow )
            	    // InternalGrammar.g:1784:5: lv_elementRow_2_0= ruleElementRow
            	    {

            	    					newCompositeNode(grammarAccess.getRowAccess().getElementRowElementRowParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_29);
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
            	    break loop29;
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
    // InternalGrammar.g:1809:1: entryRuleElementRow returns [EObject current=null] : iv_ruleElementRow= ruleElementRow EOF ;
    public final EObject entryRuleElementRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementRow = null;


        try {
            // InternalGrammar.g:1809:51: (iv_ruleElementRow= ruleElementRow EOF )
            // InternalGrammar.g:1810:2: iv_ruleElementRow= ruleElementRow EOF
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
    // InternalGrammar.g:1816:1: ruleElementRow returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariable ) ) | ( (lv_variableD_1_0= ruleVariableD ) ) | ( (lv_col_2_0= ruleCol ) ) | ( (lv_conditional_3_0= ruleConditional ) ) | ( (lv_loop_4_0= ruleLoop ) ) ) ;
    public final EObject ruleElementRow() throws RecognitionException {
        EObject current = null;

        EObject lv_variable_0_0 = null;

        EObject lv_variableD_1_0 = null;

        EObject lv_col_2_0 = null;

        EObject lv_conditional_3_0 = null;

        EObject lv_loop_4_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:1822:2: ( ( ( (lv_variable_0_0= ruleVariable ) ) | ( (lv_variableD_1_0= ruleVariableD ) ) | ( (lv_col_2_0= ruleCol ) ) | ( (lv_conditional_3_0= ruleConditional ) ) | ( (lv_loop_4_0= ruleLoop ) ) ) )
            // InternalGrammar.g:1823:2: ( ( (lv_variable_0_0= ruleVariable ) ) | ( (lv_variableD_1_0= ruleVariableD ) ) | ( (lv_col_2_0= ruleCol ) ) | ( (lv_conditional_3_0= ruleConditional ) ) | ( (lv_loop_4_0= ruleLoop ) ) )
            {
            // InternalGrammar.g:1823:2: ( ( (lv_variable_0_0= ruleVariable ) ) | ( (lv_variableD_1_0= ruleVariableD ) ) | ( (lv_col_2_0= ruleCol ) ) | ( (lv_conditional_3_0= ruleConditional ) ) | ( (lv_loop_4_0= ruleLoop ) ) )
            int alt30=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==RULE_ID) ) {
                    int LA30_6 = input.LA(3);

                    if ( (LA30_6==EOF||LA30_6==RULE_ID||LA30_6==14||LA30_6==21||LA30_6==30||LA30_6==43||LA30_6==50) ) {
                        alt30=1;
                    }
                    else if ( (LA30_6==52) ) {
                        alt30=5;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt30=2;
                }
                break;
            case 30:
                {
                alt30=3;
                }
                break;
            case 43:
                {
                alt30=4;
                }
                break;
            case 50:
                {
                alt30=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalGrammar.g:1824:3: ( (lv_variable_0_0= ruleVariable ) )
                    {
                    // InternalGrammar.g:1824:3: ( (lv_variable_0_0= ruleVariable ) )
                    // InternalGrammar.g:1825:4: (lv_variable_0_0= ruleVariable )
                    {
                    // InternalGrammar.g:1825:4: (lv_variable_0_0= ruleVariable )
                    // InternalGrammar.g:1826:5: lv_variable_0_0= ruleVariable
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
                    // InternalGrammar.g:1844:3: ( (lv_variableD_1_0= ruleVariableD ) )
                    {
                    // InternalGrammar.g:1844:3: ( (lv_variableD_1_0= ruleVariableD ) )
                    // InternalGrammar.g:1845:4: (lv_variableD_1_0= ruleVariableD )
                    {
                    // InternalGrammar.g:1845:4: (lv_variableD_1_0= ruleVariableD )
                    // InternalGrammar.g:1846:5: lv_variableD_1_0= ruleVariableD
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
                    // InternalGrammar.g:1864:3: ( (lv_col_2_0= ruleCol ) )
                    {
                    // InternalGrammar.g:1864:3: ( (lv_col_2_0= ruleCol ) )
                    // InternalGrammar.g:1865:4: (lv_col_2_0= ruleCol )
                    {
                    // InternalGrammar.g:1865:4: (lv_col_2_0= ruleCol )
                    // InternalGrammar.g:1866:5: lv_col_2_0= ruleCol
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
                    // InternalGrammar.g:1884:3: ( (lv_conditional_3_0= ruleConditional ) )
                    {
                    // InternalGrammar.g:1884:3: ( (lv_conditional_3_0= ruleConditional ) )
                    // InternalGrammar.g:1885:4: (lv_conditional_3_0= ruleConditional )
                    {
                    // InternalGrammar.g:1885:4: (lv_conditional_3_0= ruleConditional )
                    // InternalGrammar.g:1886:5: lv_conditional_3_0= ruleConditional
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
                    // InternalGrammar.g:1904:3: ( (lv_loop_4_0= ruleLoop ) )
                    {
                    // InternalGrammar.g:1904:3: ( (lv_loop_4_0= ruleLoop ) )
                    // InternalGrammar.g:1905:4: (lv_loop_4_0= ruleLoop )
                    {
                    // InternalGrammar.g:1905:4: (lv_loop_4_0= ruleLoop )
                    // InternalGrammar.g:1906:5: lv_loop_4_0= ruleLoop
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
    // InternalGrammar.g:1927:1: entryRuleCol returns [EObject current=null] : iv_ruleCol= ruleCol EOF ;
    public final EObject entryRuleCol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCol = null;


        try {
            // InternalGrammar.g:1927:44: (iv_ruleCol= ruleCol EOF )
            // InternalGrammar.g:1928:2: iv_ruleCol= ruleCol EOF
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
    // InternalGrammar.g:1934:1: ruleCol returns [EObject current=null] : (otherlv_0= 'col' ( (lv_fusion_1_0= ruleFusion ) ) ( ( (lv_img_2_0= ruleImg ) ) | ( ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )? ) | ( (lv_variableD_6_0= ruleVariableD ) ) | ( (lv_string_7_0= RULE_STRING ) ) | ( (lv_integer_8_0= RULE_INT ) ) | ( (lv_floatValue_9_0= ruleFloat ) ) | ( (lv_function_10_0= ruleFunction ) ) ) ( (lv_classD_11_0= ruleClassD ) ) ) ;
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
            // InternalGrammar.g:1940:2: ( (otherlv_0= 'col' ( (lv_fusion_1_0= ruleFusion ) ) ( ( (lv_img_2_0= ruleImg ) ) | ( ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )? ) | ( (lv_variableD_6_0= ruleVariableD ) ) | ( (lv_string_7_0= RULE_STRING ) ) | ( (lv_integer_8_0= RULE_INT ) ) | ( (lv_floatValue_9_0= ruleFloat ) ) | ( (lv_function_10_0= ruleFunction ) ) ) ( (lv_classD_11_0= ruleClassD ) ) ) )
            // InternalGrammar.g:1941:2: (otherlv_0= 'col' ( (lv_fusion_1_0= ruleFusion ) ) ( ( (lv_img_2_0= ruleImg ) ) | ( ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )? ) | ( (lv_variableD_6_0= ruleVariableD ) ) | ( (lv_string_7_0= RULE_STRING ) ) | ( (lv_integer_8_0= RULE_INT ) ) | ( (lv_floatValue_9_0= ruleFloat ) ) | ( (lv_function_10_0= ruleFunction ) ) ) ( (lv_classD_11_0= ruleClassD ) ) )
            {
            // InternalGrammar.g:1941:2: (otherlv_0= 'col' ( (lv_fusion_1_0= ruleFusion ) ) ( ( (lv_img_2_0= ruleImg ) ) | ( ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )? ) | ( (lv_variableD_6_0= ruleVariableD ) ) | ( (lv_string_7_0= RULE_STRING ) ) | ( (lv_integer_8_0= RULE_INT ) ) | ( (lv_floatValue_9_0= ruleFloat ) ) | ( (lv_function_10_0= ruleFunction ) ) ) ( (lv_classD_11_0= ruleClassD ) ) )
            // InternalGrammar.g:1942:3: otherlv_0= 'col' ( (lv_fusion_1_0= ruleFusion ) ) ( ( (lv_img_2_0= ruleImg ) ) | ( ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )? ) | ( (lv_variableD_6_0= ruleVariableD ) ) | ( (lv_string_7_0= RULE_STRING ) ) | ( (lv_integer_8_0= RULE_INT ) ) | ( (lv_floatValue_9_0= ruleFloat ) ) | ( (lv_function_10_0= ruleFunction ) ) ) ( (lv_classD_11_0= ruleClassD ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getColAccess().getColKeyword_0());
            		
            // InternalGrammar.g:1946:3: ( (lv_fusion_1_0= ruleFusion ) )
            // InternalGrammar.g:1947:4: (lv_fusion_1_0= ruleFusion )
            {
            // InternalGrammar.g:1947:4: (lv_fusion_1_0= ruleFusion )
            // InternalGrammar.g:1948:5: lv_fusion_1_0= ruleFusion
            {

            					newCompositeNode(grammarAccess.getColAccess().getFusionFusionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
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

            // InternalGrammar.g:1965:3: ( ( (lv_img_2_0= ruleImg ) ) | ( ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )? ) | ( (lv_variableD_6_0= ruleVariableD ) ) | ( (lv_string_7_0= RULE_STRING ) ) | ( (lv_integer_8_0= RULE_INT ) ) | ( (lv_floatValue_9_0= ruleFloat ) ) | ( (lv_function_10_0= ruleFunction ) ) )
            int alt33=7;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt33=1;
                }
                break;
            case 21:
                {
                alt33=2;
                }
                break;
            case RULE_ID:
                {
                alt33=3;
                }
                break;
            case RULE_STRING:
                {
                alt33=4;
                }
                break;
            case RULE_INT:
                {
                int LA33_5 = input.LA(2);

                if ( (LA33_5==EOF||LA33_5==RULE_ID||LA33_5==14||(LA33_5>=21 && LA33_5<=22)||(LA33_5>=29 && LA33_5<=30)||LA33_5==35||LA33_5==43||LA33_5==50) ) {
                    alt33=5;
                }
                else if ( (LA33_5==31) ) {
                    alt33=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 5, input);

                    throw nvae;
                }
                }
                break;
            case 38:
            case 39:
            case 40:
                {
                alt33=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalGrammar.g:1966:4: ( (lv_img_2_0= ruleImg ) )
                    {
                    // InternalGrammar.g:1966:4: ( (lv_img_2_0= ruleImg ) )
                    // InternalGrammar.g:1967:5: (lv_img_2_0= ruleImg )
                    {
                    // InternalGrammar.g:1967:5: (lv_img_2_0= ruleImg )
                    // InternalGrammar.g:1968:6: lv_img_2_0= ruleImg
                    {

                    						newCompositeNode(grammarAccess.getColAccess().getImgImgParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_28);
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
                    // InternalGrammar.g:1986:4: ( ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )? )
                    {
                    // InternalGrammar.g:1986:4: ( ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )? )
                    // InternalGrammar.g:1987:5: ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )?
                    {
                    // InternalGrammar.g:1987:5: ( (lv_variable_3_0= ruleVariable ) )
                    // InternalGrammar.g:1988:6: (lv_variable_3_0= ruleVariable )
                    {
                    // InternalGrammar.g:1988:6: (lv_variable_3_0= ruleVariable )
                    // InternalGrammar.g:1989:7: lv_variable_3_0= ruleVariable
                    {

                    							newCompositeNode(grammarAccess.getColAccess().getVariableVariableParserRuleCall_2_1_0_0());
                    						
                    pushFollow(FOLLOW_26);
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

                    // InternalGrammar.g:2006:5: ( (lv_objectC_4_0= ruleObjectC ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==31) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalGrammar.g:2007:6: (lv_objectC_4_0= ruleObjectC )
                            {
                            // InternalGrammar.g:2007:6: (lv_objectC_4_0= ruleObjectC )
                            // InternalGrammar.g:2008:7: lv_objectC_4_0= ruleObjectC
                            {

                            							newCompositeNode(grammarAccess.getColAccess().getObjectCObjectCParserRuleCall_2_1_1_0());
                            						
                            pushFollow(FOLLOW_27);
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

                    // InternalGrammar.g:2025:5: ( (lv_arrayC_5_0= ruleArrayC ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==16) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalGrammar.g:2026:6: (lv_arrayC_5_0= ruleArrayC )
                            {
                            // InternalGrammar.g:2026:6: (lv_arrayC_5_0= ruleArrayC )
                            // InternalGrammar.g:2027:7: lv_arrayC_5_0= ruleArrayC
                            {

                            							newCompositeNode(grammarAccess.getColAccess().getArrayCArrayCParserRuleCall_2_1_2_0());
                            						
                            pushFollow(FOLLOW_28);
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
                    // InternalGrammar.g:2046:4: ( (lv_variableD_6_0= ruleVariableD ) )
                    {
                    // InternalGrammar.g:2046:4: ( (lv_variableD_6_0= ruleVariableD ) )
                    // InternalGrammar.g:2047:5: (lv_variableD_6_0= ruleVariableD )
                    {
                    // InternalGrammar.g:2047:5: (lv_variableD_6_0= ruleVariableD )
                    // InternalGrammar.g:2048:6: lv_variableD_6_0= ruleVariableD
                    {

                    						newCompositeNode(grammarAccess.getColAccess().getVariableDVariableDParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_28);
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
                    // InternalGrammar.g:2066:4: ( (lv_string_7_0= RULE_STRING ) )
                    {
                    // InternalGrammar.g:2066:4: ( (lv_string_7_0= RULE_STRING ) )
                    // InternalGrammar.g:2067:5: (lv_string_7_0= RULE_STRING )
                    {
                    // InternalGrammar.g:2067:5: (lv_string_7_0= RULE_STRING )
                    // InternalGrammar.g:2068:6: lv_string_7_0= RULE_STRING
                    {
                    lv_string_7_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

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
                    // InternalGrammar.g:2085:4: ( (lv_integer_8_0= RULE_INT ) )
                    {
                    // InternalGrammar.g:2085:4: ( (lv_integer_8_0= RULE_INT ) )
                    // InternalGrammar.g:2086:5: (lv_integer_8_0= RULE_INT )
                    {
                    // InternalGrammar.g:2086:5: (lv_integer_8_0= RULE_INT )
                    // InternalGrammar.g:2087:6: lv_integer_8_0= RULE_INT
                    {
                    lv_integer_8_0=(Token)match(input,RULE_INT,FOLLOW_28); 

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
                    // InternalGrammar.g:2104:4: ( (lv_floatValue_9_0= ruleFloat ) )
                    {
                    // InternalGrammar.g:2104:4: ( (lv_floatValue_9_0= ruleFloat ) )
                    // InternalGrammar.g:2105:5: (lv_floatValue_9_0= ruleFloat )
                    {
                    // InternalGrammar.g:2105:5: (lv_floatValue_9_0= ruleFloat )
                    // InternalGrammar.g:2106:6: lv_floatValue_9_0= ruleFloat
                    {

                    						newCompositeNode(grammarAccess.getColAccess().getFloatValueFloatParserRuleCall_2_5_0());
                    					
                    pushFollow(FOLLOW_28);
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
                    // InternalGrammar.g:2124:4: ( (lv_function_10_0= ruleFunction ) )
                    {
                    // InternalGrammar.g:2124:4: ( (lv_function_10_0= ruleFunction ) )
                    // InternalGrammar.g:2125:5: (lv_function_10_0= ruleFunction )
                    {
                    // InternalGrammar.g:2125:5: (lv_function_10_0= ruleFunction )
                    // InternalGrammar.g:2126:6: lv_function_10_0= ruleFunction
                    {

                    						newCompositeNode(grammarAccess.getColAccess().getFunctionFunctionParserRuleCall_2_6_0());
                    					
                    pushFollow(FOLLOW_28);
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

            // InternalGrammar.g:2144:3: ( (lv_classD_11_0= ruleClassD ) )
            // InternalGrammar.g:2145:4: (lv_classD_11_0= ruleClassD )
            {
            // InternalGrammar.g:2145:4: (lv_classD_11_0= ruleClassD )
            // InternalGrammar.g:2146:5: lv_classD_11_0= ruleClassD
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
    // InternalGrammar.g:2167:1: entryRuleArrayC returns [EObject current=null] : iv_ruleArrayC= ruleArrayC EOF ;
    public final EObject entryRuleArrayC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayC = null;


        try {
            // InternalGrammar.g:2167:47: (iv_ruleArrayC= ruleArrayC EOF )
            // InternalGrammar.g:2168:2: iv_ruleArrayC= ruleArrayC EOF
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
    // InternalGrammar.g:2174:1: ruleArrayC returns [EObject current=null] : (otherlv_0= '[' ( (lv_position_1_0= rulePosition ) ) otherlv_2= ']' ) ;
    public final EObject ruleArrayC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_position_1_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:2180:2: ( (otherlv_0= '[' ( (lv_position_1_0= rulePosition ) ) otherlv_2= ']' ) )
            // InternalGrammar.g:2181:2: (otherlv_0= '[' ( (lv_position_1_0= rulePosition ) ) otherlv_2= ']' )
            {
            // InternalGrammar.g:2181:2: (otherlv_0= '[' ( (lv_position_1_0= rulePosition ) ) otherlv_2= ']' )
            // InternalGrammar.g:2182:3: otherlv_0= '[' ( (lv_position_1_0= rulePosition ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getArrayCAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalGrammar.g:2186:3: ( (lv_position_1_0= rulePosition ) )
            // InternalGrammar.g:2187:4: (lv_position_1_0= rulePosition )
            {
            // InternalGrammar.g:2187:4: (lv_position_1_0= rulePosition )
            // InternalGrammar.g:2188:5: lv_position_1_0= rulePosition
            {

            					newCompositeNode(grammarAccess.getArrayCAccess().getPositionPositionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_32);
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
    // InternalGrammar.g:2213:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // InternalGrammar.g:2213:49: (iv_rulePosition= rulePosition EOF )
            // InternalGrammar.g:2214:2: iv_rulePosition= rulePosition EOF
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
    // InternalGrammar.g:2220:1: rulePosition returns [EObject current=null] : ( ( (lv_integer_0_0= RULE_INT ) ) | ( (lv_variable_1_0= ruleVariable ) ) ) ;
    public final EObject rulePosition() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;
        EObject lv_variable_1_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:2226:2: ( ( ( (lv_integer_0_0= RULE_INT ) ) | ( (lv_variable_1_0= ruleVariable ) ) ) )
            // InternalGrammar.g:2227:2: ( ( (lv_integer_0_0= RULE_INT ) ) | ( (lv_variable_1_0= ruleVariable ) ) )
            {
            // InternalGrammar.g:2227:2: ( ( (lv_integer_0_0= RULE_INT ) ) | ( (lv_variable_1_0= ruleVariable ) ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_INT) ) {
                alt34=1;
            }
            else if ( (LA34_0==21) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalGrammar.g:2228:3: ( (lv_integer_0_0= RULE_INT ) )
                    {
                    // InternalGrammar.g:2228:3: ( (lv_integer_0_0= RULE_INT ) )
                    // InternalGrammar.g:2229:4: (lv_integer_0_0= RULE_INT )
                    {
                    // InternalGrammar.g:2229:4: (lv_integer_0_0= RULE_INT )
                    // InternalGrammar.g:2230:5: lv_integer_0_0= RULE_INT
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
                    // InternalGrammar.g:2247:3: ( (lv_variable_1_0= ruleVariable ) )
                    {
                    // InternalGrammar.g:2247:3: ( (lv_variable_1_0= ruleVariable ) )
                    // InternalGrammar.g:2248:4: (lv_variable_1_0= ruleVariable )
                    {
                    // InternalGrammar.g:2248:4: (lv_variable_1_0= ruleVariable )
                    // InternalGrammar.g:2249:5: lv_variable_1_0= ruleVariable
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
    // InternalGrammar.g:2270:1: entryRuleObjectC returns [EObject current=null] : iv_ruleObjectC= ruleObjectC EOF ;
    public final EObject entryRuleObjectC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectC = null;


        try {
            // InternalGrammar.g:2270:48: (iv_ruleObjectC= ruleObjectC EOF )
            // InternalGrammar.g:2271:2: iv_ruleObjectC= ruleObjectC EOF
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
    // InternalGrammar.g:2277:1: ruleObjectC returns [EObject current=null] : (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleObjectC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGrammar.g:2283:2: ( (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGrammar.g:2284:2: (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGrammar.g:2284:2: (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGrammar.g:2285:3: otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectCAccess().getFullStopKeyword_0());
            		
            // InternalGrammar.g:2289:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrammar.g:2290:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrammar.g:2290:4: (lv_name_1_0= RULE_ID )
            // InternalGrammar.g:2291:5: lv_name_1_0= RULE_ID
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
    // InternalGrammar.g:2311:1: entryRuleImg returns [EObject current=null] : iv_ruleImg= ruleImg EOF ;
    public final EObject entryRuleImg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImg = null;


        try {
            // InternalGrammar.g:2311:44: (iv_ruleImg= ruleImg EOF )
            // InternalGrammar.g:2312:2: iv_ruleImg= ruleImg EOF
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
    // InternalGrammar.g:2318:1: ruleImg returns [EObject current=null] : (otherlv_0= 'img' ( (lv_classD_1_0= ruleClassD ) ) otherlv_2= 'src' otherlv_3= ':' ( ( (lv_string_4_0= RULE_STRING ) ) | ( ( (lv_variable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )? ( (lv_arrayC_7_0= ruleArrayC ) )? ) ) (otherlv_8= 'alt' otherlv_9= ':' ( (lv_stringAlt_10_0= RULE_STRING ) ) )? ) ;
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
            // InternalGrammar.g:2324:2: ( (otherlv_0= 'img' ( (lv_classD_1_0= ruleClassD ) ) otherlv_2= 'src' otherlv_3= ':' ( ( (lv_string_4_0= RULE_STRING ) ) | ( ( (lv_variable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )? ( (lv_arrayC_7_0= ruleArrayC ) )? ) ) (otherlv_8= 'alt' otherlv_9= ':' ( (lv_stringAlt_10_0= RULE_STRING ) ) )? ) )
            // InternalGrammar.g:2325:2: (otherlv_0= 'img' ( (lv_classD_1_0= ruleClassD ) ) otherlv_2= 'src' otherlv_3= ':' ( ( (lv_string_4_0= RULE_STRING ) ) | ( ( (lv_variable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )? ( (lv_arrayC_7_0= ruleArrayC ) )? ) ) (otherlv_8= 'alt' otherlv_9= ':' ( (lv_stringAlt_10_0= RULE_STRING ) ) )? )
            {
            // InternalGrammar.g:2325:2: (otherlv_0= 'img' ( (lv_classD_1_0= ruleClassD ) ) otherlv_2= 'src' otherlv_3= ':' ( ( (lv_string_4_0= RULE_STRING ) ) | ( ( (lv_variable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )? ( (lv_arrayC_7_0= ruleArrayC ) )? ) ) (otherlv_8= 'alt' otherlv_9= ':' ( (lv_stringAlt_10_0= RULE_STRING ) ) )? )
            // InternalGrammar.g:2326:3: otherlv_0= 'img' ( (lv_classD_1_0= ruleClassD ) ) otherlv_2= 'src' otherlv_3= ':' ( ( (lv_string_4_0= RULE_STRING ) ) | ( ( (lv_variable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )? ( (lv_arrayC_7_0= ruleArrayC ) )? ) ) (otherlv_8= 'alt' otherlv_9= ':' ( (lv_stringAlt_10_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getImgAccess().getImgKeyword_0());
            		
            // InternalGrammar.g:2330:3: ( (lv_classD_1_0= ruleClassD ) )
            // InternalGrammar.g:2331:4: (lv_classD_1_0= ruleClassD )
            {
            // InternalGrammar.g:2331:4: (lv_classD_1_0= ruleClassD )
            // InternalGrammar.g:2332:5: lv_classD_1_0= ruleClassD
            {

            					newCompositeNode(grammarAccess.getImgAccess().getClassDClassDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_34);
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

            otherlv_2=(Token)match(input,33,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getImgAccess().getSrcKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getImgAccess().getColonKeyword_3());
            		
            // InternalGrammar.g:2357:3: ( ( (lv_string_4_0= RULE_STRING ) ) | ( ( (lv_variable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )? ( (lv_arrayC_7_0= ruleArrayC ) )? ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING) ) {
                alt37=1;
            }
            else if ( (LA37_0==21) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalGrammar.g:2358:4: ( (lv_string_4_0= RULE_STRING ) )
                    {
                    // InternalGrammar.g:2358:4: ( (lv_string_4_0= RULE_STRING ) )
                    // InternalGrammar.g:2359:5: (lv_string_4_0= RULE_STRING )
                    {
                    // InternalGrammar.g:2359:5: (lv_string_4_0= RULE_STRING )
                    // InternalGrammar.g:2360:6: lv_string_4_0= RULE_STRING
                    {
                    lv_string_4_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

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
                    // InternalGrammar.g:2377:4: ( ( (lv_variable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )? ( (lv_arrayC_7_0= ruleArrayC ) )? )
                    {
                    // InternalGrammar.g:2377:4: ( ( (lv_variable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )? ( (lv_arrayC_7_0= ruleArrayC ) )? )
                    // InternalGrammar.g:2378:5: ( (lv_variable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )? ( (lv_arrayC_7_0= ruleArrayC ) )?
                    {
                    // InternalGrammar.g:2378:5: ( (lv_variable_5_0= ruleVariable ) )
                    // InternalGrammar.g:2379:6: (lv_variable_5_0= ruleVariable )
                    {
                    // InternalGrammar.g:2379:6: (lv_variable_5_0= ruleVariable )
                    // InternalGrammar.g:2380:7: lv_variable_5_0= ruleVariable
                    {

                    							newCompositeNode(grammarAccess.getImgAccess().getVariableVariableParserRuleCall_4_1_0_0());
                    						
                    pushFollow(FOLLOW_36);
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

                    // InternalGrammar.g:2397:5: ( (lv_objectC_6_0= ruleObjectC ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==31) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalGrammar.g:2398:6: (lv_objectC_6_0= ruleObjectC )
                            {
                            // InternalGrammar.g:2398:6: (lv_objectC_6_0= ruleObjectC )
                            // InternalGrammar.g:2399:7: lv_objectC_6_0= ruleObjectC
                            {

                            							newCompositeNode(grammarAccess.getImgAccess().getObjectCObjectCParserRuleCall_4_1_1_0());
                            						
                            pushFollow(FOLLOW_37);
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

                    // InternalGrammar.g:2416:5: ( (lv_arrayC_7_0= ruleArrayC ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==16) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalGrammar.g:2417:6: (lv_arrayC_7_0= ruleArrayC )
                            {
                            // InternalGrammar.g:2417:6: (lv_arrayC_7_0= ruleArrayC )
                            // InternalGrammar.g:2418:7: lv_arrayC_7_0= ruleArrayC
                            {

                            							newCompositeNode(grammarAccess.getImgAccess().getArrayCArrayCParserRuleCall_4_1_2_0());
                            						
                            pushFollow(FOLLOW_35);
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

            // InternalGrammar.g:2437:3: (otherlv_8= 'alt' otherlv_9= ':' ( (lv_stringAlt_10_0= RULE_STRING ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==34) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalGrammar.g:2438:4: otherlv_8= 'alt' otherlv_9= ':' ( (lv_stringAlt_10_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,34,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getImgAccess().getAltKeyword_5_0());
                    			
                    otherlv_9=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getImgAccess().getColonKeyword_5_1());
                    			
                    // InternalGrammar.g:2446:4: ( (lv_stringAlt_10_0= RULE_STRING ) )
                    // InternalGrammar.g:2447:5: (lv_stringAlt_10_0= RULE_STRING )
                    {
                    // InternalGrammar.g:2447:5: (lv_stringAlt_10_0= RULE_STRING )
                    // InternalGrammar.g:2448:6: lv_stringAlt_10_0= RULE_STRING
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
    // InternalGrammar.g:2469:1: entryRuleClassD returns [EObject current=null] : iv_ruleClassD= ruleClassD EOF ;
    public final EObject entryRuleClassD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassD = null;


        try {
            // InternalGrammar.g:2469:47: (iv_ruleClassD= ruleClassD EOF )
            // InternalGrammar.g:2470:2: iv_ruleClassD= ruleClassD EOF
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
    // InternalGrammar.g:2476:1: ruleClassD returns [EObject current=null] : (otherlv_0= 'class' otherlv_1= '=' ( (lv_string_2_0= RULE_STRING ) ) )? ;
    public final EObject ruleClassD() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_string_2_0=null;


        	enterRule();

        try {
            // InternalGrammar.g:2482:2: ( (otherlv_0= 'class' otherlv_1= '=' ( (lv_string_2_0= RULE_STRING ) ) )? )
            // InternalGrammar.g:2483:2: (otherlv_0= 'class' otherlv_1= '=' ( (lv_string_2_0= RULE_STRING ) ) )?
            {
            // InternalGrammar.g:2483:2: (otherlv_0= 'class' otherlv_1= '=' ( (lv_string_2_0= RULE_STRING ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==35) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalGrammar.g:2484:3: otherlv_0= 'class' otherlv_1= '=' ( (lv_string_2_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_14); 

                    			newLeafNode(otherlv_0, grammarAccess.getClassDAccess().getClassKeyword_0());
                    		
                    otherlv_1=(Token)match(input,20,FOLLOW_6); 

                    			newLeafNode(otherlv_1, grammarAccess.getClassDAccess().getEqualsSignKeyword_1());
                    		
                    // InternalGrammar.g:2492:3: ( (lv_string_2_0= RULE_STRING ) )
                    // InternalGrammar.g:2493:4: (lv_string_2_0= RULE_STRING )
                    {
                    // InternalGrammar.g:2493:4: (lv_string_2_0= RULE_STRING )
                    // InternalGrammar.g:2494:5: lv_string_2_0= RULE_STRING
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
    // InternalGrammar.g:2514:1: entryRuleFusion returns [EObject current=null] : iv_ruleFusion= ruleFusion EOF ;
    public final EObject entryRuleFusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFusion = null;


        try {
            // InternalGrammar.g:2514:47: (iv_ruleFusion= ruleFusion EOF )
            // InternalGrammar.g:2515:2: iv_ruleFusion= ruleFusion EOF
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
    // InternalGrammar.g:2521:1: ruleFusion returns [EObject current=null] : ( ( (lv_colspan_0_0= ruleColspan ) ) | ( (lv_rowspan_1_0= ruleRowspan ) ) )? ;
    public final EObject ruleFusion() throws RecognitionException {
        EObject current = null;

        EObject lv_colspan_0_0 = null;

        EObject lv_rowspan_1_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:2527:2: ( ( ( (lv_colspan_0_0= ruleColspan ) ) | ( (lv_rowspan_1_0= ruleRowspan ) ) )? )
            // InternalGrammar.g:2528:2: ( ( (lv_colspan_0_0= ruleColspan ) ) | ( (lv_rowspan_1_0= ruleRowspan ) ) )?
            {
            // InternalGrammar.g:2528:2: ( ( (lv_colspan_0_0= ruleColspan ) ) | ( (lv_rowspan_1_0= ruleRowspan ) ) )?
            int alt40=3;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==36) ) {
                alt40=1;
            }
            else if ( (LA40_0==37) ) {
                alt40=2;
            }
            switch (alt40) {
                case 1 :
                    // InternalGrammar.g:2529:3: ( (lv_colspan_0_0= ruleColspan ) )
                    {
                    // InternalGrammar.g:2529:3: ( (lv_colspan_0_0= ruleColspan ) )
                    // InternalGrammar.g:2530:4: (lv_colspan_0_0= ruleColspan )
                    {
                    // InternalGrammar.g:2530:4: (lv_colspan_0_0= ruleColspan )
                    // InternalGrammar.g:2531:5: lv_colspan_0_0= ruleColspan
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
                    // InternalGrammar.g:2549:3: ( (lv_rowspan_1_0= ruleRowspan ) )
                    {
                    // InternalGrammar.g:2549:3: ( (lv_rowspan_1_0= ruleRowspan ) )
                    // InternalGrammar.g:2550:4: (lv_rowspan_1_0= ruleRowspan )
                    {
                    // InternalGrammar.g:2550:4: (lv_rowspan_1_0= ruleRowspan )
                    // InternalGrammar.g:2551:5: lv_rowspan_1_0= ruleRowspan
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
    // InternalGrammar.g:2572:1: entryRuleColspan returns [EObject current=null] : iv_ruleColspan= ruleColspan EOF ;
    public final EObject entryRuleColspan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColspan = null;


        try {
            // InternalGrammar.g:2572:48: (iv_ruleColspan= ruleColspan EOF )
            // InternalGrammar.g:2573:2: iv_ruleColspan= ruleColspan EOF
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
    // InternalGrammar.g:2579:1: ruleColspan returns [EObject current=null] : (otherlv_0= 'colspan' otherlv_1= ':' ( ( (lv_integer_2_0= RULE_INT ) ) | ( (lv_variable_3_0= ruleVariable ) ) ) ) ;
    public final EObject ruleColspan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_integer_2_0=null;
        EObject lv_variable_3_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:2585:2: ( (otherlv_0= 'colspan' otherlv_1= ':' ( ( (lv_integer_2_0= RULE_INT ) ) | ( (lv_variable_3_0= ruleVariable ) ) ) ) )
            // InternalGrammar.g:2586:2: (otherlv_0= 'colspan' otherlv_1= ':' ( ( (lv_integer_2_0= RULE_INT ) ) | ( (lv_variable_3_0= ruleVariable ) ) ) )
            {
            // InternalGrammar.g:2586:2: (otherlv_0= 'colspan' otherlv_1= ':' ( ( (lv_integer_2_0= RULE_INT ) ) | ( (lv_variable_3_0= ruleVariable ) ) ) )
            // InternalGrammar.g:2587:3: otherlv_0= 'colspan' otherlv_1= ':' ( ( (lv_integer_2_0= RULE_INT ) ) | ( (lv_variable_3_0= ruleVariable ) ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getColspanAccess().getColspanKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getColspanAccess().getColonKeyword_1());
            		
            // InternalGrammar.g:2595:3: ( ( (lv_integer_2_0= RULE_INT ) ) | ( (lv_variable_3_0= ruleVariable ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_INT) ) {
                alt41=1;
            }
            else if ( (LA41_0==21) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalGrammar.g:2596:4: ( (lv_integer_2_0= RULE_INT ) )
                    {
                    // InternalGrammar.g:2596:4: ( (lv_integer_2_0= RULE_INT ) )
                    // InternalGrammar.g:2597:5: (lv_integer_2_0= RULE_INT )
                    {
                    // InternalGrammar.g:2597:5: (lv_integer_2_0= RULE_INT )
                    // InternalGrammar.g:2598:6: lv_integer_2_0= RULE_INT
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
                    // InternalGrammar.g:2615:4: ( (lv_variable_3_0= ruleVariable ) )
                    {
                    // InternalGrammar.g:2615:4: ( (lv_variable_3_0= ruleVariable ) )
                    // InternalGrammar.g:2616:5: (lv_variable_3_0= ruleVariable )
                    {
                    // InternalGrammar.g:2616:5: (lv_variable_3_0= ruleVariable )
                    // InternalGrammar.g:2617:6: lv_variable_3_0= ruleVariable
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
    // InternalGrammar.g:2639:1: entryRuleRowspan returns [EObject current=null] : iv_ruleRowspan= ruleRowspan EOF ;
    public final EObject entryRuleRowspan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRowspan = null;


        try {
            // InternalGrammar.g:2639:48: (iv_ruleRowspan= ruleRowspan EOF )
            // InternalGrammar.g:2640:2: iv_ruleRowspan= ruleRowspan EOF
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
    // InternalGrammar.g:2646:1: ruleRowspan returns [EObject current=null] : (otherlv_0= 'rowspan' otherlv_1= ':' ( ( (lv_integer_2_0= RULE_INT ) ) | ( (lv_variable_3_0= ruleVariable ) ) ) ) ;
    public final EObject ruleRowspan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_integer_2_0=null;
        EObject lv_variable_3_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:2652:2: ( (otherlv_0= 'rowspan' otherlv_1= ':' ( ( (lv_integer_2_0= RULE_INT ) ) | ( (lv_variable_3_0= ruleVariable ) ) ) ) )
            // InternalGrammar.g:2653:2: (otherlv_0= 'rowspan' otherlv_1= ':' ( ( (lv_integer_2_0= RULE_INT ) ) | ( (lv_variable_3_0= ruleVariable ) ) ) )
            {
            // InternalGrammar.g:2653:2: (otherlv_0= 'rowspan' otherlv_1= ':' ( ( (lv_integer_2_0= RULE_INT ) ) | ( (lv_variable_3_0= ruleVariable ) ) ) )
            // InternalGrammar.g:2654:3: otherlv_0= 'rowspan' otherlv_1= ':' ( ( (lv_integer_2_0= RULE_INT ) ) | ( (lv_variable_3_0= ruleVariable ) ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRowspanAccess().getRowspanKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRowspanAccess().getColonKeyword_1());
            		
            // InternalGrammar.g:2662:3: ( ( (lv_integer_2_0= RULE_INT ) ) | ( (lv_variable_3_0= ruleVariable ) ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_INT) ) {
                alt42=1;
            }
            else if ( (LA42_0==21) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalGrammar.g:2663:4: ( (lv_integer_2_0= RULE_INT ) )
                    {
                    // InternalGrammar.g:2663:4: ( (lv_integer_2_0= RULE_INT ) )
                    // InternalGrammar.g:2664:5: (lv_integer_2_0= RULE_INT )
                    {
                    // InternalGrammar.g:2664:5: (lv_integer_2_0= RULE_INT )
                    // InternalGrammar.g:2665:6: lv_integer_2_0= RULE_INT
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
                    // InternalGrammar.g:2682:4: ( (lv_variable_3_0= ruleVariable ) )
                    {
                    // InternalGrammar.g:2682:4: ( (lv_variable_3_0= ruleVariable ) )
                    // InternalGrammar.g:2683:5: (lv_variable_3_0= ruleVariable )
                    {
                    // InternalGrammar.g:2683:5: (lv_variable_3_0= ruleVariable )
                    // InternalGrammar.g:2684:6: lv_variable_3_0= ruleVariable
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
    // InternalGrammar.g:2706:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalGrammar.g:2706:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalGrammar.g:2707:2: iv_ruleFunction= ruleFunction EOF
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
    // InternalGrammar.g:2713:1: ruleFunction returns [EObject current=null] : ( ( (lv_sumFunction_0_0= ruleSumFunction ) ) | ( (lv_prodFunction_1_0= ruleProdFunction ) ) | ( (lv_divFunction_2_0= ruleDivFunction ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        EObject lv_sumFunction_0_0 = null;

        EObject lv_prodFunction_1_0 = null;

        EObject lv_divFunction_2_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:2719:2: ( ( ( (lv_sumFunction_0_0= ruleSumFunction ) ) | ( (lv_prodFunction_1_0= ruleProdFunction ) ) | ( (lv_divFunction_2_0= ruleDivFunction ) ) ) )
            // InternalGrammar.g:2720:2: ( ( (lv_sumFunction_0_0= ruleSumFunction ) ) | ( (lv_prodFunction_1_0= ruleProdFunction ) ) | ( (lv_divFunction_2_0= ruleDivFunction ) ) )
            {
            // InternalGrammar.g:2720:2: ( ( (lv_sumFunction_0_0= ruleSumFunction ) ) | ( (lv_prodFunction_1_0= ruleProdFunction ) ) | ( (lv_divFunction_2_0= ruleDivFunction ) ) )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt43=1;
                }
                break;
            case 39:
                {
                alt43=2;
                }
                break;
            case 40:
                {
                alt43=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalGrammar.g:2721:3: ( (lv_sumFunction_0_0= ruleSumFunction ) )
                    {
                    // InternalGrammar.g:2721:3: ( (lv_sumFunction_0_0= ruleSumFunction ) )
                    // InternalGrammar.g:2722:4: (lv_sumFunction_0_0= ruleSumFunction )
                    {
                    // InternalGrammar.g:2722:4: (lv_sumFunction_0_0= ruleSumFunction )
                    // InternalGrammar.g:2723:5: lv_sumFunction_0_0= ruleSumFunction
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
                    // InternalGrammar.g:2741:3: ( (lv_prodFunction_1_0= ruleProdFunction ) )
                    {
                    // InternalGrammar.g:2741:3: ( (lv_prodFunction_1_0= ruleProdFunction ) )
                    // InternalGrammar.g:2742:4: (lv_prodFunction_1_0= ruleProdFunction )
                    {
                    // InternalGrammar.g:2742:4: (lv_prodFunction_1_0= ruleProdFunction )
                    // InternalGrammar.g:2743:5: lv_prodFunction_1_0= ruleProdFunction
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
                    // InternalGrammar.g:2761:3: ( (lv_divFunction_2_0= ruleDivFunction ) )
                    {
                    // InternalGrammar.g:2761:3: ( (lv_divFunction_2_0= ruleDivFunction ) )
                    // InternalGrammar.g:2762:4: (lv_divFunction_2_0= ruleDivFunction )
                    {
                    // InternalGrammar.g:2762:4: (lv_divFunction_2_0= ruleDivFunction )
                    // InternalGrammar.g:2763:5: lv_divFunction_2_0= ruleDivFunction
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
    // InternalGrammar.g:2784:1: entryRuleSumFunction returns [EObject current=null] : iv_ruleSumFunction= ruleSumFunction EOF ;
    public final EObject entryRuleSumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumFunction = null;


        try {
            // InternalGrammar.g:2784:52: (iv_ruleSumFunction= ruleSumFunction EOF )
            // InternalGrammar.g:2785:2: iv_ruleSumFunction= ruleSumFunction EOF
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
    // InternalGrammar.g:2791:1: ruleSumFunction returns [EObject current=null] : (otherlv_0= 'SUM' otherlv_1= '(' ( ( ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )* )? | (otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) )+ otherlv_7= ']' ) ) otherlv_8= ')' ) ;
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
            // InternalGrammar.g:2797:2: ( (otherlv_0= 'SUM' otherlv_1= '(' ( ( ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )* )? | (otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) )+ otherlv_7= ']' ) ) otherlv_8= ')' ) )
            // InternalGrammar.g:2798:2: (otherlv_0= 'SUM' otherlv_1= '(' ( ( ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )* )? | (otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) )+ otherlv_7= ']' ) ) otherlv_8= ')' )
            {
            // InternalGrammar.g:2798:2: (otherlv_0= 'SUM' otherlv_1= '(' ( ( ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )* )? | (otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) )+ otherlv_7= ']' ) ) otherlv_8= ')' )
            // InternalGrammar.g:2799:3: otherlv_0= 'SUM' otherlv_1= '(' ( ( ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )* )? | (otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) )+ otherlv_7= ']' ) ) otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getSumFunctionAccess().getSUMKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getSumFunctionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGrammar.g:2807:3: ( ( ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )* )? | (otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) )+ otherlv_7= ']' ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_STRING && LA47_0<=RULE_INT)||LA47_0==21||LA47_0==24||LA47_0==31) ) {
                alt47=1;
            }
            else if ( (LA47_0==16) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalGrammar.g:2808:4: ( ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )* )?
                    {
                    // InternalGrammar.g:2808:4: ( ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )* )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( ((LA45_0>=RULE_STRING && LA45_0<=RULE_INT)||LA45_0==21||LA45_0==31) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalGrammar.g:2809:5: ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )*
                            {
                            // InternalGrammar.g:2809:5: ( (lv_argument1_2_0= ruleArgument1 ) )
                            // InternalGrammar.g:2810:6: (lv_argument1_2_0= ruleArgument1 )
                            {
                            // InternalGrammar.g:2810:6: (lv_argument1_2_0= ruleArgument1 )
                            // InternalGrammar.g:2811:7: lv_argument1_2_0= ruleArgument1
                            {

                            							newCompositeNode(grammarAccess.getSumFunctionAccess().getArgument1Argument1ParserRuleCall_2_0_0_0());
                            						
                            pushFollow(FOLLOW_39);
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

                            // InternalGrammar.g:2828:5: (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )*
                            loop44:
                            do {
                                int alt44=2;
                                int LA44_0 = input.LA(1);

                                if ( (LA44_0==13) ) {
                                    alt44=1;
                                }


                                switch (alt44) {
                            	case 1 :
                            	    // InternalGrammar.g:2829:6: otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) )
                            	    {
                            	    otherlv_3=(Token)match(input,13,FOLLOW_40); 

                            	    						newLeafNode(otherlv_3, grammarAccess.getSumFunctionAccess().getCommaKeyword_2_0_1_0());
                            	    					
                            	    // InternalGrammar.g:2833:6: ( (lv_argument1_4_0= ruleArgument1 ) )
                            	    // InternalGrammar.g:2834:7: (lv_argument1_4_0= ruleArgument1 )
                            	    {
                            	    // InternalGrammar.g:2834:7: (lv_argument1_4_0= ruleArgument1 )
                            	    // InternalGrammar.g:2835:8: lv_argument1_4_0= ruleArgument1
                            	    {

                            	    								newCompositeNode(grammarAccess.getSumFunctionAccess().getArgument1Argument1ParserRuleCall_2_0_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_39);
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
                            	    break loop44;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalGrammar.g:2855:4: (otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) )+ otherlv_7= ']' )
                    {
                    // InternalGrammar.g:2855:4: (otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) )+ otherlv_7= ']' )
                    // InternalGrammar.g:2856:5: otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) )+ otherlv_7= ']'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_9); 

                    					newLeafNode(otherlv_5, grammarAccess.getSumFunctionAccess().getLeftSquareBracketKeyword_2_1_0());
                    				
                    // InternalGrammar.g:2860:5: ( (lv_argument2_6_0= ruleArgument2 ) )+
                    int cnt46=0;
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==RULE_INT||LA46_0==21) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalGrammar.g:2861:6: (lv_argument2_6_0= ruleArgument2 )
                    	    {
                    	    // InternalGrammar.g:2861:6: (lv_argument2_6_0= ruleArgument2 )
                    	    // InternalGrammar.g:2862:7: lv_argument2_6_0= ruleArgument2
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
                    	    if ( cnt46 >= 1 ) break loop46;
                                EarlyExitException eee =
                                    new EarlyExitException(46, input);
                                throw eee;
                        }
                        cnt46++;
                    } while (true);

                    otherlv_7=(Token)match(input,17,FOLLOW_22); 

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
    // InternalGrammar.g:2893:1: entryRuleProdFunction returns [EObject current=null] : iv_ruleProdFunction= ruleProdFunction EOF ;
    public final EObject entryRuleProdFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProdFunction = null;


        try {
            // InternalGrammar.g:2893:53: (iv_ruleProdFunction= ruleProdFunction EOF )
            // InternalGrammar.g:2894:2: iv_ruleProdFunction= ruleProdFunction EOF
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
    // InternalGrammar.g:2900:1: ruleProdFunction returns [EObject current=null] : (otherlv_0= 'PROD' otherlv_1= '(' ( ( ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )* )? | (otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) ) otherlv_7= ']' ) ) otherlv_8= ')' ) ;
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
            // InternalGrammar.g:2906:2: ( (otherlv_0= 'PROD' otherlv_1= '(' ( ( ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )* )? | (otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) ) otherlv_7= ']' ) ) otherlv_8= ')' ) )
            // InternalGrammar.g:2907:2: (otherlv_0= 'PROD' otherlv_1= '(' ( ( ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )* )? | (otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) ) otherlv_7= ']' ) ) otherlv_8= ')' )
            {
            // InternalGrammar.g:2907:2: (otherlv_0= 'PROD' otherlv_1= '(' ( ( ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )* )? | (otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) ) otherlv_7= ']' ) ) otherlv_8= ')' )
            // InternalGrammar.g:2908:3: otherlv_0= 'PROD' otherlv_1= '(' ( ( ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )* )? | (otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) ) otherlv_7= ']' ) ) otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getProdFunctionAccess().getPRODKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getProdFunctionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGrammar.g:2916:3: ( ( ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )* )? | (otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) ) otherlv_7= ']' ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=RULE_STRING && LA50_0<=RULE_INT)||LA50_0==21||LA50_0==24||LA50_0==31) ) {
                alt50=1;
            }
            else if ( (LA50_0==16) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalGrammar.g:2917:4: ( ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )* )?
                    {
                    // InternalGrammar.g:2917:4: ( ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )* )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( ((LA49_0>=RULE_STRING && LA49_0<=RULE_INT)||LA49_0==21||LA49_0==31) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalGrammar.g:2918:5: ( (lv_argument1_2_0= ruleArgument1 ) ) (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )*
                            {
                            // InternalGrammar.g:2918:5: ( (lv_argument1_2_0= ruleArgument1 ) )
                            // InternalGrammar.g:2919:6: (lv_argument1_2_0= ruleArgument1 )
                            {
                            // InternalGrammar.g:2919:6: (lv_argument1_2_0= ruleArgument1 )
                            // InternalGrammar.g:2920:7: lv_argument1_2_0= ruleArgument1
                            {

                            							newCompositeNode(grammarAccess.getProdFunctionAccess().getArgument1Argument1ParserRuleCall_2_0_0_0());
                            						
                            pushFollow(FOLLOW_39);
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

                            // InternalGrammar.g:2937:5: (otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) )*
                            loop48:
                            do {
                                int alt48=2;
                                int LA48_0 = input.LA(1);

                                if ( (LA48_0==13) ) {
                                    alt48=1;
                                }


                                switch (alt48) {
                            	case 1 :
                            	    // InternalGrammar.g:2938:6: otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) )
                            	    {
                            	    otherlv_3=(Token)match(input,13,FOLLOW_40); 

                            	    						newLeafNode(otherlv_3, grammarAccess.getProdFunctionAccess().getCommaKeyword_2_0_1_0());
                            	    					
                            	    // InternalGrammar.g:2942:6: ( (lv_argument1_4_0= ruleArgument1 ) )
                            	    // InternalGrammar.g:2943:7: (lv_argument1_4_0= ruleArgument1 )
                            	    {
                            	    // InternalGrammar.g:2943:7: (lv_argument1_4_0= ruleArgument1 )
                            	    // InternalGrammar.g:2944:8: lv_argument1_4_0= ruleArgument1
                            	    {

                            	    								newCompositeNode(grammarAccess.getProdFunctionAccess().getArgument1Argument1ParserRuleCall_2_0_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_39);
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
                            	    break loop48;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalGrammar.g:2964:4: (otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) ) otherlv_7= ']' )
                    {
                    // InternalGrammar.g:2964:4: (otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) ) otherlv_7= ']' )
                    // InternalGrammar.g:2965:5: otherlv_5= '[' ( (lv_argument2_6_0= ruleArgument2 ) ) otherlv_7= ']'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_9); 

                    					newLeafNode(otherlv_5, grammarAccess.getProdFunctionAccess().getLeftSquareBracketKeyword_2_1_0());
                    				
                    // InternalGrammar.g:2969:5: ( (lv_argument2_6_0= ruleArgument2 ) )
                    // InternalGrammar.g:2970:6: (lv_argument2_6_0= ruleArgument2 )
                    {
                    // InternalGrammar.g:2970:6: (lv_argument2_6_0= ruleArgument2 )
                    // InternalGrammar.g:2971:7: lv_argument2_6_0= ruleArgument2
                    {

                    							newCompositeNode(grammarAccess.getProdFunctionAccess().getArgument2Argument2ParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_32);
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

                    otherlv_7=(Token)match(input,17,FOLLOW_22); 

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
    // InternalGrammar.g:3002:1: entryRuleDivFunction returns [EObject current=null] : iv_ruleDivFunction= ruleDivFunction EOF ;
    public final EObject entryRuleDivFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivFunction = null;


        try {
            // InternalGrammar.g:3002:52: (iv_ruleDivFunction= ruleDivFunction EOF )
            // InternalGrammar.g:3003:2: iv_ruleDivFunction= ruleDivFunction EOF
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
    // InternalGrammar.g:3009:1: ruleDivFunction returns [EObject current=null] : (otherlv_0= 'DIV' otherlv_1= '(' ( (lv_argument1_2_0= ruleArgument1 ) ) otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) otherlv_5= ')' ) ;
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
            // InternalGrammar.g:3015:2: ( (otherlv_0= 'DIV' otherlv_1= '(' ( (lv_argument1_2_0= ruleArgument1 ) ) otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) otherlv_5= ')' ) )
            // InternalGrammar.g:3016:2: (otherlv_0= 'DIV' otherlv_1= '(' ( (lv_argument1_2_0= ruleArgument1 ) ) otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) otherlv_5= ')' )
            {
            // InternalGrammar.g:3016:2: (otherlv_0= 'DIV' otherlv_1= '(' ( (lv_argument1_2_0= ruleArgument1 ) ) otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) otherlv_5= ')' )
            // InternalGrammar.g:3017:3: otherlv_0= 'DIV' otherlv_1= '(' ( (lv_argument1_2_0= ruleArgument1 ) ) otherlv_3= ',' ( (lv_argument1_4_0= ruleArgument1 ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getDivFunctionAccess().getDIVKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getDivFunctionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGrammar.g:3025:3: ( (lv_argument1_2_0= ruleArgument1 ) )
            // InternalGrammar.g:3026:4: (lv_argument1_2_0= ruleArgument1 )
            {
            // InternalGrammar.g:3026:4: (lv_argument1_2_0= ruleArgument1 )
            // InternalGrammar.g:3027:5: lv_argument1_2_0= ruleArgument1
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

            otherlv_3=(Token)match(input,13,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getDivFunctionAccess().getCommaKeyword_3());
            		
            // InternalGrammar.g:3048:3: ( (lv_argument1_4_0= ruleArgument1 ) )
            // InternalGrammar.g:3049:4: (lv_argument1_4_0= ruleArgument1 )
            {
            // InternalGrammar.g:3049:4: (lv_argument1_4_0= ruleArgument1 )
            // InternalGrammar.g:3050:5: lv_argument1_4_0= ruleArgument1
            {

            					newCompositeNode(grammarAccess.getDivFunctionAccess().getArgument1Argument1ParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
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
    // InternalGrammar.g:3075:1: entryRuleArgument1 returns [EObject current=null] : iv_ruleArgument1= ruleArgument1 EOF ;
    public final EObject entryRuleArgument1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument1 = null;


        try {
            // InternalGrammar.g:3075:50: (iv_ruleArgument1= ruleArgument1 EOF )
            // InternalGrammar.g:3076:2: iv_ruleArgument1= ruleArgument1 EOF
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
    // InternalGrammar.g:3082:1: ruleArgument1 returns [EObject current=null] : ( ( (lv_integer_0_0= RULE_INT ) ) | ( (lv_floatValue_1_0= ruleFloat ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_classVariable_3_0= ruleClassVariable ) ) | ( ( (lv_variable_4_0= ruleVariable ) ) ( (lv_objectC_5_0= ruleObjectC ) )? ( (lv_arrayC_6_0= ruleArrayC ) )? ) ) ;
    public final EObject ruleArgument1() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;
        Token lv_string_2_0=null;
        EObject lv_floatValue_1_0 = null;

        EObject lv_classVariable_3_0 = null;

        EObject lv_variable_4_0 = null;

        EObject lv_objectC_5_0 = null;

        EObject lv_arrayC_6_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:3088:2: ( ( ( (lv_integer_0_0= RULE_INT ) ) | ( (lv_floatValue_1_0= ruleFloat ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_classVariable_3_0= ruleClassVariable ) ) | ( ( (lv_variable_4_0= ruleVariable ) ) ( (lv_objectC_5_0= ruleObjectC ) )? ( (lv_arrayC_6_0= ruleArrayC ) )? ) ) )
            // InternalGrammar.g:3089:2: ( ( (lv_integer_0_0= RULE_INT ) ) | ( (lv_floatValue_1_0= ruleFloat ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_classVariable_3_0= ruleClassVariable ) ) | ( ( (lv_variable_4_0= ruleVariable ) ) ( (lv_objectC_5_0= ruleObjectC ) )? ( (lv_arrayC_6_0= ruleArrayC ) )? ) )
            {
            // InternalGrammar.g:3089:2: ( ( (lv_integer_0_0= RULE_INT ) ) | ( (lv_floatValue_1_0= ruleFloat ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_classVariable_3_0= ruleClassVariable ) ) | ( ( (lv_variable_4_0= ruleVariable ) ) ( (lv_objectC_5_0= ruleObjectC ) )? ( (lv_arrayC_6_0= ruleArrayC ) )? ) )
            int alt53=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==31) ) {
                    alt53=2;
                }
                else if ( (LA53_1==EOF||LA53_1==13||LA53_1==24) ) {
                    alt53=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt53=3;
                }
                break;
            case 31:
                {
                alt53=4;
                }
                break;
            case 21:
                {
                alt53=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalGrammar.g:3090:3: ( (lv_integer_0_0= RULE_INT ) )
                    {
                    // InternalGrammar.g:3090:3: ( (lv_integer_0_0= RULE_INT ) )
                    // InternalGrammar.g:3091:4: (lv_integer_0_0= RULE_INT )
                    {
                    // InternalGrammar.g:3091:4: (lv_integer_0_0= RULE_INT )
                    // InternalGrammar.g:3092:5: lv_integer_0_0= RULE_INT
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
                    // InternalGrammar.g:3109:3: ( (lv_floatValue_1_0= ruleFloat ) )
                    {
                    // InternalGrammar.g:3109:3: ( (lv_floatValue_1_0= ruleFloat ) )
                    // InternalGrammar.g:3110:4: (lv_floatValue_1_0= ruleFloat )
                    {
                    // InternalGrammar.g:3110:4: (lv_floatValue_1_0= ruleFloat )
                    // InternalGrammar.g:3111:5: lv_floatValue_1_0= ruleFloat
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
                    // InternalGrammar.g:3129:3: ( (lv_string_2_0= RULE_STRING ) )
                    {
                    // InternalGrammar.g:3129:3: ( (lv_string_2_0= RULE_STRING ) )
                    // InternalGrammar.g:3130:4: (lv_string_2_0= RULE_STRING )
                    {
                    // InternalGrammar.g:3130:4: (lv_string_2_0= RULE_STRING )
                    // InternalGrammar.g:3131:5: lv_string_2_0= RULE_STRING
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
                    // InternalGrammar.g:3148:3: ( (lv_classVariable_3_0= ruleClassVariable ) )
                    {
                    // InternalGrammar.g:3148:3: ( (lv_classVariable_3_0= ruleClassVariable ) )
                    // InternalGrammar.g:3149:4: (lv_classVariable_3_0= ruleClassVariable )
                    {
                    // InternalGrammar.g:3149:4: (lv_classVariable_3_0= ruleClassVariable )
                    // InternalGrammar.g:3150:5: lv_classVariable_3_0= ruleClassVariable
                    {

                    					newCompositeNode(grammarAccess.getArgument1Access().getClassVariableClassVariableParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_classVariable_3_0=ruleClassVariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getArgument1Rule());
                    					}
                    					set(
                    						current,
                    						"classVariable",
                    						lv_classVariable_3_0,
                    						"org.xtext.example.Grammar.ClassVariable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalGrammar.g:3168:3: ( ( (lv_variable_4_0= ruleVariable ) ) ( (lv_objectC_5_0= ruleObjectC ) )? ( (lv_arrayC_6_0= ruleArrayC ) )? )
                    {
                    // InternalGrammar.g:3168:3: ( ( (lv_variable_4_0= ruleVariable ) ) ( (lv_objectC_5_0= ruleObjectC ) )? ( (lv_arrayC_6_0= ruleArrayC ) )? )
                    // InternalGrammar.g:3169:4: ( (lv_variable_4_0= ruleVariable ) ) ( (lv_objectC_5_0= ruleObjectC ) )? ( (lv_arrayC_6_0= ruleArrayC ) )?
                    {
                    // InternalGrammar.g:3169:4: ( (lv_variable_4_0= ruleVariable ) )
                    // InternalGrammar.g:3170:5: (lv_variable_4_0= ruleVariable )
                    {
                    // InternalGrammar.g:3170:5: (lv_variable_4_0= ruleVariable )
                    // InternalGrammar.g:3171:6: lv_variable_4_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getArgument1Access().getVariableVariableParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_variable_4_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArgument1Rule());
                    						}
                    						set(
                    							current,
                    							"variable",
                    							lv_variable_4_0,
                    							"org.xtext.example.Grammar.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGrammar.g:3188:4: ( (lv_objectC_5_0= ruleObjectC ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==31) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalGrammar.g:3189:5: (lv_objectC_5_0= ruleObjectC )
                            {
                            // InternalGrammar.g:3189:5: (lv_objectC_5_0= ruleObjectC )
                            // InternalGrammar.g:3190:6: lv_objectC_5_0= ruleObjectC
                            {

                            						newCompositeNode(grammarAccess.getArgument1Access().getObjectCObjectCParserRuleCall_4_1_0());
                            					
                            pushFollow(FOLLOW_43);
                            lv_objectC_5_0=ruleObjectC();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getArgument1Rule());
                            						}
                            						set(
                            							current,
                            							"objectC",
                            							lv_objectC_5_0,
                            							"org.xtext.example.Grammar.ObjectC");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalGrammar.g:3207:4: ( (lv_arrayC_6_0= ruleArrayC ) )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==16) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalGrammar.g:3208:5: (lv_arrayC_6_0= ruleArrayC )
                            {
                            // InternalGrammar.g:3208:5: (lv_arrayC_6_0= ruleArrayC )
                            // InternalGrammar.g:3209:6: lv_arrayC_6_0= ruleArrayC
                            {

                            						newCompositeNode(grammarAccess.getArgument1Access().getArrayCArrayCParserRuleCall_4_2_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_arrayC_6_0=ruleArrayC();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getArgument1Rule());
                            						}
                            						set(
                            							current,
                            							"arrayC",
                            							lv_arrayC_6_0,
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
    // InternalGrammar.g:3231:1: entryRuleArgument2 returns [EObject current=null] : iv_ruleArgument2= ruleArgument2 EOF ;
    public final EObject entryRuleArgument2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument2 = null;


        try {
            // InternalGrammar.g:3231:50: (iv_ruleArgument2= ruleArgument2 EOF )
            // InternalGrammar.g:3232:2: iv_ruleArgument2= ruleArgument2 EOF
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
    // InternalGrammar.g:3238:1: ruleArgument2 returns [EObject current=null] : ( ( ( (lv_variable_0_0= ruleVariable ) ) | ( (lv_integer_1_0= RULE_INT ) ) ) ( (otherlv_2= '-' | otherlv_3= '+' ) ( ( (lv_variable_4_0= ruleVariable ) ) | ( (lv_integerEnd1_5_0= RULE_INT ) ) ) )? otherlv_6= ',' ( ( (lv_variable_7_0= ruleVariable ) ) | ( (lv_integerEnd2_8_0= RULE_INT ) ) ) ( (otherlv_9= '-' | otherlv_10= '+' ) ( ( (lv_variable_11_0= ruleVariable ) ) | ( (lv_integerEnd3_12_0= RULE_INT ) ) ) )? ) ;
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
            // InternalGrammar.g:3244:2: ( ( ( ( (lv_variable_0_0= ruleVariable ) ) | ( (lv_integer_1_0= RULE_INT ) ) ) ( (otherlv_2= '-' | otherlv_3= '+' ) ( ( (lv_variable_4_0= ruleVariable ) ) | ( (lv_integerEnd1_5_0= RULE_INT ) ) ) )? otherlv_6= ',' ( ( (lv_variable_7_0= ruleVariable ) ) | ( (lv_integerEnd2_8_0= RULE_INT ) ) ) ( (otherlv_9= '-' | otherlv_10= '+' ) ( ( (lv_variable_11_0= ruleVariable ) ) | ( (lv_integerEnd3_12_0= RULE_INT ) ) ) )? ) )
            // InternalGrammar.g:3245:2: ( ( ( (lv_variable_0_0= ruleVariable ) ) | ( (lv_integer_1_0= RULE_INT ) ) ) ( (otherlv_2= '-' | otherlv_3= '+' ) ( ( (lv_variable_4_0= ruleVariable ) ) | ( (lv_integerEnd1_5_0= RULE_INT ) ) ) )? otherlv_6= ',' ( ( (lv_variable_7_0= ruleVariable ) ) | ( (lv_integerEnd2_8_0= RULE_INT ) ) ) ( (otherlv_9= '-' | otherlv_10= '+' ) ( ( (lv_variable_11_0= ruleVariable ) ) | ( (lv_integerEnd3_12_0= RULE_INT ) ) ) )? )
            {
            // InternalGrammar.g:3245:2: ( ( ( (lv_variable_0_0= ruleVariable ) ) | ( (lv_integer_1_0= RULE_INT ) ) ) ( (otherlv_2= '-' | otherlv_3= '+' ) ( ( (lv_variable_4_0= ruleVariable ) ) | ( (lv_integerEnd1_5_0= RULE_INT ) ) ) )? otherlv_6= ',' ( ( (lv_variable_7_0= ruleVariable ) ) | ( (lv_integerEnd2_8_0= RULE_INT ) ) ) ( (otherlv_9= '-' | otherlv_10= '+' ) ( ( (lv_variable_11_0= ruleVariable ) ) | ( (lv_integerEnd3_12_0= RULE_INT ) ) ) )? )
            // InternalGrammar.g:3246:3: ( ( (lv_variable_0_0= ruleVariable ) ) | ( (lv_integer_1_0= RULE_INT ) ) ) ( (otherlv_2= '-' | otherlv_3= '+' ) ( ( (lv_variable_4_0= ruleVariable ) ) | ( (lv_integerEnd1_5_0= RULE_INT ) ) ) )? otherlv_6= ',' ( ( (lv_variable_7_0= ruleVariable ) ) | ( (lv_integerEnd2_8_0= RULE_INT ) ) ) ( (otherlv_9= '-' | otherlv_10= '+' ) ( ( (lv_variable_11_0= ruleVariable ) ) | ( (lv_integerEnd3_12_0= RULE_INT ) ) ) )?
            {
            // InternalGrammar.g:3246:3: ( ( (lv_variable_0_0= ruleVariable ) ) | ( (lv_integer_1_0= RULE_INT ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==21) ) {
                alt54=1;
            }
            else if ( (LA54_0==RULE_INT) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalGrammar.g:3247:4: ( (lv_variable_0_0= ruleVariable ) )
                    {
                    // InternalGrammar.g:3247:4: ( (lv_variable_0_0= ruleVariable ) )
                    // InternalGrammar.g:3248:5: (lv_variable_0_0= ruleVariable )
                    {
                    // InternalGrammar.g:3248:5: (lv_variable_0_0= ruleVariable )
                    // InternalGrammar.g:3249:6: lv_variable_0_0= ruleVariable
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
                    // InternalGrammar.g:3267:4: ( (lv_integer_1_0= RULE_INT ) )
                    {
                    // InternalGrammar.g:3267:4: ( (lv_integer_1_0= RULE_INT ) )
                    // InternalGrammar.g:3268:5: (lv_integer_1_0= RULE_INT )
                    {
                    // InternalGrammar.g:3268:5: (lv_integer_1_0= RULE_INT )
                    // InternalGrammar.g:3269:6: lv_integer_1_0= RULE_INT
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

            // InternalGrammar.g:3286:3: ( (otherlv_2= '-' | otherlv_3= '+' ) ( ( (lv_variable_4_0= ruleVariable ) ) | ( (lv_integerEnd1_5_0= RULE_INT ) ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=41 && LA57_0<=42)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalGrammar.g:3287:4: (otherlv_2= '-' | otherlv_3= '+' ) ( ( (lv_variable_4_0= ruleVariable ) ) | ( (lv_integerEnd1_5_0= RULE_INT ) ) )
                    {
                    // InternalGrammar.g:3287:4: (otherlv_2= '-' | otherlv_3= '+' )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==41) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==42) ) {
                        alt55=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalGrammar.g:3288:5: otherlv_2= '-'
                            {
                            otherlv_2=(Token)match(input,41,FOLLOW_9); 

                            					newLeafNode(otherlv_2, grammarAccess.getArgument2Access().getHyphenMinusKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalGrammar.g:3293:5: otherlv_3= '+'
                            {
                            otherlv_3=(Token)match(input,42,FOLLOW_9); 

                            					newLeafNode(otherlv_3, grammarAccess.getArgument2Access().getPlusSignKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    // InternalGrammar.g:3298:4: ( ( (lv_variable_4_0= ruleVariable ) ) | ( (lv_integerEnd1_5_0= RULE_INT ) ) )
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==21) ) {
                        alt56=1;
                    }
                    else if ( (LA56_0==RULE_INT) ) {
                        alt56=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 0, input);

                        throw nvae;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalGrammar.g:3299:5: ( (lv_variable_4_0= ruleVariable ) )
                            {
                            // InternalGrammar.g:3299:5: ( (lv_variable_4_0= ruleVariable ) )
                            // InternalGrammar.g:3300:6: (lv_variable_4_0= ruleVariable )
                            {
                            // InternalGrammar.g:3300:6: (lv_variable_4_0= ruleVariable )
                            // InternalGrammar.g:3301:7: lv_variable_4_0= ruleVariable
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
                            // InternalGrammar.g:3319:5: ( (lv_integerEnd1_5_0= RULE_INT ) )
                            {
                            // InternalGrammar.g:3319:5: ( (lv_integerEnd1_5_0= RULE_INT ) )
                            // InternalGrammar.g:3320:6: (lv_integerEnd1_5_0= RULE_INT )
                            {
                            // InternalGrammar.g:3320:6: (lv_integerEnd1_5_0= RULE_INT )
                            // InternalGrammar.g:3321:7: lv_integerEnd1_5_0= RULE_INT
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
            		
            // InternalGrammar.g:3343:3: ( ( (lv_variable_7_0= ruleVariable ) ) | ( (lv_integerEnd2_8_0= RULE_INT ) ) )
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
                    // InternalGrammar.g:3344:4: ( (lv_variable_7_0= ruleVariable ) )
                    {
                    // InternalGrammar.g:3344:4: ( (lv_variable_7_0= ruleVariable ) )
                    // InternalGrammar.g:3345:5: (lv_variable_7_0= ruleVariable )
                    {
                    // InternalGrammar.g:3345:5: (lv_variable_7_0= ruleVariable )
                    // InternalGrammar.g:3346:6: lv_variable_7_0= ruleVariable
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
                    // InternalGrammar.g:3364:4: ( (lv_integerEnd2_8_0= RULE_INT ) )
                    {
                    // InternalGrammar.g:3364:4: ( (lv_integerEnd2_8_0= RULE_INT ) )
                    // InternalGrammar.g:3365:5: (lv_integerEnd2_8_0= RULE_INT )
                    {
                    // InternalGrammar.g:3365:5: (lv_integerEnd2_8_0= RULE_INT )
                    // InternalGrammar.g:3366:6: lv_integerEnd2_8_0= RULE_INT
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

            // InternalGrammar.g:3383:3: ( (otherlv_9= '-' | otherlv_10= '+' ) ( ( (lv_variable_11_0= ruleVariable ) ) | ( (lv_integerEnd3_12_0= RULE_INT ) ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=41 && LA61_0<=42)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalGrammar.g:3384:4: (otherlv_9= '-' | otherlv_10= '+' ) ( ( (lv_variable_11_0= ruleVariable ) ) | ( (lv_integerEnd3_12_0= RULE_INT ) ) )
                    {
                    // InternalGrammar.g:3384:4: (otherlv_9= '-' | otherlv_10= '+' )
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==41) ) {
                        alt59=1;
                    }
                    else if ( (LA59_0==42) ) {
                        alt59=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 0, input);

                        throw nvae;
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalGrammar.g:3385:5: otherlv_9= '-'
                            {
                            otherlv_9=(Token)match(input,41,FOLLOW_9); 

                            					newLeafNode(otherlv_9, grammarAccess.getArgument2Access().getHyphenMinusKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalGrammar.g:3390:5: otherlv_10= '+'
                            {
                            otherlv_10=(Token)match(input,42,FOLLOW_9); 

                            					newLeafNode(otherlv_10, grammarAccess.getArgument2Access().getPlusSignKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalGrammar.g:3395:4: ( ( (lv_variable_11_0= ruleVariable ) ) | ( (lv_integerEnd3_12_0= RULE_INT ) ) )
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
                            // InternalGrammar.g:3396:5: ( (lv_variable_11_0= ruleVariable ) )
                            {
                            // InternalGrammar.g:3396:5: ( (lv_variable_11_0= ruleVariable ) )
                            // InternalGrammar.g:3397:6: (lv_variable_11_0= ruleVariable )
                            {
                            // InternalGrammar.g:3397:6: (lv_variable_11_0= ruleVariable )
                            // InternalGrammar.g:3398:7: lv_variable_11_0= ruleVariable
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
                            // InternalGrammar.g:3416:5: ( (lv_integerEnd3_12_0= RULE_INT ) )
                            {
                            // InternalGrammar.g:3416:5: ( (lv_integerEnd3_12_0= RULE_INT ) )
                            // InternalGrammar.g:3417:6: (lv_integerEnd3_12_0= RULE_INT )
                            {
                            // InternalGrammar.g:3417:6: (lv_integerEnd3_12_0= RULE_INT )
                            // InternalGrammar.g:3418:7: lv_integerEnd3_12_0= RULE_INT
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


    // $ANTLR start "entryRuleClassVariable"
    // InternalGrammar.g:3440:1: entryRuleClassVariable returns [EObject current=null] : iv_ruleClassVariable= ruleClassVariable EOF ;
    public final EObject entryRuleClassVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassVariable = null;


        try {
            // InternalGrammar.g:3440:54: (iv_ruleClassVariable= ruleClassVariable EOF )
            // InternalGrammar.g:3441:2: iv_ruleClassVariable= ruleClassVariable EOF
            {
             newCompositeNode(grammarAccess.getClassVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassVariable=ruleClassVariable();

            state._fsp--;

             current =iv_ruleClassVariable; 
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
    // $ANTLR end "entryRuleClassVariable"


    // $ANTLR start "ruleClassVariable"
    // InternalGrammar.g:3447:1: ruleClassVariable returns [EObject current=null] : (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleClassVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGrammar.g:3453:2: ( (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGrammar.g:3454:2: (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGrammar.g:3454:2: (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGrammar.g:3455:3: otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getClassVariableAccess().getFullStopKeyword_0());
            		
            // InternalGrammar.g:3459:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrammar.g:3460:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrammar.g:3460:4: (lv_name_1_0= RULE_ID )
            // InternalGrammar.g:3461:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getClassVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassVariableRule());
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
    // $ANTLR end "ruleClassVariable"


    // $ANTLR start "entryRuleConditional"
    // InternalGrammar.g:3481:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // InternalGrammar.g:3481:52: (iv_ruleConditional= ruleConditional EOF )
            // InternalGrammar.g:3482:2: iv_ruleConditional= ruleConditional EOF
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
    // InternalGrammar.g:3488:1: ruleConditional returns [EObject current=null] : ( ( (lv_ifCondition_0_0= ruleIfCondition ) ) ( (lv_elseCondion_1_0= ruleElseCondition ) )* ) ;
    public final EObject ruleConditional() throws RecognitionException {
        EObject current = null;

        EObject lv_ifCondition_0_0 = null;

        EObject lv_elseCondion_1_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:3494:2: ( ( ( (lv_ifCondition_0_0= ruleIfCondition ) ) ( (lv_elseCondion_1_0= ruleElseCondition ) )* ) )
            // InternalGrammar.g:3495:2: ( ( (lv_ifCondition_0_0= ruleIfCondition ) ) ( (lv_elseCondion_1_0= ruleElseCondition ) )* )
            {
            // InternalGrammar.g:3495:2: ( ( (lv_ifCondition_0_0= ruleIfCondition ) ) ( (lv_elseCondion_1_0= ruleElseCondition ) )* )
            // InternalGrammar.g:3496:3: ( (lv_ifCondition_0_0= ruleIfCondition ) ) ( (lv_elseCondion_1_0= ruleElseCondition ) )*
            {
            // InternalGrammar.g:3496:3: ( (lv_ifCondition_0_0= ruleIfCondition ) )
            // InternalGrammar.g:3497:4: (lv_ifCondition_0_0= ruleIfCondition )
            {
            // InternalGrammar.g:3497:4: (lv_ifCondition_0_0= ruleIfCondition )
            // InternalGrammar.g:3498:5: lv_ifCondition_0_0= ruleIfCondition
            {

            					newCompositeNode(grammarAccess.getConditionalAccess().getIfConditionIfConditionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_46);
            lv_ifCondition_0_0=ruleIfCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalRule());
            					}
            					set(
            						current,
            						"ifCondition",
            						lv_ifCondition_0_0,
            						"org.xtext.example.Grammar.IfCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGrammar.g:3515:3: ( (lv_elseCondion_1_0= ruleElseCondition ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==45) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalGrammar.g:3516:4: (lv_elseCondion_1_0= ruleElseCondition )
            	    {
            	    // InternalGrammar.g:3516:4: (lv_elseCondion_1_0= ruleElseCondition )
            	    // InternalGrammar.g:3517:5: lv_elseCondion_1_0= ruleElseCondition
            	    {

            	    					newCompositeNode(grammarAccess.getConditionalAccess().getElseCondionElseConditionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_46);
            	    lv_elseCondion_1_0=ruleElseCondition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConditionalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elseCondion",
            	    						lv_elseCondion_1_0,
            	    						"org.xtext.example.Grammar.ElseCondition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
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
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleIfCondition"
    // InternalGrammar.g:3538:1: entryRuleIfCondition returns [EObject current=null] : iv_ruleIfCondition= ruleIfCondition EOF ;
    public final EObject entryRuleIfCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfCondition = null;


        try {
            // InternalGrammar.g:3538:52: (iv_ruleIfCondition= ruleIfCondition EOF )
            // InternalGrammar.g:3539:2: iv_ruleIfCondition= ruleIfCondition EOF
            {
             newCompositeNode(grammarAccess.getIfConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfCondition=ruleIfCondition();

            state._fsp--;

             current =iv_ruleIfCondition; 
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
    // $ANTLR end "entryRuleIfCondition"


    // $ANTLR start "ruleIfCondition"
    // InternalGrammar.g:3545:1: ruleIfCondition returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleCondition1 ) ) otherlv_3= ')' otherlv_4= 'then' otherlv_5= '{' ( (lv_otherElement_6_0= ruleOtherElement ) )* otherlv_7= '}' ) ;
    public final EObject ruleIfCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_condition_2_0 = null;

        EObject lv_otherElement_6_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:3551:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleCondition1 ) ) otherlv_3= ')' otherlv_4= 'then' otherlv_5= '{' ( (lv_otherElement_6_0= ruleOtherElement ) )* otherlv_7= '}' ) )
            // InternalGrammar.g:3552:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleCondition1 ) ) otherlv_3= ')' otherlv_4= 'then' otherlv_5= '{' ( (lv_otherElement_6_0= ruleOtherElement ) )* otherlv_7= '}' )
            {
            // InternalGrammar.g:3552:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleCondition1 ) ) otherlv_3= ')' otherlv_4= 'then' otherlv_5= '{' ( (lv_otherElement_6_0= ruleOtherElement ) )* otherlv_7= '}' )
            // InternalGrammar.g:3553:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleCondition1 ) ) otherlv_3= ')' otherlv_4= 'then' otherlv_5= '{' ( (lv_otherElement_6_0= ruleOtherElement ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getIfConditionAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getIfConditionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGrammar.g:3561:3: ( (lv_condition_2_0= ruleCondition1 ) )
            // InternalGrammar.g:3562:4: (lv_condition_2_0= ruleCondition1 )
            {
            // InternalGrammar.g:3562:4: (lv_condition_2_0= ruleCondition1 )
            // InternalGrammar.g:3563:5: lv_condition_2_0= ruleCondition1
            {

            					newCompositeNode(grammarAccess.getIfConditionAccess().getConditionCondition1ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_condition_2_0=ruleCondition1();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfConditionRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"org.xtext.example.Grammar.Condition1");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_48); 

            			newLeafNode(otherlv_3, grammarAccess.getIfConditionAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,44,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getIfConditionAccess().getThenKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_49); 

            			newLeafNode(otherlv_5, grammarAccess.getIfConditionAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalGrammar.g:3592:3: ( (lv_otherElement_6_0= ruleOtherElement ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( ((LA63_0>=21 && LA63_0<=22)||(LA63_0>=29 && LA63_0<=30)||LA63_0==43||LA63_0==50) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalGrammar.g:3593:4: (lv_otherElement_6_0= ruleOtherElement )
            	    {
            	    // InternalGrammar.g:3593:4: (lv_otherElement_6_0= ruleOtherElement )
            	    // InternalGrammar.g:3594:5: lv_otherElement_6_0= ruleOtherElement
            	    {

            	    					newCompositeNode(grammarAccess.getIfConditionAccess().getOtherElementOtherElementParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_49);
            	    lv_otherElement_6_0=ruleOtherElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIfConditionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"otherElement",
            	    						lv_otherElement_6_0,
            	    						"org.xtext.example.Grammar.OtherElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getIfConditionAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleIfCondition"


    // $ANTLR start "entryRuleElseCondition"
    // InternalGrammar.g:3619:1: entryRuleElseCondition returns [EObject current=null] : iv_ruleElseCondition= ruleElseCondition EOF ;
    public final EObject entryRuleElseCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseCondition = null;


        try {
            // InternalGrammar.g:3619:54: (iv_ruleElseCondition= ruleElseCondition EOF )
            // InternalGrammar.g:3620:2: iv_ruleElseCondition= ruleElseCondition EOF
            {
             newCompositeNode(grammarAccess.getElseConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElseCondition=ruleElseCondition();

            state._fsp--;

             current =iv_ruleElseCondition; 
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
    // $ANTLR end "entryRuleElseCondition"


    // $ANTLR start "ruleElseCondition"
    // InternalGrammar.g:3626:1: ruleElseCondition returns [EObject current=null] : (otherlv_0= 'else' ( (otherlv_1= '{' ( (lv_OtherElement_2_0= ruleOtherElement ) ) otherlv_3= '}' ) | ( (lv_ifCondition_4_0= ruleIfCondition ) ) ) ) ;
    public final EObject ruleElseCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_OtherElement_2_0 = null;

        EObject lv_ifCondition_4_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:3632:2: ( (otherlv_0= 'else' ( (otherlv_1= '{' ( (lv_OtherElement_2_0= ruleOtherElement ) ) otherlv_3= '}' ) | ( (lv_ifCondition_4_0= ruleIfCondition ) ) ) ) )
            // InternalGrammar.g:3633:2: (otherlv_0= 'else' ( (otherlv_1= '{' ( (lv_OtherElement_2_0= ruleOtherElement ) ) otherlv_3= '}' ) | ( (lv_ifCondition_4_0= ruleIfCondition ) ) ) )
            {
            // InternalGrammar.g:3633:2: (otherlv_0= 'else' ( (otherlv_1= '{' ( (lv_OtherElement_2_0= ruleOtherElement ) ) otherlv_3= '}' ) | ( (lv_ifCondition_4_0= ruleIfCondition ) ) ) )
            // InternalGrammar.g:3634:3: otherlv_0= 'else' ( (otherlv_1= '{' ( (lv_OtherElement_2_0= ruleOtherElement ) ) otherlv_3= '}' ) | ( (lv_ifCondition_4_0= ruleIfCondition ) ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_50); 

            			newLeafNode(otherlv_0, grammarAccess.getElseConditionAccess().getElseKeyword_0());
            		
            // InternalGrammar.g:3638:3: ( (otherlv_1= '{' ( (lv_OtherElement_2_0= ruleOtherElement ) ) otherlv_3= '}' ) | ( (lv_ifCondition_4_0= ruleIfCondition ) ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==12) ) {
                alt64=1;
            }
            else if ( (LA64_0==43) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalGrammar.g:3639:4: (otherlv_1= '{' ( (lv_OtherElement_2_0= ruleOtherElement ) ) otherlv_3= '}' )
                    {
                    // InternalGrammar.g:3639:4: (otherlv_1= '{' ( (lv_OtherElement_2_0= ruleOtherElement ) ) otherlv_3= '}' )
                    // InternalGrammar.g:3640:5: otherlv_1= '{' ( (lv_OtherElement_2_0= ruleOtherElement ) ) otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_51); 

                    					newLeafNode(otherlv_1, grammarAccess.getElseConditionAccess().getLeftCurlyBracketKeyword_1_0_0());
                    				
                    // InternalGrammar.g:3644:5: ( (lv_OtherElement_2_0= ruleOtherElement ) )
                    // InternalGrammar.g:3645:6: (lv_OtherElement_2_0= ruleOtherElement )
                    {
                    // InternalGrammar.g:3645:6: (lv_OtherElement_2_0= ruleOtherElement )
                    // InternalGrammar.g:3646:7: lv_OtherElement_2_0= ruleOtherElement
                    {

                    							newCompositeNode(grammarAccess.getElseConditionAccess().getOtherElementOtherElementParserRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_52);
                    lv_OtherElement_2_0=ruleOtherElement();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getElseConditionRule());
                    							}
                    							add(
                    								current,
                    								"OtherElement",
                    								lv_OtherElement_2_0,
                    								"org.xtext.example.Grammar.OtherElement");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,14,FOLLOW_2); 

                    					newLeafNode(otherlv_3, grammarAccess.getElseConditionAccess().getRightCurlyBracketKeyword_1_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalGrammar.g:3669:4: ( (lv_ifCondition_4_0= ruleIfCondition ) )
                    {
                    // InternalGrammar.g:3669:4: ( (lv_ifCondition_4_0= ruleIfCondition ) )
                    // InternalGrammar.g:3670:5: (lv_ifCondition_4_0= ruleIfCondition )
                    {
                    // InternalGrammar.g:3670:5: (lv_ifCondition_4_0= ruleIfCondition )
                    // InternalGrammar.g:3671:6: lv_ifCondition_4_0= ruleIfCondition
                    {

                    						newCompositeNode(grammarAccess.getElseConditionAccess().getIfConditionIfConditionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ifCondition_4_0=ruleIfCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElseConditionRule());
                    						}
                    						set(
                    							current,
                    							"ifCondition",
                    							lv_ifCondition_4_0,
                    							"org.xtext.example.Grammar.IfCondition");
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
    // $ANTLR end "ruleElseCondition"


    // $ANTLR start "entryRuleCondition1"
    // InternalGrammar.g:3693:1: entryRuleCondition1 returns [EObject current=null] : iv_ruleCondition1= ruleCondition1 EOF ;
    public final EObject entryRuleCondition1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition1 = null;


        try {
            // InternalGrammar.g:3693:51: (iv_ruleCondition1= ruleCondition1 EOF )
            // InternalGrammar.g:3694:2: iv_ruleCondition1= ruleCondition1 EOF
            {
             newCompositeNode(grammarAccess.getCondition1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition1=ruleCondition1();

            state._fsp--;

             current =iv_ruleCondition1; 
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
    // $ANTLR end "entryRuleCondition1"


    // $ANTLR start "ruleCondition1"
    // InternalGrammar.g:3700:1: ruleCondition1 returns [EObject current=null] : ( ( (lv_firstPart_0_0= rulePart ) ) ( (lv_compare_1_0= ruleCompare ) ) ( (lv_secondPart_2_0= rulePart ) ) ) ;
    public final EObject ruleCondition1() throws RecognitionException {
        EObject current = null;

        EObject lv_firstPart_0_0 = null;

        AntlrDatatypeRuleToken lv_compare_1_0 = null;

        EObject lv_secondPart_2_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:3706:2: ( ( ( (lv_firstPart_0_0= rulePart ) ) ( (lv_compare_1_0= ruleCompare ) ) ( (lv_secondPart_2_0= rulePart ) ) ) )
            // InternalGrammar.g:3707:2: ( ( (lv_firstPart_0_0= rulePart ) ) ( (lv_compare_1_0= ruleCompare ) ) ( (lv_secondPart_2_0= rulePart ) ) )
            {
            // InternalGrammar.g:3707:2: ( ( (lv_firstPart_0_0= rulePart ) ) ( (lv_compare_1_0= ruleCompare ) ) ( (lv_secondPart_2_0= rulePart ) ) )
            // InternalGrammar.g:3708:3: ( (lv_firstPart_0_0= rulePart ) ) ( (lv_compare_1_0= ruleCompare ) ) ( (lv_secondPart_2_0= rulePart ) )
            {
            // InternalGrammar.g:3708:3: ( (lv_firstPart_0_0= rulePart ) )
            // InternalGrammar.g:3709:4: (lv_firstPart_0_0= rulePart )
            {
            // InternalGrammar.g:3709:4: (lv_firstPart_0_0= rulePart )
            // InternalGrammar.g:3710:5: lv_firstPart_0_0= rulePart
            {

            					newCompositeNode(grammarAccess.getCondition1Access().getFirstPartPartParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_53);
            lv_firstPart_0_0=rulePart();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCondition1Rule());
            					}
            					set(
            						current,
            						"firstPart",
            						lv_firstPart_0_0,
            						"org.xtext.example.Grammar.Part");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGrammar.g:3727:3: ( (lv_compare_1_0= ruleCompare ) )
            // InternalGrammar.g:3728:4: (lv_compare_1_0= ruleCompare )
            {
            // InternalGrammar.g:3728:4: (lv_compare_1_0= ruleCompare )
            // InternalGrammar.g:3729:5: lv_compare_1_0= ruleCompare
            {

            					newCompositeNode(grammarAccess.getCondition1Access().getCompareCompareParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_47);
            lv_compare_1_0=ruleCompare();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCondition1Rule());
            					}
            					set(
            						current,
            						"compare",
            						lv_compare_1_0,
            						"org.xtext.example.Grammar.Compare");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGrammar.g:3746:3: ( (lv_secondPart_2_0= rulePart ) )
            // InternalGrammar.g:3747:4: (lv_secondPart_2_0= rulePart )
            {
            // InternalGrammar.g:3747:4: (lv_secondPart_2_0= rulePart )
            // InternalGrammar.g:3748:5: lv_secondPart_2_0= rulePart
            {

            					newCompositeNode(grammarAccess.getCondition1Access().getSecondPartPartParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_secondPart_2_0=rulePart();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCondition1Rule());
            					}
            					set(
            						current,
            						"secondPart",
            						lv_secondPart_2_0,
            						"org.xtext.example.Grammar.Part");
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
    // $ANTLR end "ruleCondition1"


    // $ANTLR start "entryRulePart"
    // InternalGrammar.g:3769:1: entryRulePart returns [EObject current=null] : iv_rulePart= rulePart EOF ;
    public final EObject entryRulePart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePart = null;


        try {
            // InternalGrammar.g:3769:45: (iv_rulePart= rulePart EOF )
            // InternalGrammar.g:3770:2: iv_rulePart= rulePart EOF
            {
             newCompositeNode(grammarAccess.getPartRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePart=rulePart();

            state._fsp--;

             current =iv_rulePart; 
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
    // $ANTLR end "entryRulePart"


    // $ANTLR start "rulePart"
    // InternalGrammar.g:3776:1: rulePart returns [EObject current=null] : ( ( ( (lv_variable_0_0= ruleVariable ) ) ( (lv_objectC_1_0= ruleObjectC ) )? ( (lv_arrayC_2_0= ruleArrayC ) )? ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_integer_4_0= RULE_INT ) ) | ( (lv_superVariable_5_0= ruleSuperVariable ) ) | ( (lv_classVariable_6_0= ruleClassVariable ) ) ) ;
    public final EObject rulePart() throws RecognitionException {
        EObject current = null;

        Token lv_string_3_0=null;
        Token lv_integer_4_0=null;
        EObject lv_variable_0_0 = null;

        EObject lv_objectC_1_0 = null;

        EObject lv_arrayC_2_0 = null;

        EObject lv_superVariable_5_0 = null;

        EObject lv_classVariable_6_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:3782:2: ( ( ( ( (lv_variable_0_0= ruleVariable ) ) ( (lv_objectC_1_0= ruleObjectC ) )? ( (lv_arrayC_2_0= ruleArrayC ) )? ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_integer_4_0= RULE_INT ) ) | ( (lv_superVariable_5_0= ruleSuperVariable ) ) | ( (lv_classVariable_6_0= ruleClassVariable ) ) ) )
            // InternalGrammar.g:3783:2: ( ( ( (lv_variable_0_0= ruleVariable ) ) ( (lv_objectC_1_0= ruleObjectC ) )? ( (lv_arrayC_2_0= ruleArrayC ) )? ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_integer_4_0= RULE_INT ) ) | ( (lv_superVariable_5_0= ruleSuperVariable ) ) | ( (lv_classVariable_6_0= ruleClassVariable ) ) )
            {
            // InternalGrammar.g:3783:2: ( ( ( (lv_variable_0_0= ruleVariable ) ) ( (lv_objectC_1_0= ruleObjectC ) )? ( (lv_arrayC_2_0= ruleArrayC ) )? ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_integer_4_0= RULE_INT ) ) | ( (lv_superVariable_5_0= ruleSuperVariable ) ) | ( (lv_classVariable_6_0= ruleClassVariable ) ) )
            int alt67=5;
            switch ( input.LA(1) ) {
            case 21:
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
            case RULE_ID:
                {
                alt67=4;
                }
                break;
            case 31:
                {
                alt67=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // InternalGrammar.g:3784:3: ( ( (lv_variable_0_0= ruleVariable ) ) ( (lv_objectC_1_0= ruleObjectC ) )? ( (lv_arrayC_2_0= ruleArrayC ) )? )
                    {
                    // InternalGrammar.g:3784:3: ( ( (lv_variable_0_0= ruleVariable ) ) ( (lv_objectC_1_0= ruleObjectC ) )? ( (lv_arrayC_2_0= ruleArrayC ) )? )
                    // InternalGrammar.g:3785:4: ( (lv_variable_0_0= ruleVariable ) ) ( (lv_objectC_1_0= ruleObjectC ) )? ( (lv_arrayC_2_0= ruleArrayC ) )?
                    {
                    // InternalGrammar.g:3785:4: ( (lv_variable_0_0= ruleVariable ) )
                    // InternalGrammar.g:3786:5: (lv_variable_0_0= ruleVariable )
                    {
                    // InternalGrammar.g:3786:5: (lv_variable_0_0= ruleVariable )
                    // InternalGrammar.g:3787:6: lv_variable_0_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getPartAccess().getVariableVariableParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_variable_0_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPartRule());
                    						}
                    						set(
                    							current,
                    							"variable",
                    							lv_variable_0_0,
                    							"org.xtext.example.Grammar.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGrammar.g:3804:4: ( (lv_objectC_1_0= ruleObjectC ) )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==31) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // InternalGrammar.g:3805:5: (lv_objectC_1_0= ruleObjectC )
                            {
                            // InternalGrammar.g:3805:5: (lv_objectC_1_0= ruleObjectC )
                            // InternalGrammar.g:3806:6: lv_objectC_1_0= ruleObjectC
                            {

                            						newCompositeNode(grammarAccess.getPartAccess().getObjectCObjectCParserRuleCall_0_1_0());
                            					
                            pushFollow(FOLLOW_43);
                            lv_objectC_1_0=ruleObjectC();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getPartRule());
                            						}
                            						set(
                            							current,
                            							"objectC",
                            							lv_objectC_1_0,
                            							"org.xtext.example.Grammar.ObjectC");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalGrammar.g:3823:4: ( (lv_arrayC_2_0= ruleArrayC ) )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==16) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // InternalGrammar.g:3824:5: (lv_arrayC_2_0= ruleArrayC )
                            {
                            // InternalGrammar.g:3824:5: (lv_arrayC_2_0= ruleArrayC )
                            // InternalGrammar.g:3825:6: lv_arrayC_2_0= ruleArrayC
                            {

                            						newCompositeNode(grammarAccess.getPartAccess().getArrayCArrayCParserRuleCall_0_2_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_arrayC_2_0=ruleArrayC();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getPartRule());
                            						}
                            						set(
                            							current,
                            							"arrayC",
                            							lv_arrayC_2_0,
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
                    // InternalGrammar.g:3844:3: ( (lv_string_3_0= RULE_STRING ) )
                    {
                    // InternalGrammar.g:3844:3: ( (lv_string_3_0= RULE_STRING ) )
                    // InternalGrammar.g:3845:4: (lv_string_3_0= RULE_STRING )
                    {
                    // InternalGrammar.g:3845:4: (lv_string_3_0= RULE_STRING )
                    // InternalGrammar.g:3846:5: lv_string_3_0= RULE_STRING
                    {
                    lv_string_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_string_3_0, grammarAccess.getPartAccess().getStringSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPartRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"string",
                    						lv_string_3_0,
                    						"org.xtext.example.Grammar.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGrammar.g:3863:3: ( (lv_integer_4_0= RULE_INT ) )
                    {
                    // InternalGrammar.g:3863:3: ( (lv_integer_4_0= RULE_INT ) )
                    // InternalGrammar.g:3864:4: (lv_integer_4_0= RULE_INT )
                    {
                    // InternalGrammar.g:3864:4: (lv_integer_4_0= RULE_INT )
                    // InternalGrammar.g:3865:5: lv_integer_4_0= RULE_INT
                    {
                    lv_integer_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_integer_4_0, grammarAccess.getPartAccess().getIntegerINTTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPartRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"integer",
                    						lv_integer_4_0,
                    						"org.xtext.example.Grammar.INT");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGrammar.g:3882:3: ( (lv_superVariable_5_0= ruleSuperVariable ) )
                    {
                    // InternalGrammar.g:3882:3: ( (lv_superVariable_5_0= ruleSuperVariable ) )
                    // InternalGrammar.g:3883:4: (lv_superVariable_5_0= ruleSuperVariable )
                    {
                    // InternalGrammar.g:3883:4: (lv_superVariable_5_0= ruleSuperVariable )
                    // InternalGrammar.g:3884:5: lv_superVariable_5_0= ruleSuperVariable
                    {

                    					newCompositeNode(grammarAccess.getPartAccess().getSuperVariableSuperVariableParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_superVariable_5_0=ruleSuperVariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPartRule());
                    					}
                    					set(
                    						current,
                    						"superVariable",
                    						lv_superVariable_5_0,
                    						"org.xtext.example.Grammar.SuperVariable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalGrammar.g:3902:3: ( (lv_classVariable_6_0= ruleClassVariable ) )
                    {
                    // InternalGrammar.g:3902:3: ( (lv_classVariable_6_0= ruleClassVariable ) )
                    // InternalGrammar.g:3903:4: (lv_classVariable_6_0= ruleClassVariable )
                    {
                    // InternalGrammar.g:3903:4: (lv_classVariable_6_0= ruleClassVariable )
                    // InternalGrammar.g:3904:5: lv_classVariable_6_0= ruleClassVariable
                    {

                    					newCompositeNode(grammarAccess.getPartAccess().getClassVariableClassVariableParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_classVariable_6_0=ruleClassVariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPartRule());
                    					}
                    					set(
                    						current,
                    						"classVariable",
                    						lv_classVariable_6_0,
                    						"org.xtext.example.Grammar.ClassVariable");
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
    // $ANTLR end "rulePart"


    // $ANTLR start "entryRuleCompare"
    // InternalGrammar.g:3925:1: entryRuleCompare returns [String current=null] : iv_ruleCompare= ruleCompare EOF ;
    public final String entryRuleCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompare = null;


        try {
            // InternalGrammar.g:3925:47: (iv_ruleCompare= ruleCompare EOF )
            // InternalGrammar.g:3926:2: iv_ruleCompare= ruleCompare EOF
            {
             newCompositeNode(grammarAccess.getCompareRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompare=ruleCompare();

            state._fsp--;

             current =iv_ruleCompare.getText(); 
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
    // $ANTLR end "entryRuleCompare"


    // $ANTLR start "ruleCompare"
    // InternalGrammar.g:3932:1: ruleCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' | kw= '<' | kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGrammar.g:3938:2: ( (kw= '==' | kw= '!=' | kw= '<' | kw= '>' ) )
            // InternalGrammar.g:3939:2: (kw= '==' | kw= '!=' | kw= '<' | kw= '>' )
            {
            // InternalGrammar.g:3939:2: (kw= '==' | kw= '!=' | kw= '<' | kw= '>' )
            int alt68=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt68=1;
                }
                break;
            case 47:
                {
                alt68=2;
                }
                break;
            case 48:
                {
                alt68=3;
                }
                break;
            case 49:
                {
                alt68=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // InternalGrammar.g:3940:3: kw= '=='
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCompareAccess().getEqualsSignEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGrammar.g:3946:3: kw= '!='
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCompareAccess().getExclamationMarkEqualsSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalGrammar.g:3952:3: kw= '<'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCompareAccess().getLessThanSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalGrammar.g:3958:3: kw= '>'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCompareAccess().getGreaterThanSignKeyword_3());
                    		

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
    // $ANTLR end "ruleCompare"


    // $ANTLR start "entryRuleLoop"
    // InternalGrammar.g:3967:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalGrammar.g:3967:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalGrammar.g:3968:2: iv_ruleLoop= ruleLoop EOF
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
    // InternalGrammar.g:3974:1: ruleLoop returns [EObject current=null] : ( ( (lv_withLoop_0_0= ruleWith ) ) | ( (lv_forLoop_1_0= ruleFor ) ) ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        EObject lv_withLoop_0_0 = null;

        EObject lv_forLoop_1_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:3980:2: ( ( ( (lv_withLoop_0_0= ruleWith ) ) | ( (lv_forLoop_1_0= ruleFor ) ) ) )
            // InternalGrammar.g:3981:2: ( ( (lv_withLoop_0_0= ruleWith ) ) | ( (lv_forLoop_1_0= ruleFor ) ) )
            {
            // InternalGrammar.g:3981:2: ( ( (lv_withLoop_0_0= ruleWith ) ) | ( (lv_forLoop_1_0= ruleFor ) ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==50) ) {
                alt69=1;
            }
            else if ( (LA69_0==21) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalGrammar.g:3982:3: ( (lv_withLoop_0_0= ruleWith ) )
                    {
                    // InternalGrammar.g:3982:3: ( (lv_withLoop_0_0= ruleWith ) )
                    // InternalGrammar.g:3983:4: (lv_withLoop_0_0= ruleWith )
                    {
                    // InternalGrammar.g:3983:4: (lv_withLoop_0_0= ruleWith )
                    // InternalGrammar.g:3984:5: lv_withLoop_0_0= ruleWith
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
                    // InternalGrammar.g:4002:3: ( (lv_forLoop_1_0= ruleFor ) )
                    {
                    // InternalGrammar.g:4002:3: ( (lv_forLoop_1_0= ruleFor ) )
                    // InternalGrammar.g:4003:4: (lv_forLoop_1_0= ruleFor )
                    {
                    // InternalGrammar.g:4003:4: (lv_forLoop_1_0= ruleFor )
                    // InternalGrammar.g:4004:5: lv_forLoop_1_0= ruleFor
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
    // InternalGrammar.g:4025:1: entryRuleWith returns [EObject current=null] : iv_ruleWith= ruleWith EOF ;
    public final EObject entryRuleWith() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWith = null;


        try {
            // InternalGrammar.g:4025:45: (iv_ruleWith= ruleWith EOF )
            // InternalGrammar.g:4026:2: iv_ruleWith= ruleWith EOF
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
    // InternalGrammar.g:4032:1: ruleWith returns [EObject current=null] : (otherlv_0= 'with' ( (lv_init_1_0= ruleVariable ) ) otherlv_2= 'in' ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )? otherlv_6= '{' ( (lv_otherElement_7_0= ruleOtherElement ) )* otherlv_8= '}' ) ;
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
            // InternalGrammar.g:4038:2: ( (otherlv_0= 'with' ( (lv_init_1_0= ruleVariable ) ) otherlv_2= 'in' ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )? otherlv_6= '{' ( (lv_otherElement_7_0= ruleOtherElement ) )* otherlv_8= '}' ) )
            // InternalGrammar.g:4039:2: (otherlv_0= 'with' ( (lv_init_1_0= ruleVariable ) ) otherlv_2= 'in' ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )? otherlv_6= '{' ( (lv_otherElement_7_0= ruleOtherElement ) )* otherlv_8= '}' )
            {
            // InternalGrammar.g:4039:2: (otherlv_0= 'with' ( (lv_init_1_0= ruleVariable ) ) otherlv_2= 'in' ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )? otherlv_6= '{' ( (lv_otherElement_7_0= ruleOtherElement ) )* otherlv_8= '}' )
            // InternalGrammar.g:4040:3: otherlv_0= 'with' ( (lv_init_1_0= ruleVariable ) ) otherlv_2= 'in' ( (lv_variable_3_0= ruleVariable ) ) ( (lv_objectC_4_0= ruleObjectC ) )? ( (lv_arrayC_5_0= ruleArrayC ) )? otherlv_6= '{' ( (lv_otherElement_7_0= ruleOtherElement ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getWithAccess().getWithKeyword_0());
            		
            // InternalGrammar.g:4044:3: ( (lv_init_1_0= ruleVariable ) )
            // InternalGrammar.g:4045:4: (lv_init_1_0= ruleVariable )
            {
            // InternalGrammar.g:4045:4: (lv_init_1_0= ruleVariable )
            // InternalGrammar.g:4046:5: lv_init_1_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getWithAccess().getInitVariableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_54);
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

            otherlv_2=(Token)match(input,51,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getWithAccess().getInKeyword_2());
            		
            // InternalGrammar.g:4067:3: ( (lv_variable_3_0= ruleVariable ) )
            // InternalGrammar.g:4068:4: (lv_variable_3_0= ruleVariable )
            {
            // InternalGrammar.g:4068:4: (lv_variable_3_0= ruleVariable )
            // InternalGrammar.g:4069:5: lv_variable_3_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getWithAccess().getVariableVariableParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_55);
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

            // InternalGrammar.g:4086:3: ( (lv_objectC_4_0= ruleObjectC ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==31) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalGrammar.g:4087:4: (lv_objectC_4_0= ruleObjectC )
                    {
                    // InternalGrammar.g:4087:4: (lv_objectC_4_0= ruleObjectC )
                    // InternalGrammar.g:4088:5: lv_objectC_4_0= ruleObjectC
                    {

                    					newCompositeNode(grammarAccess.getWithAccess().getObjectCObjectCParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_56);
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

            // InternalGrammar.g:4105:3: ( (lv_arrayC_5_0= ruleArrayC ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==16) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalGrammar.g:4106:4: (lv_arrayC_5_0= ruleArrayC )
                    {
                    // InternalGrammar.g:4106:4: (lv_arrayC_5_0= ruleArrayC )
                    // InternalGrammar.g:4107:5: lv_arrayC_5_0= ruleArrayC
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

            otherlv_6=(Token)match(input,12,FOLLOW_49); 

            			newLeafNode(otherlv_6, grammarAccess.getWithAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalGrammar.g:4128:3: ( (lv_otherElement_7_0= ruleOtherElement ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( ((LA72_0>=21 && LA72_0<=22)||(LA72_0>=29 && LA72_0<=30)||LA72_0==43||LA72_0==50) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalGrammar.g:4129:4: (lv_otherElement_7_0= ruleOtherElement )
            	    {
            	    // InternalGrammar.g:4129:4: (lv_otherElement_7_0= ruleOtherElement )
            	    // InternalGrammar.g:4130:5: lv_otherElement_7_0= ruleOtherElement
            	    {

            	    					newCompositeNode(grammarAccess.getWithAccess().getOtherElementOtherElementParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_49);
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
            	    break loop72;
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
    // InternalGrammar.g:4155:1: entryRuleFor returns [EObject current=null] : iv_ruleFor= ruleFor EOF ;
    public final EObject entryRuleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor = null;


        try {
            // InternalGrammar.g:4155:44: (iv_ruleFor= ruleFor EOF )
            // InternalGrammar.g:4156:2: iv_ruleFor= ruleFor EOF
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
    // InternalGrammar.g:4162:1: ruleFor returns [EObject current=null] : ( ( (lv_increment_0_0= ruleVariable ) ) otherlv_1= 'from' ( ( (lv_initWithVariable_2_0= ruleVariable ) ) | ( (lv_initWithInteger_3_0= RULE_INT ) ) ) otherlv_4= 'to' ( ( ( (lv_endWithVariable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )? ) | ( (lv_endWithInteger_7_0= RULE_INT ) ) ) otherlv_8= '{' ( (lv_otherElement_9_0= ruleOtherElement ) )* otherlv_10= '}' ) ;
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
            // InternalGrammar.g:4168:2: ( ( ( (lv_increment_0_0= ruleVariable ) ) otherlv_1= 'from' ( ( (lv_initWithVariable_2_0= ruleVariable ) ) | ( (lv_initWithInteger_3_0= RULE_INT ) ) ) otherlv_4= 'to' ( ( ( (lv_endWithVariable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )? ) | ( (lv_endWithInteger_7_0= RULE_INT ) ) ) otherlv_8= '{' ( (lv_otherElement_9_0= ruleOtherElement ) )* otherlv_10= '}' ) )
            // InternalGrammar.g:4169:2: ( ( (lv_increment_0_0= ruleVariable ) ) otherlv_1= 'from' ( ( (lv_initWithVariable_2_0= ruleVariable ) ) | ( (lv_initWithInteger_3_0= RULE_INT ) ) ) otherlv_4= 'to' ( ( ( (lv_endWithVariable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )? ) | ( (lv_endWithInteger_7_0= RULE_INT ) ) ) otherlv_8= '{' ( (lv_otherElement_9_0= ruleOtherElement ) )* otherlv_10= '}' )
            {
            // InternalGrammar.g:4169:2: ( ( (lv_increment_0_0= ruleVariable ) ) otherlv_1= 'from' ( ( (lv_initWithVariable_2_0= ruleVariable ) ) | ( (lv_initWithInteger_3_0= RULE_INT ) ) ) otherlv_4= 'to' ( ( ( (lv_endWithVariable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )? ) | ( (lv_endWithInteger_7_0= RULE_INT ) ) ) otherlv_8= '{' ( (lv_otherElement_9_0= ruleOtherElement ) )* otherlv_10= '}' )
            // InternalGrammar.g:4170:3: ( (lv_increment_0_0= ruleVariable ) ) otherlv_1= 'from' ( ( (lv_initWithVariable_2_0= ruleVariable ) ) | ( (lv_initWithInteger_3_0= RULE_INT ) ) ) otherlv_4= 'to' ( ( ( (lv_endWithVariable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )? ) | ( (lv_endWithInteger_7_0= RULE_INT ) ) ) otherlv_8= '{' ( (lv_otherElement_9_0= ruleOtherElement ) )* otherlv_10= '}'
            {
            // InternalGrammar.g:4170:3: ( (lv_increment_0_0= ruleVariable ) )
            // InternalGrammar.g:4171:4: (lv_increment_0_0= ruleVariable )
            {
            // InternalGrammar.g:4171:4: (lv_increment_0_0= ruleVariable )
            // InternalGrammar.g:4172:5: lv_increment_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getForAccess().getIncrementVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_57);
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

            otherlv_1=(Token)match(input,52,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getForAccess().getFromKeyword_1());
            		
            // InternalGrammar.g:4193:3: ( ( (lv_initWithVariable_2_0= ruleVariable ) ) | ( (lv_initWithInteger_3_0= RULE_INT ) ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==21) ) {
                alt73=1;
            }
            else if ( (LA73_0==RULE_INT) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalGrammar.g:4194:4: ( (lv_initWithVariable_2_0= ruleVariable ) )
                    {
                    // InternalGrammar.g:4194:4: ( (lv_initWithVariable_2_0= ruleVariable ) )
                    // InternalGrammar.g:4195:5: (lv_initWithVariable_2_0= ruleVariable )
                    {
                    // InternalGrammar.g:4195:5: (lv_initWithVariable_2_0= ruleVariable )
                    // InternalGrammar.g:4196:6: lv_initWithVariable_2_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getForAccess().getInitWithVariableVariableParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_58);
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
                    // InternalGrammar.g:4214:4: ( (lv_initWithInteger_3_0= RULE_INT ) )
                    {
                    // InternalGrammar.g:4214:4: ( (lv_initWithInteger_3_0= RULE_INT ) )
                    // InternalGrammar.g:4215:5: (lv_initWithInteger_3_0= RULE_INT )
                    {
                    // InternalGrammar.g:4215:5: (lv_initWithInteger_3_0= RULE_INT )
                    // InternalGrammar.g:4216:6: lv_initWithInteger_3_0= RULE_INT
                    {
                    lv_initWithInteger_3_0=(Token)match(input,RULE_INT,FOLLOW_58); 

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

            otherlv_4=(Token)match(input,53,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getForAccess().getToKeyword_3());
            		
            // InternalGrammar.g:4237:3: ( ( ( (lv_endWithVariable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )? ) | ( (lv_endWithInteger_7_0= RULE_INT ) ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==21) ) {
                alt75=1;
            }
            else if ( (LA75_0==RULE_INT) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalGrammar.g:4238:4: ( ( (lv_endWithVariable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )? )
                    {
                    // InternalGrammar.g:4238:4: ( ( (lv_endWithVariable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )? )
                    // InternalGrammar.g:4239:5: ( (lv_endWithVariable_5_0= ruleVariable ) ) ( (lv_objectC_6_0= ruleObjectC ) )?
                    {
                    // InternalGrammar.g:4239:5: ( (lv_endWithVariable_5_0= ruleVariable ) )
                    // InternalGrammar.g:4240:6: (lv_endWithVariable_5_0= ruleVariable )
                    {
                    // InternalGrammar.g:4240:6: (lv_endWithVariable_5_0= ruleVariable )
                    // InternalGrammar.g:4241:7: lv_endWithVariable_5_0= ruleVariable
                    {

                    							newCompositeNode(grammarAccess.getForAccess().getEndWithVariableVariableParserRuleCall_4_0_0_0());
                    						
                    pushFollow(FOLLOW_59);
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

                    // InternalGrammar.g:4258:5: ( (lv_objectC_6_0= ruleObjectC ) )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==31) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalGrammar.g:4259:6: (lv_objectC_6_0= ruleObjectC )
                            {
                            // InternalGrammar.g:4259:6: (lv_objectC_6_0= ruleObjectC )
                            // InternalGrammar.g:4260:7: lv_objectC_6_0= ruleObjectC
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
                    // InternalGrammar.g:4279:4: ( (lv_endWithInteger_7_0= RULE_INT ) )
                    {
                    // InternalGrammar.g:4279:4: ( (lv_endWithInteger_7_0= RULE_INT ) )
                    // InternalGrammar.g:4280:5: (lv_endWithInteger_7_0= RULE_INT )
                    {
                    // InternalGrammar.g:4280:5: (lv_endWithInteger_7_0= RULE_INT )
                    // InternalGrammar.g:4281:6: lv_endWithInteger_7_0= RULE_INT
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

            otherlv_8=(Token)match(input,12,FOLLOW_49); 

            			newLeafNode(otherlv_8, grammarAccess.getForAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalGrammar.g:4302:3: ( (lv_otherElement_9_0= ruleOtherElement ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( ((LA76_0>=21 && LA76_0<=22)||(LA76_0>=29 && LA76_0<=30)||LA76_0==43||LA76_0==50) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalGrammar.g:4303:4: (lv_otherElement_9_0= ruleOtherElement )
            	    {
            	    // InternalGrammar.g:4303:4: (lv_otherElement_9_0= ruleOtherElement )
            	    // InternalGrammar.g:4304:5: lv_otherElement_9_0= ruleOtherElement
            	    {

            	    					newCompositeNode(grammarAccess.getForAccess().getOtherElementOtherElementParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_49);
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
            	    break loop76;
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
    // InternalGrammar.g:4329:1: entryRuleOtherElement returns [EObject current=null] : iv_ruleOtherElement= ruleOtherElement EOF ;
    public final EObject entryRuleOtherElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherElement = null;


        try {
            // InternalGrammar.g:4329:53: (iv_ruleOtherElement= ruleOtherElement EOF )
            // InternalGrammar.g:4330:2: iv_ruleOtherElement= ruleOtherElement EOF
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
    // InternalGrammar.g:4336:1: ruleOtherElement returns [EObject current=null] : ( ( (lv_page_0_0= rulePage ) ) | ( (lv_row_1_0= ruleRow ) ) | ( (lv_col_2_0= ruleCol ) ) | ( (lv_loop_3_0= ruleLoop ) ) | ( (lv_conditional_4_0= ruleConditional ) ) ) ;
    public final EObject ruleOtherElement() throws RecognitionException {
        EObject current = null;

        EObject lv_page_0_0 = null;

        EObject lv_row_1_0 = null;

        EObject lv_col_2_0 = null;

        EObject lv_loop_3_0 = null;

        EObject lv_conditional_4_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:4342:2: ( ( ( (lv_page_0_0= rulePage ) ) | ( (lv_row_1_0= ruleRow ) ) | ( (lv_col_2_0= ruleCol ) ) | ( (lv_loop_3_0= ruleLoop ) ) | ( (lv_conditional_4_0= ruleConditional ) ) ) )
            // InternalGrammar.g:4343:2: ( ( (lv_page_0_0= rulePage ) ) | ( (lv_row_1_0= ruleRow ) ) | ( (lv_col_2_0= ruleCol ) ) | ( (lv_loop_3_0= ruleLoop ) ) | ( (lv_conditional_4_0= ruleConditional ) ) )
            {
            // InternalGrammar.g:4343:2: ( ( (lv_page_0_0= rulePage ) ) | ( (lv_row_1_0= ruleRow ) ) | ( (lv_col_2_0= ruleCol ) ) | ( (lv_loop_3_0= ruleLoop ) ) | ( (lv_conditional_4_0= ruleConditional ) ) )
            int alt77=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt77=1;
                }
                break;
            case 29:
                {
                alt77=2;
                }
                break;
            case 30:
                {
                alt77=3;
                }
                break;
            case 21:
            case 50:
                {
                alt77=4;
                }
                break;
            case 43:
                {
                alt77=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // InternalGrammar.g:4344:3: ( (lv_page_0_0= rulePage ) )
                    {
                    // InternalGrammar.g:4344:3: ( (lv_page_0_0= rulePage ) )
                    // InternalGrammar.g:4345:4: (lv_page_0_0= rulePage )
                    {
                    // InternalGrammar.g:4345:4: (lv_page_0_0= rulePage )
                    // InternalGrammar.g:4346:5: lv_page_0_0= rulePage
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
                    // InternalGrammar.g:4364:3: ( (lv_row_1_0= ruleRow ) )
                    {
                    // InternalGrammar.g:4364:3: ( (lv_row_1_0= ruleRow ) )
                    // InternalGrammar.g:4365:4: (lv_row_1_0= ruleRow )
                    {
                    // InternalGrammar.g:4365:4: (lv_row_1_0= ruleRow )
                    // InternalGrammar.g:4366:5: lv_row_1_0= ruleRow
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
                    // InternalGrammar.g:4384:3: ( (lv_col_2_0= ruleCol ) )
                    {
                    // InternalGrammar.g:4384:3: ( (lv_col_2_0= ruleCol ) )
                    // InternalGrammar.g:4385:4: (lv_col_2_0= ruleCol )
                    {
                    // InternalGrammar.g:4385:4: (lv_col_2_0= ruleCol )
                    // InternalGrammar.g:4386:5: lv_col_2_0= ruleCol
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
                    // InternalGrammar.g:4404:3: ( (lv_loop_3_0= ruleLoop ) )
                    {
                    // InternalGrammar.g:4404:3: ( (lv_loop_3_0= ruleLoop ) )
                    // InternalGrammar.g:4405:4: (lv_loop_3_0= ruleLoop )
                    {
                    // InternalGrammar.g:4405:4: (lv_loop_3_0= ruleLoop )
                    // InternalGrammar.g:4406:5: lv_loop_3_0= ruleLoop
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
                    // InternalGrammar.g:4424:3: ( (lv_conditional_4_0= ruleConditional ) )
                    {
                    // InternalGrammar.g:4424:3: ( (lv_conditional_4_0= ruleConditional ) )
                    // InternalGrammar.g:4425:4: (lv_conditional_4_0= ruleConditional )
                    {
                    // InternalGrammar.g:4425:4: (lv_conditional_4_0= ruleConditional )
                    // InternalGrammar.g:4426:5: lv_conditional_4_0= ruleConditional
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
    // InternalGrammar.g:4447:1: entryRuleStyle returns [EObject current=null] : iv_ruleStyle= ruleStyle EOF ;
    public final EObject entryRuleStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyle = null;


        try {
            // InternalGrammar.g:4447:46: (iv_ruleStyle= ruleStyle EOF )
            // InternalGrammar.g:4448:2: iv_ruleStyle= ruleStyle EOF
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
    // InternalGrammar.g:4454:1: ruleStyle returns [EObject current=null] : (otherlv_0= 'style' otherlv_1= '{' ( (lv_css_2_0= ruleCss ) ) otherlv_3= '}' ) ;
    public final EObject ruleStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_css_2_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:4460:2: ( (otherlv_0= 'style' otherlv_1= '{' ( (lv_css_2_0= ruleCss ) ) otherlv_3= '}' ) )
            // InternalGrammar.g:4461:2: (otherlv_0= 'style' otherlv_1= '{' ( (lv_css_2_0= ruleCss ) ) otherlv_3= '}' )
            {
            // InternalGrammar.g:4461:2: (otherlv_0= 'style' otherlv_1= '{' ( (lv_css_2_0= ruleCss ) ) otherlv_3= '}' )
            // InternalGrammar.g:4462:3: otherlv_0= 'style' otherlv_1= '{' ( (lv_css_2_0= ruleCss ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getStyleAccess().getStyleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_60); 

            			newLeafNode(otherlv_1, grammarAccess.getStyleAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGrammar.g:4470:3: ( (lv_css_2_0= ruleCss ) )
            // InternalGrammar.g:4471:4: (lv_css_2_0= ruleCss )
            {
            // InternalGrammar.g:4471:4: (lv_css_2_0= ruleCss )
            // InternalGrammar.g:4472:5: lv_css_2_0= ruleCss
            {

            					newCompositeNode(grammarAccess.getStyleAccess().getCssCssParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_52);
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
    // InternalGrammar.g:4497:1: entryRuleCss returns [EObject current=null] : iv_ruleCss= ruleCss EOF ;
    public final EObject entryRuleCss() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCss = null;


        try {
            // InternalGrammar.g:4497:44: (iv_ruleCss= ruleCss EOF )
            // InternalGrammar.g:4498:2: iv_ruleCss= ruleCss EOF
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
    // InternalGrammar.g:4504:1: ruleCss returns [EObject current=null] : ( (lv_rules_0_0= ruleRule ) )* ;
    public final EObject ruleCss() throws RecognitionException {
        EObject current = null;

        EObject lv_rules_0_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:4510:2: ( ( (lv_rules_0_0= ruleRule ) )* )
            // InternalGrammar.g:4511:2: ( (lv_rules_0_0= ruleRule ) )*
            {
            // InternalGrammar.g:4511:2: ( (lv_rules_0_0= ruleRule ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==RULE_ID||LA78_0==31||LA78_0==55) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalGrammar.g:4512:3: (lv_rules_0_0= ruleRule )
            	    {
            	    // InternalGrammar.g:4512:3: (lv_rules_0_0= ruleRule )
            	    // InternalGrammar.g:4513:4: lv_rules_0_0= ruleRule
            	    {

            	    				newCompositeNode(grammarAccess.getCssAccess().getRulesRuleParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_61);
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
            	    break loop78;
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
    // InternalGrammar.g:4533:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalGrammar.g:4533:45: (iv_ruleRule= ruleRule EOF )
            // InternalGrammar.g:4534:2: iv_ruleRule= ruleRule EOF
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
    // InternalGrammar.g:4540:1: ruleRule returns [EObject current=null] : ( ( (lv_selector_0_0= ruleSelector ) ) otherlv_1= '{' ( (lv_declarations_2_0= ruleDeclaration ) )* otherlv_3= '}' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_selector_0_0 = null;

        EObject lv_declarations_2_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:4546:2: ( ( ( (lv_selector_0_0= ruleSelector ) ) otherlv_1= '{' ( (lv_declarations_2_0= ruleDeclaration ) )* otherlv_3= '}' ) )
            // InternalGrammar.g:4547:2: ( ( (lv_selector_0_0= ruleSelector ) ) otherlv_1= '{' ( (lv_declarations_2_0= ruleDeclaration ) )* otherlv_3= '}' )
            {
            // InternalGrammar.g:4547:2: ( ( (lv_selector_0_0= ruleSelector ) ) otherlv_1= '{' ( (lv_declarations_2_0= ruleDeclaration ) )* otherlv_3= '}' )
            // InternalGrammar.g:4548:3: ( (lv_selector_0_0= ruleSelector ) ) otherlv_1= '{' ( (lv_declarations_2_0= ruleDeclaration ) )* otherlv_3= '}'
            {
            // InternalGrammar.g:4548:3: ( (lv_selector_0_0= ruleSelector ) )
            // InternalGrammar.g:4549:4: (lv_selector_0_0= ruleSelector )
            {
            // InternalGrammar.g:4549:4: (lv_selector_0_0= ruleSelector )
            // InternalGrammar.g:4550:5: lv_selector_0_0= ruleSelector
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

            otherlv_1=(Token)match(input,12,FOLLOW_62); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGrammar.g:4571:3: ( (lv_declarations_2_0= ruleDeclaration ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==RULE_ID) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalGrammar.g:4572:4: (lv_declarations_2_0= ruleDeclaration )
            	    {
            	    // InternalGrammar.g:4572:4: (lv_declarations_2_0= ruleDeclaration )
            	    // InternalGrammar.g:4573:5: lv_declarations_2_0= ruleDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getRuleAccess().getDeclarationsDeclarationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_62);
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
            	    break loop79;
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
    // InternalGrammar.g:4598:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalGrammar.g:4598:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalGrammar.g:4599:2: iv_ruleSelector= ruleSelector EOF
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
    // InternalGrammar.g:4605:1: ruleSelector returns [EObject current=null] : ( ( (lv_idSelector_0_0= ruleIDSelector ) ) | ( (lv_classSelector_1_0= ruleClassSelector ) ) | ( (lv_typeSelector_2_0= ruleTypeSelector ) ) ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        EObject lv_idSelector_0_0 = null;

        EObject lv_classSelector_1_0 = null;

        EObject lv_typeSelector_2_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:4611:2: ( ( ( (lv_idSelector_0_0= ruleIDSelector ) ) | ( (lv_classSelector_1_0= ruleClassSelector ) ) | ( (lv_typeSelector_2_0= ruleTypeSelector ) ) ) )
            // InternalGrammar.g:4612:2: ( ( (lv_idSelector_0_0= ruleIDSelector ) ) | ( (lv_classSelector_1_0= ruleClassSelector ) ) | ( (lv_typeSelector_2_0= ruleTypeSelector ) ) )
            {
            // InternalGrammar.g:4612:2: ( ( (lv_idSelector_0_0= ruleIDSelector ) ) | ( (lv_classSelector_1_0= ruleClassSelector ) ) | ( (lv_typeSelector_2_0= ruleTypeSelector ) ) )
            int alt80=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt80=1;
                }
                break;
            case 31:
                {
                alt80=2;
                }
                break;
            case RULE_ID:
                {
                alt80=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // InternalGrammar.g:4613:3: ( (lv_idSelector_0_0= ruleIDSelector ) )
                    {
                    // InternalGrammar.g:4613:3: ( (lv_idSelector_0_0= ruleIDSelector ) )
                    // InternalGrammar.g:4614:4: (lv_idSelector_0_0= ruleIDSelector )
                    {
                    // InternalGrammar.g:4614:4: (lv_idSelector_0_0= ruleIDSelector )
                    // InternalGrammar.g:4615:5: lv_idSelector_0_0= ruleIDSelector
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
                    // InternalGrammar.g:4633:3: ( (lv_classSelector_1_0= ruleClassSelector ) )
                    {
                    // InternalGrammar.g:4633:3: ( (lv_classSelector_1_0= ruleClassSelector ) )
                    // InternalGrammar.g:4634:4: (lv_classSelector_1_0= ruleClassSelector )
                    {
                    // InternalGrammar.g:4634:4: (lv_classSelector_1_0= ruleClassSelector )
                    // InternalGrammar.g:4635:5: lv_classSelector_1_0= ruleClassSelector
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
                    // InternalGrammar.g:4653:3: ( (lv_typeSelector_2_0= ruleTypeSelector ) )
                    {
                    // InternalGrammar.g:4653:3: ( (lv_typeSelector_2_0= ruleTypeSelector ) )
                    // InternalGrammar.g:4654:4: (lv_typeSelector_2_0= ruleTypeSelector )
                    {
                    // InternalGrammar.g:4654:4: (lv_typeSelector_2_0= ruleTypeSelector )
                    // InternalGrammar.g:4655:5: lv_typeSelector_2_0= ruleTypeSelector
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
    // InternalGrammar.g:4676:1: entryRuleIDSelector returns [EObject current=null] : iv_ruleIDSelector= ruleIDSelector EOF ;
    public final EObject entryRuleIDSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIDSelector = null;


        try {
            // InternalGrammar.g:4676:51: (iv_ruleIDSelector= ruleIDSelector EOF )
            // InternalGrammar.g:4677:2: iv_ruleIDSelector= ruleIDSelector EOF
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
    // InternalGrammar.g:4683:1: ruleIDSelector returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleIDSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGrammar.g:4689:2: ( (otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGrammar.g:4690:2: (otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGrammar.g:4690:2: (otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGrammar.g:4691:3: otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getIDSelectorAccess().getNumberSignKeyword_0());
            		
            // InternalGrammar.g:4695:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrammar.g:4696:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrammar.g:4696:4: (lv_name_1_0= RULE_ID )
            // InternalGrammar.g:4697:5: lv_name_1_0= RULE_ID
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
    // InternalGrammar.g:4717:1: entryRuleClassSelector returns [EObject current=null] : iv_ruleClassSelector= ruleClassSelector EOF ;
    public final EObject entryRuleClassSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassSelector = null;


        try {
            // InternalGrammar.g:4717:54: (iv_ruleClassSelector= ruleClassSelector EOF )
            // InternalGrammar.g:4718:2: iv_ruleClassSelector= ruleClassSelector EOF
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
    // InternalGrammar.g:4724:1: ruleClassSelector returns [EObject current=null] : (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleClassSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGrammar.g:4730:2: ( (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGrammar.g:4731:2: (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGrammar.g:4731:2: (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGrammar.g:4732:3: otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getClassSelectorAccess().getFullStopKeyword_0());
            		
            // InternalGrammar.g:4736:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrammar.g:4737:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrammar.g:4737:4: (lv_name_1_0= RULE_ID )
            // InternalGrammar.g:4738:5: lv_name_1_0= RULE_ID
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
    // InternalGrammar.g:4758:1: entryRuleTypeSelector returns [EObject current=null] : iv_ruleTypeSelector= ruleTypeSelector EOF ;
    public final EObject entryRuleTypeSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSelector = null;


        try {
            // InternalGrammar.g:4758:53: (iv_ruleTypeSelector= ruleTypeSelector EOF )
            // InternalGrammar.g:4759:2: iv_ruleTypeSelector= ruleTypeSelector EOF
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
    // InternalGrammar.g:4765:1: ruleTypeSelector returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleTypeSelector() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalGrammar.g:4771:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalGrammar.g:4772:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalGrammar.g:4772:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalGrammar.g:4773:3: (lv_name_0_0= RULE_ID )
            {
            // InternalGrammar.g:4773:3: (lv_name_0_0= RULE_ID )
            // InternalGrammar.g:4774:4: lv_name_0_0= RULE_ID
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
    // InternalGrammar.g:4793:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalGrammar.g:4793:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalGrammar.g:4794:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // InternalGrammar.g:4800:1: ruleDeclaration returns [EObject current=null] : ( ( (lv_property_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_cssValue_2_0= ruleCssValue ) )+ otherlv_3= ';' ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_property_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_cssValue_2_0 = null;



        	enterRule();

        try {
            // InternalGrammar.g:4806:2: ( ( ( (lv_property_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_cssValue_2_0= ruleCssValue ) )+ otherlv_3= ';' ) )
            // InternalGrammar.g:4807:2: ( ( (lv_property_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_cssValue_2_0= ruleCssValue ) )+ otherlv_3= ';' )
            {
            // InternalGrammar.g:4807:2: ( ( (lv_property_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_cssValue_2_0= ruleCssValue ) )+ otherlv_3= ';' )
            // InternalGrammar.g:4808:3: ( (lv_property_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_cssValue_2_0= ruleCssValue ) )+ otherlv_3= ';'
            {
            // InternalGrammar.g:4808:3: ( (lv_property_0_0= RULE_ID ) )
            // InternalGrammar.g:4809:4: (lv_property_0_0= RULE_ID )
            {
            // InternalGrammar.g:4809:4: (lv_property_0_0= RULE_ID )
            // InternalGrammar.g:4810:5: lv_property_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,15,FOLLOW_63); 

            			newLeafNode(otherlv_1, grammarAccess.getDeclarationAccess().getColonKeyword_1());
            		
            // InternalGrammar.g:4830:3: ( (lv_cssValue_2_0= ruleCssValue ) )+
            int cnt81=0;
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( ((LA81_0>=RULE_STRING && LA81_0<=RULE_ID)||LA81_0==13||LA81_0==55||(LA81_0>=58 && LA81_0<=59)) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // InternalGrammar.g:4831:4: (lv_cssValue_2_0= ruleCssValue )
            	    {
            	    // InternalGrammar.g:4831:4: (lv_cssValue_2_0= ruleCssValue )
            	    // InternalGrammar.g:4832:5: lv_cssValue_2_0= ruleCssValue
            	    {

            	    					newCompositeNode(grammarAccess.getDeclarationAccess().getCssValueCssValueParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_64);
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
            	    if ( cnt81 >= 1 ) break loop81;
                        EarlyExitException eee =
                            new EarlyExitException(81, input);
                        throw eee;
                }
                cnt81++;
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
    // InternalGrammar.g:4857:1: entryRuleCssValue returns [EObject current=null] : iv_ruleCssValue= ruleCssValue EOF ;
    public final EObject entryRuleCssValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCssValue = null;


        try {
            // InternalGrammar.g:4857:49: (iv_ruleCssValue= ruleCssValue EOF )
            // InternalGrammar.g:4858:2: iv_ruleCssValue= ruleCssValue EOF
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
    // InternalGrammar.g:4864:1: ruleCssValue returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_integer_2_0= RULE_INT ) ) | ( (lv_coma_3_0= ruleCOMA ) ) | ( (lv_apostrophe_4_0= ruleAPOSTROPHE ) ) | ( (lv_hashtag_5_0= ruleHASHTAG ) ) | ( (lv_pourcent_6_0= rulePOURCENT ) ) ) ;
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
            // InternalGrammar.g:4870:2: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_integer_2_0= RULE_INT ) ) | ( (lv_coma_3_0= ruleCOMA ) ) | ( (lv_apostrophe_4_0= ruleAPOSTROPHE ) ) | ( (lv_hashtag_5_0= ruleHASHTAG ) ) | ( (lv_pourcent_6_0= rulePOURCENT ) ) ) )
            // InternalGrammar.g:4871:2: ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_integer_2_0= RULE_INT ) ) | ( (lv_coma_3_0= ruleCOMA ) ) | ( (lv_apostrophe_4_0= ruleAPOSTROPHE ) ) | ( (lv_hashtag_5_0= ruleHASHTAG ) ) | ( (lv_pourcent_6_0= rulePOURCENT ) ) )
            {
            // InternalGrammar.g:4871:2: ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_integer_2_0= RULE_INT ) ) | ( (lv_coma_3_0= ruleCOMA ) ) | ( (lv_apostrophe_4_0= ruleAPOSTROPHE ) ) | ( (lv_hashtag_5_0= ruleHASHTAG ) ) | ( (lv_pourcent_6_0= rulePOURCENT ) ) )
            int alt82=7;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt82=1;
                }
                break;
            case RULE_STRING:
                {
                alt82=2;
                }
                break;
            case RULE_INT:
                {
                alt82=3;
                }
                break;
            case 13:
                {
                alt82=4;
                }
                break;
            case 59:
                {
                alt82=5;
                }
                break;
            case 55:
                {
                alt82=6;
                }
                break;
            case 58:
                {
                alt82=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // InternalGrammar.g:4872:3: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // InternalGrammar.g:4872:3: ( (lv_name_0_0= RULE_ID ) )
                    // InternalGrammar.g:4873:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalGrammar.g:4873:4: (lv_name_0_0= RULE_ID )
                    // InternalGrammar.g:4874:5: lv_name_0_0= RULE_ID
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
                    // InternalGrammar.g:4891:3: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // InternalGrammar.g:4891:3: ( (lv_string_1_0= RULE_STRING ) )
                    // InternalGrammar.g:4892:4: (lv_string_1_0= RULE_STRING )
                    {
                    // InternalGrammar.g:4892:4: (lv_string_1_0= RULE_STRING )
                    // InternalGrammar.g:4893:5: lv_string_1_0= RULE_STRING
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
                    // InternalGrammar.g:4910:3: ( (lv_integer_2_0= RULE_INT ) )
                    {
                    // InternalGrammar.g:4910:3: ( (lv_integer_2_0= RULE_INT ) )
                    // InternalGrammar.g:4911:4: (lv_integer_2_0= RULE_INT )
                    {
                    // InternalGrammar.g:4911:4: (lv_integer_2_0= RULE_INT )
                    // InternalGrammar.g:4912:5: lv_integer_2_0= RULE_INT
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
                    // InternalGrammar.g:4929:3: ( (lv_coma_3_0= ruleCOMA ) )
                    {
                    // InternalGrammar.g:4929:3: ( (lv_coma_3_0= ruleCOMA ) )
                    // InternalGrammar.g:4930:4: (lv_coma_3_0= ruleCOMA )
                    {
                    // InternalGrammar.g:4930:4: (lv_coma_3_0= ruleCOMA )
                    // InternalGrammar.g:4931:5: lv_coma_3_0= ruleCOMA
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
                    // InternalGrammar.g:4949:3: ( (lv_apostrophe_4_0= ruleAPOSTROPHE ) )
                    {
                    // InternalGrammar.g:4949:3: ( (lv_apostrophe_4_0= ruleAPOSTROPHE ) )
                    // InternalGrammar.g:4950:4: (lv_apostrophe_4_0= ruleAPOSTROPHE )
                    {
                    // InternalGrammar.g:4950:4: (lv_apostrophe_4_0= ruleAPOSTROPHE )
                    // InternalGrammar.g:4951:5: lv_apostrophe_4_0= ruleAPOSTROPHE
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
                    // InternalGrammar.g:4969:3: ( (lv_hashtag_5_0= ruleHASHTAG ) )
                    {
                    // InternalGrammar.g:4969:3: ( (lv_hashtag_5_0= ruleHASHTAG ) )
                    // InternalGrammar.g:4970:4: (lv_hashtag_5_0= ruleHASHTAG )
                    {
                    // InternalGrammar.g:4970:4: (lv_hashtag_5_0= ruleHASHTAG )
                    // InternalGrammar.g:4971:5: lv_hashtag_5_0= ruleHASHTAG
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
                    // InternalGrammar.g:4989:3: ( (lv_pourcent_6_0= rulePOURCENT ) )
                    {
                    // InternalGrammar.g:4989:3: ( (lv_pourcent_6_0= rulePOURCENT ) )
                    // InternalGrammar.g:4990:4: (lv_pourcent_6_0= rulePOURCENT )
                    {
                    // InternalGrammar.g:4990:4: (lv_pourcent_6_0= rulePOURCENT )
                    // InternalGrammar.g:4991:5: lv_pourcent_6_0= rulePOURCENT
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
    // InternalGrammar.g:5012:1: entryRuleTRUE returns [String current=null] : iv_ruleTRUE= ruleTRUE EOF ;
    public final String entryRuleTRUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTRUE = null;


        try {
            // InternalGrammar.g:5012:44: (iv_ruleTRUE= ruleTRUE EOF )
            // InternalGrammar.g:5013:2: iv_ruleTRUE= ruleTRUE EOF
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
    // InternalGrammar.g:5019:1: ruleTRUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'true' ;
    public final AntlrDatatypeRuleToken ruleTRUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGrammar.g:5025:2: (kw= 'true' )
            // InternalGrammar.g:5026:2: kw= 'true'
            {
            kw=(Token)match(input,56,FOLLOW_2); 

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
    // InternalGrammar.g:5034:1: entryRuleFALSE returns [String current=null] : iv_ruleFALSE= ruleFALSE EOF ;
    public final String entryRuleFALSE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFALSE = null;


        try {
            // InternalGrammar.g:5034:45: (iv_ruleFALSE= ruleFALSE EOF )
            // InternalGrammar.g:5035:2: iv_ruleFALSE= ruleFALSE EOF
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
    // InternalGrammar.g:5041:1: ruleFALSE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'false' ;
    public final AntlrDatatypeRuleToken ruleFALSE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGrammar.g:5047:2: (kw= 'false' )
            // InternalGrammar.g:5048:2: kw= 'false'
            {
            kw=(Token)match(input,57,FOLLOW_2); 

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
    // InternalGrammar.g:5056:1: entryRuleHASHTAG returns [String current=null] : iv_ruleHASHTAG= ruleHASHTAG EOF ;
    public final String entryRuleHASHTAG() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHASHTAG = null;


        try {
            // InternalGrammar.g:5056:47: (iv_ruleHASHTAG= ruleHASHTAG EOF )
            // InternalGrammar.g:5057:2: iv_ruleHASHTAG= ruleHASHTAG EOF
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
    // InternalGrammar.g:5063:1: ruleHASHTAG returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '#' ;
    public final AntlrDatatypeRuleToken ruleHASHTAG() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGrammar.g:5069:2: (kw= '#' )
            // InternalGrammar.g:5070:2: kw= '#'
            {
            kw=(Token)match(input,55,FOLLOW_2); 

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
    // InternalGrammar.g:5078:1: entryRulePOURCENT returns [String current=null] : iv_rulePOURCENT= rulePOURCENT EOF ;
    public final String entryRulePOURCENT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePOURCENT = null;


        try {
            // InternalGrammar.g:5078:48: (iv_rulePOURCENT= rulePOURCENT EOF )
            // InternalGrammar.g:5079:2: iv_rulePOURCENT= rulePOURCENT EOF
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
    // InternalGrammar.g:5085:1: rulePOURCENT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '%' ;
    public final AntlrDatatypeRuleToken rulePOURCENT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGrammar.g:5091:2: (kw= '%' )
            // InternalGrammar.g:5092:2: kw= '%'
            {
            kw=(Token)match(input,58,FOLLOW_2); 

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
    // InternalGrammar.g:5100:1: entryRuleCOMA returns [String current=null] : iv_ruleCOMA= ruleCOMA EOF ;
    public final String entryRuleCOMA() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCOMA = null;


        try {
            // InternalGrammar.g:5100:44: (iv_ruleCOMA= ruleCOMA EOF )
            // InternalGrammar.g:5101:2: iv_ruleCOMA= ruleCOMA EOF
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
    // InternalGrammar.g:5107:1: ruleCOMA returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ',' ;
    public final AntlrDatatypeRuleToken ruleCOMA() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGrammar.g:5113:2: (kw= ',' )
            // InternalGrammar.g:5114:2: kw= ','
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
    // InternalGrammar.g:5122:1: entryRuleAPOSTROPHE returns [String current=null] : iv_ruleAPOSTROPHE= ruleAPOSTROPHE EOF ;
    public final String entryRuleAPOSTROPHE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAPOSTROPHE = null;


        try {
            // InternalGrammar.g:5122:50: (iv_ruleAPOSTROPHE= ruleAPOSTROPHE EOF )
            // InternalGrammar.g:5123:2: iv_ruleAPOSTROPHE= ruleAPOSTROPHE EOF
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
    // InternalGrammar.g:5129:1: ruleAPOSTROPHE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '\\'' ;
    public final AntlrDatatypeRuleToken ruleAPOSTROPHE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGrammar.g:5135:2: (kw= '\\'' )
            // InternalGrammar.g:5136:2: kw= '\\''
            {
            kw=(Token)match(input,59,FOLLOW_2); 

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
    // InternalGrammar.g:5144:1: entryRuleFloat returns [EObject current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final EObject entryRuleFloat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloat = null;


        try {
            // InternalGrammar.g:5144:46: (iv_ruleFloat= ruleFloat EOF )
            // InternalGrammar.g:5145:2: iv_ruleFloat= ruleFloat EOF
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
    // InternalGrammar.g:5151:1: ruleFloat returns [EObject current=null] : ( ( (lv_firstInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_secondInt_2_0= RULE_INT ) ) ) ;
    public final EObject ruleFloat() throws RecognitionException {
        EObject current = null;

        Token lv_firstInt_0_0=null;
        Token otherlv_1=null;
        Token lv_secondInt_2_0=null;


        	enterRule();

        try {
            // InternalGrammar.g:5157:2: ( ( ( (lv_firstInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_secondInt_2_0= RULE_INT ) ) ) )
            // InternalGrammar.g:5158:2: ( ( (lv_firstInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_secondInt_2_0= RULE_INT ) ) )
            {
            // InternalGrammar.g:5158:2: ( ( (lv_firstInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_secondInt_2_0= RULE_INT ) ) )
            // InternalGrammar.g:5159:3: ( (lv_firstInt_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_secondInt_2_0= RULE_INT ) )
            {
            // InternalGrammar.g:5159:3: ( (lv_firstInt_0_0= RULE_INT ) )
            // InternalGrammar.g:5160:4: (lv_firstInt_0_0= RULE_INT )
            {
            // InternalGrammar.g:5160:4: (lv_firstInt_0_0= RULE_INT )
            // InternalGrammar.g:5161:5: lv_firstInt_0_0= RULE_INT
            {
            lv_firstInt_0_0=(Token)match(input,RULE_INT,FOLLOW_65); 

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

            otherlv_1=(Token)match(input,31,FOLLOW_66); 

            			newLeafNode(otherlv_1, grammarAccess.getFloatAccess().getFullStopKeyword_1());
            		
            // InternalGrammar.g:5181:3: ( (lv_secondInt_2_0= RULE_INT ) )
            // InternalGrammar.g:5182:4: (lv_secondInt_2_0= RULE_INT )
            {
            // InternalGrammar.g:5182:4: (lv_secondInt_2_0= RULE_INT )
            // InternalGrammar.g:5183:5: lv_secondInt_2_0= RULE_INT
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
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\2\uffff\1\11\7\uffff";
    static final String dfa_3s = "\1\4\1\uffff\1\6\7\uffff";
    static final String dfa_4s = "\1\71\1\uffff\1\62\7\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\1\10\1\3\1\2";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\6\uffff\1\6\3\uffff\1\5\4\uffff\1\7\42\uffff\1\3\1\4",
            "",
            "\1\11\6\uffff\2\11\2\uffff\1\11\3\uffff\2\11\2\uffff\1\11\3\uffff\2\11\1\10\3\uffff\1\11\7\uffff\1\11\6\uffff\1\11",
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
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0300000000211030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0300000000231030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0304080000615070L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x030001C080211030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000081010000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x030408003C615070L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0304080020615070L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000880010000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800010000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0304080040615070L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x030001F180211070L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x030001C180211070L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000480010002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000400010002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0300000081211030L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0300000080211030L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000080010002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000060000002000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0300000080211070L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0304080060615070L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0304080000611070L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0304080060611070L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0003C00000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000080011000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000080001000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0080000080004040L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0080000080000042L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0C80000000002070L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0C80000002002070L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000020L});

}