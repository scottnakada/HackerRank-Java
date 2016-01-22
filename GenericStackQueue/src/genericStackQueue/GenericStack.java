package genericStackQueue;

import genericStackQueue.GenericStackQueue;
import genericStackQueue.GenericStackQueue.Node;

/* Manually implement a Java Stack of integers */
public class GenericStack <inputType> extends GenericStackQueue <inputType> {
	
	/* Constructor for the StackInt Class */
	GenericStack() {
		/* Create the superClass */
		super();
		/* Initialize the head to be null */
		head = null;
	}
	
	/* Push data onto the stack */
	public void push (inputType newData) {
		/* Create a new node to add to the stack */
		Node newNode = new Node(newData);
		/* Initialize the next pointer on the new node to point to the previous head */
		newNode.next = head;
		/* The new head is the new Node */
		head = newNode;
		
	}
	
	/* Pop data off the stack */
	public inputType pop () {
		if (head == null) {
			throw new IllegalStateException("Can't pop off of an empty list");
		}
		/* Save the value to return */
		inputType returnValue = head.data;
		/* Remove the node from the head of the Stack */
		head = head.next;
		/* Return the popped value */
		return returnValue;
	}
	
}
