
public class OperatorEx19 {

	public static void main(String[] args) {
		int x = 10;
		int y = 8;
		
		System.out.printf("%d을 %d로 나누면, %n", x, y);
		System.out.printf("몫은 %d이고, 나머지는 %d입니다.%n", x/y, x%y);
	}

}


// 나머지연산자는 나눗셈에서와 마찬가지로 0을 사용할 수 없고
//피연산자로 '정수'만 허용한다. (정수 안하면 컴파일 에러뜸ㅇㅇ)
//나머지연산자는 주로 짝수, 홀수 또는 배수 검사 등에 주로 사용된다.
//나눴을 때 0이면 짝수, 1이면 홀수가 되는 것이지.
//배수는 2의 배수인지 알고 싶을땐 2로 나눴을 때 나머지가 0이 되는게 2의 배수. 이런식으로 괌.