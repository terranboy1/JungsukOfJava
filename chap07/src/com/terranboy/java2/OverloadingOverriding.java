package com.terranboy.java2;

public class OverloadingOverriding {

	public static void main(String[] args) {	
		/*
		  �����ε�vs�������̵�
		  
		  �����ε� : ������ ���� ���ο� �޼��� �߰�(new)
		  �������̵� : ��ӹ��� �޼����� ���� ����(change, modify) 
		 */
	}
}

class Parent {
	void parentMethod() {}
}

class Child extends Parent {
	void parentMethod() {} //�������̵�
	void parentMethod(int i) {} //�����ε�
	
	void childMethod() {}
	void childMethod(int i) {} //�����ε�
//	void childMethod() {}   ����. �ߺ�����
}