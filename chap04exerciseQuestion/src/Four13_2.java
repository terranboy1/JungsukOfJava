
public class Four13_2 {
	public static void main(String[] args) {  
		//�̰� ���� ���� �� �����ִ� �͵��� ���ڵ��� �ո� ���ϴ� �ɷ� �����غ� ��.
		String value = "12oo354";
		char ch = ' ';
		int sum = 0;
		boolean isNumber = true;
		
		//�ݺ����� charAt(int i)�� �̿��� ���ڿ��� ���ڸ�
		//�ϳ��� �о� �˻��Ѵ�.
		for(int i=0; i<value.length(); i++) {
			ch = value.charAt(i);
			
			if('0'<ch && ch<'9') {   //���ڿ��� ���ڷ� �ɰ� '0'~'9'���̿� ���ϳ� Ȯ��.
				sum += ch - '0';
			}
		}
		System.out.println("sum="+sum);
	}
}
