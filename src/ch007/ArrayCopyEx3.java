package ch007;

import java.util.Arrays;

public class ArrayCopyEx3 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int[][] arr2D = {{11,22},{21,22}};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2D));		
		System.out.println(Arrays.deepToString(arr2D));		// 배열안에 있는 주소로 들어가서 값을 가져옴
		System.out.println("-------------------");
		
		String s1 = "abcd";
		String s2 = "abcd";
		String s3 = new String("abcd");		//new String => heap 영역
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		
		//String 배열객체는 따로 만들어줘야 함.
		
		System.out.println("-------------------");
		String[][] str2D = { {"aaa","bbb"},
						   {"AAA","BBB"} };
		String[][] str2Da = { {"aaa","bbb"},
							{"AAA","BBB"} };
		
		System.out.println(str2D == str2Da);
		System.out.println(str2D.equals(str2Da));
		System.out.println(Arrays.deepEquals(str2D, str2Da));		//String 배열은 Arrays.deep
		
	}

}