import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		//1,1,2,3,5,8,13,21,34,55,89,144,...
		
		System.out.print(num1 +",");
		System.out.print(num2 + ",");
		
		for(int i=0; i<=7; i++) {
			
			num3 = num1 + num2;
			System.out.print(num3+",");
			
			num1 = num2;
			num2 = num3;
			
			
			
		}
		
	}
}
