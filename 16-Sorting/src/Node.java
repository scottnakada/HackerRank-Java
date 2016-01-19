
public class Node {
	/* Define some class variables */
	int minData; /* Data for this node */
	int maxData; /* Maximum data for this node */
	Node next; /* The next node in the linked list */

	/* Constructor for the Node class */
	Node(int minDataIn, int maxDataIn) {
		/* Initialize the data, with the incoming data */
		minData = minDataIn;
		maxData = maxDataIn;

		/* Initialize the node with a null next Node */
		next = null;
	}
}
