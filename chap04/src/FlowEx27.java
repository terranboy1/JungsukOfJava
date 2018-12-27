import java.util.Scanner;

public class FlowEx27 {

	public static void main(String[] args) {
		int num;
		int sum = 0;
		boolean flag = true;
		
		System.out.println("합계를 구할 숫자를 입력하세요.(끝내려면 0을 입력)");
		
		while(flag) {
			System.out.println(">>");
			
			Scanner scanner = new Scanner(System.in);
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
			
			if(num!=0) {         //입력받고 끝을 낼 때 어떻게 처리하는지 잘 봐두자.
				sum += num;
			} else {
				flag = false;
			}
		}
		
		System.out.println("합계:" + sum);

	}

}
