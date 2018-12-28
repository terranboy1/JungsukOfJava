import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx21 {

	public static void main(String[] args) {
		// 빙고게임

		final int SIZE = 5; //빙고판 크기 지정. 빙고판은 가로세로 같아야하기 때문에 상수 하나로 처리. (이 문제와 연관없지만 상수는 Method area에 저장된다는 거 복습!)
		int x = 0, y = 0;
		int num = 0;

		int[][] bingo = new int[SIZE][SIZE];
		Scanner scanner = new Scanner(System.in);

		// 배열의 모든 요소를 1부터 SIZE*SIZE까지의 숫자로 초기화
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				bingo[i][j] = i * SIZE + j + 1;   //요게 별거 아니면서도 모르면 고생좀 하겠다.
			}
		}

		// 배열에 저장된 값을 뒤섞는다.(shuffle)
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				x = (int) (Math.random() * SIZE);
				y = (int) (Math.random() * SIZE);

				// bingo[i][j]와 임의로 선택된 값(bingo[x][y])을 바꾼다.
				int tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;
			}
		}

		all: do {
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++)
					System.out.printf("%2d ", bingo[i][j]);
				System.out.println();
			}
			System.out.println();

			System.out.printf("1~%d의 숫자를 입력하세요.(종료:0)>", SIZE * SIZE);
			String tmp = scanner.nextLine(); // 화면에서 입력받은 내용을 tmp에 저장
			num = Integer.parseInt(tmp); // 입력받은 문자열(tmp)를 숫자로 변환

			// 입력받은 숫자와 같은 숫자가 저장된 요소를 찾아서 0을 저장
			outer: for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					if (bingo[i][j] == num) {
						bingo[i][j] = 0;
						break outer; // 2중 반복문을 벗어난다.
					}
				}
			}

			//빙고 게임 끝나면 게임 종료되게 하려고 코드 썼는데 진짜 개 드럽다 ㅋㅋㅋㅋ
			while (true) {                   
				int sum = 0;
				for (int[] tmp1 : bingo) {
					for (int i : tmp1) { 
						sum += i; 
					} 
				}
				if (sum == 0) {
					break all;
				}
				break;
			}

		} while (num != 0);
		
		//전체 빙고판을 0으로 만들어 출력
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++)
				System.out.printf("%2d ", bingo[i][j]);
			System.out.println();
		}

		System.out.println("빙고게임이 끝났습니다! 자동 종료되었습니다.");
	} // main의 끝
}
