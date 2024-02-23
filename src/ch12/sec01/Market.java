package ch12.sec01;

public class Market {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv t = new Tv();
		Computer com = new Computer();
		Audio a = new Audio();
		System.out.println("현재 가지고 있는 돈은 " + b.money + "만원 입니다"+"\n");
		b.buy(new Tv());
		System.out.println("Tv의 가격은 " +t.price + "만원 입니다");
		System.out.println("현재 남은 돈은 " + b.money + "만원 입니다"+"\n");
		b.buy(new Tv());
		System.out.println("Tv의 가격은 " +t.price + "만원 입니다");
		System.out.println("현재 남은 돈은 " + b.money + "만원 입니다"+"\n");
		b.buy(new Computer());
		System.out.println("Computer의 가격은 " +com.price + "만원 입니다");
		System.out.println("현재 남은 돈은 " + b.money + "만원 입니다"+"\n");
		b.buy(new Computer());
		System.out.println("Computer의 가격은 " +com.price + "만원 입니다");
		System.out.println("현재 남은 돈은 " + b.money + "만원 입니다"+"\n");
		b.buy(new Audio());
		System.out.println("Audio의 가격은 " +a.price + "만원 입니다");
		System.out.println("현재 남은 돈은 " + b.money + "만원 입니다"+"\n");
		b.buy(new Audio());
		System.out.println("Audio의 가격은 " +a.price + "만원 입니다"+"\n");
		b.summery();
		System.out.println("현재 남은 돈은 " + b.money + "만원 입니다");
		System.out.println("현재 보너스 포인트는 " + b.bonuspoint + "포인트 입니다");
	}

}
