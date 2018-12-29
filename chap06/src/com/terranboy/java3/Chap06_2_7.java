package com.terranboy.java3;

public class Chap06_2_7 {

	public static void main(String[] args) {
		//변수의 초기화(되도록 선언과 동시에 초기화 하는 것이 바람직)
		//멤버변수는 초기화 안해도 자동적으로 변수의 자료형에 맞는 기본값으로 초기화 된다.
		//지역변수는 사용 전 반드시 초기화해야한다.
		//요약: 멤버변수(클래스변수+인스턴스변수)와 배열의 초기화는 선택적이지만 지역변수의 초기화는 필수적.(앞에껀 힙메모리, 뒤에껀 스택메모리)
		
		//멤버변수의 초기화 방법
		//1.명시적 초기화 - 변수를 선언과 동시에 초기화.(보다 복잡한 초기화 작업이 필요할 때는 생성자나 초기화 블럭 사용)
		//2.생성자(인스턴스 생성할 때마다 수행)
		//3.초기화 블럭 - 
		//  1) 클래스 초기화 블럭 : 클래스변수를 초기화하는 데 사용(클래스가 메모리에 처음 로딩될 때 한 번만 수행)
		//  2) 인스턴스 초기화 블럭: 인스턴스 변수 초기화하는 데 사용(인스턴스 생성할 때마다 수행)
		//                         인스턴스 변수의 초기화는 주로 생성자를 이용하고, 인스턴스 초기화 블럭은 모든 생성자에서 공통으로 수행되어야 하는 코드를 넣는데 사용한다!
		//
		//        이것은 초기화블럭의 모형
		//        class InitBlock {
		//              static { /* 클래스 초기화 블럭 */ }
		//              { /* 인스턴스 초기화 블럭 */ }  
		//        }
		//
		//        이것은 인스턴스 초기화 블럭을 언제 쓰는지 볼 수 있는 예제
 		//        Car() {
		//             count++;
		//             serialNo = count;    //코드 중복
		//             color = "White";     //코드 중복
		//             gearType = "auto";
		//        }
		//        
		//        Car(String color, String gearType){
		//             count++;
		//             serialNo = count;    //코드 중복
		//             this.color = color;  //코드 중복
		//             this.gearType = gearType;
		//
		//        위의 생성자에서 중복되는 부분을 인스턴스 초기화 블럭으로 묶으면
		//        쨘
		//         { 
		//            count++;
		//            serialNo = count;
		//         }
		//
		//        자, 그럼 여기서 의문이 생기지않아? 초기화 블럭을 묶긴 했는데 "실행 순서"가 중요하잖아. 어떻게 될까?
	    //        실제 코드를 보며 생각해보자.
		
		System.out.println("인스턴스1 생성");
		Chap06_2_7 a = new Chap06_2_7();
		
		System.out.println("인스턴스2 생성");
		Chap06_2_7 b = new Chap06_2_7();
		
	}
	
	static {
		System.out.println("클래스 초기화 블럭");
	}
	
	{
	    System.out.println("인스턴스 초기화 블럭");	
	}
	
	public Chap06_2_7() {
		System.out.println("생성자");
	}

}
