/*
 * generated by Xtext 2.35.0-SNAPSHOT
 */
package org.xtext.example.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.GrammarRuntimeModule;
import org.xtext.example.GrammarStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class GrammarIdeSetup extends GrammarStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new GrammarRuntimeModule(), new GrammarIdeModule()));
	}
	
}
