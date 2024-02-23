package chEx00;

public class Deck {
	final int Card_NUM = 52;		//카드의 개수
	Card[] cardArr = new Card[Card_NUM];
	
	Deck () {		//Deck 카드를 초기화
		int i = 0; 
		
		for(int k = Card.KIND_MAX; k > 0; k--)
		{
			for(int n = 1; n < Card.NUM_MAX + 1; n++) 
			{
				cardArr[i++] = new Card(k, n+1);
			}
			
		}
		
	}
	Card pick(int index) {		//지정된 위치(index)에 있는 카드를 선택
		return cardArr[index%Card_NUM];
	}
	Card pick() {		//Deck 에서 카드 하나 선택
		int index = (int)(Math.random() * Card_NUM);
		return pick(index);
	}
	void shuffle() {		// 카드를 섞음
		for(int n = 0; n < 1000; n++) 
		{
			int i = (int)(Math.random() * Card_NUM);
			Card temp = cardArr[0];
			cardArr[0] = cardArr[i];
			cardArr[i] = temp;
		}
	}

}
