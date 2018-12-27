
public class OperatorEx23 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");
		String str3 = "abc";
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
		System.out.printf(" str1==\"abc\" ? %b%n", str1=="abc");
		System.out.printf(" str2==\"abc\" ? %b%n", str2=="abc");
		System.out.printf(" str1==str3 ? %b%n", str1==str3);
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
		
	}
}


// 1. ��Ʈ���� Ŭ������ new �����ڸ� ����� ��ü�� �����ؾ� ������ String�� ���� ���̱� ������ String str1 ="abc";�� ǥ���� ����Ѵ�. but ��ü�� ������ �� �ƴϰ� ���� ���ڿ� ����� ����� ���̴�.(���� �޸� �Ҵ�.���ÿ���)
//2.���Կ����ڴ� �ּҰ��� ���Ѵ�. �׷��� �ּҰ��� ���� true�� false ������� �� �����ؾ� �Ѵ�.
//3.���ڿ��� ������ ���Ϸ��� equals()�޼��带 ����ؾ��Ѵ�. �̰� ������ ���ڿ��� �������� ���ϴϱ�.
//4.��ҹ��ڸ� �������� �ʰ� ������ ���Ϸ��� equalsIgnoreCase() �޼��带 �������.