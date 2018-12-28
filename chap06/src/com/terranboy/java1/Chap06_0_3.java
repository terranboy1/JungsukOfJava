package com.terranboy.java1;

public class Chap06_0_3 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println(t1.channel);
		System.out.println(t2.channel);
		
		t2 = t1;   // t4가 원래 참조하고 있던 인스턴스는 가비지컬렉터에 의해 소..멸..
		t2.channel = 7;
		
		System.out.println(t1.channel);
		System.out.println(t2.channel);
	}
}

//이 예제를 보면 알 수 있듯이 참조변수에는 하나의 값(주소)만 저장될 수 있으므로 둘 이상의 참조변수가
//하나의 인스턴스를 참조하는 것은 가능하지만 하나의 참조변수로 여러 개의 인스턴스를 가리키는 것은 불가능.

