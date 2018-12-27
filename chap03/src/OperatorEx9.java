
public class OperatorEx9 {

	public static void main(String[] args) {
		long a = 1000000 * 1000000;
		long b = 1000000 * 1000000L;
		
		//요것은 값이 어떻게될까?
		System.out.println("a=" + a);                
		System.out.println("b=" + b);
		
		
		
		// 응 이미 a는 int끼리 연산해서 int허용치 넘었어~ 넘은 상태에서 저장해봐야 소용없어 응~없어~ㅋㅋ
		// 이것도 전 예제와 마찬가지로 하나는 형변환 해서 산술변환 일어나게 해야함~ㅋ 싫으면 2개다 형변환~ㅋㅋㅋ
	}

}
