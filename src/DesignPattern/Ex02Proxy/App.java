package DesignPattern.Ex02Proxy;
public class App {
	public static void main(String[] args) {
		Mouse m = new Mouse();
		Cat c = new Cat();
		DoorManProxy dm = new DoorManProxy(new DoorMan());
		dm.go(m);
		dm.go(c);
	}
}
