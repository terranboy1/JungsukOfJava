import java.util.Arrays;

public class ArrayEx8 {

	public static void main(String[] args) {
		int[] ball = new int[45];   //45���� �������� �����ϱ� ���� �迭 ����.
		
		//�迭�� �� ��ҿ� 1~45�� �� ����
		for(int i=0; i<ball.length; i++)
			ball[i] = i+1;  //ball[0]�� 1�� ����
		
		System.out.println(Arrays.toString(ball));
		
		int temp = 0;  //�� ���� �ٲٴ� �� ����� �ӽú���
		int j =0;      //������ ���� ��� ������ ����
		
		//�迭�� i��° ��ҿ� �������� ��ҿ� ����� ���� ���� �ٲ㼭 ���� ���´�.
		//0��°���� 5��° ��ұ��� ��� 6���� �ٲ۴�.
		for(int i=0; i<6; i++) {
			j=(int)(Math.random()*45);  //0~44������ ������ ���� ��´�.
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}
		
		//�迭 ball�� �տ������� 6���� ��� ���..�ϸ� �ζǹ�ȣ��?������
		for(int i=0; i<6; i++) {
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
		}
	}
}
