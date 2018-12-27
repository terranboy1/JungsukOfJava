import java.util.Scanner;

public class FlowEx28 {

	public static void main(String[] args) {
	
/*
		do-while���� �⺻���� ������ while���� ������ ���ǽİ� ��{}�� ������ �ٲ���� ��.
		�׷��� while���� �ݴ�� ��{}�� ���� ������ �� ������ ��.
		while���� ���ǽ��� ����� ���� ��{}�� �� ���� ������� ���� �� ������
		do-while���� �ּ� �� ���� ������ ����ȴ�.
		
		do{
		  // ���ǽ��� �������� ���� �� ����� ���� ����
		} while(���ǽ�);   <--- ���� ';'�� ���� �ʵ��� ����
*/
		
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1;
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("���ڸ��߱� �����Դϴ�. ���ڸ� ���纸����!");
		
		do {
			System.out.println("1�� 100������ ������ �Է��ϼ���.>");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("DOWN");
			} else if(input < answer) {
				System.out.println("UP");
			}
		} while(input != answer);
		
		System.out.println("�����Դϴ�.");
	}
}
