import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("서울에 누가 옵니까?");
		String input = scanner.nextLine();
		
		if(input.equals("현준")) {
			System.out.println("아니 현준이가 온다고? 당장 가야지");
		} else {
			System.out.println("뭐야 현준이가 아니야? ㅈㅈ 안감 ㅅㄱ");
		}
		
		

	}

}
