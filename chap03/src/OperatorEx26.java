
public class OperatorEx26 {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;

		System.out.println("1번");
		System.out.printf("a=%d, b=%d%n", a, b);
		System.out.printf("a!=0 || ++b!=0 = %b%n", a!=0 || ++b!=0);   
		System.out.printf("a=%d, b=%d%n%n", a, b);
		
		System.out.println("2번");
		System.out.printf("++b!=0 || a!=0 = %b%n", ++b!=0 || a!=0);    //주의
		System.out.printf("a=%d, b=%d%n%n", a, b);
		
		System.out.println("3번");
		System.out.printf("a==0 && ++b!=0 = %b%n", a==0 && ++b!=0);
		System.out.printf("a=%d, b=%d%n%n", a, b);
		
		System.out.println("4번");
		System.out.printf("++b!=0 && a==0 = %b%n", ++b!=0 && a==0);    //주의
		System.out.printf("a=%d, b=%d%n%n", a, b);
		
		System.out.println(b);
		
	}
}


// 논리연산자 배치에 따른 효율을 느껴보거라!
//첫번째 문제는 a!=0에서 판단이 끝났기 때문에 뒤에껄 수행하지 않음.
//만약에 ++b!=0을 앞으로 꺼내면 앞에께 참이기때문에 뒤에꺼도 판단한다.
//그래서 2,4번은 식이 수행되어서 전위연산자때문에 b값이 변해버렸네!!
//2,4번이 충격이네. 지금까지 몰랐어....