package algorithmMaker;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import algorithmMaker.input.Input;
import algorithmMaker.input.InputPackage;
import algorithmMaker.input.Property;
import algorithmMaker.input.Theorem;
import algorithmMaker.parser.antlr.InputParser;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class QuickParser {

	public static Property parseProperty(String queryString) {
		Parser.queryString = "ORing";
		return (Property) parse(queryString);
	}

	public static Theorem parseTheorem(String queryString) {
		Parser.queryString = "Theorem";
		return (Theorem) parse(queryString);
	}

	public static Input parseInput(String queryString) {
		Parser.queryString = "Input";
		return (Input) parse(queryString);
	}

	private static EObject parse(String queryString) {
		Injector injector = new StandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.createResource(URI.createURI("." + StandaloneSetup.EXT));
		InputStream in = new ByteArrayInputStream(queryString.getBytes());
		try {
			resource.load(in, resourceSet.getLoadOptions());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return resource.getContents().get(0);
	}
}

class StandaloneSetup extends InputStandaloneSetupGenerated {
	static final String EXT = "input";
	private static final String SITE = "algorithmMaker.input";

	@Override
	public Injector createInjector() {
		return Guice.createInjector(new RuntimeModule());
	}

	public void register(Injector injector) {
		if (!EPackage.Registry.INSTANCE.containsKey(SITE)) {
			EPackage.Registry.INSTANCE.put(SITE, InputPackage.eINSTANCE);
		}
		org.eclipse.xtext.resource.IResourceFactory resourceFactory = injector
				.getInstance(org.eclipse.xtext.resource.IResourceFactory.class);
		org.eclipse.xtext.resource.IResourceServiceProvider serviceProvider = injector
				.getInstance(org.eclipse.xtext.resource.IResourceServiceProvider.class);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(EXT, resourceFactory);
		org.eclipse.xtext.resource.IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put(EXT,
				serviceProvider);
	}
}

class RuntimeModule extends AbstractInputRuntimeModule {
	@Override
	public Class<? extends org.eclipse.xtext.parser.IParser> bindIParser() {
		return Parser.class;
	}
}

class Parser extends InputParser {
	public static String queryString;

	@Override
	protected String getDefaultRuleName() {
		return queryString;
	}
}
