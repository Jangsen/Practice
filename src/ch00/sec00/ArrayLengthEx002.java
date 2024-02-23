package ch00.sec00;

import java.util.Scanner;

public class ArrayLengthEx002 {

	public static void main(String[] args) {

		int intArray[] = new int[5]; // 배열과 선언과 생성
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println(intArray.length + "개의 정수를 입력하세요>>");
		for (int i = 0; i < intArray.length; i++)
			intArray[i] = sc.nextInt(); // 키보드에 입력받은 정수 저장
		for (int i = 0; i < intArray.length; i++)
			sum += intArray[i]; // 배열에 저장된 정수 값을 더하기

		System.out.println("평균은 " + (double) sum / intArray.length);
		sc.close();

	}

}
