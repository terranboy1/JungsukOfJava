
public class FlowEx33 {

	public static void main(String[] args) {
/*	
		break문은 근접한 단 하나의 반복문만 벗어날 수 있기에, 여러 개의 반복문이 중첩된 경우에는
		break문으로 중첩 반복문을 완전히 벗어나기 힘들다. 이 때는 중첩 반복문 앞에 이름을 붙이고
		break문과 continue문에 이름을 지정해 줌으로써 하나 이상의 반복문을 벗어나거나 반복을 건너뛸 수 있다.
*/
		Loop1 : 
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(j==5)
					break Loop1;
//					break;           //하나씩 주석을 풀고 실행결과를 예측해보자.
//					continue;
				System.out.println(i+"*"+ j + "="+ i*j);
			}
			System.out.println();
		}
	}
}
