package algorithmMaker;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import algorithmMaker.input.Input;
import algorithmMaker.input.InputPackage;
import algorithmMaker.input.Problem;
import algorithmMaker.input.Property;
import algorithmMaker.input.Theorem;
import algorithmMaker.parser.antlr.InputParser;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class QuickParser {

	public static Property parseProperty(String queryString) {
		Parser.queryString = "ORing";
		return (Property) parse(queryString, false);
	}

	public static Theorem parseTheorem(String queryString) {
		Parser.queryString = "Theorem";
		return (Theorem) parse(queryString, false);
	}

	public static Input parseInput(String queryString) {
		Parser.queryString = "Input";
		return (Input) parse(queryString, true);
	}

	public static Problem parseProblem(String queryString) {
		Parser.queryString = "Problem";
		return (Problem) parse(queryString, false);
	}

	private static XtextResourceSet resourceSet;
	private static int fileIndex = 0;

	private static EObject parse(String queryString, boolean nullOnError) {
		if (resourceSet == null) {
			resourceSet = new StandaloneSetup().createInjectorAndDoEMFRegistration()
					.getInstance(XtextResourceSet.class);
			resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		}
		Resource resource = resourceSet.createResource(URI.createURI(fileIndex++ + "." + StandaloneSetup.EXT));
		InputStream in = new ByteArrayInputStream(queryString.getBytes());
		try {
			resource.load(in, resourceSet.getLoadOptions());
		} catch (IOException e) {
			e.printStackTrace();
		}
		EObject ret = resource.getContents().get(0);

		if (nullOnError) {
			if (resource.getErrors().size() > 0) {
				// System.err.println(resource.getErrors());
				return null;
			}

			Diagnostic diagnostic = Diagnostician.INSTANCE.validate(ret);
			switch (diagnostic.getSeverity()) {
			case Diagnostic.ERROR: {
				// System.err.println(diagnostic.getChildren());
				return null;
			}
			case Diagnostic.WARNING:
				// Do nothing, warnings are fine.
			}
		}

		return ret;
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
