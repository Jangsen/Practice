package ch11.sec02;
public class ChildExample {

	public static void main(String[] args) {
		//자식 객체 생성
//		Parent parent = new Child();
//		if(parent instanceof Child) {
//			System.out.println("이 객체는 Child 클래스의 인스턴스");
//		}
//		parent.field1 = "data1";
//		parent.method1();
//		parent.method2();
		Child child = new Child();
		Parent parent = child;
		child.field2 = "data2";
		child.method3();
		
		
		
		
//		부모는 자식이 어떤 것을 확장했는지 알 수 없다.
//		상속이 되긴하지만 private 한 멤버는 
//		같은 클래스에 있는 멤버끼리만 가능하다
//		method 도 마찬가지
		
	}

}
