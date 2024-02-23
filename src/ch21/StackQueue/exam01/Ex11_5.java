package ch21.StackQueue.exam01;
import java.util.*;

class Ex11_5 {
	//while문에서 많이 쓰임.
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		System.out.println(list);
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	} // main
}