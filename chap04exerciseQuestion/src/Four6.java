
public class Four6 {
	public static void main(String[] args) {
		
		//주사위 두개를 던져서 합이 6이 되게 해는 경우의 수 출력
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if(i+j==6) {
					System.out.printf("[%d,%d]", i, j);
				}
			}
		}
	}
}
