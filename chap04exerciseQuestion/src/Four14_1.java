import java.util.Scanner;

public class Four14_1 {
	public static void main(String[] args) {  
		//1~100사이의 임의의 값을 얻어서 answer에 저장한다.
		int answer = (int)(Math.random()*100)+1;
		int input = 0;   //사용자 입력을 저장할 공간
		int count = 0;   //시도횟수를 세기위한 변수
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			count++;
			System.out.println("1과 100사이의 값을 입력하세요. :");
			input = scanner.nextInt();
			
			if(input==answer) {
				System.out.println("정답입니다!");
				System.out.println("총" + count+ "번만에 맞추셨네요^^");
				break;
			} else if(input>answer){
				System.out.println("DOWN");
			} else {
				System.out.println("UP");
			}
		} while(true); //무한 반복문	
		

	}
}
