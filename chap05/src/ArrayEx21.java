import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx21 {

	public static void main(String[] args) {
		// �������

		final int SIZE = 5; //������ ũ�� ����. �������� ���μ��� ���ƾ��ϱ� ������ ��� �ϳ��� ó��. (�� ������ ���������� ����� Method area�� ����ȴٴ� �� ����!)
		int x = 0, y = 0;
		int num = 0;

		int[][] bingo = new int[SIZE][SIZE];
		Scanner scanner = new Scanner(System.in);

		// �迭�� ��� ��Ҹ� 1���� SIZE*SIZE������ ���ڷ� �ʱ�ȭ
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				bingo[i][j] = i * SIZE + j + 1;   //��� ���� �ƴϸ鼭�� �𸣸� ����� �ϰڴ�.
			}
		}

		// �迭�� ����� ���� �ڼ��´�.(shuffle)
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				x = (int) (Math.random() * SIZE);
				y = (int) (Math.random() * SIZE);

				// bingo[i][j]�� ���Ƿ� ���õ� ��(bingo[x][y])�� �ٲ۴�.
				int tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;
			}
		}

		all: do {
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++)
					System.out.printf("%2d ", bingo[i][j]);
				System.out.println();
			}
			System.out.println();

			System.out.printf("1~%d�� ���ڸ� �Է��ϼ���.(����:0)>", SIZE * SIZE);
			String tmp = scanner.nextLine(); // ȭ�鿡�� �Է¹��� ������ tmp�� ����
			num = Integer.parseInt(tmp); // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ

			// �Է¹��� ���ڿ� ���� ���ڰ� ����� ��Ҹ� ã�Ƽ� 0�� ����
			outer: for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					if (bingo[i][j] == num) {
						bingo[i][j] = 0;
						break outer; // 2�� �ݺ����� �����.
					}
				}
			}

			//���� ���� ������ ���� ����ǰ� �Ϸ��� �ڵ� ��µ� ��¥ �� �巴�� ��������
			while (true) {                   
				int sum = 0;
				for (int[] tmp1 : bingo) {
					for (int i : tmp1) { 
						sum += i; 
					} 
				}
				if (sum == 0) {
					break all;
				}
				break;
			}

		} while (num != 0);
		
		//��ü �������� 0���� ����� ���
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++)
				System.out.printf("%2d ", bingo[i][j]);
			System.out.println();
		}

		System.out.println("��������� �������ϴ�! �ڵ� ����Ǿ����ϴ�.");
	} // main�� ��
}
