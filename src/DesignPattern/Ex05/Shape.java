package DesignPattern.Ex05;

abstract class Shape {
	abstract public void draw();
}

class Rectangle extends Shape {
	public void draw() {
		rectangle();
	}

	private void rectangle() {
		System.out.println("rectangle");
	}
}

class Triangle extends Shape {
	public void draw() {
		triangle();
	}

	private void triangle() {
		System.out.println("triangle");
	}
}

class ShapeFactory{
	public Shape create_R() {
		return new Rectangle();
		
	}
	public Shape create_T() {
		return new Triangle();
	}
}
	
