package com.terranboy.java3;

public class Chap06_2_4 {

	public static void main(String[] args) {
		//�Ű������� �ִ� ������
		//-------------------------------------------
		//�����ڵ� �޼���ó�� �Ű������� ������ ȣ�� �� ���� �Ѱܹ޾� �ν��Ͻ��� �ʱ�ȭ �۾��� ��� �����ϴ�.
		//�ν��Ͻ����� ���� �ٸ� ������ �ʱ�ȭ�Ǿ���ϴ� ��찡 ���� ������ �Ű������� ����� �ʱ�ȭ�� �ſ� ����!
		//
		//�� ������ ���� �Ű������� �ִ� �������� ȿ���� ���������� ������.
		//
		//class Car {
		//     String color;
		//     String gearType;
		//     int door;
		//
		//     Car(){}                          //�Ű����� ���� ������(�Ʒ� �ڵ忡 ���� ������ ���������� �⺻�����ڵ� ���� �������. �����Ϸ��� �ȸ������)
		//     Car(String c, String g, int d){  //�Ű����� �ִ� ������
		//           color = c;
		//           gearType = g;
		//           door = d;
		//     }
		//}
		//�Ʒ��� ��ü �����ϸ鼭 �����ڷ� �ʱ�ȭ. �⺻�����ڷ� �ʱ�ȭ�ϰ� ������ ���� �־��ִ� �ͺ��� �Ű����� �ִ� ������ ȣ���ϴ� �� �ξ� ȿ���� ��������.
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