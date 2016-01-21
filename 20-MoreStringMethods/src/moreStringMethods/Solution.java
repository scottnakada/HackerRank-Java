/*

Welcome to Day 20! Check out a video review of pointers, aliasing,
	garbage collection, and Java Virtual Machine, or just jump
	right into the problem. In the 30 Days of Code series, we
	haven't talked about StringTokenizer, but that's okay! Java
	users can dive into the StringTokenizer documentation, figure
	out what it can do, and solve this problem. You can do this!

And those of you that are not using Java can solve this challenge
	in many different ways in your favorite programming language.

Given a string S, find number of words in that string. For this
	problem a word is defined by a string of one or more English letters.

Note: Space or any of the special characters like ![,?.\_'@+] will
	act as a delimiter.

Input Format
The string will only contain lower case english alphabets, upper
	case english alphabets, blank spaces and this special
	characters: ![,?.\_'@+].

Constraints 
1<= |S| <=400000

Output Format
In the first line, print number of words in the string. The
	words don't need to be unique. Also print each word in
	a separate line.

Sample Input

He is a very very good boy, isn't he?

Sample Output

10
He
is
a
very
very
good
boy
isn
t
he

 */

package moreStringMethods;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) {
		/* Create an instance of the Scanner class to read standard input */
		Scanner stdIn = new Scanner(System.in);

		/* Read the input */
		String inputString = stdIn.nextLine();

		/* Create a string tokenizer of the input string */
		/* Escape these characters ![,?.\_'@+] */
		StringTokenizer stringTokens = new StringTokenizer(inputString, " ![,?.\\_'@+]");

		/* Print out the number of tokens read */
		System.out.println(stringTokens.countTokens());

		/* Loop thru the tokens in the string token list */
		while (stringTokens.hasMoreTokens()) {
			/* Print out the next token */
			System.out.println(stringTokens.nextToken());
		}
	}

}
