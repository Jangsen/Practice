package ch20.sec01.exam01;

public class Box <T>{
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("hello");
		String str = box.get();
		System.out.println(str);
		
		Box<Integer> box1 = new Box<Integer>();
		box1.set(6);
		int value = box1.get();
		System.out.println(value);
	}
}
