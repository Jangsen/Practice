package DesignPattern.Ex04single;

/*
 * AdaptorPattern
 * 외부 요소를 기존 시스템에 재사용하고 싶지만 아직 만들어지지 않은 경우
 * 외부 요소를 기존 시스템에 재사용하고 싶지만 호환되지 않는 경우(실습)
 */
public class App {
	public static void main(String[] args) {
		Mouse m = new Mouse();
		Cat c = new Cat();
		DoorMan dm = DoorMan.getInstance();
		DoorMan dm2 = DoorMan.getInstance();
		dm.go(m);
		dm.go(c);
	}
}
