import java.util.Scanner;

public class Exercise5_1_2_2 {

	public static void main(String[] args) {
		//����5-23�� ������ �Ʒ��� ���� ����� �������� �Ͻÿ�.
		//Q1. chair�� ����? dmlwk
		//Ʋ�Ƚ��ϴ�. ������ �����Դϴ�.
		//
		//Q2. computer�� ����? ��ǻ��
		//�����Դϴ�.
		//
		//Q3. integer�� ����? ����
		//�����Դϴ�.
		//
		//��ü 3���� �� 2���� ���߼̽��ϴ�.
		
		String[][] words = { { "chair", "����" }, // words[0][0], words[0][1]
				{ "computer", "��ǻ��" }, // words[1][0], words[1][1]
				{ "integer", "����" } // words[2][0], words[2][1]
		};
		
		int count = 0; //���� ������

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s�� ����?", i + 1, words[i][0]);

			String tmp = scanner.nextLine();

			if (tmp.equals(words[i][1])) {
				System.out.printf("�����Դϴ�.%n%n");
				count++;
			} else {
				System.out.printf("Ʋ�Ƚ��ϴ�. ������ %s�Դϴ�.%n%n", words[i][1]);
			}
		}
		System.out.println("��ü "+words.length + " ���� �� " + count + " ������ ���߼̽��ϴ�.");
	}

}
