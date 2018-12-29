package com.terranboy.java2;

public class Chap06_1_0 {

	public static void main(String[] args) {
		
		//call by reference.
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x =" + d.x);
	}
	
	//매개변수 타입이 중요하구나. 값인지 주소인지 이것은 평생 기억해야한다.
	static void change(Data d) {
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}

}
