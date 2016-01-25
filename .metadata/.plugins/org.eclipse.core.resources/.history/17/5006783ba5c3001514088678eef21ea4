/*

Welcome to Day 15! Check out a video review of linked lists here, or just
	jump right into the problem.

You are given a class Node in the editor which has one instance pointer
	next pointing to next node and an integer data to store the data in Node.

You are also given a pointer head pointing to the head node of a linked
	list and an integer data to add to the list. Create a new node with
	the given integer. Insert this node at the tail of the linked list
	and return the head node. The given head pointer may be null, meaning
	that the initial list is empty.

Code for input/output is already handled in the editor. You have to complete
	the function insert given in the editor. It takes two arguments: the
	head node of the linked list and an integer data to be inserted.

Good Luck!

Input Format

First line contains T, the number of testcases. Each test case contains
	an integer to be inserted at tail of linked list.

Output Format

Output the data in each node separated by space.

Sample Input

4
2
3
4
1

Sample Output

2 3 4 1

Explanation

T=4 
Initially head is null and 2 is inserted. 3,4,1 are inserted at the tail
	of linked list hence the linked list becomes 2 3 4 1

 */
import java.util.Scanner;

public class Solution {
	
	/* insert a node at the end of the linked list */
	public static Node insert(Node head, int newData) {
		/* Pointer to the next node in the list */
		Node nextNode;
		/* If the list is empty */
        if (head == null) {
        	/* Create a new node, initialize it with the new data, and return the new node */
            return new Node(newData);
        }
        /* Scan thru the nodes in the linked list, until nextNode points to the last node */
        /* Loop from the head, until there are no more nodes (nextNode.next == null); going to the next node each time */
        for (nextNode = head; nextNode.next != null; nextNode = nextNode.next) {
            /* All the work is done in the for statement */ 
        }
        /* Create a new node, and add it to the end of the linked list */
        nextNode.next = new Node(newData);
        /* Return the head of the linked list */
        return head;
	}
	
	/* Display the contents of the linked list */
	public static void display(Node head) {
		/* Declare a node pointer, and initialize it at the start of the linked list */
		Node nodePtr = head;
		
		/* Loop, while there are still more nodes in the linked list */
		while(nodePtr != null) {
			/* Print out the next data item */
			System.out.print(nodePtr.data + " ");
			/* Advance to the next node in the linked list */
			nodePtr = nodePtr.next;
		}
		
	}

	public static void main(String[] args) {
		/* Create a Scanner instance to read from standard input */
		Scanner stdIn = new Scanner(System.in);
		
		/* Define the head of an empty linked list, with the head null */
		Node head = null;
		
		/* Read the number of elements in the linked list */
		int elementCtr = stdIn.nextInt();
		
		/* Loop thru all the elements of the linked list */
		while(elementCtr-- > 0) {
			/* Read the next data item for the list */
			int newData = stdIn.nextInt();
			/* Add the element to the end of the linked list */
			head = insert(head, newData);
		}
		
		/* Display the linked list */
		display(head);
	}

}

