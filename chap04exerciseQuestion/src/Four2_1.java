import java.util.Scanner;

public class Four2_1 {

	public static void main(String[] args) {
		
		int sum = 0; //총합
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
		System.out.println("1부터 20까지의 합계" + sum);
		System.out.println("2의 배수의 합계" + two);
		System.out.println("3의 배수의 합계" + three);
		System.out.println("6의 배수의 합계" + six);
		System.out.printf("총합[%d] - (2의 배수의 합[%d] + 3의 배수의 합[%d]) + 6의 배수의 합[%d] = ", sum, two, three, six);
		
		sum = sum - two - three + six;
		System.out.printf("%d", sum);
		
		
		
	}

}
