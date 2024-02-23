package practice1;

import java.util.Vector;

public class Buyer {
	int money = 1000;
	int bonuspoint = 0;
	Vector cart = new Vector();

	int i = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액 부족");
			return;
		}
		money -= p.price;
		bonuspoint += p.bonuspoint;
		cart.add(p);
		System.out.println(p + " 상품을 구매하였습니다");
	}

	void summery() {
		int sum = 0;
		String cartList = " ";
		if (cart.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다");
			return;
		}
		for (int i = 0; i < cart.size(); i++) {
			Product p = (Product) cart.get(i);
			sum += p.price;
			cartList += (i == 0) ? "" + p : ", " + p;
		}
		System.out.println("구매하신 물품의 총 금액은 " + sum + "만원 입니다");
		System.out.println("구매하신 물품의 목록은 " + cartList + "입니다");
	}
}
