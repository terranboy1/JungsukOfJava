import java.util.*;

class FlowEx9_2 {
	public static void main(String[] args) { 
		int score  = 0;
		char grade = ' ';
		char opt = ' ';  //내가 등급 추가하려고 만듦

		System.out.print("당신의 점수를 입력하세요.(1~100)>");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
		score = Integer.parseInt(tmp);   // 입력받은 문자열(tmp)를 숫자로 변환

		
		//조건식이 하나여서 속도면에선 빠르지만 case문이 너무 많아져 좋지 않은 코드가 되었다.
		//반드시 속도를 더 향상시켜야 한다면 복잡하더라도 이렇게 switch문을 사용해야겠지만
		//그렇지 않다면 if문 쓰는걸 츛현.
		switch(score) {
			case 100: case 99: case 98: 
				grade = 'A';
				opt = '+';
				break;
			case 97: case 96: case 95:  case 94: 
				grade = 'A';
				opt = '0';
				break;
				
			case 93: case 92: case 91: case 90 :
				grade = 'A';
				opt = '-';
				break;

			case 89: case 88: case 87: case 86:
			case 85: case 84: case 83: case 82: case 81:
			case 80 :
				grade = 'B';
				break;
			case 79: case 78: case 77: case 76:
			case 75: case 74: case 73: case 72: case 71:
			case 70 :
				grade = 'C';
				break;
			default :
				grade = 'F';
		} // end of switch

		System.out.println("당신의 학점은 "+ grade + opt +"입니다.");
	} // main의 끝
}
