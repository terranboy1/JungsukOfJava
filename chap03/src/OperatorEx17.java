
public class OperatorEx17 {

	public static void main(String[] args) {
		
		//3.142를 만들어보자.
		double pi = 3.141592;
		double shortPi = (int)(pi * 1000 + 1.4) / 1000.0;     //자리올림 1이 되는 0.5~1.4까지 가능.
		// 3141.592 
		System.out.println(shortPi);
		
		//3.15를 만들어보자.
		double pi2 = 3.141592;
		double shortPi2 = (int)(pi2 * 100 + 0.9) / 100.0 ;    //자리올림 1이 되는 0.9 ~ 1.8까지 가능
		
		System.out.println(shortPi2);

	}

}
