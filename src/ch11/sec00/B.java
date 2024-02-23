package ch11.sec00;

public class B {
	// 메소드 선언
	public void method() {
		A a = new A(); // o
		a.field = "value"; // o
		a.method(); // o
	}

	public static void main(String[] args) {
		B b = new B();
		b.method();
	}
}
