/*
Problem Statement

Welcome to Day 5! Check out the video review of loops here, or just jump right into the problem.

In this problem you will test your knowledge of loops. Given three integers a, b, and N, output the following series:

a+2^0*b,a+2^0*b+2^1*b,......,a+2^0*b+2^1*b+...+2^(N-1)*b

Input Format

The first line will contain the number of testcases T. Each of the next T lines will have three integers, a, b, and N.

Constraints

0<=T<=500
0<=a,b<=50
1<=N<=15

Output Format

Print the answer to each test case in a separate line.

Sample Input

2    
5 3 5
0 2 10

Sample Output

8 14 26 50 98
2 6 14 30 62 126 254 510 1022 2046

Explanation

There are two test cases. 
In the first case: a=5, b=3 ,N=5 
1st term =   5+(2^0*3)=8 
2nd term = 5+(2^0*3)+(2^1*3)=14 
3rd term =  5+(2^0*3)+(2^1*3)+(2^2*3)=26 
4th term =  5+(2^0*3)+(2^1*3)+(2^2*3)+(2^3*3)=50 
5th term =  5+(2^0*3)+(2^1*3)+(2^2*3)+(2^3*3)+(2^4*3)=98
*/
import java.util.Scanner;

public class Solution {

	// Input Scanner
	private static Scanner inputScanner;

	// Solve the problem function
	public static void solveProblem() {

		// Declare local variables
		int testCases; // Number of test cases
		int a; // a (first argument)
		int b; // b (multiplied by powers of 2)
		int n; // n (number of sub terms)
		long result; // result of term computation

		// Define the input Scanner for reading input
		inputScanner = new Scanner(System.in);

		// Read the number of test cases
		testCases = inputScanner.nextInt();

		// Loop thru the test cases
		for (int testCaseNum = 0; testCaseNum < testCases; testCaseNum++) {
			// Read the a, b, and n values for this test case
			a = inputScanner.nextInt();
			b = inputScanner.nextInt();
			n = inputScanner.nextInt();

			// Loop thru the terms to compute
			for (int term = 1; term <= n; term++) {
				// Initialize the result with the value of a
				result = a;
				// Loop thru the subTerms
				for (int subTerm = 0; subTerm < term; subTerm++) {
					// Add the power of 2 times b to the result
					result += Math.pow(2, subTerm) * b;
				}
				// Print out the subTerm
				System.out.print(result + " ");
			}
			// Print out a newline to separate the test cases
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// Solve the problem
		solveProblem();
	}

}
