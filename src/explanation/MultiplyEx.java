package explanation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplyEx {
	//do while 의 쓰임새 + try catch 의 쓰임새 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("곱하고자 하는 두 수 입력>> ");
			int n, m;
			try {
				n = sc.nextInt();
				m = sc.nextInt();
				System.out.println(n + "x" + m + "=" + n * m);

				break;
			} catch (InputMismatchException e) {
				System.out.println("실수는 입력하면 안됩니다");
				sc.nextLine();
				continue;

			}
		} while (true);
		sc.close();
	}

}
