package com.terranboy.java2;

public class Chap07_0_8 {
	public static void main(String[] args) {
		Point3D3 p3 = new Point3D3();
		// ȣ����� Point3D() -> Point3D(int x, int y, int z) -> Point(int x, int y) -> Object()
		
		System.out.println("p3.x=" + p3.x);
		System.out.println("p3.y=" + p3.y);
		System.out.println("p3.z=" + p3.z);
	}
}

class Point3 {
	int x=10;
	int y=20;
	
	Point3(int x, int y){
		//ù �ٿ� �ٸ� �����ڸ� ȣ������ ������ �����Ϸ��� ��⿡ super();�� �ְ���. �׷� ����? ObjectŬ������ �����ڰ� ȣ��ȴ�.
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
		super(x, y);  //Point(int x, int y)�� ȣ��.
		this.z = z;
	}
}
