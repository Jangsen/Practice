package ch23.sec03.exam01;

public class User2Thread extends Thread{
private Calculator calculator;
	
	public User2Thread() {
		setName("User2Thread");
	}
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	@Override
	public void run() {
		calculator.setMemory2(50);
		calculator.setMemory1(70);
	}

}
