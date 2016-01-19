/*
Problem Statement

Welcome to Day 1! Check out the video tutorial here, or just jump right into the problem.

Let's talk about data types. In programming, a data type is a classification of types of
	data that determine the possible values and operations on that particular type.

Some typical examples of data types are:

int
double
boolean
char
String
Array

Remember, in languages like Java data types (like the ones above) can be classified into two main groups:

Primitive Types
Reference Types

For this challenge, consider the following inputs (you don't need to read any input):

5.35
'a'
false
100
"I am a code monkey"
true
17.3
'c'
"derp"

For each line above, print out if it is an instance of a primitive or referenced type as
	well as which data type it is (using the typical examples above).

Good luck!

Hint: In Java, String is a referenced type.

Output Format

Output nine lines. Print one line for each of the input given above in the following format:

MainDataTypeOfInstance : SpecificDataTypeOfInstance
For example, if the input is:

123
Your output should be:

Primitive : int
Make sure you spell everything correctly and capitalize your entries. Also,
	don't forget spaces and colon in between the main and specific data types!
*/
public class Solution {
	
	public void printVars() {
        System.out.println("Primitive : double");
        System.out.println("Primitive : char");
        System.out.println("Primitive : boolean");
        System.out.println("Primitive : int");
        System.out.println("Referenced : String");
        System.out.println("Primitive : boolean");
        System.out.println("Primitive : double");
        System.out.println("Primitive : char");
        System.out.println("Referenced : String");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol = new Solution();
        sol.printVars();
	}

}