
public class OperatorEx29 {

	public static void main(String[] args) {
			
		//��Ʈ��ȯ������ ~  : �� �����ڴ� �ǿ����ڸ� 2������ ǥ������ ��, 0�� 1��, 1�� 0���� �ٲ۴�. ������ ������ '!'�� ����.
		//��Ʈ��ȯ������ '~'�� ���� '��Ʈ ��ȯ' �ǰ���, ��ȣ�ִ� Ÿ���� �ǿ����ڴ� ��ȣ�� �ݴ�� ����ȴ�.
		//��, �ǿ������� '1�� ����'�� ���� �� �ִ� ��. �׷��� ��Ʈ��ȯ�����ڸ� '1�� ����'�����ڶ�� �Ѵ�.
		
		byte p =  10;
		byte n = -10;

		System.out.printf(" p  =%d \t%s%n",  p,   toBinaryString(p));   //toBinaryString(int). ���� 4����Ʈ�� 32�ڸ��� �����µ� Integer Ŭ�������� ȣ���ذ��� �� �������� ���°ű��������� ������ �˴ٴ� �ٺ��ٺ�.����
		
		System.out.printf("~p  =%d \t%s%n", ~p,   toBinaryString(~p));  // ��Ʈ��ȯ������ ~ , �������� 1�Ǻ�������
		
		System.out.printf("~p+1=%d \t%s%n", ~p+1, toBinaryString(~p+1)); //2�� ��������. �ڰ������ϱ� 2�Ǻ��� ������ ��Ʈ���꿡�� �ϴ°ſ�¨��;;
		System.out.printf("~~p =%d \t%s%n", ~~p,  toBinaryString(~~p));  //���� ����� Ÿ���� byte�� �ƴ϶� int���� ����. ��Ʈ��ȯ�����ڴ� �ǿ������� Ÿ���� int���� ������ int�� �ڵ� ����ȯ �� �����ϱ� ������ �������� 32�ڸ��� 2����.
		System.out.println();
		System.out.printf(" n  =%d%n",  n);	
		System.out.printf(" n  =%s%n",  toBinaryString(n));	//~p+1�̶� ��¡.
		System.out.printf("~(n-1)=%d%n%n%n%n", ~(n-1));          //�̺κ��� �ڹ������� 123p���� �� ����.
		
		System.out.println("p�� ~p�� Ÿ�� üũ");
		Typetester typetester = new Typetester(); //�̰� ���� p�� ~p�� Ÿ���� üũ�ϱ� ���� ������ ��ü.
		typetester.printType(p);   
		typetester.printType(~p);    //��Ʈ��ȯ�����ڵ� �����ھ�. �⺻�� ����ÿ� intŸ�Ժ��� ������ �ڵ����� intŸ������ ����ȯ �ؼ� �����ϴ°� ���� �����.
		typetester.printType(~~p);
		
		
	} // main�� ��

	// 10�� ������ 2������ ��ȯ�ϴ� �޼���
	static String toBinaryString(int x) {
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);

		return tmp.substring(tmp.length()-32);
	}
}
	
	class Typetester {
		
		void printType(byte x) {
		System.out.println(x + " is an byte");
		}
		
		void printType(int x) {
		System.out.println(x + " is an int");
		}

		void printType(float x) {
		System.out.println(x + " is an float");
		}

		void printType(double x) {
		System.out.println(x + " is an double");
		}

		void printType(char x) {
		System.out.println(x + " is an char");
		}
	}
