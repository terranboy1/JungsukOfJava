package com.terranboy.java2;

//메서드명 : isNumber
//기능 : 주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다.
//          모두 숫자로만 이루어져있으면 true 반환, 그렇지 않으면 false반환
//          만일 주어진 문자열이 null이거나 빈문자열 ""면 false 반환
//반환타입 : boolean
//매개변수 : String str - 검사할 문자열
//       힌트 : charAt


public class Exercise6_2_2_1 {

	static boolean isNumber(String str) {
		
		if(str == null || str == "")
			return false;
		
		for(int i=0; i<str.length(); i++) {
			char x = str.charAt(i);
			
			if(x<'0' || '9'<x)
				return false;
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		
		str = "1234o";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
	}
}
