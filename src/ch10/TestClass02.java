package ch10;

public class TestClass02 {

	int iv;				//인스턴스 변수
	static int cv;		//클래스 변수
	
	void instanceMethod()	{		//인스턴스 메서드
		System.out.println(iv);		//인스턴스 변수를 사용 할 수 있다.
		System.out.println(cv);		//클래스 변수를 사용 할 수 있다.
		
	}
	
	static void staticMethod()	{		//Static메서드
//		System.out.println(iv);			//인스턴스 변수 사용 불가
		System.out.println(cv);			//클래스 변수 사용 가능
	}
}
