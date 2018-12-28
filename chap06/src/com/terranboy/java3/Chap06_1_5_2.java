package com.terranboy.java3;

public class Chap06_1_5_2 {

	public static void main(String[] args) {
		//재귀호출(recursive call)
		//- 메서드 내부에서 메서드 자신을 다시 호출하는 것을 재귀호출이라 함. 재귀호출을 하는 메서드를 재귀 메서드라고 하고.
		//
		//void method() {
		//     method();    <--- 재귀호출. 메서드 자신을 호출한다.
		//}
		//어떻게 자기 자신을 호출하냐고? 메서드 입장에선 자신을 호출하든 남을 호출하든 하등 상관이 없다.
		//호출된 메서드는 call by  value을 통해 복사된 값으로 작업하기 때문에 호출한 메서드와 관계없이 독립적 작업수행 가능.
		//근데 위에 메서드처럼 재귀호출만 있으면 무한히 자기 자신만 호출해서 림보에 빠지게 된다.
		//그래서 재귀호출도 조건문이 필수적이다.
		//
		//void method(int n){
		//     if(n==0)
		//          return;   // n의 값이 0일때, 메서드를 종료
		//     System.out.println(n);
		//
		//     method(--n);   // 재귀호출. method(int n)을 호출
	    //}
		
		//(반복문이 잇는데 굳이) 재귀호출을 사용하는 이유? 바로 논리적 간결함 때문
		//복잡함을 간결하게 줄여줄 수 있기 때문에 너무 복잡하면 재귀호출을 생각해볼 수 있다.
		//but 비효율적이므로 이득이 충분히 큰 경우에만 사용.
		
		//대표적인 재귀호출의 예: 팩토리얼 구하기
		// f(n) = n * f(n-1), 단 (f(1) = 1
		
		int result = factorial(4);
		
		System.out.println(result);
	}
	
	static int factorial(int n) {
		//재귀메서드를 while문으로 작성한 것. 코드가 좀 더럽지만 스택오버플로같은 메모리 문제도 없고 속도도 빠름.
		
		int result = 1;
		while(n!=0)
			result *= n--;
		return result;
	}
}