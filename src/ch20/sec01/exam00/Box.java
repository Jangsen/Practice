package ch20.sec01.exam00;

public class Box {
	private Object object;
	public void set(Object object) {
		this.object = object;
	}
	public Object get() {
		return object;
	}
	public static void main(String[] args) {
		Box box = new Box();
		box.set("hello");	
		//ㄴ String 타입을 Object 타입으로 자동 타입 변환해서 저장
		String str = (String)box.get();
		//ㄴ Object 타입을 String 타입으로 강제 타입 변환해서 얻음
		System.out.println(str);
	}
	//Object 타입 사용 -> 빈번한 타입 변환 발생 -> 프로그램 성능 저하

}
