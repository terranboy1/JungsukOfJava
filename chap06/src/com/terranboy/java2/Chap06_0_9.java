package com.terranboy.java2;

public class Chap06_0_9 {

	public static void main(String[] args) {
		
		//�Ű������� Ÿ���� �⺻���� �� �⺻�� ���� ��������� �������̸� �ν��Ͻ��� �ּҰ� ����ȴ�.
		//�޼����� �Ű������� �⺻������ �����ϸ� �ܼ��� ����� ���� ������ 
		//���������� �����ϸ� ���� ����� ���� �ּҸ� �� �� �ֱ� ������ ���� �о���� ���� ���� ���� �����ϴ� ���� �����ϴ�.
		
		//�⺻�� �Ű����� : ������ ���� �б⸸ �� �� �ִ�.(read only) ������. called by value
		//������ �Ű����� : ������ ���� �а� ������ �� �ִ�.(read & write) �ּҺ���. called by reference.
		
		//�׷� ������ �Ű������� �ִ� ����� ��� �ɱ�?~~?~? --> ������ Ÿ�Ա��� ���� �־��ָ� ��. ���⼱ Data d
		
		
		//called by value
		Data d = new Data();
		d.x = 10;
		System.out.println(("main() : x = " + d.x));
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}
