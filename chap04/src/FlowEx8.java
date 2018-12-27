import java.util.Scanner;
															//주민등록번호를 입력받아 성별을 판별하는 프로그램.
public class FlowEx8 {
	public static void main(String[] args) {
		
		String regNo = null;  //주민등록번호
		char gender = ' ';   //성별
		
		
		
		System.out.println("당신의 주민등록번호를 입력하세요. 예 : 888888-1111111");
		
		Scanner scanner = new Scanner(System.in);
		regNo = scanner.nextLine();
		
		gender = regNo.charAt(7);  //입력받은 번호의 8번째 문자를 gender에 저장.  문자열.charAt(index)로 가져올 수 있음.
		
		switch(gender) {
		case '1':
			System.out.println("삐빅. 남자십니다.");
			break;
			
		case '2':
			System.out.println("삐빅. 여자십니다.");
		}
	}
}
