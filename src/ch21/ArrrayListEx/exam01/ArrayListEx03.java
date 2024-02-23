package ch21.ArrrayListEx.exam01;

import java.util.Arrays;

public class ArrayListEx03 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		Arrays.fill(arr, 5);
		Arrays.setAll(arr, (i) -> (int)(Math.random()*5)*1);
		System.out.println(arr.length);
	}

}
