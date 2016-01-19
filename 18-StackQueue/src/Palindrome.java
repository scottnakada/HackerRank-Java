
public class Palindrome {
	
	/* Declare a node of the linked list containing the stack */
	class Node {
		/* Instance variables for the Node class */
		char data;
		Node next;

		/* Constructor for the Node Class */
		Node(char dataIn) {
			/* Initialize the data, with the incoming data */
			data = dataIn;
			/* Initialize the next pointer to null */
			next = null;
		}
	}

	/* Pointers to the head and tail for the stack and queue */
	Node stackHead = null;
	Node queueHead = null;
	Node queueTail = null;

	/* Constructor for the Palindrome class */
	Palindrome() {
		/* Not much to do here */
	}

	/* Push data onto the stack */
	public void pushCharacter(char newData) {
		/* Create a new node to add to the stack */
		Node newNode = new Node(newData);
		/*
		 * Initialize the next pointer on the new node to point to the previous
		 * head
		 */
		newNode.next = stackHead;
		/* The new head is the new Node */
		stackHead = newNode;

	}

	/* Pop data off the stack */
	public char popCharacter() {
		if (stackHead == null) {
			throw new IllegalStateException("Can't pop off of an empty list");
		}
		/* Save the value to return */
		char returnValue = stackHead.data;
		/* Remove the node from the head of the Stack */
		stackHead = stackHead.next;
		/* Return the popped value */
		return returnValue;
	}

	/* Add to the tail of the queue */
	public void enqueueCharacter(char newData) {
		/* Create a new node for the data, and initialize with newData */
		Node newNode = new Node(newData);

		/* Do we have an empty queue? */
		if (queueHead == null) {
			/* Queue was empty; so make the head and tail the new node */
			queueHead = newNode;
			queueTail = newNode;
		} else {
			/* Add the new node to the tail */
			queueTail.next = newNode;
			queueTail = newNode;
		}
	}

	/* Remove a node from the head of the queue */
	public char dequeueCharacter() {
		/* Is the queue empty? */
		if (queueHead == null) {
			/* Throw an exception */
			throw new IllegalStateException("Can't remove from an empty queue");
		}
		/* Store the item from the head of the queue */
		char returnData = queueHead.data;

		/* Point the head at the next node */
		queueHead = queueHead.next;

		/* Have we reached the end of the queue? */
		if (queueHead == null) {
			/* The queue is now empty, make sure the tail is set to null */
			queueTail = null;
		}

		/* Return the data from the head of the queue */
		return returnData;
	}

}
