package stackQueue;

/* Create an abstract integer Stack or Queue class */
public abstract class StackQueueInt {
	/* Declare a node of the linked list containing the stack */
	class Node {
		/* Instance variables for the Node class */
		int data;
		Node next;
		
		/* Constructor for the Node Class */
		Node(int dataIn) {
			/* Initialize the data, with the incoming data */
			data = dataIn;
			/* Initialize the next pointer to null */
			next = null;
		}
	}
	
	/* Pointers to the head and tail of the Stack/Queue */
	Node head = null;
	Node tail = null;
	
	/* Constructor for the Stack/Queue Class */
	StackQueueInt() {
		/* Not much to do here */
	}

	/* Is the Stack/Queue empty? */
	public boolean isEmpty() {
		/* Return true, if the head pointer is null */
		return (head == null);
	}
	
	/* Print out the list */
	public void print() {
		/* Print the opening bracket of the printout */
		System.out.print("[");
		
		/* Scan thru the list from the head */
		for (Node listPtr = head; listPtr != null; listPtr = listPtr.next) {
			/* Print the data */
			System.out.print(listPtr.data);
			/* If not at the end of the list, print a , space for the next item*/
			if (listPtr.next != null) {
				System.out.print(", ");
			}
		}
		
		/* Print the closing bracket */
		System.out.println("]");
		
	}
	
	/* Peek at the top of the stack/queue */
	public int peek() {
		/* Is the stack/queue empty? */
		if (head == null) {
			/* Throw an exception, as we can't peak at an empty stack/queue */
			throw new IllegalStateException("Can't peek at an empty stack/queue");
		} else {
			/* Return the data at the head of the list */
			return head.data;
		}
	}
	
	/* Calculate the number of nodes in the stack/queue */
	public int size() {
		/* Is the stack/queue empty */
		if (head == null) {
			return 0;
		}
		/* Start counting from 0 */
		int listSize = 0;
		/* Loop thru the elements in the list till the end */
		for (Node nodePtr = head; nodePtr != null; nodePtr = nodePtr.next) {
			/* Increment the size counter */
			listSize++;
		}
		return listSize;
	}
	
	/* Search for an element in the stack/queue */
	public int search(int searchValue) {
		/* Is the stack empty? */
		if (head == null) {
			throw new IllegalStateException("Can't search an empty stack/queue");
		}
		/* Initialize the foundIndex at the head of the stack/queue as 0 */
		int foundIndex = 0;
		/* Assume we havn't found it yet */
		boolean found = false;
		
		
		/* Loop thru the elements searching for the index matching the searchValue */
		for (Node nodePtr = head; nodePtr != null; nodePtr = nodePtr.next) {
			/* Does this element match the search Value */
			if (nodePtr.data == searchValue) {
				/* Found it!! */
				found = true;
				/* Break out of the loop, with the found index = searched element */
				break;
			}
			/* Increment the foundIndex with each node */
			foundIndex++;
		}
		/* Did we find it? */
		if (!found) {
			/* Oops, we didn't find it, throw an exception */
			throw new IllegalStateException("Couldn't find the value");
		}
		return foundIndex;
		
		
		
	}
}
