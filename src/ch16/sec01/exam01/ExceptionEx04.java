package ch16.sec01.exam01;

public class ExceptionEx04 {
	public static void main(String[] args) {
		try {//Exception과 그 자손은 반드시 예외처리를 해야한다.
			throw new Exception();//Exception을 고의로 발생시킨다.
		}catch (Exception e) {
			
		}
		//RuntimeException과 그 자손은 예외처리를 해주지 않는다.
		throw new RuntimeException();
	}

}
