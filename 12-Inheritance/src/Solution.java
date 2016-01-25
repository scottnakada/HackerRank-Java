/*

Problem Statement

Welcome to Day 12! Check out this video reviewing inheritance
	(https://www.youtube.com/watch?v=wlA66hZ4Z74&feature=youtu.be), or just jump right
	into the problem.

You are given two classes, Student and Grade, where Student is the base class and
	Grade is the derived class. Completed code for Student and stub code for Grade
	are provided for you in the editor. Note that Grade inherits all the properties
	of Student.

Complete the Grade class by writing a class constructor (Grade(String,String,int,int))
	and a char calculate() method. The calculate method should return the character
	representative of a Student's *Grade. Score as defined in this chart: 
	
		Score						Grade
		score <= 40					D
		40 <= score < 60            B
		60 <= score < 75            A
		76 <= score < 90            E
		90 <= score <= 100          O

Input Format

Input is already handled for you by the code pre-filled in the editor. There are
	4 lines of input containing first name, last name, phone, and score, respectively.

Constraints 
4<=|first name|,|last name|<=10 
phone contains exactly 7 digits 
1<=score<=100

Output Format

Output is already handled for you by the code pre-filled in the editor. Your output
	will be correct if your Grade class constructor and calculate method are properly written.

Sample Input

 Heraldo
 Memelli
 8135627
 90
 
Sample Output

 First Name: Heraldo
 Last Name: Memelli
 Phone: 8135627
 Grade: O

 */
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/* Create an instance of the Scanner for reading standard input */
		Scanner stdIn = new Scanner(System.in);
		
		/* Read the first and last name of the student */
		String firstName = stdIn.nextLine();
		String lastName = stdIn.nextLine();
		
		/* Read the phone number and score */
		int phone = stdIn.nextInt();
		int score = stdIn.nextInt();
		
		/* Create a new Student instance */
		Student student = new Grade(firstName, lastName, phone, score);
		/* Display the student information */
		student.display();
		/* Calculate the Grade for the student */
		Grade grade = (Grade)student;
		/* Print out the grade */
		System.out.println("Grade: " + grade.calculate());

	}

}
