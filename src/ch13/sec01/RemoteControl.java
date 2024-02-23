package ch13.sec01;

public interface RemoteControl {
	//(static final) 타입 변수(상수 대문자)
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//public 추상 메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int Volume);
	//default 메소드 = 몸통을 달아줄 수 있음
	//interface 에 있는 default 메소드는 몸통이 있어서 object 에 연결됨.
	public default void setMute(boolean Mute) {
		if(Mute) {
			System.out.println("무음처리");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("무음해제");
		}
	}
	//static 메소드 
	static void changeBattery() {
		System.out.println("리모컨 건전지를 교체");
	}
	
}
