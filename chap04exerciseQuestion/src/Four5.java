
public class Four5 {
	public static void main(String[] args) {
		
		int i=0;
		
		
//		for (int i = 0; i <= 10; i++) {
//			for (int j = 0; j <= i; j++)
//				System.out.print("*");
//			System.out.println();
//		}
		
		while(i<=10) {
			int j=0;          //��ȫ ���������� �ϸ� �ǰٱ���.
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println();
		}
	}
}
