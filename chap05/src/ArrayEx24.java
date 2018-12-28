import java.util.Scanner;

public class ArrayEx24 {

	public static void main(String[] args) {

		// 영어단어를 입력하면 정답 유무를 알려주고, 정답이면 나머지 답들 출력. 틀렸으면 답 전부를 출력.
		// 이거 발전시켜보자.

		String[][] words = { { "당황하게하다", "embarrass", "disturb", "upset", "confuse" }, // words[0][0], words[0][1]
				{ "충분한", "adequate", "enough", "ample", "sufficient" }, // words[1][0], words[1][1]
				{ "~와 관계가 있는", "associated", "connected with" } // words[2][0], words[2][1]
		};

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s를 영어로?", i + 1, words[i][0]);

			String tmp = scanner.nextLine();

			int num = 0; // 배열 안에 일치하는 단어가 있는 갯수.(같은 뜻 1개라도 맞추면 카운트 시킬 용도)

			for (int j = 0; j < words[i].length; j++) {
				if (tmp.equals(words[i][1])) {
					num++;
				}
			}

			if (num != 0) {
				System.out.print("정답입니다.");
				for (String k : words[i]) {
					System.out.println(k);
				}
			} else if(num ==0) {
				System.out.println("틀렸습니다.");
				for (String k : words[i]) {
					System.out.println(k);
				}
			}
			
		}
	}
}
