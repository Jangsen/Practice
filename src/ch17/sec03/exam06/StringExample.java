package ch17.sec03.exam06;

public class StringExample {

	public static void main(String[] args) {
		
//
//		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println(str1 == str2);
		System.out.println(str3 == str4);
		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str4));
		String a = "hello" + " world";
		String a1 = new StringBuilder("hello").append(" world").toString();
		System.out.println(a);
		System.out.println(a1);
		StringBuffer sb = new StringBuffer("Hello");
		StringBuffer sb1 = new StringBuffer("Hello");
		System.out.println(sb == sb1);
		System.out.println(sb.equals(sb1));
		String sb_tmp = sb.toString();
		String sb1_tmp = sb1.toString();
		System.out.println(sb_tmp);
		System.out.println(sb1_tmp);
		System.out.println(sb_tmp == sb1_tmp);
		System.out.println(sb_tmp.equals(sb1_tmp));
	}

}
