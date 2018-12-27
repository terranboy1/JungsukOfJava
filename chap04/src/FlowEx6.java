import java.util.Scanner;

public class FlowEx6 {

	public static void main(String[] args) {
/*
 * 
 * 
 * 		case���� break�� �Ἥ ������ ���ִ� �� �Ϲ����̳� �ǵ������� break�� ���� ���� �� �ִ�.
		switch(level){
		   case 3 :
		       grantDelete();  ���������ֱ�
		   case 2 :
		       grantWrite();   ��������ֱ�
		   case 1 :
		       grantRead();    �б�����ֱ�
		�̷�������, ������ 3�̸� �Ʒ� ������ �� ���� �� �ְ� case���� ��ġ�� �� ����.
 * 
 * 
		switch���� ��������
		1.switch���� ���ǽ� ����� ���� �Ǵ� ���ڿ��̾����.
		2.case���� ���� ���� ����� �����ϸ� �ߺ����� �ʾƾ���.
		
		int num, result;
		final int ONE = 1;
		
		switch(result){
			case '1':       OK   ���ڻ��(���� ��� 49�� ����)
			case ONE:       OK   �������(final�� �پ����ϱ�)
			case "YES":     OK   ���ڿ���� (JDK1.7���� ���)
			case num:       ����   ���� �ȵ�
			case 1.0:       ����  �Ǽ� �ȵ�
			   .
			   .
			   .
*/	
		
		System.out.println("���� ���� �Է��ϼ���.");
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		int month = Integer.parseInt(input);
		
		switch(month) {
		
		case 3: 
		case 4: 
		case 5:
			System.out.println("3,4,5���� ���Դϴ�.");
			break;											//break�� ��������.
			
		case 6:
		case 7:
		case 8:
			System.out.println("6,7,8���� �����Դϴ�.");
			break;
			
		case 9:
		case 10:
		case 11:
			System.out.println("9,10,11���� �����Դϴ�.");
			break;
			
		case 12:
		case 1:
		case 2:
			System.out.println("12,1,2���� �ܿ��Դϴ�.");	
		}
	}
}