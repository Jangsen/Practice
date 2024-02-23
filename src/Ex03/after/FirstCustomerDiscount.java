package Ex03.after;

public class FirstCustomerDiscount implements DiscountPolicy {
	@Override
	public double calculateWithDiscountRate(Item item) {
		return item.getPrice()* 0.9;
	}
}


