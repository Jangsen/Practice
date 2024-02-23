package ch14.sec03;

public class Child implements MyInterface, YourInterface {
//동일한 디폴트 메소드가 있을때 		ㄴ순서중에 먼저 등장한 인터페이스를 오버라이딩함.
//등장하는 순서를 무시하고 명시적으로 바꿀수 있다.
	@Override
	public void method1() {
		YourInterface.super.method1();
	}

	@Override
	public void method2() {
		MyInterface.super.method2();
	}

}
