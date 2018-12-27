package chap02;

public class casting {

	public static void main(String[] args) {
		
		int a = 91234567;
		float b = (float)a;  //정밀도가 7자리라 마지막 8자리째 수가 근사치가 되부러쓰
		int c = (int)b;      //이미 근사치가 되부러서 되돌려도 1이 증가되버려쓰
                             //이래서 double로 해야한당께
		                     //이거슨 기억해두면 언젠가 함정을 피할 수 있을 거 같쓰
		
		System.out.println(a);
		System.out.println(c);
		
		
		int d = (int)3.14;
		System.out.println(d);
		
		int a1 = 123456789;
		float b1 = (float)a1;
		

	}

}
