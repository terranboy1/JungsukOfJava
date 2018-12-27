import java.util.Scanner;

public class FlowEx6 {

	public static void main(String[] args) {
/*
 * 
 * 
 * 		case마다 break를 써서 구분을 해주는 게 일반적이나 의도적으로 break를 쓰지 않을 수 있다.
		switch(level){
		   case 3 :
		       grantDelete();  삭제권한주기
		   case 2 :
		       grantWrite();   쓰기권한주기
		   case 1 :
		       grantRead();    읽기권한주기
		이런식으로, 레벨이 3이면 아래 권한을 다 가질 수 있게 case문을 배치할 수 있음.
 * 
 * 
		switch문의 제약조건
		1.switch문의 조건식 결과는 정수 또는 문자열이어야함.
		2.case문의 값은 정수 상수만 가능하며 중복되지 않아야함.
		
		int num, result;
		final int ONE = 1;
		
		switch(result){
			case '1':       OK   문자상수(정수 상수 49와 동일)
			case ONE:       OK   정수상수(final이 붙었으니깐)
			case "YES":     OK   문자열상수 (JDK1.7부터 허용)
			case num:       에러   변수 안됨
			case 1.0:       에러  실수 안됨
			   .
			   .
			   .
*/	
		
		System.out.println("현재 월을 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		int month = Integer.parseInt(input);
		
		switch(month) {
		
		case 3: 
		case 4: 
		case 5:
			System.out.println("3,4,5월은 봄입니다.");
			break;											//break문 빼먹지망.
			
		case 6:
		case 7:
		case 8:
			System.out.println("6,7,8월은 여름입니다.");
			break;
			
		case 9:
		case 10:
		case 11:
			System.out.println("9,10,11월은 가을입니다.");
			break;
			
		case 12:
		case 1:
		case 2:
			System.out.println("12,1,2월은 겨울입니다.");	
		}
	}
}