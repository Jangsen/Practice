package example;

public class Car {
	int gas;
	void setGas(int gas) 
	{
		this.gas = gas;
	}
	boolean isLeftGas() 
	{
		if (gas == 0) 
		{
		System.out.println("gas가 없습니다");
		return false;	//false를 리턴하고 메소드 종료
		}
		System.out.println("gas가 있습니다.");
		return true;	//true를 리턴하고 메소드 종료
	}
	void run() 
	{
		while(true)
		{
			if(gas > 0)
			{
				System.out.println("달립니다.(gas잔량:"+ gas + ")" );
				gas -= 1;
			} else {
				System.out.println("가스가 부족합니다.");
				System.out.println("멈춥니다.(gas잔량:"+ gas + ")" );
				return; //메소드 종료
			}
		}
	}
}
