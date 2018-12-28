package com.terranboy.java2;

public class Chap06_0_9 {

	public static void main(String[] args) {
		
		//매개변수의 타입이 기본형일 땐 기본형 값이 복사되지만 참조형이면 인스턴스의 주소가 복사된다.
		//메서드의 매개변수를 기본형으로 선언하면 단순히 저장된 값만 얻지만 
		//참조형으로 선언하면 값이 저장된 곳의 주소를 알 수 있기 때문에 값을 읽어오는 것은 물론 값을 변경하는 것이 가능하다.
		
		//기본형 매개변수 : 변수의 값을 읽기만 할 수 있다.(read only) 값복사. called by value
		//참조형 매개변수 : 변수의 값을 읽고 변경할 수 있다.(read & write) 주소복사. called by reference.
		
		//그럼 참조형 매개변수를 넣는 방법은 어떻게 될까?~~?~? --> 데이터 타입까지 같이 넣어주면 됨. 여기선 Data d
		
		
		//called by value
		Data d = new Data();
		d.x = 10;
		System.out.println(("main() : x = " + d.x));
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}
