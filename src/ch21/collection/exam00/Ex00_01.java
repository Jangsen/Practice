package ch21.collection.exam00;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex00_01 {
	 public static void main(String[] args) {
		
		Number[] r = new Number[5];
		r[0] = 10;
		r[1] = 20;
		r[2] = 30;
		r[3] = 40;
		r[4] = 50;
		
		r[3] = null;
		
		System.out.println(Arrays.toString(r));
		
		List<Number> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		l.remove(0);
		
		for(Number i : l) {
			System.out.println(i);
		}
		System.out.println(l);
		
		//타입 설정 Integer
		ArrayList<Integer> members = new ArrayList<>();
		//초기 용량(capacity)지정
		ArrayList<Integer> num3 = new ArrayList<>(10);
		//배열을 넣어 생성
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3));
		
	}
}
