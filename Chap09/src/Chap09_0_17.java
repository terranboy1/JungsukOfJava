
import java.util.StringJoiner;

public class Chap09_0_17 {
	public static void main(String[] args) throws Exception {
		String fullName = "Hello.java";
		
		//fullName���� '.'�� ��ġ�� ã�´�.
		int index = fullName.lastIndexOf('.');
		
		//fullName�� ù��° ���ں��� '.'�� �ִ� ������ ���ڿ��� �����Ѵ�.
		String fileName = fullName.substring(0, index);
		
		//'.'�� ���� ���ں��� �����ؼ� ���ڿ� ������ ����
		String ext = fullName.substring(index+1);
		
		System.out.println(fullName+"���� Ȯ���ڸ� ������ �̸��� " + fileName);
		System.out.println(fileName+"�� Ȯ���ڴ� "+ext);
	}
}

//���� ���� ��վ�.
