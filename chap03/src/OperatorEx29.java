
public class OperatorEx29 {

	public static void main(String[] args) {
			
		//비트전환연산자 ~  : 이 연산자는 피연산자를 2진수로 표현했을 때, 0은 1로, 1은 0으로 바꾼다. 논리부정 연산자 '!'와 유사.
		//비트전환연산자 '~'에 의해 '비트 전환' 되고나면, 부호있는 타입의 피연산자는 부호가 반대로 변경된다.
		//즉, 피연산자의 '1의 보수'를 얻을 수 있는 것. 그래서 비트전환연산자를 '1의 보수'연산자라고도 한다.
		
		byte p =  10;
		byte n = -10;

		System.out.printf(" p  =%d \t%s%n",  p,   toBinaryString(p));   //toBinaryString(int). 원래 4바이트라 32자리로 나오는데 Integer 클래스에서 호출해갖고 딱 정수형만 나온거구만ㅋㅋㅋ 이제야 알다니 바봉바봉.ㅋㅋ
		
		System.out.printf("~p  =%d \t%s%n", ~p,   toBinaryString(~p));  // 비트전환연산자 ~ , 뒤집으면 1의보수구만
		
		System.out.printf("~p+1=%d \t%s%n", ~p+1, toBinaryString(~p+1)); //2의 보수구만. ★가만보니까 2의보수 개념은 비트연산에서 하는거였짢아;;
		System.out.printf("~~p =%d \t%s%n", ~~p,  toBinaryString(~~p));  //연산 결과의 타입이 byte가 아니라 int임을 주의. 비트전환연산자는 피연산자의 타입이 int보다 작으면 int로 자동 형변환 후 연산하기 때문에 연산결과는 32자리의 2진수.
		System.out.println();
		System.out.printf(" n  =%d%n",  n);	
		System.out.printf(" n  =%s%n",  toBinaryString(n));	//~p+1이랑 같징.
		System.out.printf("~(n-1)=%d%n%n%n%n", ~(n-1));          //이부분은 자바의정석 123p보면 잘 나옴.
		
		System.out.println("p와 ~p의 타입 체크");
		Typetester typetester = new Typetester(); //이건 내가 p와 ~p의 타입을 체크하기 위해 생성한 객체.
		typetester.printType(p);   
		typetester.printType(~p);    //비트전환연산자도 연산자야. 기본형 연산시에 int타입보다 작으면 자동으로 int타입으로 형변환 해서 연산하는거 공통 적용됨.
		typetester.printType(~~p);
		
		
	} // main의 끝

	// 10진 정수를 2진수로 변환하는 메서드
	static String toBinaryString(int x) {
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);

		return tmp.substring(tmp.length()-32);
	}
}
	
	class Typetester {
		
		void printType(byte x) {
		System.out.println(x + " is an byte");
		}
		
		void printType(int x) {
		System.out.println(x + " is an int");
		}

		void printType(float x) {
		System.out.println(x + " is an float");
		}

		void printType(double x) {
		System.out.println(x + " is an double");
		}

		void printType(char x) {
		System.out.println(x + " is an char");
		}
	}
