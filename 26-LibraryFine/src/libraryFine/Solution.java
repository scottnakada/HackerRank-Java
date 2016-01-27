/*

Welcome to Day 26! Check out a video review of testing
	(https://www.youtube.com/watch?v=w5ReZxTo4yc&feature=youtu.be), or just jump
	right into the problem.

The Head Librarian at a library wants you to make a program that calculates the
	fine for returning the book after the return date. You are given the actual
	and the expected return dates. Calculate the fine as follows:

If the book is returned on or before the expected return date, no fine will be
	charged, in other words fine is 0.
If the book is returned in the same month as the expected return date, Fine =
	15 Hackos × Number of late days
If the book is not returned in the same month but in the same year as the expected
	return date, Fine = 500 Hackos × Number of late months
If the book is not returned in the same year, the fine is fixed at 10000 Hackos.

Good luck!

Input Format

You are given the actual and the expected return dates in D M Y format
	respectively. There are two lines of input. The first line contains the D M Y 
	values for the actual return date and the next line contains the D M Y values
	for the expected return date.

Output Format

Output a single value equal to the fine.

Sample Input

9 6 2015
6 6 2015

Sample Output

45

Explanation

Since the actual date is 3 days later than expected, fine is calculated as 15×3=45 Hackos.

 */
package libraryFine;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		try {
			/* Instantiate a Scanner for reading standard input */
			Scanner stdIn = new Scanner(System.in);
			
			/* Define a simple date format */
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");
			
			/* Read the returned and due date strings */
			String returnedDateStr = stdIn.nextLine();
			String dueDateStr = stdIn.nextLine();
			
			/* Convert the strings to dates */
			Date returnedDate = simpleDateFormat.parse(returnedDateStr);
			Date dueDate = simpleDateFormat.parse(dueDateStr);
			System.out.println(simpleDateFormat.format(returnedDate));
			System.out.println(simpleDateFormat.format(dueDate));
			
			/* Is the book overdue? */
			if (returnedDate.compareTo(dueDate) < 0) {
				System.out.println("The book was returned on time");
				System.out.println("0");
			} else {
				/* The book is overdue */
				/* Was it returned in a different year? */
				if (returnedDate.getYear() != dueDate.getYear()) {
					/* Pay the yearly fine */
					System.out.println("More than a year late");
					System.out.println("10000");
				/* Was it returned in a different month? */
				} else if (returnedDate.getMonth() != dueDate.getMonth()) {
					/* Not returned in the same month */
					System.out.println((returnedDate.getMonth() - dueDate.getMonth()) + " months late");
					System.out.println(((returnedDate.getMonth() - dueDate.getMonth()) * 500));
				/* How many days late in this month */
				} else {
					/* returned in the month */
					System.out.println("returnedDate: " + returnedDate.getDate() + ", dueDate: " + dueDate.getDate());
					System.out.println((returnedDate.getDate() - dueDate.getDate()) + " days late");
					System.out.println(((returnedDate.getDate() - dueDate.getDate()) * 15));
				}
			}
		/* Handle errors parsing the date strings */
		} catch (ParseException exception) {
			System.out.println("Problems parsing date strings");
			exception.printStackTrace();
		}
	}

}
