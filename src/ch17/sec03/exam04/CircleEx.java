package ch17.sec03.exam04;

import java.awt.Point;

public class CircleEx {
	public static void main(String[] args) {
		Circle c1 = new Circle(2.0, new Point(10,20));
		Circle c2 = (Circle)c1.clone();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1 == c2);
		System.out.println(c1.point == c2.point);
	}
}
