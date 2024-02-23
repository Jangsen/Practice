package ch00.sec00;

public class CallByValueEx001 {

	public static void main(String[] args) {
		int x = 10;
		changeValue(x);
		System.out.println();
	}

	public static void changeValue(int num) {
		num = 20;
	}

}
