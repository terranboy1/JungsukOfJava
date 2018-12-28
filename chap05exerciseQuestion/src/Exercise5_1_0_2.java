
public class Exercise5_1_0_2 {
	public static void main(String[] args) {
		//������ ���ĺ��� ���ڸ� �Ʒ��� �־��� ��ȣǥ�� ��ȣȭ�ϴ� ���α׷��̴�.
		//(1)�� �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		//(5-10�� �������� ��ȣǥ ����.)
		
		//���ĺ� ��ȣȭ(a~z)
		char[] abcCode =
			{ '`','~','!','@','#','$','%','^','&','*',
			'(',')','-','_','+','=','|','[',']','{',
			'}',';',':',',','.','/'};
		
		//���� ��ȣȭ(0~9)
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
			
		String src = "abc123";
		String result ="";
			
		//���ڿ� src�� ���ڸ� charAt()���� �ϳ��� �о ��ȯ �� result�� ����
		for(int i=0; i<src.length(); i++) {  //length:6
			char ch = src.charAt(i);
			/*
			 * (1)�˸��� �ڵ� �־� �ϼ��ϱ�
			 */
			if('a'<=ch && ch<='z') {
				result += abcCode[ch-'a'];
			} else {
				result += numCode[ch-'0'];
			}
		}
			
		System.out.println("src:"+src);
		System.out.println("result:"+result);
	}
}
//������
//src:abc123
//result:`~!wer