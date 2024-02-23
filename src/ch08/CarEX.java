package ch08;

public class CarEX {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		System.out.println("제조사 :"+c1.model);
		System.out.println("최대출력 :"+c1.speed+"KM");
		System.out.println("주행 유무 :"+c1.start);
		System.out.println("타이어 :"+c1.tire);	//타이어는 객체만 만들었기 때문에 주소값만 출력됨.
		System.out.println("========================");
		System.out.println("제조사 :"+c2.model);
		System.out.println("최대출력 :"+c2.speed);
		System.out.println("주행 유무 :"+c2.start);
	}

}
