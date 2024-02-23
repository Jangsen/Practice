package collectionExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Ex11_18 {
	public static void main(String[] args) {
		String[] data = { "A","K","A","K","D","K","A","K","K","K","Z","D" };

		HashMap map = new HashMap();		//HashMap 객체 생성

		for(int i=0; i < data.length; i++) {	//data배열의 길이
			if(map.containsKey(data[i])) {		//data[i]에 key가 포함되어있는지 알려줌
				int value = (int)map.get(data[i]);	//get() 지정된 키의 값을 반환
				map.put(data[i], value+1);  // 기존에 존재하는 키면 기존 값을 1증가		put() 지정된 키와 값을 HashMap에 저장
			} else {
				map.put(data[i], 1);	    // 긱존에 존재하지 않는 키는 값을 1로 저장		
			}
		}

		Iterator it = map.entrySet().iterator();

		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			int value = (int)entry.getValue();
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value );
		}
	} // main

	public static String printBar(char ch, int value) { 
		char[] bar = new char[value]; 

		for(int i=0; i < bar.length; i++)
			bar[i] = ch; 

		return new String(bar); // String(char[] chArr)
	}
}
