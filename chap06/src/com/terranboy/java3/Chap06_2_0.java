package com.terranboy.java3;

public class Chap06_2_0 {

	public static void main(String[] args) {
		//Ŭ���� ����� �ν��Ͻ� ������� ������ ȣ��
		//-----------------------------------------------------------------------
		//���� Ŭ������ ���� ����� ������ ������ �ν��Ͻ� ���� ���� ���� ���� or ȣ���� ����!
		//��, Ŭ���� ����� �ν��Ͻ� ����� ���� �Ǵ� ȣ���ϰ��� �ϴ� ��쿣 '�ν��Ͻ� �����ؾ� ��'
		//�� ������, �ν��Ͻ� ����� �����ϴ� ������ Ŭ���� ����� �׻� ����������, Ŭ���� ����� �����ϴ� ������ �ν��Ͻ� ����� �������� ���� �� �ֱ� ������!
		//-->������ �ȵǴ� �� �ƴϰ� ȣ�� ������ �ν��Ͻ� ���� ���Ķ�� Ŭ���� ����� �ν��Ͻ� ����� ���� �Ǵ� ȣ���� �� �ֱ���.
		//
		//�ν��Ͻ� �޼���� static�޼��� ���� ȣ�⿡ ���� ����
		//--------------------------------------------------------------------
		//class TestClass {
		//     void instanceMethod(){}       // �ν��Ͻ� �޼���
		//     static void staticMethod(){}  // static �޼���
		//     
		//     void instanceMethod2(){       // �ν��Ͻ� �޼���
		//          instanceMethod();        // �ٸ� �ν��Ͻ� �޼��带 ȣ��
		//          staticMethod();          // static �޼��带 ȣ��(�ν��Ͻ� ���� ������ �̹� Ŭ�����޼��尡 ����.)
		//     }
		// 
		//     static void staticMethod2(){   // static�޼���
		//          instanceMethod();        // ����!!! ��������!(��ü�� �����ϰ��� ����� �� �ִ�.Ŭ���� �޼��尡 �ν��Ͻ� ������ �޼���� ����Ϸ��� ��ü �����ؾߵ�!!!)
		//          staticMethod();          // static�޼���� ȣ�� ����.
		//     }
		//}
		//������ �޼��� ���� ȣ�⿡ ���� ����
		//--------------------------------------------------------------------
		//class TestClass2 {
		//     int iv;         //�ν��Ͻ� ����
		//     static int cv;  //Ŭ���� ���� (Ŭ���� ���� ������ Ŭ�����̸�.Ŭ�������� �� ����. ���⼱ TestClass2.cv
		// 
		//     void instanceMethod(){         //�ν��Ͻ� �޼���
		//			System.out.println(iv);   //�ν��Ͻ� ���� ��� ����
		//          System.out.println(cv);   //Ŭ���� ���� ��� ����
		//     }
		//
		//     static void staticMethod()     //static�޼���
		//          System.out.println(iv);   //����!!! �ν��Ͻ� ������ ����� �� ����.
		//          System.out.println(cv);   //Ŭ���� ������ ��� ����.	
	}
}

class MemberCall{
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
	//static int cv2 = iv;                // ����!!! Ŭ���� ������ �ν��Ͻ� ������ ����� �� ����(���������� ������� �׳� �ȵ�)
	static int cv2 = new MemberCall().iv; // ��ó�� ��ü�� �����ؾ� ��� ����.
	
	static void staticMethod1() {
		System.out.println(cv);
		//System.out.println(iv);  // ����!!! Ŭ�����޼��忡�� �ν��Ͻ� ���� ��� �Ұ�(Ŭ���� ������ �޼���� �ν��Ͻ������� �׳� ��� ��ü�� ����)
		MemberCall c = new MemberCall();
		System.out.println(c.iv);  // ���� ����ƽ �޼�����. ��ü ���� �Ŀ� �ν��Ͻ� ������ ��� ������.
	}
	
	void instanceMethod1() {
		System.out.println(cv);       // �ν��Ͻ� �޼���� �� ��밡��
		System.out.println(iv);       // �ν��Ͻ� �޼���� �� ��밡��
	}
	
	static void staticMethod2() {
		staticMethod1();
//      instanceMethod1();                //Ŭ���� �޼���� ��ü ���� ������ �ν��Ͻ� ��� �Ұ���.
		MemberCall c = new MemberCall();
		c.instanceMethod1();              //�ν��Ͻ��� ������ �Ķ� �����ϴ�.	
	}
	
	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
	}
}

//����. �̷��� Ŭ��������� �ν��Ͻ� ����� ���� �Ǵ� ȣ���� �� �մ� ����� ���� ���� ������ ���� ȣ���ϴ� ���� �幰��.
//���� �׷� ��찡 �߻��Ѵٸ�, �ν��Ͻ��޼���� �ۼ��ؾ��� �޼��带 Ŭ�����޼���� �� ���� �ƴ��� �����غ����Ѵ�.
