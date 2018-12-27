
public class FlowEx23 {
	public static void main(String[] args) {
/*
		for문을 while문으로 바꿔보자.
		
		for(int i=1; i<=10; i++) {       //for문이 더 칸결하죠.
			System.out.print(i);
		}
		System.out.println("");
		
		
		int i = 1;
		while(i<=10) {                   //while문의 조건식이 참일때만 발동합니다~
			System.out.print(i);
			i++;
		}
		System.out.println("");
*/
		int i = 5;
		
		while(i-- != 0) {                //증감연산자를 조건에 넣을 수 있구나.
			System.out.println(i + " - I can do it.");
		}
		
	}
}
