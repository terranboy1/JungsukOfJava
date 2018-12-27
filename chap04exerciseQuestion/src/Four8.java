
public class Four8 {
	public static void main(String[] args) {
		
		
		//2x+4y=10 이 되게하는 x와 y의 경우의 수  출력
		for(int x=0; x<=10; x++) {
			for(int y=0; y<=10; y++) {
				if(2*x+4*y==10) {
					System.out.printf("x=%d, y=%d%n",x,y);
				}
			}
		}
			//실행결과
			// x=1, y=2
			// x=3, y=1
			// x=5, y=0
	}
}
