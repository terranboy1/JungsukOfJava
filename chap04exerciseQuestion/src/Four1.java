import java.util.Scanner;

public class Four1 {

	public static void main(String[] args) {
		String str = "yes";
		String str1 = new String("yes");
		
		//== ��
		System.out.println(str==str1);
		
		//���ڿ� ��
		if(str.equals(str1)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
	}

}
