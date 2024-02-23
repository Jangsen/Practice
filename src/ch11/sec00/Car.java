package ch11.sec00;

public class Car {
	//필드 선언
	public int speed;
	
	//메소드 선언
	public void speedUp() {
		speed += 1;
	}
	
	//final 메소드
	public void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}

}
