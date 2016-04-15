package inputHandling;

import static kernelLanguage.KernelFactory.*;

import java.io.*;
import java.util.ArrayList;

import algorithmMaker.util.KernelUtil;
import kernelLanguage.*;
import theorems.Fact;

public class TheoremParser {
	private static final String EXTENDS = " extends ";
	private static String[] inputFiles = { "theoremsv1" };

	public static ArrayList<Fact<KQuantifier>> parseFiles() {
		ArrayList<Fact<KQuantifier>> ret = new ArrayList<Fact<KQuantifier>>();
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
							int commaIndex = line.lastIndexOf(',', line.lastIndexOf('\"', line.lastIndexOf('\"')));
							KProperty property = KernelUtil.parseProperty(line.substring(0, commaIndex));
							String description = line.substring(commaIndex + 1);
							if (property instanceof KANDing) {
								for (KProperty anded : KernelUtil.getANDed(property)) {
									ret.add(Fact.givenTheorem(anded, description));
								}
							} else
								ret.add(Fact.givenTheorem(property, description));
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

	private static Fact<KQuantifier> parseExtension(String line) {
		int split = line.indexOf(EXTENDS);
		String subClass = line.substring(0, split);
		String superClass = line.substring(split + EXTENDS.length(), line.length());
		String var = "x";
		return new Fact<KQuantifier>(
				quantifier(KQuantifier.Quantifier.forall,
						problem(implication(atomic(KernelFactory.TYPE_MARKER + subClass, var),
								atomic(KernelFactory.TYPE_MARKER + superClass, var)), var)),
				"Every " + subClass + " is a " + superClass);
	}
}
