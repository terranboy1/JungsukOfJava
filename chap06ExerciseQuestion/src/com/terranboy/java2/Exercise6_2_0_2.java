package com.terranboy.java2;

import java.util.Arrays;

public class Exercise6_2_0_2 {
	//다음과 같이 정의된 메서드를 작성하고 테스트하시오.
	//(Math.random()을 사용하는 경우 실행결과와 다를 수 있음.
	//
	//메서드명 : shuffle
	//기능 : 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복해 뒤섞이게 함.
	//반환타입 : int[]
	//매개변수 : int[] arr - 정수값이 담긴 배열
	
	static int[] shuffle(int[] arr) {
		
		if(arr == null || arr.length == 0)  //오홍..유효성검사 생각 못했다 ㅠ 배열이 null이거나 0이면 그대로 반환!
			return arr;
		
		for(int i=0; i<arr.length; i++) {
			int x = (int)(Math.random()*8)+1;
			int tmp = arr[i];
			arr[i] = arr[x];
			arr[x] = tmp;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(Arrays.toString(result));
	}

}
