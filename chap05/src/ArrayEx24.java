import java.util.Scanner;

public class ArrayEx24 {

	public static void main(String[] args) {

		// ����ܾ �Է��ϸ� ���� ������ �˷��ְ�, �����̸� ������ ��� ���. Ʋ������ �� ���θ� ���.
		// �̰� �������Ѻ���.

		String[][] words = { { "��Ȳ�ϰ��ϴ�", "embarrass", "disturb", "upset", "confuse" }, // words[0][0], words[0][1]
				{ "�����", "adequate", "enough", "ample", "sufficient" }, // words[1][0], words[1][1]
				{ "~�� ���谡 �ִ�", "associated", "connected with" } // words[2][0], words[2][1]
		};

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s�� �����?", i + 1, words[i][0]);

			String tmp = scanner.nextLine();

			int num = 0; // �迭 �ȿ� ��ġ�ϴ� �ܾ �ִ� ����.(���� �� 1���� ���߸� ī��Ʈ ��ų �뵵)

			for (int j = 0; j < words[i].length; j++) {
				if (tmp.equals(words[i][1])) {
					num++;
				}
			}

			if (num != 0) {
				System.out.print("�����Դϴ�.");
				for (String k : words[i]) {
					System.out.println(k);
				}
			} else if(num ==0) {
				System.out.println("Ʋ�Ƚ��ϴ�.");
				for (String k : words[i]) {
					System.out.println(k);
				}
			}
			
		}
	}
}
