package Exceptions;

/* Create MyOwnException as and extension of the Java Exception class */
public class MyOwnException extends Exception {
	
	/* Constructor for the Exception class */
	public MyOwnException(String msg) {
		/* Create the exception, and pass it the error message */
		super(msg);
	}
}
