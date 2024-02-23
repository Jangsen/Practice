package chEx00;

public class Card {
	//필드 선언
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;
	static final int SPADE = 1;
	static final int DIAMOND = 2;
	static final int HEART = 3;
	static final int CLOVER = 4;
	
	int kind;
	int number;
	
	//생성자 선언
	public Card() {
		this(SPADE,1);
	}

	public Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	public String toString() {
		String[] kinds = {"","SPADE","DIAMOND","HEART","CLOVER"};
		String numbers = "0A23456789XJQK";
		return "kind: " + kinds[this.kind] +"\nnumber: " + numbers.charAt(this.number);
	}
}
