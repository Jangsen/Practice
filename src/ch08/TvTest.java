package ch08;

public class TvTest {

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
class Tv
{
	String color;		//색깔
	boolean power;		//전원 상태(on/off)
	int channel;		//채널
	void power()	
	{ 
		power = ! power;//전원 on/off 
	}
	void channelUp()
	{
		channel++;		//채널 높이기
	}
	void channelDown()
	{
		channel--;		//채널 낮추기
	}
	
}