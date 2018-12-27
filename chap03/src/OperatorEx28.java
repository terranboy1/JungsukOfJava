
public class OperatorEx28 {

	public static void main(String[] args) {
		//비트연산자 & | ^ ~ << >>
		// |(OR연산자) - 피연산자중 한 쪽의 값이 1이면 1을 결과로 얻는다. 하나도 안 같으면  0
		// &(AND연산자) - 피연산자 양 쪽이 모두 1이어야 1을 결과로 얻는다. 하나라도 다르면 0
		// ^(XOR연산자) - 피연산자의 값이 서로 다를때만 1을 결과로 얻는다. 같으면 0
		
		//비트OR연산자 '|'는 주로 특정 비트의 값을 변경할 때 사용.(마지막 4비트를 1111 넣었을 때 하나 값만 1이어도 다 1이 되니까 변경용도 1011에 1111 해버리면 다 1111됨.)
		//비트AND연산자 '&'는 주로 특정 비트의 값을 뽑아낼 때 사용.(마지막 4비트를 1111넣었을 때 1인 값은 1로 나오고 0인 값은 0으로 나오니까 비트가 고대로 나옴. 1011과 1111해보면 1011 고대로나옴)
        //비트XOR연산자 '^'는 주로 간단한 암호화에 사용.(같은 값으로 두고 XOR연산을 수행하면 원래의 값으로 돌아온다. 1011과 1111해보면 0100이 되고 1111 또해보면 1011 나온다.)
		
		
		int x = 0xAB;
		int y = 0xF;

		System.out.printf("x = %#X \t\t%s%n", x, toBinaryString(x));
		System.out.printf("y = %#X \t\t%s%n", y, toBinaryString(y));
		System.out.printf("%#X | %#X = %#X \t%s%n", x, y, x | y, toBinaryString(x | y));
		System.out.printf("%#X & %#X = %#X \t%s%n", x, y, x & y, toBinaryString(x & y));
		System.out.printf("%#X ^ %#X = %#X \t%s%n", x, y, x ^ y, toBinaryString(x ^ y));
		System.out.printf("%#X ^ %#X ^ %#X = %#X %s%n", x, y, y, x ^ y ^ y, toBinaryString(x ^ y ^ y));
	} // main의 끝 

	// 10진 정수를 2진수로 변환하는 메서드. 요게 동작하는 방법을 설명하려면 많은 설명이 필요하다고 함. 설명생략..ㅋㅋ
	static String toBinaryString(int x) {
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);

		return tmp.substring(tmp.length()-32);
	}
}
