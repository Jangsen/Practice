package testclass02;

public class Tv extends Object{
	boolean power;
	int channel;
	
	void power() { power = !power;}
	void play() { System.out.println("vcr.play()"); }
	void stop() { System.out.println("vcr.stop()"); }
	void rew() { System.out.println("vcr.rew()"); }
	void ff() { System.out.println("vcr.ff()"); }

}
