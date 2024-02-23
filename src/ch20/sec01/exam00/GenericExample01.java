package ch20.sec01.exam00;

import java.util.ArrayList;
import java.util.List;

public class GenericExample01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("hello");
		String str = list.get(0);
	}

}
