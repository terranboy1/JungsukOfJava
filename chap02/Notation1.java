package chap02;

import java.util.Random;

public class Notation1 {
	public static void main(String[] args) {

		int sbin[] = new int[8];  //�ֻ�����Ʈ�� ��ȣ��Ʈ�� 8��Ʈ 2������ ���� �迭

		Random random = new Random();

		int i; // �ݺ����� ������ ���� ����

		for(i=0;i<8;i++){

			sbin[i]=random.nextInt(2);
		}

		int dec=0;  //�� �ڸ����� ���� ������ 10������ ���� ���� ���� ����

		int k;  //2���� �� �ڸ��� 10���� ���� ����� �� ����. ex)2�� 1�� = 2 / 2�� 2�� = 4

		for(i=1;i<8;i++){  //�ֻ����� ��ȣ��Ʈ�̹Ƿ� 1���� ����

			k = (int) Math.pow(2, 7-i);  //2�� �ڸ��� ������ k�� ����

			dec = dec + (k * sbin[i]);  //2������ i��° �ڸ����� 1�̶�� k�� dec�� ����
		}

		if(sbin[0]==1){  //��ȣ��Ʈ�� 1�� ���

			dec = 128 - dec;  //128(2�� 7��)���� dec�� ����

			dec = dec * (-1);  //���̳ʽ�(-)��ȣ�� �ٿ��ش�.
		}

		//���
		for(i=0;i<8;i++){

			System.out.print(sbin[i]);

		}System.out.print("(2) = " + dec + "(10)");

	}
}