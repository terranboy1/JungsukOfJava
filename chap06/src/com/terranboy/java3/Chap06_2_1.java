package com.terranboy.java3;

public class Chap06_2_1 {

	public static void main(String[] args) {
		//�����ε��̶�?
		//-----------------------------------------------------------------------------
		//�޼��嵵 ������ ���������� ���� Ŭ���� ������ ���� ������ �� �־�� �ϱ� ������ ���� �ٸ� �̸��� ������ �Ѵ�.
		//�ٵ� �ڹٿ��� �޼��� �̸��� ������ '�Ű������� ������ Ÿ��'�� �ٸ��� ���� �̸��� ����� �޼��带 ������ �� �ִ�.
		//�� �����ε��� �ٽ���? '1.�޼��� �̸��� ����' '2.�Ű������� ������ �Ű������� Ÿ���� �޶���Ѵ�.'
		//�� �����ε��� �ٽ���? '1.�޼��� �̸��� ����' '2.�Ű������� ������ �Ű������� Ÿ���� �޶���Ѵ�.'
		//�� �����ε��� �ٽ���? '1.�޼��� �̸��� ����' '2.�Ű������� ������ �Ű������� Ÿ���� �޶���Ѵ�.'
		//�̰��� �����ε��̶� �Ѵ�. overloading.. �����ϴ�. ���� �ƴ´ٴ� ��.. �ϳ��� �޼��忡 ������ ���� �δ��� �ִ� ���� �ǹ��ϴ� �� ������..
		//���̵� ��򸮴µ� ��ȯ Ÿ���� �����ε��ϰ� ��~~~�� ������ �����.
		//�׵��� ����Ͻ� �츮�� println�޼���Բ� �ڼ���..
		
		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3, 3) ���:" + mm.add(3,3));  //�� ����! �޼��� ȣ���� ���� ����ǰ� println ����� ������?! --> println�� ����� �Ϸ��Ϸ��� �ȿ����� ���� ���Ǿ�� �ϱ� ����!
		System.out.println("mm.add(3L, 3) ���:" + mm.add(3L,3));
		System.out.println("mm.add(3, 3L) ���:" + mm.add(3,3L));
		System.out.println("mm.add(3L, 3L) ���:" + mm.add(3L,3L));
		
		int[] a = {100, 200, 300};
		System.out.println("mm.add(a) ���: " + mm.add(a));
		
	}
}

class MyMath3 {
	//�Ʒ� �͵��� �� �����ε� �� ���µ��̴�.
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}
	
	long add(int a, long b) {
		System.out.print("long add(int a, long b) - ");
		return a+b;
	}
	
	long add(long a, int b) {
		System.out.print("long add(long a, int b) - ");
		return a+b;
	}
	
	long add(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a+b;
	}
	
	int add(int[] a) {
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for(int i=0; i<a.length;i++) {
			result += a[i];
		}
		return result;
	}
}
