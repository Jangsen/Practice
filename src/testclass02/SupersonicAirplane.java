package testclass02;

public class SupersonicAirplane extends Airplane {
	// 상수 선언
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	// 상태 필드 선언
	public int flyMode = NORMAL;
	//@오버로딩
	// 메소드 재정의
	public int fly(int num) {	
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행입니다.");
		} else {
			// AirPlane 객체의 fly() 메소드 호출
			super.fly();
		}
		return num;
	}
}
