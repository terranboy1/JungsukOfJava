import java.util.Scanner;

public class Four15_1 {
	public static void main(String[] args) {  
		//ȸ�������� üũ�ϴ� ���α׷�
		int number = 12345;
		int tmp = number;
		
		int result = 0; //���� number�� �Ųٷ� ��ȯ�ؼ� ���� ����
		
		while(tmp !=0) {
			result = result*10 + tmp % 10;
			System.out.printf("tmp=%d, result=%d%n",tmp,result);
			tmp /=10;
		}
		
		if(number == result)
			System.out.println(number + "�� ȸ���� �Դϴ�.");
		else
			System.out.println(number + "�� ȸ������ �ƴմϴ�.");
	}
}
