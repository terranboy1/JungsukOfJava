package com.terranboy.java2;

public class Chap06_1_3_1 {

	public static void main(String[] args) {
		Chap06_1_3_1 r = new Chap06_1_3_1();
		
		int result = r.add(3,5);
		System.out.println(result);
		
		int[] result2 = new int[1];
		r.add(3,5,result2);
		System.out.println(result2[0]);
	}
	
	int add(int a, int b) {
		return a+b;
	}
	
	void add(int a, int b, int[] result) {
		result[0] = a + b;
	}
	
}
