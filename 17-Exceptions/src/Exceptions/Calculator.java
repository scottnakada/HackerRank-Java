package Exceptions;

public class Calculator {
	
	/* Constructor for the Calculator class */
	Calculator() {
		/* Nothing to do here */
	}

	/* Raise a number to a power; but throw an exception if number or power are negative */
	static int power(int number, int power) throws MyOwnException {
		
		/* Are either number or power negative */
		if ((number<0)||(power<0)) {
			/* If so, then throw an exception */
			throw new MyOwnException("n and p should be non-negative");
		} else {
			/* Otherwise, return the number raised to the power */
			return (int) Math.pow(number, power);
		}
	}
}
