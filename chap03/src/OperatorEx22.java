
public class OperatorEx22 {

	public static void main(String[] args) {
		float f = 0.1f;
		double d = 0.1;
		double d2 = (double)f;    
		
		
		//�� �κ��� ���� �� �����ߴ�. �� ���� ����.
		System.out.printf("10.0==10.0f %b%n", 10.0==10.0f);  // 10.0�� �ڰ� 0000������
		System.out.printf("0.1==0.1f %b%n", 0.1==0.1f);      // 0.1f�� �ڰ� ��� �ִ�.0.12904821904....�̷���..
		System.out.printf("f =%19.17f%n", f);
		System.out.printf("d =%19.17f%n", d);
		System.out.printf("d2 =%19.17f%n", d2);
		System.out.println(f==d2);  //ȣ��..
	}
}


// �������� �޸� �Ǽ����� �ٻ簪���� ����ǹǷ� ������ �߻��� �� �ִ�.
// double d2 = (double)f;  floatŸ���� ���� doubleŸ������ ����ȯ�ϸ� ��ȣ�� ������ �޶����� �ʰ� ������ ���ڸ��� 0���� ä����̶� ���� �ȴ޶���.
