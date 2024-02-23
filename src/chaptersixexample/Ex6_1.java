package chaptersixexample;

public class Ex6_1 {

	public static void main(String[] args) {
		Tv t;				//Tv 인스턴스를 참조하기위한 변수 t 선언.		//객체 생성
		t = new Tv();		//Tv 인스턴스를 생성								
		t.channel = 7;		//Tv 인스턴스의 멤버변수 channel의 값을 7		//객체 사용 = 변수 사용
		t.channelDown();    //Tv 인스턴스의 메서드 channelDown 호출		//객체 사용 = 메서드 사용
		System.out.println("현재 채널은 " + t.channel + "입니다");
	}

}
class Tv {
	//Tv의 속성 (멤버변수)
	String color;	//색상
	boolean power;	//전원상태
	int channel;	//채널
	
	//Tv의 기능 (메서드)
	void power() 	{ power = !power; }
	void channel()	{ ++channel; }
	void channelDown()	{ --channel; }
}
