package com.terranboy.java2;

public class Chap07_1_2 {

	public static void main(String[] args) {
		
		
		/*
		 ������(modifier) - Ŭ����, ���� �Ǵ� �޼��� ����ο� �Բ� ���Ǿ� �ΰ��� �ǹ� �ο�.
		                                  �����δ� ���� ������ / �� �� ������
		                                  
		 ���������� : public, protected, default, private
		 ��          �� : static, final, abstract, native, transient, synchronized, volatile, strictfp
		 
		 �����ڴ� Ŭ������ ��������� �޼��忡 �ַ� ���Ǹ�, �ϳ��� ��� ���� ���� �����ڸ� ������ ����ϴ� ���� ����.
		 ��, ���������ڴ� �� ���� �ϳ����� ��� ����. public private �̷��� �ȵȴ� �����̿�~~
		 
		 �� �� ������1. static
		 ��� �ν��Ͻ��� ���� �����ϸ�? ---> static�� ���Խô�.
		 �ν��Ͻ� �������� ����ϸ� static�� ���̽ÿ�.
		 �ν��Ͻ� �޼���� static�޼����� ���̰� ���� ������? ---> �޼��� ������ �ν��Ͻ� ����� ����ϴ°� ���ο� ����.
		 
		 class StaticTest {
		 	static int width = 200;   //Ŭ��������
		 	static int height = 120; //Ŭ��������
		 	
		 	static {  //Ŭ���� �ʱ�ȭ��
		 		// static������ ������ �ʱ�ȭ ����
		 	}
		 	
		 	static int max(int a, int b) { //Ŭ���� �޼���
		 		return a > b ? a : b;
		 	}
		 	
		 �� �� ������2. final
		 ������ ����ϸ� ���� ������ �� ���� ����� ��.
		 �������̵��� ���ϰ� �ڽ��� �ڼ�Ŭ������ ������ �� ���Եȴ�.
		 Ŭ����, �޼���, �������, ���������� ��� ����.
		 
		 final Ŭ���� = ����, Ȯ���� �Ұ����� Ŭ����. Ÿ Ŭ������ ������ �� �� ����.
		 final �޼��� = ����Ұ� �޼���. �������̵� �Ұ�.
		 final ������� = �� ���� �Ұ�
		 final �������� = �� ���� �Ұ�
		 
		 final class FinalTest {  //����, Ȯ���� �Ұ����� Ŭ����. Ÿ Ŭ������ ������ �� �� ����.
		 	final int MAX_SIZE = 10;  //������� �� ���� �Ұ�
		 	
		 	final void getMaxSize() {    //����Ұ� �޼���. �������̵� �Ұ�.
		 		final int LV = MAX_SIZE;  //�������� �� ���� �Ұ�
		 		return MAX_SIZE;
		 	}
		 }	
		 	
		 final�� ���� ������ ����̹Ƿ� �Ϲ������� ����� �ʱ�ȭ�� ���ÿ� ������!
		 �ν��Ͻ������� ��� �����ڿ��� �ʱ�ȭ �ǵ��� �� �� �ִ�!
		 Ŭ���� �� �Ű������� ���� �����ڸ� ������ �ν��Ͻ��� ������ final�� ���� ��������� �ʱ�ȭ�ϴ� �� �ʿ��� ����
		 �������� �Ű������κ��� �����޴� ��.
		 �� ����� Ȱ���ϸ� �� �ν��Ͻ����� final�� ���� ��������� �ٸ� ���� ���� �� �� �ִ�.
		 (���� �̰� �ȵǸ� final ���� �ν��Ͻ� ������ staticó�� �� ���� ���� �����߸� ���� ��)
		 ȿ���� ���� ��� ������ ����.
		 ī���� ���, �� ī�帶�� �ٸ� ������ ���ڸ� ������, �ϴ� ī�尡 �����Ǹ� ī�� ���� ����Ǹ� �ȵȴ�.
		 52���� ī�� �߿��� �ϳ��� �߸� �ٲ㵵 ���� ī�尡 2���� �ǹ����� ����.
		 �׷��� ī�� ���� �ٲٱ� ���ٴ� ī���� ������ �ٲٴ� ���� �� ������ ����̴�.		 	
		 */
		
		Card c = new Card("HEART", 10);
//		c.NUMBER = 5;     //����. ��� ���� ������ �� ����.
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);
		System.out.println("------------------------------------");
		
		Card c2 = new Card();
		System.out.println(c2.KIND);
		System.out.println(c2.NUMBER);
		System.out.println(c2);
		
		
		
	}
}

class Card {
	final int NUMBER;       //������� ����� �Բ� �ʱ�ȭ���� �ʰ�
	final String KIND;      //�����ڿ��� �� �ѹ��� �ʱ�ȭ�� �� �ִ�.
	final int width = 100;
	final int height = 250;
	
	Card(String kind, int num){   //�Ű������� �Ѱܹ��� ������ KIND�� NUMBER �ʱ�ȭ.
		KIND = kind;
		NUMBER =  num;
	}
	
	Card() {
		this("HEART", 1);
	}
	
	public String toString() {
		return KIND +" " + NUMBER;
	}	
}
