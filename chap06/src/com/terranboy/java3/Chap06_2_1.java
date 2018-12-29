package com.terranboy.java3;

public class Chap06_2_1 {

	public static void main(String[] args) {
		//오버로딩이란?
		//-----------------------------------------------------------------------------
		//메서드도 변수와 마찬가지로 같은 클래스 내에서 서로 구별될 수 있어야 하기 때문에 각기 다른 이름을 가져야 한다.
		//근데 자바에선 메서드 이름이 같더라도 '매개변수의 개수나 타입'이 다르면 같은 이름을 사용해 메서드를 정의할 수 있다.
		//자 오버로딩의 핵심은? '1.메서드 이름은 같고' '2.매개변수의 개수나 매개변수의 타입이 달라야한다.'
		//자 오버로딩의 핵심은? '1.메서드 이름은 같고' '2.매개변수의 개수나 매개변수의 타입이 달라야한다.'
		//자 오버로딩의 핵심은? '1.메서드 이름은 같고' '2.매개변수의 개수나 매개변수의 타입이 달라야한다.'
		//이것을 오버로딩이라 한다. overloading.. 과적하다. 많이 싣는다는 뜻.. 하나의 메서드에 과중한 업무 부담을 주는 것을 의미하는 것 같구나..
		//많이들 헷깔리는데 반환 타입은 오버로딩하고 아~~~무 관련이 없어요.
		//그동안 고생하신 우리의 println메서드님께 박수를..
		
		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3, 3) 결과:" + mm.add(3,3));  //어 뭐야! 메서드 호출이 먼저 실행되고 println 결과가 나오네?! --> println이 출력을 완료하려면 안에것이 먼저 계산되어야 하기 때문!
		System.out.println("mm.add(3L, 3) 결과:" + mm.add(3L,3));
		System.out.println("mm.add(3, 3L) 결과:" + mm.add(3,3L));
		System.out.println("mm.add(3L, 3L) 결과:" + mm.add(3L,3L));
		
		int[] a = {100, 200, 300};
		System.out.println("mm.add(a) 결과: " + mm.add(a));
		
	}
}

class MyMath3 {
	//아래 것들이 다 오버로딩 된 형태들이다.
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}
	
	long add(int a, long b) {
		System.out.print("long add(int a, long b) - ");
		return a+b;
	}
	
	long add(long a, int b) {
		System.out.print("long add(long a, int b) - ");
		return a+b;
	}
	
	long add(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a+b;
	}
	
	int add(int[] a) {
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for(int i=0; i<a.length;i++) {
			result += a[i];
		}
		return result;
	}
}
