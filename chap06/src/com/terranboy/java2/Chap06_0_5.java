package com.terranboy.java2;

public class Chap06_0_5 {
	public static void main(String[] args) {
		//������ �޼���
		//--------------------------------------------
		//���� ��ġ�� ���� ������ ����
		// 1) ��������� ������ ������ ������ ��� ��������
		// 2) ������� �� static�� ���� ���� Ŭ��������, ���� ���� ���� �ν��Ͻ�����.   (���������� static���� �� �� ����!)
		//
		// class Variables           --------> Ŭ��������
		// {
		//   int iv;          //�ν��Ͻ�����
		//   static int cv;   //Ŭ��������(static����)
		//
		//   void method()           --------> �޼��念��
		//   {
		//       int lv = 0;  //��������
		//   }
		// }
		
		System.out.println("Card.width = " + Card.width);  //Ŭ���������� ��ü���� ���� ���������� ��� ���� (Ŭ�����̸�.Ŭ��������)
		System.out.println("Card.width = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1 ����: " + c1.kind + "/ c1 ��ȣ : " + c1.number + "/ c1 �ʺ� :" + Card.width + "/ c1 ���� :" + Card.height);
		System.out.println("c1 ����: " + c2.kind + "/ c1 ��ȣ : " + c2.number + "/ c1 �ʺ� :" + Card.width + "/ c1 ���� :" + Card.height);
		
		Card.width = 150;
		Card.height = 450;
		System.out.println();
		
		System.out.println("c1 ����: " + c1.kind + "/ c1 ��ȣ : " + c1.number + "/ c1 �ʺ� :" + Card.width + "/ c1 ���� :" + Card.height);
		System.out.println("c1 ����: " + c2.kind + "/ c1 ��ȣ : " + c2.number + "/ c1 �ʺ� :" + Card.width + "/ c1 ���� :" + Card.height);
		
//		c1.width = 200; ��� ����. �ν��Ͻ��� ����Ű�� ���������ε� Ŭ���������� ���� �� ������ �����ϰŵ�? �ٵ� �̷��� width�� �ν��Ͻ��������� Ŭ������������
//		������ �̷��� �Ⱦ��� �����ϴ°ž�. ����?
	}
}

class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}
