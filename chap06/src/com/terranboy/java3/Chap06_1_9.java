package com.terranboy.java3;

public class Chap06_1_9 {

	public static void main(String[] args) {
		//클래스 메서드와 인스턴스 메서드
		//--------------------------------------------------
		//1) 변수에서 그랬던 것처럼 메서드 앞에 static 있으면 클래스메서드, 없으면 인스턴스 메서드.
		//2) 클래스 메서드도 클래스 변수처럼 객체 생성없이 클래스이름.메서드이름 으로 호출 가능.
		//3) 인스턴스 메서드는 객체를 생성해야만 호출 가능
		//
		//클래스를 정의할 때 어느 경우에 static을 사용해 클래스 메서드로 정의해야할까?★
		//-----------------------------------------------------
		//클래스는 데이터(변수)와 데이터에 관련된 메서드의 집합이므로 같은 클래스 내에 있는 메서드와 멤버변수는 아주 밀접한 관계에 있다.
		//인스턴스 메서드는 인스턴스 변수와 관련된 작업을 하는, 즉 메서드의 작업을 수행하는 데 인스턴스 변수를 필요로 하는 메서드다.
		//근데 인스턴스 변수는 인스턴스(객체)를 생성해야만 만들어지므로 인스턴스 메서드 역시 인스턴스를 생성해야만 호출 가능하다.
		//반면 메서드 중에서 인스턴스와 관계없는(인스턴스 변수나 인스턴스 메서드를 사용하지 않는) 메서드를 클래스 메서드로 정의한다.
		//(인스턴스 변수를 사용하지 않는다고 반드시 클래스 메서드로 정의해야하는 것은 아니지만 이게 일반적)
		//
		//멤버 - 변수 + 메서드
		//멤버변수 - 클래스 영역에 선언된 변수(클래스변수 + 인스턴스변수)
		//클래스변수 - 멤버변수 중에 static이 붙은 변수(모든 인스턴스에 공통으로 사용되는 변수에 static 붙임. 메서드도 마찬가지. 객체 생성 없이 사용할 수 있는 이유? 클래스가 메모리에 올라갈 때 이미 자동적으로 생성되기 때문.)
		//인스턴스변수 - 멤버변수 중에 static이 붙지 않은 것.
		
		//클래스메서드 호출. 인스턴스 생성없이 호출가능
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200L, 100L));
		System.out.println();
		
		MyMath2 mm = new MyMath2();  //인스턴스 생성
		mm.a = 200L;
		mm.b = 100L;
		//인스턴스메서드는 객체생성 후에만 호출이 가능.(당연한것;)
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());  
		
	}
}

class MyMath2 {
	long a, b;
	
	//인스턴스변수 a, b만을 이용해 작업하므로 매개변수가 필요없다.
	long add() {return a+b;}  //a,b는 인스턴스변수(이건 매개변수 없이 인스턴스만으로 작업하네)
	long subtract() {return a-b;}
	long multiply() {return a*b;}
	double divide() {return a/b;}
	
	//인스턴스변수와 관계없이 매개변수만으로 작업 가능
	static long add(long a, long b) {return a+b;} //a,b는 지역변수(매개변수도 지역변수)
	static long subtract(long a, long b) {return a-b;}
	static long multiply(long a, long b) {return a*b;}
	static double divide(double a, double b) {return a/b;}
}
