package ch15.exam01;

public class A {
	//인스턴스 멤버 클래스
	class B{
		int i = 5;
		void method() {
			System.out.println("B.methodB()");
		}
		public B() {
			System.out.println("B 생성자");
		}
	}
	
	//인스턴스 필드 값으로 B객체 대입
	B field = new B();
	
	//생성자
	
	A(){
		B b = new B();
		System.out.println("A 생성자");
	}
	
	//인스턴트 메소드
	void method() {
		B b = new B();
		System.out.println("A.method()");
	}

}
