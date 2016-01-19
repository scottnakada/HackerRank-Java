/* Define a Node of a linked list class */
public class Node {
	/* Define some class variables */
	int data;	/* Data for this node */
	Node next;	/* The next node in the linked list */
	
	/* Constructor for the Node class */
	Node(int dataIn) {
		/* Initialize the data, with the incoming data */
		data = dataIn;
		/* Initialize the node with a null next Node */
		next = null;
	}
}