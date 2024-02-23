package ch00.sec00;

public class ArrayEx001 {

	public static void main(String[] args) {
		Apple a1 = new Apple();	//a1 = 레퍼런스 (주소)
		Apple a3 = new Apple();
		Apple a2 = a1;
		a3 = a1;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		a1.name = "아오리";
		a1.price = 20000;
		a1.num = 30;
		
	}

}
class Apple{
	String name;
	int price;
	int num;
}