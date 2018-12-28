package com.terranboy.java2;

public class Chap06_0_5 {
	public static void main(String[] args) {
		//변수와 메서드
		//--------------------------------------------
		//선언 위치에 따른 변수의 종류
		// 1) 멤버변수를 제외한 나머지 변수는 모두 지역변수
		// 2) 멤버변수 중 static이 붙은 것은 클래스변수, 붙지 않은 것은 인스턴스변수.   (지역변수는 static변수 될 수 없다!)
		//
		// class Variables           --------> 클래스영역
		// {
		//   int iv;          //인스턴스변수
		//   static int cv;   //클래스변수(static변수)
		//
		//   void method()           --------> 메서드영역
		//   {
		//       int lv = 0;  //지역변수
		//   }
		// }
		
		System.out.println("Card.width = " + Card.width);  //클래스변수라 객체생성 없이 전역적으로 사용 가능 (클래스이름.클래스변수)
		System.out.println("Card.width = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1 종류: " + c1.kind + "/ c1 번호 : " + c1.number + "/ c1 너비 :" + Card.width + "/ c1 높이 :" + Card.height);
		System.out.println("c1 종류: " + c2.kind + "/ c1 번호 : " + c2.number + "/ c1 너비 :" + Card.width + "/ c1 높이 :" + Card.height);
		
		Card.width = 150;
		Card.height = 450;
		System.out.println();
		
		System.out.println("c1 종류: " + c1.kind + "/ c1 번호 : " + c1.number + "/ c1 너비 :" + Card.width + "/ c1 높이 :" + Card.height);
		System.out.println("c1 종류: " + c2.kind + "/ c1 번호 : " + c2.number + "/ c1 너비 :" + Card.width + "/ c1 높이 :" + Card.height);
		
//		c1.width = 200; 요거 봐봐. 인스턴스를 가리키는 참조변수로도 클래스변수에 접근 및 수정이 가능하거든? 근데 이러면 width가 인스턴스변수인지 클래스변수인지
//		헷깔려서 이렇게 안쓰길 권장하는거야. ㅇㅋ?
	}
}

class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}
