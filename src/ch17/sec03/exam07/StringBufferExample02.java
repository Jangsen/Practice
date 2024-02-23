package ch17.sec03.exam07;

public class StringBufferExample02 {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
	
		System.out.println(sb == sb2);
		System.out.println(sb.equals(sb2));
		
		String s = sb.toString();
		String s2 = sb.toString();
		
		System.out.println(s.equals(s2));
		System.out.println(s == s2);
	}

}
