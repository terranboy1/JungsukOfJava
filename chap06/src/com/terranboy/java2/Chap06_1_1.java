package com.terranboy.java2;

public class Chap06_1_1 {

	public static void main(String[] args) {
		int[] x = {10};
		System.out.println("main() : x =" + x[0]);
		
		change(x);
		System.out.println("After change(x)");
		System.out.println("main() : x = "+x[0]);
	}
	
	static void change(int[] x) {
		x[0] = 1000;
		System.out.println("change() : x = " + x[0]);
	}
	
	
	//�迭�� ��ü�� ���� ���������� ���� �����Ͱ� ����� ������ �����Ѵٴ� ���� �����.
	//�ӽ������� ������ ó���� �� ������ Ŭ������ �����ϴ� �ͺ��� ��ó�� �迭�� �̿��� ���� �ִ�.
}
