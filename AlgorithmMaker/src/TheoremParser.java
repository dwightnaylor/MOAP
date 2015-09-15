import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import algorithmMaker.InputStandaloneSetup;

public class TheoremParser {
	private static String[] inputFiles = { "theoremsv1" };

	public static void main(String[] args) {
		InputStandaloneSetup.doSetup();
		parseFiles();
	}

	public static ArrayList<Theorem> parseFiles() {
		ArrayList<Theorem> ret = new ArrayList<Theorem>();
		try {
			for (String fileName : inputFiles) {
				BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
				String line;
				while ((line = br.readLine()) != null) {
					Theorem.parseTheorem(line);
				}
				br.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done Parsing Files.");
		return ret;
	}
}
