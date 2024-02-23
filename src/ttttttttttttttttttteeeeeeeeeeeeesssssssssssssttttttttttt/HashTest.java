package ttttttttttttttttttteeeeeeeeeeeeesssssssssssssttttttttttt;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashTest {
	public static void main(String[] args) {
		Map<String, String> contacts = new HashMap<String, String>();
//		String num1 = "1번 키";
//		String num2 = "2번 키";
//		
//		
//		contacts.put(num1, "성한");
//		contacts.put(num2, "인선");
//		
//		
//		System.out.println(contacts.size());
//		System.out.println(contacts.containsValue("성한"));
//		System.out.println(contacts.containsKey(num2));
//		contacts.remove(num1);
//		System.out.println(contacts.containsValue("성한"));
//		contacts.clear();
//		System.out.println(contacts.isEmpty());
//		
//		Map<String,Integer>map = new HashMap<>();
//		map.put("a", 1);
//		map.put("b", 1);
//		map.put("c", 1);
//		
//		Set<Map.Entry<String, Integer>> entry = map.entrySet();
//		
//		System.out.println(entry);
//		
//		Map<String, String>hashmap = new HashMap<>();
//		
//		hashmap.put("love", "사랑");
//		hashmap.put("apple", "사과");
//		hashmap.put("baby", "아기");
//		
//		hashmap.get("apple");
//		System.out.println(hashmap.get("baby"));
//		Map<Integer, String>hashMap = new HashMap<>();
//		hashMap.put(1000,"one");
//		hashMap.put(2000,"two");
//		
//		for(Integer key: hashMap.keySet()) {
//			System.out.println(hashmap.get(key));
			
		//linkedhashmap은 정렬이 되지만 hashmap은 정렬이 안됨.
			Map<Integer, String>linkedHashmap = new LinkedHashMap<>(); 
			
			linkedHashmap.put(1000, "one");
			linkedHashmap.put(2000, "two");
			linkedHashmap.put(3000, "three");
			
			System.out.println(linkedHashmap.values());
		}
		//values() == values 배열
		//keySet() == Key 배열
	}
//}