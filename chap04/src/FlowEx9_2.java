import java.util.*;

class FlowEx9_2 {
	public static void main(String[] args) { 
		int score  = 0;
		char grade = ' ';
		char opt = ' ';  //���� ��� �߰��Ϸ��� ����

		System.out.print("����� ������ �Է��ϼ���.(1~100)>");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // ȭ���� ���� �Է¹��� ������ tmp�� ����
		score = Integer.parseInt(tmp);   // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ

		
		//���ǽ��� �ϳ����� �ӵ��鿡�� �������� case���� �ʹ� ������ ���� ���� �ڵ尡 �Ǿ���.
		//�ݵ�� �ӵ��� �� �����Ѿ� �Ѵٸ� �����ϴ��� �̷��� switch���� ����ؾ߰�����
		//�׷��� �ʴٸ� if�� ���°� ����.
		switch(score) {
			case 100: case 99: case 98: 
				grade = 'A';
				opt = '+';
				break;
			case 97: case 96: case 95:  case 94: 
				grade = 'A';
				opt = '0';
				break;
				
			case 93: case 92: case 91: case 90 :
				grade = 'A';
				opt = '-';
				break;

			case 89: case 88: case 87: case 86:
			case 85: case 84: case 83: case 82: case 81:
			case 80 :
				grade = 'B';
				break;
			case 79: case 78: case 77: case 76:
			case 75: case 74: case 73: case 72: case 71:
			case 70 :
				grade = 'C';
				break;
			default :
				grade = 'F';
		} // end of switch

		System.out.println("����� ������ "+ grade + opt +"�Դϴ�.");
	} // main�� ��
}
