import java.util.Scanner;

public class FlowEx11 {
														// switch문의 중첩 break문 잘 써야해~
	public static void main(String[] args) {
		System.out.println("당신의 주민등록번호를 입력하세요. 예: 8907121560012");
		
		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();
		char gender = regNo.charAt(6);
		
		switch(gender) {         //중첩스위치문도 잘 쓰면 좋겠네.
			case '1': case '3':
				switch(gender) {
					case '1':
						System.out.println("당신은 2000년도 이전에 출생한 남자!");
						break;
					case '3':
						System.out.println("당신은 2000년도 이후에 출생한 남자!");
						break;
				}
			break;   //이 break문 빼먹지 않도록 주의
			
			case '2': case '4':
				switch(gender) {
					case '2':
						System.out.println("당신은 2000년도 이전에 출생한 여자!");
						break;
					case '4':
						System.out.println("당신은 2000년도 이후에 출생한 여자!");
						break;
				}
			break;
			
			default :
				System.out.println("유효하지 않은 주민등록번호 입니다.");
		}
	}
}

// 근데 프로그램 이렇게 짜면 오류가 많지.
//예상되는 오류들을 적어보자.
// 주민등록번호를 제대로 적지 않는 경우(문자를 입력한다거나 숫자를 초과, 미만으로 적는다거나, 유효하지 않은 주민등록번호를 적는다거나)
