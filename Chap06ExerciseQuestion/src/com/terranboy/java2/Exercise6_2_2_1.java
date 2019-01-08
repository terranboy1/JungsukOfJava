package com.terranboy.java2;

//�޼���� : isNumber
//��� : �־��� ���ڿ��� ��� ���ڷθ� �̷�����ִ��� Ȯ���Ѵ�.
//          ��� ���ڷθ� �̷���������� true ��ȯ, �׷��� ������ false��ȯ
//          ���� �־��� ���ڿ��� null�̰ų� ���ڿ� ""�� false ��ȯ
//��ȯŸ�� : boolean
//�Ű����� : String str - �˻��� ���ڿ�
//       ��Ʈ : charAt


public class Exercise6_2_2_1 {

	static boolean isNumber(String str) {
		
		if(str == null || str == "")
			return false;
		
		for(int i=0; i<str.length(); i++) {
			char x = str.charAt(i);
			
			if(x<'0' || '9'<x)
				return false;
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+"�� �����Դϱ�? "+isNumber(str));
		
		str = "1234o";
		System.out.println(str+"�� �����Դϱ�? "+isNumber(str));
	}
}
