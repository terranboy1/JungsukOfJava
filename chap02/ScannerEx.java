package chap02;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("아무 숫자나 입력해보세요.");
		
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.printf("당신이 입력한 숫자는 %d 입니다.", num);
	}

}
