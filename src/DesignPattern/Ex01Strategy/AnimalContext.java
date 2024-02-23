package DesignPattern.Ex01Strategy;

public class AnimalContext {
	private SoundStrategy soundStrategy;

    public void setSoundStrategy(SoundStrategy soundStrategy) {
        this.soundStrategy = soundStrategy;
    }

    public void makeSound() {
        if (soundStrategy != null) {
            soundStrategy.makeSound();
        } else {
            System.out.println("울음 소리를 만들 수 없습니다.");
        }
    }
}
