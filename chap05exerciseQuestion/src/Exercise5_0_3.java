
public class Exercise5_0_3 {

	public static void main(String[] args) {
		
		//�迭 arr�� ��� ��� ���� ���ϴ� ���α׷� �ϼ��ϱ�
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		//���� ���� ����~��
		for(int tmp : arr) {
			sum += tmp;
		}
		
		
		System.out.println("sum="+sum);
		
		//��°�� 
		//sum=150
	}
}
