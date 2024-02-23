package ch15.exam07;

public class A {
	//메소드
	 public void method(int arg) {
		 //로컬 변수
		 int var = 1;
		 
		 //로컬 클래스
		 class B{
			 void method2() {
				 //로컬 변수 읽기
				 System.out.println("arg: " + arg);
				 System.out.println("var: " + var);
				 //로컬 변수 수정
//				 arg = 2;
//				 var = 2;
				 
			 }
		 }
		 B b = new B();
		 b.method2();
		 //로컬 변수 수정
//		 arg = 3;
//		 var = 3;
	 }

}
