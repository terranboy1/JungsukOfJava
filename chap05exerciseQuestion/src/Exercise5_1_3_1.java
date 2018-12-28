import java.util.Scanner;

public class Exercise5_1_3_1 {

	public static void main(String[] args) {
		String[] words = {"television", "computer", "mouse", "phone"};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			char[] question = words[i].toCharArray(); //String�� char[]�� ��ȯ
			
			/*
			 * (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
			 *    char�迭 question�� ��� ������ ��ġ�� ���Ƿ� �ٲ۴�.
			 */
			
			System.out.printf("Q%d. %s�� ������ �Է��ϼ���.>", i+1, new String(question));
			
			String answer = scanner.nextLine();
			
			//trim()���� answer�� �¿� ������ ������ ��, equals�� word[i]�� ��
			if(words[i].equals(answer.trim()))
				System.out.printf("�¾ҽ��ϴ�.%n%n");
			else
				System.out.printf("Ʋ�Ƚ��ϴ�.%n%n");
		}
	}
}
//������
//Q. lvtsieeoin�� ������ �Է��ϼ���.>television
//�¾ҽ��ϴ�.
//Q2. otepcumr�� ������ �Է��ϼ���.>computer
//�¾ҽ��ϴ�.
//Q3. sekd�� ������ �Է��ϼ���.>asdf
//Ʋ�Ƚ��ϴ�.
//Q4. ohpne�� ������ �Է��ϼ���.>phone
//�¾ҽ��ϴ�.
