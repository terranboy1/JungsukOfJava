
public class arithmeticConversion {

	public static void main(String[] args) {
		int i = 10;
		float f = 20.0f;
								  
		float result = f + i;     //원래 형변환 해줘야하나, 큰 타입으로 형변환시, 형변환연산자 생략가능.
		System.out.println(result);
		
		
		
		// 5를 2로 나눈 값으로 2.5를 얻으려면? 한 쪽이 float나 double 타입이어야 함.
		int a = 5;
		double b = 5.0;
		float c = 2.0f;
		double d = 2.0;
		
		System.out.println(a/c); // float타입
		System.out.println(a/d); // double타입
		System.out.println(b/c); // double 타입
		System.out.println(b/d); // double 타입


// 이처럼 연산 전에 피연산자 타입의 일치를 위해 자동 형변환되는 것을 '산술 변환'이라 한다.
// 산술변환은 두 피연산자 중 어느 한쪽을 변환하면 큰 쪽으로 자동 형변환된다. 고러니까 한쪽 아무데나 바꾸면 된다 이말씀!

// 1. 두 피연산자의 타입을 같게 일치시킨다(보다 큰 타입으로)
// long + int -----> long + long -----> long
// float + int -----> float + float -----> float
// double + float -----> double + double -----> double

//2.피연산자의 타입이 int보다 작은 타입이면 int로 변환된다.  (이건 좀 안익숙해서 눈에 익히자)
// byte + short -----> int + int -----> int
// char + short -----> int + int -----> int
	
//3.모든 연산에서 산술변환이 일어나지만 쉬프트연산자와 증감연산자는 예외다.
		
	}

}