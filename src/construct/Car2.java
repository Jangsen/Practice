package construct;

public class Car2 {
	String color;
	String gearType;
	int door;
	
	Car2(){
		this("white","auto",4);
		//Car2(String color, String gearType, int door)를 호출
	}
	Car2(String color){
		this(color, "auto" ,4);
		//Car2(String color, String gearType, int door)를 호출
	}
	
	
	Car2(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

}
//생성자들끼리 호출하는 이유는 코드의 중복을 줄이기 위해
//같은 클래스안에 있는 생성자들끼리 호출할때는 class 이름 대신에 this를 쓴다!!
//호출할때 첫 번째 줄에서만 가능
//두번째 줄에서 호출하면 에러가 발생함. (예시 아래)
//ex = Car(String color){
//     door = 5;
//     this(color, "auto" , 4);
//	   }