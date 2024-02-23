package chEx00;

public class DeckExample {

	public static void main(String[] args) {
		Deck d = new Deck();
		Card c = d.pick();
		System.out.println(c);
		System.out.println();
		d.shuffle();
		c = d.pick(55);
		
		System.out.println("지정된 위치= " + c);
		
	}

}
