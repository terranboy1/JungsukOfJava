
public class FlowEx16 {

	public static void main(String[] args) {
/*	
		별 5개를 찍는 방법!
		1. println() 5번!
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		
		2. for문
		for(int i=0; i<=5; i++) {
			System.out.println("*********");
		}
		
		3. 중첩 for문2(별표도 반복적인거니 반복문으로)
*/	
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=10; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		
		
		
	}
}
