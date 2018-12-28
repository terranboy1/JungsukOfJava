package com.terranboy.java3;

public class Chap06_2_0 {

	public static void main(String[] args) {
		//클래스 멤버와 인스턴스 멤버간의 참조와 호출
		//-----------------------------------------------------------------------
		//같은 클래스에 속한 멤버들 간에는 별도의 인스턴스 생성 없이 서로 참조 or 호출이 가능!
		//단, 클래스 멤버가 인스턴스 멤버를 참조 또는 호출하고자 하는 경우엔 '인스턴스 생성해야 함'
		//그 이유는, 인스턴스 멤버가 존재하는 시점에 클래스 멤버는 항상 존재하지만, 클래스 멤버가 존재하는 시점에 인스턴스 멤버가 존재하지 않을 수 있기 때뭄ㄴ!
		//-->무조건 안되는 게 아니고 호출 시점이 인스턴스 생성 이후라면 클래스 멤버가 인스턴스 멤버를 참조 또는 호출할 수 있구나.
		//
		//인스턴스 메서드와 static메서드 간의 호출에 대한 설명
		//--------------------------------------------------------------------
		//class TestClass {
		//     void instanceMethod(){}       // 인스턴스 메서드
		//     static void staticMethod(){}  // static 메서드
		//     
		//     void instanceMethod2(){       // 인스턴스 메서드
		//          instanceMethod();        // 다른 인스턴스 메서드를 호출
		//          staticMethod();          // static 메서드를 호출(인스턴스 생성 시점엔 이미 클래스메서드가 있지.)
		//     }
		// 
		//     static void staticMethod2(){   // static메서드
		//          instanceMethod();        // 에러!!! 생성시점!(객체를 생성하고나서 사용할 수 있다.클래스 메서드가 인스턴스 변수든 메서드든 사용하려면 객체 생성해야됨!!!)
		//          staticMethod();          // static메서드는 호출 가능.
		//     }
		//}
		//변수와 메서드 간의 호출에 대한 설명
		//--------------------------------------------------------------------
		//class TestClass2 {
		//     int iv;         //인스턴스 변수
		//     static int cv;  //클래스 변수 (클래스 변수 쓰려면 클래스이름.클래스변수 로 쓴다. 여기선 TestClass2.cv
		// 
		//     void instanceMethod(){         //인스턴스 메서드
		//			System.out.println(iv);   //인스턴스 변수 사용 가능
		//          System.out.println(cv);   //클래스 변수 사용 가능
		//     }
		//
		//     static void staticMethod()     //static메서드
		//          System.out.println(iv);   //에러!!! 인스턴스 변수를 사용할 수 없다.
		//          System.out.println(cv);   //클래스 변수는 사용 가능.	
	}
}

class MemberCall{
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
	//static int cv2 = iv;                // 에러!!! 클래스 변수는 인스턴스 변수를 사용할 수 없음(생성시점에 상관없이 그냥 안됨)
	static int cv2 = new MemberCall().iv; // 이처럼 객체를 생성해야 사용 가능.
	
	static void staticMethod1() {
		System.out.println(cv);
		//System.out.println(iv);  // 에러!!! 클래스메서드에서 인스턴스 변수 사용 불가(클래스 변수든 메서드든 인스턴스변수는 그냥 사용 자체를 못함)
		MemberCall c = new MemberCall();
		System.out.println(c.iv);  // 여기 스태틱 메서드임. 객체 생성 후에 인스턴스 변수를 사용 가능함.
	}
	
	void instanceMethod1() {
		System.out.println(cv);       // 인스턴스 메서드는 다 사용가능
		System.out.println(iv);       // 인스턴스 메서드는 다 사용가능
	}
	
	static void staticMethod2() {
		staticMethod1();
//      instanceMethod1();                //클래스 메서드는 객체 생성 전에는 인스턴스 사용 불가능.
		MemberCall c = new MemberCall();
		c.instanceMethod1();              //인스턴스를 생성한 후라 가능하다.	
	}
	
	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
	}
}

//자자. 이렇게 클래스멤버가 인스턴스 멤버를 참조 또는 호출할 수 잇는 경우의 수를 보긴 봤지만 실제 호출하는 경우는 드물다.
//만일 그런 경우가 발생한다면, 인스턴스메서드로 작성해야할 메서드를 클래스메서드로 한 것은 아닌지 생각해봐야한다.
