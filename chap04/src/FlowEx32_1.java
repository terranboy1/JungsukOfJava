import java.util.Scanner;

public class FlowEx32_1 {

	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) ����");
			System.out.println("(2) ������");
			System.out.println("(3) �α�");
			System.out.println("���ϴ� �޴�(1~3)�� �����ϼ���.(����:0)>");
			
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu==0) {                                       //break���� �̿��� ���α׷� ���� �޴� �����
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else if(!(1<=menu && menu <=3)) {
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�.(����� 0)");  //�߸��� ���� �������� ��� �ٽ� ó������ ���������� continue��
				continue;
			} 
			
			System.out.println("�����Ͻ� �޴��� " + menu + "���Դϴ�.");
		}

	}

}
