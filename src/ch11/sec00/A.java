package ch11.sec00;

public class A {
	//필드 선언
	protected String field;
	
	//생성자 선언
	protected A() {
		System.out.println("A클래스의 생성자 호출");
	}
	
	//메소드 선언
	protected void method() {
		System.out.println("A.method() 호출");
		System.out.println(this.field);
		System.out.println(this);
		//this - 지역변수로 숨겨진채 존재
	}

}
//protected = 같은 패키지에 상속받는 자식까지
//default 나 public 할 경우 import 해서 가능하지만
//protected 는 import 해서 쓰지 못한다.
//private = D클래스 타입에서 건들면 안됨.
//private = 상속이 안됨
//객체 레퍼런스 타입은 중요하지 않음
//ㄴ default 나 public 까지는 가능