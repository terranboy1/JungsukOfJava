package com.terranboy.java3;

public class Chap06_2_2 {

	public static void main(String[] args) {
		//가변인자(varargs)와 오버로딩
		//-----------------------------------------------------------
		//기존엔 메서드의 매개변수 개수가 고정적이었으나 JDK1.5부터 동적 지정 가능해짐.
		//이 기능을 가변인자(variable arguments)라 함.
		//public PrintStream printf(String format, Object... args){...}
		//위와같이 가변인자 외에도 매개변수가 더 있다면 마지막에 선언해야 한다.(안그러면 컴파일 에러)
		//public PrintStream printf(Object... args, String format){...} // 에러!!XXXXXX
		//public PrintStream printf(String format, Object... args){...} // OK    OOOOOO
		//
		//만약 여러 문자열을 하나로 결합해 반환하는 concatenate메서드를 작성해야 한다면 아래처럼 작성해야 할 것이다.
		//String concatenate(String s1, String s2){...}
		//String concatenate(String s1, String s2, String s3){...}
		//String concatenate(String s1, String s2, String s3, String s4){...}
		//이렇게 매개변수 갯수에 따라 따로따로 선언해주는데 매우 비효율이다.
		//이럴 때 가변인자를 써서 아래처럼 메서드 하나로 간단 교체!
		//String concatenate(String... str){...}
		//그럼 아래처럼 사용할 수 있따.
		//
		//System.out.println(concatenate());    //인자 없음
		//System.out.println(concatenate("a")); //인자 하나
		//System.out.println(concatenate("a", "b")); //인자 둘
		//System.out.println(concatenate(new String[]{"A","B")); //배열도 가능
		//
		//이쯤에서 눈치챈 사람도 있을텐데 가변인자는 내부적으로 배열을 이용하는 것이다.
		//그래서 가변인자가 선언된 메서드를 호출할 때마다 새로운 배열이 생성된다.
		//가변인자가 편리하지만, 이런 비효율이 숨어있으므로 꼭 필요한 경우에만 사용하도록 하자.
		//
		//
		//그럼 가변인자는 아래와 같이 매개변수의 타입을 배열로 하는 것과 어떤 차이가 있을까?
		//String concatenate(String[] str){...}
		//
		//String result = concatenate(new String[0]);  //인자를 배열로 지정. 이걸 무조건 써줘야되니까 비효율.
		//String result = concatenate(null);           //인자로 null을 지정
		//String result = concatenate();               //에러! 인자 필요.
		//
		//매개변수의 타입을 배열로 하면 반드시 인자를 지정해줘야 하기 때문에 위 코드에서처럼 인자를 생략할 수 없다.
		//그래서 null이나 길이가 0인 배열을 인자로 지정해줘야하는 불편함이 있다.(C언어와 달리 자바에선 길이가 0인 배열을 생성하는 것이 허용됨)
		//
		//가변인자를 오버로딩할 때 한 가지 주의할 점이 있는데, 아래 예제를 보도록 하자.
		
		String[] strArr = {"100", "200", "300"};
		
		System.out.println(concatenate("", "100", "200", "300"));
		System.out.println(concatenate("-", strArr));
		System.out.println(concatenate(",", new String[] {"1","2","3"}));
		System.out.println("["+concatenate(",", new String[0])+"]");
		System.out.println("["+concatenate(",")+"]");
	}
	
	static String concatenate(String delim, String... args) {
		String result = "";
		
		for(String str : args) {
			result += str + delim;
		}
		
		return result;
	}
	
	/*
	 * static String concatenate(String... args){             //요거 주석풀면 reference to concatenate is ambiguous 에러남. 위의 메서드랑 구분이 안되어서 발생함. 이런 경우가 종종 있어서 가변인자 오버로딩은 안하는 걸 추천한다고 한다.
	 * 	  return concatenate("", args);
	*/
}
