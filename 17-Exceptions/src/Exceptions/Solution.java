/*

Welcome to Day 17! Learn how to use try-catch blocks
	(https://www.youtube.com/watch?v=2foOQ1Uxb6s&feature=youtu.be)in Day 16 and how
	to create your own exceptions in Day 17
	(https://www.youtube.com/watch?v=9TuoE16Tlac&feature=youtu.be) or just
	jump right into the problem.

Create a class Calculator which consists of a single method
	power(int, int). This method takes two integers, n and p, as
	parameters and finds np. If either n or p is negative, then the
	method must throw an exception which says "n and p should be
	non-negative".

Code for handling Input/Output is already provided in the editor. Please
	read the partially completed code in the editor and complete it.

Note: The class Calculator mustn't be public.

No need to worry about constraints, there won't be any overflow if
	your code is correct.

If you enjoyed this challenge, here's a java only Exception Challenge

Input Format

First line contains T, the number of test cases. Next T lines
	contain two integers n and p separated by a space.

Output Format

Output T lines. For each test case if n and p are positive then
	print n^p else print "n and p should be non-negative" without quotes.

Sample Input

4
3 5
2 4
-1 -2
-1 3

Sample Output

243
16
n and p should be non-negative
n and p should be non-negative

Explanation

T=4 
In the first test case both integers are positive hence the output is 35=243 
In the second test case both integers are positive hence the output is 24=16 
In the third test case both the integers are negative hence the output is
	"n and p should be non-negative" 
In the fourth test case n is negative hence the output is
	"n and p should be non-negative"

 */
package Exceptions;

import java.util.Scanner;

public class Solution {

	/* Declare a Scanner for reading standard input */
	private static Scanner stdIn;

	/* Main entry point for the program */
	public static void main(String[] args) {
		/* Create a new instance of a scanner for reading standard input */
		stdIn = new Scanner(System.in);
		
		/* Read the number of test cases */
		int testCases = stdIn.nextInt();
		
		/* Loop while there are more test cases */
		while(testCases-- > 0) {
			/* Read the number and power for the test case */
			int number = stdIn.nextInt();
			int power = stdIn.nextInt();
			
			/* Create a new instance of the calculator */
			Calculator myCalculator = new Calculator();
			
			/* Try running the power method, and catch the exception */
			try {
				/* answer is number raised to the power power */
				int answer = myCalculator.power(number, power);
				/* Print out the result */
				System.out.println(answer);
			} catch(Exception exceptionNegNumbers) {
				/* Print the exception message */
				System.out.println(exceptionNegNumbers.getMessage());
			}
		}

	}

}
