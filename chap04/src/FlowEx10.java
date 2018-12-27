import java.util.Scanner;

public class FlowEx10 {
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		
		System.out.println("당신의 점수를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		score = Integer.parseInt(tmp);
		
		switch(score/10) {     //이처럼 스위치문은 조건식을 잘 만들어서 case문의 갯수를 줄일 수 있고 이게 또 중요하다. (근데 이렇게하면 +인지 -인지 분간이 안되네)
		case 10: 
		case 9: 
			grade='A';
			break;
		case 8:
			grade='B';
			break;
		case 7:
			grade='C';
			break;
		default :
			grade='F';
		}
		
		System.out.println("당신의 등급은 " + grade + " 입니다.");
	}
}
