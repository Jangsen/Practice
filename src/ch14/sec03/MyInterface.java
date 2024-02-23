package ch14.sec03;

public interface MyInterface {
	default void method1(){
		System.out.println("metho1() in MyInterface1");
	}
	default void method2() {
		System.out.println("metho2() in MyInterface2");
	}

}
