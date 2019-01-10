package com.terranboy.java2;

public class Chap07_0_5 {

	public static void main(String[] args) {
		/*
		super 
		조상 클래스로부터 상속받은 멤버를 자손클래스에서 참조하는 데 사용되는 참조변수.
		멤버변수와 지역변수의 이름이 같을 때 this로 구별했듯이 부모와 자식간의 멤버의 이름이 같을 때 super로 구별할 수 있다.
		this와 super는 근본적인 용도를 따져봤을 때 같은 기능을 하는 셈.
		그러므로 super 역시 this와 마찬가지로 static메서드에서 사용은 불가하고 인스턴스 메서드에서만 사용가능하다.
		*/
		
		Child1 c = new Child1();
		c.method();
	}
}

class Parent1 {
	int x = 10;
}

class Child1 extends Parent1 {
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}
