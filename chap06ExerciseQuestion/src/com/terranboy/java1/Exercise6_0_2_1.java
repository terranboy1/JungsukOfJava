package com.terranboy.java1;

public class Exercise6_0_2_1 {
	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
		
		//SutdaCardŬ������ �ΰ��� �����ڿ� info()�� �߰��ؼ�
		//�������� ���� ����� �򵵷� �Ͻÿ�.
	}
}

class SutdaCard{
	private int num;
	private boolean isKwang;	
	
	SutdaCard(){
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}

	
	String info() {
		return num + (isKwang? "K" : "");
	}
}

//������ 
//3
//1k

