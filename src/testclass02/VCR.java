package testclass02;

public class VCR {
	boolean power;
	int counter = 0;
	
	void power() { power = !power; }
	void play() { System.out.println("vcr.play()"); }
	void stop() { System.out.println("vcr.stop()"); }
	void rew() { System.out.println("vcr.rew()"); }
	void ff() { System.out.println("vcr.ff()"); }

}
