
public class ArrayEx6 {

	public static void main(String[] args) {
		
		//�ִ밪�� �ּҰ�
		int[] score = {79, 88, 91, 33, 100, 55, 95, 1, 100, 27, 199};
		
		int max = score[0];  //�迭�� ù��° ���� �ִ밪���� �ʱ�ȭ
		int min = score[0];  //�迭�� ù��° ���� �ּҰ����� �ʱ�ȭ
		
		for(int i=1; i<score.length; i++) {     //�迭�� �ι�° ��Һ��� �б� ���� ����i���� 1�� �ʱ�ȭ.
			if(max<score[i]) {
				max = score[i];
			} else if(min>score[i]) {
				min = score[i];
			}		
		}
		System.out.println("�ִ밪 :" + max);
		System.out.println("�ּҰ� :" + min);
	}

}
