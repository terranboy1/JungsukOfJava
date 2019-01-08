package com.terranboy.java2;

public class ExerCise6_0_7_2 {
	public static void main(String[] args) {
		//문자 6-6에서 작성한 클래스메서드 getDistance()를 
		//MyPoint클래스의 인스턴스 메서드로 정의하시오.
		
		MyPoint p = new MyPoint(1,1);
		
		//p와 (2,2)의 거리를 구한다.
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
