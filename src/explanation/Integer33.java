package explanation;

import java.util.Scanner;

public class Integer33 {

	public static void main(String[] args) {
		int[] intArr = new int[10];
		Scanner sc = new Scanner(System.in);
			System.out.print("양의 정수 10개를 입력하시오>>");
			for(int i = 0; i < 10; i++) {
				intArr[i] = sc.nextInt();
			}
			System.out.print("3의 배수는>> ");
			for(int i = 0; i < intArr.length; i++) {
				if(intArr[i] % 3 ==0 )
					System.out.print(intArr[i]+" ");
			}sc.close();
	}

}
