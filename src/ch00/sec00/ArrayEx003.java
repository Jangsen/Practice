package ch00.sec00;

public class ArrayEx003 {

	public static void main(String[] args) {
		int[][]score = {{100,90,80,95,88},
						{70,80,95,77,100},
						{100,90,80,95,88},
						{100,90,80,95,88}};
		
		score = new int[4][5];
		int[]s2;
		s2 = new int[5];
		int[]s1 = {1,2,3,4,5};
		System.out.println(score.length);
		System.out.println(s2.length);
		System.out.println(s1.length);
		
		String names[] = {"사과","배","포도","바나나"};
		
		System.out.println(names[1]);
		
		int intArray[] = new int[5];
	}

}
