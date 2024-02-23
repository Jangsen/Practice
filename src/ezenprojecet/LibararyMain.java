package ezenprojecet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ezenprojecet.Book;
import junit.extensions.TestSetup;
import junit.framework.Test;

public class LibararyMain {
	public static void main(String[] args) {

		Book book = new Book(1,"asdas","asdsad","asd","as");
		Book book1 = new Book(2,"asdas","asdsad","asd","as");
		Book book2 = new Book(3,"asdas","asdsad","asd","as");
		Book book3 = new Book(4,"asdas","asdsad","asd","as");
		List<Book> list = new ArrayList();
		list.add(book);
		list.add(book1);
		list.add(book2);
		list.add(book3);
		System.out.println(list.size());
        Scanner sc = new Scanner(System.in);
        test(list);
//        while (true) {
//            System.out.println("=====================================");
//            System.out.println("도서관리시스템");
//            System.out.println("=====================================");
//            System.out.println("1.도서등록");
//            System.out.println("2.도서목록 조회");
//            System.out.println("3.도서정보 조회");
//            System.out.println("4.도서정보 수정");
//            System.out.println("5.도서정보 삭제");
//            System.out.println("6.종료");
//            System.out.println("=====================================");
//
//            System.out.print("메뉴를 선택하세요: ");
//            int menu = sc.nextInt();
//
//            switch (menu) {
//                case 1:
//                    // 도서 등록 코드 작성...
//                    break;
//                case 2:
//                	System.out.println("============전체 도서목록===============");
//                    break;
//                case 3:
//                    // 도서정보 조회 코드 작성...
//                    break;
//                case 4:
//                    // 도서정보 수정 코드 작성...
//                    break;
//                case 5:
//                    // 도서정보 삭제 코드 작성...
//                    break;
//                case 6:
//                    System.out.println("시스템을 종료합니다.");
//                    return;
//                default:
//                    System.out.println("잘못된 메뉴를 선택하셨습니다.");
//                    break;
//            }
//        }
    }
	
	public static void test(List<Book> list){
		for(Book book : list) {
			System.out.println(book.getAuthor() + book.getCompany() + book.getDay() + book.getName() + book.getNum() );
			System.out.println();
		}
	}
}
