package com.terranboy.java2;

public class asdsaddsa {
	public static void main(String[] args) {
		Math mm = new Math();
		
		System.out.println(mm.divide(3, 0));
	}
}

class Math{
	
	double divide(double x, double y) {
		if(y==0) {
			System.out.println((int)y +"���� ���� �� �����ϴ�.");
			return y;
		}
		return x/y;
	}
}