import java.util.Scanner;

public class FlowEx26 {

	public static void main(String[] args) {
		
		//� ���� ���ذ��ٰ� ���ϴ� ���ڿ��� ���߰� �Ϸ���? �׸��� ������ �����ߴ��� �˷���? �ϴ� ���α׷�
		int i = 0;
		int num = 0;
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		num = Integer.parseInt(input);
		
		while((sum += ++i) <=num) {

			System.out.printf("%d - %d%n", i, sum);  //�� �̰� while�� �ȿ� �־ 13���� ��ű���
		}
//		System.out.printf("%d - %d%n", i, sum);  //�̰Ž� �̹� ����� ���ͺη��� 14�� �ư�..
	}

}
