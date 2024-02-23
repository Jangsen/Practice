package ch12.sec01;

public class App {

	public static void main(String[] args) {
		Fox fox = new Fox();
		Bird sae = new Bird();
		System.out.println("여우는 생간을 "+fox.eat("생간")+"g 먹었다");
		System.out.println("새는 애벌레를 "+sae.eat("애벌레")+"g 먹었다");
	}

}
