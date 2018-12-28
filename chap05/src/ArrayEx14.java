
public class ArrayEx14 {

	public static void main(String[] args) {
		//char배열과 String클래스
		//지금까지 여러 문자, 즉 문자열을 저장할 때 String타입의 변수를 사용했다.
		//사실 문자열이라는 용어는 '문자를 연이어 늘어놓은 것'을 의미하므로 문자배열인 char배열과 같은 뜻이다.
		//근데 자바에서 char배열이 아닌 String클래스를 이용해 문자열을 처리하는 이유는
		//String클래스가 char배열에 '여러 가지 기능을 추가하여 확장한 것이기 때문'.
		//String클래스 = char배열 + 기능(메서드) 로 요약할 수 있겠다.
		//C언어에서는 문자열을 char배열로 다루지만, 객체지향언어인 자바에서는 char배열과 그에 관련된 기능들을
		//함께 묶어서 클래스에 정의한다.
		//객체지향개념이 나오기 이전의 언어들은 데이터와 기능을 따로 다루었지만, 객체지향언어에서는 데이터와 그에 관련된 기능을
		//하나의 클래스에 묶어서 다룰 수 있게 한다. 즉, 서로 관련된 것들끼리 데이터와 기능을 구분하지 않고 함께 묶는 것.
        //char배열과 String클래스의 한 가지 중요한 차이가 있는데, String객체(문자열)는 읽을 수만 있을 뿐 내용 변경이 불가능!
		
		//String str = "Java";
		//str = str + "8";           //"Java8"이라는 새로운 문자열이 str에 저장된다.
		//System.out.println(str);   //"Java8"
		//아하, 문자열 str의 내용이 변경되는 것 같지만, 문자열 변경이 아니고 새로운 내용의 문자열이 생성된다.
		//(변경 가능한 문자열을 다루려면 StringBuffer클래스 사용해야 함)
		
		//String클래스의 주요 메서드
		//-------------------------
		//String클래스는 상당히 많은 문자열 관련 메서드들을 제공하지만 지금은 가장 기본적인 몇 가지만 살펴보고
		//나머지는 9장에서 자세히 다룬다. 원하는 결과를 얻으려면 어떻게 코드를 작성해야하는지에 집중하자.
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//                메서드                                           ㅣ                            설명
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// char charAt(int index)               ㅣ   문자열에서 해당 위치(index)에 있는 문자 반환
		// int length()                         ㅣ   문자열의 길이 반환
		// String substring(int from, int to)   ㅣ   문자열에서 해당 범위(from~to)에 있는 문자열 반환. to는 범위에 포함 안됨
		// boolean equals(String str)           ㅣ   문자열의 내용이 같은지 확인. 같으면 true, 틀리면 false
		// char[] toCharArray()                 ㅣ   문자열을 문자배열(char[])로 변환해서 반환.
		
		
		//charAt
//		String a = "abcdef";
//		char aa = a.charAt(1);
//		System.out.println(aa);  //b 출력
//		
//		//substring
//		String b = "abcdef";
//		System.out.println(b.substring(0, 5));  //abcde 출력
//		
//		//equals
//		String c = "abc";
//		if(c.equals("abc")) {    // true
//			System.out.println("TRUE");
//		} else {
//			System.out.println("FALSE");
//		}
//		
//		//char배열과 String클래스의 변환
//		
//		char[] d = {'A', 'B', 'C'};
//		String e = new String(d);   //char배열 --> String
//		char[] f = e.toCharArray(); //String --> char배열
//		
//		System.out.println(e);  //ABC
//		System.out.println(f);  //ABC
		
		String src = "ABCDE";
		for(int i=0; i<src.length(); i++) {
			char ch = src.charAt(i);
			System.out.println("src.charAt("+i+"):" + ch);
		}
		
		//String을 char[]로 변환
		char[] chArr = src.toCharArray();
		
		//char배열(char[])을 출력
		System.out.println(chArr);   //char배열은 println으로 출력해도 바로 나오는거 알지~~? 다른건 주소값나와유.
		
		
		
		
	}

}
