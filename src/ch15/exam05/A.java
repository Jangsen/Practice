package ch15.exam05;

public class A {
	class C{
		public C() {
			System.out.println("ineer C()");
		}
	}
	A(){
		//로컬 클래스 선언
		class B {
			public B() {
				System.out.println("생성자 local inner B");
			}
			void methodB1() {
				System.out.println("생성자 ineerB_method()");
			}
		}
		//로컬 객체 생성
		B b = new B();	//생성자를 통해서만 
		C c = new C();	//
		b.methodB1();
		
	}
	void method() {
		//로컬클래스 선언
		class B{
			public B() {
				System.out.println("method() local ineer B()");
			}
		}
		//로컬 객체 생성
		B b = new B();	//생성자를 통해서 
	}
}
