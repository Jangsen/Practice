package realPJT2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BookList {
	// Field
	private Scanner sc = new Scanner(System.in);
	private Connection conn;

	// Constructor
	public BookList() {
		try {
			// JDBC Driver 등록
			Class.forName("oracle.jdbc.OracleDriver");

			// 연결하기
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe", 
					"scott", 
					"tiger"
					);
			
		} catch (Exception e) {
			e.printStackTrace();
			exit();
		}
	}

	// Method
	public void list() {
		// 타이틀 및 컬럼명 출력
		System.out.println();
		System.out.println("======================================================");
		System.out.println("==================== 도서관리 시스템 =====================");
		System.out.printf("%-6s%-12s%-12s%-16s%-12s%-12s%-40s\n", "no", "bname", "bauthor", "bcompany", "day", "bwriter", "bdate ");
		
		//Books 테이블에서 게시물 정보를 가져와서 출력하기
		try {
			String sql = "" + "SELECT bno, bname, bauthor, bcompany, bday, bwriter, bdate " + 
							  "FROM BOOKS " + 
							  "ORDER BY bno DESC";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Book books = new Book();
				books.setBno(rs.getInt("bno"));
				books.setBname(rs.getString("bname"));
				books.setBauthor(rs.getString("bauthor"));
				books.setBcompany(rs.getString("bcompany"));
				books.setBday(rs.getString("bday"));
				books.setBwriter(rs.getString("bwriter"));
				books.setBdate(rs.getDate("bdate"));
				System.out.printf("%-6s%-12s%-12s%-12s%-12s%-12s%-40s\n", 
						books.getBno(), 
						books.getBname(), 
						books.getBauthor(),
						books.getBcompany(), 
						books.getBday(), 
						books.getBwriter(), 
						books.getBdate());
			}
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit();
		}
		
		//메인 메뉴 출력
		main();
	}

	public void main() {
		System.out.println();
		System.out.println("============================================================");
		System.out.println("1.도서등록 2.도서정보 조회 3.도서정보 수정 4.도서 삭제 5.전체 삭제 6.종료");
		System.out.println("선택 : ");
		System.out.println();
		String menu = sc.next();
		System.out.println();

		switch (menu) {
		case "1": create(); break;
		case "2": read(); break;
		case "3": update(); break;
		case "4": delete(); break;
		case "5": clear(); break;
		case "6": exit(); break;
		}
	}

	public void create() {
		//입력 받기
		Book books = new Book();
		System.out.println("[새로운 도서 추가]");
		
		System.out.println("작성자: ");
		books.setBwriter(sc.next());
		System.out.println("도서 제목: ");
		books.setBname(sc.next());
		System.out.println("도서 저자: ");
		books.setBauthor(sc.next());
		System.out.println("출판사: ");
		books.setBcompany(sc.next());
		System.out.println("출판일: ");
		books.setBday(sc.next());
		
		//보조 메뉴 출력
		System.out.println("--------------------------------------------");
		System.out.println("보조 메뉴: 등록 | 취소");
		System.out.println("등록하시려면 'y' , 취소하시려면 'n' 을 입력해주세요.");
		System.out.println("메뉴 선택: ");
		String menu = sc.next();
		if(menu.equals("y")) {
			//book 테이블에 게시물 정보 저장
			try {
				String sql = "" +
						"INSERT INTO books (bno, bname, bauthor, bcompany, bday, bwriter, bdate) " +
						"VALUES (SEQ_BNO.NEXTVAL, ?, ?, ?, ?, ?, SYSDATE)";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, books.getBname());
				pstmt.setString(2, books.getBauthor());
				pstmt.setString(3, books.getBcompany());
				pstmt.setString(4, books.getBday());
				pstmt.setString(5, books.getBwriter());
				pstmt.executeUpdate();
				pstmt.close();
			} catch(Exception e) {
				e.printStackTrace();
				exit();
			}
		}
		//게시물 목록 출력
		list();
	}

	public void read() {
		//입력 받기
		System.out.println("[게시물 읽기]");
		System.out.println("bno: ");
		int bno = Integer.parseInt(sc.next());
		
		//books 테이블에서 해당 게시물을 가져와 출력
		try {
			String sql = "" +
					"SELECT bno, bname, bauthor, bcompany, bday, bwriter, bdate " +
					"FROM Books " +
					"WHERE bno = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				Book books = new Book();
				books.setBno(rs.getInt("bno"));
				books.setBname(rs.getString("bname"));
				books.setBauthor(rs.getString("bauthor"));
				books.setBcompany(rs.getString("bcompany"));
				books.setBday(rs.getString("bday"));
				books.setBwriter(rs.getString("bwriter"));
				books.setBdate(rs.getDate("bdate"));
				System.out.println("==================");
				System.out.println("작성자: " + books.getBwriter());
				System.out.println("도서 번호: " + books.getBno());
				System.out.println("도서 제목: " + books.getBname());
				System.out.println("도서 저자: " + books.getBauthor());
				System.out.println("도서 출판사: " + books.getBcompany());
				System.out.println("도서 출판일: " + books.getBday());
				System.out.println("날짜: " + books.getBdate());
				System.out.println("===================");
			}
			rs.close();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			exit();
		}
		list();
	}

	public void update() {
	    Book books = new Book();
	    
	    // 수정할 도서 번호 입력 받기
	    System.out.println("[도서 수정]");
	    System.out.println("수정할 도서의 번호를 입력하세요: ");
	    int bno = Integer.parseInt(sc.next());
	    
	    // 수정 내용 입력 받기
	    System.out.println("[수정 내용 입력]");
	    System.out.println("도서 제목: ");
	    books.setBname(sc.next());
	    System.out.println("도서 저자: ");
	    books.setBauthor(sc.next());
	    System.out.println("출판사: ");
	    books.setBcompany(sc.next());
	    System.out.println("출판일: ");
	    books.setBday(sc.next());
	    System.out.println("작성자: ");
	    books.setBwriter(sc.next());
	    
	    // 보조 메뉴 출력
	    System.out.println("==================");
	    System.out.println("보조 메뉴: 수정 | 취소");
	    System.out.println("수정하시려면 'y' , 취소하시려면 'n' 을 입력해주세요.");
	    System.out.println("메뉴 선택");
	    String menu = sc.next();
	    
	    if (menu.equals("y")) { // 수정을 적용할 경우에만 실행
	        try {
	            String sql = "UPDATE books SET bname=?, bauthor=?, bcompany=?, bday=?, bwriter=? " +
	                         "WHERE bno=?";
	            PreparedStatement pstmt = conn.prepareStatement(sql);
	            pstmt.setString(1, books.getBname());
	            pstmt.setString(2, books.getBauthor());
	            pstmt.setString(3, books.getBcompany());
	            pstmt.setString(4, books.getBday());
	            pstmt.setString(5, books.getBwriter());
	            pstmt.setInt(6, bno); 
	            
	            int rowsUpdated = pstmt.executeUpdate(); // SQL 실행 및 수정된 행 수 반환
	            
	            System.out.println(rowsUpdated + "개의 행이 수정되었습니다.");
	            
	            pstmt.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	            exit();
	        }
	    } else if (menu.equals("n")) {
	        System.out.println("수정이 취소되었습니다.");
	    }
	    
	    // 게시글 목록 출력
	    list();
	}

	public void delete() {
		Book books = new Book();
		System.out.println("[도서 삭제]");
		System.out.println("삭제하실 도서 번호를 입력해주세요.");
		System.out.println("bno: ");
		books.setBno(sc.nextInt());
		System.out.println("========================");
		System.out.println("보조 메뉴: 삭제 | 취소");
		System.out.println("삭제하시려면 'y' , 취소하시려면 'n' 을 입력해주세요.");
		String menu = sc.next();
		if(menu.equals("y")) {
			//books 테이블에서 게시물 정보 삭제
			try {
				String sql = "DELETE FROM books WHERE bno=?";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, books.getBno());
				pstmt.executeUpdate();
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
				exit();
			}
		} else if (menu.equals("n")) {
			System.out.println("삭제가 취소되었습니다.");
		}
		list();
	}
	public void clear() {
		System.out.println("[게시글 전체 삭제]");
		System.out.println("===============================");
		System.out.println("보조 메뉴: 전체 삭제 | 취소");
		System.out.println("전체 삭제를 하시려면 'y' , 취소하시려면 'n' 을 입력해주세요.");
		String menu = sc.next();
		if(menu.equals("y")) {
			try {
				String url = "TRUNCATE TABLE books";
				PreparedStatement pstmt = conn.prepareStatement(url);
				pstmt.executeUpdate();
				pstmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
				exit();
			}
		}else if(menu.equals("n")) {
			System.out.println("취소되었습니다.");
		}
		list();
	}

	public void exit() {
		if(conn != null) {
			try {
				conn.close();
			}catch(SQLException e) {
				
			}
		}
		System.out.println("게시판 종료");
		System.exit(0);
	}

	public static void main(String[] args) {
		BookList books = new BookList();
		books.list();
	}

}
