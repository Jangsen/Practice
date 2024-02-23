package ch22.sec01.exam06;

import java.util.*;

public class HashTreeSetExample {
	public static void main(String[] args) {
		Set hSet = new HashSet();
		Set tSet = new TreeSet();
		
		for(int i = 0; hSet.size() < 6; i++) {
			int num = (int)(Math.random()*45) + 1;
			hSet.add(new Integer(num));
		}
		for(int i = 0; tSet.size() < 6; i++) {
			int num = (int)(Math.random()*45) + 1;
			tSet.add(new Integer(num));
		}
		System.out.println(hSet);
		System.out.println(tSet);
		List list = new LinkedList(hSet);	//LinkedList(Collections HashSet)
		Collections.sort(list);	//Collection.sort(List list)
		System.out.println(list);
	}

}
