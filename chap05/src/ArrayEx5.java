
public class ArrayEx5 {
	public static void main(String[] args) {
		//�迭�� Ȱ�� ���. �迭�� Ȱ���� ���ù��� ������ �Ʒ� �������� �� �����̴�. �� ����ε���!		
		//���հ� ���
		//�ִ밪�� �ּҰ�
		//����(shuffle)
		//������ ������ �迭 ä���
		//�����ϱ�(sort)
		//�󵵼� ���ϱ�
		
		
		//���հ� ���
		int sum = 0; //����
		float average = 0f; //���
		
		int[] score = {100, 88, 100, 100, 90};
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		average = sum / (float)score.length;   //�迭�� ���̷� �����ִ±�. �׸��� ����� float�� ��� ���� ����ȯ �����.
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + average);
		
		//�Ʒ��� ���� for������
//		for(int tmp : score) {
//			sum += tmp;
//		}
//		average = sum / (float)score.length;
//		System.out.println("���� : " + sum);
//		System.out.println("��� : " + average);
		
		
		
		//�����غ���
		//1.�迭�� ���� ���ϰ�
		//2.�迭�� ���̷� �����ָ� ��.
		
	}
}
