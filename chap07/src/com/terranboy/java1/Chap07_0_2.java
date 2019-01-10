package com.terranboy.java1;

public class Chap07_0_2 {

	public static void main(String[] args) {
		//상속 말고 포함관계
		//클래스간의 포함관계를 맺어주는 것은 한 클래스의 멤버변수로 다른 클래스 타입의 참조변수를 선언하는 것.
		
	/*	
		 class Point{
		     int x;
		     int y;
		 }
		 위처럼 좌표상의 한 점을 다루기 위한 Point클래스가 있다.
		 그리고 원 클래스를 정의하려고 한다. 근데 원은 점을 가지고 있잖아?
		 이것을 재활용해보도록 하자.
		      
		 class Circle{
		     int x;     원점의 x좌표
		     int y;     원점의 y좌표
		 이렇게 중복 하지 말고 포함관계를 이용할 수 있다.
		     Point c = new Point(); //원점.    한 클래스에서 다른 클래스의 객체를 생성하는거네?
		   
		     int r;     반지름(radius)

  		}
  		
  		이렇게 한 클래스를 작성하는 데 다른 클래스를 멤버변수로 선언해 포함시키는 것은 좋은 생각!
  		하나의 거대한 클래스를 작성하기보단 단위별로 여러 개의 클래스를 작성하고, 이 단위 클래스들을
  		포함관계로 재사용하면 보다 간결하고 손쉽게 클래스를 작성할 수 있다.
  		또한 작성된 단위 클래스들은 다른 클래스를 작성하는 데 재사용될 수 있을 것이고~!
  		아래 예를 보면 그 효용이 느껴질 것이다.
  		
  		class Car{
  		     Engine e = new Engine(); //엔진
  		     Door[] d = new Door[4];  //문. 문의 개수를 넷으로 가정하고 배열로 처리.. 인데 문짝을 왜 배열로 했지?

 */
		
/*
		상속vs 포함
		클래스를 작성하다보면 상속관계를 맺어줄 것인지, 포함관계를 맺어줄 것인지 결정하는 게 혼돈스러울 때가 있다.
		요약해서 is a면 상속, has a면 포함관계다. 
		
		Circle is a Point. 말이 안됨.
		Circle has a Point. 원은 점을 가지고 있다. 말되네? 포함관계!
		
		SportsCar is a Car. 스포츠카는 카다. 말되네? 상속관계!
		SportsCar has a Car. 말이 안됨.
		
		이건 둘째치고.. 때때로 의문이 드는 것이 있었다.
		둘이 구분해서 쓰는게 어떤 효용이 있을까?
		조사해보니 포함관계를 맺어주는 것의 장점들이 있었다.
		1. 어떤 클래스가 사용되었는지 직관적으로 알 수 있다.
		2.메서드 오버라이딩 신경쓸 필요없이 포함시킨 해당 클래스 객체를 바로 활용할 수 있다.
		듣고보니 효용이 있어보이는군!
 */
		Point[] p = { new Point(100, 100),
				      new Point(140, 50),
				      new Point(200, 100)
					};
		
		Triangle t = new Triangle(p);
		
		Circle c = new Circle(new Point(150, 150), 50);
		
		t.draw(); //삼각형 그린다.
		c.draw(); //원을 그린다.
	}
}

 class Shape {
	 String color = "black";
	 void draw() {
		 System.out.printf("[color=%s]%n", color);
	 }
 }
 
 class Point {
	 int x;
	 int y;
	  
	 Point(int x, int y){
		 this.x = x;
		 this.y = y;
	 }
	 
	 Point(){
		 this(0, 0);
	 }
	 
	 String getXY() {
		 return "("+x+","+y+")";  //x와 y값을 문자열로 반환
	 }
 }
 
 class Circle extends Shape {
	 Point center;  //원의 원점좌표
	 int r;         //반지름
	 
	 Circle(){
		 this(new Point(0, 0), 100); //Circle(Point center, int r)을 호출
	 }
	 
	 Circle(Point center, int r){
		 this.center = center;
		 this.r = r;
	 }
	 
	 void draw() { //원을 그리는 대신 정보 출력으로 대체
		 System.out.printf("[center=(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
	 }
 }
 
 class Triangle extends Shape{
	 Point[] p = new Point[3];  //3개의 Point인스턴스를 담을 배열 생성
	 
	 Triangle(Point[] p) {
		 this.p = p;
	 }
	 
	 void draw() {
		 System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	 }
 }
 
 /*
    잘보면 부토타입에도 draw()가 있고 자식들에게도 다 draw()가 있네~?
    이미 결과를 보면 알듯이 호출을 하면 자식 메서드가 호출되었지.
    이것이 Overriding이다. 조상클래스에 정아된 메서드와 같은 메서드를 자손클래스에 정의하는 것 말야.
 
 
 */