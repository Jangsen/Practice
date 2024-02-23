package ch12.sec01;

public class Product {
	int price;
	int bonuspoint;
	public Product(int price) {
		super();
		this.price = price;
		this.bonuspoint = (int)(price * 0.1);
	}
	

}

