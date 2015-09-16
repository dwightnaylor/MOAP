package Input;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.generator.DefaultGeneratorFragment;

/**
 * This class is solely a helper class. It's made to generate (within the generated source files) the equals and hashcode methods such that the contents are
 * properly taken into account.
 * 
 * @author Dwight Naylor
 * @since 9/14/15
 */
public class GeneratedModelModifier extends DefaultGeneratorFragment {
	private static final String NL = "\r\n";
	private static final Logger log = Logger.getLogger(GeneratedModelModifier.class);

	@Override
	public void generate(Grammar grammar, XpandExecutionContext ctx) {
		if (log.isInfoEnabled()) {
			log.info("generating equals, hashCode and toString methods for model elements");
		}

		File headFile = new File("src-gen/algorithmMaker/input/impl");
		for (File file : headFile.listFiles()) {
			if (file.isDirectory()) {
				continue;
			}
			String className = null;
			StringBuffer contents = new StringBuffer();
			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				String line;
				while ((line = br.readLine()) != null) {
					if (line.contains("implements")) {
						if (!line.endsWith("{")) {
							className = line.substring(line.indexOf("implements") + 11, line.length());
						} else {
							className = line.substring(line.indexOf("implements") + 11, line.length() - 2);
						}
					}
					if (line.contains("toString()")) {
						while (contents.charAt(contents.length() - 1) != '}') {
							contents.deleteCharAt(contents.length() - 1);
						}
						break;
					}
					if (line.startsWith("}")) {
						break;
					}
					contents.append(line + NL);
				}
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				Class<? extends EObject> objectClass = getClassFor(file, className);
				if (objectClass != null) {
					FileWriter writer = new FileWriter(file);
					writer.append(contents);
					writer.append(NL);
					writer.append(NL);
					writer.append(getHashCodeMethod(objectClass, className));
					writer.append(getEqualsMethod(objectClass, className));
					writer.append(getToStringMethod(className));
					writer.append(NL + "} //" + className + "Impl");
					writer.flush();
					writer.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static String getHashCodeMethod(Class<? extends EObject> classToUse, String className) {
		StringBuffer ret = new StringBuffer();
		ret.append("\tpublic int hashCode() {" + NL);
		ret.append("\t\tint ret = getClass().hashCode();" + NL);
		for (Field field : classToUse.getDeclaredFields()) {
			if (Modifier.isFinal(field.getModifiers())) {
				continue;
			}
			if (EList.class.isAssignableFrom(field.getType())) {
				ret.append("\t\tif (" + field.getName() + " != null) {" + NL);
				ret.append("\t\t\tfor (Object obj : " + field.getName() + ") {" + NL);
				ret.append("\t\t\t\tret += obj.hashCode();" + NL);
				ret.append("\t\t\t}" + NL);
				ret.append("\t\t}" + NL);
			} else if (int.class.isAssignableFrom(field.getType())) {
				ret.append("\t\t\tret += " + field.getName() + ";" + NL);
			} else if (double.class.isAssignableFrom(field.getType())) {
				ret.append("\t\t\tret += new Double(" + field.getName() + ").hashCode();" + NL);
			} else if (boolean.class.isAssignableFrom(field.getType())) {
				ret.append("\t\t\tret += new Boolean(" + field.getName() + ").hashCode();" + NL);
			} else {
				ret.append("\t\tret += " + field.getName() + " == null ? 0 :" + field.getName() + ".hashCode();" + NL);
			}
		}
		ret.append("\t\treturn ret;" + NL);
		ret.append("\t}" + NL + NL);
		return ret.toString();
	}

	private static String getEqualsMethod(Class<? extends EObject> classToUse, String className) {
		StringBuffer ret = new StringBuffer();
		ret.append("\tpublic boolean equals(Object obj) {" + NL);
		ret.append("\t\tif (this == obj) return true;" + NL);
		ret.append("\t\tif (obj == null || getClass() != obj.getClass()) return false;" + NL);
		ret.append("\t\t" + className + "Impl other = (" + className + "Impl) obj;" + NL);
		for (Field field : classToUse.getDeclaredFields()) {
			if (Modifier.isFinal(field.getModifiers())) {
				continue;
			}
			if (int.class.isAssignableFrom(field.getType()) || double.class.isAssignableFrom(field.getType())
					|| boolean.class.isAssignableFrom(field.getType())) {
				ret.append("\t\tif (" + field.getName() + " != other." + field.getName() + ") return false;" + NL);
			} else {
				ret.append("\t\tif (" + field.getName() + " == null && other." + field.getName() + " != null || " + field.getName() + " != null && !"
						+ field.getName() + ".equals(other." + field.getName() + ")) return false;" + NL);
			}
		}
		ret.append("\t\treturn true;" + NL);
		ret.append("\t}" + NL + NL);
		return ret.toString();
	}

	@SuppressWarnings({ "unchecked" })
	private static Class<? extends EObject> getClassFor(File file, String className) {
		Class<? extends EObject> classToUse = null;
		try {
			classToUse = (Class<? extends EObject>) new URLClassLoader(new URL[] { file.getParentFile().toURI().toURL() })
					.loadClass("algorithmMaker.input.impl." + className + "Impl");
		} catch (ClassNotFoundException e) {
			return null;
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		if (classToUse.getDeclaredFields().length == 0 || EPackageImpl.class.isAssignableFrom(classToUse)) {
			return null;
		}
		return classToUse;
	}

	private static String getToStringMethod(String className) {
		StringBuffer ret = new StringBuffer();
		ret.append("\tpublic String toString() {" + NL);
		ret.append("\t\tStringBuffer ret = new StringBuffer();" + NL);
		switch (className) {
		case "ANDing":
			ret.append("\t\tret.append(left.toString() + \" & \" + right.toString());" + NL);
			break;
		case "Atomic":
			ret.append("\t\tret.append(function + '(');" + NL);
			ret.append("\t\tfor (String arg : args)" + NL);
			ret.append("\t\t\tret.append(arg + ',');" + NL);
			ret.append("\t\tret.setCharAt(ret.length() - 1, ')');" + NL);
			break;
		case "Input":
			ret.append("\t\tret.append(\"Given \" + given + \", Find \" + goal);" + NL);
			break;
		case "ORing":
			ret.append("\t\tret.append(left.toString() + \" | \" + right.toString());" + NL);
			break;
		case "Problem":
			ret.append("\t\t		for (String var : vars)" + NL);
			ret.append("\t\t			ret.append(var + ',');" + NL);
			ret.append("\t\t		ret.deleteCharAt(ret.length() - 1);" + NL);
			ret.append("\t\t		ret.append(\" st \" + property.toString());" + NL);
			break;
		case "Quantifier":
			ret.append("\t\t		ret.append(quantifier + '(' + subject + \" : \" + predicate + ')');" + NL);
			break;
		default:
			if (log.isInfoEnabled()) {
				log.info("ERROR: No toString() method specified for " + className + "!");
			}
			ret.append("\t\terror" + NL);
			break;
		}
		ret.append("\t\treturn ret.toString();" + NL);
		ret.append("\t}" + NL + NL);
		return ret.toString();
	}
}
