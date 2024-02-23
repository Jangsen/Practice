package hyundai;
import kumho.AllSeasonTire;
public class Car {

	public static void main(String[] args) {	//public 이 있으면 다른 패키지에서 같이 사용할 수 있는데 없으면 같은 패키지에서만 가능함.
		//부품 필드 선언
		Tire tire = new Tire();
		Tire tire2 = new Tire();
		SnowTire tire3 = new SnowTire();
		AllSeasonTire tire4 = new AllSeasonTire();
		
	}

}
