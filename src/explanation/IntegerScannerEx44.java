package explanation;

import java.util.Scanner;

public class IntegerScannerEx44 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[];
		int n;
		System.out.print("정수 몇개?>>");
		n = sc.nextInt();
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			int tmp = (int) (Math.random() * 100 + 1); // 중복 검증을 위해 변수 tmp에 임시로 배열을 저장합니다.
			int chk = 0; // 그리고 다음에 올 if조건문을 위해 chk변수를 지정합니다.
			for (int j = 0; j < arr.length; j++) {
				if (tmp == arr[j]) {
					chk = 1;
					break; // 만약 중복된 수가 있다면
				}
			}
			if (chk == 1) { // 다시 앞으로 돌려보냅니다.
				i--;
				continue; // 중복이 없다면 아래로 보내 arr[i]를 출력합니다.
			}
			arr[i] = tmp;
		}
		for (int i = 0; i < arr.length; i++) {
			if (i % 10 == 0 && i != 0)
				System.out.println(); // 한 행에 10열씩 출력하기 위함입니다.
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}

}
