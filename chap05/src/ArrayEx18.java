
public class ArrayEx18 {

	public static void main(String[] args) {
		//�������迭
		//----------------------
		//2���� �迭�� ����� �ε���
		//������1 Ÿ��[][] �����̸�;   ex) int[][] score; 
		//������2 Ÿ�� �����̸�[][];   ex) int score[][]; 
		//������3 Ÿ��[] �����̸�[];   ex) int[] score[];
		
		//2�����迭�� �ַ� ���̺� ������ �����͸� ��� �� ����.
		
		//2�����迭 �� ������ ����
		int[][] score = {
				{ 100, 100, 100}
			,   {  20,  20,  20}
			,   {  30,  30,  30}
			,   {  40,  40,  40}
		};
		
		int sum = 0;
		
		for(int i=0; i<score.length; i++) {    //score.length���� 4
			for(int j=0; j<score[i].length; j++) {  //score[i].length�� ���� 3. �߸𸣰����� �ڹ������� 216p
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
			}
		}
		
		for(int[] tmp : score) {    //score�� �� ���(1���� �迭 �ּ�)�� tmp�� ����. score �ϳ��ϳ��� �迭���̴ϱ� �迭�� ��ƾ���.
			for(int i:tmp) {        //tmp�� 1�����迭�� ����Ű�� ��������.
				sum +=i;
				System.out.println(sum);
			}
		}
		
		System.out.println("sum="+sum);
	}
}
