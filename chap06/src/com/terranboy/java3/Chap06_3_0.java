package com.terranboy.java3;

public class Chap06_3_0 {
	public static void main(String[] args) {
		Document d1 = new Document();
		Document d2 = new Document("�ڹ�.txt");
		Document d3 = new Document();
		Document d4 = new Document();
		
		//��������� ���ΰ� �ڹ�.txt�� ���� �ν��Ͻ��� ��� �������� �� �ڹ�1.txt �ڹ�2.txt..�̷��� �ѹ� �̾�ް� �Ϸ��� ��� �ؾ�����?
	}
}

class Document {
	static int count =  0;
	String name;         //������(Document name)
	
	Document(){   //���� ������ �������� �������� �ʾ��� ��
		this("�������" + ++count);
	}
	
	Document(String name){
		this.name = name;
		System.out.println("���� "+ this.name+ "�� �����Ǿ����ϴ�.");
	}
}

// ���� ���⼭ ���� ����ó�� �ν��Ͻ� �ʱ�ȭ���� ����ع����� ����ϰ� �� �� ����.