/*
 * generated by Xtext
 */
package algorithmMaker.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import algorithmMaker.ui.internal.InputActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class InputExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return InputActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return InputActivator.getInstance().getInjector(InputActivator.ALGORITHMMAKER_INPUT);
	}
	
}