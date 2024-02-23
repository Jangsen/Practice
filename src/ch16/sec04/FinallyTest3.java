package ch16.sec04;

public class FinallyTest3 {

	public static void main(String[] args) {
		// method1()은 static메소드이므로 인스턴스 생성없이 직접 호출이 가능
		FinallyTest3.method1();
		System.out.println("method1()의 수행을 마치고 main메소드로 돌아왔습니다");
	}	//main  메소드의 끝	
	
	static void method1() {
		try {
			System.out.println("method1()이 호출되었습니다.");
			return;		//현재 실행중인 메소드를 종료
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("method1()의 finally블럭이 실행되었습니다");
		}
	}	//method1메소드의 끝

}
