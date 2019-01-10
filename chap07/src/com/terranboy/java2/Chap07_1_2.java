package com.terranboy.java2;

public class Chap07_1_2 {

	public static void main(String[] args) {
		
		
		/*
		 제어자(modifier) - 클래스, 변수 또는 메서드 선언부에 함께 사용되어 부가적 의미 부여.
		                                  종류로는 접근 제어자 / 그 외 제어자
		                                  
		 접근제어자 : public, protected, default, private
		 그          외 : static, final, abstract, native, transient, synchronized, volatile, strictfp
		 
		 제어자는 클래스나 멤버변수와 메서드에 주로 사용되며, 하나의 대상에 대해 여러 제어자를 조합해 사용하는 것이 가능.
		 단, 접근제어자는 한 번에 하나씩만 사용 가능. public private 이런게 안된단 말씀이여~~
		 
		 그 외 제어자1. static
		 모든 인스턴스가 값을 고유하면? ---> static을 붙입시다.
		 인스턴스 생성없이 사용하면 static을 붙이시오.
		 인스턴스 메서드와 static메서드의 차이가 뭐냐 물으면? ---> 메서드 내에서 인스턴스 멤버를 사용하는가 여부에 따라서.
		 
		 class StaticTest {
		 	static int width = 200;   //클래스변수
		 	static int height = 120; //클래스변수
		 	
		 	static {  //클래스 초기화블럭
		 		// static변수의 복잡한 초기화 수행
		 	}
		 	
		 	static int max(int a, int b) { //클래스 메서드
		 		return a > b ? a : b;
		 	}
		 	
		 그 외 제어자2. final
		 변수에 사용하면 값을 변경할 수 없는 상수가 됨.
		 오버라이딩도 못하고 자신의 자손클래스도 정의할 수 없게된다.
		 클래스, 메서드, 멤버변수, 지역변수에 사용 가능.
		 
		 final 클래스 = 변경, 확장이 불가능한 클래스. 타 클래스의 조상이 될 수 없음.
		 final 메서드 = 변경불가 메서드. 오버라이딩 불가.
		 final 멤버변수 = 값 변경 불가
		 final 지역변수 = 값 변경 불가
		 
		 final class FinalTest {  //변경, 확장이 불가능한 클래스. 타 클래스의 조상이 될 수 없음.
		 	final int MAX_SIZE = 10;  //멤버변수 값 변경 불가
		 	
		 	final void getMaxSize() {    //변경불가 메서드. 오버라이딩 불가.
		 		final int LV = MAX_SIZE;  //지역변수 값 변경 불가
		 		return MAX_SIZE;
		 	}
		 }	
		 	
		 final이 붙은 변수는 상수이므로 일반적으로 선언과 초기화를 동시에 하지만!
		 인스턴스변수의 경우 생성자에서 초기화 되도록 할 수 있다!
		 클래스 내 매개변수를 갖는 생성자를 선언해 인스턴스를 생성시 final이 붙은 멤버변수를 초기화하는 데 필요한 값을
		 생성자의 매개변수로부터 제공받는 것.
		 이 기능을 활용하면 각 인스턴스마다 final이 붙은 멤버변수가 다른 값을 갖게 할 수 있다.
		 (만약 이게 안되면 final 붙은 인스턴스 변수는 static처럼 다 같은 값을 가져야만 했을 것)
		 효용을 예를 들어 보도록 하자.
		 카드의 경우, 각 카드마다 다른 종류와 숫자를 갖지만, 일단 카드가 생성되면 카드 값이 변경되면 안된다.
		 52장의 카드 중에서 하나만 잘못 바꿔도 같은 카드가 2장이 되버리기 때문.
		 그래서 카드 값을 바꾸기 보다는 카드의 순서를 바꾸는 쪽이 더 안전한 방법이다.		 	
		 */
		
		Card c = new Card("HEART", 10);
//		c.NUMBER = 5;     //에러. 상수 값을 변경할 수 없음.
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);
		System.out.println("------------------------------------");
		
		Card c2 = new Card();
		System.out.println(c2.KIND);
		System.out.println(c2.NUMBER);
		System.out.println(c2);
		
		
		
	}
}

class Card {
	final int NUMBER;       //상수지만 선언과 함께 초기화하지 않고
	final String KIND;      //생성자에서 단 한번만 초기화할 수 있다.
	final int width = 100;
	final int height = 250;
	
	Card(String kind, int num){   //매개변수로 넘겨받은 값으로 KIND와 NUMBER 초기화.
		KIND = kind;
		NUMBER =  num;
	}
	
	Card() {
		this("HEART", 1);
	}
	
	public String toString() {
		return KIND +" " + NUMBER;
	}	
}
