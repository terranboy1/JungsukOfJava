import java.util.InputMismatchException;
import java.util.Scanner;

public class self {

	public static void main(String[] args) {
		int answer = (int)(Math.random()*100) + 1;
		int input = 0;
		int count = 0;
		
		do {
			if
			count++;
			System.out.println("1�� 100������ ���� �Է��ϼ���. :");
			
			try {
				input = new Scanner(System.in).nextInt();
			} catch(InputMismatchException e) {
				System.out.println("���ڰ� �ƴմϴ�. ��ȿ�� ���� �Է����ּ���.");
				continue;
			}
			if(answer > input) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			} else if(answer <input) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			} else {
				System.out.println("�����Դϴ�.");
				System.out.println("�õ� Ƚ����" + count+"�� �Դϴ�.");
				break;
			}
		} while(true);
	}
}
