package ch11;

public class SmartPhone extends Phone{
	public boolean wifi;
	
	public SmartPhone(String model, String color) {
		super(model, color);
		System.out.println("SmartPhone(String model, String color)is called");
		
	}
	public SmartPhone(String model, String color, boolean wifi) {
		super(model, color);
		this.wifi = wifi;
	}
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태");
	}
	public void internet() {
		System.out.println("인터넷에 연결합니다");
	}

}
