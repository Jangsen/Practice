package DesignPattern.Ex01Strategy;

public class Main {
	public static void main(String[] args) {
		AnimalContext cat = new AnimalContext();
		AnimalContext dog = new AnimalContext();

		SoundStrategy meowSound = new MeowSound();
		SoundStrategy barkSound = new BarkSound();

		cat.setSoundStrategy(meowSound);
		dog.setSoundStrategy(barkSound);

		cat.makeSound(); // "야옹!" 출력
		dog.makeSound(); // "멍멍!" 출력
	}
}
