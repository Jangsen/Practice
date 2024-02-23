package ch12.sec01;

public class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("드라이브, ㅂㄹㄹㄹ~");
	}
	void stop() {
		System.out.println("스탑!");
	}
	
}
class FireEngine extends Car{
	void water() {
		System.out.println("물~");
	}
}
class Ambulance extends Car{
	void siren() {
		System.out.println("삐뽀삐뽀");
	}
}