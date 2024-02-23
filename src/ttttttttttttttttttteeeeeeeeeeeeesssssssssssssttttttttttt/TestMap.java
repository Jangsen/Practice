package ttttttttttttttttttteeeeeeeeeeeeesssssssssssssttttttttttt;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	//도서 목록을 저장하는 map 객체를 선언 키는 도서 번호 .값은 도서 정보	
	private Map<Integer, Book> books = new HashMap<>();
	//테스트 맵 클래스 생성자를 정의 여기서 도서 목록을 초기화
	public void registerBook(Book book) {
//		books.put(book.getNum(), book);
	}
	//모든 도서 정보를 출력하는 메소드
	public void getAllBooks() {
		for(Book book : books.values()) {
			System.out.println(book);
		}
	}
	public void getBook(int num) {
		if(books.containsKey(num)) {
			System.out.println(books.get(num));
		}else {
			System.out.println(num);
		}
	}
	//도서 정보를 수정하는 메소드
	
	
}