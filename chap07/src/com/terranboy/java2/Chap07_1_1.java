package com.terranboy.java2;
import static java.lang.Integer.*;
import static java.lang.Math.random;
import static java.lang.System.out;

public class Chap07_1_1 {

	public static void main(String[] args) {
		/*
			static import문
			
			static import문을 사용하면 static멤버를 호출할 때 클래스 이름을 생략할 수 있다.
			특정 클래스의 static멤버를 자주 사용할 때 편리하고 코드도 간결해진다!
			
			import static java.lang.Integer.*;     // Integer클래스의 모든 static메서드
			import static java.lang.Math.random;   // Math.random()만. 괄호 안붙여도됨!
			import static java.lang.System.out;    // System.out을 out만으로!
		 */
		
		int r = (int)(random()*10);
		out.println(r);
		out.println(Math.PI);
		out.println("와우!");

	}

}
