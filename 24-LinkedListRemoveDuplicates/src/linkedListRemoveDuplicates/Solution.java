/*

Welcome to Day 24! Check out review everything we've learned so far by coding Hangman
	from scratch in this video tutorial
	(https://www.youtube.com/watch?v=7ApgDTFxodE&feature=youtu.be), or just jump
	right into the problem.

You're given the pointer head pointing to the head node of a linked list, where the
	data in the nodes is in non decreasing order. Delete as few nodes as possible
	so that the list does not contain any value more than once. The given head
	pointer may be null indicating that the list is empty. Adjust the next
	pointers to ensure that the remaining nodes form a single sorted linked list

The code for handling input/output is already given in the editor. You have to
	complete the function removeDuplicates given in the editor which takes one
	argument - the head of the linked list .

Good luck!

Input Format

First line contains T, the number of testcases. Each test case contains an
	integer data to be inserted at tail of linked list. 
Note: The input data for each test case is always given in non-decreasing order.

Output Format

Print the data in each node of linked list separated by a space after the deletion
	of duplicates as given in problem statement.

Sample Input

6
1
2
2
3
3
4

Sample Output

1 2 3 4 

Explanation

T = 6 
2 and 3 are repeated so after deleting the nodes with repeated values the linked
	list becomes

1 2 3 4

 */
package linkedListRemoveDuplicates;

import java.util.Scanner;

/* Declare a Node class for nodes of the Linked List */
class Node {
	/* Declare the instance variables */
	/* Data for the node */
	int data;
	/* Pointer to the next node */
	Node next;

	/* Constructor for the Node class */
	Node(int newData) {
		/* Initialize the Node's data with newData */
		data = newData;
		/* Initialize the node pointing to nothing */
		next = null;
	}
}

public class Solution {

	public static Node removeDuplicates(Node head) {
		/* Another reference to head */
		Node current = head;

		/* Pointer to store the next pointer of a node to be deleted */
		Node next_next;

		/* do nothing if the list is empty */
		if (head == null)
			return head;

		/* Traverse list till the last node */
		while (current.next != null) {

			/* Compare current node with the next node */
			if (current.data == current.next.data) {
				next_next = current.next.next;
				current.next = null;
				current.next = next_next;
			} else // advance if no deletion
				current = current.next;
		}
		return head;

	}
	
	/* Insert a node in the tree, with data newData, at node root */
	public static Node insert(Node head, int newData) {
		/* Create a new Node with the newData */
		Node newNode = new Node(newData);
		
		/* If we have an empty list, return the new Node */
		if (head == null) {
			head = newNode;
			/* If the next node is null, point this node at the next node */
		} else if (head.next == null) {
			/* Point this node at the next */
			head.next = newNode;
		} else {
			/* Scan the linked list for the end of the list, starting from the head */
			Node nextNode = head;
			while (nextNode.next != null) {
				/* Go to the next node */
				nextNode = nextNode.next;
			}
			/* Insert the new node in the last node of the list */
			nextNode.next = newNode;
		}
		/* Return the head of the list */
		return head;
	}
	
	/* Display the linked list */
	public static void display(Node head) {
		/* Scan thru the list from the head */
		Node nextNode = head;
		/* Loop until there are no more nodes */
		while (nextNode != null) {
			/* Print out the data for this node */
			System.out.print(nextNode.data + " ");
			/* Advance to the next node in the list */
			nextNode = nextNode.next;
		}
	}

	public static void main(String[] args) {
		/* Instantiate a Scanner to read standard input */
		Scanner stdIn = new Scanner(System.in);

		/* Read the number of data nodes */
		int numDataNodes = stdIn.nextInt();

		/* Start with an empty list */
		Node root = null;

		/* Read all the data nodes */
		while (numDataNodes-- > 0) {
			/* Read the next data node */
			int newData = stdIn.nextInt();
			/* Insert the newData into the tree */
			root = insert(root, newData);
		}

		/* Remove the duplicate nodes from the list */
		root = removeDuplicates(root);
		
		/* Display the results */
		display(root);
	}

}
