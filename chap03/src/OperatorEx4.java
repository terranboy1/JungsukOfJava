
public class OperatorEx4 {

	public static void main(String[] args) {

		//부호연산자의 예다. +는 의미가 없고 i값에 부호연산자 -가 있으면 +가 된다.
		//부호연산자는 boolean형과 char형을 제외한 기본형에만 사용가능.
		int i= -10;
		i = +i;
		System.out.println(i);
		
		i = -10;
		i = -i;
		System.out.println(i);
	}
}


