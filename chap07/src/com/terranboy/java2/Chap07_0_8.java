package com.terranboy.java2;

public class Chap07_0_8 {
	public static void main(String[] args) {
		Point3D3 p3 = new Point3D3();
		// 호출순서 Point3D() -> Point3D(int x, int y, int z) -> Point(int x, int y) -> Object()
		
		System.out.println("p3.x=" + p3.x);
		System.out.println("p3.y=" + p3.y);
		System.out.println("p3.z=" + p3.z);
	}
}

class Point3 {
	int x=10;
	int y=20;
	
	Point3(int x, int y){
		//첫 줄에 다른 생성자를 호출하지 않으면 컴파일러가 요기에 super();를 넣겠지. 그럼 뭐다? Object클래스의 생성자가 호출된다.
		this.x = x;
		this.y = y;
	}
}

class Point3D3 extends Point3 {
	int z = 30;
	
	Point3D3() {
		this(100, 200, 300);
	}
	
	Point3D3(int x, int y, int z){
		super(x, y);  //Point(int x, int y)를 호출.
		this.z = z;
	}
}
