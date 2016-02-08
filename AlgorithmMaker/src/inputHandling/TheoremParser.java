package inputHandling;

import static kernelLanguage.KernelFactory.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import algorithmMaker.QuickParser;
import algorithmMaker.util.*;
import kernelLanguage.*;

public class TheoremParser {
	private static final String EXTENDS = " extends ";
	private static String[] inputFiles = { "theoremsv1" };

	public static ArrayList<KTheorem> parseFiles() {
		ArrayList<KTheorem> ret = new ArrayList<KTheorem>();
		try {
			for (String fileName : inputFiles) {
				BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
				String line;
				while ((line = br.readLine()) != null) {
					if (line.contains("//"))
						line = line.substring(0, line.indexOf("//"));

					if (line.trim().length() > 0) {
						if (line.contains(EXTENDS)) {
							ret.add(parseExtension(line));
						} else {
							if (line.contains("->")) {
								KTheorem theorem = parseTheorem(line);
								ret.add(theorem.canonicalize());
								ret.add(theorem.getContrapositive().canonicalize());
							}
							if (line.contains("<-")) {
								KTheorem theorem = parseReverseTheorem(line);
								ret.add(theorem.canonicalize());
								ret.add(theorem.getContrapositive().canonicalize());
							}
						}
					}
				}

				br.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ret;
	}

	private static KTheorem parseExtension(String line) {
		int split = line.indexOf(EXTENDS);
		String subClass = line.substring(0, split);
		String superClass = line.substring(split + EXTENDS.length(), line.length());
		return theorem(atomic(KernelFactory.TYPE_MARKER + subClass, "x"),
				atomic(KernelFactory.TYPE_MARKER + superClass, "x"), 0, "Every " + subClass + " is a " + superClass);
	}

	private static KTheorem parseTheorem(String string) {
		int quote = string.indexOf('"');
		int lastComma = string.lastIndexOf(',', quote);
		int nextToLastComma = string.lastIndexOf(',', lastComma - 1);
		int index = string.indexOf("->");
		String requirement = string.substring(0, index);
		if (requirement.charAt(requirement.length() - 1) == '<')
			requirement = requirement.substring(0, requirement.length() - 1);

		String result = string.substring(index + 2, nextToLastComma);
		int cost = Integer.parseInt(string.substring(nextToLastComma + 1, lastComma).trim());
		String description = string.substring(quote + 1, string.lastIndexOf('"'));
		return theorem((KProperty) SugarUtil.convertToKernel(QuickParser.parseProperty(requirement)),
				(KProperty) SugarUtil.convertToKernel(QuickParser.parseProperty(result)), cost, description);
	}

	private static KTheorem parseReverseTheorem(String string) {
		int quote = string.indexOf('"');
		int lastComma = string.lastIndexOf(',', quote);
		int nextToLastComma = string.lastIndexOf(',', lastComma - 1);
		int index = string.indexOf("->");
		String requirement = string.substring(0, index);

		String result = string.substring(index + 2, nextToLastComma);
		if (result.charAt(1) == '<')
			result = result.substring(1);

		int cost = Integer.parseInt(string.substring(nextToLastComma + 1, lastComma).trim());
		String description = string.substring(quote + 1, string.lastIndexOf('"'));
		return theorem((KProperty) SugarUtil.convertToKernel(QuickParser.parseProperty(result)),
				(KProperty) SugarUtil.convertToKernel(QuickParser.parseProperty(requirement)), cost, description);
	}
}
