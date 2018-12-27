package chap02;

public class Notation2 {

	public static void main(String[] args) {
		

		//16진수를 2진수로 변환하는 프로그램 만들기	(16진수를 10진수로 바꾸고, 10진수를 2진수로 바꾼다.)
//		String input2 = "AAB";
//		int b = Integer.parseInt(input2, 16);
//		System.out.println("16진수를 10진수로 변환");
//		System.out.println(b);
//		System.out.println("10진수를 2진수로 변환");
//		String c = Integer.toBinaryString(b);
//		System.out.println(c);
		
		//2진수를 16진수로 변환하기
		String a = "1502";
		int b = Integer.parseInt(a);
		String c = Integer.toHexString(b);
		System.out.println(c.toUpperCase());
		
		
	}

}
