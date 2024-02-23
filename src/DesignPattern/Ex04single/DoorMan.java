package DesignPattern.Ex04single;
/*
 * 문지기를 딱 한명만 만들고 싶어요
 */
public class DoorMan {
	private static DoorMan doorMan = new DoorMan();
	public static DoorMan getInstance() {
		return doorMan;
	}
	private DoorMan() {	}
	public void go(Animal m) {
		System.out.println(m.getName()+"쫒아내");
	}
}
