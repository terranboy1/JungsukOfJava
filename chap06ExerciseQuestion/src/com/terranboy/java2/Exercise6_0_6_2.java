package com.terranboy.java2;

public class Exercise6_0_6_2 {
	// �� �� (x,y)�� (x1,1)���� �Ÿ��� ���Ѵ�.
	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));
	}
	
	
	public static void main(String[] args) {
		System.out.println(getDistance(1,1,2,2));
	}
}
