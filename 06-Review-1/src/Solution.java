
/*

Problem Statement

Welcome to Day 6! Review everything we've learned so far by making a MadLibs program in
	this video, or just jump right into the problem.

Your teacher has given you the task of drawing a staircase structure. Being an expert
	programmer, you decided to make a program to draw it for you instead. Given the
	required height, can you print a staircase as shown in the example?
	
Note: The last line has zero spaces before it.

Good luck!

Constraints
 
1<=N<=100

Input Format

You are given an integer N depicting the height of the staircase.

Output Format

Print a staircase of height N that consists of # symbols and spaces as given in Sample Output.

Sample Input

6

Sample Output

     #
    ##
   ###
  ####
 #####
######

*/
import java.util.Scanner;

public class Solution {

	/* Create a madLibs Staircase */
	public static void madLibsStairs() {
		// Declare the number of steps for the staircase
		int numSteps = 0;

		// Initialize the input stream scanner instance
		Scanner inputScanner = new Scanner(System.in);

		// Read the number of steps for this staircase
		numSteps = inputScanner.nextInt();

		// Count the number of steps from numSteps-1 to 0 (number of spaces to
		// print)
		for (int stepCtr = (numSteps - 1); stepCtr >= 0; stepCtr--) {
			// Count the number of steps from 0 to numSteps-1 (characters to
			// print)
			for (int charCtr = 0; charCtr < numSteps; charCtr++) {
				// If we are still printing spaces, print a space, otherwise,
				// print a #
				if (charCtr < stepCtr) {
					// Still printing spaces
					System.out.print(" ");
				} else {
					// Printing # now
					System.out.print("#");
				}
			}
			// Skip to the next line, after printing all the characters in a
			// line
			System.out.println();
		}
		

		/* Close the input stream after use */
		inputScanner.close();
	}

	public static void main(String[] args) {
		// Print the madLib Stairs staircase
		madLibsStairs();

	}

}
