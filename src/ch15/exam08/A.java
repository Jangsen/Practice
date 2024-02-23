package ch15.exam08;

public class A {
	int field1 = 5;
	void method1() {	System.out.println("A의 인스턴스 메소드");
			}
	//A의 정적 필드와 메소드
	static int field2;
	static void method2() {	System.out.println("A의 스태틱 메소드");
		}
	class B{
		void method() {
			System.out.println("B의 인스턴스 메소드");
			//A의 인스턴스 필드와 메소드 사용
			field1 = 10;
			method1();
			//A의 정적 필드와 메소드 사용
			field2 = 10;
			method2();
		}
	}
	static class C{
		void method() {
		//A의 인스턴스 필드와 메소드 사용
		//field1 = 10;	
		//method1();
		//위는 안되고 아래는 된다	why? static 은 static 끼리 통한다
		//A의 정적 필드와 메소드 사용
		field2 = 10;
		method2();
		}
	}
}
