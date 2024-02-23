package ch11.sec01;
import ch11.sec00.A;
public class D extends A {
	//생성자 선언
	public D() {
		//A생성자 호출
		super();
	}
	//메소드 선언
	public void method1() {
		this.field = "value";
		//A메소드 호출
		this.method();
	}
	//메소드 선언
	public void method2() {
		//부모에 있는 생성자를 부르려면 자기 생성자를 통해서 super()
		//
		D d = new D();	//x		//a 클래스의 객체를 만들고
//		a.field = "value";	//x	//필드들을 접근해서 쓰려고 했더니
//		a.method();	//x			//~~~에러 
		super.field = "start";
//부모 자식이 상속관계에 있어도 
//부모의 접근제어지시자가 protected 하면 
//같은 클래스의 멤버라고 생각하지 않음.
//상속 관계에서 필드와 메소드는 상속이 가능하지만
//생성자와 초기화블럭은 상속이 불가능.
//protected => 객체를 만들고 super를 통해 사용이 가능함
	}
	public static void main(String[] args) {
		D d = new D();
		d.method1();
		d.method2();
	}
}
