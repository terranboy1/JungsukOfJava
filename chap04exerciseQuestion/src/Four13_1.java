
public class Four13_1 {
	public static void main(String[] args) {
		
		//�ƹ����Գ� ���� ���ڿ��� ������ �������� �ǵ��ϴ� �����ǵ���
		String value = "120oo34";
		char ch = ' ';
		boolean isNumber = true;
		
		//�ݺ����� charAt(int i)�� �̿��� ���ڿ��� ���ڸ�
		//�ϳ��� �о� �˻��Ѵ�.
		for(int i=0; i<value.length(); i++) {
			ch = value.charAt(i);
			
			if(!('0'<=ch && ch<'9')) {   //���ڿ��� ���ڷ� �ɰ� '0'~'9'���̿� ���ϳ� Ȯ��.
				isNumber = false;
//				break;                   //�̰� ���信 ���µ� ���ڰ� �ƴ� ���� 1���� ������ �ű⼭ �ߴ��ؾ� ȿ���� �þ �� ����.
			}
		}
		
		if(isNumber) {
			System.out.println(value+"�� �����Դϴ�.");
		} else {
			System.out.println(value+"�� ���ڰ� �ƴմϴ�.");
		}
	}
}
