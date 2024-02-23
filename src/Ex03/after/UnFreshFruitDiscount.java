package Ex03.after;

public class UnFreshFruitDiscount implements DiscountPolicy {
	@Override
	public double calculateWithDiscountRate(Item item) {
		return item.getPrice()* 0.8;
	}
}

