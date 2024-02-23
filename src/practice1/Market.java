package practice1;

public class Market {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv t = new Tv();
		Computer com = new Computer();
		Audio a = new Audio();
		System.out.println("현재 가지고 있는 돈은 " + b.money + "만원 입니다"+"\n");
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());

//		b.buy(new Tv());
//		System.out.println("Tv의 가격은 " +t.price + "만원 입니다");
//		System.out.println("현재 남은 돈은 " + b.money + "만원 입니다"+"\n");
//		b.buy(new Tv());
//		System.out.println("Tv의 가격은 " +t.price + "만원 입니다");
//		System.out.println("현재 남은 돈은 " + b.money + "만원 입니다"+"\n");
//		b.buy(new Computer());
//		System.out.println("Computer의 가격은 " +com.price + "만원 입니다");
//		System.out.println("현재 남은 돈은 " + b.money + "만원 입니다"+"\n");
//		b.buy(new Computer());
//		System.out.println("Computer의 가격은 " +com.price + "만원 입니다");
//		System.out.println("현재 남은 돈은 " + b.money + "만원 입니다"+"\n");
//		b.buy(new Audio());
//		System.out.println("Audio의 가격은 " +a.price + "만원 입니다");
//		System.out.println("현재 남은 돈은 " + b.money + "만원 입니다"+"\n");
//		b.buy(new Audio());
//		System.out.println("Audio의 가격은 " +a.price + "만원 입니다"+"\n");
		System.out.println("현재 남은 돈은 " + b.money + "만원 입니다");
		System.out.println("현재 보너스 포인트는 " + b.bonuspoint + " Point 입니다");
		System.out.println();
		b.summery();
		System.out.println("구매하신 물품의 갯수는 " + b.cart.size()+"개 입니다.");
		System.out.println();
		System.out.println("장바구니에는 총 " + b.cart.capacity()+"개 담을수 있습니다.");
	}

}
