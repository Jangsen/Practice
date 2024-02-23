package ch00.sec00;

public class ReturnEx00 {

	public static void main(String[] args) {
		int[] x = { 5, 8, 7, 9, 6, 4, 3 };
		int i = 5;
		System.out.println(sum(x));
		for (int j = 0; j < x.length; j++) {
			System.out.print(x[j] + " ");
		}

	}

	static int sum(int[] x) { // CallByReference
		int result = 0;
		for (int i = 0; i < x.length; i++) {
			result += x[i];
			x[i] = 2;
		}
		return result;
	}

}

/*
 * CallByValue CallByRefernce 이해하기
 */
