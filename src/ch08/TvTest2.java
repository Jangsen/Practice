package ch08;

public class TvTest2 {

	public static void main(String[] args) {
		Tv t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println(t.channel);
		
		System.out.println("-");
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		t2 = t1;
		t1.channel = 7;
		System.out.println(t1.channel);
		System.out.println(t2.channel);
	}

}
