package com.terranboy.java3;

public class Chap06_2_6 {

	public static void main(String[] args) {
		//�����ڸ� �̿��� �ν��Ͻ��� ����
		//-----------------------------------------------------------------------------------
		//���� ����ϰ� �ִ� �ν��Ͻ��� ���� ���¸� ���� �ν��Ͻ��� �ϳ� �� ������� �� �� �����ڸ� �̿��� �� �ִ�.
		//�� �ν��Ͻ��� ���� ���¸� ���´ٴ� ���� �� �ν��Ͻ��� ��� �ν��Ͻ� ����(����)�� ������ ���� ���� �ִٴ� ���� ����.
		//�ϳ��� Ŭ�����κ��� ������ ��� �ν��Ͻ��� �޼���� Ŭ���������� ���� �����ϱ� ������ �ν��Ͻ����� ���̴�
		//�ν��Ͻ����� ���� �ٸ� ���� ���� �� �ִ� �ν��Ͻ����� ��.
		//����� ���? --> �ش� Ŭ������ ���������� �Ű������� ������ �����ڸ� ������~~ �׷� �ν��Ͻ��������� �����(���� ObjectŬ������ ���ǵ� clone�޼��带 ���� �� ������ ������ �� �ֱ� �ϴ�.)
		
		Car3 c1 = new Car3();
		Car3 c2 = new Car3(c1);
		System.out.println("c1�� color=" + c1.color + ", gearType=" + c1.gearType + ", door="+c1.door);
		System.out.println("c2�� color=" + c2.color + ", gearType=" + c2.gearType + ", door="+c2.door);
		c1.door=6;   //������
		System.out.println("c1�� color=" + c1.color + ", gearType=" + c1.gearType + ", door="+c1.door);
		System.out.println("c2�� color=" + c2.color + ", gearType=" + c2.gearType + ", door="+c2.door);  //�ν��Ͻ� c2�� c1�� ������ ������ �Ŷ� ���� ���� ���¸� ������ ������ ������ �����ϹǷ� ���Ŀ� c1 ���� ����Ǿ c2�� ���� �ȹ�ħ.
		
		
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
	//this(c.color, c.gearType, c.door);   //�䷸�� �ٸ������� ȣ���ϴ� ���� ���� ����ϰ� ���� �ڵ�. ������ ���� �ڵ带 �ۼ��ϴ� �ͺ��� ���� �ڵ带 ��Ȱ���� �� ������ ���!
	}
	
	Car3(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

//�����ڸ� �� Ȱ���ϸ� ���� �����ϰ� ��������, ��ü�������� �ڵ带 �ۼ��� �� �ִ�!
//�ν��Ͻ��� ������ �� ������ 2���� ������ �����ؾ��Ѵ�.
//1) Ŭ����- � Ŭ������ �ν��Ͻ��� ������ ���ΰ�?
//2) ������ - ������ Ŭ������ � �����ڷ� �ν��Ͻ��� ������ ���ΰ�?
