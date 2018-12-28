package com.terranboy.java2;

public class Chap06_1_3_2 {

	public static void main(String[] args) {
		
		//자바의정석 255p에 같은 클래스 내의 메서드끼리는 참조변수를 사용하지 않고도 호출가능하다는 건 이 경우는 제외인가?
//		Chap06_1_3_1 r = new Chap06_1_3_1();
//		
//		int result = add(3,5);          //같은 클래스 내 메서드들끼리(메인메서드 + add메서드) 이렇겐 호출이 안되나봄.
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
