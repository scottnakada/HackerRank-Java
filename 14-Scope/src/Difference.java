/* Difference Class - compute the maximum differene between two elements in an integer array */
public class Difference {
	/* Limit the scope of the elements array to methods within the class */
	private int[] elements;
	/* The maximumDifference is available outside of the class */
	public int maximumDifference;
	
	/* Constructor for the Difference Class */
	Difference(int[] array) {
		/* Initialize the elements array, with the incoming array */
        elements = array;
    }
	
	/* Compute the maximum difference between elements */
	public void computeDifference() {
		/* Initialize the maximumDifference to the minimum difference 0 */
        maximumDifference = 0;
        /* Display the elements in the array */
        for (int i = 0; i < elements.length; i++) {
        	/* Print the next element */
            System.out.println(elements[i]);
        }
        
        /* Compare from the beginning to the next to last element of the array */
        for (int i = 0; i < elements.length - 1; i++) {
        	/* Compare from the second element to the last element of the array */
            for (int j = i+1; j < elements.length ; j++ ){
            	/* Display the indexes, values, and differences for each comparison */
                System.out.println("Comparing elements[" + i +
                                  "]=" + elements[i] +
                                  " with elements[" + j +
                                   "]=" + elements[j] +
                                  ", Difference=" + Math.abs(elements[i] - elements[j]));
                /* If the difference is greater than the maximumDifference */
                if (Math.abs(elements[i] - elements[j]) > maximumDifference) {
                	/* Change to the new maximum difference */
                    maximumDifference = Math.abs(elements[i] - elements[j]);
                }
            }
        }
        
        return;
    }

}
