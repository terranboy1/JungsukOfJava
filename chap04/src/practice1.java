import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		                                      //학점변환예제
		int score = 0;       // 점수
		char grade = ' ';    // 등급
		char opt = 0;        // + -
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("당신의 점수를 입력해주세요.");
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
			System.out.println("공부 안한거 같은데..");
		}
		
		
		
		System.out.println("당신의 점수는" + score + "점입니다." + "당신의 학점은 \"" + grade + opt + "\"입니다.");
		
	}
}
