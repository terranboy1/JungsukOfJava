import java.util.Scanner;
															//�ֹε�Ϲ�ȣ�� �Է¹޾� ������ �Ǻ��ϴ� ���α׷�.
public class FlowEx8 {
	public static void main(String[] args) {
		
		String regNo = null;  //�ֹε�Ϲ�ȣ
		char gender = ' ';   //����
		
		
		
		System.out.println("����� �ֹε�Ϲ�ȣ�� �Է��ϼ���. �� : 888888-1111111");
		
		Scanner scanner = new Scanner(System.in);
		regNo = scanner.nextLine();
		
		gender = regNo.charAt(7);  //�Է¹��� ��ȣ�� 8��° ���ڸ� gender�� ����.  ���ڿ�.charAt(index)�� ������ �� ����.
		
		switch(gender) {
		case '1':
			System.out.println("�ߺ�. ���ڽʴϴ�.");
			break;
			
		case '2':
			System.out.println("�ߺ�. ���ڽʴϴ�.");
		}
	}
}
