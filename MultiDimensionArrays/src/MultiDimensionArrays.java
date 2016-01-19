
public class MultiDimensionArrays {

	public static void main(String[] args) {
		
		int rows = 4;
		int cols = 5;
		int i, j;
		
		int[][] matrix = new int[rows][cols];
		
		for (i=0; i<rows; i++) {
			for (j=0; j<cols; j++) {
				matrix[i][j] = i*j;
			}
		}
		
		for (i=0; i<rows; i++) {
			for (j=0; j<cols; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println( "" );
		}

	}

}
