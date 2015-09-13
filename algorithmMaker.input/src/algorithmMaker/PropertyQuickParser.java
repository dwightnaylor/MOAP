package algorithmMaker;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import algorithmMaker.input.Property;
import algorithmMaker.language.property.PropertyStandaloneSetup;

import com.google.inject.Injector;

public class PropertyQuickParser {
	public static Property parse(String queryString) {
		Injector injector = new PropertyStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.createResource(URI.createURI(".input"));
		InputStream in = new ByteArrayInputStream(queryString.getBytes());
		try {
			resource.load(in, resourceSet.getLoadOptions());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return (Property)resource.getContents().get(0);
	}
}
