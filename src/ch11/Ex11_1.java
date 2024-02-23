package ch11;

class Tv{
	//필드 선언
	boolean power;	//전원 상태(on/ off)
	int channel;	//채널
	//메소드 선언
	void power()	{ power = ! power;}
	void channelUp()	{ ++channel; }
	void channelDown()	{ --channel; }
	
}
class SmartTv extends Tv{	//상속  
	boolean caption;
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
	
}


class Ex11_1 {
	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 10;
		stv.channelUp();
		System.out.println(stv.channel);
		stv.displayCaption("Hello World");
		stv.caption = true;
		stv.displayCaption("Hello World");
		
		
	}

}
