package ezenprojecet01;

import java.util.Scanner;

public class Main {
	   public static void main(String[] args) {
	        BookManager manager = new BookManager();
	        Scanner sc = new Scanner(System.in);
			
	        while (true) {
	            System.out.println("=====================================");
	            System.out.println("도서관리시스템");
	            System.out.println("=====================================");
	            System.out.println("1.도서등록");
	            System.out.println("2.도서목록 조회");
	            System.out.println("3.도서정보 조회");
	            System.out.println("4.도서정보 수정");
	            System.out.println("5.도서정보 삭제");
	            System.out.println("6.종료");
	            System.out.println("=====================================");

	            System.out.print("메뉴를 선택하세요: ");
	            int menu = sc.nextInt();

	            switch (menu) {
	            case 1:
	                System.out.print("도서 번호를 입력하세요: ");
	                int id = sc.nextInt();
	                System.out.print("제목을 입력하세요: ");
	                String title= sc.next();
	                System.out.print("저자를 입력하세요: ");
	                String author = sc.next();
	                System.out.print("출판사를 입력하세요: ");
	                String publisher = sc.next();
	                System.out.print("출판일을 입력하세요(YYYY-MM-DD): ");
	                String publicationDate = sc.next();
	                Book newBook = new Book(id, title, author, publisher, publicationDate);
	                manager.registerBook(newBook);
	                System.out.println("도서가 등록되었습니다.");
	                break;
	            case 2:
	                System.out.println("도서목록:");
	                for (Book book : manager.getAllBooks()) {
	                    System.out.println(book.getId() + " " + book.getTitle() + " " + book.getAuthor() + " " + book.getPublisher() + " " + book.getPublicationDate());
	                    System.out.println();
	                }
	                break;
	            case 3:
	                System.out.print("조회할 도서의 번호를 입력하세요: ");
	                id = sc.nextInt();
	                Book book = manager.getBookById(id);
	                if (book != null) {
	                    System.out.println("도서정보:");
	                    System.out.println(book.getId() + " " + book.getTitle() + " " + book.getAuthor() + " " + book.getPublisher() + " " + book.getPublicationDate());
	                } else {
	                    System.out.println("해당 번호의 도서를 찾을 수 없습니다.");
	                }
	                break;
	            case 4:
	                System.out.print("수정할 도서의 번호를 입력하세요: ");
	                id = sc.nextInt();
	                System.out.print("제목을 입력하세요: ");
	                title = sc.next();
	                System.out.print("저자를 입력하세요: ");
	                author = sc.next();
	                System.out.print("출판사를 입력하세요: ");
	                publisher = sc.next();
	                System.out.print("출판일을 입력하세요(YYYY-MM-DD): ");
	                publicationDate = sc.next();
	                Book updatedBook = new Book(id, title, author, publisher, publicationDate);
	                manager.updateBook(updatedBook);
	                System.out.println("도서 정보가 수정되었습니다.");
	                break;
	            case 5:
	                System.out.print("삭제할 도서의 번호를 입력하세요: ");
	                id = sc.nextInt();
	                manager.deleteBook(id);
	                System.out.println("도서가 삭제되었습니다.");
	                break;
	            }
	        }
	    }
}
