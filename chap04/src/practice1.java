import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		                                      //������ȯ����
		int score = 0;       // ����
		char grade = ' ';    // ���
		char opt = 0;        // + -
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("����� ������ �Է����ּ���.");
		String tmp = scanner.nextLine();
		score = Integer.parseInt(tmp);
	
		if(score>=90){
			grade = 'A';
		} if(score>=98) { 
			opt = '+';
		} else if(score <94) {
			opt = '-';
		}
		
		if(score>=80){
			grade = 'B';
		} if(score>=88) { 
			opt = '+';
		} else if(score <84) {
			opt = '-';
		}
		
		if(score>=70){
			grade = 'B';
		} if(score>=78) { 
			opt = '+';
		} else if(score <74) {
			opt = '-';
		}
		
		if(score<70) {
			grade = 'F';
			opt = ' ';
			System.out.println("���� ���Ѱ� ������..");
		}
		
		
		
		System.out.println("����� ������" + score + "���Դϴ�." + "����� ������ \"" + grade + opt + "\"�Դϴ�.");
		
	}
}
