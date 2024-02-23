package ch007;

import java.util.Arrays;

public class ArraysCopyEx4 {

	public static void main(String[] args) {
		String[][] str2D = new String[][] { {"aaa","bbb"},{"AAA","BBB"} };
		String[][] str2D2 = new String[][] { {"ccc","ddd"},{"AAA","BBB"} };
		
		String[][] str2D3 = str2D.clone();
		System.out.println(Arrays.deepToString(str2D));
		System.out.println(Arrays.deepToString(str2D3));
		
		str2D3[0][1] = "ttt";
		System.out.println(Arrays.deepToString(str2D));
		System.out.println(Arrays.deepToString(str2D3));
		
		System.out.println("-------------------------");
		System.arraycopy(str2D2, 0, str2D3, 0, str2D2.length); // java.lang.ArrayIndexOutOfBoundsException
		System.out.println(Arrays.deepToString(str2D2));
		System.out.println(Arrays.deepToString(str2D3));
		
		System.out.println("-------------------------");
		str2D3[0][1] = "tttt";
		System.out.println(Arrays.deepToString(str2D2));
		System.out.println(Arrays.deepToString(str2D3));
	}

}
