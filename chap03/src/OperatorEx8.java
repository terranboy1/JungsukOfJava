
public class OperatorEx8 {

	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 2_000_000;
		
		long c = a * b;         // longŸ���� ������ 900���ε� ����� �� ������������?
								//   ��� �����Ѵٸ� ����� ������ ������! 
		System.out.println(c);
		
		
		
		
		
		// int�� int ���� ����� long�� ����Ǳ⵵ ���� int�� �� ������ �ʰ��ߴ�! (�̰� �����ϱ� ���ٱ���)
		//�׷� �̰� ��� �ؾ��ұ�?
		int d = 1_000_000;
		int e = 2_000_000;
		
		long f = (long)d * e;   //���ʸ� ����ȯ���ָ� ���� ����Ҷ� �ڵ������ȯ�ȴ�!
		System.out.println(f);
		
		
		
		
		
		
		
	}

}


