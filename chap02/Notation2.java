package chap02;

public class Notation2 {

	public static void main(String[] args) {
		

		//16������ 2������ ��ȯ�ϴ� ���α׷� �����	(16������ 10������ �ٲٰ�, 10������ 2������ �ٲ۴�.)
//		String input2 = "AAB";
//		int b = Integer.parseInt(input2, 16);
//		System.out.println("16������ 10������ ��ȯ");
//		System.out.println(b);
//		System.out.println("10������ 2������ ��ȯ");
//		String c = Integer.toBinaryString(b);
//		System.out.println(c);
		
		//2������ 16������ ��ȯ�ϱ�
		String a = "1502";
		int b = Integer.parseInt(a);
		String c = Integer.toHexString(b);
		System.out.println(c.toUpperCase());
		
		
	}

}
