package ch22.sec01.exam05;

import java.util.*;


public class HashSetExample {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		for(int i = 0; set.size() < 6; i++) {
			int num =(int)(Math.random()*45) + 1;
			set.add(new Integer(num));
		}
		
		List list = new LinkedList(set);	//LinkedList
		Collections.sort(list);				//Collection
		System.out.println(list);
	}

}
