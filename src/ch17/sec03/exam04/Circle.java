package ch17.sec03.exam04;

import java.awt.Point;

public class Circle implements Cloneable {
	double r;
	Point point;

	Circle( double r, Point point) {
		this.r = r;
		this.point = point;
	}
	@Override
	public Object clone() {
		Circle c = new Circle(this.r, new Point(this.point.x , this.point.y));
		return c;
	}
	@Override
	public String toString() {
		return point.toString() + ", r=" + r;
	}

}
