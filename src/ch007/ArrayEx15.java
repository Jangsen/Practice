package ch007;

import java.util.Scanner;

public class ArrayEx15 {

	public static void main(String[] args) {
		final int SIZE = 10;	//final int 변수 = 상수로 변경 = 변수이름은 대문자로 쓰는건 관례
		int x = 0 , y = 0;
		char[][] board = new char[SIZE][SIZE];	
		byte[][] shipBoard = {
		        //  1  2  3  4  5  6  7  8  9
		         { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 1
		         { 1, 1, 1, 1, 0, 0, 1, 0, 0 }, // 2
		         { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 3
		         { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 4
		         { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 5
		         { 1, 1, 0, 1, 0, 0, 0, 0, 0 }, // 6
		         { 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 7
		         { 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 8
		         { 0, 0, 0, 0, 0, 1, 1, 1, 0 }, // 9
		      };
		//0행에 행번호를 , 0열에 열번호를 저장한다.
		for(int i = 1; i < SIZE; i++)
		{
			board[0][i] = board[i][0] = (char)(i+'0');
		}
		Scanner sc = new Scanner(System.in);	
		while(true)
		{
			System.out.printf("좌표를 입력하세요.(종료는 00)>");
			String input = sc.nextLine();	//화면입력받은 내용을 input에 저장
			if(input.length()==2)			//두 글자를 입력한 경우
			{
				x = input.charAt(0) - '0';	//문자를 숫자로 변환
				y = input.charAt(1) - '0';
				if(x==0 && y==0)			
					break;
			}
			if(input.length() != 2 || x <= 0 || x >= SIZE || y <= 0 || y >= SIZE) //첫번째 두번째 숫자가 1과 9사이
			{
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				continue;
			}
			// shipBoard[x-1][y-1]의 값잉 1이면, 'O'를 board[x][y]에 저장한다.
			board[x][y] = shipBoard[x-1][y-1]==1 ? 'O' : 'X';
			// 배열 board의 내용을 화면에 출력한다.
			for(int i = 0; i < SIZE; i++) 
			{
				System.out.println(board[i]); 	//board[i]는 1차원 배열
			}
			System.out.println();
		}
	}	//main 의 끝

}
