
public class OperatorEx17 {

	public static void main(String[] args) {
		
		//3.142�� ������.
		double pi = 3.141592;
		double shortPi = (int)(pi * 1000 + 1.4) / 1000.0;     //�ڸ��ø� 1�� �Ǵ� 0.5~1.4���� ����.
		// 3141.592 
		System.out.println(shortPi);
		
		//3.15�� ������.
		double pi2 = 3.141592;
		double shortPi2 = (int)(pi2 * 100 + 0.9) / 100.0 ;    //�ڸ��ø� 1�� �Ǵ� 0.9 ~ 1.8���� ����
		
		System.out.println(shortPi2);

	}

}
