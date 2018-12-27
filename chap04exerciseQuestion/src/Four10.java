import java.util.Scanner;

public class Four10 {
	public static void main(String[] args) {
		
		//사용자가 입력한 숫자들에서 각 자리수들의 합을 구하는 프로그램
		int sum = 0;
		int num = 0;

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		num = Integer.parseInt(input);

		// num값이 12345일 경우

		while (num != 0) {
			sum += num % 10;
			System.out.printf("sum=%3d num=%d%n", sum, num);
			num = num / 10;
			System.out.println("각 자리수의 합 =" + sum);

		}
	}
}
