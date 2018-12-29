package com.terranboy.java3;

public class Chap06_2_6 {

	public static void main(String[] args) {
		//생성자를 이용한 인스턴스의 복사
		//-----------------------------------------------------------------------------------
		//현재 사용하고 있는 인스턴스와 같은 상태를 갖는 인스턴스를 하나 더 만들고자 할 때 생성자를 이용할 수 있다.
		//두 인스턴스가 같은 상태를 갖는다는 것은 두 인스턴스의 모든 인스턴스 변수(상태)가 동일한 값을 갖고 있다는 것을 뜻함.
		//하나의 클래스로부터 생성된 모든 인스턴스의 메서드와 클래스변수는 서로 동일하기 때문에 인스턴스간의 차이는
		//인스턴스마다 각기 다른 값을 가질 수 있는 인스턴스변수 뿐.
		//방법은 어떻게? --> 해당 클래스의 참조변수를 매개변수로 선언한 생성자를 만들자~~ 그럼 인스턴스변수들이 복사됨(물론 Object클래스에 정의된 clone메서드를 쓰면 더 간단히 복사할 수 있긴 하다.)
		
		Car3 c1 = new Car3();
		Car3 c2 = new Car3(c1);
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door="+c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door="+c2.door);
		c1.door=6;   //값복사
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door="+c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door="+c2.door);  //인스턴스 c2는 c1을 복사해 생성된 거라 서로 같은 상태를 갖지만 독립적 공간에 존재하므로 이후에 c1 값이 변경되어도 c2엔 영향 안미침.
		
		
	}
}

class Car3{
	String color;
	String gearType;
	int door;
	
	Car3(){
		this("white", "auto", 4);
	}
	
	Car3(Car3 c){
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	//this(c.color, c.gearType, c.door);   //요렇게 다릉생성자 호출하는 것이 좀더 깔끔하고 좋은 코드. 무작정 새로 코드를 작성하는 것보다 기존 코드를 재활용할 수 있을지 고민!
	}
	
	Car3(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

//생성자를 잘 활용하면 보다 간결하고 직관적인, 객체지향적인 코드를 작성할 수 있다!
//인스턴스를 생성할 때 다음의 2가지 사항을 결정해야한다.
//1) 클래스- 어떤 클래스의 인스턴스를 생성할 것인가?
//2) 생성자 - 선택한 클래스의 어떤 생성자로 인스턴스를 생성할 것인가?
