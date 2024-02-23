package ch15.exam02;

public class A {
	static class B {
		public B() {
			System.out.println("InnerClassB 생성자");
		}
	}

	B field1 = new B();
	static B field2 = new B();

	A() {
		B b = new B();
		System.out.println("OutterClassA 생성자");
	}

	void method1() {
		B b = new B();
	}

	static void method2() {
		B b = new B();
	}

}
