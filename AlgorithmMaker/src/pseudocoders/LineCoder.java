package pseudocoders;

import java.util.*;

import solver.ProblemGroup;

public class LineCoder implements Pseudocoder {

	public static final String EXIT_STRING = "SUBCODER:";

	public static final String RETURN_STRING = "doreturn";

	/**
	 * The lines to code. There are a few special types of exit strings, including:<br>
	 * {@value #EXIT_STRING} followed by a number n will yield the pseudocode for the nth subproblem of the problemGroup
	 * used for this coder. This can be proceeded by a tab ("\t") character if this code should be tabbed over by one.
	 * <br>
	 * A line can be proceeded by any number of repetitions of the '>' character to indicate how many sub-problems deep
	 * it should appear. For example, if the previous line solved a subproblem and went three tabs deep in doing so, one
	 * use of the '>' character would increase tabbing by three. If we were two subproblems deep and the first increased
	 * tabbing by 2, and the second by 3, then using one '>' would increase tabbing by 2, and using ">>" would increase
	 * tabbing by five. Any additional '>' characters will be interpreted as single tabs, so in the previous example,
	 * ">>>>" would yield seven tabs. Once we "go back" to a previous level of subproblem tabs being used, we cannot use
	 * a higher number again. So using '>' for a new line in our previous example would prevent us from using '>>' as a
	 * means of getting the three tabs from the second problem again.
	 */
	private final String[] lines;

	public LineCoder(String... lines) {
		this.lines = lines;

		for (String line : lines)
			if (line == null)
				throw new IllegalArgumentException("Cannot have null lines to a line coder.");
	}

	@Override
	public int appendPseudocode(StringBuffer builder, int numTabs, ProblemGroup problemGroup, Pseudocoder returnCoder) {
		int originalNumTabs = numTabs;
		Stack<Integer> subProblemTabs = new Stack<Integer>();
		for (int i = 0; i < lines.length; i++) {
			String line = lines[i];
			int numTabChars = getNumberOfTabCharacters(line);
			line = line.substring(numTabChars);
			while (numTabChars < subProblemTabs.size())
				numTabs -= subProblemTabs.pop();

			while (numTabChars > subProblemTabs.size()) {
				subProblemTabs.add(1);
				numTabs++;
				numTabChars--;
			}

			if (line.contains(EXIT_STRING)) {
				// If the line is an exit line, print the sub-coder
				int subProblemIndex = Integer
						.parseInt(line.substring(line.indexOf(EXIT_STRING) + EXIT_STRING.length()));

				// If we have a solution-problem, print it. Otherwise it is the solution, so just print the return
				// string.
				if (problemGroup.childStates.get(subProblemIndex).solutionIndex != -1) {
					ProblemGroup childGroup = problemGroup.childStates.get(subProblemIndex).getSolutionGroup();
					int subTabs = childGroup.rootTheorem.getPseudocoder().appendPseudocode(builder, numTabs, childGroup,
							i == lines.length - 1 ? returnCoder : null);
					subProblemTabs.push(subTabs);
					numTabs += subTabs;
				} else if (returnCoder != null) {
					returnCoder.appendPseudocode(builder, numTabs, problemGroup, null);
				}
			} else if (line.contains(RETURN_STRING)) {
				returnCoder.appendPseudocode(builder, numTabs, problemGroup, null);
			} else {
				// Otherwise just print the line
				Pseudocoder.appendTabs(builder, numTabs);
				builder.append(problemGroup.rootTheoremBinding.revar(line) + "\n");
			}
		}
		return numTabs - originalNumTabs;
	}

	public String toString() {
		return "LineCoder:" + Arrays.asList(lines);
	}

	private int getNumberOfTabCharacters(String line) {
		int numTabChars = 0;
		while (line.charAt(numTabChars) == '>')
			numTabChars++;
		return numTabChars;
	}
}
