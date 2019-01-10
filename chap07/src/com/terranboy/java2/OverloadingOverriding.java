package com.terranboy.java2;

public class OverloadingOverriding {

	public static void main(String[] args) {	
		/*
		  오버로딩vs오버라이딩
		  
		  오버로딩 : 기존에 없는 새로운 메서드 추가(new)
		  오버라이딩 : 상속받은 메서드의 내용 변경(change, modify) 
		 */
	}
}

class Parent {
	void parentMethod() {}
}

class Child extends Parent {
	void parentMethod() {} //오버라이딩
	void parentMethod(int i) {} //오버로딩
	
	void childMethod() {}
	void childMethod(int i) {} //오버로딩
//	void childMethod() {}   에러. 중복정의
}