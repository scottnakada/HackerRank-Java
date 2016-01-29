/*

Welcome to Day 29! Check out the tutorial on programming language fundamentals
	(https://www.youtube.com/watch?v=nc6nJYdGUAU&feature=youtu.be), or just
	jump right into the problem. Congratulations on finishing the series, and
	good luck!

Suppose you have some string S having length N that is indexed from 0 to N-1.
	You also have some string R that is the reverse of string S. S is funny if
	the condition |Si-Si-1|=|Ri-Ri-1| is true for every i from 1 to N-1.

Note: For some string str, stri denotes the ASCII value of the ith 0-indexed
	character in str. The absolute value of some integer, x, is written as |x|.

Input Format

The first line contains an integer, T (the number of test cases). 
The T subsequent lines each contain one string S.

Constraints 
1<=T<=10 
2<=length of S<=10000
Output Format

For each string S, print whether it is Funny or Not Funny on a new line
	(i.e.: the ith line of output should be the answer for input string Si).

Sample Input

2
acxz
bcxz

Sample Output

Funny
Not Funny

Explanation

Test Case 0: S= "acxz" 
|c-a|=2=|x-z| 
|x-c|=21=|c-x| 
|z-x|=2=|a-c| 
We print Funny.

Test Case 1: S= "bcxz" 
|c-b|=1, but |x-z|=2 
We stop evaluating the string (as |c-b|!=|x-z|), and print Not Funny.

 */

package funnyStrings;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/* Instantiate a Scanner for reading standard input */
		Scanner stdIn = new Scanner(System.in);
		
		/* Read the number of test cases */
		int testCases = Integer.parseInt(stdIn.nextLine());
		System.out.println("Test Cases: " + testCases);
		
		/* Loop thru all of the test Cases */
		while (testCases > 0) {
			/* Read the next funnyString to test */
			String funnyString = stdIn.nextLine();
			System.out.println("Is this a funny string?: '" + funnyString + "'");
			
			/* Assume it is funny */
			boolean funny = true;
			
			/* Scan thru the string to halfway, checking for not funny bits */
			for (int i=0; i<(funnyString.length()/2); i++) {
				/* Does the ith character - the ith+1 character difference equal
				 * the length-i and length-i-1 character */
				System.out.println("i=" + i + ", ith=" + funnyString.charAt(i) +
						", ith+1=" + funnyString.charAt(i+1) +
						", n-i-1=" + funnyString.charAt(funnyString.length()-i-1) +
						", n-i-2=" + funnyString.charAt(funnyString.length()-i-2));
				/* Is this a ith character funny? */
				if (Math.abs(funnyString.charAt(i) - funnyString.charAt(i+1)) !=
					Math.abs(funnyString.charAt(funnyString.length()-i-1) -
							 funnyString.charAt(funnyString.length()-i-2))) {
					/* The differences don't match, this isn't a funny string */
					funny = false;
					/* Break out of the loop */
					break;
				}
			}
			/* Was this string funny? */
			if (funny) {
				/* Print funny */
				System.out.println("Funny");
			} else {
				/* Oops, not funny */
				System.out.println("Not Funny");
			}
		}
	}

}
