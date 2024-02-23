package ch12.sec01;

public class Fox extends Animal{

	@Override
	int eat(String food) {
		System.out.println("여우는 접시에 담아먹는다");
		return 100;
	}
}
//	public void sound() {
//		System.out.println("");
//		
//	}
//	public abstract void sound();			//abstract 클래스를 받아야 사용 가능
//}
