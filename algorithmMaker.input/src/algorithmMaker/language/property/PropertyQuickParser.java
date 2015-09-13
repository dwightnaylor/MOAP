package algorithmMaker.language.property;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import algorithmMaker.validation.InputValidator;

public class PropertyQuickParser {
	private static XtextResourceSet resourceSet = new PropertyStandaloneSetup().createInjectorAndDoEMFRegistration().getInstance(XtextResourceSet.class);
	private static int curFile = 0;

	private static Resource getParsingResource(String queryString) {
		if (queryString == null) {
			return null;
		}
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.createResource(URI.createURI("file" + (curFile++) + '.' + PropertyStandaloneSetup.EXT));
		try {
			resource.unload();
			resource.load(new ByteArrayInputStream(queryString.getBytes()), resourceSet.getLoadOptions());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return resource;
	}

	public static EObject parse(String queryString) {
		Resource resource = getParsingResource(queryString);
		if (resource == null || resource.getContents().size() == 0) {
			return null;
		}
		return resource.getContents().get(0);
	}

	public static boolean isLegal(String queryString) {
		EObject parse = parse(queryString);
		InputValidator validator = new InputValidator();
		if (parse == null || getParseErrors(queryString).size() > 0 || !validator.validate(parse, null, null)) {
			return false;
		}
		TreeIterator<EObject> iter = parse.eAllContents();
		while (iter.hasNext()) {
			EObject cur = iter.next();
			if (!validator.validate(cur, null, null)) {
				return false;
			}
		}
		return true;
	}

	public static EList<Diagnostic> getParseErrors(String queryString) {
		Resource resource = getParsingResource(queryString);
		if (resource == null) {
			return null;
		}
		return resource.getErrors();
	}

	public static EList<Diagnostic> getParseWarnings(String queryString) {
		Resource resource = getParsingResource(queryString);
		if (resource == null) {
			return null;
		}
		return resource.getWarnings();
	}
}
