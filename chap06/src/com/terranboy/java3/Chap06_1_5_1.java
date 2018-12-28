package com.terranboy.java3;

public class Chap06_1_5_1 {

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
		int result = 0;
		
		if(n==1)
			result = 1;
		else
			result = n * factorial(n-1);  //다시 자신의 메서드를 호출
		
		return result;
	}
}

// 만약에 n에 0을 넣으면 어떻게 될까? 예측해보자. 정답은 10줄 밑에. 꼭 스크롤 내려봅시다.















//-1 -2 -3 ... 무한히 재귀호출이 일어나서 스택에 무한히 데이터가 쌓여간다.. 그러다가 -21억 넘어가면 스택오버플로우 에러 뜸. 스택오버플로는 21억 넘어가도 마찬가지고.
//위의 스택오버플로 사례를 보듯이 메서드를 작성할 때 호출하는 사람이 적절한 값을 넣기를 기대하지 말고 적절한 값을 넣게끔 매개변수 유효성 검사를 넣어라.
//참고로 12! 이상 구하려고하면 인트타입으로는 스택오버플로 뜬다.