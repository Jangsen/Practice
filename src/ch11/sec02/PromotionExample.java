package ch11.sec02;
class A{
	
}
class B extends A{
	
}
class C extends A{
	
}
class D extends B{
	
}
class E extends C{
	
}
public class PromotionExample {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
//		B b3 = e;	
//		C c2 = d;	//d 타입의 객체를 c타입의 레퍼런스로 어싸인 할떄도 마찬가지
		
	}

}
