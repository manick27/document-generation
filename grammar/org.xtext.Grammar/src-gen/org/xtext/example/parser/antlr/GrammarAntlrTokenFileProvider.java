/*
 * generated by Xtext 2.35.0-SNAPSHOT
 */
package org.xtext.example.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class GrammarAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/example/parser/antlr/internal/InternalGrammar.tokens");
	}
}
