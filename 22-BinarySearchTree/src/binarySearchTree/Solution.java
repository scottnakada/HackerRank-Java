/*

Welcome to Day 22! Check out a video review of binary search trees and heaps here
	(https://www.youtube.com/watch?v=cqoGE1GPqU8&feature=youtu.be), or just jump
	right into the problem.

The height of a binary tree is the number of nodes on the largest path from
	root to any leaf. You are given a pointer root pointing to the root of
	a binary search tree. Return the height of the tree. 
	
You only have to complete the function getHeight given in the editor.

Input Format

First line contains T, the number of test cases. Next T lines contain an
	integer data to be added to the binary search tree.

Output Format

Output the height of the binary search tree.

Sample Input

7
3
5
2
1
4
6
7

Sample Output

4

Explanation

The Binary Search tree formed with the given values is

      3  
     /  \
    2    5
   /    /  \
  1    4    6
             \
              7
The maximum length root to leaf path is 3->5->6->7. There are 4 nodes
	in this path. Therefore the height of the binary tree = 4.

 */
package binarySearchTree;

import java.util.Scanner;

/* Declare a node class as a node of a binary search tree */
class Node {
	/* Instance variables */
	/* Left and right nodes of the binary tree */
	Node left, right;
	/* Data for the node */
	int data;
	
	/* Constructor for the node */
	Node(int newData) {
		/* Initialize the node with the new data */
		data = newData;
		/* Start with both the left and right nodes empty (null) */
		left = null;
		right = null;
	}
}

public class Solution {
	
	/* Get the max height of the binary tree, starting at root */
	public static int getHeight(Node root) {
		/* If root is null, we have an empty tree */
		if (root == null) {
			/* Return 0, for an empty tree */
            return 0;
        } else {
        	/* If not empty, return the max of the left and right height, +1 for this node */
            return (Math.max(getHeight(root.left), getHeight(root.right)) + 1);
        }
	}
	
	/* Insert a Node onto the binary tree */
	public static Node insert (Node root, int data) {
		/* Is the tree empty? */
		if (root == null) {
			/* Return the new Node */
			return new Node(data);
		} else {
			/* Find the current node */
			Node current;
			/* Is this data less than the current nodes data? */
			if (data <= root.data) {
				/* Try to insert the data on the left node */
				current = insert(root.left, data);
				root.left = current;
			} else {
				/* Try to insert the data on the right node */
				current = insert(root.right, data);
				root.right = current;
			}
			/* return the current node after inserting the data */
			return root;
		}
	}

	public static void main(String[] args) {
		/* Instantiate a Scanner to read standard input */
		Scanner stdIn = new Scanner(System.in);
		
		/* Read the number of data values */
		int dataValues = stdIn.nextInt();
		
		/* Start with an empty binary tree */
		Node root = null;
		
		/* While there are more data values to read */
		while(dataValues-- > 0) {
			/* Read the next data item */
			int newData = stdIn.nextInt();
			/* Insert the new data into the tree */
			root = insert(root, newData);
		}
		
		/* Figure out the height of the tree */
		int height = getHeight(root);
		/* Print out the result */
		System.out.println(height);
		

	}

}
