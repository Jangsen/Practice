package ch13.sec02;

public interface Service {
	// 디폴트 메소드		//
	default void defaultMethod1() {
		System.out.println("defaultMethod 종속 코드");
		defaultCommon();
	}
	// 디폴트 메소드
	default void defaultMethod2() {
		System.out.println("defaultMethod2 종속 코드");
		defaultCommon();
	}
	//프라이빗 메소드		//구현 객체가 필요한 메소드
	private void defaultCommon() {
		System.out.println("defaultMethod 중복 코드A");
		System.out.println("defaultMethod 중복 코드B");
	}
	//스태틱 메소드		//스태틱한 메소드는 또 다른 스태틱한 메소드에서 부를 수 밖에 없음
	static void staticMethod1() {
		System.out.println("staticMethod 종속 코드");
		staticCommon();
	}
	//스태틱 메소드		
	static void staticMethod2() {
		System.out.println("statictMethod 종속 코드");
		staticCommon();
	}
	//프라이빗 스태틱 메소드		//구현 객체가 필요없는 메소드
	private static void staticCommon() {
		System.out.println("staticMethod 중복 코드C");
		System.out.println("staticMethod 중복 코드D");
	}
}
