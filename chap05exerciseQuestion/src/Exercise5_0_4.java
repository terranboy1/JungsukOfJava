
public class Exercise5_0_4 {

	public static void main(String[] args) {
		

		
		//2���� �迭 arr�� ��� ��� ���� ���հ� ����� ���ϴ� ���α׷�
		int[][] arr = {
			{5, 5, 5, 5, 5},
			{10, 10, 10, 10, 10},
			{20, 20, 20, 20, 20},
			{30, 30, 30, 30, 30}
		};
		
		int total = 0;
		float average = 0;
		
		
		//�̰Ž� �ش� Ǯ��. ������ ���ϼ��� ����.
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				total += arr[i][j];
			}
		}
		average = total / (float)(arr.length * arr[0].length);
		
		
		//�̰Ž� ���� ������ Ǯ��
//		int count = 0; //����� ���ϱ� ���ؼ� �迭�� �о�� Ƚ���� ������ ����.
//		for(int[] tmp : arr) {
//			for(int tmp1 : tmp) {
//				total += tmp1;
//				count++;
//			}
//		}
//		average = total / (float)count;
		//-------------------------------------------------------------------
		
		
		
		
		
			
		System.out.println("total="+total);
		System.out.println("average="+average);
		
		//������
		//total=325
		//average=16.25
		
		
		//�Ϳ�..���� ������. �̰� ���� Ǯ����!
	}
}
