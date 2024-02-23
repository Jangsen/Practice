package ch15.exam12;
public class Home {
	//필드에 익명 구현 객체 대입
	private RemoteControl rc = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
	//메소드(필드 이용)
	public void use1() {
		rc.turnOn();
		System.out.println(1);
		rc.turnOff();
		System.out.println(1);
	}
	//메소드(로컬 변수 이용)
	public void use2() {
		//로컬변수에 익명 구현 객체 대입
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("에어컨을 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("에어컨을 끕니다.");
			} 
		};
		rc.turnOn();
		System.out.println(2);
		rc.turnOff();
		System.out.println(2);
	}
	//메소드(매개변수 이용)
	public void use3(RemoteControl rc) {
		rc.turnOn();
		System.out.println(3);
		rc.turnOff();
		System.out.println(3);
		
	}
}
