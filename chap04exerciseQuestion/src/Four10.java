import java.util.Scanner;

public class Four10 {
	public static void main(String[] args) {
		
		//����ڰ� �Է��� ���ڵ鿡�� �� �ڸ������� ���� ���ϴ� ���α׷�
		int sum = 0;
		int num = 0;

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		num = Integer.parseInt(input);

		// num���� 12345�� ���

		while (num != 0) {
			sum += num % 10;
			System.out.printf("sum=%3d num=%d%n", sum, num);
			num = num / 10;
			System.out.println("�� �ڸ����� �� =" + sum);

		}
	}
}
