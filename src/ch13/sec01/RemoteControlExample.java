package ch13.sec01;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;

		// rc 변수에 Television 객체를 대입
		rc = new Television();
		rc.turnOn();
		rc.setVolume(9);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		System.out.println("\n여기까지 TV\n");
		// rc 변수에 Audio 객체를 대입(교체 시킴)
		System.out.println("여기부터 Audio\n");
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(4);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		RemoteControl.changeBattery();
	}

}
