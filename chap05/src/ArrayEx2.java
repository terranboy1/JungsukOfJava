import java.util.Arrays;

public class ArrayEx2 {
	public static void main(String[] args) {
		
		//�迭�� ���̸� �����ϴ� ���
		//1.�� ū �迭�� ���� ����
		//2.���� �迭�� ������ ���ο� �迭�� ����
		//�̷� �۾��� ����� ���� ��� ������ ó������ �迭 ���� �˳��ϰ� ��� ���ο� �迭 �����ϴ� ��Ȳ�� ������ �ϴ°� ����.
		//�׷��ٰ� �ʹ� ũ�� ������ �޸� ���� ����ǰ�.. �ʿ�ġ�� 2������?
		
		//�迭���ʱ�ȭ
		//������ ��Ģ�� �ִ� ���̶�� for���� ��������
		//�װ� �ȵ� ���~~~ int[] score = new int[] {50, 60, 70, 80, 90}; �̷��� ������ �ʱ�ȭ ���ÿ� ����.
		//�̷��� ������ ������ ��ȣ{} �ȿ� ��ǥ�� ������ �����ϸ� �ǰ�, ��ȣ ���� ���� ������ ���� �迭 ���̰� �ڵ����� �����ǹǷ� �迭 ���� ���� �ʿ� ����.
		
        //�׸���  int[] score = {50, 60, 70, 80, 90}; ó�� �� �ٿ� ������ new Ÿ��[]�� ���� ����������
		//�迭 ����� ������ �����ϴ� ��쿣 ���� �Ұ���. ��, �Ʒ�ó�� �����.
		//int[] score;
		//score = new int[] {50, 60, 70, 80, 90};
		
		//int[] score={}; �̰��� ���̰� 0�� �迭 ����. ���������� �⺻���� null������ �迭�� ����Ű�� ���������� null��� ���̰� 0�� �迭�� �ʱ�ȭ��.
		
		//int[] score = new int[0];      ���̰� 0�� �迭
		//int[] score = new int[]{};  ���̰� 0�� �迭
		//int[] score = {};           ���̰� 0�� �迭. new int[] ��������.
		
		
		//�迭�� ����ϴ� ������ ��� �Ұ�
//		int[] iArr = {100, 95, 80, 70, 60};
//		//�迭�� iArr�� ��� ��� ���
//		System.out.println(Arrays.toString(iArr));
//		System.out.println(iArr);      //����� �̰� ��µǴ� �ּҴ� ���� �ּҰ� �ƴ� ���� �ּҶ�µ� ���� �� �𸣰ڴ�.
		
		//���������� char �迭�� println�޼���� ����ϸ� �� ��Ұ� �����ھ��� �״�� ��µǴµ� �̰� println�޼��尡 char�迭�� ���� �̷��� ���۵ǵ��� �ۼ��Ǿ��� ����! 
//		char[] chArr = {'a', 'b', 'c', 'd'};  
//		System.out.println(chArr);   //abcd ��µ�.
		
		
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
//		int[] iArr3 = new int[] {100,95,80,70,60};
		int[] iArr3 = {100,95,80,70,60};
		char[] chArr= {'a','b','c','d'};
		
		for(int i=0; i<iArr1.length; i++) {
			iArr1[i] = i + 1;
		}
		
		for(int i=0; i<iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10) + 1;
		}
		
		//�迭�� ����� �� ���
		for(int i=0; i<iArr1.length; i++) {
			System.out.print(iArr1[i]+",");
		}
		System.out.println();
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr);
	}
}
