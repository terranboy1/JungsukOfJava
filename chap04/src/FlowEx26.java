import java.util.Scanner;

public class FlowEx26 {

	public static void main(String[] args) {
		
		//어떤 수를 더해가다가 원하는 숫자에서 멈추게 하려면? 그리고 어디까지 연산했는지 알려면? 하는 프로그램
		int i = 0;
		int num = 0;
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		num = Integer.parseInt(input);
		
		while((sum += ++i) <=num) {

			System.out.printf("%d - %d%n", i, sum);  //아 이게 while문 안에 있어서 13까지 뜬거구나
		}
//		System.out.printf("%d - %d%n", i, sum);  //이거슨 이미 결과가 나와부러서 14가 됐고..
	}

}
