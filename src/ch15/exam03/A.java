package ch15.exam03;

public class A {
	// 정적 멤버 클래스
	static class B {
		// 인스턴스 필드
		int field = 1;

		// 정적 필드(Java 17부터 허용)
		int field2 = 2;

		// 생성자
		B() {
			System.out.println("B-생성자 실행");
		}

		// 인스턴스 메소드
		void method1() {
			System.out.println("B-method1 실행");
		}

		// 정적 메소드
		void method2() {
			System.out.println("B-method2 실행");
		}
	}

		// 인스턴스 메소드
		void useB() {
		// B객체 생성 및 인스턴스 필드 및 메소드 사용
		B b = new B();
		System.out.println(b.field);
		b.method1();

		// B클래스의 정적 필드 및 메소드 사용
//		System.out.println(B.field2);
//		B.method2();
	}

}
