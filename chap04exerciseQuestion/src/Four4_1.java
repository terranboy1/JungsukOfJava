
public class Four4_1 {
	public static void main(String[] args) {
		
		// 1 + (-2) + 3 + (-4 ) .. 이렇게 더해가다가 합이 100이 되는 때는 언제인가?
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
			
			System.out.printf("i값은 %d, sum값은 %d%n", num, sum);
			
			i++;
		}
	}
}
