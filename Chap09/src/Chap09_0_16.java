
import java.util.StringJoiner;

public class Chap09_0_16 {
	public static void main(String[] args) throws Exception {
		int iVal = 100;
		String strVal = String.valueOf(iVal); //int�� String���� ��ȯ
		
		double dVal = 200.0;
		String strVal2 = dVal + ""; //���ڿ� �����൵ String���� ��ȯ
		
		double sum = Integer.parseInt("+"+strVal) + Double.parseDouble(strVal2);
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
		System.out.println(String.join("",strVal,"+",strVal2,"=")+sum);
		System.out.println(strVal+"+"+strVal2+"="+sum2);
	}
}
