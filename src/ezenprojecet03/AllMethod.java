package ezenprojecet03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import ezenprojecet.Book;

public class AllMethod {
	List<Book> list = new ArrayList<>();

	Scanner sc = new Scanner(System.in);

	public void InsertBook() {
		System.out.print("번호 : ");
		int num = sc.nextInt();
		boolean check = false;
		if (list != null) {
			for (Book b : list) {
				if (b.getNum() == num) {
					while (!check) {
						System.out.println("중복된 번호입니다.\n다시 입력하세요.");
						System.out.println("도서 등록번호 : ");
						int num2 = sc.nextInt();
						if (b.getNum() != num2) {
							num = num2;
							check = true;
						}
					}
				}
			}
		}
		System.out.printf("도서 제목 : ");
		String name = sc.next();
		System.out.printf("도서 저자 : ");
		String author = sc.next();
		System.out.printf("도서 출판사 : ");
		String company = sc.next();
		System.out.printf("도서 출판일 : ");
		String day = sc.next();
		list.add(new Book(num, name, author, company, day));
		System.out.println("도서가 등록 되었습니다.");

	}

	public void selectAll() {
		if (list.isEmpty()) {			
			System.out.println("대여할 책이 없습니다");		//리스트 안이 비어있는지 확인 
			return;
		}
		while (true) {
			System.out.println("보유 도서량: " + list.size());		//전체 보유하고 있는 도서량
			System.out.println("=============== 전체 도서 목록 ================");
			for (int i = 0; i < list.size(); i++) {				//전체 리스트 안을 순회
				System.out.println("도서번호 : " + list.get(i).getNum());		//
				System.out.println("도서제목: " + list.get(i).getName());
				System.out.println("도서저자: " + list.get(i).getAuthor());
				System.out.println("출판사: " + list.get(i).getCompany());
				System.out.println("출판일: " + list.get(i).getDay());
				System.out.println();
			}
			break;
		}
		System.out.println("==========================================");
	}
	
//	HashMap<Integer, String> bookInfo = new HashMap<Integer, String>();
//	public void SetBookInfo() {
//		for (Book li : list) {
//			int num = li.num;
//			String name = li.name;
//			bookInfo.put(num, name);
//		}
//	}
//
//	String GetBookName(HashMap<Integer, String> bookInfo, int num) {
//		return bookInfo.get(num);
//	}
//
//	List<Book> GetBookData(List<Book> books, String bookName) {
//		List<Book> li = new ArrayList<>();
//		for (Book book : books) {
//			if (book.name.equals(bookName)) {
//				li.add(book);
//			}
//		}
//		return li;
//	}
//
//	public void GetBookInfo() {
//		System.out.println("조회 하실 도서 번호를 입력하세요");
//		int num = sc.nextInt();
//		String bookName = GetBookName(bookInfo, num);
//		if (bookName != null) {
//			List<Book> book = GetBookData(list, bookName);
//			for (Book li : book) {
//				System.out.println("선택하신 책 정보");
//				System.out.println("1.책 이름 : " + li.getName());
//				System.out.println("2.지은이 : " + li.getAuthor());
//				System.out.println("3.출판사 : " + li.getCompany());
//				System.out.println("4.출판일 : " + li.getDay());
//				System.out.println("5.책번호 : " + li.getNum());
//			}
//		} else
//			System.out.println("조회하신 책의 등록번호가 존재하지않습니다.");
//	}

}
