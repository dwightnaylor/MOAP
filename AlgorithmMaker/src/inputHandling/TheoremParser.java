package inputHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import algorithmMaker.QuickParser;
import algorithmMaker.input.Theorem;

public class TheoremParser {
	private static String[] inputFiles = { "theoremsv1" };

	public static ArrayList<Theorem> parseFiles() {
		ArrayList<Theorem> ret = new ArrayList<Theorem>();
		try {
			for (String fileName : inputFiles) {
				BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
				String line;
				while ((line = br.readLine()) != null) {
					if (line.contains("//"))
						line = line.substring(0, line.indexOf("//"));

					if (line.trim().length() > 0)
						ret.add(QuickParser.parseTheorem(line));
				}

				br.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ret;
	}
}
