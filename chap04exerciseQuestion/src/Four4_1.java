
public class Four4_1 {
	public static void main(String[] args) {
		
		// 1 + (-2) + 3 + (-4 ) .. �̷��� ���ذ��ٰ� ���� 100�� �Ǵ� ���� �����ΰ�?
		int sum = 0;
		int i = 1; // 
		int num = 0; //
		
		while(sum < 100) {
			
			if(i%2==0) {
				num = -i;
			} else {
				num = i;
			}
			
			sum += num;
			
			System.out.printf("i���� %d, sum���� %d%n", num, sum);
			
			i++;
		}
	}
}
