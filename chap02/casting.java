package chap02;

public class casting {

	public static void main(String[] args) {
		
		int a = 91234567;
		float b = (float)a;  //���е��� 7�ڸ��� ������ 8�ڸ�° ���� �ٻ�ġ�� �Ǻη���
		int c = (int)b;      //�̹� �ٻ�ġ�� �Ǻη��� �ǵ����� 1�� �����ǹ�����
                             //�̷��� double�� �ؾ��Ѵ粲
		                     //�̰Ž� ����صθ� ������ ������ ���� �� ���� �� ����
		
		System.out.println(a);
		System.out.println(c);
		
		
		int d = (int)3.14;
		System.out.println(d);
		
		int a1 = 123456789;
		float b1 = (float)a1;
		

	}

}
