package ch00.sec00;

public class ArrayLengthEx009 {

	public static void main(String[] args) {
		int[][] intArray = new int[5][];
		intArray[0] = new int[5];
		intArray[1] = new int[5];
		intArray[2] = new int[5];
		intArray[3] = new int[5];
		intArray[4] = new int[5];

		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				intArray[i][j] = (i * 5) + 1 + j;
			}
		}
		for (int i = 0; i < intArray.length; i++) {
			for(int j = 0; j < intArray[i].length; j++) {
				System.out.print(intArray[i][j] + " ");
			}
			System.out.println();
		}
	}
}
