package com.terranboy.java2;

public class OverridingWithSuper {

	public static void main(String[] args) {


	}
}

class Point1 {
	int x;
	int y;
	
	String getLocation() {
		return "x :" + x + ", y :"+y;
	}
}


class Point3D1 extends Point1 {
	int z;
	
	String getLocation() {
		return super.getLocation() + "z :" + z;   // 메서드를 오버라이딩할 때 조상의 메서드를 호출해서 내용작성에 사용했다. 관계를 맺어주고 중복을 줄였다.
												  // 이러면 후에 조상메서드의 내용이 변경되어도 변경된 내용이 자손클래스의 메서드에 자동반영이 된다.
	}
}