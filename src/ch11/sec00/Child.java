package ch11.sec00;

public class Child extends Parent {
		//super.x = 10;	//객체 만들기 전에 사용 불가
		int x = 20;
		void method( ) {		//메소드 또한 객체가 만들어져야 사용가능
			super.x = 10;
			System.out.println("x= " + x);
			System.out.println("this.x= " + this.x);
			System.out.println("super.x= " + super.x);
			System.out.println();
			
		}
		public static void main(String[] args) {
			Child c = new Child();
			c.method();
		}
}
