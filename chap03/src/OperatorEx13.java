
public class OperatorEx13 {

	public static void main(String[] args) {
		
		//이건 내가 좀 잘 이해가 안가는데.
		char c1 = 'a';
		
//		char c2 = c1 + 1;   //수식에 변수가 들어있으면 컴파일러가 미리 계산할 수가 없음. 그래서 컴파일 에러.
		char c2 = 'a'+1;   //리터럴간의 연산. 실행 과정동안 변하는 값이 아니라서 int형으로의 형변환이 없는 것.. 위의 예제 찾아보면 다 변수*변수끼리 연산했음. 그래서 헷깔린듯.
		System.out.println(c2);

	}

}


// 이거 내가 정확히 이해를 못한건가? int형 미만의 primitive type들의 연산이여서 그런게 아니었어?
// -->> 아하, 변수가 들어있으면 컴파일러가 미리 계산을 못하지만, 리터럴끼리의 연산이면 컴파일시에 컴파일러가 덧셈연산을 수행할 수 있어서 미리 실행한다네요.