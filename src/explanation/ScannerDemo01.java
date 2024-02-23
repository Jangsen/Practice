package explanation;

import java.util.Scanner;

public class ScannerDemo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");

		String s = sc.next(); // s 에 문자열 읽기
		char c = s.charAt(0); // s 의 첫번쨰 문자를 c 에 입력
		// char = char 타입의 배열로 만들어진 것
		if ('a' > c || c > 'z') {
			System.out.println("소문자 알파벳이 아닙니다.");
			sc.close();
			return;
		}
		for (char i = c; i >= 'a'; i--) {
			for (char j = 'a'; j <= i; j++) {

				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	}
}

//			if('a' <= c && c <= 'z') {
//				System.out.println("소문자 알파벳이 아닙니다.");
//'a' > c || c > 'z' (반대)
//		for(int i = 0; i<=c-'a'; i++) {
//		for(char j = 'a'; j<= c-i; j++) {