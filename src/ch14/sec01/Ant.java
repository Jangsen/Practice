package ch14.sec01;

abstract class Ant implements GrandFather{

	@Override
	public void method1() {
		System.out.println("Ant method1()");
	}
	abstract void method2();

}
