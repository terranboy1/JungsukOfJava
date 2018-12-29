package com.terranboy.java3;

public class Chap06_1_6_2 {
	static long factorial(int n) {
		if (n <= 0 || n > 20) // 유효성검사1
			return -1;
		if (n <= 1) // 유효성검사2
			return 1;
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		// 유효성 검사 할려면 이래 해야지. 내가 변형해봄.

		int n = -2;
		long result = 0;

		result = factorial(n);

		if (result == -1) { // 오홍. 매개변수 유효성의 리턴값을 이용했구나.
			System.out.printf("유효하지 않은 값입니다.(0<n<=20):%d%n", n);
		} else {
			System.out.printf("%2d!=%20d%n", n, result);
		}
	}
}