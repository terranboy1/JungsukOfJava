package com.terranboy.java2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Chap07_1_0 {
	public static void main(String[] args) {
		
		Scanner name = new Scanner(System.in);
		
		Date today = new Date();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy��MM��dd��");
		SimpleDateFormat time = new SimpleDateFormat("kk��mm��ss�� ");
		
		System.out.println("���� ��¥�� " + date.format(today));
		System.out.println("���� �ð��� " + time.format(today));
		
		String abc = new String("�ٺ�"); // StringŬ������ import�� ���� ���µ� ���� ��Ű������ �����ص� �ɱ�~? java.lang��Ű���� ����� ���Ǵ� �߿� Ŭ�������� �ִ� ��Ű���� �����Ϸ��� �߰��ؼ�!!(��!)
		
		
		
		
		/*
			�ҽ��ڵ� �ۼ��� �� �ٸ� Ŭ���� ������ �Ź� ��Ű���� ���� Ŭ���� Ǯ������ ������� �Ѵ�.
			���� ������ ���� �ƴ� �� ����.
			�׷��� Ŭ������ �ڵ带 �ۼ��ϱ� �� import������ ����ϰ��� �ϴ� Ŭ������ ��Ű���� �̸� ������ָ�
			�ҽ��ڵ忡 ���Ǵ� Ŭ�����̸����� ��Ű������ ������ �� �ִ�. 
			��, import���� ������ �ҽ����Ͽ� ��뤧�� Ŭ������ ��Ű���� ���� ������ �����Ϸ����� �����ϴ� ��.
			�����Ϸ� �� �����Ϸ��� import���� ���� �ҽ����Ͽ� ���� Ŭ�������� ��Ű���� �˾Ƴ� ��, ��� Ŭ�����̸� �տ� ��Ű���� �ٿ���.
			����� CTRL + SHIRT + O (�� ����)
			���� : import���� ���α׷� ���ɿ� ������ ��ġ�� �ʰ� ������ �ð��� ���� �þ ��.
			
			�ҽ�����(.java)�� ���� ����
			1. pakage��
			2. import�� ( import ��Ű����.Ŭ������; �Ǵ� import ��Ű����.*; ) ( * �� �� �����´��ص� ���ɻ� ���̴� ������ ��� Ŭ������ ��� ��Ű���� ���ϴ��� ������ �� ������� �� �ִٴ� ����)
			3. Ŭ���� ����
			
			������ : imnport������ Ŭ���� �̸� ��� *�� ����ϴ� �� ���� ��Ű���� Ŭ�������� �������� ����.
			  	�� : import java.util.*;
			  	    import java.text.*;
			  	    
			  	    import java.*; �̰Ŵ� �� �� ������ ����� �� ����.

		 */
	}
}
