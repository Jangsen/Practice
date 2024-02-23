package ch24.sec01.exam01;

public class MyAdder implements Adder {

	@Override
	public int add(int a, int b) {
		return a + b;
	}
	public static void main(String[] args) {
		MyAdder myAdder = new MyAdder();
		System.out.println(myAdder.add(5, 3));
		
		Adder myAdder2 = (a, b) -> a + b;
		System.out.println(myAdder2.add(5, 4));
	}

}