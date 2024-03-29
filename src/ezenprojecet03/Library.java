package ezenprojecet03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Library {
	   public List<Book> list = new ArrayList<>();
	   public Scanner sc = new Scanner(System.in);
	   public HashMap<Integer, String> bookInfo = new HashMap<Integer, String>();

	   public static void main(String[] args) {
	      Library library = new Library();

	      // Book book = new Book(1,"1","1","1","1");
	      // list.add(book);

	      boolean run = true;

	      while (run) {
	         System.out.println("===============================================");
	         System.out.println("도 서 관 리 시 스 템 ");
	         System.out.println("===============================================");
	         System.out.println("1.도서등록 2.도서목록 조회 3.도서정보 조회 4.도서정보 수정 5.도서목록 삭제");
	         System.out.println("선택 : ");

	         int n = 0;
	         n = library.sc.nextInt();

	         switch (n) {
	         case 1:
	            library.InsertBook();
	            break;

	         case 2:
	            library.selectAll();
	            break;
	         case 3:
	            library.GetBookInfo();
	            break;
	         case 4:
	            library.modify();
	            break;

	         case 5:
	            library.DeleteBook();
	            break;
	         }
	      }
	   }

	   private void modify() {

	      System.out.println("수정하실 책의 번호를 입력하세요.");
	      int num = sc.nextInt();

	      for (int i = 0; i < list.size(); i++) {
	         if (num == list.get(i).getNum()) {
	            Book l1 = list.get(i);

	            System.out.println("수정후 번호를 입력하세요.");
	            int num1 = sc.nextInt();
	            l1.setNum(num1);
	            System.out.println("수정후 제목을 입력하세요.");
	            String name = sc.next();
	            l1.setName(name);
	            System.out.println("수정후 저자를 입력하세요.");
	            String author = sc.next();
	            l1.setAuthor(author);
	            System.out.println("수정후 출판사를 입력하세요.");
	            String company = sc.next();
	            l1.setCompany(company);
	            System.out.println("수정후 출판일을 입력하세요.");
	            String day = sc.next();
	            l1.setDay(day);
	            list.set(i, (Book) l1);
	            System.out.println("수정된 책번호 " + num1);
	            System.out.println("수정된 제목 " + name);
	            System.out.println("수정된 저자이름 " + author);
	            System.out.println("수정된 출판사이름 " + company);
	            System.out.println("수정된 출판일 " + day);
	         }
	      }
	   }
	   private void SetBookInfo() {
	      for (Book li : list) {
	         int num = li.getNum();
	         String name = li.getName();
	         bookInfo.put(num, name);
	      }
	   }

	   private String GetBookName(HashMap<Integer, String> bookInfo, int num) {
	      return bookInfo.get(num);
	   }

	   private List<Book> GetBookData(List<Book> books, String bookName) {
	      List<Book> li = new ArrayList<>();
	      for (Book book : books) {
	         if (book.getName().equals(bookName)) {
	            li.add(book);
	         }
	      }
	      return li;
	   }

	   private void GetBookInfo() {
	      System.out.println("조회 하실 도서 번호를 입력하세요");
	      int num = sc.nextInt();
	      String bookName = GetBookName(bookInfo, num);
	      if (bookName != null) {
	         List<Book> book = GetBookData(list, bookName);
	         for (Book li : book) {
	            System.out.println("선택하신 책 정보");
	            System.out.println("1.책 이름 : " + li.getName());
	            System.out.println("2.지은이 : " + li.getAuthor());
	            System.out.println("3.출판사 : " + li.getCompany());
	            System.out.println("4.출판일 : " + li.getDay());
	            System.out.println("5.책번호 : " + li.getNum());
	         }
	      } else
	         System.out.println("조회하신 책의 등록번호가 존재하지않습니다.");
	   }

		public void selectAll() {
			if (list.isEmpty()) {
				System.out.println("대여할 책이 없습니다");
				return;
			}
			while (true) {
				System.out.println("보유 도서량: " + list.size());
				System.out.println("=============== 전체 도서 목록 ================");
				for (Book li : list) {
					System.out.println("도서번호 : " + li.getNum());
					System.out.println("도서제목: " + li.getName());
					System.out.println("도서저자: " + li.getAuthor());
					System.out.println("출판사: " + li.getCompany());
					System.out.println("출판일: " + li.getDay());
					System.out.println();
				}
				break;
			}
			System.out.println("==========================================");
		}

	   public void InsertBook() {
	      while (true) {
	         Book book = new Book(0, null, null, null, null);
	         while (true) {
	            int count = 0;
	            System.out.printf("도서 번호 : ");
	            int num = sc.nextInt();

	            for (int i = 0; i < list.size(); i++) {
	               if (num == (list.get(i).getNum())) {
	                  count++;
	                  System.out.println("도서 번호가 중복입니다. 다시 입력하세요 : ");
	               }
	            }
	            if (count == 0) {
	               book.setNum(num);
	               break;
	            }
	         }
	         System.out.printf("도서 제목 : ");
	         book.setName(sc.next());

	         System.out.printf("도서 저자 : ");
	         book.setAuthor(sc.next());

	         System.out.printf("출판사 : ");
	         book.setCompany(sc.next());

	         System.out.printf("출판일 : ");
	         book.setDay(sc.next());

	         list.add(book);
	         SetBookInfo();
	         System.out.println("등록 되었습니다.");
	         break;
	      }
	   }

	   public void DeleteBook() {
	      boolean delete = false;
	      while (!delete) {
	         System.out.println("삭제할 책 번호를 입력하세요 : ");
	         int num = sc.nextInt();

	         for (int i = 0; i < list.size(); i++) {
	            if (num == (list.get(i).getNum())) {
	               list.remove(i);
	               delete = true;
	               System.out.println("도서가 삭제 되었습니다.");
	               break;
	            }
	         }
	      }
	   }
	}