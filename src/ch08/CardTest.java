package ch08;

public class CardTest {
	public static void main(String[] args) {
		System.out.println("Card.width = " +Card.width);	//class 이름 . 멤버변수
		System.out.println("Card.height = " +Card.height);
		Card c1 = new Card();
		c1.kind = "Spade";
		c1.number = 1;
		Card c2 = new Card();
		c2.kind = "Diamond";
		c2.number = 2;
		Card c3 = new Card();
		c3.kind = "Heart";
		c3.number = 3;
		Card c4 = new Card();
		c4.kind = "Clober";
		c4.number = 4;
		System.out.println("c1은 "+c1.kind+", "+c1.number
				          +", 크기는 " +c1.width+ " x "+c1.height);
		System.out.println("c2는 "+c2.kind+", "+c2.number
						  +", 크기는 " +c2.width+ " x "+c2.height);
		System.out.println("c3는 "+c3.kind+", "+c3.number
						  +", 크기는 " +c3.width+ " x "+c3.height);
		System.out.println("c4는 "+c4.kind+", "+c4.number
						  +", 크기는 " +c4.width+ " x "+c4.height);
		c1.width = 80;
		c1.height = 120;
		System.out.println("======================================");
		System.out.println("c1은 "+c1.kind+", "+c1.number
						  +", 크기는 " +c1.width+ " x "+c1.height);

	}

}
