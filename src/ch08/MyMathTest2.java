package ch08;

public class MyMathTest2 {
	public static void main(String[] args) {
		System.out.println(MyMath2.add(5L, 8L));
		System.out.println(MyMath2.sub(5L, 8L));
		System.out.println(MyMath2.multiply(5L, 8L));
		System.out.println(MyMath2.divide(5L, 8L));
		MyMath2 mm = new MyMath2();
		mm.a = 88;
		mm.b = 100;
		System.out.println(mm.add());
		System.out.println(MyMath2.add(mm.a,mm.b));
		
	}//static 이 없는 메서드 = 인스턴스 메서드 (객체가 있어야 사용가능)
}

class MyMath2 extends Object {
	long a, b;

	long add() {	return a + b;}

	long sub() {	return a - b;}

	long multiply() {	return a * b;}

	double divide() {	return a * 1.0 / b;}
	
static	long add(long a, long b) {	return a + b;}

static	long sub(long a, long b) {	return a - b;}

static	long multiply(long a, long b) {	return a * b;}

static	double divide(long a, long b) {	return a * 1.0 / b;}
}
