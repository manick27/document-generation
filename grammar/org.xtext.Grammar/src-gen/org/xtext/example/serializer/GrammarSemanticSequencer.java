/*
 * generated by Xtext 2.35.0-SNAPSHOT
 */
package org.xtext.example.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.myDsl.Argument1;
import org.xtext.example.myDsl.Argument2;
import org.xtext.example.myDsl.Array;
import org.xtext.example.myDsl.ArrayC;
import org.xtext.example.myDsl.Build;
import org.xtext.example.myDsl.ClassD;
import org.xtext.example.myDsl.ClassSelector;
import org.xtext.example.myDsl.Col;
import org.xtext.example.myDsl.Colspan;
import org.xtext.example.myDsl.Conditional;
import org.xtext.example.myDsl.Css;
import org.xtext.example.myDsl.CssValue;
import org.xtext.example.myDsl.Data;
import org.xtext.example.myDsl.Declaration;
import org.xtext.example.myDsl.DivFunction;
import org.xtext.example.myDsl.Document;
import org.xtext.example.myDsl.ElementBuild;
import org.xtext.example.myDsl.ElementPage;
import org.xtext.example.myDsl.ElementRow;
import org.xtext.example.myDsl.EqualCondition;
import org.xtext.example.myDsl.For;
import org.xtext.example.myDsl.Function;
import org.xtext.example.myDsl.Fusion;
import org.xtext.example.myDsl.IDSelector;
import org.xtext.example.myDsl.Img;
import org.xtext.example.myDsl.KeyValue;
import org.xtext.example.myDsl.Loop;
import org.xtext.example.myDsl.Model;
import org.xtext.example.myDsl.MyDslPackage;
import org.xtext.example.myDsl.NestedObject;
import org.xtext.example.myDsl.NoEqualCondition;
import org.xtext.example.myDsl.ObjectC;
import org.xtext.example.myDsl.OtherElement;
import org.xtext.example.myDsl.Page;
import org.xtext.example.myDsl.Position;
import org.xtext.example.myDsl.ProdFunction;
import org.xtext.example.myDsl.Row;
import org.xtext.example.myDsl.Rowspan;
import org.xtext.example.myDsl.Rule;
import org.xtext.example.myDsl.Selector;
import org.xtext.example.myDsl.Style;
import org.xtext.example.myDsl.SumFunction;
import org.xtext.example.myDsl.TypeSelector;
import org.xtext.example.myDsl.Value;
import org.xtext.example.myDsl.Variable;
import org.xtext.example.myDsl.VariableD;
import org.xtext.example.myDsl.With;
import org.xtext.example.services.GrammarGrammarAccess;

