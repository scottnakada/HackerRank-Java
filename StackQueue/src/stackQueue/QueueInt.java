package stackQueue;

/* Manually implement a queue of integers class */
public class QueueInt extends StackQueueInt {
	
	/* Constructor for the QueueInt Class */
	QueueInt() {
		/* Create the superClass */
		super();
		/* Initialize the head and tail to be null */
		head = null;
		tail = null;
	}
	
	/* Add to the tail of the queue */
	public void add(int newData) {
		/* Create a new node for the data, and initialize with newData */
		Node newNode = new Node(newData);
		
		/* Do we have an empty queue? */
		if (head == null) {
			/* Queue was empty; so make the head and tail the new node */
			head = newNode;
			tail = newNode;
		} else {
			/* Add the new node to the tail */
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	/* Remove a node from the head of the queue */
	public int remove() {
		/* Is the queue empty? */
		if (head == null) {
			/* Throw an exception */
			throw new IllegalStateException("Can't remove from an empty queue");
		}
		/* Store the item from the head of the queue */
		int returnData = head.data;
		
		/* Point the head at the next node */
		head = head.next;
		
		/* Have we reached the end of the queue? */
		if (head == null) {
			/* The queue is now empty, make sure the tail is set to null */
			tail = null;
		}
		
		/* Return the data from the head of the queue */
		return returnData;
	}
}
