/*

Start learning about Exceptions in Day 16's video
	(https://www.youtube.com/watch?v=2foOQ1Uxb6s&feature=youtu.be)or just jump into
	this sorting challenge!

Sorting is an important basic algorithmic concept used to organize
	data so coders can better solve problems. You may find our
	interactive article on widely-used sorting algorithms and this
	article on Insertion Sort helpful in solving today's problem.

The absolute difference between two integers, a and b, is |a-b|. The
	minimum absolute difference between two integers in a list A of
	positive integers, is the smallest absolute difference between
	any two integers in A.

Given a list A={a0,a1,…,aN-1} of unsorted integers, find and print
	the pair (or pairs) of elements having the minimum absolute difference.

Note: More than one pair of elements may have the same absolute difference.

Input Format

The first line contains a single integer N, denoting the length of list A. 
The second line contains N space-separated integers, a0,a1,…,aN-1,
	representing the elements in A.

Constraints

2<=N<=2×105
-107<=Ai<=107
Ai!=Aj,where 0<=i<j<=N-1

Output Format

Print the space-separated pair of elements having the minimum absolute
	difference in ascending order. If more than one pair meets this
	criterion, print them consecutively, separated by a space, in
	ascending order on a single line. Because we are printing
	space-separated pairs, some elements may appear more than once
	in your output.

Sample Input 1

10
-20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854

Sample Output 1

-20 30

Explanation 
The minimum absolute difference is 50 (ABS(30-(-20))=50). The only
	pair having this difference is (-20,30).

Sample Input 2

12
-20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854 -520 -470

Sample Output 2

-520 -470 -20 30

Explanation 
Our minimum absolute difference is 50. The pairs (-470,-520) and (-20,30)
	both have this difference.

Sample Input 3

4
5 4 3 2

Sample Output 3

2 3 3 4 4 5

Explanation 
Our minimum absolute difference is 1. The pairs (2,3), (3,4), and
	(4,5) all have this difference. Notice that 3 and 4 appear multiple
	times, because they are components of more than one pair.

Note: Recall that pairs in the output must be printed in ascending order.

 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	/* Define a global debug level variable */
    /* debug = -1, production mode, solution to the problem */
	/* debug = 0, normal mode, no debug output */
	/* debug = 1, print out intermediate results */
	/* debug = 2, print out detailed intermediate results */
	public static int debug = -1;
    
    /* Scanner for standard input */
	private static Scanner stdIn;
    
    /* Print the numbers in the array */
	public static void printNumbers(int[] sortArray) {

		/* Loop thru the numbers in the array */
		for (int i = 0; i < sortArray.length; i++) {
            /* If it is the first element, don't print the , */
            if (i == 0) {
                System.out.print(sortArray[i]);
            } else {
			    /* Print out the value at index i of the array */
			    System.out.print(", " + sortArray[i]);
            }
		}
		/* Skip to a new line after printing */
		System.out.println();
	}
    
    /* Swap two numbers in the sorted array */
	public static void swapNumbers(int index1, int index2, int[] sortArray) {

		int temp;

		if (debug > 1) {
			System.out.println("Swapping array[" + index1 + "]=" + sortArray[index1] + " > sortArray[" + index2 + "]="
					+ sortArray[index2]);
		}

		/* Store the first value to be swapped */
		temp = sortArray[index1];
		/* Move the second value into the first values location */
		sortArray[index1] = sortArray[index2];
		/* Put the first value into the second values location */
		sortArray[index2] = temp;
	}

    
    /* Do a selection sort on the sortArray */
	public static void sort(int[] sortArray) {
		/* Store the array length */
		int arrayLength = sortArray.length;

		if (debug > 0) {
			System.out.println("Intermediate results");
		}

		/*
		 * Scan the array from the beginning to one minus the length, inserting
		 * the smallest number in the lowest spot
		 */
		for (int startIndex = 0; startIndex < arrayLength - 1; startIndex++) {
			/* Assume the smallest index is the starting index */
			int smallerIndex = startIndex;
			/*
			 * Check for lower numbers starting at the startIndex + 1 to the end
			 */
			for (int compareIndex = startIndex + 1; compareIndex < arrayLength; compareIndex++) {
				/* Is the new number smaller */
				if (sortArray[compareIndex] < sortArray[smallerIndex]) {
					/* Save the new smallerIndex */
					smallerIndex = compareIndex;
				}
			}

			/* Has there been a change in the smallest index */
			if (smallerIndex != startIndex) {
				/* If new smaller number, then swap them */
				swapNumbers(startIndex, smallerIndex, sortArray);
			}
			if (debug > 0) {
				printNumbers(sortArray);
			}
		}
		if (debug > 0) {
			System.out.println();
		}
		return;

	}

    public static void main(String[] args) {
        /* Create a new instance of the Scanner to read standard input */
		stdIn = new Scanner(System.in);

        /* Read the number of numbers to be sorted */
		int numberSorted = stdIn.nextInt();
        if (debug > -1) {
            System.out.println("Reading " + numberSorted + " numbers");
        }

		/* Create a new integer array to hold the numbers to sort */
		int[] sortArray = new int[numberSorted];
		/* Read all the numbers to sort */
		for (int i = 0; i < numberSorted; i++) {
			/* Read the next number into the array */
			sortArray[i] = stdIn.nextInt();
		}
        
        /* Printout the incoming data */
        if (debug > -1) {
            System.out.println("Incoming array");
            printNumbers(sortArray);
        }
        
        /* Sort the array of numbers */
        //sort(sortArray);
        Arrays.sort(sortArray);
        
        /* Printout the sorted data */
        if (debug > -1) {
            System.out.println("Sorted array");
            printNumbers(sortArray);
        }
        
        /* Initialize the minAbsoluteDiff to the difference between the first two elements */
        /* Because the array is sorted, subtracting the higher index from the lower
            guarantees that this will be a positive number; so for efficiency, I'm
            not doing the Math.abs */
        int minAbsoluteDiff = sortArray[1] - sortArray[0];
        
        /* Declare a head, tail, and nodePtr of type Node */
        Node head, tail, nodePtr;
        
        /* Create a linked list of the minAbsolute pairs for the output */
        /* Note, we will have to restart this list if a new minAboluteDiff is found; but */
        /*  by doing it this way, we only need one pass to find the min absolute, and */
        /*  to find the pairs, in sorted order (because list is sorted) */
        /* Also note, I'm depending on the array being sorted at this point, to determine
            the min and max values for the Node */
        head = new Node(sortArray[0], sortArray[1]);
        /* Have the tail of the linked list point to the head, since there is only one element */
        tail = head;
        if (debug > 1) {
            System.out.println("Initial pairs linked list, with minAbsoluteDiff=" + minAbsoluteDiff);
            /* Loop thru the linked list, printing out the pairs */
            nodePtr = head;
            while(true) {
                System.out.print(nodePtr.minData + " " + nodePtr.maxData + " ");
                if (nodePtr.next == null) {
                    break;
                }
                nodePtr = nodePtr.next;
            }
            System.out.println();
        }
        
        /* Loop thru the elements in the sorted array, from the 1st to the end -1, comparing min absolute difference */
        for (int i = 1; i < sortArray.length - 1; i++) {
            /* Do we have a new min absolute? */
            if ((sortArray[i+1]-sortArray[i])<minAbsoluteDiff) {
                /* Store the new minAbsoluteDiff */
                minAbsoluteDiff = sortArray[i+1] - sortArray[i];
                /* Create a new linked list */
                /* Note, I really should free the memory from the old linked list; but I'm hoping that is negligible */
                head = new Node(sortArray[i], sortArray[i+1]);
                /* Have the tail of the linked list point to the head, since there is only one element */
                tail = head;
                if (debug > 1) {
                    System.out.println("New minAbsoluteDiff pairs linked list, with minAbsoluteDiff=" + minAbsoluteDiff);
                    /* Loop thru the linked list, printing out the pairs */
                    System.out.println("Initial pairs linked list, with minAbsoluteDiff=" + minAbsoluteDiff);
                    /* Loop thru the linked list, printing out the pairs */
                    nodePtr = head;
                    while(true) {
                        System.out.print(nodePtr.minData + " " + nodePtr.maxData + " ");
                        if (nodePtr.next == null) {
                            break;
                        }
                        nodePtr = nodePtr.next;
                    }
                    System.out.println();
                }
            /* Do we have another pair that is the minAbsolute? */
            } else if ((sortArray[i+1]-sortArray[i]) == minAbsoluteDiff) {
                /* Store a new node at the tail of the linked list */
                tail.next = new Node(sortArray[i], sortArray[i+1]);
                /* Update the tail to point to the new tail */
                tail = tail.next;
                if (debug > 1) {
                    System.out.println("Another minAbsoluteDiff pairs linked list, with minAbsoluteDiff=" +
                                       minAbsoluteDiff);
                    /* Loop thru the linked list, printing out the pairs */
                    nodePtr = head;
                    while(true) {
                        System.out.print(nodePtr.minData + " " + nodePtr.maxData + " ");
                        if (nodePtr.next == null) {
                            break;
                        }
                        nodePtr = nodePtr.next;
                    }
                    System.out.println();
                }
            }
        }
        
        /* Loop thru the linked list, printing out the pairs */
        nodePtr = head;
        while(true) {
           System.out.print(nodePtr.minData + " " + nodePtr.maxData + " ");
            if (nodePtr.next == null) {
                break;
            }
            nodePtr = nodePtr.next;
        }
        System.out.println();
    }
}
