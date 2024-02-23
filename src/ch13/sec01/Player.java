package ch13.sec01;
//추상클래스
abstract class Player {
	int currentPos;

	public Player() {
		currentPos = 0;

	}
//추상메소드
	abstract void play(int pos);
	abstract void stop();
	void play() {
		play(currentPos);
	}
}

class BallPlayer extends Player {
	@Override
	void play(int pos) {
		System.out.println("BallPlayer	play()");
		System.out.println("currentPos = " + pos);
	}
	@Override
	void stop() {
		System.out.println("BallPlayer	play()");
	}

}
