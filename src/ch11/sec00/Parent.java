package ch11.sec00;

	public class Parent {
		int x = 10;
}
//super – this 와 같음. 조상의 멤버와 자신의 멤버를 구별하는 데 사용.
//ㄴ 메소드가 속해있는 클래스의 부모를 가리킴.
//모든 인스턴스 메서드에 지역변수로 숨겨진 채로 존재
//this – 인스턴스 자신을 가리키는 참조변수. 인스턴스의 주소가 저장되어있음

	
//super() 	
//- 자손클래스의 인스턴스를 생성하면, 자손의 멤버와 조상의 멤버가 합쳐진
//    하나의 인스턴스가 생성된다.
//- 조상의 멤버들도 초기화되어야 하기 때문에 자손의 생성자의 첫 문장에서
//   조상의 생성자를 호출해야 한다.
