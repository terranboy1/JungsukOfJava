package com.terranboy.java2;

public class Chap07_0_5 {

	public static void main(String[] args) {
		/*
		super 
		���� Ŭ�����κ��� ��ӹ��� ����� �ڼ�Ŭ�������� �����ϴ� �� ���Ǵ� ��������.
		��������� ���������� �̸��� ���� �� this�� �����ߵ��� �θ�� �ڽİ��� ����� �̸��� ���� �� super�� ������ �� �ִ�.
		this�� super�� �ٺ����� �뵵�� �������� �� ���� ����� �ϴ� ��.
		�׷��Ƿ� super ���� this�� ���������� static�޼��忡�� ����� �Ұ��ϰ� �ν��Ͻ� �޼��忡���� ��밡���ϴ�.
		*/
		
		Child1 c = new Child1();
		c.method();
	}
}

class Parent1 {
	int x = 10;
}

class Child1 extends Parent1 {
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}
