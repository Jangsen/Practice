package testclass02;

public class CarExample {

	public static void main(String[] args) {
		//Car객체 생성
		Car myCar = new Car();
		
		//Tire 객체 장착
		myCar.tire = new Tire();
		myCar.run();
		//Hankook Tire 장착
		myCar.tire = new HankookTire();
		myCar.run();
		//Kumho Tire 장착
		myCar.tire = new KumhoTire();
		myCar.run();
	}

}
