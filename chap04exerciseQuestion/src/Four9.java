
public class Four9 {
	public static void main(String[] args) {
		
		//���ڿ��� ����ִ� ���ڵ��� ���� ���Ͻÿ�.
		String str ="12345";
		int sum=0;
		
		for(int i=0; i<str.length(); i++) {
			sum += str.charAt(i) - '0';   //�̰� �ٽ��̳�. charŸ������ �ٲ㼭 '0'�� ���ִ� ��.
		}
		System.out.println("sum=" + sum);
	}
}
