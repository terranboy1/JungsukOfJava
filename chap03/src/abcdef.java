
public class abcdef {

	public static void main(String[] args) {
		
		// charŸ���� �ƽ�Ű ���� ���� ��� ����ȯ���� ������ �����ڵ�� ��µȴ粲.
		
		//�ƽ�Ű�ڵ� ������ ���ĺ� ���.
		char a = 65;  // 'A' ��� ��� ��.
		for(int i=0; i<26; i++) {
			System.out.print(a++);
		}
		System.out.println("");
		
//		char a = 'A'     �̰� for�� �ٱ��� ���θ� ���� ��� ������ �޾ƹ�����.  �׷��� ���� ��� �ö�.
// 						 ���� ���ϴ� ���� A~Z 3�� �ݺ��̶� ���� ������ for�� �ȿ� ��.

		
		//�����ڵ�� �ְ� �������ѵ� ����� �Ȱ���.
		for (int i = 0; i < 3; i++) {
			char aaa = 'a';
			for (int j = 0; j < 26; j++) {
				System.out.print(aaa++);
			}
			System.out.println();
		}
	}
}
