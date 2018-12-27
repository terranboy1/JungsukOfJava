
public class OperatorEx30 {

	public static void main(String[] args) {
	/*
		쉬프트연산자 <<  >>
		이 연산자는 피연산자의 각 자리(2진수로 표현했을 때)를 '오른쪽(>>)' 또는 '왼쪽(<<)'으로 이동(shift)한다고 해서
		쉬프트 연산자(shift operator)라고 이름 붙여졌다.
		예를 들어 '8 << 2'는 왼쪽 피연산자인 10진수 8의 2진수를 왼쪽으로 2자리 이동한다.
		이때 자리이동으로 저장범위를 벗어난 값들은 버려지고 빈자리는 0으로 채워진다.
		이 과정을 그림과 함께 단계별로 살펴보면 다음과 같다.
		 	1. 10진수 8은 2진수로 '00001000' 이다.
		 	2. 8<<2 는 10진수 8의 2진수를 왼쪽으로 2자리 이동시킨다.
		             	[00]001000__
		 	3. 자리이동으로 인해 저장범위를 벗어난 값을 버려지고, 빈자리는 0으로 채워진다.
		      		  [00]    001000[00]
		           	버려짐                채워짐
		           
		 	4. 8<<2 의 결과는 2진수로 00100000이 되고 10진수로는 32가 된다.
		 
		 << 연산자의 경우, 피연산자의 부호에 상관없이 각 자리를 왼쪽으로 이동시키며 빈칸을 0으로 채우면 되지만,
		 >> 연산자는 오른쪽으로 이동시키기 때문에 부호있는 정수는 부호를 유지하기 위해 왼쪽 피연산자가 음수인 경우 빈자리를 1로 채운다.
		 물론 양수일 때는 0으로 채운다. 
		 정리하면, >>로 쉬프트연산할 때 밀어서 생긴 빈자리를 양수면 0으로채우고, 음수면 양수면 1로 채워!
		 다음의 예를 보자.
		         
		         -8>>2 ---> -2            8>>2 ---> 2
         
		         11111000                00001000
		           111110(00)              00001000    오른쪽으로 민다.
		         11111110(00)            0000001000     >>연산자시 피연산자가 음수면 빈자리를 1로, 양수면 0으로 채운다.
		         ------------           ------------
		         11111110                00000010        결과값은 8자리 깔끔하게~
		         뒤집고(1의보수) +1하면 
		         00000010이니까 2
		            부호만 - 붙이면 -2
		
		배웠다시피 쉬프트 연산자의 좌측 피연산자는 산술변환이 적용되어 int보다 작은 타입은 int타입으로 변환되어 연산결과도 int타입이 됨.
		그러나 쉬프트연산자는 다른 이항연산자들과 달리 피연산자의 타입을 일치시킬 필요가 없기 때문에 우측 피연산자에는 산술변환 적용 안됨.

		(자바의 정석 앞부분에 모든 연산에서 산술변환이 일어나지만 쉬프트연산자와 증감연산자는 예외다. 라고 적혀있었엉.)
    */
		int dec = 8;

		System.out.printf("%d >> %d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0));
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 1, dec >> 1, toBinaryString(dec >> 1));
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 2, dec >> 2, toBinaryString(dec >> 2));

		System.out.printf("%d << %d = %4d \t%s%n", dec, 0, dec << 0, toBinaryString(dec << 0));
		System.out.printf("%d << %d = %4d \t%s%n", dec, 1, dec << 1, toBinaryString(dec << 1));
		System.out.printf("%d << %d = %4d \t%s%n", dec, 2, dec << 2, toBinaryString(dec << 2));
		System.out.println();

		dec = -8;
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0));
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 1, dec >> 1, toBinaryString(dec >> 1));
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 2, dec >> 2, toBinaryString(dec >> 2));

		System.out.printf("%d << %d = %4d \t%s%n", dec, 0, dec << 0, toBinaryString(dec << 0));
		System.out.printf("%d << %d = %4d \t%s%n", dec, 1, dec << 1, toBinaryString(dec << 1));
		System.out.printf("%d << %d = %4d \t%s%n", dec, 2, dec << 2, toBinaryString(dec << 2));
		System.out.println();

		dec = 8;
		System.out.printf("%d >> %2d = %4d \t%s%n", dec, 0,  dec >> 0,  toBinaryString(dec >> 0));
		System.out.printf("%d >> %2d = %4d \t%s%n", dec, 32, dec >> 32, toBinaryString(dec >> 32));
		
		
		//간단히 생각해보면 간단한 공식이 나온다.
		// x<<n은 x * 2^n의 결과와 같다.
		// x>>n은 x / 2^n의 결과와 같다.
		
		
	} // main의 끝

	// 10진 정수를 2진수로 변환하는 메서드
	static String toBinaryString(int x) {
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);

		return tmp.substring(tmp.length()-32);
	}
}

//쉬프트연산자를 쓰는 이유는 "속도때문"이다. 곱이나 나누기 연산자와 결과는 같지만 걸리는 시간이 적다.
//그러나 개발에선 실행속도도 중요하지만 가독성도 중요하다.
//쉬프트 연산자가 곱이나 나눗셈 연산자보다 가독성이 높진 않다. 
//그래서 쉬프트 연산자보다 곱셈 또는 나눗셈 연산자를 주로 사용하고, 보다 빠른 실행속도가 요구되어지는 곳만 쉬프트 연산자를 사용하는 것이 좋다.