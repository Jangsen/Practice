package ch15.exam04;

public class AExample {
	public static void main(String[] args) {

		A.B b = new A.B();
		System.out.println();
		b.method1();

		System.out.println();
		A.B.method2();
	}
}
