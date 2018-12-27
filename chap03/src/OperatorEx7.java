
public class OperatorEx7 {
	public static void main(String[] args) {
		byte a=10;
		byte b=30;
		byte c=(byte)(a*b);
		System.out.println(c);      //결과가 생각대로 안나오지?ㅋㅋ
		                            //큰 자료형을 작은 자료형으로 변환하면 data loss가 발생해 값이 바뀔 수 있다.
		                            //byte의 범위가 -128~127까지잖아. 그 이상의 수는 표현 못해.
	}
}
