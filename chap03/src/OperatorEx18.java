
public class OperatorEx18 {

	public static void main(String[] args) {
		
		//Math.round() 를 사용한 스마트한 반올림.
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.;
		System.out.println(shortPi);

	}

}


// round메서드는 소수점 첫째자리에서 반올림하고 그 결과를 정수로 돌려주는 메서드다.