package collectionExample;

import java.util.*;

class Ex11_14 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		//사전순으로 정렬.

		String from = "b";
		String to	= "d";

		set.add("abc");      set.add("alien");    set.add("bat");
		set.add("car");      set.add("Car");      set.add("disc");
		set.add("dance");    set.add("dZZZZ");    set.add("dzzzz");
		set.add("elephant"); set.add("elevator"); set.add("fan");
		set.add("flower");

		System.out.println(set);
		System.out.println("range search : from " + from  +" to "+ to);	//from부터 to까지 찾겠다.	(b ~ d까지)
		System.out.println("result1 : " + set.subSet(from, to));		
		System.out.println("result2 : " + set.subSet(from, to + "zzz"));	//to + "zzz" =  dzzz전까지
	}
}