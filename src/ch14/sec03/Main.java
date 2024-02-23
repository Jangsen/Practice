package ch14.sec03;

public class Main {
	public static void main(String[] args) {
		Child child = new Child();
		child.method1();
		child.method2();
		//조상인 Parent 상속,디폴트 메소드는 무시됨
		child.method1();
	}
}
