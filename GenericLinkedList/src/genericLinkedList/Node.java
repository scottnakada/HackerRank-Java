package genericLinkedList;

/* Declare a Node Class for nodes of the linked list */
public class Node<inputType> {

	/* Instance variables */
	Node next;		/* Point to the next node */
	inputType data;	/* Data for this node */
	
	/* Constructors */
	/* Constructor if we have new data; but no next node */
	public Node (inputType newData) {
		data = newData;
		next = null;
	}
	
	/* Constructor if we have new data and a next node */
	public Node(inputType newData, Node newNode) {
		data = newData;
		next = newNode;
	}
	
	/* Getters and Setters */
	
	/* Get the data */
	public inputType getData() {
		return data;
	}
	
	/* Get the next node */
	public Node<inputType> getNext() {
		return next;
	}
	
	/* Set the data */
	public void setData(inputType newData) {
		data = newData;
	}
	
	/* Set the next Node */
	public void setNext(Node<inputType> newNode) {
		next = newNode;
	}
}
