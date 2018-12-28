import java.util.Arrays;

public class ArrayEx4 {
	public static void main(String[] args) {
		//System.arraycopy()�� �̿��� �迭�� ����
		
		//for�� ��� SystemŬ������ arraycopy()�� ����ϸ� ���� �����ϰ� ������ �迭 ���� ����.
		//for���� �迭�� ��� �ϳ��ϳ��� �����ؼ� ����������, arraycopy()�� ������ ������ ������ �� ���� ��°�� ������.
		//�� ��ҵ��� ���������� ����Ǿ� �ִٴ� �迭�� Ư�� ������ �̷��� ó���� ������ ��!
		//���: �迭 ����� for�� < System.arraycopy() �ӵ�.
		
		//System.arraycopy()�� �̿��� �迭���� ����
		char[] abc = {'A', 'B', 'C', 'D'};
		char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		System.out.println(abc);
		System.out.println(num);
		//�迭 abc�� num�� �ٿ� �ϳ��� �迭(result)�� �����.
		char[] result = new char[abc.length+num.length];  //�� �迭�� ���� ������.
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
		
		//�迭 abc�� �迭 num�� ù ��° ��ġ���� �迭 abc�� ���̸�ŭ ����
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		
		//number�� �ε���6 ��ġ�� 3���� ����
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
		
		//�̰��� ���� ����. �� ������ 9�� D�� �����
		System.arraycopy(abc, 3, num, 9, 1);
		System.out.println(num);

	}
}
