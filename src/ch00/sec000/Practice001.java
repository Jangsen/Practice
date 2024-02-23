package ch00.sec000;

public class Practice001 {

	public static void main(String[] args) {
		int[][]val = new int [4][3];
		for(int i= 0; i < val.length ; i++) {
			for(int j = 0; j < val[i].length ; j++) {
				val[i][j] = i + j;
			}
				System.out.println();
		}
	}

}
