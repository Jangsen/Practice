package testclass02;

public class Airplane {
	// 메소드 선언
		public void land() {
			System.out.println("착륙합니다");
		}
		public final void fly() {		//final 을 사용하면 
										//자식 클래스에서 재정의가 안된다.
			System.out.println("일반 비행입니다");
		}
		public void takeOff() {
			System.out.println("이륙합니다");
		}
}
