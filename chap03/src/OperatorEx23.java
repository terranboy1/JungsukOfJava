
public class OperatorEx23 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");
		String str3 = "abc";
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
		System.out.printf(" str1==\"abc\" ? %b%n", str1=="abc");
		System.out.printf(" str2==\"abc\" ? %b%n", str2=="abc");
		System.out.printf(" str1==str3 ? %b%n", str1==str3);
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
		
	}
}


// 1. 스트링은 클래스라 new 연산자를 사용해 객체를 생성해야 하지만 String은 자주 쓰이기 떄문에 String str1 ="abc";의 표현을 허용한다. but 객체를 생성한 건 아니고 단지 문자열 상수를 담았을 뿐이다.(정적 메모리 할당.스택영역)
//2.대입연산자는 주소값을 비교한다. 그래서 주소값에 따라 true나 false 결과값을 잘 생각해야 한다.
//3.문자열의 내용을 비교하려면 equals()메서드를 사용해야한다. 이건 오로지 문자열의 내용으로 비교하니까.
//4.대소문자를 구분하지 않고 내용을 비교하려면 equalsIgnoreCase() 메서드를 사용하자.