
public class Exercise5_1_1_1 {

	public static void main(String[] args) {
		//�־��� 2���� �迭�� �����ͺ��� ���ο� ���η� 1�� �� ū �迭�� �����ؼ�
		//�迭�� ��� ���� ������ ��ҿ� �� ���� ���� ������ �����ϰ�
		//����ϴ� ���α׷��̴�.
		//(1)�� �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		
		int[][] score = {
				{100, 100, 100}
			,   {20, 20, 20}
			,   {30, 30, 30}
			,   {40, 40, 40}
			,   {50, 50, 50}
		};
		
		int[][] result = new int[score.length+1][score[0].length+1];
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length;j++) {
				/*
				 *  (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
				 */			
			}
		}
		
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[i].length;j++) {
				System.out.printf("%4d", result[i][j]);
			}
			System.out.println();
		}
	}
}
//������
//100 100 100 100
// 20  20  20  60
// 30  30  30  90
// 40  40  40 120
// 50  50  50 150
//240 240 240 720