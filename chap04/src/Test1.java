import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���￡ ���� �ɴϱ�?");
		String input = scanner.nextLine();
		
		if(input.equals("����")) {
			System.out.println("�ƴ� �����̰� �´ٰ�? ���� ������");
		} else {
			System.out.println("���� �����̰� �ƴϾ�? ���� �Ȱ� ����");
		}
		
		

	}

}
