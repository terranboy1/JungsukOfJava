package com.terranboy.java2;

public class Exercise6_1_9_1 {
	
	//���� �ڵ��� ���� ����� �����Ͽ� �����ÿ�.

	public static void change(String str) {
		str += "456";
	}
	
	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println(str);
		change(str);
		System.out.println("After change:"+str);
	}

}
