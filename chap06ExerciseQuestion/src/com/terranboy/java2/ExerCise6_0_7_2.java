package com.terranboy.java2;

public class ExerCise6_0_7_2 {
	public static void main(String[] args) {
		//���� 6-6���� �ۼ��� Ŭ�����޼��� getDistance()�� 
		//MyPointŬ������ �ν��Ͻ� �޼���� �����Ͻÿ�.
		
		MyPoint p = new MyPoint(1,1);
		
		//p�� (2,2)�� �Ÿ��� ���Ѵ�.
		System.out.println(p.getDistance(2,2));
		
	}
}

class MyPoint{
	int x;
	int y;
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x, int y) {
		return Math.sqrt((x-this.x)*(x-this.x) + (y-this.y)*(y-this.y));
	}
	
}
