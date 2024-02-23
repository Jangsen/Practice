package ezenprojecet01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class BookManager {
    Map<Integer, Book> books = new HashMap<>();

   public void registerBook(Book book) {
        books.put(book.id, book);
    }

    Collection<Book> getAllBooks() {
        return books.values();
    }

    Book getBookById(int id) {
        return books.get(id);
    }

    public void updateBook(Book book) {
        books.put(book.id, book);
    }

    public void deleteBook(int id) {
        books.remove(id);
    }
}

