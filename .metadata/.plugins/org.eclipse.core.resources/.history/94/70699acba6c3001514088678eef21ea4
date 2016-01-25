/*

Welcome to Day 19! Check out a video review of interfaces here, or
	just jump right into the problem.

Interfaces are an important concept in Java and in a few other
	languages like C#.

Here you are given an interface AdvancedArithmetic which contains
	a method signature
	 
		int divisorSum(int n).

	(The divisorSum function just takes an integer as input and
		return the sum of all its divisors.) Your only task is
		to write a class Calculator which implements the interface.

Note : The class Calculator shouldn't be public.

Good luck!

Input Format

Only one line containing integer n

Constraints 
1<=n<=1000

Output Format

In the first line print "I implemented: AdvancedArithmetic"
	without quotes. In the next line print the sum of divisors
	of n as given in problem statement.

Sample Input

6

Sample Output

I implemented: AdvancedArithmetic
12

Explanation

Divisors of 6 are 1,2,3 and 6. 1+2+3+6=12.

 */
package divisorSum;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/* Create a Scanner instance to read standard Input */
		Scanner stdIn = new Scanner(System.in);
		
		/* Read the number to compute divisor sum */
		int number = stdIn.nextInt();
		
		/* Create a new Calculator */
		AdvancedArithmetic myCalculator = new Calculator();
		
		/* Compute the sum of divisors for number */
		int sum = myCalculator.divisorSum(number);
		
		/* Print the result */
		System.out.println("I implemented: AdvancedArithmetic\n" + sum);

	}

}
