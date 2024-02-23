package ch11;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 50;
		Calculator calc = new Calculator();
		System.out.println("원 면적: " + calc.areaCircle(r));
		System.out.println();

		Computer com = new Computer();
		System.out.println("원 면적: " + com.areaCircle(r));
	}

}
