package algorithmMaker.serializer;

import algorithmMaker.input.ANDing;
import algorithmMaker.input.Atomic;
import algorithmMaker.input.Input;
import algorithmMaker.input.InputPackage;
import algorithmMaker.input.ORing;
import algorithmMaker.input.Problem;
import algorithmMaker.input.Quantifier;
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
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == InputPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case InputPackage.AN_DING:
				if(context == grammarAccess.getANDingRule() ||
				   context == grammarAccess.getANDingAccess().getANDingLeftAction_1_0() ||
				   context == grammarAccess.getORingRule() ||
				   context == grammarAccess.getORingAccess().getORingLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_ANDing(context, (ANDing) semanticObject); 
					return; 
				}
				else break;
			case InputPackage.ATOMIC:
				if(context == grammarAccess.getANDingRule() ||
				   context == grammarAccess.getANDingAccess().getANDingLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getORingRule() ||
				   context == grammarAccess.getORingAccess().getORingLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Atomic(context, (Atomic) semanticObject); 
					return; 
				}
				else break;
			case InputPackage.INPUT:
				if(context == grammarAccess.getInputRule()) {
					sequence_Input(context, (Input) semanticObject); 
					return; 
				}
				else break;
			case InputPackage.ORING:
				if(context == grammarAccess.getANDingRule() ||
				   context == grammarAccess.getANDingAccess().getANDingLeftAction_1_0() ||
				   context == grammarAccess.getORingRule() ||
				   context == grammarAccess.getORingAccess().getORingLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_ORing(context, (ORing) semanticObject); 
					return; 
				}
				else break;
			case InputPackage.PROBLEM:
				if(context == grammarAccess.getProblemRule()) {
					sequence_Problem(context, (Problem) semanticObject); 
					return; 
				}
				else break;
			case InputPackage.QUANTIFIER:
				if(context == grammarAccess.getANDingRule() ||
				   context == grammarAccess.getANDingAccess().getANDingLeftAction_1_0() ||
				   context == grammarAccess.getORingRule() ||
				   context == grammarAccess.getORingAccess().getORingLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getQuantifierRule()) {
					sequence_Quantifier(context, (Quantifier) semanticObject); 
					return; 
				}
				else break;
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
	 *     (Function=ID (args+=ID args+=ID*)?)
	 */
	protected void sequence_Atomic(EObject context, Atomic semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (given=Problem goal=Problem)
	 */
	protected void sequence_Input(EObject context, Input semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, InputPackage.Literals.INPUT__GIVEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InputPackage.Literals.INPUT__GIVEN));
			if(transientValues.isValueTransient(semanticObject, InputPackage.Literals.INPUT__GOAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InputPackage.Literals.INPUT__GOAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInputAccess().getGivenProblemParserRuleCall_1_0(), semanticObject.getGiven());
		feeder.accept(grammarAccess.getInputAccess().getGoalProblemParserRuleCall_4_0(), semanticObject.getGoal());
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
	 *     (vars+=ID vars+=ID* property=ORing)
	 */
	protected void sequence_Problem(EObject context, Problem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((quantifier='forall' | quantifier='exists') subject=Problem predicate=ORing)
	 */
	protected void sequence_Quantifier(EObject context, Quantifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}