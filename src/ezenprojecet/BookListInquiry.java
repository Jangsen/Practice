package ezenprojecet;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import ezenprojecet01.Book;

public class BookListInquiry{
	static Map<Integer, Book> books = new HashMap<>();
	static Collection<Book> AllList(){
		try {
			return books.values();
		} catch (Exception e) {
		}
		return null;
	}
		
}
