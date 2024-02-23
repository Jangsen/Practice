package ch00.sec000;

import java.util.Scanner;

public class ScannerIntegerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요>>");
		sc.nextInt();
		for(int i =0; i < 5; i++) {
			for(int j=5 ; j>i ; j--) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}
