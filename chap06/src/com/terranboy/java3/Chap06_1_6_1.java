package com.terranboy.java3;

public class Chap06_1_6_1 {
	static long factorial(int n) {
		if (n <= 0 || n > 20)      //��ȿ���˻�1
			return -1;
		if (n <= 1)                //��ȿ���˻�2
			return 1;
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		int n = 21;
		long result = 0;

		for (int i = 1; i <= n; i++) {
			result = factorial(i);

			if (result == -1) {  //��ȫ. �Ű����� ��ȿ���� ���ϰ��� �̿��߱���.
				System.out.printf("��ȿ���� ���� ���Դϴ�.(0<n<=20):%d%n", n);
				break;
			}
			System.out.printf("%2d!=%20d%n", i, result);
		}
	}
}