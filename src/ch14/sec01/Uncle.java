package ch14.sec01;

abstract class Uncle implements GrandFather{

	@Override
	public void method1() {
		System.out.println("Uncle method1()");
	}
	abstract void method2();
}