@SuppressWarnings("all")
public class GrammarSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GrammarGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.ARGUMENT1:
				sequence_Argument1(context, (Argument1) semanticObject); 
				return; 
			case MyDslPackage.ARGUMENT2:
				sequence_Argument2(context, (Argument2) semanticObject); 
				return; 
			case MyDslPackage.ARRAY:
				sequence_Array(context, (Array) semanticObject); 
				return; 
			case MyDslPackage.ARRAY_C:
				sequence_ArrayC(context, (ArrayC) semanticObject); 
				return; 
			case MyDslPackage.BUILD:
				sequence_Build(context, (Build) semanticObject); 
				return; 
			case MyDslPackage.CLASS_D:
				sequence_ClassD(context, (ClassD) semanticObject); 
				return; 
			case MyDslPackage.CLASS_SELECTOR:
				sequence_ClassSelector(context, (ClassSelector) semanticObject); 
				return; 
			case MyDslPackage.COL:
				sequence_Col(context, (Col) semanticObject); 
				return; 
			case MyDslPackage.COLSPAN:
				sequence_Colspan(context, (Colspan) semanticObject); 
				return; 
			case MyDslPackage.CONDITIONAL:
				sequence_Conditional(context, (Conditional) semanticObject); 
				return; 
			case MyDslPackage.CSS:
				sequence_Css(context, (Css) semanticObject); 
				return; 
			case MyDslPackage.CSS_VALUE:
				sequence_CssValue(context, (CssValue) semanticObject); 
				return; 
			case MyDslPackage.DATA:
				sequence_Data(context, (Data) semanticObject); 
				return; 
			case MyDslPackage.DECLARATION:
				sequence_Declaration(context, (Declaration) semanticObject); 
				return; 
			case MyDslPackage.DIV_FUNCTION:
				sequence_DivFunction(context, (DivFunction) semanticObject); 
				return; 
			case MyDslPackage.DOCUMENT:
				sequence_Document(context, (Document) semanticObject); 
				return; 
			case MyDslPackage.ELEMENT_BUILD:
				sequence_ElementBuild(context, (ElementBuild) semanticObject); 
				return; 
			case MyDslPackage.ELEMENT_PAGE:
				sequence_ElementPage(context, (ElementPage) semanticObject); 
				return; 
			case MyDslPackage.ELEMENT_ROW:
				sequence_ElementRow(context, (ElementRow) semanticObject); 
				return; 
			case MyDslPackage.EQUAL_CONDITION:
				sequence_EqualCondition(context, (EqualCondition) semanticObject); 
				return; 
			case MyDslPackage.FLOAT:
				sequence_Float(context, (org.xtext.example.myDsl.Float) semanticObject); 
				return; 
			case MyDslPackage.FOR:
				sequence_For(context, (For) semanticObject); 
				return; 
			case MyDslPackage.FUNCTION:
				sequence_Function(context, (Function) semanticObject); 
				return; 
			case MyDslPackage.FUSION:
				sequence_Fusion(context, (Fusion) semanticObject); 
				return; 
			case MyDslPackage.ID_SELECTOR:
				sequence_IDSelector(context, (IDSelector) semanticObject); 
				return; 
			case MyDslPackage.IMG:
				sequence_Img(context, (Img) semanticObject); 
				return; 
			case MyDslPackage.KEY_VALUE:
				sequence_KeyValue(context, (KeyValue) semanticObject); 
				return; 
			case MyDslPackage.LOOP:
				sequence_Loop(context, (Loop) semanticObject); 
				return; 
			case MyDslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case MyDslPackage.NESTED_OBJECT:
				sequence_NestedObject(context, (NestedObject) semanticObject); 
				return; 
			case MyDslPackage.NO_EQUAL_CONDITION:
				sequence_NoEqualCondition(context, (NoEqualCondition) semanticObject); 
				return; 
			case MyDslPackage.OBJECT_C:
				sequence_ObjectC(context, (ObjectC) semanticObject); 
				return; 
			case MyDslPackage.OTHER_ELEMENT:
				sequence_OtherElement(context, (OtherElement) semanticObject); 
				return; 
			case MyDslPackage.PAGE:
				sequence_Page(context, (Page) semanticObject); 
				return; 
			case MyDslPackage.POSITION:
				sequence_Position(context, (Position) semanticObject); 
				return; 
			case MyDslPackage.PROD_FUNCTION:
				sequence_ProdFunction(context, (ProdFunction) semanticObject); 
				return; 
			case MyDslPackage.ROW:
				sequence_Row(context, (Row) semanticObject); 
				return; 
			case MyDslPackage.ROWSPAN:
				sequence_Rowspan(context, (Rowspan) semanticObject); 
				return; 
			case MyDslPackage.RULE:
				sequence_Rule(context, (Rule) semanticObject); 
				return; 
			case MyDslPackage.SELECTOR:
				sequence_Selector(context, (Selector) semanticObject); 
				return; 
			case MyDslPackage.STYLE:
				sequence_Style(context, (Style) semanticObject); 
				return; 
			case MyDslPackage.SUM_FUNCTION:
				sequence_SumFunction(context, (SumFunction) semanticObject); 
				return; 
			case MyDslPackage.TYPE_SELECTOR:
				sequence_TypeSelector(context, (TypeSelector) semanticObject); 
				return; 
			case MyDslPackage.VALUE:
				sequence_Value(context, (Value) semanticObject); 
				return; 
			case MyDslPackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			case MyDslPackage.VARIABLE_D:
				sequence_VariableD(context, (VariableD) semanticObject); 
				return; 
			case MyDslPackage.WITH:
				sequence_With(context, (With) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Argument1 returns Argument1
	 *
	 * Constraint:
	 *     (integer=INT | floatValue=Float | string=STRING | (variable=Variable objectC=ObjectC? arrayC=ArrayC?))
	 * </pre>
	 */
	protected void sequence_Argument1(ISerializationContext context, Argument1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Argument2 returns Argument2
	 *
	 * Constraint:
	 *     (
	 *         (variable+=Variable | integer=INT) 
	 *         (variable+=Variable | integerEnd1=INT)? 
	 *         (variable+=Variable | integerEnd2=INT) 
	 *         (variable+=Variable | integerEnd3=INT)?
	 *     )
	 * </pre>
	 */
	protected void sequence_Argument2(ISerializationContext context, Argument2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ArrayC returns ArrayC
	 *
	 * Constraint:
	 *     position=Position
	 * </pre>
	 */
	protected void sequence_ArrayC(ISerializationContext context, ArrayC semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ARRAY_C__POSITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ARRAY_C__POSITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getArrayCAccess().getPositionPositionParserRuleCall_1_0(), semanticObject.getPosition());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Array returns Array
	 *
	 * Constraint:
	 *     (values+=Value values+=Value*)
	 * </pre>
	 */
	protected void sequence_Array(ISerializationContext context, Array semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Build returns Build
	 *
	 * Constraint:
	 *     (variable=Variable allInOne='allInOne' (trueV=TRUE | falseF=FALSE) elementBuild+=ElementBuild*)
	 * </pre>
	 */
	protected void sequence_Build(ISerializationContext context, Build semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ClassD returns ClassD
	 *
	 * Constraint:
	 *     string=STRING
	 * </pre>
	 */
	protected void sequence_ClassD(ISerializationContext context, ClassD semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.CLASS_D__STRING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.CLASS_D__STRING));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getClassDAccess().getStringSTRINGTerminalRuleCall_2_0(), semanticObject.getString());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ClassSelector returns ClassSelector
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_ClassSelector(ISerializationContext context, ClassSelector semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.CLASS_SELECTOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.CLASS_SELECTOR__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getClassSelectorAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Col returns Col
	 *
	 * Constraint:
	 *     (
	 *         fusion=Fusion 
	 *         (
	 *             img=Img | 
	 *             (variable=Variable objectC=ObjectC? arrayC=ArrayC?) | 
	 *             variableD=VariableD | 
	 *             string=STRING | 
	 *             integer=INT | 
	 *             floatValue=Float | 
	 *             function=Function
	 *         ) 
	 *         classD=ClassD
	 *     )
	 * </pre>
	 */
	protected void sequence_Col(ISerializationContext context, Col semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Colspan returns Colspan
	 *
	 * Constraint:
	 *     (integer=INT | variable=Variable)
	 * </pre>
	 */
	protected void sequence_Colspan(ISerializationContext context, Colspan semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Conditional returns Conditional
	 *
	 * Constraint:
	 *     ((equalCondition=EqualCondition | notEqualCondition=NoEqualCondition) otherElement+=OtherElement*)
	 * </pre>
	 */
	protected void sequence_Conditional(ISerializationContext context, Conditional semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     CssValue returns CssValue
	 *
	 * Constraint:
	 *     (
	 *         name=ID | 
	 *         string=STRING | 
	 *         integer=INT | 
	 *         coma=COMA | 
	 *         apostrophe=APOSTROPHE | 
	 *         hashtag=HASHTAG | 
	 *         pourcent=POURCENT
	 *     )
	 * </pre>
	 */
	protected void sequence_CssValue(ISerializationContext context, CssValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Css returns Css
	 *
	 * Constraint:
	 *     rules+=Rule+
	 * </pre>
	 */
	protected void sequence_Css(ISerializationContext context, Css semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Data returns Data
	 *
	 * Constraint:
	 *     (keyValue+=KeyValue keyValue+=KeyValue*)
	 * </pre>
	 */
	protected void sequence_Data(ISerializationContext context, Data semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Declaration returns Declaration
	 *
	 * Constraint:
	 *     (property=ID cssValue+=CssValue+)
	 * </pre>
	 */
	protected void sequence_Declaration(ISerializationContext context, Declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DivFunction returns DivFunction
	 *
	 * Constraint:
	 *     (argument1+=Argument1 argument1+=Argument1)
	 * </pre>
	 */
	protected void sequence_DivFunction(ISerializationContext context, DivFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Document returns Document
	 *
	 * Constraint:
	 *     (data=Data? build=Build style=Style?)
	 * </pre>
	 */
	protected void sequence_Document(ISerializationContext context, Document semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ElementBuild returns ElementBuild
	 *
	 * Constraint:
	 *     (variableD=VariableD | page=Page | loop=Loop | conditional=Conditional)
	 * </pre>
	 */
	protected void sequence_ElementBuild(ISerializationContext context, ElementBuild semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ElementPage returns ElementPage
	 *
	 * Constraint:
	 *     (row=Row | loop=Loop | conditional=Conditional | variable=VariableD)
	 * </pre>
	 */
	protected void sequence_ElementPage(ISerializationContext context, ElementPage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ElementRow returns ElementRow
	 *
	 * Constraint:
	 *     (variable=Variable | variableD=VariableD | col=Col | conditional=Conditional | loop=Loop)
	 * </pre>
	 */
	protected void sequence_ElementRow(ISerializationContext context, ElementRow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EqualCondition returns EqualCondition
	 *
	 * Constraint:
	 *     (variable=Variable value=Value)
	 * </pre>
	 */
	protected void sequence_EqualCondition(ISerializationContext context, EqualCondition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.EQUAL_CONDITION__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.EQUAL_CONDITION__VARIABLE));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.EQUAL_CONDITION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.EQUAL_CONDITION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEqualConditionAccess().getVariableVariableParserRuleCall_0_0(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getEqualConditionAccess().getValueValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Float returns Float
	 *
	 * Constraint:
	 *     (firstInt=INT secondInt=INT)
	 * </pre>
	 */
	protected void sequence_Float(ISerializationContext context, org.xtext.example.myDsl.Float semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FLOAT__FIRST_INT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FLOAT__FIRST_INT));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FLOAT__SECOND_INT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FLOAT__SECOND_INT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFloatAccess().getFirstIntINTTerminalRuleCall_0_0(), semanticObject.getFirstInt());
		feeder.accept(grammarAccess.getFloatAccess().getSecondIntINTTerminalRuleCall_2_0(), semanticObject.getSecondInt());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     For returns For
	 *
	 * Constraint:
	 *     (
	 *         increment=Variable 
	 *         (initWithVariable=Variable | initWithInteger=INT) 
	 *         ((endWithVariable=Variable objectC=ObjectC?) | endWithInteger=INT) 
	 *         otherElement+=OtherElement*
	 *     )
	 * </pre>
	 */
	protected void sequence_For(ISerializationContext context, For semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Function returns Function
	 *
	 * Constraint:
	 *     (sumFunction=SumFunction | prodFunction=ProdFunction | divFunction=DivFunction)
	 * </pre>
	 */
	protected void sequence_Function(ISerializationContext context, Function semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Fusion returns Fusion
	 *
	 * Constraint:
	 *     (colspan=Colspan | rowspan=Rowspan)
	 * </pre>
	 */
	protected void sequence_Fusion(ISerializationContext context, Fusion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     IDSelector returns IDSelector
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_IDSelector(ISerializationContext context, IDSelector semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ID_SELECTOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ID_SELECTOR__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIDSelectorAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Img returns Img
	 *
	 * Constraint:
	 *     (classD=ClassD (string=STRING | (variable=Variable objectC=ObjectC? arrayC=ArrayC?)) stringAlt=STRING?)
	 * </pre>
	 */
	protected void sequence_Img(ISerializationContext context, Img semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     KeyValue returns KeyValue
	 *
	 * Constraint:
	 *     (string=STRING value=Value)
	 * </pre>
	 */
	protected void sequence_KeyValue(ISerializationContext context, KeyValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.KEY_VALUE__STRING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.KEY_VALUE__STRING));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.KEY_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.KEY_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getKeyValueAccess().getStringSTRINGTerminalRuleCall_0_0(), semanticObject.getString());
		feeder.accept(grammarAccess.getKeyValueAccess().getValueValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Loop returns Loop
	 *
	 * Constraint:
	 *     (withLoop=With | forLoop=For)
	 * </pre>
	 */
	protected void sequence_Loop(ISerializationContext context, Loop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     document+=Document
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NestedObject returns NestedObject
	 *
	 * Constraint:
	 *     (keyValue+=KeyValue keyValue+=KeyValue*)
	 * </pre>
	 */
	protected void sequence_NestedObject(ISerializationContext context, NestedObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NoEqualCondition returns NoEqualCondition
	 *
	 * Constraint:
	 *     (variable=Variable value=Value)
	 * </pre>
	 */
	protected void sequence_NoEqualCondition(ISerializationContext context, NoEqualCondition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.NO_EQUAL_CONDITION__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.NO_EQUAL_CONDITION__VARIABLE));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.NO_EQUAL_CONDITION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.NO_EQUAL_CONDITION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNoEqualConditionAccess().getVariableVariableParserRuleCall_0_0(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getNoEqualConditionAccess().getValueValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ObjectC returns ObjectC
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_ObjectC(ISerializationContext context, ObjectC semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.OBJECT_C__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.OBJECT_C__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getObjectCAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OtherElement returns OtherElement
	 *
	 * Constraint:
	 *     (page=Page | row=Row | col=Col | loop=Loop | conditional=Conditional)
	 * </pre>
	 */
	protected void sequence_OtherElement(ISerializationContext context, OtherElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Page returns Page
	 *
	 * Constraint:
	 *     (((variable=Variable objectC=ObjectC? arrayC=ArrayC?) | string=STRING) elementPage+=ElementPage*)
	 * </pre>
	 */
	protected void sequence_Page(ISerializationContext context, Page semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Position returns Position
	 *
	 * Constraint:
	 *     (integer=INT | variable=Variable)
	 * </pre>
	 */
	protected void sequence_Position(ISerializationContext context, Position semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProdFunction returns ProdFunction
	 *
	 * Constraint:
	 *     ((argument1+=Argument1 argument1+=Argument1*) | argument2+=Argument2)
	 * </pre>
	 */
	protected void sequence_ProdFunction(ISerializationContext context, ProdFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Row returns Row
	 *
	 * Constraint:
	 *     elementRow+=ElementRow+
	 * </pre>
	 */
	protected void sequence_Row(ISerializationContext context, Row semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Rowspan returns Rowspan
	 *
	 * Constraint:
	 *     (integer=INT | variable=Variable)
	 * </pre>
	 */
	protected void sequence_Rowspan(ISerializationContext context, Rowspan semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Rule returns Rule
	 *
	 * Constraint:
	 *     (selector=Selector declarations+=Declaration*)
	 * </pre>
	 */
	protected void sequence_Rule(ISerializationContext context, Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Selector returns Selector
	 *
	 * Constraint:
	 *     (idSelector=IDSelector | classSelector=ClassSelector | typeSelector=TypeSelector)
	 * </pre>
	 */
	protected void sequence_Selector(ISerializationContext context, Selector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Style returns Style
	 *
	 * Constraint:
	 *     css=Css
	 * </pre>
	 */
	protected void sequence_Style(ISerializationContext context, Style semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.STYLE__CSS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.STYLE__CSS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStyleAccess().getCssCssParserRuleCall_2_0(), semanticObject.getCss());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SumFunction returns SumFunction
	 *
	 * Constraint:
	 *     ((argument1+=Argument1 argument1+=Argument1*) | argument2+=Argument2+)
	 * </pre>
	 */
	protected void sequence_SumFunction(ISerializationContext context, SumFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TypeSelector returns TypeSelector
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_TypeSelector(ISerializationContext context, TypeSelector semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.TYPE_SELECTOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.TYPE_SELECTOR__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypeSelectorAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Value returns Value
	 *
	 * Constraint:
	 *     (
	 *         string=STRING | 
	 *         integer=INT | 
	 *         floatValue=Float | 
	 *         trueV=TRUE | 
	 *         falseV=FALSE | 
	 *         array=Array | 
	 *         nestedObject=NestedObject | 
	 *         variable=Variable
	 *     )
	 * </pre>
	 */
	protected void sequence_Value(ISerializationContext context, Value semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     VariableD returns VariableD
	 *
	 * Constraint:
	 *     (variable=Variable name=ID? (value+=Value | function+=Function))
	 * </pre>
	 */
	protected void sequence_VariableD(ISerializationContext context, VariableD semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.VARIABLE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     With returns With
	 *
	 * Constraint:
	 *     (init=Variable variable=Variable objectC=ObjectC? arrayC=ArrayC? otherElement+=OtherElement*)
	 * </pre>
	 */
	protected void sequence_With(ISerializationContext context, With semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}