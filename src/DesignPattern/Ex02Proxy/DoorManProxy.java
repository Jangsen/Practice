package DesignPattern.Ex02Proxy;

public class DoorManProxy {//extends DoorMan{
	//composition
	private DoorMan doorMan;	
	public DoorManProxy(DoorMan doorMan) {
	this.doorMan = doorMan;
}
	public void go(Animal a) {
		System.out.println("안녕 !!");
		//super.go(a);
		doorMan.go(a);
	}
}
