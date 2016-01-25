/*

Problem Statement

Welcome to Day 10! Check out this video for a review of binary numbers, or just
	jump right into the problem.

For this challenge, convert a given number, n, from decimal (base 10) to binary
	(base 2).

Input Format

The first line contains a single integer, T, the number of test cases. The T
	subsequent lines of test cases each contain a single value, n, the base 10
	positive integer to be converted.

Constraints 
1<=T<=1000 
1<=n<=231

Output Format

For each test case, print the value of n in binary on a new line.

Sample Input

2
4
5

Sample Output

100
101

 */
import java.util.Scanner;

public class BinaryNumbers {
	/* Declare a standard input scanner */
	private static Scanner stdIn;
	
	/* Recursively create a string which is the binary equivalent of the number */
	public static String decimalToBinary(int decimalNum) {
		/* Return a null string if there is no more number */
		if (decimalNum == 0) {
			return "";
		}
		
		/* Return the binary string of the number divided by 2, and the remainder of the number mod 2 */
		return decimalToBinary(decimalNum/2) + Integer.toString(decimalNum%2);
		
	}

	/* Starting point for the program */
	public static void main(String[] args) {
		/* Create a standard input instance */
        stdIn = new Scanner(System.in);
        /* Read the number of test cases */
        int testCases = stdIn.nextInt();
        //System.out.println("Test cases = " + testCases);
        
        /* Loop thru all of the test cases */
        for(int testCtr = 0; testCtr<testCases; testCtr++) {
        	/* Read the next decimal number to convert */
        	int decimalNum = stdIn.nextInt();
        	//System.out.println("Number to convert=" + decimalNum);
        	/* Print out the binary string equivalent of the decimal number */
        	System.out.println(decimalToBinary(decimalNum));
        }
    }
}
