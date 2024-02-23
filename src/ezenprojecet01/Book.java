package ezenprojecet01;

public class Book {
	    int id;
	    String title;
	    String author;
	    String publisher;
	    String publicationDate;
		public Book(int id, String title, String author, String publisher, String publicationDate) {
			this.id = id;
			this.title = title;
			this.author = author;
			this.publisher = publisher;
			this.publicationDate = publicationDate;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getPublisher() {
			return publisher;
		}
		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}
		public String getPublicationDate() {
			return publicationDate;
		}
		public void setPublicationDate(String publicationDate) {
			this.publicationDate = publicationDate;
		}
	
}
