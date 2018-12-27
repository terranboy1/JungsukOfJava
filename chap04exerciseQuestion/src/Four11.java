import java.util.Scanner;

public class Four11 {
	public static void main(String[] args) {
		//피보나치 수열
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		
		for(int i=1; i<=10; i++) {
			
			num3 = num1 + num2;
			System.out.println("num3="+num3);
			
			num1 = num2;
			num2 = num3;
		}
	}
}
