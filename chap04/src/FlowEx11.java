import java.util.Scanner;

public class FlowEx11 {
														// switch���� ��ø break�� �� �����~
	public static void main(String[] args) {
		System.out.println("����� �ֹε�Ϲ�ȣ�� �Է��ϼ���. ��: 8907121560012");
		
		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();
		char gender = regNo.charAt(6);
		
		switch(gender) {         //��ø����ġ���� �� ���� ���ڳ�.
			case '1': case '3':
				switch(gender) {
					case '1':
						System.out.println("����� 2000�⵵ ������ ����� ����!");
						break;
					case '3':
						System.out.println("����� 2000�⵵ ���Ŀ� ����� ����!");
						break;
				}
			break;   //�� break�� ������ �ʵ��� ����
			
			case '2': case '4':
				switch(gender) {
					case '2':
						System.out.println("����� 2000�⵵ ������ ����� ����!");
						break;
					case '4':
						System.out.println("����� 2000�⵵ ���Ŀ� ����� ����!");
						break;
				}
			break;
			
			default :
				System.out.println("��ȿ���� ���� �ֹε�Ϲ�ȣ �Դϴ�.");
		}
	}
}

// �ٵ� ���α׷� �̷��� ¥�� ������ ����.
//����Ǵ� �������� �����.
// �ֹε�Ϲ�ȣ�� ����� ���� �ʴ� ���(���ڸ� �Է��Ѵٰų� ���ڸ� �ʰ�, �̸����� ���´ٰų�, ��ȿ���� ���� �ֹε�Ϲ�ȣ�� ���´ٰų�)
