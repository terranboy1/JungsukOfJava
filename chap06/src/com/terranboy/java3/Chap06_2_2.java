package com.terranboy.java3;

public class Chap06_2_2 {

	public static void main(String[] args) {
		//��������(varargs)�� �����ε�
		//-----------------------------------------------------------
		//������ �޼����� �Ű����� ������ �������̾����� JDK1.5���� ���� ���� ��������.
		//�� ����� ��������(variable arguments)�� ��.
		//public PrintStream printf(String format, Object... args){...}
		//���Ͱ��� �������� �ܿ��� �Ű������� �� �ִٸ� �������� �����ؾ� �Ѵ�.(�ȱ׷��� ������ ����)
		//public PrintStream printf(Object... args, String format){...} // ����!!XXXXXX
		//public PrintStream printf(String format, Object... args){...} // OK    OOOOOO
		//
		//���� ���� ���ڿ��� �ϳ��� ������ ��ȯ�ϴ� concatenate�޼��带 �ۼ��ؾ� �Ѵٸ� �Ʒ�ó�� �ۼ��ؾ� �� ���̴�.
		//String concatenate(String s1, String s2){...}
		//String concatenate(String s1, String s2, String s3){...}
		//String concatenate(String s1, String s2, String s3, String s4){...}
		//�̷��� �Ű����� ������ ���� ���ε��� �������ִµ� �ſ� ��ȿ���̴�.
		//�̷� �� �������ڸ� �Ἥ �Ʒ�ó�� �޼��� �ϳ��� ���� ��ü!
		//String concatenate(String... str){...}
		//�׷� �Ʒ�ó�� ����� �� �ֵ�.
		//
		//System.out.println(concatenate());    //���� ����
		//System.out.println(concatenate("a")); //���� �ϳ�
		//System.out.println(concatenate("a", "b")); //���� ��
		//System.out.println(concatenate(new String[]{"A","B")); //�迭�� ����
		//
		//���뿡�� ��ġæ ����� �����ٵ� �������ڴ� ���������� �迭�� �̿��ϴ� ���̴�.
		//�׷��� �������ڰ� ����� �޼��带 ȣ���� ������ ���ο� �迭�� �����ȴ�.
		//�������ڰ� ��������, �̷� ��ȿ���� ���������Ƿ� �� �ʿ��� ��쿡�� ����ϵ��� ����.
		//
		//
		//�׷� �������ڴ� �Ʒ��� ���� �Ű������� Ÿ���� �迭�� �ϴ� �Ͱ� � ���̰� ������?
		//String concatenate(String[] str){...}
		//
		//String result = concatenate(new String[0]);  //���ڸ� �迭�� ����. �̰� ������ ����ߵǴϱ� ��ȿ��.
		//String result = concatenate(null);           //���ڷ� null�� ����
		//String result = concatenate();               //����! ���� �ʿ�.
		//
		//�Ű������� Ÿ���� �迭�� �ϸ� �ݵ�� ���ڸ� ��������� �ϱ� ������ �� �ڵ忡��ó�� ���ڸ� ������ �� ����.
		//�׷��� null�̳� ���̰� 0�� �迭�� ���ڷ� ����������ϴ� �������� �ִ�.(C���� �޸� �ڹٿ��� ���̰� 0�� �迭�� �����ϴ� ���� ����)
		//
		//�������ڸ� �����ε��� �� �� ���� ������ ���� �ִµ�, �Ʒ� ������ ������ ����.
		
		String[] strArr = {"100", "200", "300"};
		
		System.out.println(concatenate("", "100", "200", "300"));
		System.out.println(concatenate("-", strArr));
		System.out.println(concatenate(",", new String[] {"1","2","3"}));
		System.out.println("["+concatenate(",", new String[0])+"]");
		System.out.println("["+concatenate(",")+"]");
	}
	
	static String concatenate(String delim, String... args) {
		String result = "";
		
		for(String str : args) {
			result += str + delim;
		}
		
		return result;
	}
	
	/*
	 * static String concatenate(String... args){             //��� �ּ�Ǯ�� reference to concatenate is ambiguous ������. ���� �޼���� ������ �ȵǾ �߻���. �̷� ��찡 ���� �־ �������� �����ε��� ���ϴ� �� ��õ�Ѵٰ� �Ѵ�.
	 * 	  return concatenate("", args);
	*/
}
