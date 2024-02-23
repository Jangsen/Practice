package ch09;

public class CalculatorExample {

	public static void main(String[] args) {
		//Calculator 객체 생성
		Calculator myCalc = new Calculator();
		//리턴 값이 없는 poweron() 메소드 호출
		myCalc.powerOn();
		//Plus 메소드 호출 시 5와 6의 매개값으로 제공하고,
		//덧셈 결과를 리턴 받아 result 변수에 대입
		int result1 = myCalc.multiply(5, 6);
		System.out.println("result1:" + result1);
		int x = 10;
		int y = 4;
		//divide() 메소드 호출 시 변수 x와 y의 값을 매개값으로
		//나눈셈 결과를 리턴 받아 result2 변수에 대입
		double result2 = myCalc.divide(x, y);
		System.out.println("result2:" + result2);
		//리턴 값이 없는 powerOff()메소드 호출
		myCalc.powerOff();
	}

}
