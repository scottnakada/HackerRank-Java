import java.util.Scanner;

public class SingleRecursion {
	
	public static long factorial(int n) {
		return (n<2) ? 1 : n*factorial(n-1);
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter the number of the factorial to compute?");
		int num = inputScanner.nextInt();
		System.out.println(num + "! = " + factorial(num));
		

		/* Close the input stream after use */
		inputScanner.close();

	}

}
