package com.terranboy.java3;

public class Chap06_2_9 {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1�� ��ǰ��ȣ�� " + p1.serialNo);
		System.out.println("p1�� ��ǰ��ȣ�� " + p2.serialNo);
		System.out.println("p1�� ��ǰ��ȣ�� " + p3.serialNo);
		System.out.println("����� ��ǰ�� ���� ���" + Product.count + "�� �Դϴ�.");
	}
}

class Product{
	static int count = 0;  //������ �ν��Ͻ��� ���� ���� . ���� �̰� �ν��Ͻ������� �ع������� �ν��Ͻ� ������ ������ 0�� �Ǿ ���� ������ ���� ����.
	int serialNo;          //�ν��Ͻ� ������ȣ
	
	{
		++count;
		serialNo = count;     // Product�ν��Ͻ��� ������ ������ count�� ���� 1�� �������� serialNo�� �����Ѵ�.
	}
	
	//�ٵ� �̺κ��� �����ڸ� ���� �Ͱ� ȿ��鿡�� ���̸� ������ ����,, �ٸ� ������ ���߰ڴ°�? �̰ɷ� �� ������.
}
