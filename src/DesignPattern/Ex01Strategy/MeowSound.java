package DesignPattern.Ex01Strategy;

public class MeowSound implements SoundStrategy {

	@Override
	public void makeSound() {
		System.out.println("야옹!");

	}

}
