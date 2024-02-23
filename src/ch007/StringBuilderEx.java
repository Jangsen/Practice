package ch007;

import java.util.Arrays;

public class StringBuilderEx {

	public static void main(String[] args) {
		String s1 = "홍길동";
		s1 = "홍길동123";
		System.out.println(s1);
		int iArr[] = {100,200,300};	//String Builder
		System.out.println(iArr); 	//배열 integer 의 주소
		System.out.println(Arrays.toString(iArr)); 
		//iArr의 상태값을 문자열로 반환.
		
		//String class 의 특이점
		//toString 오브젝트에 있던 메소드를 상속받아서 쓴다.
		//
	}

}
