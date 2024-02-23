package collectionExample;

import java.util.*;

class Ex11_10A {
	public static void main(String[] args) {
		Set hset = new HashSet();
		Set tset = new TreeSet();

		for (int i = 0; hset.size() < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			hset.add(new Integer(num));
		}
		for (int i = 0; tset.size() < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			tset.add(new Integer(num));
		}
		System.out.println(hset);
		System.out.println(tset);
		List list = new LinkedList(hset); // LinkedList(Collection c)
		Collections.sort(list); // Collections.sort(List list)
		System.out.println(list);
	}
}
