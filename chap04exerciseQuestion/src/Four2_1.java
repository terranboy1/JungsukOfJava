import java.util.Scanner;

public class Four2_1 {

	public static void main(String[] args) {
		
		int sum = 0; //����
		int two = 0;
		int three = 0;
		int six = 0;
		
		for(int i=1; i<=20; i++) {
			sum +=i;
			
			if(i%2==0) {
				two += i;
			} 
			
			if(i%3==0) {
				three += i;
			} 
			
			if(i%6==0) {
				six +=i;
			}
		}
		System.out.println("1���� 20������ �հ�" + sum);
		System.out.println("2�� ����� �հ�" + two);
		System.out.println("3�� ����� �հ�" + three);
		System.out.println("6�� ����� �հ�" + six);
		System.out.printf("����[%d] - (2�� ����� ��[%d] + 3�� ����� ��[%d]) + 6�� ����� ��[%d] = ", sum, two, three, six);
		
		sum = sum - two - three + six;
		System.out.printf("%d", sum);
		
		
		
	}

}
