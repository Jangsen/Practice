package ch12.sec01;

public class Buyer {
	int money = 1000;
	int bonuspoint = 0;
	Product[] cart = new Product[10];

	int i = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액 부족");
			return;
		}
		money -= p.price;
		bonuspoint += p.bonuspoint;
		cart[i++] = p;
		System.out.println(p + " 상품을 구매하였습니다");
	}

	void summery() {
		int sum = 0;
		String cartList = " ";
		for (int i = 0; i < cart.length; i++) {
			if (cart[i] == null)		//vector의 int size
				break;
			sum += cart[i].price;
			cartList += cart[i]+ ", ";
		}
		System.out.println("구매하신 물품의 총 금액은 " + sum + "만원 입니다");
		System.out.println("구매하신 물품의 목록은 " + cartList + "입니다");
	}
}
