import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		int result; // 가위바위보의 결과값을 담을 변수
		int user; // 게임 시작과 종료
		int com; // 컴퓨터가 입력하는 숫자

		Scanner scanner = new Scanner(System.in);

		System.out.println("가위 바위 보 게임입니다.");
		System.out.println("가위(1) 바위(2) 보(3) 중에 숫자를 입력하세요. 0번을 누르면 종료합니다.");

		user = scanner.nextInt();
		com = (int) (Math.random() * 3) + 1;

		while (true) {
			if (user == 0) {
				System.out.println("게임을 종료합니다.");
				break;
			} else if (user >= 3 || user < -3) {
				System.out.println("올바른 값을 입력해주세요.");
				continue;
			} else {
				switch (user - com) {
				case 2:
				case -1:
					System.out.println("당신이 졌어요.");
					break;
				case 1:
				case -2:
					System.out.println("당신이 이겼어요.");
					break;
				case 0:
					System.out.println("비겼습니다.");

					break;
				}
			}
		}
	}
}
