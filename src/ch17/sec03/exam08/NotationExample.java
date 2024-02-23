package ch17.sec03.exam08;

import java.util.ArrayList;

public class NotationExample {
	public static void main(String[] args) {
		int i4 = Integer.parseInt("100",2);
		int i5 = Integer.parseInt("100",8);
		int i6 = Integer.parseInt("100",16);
		int i7 = Integer.parseInt("FF",16);
//		int i8 = Integer.parseInt("FF");	//NumberFormatException
		System.out.println(i4);	//100(2)
		System.out.println(i5);	//100(8)
		System.out.println(i6);	//100(16)
		System.out.println(i7); //FF(16)
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);				//오토박싱 10 -> new Integer(10)
		list.add(new Integer(10));	//	int -> Integer
		System.out.println(list);
//		int value = list.get(10); 	//언박싱 new Integer(10) -> 10
									//	Integer -> int
		
	}

}
