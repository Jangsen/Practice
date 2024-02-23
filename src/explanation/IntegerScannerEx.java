package explanation;

import java.util.Scanner;

public class IntegerScannerEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 몇개? >>");
		int len = sc.nextInt();
		int[] num = new int[len];

		for (int i = 0; i < num.length; i++) {
			int r = (int) (Math.random() * 100 + 1);
			if (exist(num, i, r)) {
					i--;
					continue;
				}
				num[i] = r;
			}
			for (int i = 0; i < num.length; i++) {
				if (i == 0) {
					System.out.print(num[i] + " ");
				} else {
					if (i % 10 == 0) System.out.println();		
					System.out.print(num[i] + " ");
				}
			}sc.close();

		}

	public static boolean exist(int[] arr, int idx, int r) {
		for (int j = 0; j < idx ; j++) {
			if (arr[j] == r) {
				return true;

			}
		}
		return false;
	}
}