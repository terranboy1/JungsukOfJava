import java.util.Scanner;

public class Four15_2 {
	public static void main(String[] args) {  
		int number = 12321;
		int tmp = number;
		String abc="";
		String bcd ="";
		
		int result = 0; //���� number�� �Ųٷ� ��ȯ�ؼ� ���� ����
		
		while(tmp !=0) {
			abc =tmp % 10 + "";
			bcd += abc;
			tmp /=10;
		}
		
		result = Integer.parseInt(bcd);
		
		if(number == result)
			System.out.println(number + "�� ȸ���� �Դϴ�.");
		else
			System.out.println(number + "�� ȸ������ �ƴմϴ�.");
	}
}
