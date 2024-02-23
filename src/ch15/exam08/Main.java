package ch15.exam08;

public class Main {
	public static void main(String[] args) {
		 A outter = new A();
		 System.out.println(outter.field1);
		 A.B b = outter.new B();
		 b.method();
		 A.C c = new A.C();
		 c.method();
	}

}
