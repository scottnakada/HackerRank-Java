package breadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/* Declare a Node class for nodes of the BST */
class Node {
	/* Declare the instance variables */
	/* Data for the node */
	int data;
	/* Left and right sub-trees */
	Node left;
	Node right;

	/* Constructor for the Node class */
	Node(int newData) {
		/* Initialize the Node's data with newData */
		data = newData;
		/* This nodes sub-trees are empty (null) to start */
		left = null;
		right = null;
	}
}

public class Solution {

	/* Print out the binary tree in level Order */
	static void levelOrder(Node root) {
		/* Create a queue of nodes to process */
		Queue<Node> queue = new LinkedList<Node>();
		/* Add the root node to this queue */
		queue.add(root);
		/* Loop while the queue is not empty */
		while (!queue.isEmpty()) {
			/* Extract a node from the head of the queue */
			Node tempNode = queue.poll();
			/* Print out the data for that node */
			System.out.printf("%d ", tempNode.data);
			/* If the left node is not empty, add it to the queue */
			if (tempNode.left != null) {
				queue.add(tempNode.left);
			}
			/* If the right node is not empty, add it to the queue */
			if (tempNode.right != null) {
				queue.add(tempNode.right);
			}
		}
	}

	/* Insert a node in the tree, with data newData, at node root */
	public static Node insert(Node root, int newData) {
		/* If an empty tree, return the new Node */
		if (root == null) {
			/* Create a new node and return it */
			return new Node(newData);
		} else {
			/* Store the current node */
			Node current;
			/* Is the new data less than the data for this node? */
			if (newData <= root.data) {
				/* Insert the new Data on the left sub-tree */
				current = insert(root.left, newData);
				root.left = current;
			} else {
				/* Insert the new Data on the right sub-tree */
				current = insert(root.right, newData);
				root.right = current;
			}
			/* Return the root node after inserting the data */
			return root;
		}

	}

	/* Start the program here */
	public static void main(String[] args) {
		/* Instantiate a Scanner to read standard input */
		Scanner stdIn = new Scanner(System.in);

		/* Read the number of data nodes */
		int numDataNodes = stdIn.nextInt();

		/* Start with an empty tree */
		Node root = null;

		/* Read all the data nodes */
		while (numDataNodes-- > 0) {
			/* Read the next data node */
			int newData = stdIn.nextInt();
			/* Insert the newData into the tree */
			root = insert(root, newData);
		}

		/* Print out the tree in levelOrder */
		levelOrder(root);

	}

}
