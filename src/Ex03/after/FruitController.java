package Ex03.after;

import java.util.Arrays;
public class FruitController {
	public static void main(String[] args) {
		Calculator calculator = 
				new Calculator(new FirstCustomerDiscount());
		calculator.calculate(Arrays.asList(
				new Item("Apple",  3000),
				new Item("Banana", 3000),
				new Item("Orange", 2000),
				new Item("Pitch",  4000)));
	}
}


