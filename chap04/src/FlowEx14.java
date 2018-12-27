
public class FlowEx14 {

	public static void main(String[] args) {
//		for(int i=1, j=10; i<=10; i++, j--) {
//			System.out.printf("%d \t %d%n", i, j);
////			System.out.printf("%d %5d%n", i, j);   //이렇게 했더니 칸이 어긋나더라 ㅡ,.ㅡ;
//		}
		
		for(int i=1; i<=10; i++) {
			System.out.printf("%d \t %d%n", i, 11-i);   //이렇게 하면 같은 결과! 변수의 수가 적은 게 더 효율적이고 간단하므로 불필요한 변수 사용은 줄이는 게 좋다!
		}

	}

}
