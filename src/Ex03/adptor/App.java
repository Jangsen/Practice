package Ex03.adptor;

/*
 * AdaptorPattern
 * 외부 요소를 기존 시스템에 재사용하고 싶지만 아직 만들어지지 않은 경우
 * 외부 요소를 기존 시스템에 재사용하고 싶지만 호환되지 않는 경우(실습)
 */
public class App {
	public static void main(String[] args) {
		Mouse m = new Mouse();
		Cat c = new Cat();
		//OuterTiger ot = new OuterTiger();
		TigerAdapter ot = new TigerAdapter(new OuterTiger());
		DoorMan dm = new DoorMan();
		dm.go(m);
		dm.go(c);
		dm.go(ot); // OuterTiger은 Animal 타입이 아니라서
		//OuterTiger를 Animal 타입으로 수정하면 OCP 원칙에 위배됨
	}
}
