package com.terranboy.java3;

public class Chap06_2_8 {
	
	static int[] arr = new int[10];            //첫번째 실행 - 명시적 초기화
	
	static {                                   //두번째 실행 - 초기화 블럭
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10) + 1;
		}
	}

	public static void main(String[] args) {
		for(int i=0; i<arr.length; i++)
			System.out.println("arr["+i+"] :" + arr[i]);
	}
}

//이처럼 배열이나 예외처리가 필요한 초기화에서는 명시적 초기화만으로 복잡한 초기화 작업을 할 수 없다.
//이런 경우에 추가적으로 클래스 초기화 블럭을 사용하도록 한다.
