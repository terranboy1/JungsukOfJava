package com.terranboy.java1;

public class Exercise6_0_4_1 {
	public static void main(String[] args) {
		//���� 6-3���� ������ StudentŬ������ ������ ���� ���ǵ� �� ���� �޼���
		//getTotal()�� getAverage()�� �߰��Ͻÿ�.
		//
		//1.�޼���� : getTotal
		//           ��� : ����(kor), ����(eng), ����(math)�� ������ ��� ���� ��ȯ
		//     ��ȯŸ��: int
		//     �Ű�����: ����
		//
		//2.�޼���� : getAverage
		//           ��� : ����(����+����+����)�� ������� ���� ��� ����
		//           �Ҽ��� ��°�ڸ����� �ݿø��� ��
		//    ��ȯŸ�� : float
		//    �Ű����� : ����
		
		Student s = new Student();
		s.name = "ȫ�浿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("�̸�:"+s.name);
		System.out.println("����:"+s.getTotal());
		System.out.println("���:"+s.getAverage());
		
	}
}

//class Student {
//	String name;
//	int ban;
//	int no;
//	int kor;
//	int eng;
//	int math;
//}


//������
//-----------
//�̸�:ȫ�浿
//����:236
//���:78.7