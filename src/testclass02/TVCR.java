package testclass02;

public class TVCR extends Tv{
	VCR vcr = new VCR();
	
	void paly() {
		vcr.play();
	}
	void stop() {
		vcr.stop();
	}
	void rew() {
		vcr.rew();
	}
	void ff() {
		vcr.ff();
	}
}
