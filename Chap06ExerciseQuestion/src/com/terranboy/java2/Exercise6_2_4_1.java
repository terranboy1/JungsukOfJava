package com.terranboy.java2;

public class Exercise6_2_4_1 {
	//������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
	//�޼���� : abs
	//       ��� : �־��� ���� ���밪 ��ȯ
	//��ȯŸ�� : int
	//�Ű����� : int value
	
	static int abs(int value) {
		return value>=0 ? value : -value;
	}

	public static void main(String[] args) {	
		int value = 5;
		System.out.println(value+"�� ���밪:"+abs(value));
		value = -10;
		System.out.println(value+"�� ���밪:"+abs(value));
	}

}
