import algorithmMaker.PropertyQuickParser;
import algorithmMaker.input.Property;

/**
 * These are theorems used in the context of simple proving. For example, proving that if something
 * is a list, then it is a collection, or that if something is a collection, it is sortable. <br>
 * <br>
 * These should only contain atomics and ANDings in the input. Comments can be added by using the
 * COMMENT string ("//").
 * 
 * @author Dwight Naylor
 */
public class Theorem {

	private static String SEP_1 = ":-";
	private static String SEP_2 = ",";

	private static String COMMENT = "//";

	private static String DEFAULT_COST = "0";

	Property requirement;
	Property result;
	String cost;// TODO:DN: Make this something besides a string...

	public Theorem(Property requirement, Property result, String cost) {
		//TODO:DN : Check that incoming properties are legal theorems (ANDing or atomics only?)
		this.requirement = requirement;
		this.result = result;
		this.cost = cost;
	}

	public static Theorem parseTheorem(String line) {
		if (line.contains(COMMENT)) {
			line = line.substring(line.indexOf(COMMENT) + COMMENT.length(), line.length());
		}
		line = line.trim();
		if (line.length() == 0)
			return null;

		int sep1Index = line.indexOf(SEP_1);
		int sep2Index = line.lastIndexOf(SEP_2);
		String cost = DEFAULT_COST;
		if (sep2Index < 0) {
			sep2Index = line.length();
			cost = line.substring(sep2Index + SEP_2.length(), line.length());
		}
		Property requirement = PropertyQuickParser.parse(line.substring(0, sep1Index));
		Property result = PropertyQuickParser.parse(line.substring(sep1Index + SEP_1.length(), sep2Index));
		return new Theorem(requirement, result, cost);
	}
}
