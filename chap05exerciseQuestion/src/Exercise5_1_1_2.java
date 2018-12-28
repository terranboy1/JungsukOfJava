
public class Exercise5_1_1_2 {

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
		
		//���� �迭���� ��� ���� 1�� �� ū 2���� �迭 ����.
		int[][] result = new int[score.length+1][score[0].length+1];
		
		for(int i=0; i<score.length; i++) {        //score.length = 5
			for(int j=0; j<score[i].length;j++) {  //score[i].length = 3
				/*
				 *  (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
				 */			
				result[i][j] = score[i][j];
				result[i][score[0].length] += result[i][j];
				result[score.length][j] += result[i][j];
				result[score.length][score[0].length] += result[i][j];
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
//20  20  20  60
//30  30  30  90
//40  40  40 120
//50  50  50 150
//240 240 240 720
