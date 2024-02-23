package ch007;

import java.util.Arrays;

public class ArraysCopyEx5 {

	public static void main(String[] args) {
		String[][] str2D = new String[][] { {"aaa","bbb"},{"AAA","BBB"} };
		String[][] str2D2 = new String[][] { {"ccc","ddd"},{"AAA","BBB"} };
		
		String[][] str2D3 = new String[2][2];
		System.arraycopy(str2D2[0], 0, str2D3[0], 0, str2D[0].length);
		System.arraycopy(str2D2[1], 0, str2D3[1], 0, str2D[1].length);
		
		System.out.println(Arrays.deepToString(str2D));
		System.out.println(Arrays.deepToString(str2D3));
		
		System.out.println("---------------------------");
		
		str2D3[0][1] = "ttt";
		System.out.println(Arrays.deepToString(str2D));
		System.out.println(Arrays.deepToString(str2D3));
		
		//주소만 복사하는게 얕은 복사 
		//값을 복사하는게 깊은 복사
	}

}
