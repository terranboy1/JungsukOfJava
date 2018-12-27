
public class OperatorEx10 {
	public static void main(String[] args) {
		int a = 1000000;
		
		int result1 = a * a / a;       //이건 전에 배운 내용 잘 숙지했으면 느낌이 오는 문제네.
		int result2 = a / a * a;
		
		System.out.printf("%d * %d /%d = %d%n", a, a, a, result1);
		System.out.printf("%d / %d * %d = %d%n", a, a, a, result2);
	}
}


//이미 오버플로우가 발생했는데 나눠봐야 뭔소용?ㅠㅠ
// 타입만 보는게 아니라 연산의 순서도 고려해야 식의 올바른 값을 구할 수 있다는 게 교훈이다!