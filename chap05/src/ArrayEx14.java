
public class ArrayEx14 {

	public static void main(String[] args) {
		//char�迭�� StringŬ����
		//���ݱ��� ���� ����, �� ���ڿ��� ������ �� StringŸ���� ������ ����ߴ�.
		//��� ���ڿ��̶�� ���� '���ڸ� ���̾� �þ���� ��'�� �ǹ��ϹǷ� ���ڹ迭�� char�迭�� ���� ���̴�.
		//�ٵ� �ڹٿ��� char�迭�� �ƴ� StringŬ������ �̿��� ���ڿ��� ó���ϴ� ������
		//StringŬ������ char�迭�� '���� ���� ����� �߰��Ͽ� Ȯ���� ���̱� ����'.
		//StringŬ���� = char�迭 + ���(�޼���) �� ����� �� �ְڴ�.
		//C������ ���ڿ��� char�迭�� �ٷ�����, ��ü�������� �ڹٿ����� char�迭�� �׿� ���õ� ��ɵ���
		//�Բ� ��� Ŭ������ �����Ѵ�.
		//��ü���ⰳ���� ������ ������ ������ �����Ϳ� ����� ���� �ٷ������, ��ü��������� �����Ϳ� �׿� ���õ� �����
		//�ϳ��� Ŭ������ ��� �ٷ� �� �ְ� �Ѵ�. ��, ���� ���õ� �͵鳢�� �����Ϳ� ����� �������� �ʰ� �Բ� ���� ��.
        //char�迭�� StringŬ������ �� ���� �߿��� ���̰� �ִµ�, String��ü(���ڿ�)�� ���� ���� ���� �� ���� ������ �Ұ���!
		
		//String str = "Java";
		//str = str + "8";           //"Java8"�̶�� ���ο� ���ڿ��� str�� ����ȴ�.
		//System.out.println(str);   //"Java8"
		//����, ���ڿ� str�� ������ ����Ǵ� �� ������, ���ڿ� ������ �ƴϰ� ���ο� ������ ���ڿ��� �����ȴ�.
		//(���� ������ ���ڿ��� �ٷ���� StringBufferŬ���� ����ؾ� ��)
		
		//StringŬ������ �ֿ� �޼���
		//-------------------------
		//StringŬ������ ����� ���� ���ڿ� ���� �޼������ ���������� ������ ���� �⺻���� �� ������ ���캸��
		//�������� 9�忡�� �ڼ��� �ٷ��. ���ϴ� ����� �������� ��� �ڵ带 �ۼ��ؾ��ϴ����� ��������.
		//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
		//                �޼���                                           ��                            ����
		//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
		// char charAt(int index)               ��   ���ڿ����� �ش� ��ġ(index)�� �ִ� ���� ��ȯ
		// int length()                         ��   ���ڿ��� ���� ��ȯ
		// String substring(int from, int to)   ��   ���ڿ����� �ش� ����(from~to)�� �ִ� ���ڿ� ��ȯ. to�� ������ ���� �ȵ�
		// boolean equals(String str)           ��   ���ڿ��� ������ ������ Ȯ��. ������ true, Ʋ���� false
		// char[] toCharArray()                 ��   ���ڿ��� ���ڹ迭(char[])�� ��ȯ�ؼ� ��ȯ.
		
		
		//charAt
//		String a = "abcdef";
//		char aa = a.charAt(1);
//		System.out.println(aa);  //b ���
//		
//		//substring
//		String b = "abcdef";
//		System.out.println(b.substring(0, 5));  //abcde ���
//		
//		//equals
//		String c = "abc";
//		if(c.equals("abc")) {    // true
//			System.out.println("TRUE");
//		} else {
//			System.out.println("FALSE");
//		}
//		
//		//char�迭�� StringŬ������ ��ȯ
//		
//		char[] d = {'A', 'B', 'C'};
//		String e = new String(d);   //char�迭 --> String
//		char[] f = e.toCharArray(); //String --> char�迭
//		
//		System.out.println(e);  //ABC
//		System.out.println(f);  //ABC
		
		String src = "ABCDE";
		for(int i=0; i<src.length(); i++) {
			char ch = src.charAt(i);
			System.out.println("src.charAt("+i+"):" + ch);
		}
		
		//String�� char[]�� ��ȯ
		char[] chArr = src.toCharArray();
		
		//char�迭(char[])�� ���
		System.out.println(chArr);   //char�迭�� println���� ����ص� �ٷ� �����°� ����~~? �ٸ��� �ּҰ�������.
		
		
		
		
	}

}
