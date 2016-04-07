/*
 * generated by Xtext
 */
package algorithmMaker.serializer;

import algorithmMaker.input.ANDing;
import algorithmMaker.input.Addition;
import algorithmMaker.input.Atomic;
import algorithmMaker.input.BooleanLiteral;
import algorithmMaker.input.Declaration;
import algorithmMaker.input.Implication;
import algorithmMaker.input.Input;
import algorithmMaker.input.InputPackage;
import algorithmMaker.input.Multiplication;
import algorithmMaker.input.Negation;
import algorithmMaker.input.NumberLiteral;
import algorithmMaker.input.ORing;
import algorithmMaker.input.Problem;
import algorithmMaker.input.Quantifier;
import algorithmMaker.input.Theorem;
import algorithmMaker.input.Type;
import algorithmMaker.input.Variable;
import algorithmMaker.services.InputGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class InputSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private InputGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == InputPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case InputPackage.AN_DING:
				sequence_ANDing(context, (ANDing) semanticObject); 
				return; 
			case InputPackage.ADDITION:
				sequence_Addition(context, (Addition) semanticObject); 
				return; 
			case InputPackage.ATOMIC:
				sequence_Atomic(context, (Atomic) semanticObject); 
				return; 
			case InputPackage.BOOLEAN_LITERAL:
				sequence_BooleanLiteral(context, (BooleanLiteral) semanticObject); 
				return; 
			case InputPackage.DECLARATION:
				sequence_Declaration(context, (Declaration) semanticObject); 
				return; 
			case InputPackage.IMPLICATION:
				sequence_Implication(context, (Implication) semanticObject); 
				return; 
			case InputPackage.INPUT:
				sequence_Input(context, (Input) semanticObject); 
				return; 
			case InputPackage.MULTIPLICATION:
				sequence_Multiplication(context, (Multiplication) semanticObject); 
				return; 
			case InputPackage.NEGATION:
				sequence_Negation(context, (Negation) semanticObject); 
				return; 
			case InputPackage.NUMBER_LITERAL:
				sequence_NumberLiteral(context, (NumberLiteral) semanticObject); 
				return; 
			case InputPackage.ORING:
				sequence_ORing(context, (ORing) semanticObject); 
				return; 
			case InputPackage.PROBLEM:
				if(context == grammarAccess.getProblemColonRule()) {
					sequence_ProblemColon(context, (Problem) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getProblemNoVarsRule()) {
					sequence_ProblemNoVars(context, (Problem) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getProblemPropertyOptionalRule()) {
					sequence_ProblemPropertyOptional(context, (Problem) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getProblemRule()) {
					sequence_Problem(context, (Problem) semanticObject); 
					return; 
				}
				else break;
			case InputPackage.QUANTIFIER:
				sequence_Quantifier(context, (Quantifier) semanticObject); 
				return; 
			case InputPackage.THEOREM:
				sequence_Theorem(context, (Theorem) semanticObject); 
				return; 
			case InputPackage.TYPE:
				sequence_Type(context, (Type) semanticObject); 
				return; 
			case InputPackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=ANDing_ANDing_1_0 right=Primary)
	 */
	protected void sequence_ANDing(EObject context, ANDing semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, InputPackage.Literals.AN_DING__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InputPackage.Literals.AN_DING__LEFT));
			if(transientValues.isValueTransient(semanticObject, InputPackage.Literals.AN_DING__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InputPackage.Literals.AN_DING__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getANDingAccess().getANDingLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getANDingAccess().getRightPrimaryParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Addition_Addition_1_0 (symbol='+' | symbol='-') right=Multiplication)
	 */
	protected void sequence_Addition(EObject context, Addition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (Function=ID (args+=Addition args+=Addition*)?)
	 */
	protected void sequence_Atomic(EObject context, Atomic semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value='TRUE' | value='FALSE')
	 */
	protected void sequence_BooleanLiteral(EObject context, BooleanLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type? varName=ID)
	 */
	protected void sequence_Declaration(EObject context, Declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Implication_Implication_1_0 (implication='->' | implication='<-' | implication='<->') right=ORing)
	 */
	protected void sequence_Implication(EObject context, Implication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (given=ProblemPropertyOptional | given=ProblemNoVars) 
	 *         ((task='Find' | task='Count') (goal=Problem | goal=ProblemNoVars))? 
	 *         (theorems+=Theorem theorems+=Theorem*)?
	 *     )
	 */
	protected void sequence_Input(EObject context, Input semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Multiplication_Multiplication_1_0 (symbol='*' | symbol='/') right=NumericalPrimary)
	 */
	protected void sequence_Multiplication(EObject context, Multiplication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     negated=Primary
	 */
	protected void sequence_Negation(EObject context, Negation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, InputPackage.Literals.NEGATION__NEGATED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InputPackage.Literals.NEGATION__NEGATED));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNegationAccess().getNegatedPrimaryParserRuleCall_1_0(), semanticObject.getNegated());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=DOUBLE
	 */
	protected void sequence_NumberLiteral(EObject context, NumberLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, InputPackage.Literals.NUMBER_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InputPackage.Literals.NUMBER_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumberLiteralAccess().getValueDOUBLEParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ORing_ORing_1_0 right=ANDing)
	 */
	protected void sequence_ORing(EObject context, ORing semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, InputPackage.Literals.ORING__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InputPackage.Literals.ORING__LEFT));
			if(transientValues.isValueTransient(semanticObject, InputPackage.Literals.ORING__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InputPackage.Literals.ORING__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getORingAccess().getORingLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getORingAccess().getRightANDingParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (vars+=Declaration vars+=Declaration* property=Implication)
	 */
	protected void sequence_ProblemColon(EObject context, Problem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     property=Implication
	 */
	protected void sequence_ProblemNoVars(EObject context, Problem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (vars+=Declaration vars+=Declaration* property=Implication?)
	 */
	protected void sequence_ProblemPropertyOptional(EObject context, Problem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (vars+=Declaration vars+=Declaration* property=Implication)
	 */
	protected void sequence_Problem(EObject context, Problem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((quantifier='forall' | quantifier='exists') subject=ProblemColon)
	 */
	protected void sequence_Quantifier(EObject context, Quantifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (content=Implication Description=STRING)
	 */
	protected void sequence_Theorem(EObject context, Theorem semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, InputPackage.Literals.THEOREM__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InputPackage.Literals.THEOREM__CONTENT));
			if(transientValues.isValueTransient(semanticObject, InputPackage.Literals.THEOREM__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InputPackage.Literals.THEOREM__DESCRIPTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTheoremAccess().getContentImplicationParserRuleCall_0_0(), semanticObject.getContent());
		feeder.accept(grammarAccess.getTheoremAccess().getDescriptionSTRINGTerminalRuleCall_2_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID templateType=Type?)
	 */
	protected void sequence_Type(EObject context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     arg=ID
	 */
	protected void sequence_Variable(EObject context, Variable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, InputPackage.Literals.VARIABLE__ARG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InputPackage.Literals.VARIABLE__ARG));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableAccess().getArgIDTerminalRuleCall_0(), semanticObject.getArg());
		feeder.finish();
	}
}
