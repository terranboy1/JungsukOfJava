import java.util.Scanner;

public class Four14_1 {
	public static void main(String[] args) {  
		//1~100������ ������ ���� �� answer�� �����Ѵ�.
		int answer = (int)(Math.random()*100)+1;
		int input = 0;   //����� �Է��� ������ ����
		int count = 0;   //�õ�Ƚ���� �������� ����
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			count++;
			System.out.println("1�� 100������ ���� �Է��ϼ���. :");
			input = scanner.nextInt();
			
			if(input==answer) {
				System.out.println("�����Դϴ�!");
				System.out.println("��" + count+ "������ ���߼̳׿�^^");
				break;
			} else if(input>answer){
				System.out.println("DOWN");
			} else {
				System.out.println("UP");
			}
		} while(true); //���� �ݺ���	
		

	}
}
