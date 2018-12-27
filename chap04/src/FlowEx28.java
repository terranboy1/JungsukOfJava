import java.util.Scanner;

public class FlowEx28 {

	public static void main(String[] args) {
	
/*
		do-while문은 기본적인 구조는 while문과 같으나 조건식과 블럭{}의 순서를 바꿔놓은 것.
		그래서 while문과 반대로 블럭{}을 먼저 수행한 후 조건을 평가.
		while문은 조건식의 결과에 따라 블럭{}이 한 번도 수행되지 않을 수 있지만
		do-while문은 최소 한 번은 수행이 보장된다.
		
		do{
		  // 조건식의 연산결과가 참일 때 수행될 문장 적기
		} while(조건식);   <--- 끝에 ';'을 잊지 않도록 주의
*/
		
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1;
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("숫자맞추기 게임입니다. 숫자를 맞춰보세요!");
		
		do {
			System.out.println("1과 100사이의 정수를 입력하세요.>");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("DOWN");
			} else if(input < answer) {
				System.out.println("UP");
			}
		} while(input != answer);
		
		System.out.println("정답입니다.");
	}
}
