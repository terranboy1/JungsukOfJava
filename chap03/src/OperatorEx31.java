
public class OperatorEx31 {
		public static void main(String[] args) {
			
			//����Ʈ �����ڿ� ��ƮAND�����ڸ� �̿��� 16������ ���������� ���ڸ��� �̾Ƴ��� ����. �ڹ������� 129p �ؼ�����.
			
			int dec  = 1234; 
			int hex  = 0xABCD;
			int mask = 0xF;

			System.out.printf("hex=%X%n", hex);
			System.out.printf("%X%n", hex & mask);
			
			hex = hex >> 4;
			System.out.printf("%X%n", hex & mask);

			hex = hex >> 4;
			System.out.printf("%X%n", hex & mask);

			hex = hex >> 4;
			System.out.printf("%X%n", hex & mask);
		} // main�� ��
	}
