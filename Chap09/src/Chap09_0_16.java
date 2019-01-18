
import java.util.StringJoiner;

public class Chap09_0_16 {
	public static void main(String[] args) throws Exception {
		int iVal = 100;
		String strVal = String.valueOf(iVal); //int를 String으로 변환
		
		double dVal = 200.0;
		String strVal2 = dVal + ""; //빈문자열 더해줘도 String으로 변환
		
		double sum = Integer.parseInt("+"+strVal) + Double.parseDouble(strVal2);
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
		System.out.println(String.join("",strVal,"+",strVal2,"=")+sum);
		System.out.println(strVal+"+"+strVal2+"="+sum2);
	}
}
