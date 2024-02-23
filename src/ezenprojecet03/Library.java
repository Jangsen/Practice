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

       //Book book = new Book(1,"1","1","1","1");
       //  list.add(book);

      boolean run = true;
      
      while(run) {
      System.out.println("===============================================");
      System.out.println("도 서 관 리 시 스 템 " );
      System.out.println("===============================================");
      System.out.println("1.도서등록 2.도서목록 조회 3.도서정보 조회 4.도서정보 수정 5.도서목록 삭제");
      System.out.println("선택 : ");
      
      int n = 0;
      n = library.sc.nextInt();
      
      switch(n) {
      case 1:
         System.out.printf("등록하실 도서의 번호 : ");
         int num = library.sc.nextInt();
         System.out.printf("등록하실 도서의 제목 : ");
         String name = library.sc.next();
         System.out.printf("등록하실 저자이름 : ");
         String author = library.sc.next();
         System.out.printf("등록하실 책의 출판사 : ");
         String company = library.sc.next();
         System.out.printf("등록하실 책의 출판일 : ");
         String day = library.sc.next();
         library.list.add(new Book(num,name,author,company,day));
         System.out.println("등록 되었습니다.");
         library.SetBookInfo();
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
         System.out.printf("삭제하실 책의 번호를 입력하세요: ");
         num = library.sc.nextInt();
         for(int i = 0 ; i < library.list.size(); i++) {
            if(num == library.list.size()) {
               library.list.remove(i);
               System.out.println("삭제 되었습니다.");
            
            } else {
               System.out.println("없는 번호 입니다.");
            }
         }
         break;
         }
      }
   }
   
      
   private void  modify(){    
 
      System.out.println("수정하실 책의 번호를 입력하세요.");
      int num =sc.nextInt();
      
      for(int i=0; i<list.size(); i++) {
        if(num==list.get(i).getNum()) {
        Book l1 = list.get(i);
        
       System.out.println("수정후 번호를 입력하세요.");
        int num1 =sc.nextInt();
        System.out.println("수정후 제목을 입력하세요.");
        String name =sc.next();
        System.out.println("수정후 저자를 입력하세요.");
        String author =sc.next();
        System.out.println("수정후 출판사를 입력하세요.");         
        String company  =sc.next();
        System.out.println("수정후 출판일을 입력하세요.");
        String day = sc.next();
        
        list.set(i, (Book) l1);
        System.out.println("수정된 책번호"+num1);
        System.out.println("수정된 제목 ."+name);
        System.out.println("수정된 저자이름."+author);
        System.out.println("수정된 출판사이름."+company);
        System.out.println("수정된 출판일"+day);
         }
         
      }
  } 
   
   private void SetBookInfo()
      {
         for(Book li : list)
         {
            int num = li.num;
            String name = li.name;
            bookInfo.put(num, name);
         }
      }
      
      private String GetBookName(HashMap<Integer, String> bookInfo, int num)
      {
         return bookInfo.get(num);
      }
      
      private List<Book> GetBookData(List<Book> books, String bookName)
      {
         List<Book> li= new ArrayList<>();
         for (Book book : books) {
               if (book.name.equals(bookName)) {
                   li.add(book);
               }
           }
         return li;
      }
      
      private void GetBookInfo()
      {
         System.out.println("조회 하실 도서 번호를 입력하세요");
         int num = sc.nextInt();
         String bookName = GetBookName(bookInfo, num);
         if(bookName != null)
         {         
            List<Book> book = GetBookData(list, bookName);
            for(Book li : book)
            {
               System.out.println("선택하신 책 정보");
               System.out.println("1.책 이름 : " + li.getName());
               System.out.println("2.지은이 : " + li.getAuthor());
               System.out.println("3.출판사 : " + li.getCompany());
               System.out.println("4.출판일 : " + li.getDay());
               System.out.println("5.책번호 : " + li.getNum());
            }
         }else System.out.println("조회하신 책의 등록번호가 존재하지않습니다.");
      }
      
      
      
      public void selectAll() {
         while (true) { 
              System.out.println("보유 도서량: " + list.size());
            for(int i = 0; i < list.size(); i++) {               
               System.out.println("===============전체 책 목록==============");
               System.out.println("도서번호 : " + list.get(i).getNum());
               System.out.println("도서제목: " + list.get(i).getNum());
               System.out.println("도서저자: " + list.get(i).getAuthor());
               System.out.println("출판사: " + list.get(i).getCompany());
               System.out.println("출판일: " + list.get(i).getDay());
               System.out.println("=======================================\n");
            }
               break;
         }
 }
}