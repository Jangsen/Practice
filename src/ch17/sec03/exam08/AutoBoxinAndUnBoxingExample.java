package ch17.sec03.exam08;

import java.util.ArrayList;

public class AutoBoxinAndUnBoxingExample {
	public static void main(String[] args) {
		int i = 10;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);				//오토박싱 10 -> new Integer(10)
		list.add(new Integer(10));	//	int -> Integer
		System.out.println(list + "\n");
//		int value = list.get(10); 	//언박싱 new Integer(10) -> 10
									//	Integer -> int
		
		//기본형을 참조형으로 형변환(형변환 생략가능)
		Integer intg = (Integer)i;	// Integer intg = Integer.valueOf(i);
		Object obj = (Object)i;		// Object obj = (Object)Integer.valueOf(i);
		Long	lng = 100L;			// Long lng = new Long(100L);
		int i2 = intg + 10;			// 참조형과 기본형간의 연산 가능
		long l = intg + lng;		// 참조형 간의 덧셈도 가능
		Integer intg2 = new Integer(20);	
		int i3 = (int)intg2;		// 참조형을 기본형으로 형변환도 가능(형변환 생략가능)
		Integer intg3 = intg2 + i3;
		
		System.out.println("i = " + i);
		System.out.println("intg = " + intg);
		System.out.println("obj = " + obj);
		System.out.println("lng = " + lng + "\n");
		System.out.println("intg + 10 = " + i2);
		System.out.println("intg + lng = " + l);
		System.out.println("intg2 = " + intg2);
		System.out.println("i3 = " + i3);
		System.out.println("intg2 + i3 =" + intg3);
	}

}
