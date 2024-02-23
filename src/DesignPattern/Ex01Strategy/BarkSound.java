package DesignPattern.Ex01Strategy;

public class BarkSound implements SoundStrategy {

	@Override
	public void makeSound() {
		System.out.println("멍멍!!");
	}

}
