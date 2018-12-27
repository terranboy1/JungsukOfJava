
public class FlowEx31 {

	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			if(i%3==0)
				continue;    // 조건식이 참이 되어 continue문이 수행되면 블럭 끝으로 이동. break문과 달리 반복문을 벗어나지 않는다. 자 다시, 블럭 끝으로 가서 돌아오게 되는 것이다!
							 // 3의 배수가 제외되었다.
			System.out.println(i);
		}
	}

}
