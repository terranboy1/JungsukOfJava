import java.util.Arrays;

public class ArrayEx9 {

	public static void main(String[] args) {
		
		//�ҿ������� ������ ����� �迭�� ä��� ���(�迭�� �ϳ� �� ���.)
		//���� �迭 code�� �ҿ������� ������ ���
		//���Ƿ� ���õ� index�� ����� ������ �迭 arr�� ��ҵ��� �ϳ��� ä��� �Ǵ� ��.
		//����� ���� ������� �迭�� index�� �׻� �������̱� ����.
		
		int[] code = {-4, -1, 3, 6, 11};  //�ҿ����� ������ �迭 ����
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			int tmp = (int)(Math.random()* code.length);  //�ε����� �������� �����ϳ�.
			arr[i] = code[tmp];   //�������� ������ �ε����� arr�� �ε����� ��.
		}
		System.out.println(Arrays.toString(arr));
	}

}
