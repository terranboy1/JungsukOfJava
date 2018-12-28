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
	
	
	//배열도 객체와 같이 참조변수를 통해 데이터가 저장된 공간에 접근한다는 것을 배웠지.
	//임시적으로 간단히 처리할 땐 별도의 클래스를 선언하는 것보다 이처럼 배열을 이용할 수도 있다.
}
