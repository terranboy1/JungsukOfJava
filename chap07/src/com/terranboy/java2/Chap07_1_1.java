package com.terranboy.java2;
import static java.lang.Integer.*;
import static java.lang.Math.random;
import static java.lang.System.out;

public class Chap07_1_1 {

	public static void main(String[] args) {
		/*
			static import��
			
			static import���� ����ϸ� static����� ȣ���� �� Ŭ���� �̸��� ������ �� �ִ�.
			Ư�� Ŭ������ static����� ���� ����� �� ���ϰ� �ڵ嵵 ����������!
			
			import static java.lang.Integer.*;     // IntegerŬ������ ��� static�޼���
			import static java.lang.Math.random;   // Math.random()��. ��ȣ �Ⱥٿ�����!
			import static java.lang.System.out;    // System.out�� out������!
		 */
		
		int r = (int)(random()*10);
		out.println(r);
		out.println(Math.PI);
		out.println("�Ϳ�!");

	}

}
