
public class Four4_2 {
	public static void main(String[] args) {
		int sum = 0;
		int s = 1; //���� ��ȣ�� �ٲ��ִ� �� ����� ����
		int num = 0;
		
		//���ǰ��� true�̹Ƿ� ���ѹݺ�
		for(int i=1; sum<=100; i++, s=-s) {  //�� �ݺ����� s ���� 1, -1, 1, -1...
			num = s * i;                // i�� ��ȣ(s)�� ���ؼ� ���� ���� ���Ѵ�.
			sum += num;
			System.out.println("num="+num);
			System.out.println("sum="+sum);
		}
		

	}
}
