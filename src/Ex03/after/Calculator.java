package Ex03.after;

import java.util.List;
public class Calculator {
	private final DiscountPolicy discountPolicy;
	public Calculator(DiscountPolicy discountPolicy) {
		this.discountPolicy = discountPolicy;
	}
	public double calculate(List<Item> items) {
		double sum = 0;
		for(Item item : items) {
			sum += discountPolicy.calculateWithDiscountRate(item);
		}
		return sum;
	}
}
