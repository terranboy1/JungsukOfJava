
public class ArrayEx13 {

	public static void main(String[] args) {
		char[] hex = {'C', 'A', 'F', 'E'};
		
		String[] binary = { "0000", "0001", "0010", "0011",
							"0100", "0101", "0110", "0111",
							"1000", "1011", "1010", "1011",
							"1100", "1101", "1110", "1111" };
		
		String result="";
		
		for(int i=0; i<hex.length; i++) {
			
			//�Ǵ�1:���ڳ�
			if(hex[i] >='0' && hex[i]<='9') {
				result +=binary[hex[i] - '0'];   // '8' - '0'�� ����� 8. int������ ���� �͵��� ������ �ڵ����� int�� ��ȯ��.
			} else { // �Ǵ�2:���ڳ� 
				result +=binary[hex[i] - 'A' + 10];  // 'C'-'A'�� ����� 2   �ٵ� �̰� 10�� �ִ���?;; --> �� charŸ�Գ��� �����ϸ� int������ �ٲ�� 'C'-'A'�ϸ� ����2�� �ǰ� + 10 �ϸ� 12. �� 16������ C�� �Ǵ±���.
			}
		}
		
		                           // String(char[] value
		System.out.println("hex:"+ new String(hex));  //new String(hex)�� ���� �迭�� ���ڿ��� ��ȯ.

		System.out.println("binary:"+result);
	}

}
