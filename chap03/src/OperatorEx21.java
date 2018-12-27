
public class OperatorEx21 {

	public static void main(String[] args) {
		System.out.printf("10 == 10.0f \t %b%n", 10 == 10.0f);    //타입이 달라서 큰 타입으로 변환한 다음 비교함.★ 아하. 변환 한다음에 비교하는구나.
		System.out.printf("'0'== 0 \t %b%n", '0' == 0);
		System.out.printf("'A' == 65 \t %b%n", 'A' == 65);
		System.out.printf("'A' > 'B' \t %b%n", 'A' > 'B');
		System.out.printf("'A'+1 != 'B' \t %b%n", 'A'+1 != 'B');

	}

}



//등가비교연산자 ==, != 에 대한 설명!
//대소비교 연산자와 달리 기본형은 물론 참조형, 즉 모든 자료형에 사용 가능.
//기본 자료형의 경우엔 값을 비교, 참조 자료형의 경우엔 객체의 주소값을 비교해서 '같은 객체를 가리키고 있는지' 판단한다.
//결과값은 true or false로 뿌려준다.
//자..위의 설명을 잘 보면 등가비교연산자는 객체의 주소값을 비교해서 같은 객체인지 판단한다고했다?
//이 말인즉슨 == 와 equals의 차이를 명확하게 알게 해준다?