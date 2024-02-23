package ezenprojecet02;

import java.util.ArrayList;
import java.util.Scanner;

public class Insert{
	ArrayList<BookEx> bookList = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
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

			System.out.println("도서번호 : " + book.getNum());
			System.out.println("도서제목 : " + book.getName());
			System.out.println("저 자  : " + book.getAuthor());
			System.out.println("출판사  : " + book.getCompany());
			System.out.println("출판일 : " + book.getDay());

			bookList.add(book);
			break;
		}
	}

}
