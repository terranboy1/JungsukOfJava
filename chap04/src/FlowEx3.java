import java.util.Scanner;

public class FlowEx3 {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		score = Integer.parseInt(input);
		
		if(score>=90)
			grade = 'A';
		
		else if(score>=80)
			grade = 'B';
		
		else if(score>=70)
			grade = 'C';
		
		else
			grade = 'D';	
		
		System.out.println("����� ������" +grade +"�Դϴ�.");
	}

}
