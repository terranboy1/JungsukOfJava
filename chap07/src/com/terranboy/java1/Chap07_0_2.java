package com.terranboy.java1;

public class Chap07_0_2 {

	public static void main(String[] args) {
		//��� ���� ���԰���
		//Ŭ�������� ���԰��踦 �ξ��ִ� ���� �� Ŭ������ ��������� �ٸ� Ŭ���� Ÿ���� ���������� �����ϴ� ��.
		
	/*	
		 class Point{
		     int x;
		     int y;
		 }
		 ��ó�� ��ǥ���� �� ���� �ٷ�� ���� PointŬ������ �ִ�.
		 �׸��� �� Ŭ������ �����Ϸ��� �Ѵ�. �ٵ� ���� ���� ������ ���ݾ�?
		 �̰��� ��Ȱ���غ����� ����.
		      
		 class Circle{
		     int x;     ������ x��ǥ
		     int y;     ������ y��ǥ
		 �̷��� �ߺ� ���� ���� ���԰��踦 �̿��� �� �ִ�.
		     Point c = new Point(); //����.    �� Ŭ�������� �ٸ� Ŭ������ ��ü�� �����ϴ°ų�?
		   
		     int r;     ������(radius)

  		}
  		
  		�̷��� �� Ŭ������ �ۼ��ϴ� �� �ٸ� Ŭ������ ��������� ������ ���Խ�Ű�� ���� ���� ����!
  		�ϳ��� �Ŵ��� Ŭ������ �ۼ��ϱ⺸�� �������� ���� ���� Ŭ������ �ۼ��ϰ�, �� ���� Ŭ��������
  		���԰���� �����ϸ� ���� �����ϰ� �ս��� Ŭ������ �ۼ��� �� �ִ�.
  		���� �ۼ��� ���� Ŭ�������� �ٸ� Ŭ������ �ۼ��ϴ� �� ����� �� ���� ���̰�~!
  		�Ʒ� ���� ���� �� ȿ���� ������ ���̴�.
  		
  		class Car{
  		     Engine e = new Engine(); //����
  		     Door[] d = new Door[4];  //��. ���� ������ ������ �����ϰ� �迭�� ó��.. �ε� ��¦�� �� �迭�� ����?

 */
		
/*
		���vs ����
		Ŭ������ �ۼ��ϴٺ��� ��Ӱ��踦 �ξ��� ������, ���԰��踦 �ξ��� ������ �����ϴ� �� ȥ�������� ���� �ִ�.
		����ؼ� is a�� ���, has a�� ���԰����. 
		
		Circle is a Point. ���� �ȵ�.
		Circle has a Point. ���� ���� ������ �ִ�. ���ǳ�? ���԰���!
		
		SportsCar is a Car. ������ī�� ī��. ���ǳ�? ��Ӱ���!
		SportsCar has a Car. ���� �ȵ�.
		
		�̰� ��°ġ��.. ������ �ǹ��� ��� ���� �־���.
		���� �����ؼ� ���°� � ȿ���� ������?
		�����غ��� ���԰��踦 �ξ��ִ� ���� �������� �־���.
		1. � Ŭ������ ���Ǿ����� ���������� �� �� �ִ�.
		2.�޼��� �������̵� �Ű澵 �ʿ���� ���Խ�Ų �ش� Ŭ���� ��ü�� �ٷ� Ȱ���� �� �ִ�.
		����� ȿ���� �־�̴±�!
 */
		Point[] p = { new Point(100, 100),
				      new Point(140, 50),
				      new Point(200, 100)
					};
		
		Triangle t = new Triangle(p);
		
		Circle c = new Circle(new Point(150, 150), 50);
		
		t.draw(); //�ﰢ�� �׸���.
		c.draw(); //���� �׸���.
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
		 return "("+x+","+y+")";  //x�� y���� ���ڿ��� ��ȯ
	 }
 }
 
 class Circle extends Shape {
	 Point center;  //���� ������ǥ
	 int r;         //������
	 
	 Circle(){
		 this(new Point(0, 0), 100); //Circle(Point center, int r)�� ȣ��
	 }
	 
	 Circle(Point center, int r){
		 this.center = center;
		 this.r = r;
	 }
	 
	 void draw() { //���� �׸��� ��� ���� ������� ��ü
		 System.out.printf("[center=(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
	 }
 }
 
 class Triangle extends Shape{
	 Point[] p = new Point[3];  //3���� Point�ν��Ͻ��� ���� �迭 ����
	 
	 Triangle(Point[] p) {
		 this.p = p;
	 }
	 
	 void draw() {
		 System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	 }
 }
 
 /*
    �ߺ��� ����Ÿ�Կ��� draw()�� �ְ� �ڽĵ鿡�Ե� �� draw()�� �ֳ�~?
    �̹� ����� ���� �˵��� ȣ���� �ϸ� �ڽ� �޼��尡 ȣ��Ǿ���.
    �̰��� Overriding�̴�. ����Ŭ������ ���Ƶ� �޼���� ���� �޼��带 �ڼ�Ŭ������ �����ϴ� �� ����.
 
 
 */