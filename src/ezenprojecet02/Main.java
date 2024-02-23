package ezenprojecet02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		All all = new All();
//		Insert in = new Insert();
		Scanner sc = new Scanner(System.in);
		ArrayList<BookEx> bookList = new ArrayList<>();
		boolean flag = false;
		while (!flag) {
          System.out.println("========================================");
          System.out.println("	    도서관리시스템");
          System.out.println("========================================");
          System.out.println("1.도서등록");
          System.out.println("2.도서목록 조회");
          System.out.println("3.도서정보 조회");
          System.out.println("4.도서정보 수정");
          System.out.println("5.도서정보 삭제");
          System.out.println("6.종료");
          System.out.println("========================================");
          System.out.print("메뉴를 선택하세요: ");

          int menu = sc.nextInt();

          switch (menu) {
              case 1:
            	  all.InsertBook();
                  break;
              case 2:
            	  all.selectAll();
                  break;
              case 3:
                  break;
              case 4:
                  break;
              case 5:
                  break;
              case 6:
                  System.out.println("시스템을 종료합니다.");
                  break;
              default:
                  System.out.println("잘못된 메뉴를 선택하셨습니다.");
                  break;
          }
      }
		
		
	}

}
