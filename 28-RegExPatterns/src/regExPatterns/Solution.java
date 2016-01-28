/*

Welcome to Day 28! Check out an Introduction to Databases
	(https://www.youtube.com/watch?v=RmEjHzVRsOA&feature=youtu.be),
	or jump into the challenge. We haven't discussed RegEx (Regular
	Expressions) yet, but that's okay! Review the Pattern documentation
	(https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html),
	learn what it can do, and apply your new knowledge to this challenge!

RegEx helps us easily search for or match a Pattern in text. Before
	searching for a Pattern, we must specify it using some well-defined syntax.

Given a string, determine if it's a valid Pattern or not. The string
	may contain spaces.

Note: This is a java only challenge, a RegEx is only valid if you can
	compile it using the Pattern.compile
	(https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html)
	method. You may find using a try-catch block helpful here.

Input Format

The first line of input contains an integer, T (the number of test cases). 
The T subsequent lines of test cases each contain a string of
	characters describing a RegEx.

Constraints

1<=T<=100

Output Format

On a new line for each test case, print Valid if the given RegEx's
	syntax is correct; otherwise, print Invalid.

Sample Input

3
([A-Z])(.+)
[AZ[a-z](a-z)
batcatpat(nat

Sample Output

Valid
Invalid
Invalid

Explanation

The second and third test cases have unbalanced brackets and will
	throw a PatternSyntaxException when compiled. For example:

[AZ[a-z](a-z) is Invalid, but [AZ[a-z](a-z)] would be Valid. 
batcatpat(nat is Invalid, but batcatpat(nat) would be Valid.

 */

package regExPatterns;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution {
	public static void main(String[] args) {
		/* Instantiate a Scanner for reading standard input */
		Scanner stdIn = new Scanner(System.in);
		
		/* Read the number of test cases */
		int testCases = Integer.parseInt(stdIn.nextLine());

		/* Loop thru all of the test Cases */
		while (testCases > 0) {
			/* Read the next pattern to test */
			String patternIn = stdIn.nextLine();
			/* Assume the pattern is valid */
			boolean isValid = true;
			// System.out.println("Pattern: '" + patternIn + "'");
			/* Use a try catch pattern to see if the pattern compiles */
			try {
				/* Try compiling the pattern */
				Pattern patternComp = Pattern.compile(patternIn);
			/* There was a problem with the pattern syntax */
			} catch (PatternSyntaxException patternSyntaxException) {
				/*
				 * System.out.println(
				 * "There is a problem with the regular expression!");
				 * System.out.println("The pattern in question is: '" +
				 * patternSyntaxException.getPattern() + "'");
				 * System.out.println("The description is: " +
				 * patternSyntaxException.getDescription()); System.out.println(
				 * "The message is: " + patternSyntaxException.getMessage());
				 * System.out.println("The index is: " +
				 * patternSyntaxException.getIndex());
				 */
				/* Mark the pattern as invalid */
				isValid = false;
			}
			/* Is the pattern valid */
			if (isValid) {
				/* Yes, print Valid */
				System.out.println("Valid");
			} else {
				/* Oops, not valid, print Invalid */
				System.out.println("Invalid");
			}

		}

	}
}
