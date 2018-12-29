package com.terranboy.java3;

public class Chap06_2_4 {

	public static void main(String[] args) {
		//매개변수가 있는 생성자
		//-------------------------------------------
		//생성자도 메서드처럼 매개변수를 선언해 호출 시 값을 넘겨받아 인스턴스의 초기화 작업에 사용 가능하다.
		//인스턴스마다 각기 다른 값으로 초기화되어야하는 경우가 많기 때문에 매개변수를 사용한 초기화는 매우 유용!
		//
		//이 예제를 보고 매개변수가 있는 생성자의 효용을 직관적으로 느끼자.
		//
		//class Car {
		//     String color;
		//     String gearType;
		//     int door;
		//
		//     Car(){}                          //매개변수 없는 생성자(아래 코드에 내가 생성자 정의했으니 기본생성자도 따로 써줘야함. 컴파일러가 안만들어줌)
		//     Car(String c, String g, int d){  //매개변수 있는 생성자
		//           color = c;
		//           gearType = g;
		//           door = d;
		//     }
		//}
		//아래는 객체 생성하면서 생성자로 초기화. 기본생성자로 초기화하고 일일이 값을 넣어주는 것보다 매개변수 있는 생성자 호출하는 게 훨씬 효용이 느껴진다.
		//Car c = new Car();
		//c.color = "white";      ----->   Car c = new Car("white","auto",4);
		//c.gearType = "auto";
		//c.door=4;
		
		Car1 c1 = new Car1();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car1 c2 = new Car1("white","auto",4);
		
		System.out.println(c1.color + "/" + c1.gearType + "/" + c1.door);
		System.out.println(c2.color + "/" + c2.gearType + "/" + c2.door);
	}
}

class Car1 {
	String color;
	String gearType;
	int door;
	
	Car1(){ }
	
	Car1(String c, String g, int d){
		color = c;
		gearType = g;
		door = d;
	}
}