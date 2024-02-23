package ch17.sec03.exam06;
public class StringExample4 {

	public static void main(String[] args) {
		String s = "java.lang.Object";
		boolean b = s.startsWith("java");
		boolean b2 = s.startsWith("lang");
		System.out.println(b);
		System.out.println(b2);
		String s1 = "HELLO";
		String s2 = s1.toLowerCase();
		System.out.println(s2);
		String s3 = s2.toUpperCase();
		System.out.println(s3);
		String a = String.valueOf(b);
		System.out.println(a);
		java.util.Date dd = new java.util.Date();
		String date = String.valueOf(dd);
		System.out.println(date);
	}


}
