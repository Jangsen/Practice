package chaptersixexample;

public class Ex6_2 {

	public static void main(String[] args) {
		Tv t1 = new Tv();		//Tv t1;   t1 = new Tv);를 한문장으로 가능 
		Tv t2 = new Tv();		//서로 다른 두 객체가 있을때 주소가 같을 수 없음.
								//객체마다 다른 저장소를 가짐.
		
		System.out.println("t1의 channel 값은 " + t1.channel + "입니다");
		System.out.println("t2의 channel 값은 " + t2.channel + "입니다");
		
		t1.channel = 7;			//t1이 가리키는 객체의 channel 값을 7
		System.out.println("t1의 channel 값이 "+t1.channel+"로 변경되었습니다.");
		
		//서로 다른 저장공간을 갖는 것을 확인할 수 있음
		
		System.out.println("t1의 channel 값은 "+t1.channel+"입니다.");
		System.out.println("t2의 channel 값은 "+t2.channel+"입니다.");
		
		t2 = t1;				//t1의 값이 t2로 저장되면서 t1이 가리키는 객체로 바뀐다.
		System.out.println("t1의 channel 값은 "+t1.channel+"입니다.");
		System.out.println("t2의 channel 값은 "+t2.channel+"입니다.");
		
//		t1 = t2;				//t2의 값이 t1으로 저장되면서 t2가 가리키는 객체가 바뀐다.
//		System.out.println("t1의 channel 값은 "+t1.channel+"입니다.");
//		System.out.println("t2의 channel 값은 "+t2.channel+"입니다.");
	}

}
