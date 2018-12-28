
public class Exercise5_0_6 {

	public static void main(String[] args) {
		//다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제다.
		//변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지
		//계산해서 출력하라. 단, 가능한 한 적은 수의 동전으로 거슬러주어야 한다.
		//(1)에 알맞은 코드를 넣어 프로그램을 완성하시오.
		//(힌트:나눗셈 연산자와 나머지 연산자를 사용해야 함.)
		
		//큰 금액의 동전을 우선적으로 거슬러 줘야한다.
		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money="+money);
		
		for(int i=0; i<coinUnit.length; i++) {			
			//(1)요 for문 안쪽에 해답을 작성하면 됩니더.
			int count = 0;
			count = money / coinUnit[i];  //몫은 갯수와 같다.                    5
			money = money % coinUnit[i];  //나머지로 다음 연산을 진행한다.       180
		
			System.out.println(coinUnit[i]+"원 : " + count);
			
			//근데 이렇게 코드 짜면 이 문제는 해결하지만 다음 문제에서 힘들게됨.
			//만약 돈 10000원을 거슬러야되고 잔돈 다 떨어지면 거슬러줄 동전이 부족하다고 출력하려 한다면?
			
		}
	}
}
//실행결과
//money=2680
//500원 : 5
//100원 : 1
// 50원 : 1
// 10원 : 3
