package com.terranboy.java2;

public class Overriding {
	/*
    	오버라이딩이란? 조상클래스로부터 상속받은 메서드의 내용을 변경하는 것.
	 */
}

class Point {
	int x;
	int y;
	
	String getLocation() {
		return "x :" + x + ", y :"+ y;
	}
}

class Point3D extends Point {
	int z;
	
	String getLocation() {
		return "x :" + x + ", y :" + y + ", z :" + z;
	}
}

/*
 	오버라이딩은 메서드의 내용만 새로 작성하는 것이므로 메서드 선언부는 조상의 것과 일치해야 한다.
 	즉, 조상클래스의 메서드와 오버라이딩하는 자손클래스의 메서드는
 	1. 이름이 같고
 	2. 매개변수가 같고
 	3. 반환타입이 같아야 한다.
 	(선언부는 같고 구현부만 다르게 할 수 있다는 의군)
 	
 	기타 조건
 	1. 접근제어자는 조상 클래스의 메서드보다 넓어야 한다.
 	2. 조상 클래스의 메서드보다 많은 수의 예외를 선언할 수 없다.(이건 좀 눈여겨봐야겠는데. 얼른 느낌이 안온다.)
 	3. 인스턴스메서드를 static메서드로, 혹은 static메서드를 인스턴스메서드로 변경할 수 없다. 
 	
 	2번을 보도록 할까?
 	class Parent {
 		void parentMethod() throws IOException, SQLException {}
 	}
 	class Child extends Parent {
 		void parentMethod9) throws IOException {}  // O 조상클래스의 메서드보다 예외가 적게 선언되어 있다.(근데 이 예외가 Exception면 안됨. 이건 갯수를 떠나서 모든 예외들의 조상이니까) 
 	}
 
 
 
 */