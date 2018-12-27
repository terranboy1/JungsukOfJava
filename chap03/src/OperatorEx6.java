
public class OperatorEx6 {
	public static void main(String[] args) {
		
		byte a=10;
		byte b=20;
	//	byte c=a+b;          //arithmeticConversion.java 파일에 답이 있다. int보다 작은 것들의 연산은 자동으로 int로 형변환됨.
		                     //고로 이거슨 1) int형으로 변수선언을 해주거나, 2) byte c=(byte)(a+b); 처럼 byte로 수동형변환 해줘야함!
		                     //크기가 작은 자료형의 변수를 큰 자료형의 변수에 저장할 땐 자동 형변환 되지만
		                     //큰 자료형의 값을 작은 자료형의 변수에 저장하려 하면 형변환 연산자를 사용해 수동으로 변환해줘야 한다!
		                     //근데 수동으로 작은 타입으로 형변환하면 문제가 있으니.. 다음 예제를 보도록 하자.
		int c = a+b;
		System.out.println(c);
	}
}


// int c = a+b; 요렇게 하거나 
// byte c = (byte)(a+b); 요렇게