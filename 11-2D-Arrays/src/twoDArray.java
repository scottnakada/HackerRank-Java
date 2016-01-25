/*

Problem Statement

Welcome to Day 11! Review everything we've learned so far by making a
	library catalogue in this video
	(https://www.youtube.com/watch?v=ul0sdBqrivw&feature=youtu.be), or
	just jump right into the
	problem. We haven't discussed 2D Arrays in this series, but
	they're very similar to the regular 1D Arrays you're likely
	familiar with. If you are working in Java, check out Oracle's
	documentation. Similar documentation for 2D Arrays in other
	popular languages is easily found on the internet.

Given a 6×6 2D Array, A:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
We can find 16 hourglasses in A; we define an hourglass in A to
	be a subset of values with indexes falling in this pattern
	in A's graphical representation:

a b c
  d
e f g
The sum of an hourglass is the sum of the values within it.

Your task is to calculate the sum of every hourglass in some
	2D Array, A, and print the largest value (maximum of the
	sums) as your answer.

Input Format

There are 6 lines of input, where each line contains 6
	space-separated integers describing 2D Array A; every
	value in A will be in the inclusive range of -9 to 9.

Constraints 
-9<=A[i][j]<=9 
0<=i,j<=5
Output Format

Print the largest (maximum) hourglass sum found in A.

Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

Sample Output

19

Explanation

Sample Input A contains the following hourglasses:

1 1 1   1 1 0   1 0 0   0 0 0
  1       0       0       0
1 1 1   1 1 0   1 0 0   0 0 0

0 1 0   1 0 0   0 0 0   0 0 0
  1       1       0       0
0 0 2   0 2 4   2 4 4   4 4 0

1 1 1   1 1 0   1 0 0   0 0 0
  0       2       4       4
0 0 0   0 0 2   0 2 0   2 0 0

0 0 2   0 2 4   2 4 4   4 4 0
  0       0       2       0
0 0 1   0 1 2   1 2 4   2 4 0

The hourglass with the maximum sum (19) is:

2 4 4
  2
1 2 4

 */
import java.util.Scanner;

public class twoDArray {

	public static void main(String[] args) {
		/* Create an input Scanner instance for reading input */
		Scanner stdIn = new Scanner(System.in);
		/* Name some constants used in the program */
		int rows = 6;				// Number of rows in the matrix
		int cols = 6;				// Number of columns in the matrix
		int minValueInArray = -9;	// Minimum value of an element in the matrix
		int elementsInHourGlass = 7;// Number of elements in an hourglass
		// Set max to the minimum hourglass sum possible
		int maxHourGlassSum = minValueInArray * elementsInHourGlass;
		// Declare the matrix of numbers
		int matrix[][] = new int[rows][cols];
		int hourGlassSum;	// Sum of the elements in the hourglass
		
		/* Read the values for the matrix looping thru the rows */
        for(int i=0; i < rows; i++){
        	/* Loop thru the columns for each row, reading the matrix */
            for(int j=0; j < cols; j++){
            	/* Read the next value from standard input */
                matrix[i][j] = stdIn.nextInt();
            }
        }
        /* For debugging, print out the matrix */
        for(int i=0; i < rows; i++){
            for(int j=0; j < cols; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        /* Loop thru the possible starting points of the hourglass */
        for (int i=0; i < (rows-2); i++) {
        	for (int j=0; j<(cols-2); j++) {
        		/* Print the hourglass starting position */
        		System.out.println ("Checking hourglass at (" + i + "," + j + ")");
        		/* Print out the hourglass elements */
        		System.out.println(matrix[i][j] + " " + matrix[i][j+1] + " "  + matrix[i][j+2]);
        		System.out.println("  " + matrix[i+1][j+1]);
        		System.out.println(matrix[i+2][j] + " " + matrix[i+2][j+1] + " " + matrix[i+2][j+2]);
        		/* Compute the sum of the elements in the hourglass */
        		hourGlassSum = matrix[i][j]   + matrix[i][j+1]   + matrix[i][j+2] +
        									    matrix[i+1][j+1] +
        					   matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2];
        		/* Print out the sum of the elements in this hourglass */
        		System.out.println("hour glass sum = " + hourGlassSum);
        		/* Is the new hourglass sum greater than the max found so far */
        		if (hourGlassSum > maxHourGlassSum) {
        			/* If so, then replace the max hour glass sum, with the current sum */
        			maxHourGlassSum = hourGlassSum;
        		}
        	}
        }
        /* Print out the maximum hour glass sum */
        System.out.println("Maximum Hour Glass Sum = " + maxHourGlassSum);

	}

}
