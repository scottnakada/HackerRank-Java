import java.util.Random;

public class PracticeArray {

	public void runTest() {
		Random random = new Random();

		int arraySize = 4;
		int[] intArray = new int[arraySize];
		for (int index = 0; index < arraySize; index++) {
			// intArray[index] = Math.abs(rand.nextInt()) & 100;
			intArray[index] = random.nextInt(100);
			System.out.println(intArray[index]);
		}
		
	}

	public static void main(String[] args) {
		PracticeArray practiceArray = new PracticeArray();
		practiceArray.runTest();
	}

}
