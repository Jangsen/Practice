package explanation;

import java.util.Scanner;

public class PrintStar {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		// 사용자로부터 정수 입력 받기
		System.out.println("정수를 입력하세요>> ");
		// nextInt()메서드는 사용자가 키보드로 입력한 정수를 읽어 와서 변수'n'에 저장
		int n = sc.nextInt();
		// if 조건문 n이 0 이하일 경우 메시지를 출력하고 프로그램을 종료
		if(n <= 0) {
			System.out.println("0보다 큰 값을 입력하세요");
			sc.close();
			return;
		}
		//n이 0 초과일 경우
		System.out.println("입력한 정수는 " + n + "입니다.");
		// i번째 행에 i개의 별 출력 //별을 찍는 갯수는 i만큼 찍으면 되겠다.
		//
		for(int i = n; i > 0; i--)
		{
		for(int j = 0; j < i; j++) 
		{
			System.out.print("* ");
		}
		System.out.println(); 	//행 변경
		}
		sc.close();
	}

}

//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 입력하세요>> ");
//		int n = sc.nextInt();
//		if (n <= 0 ) {
//			System.out.println("0보다 큰 값을 입력하세요");
//			sc.close();
//			return;
//		}
//		for(int i = n; i > 0 ; i--) {
//			for(int j = 0; j < i ; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}sc.close();