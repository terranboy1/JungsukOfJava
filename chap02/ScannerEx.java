package chap02;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�ƹ� ���ڳ� �Է��غ�����.");
		
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.printf("����� �Է��� ���ڴ� %d �Դϴ�.", num);
	}

}
