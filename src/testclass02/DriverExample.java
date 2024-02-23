package testclass02;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		driver.drive(bus);
		//매개값으로 Taxi 객체를 제공하고 driver()  메소드
		Taxi taxi = new Taxi();
		driver.drive(taxi);
	}

}
