package testclass02;

public class TVCRTest {

	public static void main(String[] args) {
		TVCR tvcr = new TVCR();
		tvcr.power();
		System.out.println(tvcr.power);
		tvcr.paly();
		tvcr.stop();
		tvcr.rew();
		tvcr.ff();
	}

}
