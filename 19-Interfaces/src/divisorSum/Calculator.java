package divisorSum;

public class Calculator implements AdvancedArithmetic {

	@Override
	/* Compute the sum of the divisors of a number */
	public int divisorSum(int number) {
		/* Declare the sum of the divisors */
		int sum;
		System.out.println("The number is: " + number);

		/* Divisors come in pairs; so we only need to test
		 * up to the square root of the number.  Here we
		 * compute the maximum divisor
		 */
		int maxDivisor = (int) Math.sqrt(number);
		System.out.println("maxDivisor=" + maxDivisor);
		
		/* Initialize the sum.  If the number is 1, handle a special case */
		if (number != 1) {
			/* Each number has itself and 1 as a divisor */
			sum = 1 + number;
		} else {
			/* If the number is 1, only add 1 to the sum */
			sum = 1;
		}
		/* Test all possible divisors from 2 to maxDivisor */
		for (int divisor = 2; divisor <= maxDivisor; divisor++) {
			
			System.out.println("Testing divisor=" + divisor);
			/* Does the number divide evenly (no remainder) by divisor? */
			if (number % divisor == 0) {
				/* Yes, this is a divisor; add to the sum */
				sum += divisor;
				/* Find the divisor Pair for the divisor */
				int divisorPair = number / divisor;
				/* Are the divisorPair and divisor the same number? */
				if (divisorPair != divisor) {
					/* If different numbers, add the divisorPair to the sum */
					sum += divisorPair;
				}
				System.out.println("Divisors " + divisor + ", " +
						divisorPair + ", sum=" + sum);
			}
		}

		/* Return the sum of the divisors */
		return sum;
	}

}
