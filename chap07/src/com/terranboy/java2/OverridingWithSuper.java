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
		return super.getLocation() + "z :" + z;   // �޼��带 �������̵��� �� ������ �޼��带 ȣ���ؼ� �����ۼ��� ����ߴ�. ���踦 �ξ��ְ� �ߺ��� �ٿ���.
												  // �̷��� �Ŀ� ����޼����� ������ ����Ǿ ����� ������ �ڼ�Ŭ������ �޼��忡 �ڵ��ݿ��� �ȴ�.
	}
}