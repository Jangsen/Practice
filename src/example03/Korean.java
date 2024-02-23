package example03;

public class Korean {
	//인스턴스 final 필드 선언	
	final String nation = "대한민국";		//final 필드의 멤버변수는 변경 불가능
	final String ssn;				
	
	//인스턴스 필드 선언
	String name;
	
	//생성자 선언
	public Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}

}
