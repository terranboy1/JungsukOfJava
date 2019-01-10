package com.terranboy.java1;

public class Chap07_0_3 {

	public static void main(String[] args) {
		Deck d = new Deck(); //카드 한 벌(Deck)을 만든다.
		Card c = d.pick(0);  //섞기 전에 제일 위의 카드를 뽑는다.
		System.out.println(c);  // System.out.println(c.toString()); 과 같다.
		
		d.shuffle();           //카드를 섞는다.
		c = d.pick(0);         //섞은 후에 제일 위의 카드를 뽑는다.
		System.out.println(c);
		c = d.pick();
		System.out.println(c);
		Card c2 = d.pick(55);
		System.out.println(c2);
		
	}
}

class Deck {
	final int CARD_NUM = 52;  //카드 갯수.
	Card[] cardArr = new Card[CARD_NUM]; //포함관계다~! Card객체 배열을 포함. 이러면 배열공간만 생성되고 값은 안들어가 있음.
	
	Deck() {
		int i=0;
		
		for(int k=Card.KIND_MAX; k>0; k--)
			for(int n=0; n<Card.NUM_MAX; n++)
				cardArr[i++] = new Card(k, n+1);
	}
	
	Card pick(int index) {       //지정된 index에 있는 카드 하나를 꺼내서 반환
		return cardArr[index%CARD_NUM];
	}
	
	Card pick() {  //이거 지금 안 쓰이고 있는거 같은디?~?
		int index = (int)(Math.random() * CARD_NUM);
		return pick(index);
	}
	
	void shuffle() {
		for(int i=0; i<cardArr.length; i++) {
			int r = (int)(Math.random() * CARD_NUM);
			
			Card temp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = temp;
		}
	}
}
	
class Card{
	static final int KIND_MAX = 4;  //카드 무늬 수
	static final int NUM_MAX = 13;  //무늬별 카드 수
		
	//kind를 숫자로 나타냈군.
	static final int SPADE   = 4;
	static final int DIAMOND = 3;
	static final int HEART   = 2;
	static final int CLOVER  = 1;
	int kind;
	int number;
		
	//이것도 안쓰이고있어...
	Card() {
		this(SPADE, 1);
	}
		
	Card(int kind, int number){
		this.kind = kind;
		this.number = number;
	}
		
	public String toString() {
		String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
		String numbers = "0123456789XJQK"; //숫자 10은 X로 표현
			
		return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
	}
}

