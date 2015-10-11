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
					Property givenResult = properties[2].trim().length() == 0 ? null : QuickParser
							.parseProperty(properties[2]);
					Property goalResult = properties[3].trim().length() == 0 ? null : QuickParser
							.parseProperty(properties[3]);
					int cost = Integer.parseInt(properties[4].trim());
					String description = properties[5].substring(properties[5].indexOf('"') + 1,
							properties[5].lastIndexOf('"'));
					String pseudocode = properties[6].substring(properties[6].indexOf('"') + 1,
							properties[6].lastIndexOf('"'));

					ret.add(new MultistageTheorem(givenReq, goalReq, givenResult, goalResult, cost, description,
							pseudocode));
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
