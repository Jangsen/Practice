package ttttttttttttttttttteeeeeeeeeeeeesssssssssssssttttttttttt;


public class Book{
	int num;		//번호
	String name; 	//책이름
	String author;	//저자
	String company;	//출판사
	String day;		//출판일
	public Book(int num, String name, String author, String company, String day) {
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
