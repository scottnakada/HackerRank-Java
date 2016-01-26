/*

Welcome to Day 25! Check out a video review of running time
	(https://www.youtube.com/watch?v=7UwDamuC-kU&feature=youtu.be), or just
	jump right into the problem.

In this challenge, you will determine if a given number X is prime or not.
	A prime number is a natural number greater than 1 that has no positive
	divisors other than 1 and itself. You will be given N numbers and for
	each, you will print out "Prime" if the number is prime or "Not prime"
	if the number is not prime.

If this is too easy, create a method that decides if X is prime or not in
	O(sqrt(X)) time. Think modulos and square root! If you are having trouble,
	try creating an O(X) time algorithm and see whether it solves the problem or not.

To review Big-O Notation, remember...

Big-O "is used in Computer Science to describe the performance or complexity
	of an algorithm."
Big-O "specifically describes the worst-case scenario, and can be used to
	describe the execution time required or the space used (e.g. in memory
	or on disk) by an algorithm."
Read more here (https://rob-bell.net/2009/06/a-beginners-guide-to-big-o-notation/)
Good luck!

Input Format

The first line of the input is T, total number of test cases. Each of the next line contains an integer N.

Constraints

1<=T<=20
1<=N<=2×109
Output Format

For each test case print Prime if N is prime, otherwise print Not prime.

Sample Input

3
12
5
7

Sample Output

Not prime
Prime
Prime

Explanation

There are three testcases 12, 5, and 7. 12 is not prime, 5 is prime, and 7 is prime.

 */

package runtimeComplexityIsPrime;

import java.util.Scanner;

public class Solution {
    
    /* See if we have a prime number */
    public static boolean isPrime(int testNumber) {
        /* Is the number less than 2? */
        if (testNumber < 2) {
            /* Not prime, return false */
            return false;
        }
        /* Is the number 2 */
        if (testNumber == 2) {
            /* 2 is a prime number */
            return true;
        }
        /* Is the number a multiple of 2? */
        if (testNumber % 2 == 0) {
            /* Divisible by 2, not prime, return false */
            return false;
        }
        /* Since primes come in pairs, we don't need to test anything above the sqrt of the number */
        int limit = (int) Math.sqrt(testNumber);
        /* Start at 3, and go up to the square root, only testing odd numbers for primes */
        for (int i=3; i<limit; i+=2) {
            if (testNumber % i == 0) {
                /* It is divisible; so not prime, return false */
                return false;
            }
        }
        /* We tried everything; so it must be prime, return true */
        return true;    
    }

    public static void main(String[] args) {
        /* Instantiate a Scanner to read standard input */
		Scanner stdIn = new Scanner(System.in);

		/* Read the number of test cases */
		int testCases = stdIn.nextInt();
        //System.out.println("Test Cases: " + testCases);
        
        /* Loop thru the test cases */
        for (int i = 0; i < testCases; i++) {
            /* Read the next number to test */
            int testNumber = stdIn.nextInt();
            //System.out.println("Testing: " + testNumber);
            
            /* Is the number prime? */
            if (isPrime(testNumber)) {
                /* Yes, the number is prime */
                System.out.println("Prime");
            } else {
                /* Nope, not prime */
                System.out.println("Not prime");
            }
        }
    }
}