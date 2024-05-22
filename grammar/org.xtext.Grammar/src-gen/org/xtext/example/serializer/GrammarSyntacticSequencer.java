/*
 * generated by Xtext 2.35.0-SNAPSHOT
 */
package org.xtext.example.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.services.GrammarGrammarAccess;

@SuppressWarnings("all")
public class GrammarSyntacticSequencer extends AbstractSyntacticSequencer {

	protected GrammarGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Argument2_HyphenMinusKeyword_1_0_0_or_PlusSignKeyword_1_0_1;
	protected AbstractElementAlias match_Argument2_HyphenMinusKeyword_4_0_0_or_PlusSignKeyword_4_0_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (GrammarGrammarAccess) access;
		match_Argument2_HyphenMinusKeyword_1_0_0_or_PlusSignKeyword_1_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getArgument2Access().getHyphenMinusKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getArgument2Access().getPlusSignKeyword_1_0_1()));
		match_Argument2_HyphenMinusKeyword_4_0_0_or_PlusSignKeyword_4_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getArgument2Access().getHyphenMinusKeyword_4_0_0()), new TokenAlias(false, false, grammarAccess.getArgument2Access().getPlusSignKeyword_4_0_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Argument2_HyphenMinusKeyword_1_0_0_or_PlusSignKeyword_1_0_1.equals(syntax))
				emit_Argument2_HyphenMinusKeyword_1_0_0_or_PlusSignKeyword_1_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Argument2_HyphenMinusKeyword_4_0_0_or_PlusSignKeyword_4_0_1.equals(syntax))
				emit_Argument2_HyphenMinusKeyword_4_0_0_or_PlusSignKeyword_4_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '-' | '+'
	 *
	 * This ambiguous syntax occurs at:
	 *     integer=INT (ambiguity) integerEnd1=INT
	 *     integer=INT (ambiguity) variable+=Variable
	 *     variable+=Variable (ambiguity) integerEnd1=INT
	 *     variable+=Variable (ambiguity) variable+=Variable
	 
	 * </pre>
	 */
	protected void emit_Argument2_HyphenMinusKeyword_1_0_0_or_PlusSignKeyword_1_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '-' | '+'
	 *
	 * This ambiguous syntax occurs at:
	 *     integerEnd2=INT (ambiguity) integerEnd3=INT
	 *     integerEnd2=INT (ambiguity) variable+=Variable
	 *     variable+=Variable (ambiguity) integerEnd3=INT
	 *     variable+=Variable (ambiguity) variable+=Variable
	 
	 * </pre>
	 */
	protected void emit_Argument2_HyphenMinusKeyword_4_0_0_or_PlusSignKeyword_4_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}