package practice;

import java.util.Scanner;

public class ForEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력 >>");
		int n = sc.nextInt();
		for (int i = 5; i > 0; i--) 
		{
		for (int j = 0; j < i; j++) 
		{
		System.out.print("*");
		}
		System.out.println();
		}
	}

}
