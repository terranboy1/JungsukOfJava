import java.util.Scanner;

public class FlowEx25 {

	public static void main(String[] args) {
		int num = 0, sum = 0;
		System.out.print("���ڸ� �Է��ϼ���.(��:12345)>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp);
		
		while(num!=0) {
			//num�� 10���� ���� �������� sum�� ����
			sum += num%10;     // sum = sum + num%10;
			System.out.printf("sum=%3d num=%d%n",sum, num);
			
			num /= 10;  // num = num / 10; num�� 10���� ���� ���� �ٽ� num�� ����
		}
		System.out.println("�� �ڸ����� ��:"+sum);
	}

}

//�ڸ��� �� ���Ҷ��� �������鼭 �������� ���ذ��� �Ǵ±���~
//�������� ���� ���� sum�� �����ϰ� ������ ���� ���� num���� �ؼ� ������ ������.