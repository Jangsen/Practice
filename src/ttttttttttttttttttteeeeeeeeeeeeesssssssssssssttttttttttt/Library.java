package ttttttttttttttttttteeeeeeeeeeeeesssssssssssssttttttttttt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
	Scanner sc = new Scanner(System.in);
	List<Book> list = new ArrayList<>();
	public static void main(String[] args) {
		Library lib = new Library();

		boolean run = true;

		while (run) {
			System.out.println("===============================================");
			System.out.println("도 서 관 리 시 스 템 ");
			System.out.println("===============================================");
			System.out.println("1.도서등록 2.도서목록 조회 3.도서정보 조회 4.도서정보 수정 5.도서목록 삭제");
			System.out.printf("선택 : ");
			int n = lib.sc.nextInt();
			switch (n) {
			//도서 등록
			case 1:
				lib.InsertBook(lib.list);
			//도서목록 조회
			case 2:
			//도서정보 조회
			case 3:
			//도서정보 수정
			case 4:
			//도서목록 삭제
			case 5:
			//잘못 입력
			default:
			}
		}
	}
	public static void InsertBook(List<Book> list) {
		Scanner sc = new Scanner(System.in);
		int num;
		boolean flag = false;
		do {
			flag = false;
			System.out.println("도서 번호: ");
			num = sc.nextInt();
			
			for(Book book : list) {
				if(book.getNum() == num) {
					flag = true;
					System.out.println("등록된 번호입니다.");
					break;
				}
			}
		}while(flag);
	
		
	}
}