package ch007;

import java.util.Arrays;

public class ArraysCopyEx2 {

	public static void main(String[] args) {
		int[] arr = {3,2,0,1,4};
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);		//Arrays.sort == 배열안에 원소들을 작은 순으로 정렬
		System.out.println(Arrays.toString(arr));
	}

}
