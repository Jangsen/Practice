package ch11;

public class SupersonicAirplane extends Airplane {
	// 상수 선언
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	// 상태 필드 선언
	public int flyMode = NORMAL;
		

	// 메소드 재정의
	//오버라이딩 = 상속을 전재로 부모로 부터 물려받은 메소드를 재정의하게됨.
	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행입니다.");
		} else {
			// AirPlane 객체의 fly() 메소드 호출
			super.fly();
		}
	}

}
