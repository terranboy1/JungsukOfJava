package com.terranboy.java3;

public class Chap06_1_6_1 {
	static long factorial(int n) {
		if (n <= 0 || n > 20)      //유효성검사1
			return -1;
		if (n <= 1)                //유효성검사2
			return 1;
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		int n = 21;
		long result = 0;

		for (int i = 1; i <= n; i++) {
			result = factorial(i);

			if (result == -1) {  //오홍. 매개변수 유효성의 리턴값을 이용했구나.
				System.out.printf("유효하지 않은 값입니다.(0<n<=20):%d%n", n);
				break;
			}
			System.out.printf("%2d!=%20d%n", i, result);
		}
	}
}