package ch17.sec03.exam05;

import java.awt.Point;

import ch08.Card;

public class CircleExample {
	public static void main(String[] args) throws ClassNotFoundException {

		Circle c1 = new Circle(2.0, new Point(10,20));
		Class cobj = c1.getClass();
		Class cobj2 = Circle.class;
		System.out.println(cobj);
		System.out.println(cobj2);
		Class cobj3 = Class.forName("ch17.sec03.exam04.Circle"); // 패키지 이름까지 넣어줘야 함.
		System.out.println(cobj3);
		Circle c3 = new Circle(2.0, new Point(10,20));
		System.out.println(c3);
		String className = Circle.class.getName();
		System.out.println(className);
	}
}