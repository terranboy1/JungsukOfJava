
public class OperatorEx28 {

	public static void main(String[] args) {
		//��Ʈ������ & | ^ ~ << >>
		// |(OR������) - �ǿ������� �� ���� ���� 1�̸� 1�� ����� ��´�. �ϳ��� �� ������  0
		// &(AND������) - �ǿ����� �� ���� ��� 1�̾�� 1�� ����� ��´�. �ϳ��� �ٸ��� 0
		// ^(XOR������) - �ǿ������� ���� ���� �ٸ����� 1�� ����� ��´�. ������ 0
		
		//��ƮOR������ '|'�� �ַ� Ư�� ��Ʈ�� ���� ������ �� ���.(������ 4��Ʈ�� 1111 �־��� �� �ϳ� ���� 1�̾ �� 1�� �Ǵϱ� ����뵵 1011�� 1111 �ع����� �� 1111��.)
		//��ƮAND������ '&'�� �ַ� Ư�� ��Ʈ�� ���� �̾Ƴ� �� ���.(������ 4��Ʈ�� 1111�־��� �� 1�� ���� 1�� ������ 0�� ���� 0���� �����ϱ� ��Ʈ�� ���� ����. 1011�� 1111�غ��� 1011 ���γ���)
        //��ƮXOR������ '^'�� �ַ� ������ ��ȣȭ�� ���.(���� ������ �ΰ� XOR������ �����ϸ� ������ ������ ���ƿ´�. 1011�� 1111�غ��� 0100�� �ǰ� 1111 ���غ��� 1011 ���´�.)
		
		
		int x = 0xAB;
		int y = 0xF;

		System.out.printf("x = %#X \t\t%s%n", x, toBinaryString(x));
		System.out.printf("y = %#X \t\t%s%n", y, toBinaryString(y));
		System.out.printf("%#X | %#X = %#X \t%s%n", x, y, x | y, toBinaryString(x | y));
		System.out.printf("%#X & %#X = %#X \t%s%n", x, y, x & y, toBinaryString(x & y));
		System.out.printf("%#X ^ %#X = %#X \t%s%n", x, y, x ^ y, toBinaryString(x ^ y));
		System.out.printf("%#X ^ %#X ^ %#X = %#X %s%n", x, y, y, x ^ y ^ y, toBinaryString(x ^ y ^ y));
	} // main�� �� 

	// 10�� ������ 2������ ��ȯ�ϴ� �޼���. ��� �����ϴ� ����� �����Ϸ��� ���� ������ �ʿ��ϴٰ� ��. �������..����
	static String toBinaryString(int x) {
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);

		return tmp.substring(tmp.length()-32);
	}
}
