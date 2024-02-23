package DesignPattern.Ex01;

public class App {
	public static void main(String[] args) {
		Mouse m = new Mouse();
		Cat c = new Cat();
		DoorMan dm = new DoorMan();
		dm.go(m);
		dm.go(c);
	}
}
