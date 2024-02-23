package ch14.sec02;

public class ExtendsExample {

	public static void main(String[] args) {
		InterfaceCImpl impl = new InterfaceCImpl();
		
		InterfaceA ia = impl;		//A	=	A메소드 실행
		ia.methodA();
//		ia.methodB();
		System.out.println();
		
		InterfaceB ib = impl;		//B	=	B메소드 실행
		
//		ib.methodA();
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;		//AB 상속	AB메소드 + C메소드 실행
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}

}
