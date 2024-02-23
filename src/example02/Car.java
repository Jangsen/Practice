package example02;

public class Car {
	String model;
	int speed;		
	
	Car(String model) 
	{
		this.model = model; //매개변수를 필드에 대입(this 생략불가)
	}
	void setspeed(int speed) 
	{
		this.speed = speed; //매개변수를 필드에 대입(this 생략불가)
	}
	void run() 
	{
		this.setspeed(100);
		System.out.println(this.model + "가 달립니다.(시속:" 
						  + this.speed + "km/h");
	}

}
//지역변수와 멤버변수 구분하기
//가독성 좋음