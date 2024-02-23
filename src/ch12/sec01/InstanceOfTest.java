package ch12.sec01;

public class InstanceOfTest {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			System.out.println("파이어엔진 인스턴스");
		}
		if(fe instanceof Car) {
			System.out.println("카 인스턴스");
		}
		if(fe instanceof Object) {
			System.out.println("오브젝트 인스턴스");
		}
		
	}
	
}
