package com.terranboy.java2;

public class Chap06_1_3_2 {

	public static void main(String[] args) {
		
		//�ڹ������� 255p�� ���� Ŭ���� ���� �޼��峢���� ���������� ������� �ʰ� ȣ�Ⱑ���ϴٴ� �� �� ���� �����ΰ�?
//		Chap06_1_3_1 r = new Chap06_1_3_1();
//		
//		int result = add(3,5);          //���� Ŭ���� �� �޼���鳢��(���θ޼��� + add�޼���) �̷��� ȣ���� �ȵǳ���.
//		System.out.println(result);
//		
//		int[] result2 = {0};
//		add(3,5,result2);
//		System.out.println(result2[0]);
	}
	
	int add(int a, int b) {
		return a+b;
	}
	
	void add(int a, int b, int[] result) {
		result[0] = a + b;
	}
	
}
