import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		int result; // ������������ ������� ���� ����
		int user; // ���� ���۰� ����
		int com; // ��ǻ�Ͱ� �Է��ϴ� ����

		Scanner scanner = new Scanner(System.in);

		System.out.println("���� ���� �� �����Դϴ�.");
		System.out.println("����(1) ����(2) ��(3) �߿� ���ڸ� �Է��ϼ���. 0���� ������ �����մϴ�.");

		user = scanner.nextInt();
		com = (int) (Math.random() * 3) + 1;

		while (true) {
			if (user == 0) {
				System.out.println("������ �����մϴ�.");
				break;
			} else if (user >= 3 || user < -3) {
				System.out.println("�ùٸ� ���� �Է����ּ���.");
				continue;
			} else {
				switch (user - com) {
				case 2:
				case -1:
					System.out.println("����� �����.");
					break;
				case 1:
				case -2:
					System.out.println("����� �̰���.");
					break;
				case 0:
					System.out.println("�����ϴ�.");

					break;
				}
			}
		}
	}
}
