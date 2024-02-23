package ch17.sec03.exam01;

public class Main {
		
		public static void main(String[] args) {
			Person p1 = new Person();
			p1.id = 12345;
			Person p2 = new Person();
			p2.id = 12345;
			System.out.println(p1);
			System.out.println(p2);
			System.out.println(p1 == p2);		//실제 주소는 다르기때문에 false
			System.out.println(p1.equals(p2));
		}

}
