package inputHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import algorithmMaker.QuickParser;
import algorithmMaker.input.Property;
import theorems.MultistageTheorem;

public class MultiTheoremParser {
	private static String[] inputFiles = { "multitheorems" };

	public static ArrayList<MultistageTheorem> parseFiles() {
		ArrayList<MultistageTheorem> ret = new ArrayList<MultistageTheorem>();
		try {
			for (String fileName : inputFiles) {
				BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
				String line;
				while ((line = br.readLine()) != null) {
					String[] properties = line.split(";");
					Property givenReq = QuickParser.parseProperty(properties[0]);
					Property goalReq = QuickParser.parseProperty(properties[1]);
					Property result = QuickParser.parseProperty(properties[2]);
					int cost = Integer.parseInt(properties[3].trim());
					String description = properties[4].substring(properties[4].indexOf('"') + 1,
							properties[4].lastIndexOf('"'));
					String pseudocode = properties[5].substring(properties[5].indexOf('"') + 1,
							properties[5].lastIndexOf('"'));

					ret.add(new MultistageTheorem(givenReq, goalReq, result, cost, description, pseudocode));
				}

				br.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done Parsing Multitheorems.");
		return ret;
	}
}
