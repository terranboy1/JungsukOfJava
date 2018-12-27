import java.util.Scanner;

public class Four2_3 {

	public static void main(String[] args) {

		int sum = 0; // รัวี

		for (int i = 1; i <= 20; i++) {

			if (i%2 !=0 && i%3 !=0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
