import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {

		int num = 0;
		char ch = ' ';
		String abc = "";

		Scanner scanner = new Scanner(System.in); // ���׿����ڷ�

		System.out.println("�Է�");
		String input = scanner.nextLine();

		while (true) {
			for (int i = 0; i < input.length(); i++) {
				ch = input.charAt(i);

				if ('0' <= ch && ch <= '9') {
					abc += ch;
				} else {
					System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�. �ٽ� �õ����ּ���.");
					continue;
				}
			}
			num = Integer.parseInt(abc);

			if (num == 1) {
				System.out.println("1�� �޴��� �����ϼ̽��ϴ�.");
			} else if (num == 2) {
				System.out.println("2�� �޴��� �����ϼ̽��ϴ�.");
			}
		}
	}

}
