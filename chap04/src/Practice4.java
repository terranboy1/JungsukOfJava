import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {

		int num = 0; // 사용자가 입력한 숫자
		int ran = 0; // 사용자가 맞춰야하는 숫자
		boolean check = true; // 반복문을 나오기 위한 논리변수

		System.out.println("숫자 맞추기 게임입니다.");
		System.out.println("뚜껑 술게임 아시죠? 그겁니다ㅋㅋ");

		ran = (int) (Math.random() * 100) + 1; // 사용자가 맞춰야할 난수 생성

		Scanner scanner = new Scanner(System.in);

//		while(check) {
//			System.out.println("1과 100 사이의 정수를 입력하세요.");
//
//			String input = scanner.nextLine();
//			num = Integer.parseInt(input);
//			
//			if(num<ran) {
//				System.out.println("UP");
//			} else if(num>ran) {
//				System.out.println("DOWN");
//			} else if(num==ran) {
//				System.out.println("정답입니다!");
//				check = false;
//			}
//		}

		while (num != ran) {
			System.out.println("1과 100사이의 정수를 입력하세요.");
			String input = scanner.nextLine();
			num = Integer.parseInt(input);

			if (num < ran) {
				System.out.println("UP");
			} else if (num > ran) {
				System.out.println("DOWN");
			} else if (num == ran) {
				System.out.println("정답입니다!");
				break;
			}
		}
	}
}
