import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {

		int num = 0; // ����ڰ� �Է��� ����
		int ran = 0; // ����ڰ� ������ϴ� ����
		boolean check = true; // �ݺ����� ������ ���� ������

		System.out.println("���� ���߱� �����Դϴ�.");
		System.out.println("�Ѳ� ������ �ƽ���? �װ̴ϴ٤���");

		ran = (int) (Math.random() * 100) + 1; // ����ڰ� ������� ���� ����

		Scanner scanner = new Scanner(System.in);

//		while(check) {
//			System.out.println("1�� 100 ������ ������ �Է��ϼ���.");
//
//			String input = scanner.nextLine();
//			num = Integer.parseInt(input);
//			
//			if(num<ran) {
//				System.out.println("UP");
//			} else if(num>ran) {
//				System.out.println("DOWN");
//			} else if(num==ran) {
//				System.out.println("�����Դϴ�!");
//				check = false;
//			}
//		}

		while (num != ran) {
			System.out.println("1�� 100������ ������ �Է��ϼ���.");
			String input = scanner.nextLine();
			num = Integer.parseInt(input);

			if (num < ran) {
				System.out.println("UP");
			} else if (num > ran) {
				System.out.println("DOWN");
			} else if (num == ran) {
				System.out.println("�����Դϴ�!");
				break;
			}
		}
	}
}
