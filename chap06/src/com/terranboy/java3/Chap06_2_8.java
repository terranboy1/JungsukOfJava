package com.terranboy.java3;

public class Chap06_2_8 {
	
	static int[] arr = new int[10];            //ù��° ���� - ����� �ʱ�ȭ
	
	static {                                   //�ι�° ���� - �ʱ�ȭ ��
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10) + 1;
		}
	}

	public static void main(String[] args) {
		for(int i=0; i<arr.length; i++)
			System.out.println("arr["+i+"] :" + arr[i]);
	}
}

//��ó�� �迭�̳� ����ó���� �ʿ��� �ʱ�ȭ������ ����� �ʱ�ȭ������ ������ �ʱ�ȭ �۾��� �� �� ����.
//�̷� ��쿡 �߰������� Ŭ���� �ʱ�ȭ ���� ����ϵ��� �Ѵ�.
