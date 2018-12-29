package com.terranboy.java3;

public class Chap06_2_5 {

	public static void main(String[] args) {
		//생성자에서 다른 생성자 호출하기 - this(), this
		//-----------------------------------------------------------------
		//같은 클래스의 멤버들 간에 서로 호출할 수 있는 것처럼 생성자 간에도 서로 호출이 가능하다.but 조건이 있다.
		//1)생성자의 이름으로 클래스 이름 대신 this를 사용한다.
		//2)한 생성자에서 다른 생성자를 호출할 땐 반드시 첫 줄에서만 호출이 가능(기껏 초기화 해놨는데 이후에 생성자 호출되면 도루묵이라 컴파일러가 체크하게 해논 것)
		
		//아래 코드의 문제점을 찾아보시오.
		//Car(String color){
		//     door = 5;      
		//     Car(color, "auto", 4);   //1) this(color, "auto", "4"); 로 호출했어야함
		//                              //2) 첫 줄에서 호출했어야 함.
		
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue");
		
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door="+c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door="+c2.door);
	}
}

class Car2{
	String color;
	String gearType;
	int door;
	
	Car2(){
		this("white","auto",4);   //자동차로 치면 자동차 기본옵션이네. 흰색, 자동변속기어, 문짝4개
	}
	
	Car2(String color){
		this(color, "auto", 4);
	}
	
	Car2(String color, String gearType, int door){
		this.color = color;            //요렇게 this. 쓰는 이유가 지역변수와 인스턴스변수를 구분하기 위해서다.
		this.gearType = gearType;      //this 안쓰면.. color = c; 이런식으로 지역변수 이름을 또 일일이 써줘야함. 구분을 해줘야하니까.
		this.door = door;              //this로 변수 구분하고 광명찾자!
	}                                  //this는 참조변수로 인스턴스 자신을 가리킨다. 참조변수를 통해 인스턴스의 멤버에 접근할 수 있는 것처럼 this로 인스턴스변수에 접근한다!
}                                      //this는 인스턴스멤버에만 사용한다. static에서는는 인스턴스 멤버들을 사용할 수 없는 것처럼 this역시 쓸 수 없다. 쓸 수 없는 이유는 같다(생성 시점에 관한 문제)

//사실 생성자를 포함한 모든 인스턴스 메서드에는 자신이 관련된 인스턴스를 가리키는 참조변수 'this'가 지역변수로 숨겨진 채 존재한다.
//일반적으로 인스턴스메서드는 특정 인스턴스와의 관련된 작업을 하기 때문에 자신과 관련된 인스턴스의 정보가 필요하지만, static메서드는 인스턴스와 관련 없는
//작업을 하기 때문에 인스턴스에 대한 정보가 필요없기 때문. 인스턴스메서드와 static메서드의 차이를 다시 한 번 되새겨 보자!
//
//요약: this                  - 인스턴스 자신을 가리키는 참조변수. 인스턴스의 주소가 저장되어 있다.모든 인스턴스메서드에 지역변수로 숨겨진 채 존재
//      this(),this(매개변수) - 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용한다.