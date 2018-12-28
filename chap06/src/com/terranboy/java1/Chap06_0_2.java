package com.terranboy.java1;

public class Chap06_0_2 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel값 :" + t1.channel);
		System.out.println("t2의 channel값 :" + t2.channel);
		
		t1.channel = 7;
		
		System.out.println("t1의 channel값 :" + t1.channel);
		System.out.println("t2의 channel값 :" + t2.channel);
	}
}