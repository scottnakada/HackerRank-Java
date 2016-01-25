/*

Welcome to Day 21! Check out a video review of generics here, or
	just jump right into the problem.

Generic methods are a very efficient way to handle multiple
	datatypes using a single method.

Note: Fewer languages are enabled for this challenge because the
	concept of Generics is not common in many languages.

Let's say you have an integer array and a string array. You have
	to write a single method printArray that can print all the
	elements of both arrays. The method should be able to accept
	both integer arrays or string arrays.

You are given code in the editor. Complete the code so that it
	prints the following lines:

1
2
3
Hello
World

Do not use method overloading because your answer will not be accepted.

Good luck!

 */

package generics;

import java.lang.reflect.Method;

/* Declare the Printer class, to print generic values */
class Printer {
	/* Declare a generic printArray method of type inputType,
	 * accepting an array of type inputType */
	public <inputType> void printArray(inputType[] array) {
		/* Loop thru the array */
		for (int i = 0; i < array.length; i++) {
			/* Print out each element of the array on a new line */
			System.out.println(array[i]);
		}
	}
}

	/* Declare the solution class */
public class Solution {

	/* Start the program here */
	public static void main(String[] args) {
		/* Create an instance of the Printer class */
		Printer myPrinter = new Printer();
		
		/* Create Integer and String arrays as test data */
		Integer[] intArray = { 1, 2, 3 };
		String[] stringArray = { "Hello", "World" };
		
		/* Print the arrays using the generic function printArray */
		myPrinter.printArray( intArray );
		myPrinter.printArray( stringArray );
		
		/* Test that there is only one generic function handling both
		 * integers and strings.  (An alternative method for doing this
		 * is function overloading, with one function accepting strings,
		 * and the other accepting ints; but this exercise is about
		 * doing a single generic function to handle both
		 */
		
		/* Initialize the printArray method count to 0 */
		int printArrayMethodCount = 0;
		/* Loop thru all the methods for the Printer class */
		for (Method method : Printer.class.getDeclaredMethods()) {
			/* Get the name of the method */
			String methodName = method.getName();
			/* Is this method a printArray method */
			if (methodName.equals("printArray")) {
				/* If so, increment the printArrayMethodCount */
				printArrayMethodCount++;
			}
		}
		/* See if we have more than 1 printArray method */
		if (printArrayMethodCount > 1) {
			/* Print out an error message */
			System.out.println("Method overloading is not allowed!");
			assert printArrayMethodCount == 1;
		}
	}

}
