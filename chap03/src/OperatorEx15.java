
public class OperatorEx15 {

	public static void main(String[] args) {
		
		//소문자를 대문자료 변환하는 프로그램  (대문자와 소문자 간의 아스키 코드 값 차이는 10진수로 32다.)
		char lowerCase = 'a';
		char upperCase = (char)(lowerCase - 32);    // int형으로 바꼈으니까 char 타입으로 형변환 해줘야함.
		System.out.println(upperCase);
		
	}

}
