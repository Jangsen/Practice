package example;

public class CarExample {

	public static void main(String[] args) {
	//Car 객체 생성
	Car myCar = new Car();
	
	//리턴 값이 없는 setGas() 메소드 호출
	myCar.setGas(16);
	
	//isLeftGas() 메소드를 호출해서 받은 리턴값이 true
	if(myCar.isLeftGas()) 
	{
		System.out.println("출발합니다.");
		
		//리턴값이 없는 run() 메소드 호출
		myCar.run();
	}
	
		System.out.println("gas를 주입하세요.");
	}

}
