package ch10;

public class TestClass {
	void instanceMethod()	{}	//인스턴스메서드
	static void staticMethod()	{}	//static 메서드
	
	void instanceMethod2()	{	//인스턴스메서드
		instanceMethod();	//다른 인스턴스메서드를 호출한다.
		staticMethod();		//static 메서드를 호출한다.
	}
	
	static void staticMethod2()		{	//static 메서드
		TestClass tc = new TestClass();
		tc.instanceMethod();
		
//		instanceMethod();	//에러!!! 인스턴스메서드를 호출할 수 없다.
//인스턴스 메서드를 부를수 있는 상황인지 파악을 못함.	//객체를 생성해야 가능
		staticMethod();		//static 메서드는 호출 할 수 있다.
	}
}
