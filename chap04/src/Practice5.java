import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {

		int num = 0;
		char ch = ' ';
		String abc = "";

		Scanner scanner = new Scanner(System.in); // 삼항연산자로

		System.out.println("입력");
		String input = scanner.nextLine();

		while (true) {
			for (int i = 0; i < input.length(); i++) {
				ch = input.charAt(i);

				if ('0' <= ch && ch <= '9') {
					abc += ch;
				} else {
					System.out.println("잘못된 값을 입력하셨습니다. 다시 시도해주세요.");
					continue;
				}
			}
			num = Integer.parseInt(abc);

			if (num == 1) {
				System.out.println("1번 메뉴를 선택하셨습니다.");
			} else if (num == 2) {
				System.out.println("2번 메뉴를 선택하셨습니다.");
			}
		}
	}

}
