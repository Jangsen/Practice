package ch10;

public class InitBlockTest02 {
	
	{
		System.out.println("초기화 블럭 수행됨!! { }");
	}
	// 위는 초기화 블럭	
	
	static
	{
		System.out.println("static 블럭 수행됨!! static{ }");
	}
	// static 블럭 = 클래스가 로딩되면서 수행
	public InitBlockTest02() 
	{
		System.out.println("생성자 수행됨!!");
	}
	// 위는 디폴트 생성자
	
	//초기화 블럭이 수행되고 생성자가 수행됨
	public static void main(String[] args) {
		System.out.println("InitBlockTest2 bt=");
		InitBlockTest02 bt = new InitBlockTest02();
		
		}
	
}
/*	1. static 블럭 수행됨
 * 	2. 초기화 블럭 수행됨
 * 	3. 생성자 수행됨
 */

