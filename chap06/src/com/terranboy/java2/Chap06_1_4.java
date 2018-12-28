package com.terranboy.java2;

public class Chap06_1_4 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x=10;
		
		Data d2 = copy(d);
		System.out.println("d.x ="+d.x);
		System.out.println("d2.x="+d2.x);
	}
	
	static Data copy(Data d) {
		Data tmp = new Data();
		tmp.x = d.x;  
		
		return tmp;    //이렇게 새로운 객체의 주소를 반환해줘야 참조변수로 그 주소를 가리키게 된다.
	}
}

//'반환타입이 참조형'이라는 것은 메서드가 '객체의 주소'를 반환한다는 것을 의미한다.
