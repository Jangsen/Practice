package ch08;

class Data { int x; }
public class DataTest {

	public static void main(String[] args) {		//프로그램 시작시 메인이 스택에 올라감
		Data d = new Data();						//ㄴData d 만들어짐
		d.x = 100;									//data d; d= new data();
		System.out.println("main():x = "+d.x);		
		changed(d);
		System.out.println("After changed(d)");
		System.out.println("main():x = "+d.x);
	}
	static void changed(Data d) {					//참조형 매개변수 d
		d.x = 1000;
		System.out.println("changed():x = "+d.x);
	}
}