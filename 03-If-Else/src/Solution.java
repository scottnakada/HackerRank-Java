import java.util.Scanner;

/*
Problem Statement

Welcome to Day 3! Check out a review of if-else statements here, or just jump right into the problem.

Using "if-else" you can perform decision making in your code. See the flowchart below (taken from wikipedia):

This problem will test your knowledge on "if-else" statements.

Given an integer N as input, check the following:

If N is odd, print "Weird".
If N is even and, in between the range of 2 and 5(inclusive), print "Not Weird".
If N is even and, in between the range of 6 and 20(inclusive), print "Weird".
If N is even and N>20, print "Not Weird".
We have given you partially completed code in the editor, complete it to solve the problem.

Input Format

There is a single line of input: integer N.

Constraints 
1≤N≤100
Output Format

Print "Weird" if the number is weird. Otherwise, print "Not Weird". Do not print the quotation marks.

Sample Input 1

3

Sample Output 1

Weird

Explanation 
N=3, is odd hence the its a Weird Number.

Sample Input 2

24

Sample Output 2

Not Weird

Explanation
N=24, is >20 hence its not a Weird Number.
*/

public class Solution {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "";
		// Is n odd?
		if (n % 2 == 1) {
			// n is odd, that's Weird
			ans = "Weird";
		} else {
			// n is even
			if ((2 <= n) && (n < 5)) {
				ans = "Not Weird";
			} else {
				if ((6 <= n) && (n <= 20)) {
					ans = "Weird";
				} else {
					if (n > 20) {
						ans = "Not Weird";
					}
				}
			}

		}
		System.out.println(ans);

	}

}
