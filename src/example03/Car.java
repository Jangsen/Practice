package example03;

public class Car {
	int speed;
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}

	static void simulate() {		//메인과 시뮬레이트는 서로 다른 객체	//static해도 method >> Stack 영역
		Car myCar = new Car();
		myCar.speed = 200;
		myCar.run();
		System.out.println("simulate()= " + myCar);
	}

	public static void main(String[] args) {	//static 한 영역에서는 super, this 키워드 사용불가.
		simulate();
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
		System.out.println("main()= " + myCar);
	}
}
