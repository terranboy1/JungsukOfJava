
public class OperatorEx26 {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;

		System.out.println("1��");
		System.out.printf("a=%d, b=%d%n", a, b);
		System.out.printf("a!=0 || ++b!=0 = %b%n", a!=0 || ++b!=0);   
		System.out.printf("a=%d, b=%d%n%n", a, b);
		
		System.out.println("2��");
		System.out.printf("++b!=0 || a!=0 = %b%n", ++b!=0 || a!=0);    //����
		System.out.printf("a=%d, b=%d%n%n", a, b);
		
		System.out.println("3��");
		System.out.printf("a==0 && ++b!=0 = %b%n", a==0 && ++b!=0);
		System.out.printf("a=%d, b=%d%n%n", a, b);
		
		System.out.println("4��");
		System.out.printf("++b!=0 && a==0 = %b%n", ++b!=0 && a==0);    //����
		System.out.printf("a=%d, b=%d%n%n", a, b);
		
		System.out.println(b);
		
	}
}


// �������� ��ġ�� ���� ȿ���� �������Ŷ�!
//ù��° ������ a!=0���� �Ǵ��� ������ ������ �ڿ��� �������� ����.
//���࿡ ++b!=0�� ������ ������ �տ��� ���̱⶧���� �ڿ����� �Ǵ��Ѵ�.
//�׷��� 2,4���� ���� ����Ǿ ���������ڶ����� b���� ���ع��ȳ�!!
//2,4���� ����̳�. ���ݱ��� ������....