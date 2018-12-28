
public class ArrayEx13 {

	public static void main(String[] args) {
		char[] hex = {'C', 'A', 'F', 'E'};
		
		String[] binary = { "0000", "0001", "0010", "0011",
							"0100", "0101", "0110", "0111",
							"1000", "1011", "1010", "1011",
							"1100", "1101", "1110", "1111" };
		
		String result="";
		
		for(int i=0; i<hex.length; i++) {
			
			//판단1:숫자냐
			if(hex[i] >='0' && hex[i]<='9') {
				result +=binary[hex[i] - '0'];   // '8' - '0'의 결과는 8. int형보다 작은 것들의 연산은 자동으로 int로 변환됨.
			} else { // 판단2:문자냐 
				result +=binary[hex[i] - 'A' + 10];  // 'C'-'A'의 결과는 2   근데 이거 10을 왜더함?;; --> 아 char타입끼리 연산하면 int형으로 바뀌고 'C'-'A'하면 정수2가 되고 + 10 하면 12. 즉 16진수로 C가 되는구나.
			}
		}
		
		                           // String(char[] value
		System.out.println("hex:"+ new String(hex));  //new String(hex)는 문자 배열을 문자열로 변환.

		System.out.println("binary:"+result);
	}

}
