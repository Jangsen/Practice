package ch14.sec03;

public interface YourInterface {
	default void method1(){
		System.out.println("metho1() in YourInterface1");
	}
	default void method2() {
		System.out.println("metho2() in YourInterface2");
	}
}
