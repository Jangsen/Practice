package Ex03.before;

public class Item {
	private final String name;
	private final int price;
	public Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public boolean isFresh() {
		return true;
	}
}
