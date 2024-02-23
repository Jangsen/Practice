package explanation;

public class MultiArrayEx2 {

	public static void main(String[] args) {
		int[][] num = new int[4][4];
		int a, b;
		for (int k = 0; k < 10; k++) {

			a = (int)(Math.random() * 4);
			b = (int)(Math.random() * 4);
			if (num[a][b] != 0) {
				k--;
				continue;
			}else {
				num[a][b] = (int)(Math.random() * 10 + 1);
			}
		}

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
	}

}
