import java.util.Scanner;

public class Four2_2 {

	public static void main(String[] args) {

		int sum = 0; // ����

		for (int i = 1; i <= 20; i++) {

			if (i % 2 != 0) {        //2�� ����� �ƴ϶��(2,4,6,8,10,12,14,16,18,20 �ɷ���)
				if (i % 3 != 0) {    //3�� ����� �ƴ϶��(1,5,7,11,13,17,19 ����)
					sum +=i;
				}		
			}
		}
		System.out.println(sum);
	}

}
