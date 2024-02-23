package ch17.sec03.exam06;

public class StringExample02 {

	public static void main(String[] args) {
		String s = "abcdefg";
		boolean b = s.contains("bc");
		//주어진 문자열이 있는지 검사
		System.out.println(b);
		String file = "Hello.txt";
		boolean b1 = file.endsWith("txt");
		System.out.println(b1);
		String s1 = "Hello";
		boolean b2 = s1.equalsIgnoreCase("hello");
		System.out.println(b2);
		//전략 패턴 핵심 서로 관련이 없는것을 묶어서 인터페이스로 받게?
	}

}
