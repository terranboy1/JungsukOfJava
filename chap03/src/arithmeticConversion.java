
public class arithmeticConversion {

	public static void main(String[] args) {
		int i = 10;
		float f = 20.0f;
								  
		float result = f + i;     //���� ����ȯ ������ϳ�, ū Ÿ������ ����ȯ��, ����ȯ������ ��������.
		System.out.println(result);
		
		
		
		// 5�� 2�� ���� ������ 2.5�� ��������? �� ���� float�� double Ÿ���̾�� ��.
		int a = 5;
		double b = 5.0;
		float c = 2.0f;
		double d = 2.0;
		
		System.out.println(a/c); // floatŸ��
		System.out.println(a/d); // doubleŸ��
		System.out.println(b/c); // double Ÿ��
		System.out.println(b/d); // double Ÿ��


// ��ó�� ���� ���� �ǿ����� Ÿ���� ��ġ�� ���� �ڵ� ����ȯ�Ǵ� ���� '��� ��ȯ'�̶� �Ѵ�.
// �����ȯ�� �� �ǿ����� �� ��� ������ ��ȯ�ϸ� ū ������ �ڵ� ����ȯ�ȴ�. ���ϱ� ���� �ƹ����� �ٲٸ� �ȴ� �̸���!

// 1. �� �ǿ������� Ÿ���� ���� ��ġ��Ų��(���� ū Ÿ������)
// long + int -----> long + long -----> long
// float + int -----> float + float -----> float
// double + float -----> double + double -----> double

//2.�ǿ������� Ÿ���� int���� ���� Ÿ���̸� int�� ��ȯ�ȴ�.  (�̰� �� ���ͼ��ؼ� ���� ������)
// byte + short -----> int + int -----> int
// char + short -----> int + int -----> int
	
//3.��� ���꿡�� �����ȯ�� �Ͼ���� ����Ʈ�����ڿ� ���������ڴ� ���ܴ�.
		
	}

}