package com.terranboy.java2;

public class Exercise6_0_8_1 {

	public static void main(String[] args) {
		PlayingCard card = new PlayingCard(1,1);
	}
}

//������ �ڵ忡 ���ǵ� �������� �������� �����ؼ� �����ÿ�.,

class PlayingCard{
	int kind;
	int num;
	
	static int width;
	static int height;
	
	PlayingCard(int k, int n){
		kind = k;
		num = n;
	}
}

//Ŭ�������� : width, height
//�ν��Ͻ����� : kind, num
//�������� : k, n, card, args