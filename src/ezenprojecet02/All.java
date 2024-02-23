package ezenprojecet02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class All{
	ArrayList<BookEx> bookList = new ArrayList<>();
//	HashMap<Integer, String> bookInfo = new HashMap<Integer, String>();
	Scanner sc = new Scanner(System.in);
		public void selectAll() {
			if(bookList.isEmpty()) {
				System.out.println("대여할 책이 없습니다");
				return;
		}
		while (true) {
			System.out.println("보유 도서량: " + bookList.size());
			System.out.println("=============== 전체 도서 목록 ================");
			for(int i = 0; i < bookList.size(); i++) {
				System.out.println("도서번호 : " + bookList.get(i).getNum());
				System.out.println("도서제목: " + bookList.get(i).getName());
				System.out.println("도서저자: " + bookList.get(i).getAuthor());
				System.out.println("출판사: " + bookList.get(i).getCompany());
				System.out.println("출판일: " + bookList.get(i).getDay());
				System.out.println();
			}
				break;
		}
		System.out.println("=============== Hacker J ================");
	}
		public void InsertBook() {
			while (true) {
				BookEx book = new BookEx(0, null, null, null, null);
				while (true) {
					System.out.println("도서 번호 입력");
					int temp = sc.nextInt();
						book.setNum(temp);
						break;
				}
				System.out.println("도서제목 입력");
				book.setName(sc.next());
				System.out.println("도서 저자 입력");
				book.setAuthor(sc.next());
				System.out.println("출판사 입력");
				book.setCompany(sc.next());
				System.out.println("출판일 입력");
				book.setDay(sc.next());

				System.out.println("1.도서번호 : " + book.getNum());
				System.out.println("2.도서제목 : " + book.getName());
				System.out.println("3.저 자  : " + book.getAuthor());
				System.out.println("4.출판사  : " + book.getCompany());
				System.out.println("5.출판일 : " + book.getDay());

				bookList.add(book);
				break;
			}
		}

}
