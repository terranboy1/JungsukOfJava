package com.terranboy.java2;

public class Overriding {
	/*
    	�������̵��̶�? ����Ŭ�����κ��� ��ӹ��� �޼����� ������ �����ϴ� ��.
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
 	�������̵��� �޼����� ���븸 ���� �ۼ��ϴ� ���̹Ƿ� �޼��� ����δ� ������ �Ͱ� ��ġ�ؾ� �Ѵ�.
 	��, ����Ŭ������ �޼���� �������̵��ϴ� �ڼ�Ŭ������ �޼����
 	1. �̸��� ����
 	2. �Ű������� ����
 	3. ��ȯŸ���� ���ƾ� �Ѵ�.
 	(����δ� ���� �����θ� �ٸ��� �� �� �ִٴ� �Ǳ�)
 	
 	��Ÿ ����
 	1. ���������ڴ� ���� Ŭ������ �޼��庸�� �о�� �Ѵ�.
 	2. ���� Ŭ������ �޼��庸�� ���� ���� ���ܸ� ������ �� ����.(�̰� �� �����ܺ��߰ڴµ�. �� ������ �ȿ´�.)
 	3. �ν��Ͻ��޼��带 static�޼����, Ȥ�� static�޼��带 �ν��Ͻ��޼���� ������ �� ����. 
 	
 	2���� ������ �ұ�?
 	class Parent {
 		void parentMethod() throws IOException, SQLException {}
 	}
 	class Child extends Parent {
 		void parentMethod9) throws IOException {}  // O ����Ŭ������ �޼��庸�� ���ܰ� ���� ����Ǿ� �ִ�.(�ٵ� �� ���ܰ� Exception�� �ȵ�. �̰� ������ ������ ��� ���ܵ��� �����̴ϱ�) 
 	}
 
 
 
 */