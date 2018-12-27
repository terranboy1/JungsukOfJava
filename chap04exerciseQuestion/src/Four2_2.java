import java.util.Scanner;

public class Four2_2 {

	public static void main(String[] args) {

		int sum = 0; // 총합

		for (int i = 1; i <= 20; i++) {

			if (i % 2 != 0) {        //2의 배수가 아니라면(2,4,6,8,10,12,14,16,18,20 걸러짐)
				if (i % 3 != 0) {    //3의 배수도 아니라면(1,5,7,11,13,17,19 남음)
					sum +=i;
				}		
			}
		}
		System.out.println(sum);
	}

}
