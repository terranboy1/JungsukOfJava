import java.util.Scanner;

public class FlowEx32_2 {

	public static void main(String[] args) {
		String menu;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) ����");
			System.out.println("(2) ������");
			System.out.println("(3) �α�");
			System.out.println("���ϴ� �޴�(1~3)�� �����ϼ���.(����:0)>");
			
			menu = scanner.nextLine();
			
			if(menu.equals("0")) {                                       //break���� �̿��� ���α׷� ���� �޴� �����
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else if(menu.equals("1")) {
				System.out.println("�����Ͻ� �޴��� " + menu + "���Դϴ�.");  //�߸��� ���� �������� ��� �ٽ� ó������ ���������� continue��
			} else if(menu.equals("2")) {
				System.out.println("�����Ͻ� �޴��� " + menu + "���Դϴ�.");
			} else if(menu.equals("3")) {
				System.out.println("�����Ͻ� �޴��� " + menu + "���Դϴ�.");
			} else {
				System.out.println("�߸��� �Է��Դϴ�. �ùٸ� ���� �Է����ּ���.");
				continue;
			}
		}
	}
}
