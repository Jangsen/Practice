package ezenprojecet03;

public class Book {
	private int num;		//번호
	private String name; 	//책이름
	private String author;	//저자
	private String company;	//출판사
	private String day;		//출판일
	
	public Book(int num,String name, String author, String company, String day) {
		this.num = num;
		this.name = name;
		this.author = author;
		this.company = company;
		this.day = day;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}

}
