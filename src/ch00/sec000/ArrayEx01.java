package ch00.sec000;

import java.util.Arrays;

public class ArrayEx01 {

	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = new int[] { 100, 80, 90, 70, 60 };
		int[] iArr4 = { 100, 80, 90, 70, 60 };
		char[] chArr = { 'a', 'b', 'c', 'd' };
		for (int i = 0; i < iArr1.length; i++) 
		{
			iArr1[i] = i + 1;
		}
		for (int i = 0; i < iArr2.length; i++) 
		{
			iArr2[i] = (int) (Math.random() * 10 )+ 1;
		}
		for (int i = 0; i < iArr1.length; i++) 
		{
			System.out.print(iArr1[i] + ", ");
		}			
		System.out.println();
		System.out.println(Arrays.toString(iArr2));
	}
}
