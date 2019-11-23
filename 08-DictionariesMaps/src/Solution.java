
/*

Problem Statement

Welcome to Day 8! Check out a video review of dictionaries and hashmaps here
	(https://www.youtube.com/watch?v=nbDhDMYxUEw&feature=youtu.be), or just jump
	right into the problem.

You are given a phone book that consists of your friend's names and their phone number.
	After that you will be given your friend's name as query. For each query, print the
	phone number of your friend.

Input Format

The first line will have an integer N denoting the number of entries in the phone book
	Each entry consists of two lines: a name and the corresponding phone number. 

After these, there will be some queries. Each query will contain name of a friend. Read
	the queries until end-of-file.

Constraints
A name consists of only lower-case English letters and it may be in the format 
'first-name last-name' or in the format 'first-name'. Each phone number has exactly
	8 digits without any leading zeros.

1<=N<=104
1<=queries<=104

Output Format

For each case, print "Not found" without quotes, if the friend has no entry in the
	phone book. Otherwise, print the friend's name and phone number. See sample output
	for the exact format.

To make the problem easier, we provided a portion of the code in the editor. You can
	either complete that code or write completely on your own.

Sample Input

3
sam
99912222
tom
11122222
harry
12299933
sam
edward
harry

Sample Output

sam=99912222
Not found
harry=12299933

 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	/* input Scanner for reading input for the program */
	private static Scanner inputScanner;

	public static void main(String[] args) {
		/* Create a phone book Map */
		Map<String, String> phoneBook = new HashMap<String, String>();
		/* Create the input Scanner instance */
		inputScanner = new Scanner(System.in);
		
		/* Read the number of input phone numbers */
		int numFriends = inputScanner.nextInt();
		/* Go to the next line of input */
		inputScanner.nextLine();
		
		/* Loop thru the number of friends, reading the name and phone number, and adding to the phoneBook */
		for (int i = 0; i < numFriends; i++) {
			/* Read the name of the friend */
			String name = inputScanner.nextLine();
			/* Read the phone number */
			String phone = inputScanner.nextLine();
			/* Put the name and phone number into the phoneBook */
			phoneBook.put(name, phone);
		}

		/* Loop while there is still more input data */
		while (inputScanner.hasNext()) {
			/* Read the person to search for a phone number */
			String inputName = inputScanner.nextLine();

			/* Does the name exist in the phone Book */
			if (phoneBook.containsKey(inputName)) {
				/* Yes, print out the name and phone number */
				System.out.println(inputName + "=" + phoneBook.get(inputName));
			} else {
				/* Print out error message if not found */
				System.out.println("Not found");
			}

		}

	}

}
