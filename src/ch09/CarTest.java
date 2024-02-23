package ch09;

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("blue");
		Car c3 = new Car("red","stick",6);
		System.out.println("c1의 color= "+c1.color+", gearType= "+c1.gearType + ", door= " + c1.door);
		System.out.println("c2의 color= "+c2.color+", gearType= "+c2.gearType + ", door= " + c2.door);
		System.out.println("c3의 color= "+c3.color+", gearType= "+c3.gearType + ", door= " + c3.door);
		c1.printthis();
		c2.printthis();
		c3.printthis();
	}

}
class Car		//생성자
{
	String color;
	String gearType;
	int door;
	public Car() 		//
	{  	
		this("white","auto",4);		//또 다른 생성자를 부를때 this()
	}
	public Car(String color) 
	{  	
		this(color,"auto",4);		
	}
	
	public Car(String color, String gearType, int door) 
	{	
		this.color = color;			//this. 은 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 저장되어있음
		this.gearType = gearType;	// 모든 인스턴스 메서드는 지역변수로 숨겨진 채로 존재. * 인스턴스변수와 지역변수를 구별하기 위해 참조변수 this 사용
		this.door = door;
		}
	public void printthis() {
		System.out.println(this);	//인스턴스 메서드마다 this 키워드가 숨어있음	
	}
}

//		System.out.println(c1.getClass());	//어떤 클래스인지 알려줌