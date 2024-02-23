package explanation;

import java.util.Scanner;

public class MoneyEx06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요.>>");
		int[] unit = { 50000, 10000, 1000, 100, 10, 1 };
		int money = sc.nextInt();
		for (int i = 0; i < unit.length; i++) {
			int res = money / unit[i];
			if (res > 0) {
				System.out.println(unit[i] + "원 짜리 :" + res + "매");
				money %= unit[i];

			}
		}
		sc.close();
	}
}

//			int money = sc.nextInt();
//			int[] unit = { 50000,10000,1000,100,10,1 };
//			for(int i = 0; i < unit.length; i++) {
//				System.out.println(unit[i] + "원 짜리 :" + money/unit[i]);
//				System.out.println();
//				money = money - (money / unit[i]) * unit[i];